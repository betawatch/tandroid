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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public class ly extends FrameLayout implements org.telegram.ui.ActionBar.z5, te.b, org.telegram.messenger.is, rh.a {
    public static final /* synthetic */ int V2 = 0;
    public final gy A0;
    public final LongSparseArray A1;
    public final GradientDrawable A2;
    public final lv B0;
    public int B1;
    public int B2;
    public final zv C0;
    public final du C1;
    public ArrayList C2;
    public final aw D0;
    public final int D1;
    public int D2;
    public final ImageView E;
    public final vv E0;
    public final int[] E1;
    public long E2;
    public final ImageView F;
    public final wv F0;
    public int F1;
    public final te.a F2;
    public AnimatorSet G;
    public jy G0;
    public int G1;
    public ArrayList G2;
    public AnimatorSet H;
    public final yv H0;
    public int H1;
    public Drawable H2;
    public float I;
    public final ph.c I0;
    public int I1;
    public int I2;
    public final qw J;
    public boolean J0;
    public int J1;
    public int J2;
    public final lw K;
    public boolean K0;
    public TLRPC.ChatFull K1;
    public int K2;
    public final org.telegram.ui.w61 L;
    public boolean L0;
    public boolean L1;
    public int L2;
    public final ph.a M;
    public final fx M0;
    public int M1;
    public boolean M2;
    public final org.telegram.ui.w61 N;
    public AnimatorSet N0;
    public final bg.q0 N1;
    public xi.e N2;
    public final ph.a O;
    public final di.ub O0;
    public boolean O1;
    public xi.e O2;
    public final View P;
    public sw P0;
    public int P1;
    public boolean P2;
    public final yw Q;
    public boolean Q0;
    public boolean Q1;
    public AnimatorSet Q2;
    public final mw R;
    public final int[] R0;
    public boolean R1;
    public h2.m0 R2;
    public final vw S;
    public final ObjectAnimator[] S0;
    public ux S1;
    public final hv S2;
    public final lx T;
    public boolean T0;
    public float T1;
    public boolean T2;
    public jy U;
    public jg.d1 U0;
    public float U1;
    public boolean U2;
    public final ph.c V;
    public boolean V0;
    public float V1;
    public final nv W;
    public boolean W0;
    public float W1;
    public String[] X0;
    public float X1;
    public final Drawable[] Y0;
    public boolean Y1;
    public final Drawable[] Z0;
    public final org.telegram.ui.ActionBar.e2 Z1;
    public final te.a a;
    public AnimatorSet a0;
    public final Drawable[] a1;
    public final org.telegram.ui.ActionBar.e6 a2;
    public final te.a b;
    public final wi0 b0;
    public final String[] b1;
    public final org.telegram.ui.ActionBar.t5 b2;
    public int c;
    public final wi0 c0;
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
    public final zj g2;
    public final bw h;
    public final pv h0;
    public boolean h1;
    public final hw h2;
    public final qv i0;
    public TLRPC.TL_messages_stickerSet i1;
    public boolean i2;
    public final rx j0;
    public ArrayList j1;
    public final boolean j2;
    public final qx k0;
    public ArrayList k1;
    public final dh.g k2;
    public final tx l0;
    public ArrayList l1;
    public final zg l2;
    public final HashMap m0;
    public ArrayList m1;
    public final ui.c m2;
    public final FrameLayout n;
    public final lv n0;
    public final ArrayList n1;
    public final dh.c n2;
    public final qx o0;
    public final ArrayList o1;
    public final ri.q o2;
    public final sv p0;
    public final ArrayList p1;
    public boolean p2;
    public final tw q0;
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
    public mx u1;
    public int u2;
    public boolean v0;
    public long v1;
    public int v2;
    public final View w;
    public boolean w0;
    public boolean w1;
    public long w2;
    public final qb0 x;
    public boolean x0;
    public boolean x1;
    public boolean x2;
    public final cw y;
    public final tv y0;
    public final TLRPC.StickerSetCovered[] y1;
    public boolean y2;
    public final dy z0;
    public final LongSparseArray z1;
    public final Rect z2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0c91  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0cd1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0c62 A[Catch: Exception -> 0x0c78, TRY_LEAVE, TryCatch #3 {Exception -> 0x0c78, blocks: (B:156:0x0c4c, B:158:0x0c54, B:160:0x0c5a, B:161:0x0c5f, B:163:0x0c62), top: B:155:0x0c4c }] */
    /* JADX WARN: Type inference failed for: r10v27, types: [org.telegram.ui.Components.gj0, org.telegram.ui.Components.lv] */
    /* JADX WARN: Type inference failed for: r4v114, types: [org.telegram.ui.Components.gj0, org.telegram.ui.Components.lv] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ly(org.telegram.ui.ActionBar.e2 e2Var, boolean z10, boolean z11, boolean z12, Context context, boolean z13, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z14, final org.telegram.ui.ActionBar.e6 e6Var, boolean z15, boolean z16) {
        super(context);
        int i7;
        boolean z17;
        Field field;
        boolean z18;
        vw vwVar;
        String string;
        String str;
        er erVar = er.h;
        this.a = new te.a(0, this, erVar, 320L, false);
        this.b = new te.a(1, this, erVar, 320L, false);
        this.c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = new ArrayList();
        this.d0 = true;
        this.l0 = new tx(this);
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
        int i10 = org.telegram.messenger.m10.t0;
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
        this.g2 = new zj(this, 5);
        this.h2 = new hw(this);
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
        this.F2 = new te.a(0, new iv(this, 3), erVar, 380L, true);
        this.S2 = new hv(this, 1);
        this.T2 = false;
        this.v0 = z14;
        this.Z1 = e2Var;
        this.d2 = z10;
        this.a2 = e6Var;
        this.j2 = z16;
        ui.c cVar = new ui.c();
        this.m2 = cVar;
        cVar.a(z(org.telegram.ui.ActionBar.j6.d6));
        if (z15) {
            u(true);
        }
        i0.a.o(z(org.telegram.ui.ActionBar.j6.Nl), 30);
        int L = org.telegram.messenger.g0.L(50.0f);
        this.c1 = L;
        this.e0 = z13;
        this.Y0 = new Drawable[]{org.telegram.ui.ActionBar.j6.W(context, R.drawable.smiles_tab_smiles, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.j6.Jf), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.j6.Gf)), org.telegram.ui.ActionBar.j6.W(context, R.drawable.smiles_tab_gif, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.j6.Jf), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.j6.Gf)), org.telegram.ui.ActionBar.j6.W(context, R.drawable.smiles_tab_stickers, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.j6.Jf), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.j6.Gf))};
        org.telegram.ui.ActionBar.t5 W = org.telegram.ui.ActionBar.j6.W(context, R.drawable.msg_emoji_recent, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.j6.Ef), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.j6.Gf));
        org.telegram.ui.ActionBar.t5 W2 = org.telegram.ui.ActionBar.j6.W(context, R.drawable.emoji_tabs_faves, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.j6.Ef), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.j6.Gf));
        org.telegram.ui.ActionBar.t5 W3 = org.telegram.ui.ActionBar.j6.W(context, R.drawable.emoji_tabs_new3, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.j6.Ef), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.j6.Gf));
        org.telegram.ui.ActionBar.t5 W4 = org.telegram.ui.ActionBar.j6.W(context, R.drawable.emoji_tabs_new1, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.j6.Ef), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.j6.Gf));
        this.b2 = W4;
        int i11 = org.telegram.ui.ActionBar.j6.If;
        org.telegram.ui.ActionBar.t5 W5 = org.telegram.ui.ActionBar.j6.W(context, R.drawable.emoji_tabs_new2, z(i11), z(i11));
        this.c2 = W5;
        this.Z0 = new Drawable[]{W, W2, W3, new LayerDrawable(new Drawable[]{W4, W5})};
        this.a1 = new Drawable[]{org.telegram.ui.ActionBar.j6.W(context, R.drawable.msg_emoji_recent, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.j6.Ef), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.j6.Gf)), org.telegram.ui.ActionBar.j6.W(context, R.drawable.stickers_gifs_trending, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.j6.Ef), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.j6.Gf))};
        this.b1 = new String[]{org.telegram.messenger.hd.M0(2131751195, null), org.telegram.messenger.hd.M0(2131751194, null), org.telegram.messenger.hd.M0(2131751193, null), org.telegram.messenger.hd.M0(2131751192, null), org.telegram.messenger.hd.M0(2131751191, null), org.telegram.messenger.hd.M0(2131751190, null), org.telegram.messenger.hd.M0(2131751189, null), org.telegram.messenger.hd.M0(2131751188, null)};
        this.K1 = chatFull;
        Paint paint = new Paint(1);
        this.t1 = paint;
        paint.setColor(z(org.telegram.ui.ActionBar.j6.Sf));
        float L2 = org.telegram.messenger.g0.L(6.0f);
        bg.p0 p0Var = bg.t0.a;
        this.N1 = new bg.q0(L2);
        lw lwVar = new lw(this, context);
        this.K = lwVar;
        hy hyVar = new hy();
        hyVar.a = 0;
        hyVar.b = lwVar;
        arrayList.add(hyVar);
        if (z10) {
            org.telegram.messenger.si.b0(i10).B(5);
            org.telegram.messenger.si.b0(i10).w();
            this.f2 = new PorterDuffColorFilter(z(org.telegram.ui.ActionBar.j6.Fi), PorterDuff.Mode.SRC_IN);
        }
        yw ywVar = new yw(this, context);
        this.Q = ywVar;
        qVar.b(ywVar);
        v4.k kVar = new v4.k();
        kVar.c = 220L;
        kVar.e = 220L;
        kVar.f = 160L;
        kVar.g = 160L;
        kVar.i = er.g;
        ywVar.setItemAnimator(kVar);
        final int i12 = 0;
        ywVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.jv
            public final /* synthetic */ ly b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (i12) {
                    case 0:
                        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
                        ly lyVar = this.b;
                        yw ywVar2 = lyVar.Q;
                        lyVar.getMeasuredHeight();
                        return p10.r(motionEvent, ywVar2, null, lyVar.h2, e6Var);
                    case 1:
                        org.telegram.ui.ns p11 = org.telegram.ui.ns.p();
                        ly lyVar2 = this.b;
                        return p11.r(motionEvent, lyVar2.i0, lyVar2.n0, lyVar2.h2, e6Var);
                    default:
                        org.telegram.ui.ns p12 = org.telegram.ui.ns.p();
                        ly lyVar3 = this.b;
                        vv vvVar = lyVar3.E0;
                        lyVar3.getMeasuredHeight();
                        return p12.r(motionEvent, vvVar, lyVar3.B0, lyVar3.h2, e6Var);
                }
            }
        });
        ywVar.setOnItemLongClickListener(new iv(this, 1));
        ywVar.setInstantClick(true);
        mw mwVar = new mw(this);
        this.R = mwVar;
        ywVar.setLayoutManager(mwVar);
        ywVar.setTopGlowOffset(org.telegram.messenger.g0.L(38.0f));
        ywVar.setBottomGlowOffset(org.telegram.messenger.g0.L(36.0f));
        ywVar.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(44.0f));
        int i13 = org.telegram.ui.ActionBar.j6.zf;
        org.telegram.ui.ActionBar.q6.l(ywVar, 21, i13, e6Var);
        ywVar.setItemSelectorColorProvider(new e2(22));
        ywVar.setClipToPadding(false);
        mwVar.O = new nw(this);
        vw vwVar2 = new vw(this);
        this.S = vwVar2;
        ywVar.setAdapter(vwVar2);
        ywVar.i(new ai.h0(this, 4));
        this.T = new lx(this, context);
        lwVar.addView(ywVar, c8.ja.c(-1.0f, -1));
        wi0 wi0Var = new wi0(ywVar, mwVar);
        this.c0 = wi0Var;
        wi0Var.i = new ow(this);
        ywVar.setOnScrollListener(new pw(this));
        qw qwVar = new qw(this, context, e6Var, z10, e2Var != null ? new hv(this, 2) : null, z16);
        this.J = qwVar;
        if (z13) {
            nv nvVar = new nv(this, context);
            this.W = nvVar;
            lwVar.addView(nvVar, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1() + L));
            nvVar.d.setOnFocusChangeListener(new ov(this));
            ph.c cVar2 = new ph.c(context, e6Var);
            this.V = cVar2;
            cVar2.setVisibility(8);
            final int i14 = 0;
            cVar2.setOnBackClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kv
                public final /* synthetic */ ly b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            lx lxVar = this.b.T;
                            hx hxVar = lxVar.c;
                            int childCount = hxVar.getChildCount();
                            for (int i15 = 0; i15 < childCount; i15++) {
                                ((ph.b) hxVar.getChildAt(i15)).a(false, true);
                            }
                            lxVar.d = 0L;
                            lxVar.G.b.a(false, true);
                            lxVar.f();
                            break;
                        case 1:
                            gy gyVar = this.b.A0;
                            hx hxVar2 = gyVar.c;
                            int childCount2 = hxVar2.getChildCount();
                            for (int i16 = 0; i16 < childCount2; i16++) {
                                ((ph.b) hxVar2.getChildAt(i16)).a(false, true);
                            }
                            gyVar.d = 0L;
                            gyVar.R.a.a(false, true);
                            gyVar.f();
                            break;
                        case 2:
                            mx mxVar = this.b.u1;
                            if (mxVar != null) {
                                mxVar.w();
                                break;
                            }
                            break;
                        default:
                            ly lyVar = this.b;
                            int currentItem = lyVar.h.getCurrentItem();
                            yx yxVar = currentItem == 0 ? lyVar.W : currentItem == 1 ? lyVar.p0 : lyVar.H0;
                            if (yxVar != null) {
                                zp zpVar = yxVar.d;
                                zpVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                zpVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                zpVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
            lwVar.addView(cVar2, new FrameLayout.LayoutParams(-1, L));
        }
        if (Color.alpha(z(i13)) >= 255) {
            org.telegram.ui.ActionBar.q6.h(i13, qwVar, e6Var);
        }
        vwVar2.G(true);
        qwVar.p(getEmojipacks());
        lwVar.addView(qwVar, c8.ja.c(36.0f, -1));
        View view = new View(context);
        this.P = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i15 = org.telegram.ui.ActionBar.j6.Cf;
        org.telegram.ui.ActionBar.q6.h(i15, view, e6Var);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(36.0f);
        lwVar.addView(view, layoutParams);
        ph.a aVar = new ph.a(context, e6Var);
        this.M = aVar;
        org.telegram.ui.w61 w61Var = new org.telegram.ui.w61(context, e6Var);
        this.L = w61Var;
        w61Var.setVisibility(8);
        w61Var.addView(aVar, c8.ja.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
        lwVar.addView(w61Var, c8.ja.e(-1, -2, 80));
        if (z11) {
            vk0 vk0Var = vk0.b;
            if (z12) {
                pv pvVar = new pv(this, context);
                this.h0 = pvVar;
                hy hyVar2 = new hy();
                hyVar2.a = 1;
                hyVar2.b = pvVar;
                this.d.add(hyVar2);
                qv qvVar = new qv(this, context);
                this.i0 = qvVar;
                qVar.b(qvVar);
                qvVar.setClipToPadding(false);
                rx rxVar = new rx(this);
                this.j0 = rxVar;
                qvVar.setLayoutManager(rxVar);
                qvVar.i(new rv(this));
                qvVar.setPadding(0, L, 0, org.telegram.messenger.g0.L(44.0f) + this.r2);
                ((v4.g1) qvVar.getItemAnimator()).m = false;
                final int i16 = 1;
                qx qxVar = new qx(this, context, true, ConnectionsManager.DEFAULT_DATACENTER_ID);
                this.o0 = qxVar;
                qvVar.setAdapter(qxVar);
                this.k0 = new qx(this, context, false, 0);
                qvVar.setOnScrollListener(new ky(this, 2));
                qvVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.jv
                    public final /* synthetic */ ly b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (i16) {
                            case 0:
                                org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
                                ly lyVar = this.b;
                                yw ywVar2 = lyVar.Q;
                                lyVar.getMeasuredHeight();
                                return p10.r(motionEvent, ywVar2, null, lyVar.h2, e6Var);
                            case 1:
                                org.telegram.ui.ns p11 = org.telegram.ui.ns.p();
                                ly lyVar2 = this.b;
                                return p11.r(motionEvent, lyVar2.i0, lyVar2.n0, lyVar2.h2, e6Var);
                            default:
                                org.telegram.ui.ns p12 = org.telegram.ui.ns.p();
                                ly lyVar3 = this.b;
                                vv vvVar = lyVar3.E0;
                                lyVar3.getMeasuredHeight();
                                return p12.r(motionEvent, vvVar, lyVar3.B0, lyVar3.h2, e6Var);
                        }
                    }
                });
                final int i17 = 0;
                ?? r10 = new gj0(this) { // from class: org.telegram.ui.Components.lv
                    public final /* synthetic */ ly b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.ui.Components.gj0
                    public final void b(int i18, View view2) {
                        switch (i17) {
                            case 0:
                                ly lyVar = this.b;
                                qv qvVar2 = lyVar.i0;
                                qx qxVar2 = lyVar.k0;
                                qx qxVar3 = lyVar.o0;
                                if (lyVar.u1 != null) {
                                    qxVar3.getClass();
                                    ArrayList arrayList2 = qxVar3.y;
                                    if (qvVar2.getAdapter() != qxVar3) {
                                        if (qvVar2.getAdapter() == qxVar2 && i18 >= 0 && i18 < qxVar2.y.size()) {
                                            lyVar.u1.v(view2, qxVar2.y.get(i18), qxVar2.x, qxVar2.n, true, 0, 0);
                                            lyVar.X();
                                            break;
                                        }
                                    } else if (i18 >= 0) {
                                        int i19 = qxVar3.I;
                                        if (i18 >= i19) {
                                            int i20 = i19 > 0 ? (i18 - i19) - 1 : i18;
                                            if (i20 >= 0 && i20 < arrayList2.size()) {
                                                lyVar.u1.v(view2, arrayList2.get(i20), null, qxVar3.n, true, 0, 0);
                                                break;
                                            }
                                        } else {
                                            lyVar.u1.v(view2, lyVar.j1.get(i18), null, "gif", true, 0, 0);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                ly lyVar2 = this.b;
                                v4.h0 adapter = lyVar2.E0.getAdapter();
                                gy gyVar = lyVar2.A0;
                                String str2 = adapter == gyVar ? gyVar.O : null;
                                if (view2 instanceof org.telegram.ui.Cells.y7) {
                                    org.telegram.ui.Cells.y7 y7Var = (org.telegram.ui.Cells.y7) view2;
                                    if (y7Var.getSticker() != null && org.telegram.messenger.gj.X3(y7Var.getSticker()) && !org.telegram.messenger.m10.i(org.telegram.messenger.c.a(lyVar2.d1).a).q()) {
                                        org.telegram.ui.ns.p().x(y7Var);
                                        break;
                                    } else {
                                        org.telegram.ui.ns.p().t();
                                        if (!y7Var.r) {
                                            y7Var.r = true;
                                            y7Var.n = 0.5f;
                                            y7Var.y = 0L;
                                            org.telegram.ui.Cells.x7 x7Var = y7Var.a;
                                            x7Var.setAlpha(0.5f * y7Var.I);
                                            x7Var.invalidate();
                                            y7Var.s = System.currentTimeMillis();
                                            y7Var.invalidate();
                                            lyVar2.u1.m(y7Var, y7Var.getSticker(), str2, y7Var.getParentObject(), y7Var.getSendAnimationData(), true, 0);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                };
                this.n0 = r10;
                qvVar.setOnItemClickListener((gj0) r10);
                pvVar.addView(qvVar, c8.ja.c(-1.0f, -1));
                sv svVar = new sv(this, context);
                this.p0 = svVar;
                pvVar.addView(svVar, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1() + L));
                tw twVar = new tw(this, context, e6Var);
                this.q0 = twVar;
                twVar.setType(vk0Var);
                twVar.setUnderlineHeight(org.telegram.messenger.g0.f1());
                twVar.setIndicatorColor(z(i11));
                twVar.setUnderlineColor(z(i15));
                org.telegram.ui.ActionBar.q6.h(i13, twVar, e6Var);
                W();
                twVar.setDelegate(new iv(this, 2));
                qxVar.F("", "", true, true, true);
            }
            tv tvVar = new tv(this, context, z14);
            this.y0 = tvVar;
            org.telegram.messenger.si.b0(this.d1).B(0);
            org.telegram.messenger.si.b0(this.d1).x();
            vv vvVar = new vv(this, context);
            this.E0 = vvVar;
            this.o2.b(vvVar);
            wv wvVar = new wv(this);
            this.F0 = wvVar;
            vvVar.setLayoutManager(wvVar);
            wvVar.O = new xv(this);
            vvVar.setPadding(0, org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(44.0f));
            vvVar.setClipToPadding(false);
            hy hyVar3 = new hy();
            hyVar3.a = 2;
            hyVar3.b = tvVar;
            this.d.add(hyVar3);
            this.A0 = new gy(this, context);
            dy dyVar = new dy(this, context);
            this.z0 = dyVar;
            vvVar.setAdapter(dyVar);
            final int i18 = 2;
            vvVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.jv
                public final /* synthetic */ ly b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (i18) {
                        case 0:
                            org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
                            ly lyVar = this.b;
                            yw ywVar2 = lyVar.Q;
                            lyVar.getMeasuredHeight();
                            return p10.r(motionEvent, ywVar2, null, lyVar.h2, e6Var);
                        case 1:
                            org.telegram.ui.ns p11 = org.telegram.ui.ns.p();
                            ly lyVar2 = this.b;
                            return p11.r(motionEvent, lyVar2.i0, lyVar2.n0, lyVar2.h2, e6Var);
                        default:
                            org.telegram.ui.ns p12 = org.telegram.ui.ns.p();
                            ly lyVar3 = this.b;
                            vv vvVar2 = lyVar3.E0;
                            lyVar3.getMeasuredHeight();
                            return p12.r(motionEvent, vvVar2, lyVar3.B0, lyVar3.h2, e6Var);
                    }
                }
            });
            final int i19 = 1;
            ?? r42 = new gj0(this) { // from class: org.telegram.ui.Components.lv
                public final /* synthetic */ ly b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.Components.gj0
                public final void b(int i182, View view2) {
                    switch (i19) {
                        case 0:
                            ly lyVar = this.b;
                            qv qvVar2 = lyVar.i0;
                            qx qxVar2 = lyVar.k0;
                            qx qxVar3 = lyVar.o0;
                            if (lyVar.u1 != null) {
                                qxVar3.getClass();
                                ArrayList arrayList2 = qxVar3.y;
                                if (qvVar2.getAdapter() != qxVar3) {
                                    if (qvVar2.getAdapter() == qxVar2 && i182 >= 0 && i182 < qxVar2.y.size()) {
                                        lyVar.u1.v(view2, qxVar2.y.get(i182), qxVar2.x, qxVar2.n, true, 0, 0);
                                        lyVar.X();
                                        break;
                                    }
                                } else if (i182 >= 0) {
                                    int i192 = qxVar3.I;
                                    if (i182 >= i192) {
                                        int i20 = i192 > 0 ? (i182 - i192) - 1 : i182;
                                        if (i20 >= 0 && i20 < arrayList2.size()) {
                                            lyVar.u1.v(view2, arrayList2.get(i20), null, qxVar3.n, true, 0, 0);
                                            break;
                                        }
                                    } else {
                                        lyVar.u1.v(view2, lyVar.j1.get(i182), null, "gif", true, 0, 0);
                                        break;
                                    }
                                }
                            }
                            break;
                        default:
                            ly lyVar2 = this.b;
                            v4.h0 adapter = lyVar2.E0.getAdapter();
                            gy gyVar = lyVar2.A0;
                            String str2 = adapter == gyVar ? gyVar.O : null;
                            if (view2 instanceof org.telegram.ui.Cells.y7) {
                                org.telegram.ui.Cells.y7 y7Var = (org.telegram.ui.Cells.y7) view2;
                                if (y7Var.getSticker() != null && org.telegram.messenger.gj.X3(y7Var.getSticker()) && !org.telegram.messenger.m10.i(org.telegram.messenger.c.a(lyVar2.d1).a).q()) {
                                    org.telegram.ui.ns.p().x(y7Var);
                                    break;
                                } else {
                                    org.telegram.ui.ns.p().t();
                                    if (!y7Var.r) {
                                        y7Var.r = true;
                                        y7Var.n = 0.5f;
                                        y7Var.y = 0L;
                                        org.telegram.ui.Cells.x7 x7Var = y7Var.a;
                                        x7Var.setAlpha(0.5f * y7Var.I);
                                        x7Var.invalidate();
                                        y7Var.s = System.currentTimeMillis();
                                        y7Var.invalidate();
                                        lyVar2.u1.m(y7Var, y7Var.getSticker(), str2, y7Var.getParentObject(), y7Var.getSendAnimationData(), true, 0);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            };
            this.B0 = r42;
            vvVar.setOnItemClickListener((gj0) r42);
            org.telegram.ui.ActionBar.q6.l(vvVar, 21, i13, e6Var);
            tvVar.addView(vvVar);
            this.b0 = new wi0(vvVar, wvVar);
            yv yvVar = new yv(this, context);
            this.H0 = yvVar;
            tvVar.addView(yvVar, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1() + L));
            ph.c cVar3 = new ph.c(context, e6Var);
            this.I0 = cVar3;
            cVar3.setVisibility(8);
            final int i20 = 1;
            cVar3.setOnBackClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kv
                public final /* synthetic */ ly b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i20) {
                        case 0:
                            lx lxVar = this.b.T;
                            hx hxVar = lxVar.c;
                            int childCount = hxVar.getChildCount();
                            for (int i152 = 0; i152 < childCount; i152++) {
                                ((ph.b) hxVar.getChildAt(i152)).a(false, true);
                            }
                            lxVar.d = 0L;
                            lxVar.G.b.a(false, true);
                            lxVar.f();
                            break;
                        case 1:
                            gy gyVar = this.b.A0;
                            hx hxVar2 = gyVar.c;
                            int childCount2 = hxVar2.getChildCount();
                            for (int i162 = 0; i162 < childCount2; i162++) {
                                ((ph.b) hxVar2.getChildAt(i162)).a(false, true);
                            }
                            gyVar.d = 0L;
                            gyVar.R.a.a(false, true);
                            gyVar.f();
                            break;
                        case 2:
                            mx mxVar = this.b.u1;
                            if (mxVar != null) {
                                mxVar.w();
                                break;
                            }
                            break;
                        default:
                            ly lyVar = this.b;
                            int currentItem = lyVar.h.getCurrentItem();
                            yx yxVar = currentItem == 0 ? lyVar.W : currentItem == 1 ? lyVar.p0 : lyVar.H0;
                            if (yxVar != null) {
                                zp zpVar = yxVar.d;
                                zpVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                zpVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                zpVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
            tvVar.addView(cVar3, new FrameLayout.LayoutParams(-1, L));
            z17 = z14;
            i7 = 80;
            zv zvVar = new zv(this, context, e6Var, e2Var, z17);
            this.C0 = zvVar;
            zvVar.setDragEnabled(true);
            zvVar.setWillNotDraw(false);
            zvVar.setType(vk0Var);
            zvVar.setUnderlineHeight(vvVar.canScrollVertically(-1) ? org.telegram.messenger.g0.f1() : 0);
            zvVar.setIndicatorColor(z(i11));
            zvVar.setUnderlineColor(z(i15));
            if (viewGroup == null || !z17) {
                tvVar.addView(zvVar, c8.ja.e(-1, 36, 51));
            } else {
                aw awVar = new aw(this, context);
                this.D0 = awVar;
                awVar.addView(zvVar, c8.ja.e(-1, 36, 51));
                viewGroup.addView(awVar, c8.ja.c(-2.0f, -1));
            }
            Y(true);
            zvVar.setDelegate(new iv(this, 4));
            vvVar.setOnScrollListener(new ky(this, 0));
            ph.a aVar2 = new ph.a(context, e6Var);
            this.O = aVar2;
            org.telegram.ui.w61 w61Var2 = new org.telegram.ui.w61(context, e6Var);
            this.N = w61Var2;
            w61Var2.setVisibility(8);
            w61Var2.addView(aVar2, c8.ja.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
            tvVar.addView(w61Var2, c8.ja.e(-1, -2, 80));
        } else {
            i7 = 80;
            z17 = z14;
        }
        this.e.clear();
        this.e.addAll(this.d);
        bw bwVar = new bw(this, context);
        this.h = bwVar;
        ri.q qVar2 = this.o2;
        qVar2.getClass();
        bwVar.b(new ri.i(qVar2, bwVar));
        bwVar.setOverScrollMode(2);
        fx fxVar = new fx(this);
        this.M0 = fxVar;
        bwVar.setAdapter(fxVar);
        cw cwVar = new cw(this, context);
        this.y = cwVar;
        cwVar.setHapticFeedbackEnabled(true);
        cwVar.setImageResource(R.drawable.smiles_tab_clear);
        int v = z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.j6.Jf);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        cwVar.setColorFilter(new PorterDuffColorFilter(v, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        cwVar.setScaleType(scaleType);
        cwVar.setContentDescription(org.telegram.messenger.hd.M0(2131754920, null));
        cwVar.setFocusable(true);
        cwVar.setOnClickListener(new dw());
        c8.na.a(cwVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        if (z13) {
            addView(frameLayout, c8.ja.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, (org.telegram.messenger.g0.f1() / org.telegram.messenger.g0.p) + 40.0f));
        } else {
            addView(frameLayout, c8.ja.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.s = frameLayout2;
        addView(frameLayout2, c8.ja.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.n = frameLayout3;
        View view2 = new View(context);
        this.w = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.L(40.0f), 83));
        if (z13) {
            addView(frameLayout3, c8.ja.e(-1, 48, i7));
            frameLayout3.addView(cwVar, c8.ja.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
            if (z11) {
                ImageView imageView = new ImageView(context);
                this.E = imageView;
                imageView.setImageResource(R.drawable.smiles_tab_settings);
                imageView.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.j6.Jf), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(org.telegram.messenger.hd.M0(2131745495, null));
                c8.na.a(imageView);
                frameLayout3.addView(imageView, c8.ja.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
                final int i21 = 2;
                imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kv
                    public final /* synthetic */ ly b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i21) {
                            case 0:
                                lx lxVar = this.b.T;
                                hx hxVar = lxVar.c;
                                int childCount = hxVar.getChildCount();
                                for (int i152 = 0; i152 < childCount; i152++) {
                                    ((ph.b) hxVar.getChildAt(i152)).a(false, true);
                                }
                                lxVar.d = 0L;
                                lxVar.G.b.a(false, true);
                                lxVar.f();
                                break;
                            case 1:
                                gy gyVar = this.b.A0;
                                hx hxVar2 = gyVar.c;
                                int childCount2 = hxVar2.getChildCount();
                                for (int i162 = 0; i162 < childCount2; i162++) {
                                    ((ph.b) hxVar2.getChildAt(i162)).a(false, true);
                                }
                                gyVar.d = 0L;
                                gyVar.R.a.a(false, true);
                                gyVar.f();
                                break;
                            case 2:
                                mx mxVar = this.b.u1;
                                if (mxVar != null) {
                                    mxVar.w();
                                    break;
                                }
                                break;
                            default:
                                ly lyVar = this.b;
                                int currentItem = lyVar.h.getCurrentItem();
                                yx yxVar = currentItem == 0 ? lyVar.W : currentItem == 1 ? lyVar.p0 : lyVar.H0;
                                if (yxVar != null) {
                                    zp zpVar = yxVar.d;
                                    zpVar.requestFocus();
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                    zpVar.onTouchEvent(obtain);
                                    obtain.recycle();
                                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                    zpVar.onTouchEvent(obtain2);
                                    obtain2.recycle();
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
            qb0 qb0Var = new qb0(context, e6Var);
            this.x = qb0Var;
            qb0Var.setViewPager(bwVar);
            qb0Var.setShouldExpand(false);
            qb0Var.setIndicatorHeight(org.telegram.messenger.g0.L(3.0f));
            qb0Var.setIndicatorColor(i0.a.o(z(org.telegram.ui.ActionBar.j6.Gf), 20));
            qb0Var.setUnderlineHeight(0);
            qb0Var.setTabPaddingLeftRight(org.telegram.messenger.g0.L(11.0f));
            qb0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(11.0f));
            frameLayout3.addView(qb0Var, c8.ja.e(-2, 48, 81));
            qb0Var.setOnPageChangeListener(new ew(this, z17));
            ImageView imageView2 = new ImageView(context);
            this.F = imageView2;
            imageView2.setImageResource(R.drawable.smiles_tab_search);
            imageView2.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.j6.Jf), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(org.telegram.messenger.hd.M0(2131745836, null));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, c8.ja.d(48, 48.0f, 83, 2.0f, 0.0f, 2.0f, 0.0f));
            final int i22 = 3;
            imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kv
                public final /* synthetic */ ly b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view22) {
                    switch (i22) {
                        case 0:
                            lx lxVar = this.b.T;
                            hx hxVar = lxVar.c;
                            int childCount = hxVar.getChildCount();
                            for (int i152 = 0; i152 < childCount; i152++) {
                                ((ph.b) hxVar.getChildAt(i152)).a(false, true);
                            }
                            lxVar.d = 0L;
                            lxVar.G.b.a(false, true);
                            lxVar.f();
                            break;
                        case 1:
                            gy gyVar = this.b.A0;
                            hx hxVar2 = gyVar.c;
                            int childCount2 = hxVar2.getChildCount();
                            for (int i162 = 0; i162 < childCount2; i162++) {
                                ((ph.b) hxVar2.getChildAt(i162)).a(false, true);
                            }
                            gyVar.d = 0L;
                            gyVar.R.a.a(false, true);
                            gyVar.f();
                            break;
                        case 2:
                            mx mxVar = this.b.u1;
                            if (mxVar != null) {
                                mxVar.w();
                                break;
                            }
                            break;
                        default:
                            ly lyVar = this.b;
                            int currentItem = lyVar.h.getCurrentItem();
                            yx yxVar = currentItem == 0 ? lyVar.W : currentItem == 1 ? lyVar.p0 : lyVar.H0;
                            if (yxVar != null) {
                                zp zpVar = yxVar.d;
                                zpVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                zpVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                zpVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            addView(frameLayout3, c8.ja.d(56, 48.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 80, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.j6.j0(org.telegram.messenger.g0.L(56.0f), z(i13), z(i13));
            c8.na.a(cwVar);
            cwVar.setPadding(0, 0, org.telegram.messenger.g0.L(2.0f), 0);
            cwVar.setBackground(j02);
            cwVar.setContentDescription(org.telegram.messenger.hd.M0(2131754920, null));
            cwVar.setFocusable(true);
            frameLayout3.addView(cwVar, c8.ja.d(48, 48.0f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
            view2.setVisibility(8);
        }
        addView(bwVar, 0, c8.ja.e(-1, -1, 51));
        di.ub ubVar = new di.ub(context, 24);
        this.O0 = ubVar;
        int L3 = org.telegram.messenger.g0.L(6.0f);
        int i23 = org.telegram.ui.ActionBar.j6.hg;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(L3, z(i23));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i23);
        ubVar.setBackground(d02);
        org.telegram.ui.ActionBar.q6.j(ubVar, d02, M, null, e6Var);
        org.telegram.ui.ActionBar.q6.U(ubVar, org.telegram.ui.ActionBar.j6.gg, e6Var);
        ubVar.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(7.0f));
        char c10 = 16;
        ubVar.setGravity(16);
        ubVar.setTextSize(1, 14.0f);
        ubVar.setVisibility(4);
        addView(ubVar, c8.ja.d(-2, -2.0f, 81, 5.0f, 0.0f, 5.0f, 53.0f));
        this.D1 = org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 40.0f : 32.0f);
        Field field2 = du.f;
        du duVar = new du(new cu(context, e6Var));
        if (du.f == null) {
            try {
                field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    field.setAccessible(true);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                field = null;
            }
            du.f = field;
        }
        Field field3 = du.f;
        if (field3 != null) {
            try {
                duVar.a = (ViewTreeObserver.OnScrollChangedListener) field3.get(duVar);
                du.f.set(duVar, du.g);
            } catch (Exception unused3) {
                duVar.a = null;
            }
        }
        this.C1 = duVar;
        duVar.c.setOnSelectionUpdateListener(new d(this, 10));
        this.B1 = org.telegram.messenger.np.d1().getInt("selected_page", 0);
        String str2 = "";
        HashMap hashMap = org.telegram.messenger.j6.h;
        if (!org.telegram.messenger.j6.k) {
            org.telegram.messenger.j6.k = true;
            SharedPreferences d12 = org.telegram.messenger.np.d1();
            try {
                hashMap.clear();
                if (d12.contains("emojis")) {
                    try {
                        String string2 = d12.getString("emojis", "");
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
                                        string = d12.getString("color", str2);
                                        if (string != null) {
                                            while (r3 < r0.length) {
                                            }
                                        }
                                        vwVar = vwVar2;
                                        z18 = true;
                                        vwVar.F(false);
                                        J(z18, z11, z12, false);
                                        if (Build.VERSION.SDK_INT < 31) {
                                        }
                                        this.l2 = new zg(this, 1);
                                        setBlurredBackgroundDrawableFactory(this.n2);
                                        this.o2.i(this);
                                        this.o2.a = new iv(this, 0);
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
                        d12.edit().remove("emojis").commit();
                        org.telegram.messenger.j6.r();
                        str2 = str;
                    } catch (Exception e11) {
                        e = e11;
                    }
                } else {
                    String string3 = d12.getString("emojis2", "");
                    if (string3 != null && string3.length() > 0) {
                        for (String str3 : string3.split(",")) {
                            String[] split3 = str3.split("=");
                            hashMap.put(split3[0], Utilities.z(split3[1]));
                        }
                    }
                }
                if (hashMap.isEmpty() && !d12.getBoolean("filled_default", false)) {
                    int i26 = 0;
                    while (true) {
                        String[] strArr = org.telegram.messenger.j6.o;
                        if (i26 >= strArr.length) {
                            break;
                        }
                        hashMap.put(strArr[i26], Integer.valueOf(strArr.length - i26));
                        i26++;
                    }
                    d12.edit().putBoolean("filled_default", true).commit();
                    org.telegram.messenger.j6.r();
                }
                org.telegram.messenger.j6.s();
            } catch (Exception e12) {
                e = e12;
            }
            try {
                string = d12.getString("color", str2);
                if (string != null && string.length() > 0) {
                    for (String str4 : string.split(",")) {
                        String[] split4 = str4.split("=");
                        org.telegram.messenger.j6.j.put(split4[0], split4[1]);
                    }
                }
            } catch (Exception e13) {
                z18 = true;
                org.telegram.messenger.a8.g(e13, true);
                vwVar = vwVar2;
            }
        }
        vwVar = vwVar2;
        z18 = true;
        vwVar.F(false);
        J(z18, z11, z12, false);
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
            int L4 = org.telegram.messenger.g0.L(org.telegram.messenger.qc.e(262144) ? 8.0f : 48.0f);
            cVar4.d = L4;
            cVar4.e = L4;
            cVar4.j = this.o2;
        } else {
            dh.c cVar5 = new dh.c(cVar, cVar, cVar);
            this.n2 = cVar5;
            cVar5.j = this.o2;
            this.k2 = null;
        }
        this.l2 = new zg(this, 1);
        setBlurredBackgroundDrawableFactory(this.n2);
        this.o2.i(this);
        this.o2.a = new iv(this, 0);
    }

    public static void a(ly lyVar, boolean z10) {
        qv qvVar = lyVar.i0;
        if (qvVar == null) {
            return;
        }
        int childCount = qvVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = qvVar.getChildAt(i7);
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

    public static void d(ly lyVar, ux uxVar, String str) {
        String str2;
        mx mxVar;
        org.telegram.ui.ActionBar.e2 e2Var = lyVar.Z1;
        int i7 = lyVar.d1;
        ArrayList arrayList = lyVar.r1;
        if (uxVar == null) {
            return;
        }
        if (uxVar.getSpan() == null) {
            lyVar.E2 = SystemClock.elapsedRealtime();
            lyVar.N(true);
            String str3 = str != null ? str : (String) uxVar.getTag();
            new SpannableStringBuilder().append((CharSequence) str3);
            if (str != null) {
                mx mxVar2 = lyVar.u1;
                if (mxVar2 != null) {
                    mxVar2.l(org.telegram.messenger.j6.c(str));
                    return;
                }
                return;
            }
            if (!uxVar.c && (str2 = (String) org.telegram.messenger.j6.j.get(str3)) != null) {
                str3 = g(str3, str2);
            }
            lyVar.h(str3);
            mx mxVar3 = lyVar.u1;
            if (mxVar3 != null) {
                mxVar3.l(org.telegram.messenger.j6.c(str3));
                return;
            }
            return;
        }
        if (lyVar.u1 != null) {
            long j3 = uxVar.getSpan().documentId;
            TLRPC.Document document = uxVar.getSpan().document;
            zw zwVar = uxVar.e;
            boolean z10 = zwVar != null && zwVar.i;
            if (document == null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    zw zwVar2 = (zw) arrayList.get(i10);
                    int i11 = 0;
                    while (true) {
                        ArrayList arrayList2 = zwVar2.c;
                        if (arrayList2 != null && i11 < arrayList2.size()) {
                            if (((TLRPC.Document) zwVar2.c.get(i11)).id == j3) {
                                document = (TLRPC.Document) zwVar2.c.get(i11);
                                break;
                            }
                            i11++;
                        }
                    }
                }
            }
            if (document == null) {
                document = g5.e(i7, j3);
            }
            TLRPC.Document document2 = document;
            String U = document2 != null ? org.telegram.messenger.gj.U(document2) : null;
            if (org.telegram.messenger.gj.m3(document2) || org.telegram.messenger.m10.i(i7).q() || (((mxVar = lyVar.u1) != null && mxVar.g()) || lyVar.V0 || z10)) {
                lyVar.E2 = SystemClock.elapsedRealtime();
                lyVar.N(true);
                lyVar.h("animated_" + j3);
                lyVar.u1.x(j3, document2, U, uxVar.c);
                return;
            }
            lyVar.N(false);
            cc a02 = e2Var != null ? cc.a0(e2Var) : new cc(lyVar.r, lyVar.a2);
            if (lyVar.i2 || e2Var == null) {
                a02.r(document2, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131743864, null)), org.telegram.messenger.hd.M0(2131747033, null), new hv(lyVar, 3)).j();
            } else {
                a02.K(R.raw.saved_messages, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131743863, null)), org.telegram.messenger.hd.M0(2131747817, null), new hv(lyVar, 4)).j();
            }
            lyVar.i2 = !lyVar.i2;
        }
    }

    public static void e(ly lyVar, int i7, int i10) {
        v4.e1 K;
        int[] iArr = lyVar.R0;
        if (i7 == 1) {
            lyVar.n(i10, lyVar.Q);
            return;
        }
        mx mxVar = lyVar.u1;
        if ((mxVar == null || !mxVar.z()) && !lyVar.K0) {
            uj0 x10 = lyVar.x(i7);
            if (i10 <= 0 || x10 == null || x10.getVisibility() != 0 || (K = x10.K(0)) == null || K.a.getTop() + lyVar.c1 < x10.getPaddingTop()) {
                int i11 = iArr[i7] - i10;
                iArr[i7] = i11;
                if (i11 > 0) {
                    iArr[i7] = 0;
                } else if (i11 < (-org.telegram.messenger.g0.L(288.0f))) {
                    iArr[i7] = -org.telegram.messenger.g0.L(288.0f);
                }
                if (i7 == 0) {
                    lyVar.Z();
                } else {
                    lyVar.y(i7).setTranslationY(Math.max(-org.telegram.messenger.g0.L(48.0f), iArr[i7]));
                }
            }
        }
    }

    public static void f(ly lyVar, boolean z10) {
        int N0;
        rx rxVar = lyVar.j0;
        sv svVar = lyVar.p0;
        qv qvVar = lyVar.i0;
        if (qvVar != null && (qvVar.getAdapter() instanceof qx)) {
            qx qxVar = (qx) qvVar.getAdapter();
            if (!qxVar.s && qxVar.h == 0 && !qxVar.y.isEmpty() && (N0 = rxVar.N0()) != -1 && N0 > rxVar.B() - 5) {
                String str = qxVar.x;
                String str2 = qxVar.r;
                boolean z11 = qxVar.w;
                qxVar.F(str, str2, true, z11, z11);
            }
        }
        mx mxVar = lyVar.u1;
        if (mxVar == null || !mxVar.z()) {
            if (svVar == null || qvVar == null) {
                return;
            }
            svVar.a.a(true, !z10);
            return;
        }
        v4.e1 K = qvVar.K(0);
        if (K == null) {
            yx.a(svVar, true, !z10);
        } else {
            yx.a(svVar, K.a.getTop() < qvVar.getPaddingTop(), !z10);
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
        String v = r.b.v(str, str2);
        if (str3 != null) {
            v = r.b.v(v, str3);
        }
        return z10 ? r.b.v(v, "\u200d➡") : v;
    }

    public static void j(int i7, View view) {
        if (view == null) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i7);
    }

    public final void A() {
        yv yvVar = this.H0;
        if (yvVar != null) {
            yvVar.b();
        }
        sv svVar = this.p0;
        if (svVar != null) {
            svVar.b();
        }
        nv nvVar = this.W;
        if (nvVar != null) {
            nvVar.b();
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
        xx xxVar;
        if (this.B1 != 0 && this.x1) {
            this.B1 = 0;
        }
        if (this.B1 == 0 && this.w1) {
            this.B1 = 1;
        }
        int i7 = this.B1;
        bw bwVar = this.h;
        if (i7 == 0 || z10 || this.e.size() == 1) {
            M(true, false);
            R(false, false);
            if (bwVar.getCurrentItem() != 0) {
                bwVar.x(0, !z10);
            }
            if (z11) {
                org.telegram.messenger.g0.i3(new hv(this, 5), 350L);
            }
        } else {
            int i10 = this.B1;
            if (i10 == 1) {
                M(false, false);
                R(this.v0 || this.w0, false);
                if (bwVar.getCurrentItem() != 2) {
                    bwVar.x(2, false);
                }
                zv zvVar = this.C0;
                if (zvVar != null) {
                    this.T0 = true;
                    int i11 = this.H1;
                    if (i11 >= 0) {
                        zvVar.m(i11);
                    } else {
                        int i12 = this.G1;
                        if (i12 >= 0) {
                            zvVar.m(i12);
                        } else {
                            zvVar.m(this.F1);
                        }
                    }
                    this.T0 = false;
                    this.F0.h1(0, 0);
                }
            } else if (i10 == 2) {
                M(false, false);
                R(false, false);
                if (bwVar.getCurrentItem() != 1) {
                    bwVar.x(1, false);
                }
                tw twVar = this.q0;
                if (twVar != null) {
                    twVar.m(0);
                }
                sv svVar = this.p0;
                if (svVar != null && (xxVar = svVar.r) != null) {
                    xxVar.I1(null);
                }
            }
        }
        N(true);
    }

    public final void D() {
        dy dyVar = this.z0;
        if (dyVar != null) {
            dyVar.f();
        }
        gy gyVar = this.A0;
        if (gyVar != null) {
            gyVar.f();
        }
        if (org.telegram.ui.ns.p().E) {
            org.telegram.ui.ns.p().m();
        }
        org.telegram.ui.ns.p().t();
    }

    public final void F(int i7) {
        mx mxVar = this.u1;
        if ((mxVar == null || !mxVar.z()) && i7 != 0) {
            HorizontalScrollView y10 = y(i7);
            this.R0[i7] = 0;
            y10.setTranslationY(0);
        }
    }

    @Override // te.b
    public final void G(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            q(false);
            float f12 = 1.0f - this.a.e;
            yv yvVar = this.H0;
            yvVar.setAlpha(f12);
            yvVar.setVisibility(f12 > 0.0f ? 0 : 4);
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
            nv nvVar = this.W;
            nvVar.setAlpha(f14);
            nvVar.setVisibility(f14 > 0.0f ? 0 : 4);
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

    public final void H(int i7, int i10) {
        mw mwVar = this.R;
        View m10 = mwVar.m(i7);
        int L0 = mwVar.L0();
        if ((m10 == null && Math.abs(i7 - L0) > mwVar.J * 9.0f) || !org.telegram.messenger.gz.c()) {
            int i11 = mwVar.L0() < i7 ? 0 : 1;
            wi0 wi0Var = this.c0;
            wi0Var.b = i11;
            wi0Var.d(i7, i10, false, false);
            return;
        }
        this.K0 = true;
        hi.l1 l1Var = new hi.l1(1, this.Q.getContext(), this);
        l1Var.a = i7;
        l1Var.p = i10;
        mwVar.w0(l1Var);
    }

    public final void I(int i7, int i10) {
        wv wvVar = this.F0;
        View m10 = wvVar.m(i7);
        int L0 = wvVar.L0();
        if (m10 != null || Math.abs(i7 - L0) <= 40) {
            this.K0 = true;
            this.E0.y0(i7);
        } else {
            int i11 = wvVar.L0() < i7 ? 0 : 1;
            wi0 wi0Var = this.b0;
            wi0Var.b = i11;
            wi0Var.d(i7, i10, false, false);
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
            if (((hy) arrayList2.get(i7)).a == 0 && z10) {
                arrayList.add((hy) arrayList2.get(i7));
            }
            if (((hy) arrayList2.get(i7)).a == 1 && z12) {
                arrayList.add((hy) arrayList2.get(i7));
            }
            if (((hy) arrayList2.get(i7)).a == 2 && z11) {
                arrayList.add((hy) arrayList2.get(i7));
            }
            i7++;
        }
        qb0 qb0Var = this.x;
        if (qb0Var != null) {
            org.telegram.messenger.g0.Y3(qb0Var, arrayList.size() > 1, 1.0f, true, z13);
        }
        bw bwVar = this.h;
        if (bwVar != null) {
            bwVar.setAdapter(null);
            bwVar.setAdapter(this.M0);
            if (qb0Var != null) {
                qb0Var.setViewPager(bwVar);
            }
        }
    }

    public final void K(final ph.a aVar, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z10, boolean z11) {
        gy gyVar;
        lx lxVar;
        if (stickerSet == null) {
            return;
        }
        if (!z10 || (lxVar = this.T) == null || lxVar.d == stickerSet.id) {
            if (z10 || (gyVar = this.A0) == null || gyVar.d == stickerSet.id) {
                final boolean B0 = org.telegram.messenger.si.b0(this.d1).B0(stickerSet.id, true);
                aVar.i(B0 ? stickerSet.masks ? org.telegram.messenger.hd.G(stickerSet.count, "RemoveManyMasksCount", new Object[0]) : stickerSet.emojis ? org.telegram.messenger.hd.G(stickerSet.count, "RemoveManyEmojiCount", new Object[0]) : org.telegram.messenger.hd.G(stickerSet.count, "RemoveManyStickersCount", new Object[0]) : stickerSet.masks ? org.telegram.messenger.hd.G(stickerSet.count, "AddManyMasksCount", new Object[0]) : stickerSet.emojis ? org.telegram.messenger.hd.G(stickerSet.count, "AddManyEmojiCount", new Object[0]) : org.telegram.messenger.hd.G(stickerSet.count, "AddManyStickersCount", new Object[0]), z11, true);
                aVar.l0.a(!B0, z11);
                aVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.mv
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ly lyVar = ly.this;
                        org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(lyVar.d1);
                        Context context = lyVar.getContext();
                        int i7 = B0 ? 0 : 2;
                        org.telegram.ui.ActionBar.e2 e2Var = lyVar.Z1;
                        FrameLayout frameLayout = lyVar.s;
                        ph.a aVar2 = aVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z12 = z10;
                        b02.g2(context, tLObject2, document2, i7, e2Var, frameLayout, false, true, new di.m3(lyVar, aVar2, tLObject2, stickerSet2, document2, z12), false);
                        lyVar.K(aVar2, tLObject2, stickerSet2, document2, z12, true);
                    }
                });
            }
        }
    }

    public final void L(long j3, boolean z10, boolean z11) {
        qb0 qb0Var = this.x;
        if (qb0Var == null) {
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
        LinearLayout linearLayout = qb0Var.d;
        View childAt = i7 >= linearLayout.getChildCount() ? null : linearLayout.getChildAt(i7);
        if (childAt != null) {
            childAt.setAlpha(this.v1 != 0 ? 0.15f : 1.0f);
            bw bwVar = this.h;
            if (z11) {
                if (this.v1 == 0 || bwVar.getCurrentItem() == 0) {
                    return;
                }
                M(true, true);
                R(false, true);
                bwVar.x(0, false);
                return;
            }
            if (this.v1 == 0 || bwVar.getCurrentItem() == 1) {
                return;
            }
            M(false, true);
            R(false, true);
            bwVar.x(1, false);
        }
    }

    public final void M(boolean z10, boolean z11) {
        cw cwVar = this.y;
        if (z10 && cwVar.getTag() == null) {
            return;
        }
        if ((z10 || cwVar.getTag() == null) && !this.p2) {
            AnimatorSet animatorSet = this.G;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.G = null;
            }
            cwVar.setTag(z10 ? null : 1);
            if (!z11) {
                cwVar.setAlpha(z10 ? 1.0f : 0.0f);
                cwVar.setScaleX(z10 ? 1.0f : 0.0f);
                cwVar.setScaleY(z10 ? 1.0f : 0.0f);
                cwVar.setVisibility(z10 ? 0 : 4);
                return;
            }
            if (z10) {
                cwVar.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.G = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(cwVar, (Property<cw, Float>) View.ALPHA, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(cwVar, (Property<cw, Float>) View.SCALE_X, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(cwVar, (Property<cw, Float>) View.SCALE_Y, z10 ? 1.0f : 0.0f));
            this.G.setDuration(200L);
            this.G.setInterpolator(er.g);
            this.G.addListener(new iw(this, z10, r2));
            this.G.start();
        }
    }

    public final void N(boolean z10) {
        this.I = 0.0f;
        mx mxVar = this.u1;
        if (mxVar != null && mxVar.z()) {
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
            this.a0.setInterpolator(er.g);
            this.a0.addListener(new x5(this, 24));
            this.a0.start();
        }
    }

    public final void P(boolean z10) {
        for (int i7 = 0; i7 < 3; i7++) {
            v4.s w10 = w(i7);
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
        TLRPC.Chat M0 = org.telegram.messenger.np.s1(this.d1).M0(Long.valueOf(this.v1));
        if (M0 == null) {
            return;
        }
        di.ub ubVar = this.O0;
        if (z10) {
            if (org.telegram.messenger.t3.N(M0) || (tL_chatBannedRights = M0.default_banned_rights) == null || !(tL_chatBannedRights.send_stickers || (z11 && tL_chatBannedRights.send_plain))) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = M0.banned_rights;
                if (tL_chatBannedRights2 == null) {
                    return;
                }
                if (!org.telegram.messenger.g0.D1(tL_chatBannedRights2)) {
                    if (z11) {
                        ubVar.setText(org.telegram.messenger.hd.a0("AttachPlainRestricted", null, 2131753944, org.telegram.messenger.hd.v(M0.banned_rights.until_date)));
                    }
                    if (z12) {
                        ubVar.setText(org.telegram.messenger.hd.a0("AttachGifRestricted", null, 2131753970, org.telegram.messenger.hd.v(M0.banned_rights.until_date)));
                    } else {
                        ubVar.setText(org.telegram.messenger.hd.a0("AttachStickersRestricted", null, 2131753935, org.telegram.messenger.hd.v(M0.banned_rights.until_date)));
                    }
                } else if (z11) {
                    ubVar.setText(org.telegram.messenger.hd.M0(2131753943, null));
                } else if (z12) {
                    ubVar.setText(org.telegram.messenger.hd.M0(2131753969, null));
                } else {
                    ubVar.setText(org.telegram.messenger.hd.M0(2131753934, null));
                }
            } else {
                org.telegram.ui.ActionBar.e2 e2Var = this.Z1;
                if ((e2Var instanceof org.telegram.ui.an) && ((org.telegram.ui.an) e2Var).Z6()) {
                    return;
                }
                if (z11) {
                    ubVar.setText(org.telegram.messenger.hd.M0(2131749546, null));
                } else if (z12) {
                    ubVar.setText(org.telegram.messenger.hd.M0(2131749545, null));
                } else {
                    ubVar.setText(org.telegram.messenger.hd.M0(2131749539, null));
                }
            }
            ubVar.setVisibility(0);
        }
        AnimatorSet animatorSet = this.Q2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.Q2 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.Q2 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(ubVar, (Property<di.ub, Float>) View.ALPHA, z10 ? ubVar.getAlpha() : 1.0f, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(ubVar, (Property<di.ub, Float>) View.TRANSLATION_Y, z10 ? org.telegram.messenger.g0.L(12.0f) : ubVar.getTranslationY(), z10 ? 0.0f : org.telegram.messenger.g0.L(12.0f)));
        h2.m0 m0Var = this.R2;
        if (m0Var != null) {
            org.telegram.messenger.g0.r(m0Var);
        }
        if (z10) {
            h2.m0 m0Var2 = new h2.m0(this, z11, z12, 4);
            this.R2 = m0Var2;
            org.telegram.messenger.g0.i3(m0Var2, 3500L);
        }
        this.Q2.setDuration(320L);
        this.Q2.setInterpolator(er.h);
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
            this.H.setInterpolator(er.g);
            this.H.addListener(new iw(this, z10, i7));
            this.H.start();
        }
    }

    public final void S() {
        org.telegram.ui.ActionBar.e2 e2Var;
        if (((View) getParent()) != null) {
            float y10 = (getY() + (getLayoutParams().height > 0 ? getLayoutParams().height : getMeasuredHeight())) - (((org.telegram.messenger.g0.E || ((e2Var = this.Z1) != null && e2Var.isInBubbleMode())) && !this.W0) ? org.telegram.messenger.g0.L(1.0f) : r0.getHeight());
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
        yx yxVar;
        boolean z10;
        cv cvVar;
        boolean z11 = this.v0;
        View view = this.w;
        if (!z11) {
            setBackground(null);
            view.setBackground(null);
        } else if (org.telegram.messenger.g0.E || this.O1) {
            Drawable background = getBackground();
            int z12 = z(org.telegram.ui.ActionBar.j6.zf);
            if (background != null && (background != this.H2 || z12 != this.I2)) {
                this.H2 = background;
                this.I2 = z12;
                background.setColorFilter(new PorterDuffColorFilter(z12, PorterDuff.Mode.MULTIPLY));
            }
        } else {
            int i7 = org.telegram.ui.ActionBar.j6.zf;
            setBackgroundColor(z(i7));
            if (this.e0) {
                view.setBackgroundColor(z(i7));
            }
        }
        qw qwVar = this.J;
        if (qwVar != null) {
            if (this.v0) {
                qwVar.setBackgroundColor(z(org.telegram.ui.ActionBar.j6.zf));
                this.P.setBackgroundColor(z(org.telegram.ui.ActionBar.j6.Cf));
            } else {
                qwVar.setBackground(null);
            }
        }
        du duVar = this.C1;
        if (duVar != null) {
            duVar.c.a();
        }
        int i10 = 0;
        while (true) {
            yxVar = this.W;
            z10 = this.j2;
            if (i10 >= 3) {
                break;
            }
            if (i10 == 0) {
                yxVar = this.H0;
            } else if (i10 != 1) {
                yxVar = this.p0;
            }
            if (yxVar != null) {
                zp zpVar = yxVar.d;
                FrameLayout frameLayout = yxVar.n;
                View view2 = yxVar.f;
                if (this.v0) {
                    view2.setBackgroundColor(z(org.telegram.ui.ActionBar.j6.zf));
                } else {
                    view2.setBackground(null);
                }
                yxVar.e.setBackgroundColor(z(org.telegram.ui.ActionBar.j6.Cf));
                yxVar.c.a(z10 ? v(0.4f) : z(org.telegram.ui.ActionBar.j6.Bf));
                org.telegram.ui.ActionBar.j6.C1(z10 ? v(0.06f) : z(org.telegram.ui.ActionBar.j6.Af), frameLayout.getBackground());
                frameLayout.invalidate();
                zpVar.setHintTextColor(z10 ? v(0.45f) : z(org.telegram.ui.ActionBar.j6.Bf));
                zpVar.setTextColor(z10 ? v(0.8f) : z(org.telegram.ui.ActionBar.j6.G6));
            }
            i10++;
        }
        Paint paint = this.t1;
        if (paint != null) {
            paint.setColor(z(org.telegram.ui.ActionBar.j6.Sf));
        }
        yw ywVar = this.Q;
        if (ywVar != null) {
            ywVar.setGlowColor(z(org.telegram.ui.ActionBar.j6.zf));
        }
        vv vvVar = this.E0;
        if (vvVar != null) {
            vvVar.setGlowColor(z(org.telegram.ui.ActionBar.j6.zf));
        }
        zv zvVar = this.C0;
        if (zvVar != null) {
            zvVar.setIndicatorColor(z(org.telegram.ui.ActionBar.j6.If));
            zvVar.setUnderlineColor(z(org.telegram.ui.ActionBar.j6.Cf));
            if (this.v0) {
                zvVar.setBackgroundColor(z(org.telegram.ui.ActionBar.j6.zf));
            } else {
                zvVar.setBackground(null);
            }
        }
        tw twVar = this.q0;
        if (twVar != null) {
            twVar.setIndicatorColor(z(org.telegram.ui.ActionBar.j6.If));
            twVar.setUnderlineColor(z(org.telegram.ui.ActionBar.j6.Cf));
            if (this.v0) {
                twVar.setBackgroundColor(z(org.telegram.ui.ActionBar.j6.zf));
            } else {
                twVar.setBackground(null);
            }
        }
        int v = z10 ? v(0.6f) : z(org.telegram.ui.ActionBar.j6.Jf);
        boolean z13 = v != this.J2;
        this.J2 = v;
        cw cwVar = this.y;
        if (cwVar != null) {
            if (z13) {
                cwVar.setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
            }
            if (yxVar == null) {
                Drawable background2 = cwVar.getBackground();
                int i11 = org.telegram.ui.ActionBar.j6.zf;
                org.telegram.ui.ActionBar.j6.H1(background2, z(i11), false);
                org.telegram.ui.ActionBar.j6.H1(cwVar.getBackground(), z(i11), true);
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
        di.ub ubVar = this.O0;
        if (ubVar != null) {
            if (ubVar.getBackground() instanceof ShapeDrawable) {
                ((ShapeDrawable) ubVar.getBackground()).getPaint().setColor(z(org.telegram.ui.ActionBar.j6.hg));
                ubVar.invalidate();
            }
            ubVar.setTextColor(z(org.telegram.ui.ActionBar.j6.gg));
        }
        qx qxVar = this.k0;
        if (qxVar != null) {
            sx sxVar = qxVar.e;
            int i12 = org.telegram.ui.ActionBar.j6.Df;
            int z14 = z(i12);
            if (z14 != this.K2) {
                this.K2 = z14;
                sxVar.a.setColorFilter(new PorterDuffColorFilter(z14, PorterDuff.Mode.MULTIPLY));
            }
            sxVar.b.setTextColor(z(i12));
            sxVar.c.setProgressColor(z(org.telegram.ui.ActionBar.j6.h6));
        }
        int z15 = z(org.telegram.ui.ActionBar.j6.Fi);
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
            org.telegram.ui.ActionBar.j6.E1(drawableArr[i13], z10 ? v(0.4f) : z(org.telegram.ui.ActionBar.j6.Ff), false);
            org.telegram.ui.ActionBar.j6.E1(drawableArr[i13], z10 ? v(0.8f) : z(org.telegram.ui.ActionBar.j6.Gf), true);
            i13++;
        }
        if (qwVar != null && (cvVar = qwVar.E) != null) {
            cvVar.d();
        }
        int i14 = 0;
        while (true) {
            Drawable[] drawableArr2 = this.Z0;
            if (i14 >= drawableArr2.length) {
                break;
            }
            org.telegram.ui.ActionBar.j6.E1(drawableArr2[i14], z10 ? v(0.4f) : z(org.telegram.ui.ActionBar.j6.Ef), false);
            org.telegram.ui.ActionBar.j6.E1(drawableArr2[i14], z10 ? v(0.8f) : z(org.telegram.ui.ActionBar.j6.Gf), true);
            i14++;
        }
        int i15 = 0;
        while (true) {
            Drawable[] drawableArr3 = this.a1;
            if (i15 >= drawableArr3.length) {
                break;
            }
            org.telegram.ui.ActionBar.j6.E1(drawableArr3[i15], z10 ? v(0.4f) : z(org.telegram.ui.ActionBar.j6.Ef), false);
            org.telegram.ui.ActionBar.j6.E1(drawableArr3[i15], z10 ? v(0.8f) : z(org.telegram.ui.ActionBar.j6.Gf), true);
            i15++;
        }
        org.telegram.ui.ActionBar.t5 t5Var = this.b2;
        if (t5Var != null) {
            org.telegram.ui.ActionBar.j6.E1(t5Var, z10 ? v(0.4f) : z(org.telegram.ui.ActionBar.j6.Ff), false);
            org.telegram.ui.ActionBar.j6.E1(t5Var, z10 ? v(0.8f) : z(org.telegram.ui.ActionBar.j6.Gf), true);
        }
        org.telegram.ui.ActionBar.t5 t5Var2 = this.c2;
        if (t5Var2 != null) {
            org.telegram.ui.ActionBar.j6.E1(t5Var2, z10 ? v(0.4f) : z(org.telegram.ui.ActionBar.j6.If), false);
            org.telegram.ui.ActionBar.j6.E1(t5Var2, z10 ? v(0.8f) : z(org.telegram.ui.ActionBar.j6.If), true);
        }
    }

    public final void U() {
        yw ywVar = this.Q;
        if (ywVar == null) {
            return;
        }
        for (int i7 = 0; i7 < ywVar.getChildCount(); i7++) {
            View childAt = ywVar.getChildAt(i7);
            if (childAt instanceof dx) {
                ((dx) childAt).a(true);
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
            vw vwVar = this.S;
            int i11 = vwVar.c;
            ArrayList arrayList = vwVar.y;
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
                    ArrayList<zw> emojipacks = getEmojipacks();
                    int size2 = arrayList.size() - 1;
                    while (true) {
                        if (size2 < 0) {
                            break;
                        }
                        if (((Integer) arrayList.get(size2)).intValue() <= i7) {
                            zw zwVar = (zw) this.r1.get(size2);
                            while (i12 < emojipacks.size()) {
                                long j3 = emojipacks.get(i12).b.id;
                                long j10 = zwVar.b.id;
                                if (j3 == j10 && (!zwVar.g || (!zwVar.f && !this.q1.contains(Long.valueOf(j10))))) {
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
        xx xxVar;
        int i10;
        boolean z10;
        tw twVar = this.q0;
        int currentPosition = twVar.getCurrentPosition();
        int i11 = this.s0;
        boolean z11 = currentPosition == i11;
        boolean z12 = i11 >= 0;
        boolean isEmpty = this.j1.isEmpty();
        twVar.d(false);
        this.s0 = -2;
        this.t0 = -2;
        this.u0 = -2;
        Drawable[] drawableArr = this.a1;
        if (isEmpty) {
            i7 = 0;
        } else {
            this.s0 = 0;
            twVar.b(0, drawableArr[0]).setContentDescription(org.telegram.messenger.hd.M0(2131746364, null));
            i7 = 1;
        }
        this.t0 = i7;
        twVar.b(1, drawableArr[1]).setContentDescription(org.telegram.messenger.hd.M0(2131750834, null));
        this.u0 = i7 + 1;
        org.telegram.messenger.g0.L(13.0f);
        org.telegram.messenger.g0.L(11.0f);
        int i12 = this.d1;
        ArrayList arrayList = org.telegram.messenger.np.s1(i12).c4;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            String str = (String) arrayList.get(i13);
            org.telegram.messenger.f6 g10 = org.telegram.messenger.j6.g(str);
            if (g10 != null) {
                TLRPC.Document T = org.telegram.messenger.si.b0(i12).T(str);
                String i14 = i5.c.i(i13 + 3, "tab");
                int i15 = twVar.y;
                twVar.y = i15 + 1;
                hv0 hv0Var = (hv0) twVar.n.get(i14);
                if (hv0Var != null) {
                    twVar.g(i14, hv0Var, i15);
                    i10 = currentPosition;
                    z10 = z12;
                } else {
                    i10 = currentPosition;
                    z10 = z12;
                    hv0Var = new hv0(twVar.getContext(), 2);
                    hv0Var.setFocusable(true);
                    hv0Var.setOnClickListener(new pk0(twVar, 2));
                    hv0Var.setExpanded(twVar.g0);
                    hv0Var.a(twVar.j0);
                    twVar.e.addView(hv0Var, i15);
                }
                hv0Var.d = false;
                hv0Var.setTag(R.id.index_tag, Integer.valueOf(i15));
                hv0Var.setTag(R.id.parent_tag, g10);
                hv0Var.setTag(R.id.object_tag, T);
                hv0Var.setSelected(i15 == twVar.E);
                twVar.h.put(i14, hv0Var);
                hv0Var.setContentDescription(str);
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
        twVar.h();
        twVar.q();
        if (z11 && isEmpty) {
            twVar.m(this.t0);
            sv svVar = this.p0;
            if (svVar == null || (xxVar = svVar.r) == null) {
                return;
            }
            xxVar.I1(null);
            return;
        }
        WeakHashMap weakHashMap = r0.i0.a;
        if (twVar.isLaidOut()) {
            if (!isEmpty && !z13) {
                twVar.k(i16 + 1, 0);
            } else if (isEmpty && z13) {
                twVar.k(i16 - 1, 0);
            }
        }
    }

    public final void X() {
        qx qxVar;
        int size = this.j1.size();
        long n10 = org.telegram.messenger.si.n(ConnectionsManager.DEFAULT_DATACENTER_ID, this.j1);
        ArrayList arrayList = new ArrayList(org.telegram.messenger.si.b0(this.d1).j0);
        this.j1 = arrayList;
        long n11 = org.telegram.messenger.si.n(ConnectionsManager.DEFAULT_DATACENTER_ID, arrayList);
        if ((this.q0 != null && size == 0 && !this.j1.isEmpty()) || (size != 0 && this.j1.isEmpty())) {
            W();
        }
        if ((size == this.j1.size() && n10 == n11) || (qxVar = this.o0) == null) {
            return;
        }
        qxVar.f();
    }

    public final void Y(boolean z10) {
        TLRPC.Document document;
        boolean z11;
        int i7;
        org.telegram.ui.ActionBar.e6 e6Var;
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet;
        zv zvVar = this.C0;
        if (zvVar != null) {
            org.telegram.ui.z51 z51Var = zvVar.e;
            if (zvVar.s != null) {
                return;
            }
            this.G1 = -2;
            this.H1 = -2;
            this.I1 = -2;
            this.J1 = -2;
            int i10 = 0;
            this.f0 = false;
            this.F1 = 0;
            int currentPosition = zvVar.getCurrentPosition();
            zvVar.d((getParent() == null || getVisibility() != 0 || (this.z1.size() == 0 && this.A1.size() == 0)) ? false : true);
            int i11 = this.d1;
            org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(i11);
            SharedPreferences sharedPreferences = org.telegram.messenger.np.s1(i11).g7;
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
            jy jyVar = this.G0;
            if (jyVar != null) {
                jyVar.f();
            }
            boolean isEmpty = arrayList4.isEmpty();
            long j3 = 0;
            Drawable[] drawableArr = this.Z0;
            org.telegram.ui.ActionBar.e6 e6Var2 = null;
            if (!isEmpty && (arrayList3.isEmpty() || sharedPreferences.getLong("featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList4.get(0)).set.id)) {
                int i13 = b02.v0[0].isEmpty() ? 2 : 3;
                hv0 c10 = zvVar.c(i13, drawableArr[i13]);
                c10.h.setText(org.telegram.messenger.hd.M0(2131750831, null));
                c10.setContentDescription(org.telegram.messenger.hd.M0(2131750833, null));
                int i14 = this.F1;
                this.I1 = i14;
                this.F1 = i14 + 1;
            }
            if (!this.l1.isEmpty()) {
                int i15 = this.F1;
                this.H1 = i15;
                this.F1 = i15 + 1;
                hv0 c11 = zvVar.c(1, drawableArr[1]);
                c11.h.setText(org.telegram.messenger.hd.M0(2131750838, null));
                c11.setContentDescription(org.telegram.messenger.hd.M0(2131750841, null));
            }
            if (!this.k1.isEmpty()) {
                int i16 = this.F1;
                this.G1 = i16;
                this.F1 = i16 + 1;
                hv0 c12 = zvVar.c(0, drawableArr[0]);
                c12.h.setText(org.telegram.messenger.hd.M0(2131746363, null));
                c12.setContentDescription(org.telegram.messenger.hd.M0(2131746364, null));
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
            ArrayList w02 = org.telegram.messenger.np.s1(i11).w0(arrayList6);
            for (int i18 = 0; i18 < w02.size(); i18++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) w02.get(i18);
                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
                if ((stickerSet2 == null || !stickerSet2.archived) && (arrayList2 = tL_messages_stickerSet2.documents) != null && !arrayList2.isEmpty()) {
                    arrayList5.add(tL_messages_stickerSet2);
                }
            }
            if (this.K1 != null) {
                long j12 = org.telegram.messenger.np.s1(i11).g7.getLong("group_hide_stickers_" + this.K1.id, -1L);
                TLRPC.Chat M0 = org.telegram.messenger.np.s1(i11).M0(Long.valueOf(this.K1.id));
                if (M0 == null || this.K1.stickerset == null || !org.telegram.messenger.t3.N(M0)) {
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
                    TLRPC.Chat M02 = org.telegram.messenger.np.s1(i11).M0(Long.valueOf(this.K1.id));
                    if (M02 == null) {
                        arrayList5.remove(i10);
                        i19--;
                    } else {
                        this.f0 = true;
                        String str = "chat" + M02.id;
                        int i20 = zvVar.y;
                        zvVar.y = i20 + 1;
                        hv0 hv0Var = (hv0) zvVar.n.get(str);
                        if (hv0Var != null) {
                            zvVar.g(str, hv0Var, i20);
                        } else {
                            hv0Var = new hv0(zvVar.getContext(), i10);
                            hv0Var.setFocusable(true);
                            hv0Var.setOnClickListener(new pk0(zvVar, i10));
                            z51Var.addView(hv0Var, i20);
                            hv0Var.x = true;
                            t8 t8Var = new t8(e6Var2);
                            t8Var.u(org.telegram.messenger.g0.L(14.0f));
                            t8Var.q(M02);
                            int i21 = zvVar.a;
                            i9 i9Var = hv0Var.e;
                            i9Var.setLayerNum(i21);
                            i9Var.f(M02, t8Var);
                            i9Var.setAspectFit(true);
                            hv0Var.setExpanded(zvVar.g0);
                            hv0Var.a(zvVar.j0);
                            hv0Var.h.setText(M02.title);
                        }
                        hv0Var.d = true;
                        hv0Var.setTag(R.id.index_tag, Integer.valueOf(i20));
                        hv0Var.setSelected(i20 == zvVar.E);
                        zvVar.h.put(str, hv0Var);
                    }
                    i7 = 0;
                    e6Var = null;
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
                    int i23 = zvVar.y;
                    zvVar.y = i23 + 1;
                    hv0 hv0Var2 = (hv0) zvVar.n.get(str2);
                    if (hv0Var2 != null) {
                        zvVar.g(str2, hv0Var2, i23);
                    } else {
                        hv0Var2 = new hv0(zvVar.getContext(), 0);
                        hv0Var2.setFocusable(true);
                        hv0Var2.setOnClickListener(new pk0(zvVar, 1));
                        hv0Var2.setExpanded(zvVar.g0);
                        hv0Var2.a(zvVar.j0);
                        z51Var.addView(hv0Var2, i23);
                    }
                    hv0Var2.e.setLayerNum(zvVar.a);
                    i7 = 0;
                    hv0Var2.d = false;
                    hv0Var2.setTag(w10);
                    hv0Var2.setTag(R.id.index_tag, Integer.valueOf(i23));
                    hv0Var2.setTag(R.id.parent_tag, tL_messages_stickerSet5);
                    hv0Var2.setTag(R.id.object_tag, document);
                    hv0Var2.setSelected(i23 == zvVar.E);
                    zvVar.h.put(str2, hv0Var2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(tL_messages_stickerSet5.set.title);
                    sb2.append(", ");
                    e6Var = null;
                    sb2.append(org.telegram.messenger.hd.M0(2131754757, null));
                    hv0Var2.setContentDescription(sb2.toString());
                }
                i19++;
                i10 = i7;
                e6Var2 = e6Var;
            }
            zvVar.h();
            zvVar.q();
            if (currentPosition != 0) {
                zvVar.k(currentPosition, currentPosition);
            }
            o();
        }
    }

    public final void Z() {
        aw awVar = this.D0;
        zv zvVar = this.C0;
        if (zvVar != null && awVar == null && this.u1 != null) {
            zvVar.setTranslationY(this.u1.p() * (-org.telegram.messenger.g0.L(50.0f)));
        }
        if (awVar == null) {
            return;
        }
        boolean z10 = getVisibility() == 0 && this.L0 && this.u1.p() != 1.0f;
        awVar.setVisibility(z10 ? 0 : 8);
        if (z10) {
            Rect rect = this.z2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.y0, rect, null);
            float p10 = this.u1.p() * org.telegram.messenger.g0.L(50.0f);
            int i7 = rect.left;
            if (i7 != 0 || p10 != 0.0f) {
                this.Y1 = false;
            }
            awVar.setTranslationX(i7);
            float translationY = (((getTranslationY() + getTop()) - awVar.getTop()) - zvVar.getExpandedOffset()) - p10;
            if (awVar.getTranslationY() != translationY) {
                awVar.setTranslationY(translationY);
                awVar.invalidate();
            }
        }
        if (this.Y1 && z10 && this.Q0) {
            zvVar.i(true, this.X1);
        } else {
            this.Y1 = false;
            zvVar.i(false, this.X1);
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
        vv vvVar = this.E0;
        if (vvVar == null) {
            return;
        }
        try {
            int childCount = vvVar.getChildCount();
            ?? r72 = 0;
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = vvVar.getChildAt(i11);
                if (!(childAt instanceof org.telegram.ui.Cells.u3) || ((cj0) vvVar.T(childAt)) == null) {
                    i7 = i11;
                } else {
                    org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) childAt;
                    ArrayList arrayList = org.telegram.messenger.si.b0(i10).v0[r72];
                    TLRPC.StickerSetCovered stickerSet = u3Var.getStickerSet();
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
                    u3Var.c(stickerSet, z11, true, 0, 0, z10);
                    if (z11) {
                        org.telegram.messenger.si.b0(i10).e1(stickerSet.set.id);
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

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.messenger.z10 z10Var;
        TLRPC.StickerSet stickerSet;
        int i11 = org.telegram.messenger.ns.x0;
        vw vwVar = this.S;
        hv hvVar = this.S2;
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
                    vwVar.F(false);
                    return;
                } else {
                    org.telegram.messenger.g0.r(hvVar);
                    org.telegram.messenger.g0.i3(hvVar, 100L);
                    return;
                }
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.q3) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            TLRPC.ChatFull chatFull = this.K1;
            if (chatFull != null && chatFull.id == longValue && booleanValue) {
                vwVar.F(true);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.X0) {
            boolean booleanValue2 = ((Boolean) objArr[0]).booleanValue();
            int intValue = ((Integer) objArr[1]).intValue();
            if (booleanValue2 || intValue == 0 || intValue == 2) {
                k(booleanValue2);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.z0) {
            a0();
            qb0 qb0Var = this.x;
            if (qb0Var != null) {
                int childCount = qb0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    qb0Var.getChildAt(i12).invalidate();
                }
            }
            Y(false);
            return;
        }
        if (i7 == org.telegram.messenger.ns.A0) {
            if (vwVar != null) {
                vwVar.F(false);
                return;
            }
            return;
        }
        int i13 = org.telegram.messenger.ns.B0;
        lx lxVar = this.T;
        if (i7 == i13) {
            Long l10 = (Long) objArr[0];
            long longValue2 = l10.longValue();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = objArr.length > 1 ? (TLRPC.TL_messages_stickerSet) objArr[1] : null;
            if (tL_messages_stickerSet != null) {
                gy gyVar = this.A0;
                if (gyVar != null && gyVar.d == longValue2 && gyVar.f.size() < tL_messages_stickerSet.documents.size()) {
                    gyVar.f = tL_messages_stickerSet.documents;
                    gyVar.f();
                }
                if (lxVar != null && lxVar.d == longValue2 && lxVar.f.size() < tL_messages_stickerSet.documents.size()) {
                    lxVar.f = tL_messages_stickerSet.documents;
                    lxVar.f();
                }
            }
            TLRPC.ChatFull chatFull2 = this.K1;
            if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null && stickerSet.id == longValue2) {
                Y(false);
            }
            HashMap hashMap = this.s1;
            if (hashMap.containsKey(l10) && objArr.length >= 2 && ((org.telegram.messenger.z10) hashMap.get(l10)) != null && tL_messages_stickerSet != null && (z10Var = (org.telegram.messenger.z10) hashMap.remove(l10)) != null) {
                z10Var.a(tL_messages_stickerSet);
            }
            org.telegram.messenger.g0.r(hvVar);
            org.telegram.messenger.g0.i3(hvVar, 100L);
            return;
        }
        int i14 = org.telegram.messenger.ns.i4;
        yw ywVar = this.Q;
        if (i7 != i14) {
            if (i7 != org.telegram.messenger.ns.L2) {
                if (i7 == org.telegram.messenger.ns.f5) {
                    if (vwVar != null) {
                        vwVar.F(false);
                    }
                    U();
                    Y(false);
                    return;
                }
                return;
            }
            if (ywVar == null || !this.e0) {
                return;
            }
            if ((this.W.c.k == 2 || ywVar.getAdapter() == lxVar) && !TextUtils.isEmpty(lxVar.w)) {
                lxVar.F(lxVar.w, true);
                return;
            }
            return;
        }
        vv vvVar = this.E0;
        if (vvVar != null) {
            int childCount2 = vvVar.getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt = vvVar.getChildAt(i15);
                if ((childAt instanceof org.telegram.ui.Cells.i8) || (childAt instanceof org.telegram.ui.Cells.y7)) {
                    childAt.invalidate();
                }
            }
        }
        if (ywVar != null) {
            ywVar.invalidate();
            int childCount3 = ywVar.getChildCount();
            for (int i16 = 0; i16 < childCount3; i16++) {
                View childAt2 = ywVar.getChildAt(i16);
                if (childAt2 instanceof ux) {
                    childAt2.invalidate();
                }
            }
        }
        du duVar = this.C1;
        if (duVar != null) {
            duVar.c.invalidate();
        }
        tw twVar = this.q0;
        if (twVar != null) {
            org.telegram.ui.z51 z51Var = twVar.e;
            int childCount4 = z51Var.getChildCount();
            for (int i17 = 0; i17 < childCount4; i17++) {
                z51Var.getChildAt(i17).invalidate();
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
            int r12 = org.telegram.ui.ActionBar.j6.r1(R0, z(org.telegram.ui.ActionBar.j6.zf));
            int i7 = this.B2;
            GradientDrawable gradientDrawable = this.A2;
            if (i7 != r12) {
                gradientDrawable.setColors(new int[]{r12, org.telegram.ui.ActionBar.j6.r1(0.66f, r12), i0.a.o(r12, 0)});
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

    public ArrayList<zw> getEmojipacks() {
        ArrayList<zw> arrayList = new ArrayList<>();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.r1;
            if (i7 >= arrayList2.size()) {
                return arrayList;
            }
            zw zwVar = (zw) arrayList2.get(i7);
            boolean z10 = zwVar.g;
            ArrayList arrayList3 = this.q1;
            if ((!z10 && (zwVar.f || arrayList3.contains(Long.valueOf(zwVar.b.id)))) || (zwVar.g && !zwVar.f && !arrayList3.contains(Long.valueOf(zwVar.b.id)))) {
                arrayList.add(zwVar);
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
        zv zvVar = this.C0;
        if (zvVar == null) {
            return 0.0f;
        }
        return zvVar.getExpandedOffset();
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
        jw jwVar = new jw(getContext(), i10);
        jwVar.a = !z10 ? 1 : 0;
        w(i7).w0(jwVar);
    }

    public final void k(boolean z10) {
        if (z10) {
            X();
            return;
        }
        int size = this.k1.size();
        int size2 = this.l1.size();
        int i7 = this.d1;
        this.k1 = org.telegram.messenger.si.b0(i7).i0(0, true);
        this.l1 = org.telegram.messenger.si.b0(i7).i0(2, false);
        if (org.telegram.messenger.m10.i(i7).q()) {
            this.m1 = org.telegram.messenger.si.b0(i7).i0(7, false);
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
        if (org.telegram.messenger.np.s1(i7).D3()) {
            int i12 = 0;
            while (i12 < this.l1.size()) {
                if (org.telegram.messenger.gj.X3((TLRPC.Document) this.l1.get(i12))) {
                    this.l1.remove(i12);
                    i12--;
                }
                i12++;
            }
            int i13 = 0;
            while (i13 < this.k1.size()) {
                if (org.telegram.messenger.gj.X3((TLRPC.Document) this.k1.get(i13))) {
                    this.k1.remove(i13);
                    i13--;
                }
                i13++;
            }
        }
        if (size != this.k1.size() || size2 != this.l1.size()) {
            Y(false);
        }
        dy dyVar = this.z0;
        if (dyVar != null) {
            dyVar.f();
        }
        o();
    }

    public final void l(boolean z10) {
        mx mxVar = this.u1;
        te.a aVar = this.b;
        yw ywVar = this.Q;
        nv nvVar = this.W;
        if (mxVar != null && mxVar.z()) {
            v4.e1 K = ywVar.K(0);
            if (K == null) {
                yx.a(nvVar, true, !z10);
            } else {
                yx.a(nvVar, K.a.getTop() < ywVar.getPaddingTop(), !z10);
            }
            O(false, !z10);
            nvVar.setTranslationY(aVar.e * org.telegram.messenger.g0.L(15.0f));
            return;
        }
        if (nvVar == null || ywVar == null) {
            return;
        }
        nvVar.setTranslationY((aVar.e * org.telegram.messenger.g0.L(15.0f)) + (ywVar.K(0) != null ? r0.a.getTop() : -this.c1));
        nvVar.a.a(false, !z10);
        m(Math.round(this.J.getTranslationY()));
    }

    public final void m(int i7) {
        ObjectAnimator objectAnimator = this.S0[1];
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            boolean z10 = false;
            v4.e1 K = this.Q.K(0);
            int L = org.telegram.messenger.g0.L(38.0f) + i7;
            if (L > 0 && (K == null || K.a.getBottom() < L)) {
                z10 = true;
            }
            O(z10, !this.L1);
        }
    }

    public final void n(int i7, View view) {
        yw ywVar;
        v4.e1 K;
        qw qwVar = this.J;
        int[] iArr = this.R0;
        if (view == null) {
            iArr[1] = 0;
            qwVar.setTranslationY(0);
            return;
        }
        if (view.getVisibility() != 0 || this.g0) {
            return;
        }
        mx mxVar = this.u1;
        if (mxVar == null || !mxVar.z()) {
            if (i7 > 0 && (ywVar = this.Q) != null && ywVar.getVisibility() == 0 && (K = ywVar.K(0)) != null) {
                if (K.a.getTop() + (this.e0 ? this.c1 : 0) >= ywVar.getPaddingTop()) {
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
            qwVar.setTranslationY(Math.max(-org.telegram.messenger.g0.L(36.0f), iArr[1]));
        }
    }

    public final void o() {
        int L0;
        zv zvVar = this.C0;
        if (zvVar == null || (L0 = this.F0.L0()) == -1) {
            return;
        }
        int i7 = this.H1;
        if (i7 <= 0 && (i7 = this.G1) <= 0) {
            i7 = this.F1;
        }
        zvVar.k(this.z0.F(L0), i7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        xi.e eVar = this.N2;
        if (eVar != null) {
            eVar.b();
            this.N2 = null;
        }
        xi.e eVar2 = (xi.e) new org.telegram.messenger.ms(org.telegram.messenger.ns.f(this.d1), this).b;
        eVar2.f(org.telegram.messenger.ns.i4);
        eVar2.c(org.telegram.messenger.ns.L2);
        eVar2.c(org.telegram.messenger.ns.q3);
        this.N2 = eVar2;
        if (this.z0 != null) {
            eVar2.c(org.telegram.messenger.ns.x0);
            eVar2.c(org.telegram.messenger.ns.X0);
            eVar2.c(org.telegram.messenger.ns.z0);
            eVar2.c(org.telegram.messenger.ns.B0);
            eVar2.c(org.telegram.messenger.ns.f5);
            org.telegram.messenger.g0.h3(new hv(this, 0));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        du duVar = this.C1;
        if (duVar != null && duVar.isShowing()) {
            duVar.dismiss();
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
                int i11 = org.telegram.ui.ActionBar.j6.zf;
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
                int i12 = org.telegram.ui.ActionBar.j6.zf;
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
            v4.h0 adapter = this.i0.getAdapter();
            qx qxVar = this.o0;
            if (adapter != qxVar || qxVar.J < 0 || this.t0 < 0 || this.s0 < 0 || (L0 = this.j0.L0()) == -1) {
                return;
            }
            this.q0.k(L0 >= qxVar.J ? this.t0 : this.s0, 0);
        }
    }

    public final void q(boolean z10) {
        mx mxVar = this.u1;
        te.a aVar = this.a;
        vv vvVar = this.E0;
        yv yvVar = this.H0;
        if (mxVar != null && mxVar.z()) {
            v4.e1 K = vvVar.K(0);
            if (K == null) {
                yx.a(yvVar, true, !z10);
            } else {
                yx.a(yvVar, K.a.getTop() < vvVar.getPaddingTop(), !z10);
            }
            yvVar.setTranslationY(aVar.e * org.telegram.messenger.g0.L(15.0f));
            return;
        }
        if (yvVar == null || vvVar == null) {
            return;
        }
        yvVar.setTranslationY((aVar.e * org.telegram.messenger.g0.L(15.0f)) + (vvVar.K(0) != null ? r0.a.getTop() : -this.c1));
        yvVar.a.a(false, !z10);
    }

    public final void r() {
        HashMap hashMap = org.telegram.messenger.j6.a;
        org.telegram.messenger.np.d1().edit().putBoolean("filled_default", true).commit();
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
        yx yxVar;
        v4.b0 b0Var;
        View view;
        View view2;
        int i7;
        int i10;
        TLRPC.TL_messages_stickerSet o02;
        dy dyVar;
        int E;
        AnimatorSet animatorSet = this.N0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.N0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        int i11 = 2;
        if (currentItem == 2 && j3 != -1 && (o02 = org.telegram.messenger.si.b0(this.d1).o0(j3)) != null && (E = (dyVar = this.z0).E(o02)) >= 0 && E < dyVar.b()) {
            I(E, org.telegram.messenger.g0.L(48.0f));
        }
        int i12 = 0;
        qx qxVar = this.k0;
        if (qxVar != null) {
            qxVar.L = false;
        }
        int i13 = 0;
        while (i13 < 3) {
            View view3 = this.E0;
            View view4 = this.i0;
            sv svVar = this.p0;
            View view5 = this.Q;
            if (i13 == 0) {
                yxVar = this.W;
                b0Var = this.R;
                view = this.J;
                view2 = view5;
            } else if (i13 == 1) {
                b0Var = this.j0;
                view = this.q0;
                view2 = view4;
                yxVar = svVar;
            } else {
                yxVar = this.H0;
                b0Var = this.F0;
                view = this.C0;
                view2 = view3;
            }
            if (yxVar == null) {
                i10 = i12;
                i7 = i11;
            } else {
                int i14 = i12;
                xx xxVar = yxVar.r;
                int i15 = i11;
                yxVar.d.setText("");
                if (xxVar != null) {
                    xxVar.I1(null);
                    xxVar.G1();
                }
                int i16 = this.c1;
                if (i13 == currentItem && z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.N0 = animatorSet2;
                    Property property = View.TRANSLATION_Y;
                    if (view == null || i13 == 1) {
                        float[] fArr = new float[1];
                        fArr[i14] = org.telegram.messenger.g0.L(36.0f) - i16;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, fArr);
                        Animator[] animatorArr = new Animator[1];
                        animatorArr[i14] = ofFloat;
                        animatorSet2.playTogether(animatorArr);
                    } else {
                        float[] fArr2 = new float[1];
                        fArr2[i14] = 0.0f;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr2);
                        float[] fArr3 = new float[1];
                        fArr3[i14] = org.telegram.messenger.g0.L(36.0f);
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, fArr3);
                        float[] fArr4 = new float[1];
                        fArr4[i14] = org.telegram.messenger.g0.L(36.0f);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(yxVar, (Property<yx, Float>) property, fArr4);
                        Animator[] animatorArr2 = new Animator[3];
                        animatorArr2[i14] = ofFloat2;
                        animatorArr2[1] = ofFloat3;
                        animatorArr2[i15] = ofFloat4;
                        animatorSet2.playTogether(animatorArr2);
                    }
                    this.N0.setDuration(200L);
                    this.N0.setInterpolator(er.h);
                    this.N0.addListener(new fi.c3(this, b0Var, view2, 6));
                    this.N0.start();
                    i10 = i14;
                    i7 = i15;
                } else {
                    if (yxVar != svVar) {
                        yxVar.setTranslationY(org.telegram.messenger.g0.L(36.0f) - i16);
                    }
                    i7 = i15;
                    if (view != null && i13 != i7) {
                        view.setTranslationY(0.0f);
                    }
                    if (view2 == view3) {
                        i10 = i14;
                        view2.setPadding(i10, org.telegram.messenger.g0.L(36.0f), i10, org.telegram.messenger.g0.L(44.0f) + this.r2);
                    } else {
                        i10 = i14;
                        if (view2 == view4) {
                            view2.setPadding(i10, org.telegram.messenger.g0.L(40.0f), i10, org.telegram.messenger.g0.L(44.0f) + this.r2);
                        } else {
                            if (view2 == view5) {
                                view2.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(44.0f) + this.r2);
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
        if (z10) {
            return;
        }
        this.u1.i(i17);
    }

    public void setBlurredBackgroundDrawableFactory(dh.c cVar) {
        org.telegram.ui.ActionBar.e6 e6Var = this.a2;
        cw cwVar = this.y;
        if (cwVar != null) {
            fh.g c10 = cVar.c(cwVar, null, false);
            c10.p(c8.g0.d(e6Var));
            c10.r(org.telegram.messenger.g0.L(18.0f));
            c10.q(org.telegram.messenger.g0.L(6.0f));
            cwVar.setBackground(c10);
        }
        ImageView imageView = this.F;
        if (imageView != null) {
            fh.g c11 = cVar.c(imageView, null, false);
            c11.p(c8.g0.d(e6Var));
            c11.r(org.telegram.messenger.g0.L(18.0f));
            c11.q(org.telegram.messenger.g0.L(6.0f));
            imageView.setBackground(c11);
        }
        qb0 qb0Var = this.x;
        if (qb0Var != null) {
            fh.g c12 = cVar.c(qb0Var, null, false);
            c12.p(c8.g0.d(e6Var));
            c12.r(org.telegram.messenger.g0.L(18.0f));
            c12.q(org.telegram.messenger.g0.L(6.0f));
            qb0Var.setBackground(c12);
        }
        ImageView imageView2 = this.E;
        if (imageView2 != null) {
            fh.g c13 = cVar.c(imageView2, null, false);
            c13.p(c8.g0.d(e6Var));
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

    public void setDelegate(mx mxVar) {
        this.u1 = mxVar;
    }

    public void setDragListener(sw swVar) {
        this.P0 = swVar;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        yv yvVar = this.H0;
        if (yvVar != null) {
            yvVar.d.setEnabled(z10);
        }
        sv svVar = this.p0;
        if (svVar != null) {
            svVar.d.setEnabled(z10);
        }
        nv nvVar = this.W;
        if (nvVar != null) {
            nvVar.d.setEnabled(z10);
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
                    xi.e eVar2 = (xi.e) new org.telegram.messenger.ms(org.telegram.messenger.ns.f(i10), this).b;
                    eVar2.c(org.telegram.messenger.ns.x0);
                    this.O2 = eVar2;
                }
                if (this.z0 != null) {
                    if (!this.P2) {
                        this.P2 = true;
                        this.O2.c(org.telegram.messenger.ns.X0);
                    }
                    Y(false);
                    D();
                }
                k(true);
                k(false);
                org.telegram.messenger.si.b0(i10).V0(0, true, true, false);
                org.telegram.messenger.si.b0(i10).V0(0, false, true, false);
                org.telegram.messenger.si.b0(i10).V0(2, false, true, false);
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
        dy dyVar;
        boolean z11 = this.U2;
        this.U2 = z10;
        if (!z11 || z10) {
            return;
        }
        int i7 = this.B1;
        if (i7 == 0) {
            vw vwVar = this.S;
            if (vwVar != null) {
                vwVar.F(false);
                return;
            }
            return;
        }
        if (i7 == 1) {
            qx qxVar = this.o0;
            if (qxVar != null) {
                qxVar.f();
                return;
            }
            return;
        }
        if (i7 != 2 || (dyVar = this.z0) == null) {
            return;
        }
        dyVar.f();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            T();
            ui.c cVar = this.m2;
            if (cVar != null) {
                cVar.a(z(org.telegram.ui.ActionBar.j6.d6));
            }
            qb0 qb0Var = this.x;
            if (qb0Var != null) {
                qb0Var.setIndicatorColor(i0.a.o(z(org.telegram.ui.ActionBar.j6.Gf), 20));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final int v(float f10) {
        return i0.a.o(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Nl, this.a2), (int) (f10 * 255.0f));
    }

    public final v4.s w(int i7) {
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

    public final uj0 x(int i7) {
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
        org.telegram.ui.ActionBar.e6 e6Var = this.a2;
        return e6Var != null ? e6Var.h(i7) : org.telegram.ui.ActionBar.j6.x0(null, i7, false);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // te.b
    public final void E(float f10, int i7) {
    }
}
