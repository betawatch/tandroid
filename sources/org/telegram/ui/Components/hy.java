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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public class hy extends FrameLayout implements org.telegram.ui.ActionBar.a6, te.b, org.telegram.messenger.ls, rh.a {
    public static final /* synthetic */ int U2 = 0;
    public final gv A0;
    public int A1;
    public int A2;
    public final uv B0;
    public final yt B1;
    public ArrayList B2;
    public final vv C0;
    public final int C1;
    public int C2;
    public final ImageView D;
    public final qv D0;
    public final int[] D1;
    public long D2;
    public final ImageView E;
    public final rv E0;
    public int E1;
    public final te.a E2;
    public AnimatorSet F;
    public fy F0;
    public int F1;
    public ArrayList F2;
    public AnimatorSet G;
    public final tv G0;
    public int G1;
    public Drawable G2;
    public float H;
    public final ph.c H0;
    public int H1;
    public int H2;
    public final lw I;
    public boolean I0;
    public int I1;
    public int I2;
    public final gw J;
    public boolean J0;
    public TLRPC.ChatFull J1;
    public int J2;
    public final pg.h K;
    public boolean K0;
    public boolean K1;
    public int K2;
    public final ph.a L;
    public final ax L0;
    public int L1;
    public boolean L2;
    public final pg.h M;
    public AnimatorSet M0;
    public final bg.r0 M1;
    public ab.b0 M2;
    public final ph.a N;
    public final bi.md N0;
    public boolean N1;
    public ab.b0 N2;
    public final View O;
    public nw O0;
    public int O1;
    public boolean O2;
    public final tw P;
    public boolean P0;
    public boolean P1;
    public AnimatorSet P2;
    public final hw Q;
    public final int[] Q0;
    public boolean Q1;
    public h2.n0 Q2;
    public final qw R;
    public final ObjectAnimator[] R0;
    public qx R1;
    public final cv R2;
    public final hx S;
    public boolean S0;
    public float S1;
    public boolean S2;
    public fy T;
    public jg.e1 T0;
    public float T1;
    public boolean T2;
    public final ph.c U;
    public boolean U0;
    public float U1;
    public final iv V;
    public boolean V0;
    public float V1;
    public AnimatorSet W;
    public String[] W0;
    public float W1;
    public final Drawable[] X0;
    public boolean X1;
    public final Drawable[] Y0;
    public final org.telegram.ui.ActionBar.f2 Y1;
    public final Drawable[] Z0;
    public final org.telegram.ui.ActionBar.f6 Z1;
    public final te.a a;
    public final ri0 a0;
    public final String[] a1;
    public final org.telegram.ui.ActionBar.u5 a2;
    public final te.a b;
    public final ri0 b0;
    public final int b1;
    public final org.telegram.ui.ActionBar.u5 b2;
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
    public final et f2;
    public final kv g0;
    public boolean g1;
    public final cw g2;
    public final wv h;
    public final lv h0;
    public TLRPC.TL_messages_stickerSet h1;
    public boolean h2;
    public final nx i0;
    public ArrayList i1;
    public final boolean i2;
    public final mx j0;
    public ArrayList j1;
    public final dh.g j2;
    public final px k0;
    public ArrayList k1;
    public final ug k2;
    public final HashMap l0;
    public ArrayList l1;
    public final ri.c l2;
    public final gv m0;
    public final ArrayList m1;
    public final dh.c m2;
    public final FrameLayout n;
    public final mx n0;
    public final ArrayList n1;
    public final oi.q n2;
    public final nv o0;
    public final ArrayList o1;
    public boolean o2;
    public final ow p0;
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
    public ix t1;
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
    public final qb0 x;
    public final ov x0;
    public final TLRPC.StickerSetCovered[] x1;
    public boolean x2;
    public final xv y;
    public final yx y0;
    public final LongSparseArray y1;
    public final Rect y2;
    public final cy z0;
    public final LongSparseArray z1;
    public final GradientDrawable z2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v21, types: [org.telegram.ui.Components.bj0, org.telegram.ui.Components.gv] */
    /* JADX WARN: Type inference failed for: r4v90, types: [org.telegram.ui.Components.bj0, org.telegram.ui.Components.gv] */
    public hy(org.telegram.ui.ActionBar.f2 f2Var, boolean z9, boolean z10, boolean z11, Context context, boolean z12, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z13, final org.telegram.ui.ActionBar.f6 f6Var, boolean z14, boolean z15) {
        super(context);
        int i7;
        cv cvVar;
        boolean z16;
        gw gwVar;
        boolean z17;
        Context context2;
        final org.telegram.ui.ActionBar.f6 f6Var2;
        oi.q qVar;
        qw qwVar;
        int i10;
        int i11;
        int i12;
        boolean z18;
        Field field;
        boolean z19;
        qw qwVar2;
        boolean z20;
        xq xqVar = xq.h;
        this.a = new te.a(0, this, xqVar, 320L, false);
        this.b = new te.a(1, this, xqVar, 320L, false);
        this.c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = new ArrayList();
        this.c0 = true;
        this.k0 = new px(this);
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
        int i13 = org.telegram.messenger.p10.s0;
        this.c1 = i13;
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
        this.f2 = new et(this, 2);
        this.g2 = new cw(this);
        this.h2 = true;
        oi.q qVar2 = new oi.q();
        this.n2 = qVar2;
        this.r2 = -1.0f;
        this.t2 = -1;
        this.u2 = -1;
        this.v2 = -1L;
        this.w2 = false;
        this.x2 = true;
        this.y2 = new Rect();
        this.z2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.E2 = new te.a(0, new dv(this, 3), xqVar, 380L, true);
        this.R2 = new cv(this, 1);
        this.S2 = false;
        this.u0 = z13;
        this.Y1 = f2Var;
        this.c2 = z9;
        this.Z1 = f6Var;
        this.i2 = z15;
        ri.c cVar = new ri.c();
        this.l2 = cVar;
        cVar.a(z(org.telegram.ui.ActionBar.k6.d6));
        if (z14) {
            u(true);
        }
        i0.a.o(z(org.telegram.ui.ActionBar.k6.Kl), 30);
        int L = org.telegram.messenger.g0.L(50.0f);
        this.b1 = L;
        this.d0 = z12;
        this.X0 = new Drawable[]{org.telegram.ui.ActionBar.k6.W(context, R.drawable.smiles_tab_smiles, z15 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Gf), z15 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df)), org.telegram.ui.ActionBar.k6.W(context, R.drawable.smiles_tab_gif, z15 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Gf), z15 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df)), org.telegram.ui.ActionBar.k6.W(context, R.drawable.smiles_tab_stickers, z15 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Gf), z15 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df))};
        org.telegram.ui.ActionBar.u5 W = org.telegram.ui.ActionBar.k6.W(context, R.drawable.msg_emoji_recent, z15 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Bf), z15 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df));
        org.telegram.ui.ActionBar.u5 W2 = org.telegram.ui.ActionBar.k6.W(context, R.drawable.emoji_tabs_faves, z15 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Bf), z15 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df));
        org.telegram.ui.ActionBar.u5 W3 = org.telegram.ui.ActionBar.k6.W(context, R.drawable.emoji_tabs_new3, z15 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Bf), z15 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df));
        org.telegram.ui.ActionBar.u5 W4 = org.telegram.ui.ActionBar.k6.W(context, R.drawable.emoji_tabs_new1, z15 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Bf), z15 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df));
        this.a2 = W4;
        int i14 = org.telegram.ui.ActionBar.k6.Ff;
        org.telegram.ui.ActionBar.u5 W5 = org.telegram.ui.ActionBar.k6.W(context, R.drawable.emoji_tabs_new2, z(i14), z(i14));
        this.b2 = W5;
        this.Y0 = new Drawable[]{W, W2, W3, new LayerDrawable(new Drawable[]{W4, W5})};
        this.Z0 = new Drawable[]{org.telegram.ui.ActionBar.k6.W(context, R.drawable.msg_emoji_recent, z15 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Bf), z15 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df)), org.telegram.ui.ActionBar.k6.W(context, R.drawable.stickers_gifs_trending, z15 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Bf), z15 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df))};
        this.a1 = new String[]{org.telegram.messenger.id.M0(2131751196, null), org.telegram.messenger.id.M0(2131751195, null), org.telegram.messenger.id.M0(2131751194, null), org.telegram.messenger.id.M0(2131751193, null), org.telegram.messenger.id.M0(2131751192, null), org.telegram.messenger.id.M0(2131751191, null), org.telegram.messenger.id.M0(2131751190, null), org.telegram.messenger.id.M0(2131751189, null)};
        this.J1 = chatFull;
        Paint paint = new Paint(1);
        this.s1 = paint;
        paint.setColor(z(org.telegram.ui.ActionBar.k6.Pf));
        float L2 = org.telegram.messenger.g0.L(6.0f);
        bg.q0 q0Var = bg.u0.a;
        this.M1 = new bg.r0(L2);
        gw gwVar2 = new gw(this, context);
        this.J = gwVar2;
        dy dyVar = new dy();
        dyVar.a = 0;
        dyVar.b = gwVar2;
        arrayList.add(dyVar);
        if (z9) {
            org.telegram.messenger.ui.b0(i13).B(5);
            org.telegram.messenger.ui.b0(i13).w();
            this.e2 = new PorterDuffColorFilter(z(org.telegram.ui.ActionBar.k6.Ci), PorterDuff.Mode.SRC_IN);
        }
        tw twVar = new tw(this, context);
        this.P = twVar;
        qVar2.b(twVar);
        v4.k kVar = new v4.k();
        kVar.c = 220L;
        kVar.e = 220L;
        kVar.f = 160L;
        kVar.g = 160L;
        kVar.i = xq.g;
        twVar.setItemAnimator(kVar);
        final int i15 = 0;
        twVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.ev
            public final /* synthetic */ hy b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (i15) {
                    case 0:
                        org.telegram.ui.ks p10 = org.telegram.ui.ks.p();
                        hy hyVar = this.b;
                        tw twVar2 = hyVar.P;
                        hyVar.getMeasuredHeight();
                        return p10.r(motionEvent, twVar2, null, hyVar.g2, f6Var);
                    case 1:
                        org.telegram.ui.ks p11 = org.telegram.ui.ks.p();
                        hy hyVar2 = this.b;
                        return p11.r(motionEvent, hyVar2.h0, hyVar2.m0, hyVar2.g2, f6Var);
                    default:
                        org.telegram.ui.ks p12 = org.telegram.ui.ks.p();
                        hy hyVar3 = this.b;
                        qv qvVar = hyVar3.D0;
                        hyVar3.getMeasuredHeight();
                        return p12.r(motionEvent, qvVar, hyVar3.A0, hyVar3.g2, f6Var);
                }
            }
        });
        twVar.setOnItemLongClickListener(new dv(this, 1));
        twVar.setInstantClick(true);
        hw hwVar = new hw(this);
        this.Q = hwVar;
        twVar.setLayoutManager(hwVar);
        twVar.setTopGlowOffset(org.telegram.messenger.g0.L(38.0f));
        twVar.setBottomGlowOffset(org.telegram.messenger.g0.L(36.0f));
        twVar.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(44.0f));
        int i16 = org.telegram.ui.ActionBar.k6.wf;
        org.telegram.ui.ActionBar.r6.m(twVar, 21, i16, f6Var);
        twVar.setItemSelectorColorProvider(new k2(18));
        twVar.setClipToPadding(false);
        hwVar.O = new iw(this);
        qw qwVar3 = new qw(this);
        this.R = qwVar3;
        twVar.setAdapter(qwVar3);
        twVar.i(new fi.o1(this, 3));
        this.S = new hx(this, context);
        gwVar2.addView(twVar, c8.ha.c(-1.0f, -1));
        ri0 ri0Var = new ri0(twVar, hwVar);
        this.b0 = ri0Var;
        ri0Var.i = new jw(this);
        twVar.setOnScrollListener(new kw(this));
        if (f2Var != null) {
            i7 = -1;
            cvVar = new cv(this, 2);
            gwVar = gwVar2;
            z17 = z15;
            context2 = context;
            f6Var2 = f6Var;
            qVar = qVar2;
            qwVar = qwVar3;
            i10 = i14;
            i11 = 5;
            z16 = z9;
        } else {
            i7 = -1;
            cvVar = null;
            z16 = z9;
            gwVar = gwVar2;
            z17 = z15;
            context2 = context;
            f6Var2 = f6Var;
            qVar = qVar2;
            qwVar = qwVar3;
            i10 = i14;
            i11 = 5;
        }
        lw lwVar = new lw(this, context2, f6Var2, z16, cvVar, z17);
        this.I = lwVar;
        if (z12) {
            iv ivVar = new iv(this, context2);
            this.V = ivVar;
            gwVar.addView(ivVar, new FrameLayout.LayoutParams(i7, org.telegram.messenger.g0.f1() + L));
            ivVar.d.setOnFocusChangeListener(new jv(this));
            ph.c cVar2 = new ph.c(context2, f6Var2);
            this.U = cVar2;
            cVar2.setVisibility(8);
            final int i17 = 0;
            cVar2.setOnBackClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fv
                public final /* synthetic */ hy b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i17) {
                        case 0:
                            hx hxVar = this.b.S;
                            cx cxVar = hxVar.c;
                            int childCount = cxVar.getChildCount();
                            for (int i18 = 0; i18 < childCount; i18++) {
                                ((ph.b) cxVar.getChildAt(i18)).a(false, true);
                            }
                            hxVar.d = 0L;
                            hxVar.F.b.a(false, true);
                            hxVar.f();
                            break;
                        case 1:
                            cy cyVar = this.b.z0;
                            cx cxVar2 = cyVar.c;
                            int childCount2 = cxVar2.getChildCount();
                            for (int i19 = 0; i19 < childCount2; i19++) {
                                ((ph.b) cxVar2.getChildAt(i19)).a(false, true);
                            }
                            cyVar.d = 0L;
                            cyVar.Q.a.a(false, true);
                            cyVar.f();
                            break;
                        case 2:
                            ix ixVar = this.b.t1;
                            if (ixVar != null) {
                                ixVar.w();
                                break;
                            }
                            break;
                        default:
                            hy hyVar = this.b;
                            int currentItem = hyVar.h.getCurrentItem();
                            ux uxVar = currentItem == 0 ? hyVar.V : currentItem == 1 ? hyVar.o0 : hyVar.G0;
                            if (uxVar != null) {
                                rp rpVar = uxVar.d;
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
            gwVar.addView(cVar2, new FrameLayout.LayoutParams(i7, L));
        }
        if (Color.alpha(z(i16)) >= 255) {
            org.telegram.ui.ActionBar.r6.i(i16, lwVar, f6Var2);
        }
        qwVar.G(true);
        lwVar.p(getEmojipacks());
        gwVar.addView(lwVar, c8.ha.c(36.0f, i7));
        View view = new View(context2);
        this.O = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i18 = org.telegram.ui.ActionBar.k6.zf;
        org.telegram.ui.ActionBar.r6.i(i18, view, f6Var2);
        qw qwVar4 = qwVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i7, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(36.0f);
        gwVar.addView(view, layoutParams);
        ph.a aVar = new ph.a(context2, f6Var2);
        this.L = aVar;
        pg.h hVar = new pg.h(1, context2, f6Var2);
        this.K = hVar;
        hVar.setVisibility(8);
        hVar.addView(aVar, c8.ha.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
        gwVar.addView(hVar, c8.ha.e(i7, -2, 80));
        if (z10) {
            qk0 qk0Var = qk0.b;
            if (z11) {
                kv kvVar = new kv(this, context2);
                this.g0 = kvVar;
                dy dyVar2 = new dy();
                dyVar2.a = 1;
                dyVar2.b = kvVar;
                this.d.add(dyVar2);
                lv lvVar = new lv(this, context2);
                this.h0 = lvVar;
                qVar.b(lvVar);
                lvVar.setClipToPadding(false);
                nx nxVar = new nx(this);
                this.i0 = nxVar;
                lvVar.setLayoutManager(nxVar);
                lvVar.i(new mv(this));
                lvVar.setPadding(0, L, 0, org.telegram.messenger.g0.L(44.0f) + this.q2);
                ((v4.f1) lvVar.getItemAnimator()).m = false;
                final int i19 = 1;
                mx mxVar = new mx(this, context2, true, ConnectionsManager.DEFAULT_DATACENTER_ID);
                this.n0 = mxVar;
                lvVar.setAdapter(mxVar);
                this.j0 = new mx(this, context2, false, 0);
                lvVar.setOnScrollListener(new gy(this, 2));
                lvVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.ev
                    public final /* synthetic */ hy b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (i19) {
                            case 0:
                                org.telegram.ui.ks p10 = org.telegram.ui.ks.p();
                                hy hyVar = this.b;
                                tw twVar2 = hyVar.P;
                                hyVar.getMeasuredHeight();
                                return p10.r(motionEvent, twVar2, null, hyVar.g2, f6Var2);
                            case 1:
                                org.telegram.ui.ks p11 = org.telegram.ui.ks.p();
                                hy hyVar2 = this.b;
                                return p11.r(motionEvent, hyVar2.h0, hyVar2.m0, hyVar2.g2, f6Var2);
                            default:
                                org.telegram.ui.ks p12 = org.telegram.ui.ks.p();
                                hy hyVar3 = this.b;
                                qv qvVar = hyVar3.D0;
                                hyVar3.getMeasuredHeight();
                                return p12.r(motionEvent, qvVar, hyVar3.A0, hyVar3.g2, f6Var2);
                        }
                    }
                });
                final int i20 = 0;
                ?? r10 = new bj0(this) { // from class: org.telegram.ui.Components.gv
                    public final /* synthetic */ hy b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.ui.Components.bj0
                    public final void c(int i21, View view2) {
                        switch (i20) {
                            case 0:
                                hy hyVar = this.b;
                                lv lvVar2 = hyVar.h0;
                                mx mxVar2 = hyVar.j0;
                                mx mxVar3 = hyVar.n0;
                                if (hyVar.t1 != null) {
                                    mxVar3.getClass();
                                    ArrayList arrayList2 = mxVar3.y;
                                    if (lvVar2.getAdapter() != mxVar3) {
                                        if (lvVar2.getAdapter() == mxVar2 && i21 >= 0 && i21 < mxVar2.y.size()) {
                                            hyVar.t1.v(view2, mxVar2.y.get(i21), mxVar2.x, mxVar2.n, true, 0, 0);
                                            hyVar.W();
                                            break;
                                        }
                                    } else if (i21 >= 0) {
                                        int i22 = mxVar3.H;
                                        if (i21 >= i22) {
                                            int i23 = i22 > 0 ? (i21 - i22) - 1 : i21;
                                            if (i23 >= 0 && i23 < arrayList2.size()) {
                                                hyVar.t1.v(view2, arrayList2.get(i23), null, mxVar3.n, true, 0, 0);
                                                break;
                                            }
                                        } else {
                                            hyVar.t1.v(view2, hyVar.i1.get(i21), null, "gif", true, 0, 0);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                hy hyVar2 = this.b;
                                v4.g0 adapter = hyVar2.D0.getAdapter();
                                cy cyVar = hyVar2.z0;
                                String str = adapter == cyVar ? cyVar.N : null;
                                if (view2 instanceof org.telegram.ui.Cells.z7) {
                                    org.telegram.ui.Cells.z7 z7Var = (org.telegram.ui.Cells.z7) view2;
                                    if (z7Var.getSticker() != null && org.telegram.messenger.ij.Y3(z7Var.getSticker()) && !org.telegram.messenger.p10.i(org.telegram.messenger.c.a(hyVar2.c1).a).q()) {
                                        org.telegram.ui.ks.p().x(z7Var);
                                        break;
                                    } else {
                                        org.telegram.ui.ks.p().t();
                                        if (!z7Var.r) {
                                            z7Var.r = true;
                                            z7Var.n = 0.5f;
                                            z7Var.y = 0L;
                                            org.telegram.ui.Cells.y7 y7Var = z7Var.a;
                                            y7Var.setAlpha(0.5f * z7Var.H);
                                            y7Var.invalidate();
                                            z7Var.s = System.currentTimeMillis();
                                            z7Var.invalidate();
                                            hyVar2.t1.m(z7Var, z7Var.getSticker(), str, z7Var.getParentObject(), z7Var.getSendAnimationData(), true, 0);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                };
                this.m0 = r10;
                lvVar.setOnItemClickListener((bj0) r10);
                kvVar.addView(lvVar, c8.ha.c(-1.0f, -1));
                nv nvVar = new nv(this, context2);
                this.o0 = nvVar;
                kvVar.addView(nvVar, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1() + L));
                ow owVar = new ow(this, context2, f6Var2);
                this.p0 = owVar;
                owVar.setType(qk0Var);
                owVar.setUnderlineHeight(org.telegram.messenger.g0.f1());
                owVar.setIndicatorColor(z(i10));
                owVar.setUnderlineColor(z(i18));
                org.telegram.ui.ActionBar.r6.i(i16, owVar, f6Var2);
                V();
                owVar.setDelegate(new dv(this, 2));
                mxVar.F("", "", true, true, true);
            }
            ov ovVar = new ov(this, context2, z13);
            this.x0 = ovVar;
            org.telegram.messenger.ui.b0(this.c1).B(0);
            org.telegram.messenger.ui.b0(this.c1).x();
            qv qvVar = new qv(this, context2);
            this.D0 = qvVar;
            this.n2.b(qvVar);
            rv rvVar = new rv(this);
            this.E0 = rvVar;
            qvVar.setLayoutManager(rvVar);
            rvVar.O = new sv(this);
            qvVar.setPadding(0, org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(44.0f));
            qvVar.setClipToPadding(false);
            dy dyVar3 = new dy();
            dyVar3.a = 2;
            dyVar3.b = ovVar;
            this.d.add(dyVar3);
            this.z0 = new cy(this, context2);
            yx yxVar = new yx(this, context2);
            this.y0 = yxVar;
            qvVar.setAdapter(yxVar);
            final int i21 = 2;
            qvVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.ev
                public final /* synthetic */ hy b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (i21) {
                        case 0:
                            org.telegram.ui.ks p10 = org.telegram.ui.ks.p();
                            hy hyVar = this.b;
                            tw twVar2 = hyVar.P;
                            hyVar.getMeasuredHeight();
                            return p10.r(motionEvent, twVar2, null, hyVar.g2, f6Var2);
                        case 1:
                            org.telegram.ui.ks p11 = org.telegram.ui.ks.p();
                            hy hyVar2 = this.b;
                            return p11.r(motionEvent, hyVar2.h0, hyVar2.m0, hyVar2.g2, f6Var2);
                        default:
                            org.telegram.ui.ks p12 = org.telegram.ui.ks.p();
                            hy hyVar3 = this.b;
                            qv qvVar2 = hyVar3.D0;
                            hyVar3.getMeasuredHeight();
                            return p12.r(motionEvent, qvVar2, hyVar3.A0, hyVar3.g2, f6Var2);
                    }
                }
            });
            final int i22 = 1;
            ?? r42 = new bj0(this) { // from class: org.telegram.ui.Components.gv
                public final /* synthetic */ hy b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.Components.bj0
                public final void c(int i212, View view2) {
                    switch (i22) {
                        case 0:
                            hy hyVar = this.b;
                            lv lvVar2 = hyVar.h0;
                            mx mxVar2 = hyVar.j0;
                            mx mxVar3 = hyVar.n0;
                            if (hyVar.t1 != null) {
                                mxVar3.getClass();
                                ArrayList arrayList2 = mxVar3.y;
                                if (lvVar2.getAdapter() != mxVar3) {
                                    if (lvVar2.getAdapter() == mxVar2 && i212 >= 0 && i212 < mxVar2.y.size()) {
                                        hyVar.t1.v(view2, mxVar2.y.get(i212), mxVar2.x, mxVar2.n, true, 0, 0);
                                        hyVar.W();
                                        break;
                                    }
                                } else if (i212 >= 0) {
                                    int i222 = mxVar3.H;
                                    if (i212 >= i222) {
                                        int i23 = i222 > 0 ? (i212 - i222) - 1 : i212;
                                        if (i23 >= 0 && i23 < arrayList2.size()) {
                                            hyVar.t1.v(view2, arrayList2.get(i23), null, mxVar3.n, true, 0, 0);
                                            break;
                                        }
                                    } else {
                                        hyVar.t1.v(view2, hyVar.i1.get(i212), null, "gif", true, 0, 0);
                                        break;
                                    }
                                }
                            }
                            break;
                        default:
                            hy hyVar2 = this.b;
                            v4.g0 adapter = hyVar2.D0.getAdapter();
                            cy cyVar = hyVar2.z0;
                            String str = adapter == cyVar ? cyVar.N : null;
                            if (view2 instanceof org.telegram.ui.Cells.z7) {
                                org.telegram.ui.Cells.z7 z7Var = (org.telegram.ui.Cells.z7) view2;
                                if (z7Var.getSticker() != null && org.telegram.messenger.ij.Y3(z7Var.getSticker()) && !org.telegram.messenger.p10.i(org.telegram.messenger.c.a(hyVar2.c1).a).q()) {
                                    org.telegram.ui.ks.p().x(z7Var);
                                    break;
                                } else {
                                    org.telegram.ui.ks.p().t();
                                    if (!z7Var.r) {
                                        z7Var.r = true;
                                        z7Var.n = 0.5f;
                                        z7Var.y = 0L;
                                        org.telegram.ui.Cells.y7 y7Var = z7Var.a;
                                        y7Var.setAlpha(0.5f * z7Var.H);
                                        y7Var.invalidate();
                                        z7Var.s = System.currentTimeMillis();
                                        z7Var.invalidate();
                                        hyVar2.t1.m(z7Var, z7Var.getSticker(), str, z7Var.getParentObject(), z7Var.getSendAnimationData(), true, 0);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            };
            this.A0 = r42;
            qvVar.setOnItemClickListener((bj0) r42);
            org.telegram.ui.ActionBar.r6.m(qvVar, 21, i16, f6Var2);
            ovVar.addView(qvVar);
            this.a0 = new ri0(qvVar, rvVar);
            tv tvVar = new tv(this, context2);
            this.G0 = tvVar;
            ovVar.addView(tvVar, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1() + L));
            ph.c cVar3 = new ph.c(context2, f6Var2);
            this.H0 = cVar3;
            cVar3.setVisibility(8);
            final int i23 = 1;
            cVar3.setOnBackClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fv
                public final /* synthetic */ hy b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i23) {
                        case 0:
                            hx hxVar = this.b.S;
                            cx cxVar = hxVar.c;
                            int childCount = cxVar.getChildCount();
                            for (int i182 = 0; i182 < childCount; i182++) {
                                ((ph.b) cxVar.getChildAt(i182)).a(false, true);
                            }
                            hxVar.d = 0L;
                            hxVar.F.b.a(false, true);
                            hxVar.f();
                            break;
                        case 1:
                            cy cyVar = this.b.z0;
                            cx cxVar2 = cyVar.c;
                            int childCount2 = cxVar2.getChildCount();
                            for (int i192 = 0; i192 < childCount2; i192++) {
                                ((ph.b) cxVar2.getChildAt(i192)).a(false, true);
                            }
                            cyVar.d = 0L;
                            cyVar.Q.a.a(false, true);
                            cyVar.f();
                            break;
                        case 2:
                            ix ixVar = this.b.t1;
                            if (ixVar != null) {
                                ixVar.w();
                                break;
                            }
                            break;
                        default:
                            hy hyVar = this.b;
                            int currentItem = hyVar.h.getCurrentItem();
                            ux uxVar = currentItem == 0 ? hyVar.V : currentItem == 1 ? hyVar.o0 : hyVar.G0;
                            if (uxVar != null) {
                                rp rpVar = uxVar.d;
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
            ovVar.addView(cVar3, new FrameLayout.LayoutParams(-1, L));
            z18 = z13;
            i12 = 80;
            uv uvVar = new uv(this, context2, f6Var2, f2Var, z18);
            this.B0 = uvVar;
            uvVar.setDragEnabled(true);
            uvVar.setWillNotDraw(false);
            uvVar.setType(qk0Var);
            uvVar.setUnderlineHeight(qvVar.canScrollVertically(-1) ? org.telegram.messenger.g0.f1() : 0);
            uvVar.setIndicatorColor(z(i10));
            uvVar.setUnderlineColor(z(i18));
            if (viewGroup == null || !z18) {
                ovVar.addView(uvVar, c8.ha.e(-1, 36, 51));
            } else {
                vv vvVar = new vv(this, context2);
                this.C0 = vvVar;
                vvVar.addView(uvVar, c8.ha.e(-1, 36, 51));
                viewGroup.addView(vvVar, c8.ha.c(-2.0f, -1));
            }
            X(true);
            uvVar.setDelegate(new dv(this, 4));
            qvVar.setOnScrollListener(new gy(this, 0));
            ph.a aVar2 = new ph.a(context2, f6Var2);
            this.N = aVar2;
            pg.h hVar2 = new pg.h(1, context2, f6Var2);
            this.M = hVar2;
            hVar2.setVisibility(8);
            hVar2.addView(aVar2, c8.ha.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
            ovVar.addView(hVar2, c8.ha.e(-1, -2, 80));
        } else {
            i12 = 80;
            z18 = z13;
        }
        this.e.clear();
        this.e.addAll(this.d);
        wv wvVar = new wv(this, context2);
        this.h = wvVar;
        oi.q qVar3 = this.n2;
        qVar3.getClass();
        wvVar.b(new oi.i(qVar3, wvVar));
        wvVar.setOverScrollMode(2);
        ax axVar = new ax(this);
        this.L0 = axVar;
        wvVar.setAdapter(axVar);
        xv xvVar = new xv(this, context2);
        this.y = xvVar;
        xvVar.setHapticFeedbackEnabled(true);
        xvVar.setImageResource(R.drawable.smiles_tab_clear);
        int v = z15 ? v(0.6f) : z(org.telegram.ui.ActionBar.k6.Gf);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        xvVar.setColorFilter(new PorterDuffColorFilter(v, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        xvVar.setScaleType(scaleType);
        xvVar.setContentDescription(org.telegram.messenger.id.M0(2131754920, null));
        xvVar.setFocusable(true);
        xvVar.setOnClickListener(new yv());
        c8.ka.a(xvVar);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.r = frameLayout;
        if (z12) {
            addView(frameLayout, c8.ha.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, (org.telegram.messenger.g0.f1() / org.telegram.messenger.g0.p) + 40.0f));
        } else {
            addView(frameLayout, c8.ha.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.s = frameLayout2;
        addView(frameLayout2, c8.ha.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.n = frameLayout3;
        View view2 = new View(context2);
        this.w = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.L(40.0f), 83));
        if (z12) {
            addView(frameLayout3, c8.ha.e(-1, 48, i12));
            frameLayout3.addView(xvVar, c8.ha.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
            if (z10) {
                ImageView imageView = new ImageView(context2);
                this.D = imageView;
                imageView.setImageResource(R.drawable.smiles_tab_settings);
                imageView.setColorFilter(new PorterDuffColorFilter(z15 ? v(0.6f) : z(org.telegram.ui.ActionBar.k6.Gf), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(org.telegram.messenger.id.M0(2131745498, null));
                c8.ka.a(imageView);
                frameLayout3.addView(imageView, c8.ha.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
                final int i24 = 2;
                imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fv
                    public final /* synthetic */ hy b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i24) {
                            case 0:
                                hx hxVar = this.b.S;
                                cx cxVar = hxVar.c;
                                int childCount = cxVar.getChildCount();
                                for (int i182 = 0; i182 < childCount; i182++) {
                                    ((ph.b) cxVar.getChildAt(i182)).a(false, true);
                                }
                                hxVar.d = 0L;
                                hxVar.F.b.a(false, true);
                                hxVar.f();
                                break;
                            case 1:
                                cy cyVar = this.b.z0;
                                cx cxVar2 = cyVar.c;
                                int childCount2 = cxVar2.getChildCount();
                                for (int i192 = 0; i192 < childCount2; i192++) {
                                    ((ph.b) cxVar2.getChildAt(i192)).a(false, true);
                                }
                                cyVar.d = 0L;
                                cyVar.Q.a.a(false, true);
                                cyVar.f();
                                break;
                            case 2:
                                ix ixVar = this.b.t1;
                                if (ixVar != null) {
                                    ixVar.w();
                                    break;
                                }
                                break;
                            default:
                                hy hyVar = this.b;
                                int currentItem = hyVar.h.getCurrentItem();
                                ux uxVar = currentItem == 0 ? hyVar.V : currentItem == 1 ? hyVar.o0 : hyVar.G0;
                                if (uxVar != null) {
                                    rp rpVar = uxVar.d;
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
            qb0 qb0Var = new qb0(context2, f6Var2);
            this.x = qb0Var;
            qb0Var.setViewPager(wvVar);
            qb0Var.setShouldExpand(false);
            qb0Var.setIndicatorHeight(org.telegram.messenger.g0.L(3.0f));
            qb0Var.setIndicatorColor(i0.a.o(z(org.telegram.ui.ActionBar.k6.Df), 20));
            qb0Var.setUnderlineHeight(0);
            qb0Var.setTabPaddingLeftRight(org.telegram.messenger.g0.L(11.0f));
            qb0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(11.0f));
            frameLayout3.addView(qb0Var, c8.ha.e(-2, 48, 81));
            qb0Var.setOnPageChangeListener(new zv(this, z18));
            ImageView imageView2 = new ImageView(context2);
            this.E = imageView2;
            imageView2.setImageResource(R.drawable.smiles_tab_search);
            imageView2.setColorFilter(new PorterDuffColorFilter(z15 ? v(0.6f) : z(org.telegram.ui.ActionBar.k6.Gf), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(org.telegram.messenger.id.M0(2131745839, null));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, c8.ha.d(48, 48.0f, 83, 2.0f, 0.0f, 2.0f, 0.0f));
            final int i25 = 3;
            imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fv
                public final /* synthetic */ hy b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view22) {
                    switch (i25) {
                        case 0:
                            hx hxVar = this.b.S;
                            cx cxVar = hxVar.c;
                            int childCount = cxVar.getChildCount();
                            for (int i182 = 0; i182 < childCount; i182++) {
                                ((ph.b) cxVar.getChildAt(i182)).a(false, true);
                            }
                            hxVar.d = 0L;
                            hxVar.F.b.a(false, true);
                            hxVar.f();
                            break;
                        case 1:
                            cy cyVar = this.b.z0;
                            cx cxVar2 = cyVar.c;
                            int childCount2 = cxVar2.getChildCount();
                            for (int i192 = 0; i192 < childCount2; i192++) {
                                ((ph.b) cxVar2.getChildAt(i192)).a(false, true);
                            }
                            cyVar.d = 0L;
                            cyVar.Q.a.a(false, true);
                            cyVar.f();
                            break;
                        case 2:
                            ix ixVar = this.b.t1;
                            if (ixVar != null) {
                                ixVar.w();
                                break;
                            }
                            break;
                        default:
                            hy hyVar = this.b;
                            int currentItem = hyVar.h.getCurrentItem();
                            ux uxVar = currentItem == 0 ? hyVar.V : currentItem == 1 ? hyVar.o0 : hyVar.G0;
                            if (uxVar != null) {
                                rp rpVar = uxVar.d;
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
            addView(frameLayout3, c8.ha.d(56, 48.0f, (org.telegram.messenger.id.a0 ? 3 : i11) | 80, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(org.telegram.messenger.g0.L(56.0f), z(i16), z(i16));
            c8.ka.a(xvVar);
            xvVar.setPadding(0, 0, org.telegram.messenger.g0.L(2.0f), 0);
            xvVar.setBackground(j02);
            xvVar.setContentDescription(org.telegram.messenger.id.M0(2131754920, null));
            xvVar.setFocusable(true);
            frameLayout3.addView(xvVar, c8.ha.d(48, 48.0f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
            view2.setVisibility(8);
        }
        addView(wvVar, 0, c8.ha.e(-1, -1, 51));
        bi.md mdVar = new bi.md(context2, 24);
        this.N0 = mdVar;
        int L3 = org.telegram.messenger.g0.L(6.0f);
        int i26 = org.telegram.ui.ActionBar.k6.eg;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L3, z(i26));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i26);
        mdVar.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(mdVar, d02, N, null, f6Var2);
        org.telegram.ui.ActionBar.r6.V(mdVar, org.telegram.ui.ActionBar.k6.dg, f6Var2);
        mdVar.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(7.0f));
        char c10 = 16;
        mdVar.setGravity(16);
        mdVar.setTextSize(1, 14.0f);
        mdVar.setVisibility(4);
        addView(mdVar, c8.ha.d(-2, -2.0f, 81, 5.0f, 0.0f, 5.0f, 53.0f));
        this.C1 = org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 40.0f : 32.0f);
        Field field2 = yt.f;
        yt ytVar = new yt(new xt(context2, f6Var2));
        if (yt.f == null) {
            try {
                field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    field.setAccessible(true);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                field = null;
            }
            yt.f = field;
        }
        Field field3 = yt.f;
        if (field3 != null) {
            try {
                ytVar.a = (ViewTreeObserver.OnScrollChangedListener) field3.get(ytVar);
                yt.f.set(ytVar, yt.g);
            } catch (Exception unused3) {
                ytVar.a = null;
            }
        }
        this.B1 = ytVar;
        ytVar.c.setOnSelectionUpdateListener(new d(this, 10));
        this.A1 = org.telegram.messenger.qp.d1().getInt("selected_page", 0);
        HashMap hashMap = org.telegram.messenger.i6.h;
        if (!org.telegram.messenger.i6.k) {
            org.telegram.messenger.i6.k = true;
            SharedPreferences d12 = org.telegram.messenger.qp.d1();
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
                z19 = true;
                org.telegram.messenger.a8.g(e11, true);
                qwVar2 = qwVar4;
                z20 = false;
            }
        }
        qwVar2 = qwVar4;
        z20 = false;
        z19 = true;
        qwVar2.F(z20);
        I(z19, z10, z11, z20);
        if (Build.VERSION.SDK_INT >= 31) {
            dh.g gVar = new dh.g(z20);
            this.j2 = gVar;
            this.n2.a(gVar);
            ri.f fVar = new ri.f(null);
            fVar.f = cVar;
            fVar.d = gVar;
            fVar.e = -2;
            dh.c cVar4 = new dh.c(fVar, fVar, fVar);
            this.m2 = cVar4;
            cVar4.k = true;
            int L4 = org.telegram.messenger.g0.L(org.telegram.messenger.sc.e(262144) ? 8.0f : 48.0f);
            cVar4.d = L4;
            cVar4.e = L4;
            cVar4.j = this.n2;
        } else {
            dh.c cVar5 = new dh.c(cVar, cVar, cVar);
            this.m2 = cVar5;
            cVar5.j = this.n2;
            this.j2 = null;
        }
        this.k2 = new ug(this, 1);
        setBlurredBackgroundDrawableFactory(this.m2);
        this.n2.i(this);
        this.n2.a = new dv(this, 0);
    }

    public static void a(hy hyVar, boolean z9) {
        lv lvVar = hyVar.h0;
        if (lvVar == null) {
            return;
        }
        int childCount = lvVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = lvVar.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.h2) {
                ImageReceiver photoImage = ((org.telegram.ui.Cells.h2) childAt).getPhotoImage();
                if (z9) {
                    photoImage.t0 = true;
                    photoImage.P0(false);
                } else {
                    photoImage.t0 = false;
                    photoImage.Q0();
                }
            }
        }
    }

    public static void d(hy hyVar, qx qxVar, String str) {
        String str2;
        ix ixVar;
        org.telegram.ui.ActionBar.f2 f2Var = hyVar.Y1;
        int i7 = hyVar.c1;
        ArrayList arrayList = hyVar.q1;
        if (qxVar == null) {
            return;
        }
        if (qxVar.getSpan() == null) {
            hyVar.D2 = SystemClock.elapsedRealtime();
            hyVar.M(true);
            String str3 = str != null ? str : (String) qxVar.getTag();
            new SpannableStringBuilder().append((CharSequence) str3);
            if (str != null) {
                ix ixVar2 = hyVar.t1;
                if (ixVar2 != null) {
                    ixVar2.l(org.telegram.messenger.i6.c(str));
                    return;
                }
                return;
            }
            if (!qxVar.c && (str2 = (String) org.telegram.messenger.i6.j.get(str3)) != null) {
                str3 = g(str3, str2);
            }
            hyVar.h(str3);
            ix ixVar3 = hyVar.t1;
            if (ixVar3 != null) {
                ixVar3.l(org.telegram.messenger.i6.c(str3));
                return;
            }
            return;
        }
        if (hyVar.t1 != null) {
            long j3 = qxVar.getSpan().documentId;
            TLRPC.Document document = qxVar.getSpan().document;
            uw uwVar = qxVar.e;
            boolean z9 = uwVar != null && uwVar.i;
            if (document == null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    uw uwVar2 = (uw) arrayList.get(i10);
                    int i11 = 0;
                    while (true) {
                        ArrayList arrayList2 = uwVar2.c;
                        if (arrayList2 != null && i11 < arrayList2.size()) {
                            if (((TLRPC.Document) uwVar2.c.get(i11)).id == j3) {
                                document = (TLRPC.Document) uwVar2.c.get(i11);
                                break;
                            }
                            i11++;
                        }
                    }
                }
            }
            if (document == null) {
                document = i5.e(i7, j3);
            }
            TLRPC.Document document2 = document;
            String U = document2 != null ? org.telegram.messenger.ij.U(document2) : null;
            if (org.telegram.messenger.ij.n3(document2) || org.telegram.messenger.p10.i(i7).q() || (((ixVar = hyVar.t1) != null && ixVar.g()) || hyVar.U0 || z9)) {
                hyVar.D2 = SystemClock.elapsedRealtime();
                hyVar.M(true);
                hyVar.h("animated_" + j3);
                hyVar.t1.x(j3, document2, U, qxVar.c);
                return;
            }
            hyVar.M(false);
            hc a02 = f2Var != null ? hc.a0(f2Var) : new hc(hyVar.r, hyVar.Z1);
            if (hyVar.h2 || f2Var == null) {
                a02.r(document2, org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131743867, null)), org.telegram.messenger.id.M0(2131747034, null), new cv(hyVar, 3)).j();
            } else {
                a02.K(R.raw.saved_messages, org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131743866, null)), org.telegram.messenger.id.M0(2131747818, null), new cv(hyVar, 4)).j();
            }
            hyVar.h2 = !hyVar.h2;
        }
    }

    public static void e(hy hyVar, int i7, int i10) {
        v4.d1 K;
        int[] iArr = hyVar.Q0;
        if (i7 == 1) {
            hyVar.n(i10, hyVar.P);
            return;
        }
        ix ixVar = hyVar.t1;
        if ((ixVar == null || !ixVar.z()) && !hyVar.J0) {
            pj0 x10 = hyVar.x(i7);
            if (i10 <= 0 || x10 == null || x10.getVisibility() != 0 || (K = x10.K(0)) == null || K.a.getTop() + hyVar.b1 < x10.getPaddingTop()) {
                int i11 = iArr[i7] - i10;
                iArr[i7] = i11;
                if (i11 > 0) {
                    iArr[i7] = 0;
                } else if (i11 < (-org.telegram.messenger.g0.L(288.0f))) {
                    iArr[i7] = -org.telegram.messenger.g0.L(288.0f);
                }
                if (i7 == 0) {
                    hyVar.Z();
                } else {
                    hyVar.y(i7).setTranslationY(Math.max(-org.telegram.messenger.g0.L(48.0f), iArr[i7]));
                }
            }
        }
    }

    public static void f(hy hyVar, boolean z9) {
        int N0;
        nx nxVar = hyVar.i0;
        nv nvVar = hyVar.o0;
        lv lvVar = hyVar.h0;
        if (lvVar != null && (lvVar.getAdapter() instanceof mx)) {
            mx mxVar = (mx) lvVar.getAdapter();
            if (!mxVar.s && mxVar.h == 0 && !mxVar.y.isEmpty() && (N0 = nxVar.N0()) != -1 && N0 > nxVar.B() - 5) {
                String str = mxVar.x;
                String str2 = mxVar.r;
                boolean z10 = mxVar.w;
                mxVar.F(str, str2, true, z10, z10);
            }
        }
        ix ixVar = hyVar.t1;
        if (ixVar == null || !ixVar.z()) {
            if (nvVar == null || lvVar == null) {
                return;
            }
            nvVar.a.a(true, !z9);
            return;
        }
        v4.d1 K = lvVar.K(0);
        if (K == null) {
            ux.a(nvVar, true, !z9);
        } else {
            ux.a(nvVar, K.a.getTop() < lvVar.getPaddingTop(), !z9);
        }
    }

    public static String g(String str, String str2) {
        String str3;
        boolean z9 = true;
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
            str = com.google.android.recaptcha.internal.a.k(str, 2, 0);
        } else {
            z9 = false;
        }
        int length = str.length();
        if (length > 2 && str.charAt(str.length() - 2) == 8205) {
            str3 = str.substring(str.length() - 2);
            str = com.google.android.recaptcha.internal.a.k(str, 2, 0);
        } else if (length <= 3 || str.charAt(str.length() - 3) != 8205) {
            str3 = null;
        } else {
            str3 = str.substring(str.length() - 3);
            str = com.google.android.recaptcha.internal.a.k(str, 3, 0);
        }
        String r10 = rf.b.r(str, str2);
        if (str3 != null) {
            r10 = rf.b.r(r10, str3);
        }
        return z9 ? rf.b.r(r10, "\u200d➡") : r10;
    }

    public static void j(int i7, View view) {
        if (view == null) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i7);
    }

    public final void A() {
        tv tvVar = this.G0;
        if (tvVar != null) {
            tvVar.b();
        }
        nv nvVar = this.o0;
        if (nvVar != null) {
            nvVar.b();
        }
        iv ivVar = this.V;
        if (ivVar != null) {
            ivVar.b();
        }
    }

    public final void B() {
        ab.b0 b0Var = this.M2;
        if (b0Var != null) {
            b0Var.b();
            this.M2 = null;
        }
        ab.b0 b0Var2 = this.N2;
        if (b0Var2 != null) {
            b0Var2.b();
            this.N2 = null;
            this.O2 = false;
        }
    }

    public final void C(boolean z9, boolean z10) {
        tx txVar;
        if (this.A1 != 0 && this.w1) {
            this.A1 = 0;
        }
        if (this.A1 == 0 && this.v1) {
            this.A1 = 1;
        }
        int i7 = this.A1;
        wv wvVar = this.h;
        if (i7 == 0 || z9 || this.e.size() == 1) {
            L(true, false);
            Q(false, false);
            if (wvVar.getCurrentItem() != 0) {
                wvVar.x(0, !z9);
            }
            if (z10) {
                org.telegram.messenger.g0.i3(new cv(this, 5), 350L);
            }
        } else {
            int i10 = this.A1;
            if (i10 == 1) {
                L(false, false);
                Q(this.u0 || this.v0, false);
                if (wvVar.getCurrentItem() != 2) {
                    wvVar.x(2, false);
                }
                uv uvVar = this.B0;
                if (uvVar != null) {
                    this.S0 = true;
                    int i11 = this.G1;
                    if (i11 >= 0) {
                        uvVar.m(i11);
                    } else {
                        int i12 = this.F1;
                        if (i12 >= 0) {
                            uvVar.m(i12);
                        } else {
                            uvVar.m(this.E1);
                        }
                    }
                    this.S0 = false;
                    this.E0.h1(0, 0);
                }
            } else if (i10 == 2) {
                L(false, false);
                Q(false, false);
                if (wvVar.getCurrentItem() != 1) {
                    wvVar.x(1, false);
                }
                ow owVar = this.p0;
                if (owVar != null) {
                    owVar.m(0);
                }
                nv nvVar = this.o0;
                if (nvVar != null && (txVar = nvVar.r) != null) {
                    txVar.I1(null);
                }
            }
        }
        M(true);
    }

    public final void D() {
        yx yxVar = this.y0;
        if (yxVar != null) {
            yxVar.f();
        }
        cy cyVar = this.z0;
        if (cyVar != null) {
            cyVar.f();
        }
        if (org.telegram.ui.ks.p().E) {
            org.telegram.ui.ks.p().m();
        }
        org.telegram.ui.ks.p().t();
    }

    public final void E(int i7) {
        ix ixVar = this.t1;
        if ((ixVar == null || !ixVar.z()) && i7 != 0) {
            HorizontalScrollView y10 = y(i7);
            this.Q0[i7] = 0;
            y10.setTranslationY(0);
        }
    }

    public final void G(int i7, int i10) {
        hw hwVar = this.Q;
        View m10 = hwVar.m(i7);
        int L0 = hwVar.L0();
        if ((m10 == null && Math.abs(i7 - L0) > hwVar.J * 9.0f) || !org.telegram.messenger.iz.c()) {
            int i11 = hwVar.L0() < i7 ? 0 : 1;
            ri0 ri0Var = this.b0;
            ri0Var.b = i11;
            ri0Var.d(i7, i10, false, false);
            return;
        }
        this.J0 = true;
        fi.j1 j1Var = new fi.j1(1, this.P.getContext(), this);
        j1Var.a = i7;
        j1Var.p = i10;
        hwVar.w0(j1Var);
    }

    public final void H(int i7, int i10) {
        rv rvVar = this.E0;
        View m10 = rvVar.m(i7);
        int L0 = rvVar.L0();
        if (m10 != null || Math.abs(i7 - L0) <= 40) {
            this.J0 = true;
            this.D0.y0(i7);
        } else {
            int i11 = rvVar.L0() < i7 ? 0 : 1;
            ri0 ri0Var = this.a0;
            ri0Var.b = i11;
            ri0Var.d(i7, i10, false, false);
        }
    }

    public final void I(boolean z9, boolean z10, boolean z11, boolean z12) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i7 >= arrayList2.size()) {
                break;
            }
            if (((dy) arrayList2.get(i7)).a == 0 && z9) {
                arrayList.add((dy) arrayList2.get(i7));
            }
            if (((dy) arrayList2.get(i7)).a == 1 && z11) {
                arrayList.add((dy) arrayList2.get(i7));
            }
            if (((dy) arrayList2.get(i7)).a == 2 && z10) {
                arrayList.add((dy) arrayList2.get(i7));
            }
            i7++;
        }
        qb0 qb0Var = this.x;
        if (qb0Var != null) {
            org.telegram.messenger.g0.Z3(qb0Var, arrayList.size() > 1, 1.0f, true, z12);
        }
        wv wvVar = this.h;
        if (wvVar != null) {
            wvVar.setAdapter(null);
            wvVar.setAdapter(this.L0);
            if (qb0Var != null) {
                qb0Var.setViewPager(wvVar);
            }
        }
    }

    public final void J(final ph.a aVar, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z9, boolean z10) {
        cy cyVar;
        hx hxVar;
        if (stickerSet == null) {
            return;
        }
        if (!z9 || (hxVar = this.S) == null || hxVar.d == stickerSet.id) {
            if (z9 || (cyVar = this.z0) == null || cyVar.d == stickerSet.id) {
                final boolean B0 = org.telegram.messenger.ui.b0(this.c1).B0(stickerSet.id, true);
                aVar.i(B0 ? stickerSet.masks ? org.telegram.messenger.id.G(stickerSet.count, "RemoveManyMasksCount", new Object[0]) : stickerSet.emojis ? org.telegram.messenger.id.G(stickerSet.count, "RemoveManyEmojiCount", new Object[0]) : org.telegram.messenger.id.G(stickerSet.count, "RemoveManyStickersCount", new Object[0]) : stickerSet.masks ? org.telegram.messenger.id.G(stickerSet.count, "AddManyMasksCount", new Object[0]) : stickerSet.emojis ? org.telegram.messenger.id.G(stickerSet.count, "AddManyEmojiCount", new Object[0]) : org.telegram.messenger.id.G(stickerSet.count, "AddManyStickersCount", new Object[0]), z10, true);
                aVar.k0.a(!B0, z10);
                aVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.hv
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        hy hyVar = hy.this;
                        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(hyVar.c1);
                        Context context = hyVar.getContext();
                        int i7 = B0 ? 0 : 2;
                        org.telegram.ui.ActionBar.f2 f2Var = hyVar.Y1;
                        FrameLayout frameLayout = hyVar.s;
                        ph.a aVar2 = aVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z11 = z9;
                        b02.g2(context, tLObject2, document2, i7, f2Var, frameLayout, false, true, new bi.l4(hyVar, aVar2, tLObject2, stickerSet2, document2, z11), false);
                        hyVar.J(aVar2, tLObject2, stickerSet2, document2, z11, true);
                    }
                });
            }
        }
    }

    public final void K(long j3, boolean z9, boolean z10) {
        qb0 qb0Var = this.x;
        if (qb0Var == null) {
            return;
        }
        this.v1 = z9;
        this.w1 = z10;
        if (z10 || z9) {
            this.u1 = j3;
        } else {
            this.u1 = 0L;
        }
        int i7 = z10 ? 2 : 0;
        LinearLayout linearLayout = qb0Var.d;
        View childAt = i7 >= linearLayout.getChildCount() ? null : linearLayout.getChildAt(i7);
        if (childAt != null) {
            childAt.setAlpha(this.u1 != 0 ? 0.15f : 1.0f);
            wv wvVar = this.h;
            if (z10) {
                if (this.u1 == 0 || wvVar.getCurrentItem() == 0) {
                    return;
                }
                L(true, true);
                Q(false, true);
                wvVar.x(0, false);
                return;
            }
            if (this.u1 == 0 || wvVar.getCurrentItem() == 1) {
                return;
            }
            L(false, true);
            Q(false, true);
            wvVar.x(1, false);
        }
    }

    public final void L(boolean z9, boolean z10) {
        xv xvVar = this.y;
        if (z9 && xvVar.getTag() == null) {
            return;
        }
        if ((z9 || xvVar.getTag() == null) && !this.o2) {
            AnimatorSet animatorSet = this.F;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.F = null;
            }
            xvVar.setTag(z9 ? null : 1);
            if (!z10) {
                xvVar.setAlpha(z9 ? 1.0f : 0.0f);
                xvVar.setScaleX(z9 ? 1.0f : 0.0f);
                xvVar.setScaleY(z9 ? 1.0f : 0.0f);
                xvVar.setVisibility(z9 ? 0 : 4);
                return;
            }
            if (z9) {
                xvVar.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.F = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(xvVar, (Property<xv, Float>) View.ALPHA, z9 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(xvVar, (Property<xv, Float>) View.SCALE_X, z9 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(xvVar, (Property<xv, Float>) View.SCALE_Y, z9 ? 1.0f : 0.0f));
            this.F.setDuration(200L);
            this.F.setInterpolator(xq.g);
            this.F.addListener(new dw(this, z9, r2));
            this.F.start();
        }
    }

    public final void M(boolean z9) {
        this.H = 0.0f;
        ix ixVar = this.t1;
        if (ixVar != null && ixVar.z()) {
            z9 = false;
        }
        FrameLayout frameLayout = this.n;
        if (z9 && frameLayout.getTag() == null) {
            return;
        }
        if (z9 || frameLayout.getTag() == null) {
            frameLayout.setTag(z9 ? null : 1);
            this.E2.a(z9, true);
        }
    }

    public final void N(boolean z9, boolean z10) {
        View view = this.O;
        if (z9 && view.getTag() == null) {
            return;
        }
        if (z9 || view.getTag() == null) {
            AnimatorSet animatorSet = this.W;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.W = null;
            }
            view.setTag(z9 ? null : 1);
            if (!z10) {
                view.setAlpha(z9 ? 1.0f : 0.0f);
                return;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.W = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z9 ? 1.0f : 0.0f));
            this.W.setDuration(200L);
            this.W.setInterpolator(xq.g);
            this.W.addListener(new z5(this, 24));
            this.W.start();
        }
    }

    public final void O(boolean z9) {
        for (int i7 = 0; i7 < 3; i7++) {
            v4.s w10 = w(i7);
            int L0 = w10.L0();
            if (z9) {
                if (L0 == 1 || L0 == 2) {
                    w10.n0(0);
                    E(i7);
                }
            } else if (L0 == 0) {
                w10.h1(0, 0);
            }
        }
    }

    public final void P(boolean z9, boolean z10, boolean z11) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.c1).M0(Long.valueOf(this.u1));
        if (M0 == null) {
            return;
        }
        bi.md mdVar = this.N0;
        if (z9) {
            if (org.telegram.messenger.t3.N(M0) || (tL_chatBannedRights = M0.default_banned_rights) == null || !(tL_chatBannedRights.send_stickers || (z10 && tL_chatBannedRights.send_plain))) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = M0.banned_rights;
                if (tL_chatBannedRights2 == null) {
                    return;
                }
                if (!org.telegram.messenger.g0.D1(tL_chatBannedRights2)) {
                    if (z10) {
                        mdVar.setText(org.telegram.messenger.id.a0("AttachPlainRestricted", null, 2131753944, org.telegram.messenger.id.v(M0.banned_rights.until_date)));
                    }
                    if (z11) {
                        mdVar.setText(org.telegram.messenger.id.a0("AttachGifRestricted", null, 2131753970, org.telegram.messenger.id.v(M0.banned_rights.until_date)));
                    } else {
                        mdVar.setText(org.telegram.messenger.id.a0("AttachStickersRestricted", null, 2131753935, org.telegram.messenger.id.v(M0.banned_rights.until_date)));
                    }
                } else if (z10) {
                    mdVar.setText(org.telegram.messenger.id.M0(2131753943, null));
                } else if (z11) {
                    mdVar.setText(org.telegram.messenger.id.M0(2131753969, null));
                } else {
                    mdVar.setText(org.telegram.messenger.id.M0(2131753934, null));
                }
            } else {
                org.telegram.ui.ActionBar.f2 f2Var = this.Y1;
                if ((f2Var instanceof org.telegram.ui.an) && ((org.telegram.ui.an) f2Var).Y6()) {
                    return;
                }
                if (z10) {
                    mdVar.setText(org.telegram.messenger.id.M0(2131749547, null));
                } else if (z11) {
                    mdVar.setText(org.telegram.messenger.id.M0(2131749546, null));
                } else {
                    mdVar.setText(org.telegram.messenger.id.M0(2131749540, null));
                }
            }
            mdVar.setVisibility(0);
        }
        AnimatorSet animatorSet = this.P2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.P2 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.P2 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(mdVar, (Property<bi.md, Float>) View.ALPHA, z9 ? mdVar.getAlpha() : 1.0f, z9 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(mdVar, (Property<bi.md, Float>) View.TRANSLATION_Y, z9 ? org.telegram.messenger.g0.L(12.0f) : mdVar.getTranslationY(), z9 ? 0.0f : org.telegram.messenger.g0.L(12.0f)));
        h2.n0 n0Var = this.Q2;
        if (n0Var != null) {
            org.telegram.messenger.g0.r(n0Var);
        }
        if (z9) {
            h2.n0 n0Var2 = new h2.n0(this, z10, z11, 4);
            this.Q2 = n0Var2;
            org.telegram.messenger.g0.i3(n0Var2, 3500L);
        }
        this.P2.setDuration(320L);
        this.P2.setInterpolator(xq.h);
        this.P2.start();
    }

    public final void Q(boolean z9, boolean z10) {
        ImageView imageView = this.D;
        if (imageView == null || this.p2) {
            return;
        }
        if (z9 && imageView.getTag() == null) {
            return;
        }
        if (z9 || imageView.getTag() == null) {
            AnimatorSet animatorSet = this.G;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.G = null;
            }
            int i7 = 1;
            imageView.setTag(z9 ? null : 1);
            if (!z10) {
                imageView.setAlpha(z9 ? 1.0f : 0.0f);
                imageView.setScaleX(z9 ? 1.0f : 0.0f);
                imageView.setScaleY(z9 ? 1.0f : 0.0f);
                imageView.setVisibility(z9 ? 0 : 4);
                return;
            }
            if (z9) {
                imageView.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.G = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.ALPHA, z9 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_X, z9 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_Y, z9 ? 1.0f : 0.0f));
            this.G.setDuration(200L);
            this.G.setInterpolator(xq.g);
            this.G.addListener(new dw(this, z9, i7));
            this.G.start();
        }
    }

    public final void R() {
        org.telegram.ui.ActionBar.f2 f2Var;
        if (((View) getParent()) != null) {
            float y10 = (getY() + (getLayoutParams().height > 0 ? getLayoutParams().height : getMeasuredHeight())) - (((org.telegram.messenger.g0.E || ((f2Var = this.Y1) != null && f2Var.isInBubbleMode())) && !this.V0) ? org.telegram.messenger.g0.L(1.0f) : r0.getHeight());
            float f10 = this.r2;
            FrameLayout frameLayout = this.n;
            if (f10 >= 0.0f) {
                y10 += getMeasuredHeight() - this.r2;
            } else if (frameLayout.getTop() - y10 < 0.0f || !this.x2) {
                y10 = 0.0f;
            }
            float W1 = (-y10) + org.telegram.messenger.g0.W1(this.E2.e, org.telegram.messenger.g0.L(50.0f), -this.q2);
            frameLayout.setTranslationY(W1);
            if (this.d0) {
                this.r.setTranslationY(W1);
            }
        }
    }

    public final void S() {
        ux uxVar;
        boolean z9;
        xu xuVar;
        boolean z10 = this.u0;
        View view = this.w;
        if (!z10) {
            setBackground(null);
            view.setBackground(null);
        } else if (org.telegram.messenger.g0.E || this.N1) {
            Drawable background = getBackground();
            int z11 = z(org.telegram.ui.ActionBar.k6.wf);
            if (background != null && (background != this.G2 || z11 != this.H2)) {
                this.G2 = background;
                this.H2 = z11;
                background.setColorFilter(new PorterDuffColorFilter(z11, PorterDuff.Mode.MULTIPLY));
            }
        } else {
            int i7 = org.telegram.ui.ActionBar.k6.wf;
            setBackgroundColor(z(i7));
            if (this.d0) {
                view.setBackgroundColor(z(i7));
            }
        }
        lw lwVar = this.I;
        if (lwVar != null) {
            if (this.u0) {
                lwVar.setBackgroundColor(z(org.telegram.ui.ActionBar.k6.wf));
                this.O.setBackgroundColor(z(org.telegram.ui.ActionBar.k6.zf));
            } else {
                lwVar.setBackground(null);
            }
        }
        yt ytVar = this.B1;
        if (ytVar != null) {
            ytVar.c.a();
        }
        int i10 = 0;
        while (true) {
            uxVar = this.V;
            z9 = this.i2;
            if (i10 >= 3) {
                break;
            }
            if (i10 == 0) {
                uxVar = this.G0;
            } else if (i10 != 1) {
                uxVar = this.o0;
            }
            if (uxVar != null) {
                rp rpVar = uxVar.d;
                FrameLayout frameLayout = uxVar.n;
                View view2 = uxVar.f;
                if (this.u0) {
                    view2.setBackgroundColor(z(org.telegram.ui.ActionBar.k6.wf));
                } else {
                    view2.setBackground(null);
                }
                uxVar.e.setBackgroundColor(z(org.telegram.ui.ActionBar.k6.zf));
                uxVar.c.a(z9 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.yf));
                org.telegram.ui.ActionBar.k6.C1(z9 ? v(0.06f) : z(org.telegram.ui.ActionBar.k6.xf), frameLayout.getBackground());
                frameLayout.invalidate();
                rpVar.setHintTextColor(z9 ? v(0.45f) : z(org.telegram.ui.ActionBar.k6.yf));
                rpVar.setTextColor(z9 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.G6));
            }
            i10++;
        }
        Paint paint = this.s1;
        if (paint != null) {
            paint.setColor(z(org.telegram.ui.ActionBar.k6.Pf));
        }
        tw twVar = this.P;
        if (twVar != null) {
            twVar.setGlowColor(z(org.telegram.ui.ActionBar.k6.wf));
        }
        qv qvVar = this.D0;
        if (qvVar != null) {
            qvVar.setGlowColor(z(org.telegram.ui.ActionBar.k6.wf));
        }
        uv uvVar = this.B0;
        if (uvVar != null) {
            uvVar.setIndicatorColor(z(org.telegram.ui.ActionBar.k6.Ff));
            uvVar.setUnderlineColor(z(org.telegram.ui.ActionBar.k6.zf));
            if (this.u0) {
                uvVar.setBackgroundColor(z(org.telegram.ui.ActionBar.k6.wf));
            } else {
                uvVar.setBackground(null);
            }
        }
        ow owVar = this.p0;
        if (owVar != null) {
            owVar.setIndicatorColor(z(org.telegram.ui.ActionBar.k6.Ff));
            owVar.setUnderlineColor(z(org.telegram.ui.ActionBar.k6.zf));
            if (this.u0) {
                owVar.setBackgroundColor(z(org.telegram.ui.ActionBar.k6.wf));
            } else {
                owVar.setBackground(null);
            }
        }
        int v = z9 ? v(0.6f) : z(org.telegram.ui.ActionBar.k6.Gf);
        boolean z12 = v != this.I2;
        this.I2 = v;
        xv xvVar = this.y;
        if (xvVar != null) {
            if (z12) {
                xvVar.setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
            }
            if (uxVar == null) {
                Drawable background2 = xvVar.getBackground();
                int i11 = org.telegram.ui.ActionBar.k6.wf;
                org.telegram.ui.ActionBar.k6.H1(background2, z(i11), false);
                org.telegram.ui.ActionBar.k6.H1(xvVar.getBackground(), z(i11), true);
            }
        }
        ImageView imageView = this.D;
        if (imageView != null && z12) {
            imageView.setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.E;
        if (imageView2 != null && z12) {
            imageView2.setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
        }
        bi.md mdVar = this.N0;
        if (mdVar != null) {
            if (mdVar.getBackground() instanceof ShapeDrawable) {
                ((ShapeDrawable) mdVar.getBackground()).getPaint().setColor(z(org.telegram.ui.ActionBar.k6.eg));
                mdVar.invalidate();
            }
            mdVar.setTextColor(z(org.telegram.ui.ActionBar.k6.dg));
        }
        mx mxVar = this.j0;
        if (mxVar != null) {
            ox oxVar = mxVar.e;
            int i12 = org.telegram.ui.ActionBar.k6.Af;
            int z13 = z(i12);
            if (z13 != this.J2) {
                this.J2 = z13;
                oxVar.a.setColorFilter(new PorterDuffColorFilter(z13, PorterDuff.Mode.MULTIPLY));
            }
            oxVar.b.setTextColor(z(i12));
            oxVar.c.setProgressColor(z(org.telegram.ui.ActionBar.k6.h6));
        }
        int z14 = z(org.telegram.ui.ActionBar.k6.Ci);
        if (this.e2 == null || z14 != this.K2) {
            this.K2 = z14;
            this.e2 = new PorterDuffColorFilter(z14, PorterDuff.Mode.SRC_IN);
        }
        int i13 = 0;
        while (true) {
            Drawable[] drawableArr = this.X0;
            if (i13 >= drawableArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.k6.E1(drawableArr[i13], z9 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Cf), false);
            org.telegram.ui.ActionBar.k6.E1(drawableArr[i13], z9 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df), true);
            i13++;
        }
        if (lwVar != null && (xuVar = lwVar.D) != null) {
            xuVar.d();
        }
        int i14 = 0;
        while (true) {
            Drawable[] drawableArr2 = this.Y0;
            if (i14 >= drawableArr2.length) {
                break;
            }
            org.telegram.ui.ActionBar.k6.E1(drawableArr2[i14], z9 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Bf), false);
            org.telegram.ui.ActionBar.k6.E1(drawableArr2[i14], z9 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df), true);
            i14++;
        }
        int i15 = 0;
        while (true) {
            Drawable[] drawableArr3 = this.Z0;
            if (i15 >= drawableArr3.length) {
                break;
            }
            org.telegram.ui.ActionBar.k6.E1(drawableArr3[i15], z9 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Bf), false);
            org.telegram.ui.ActionBar.k6.E1(drawableArr3[i15], z9 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df), true);
            i15++;
        }
        org.telegram.ui.ActionBar.u5 u5Var = this.a2;
        if (u5Var != null) {
            org.telegram.ui.ActionBar.k6.E1(u5Var, z9 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Cf), false);
            org.telegram.ui.ActionBar.k6.E1(u5Var, z9 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df), true);
        }
        org.telegram.ui.ActionBar.u5 u5Var2 = this.b2;
        if (u5Var2 != null) {
            org.telegram.ui.ActionBar.k6.E1(u5Var2, z9 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Ff), false);
            org.telegram.ui.ActionBar.k6.E1(u5Var2, z9 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Ff), true);
        }
    }

    public final void T() {
        tw twVar = this.P;
        if (twVar == null) {
            return;
        }
        for (int i7 = 0; i7 < twVar.getChildCount(); i7++) {
            View childAt = twVar.getChildAt(i7);
            if (childAt instanceof yw) {
                ((yw) childAt).a(true);
            }
        }
    }

    public final void U(int i7) {
        if (this.f0) {
            return;
        }
        int i10 = -1;
        if (i7 != -1) {
            int size = getRecentEmoji().size() + (this.d0 ? 1 : 0);
            qw qwVar = this.R;
            int i11 = qwVar.c;
            ArrayList arrayList = qwVar.y;
            int i12 = 0;
            int i13 = size + (i11 >= 0 ? 3 : 0);
            if (i7 >= i13) {
                int i14 = 0;
                while (true) {
                    String[][] strArr = org.telegram.messenger.j6.f;
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
                    ArrayList<uw> emojipacks = getEmojipacks();
                    int size2 = arrayList.size() - 1;
                    while (true) {
                        if (size2 < 0) {
                            break;
                        }
                        if (((Integer) arrayList.get(size2)).intValue() <= i7) {
                            uw uwVar = (uw) this.q1.get(size2);
                            while (i12 < emojipacks.size()) {
                                long j3 = emojipacks.get(i12).b.id;
                                long j10 = uwVar.b.id;
                                if (j3 == j10 && (!uwVar.g || (!uwVar.f && !this.p1.contains(Long.valueOf(j10))))) {
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
                this.I.j(i12, true);
            }
        }
    }

    public final void V() {
        int i7;
        tx txVar;
        int i10;
        boolean z9;
        ow owVar = this.p0;
        int currentPosition = owVar.getCurrentPosition();
        int i11 = this.r0;
        boolean z10 = currentPosition == i11;
        boolean z11 = i11 >= 0;
        boolean isEmpty = this.i1.isEmpty();
        owVar.d(false);
        this.r0 = -2;
        this.s0 = -2;
        this.t0 = -2;
        Drawable[] drawableArr = this.Z0;
        if (isEmpty) {
            i7 = 0;
        } else {
            this.r0 = 0;
            owVar.b(0, drawableArr[0]).setContentDescription(org.telegram.messenger.id.M0(2131746365, null));
            i7 = 1;
        }
        this.s0 = i7;
        owVar.b(1, drawableArr[1]).setContentDescription(org.telegram.messenger.id.M0(2131750835, null));
        this.t0 = i7 + 1;
        org.telegram.messenger.g0.L(13.0f);
        org.telegram.messenger.g0.L(11.0f);
        int i12 = this.c1;
        ArrayList arrayList = org.telegram.messenger.qp.s1(i12).b4;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            String str = (String) arrayList.get(i13);
            org.telegram.messenger.e6 g10 = org.telegram.messenger.i6.g(str);
            if (g10 != null) {
                TLRPC.Document T = org.telegram.messenger.ui.b0(i12).T(str);
                String j3 = jg.g.j(i13 + 3, "tab");
                int i14 = owVar.y;
                owVar.y = i14 + 1;
                fv0 fv0Var = (fv0) owVar.n.get(j3);
                if (fv0Var != null) {
                    owVar.g(j3, fv0Var, i14);
                    i10 = currentPosition;
                    z9 = z11;
                } else {
                    i10 = currentPosition;
                    z9 = z11;
                    fv0Var = new fv0(owVar.getContext(), 2);
                    fv0Var.setFocusable(true);
                    fv0Var.setOnClickListener(new kk0(owVar, 2));
                    fv0Var.setExpanded(owVar.f0);
                    fv0Var.a(owVar.i0);
                    owVar.e.addView(fv0Var, i14);
                }
                fv0Var.d = false;
                fv0Var.setTag(R.id.index_tag, Integer.valueOf(i14));
                fv0Var.setTag(R.id.parent_tag, g10);
                fv0Var.setTag(R.id.object_tag, T);
                fv0Var.setSelected(i14 == owVar.D);
                owVar.h.put(j3, fv0Var);
                fv0Var.setContentDescription(str);
            } else {
                i10 = currentPosition;
                z9 = z11;
            }
            i13++;
            currentPosition = i10;
            z11 = z9;
        }
        int i15 = currentPosition;
        boolean z12 = z11;
        owVar.h();
        owVar.q();
        if (z10 && isEmpty) {
            owVar.m(this.s0);
            nv nvVar = this.o0;
            if (nvVar == null || (txVar = nvVar.r) == null) {
                return;
            }
            txVar.I1(null);
            return;
        }
        WeakHashMap weakHashMap = r0.i0.a;
        if (owVar.isLaidOut()) {
            if (!isEmpty && !z12) {
                owVar.k(i15 + 1, 0);
            } else if (isEmpty && z12) {
                owVar.k(i15 - 1, 0);
            }
        }
    }

    public final void W() {
        mx mxVar;
        int size = this.i1.size();
        long n10 = org.telegram.messenger.ui.n(ConnectionsManager.DEFAULT_DATACENTER_ID, this.i1);
        ArrayList arrayList = new ArrayList(org.telegram.messenger.ui.b0(this.c1).i0);
        this.i1 = arrayList;
        long n11 = org.telegram.messenger.ui.n(ConnectionsManager.DEFAULT_DATACENTER_ID, arrayList);
        if ((this.p0 != null && size == 0 && !this.i1.isEmpty()) || (size != 0 && this.i1.isEmpty())) {
            V();
        }
        if ((size == this.i1.size() && n10 == n11) || (mxVar = this.n0) == null) {
            return;
        }
        mxVar.f();
    }

    public final void X(boolean z9) {
        TLRPC.Document document;
        boolean z10;
        int i7;
        org.telegram.ui.ActionBar.f6 f6Var;
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet;
        uv uvVar = this.B0;
        if (uvVar != null) {
            org.telegram.ui.c61 c61Var = uvVar.e;
            if (uvVar.s != null) {
                return;
            }
            this.F1 = -2;
            this.G1 = -2;
            this.H1 = -2;
            this.I1 = -2;
            int i10 = 0;
            this.e0 = false;
            this.E1 = 0;
            int currentPosition = uvVar.getCurrentPosition();
            uvVar.d((getParent() == null || getVisibility() != 0 || (this.y1.size() == 0 && this.z1.size() == 0)) ? false : true);
            int i11 = this.c1;
            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i11);
            SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(i11).f7;
            ArrayList arrayList3 = this.m1;
            arrayList3.clear();
            ArrayList arrayList4 = b02.s0[0];
            int size = arrayList4.size();
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList4.get(i12);
                if (!b02.B0(stickerSetCovered.set.id, true)) {
                    arrayList3.add(stickerSetCovered);
                }
            }
            fy fyVar = this.F0;
            if (fyVar != null) {
                fyVar.f();
            }
            boolean isEmpty = arrayList4.isEmpty();
            long j3 = 0;
            Drawable[] drawableArr = this.Y0;
            org.telegram.ui.ActionBar.f6 f6Var2 = null;
            if (!isEmpty && (arrayList3.isEmpty() || sharedPreferences.getLong("featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList4.get(0)).set.id)) {
                int i13 = b02.u0[0].isEmpty() ? 2 : 3;
                fv0 c10 = uvVar.c(i13, drawableArr[i13]);
                c10.h.setText(org.telegram.messenger.id.M0(2131750832, null));
                c10.setContentDescription(org.telegram.messenger.id.M0(2131750834, null));
                int i14 = this.E1;
                this.H1 = i14;
                this.E1 = i14 + 1;
            }
            if (!this.k1.isEmpty()) {
                int i15 = this.E1;
                this.G1 = i15;
                this.E1 = i15 + 1;
                fv0 c11 = uvVar.c(1, drawableArr[1]);
                c11.h.setText(org.telegram.messenger.id.M0(2131750839, null));
                c11.setContentDescription(org.telegram.messenger.id.M0(2131750842, null));
            }
            if (!this.j1.isEmpty()) {
                int i16 = this.E1;
                this.F1 = i16;
                this.E1 = i16 + 1;
                fv0 c12 = uvVar.c(0, drawableArr[0]);
                c12.h.setText(org.telegram.messenger.id.M0(2131746364, null));
                c12.setContentDescription(org.telegram.messenger.id.M0(2131746365, null));
            }
            ArrayList arrayList5 = this.d1;
            arrayList5.clear();
            this.h1 = null;
            this.f1 = -1;
            this.e1 = -10;
            if (this.F2 == null || z9) {
                this.F2 = new ArrayList(b02.s0(0));
            }
            ArrayList arrayList6 = this.F2;
            int i17 = 0;
            while (true) {
                TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.x1;
                if (i17 >= stickerSetCoveredArr.length) {
                    break;
                }
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCoveredArr[i17];
                long j10 = j3;
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
                j3 = j10;
            }
            long j11 = j3;
            ArrayList w02 = org.telegram.messenger.qp.s1(i11).w0(arrayList6);
            for (int i18 = 0; i18 < w02.size(); i18++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) w02.get(i18);
                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
                if ((stickerSet2 == null || !stickerSet2.archived) && (arrayList2 = tL_messages_stickerSet2.documents) != null && !arrayList2.isEmpty()) {
                    arrayList5.add(tL_messages_stickerSet2);
                }
            }
            if (this.J1 != null) {
                long j12 = org.telegram.messenger.qp.s1(i11).f7.getLong("group_hide_stickers_" + this.J1.id, -1L);
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i11).M0(Long.valueOf(this.J1.id));
                if (M0 == null || this.J1.stickerset == null || !org.telegram.messenger.t3.N(M0)) {
                    this.g1 = j12 != -1;
                } else {
                    TLRPC.StickerSet stickerSet3 = this.J1.stickerset;
                    if (stickerSet3 != null) {
                        this.g1 = j12 == stickerSet3.id;
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
            int i19 = 0;
            while (i19 < arrayList5.size()) {
                if (i19 == this.e1) {
                    TLRPC.Chat M02 = org.telegram.messenger.qp.s1(i11).M0(Long.valueOf(this.J1.id));
                    if (M02 == null) {
                        arrayList5.remove(i10);
                        i19--;
                    } else {
                        this.e0 = true;
                        String str = "chat" + M02.id;
                        int i20 = uvVar.y;
                        uvVar.y = i20 + 1;
                        fv0 fv0Var = (fv0) uvVar.n.get(str);
                        if (fv0Var != null) {
                            uvVar.g(str, fv0Var, i20);
                        } else {
                            fv0Var = new fv0(uvVar.getContext(), i10);
                            fv0Var.setFocusable(true);
                            fv0Var.setOnClickListener(new kk0(uvVar, i10));
                            c61Var.addView(fv0Var, i20);
                            fv0Var.x = true;
                            w8 w8Var = new w8(f6Var2);
                            w8Var.u(org.telegram.messenger.g0.L(14.0f));
                            w8Var.q(M02);
                            int i21 = uvVar.a;
                            l9 l9Var = fv0Var.e;
                            l9Var.setLayerNum(i21);
                            l9Var.e(M02, w8Var);
                            l9Var.setAspectFit(true);
                            fv0Var.setExpanded(uvVar.f0);
                            fv0Var.a(uvVar.i0);
                            fv0Var.h.setText(M02.title);
                        }
                        fv0Var.d = true;
                        fv0Var.setTag(R.id.index_tag, Integer.valueOf(i20));
                        fv0Var.setSelected(i20 == uvVar.D);
                        uvVar.h.put(str, fv0Var);
                    }
                    i7 = 0;
                    f6Var = null;
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
                        z10 = false;
                        document = tL_messages_stickerSet5.documents.get(0);
                    } else {
                        z10 = false;
                    }
                    Object w10 = org.telegram.messenger.w7.w(tL_messages_stickerSet5.set.thumbs, 90, z10, null, z10);
                    if (w10 == null || tL_messages_stickerSet5.set.gifs) {
                        w10 = document;
                    }
                    String str2 = "set" + tL_messages_stickerSet5.set.id;
                    int i23 = uvVar.y;
                    uvVar.y = i23 + 1;
                    fv0 fv0Var2 = (fv0) uvVar.n.get(str2);
                    if (fv0Var2 != null) {
                        uvVar.g(str2, fv0Var2, i23);
                    } else {
                        fv0Var2 = new fv0(uvVar.getContext(), 0);
                        fv0Var2.setFocusable(true);
                        fv0Var2.setOnClickListener(new kk0(uvVar, 1));
                        fv0Var2.setExpanded(uvVar.f0);
                        fv0Var2.a(uvVar.i0);
                        c61Var.addView(fv0Var2, i23);
                    }
                    fv0Var2.e.setLayerNum(uvVar.a);
                    i7 = 0;
                    fv0Var2.d = false;
                    fv0Var2.setTag(w10);
                    fv0Var2.setTag(R.id.index_tag, Integer.valueOf(i23));
                    fv0Var2.setTag(R.id.parent_tag, tL_messages_stickerSet5);
                    fv0Var2.setTag(R.id.object_tag, document);
                    fv0Var2.setSelected(i23 == uvVar.D);
                    uvVar.h.put(str2, fv0Var2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(tL_messages_stickerSet5.set.title);
                    sb2.append(", ");
                    f6Var = null;
                    sb2.append(org.telegram.messenger.id.M0(2131754757, null));
                    fv0Var2.setContentDescription(sb2.toString());
                }
                i19++;
                i10 = i7;
                f6Var2 = f6Var;
            }
            uvVar.h();
            uvVar.q();
            if (currentPosition != 0) {
                uvVar.k(currentPosition, currentPosition);
            }
            o();
        }
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            q(false);
            float f12 = 1.0f - this.a.e;
            tv tvVar = this.G0;
            tvVar.setAlpha(f12);
            tvVar.setVisibility(f12 > 0.0f ? 0 : 4);
            float f13 = 1.0f - f12;
            ph.c cVar2 = this.H0;
            cVar2.setAlpha(f13);
            cVar2.setTranslationY((-org.telegram.messenger.g0.L(15.0f)) * f12);
            cVar2.setVisibility(f13 > 0.0f ? 0 : 4);
            pg.h hVar = this.M;
            hVar.setAlpha(f13);
            hVar.setTranslationY(org.telegram.messenger.g0.L(30.0f) * f12);
            hVar.setVisibility(f13 > 0.0f ? 0 : 4);
            R();
            this.x0.invalidate();
            return;
        }
        if (i7 == 1) {
            l(false);
            float f14 = 1.0f - this.b.e;
            iv ivVar = this.V;
            ivVar.setAlpha(f14);
            ivVar.setVisibility(f14 > 0.0f ? 0 : 4);
            float f15 = 1.0f - f14;
            ph.c cVar3 = this.U;
            cVar3.setAlpha(f15);
            cVar3.setTranslationY((-org.telegram.messenger.g0.L(15.0f)) * f14);
            cVar3.setVisibility(f15 > 0.0f ? 0 : 4);
            pg.h hVar2 = this.K;
            hVar2.setAlpha(f15);
            hVar2.setTranslationY(org.telegram.messenger.g0.L(30.0f) * f14);
            hVar2.setVisibility(f15 > 0.0f ? 0 : 4);
            R();
            this.J.invalidate();
        }
    }

    public final void Z() {
        vv vvVar = this.C0;
        uv uvVar = this.B0;
        if (uvVar != null && vvVar == null && this.t1 != null) {
            uvVar.setTranslationY(this.t1.p() * (-org.telegram.messenger.g0.L(50.0f)));
        }
        if (vvVar == null) {
            return;
        }
        boolean z9 = getVisibility() == 0 && this.K0 && this.t1.p() != 1.0f;
        vvVar.setVisibility(z9 ? 0 : 8);
        if (z9) {
            Rect rect = this.y2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.x0, rect, null);
            float p10 = this.t1.p() * org.telegram.messenger.g0.L(50.0f);
            int i7 = rect.left;
            if (i7 != 0 || p10 != 0.0f) {
                this.X1 = false;
            }
            vvVar.setTranslationX(i7);
            float translationY = (((getTranslationY() + getTop()) - vvVar.getTop()) - uvVar.getExpandedOffset()) - p10;
            if (vvVar.getTranslationY() != translationY) {
                vvVar.setTranslationY(translationY);
                vvVar.invalidate();
            }
        }
        if (this.X1 && z9 && this.P0) {
            uvVar.i(true, this.W1);
        } else {
            this.X1 = false;
            uvVar.i(false, this.W1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    public final void a0() {
        int i7;
        boolean z9;
        LongSparseArray longSparseArray = this.z1;
        LongSparseArray longSparseArray2 = this.y1;
        int i10 = this.c1;
        qv qvVar = this.D0;
        if (qvVar == null) {
            return;
        }
        try {
            int childCount = qvVar.getChildCount();
            ?? r72 = 0;
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = qvVar.getChildAt(i11);
                if (!(childAt instanceof org.telegram.ui.Cells.u3) || ((xi0) qvVar.T(childAt)) == null) {
                    i7 = i11;
                } else {
                    org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) childAt;
                    ArrayList arrayList = org.telegram.messenger.ui.b0(i10).u0[r72];
                    TLRPC.StickerSetCovered stickerSet = u3Var.getStickerSet();
                    boolean z10 = (arrayList == null || !arrayList.contains(Long.valueOf(stickerSet.set.id))) ? r72 : true;
                    int i12 = r72;
                    while (true) {
                        TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.x1;
                        if (i12 >= stickerSetCoveredArr.length) {
                            i7 = i11;
                            z9 = false;
                            break;
                        }
                        TLRPC.StickerSetCovered stickerSetCovered = stickerSetCoveredArr[i12];
                        if (stickerSetCovered != null) {
                            i7 = i11;
                            if (stickerSetCovered.set.id == stickerSet.set.id) {
                                z9 = true;
                                break;
                            }
                        } else {
                            i7 = i11;
                        }
                        i12++;
                        i11 = i7;
                    }
                    u3Var.c(stickerSet, z10, true, 0, 0, z9);
                    if (z10) {
                        org.telegram.messenger.ui.b0(i10).e1(stickerSet.set.id);
                    }
                    boolean z11 = longSparseArray2.indexOfKey(stickerSet.set.id) >= 0;
                    boolean z12 = longSparseArray.indexOfKey(stickerSet.set.id) >= 0;
                    if (z11 || z12) {
                        if (z11 && u3Var.r) {
                            longSparseArray2.remove(stickerSet.set.id);
                            z11 = false;
                        } else if (z12 && !u3Var.r) {
                            longSparseArray.remove(stickerSet.set.id);
                        }
                    }
                    u3Var.b(!z9 && z11, true);
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
        this.r2 = f10;
        R();
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.messenger.c20 c20Var;
        TLRPC.StickerSet stickerSet;
        int i11 = org.telegram.messenger.qs.x0;
        qw qwVar = this.R;
        cv cvVar = this.R2;
        if (i7 == i11) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.y0 != null) {
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
                    qwVar.F(false);
                    return;
                } else {
                    org.telegram.messenger.g0.r(cvVar);
                    org.telegram.messenger.g0.i3(cvVar, 100L);
                    return;
                }
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.q3) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            TLRPC.ChatFull chatFull = this.J1;
            if (chatFull != null && chatFull.id == longValue && booleanValue) {
                qwVar.F(true);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.X0) {
            boolean booleanValue2 = ((Boolean) objArr[0]).booleanValue();
            int intValue = ((Integer) objArr[1]).intValue();
            if (booleanValue2 || intValue == 0 || intValue == 2) {
                k(booleanValue2);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.z0) {
            a0();
            qb0 qb0Var = this.x;
            if (qb0Var != null) {
                int childCount = qb0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    qb0Var.getChildAt(i12).invalidate();
                }
            }
            X(false);
            return;
        }
        if (i7 == org.telegram.messenger.qs.A0) {
            if (qwVar != null) {
                qwVar.F(false);
                return;
            }
            return;
        }
        int i13 = org.telegram.messenger.qs.B0;
        hx hxVar = this.S;
        if (i7 == i13) {
            Long l10 = (Long) objArr[0];
            long longValue2 = l10.longValue();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = objArr.length > 1 ? (TLRPC.TL_messages_stickerSet) objArr[1] : null;
            if (tL_messages_stickerSet != null) {
                cy cyVar = this.z0;
                if (cyVar != null && cyVar.d == longValue2 && cyVar.f.size() < tL_messages_stickerSet.documents.size()) {
                    cyVar.f = tL_messages_stickerSet.documents;
                    cyVar.f();
                }
                if (hxVar != null && hxVar.d == longValue2 && hxVar.f.size() < tL_messages_stickerSet.documents.size()) {
                    hxVar.f = tL_messages_stickerSet.documents;
                    hxVar.f();
                }
            }
            TLRPC.ChatFull chatFull2 = this.J1;
            if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null && stickerSet.id == longValue2) {
                X(false);
            }
            HashMap hashMap = this.r1;
            if (hashMap.containsKey(l10) && objArr.length >= 2 && ((org.telegram.messenger.c20) hashMap.get(l10)) != null && tL_messages_stickerSet != null && (c20Var = (org.telegram.messenger.c20) hashMap.remove(l10)) != null) {
                c20Var.a(tL_messages_stickerSet);
            }
            org.telegram.messenger.g0.r(cvVar);
            org.telegram.messenger.g0.i3(cvVar, 100L);
            return;
        }
        int i14 = org.telegram.messenger.qs.i4;
        tw twVar = this.P;
        if (i7 != i14) {
            if (i7 != org.telegram.messenger.qs.L2) {
                if (i7 == org.telegram.messenger.qs.f5) {
                    if (qwVar != null) {
                        qwVar.F(false);
                    }
                    T();
                    X(false);
                    return;
                }
                return;
            }
            if (twVar == null || !this.d0) {
                return;
            }
            if ((this.V.c.k == 2 || twVar.getAdapter() == hxVar) && !TextUtils.isEmpty(hxVar.w)) {
                hxVar.F(hxVar.w, true);
                return;
            }
            return;
        }
        qv qvVar = this.D0;
        if (qvVar != null) {
            int childCount2 = qvVar.getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt = qvVar.getChildAt(i15);
                if ((childAt instanceof org.telegram.ui.Cells.j8) || (childAt instanceof org.telegram.ui.Cells.z7)) {
                    childAt.invalidate();
                }
            }
        }
        if (twVar != null) {
            twVar.invalidate();
            int childCount3 = twVar.getChildCount();
            for (int i16 = 0; i16 < childCount3; i16++) {
                View childAt2 = twVar.getChildAt(i16);
                if (childAt2 instanceof qx) {
                    childAt2.invalidate();
                }
            }
        }
        yt ytVar = this.B1;
        if (ytVar != null) {
            ytVar.c.invalidate();
        }
        ow owVar = this.p0;
        if (owVar != null) {
            org.telegram.ui.c61 c61Var = owVar.e;
            int childCount4 = c61Var.getChildCount();
            for (int i17 = 0; i17 < childCount4; i17++) {
                c61Var.getChildAt(i17).invalidate();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        R();
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.h) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        if (this.n.getVisibility() != 8 && !this.u0 && this.w0) {
            canvas.drawColor(i0.a.o(-1, 25));
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        float R0 = org.telegram.messenger.g0.R0(this.q2);
        if (R0 > 0.0f) {
            int r12 = org.telegram.ui.ActionBar.k6.r1(R0, z(org.telegram.ui.ActionBar.k6.wf));
            int i7 = this.A2;
            GradientDrawable gradientDrawable = this.z2;
            if (i7 != r12) {
                gradientDrawable.setColors(new int[]{r12, org.telegram.ui.ActionBar.k6.r1(0.66f, r12), i0.a.o(r12, 0)});
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

    public ArrayList<uw> getEmojipacks() {
        ArrayList<uw> arrayList = new ArrayList<>();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.q1;
            if (i7 >= arrayList2.size()) {
                return arrayList;
            }
            uw uwVar = (uw) arrayList2.get(i7);
            boolean z9 = uwVar.g;
            ArrayList arrayList3 = this.p1;
            if ((!z9 && (uwVar.f || arrayList3.contains(Long.valueOf(uwVar.b.id)))) || (uwVar.g && !uwVar.f && !arrayList3.contains(Long.valueOf(uwVar.b.id)))) {
                arrayList.add(uwVar);
            }
            i7++;
        }
    }

    public ArrayList<String> getRecentEmoji() {
        if (this.c2) {
            return org.telegram.messenger.i6.i;
        }
        if (this.B2 == null) {
            this.B2 = new ArrayList();
        }
        if (org.telegram.messenger.i6.i.size() != this.C2) {
            this.B2.clear();
            int i7 = 0;
            while (true) {
                ArrayList arrayList = org.telegram.messenger.i6.i;
                if (i7 >= arrayList.size()) {
                    break;
                }
                if (!((String) arrayList.get(i7)).startsWith("animated_")) {
                    this.B2.add((String) arrayList.get(i7));
                }
                i7++;
            }
            this.C2 = this.B2.size();
        }
        return this.B2;
    }

    public float getStickersExpandOffset() {
        uv uvVar = this.B0;
        if (uvVar == null) {
            return 0.0f;
        }
        return uvVar.getExpandedOffset();
    }

    public final void h(String str) {
        if (str == null) {
            return;
        }
        if (!str.startsWith("animated_") && !org.telegram.messenger.i6.h(str)) {
            return;
        }
        org.telegram.messenger.i6.a(str);
        int i7 = 0;
        if (getVisibility() != 0 || this.h.getCurrentItem() != 0) {
            org.telegram.messenger.i6.s();
            this.R.F(false);
        }
        org.telegram.messenger.i6.r();
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
            ArrayList arrayList2 = org.telegram.messenger.i6.i;
            if (i7 >= arrayList2.size()) {
                this.C2 = this.B2.size();
                return;
            } else {
                if (!((String) arrayList2.get(i7)).startsWith("animated_")) {
                    this.B2.add((String) arrayList2.get(i7));
                }
                i7++;
            }
        }
    }

    public final void i(int i7, int i10, boolean z9) {
        if (i7 == 2 || x(i7).K(0) == null) {
            return;
        }
        ew ewVar = new ew(getContext(), i10);
        ewVar.a = !z9 ? 1 : 0;
        w(i7).w0(ewVar);
    }

    public final void k(boolean z9) {
        if (z9) {
            W();
            return;
        }
        int size = this.j1.size();
        int size2 = this.k1.size();
        int i7 = this.c1;
        this.j1 = org.telegram.messenger.ui.b0(i7).i0(0, true);
        this.k1 = org.telegram.messenger.ui.b0(i7).i0(2, false);
        if (org.telegram.messenger.p10.i(i7).q()) {
            this.l1 = org.telegram.messenger.ui.b0(i7).i0(7, false);
        } else {
            this.l1 = new ArrayList();
        }
        for (int i10 = 0; i10 < this.k1.size(); i10++) {
            TLRPC.Document document = (TLRPC.Document) this.k1.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 < this.j1.size()) {
                    TLRPC.Document document2 = (TLRPC.Document) this.j1.get(i11);
                    if (document2.dc_id == document.dc_id && document2.id == document.id) {
                        this.j1.remove(i11);
                        break;
                    }
                    i11++;
                }
            }
        }
        if (org.telegram.messenger.qp.s1(i7).D3()) {
            int i12 = 0;
            while (i12 < this.k1.size()) {
                if (org.telegram.messenger.ij.Y3((TLRPC.Document) this.k1.get(i12))) {
                    this.k1.remove(i12);
                    i12--;
                }
                i12++;
            }
            int i13 = 0;
            while (i13 < this.j1.size()) {
                if (org.telegram.messenger.ij.Y3((TLRPC.Document) this.j1.get(i13))) {
                    this.j1.remove(i13);
                    i13--;
                }
                i13++;
            }
        }
        if (size != this.j1.size() || size2 != this.k1.size()) {
            X(false);
        }
        yx yxVar = this.y0;
        if (yxVar != null) {
            yxVar.f();
        }
        o();
    }

    public final void l(boolean z9) {
        ix ixVar = this.t1;
        te.a aVar = this.b;
        tw twVar = this.P;
        iv ivVar = this.V;
        if (ixVar != null && ixVar.z()) {
            v4.d1 K = twVar.K(0);
            if (K == null) {
                ux.a(ivVar, true, !z9);
            } else {
                ux.a(ivVar, K.a.getTop() < twVar.getPaddingTop(), !z9);
            }
            N(false, !z9);
            ivVar.setTranslationY(aVar.e * org.telegram.messenger.g0.L(15.0f));
            return;
        }
        if (ivVar == null || twVar == null) {
            return;
        }
        ivVar.setTranslationY((aVar.e * org.telegram.messenger.g0.L(15.0f)) + (twVar.K(0) != null ? r0.a.getTop() : -this.b1));
        ivVar.a.a(false, !z9);
        m(Math.round(this.I.getTranslationY()));
    }

    public final void m(int i7) {
        ObjectAnimator objectAnimator = this.R0[1];
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            boolean z9 = false;
            v4.d1 K = this.P.K(0);
            int L = org.telegram.messenger.g0.L(38.0f) + i7;
            if (L > 0 && (K == null || K.a.getBottom() < L)) {
                z9 = true;
            }
            N(z9, !this.K1);
        }
    }

    public final void n(int i7, View view) {
        tw twVar;
        v4.d1 K;
        lw lwVar = this.I;
        int[] iArr = this.Q0;
        if (view == null) {
            iArr[1] = 0;
            lwVar.setTranslationY(0);
            return;
        }
        if (view.getVisibility() != 0 || this.f0) {
            return;
        }
        ix ixVar = this.t1;
        if (ixVar == null || !ixVar.z()) {
            if (i7 > 0 && (twVar = this.P) != null && twVar.getVisibility() == 0 && (K = twVar.K(0)) != null) {
                if (K.a.getTop() + (this.d0 ? this.b1 : 0) >= twVar.getPaddingTop()) {
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
            lwVar.setTranslationY(Math.max(-org.telegram.messenger.g0.L(36.0f), iArr[1]));
        }
    }

    public final void o() {
        int L0;
        uv uvVar = this.B0;
        if (uvVar == null || (L0 = this.E0.L0()) == -1) {
            return;
        }
        int i7 = this.G1;
        if (i7 <= 0 && (i7 = this.F1) <= 0) {
            i7 = this.E1;
        }
        uvVar.k(this.y0.F(L0), i7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ab.b0 b0Var = this.M2;
        if (b0Var != null) {
            b0Var.b();
            this.M2 = null;
        }
        ab.b0 b0Var2 = (ab.b0) new org.telegram.messenger.ps(org.telegram.messenger.qs.f(this.c1), this).b;
        b0Var2.e(org.telegram.messenger.qs.i4);
        b0Var2.c(org.telegram.messenger.qs.L2);
        b0Var2.c(org.telegram.messenger.qs.q3);
        this.M2 = b0Var2;
        if (this.y0 != null) {
            b0Var2.c(org.telegram.messenger.qs.x0);
            b0Var2.c(org.telegram.messenger.qs.X0);
            b0Var2.c(org.telegram.messenger.qs.z0);
            b0Var2.c(org.telegram.messenger.qs.B0);
            b0Var2.c(org.telegram.messenger.qs.f5);
            org.telegram.messenger.g0.h3(new cv(this, 0));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yt ytVar = this.B1;
        if (ytVar != null && ytVar.isShowing()) {
            ytVar.dismiss();
        }
        org.telegram.ui.ks p10 = org.telegram.ui.ks.p();
        if (p10.l == this.g2) {
            p10.W = null;
            p10.a0 = null;
            p10.Y = null;
            p10.l = null;
            p10.c0 = null;
            p10.t();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13 = i11 - i7;
        if (this.O1 != i13) {
            this.O1 = i13;
            D();
        }
        super.onLayout(z9, i7, i10, i11, i12);
        R();
        Z();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        this.K1 = true;
        boolean z9 = org.telegram.messenger.g0.E;
        View view = this.w;
        boolean z10 = this.d0;
        if (z9 || this.N1) {
            if (this.L1 != 1) {
                if (!this.L2) {
                    setOutlineProvider(this.M1);
                    setClipToOutline(true);
                    setElevation(org.telegram.messenger.g0.L(2.0f));
                }
                setBackgroundResource(R.drawable.smiles_popup);
                Drawable background = getBackground();
                int i11 = org.telegram.ui.ActionBar.k6.wf;
                background.setColorFilter(new PorterDuffColorFilter(z(i11), PorterDuff.Mode.MULTIPLY));
                if (z10 && this.u0) {
                    view.setBackgroundColor(z(i11));
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
                int i12 = org.telegram.ui.ActionBar.k6.wf;
                setBackgroundColor(z(i12));
                if (z10) {
                    view.setBackgroundColor(z(i12));
                }
            }
            this.L1 = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
        this.K1 = false;
        setTranslationY(getTranslationY());
    }

    public final void p(int i7) {
        int L0;
        int L02;
        if (i7 == 0) {
            if (this.J0 || (L02 = this.E0.L0()) == -1 || this.D0 == null) {
                return;
            }
            int i10 = this.G1;
            if (i10 <= 0 && (i10 = this.F1) <= 0) {
                i10 = this.E1;
            }
            this.B0.k(this.y0.F(L02), i10);
            return;
        }
        if (i7 == 2) {
            v4.g0 adapter = this.h0.getAdapter();
            mx mxVar = this.n0;
            if (adapter != mxVar || mxVar.I < 0 || this.s0 < 0 || this.r0 < 0 || (L0 = this.i0.L0()) == -1) {
                return;
            }
            this.p0.k(L0 >= mxVar.I ? this.s0 : this.r0, 0);
        }
    }

    public final void q(boolean z9) {
        ix ixVar = this.t1;
        te.a aVar = this.a;
        qv qvVar = this.D0;
        tv tvVar = this.G0;
        if (ixVar != null && ixVar.z()) {
            v4.d1 K = qvVar.K(0);
            if (K == null) {
                ux.a(tvVar, true, !z9);
            } else {
                ux.a(tvVar, K.a.getTop() < qvVar.getPaddingTop(), !z9);
            }
            tvVar.setTranslationY(aVar.e * org.telegram.messenger.g0.L(15.0f));
            return;
        }
        if (tvVar == null || qvVar == null) {
            return;
        }
        tvVar.setTranslationY((aVar.e * org.telegram.messenger.g0.L(15.0f)) + (qvVar.K(0) != null ? r0.a.getTop() : -this.b1));
        tvVar.a.a(false, !z9);
    }

    public final void r() {
        HashMap hashMap = org.telegram.messenger.i6.a;
        org.telegram.messenger.qp.d1().edit().putBoolean("filled_default", true).commit();
        org.telegram.messenger.i6.h.clear();
        org.telegram.messenger.i6.i.clear();
        org.telegram.messenger.i6.r();
        this.R.F(false);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.K1) {
            return;
        }
        super.requestLayout();
    }

    public final void s(long j3, boolean z9) {
        ux uxVar;
        v4.b0 b0Var;
        View view;
        pj0 pj0Var;
        int i7;
        int i10;
        TLRPC.TL_messages_stickerSet o02;
        yx yxVar;
        int E;
        AnimatorSet animatorSet = this.M0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.M0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        int i11 = 2;
        if (currentItem == 2 && j3 != -1 && (o02 = org.telegram.messenger.ui.b0(this.c1).o0(j3)) != null && (E = (yxVar = this.y0).E(o02)) >= 0 && E < yxVar.b()) {
            H(E, org.telegram.messenger.g0.L(48.0f));
        }
        int i12 = 0;
        mx mxVar = this.j0;
        if (mxVar != null) {
            mxVar.K = false;
        }
        int i13 = 0;
        while (i13 < 3) {
            pj0 pj0Var2 = this.D0;
            pj0 pj0Var3 = this.h0;
            nv nvVar = this.o0;
            pj0 pj0Var4 = this.P;
            if (i13 == 0) {
                uxVar = this.V;
                b0Var = this.Q;
                view = this.I;
                pj0Var = pj0Var4;
            } else if (i13 == 1) {
                b0Var = this.i0;
                view = this.p0;
                pj0Var = pj0Var3;
                uxVar = nvVar;
            } else {
                uxVar = this.G0;
                b0Var = this.E0;
                view = this.B0;
                pj0Var = pj0Var2;
            }
            if (uxVar == null) {
                i10 = i12;
                i7 = i11;
            } else {
                int i14 = i12;
                tx txVar = uxVar.r;
                int i15 = i11;
                uxVar.d.setText("");
                if (txVar != null) {
                    txVar.I1(null);
                    txVar.G1();
                }
                int i16 = this.b1;
                if (i13 == currentItem && z9) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.M0 = animatorSet2;
                    Property property = View.TRANSLATION_Y;
                    if (view == null || i13 == 1) {
                        float[] fArr = new float[1];
                        fArr[i14] = org.telegram.messenger.g0.L(36.0f) - i16;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(pj0Var, (Property<pj0, Float>) property, fArr);
                        Animator[] animatorArr = new Animator[1];
                        animatorArr[i14] = ofFloat;
                        animatorSet2.playTogether(animatorArr);
                    } else {
                        float[] fArr2 = new float[1];
                        fArr2[i14] = 0.0f;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr2);
                        float[] fArr3 = new float[1];
                        fArr3[i14] = org.telegram.messenger.g0.L(36.0f);
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(pj0Var, (Property<pj0, Float>) property, fArr3);
                        float[] fArr4 = new float[1];
                        fArr4[i14] = org.telegram.messenger.g0.L(36.0f);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(uxVar, (Property<ux, Float>) property, fArr4);
                        Animator[] animatorArr2 = new Animator[3];
                        animatorArr2[i14] = ofFloat2;
                        animatorArr2[1] = ofFloat3;
                        animatorArr2[i15] = ofFloat4;
                        animatorSet2.playTogether(animatorArr2);
                    }
                    this.M0.setDuration(200L);
                    this.M0.setInterpolator(xq.h);
                    this.M0.addListener(new di.h3(this, b0Var, pj0Var, 6));
                    this.M0.start();
                    i10 = i14;
                    i7 = i15;
                } else {
                    if (uxVar != nvVar) {
                        uxVar.setTranslationY(org.telegram.messenger.g0.L(36.0f) - i16);
                    }
                    i7 = i15;
                    if (view != null && i13 != i7) {
                        view.setTranslationY(0.0f);
                    }
                    if (pj0Var == pj0Var2) {
                        i10 = i14;
                        pj0Var.setPadding(i10, org.telegram.messenger.g0.L(36.0f), i10, org.telegram.messenger.g0.L(44.0f) + this.q2);
                    } else {
                        i10 = i14;
                        if (pj0Var == pj0Var3) {
                            pj0Var.setPadding(i10, org.telegram.messenger.g0.L(40.0f), i10, org.telegram.messenger.g0.L(44.0f) + this.q2);
                        } else {
                            if (pj0Var == pj0Var4) {
                                pj0Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(44.0f) + this.q2);
                            }
                            i10 = 0;
                        }
                    }
                    b0Var.h1(i10, i10);
                }
            }
            i13++;
            i11 = i7;
            i12 = i10;
        }
        int i17 = i12;
        if (z9) {
            return;
        }
        this.t1.i(i17);
    }

    public void setBlurredBackgroundDrawableFactory(dh.c cVar) {
        org.telegram.ui.ActionBar.f6 f6Var = this.Z1;
        xv xvVar = this.y;
        if (xvVar != null) {
            fh.g c10 = cVar.c(xvVar, null, false);
            c10.p(c8.g0.d(f6Var));
            c10.r(org.telegram.messenger.g0.L(18.0f));
            c10.q(org.telegram.messenger.g0.L(6.0f));
            xvVar.setBackground(c10);
        }
        ImageView imageView = this.E;
        if (imageView != null) {
            fh.g c11 = cVar.c(imageView, null, false);
            c11.p(c8.g0.d(f6Var));
            c11.r(org.telegram.messenger.g0.L(18.0f));
            c11.q(org.telegram.messenger.g0.L(6.0f));
            imageView.setBackground(c11);
        }
        qb0 qb0Var = this.x;
        if (qb0Var != null) {
            fh.g c12 = cVar.c(qb0Var, null, false);
            c12.p(c8.g0.d(f6Var));
            c12.r(org.telegram.messenger.g0.L(18.0f));
            c12.q(org.telegram.messenger.g0.L(6.0f));
            qb0Var.setBackground(c12);
        }
        ImageView imageView2 = this.D;
        if (imageView2 != null) {
            fh.g c13 = cVar.c(imageView2, null, false);
            c13.p(c8.g0.d(f6Var));
            c13.r(org.telegram.messenger.g0.L(18.0f));
            c13.q(org.telegram.messenger.g0.L(6.0f));
            imageView2.setBackground(c13);
        }
    }

    public void setBottomInset(int i7) {
        if (this.q2 != i7) {
            this.q2 = i7;
            j(i7, this.K);
            j(i7, this.M);
            j(org.telegram.messenger.g0.L(44.0f) + i7, this.P);
            j(org.telegram.messenger.g0.L(44.0f) + i7, this.D0);
            j(org.telegram.messenger.g0.L(44.0f) + i7, this.h0);
            FrameLayout frameLayout = this.s;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-i7);
            }
            R();
            invalidate();
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.J1 = chatFull;
        X(false);
    }

    public void setDelegate(ix ixVar) {
        this.t1 = ixVar;
    }

    public void setDragListener(nw nwVar) {
        this.O0 = nwVar;
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        tv tvVar = this.G0;
        if (tvVar != null) {
            tvVar.d.setEnabled(z9);
        }
        nv nvVar = this.o0;
        if (nvVar != null) {
            nvVar.d.setEnabled(z9);
        }
        iv ivVar = this.V;
        if (ivVar != null) {
            ivVar.d.setEnabled(z9);
        }
    }

    public void setForseMultiwindowLayout(boolean z9) {
        this.N1 = z9;
    }

    public void setShouldDrawBackground(boolean z9) {
        if (this.u0 != z9) {
            this.u0 = z9;
            updateColors();
        }
    }

    public void setShowing(boolean z9) {
        this.P0 = z9;
        Z();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        Z();
        R();
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        boolean z9 = getVisibility() != i7;
        super.setVisibility(i7);
        if (z9) {
            if (i7 != 8) {
                org.telegram.messenger.i6.s();
                this.R.F(false);
                ab.b0 b0Var = this.N2;
                int i10 = this.c1;
                if (b0Var == null) {
                    ab.b0 b0Var2 = (ab.b0) new org.telegram.messenger.ps(org.telegram.messenger.qs.f(i10), this).b;
                    b0Var2.c(org.telegram.messenger.qs.x0);
                    this.N2 = b0Var2;
                }
                if (this.y0 != null) {
                    if (!this.O2) {
                        this.O2 = true;
                        this.N2.c(org.telegram.messenger.qs.X0);
                    }
                    X(false);
                    D();
                }
                k(true);
                k(false);
                org.telegram.messenger.ui.b0(i10).V0(0, true, true, false);
                org.telegram.messenger.ui.b0(i10).V0(0, false, true, false);
                org.telegram.messenger.ui.b0(i10).V0(2, false, true, false);
            }
            jg.e1 e1Var = this.T0;
            if (e1Var != null) {
                e1Var.a();
            }
        }
    }

    public final void t(boolean z9) {
        s(-1L, z9);
    }

    public final void u(boolean z9) {
        yx yxVar;
        boolean z10 = this.T2;
        this.T2 = z9;
        if (!z10 || z9) {
            return;
        }
        int i7 = this.A1;
        if (i7 == 0) {
            qw qwVar = this.R;
            if (qwVar != null) {
                qwVar.F(false);
                return;
            }
            return;
        }
        if (i7 == 1) {
            mx mxVar = this.n0;
            if (mxVar != null) {
                mxVar.f();
                return;
            }
            return;
        }
        if (i7 != 2 || (yxVar = this.y0) == null) {
            return;
        }
        yxVar.f();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        try {
            S();
            ri.c cVar = this.l2;
            if (cVar != null) {
                cVar.a(z(org.telegram.ui.ActionBar.k6.d6));
            }
            qb0 qb0Var = this.x;
            if (qb0Var != null) {
                qb0Var.setIndicatorColor(i0.a.o(z(org.telegram.ui.ActionBar.k6.Df), 20));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final int v(float f10) {
        return i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kl, this.Z1), (int) (f10 * 255.0f));
    }

    public final v4.s w(int i7) {
        if (i7 == 0) {
            return this.E0;
        }
        if (i7 == 1) {
            return this.Q;
        }
        if (i7 == 2) {
            return this.i0;
        }
        throw new IllegalArgumentException(jg.g.j(i7, "Unexpected argument: "));
    }

    public final pj0 x(int i7) {
        if (i7 == 0) {
            return this.D0;
        }
        if (i7 == 1) {
            return this.P;
        }
        if (i7 == 2) {
            return this.h0;
        }
        throw new IllegalArgumentException(jg.g.j(i7, "Unexpected argument: "));
    }

    public final HorizontalScrollView y(int i7) {
        if (i7 == 0) {
            return this.B0;
        }
        if (i7 == 1) {
            return this.I;
        }
        if (i7 == 2) {
            return this.p0;
        }
        throw new IllegalArgumentException(jg.g.j(i7, "Unexpected argument: "));
    }

    public final int z(int i7) {
        org.telegram.ui.ActionBar.f6 f6Var = this.Z1;
        return f6Var != null ? f6Var.h(i7) : org.telegram.ui.ActionBar.k6.x0(null, i7, false);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // te.b
    public final void F(float f10, int i7) {
    }
}
