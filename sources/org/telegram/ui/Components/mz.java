package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
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
import j$.util.Objects;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.CompoundEmoji;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ib1;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public class mz extends FrameLayout implements xd.b, NotificationCenter.NotificationCenterDelegate, dh.a {
    public static final /* synthetic */ int L2 = 0;
    public final rw A0;
    public final int[] A1;
    public ArrayList A2;
    public final ImageView B;
    public final sw B0;
    public int B1;
    public int B2;
    public AnimatorSet C;
    public kz C0;
    public int C1;
    public long C2;
    public AnimatorSet D;
    public final uw D0;
    public int D1;
    public final xd.a D2;
    public float E;
    public final bh.e E0;
    public int E1;
    public ArrayList E2;
    public final hw F;
    public boolean F0;
    public int F1;
    public boolean F2;
    public final jx G;
    public boolean G0;
    public TLRPC.ChatFull G1;
    public AnimatorSet G2;
    public final ag.l H;
    public boolean H0;
    public boolean H1;
    public org.telegram.messenger.video.l H2;
    public final bh.c I;
    public final ey I0;
    public int I1;
    public final aw I2;
    public final ag.l J;
    public AnimatorSet J0;
    public final lf.o0 J1;
    public boolean J2;
    public final bh.c K;
    public final hg.q K0;
    public boolean K1;
    public boolean K2;
    public final View L;
    public qx L0;
    public int L1;
    public final kx M;
    public boolean M0;
    public boolean M1;
    public final lx N;
    public final int[] N0;
    public boolean N1;
    public final tx O;
    public final ObjectAnimator[] O0;
    public uy O1;
    public final ly P;
    public boolean P0;
    public float P1;
    public kz Q;
    public bx Q0;
    public float Q1;
    public final bh.e R;
    public boolean R0;
    public float R1;
    public final iw S;
    public boolean S0;
    public float S1;
    public AnimatorSet T;
    public String[] T0;
    public float T1;
    public final c2.y U;
    public final Drawable[] U0;
    public boolean U1;
    public final c2.y V;
    public final Drawable[] V0;
    public final org.telegram.ui.ActionBar.p2 V1;
    public boolean W;
    public final Drawable[] W0;
    public final org.telegram.ui.ActionBar.g6 W1;
    public final String[] X0;
    public final org.telegram.ui.ActionBar.v5 X1;
    public final int Y0;
    public final org.telegram.ui.ActionBar.v5 Y1;
    public final int Z0;
    public final boolean Z1;
    public final xd.a a;
    public final boolean a0;
    public final ArrayList a1;
    public LongSparseArray a2;
    public final xd.a b;
    public boolean b0;
    public int b1;
    public PorterDuffColorFilter b2;
    public int c;
    public boolean c0;
    public int c1;
    public final m2.b c2;
    public final ArrayList d;
    public final kw d0;
    public boolean d1;
    public final cx d2;
    public final ArrayList e;
    public final lw e0;
    public TLRPC.TL_messages_stickerSet e1;
    public boolean e2;
    public boolean f;
    public final ry f0;
    public ArrayList f1;
    public final boolean f2;
    public final qy g0;
    public ArrayList g1;
    public final og.e g2;
    public final xw h;
    public final ty h0;
    public ArrayList h1;
    public final ah h2;
    public final HashMap i0;
    public ArrayList i1;
    public final tg.d i2;
    public final fw j0;
    public final ArrayList j1;
    public final tg.c j2;
    public final qy k0;
    public final ArrayList k1;
    public final og.a k2;
    public final ow l0;
    public final ArrayList l1;
    public boolean l2;
    public final rx m0;
    public final ArrayList m1;
    public boolean m2;
    public final FrameLayout n;
    public boolean n0;
    public final ArrayList n1;
    public int n2;
    public int o0;
    public final HashMap o1;
    public float o2;
    public int p0;
    public final Paint p1;
    public View p2;
    public int q0;
    public my q1;
    public int q2;
    public final FrameLayout r;
    public boolean r0;
    public long r1;
    public int r2;
    public final FrameLayout s;
    public boolean s0;
    public boolean s1;
    public long s2;
    public boolean t0;
    public boolean t1;
    public boolean t2;
    public final pw u0;
    public final TLRPC.StickerSetCovered[] u1;
    public boolean u2;
    public final View v;
    public final dz v0;
    public final LongSparseArray v1;
    public final Rect v2;
    public final hd0 w;
    public final hz w0;
    public final LongSparseArray w1;
    public final RectF w2;
    public final yw x;
    public final fw x0;
    public int x1;
    public final ArrayList x2;
    public final ImageView y;
    public final vw y0;
    public final tu y1;
    public final GradientDrawable y2;
    public final ww z0;
    public final int z1;
    public int z2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v55, types: [org.telegram.ui.Components.fw, org.telegram.ui.Components.jl0] */
    /* JADX WARN: Type inference failed for: r8v16, types: [org.telegram.ui.Components.fw, org.telegram.ui.Components.jl0] */
    public mz(org.telegram.ui.ActionBar.p2 p2Var, boolean z4, boolean z10, boolean z11, Context context, boolean z12, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z13, final org.telegram.ui.ActionBar.g6 g6Var, boolean z14, boolean z15) {
        super(context);
        org.telegram.ui.ActionBar.v5 v5Var;
        int A;
        kx kxVar;
        aw awVar;
        boolean z16;
        boolean z17;
        Context context2;
        int i10;
        tx txVar;
        int i11;
        jx jxVar;
        final org.telegram.ui.ActionBar.g6 g6Var2;
        int i12;
        boolean z18;
        boolean z19;
        Field field;
        pr prVar = pr.h;
        this.a = new xd.a(0, this, prVar, 320L, false);
        this.b = new xd.a(1, this, prVar, 320L, false);
        this.c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = new ArrayList();
        this.W = true;
        this.h0 = new ty(this);
        this.i0 = new HashMap();
        this.n0 = true;
        this.o0 = -2;
        this.p0 = -2;
        this.q0 = -2;
        this.r0 = true;
        this.t0 = true;
        this.F0 = true;
        this.N0 = new int[3];
        this.O0 = new ObjectAnimator[3];
        int i13 = UserConfig.selectedAccount;
        this.Z0 = i13;
        this.a1 = new ArrayList();
        this.f1 = new ArrayList();
        this.g1 = new ArrayList();
        this.h1 = new ArrayList();
        this.i1 = new ArrayList();
        this.j1 = new ArrayList();
        this.k1 = new ArrayList();
        new ArrayList();
        this.l1 = new ArrayList();
        this.m1 = new ArrayList();
        this.n1 = new ArrayList();
        this.o1 = new HashMap();
        this.u1 = new TLRPC.StickerSetCovered[10];
        this.v1 = new LongSparseArray();
        this.w1 = new LongSparseArray();
        this.A1 = new int[2];
        this.C1 = -2;
        this.D1 = -2;
        this.E1 = -2;
        this.F1 = -2;
        this.I1 = -1;
        this.c2 = new m2.b(this, 20);
        this.d2 = new cx(this);
        this.e2 = true;
        this.o2 = -1.0f;
        this.q2 = -1;
        this.r2 = -1;
        this.s2 = -1L;
        this.t2 = false;
        this.u2 = true;
        this.v2 = new Rect();
        RectF rectF = new RectF();
        this.w2 = rectF;
        ArrayList arrayList2 = new ArrayList(1);
        this.x2 = arrayList2;
        arrayList2.add(rectF);
        new Paint(1);
        this.y2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.D2 = new xd.a(0, new dw(this, 1), prVar, 380L, true);
        this.I2 = new aw(this, 2);
        this.J2 = false;
        this.r0 = z13;
        this.V1 = p2Var;
        this.Z1 = z4;
        this.W1 = g6Var;
        this.f2 = z15;
        tg.c cVar = new tg.c();
        this.j2 = cVar;
        cVar.a(A(org.telegram.ui.ActionBar.k6.d6));
        if (z14) {
            u(true);
        }
        i0.a.k(A(org.telegram.ui.ActionBar.k6.Wk), 30);
        int dp = AndroidUtilities.dp(50.0f);
        this.Y0 = dp;
        this.a0 = z12;
        this.U0 = new Drawable[]{org.telegram.ui.ActionBar.k6.U(context, R.drawable.smiles_tab_smiles, z15 ? v(0.4f) : A(org.telegram.ui.ActionBar.k6.Re), z15 ? v(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe)), org.telegram.ui.ActionBar.k6.U(context, R.drawable.smiles_tab_gif, z15 ? v(0.4f) : A(org.telegram.ui.ActionBar.k6.Re), z15 ? v(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe)), org.telegram.ui.ActionBar.k6.U(context, R.drawable.smiles_tab_stickers, z15 ? v(0.4f) : A(org.telegram.ui.ActionBar.k6.Re), z15 ? v(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe))};
        org.telegram.ui.ActionBar.v5 U = org.telegram.ui.ActionBar.k6.U(context, R.drawable.msg_emoji_recent, z15 ? v(0.4f) : A(org.telegram.ui.ActionBar.k6.Me), z15 ? v(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe));
        org.telegram.ui.ActionBar.v5 U2 = org.telegram.ui.ActionBar.k6.U(context, R.drawable.emoji_tabs_faves, z15 ? v(0.4f) : A(org.telegram.ui.ActionBar.k6.Me), z15 ? v(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe));
        org.telegram.ui.ActionBar.v5 U3 = org.telegram.ui.ActionBar.k6.U(context, R.drawable.emoji_tabs_new3, z15 ? v(0.4f) : A(org.telegram.ui.ActionBar.k6.Me), z15 ? v(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe));
        int i14 = R.drawable.emoji_tabs_new1;
        if (z15) {
            v5Var = U3;
            A = v(0.4f);
        } else {
            v5Var = U3;
            A = A(org.telegram.ui.ActionBar.k6.Me);
        }
        org.telegram.ui.ActionBar.v5 U4 = org.telegram.ui.ActionBar.k6.U(context, i14, A, z15 ? v(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe));
        this.X1 = U4;
        int i15 = R.drawable.emoji_tabs_new2;
        int i16 = org.telegram.ui.ActionBar.k6.Qe;
        org.telegram.ui.ActionBar.v5 U5 = org.telegram.ui.ActionBar.k6.U(context, i15, A(i16), A(i16));
        this.Y1 = U5;
        this.V0 = new Drawable[]{U, U2, v5Var, new LayerDrawable(new Drawable[]{U4, U5})};
        this.W0 = new Drawable[]{org.telegram.ui.ActionBar.k6.U(context, R.drawable.msg_emoji_recent, z15 ? v(0.4f) : A(org.telegram.ui.ActionBar.k6.Me), z15 ? v(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe)), org.telegram.ui.ActionBar.k6.U(context, R.drawable.stickers_gifs_trending, z15 ? v(0.4f) : A(org.telegram.ui.ActionBar.k6.Me), z15 ? v(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe))};
        this.X0 = new String[]{LocaleController.getString(R.string.Emoji1), LocaleController.getString(R.string.Emoji2), LocaleController.getString(R.string.Emoji3), LocaleController.getString(R.string.Emoji4), LocaleController.getString(R.string.Emoji5), LocaleController.getString(R.string.Emoji6), LocaleController.getString(R.string.Emoji7), LocaleController.getString(R.string.Emoji8)};
        this.G1 = chatFull;
        Paint paint = new Paint(1);
        this.p1 = paint;
        paint.setColor(A(org.telegram.ui.ActionBar.k6.af));
        float dp2 = AndroidUtilities.dp(6.0f);
        hg.j1 j1Var = lf.q0.a;
        this.J1 = new lf.o0(dp2);
        jx jxVar2 = new jx(this, context);
        this.G = jxVar2;
        iz izVar = new iz();
        izVar.a = 0;
        izVar.b = jxVar2;
        arrayList.add(izVar);
        if (z4) {
            MediaDataController.getInstance(i13).checkStickers(5);
            MediaDataController.getInstance(i13).checkFeaturedEmoji();
            this.b2 = new PorterDuffColorFilter(A(org.telegram.ui.ActionBar.k6.Oh), PorterDuff.Mode.SRC_IN);
        }
        kx kxVar2 = new kx(this, context);
        this.M = kxVar2;
        f2.l lVar = new f2.l();
        lVar.c = 220L;
        lVar.e = 220L;
        lVar.f = 160L;
        lVar.g = 160L;
        lVar.i = pr.g;
        kxVar2.setItemAnimator(lVar);
        final int i17 = 0;
        kxVar2.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.cw
            public final /* synthetic */ mz b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (i17) {
                    case 0:
                        org.telegram.ui.qt q10 = org.telegram.ui.qt.q();
                        mz mzVar = this.b;
                        kx kxVar3 = mzVar.M;
                        mzVar.getMeasuredHeight();
                        return q10.s(motionEvent, kxVar3, null, mzVar.d2, g6Var);
                    case 1:
                        org.telegram.ui.qt q11 = org.telegram.ui.qt.q();
                        mz mzVar2 = this.b;
                        return q11.s(motionEvent, mzVar2.e0, mzVar2.j0, mzVar2.d2, g6Var);
                    default:
                        org.telegram.ui.qt q12 = org.telegram.ui.qt.q();
                        mz mzVar3 = this.b;
                        rw rwVar = mzVar3.A0;
                        mzVar3.getMeasuredHeight();
                        return q12.s(motionEvent, rwVar, mzVar3.x0, mzVar3.d2, g6Var);
                }
            }
        });
        kxVar2.setOnItemLongClickListener(new dw(this, i17));
        kxVar2.setInstantClick(true);
        lx lxVar = new lx(this);
        this.N = lxVar;
        kxVar2.setLayoutManager(lxVar);
        kxVar2.setTopGlowOffset(AndroidUtilities.dp(38.0f));
        kxVar2.setBottomGlowOffset(AndroidUtilities.dp(36.0f));
        kxVar2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f));
        int i18 = org.telegram.ui.ActionBar.k6.He;
        kxVar2.setGlowColor(A(i18));
        kxVar2.setItemSelectorColorProvider(new k2(15));
        kxVar2.setClipToPadding(false);
        lxVar.O = new mx(this);
        tx txVar2 = new tx(this);
        this.O = txVar2;
        kxVar2.setAdapter(txVar2);
        kxVar2.i(new hg.e2(this, 3));
        this.P = new ly(this, context);
        jxVar2.addView(kxVar2, k7.c6.c(-1.0f, -1));
        c2.y yVar = new c2.y(kxVar2, lxVar);
        this.V = yVar;
        yVar.i = new nx(this);
        kxVar2.setOnScrollListener(new ox(this));
        if (p2Var != null) {
            kxVar = kxVar2;
            awVar = new aw(this, 5);
            z17 = z15;
            context2 = context;
            i10 = i16;
            txVar = txVar2;
            jxVar = jxVar2;
            z16 = z4;
            g6Var2 = g6Var;
            i12 = dp;
            i11 = -1;
        } else {
            kxVar = kxVar2;
            awVar = null;
            z16 = z4;
            z17 = z15;
            context2 = context;
            i10 = i16;
            txVar = txVar2;
            i11 = -1;
            jxVar = jxVar2;
            g6Var2 = g6Var;
            i12 = dp;
        }
        hw hwVar = new hw(this, context2, g6Var2, z16, awVar, z17);
        this.F = hwVar;
        if (z12) {
            iw iwVar = new iw(this, context2);
            this.S = iwVar;
            jxVar.addView(iwVar, new FrameLayout.LayoutParams(i11, AndroidUtilities.getShadowHeight() + i12));
            iwVar.d.setOnFocusChangeListener(new jw(this));
            bh.e eVar = new bh.e(context2, g6Var2);
            this.R = eVar;
            eVar.setVisibility(8);
            final int i19 = 0;
            eVar.setOnBackClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ew
                public final /* synthetic */ mz b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i19) {
                        case 0:
                            ly lyVar = this.b.P;
                            fy fyVar = lyVar.c;
                            int childCount = fyVar.getChildCount();
                            for (int i20 = 0; i20 < childCount; i20++) {
                                ((bh.d) fyVar.getChildAt(i20)).a(false, true);
                            }
                            lyVar.d = 0L;
                            lyVar.C.b.a(false, true);
                            lyVar.l();
                            break;
                        case 1:
                            hz hzVar = this.b.w0;
                            gz gzVar = hzVar.c;
                            int childCount2 = gzVar.getChildCount();
                            for (int i21 = 0; i21 < childCount2; i21++) {
                                ((bh.d) gzVar.getChildAt(i21)).a(false, true);
                            }
                            hzVar.d = 0L;
                            hzVar.N.a.a(false, true);
                            hzVar.l();
                            break;
                        case 2:
                            my myVar = this.b.q1;
                            if (myVar != null) {
                                myVar.w();
                                break;
                            }
                            break;
                        default:
                            mz mzVar = this.b;
                            int currentItem = mzVar.h.getCurrentItem();
                            yy yyVar = currentItem == 0 ? mzVar.S : currentItem == 1 ? mzVar.l0 : mzVar.D0;
                            if (yyVar != null) {
                                iq iqVar = yyVar.d;
                                iqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                iqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                iqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
            jxVar.addView(eVar, new FrameLayout.LayoutParams(i11, i12));
        }
        int A2 = A(i18);
        if (Color.alpha(A2) >= 255) {
            hwVar.setBackgroundColor(A2);
        }
        tx txVar3 = txVar;
        txVar3.G(true);
        hwVar.p(getEmojipacks());
        jxVar.addView(hwVar, k7.c6.c(36.0f, i11));
        View view = new View(context2);
        this.L = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i20 = org.telegram.ui.ActionBar.k6.Ke;
        view.setBackgroundColor(A(i20));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i11, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(36.0f);
        jxVar.addView(view, layoutParams);
        bh.c cVar2 = new bh.c(context2, g6Var2);
        this.I = cVar2;
        ag.l lVar2 = new ag.l(context2, 1, g6Var2);
        this.H = lVar2;
        lVar2.setVisibility(8);
        lVar2.addView(cVar2, k7.c6.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
        jxVar.addView(lVar2, k7.c6.e(i11, -2, 80));
        if (z10) {
            pm0 pm0Var = pm0.b;
            if (z11) {
                kw kwVar = new kw(this, context2);
                this.d0 = kwVar;
                iz izVar2 = new iz();
                izVar2.a = 1;
                izVar2.b = kwVar;
                this.d.add(izVar2);
                lw lwVar = new lw(this, context2);
                this.e0 = lwVar;
                lwVar.setClipToPadding(false);
                ry ryVar = new ry(this);
                this.f0 = ryVar;
                lwVar.setLayoutManager(ryVar);
                lwVar.i(new mw(this));
                lwVar.setPadding(0, i12, 0, AndroidUtilities.dp(44.0f) + this.n2);
                lwVar.setOverScrollMode(2);
                ((f2.p1) lwVar.getItemAnimator()).m = false;
                qy qyVar = new qy(this, context2, true, ConnectionsManager.DEFAULT_DATACENTER_ID);
                this.k0 = qyVar;
                lwVar.setAdapter(qyVar);
                this.g0 = new qy(this, context2, false, 0);
                lwVar.setOnScrollListener(new nw(this));
                final int i21 = 1;
                lwVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.cw
                    public final /* synthetic */ mz b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (i21) {
                            case 0:
                                org.telegram.ui.qt q10 = org.telegram.ui.qt.q();
                                mz mzVar = this.b;
                                kx kxVar3 = mzVar.M;
                                mzVar.getMeasuredHeight();
                                return q10.s(motionEvent, kxVar3, null, mzVar.d2, g6Var2);
                            case 1:
                                org.telegram.ui.qt q11 = org.telegram.ui.qt.q();
                                mz mzVar2 = this.b;
                                return q11.s(motionEvent, mzVar2.e0, mzVar2.j0, mzVar2.d2, g6Var2);
                            default:
                                org.telegram.ui.qt q12 = org.telegram.ui.qt.q();
                                mz mzVar3 = this.b;
                                rw rwVar = mzVar3.A0;
                                mzVar3.getMeasuredHeight();
                                return q12.s(motionEvent, rwVar, mzVar3.x0, mzVar3.d2, g6Var2);
                        }
                    }
                });
                final int i22 = 0;
                ?? r82 = new jl0(this) { // from class: org.telegram.ui.Components.fw
                    public final /* synthetic */ mz b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.ui.Components.jl0
                    public final void f(int i23, View view2) {
                        switch (i22) {
                            case 0:
                                mz mzVar = this.b;
                                lw lwVar2 = mzVar.e0;
                                qy qyVar2 = mzVar.g0;
                                qy qyVar3 = mzVar.k0;
                                if (mzVar.q1 != null) {
                                    qyVar3.getClass();
                                    ArrayList arrayList3 = qyVar3.x;
                                    if (lwVar2.getAdapter() != qyVar3) {
                                        if (lwVar2.getAdapter() == qyVar2 && i23 >= 0 && i23 < qyVar2.x.size()) {
                                            mzVar.q1.v(view2, qyVar2.x.get(i23), qyVar2.w, qyVar2.n, true, 0, 0);
                                            mzVar.Y();
                                            break;
                                        }
                                    } else if (i23 >= 0) {
                                        int i24 = qyVar3.E;
                                        if (i23 >= i24) {
                                            int i25 = i24 > 0 ? (i23 - i24) - 1 : i23;
                                            if (i25 >= 0 && i25 < arrayList3.size()) {
                                                mzVar.q1.v(view2, arrayList3.get(i25), null, qyVar3.n, true, 0, 0);
                                                break;
                                            }
                                        } else {
                                            mzVar.q1.v(view2, mzVar.f1.get(i23), null, "gif", true, 0, 0);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                mz mzVar2 = this.b;
                                f2.p0 adapter = mzVar2.A0.getAdapter();
                                hz hzVar = mzVar2.w0;
                                String str = adapter == hzVar ? hzVar.K : null;
                                if (view2 instanceof org.telegram.ui.Cells.d8) {
                                    org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view2;
                                    if (d8Var.getSticker() != null && MessageObject.isPremiumSticker(d8Var.getSticker()) && !AccountInstance.getInstance(mzVar2.Z0).getUserConfig().isPremium()) {
                                        org.telegram.ui.qt.q().y(d8Var);
                                        break;
                                    } else {
                                        org.telegram.ui.qt.q().u();
                                        if (!d8Var.r) {
                                            d8Var.r = true;
                                            d8Var.n = 0.5f;
                                            d8Var.x = 0L;
                                            org.telegram.ui.Cells.c8 c8Var = d8Var.a;
                                            c8Var.setAlpha(0.5f * d8Var.E);
                                            c8Var.invalidate();
                                            d8Var.s = System.currentTimeMillis();
                                            d8Var.invalidate();
                                            mzVar2.q1.m(d8Var, d8Var.getSticker(), str, d8Var.getParentObject(), d8Var.getSendAnimationData(), true, 0);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                };
                this.j0 = r82;
                lwVar.setOnItemClickListener((jl0) r82);
                kwVar.addView(lwVar, k7.c6.c(-1.0f, -1));
                ow owVar = new ow(this, context2);
                this.l0 = owVar;
                kwVar.addView(owVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + i12));
                rx rxVar = new rx(this, context2, g6Var2);
                this.m0 = rxVar;
                rxVar.setType(pm0Var);
                rxVar.setUnderlineHeight(AndroidUtilities.getShadowHeight());
                rxVar.setIndicatorColor(A(i10));
                rxVar.setUnderlineColor(A(i20));
                rxVar.setBackgroundColor(A(i18));
                X();
                rxVar.setDelegate(new dw(this, 2));
                qyVar.F("", "", true, true, true);
            }
            pw pwVar = new pw(this, context2, z13);
            this.u0 = pwVar;
            MediaDataController.getInstance(this.Z0).checkStickers(0);
            MediaDataController.getInstance(this.Z0).checkFeaturedStickers();
            rw rwVar = new rw(this, context2);
            this.A0 = rwVar;
            sw swVar = new sw(this);
            this.B0 = swVar;
            rwVar.setLayoutManager(swVar);
            swVar.O = new tw(this);
            rwVar.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f));
            rwVar.setClipToPadding(false);
            iz izVar3 = new iz();
            izVar3.a = 2;
            izVar3.b = pwVar;
            this.d.add(izVar3);
            this.w0 = new hz(this, context2);
            dz dzVar = new dz(this, context2);
            this.v0 = dzVar;
            rwVar.setAdapter(dzVar);
            final int i23 = 2;
            rwVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.cw
                public final /* synthetic */ mz b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (i23) {
                        case 0:
                            org.telegram.ui.qt q10 = org.telegram.ui.qt.q();
                            mz mzVar = this.b;
                            kx kxVar3 = mzVar.M;
                            mzVar.getMeasuredHeight();
                            return q10.s(motionEvent, kxVar3, null, mzVar.d2, g6Var2);
                        case 1:
                            org.telegram.ui.qt q11 = org.telegram.ui.qt.q();
                            mz mzVar2 = this.b;
                            return q11.s(motionEvent, mzVar2.e0, mzVar2.j0, mzVar2.d2, g6Var2);
                        default:
                            org.telegram.ui.qt q12 = org.telegram.ui.qt.q();
                            mz mzVar3 = this.b;
                            rw rwVar2 = mzVar3.A0;
                            mzVar3.getMeasuredHeight();
                            return q12.s(motionEvent, rwVar2, mzVar3.x0, mzVar3.d2, g6Var2);
                    }
                }
            });
            final int i24 = 1;
            ?? r42 = new jl0(this) { // from class: org.telegram.ui.Components.fw
                public final /* synthetic */ mz b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.Components.jl0
                public final void f(int i232, View view2) {
                    switch (i24) {
                        case 0:
                            mz mzVar = this.b;
                            lw lwVar2 = mzVar.e0;
                            qy qyVar2 = mzVar.g0;
                            qy qyVar3 = mzVar.k0;
                            if (mzVar.q1 != null) {
                                qyVar3.getClass();
                                ArrayList arrayList3 = qyVar3.x;
                                if (lwVar2.getAdapter() != qyVar3) {
                                    if (lwVar2.getAdapter() == qyVar2 && i232 >= 0 && i232 < qyVar2.x.size()) {
                                        mzVar.q1.v(view2, qyVar2.x.get(i232), qyVar2.w, qyVar2.n, true, 0, 0);
                                        mzVar.Y();
                                        break;
                                    }
                                } else if (i232 >= 0) {
                                    int i242 = qyVar3.E;
                                    if (i232 >= i242) {
                                        int i25 = i242 > 0 ? (i232 - i242) - 1 : i232;
                                        if (i25 >= 0 && i25 < arrayList3.size()) {
                                            mzVar.q1.v(view2, arrayList3.get(i25), null, qyVar3.n, true, 0, 0);
                                            break;
                                        }
                                    } else {
                                        mzVar.q1.v(view2, mzVar.f1.get(i232), null, "gif", true, 0, 0);
                                        break;
                                    }
                                }
                            }
                            break;
                        default:
                            mz mzVar2 = this.b;
                            f2.p0 adapter = mzVar2.A0.getAdapter();
                            hz hzVar = mzVar2.w0;
                            String str = adapter == hzVar ? hzVar.K : null;
                            if (view2 instanceof org.telegram.ui.Cells.d8) {
                                org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view2;
                                if (d8Var.getSticker() != null && MessageObject.isPremiumSticker(d8Var.getSticker()) && !AccountInstance.getInstance(mzVar2.Z0).getUserConfig().isPremium()) {
                                    org.telegram.ui.qt.q().y(d8Var);
                                    break;
                                } else {
                                    org.telegram.ui.qt.q().u();
                                    if (!d8Var.r) {
                                        d8Var.r = true;
                                        d8Var.n = 0.5f;
                                        d8Var.x = 0L;
                                        org.telegram.ui.Cells.c8 c8Var = d8Var.a;
                                        c8Var.setAlpha(0.5f * d8Var.E);
                                        c8Var.invalidate();
                                        d8Var.s = System.currentTimeMillis();
                                        d8Var.invalidate();
                                        mzVar2.q1.m(d8Var, d8Var.getSticker(), str, d8Var.getParentObject(), d8Var.getSendAnimationData(), true, 0);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            };
            this.x0 = r42;
            rwVar.setOnItemClickListener((jl0) r42);
            rwVar.setGlowColor(A(i18));
            pwVar.addView(rwVar);
            this.U = new c2.y(rwVar, swVar);
            uw uwVar = new uw(this, context2);
            this.D0 = uwVar;
            pwVar.addView(uwVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + i12));
            bh.e eVar2 = new bh.e(context2, g6Var2);
            this.E0 = eVar2;
            eVar2.setVisibility(8);
            final int i25 = 1;
            eVar2.setOnBackClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ew
                public final /* synthetic */ mz b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i25) {
                        case 0:
                            ly lyVar = this.b.P;
                            fy fyVar = lyVar.c;
                            int childCount = fyVar.getChildCount();
                            for (int i202 = 0; i202 < childCount; i202++) {
                                ((bh.d) fyVar.getChildAt(i202)).a(false, true);
                            }
                            lyVar.d = 0L;
                            lyVar.C.b.a(false, true);
                            lyVar.l();
                            break;
                        case 1:
                            hz hzVar = this.b.w0;
                            gz gzVar = hzVar.c;
                            int childCount2 = gzVar.getChildCount();
                            for (int i212 = 0; i212 < childCount2; i212++) {
                                ((bh.d) gzVar.getChildAt(i212)).a(false, true);
                            }
                            hzVar.d = 0L;
                            hzVar.N.a.a(false, true);
                            hzVar.l();
                            break;
                        case 2:
                            my myVar = this.b.q1;
                            if (myVar != null) {
                                myVar.w();
                                break;
                            }
                            break;
                        default:
                            mz mzVar = this.b;
                            int currentItem = mzVar.h.getCurrentItem();
                            yy yyVar = currentItem == 0 ? mzVar.S : currentItem == 1 ? mzVar.l0 : mzVar.D0;
                            if (yyVar != null) {
                                iq iqVar = yyVar.d;
                                iqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                iqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                iqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
            pwVar.addView(eVar2, new FrameLayout.LayoutParams(-1, i12));
            z18 = z13;
            z19 = true;
            vw vwVar = new vw(this, context2, g6Var2, p2Var, z18);
            this.y0 = vwVar;
            vwVar.setDragEnabled(true);
            vwVar.setWillNotDraw(false);
            vwVar.setType(pm0Var);
            vwVar.setUnderlineHeight(rwVar.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
            vwVar.setIndicatorColor(A(i10));
            vwVar.setUnderlineColor(A(i20));
            if (viewGroup == null || !z18) {
                pwVar.addView(vwVar, k7.c6.e(-1, 36, 51));
            } else {
                ww wwVar = new ww(this, context2);
                this.z0 = wwVar;
                wwVar.addView(vwVar, k7.c6.e(-1, 36, 51));
                viewGroup.addView(wwVar, k7.c6.c(-2.0f, -1));
            }
            Z(true);
            vwVar.setDelegate(new dw(this, 3));
            rwVar.setOnScrollListener(new lz(this, 0));
            bh.c cVar3 = new bh.c(context2, g6Var2);
            this.K = cVar3;
            ag.l lVar3 = new ag.l(context2, 1, g6Var2);
            this.J = lVar3;
            lVar3.setVisibility(8);
            lVar3.addView(cVar3, k7.c6.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
            pwVar.addView(lVar3, k7.c6.e(-1, -2, 80));
        } else {
            z18 = z13;
            z19 = true;
        }
        this.e.clear();
        this.e.addAll(this.d);
        xw xwVar = new xw(this, context2);
        this.h = xwVar;
        ey eyVar = new ey(this);
        this.I0 = eyVar;
        xwVar.setAdapter(eyVar);
        yw ywVar = new yw(this, context2);
        this.x = ywVar;
        ywVar.setHapticFeedbackEnabled(z19);
        ywVar.setImageResource(R.drawable.smiles_tab_clear);
        int v = z15 ? v(0.6f) : A(org.telegram.ui.ActionBar.k6.Re);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        ywVar.setColorFilter(new PorterDuffColorFilter(v, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        ywVar.setScaleType(scaleType);
        ywVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        ywVar.setFocusable(z19);
        ywVar.setOnClickListener(new zw());
        k7.e6.a(ywVar);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.r = frameLayout;
        if (z12) {
            addView(frameLayout, k7.c6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, (AndroidUtilities.getShadowHeight() / AndroidUtilities.density) + 40.0f));
        } else {
            addView(frameLayout, k7.c6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.s = frameLayout2;
        addView(frameLayout2, k7.c6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.n = frameLayout3;
        View view2 = new View(context2);
        this.v = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(40.0f), 83));
        if (z12) {
            addView(frameLayout3, k7.c6.e(-1, 48, 80));
            frameLayout3.addView(ywVar, k7.c6.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
            if (z10) {
                ImageView imageView = new ImageView(context2);
                this.y = imageView;
                imageView.setImageResource(R.drawable.smiles_tab_settings);
                imageView.setColorFilter(new PorterDuffColorFilter(z15 ? v(0.6f) : A(org.telegram.ui.ActionBar.k6.Re), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(LocaleController.getString(R.string.Settings));
                k7.e6.a(imageView);
                frameLayout3.addView(imageView, k7.c6.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
                final int i26 = 2;
                imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ew
                    public final /* synthetic */ mz b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i26) {
                            case 0:
                                ly lyVar = this.b.P;
                                fy fyVar = lyVar.c;
                                int childCount = fyVar.getChildCount();
                                for (int i202 = 0; i202 < childCount; i202++) {
                                    ((bh.d) fyVar.getChildAt(i202)).a(false, true);
                                }
                                lyVar.d = 0L;
                                lyVar.C.b.a(false, true);
                                lyVar.l();
                                break;
                            case 1:
                                hz hzVar = this.b.w0;
                                gz gzVar = hzVar.c;
                                int childCount2 = gzVar.getChildCount();
                                for (int i212 = 0; i212 < childCount2; i212++) {
                                    ((bh.d) gzVar.getChildAt(i212)).a(false, true);
                                }
                                hzVar.d = 0L;
                                hzVar.N.a.a(false, true);
                                hzVar.l();
                                break;
                            case 2:
                                my myVar = this.b.q1;
                                if (myVar != null) {
                                    myVar.w();
                                    break;
                                }
                                break;
                            default:
                                mz mzVar = this.b;
                                int currentItem = mzVar.h.getCurrentItem();
                                yy yyVar = currentItem == 0 ? mzVar.S : currentItem == 1 ? mzVar.l0 : mzVar.D0;
                                if (yyVar != null) {
                                    iq iqVar = yyVar.d;
                                    iqVar.requestFocus();
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                    iqVar.onTouchEvent(obtain);
                                    obtain.recycle();
                                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                    iqVar.onTouchEvent(obtain2);
                                    obtain2.recycle();
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
            hd0 hd0Var = new hd0(context2, g6Var2);
            this.w = hd0Var;
            hd0Var.setViewPager(xwVar);
            hd0Var.setShouldExpand(false);
            hd0Var.setIndicatorHeight(AndroidUtilities.dp(3.0f));
            hd0Var.setIndicatorColor(i0.a.k(A(org.telegram.ui.ActionBar.k6.Oe), 20));
            hd0Var.setUnderlineHeight(0);
            hd0Var.setTabPaddingLeftRight(AndroidUtilities.dp(11.0f));
            hd0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
            frameLayout3.addView(hd0Var, k7.c6.e(-2, 48, 81));
            hd0Var.setOnPageChangeListener(new ax(this, z18));
            ImageView imageView2 = new ImageView(context2);
            this.B = imageView2;
            imageView2.setImageResource(R.drawable.smiles_tab_search);
            imageView2.setColorFilter(new PorterDuffColorFilter(z15 ? v(0.6f) : A(org.telegram.ui.ActionBar.k6.Re), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(LocaleController.getString(R.string.Search));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, k7.c6.d(48, 48.0f, 83, 2.0f, 0.0f, 2.0f, 0.0f));
            final int i27 = 3;
            imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ew
                public final /* synthetic */ mz b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view22) {
                    switch (i27) {
                        case 0:
                            ly lyVar = this.b.P;
                            fy fyVar = lyVar.c;
                            int childCount = fyVar.getChildCount();
                            for (int i202 = 0; i202 < childCount; i202++) {
                                ((bh.d) fyVar.getChildAt(i202)).a(false, true);
                            }
                            lyVar.d = 0L;
                            lyVar.C.b.a(false, true);
                            lyVar.l();
                            break;
                        case 1:
                            hz hzVar = this.b.w0;
                            gz gzVar = hzVar.c;
                            int childCount2 = gzVar.getChildCount();
                            for (int i212 = 0; i212 < childCount2; i212++) {
                                ((bh.d) gzVar.getChildAt(i212)).a(false, true);
                            }
                            hzVar.d = 0L;
                            hzVar.N.a.a(false, true);
                            hzVar.l();
                            break;
                        case 2:
                            my myVar = this.b.q1;
                            if (myVar != null) {
                                myVar.w();
                                break;
                            }
                            break;
                        default:
                            mz mzVar = this.b;
                            int currentItem = mzVar.h.getCurrentItem();
                            yy yyVar = currentItem == 0 ? mzVar.S : currentItem == 1 ? mzVar.l0 : mzVar.D0;
                            if (yyVar != null) {
                                iq iqVar = yyVar.d;
                                iqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                iqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                iqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            addView(frameLayout3, k7.c6.d(56, 48.0f, (LocaleController.isRTL ? 3 : 5) | 80, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.k6.h0(AndroidUtilities.dp(56.0f), A(i18), A(i18));
            k7.e6.a(ywVar);
            ywVar.setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
            ywVar.setBackground(h02);
            ywVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
            ywVar.setFocusable(true);
            frameLayout3.addView(ywVar, k7.c6.d(48, 48.0f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
            view2.setVisibility(8);
        }
        addView(xwVar, 0, k7.c6.e(-1, -1, 51));
        hg.q qVar = new hg.q(context2, 21);
        this.K0 = qVar;
        qVar.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(6.0f), A(org.telegram.ui.ActionBar.k6.qf)));
        qVar.setTextColor(A(org.telegram.ui.ActionBar.k6.pf));
        qVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f));
        qVar.setGravity(16);
        qVar.setTextSize(1, 14.0f);
        int i28 = 4;
        qVar.setVisibility(4);
        addView(qVar, k7.c6.d(-2, -2.0f, 81, 5.0f, 0.0f, 5.0f, 53.0f));
        this.z1 = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 32.0f);
        Field field2 = tu.f;
        tu tuVar = new tu(new su(context2, g6Var2));
        if (tu.f == null) {
            try {
                field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    field.setAccessible(true);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                field = null;
            }
            tu.f = field;
        }
        Field field3 = tu.f;
        if (field3 != null) {
            try {
                tuVar.a = (ViewTreeObserver.OnScrollChangedListener) field3.get(tuVar);
                tu.f.set(tuVar, tu.g);
            } catch (Exception unused3) {
                tuVar.a = null;
            }
        }
        this.y1 = tuVar;
        tuVar.c.setOnSelectionUpdateListener(new d(this, 10));
        this.x1 = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
        Emoji.loadRecentEmoji();
        txVar3.F(false);
        J(true, z10, z11, false);
        if (Build.VERSION.SDK_INT >= 31) {
            tg.d dVar = new tg.d(null);
            this.i2 = dVar;
            og.a aVar = new og.a(dVar);
            this.k2 = aVar;
            aVar.f = LiteMode.isEnabled(262144);
            this.g2 = new og.e(false);
        } else {
            this.i2 = null;
            this.k2 = new og.a(this.j2);
            this.g2 = null;
        }
        vg.i iVar = new vg.i(this);
        hd0 hd0Var2 = this.w;
        if (hd0Var2 != null) {
            iVar.d(hd0Var2, this, new dw(this, i28), false);
        }
        og.a aVar2 = this.k2;
        aVar2.d = iVar;
        aVar2.e = this;
        pg.a[] aVarArr = new pg.a[3];
        kx kxVar3 = kxVar;
        kxVar3.C0(new aw(this, 1));
        aVarArr[0] = new og.k(kxVar3, this, new bw(kxVar3, 0));
        lw lwVar2 = this.e0;
        if (lwVar2 != null) {
            lwVar2.C0(new aw(this, 3));
            lw lwVar3 = this.e0;
            Objects.requireNonNull(lwVar3);
            aVarArr[1] = new og.k(lwVar3, this, new bw(lwVar3, 1));
        }
        rw rwVar2 = this.A0;
        if (rwVar2 != null) {
            rwVar2.C0(new aw(this, i28));
            aVarArr[2] = new og.k(this.A0, this, new bw(this, 2));
        }
        this.h2 = new ah(aVarArr, 1);
        setBlurredBackgroundDrawableFactory(this.k2);
    }

    public static void a(mz mzVar, boolean z4) {
        lw lwVar = mzVar.e0;
        if (lwVar == null) {
            return;
        }
        int childCount = lwVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = lwVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.e2) {
                ImageReceiver photoImage = ((org.telegram.ui.Cells.e2) childAt).getPhotoImage();
                if (z4) {
                    photoImage.setAllowStartAnimation(true);
                    photoImage.startAnimation();
                } else {
                    photoImage.setAllowStartAnimation(false);
                    photoImage.stopAnimation();
                }
            }
        }
    }

    public static void d(mz mzVar, uy uyVar, String str) {
        String str2;
        my myVar;
        org.telegram.ui.ActionBar.p2 p2Var = mzVar.V1;
        int i10 = mzVar.Z0;
        ArrayList arrayList = mzVar.n1;
        if (uyVar == null) {
            return;
        }
        if (uyVar.getSpan() == null) {
            mzVar.C2 = SystemClock.elapsedRealtime();
            mzVar.O(true);
            String str3 = str != null ? str : (String) uyVar.getTag();
            new SpannableStringBuilder().append((CharSequence) str3);
            if (str != null) {
                my myVar2 = mzVar.q1;
                if (myVar2 != null) {
                    myVar2.l(Emoji.fixEmoji(str));
                    return;
                }
                return;
            }
            if (!uyVar.c && (str2 = Emoji.emojiColor.get(str3)) != null) {
                str3 = g(str3, str2);
            }
            mzVar.h(str3);
            my myVar3 = mzVar.q1;
            if (myVar3 != null) {
                myVar3.l(Emoji.fixEmoji(str3));
                return;
            }
            return;
        }
        if (mzVar.q1 != null) {
            long j10 = uyVar.getSpan().documentId;
            TLRPC.Document document = uyVar.getSpan().document;
            xx xxVar = uyVar.e;
            boolean z4 = xxVar != null && xxVar.i;
            if (document == null) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    xx xxVar2 = (xx) arrayList.get(i11);
                    int i12 = 0;
                    while (true) {
                        ArrayList arrayList2 = xxVar2.c;
                        if (arrayList2 != null && i12 < arrayList2.size()) {
                            if (((TLRPC.Document) xxVar2.c.get(i12)).id == j10) {
                                document = (TLRPC.Document) xxVar2.c.get(i12);
                                break;
                            }
                            i12++;
                        }
                    }
                }
            }
            if (document == null) {
                document = l5.f(i10, j10);
            }
            String findAnimatedEmojiEmoticon = document != null ? MessageObject.findAnimatedEmojiEmoticon(document) : null;
            if (MessageObject.isFreeEmoji(document) || UserConfig.getInstance(i10).isPremium() || (((myVar = mzVar.q1) != null && myVar.g()) || mzVar.R0 || z4)) {
                mzVar.C2 = SystemClock.elapsedRealtime();
                mzVar.O(true);
                mzVar.h("animated_" + j10);
                mzVar.q1.x(j10, document, findAnimatedEmojiEmoticon, uyVar.c);
                return;
            }
            mzVar.O(false);
            qc a02 = p2Var != null ? qc.a0(p2Var) : new qc(mzVar.r, mzVar.W1);
            if (mzVar.e2 || p2Var == null) {
                a02.q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new aw(mzVar, 7)).j();
            } else {
                a02.J(R.raw.saved_messages, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint2)), LocaleController.getString(R.string.Open), new aw(mzVar, 8)).j();
            }
            mzVar.e2 = !mzVar.e2;
        }
    }

    public static void e(mz mzVar, int i10, int i11) {
        f2.m1 K;
        int[] iArr = mzVar.N0;
        if (i10 == 1) {
            mzVar.n(mzVar.M, i11);
            return;
        }
        my myVar = mzVar.q1;
        if ((myVar == null || !myVar.z()) && !mzVar.G0) {
            tl0 x10 = mzVar.x(i10);
            if (i11 <= 0 || x10 == null || x10.getVisibility() != 0 || (K = x10.K(0)) == null || K.a.getTop() + mzVar.Y0 < x10.getPaddingTop()) {
                int i12 = iArr[i10] - i11;
                iArr[i10] = i12;
                if (i12 > 0) {
                    iArr[i10] = 0;
                } else if (i12 < (-AndroidUtilities.dp(288.0f))) {
                    iArr[i10] = -AndroidUtilities.dp(288.0f);
                }
                if (i10 == 0) {
                    mzVar.a0();
                } else {
                    mzVar.y(i10).setTranslationY(Math.max(-AndroidUtilities.dp(48.0f), iArr[i10]));
                }
            }
        }
    }

    public static void f(mz mzVar, boolean z4) {
        int N0;
        ry ryVar = mzVar.f0;
        ow owVar = mzVar.l0;
        lw lwVar = mzVar.e0;
        if (lwVar != null && (lwVar.getAdapter() instanceof qy)) {
            qy qyVar = (qy) lwVar.getAdapter();
            if (!qyVar.s && qyVar.h == 0 && !qyVar.x.isEmpty() && (N0 = ryVar.N0()) != -1 && N0 > ryVar.B() - 5) {
                String str = qyVar.w;
                String str2 = qyVar.r;
                boolean z10 = qyVar.v;
                qyVar.F(str, str2, true, z10, z10);
            }
        }
        my myVar = mzVar.q1;
        if (myVar == null || !myVar.z()) {
            if (owVar == null || lwVar == null) {
                return;
            }
            owVar.a.a(true, !z4);
            return;
        }
        f2.m1 K = lwVar.K(0);
        if (K == null) {
            yy.a(owVar, true, !z4);
        } else {
            yy.a(owVar, K.a.getTop() < lwVar.getPaddingTop(), !z4);
        }
    }

    public static String g(String str, String str2) {
        boolean z4;
        String str3;
        if (CompoundEmoji.isHandshake(str) != null) {
            return CompoundEmoji.applyColor(str, str2);
        }
        if (Emoji.endsWithRightArrow(str)) {
            str = e2.c.j(str, 2, 0);
            z4 = true;
        } else {
            z4 = false;
        }
        int length = str.length();
        if (length > 2 && str.charAt(str.length() - 2) == 8205) {
            str3 = str.substring(str.length() - 2);
            str = e2.c.j(str, 2, 0);
        } else if (length <= 3 || str.charAt(str.length() - 3) != 8205) {
            str3 = null;
        } else {
            str3 = str.substring(str.length() - 3);
            str = e2.c.j(str, 3, 0);
        }
        String e6 = w.c.e(str, str2);
        if (str3 != null) {
            e6 = w.c.e(e6, str3);
        }
        return z4 ? w.c.e(e6, "\u200d➡") : e6;
    }

    public static void j(int i10, View view) {
        if (view == null) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i10);
    }

    public final int A(int i10) {
        org.telegram.ui.ActionBar.g6 g6Var = this.W1;
        return g6Var != null ? g6Var.B0(i10) : org.telegram.ui.ActionBar.k6.w0(null, i10, false);
    }

    public final void B() {
        uw uwVar = this.D0;
        if (uwVar != null) {
            uwVar.b();
        }
        ow owVar = this.l0;
        if (owVar != null) {
            owVar.b();
        }
        iw iwVar = this.S;
        if (iwVar != null) {
            iwVar.b();
        }
    }

    public final void C() {
        og.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.g2) == null) {
            return;
        }
        hd0 hd0Var = this.w;
        RectF rectF = this.w2;
        vg.i.c(hd0Var, this, rectF);
        rectF.inset(LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f), LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        rectF.right = getMeasuredWidth();
        rectF.bottom = Math.min(rectF.bottom, getMeasuredHeight());
        eVar.g(1, this.x2);
        eVar.e(this.h2, getWidth(), getHeight());
    }

    public final void D() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        int i10 = this.Z0;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.groupPackUpdated);
        if (this.v0 != null) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.featuredStickersDidLoad);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.groupStickersDidLoad);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        }
    }

    public final void E(boolean z4, boolean z10) {
        xy xyVar;
        if (this.x1 != 0 && this.t1) {
            this.x1 = 0;
        }
        if (this.x1 == 0 && this.s1) {
            this.x1 = 1;
        }
        int i10 = this.x1;
        xw xwVar = this.h;
        if (i10 == 0 || z4 || this.e.size() == 1) {
            N(true, false);
            S(false, false);
            if (xwVar.getCurrentItem() != 0) {
                xwVar.x(0, !z4);
            }
            if (z10) {
                AndroidUtilities.runOnUIThread(new aw(this, 9), 350L);
            }
        } else {
            int i11 = this.x1;
            if (i11 == 1) {
                N(false, false);
                S(this.r0 || this.s0, false);
                if (xwVar.getCurrentItem() != 2) {
                    xwVar.x(2, false);
                }
                vw vwVar = this.y0;
                if (vwVar != null) {
                    this.P0 = true;
                    int i12 = this.D1;
                    if (i12 >= 0) {
                        vwVar.m(i12);
                    } else {
                        int i13 = this.C1;
                        if (i13 >= 0) {
                            vwVar.m(i13);
                        } else {
                            vwVar.m(this.B1);
                        }
                    }
                    this.P0 = false;
                    this.B0.h1(0, 0);
                }
            } else if (i11 == 2) {
                N(false, false);
                S(false, false);
                if (xwVar.getCurrentItem() != 1) {
                    xwVar.x(1, false);
                }
                rx rxVar = this.m0;
                if (rxVar != null) {
                    rxVar.m(0);
                }
                ow owVar = this.l0;
                if (owVar != null && (xyVar = owVar.r) != null) {
                    xyVar.F1(null);
                }
            }
        }
        O(true);
    }

    public final void F() {
        dz dzVar = this.v0;
        if (dzVar != null) {
            dzVar.l();
        }
        hz hzVar = this.w0;
        if (hzVar != null) {
            hzVar.l();
        }
        if (org.telegram.ui.qt.q().E) {
            org.telegram.ui.qt.q().n();
        }
        org.telegram.ui.qt.q().u();
    }

    public final void G(int i10) {
        my myVar = this.q1;
        if ((myVar == null || !myVar.z()) && i10 != 0) {
            HorizontalScrollView y10 = y(i10);
            this.N0[i10] = 0;
            y10.setTranslationY(0);
        }
    }

    public final void H(int i10, int i11) {
        lx lxVar = this.N;
        View m9 = lxVar.m(i10);
        int L0 = lxVar.L0();
        if ((m9 == null && Math.abs(i10 - L0) > lxVar.J * 9.0f) || !SharedConfig.animationsEnabled()) {
            int i12 = lxVar.L0() < i10 ? 0 : 1;
            c2.y yVar = this.V;
            yVar.b = i12;
            yVar.c(i10, i11, false, false);
            return;
        }
        this.G0 = true;
        fx fxVar = new fx(this, this.M.getContext(), 0);
        fxVar.a = i10;
        fxVar.p = i11;
        lxVar.w0(fxVar);
    }

    public final void I(int i10, int i11) {
        sw swVar = this.B0;
        View m9 = swVar.m(i10);
        int L0 = swVar.L0();
        if (m9 != null || Math.abs(i10 - L0) <= 40) {
            this.G0 = true;
            this.A0.x0(i10);
        } else {
            int i12 = swVar.L0() < i10 ? 0 : 1;
            c2.y yVar = this.U;
            yVar.b = i12;
            yVar.c(i10, i11, false, false);
        }
    }

    public final void J(boolean z4, boolean z10, boolean z11, boolean z12) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i10 >= arrayList2.size()) {
                break;
            }
            if (((iz) arrayList2.get(i10)).a == 0 && z4) {
                arrayList.add((iz) arrayList2.get(i10));
            }
            if (((iz) arrayList2.get(i10)).a == 1 && z11) {
                arrayList.add((iz) arrayList2.get(i10));
            }
            if (((iz) arrayList2.get(i10)).a == 2 && z10) {
                arrayList.add((iz) arrayList2.get(i10));
            }
            i10++;
        }
        hd0 hd0Var = this.w;
        if (hd0Var != null) {
            AndroidUtilities.updateViewVisibilityAnimated(hd0Var, arrayList.size() > 1, 1.0f, z12);
        }
        xw xwVar = this.h;
        if (xwVar != null) {
            xwVar.setAdapter(null);
            xwVar.setAdapter(this.I0);
            if (hd0Var != null) {
                hd0Var.setViewPager(xwVar);
            }
        }
    }

    public final void K(final bh.c cVar, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z4, boolean z10) {
        hz hzVar;
        ly lyVar;
        if (stickerSet == null) {
            return;
        }
        if (!z4 || (lyVar = this.P) == null || lyVar.d == stickerSet.id) {
            if (z4 || (hzVar = this.w0) == null || hzVar.d == stickerSet.id) {
                final boolean isStickerPackInstalled = MediaDataController.getInstance(this.Z0).isStickerPackInstalled(stickerSet.id);
                cVar.g(isStickerPackInstalled ? stickerSet.masks ? LocaleController.formatPluralString("RemoveManyMasksCount", stickerSet.count, new Object[0]) : stickerSet.emojis ? LocaleController.formatPluralString("RemoveManyEmojiCount", stickerSet.count, new Object[0]) : LocaleController.formatPluralString("RemoveManyStickersCount", stickerSet.count, new Object[0]) : stickerSet.masks ? LocaleController.formatPluralString("AddManyMasksCount", stickerSet.count, new Object[0]) : stickerSet.emojis ? LocaleController.formatPluralString("AddManyEmojiCount", stickerSet.count, new Object[0]) : LocaleController.formatPluralString("AddManyStickersCount", stickerSet.count, new Object[0]), z10, true);
                cVar.e0.a(!isStickerPackInstalled, z10);
                cVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.gw
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        mz mzVar = mz.this;
                        MediaDataController mediaDataController = MediaDataController.getInstance(mzVar.Z0);
                        Context context = mzVar.getContext();
                        int i10 = isStickerPackInstalled ? 0 : 2;
                        org.telegram.ui.ActionBar.p2 p2Var = mzVar.V1;
                        FrameLayout frameLayout = mzVar.s;
                        bh.c cVar2 = cVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z11 = z4;
                        mediaDataController.toggleStickerSet(context, tLObject2, document2, i10, p2Var, frameLayout, false, true, new j3.n1(mzVar, cVar2, tLObject2, stickerSet2, document2, z11, 10), false);
                        mzVar.K(cVar2, tLObject2, stickerSet2, document2, z11, true);
                    }
                });
            }
        }
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        if (i10 == 0) {
            q(false);
            float f12 = 1.0f - this.a.e;
            uw uwVar = this.D0;
            uwVar.setAlpha(f12);
            uwVar.setVisibility(f12 > 0.0f ? 0 : 4);
            float f13 = 1.0f - f12;
            bh.e eVar = this.E0;
            eVar.setAlpha(f13);
            eVar.setTranslationY((-AndroidUtilities.dp(15.0f)) * f12);
            eVar.setVisibility(f13 > 0.0f ? 0 : 4);
            ag.l lVar = this.J;
            lVar.setAlpha(f13);
            lVar.setTranslationY(AndroidUtilities.dp(30.0f) * f12);
            lVar.setVisibility(f13 > 0.0f ? 0 : 4);
            T();
            this.u0.invalidate();
            return;
        }
        if (i10 == 1) {
            l(false);
            float f14 = 1.0f - this.b.e;
            iw iwVar = this.S;
            iwVar.setAlpha(f14);
            iwVar.setVisibility(f14 > 0.0f ? 0 : 4);
            float f15 = 1.0f - f14;
            bh.e eVar2 = this.R;
            eVar2.setAlpha(f15);
            eVar2.setTranslationY((-AndroidUtilities.dp(15.0f)) * f14);
            eVar2.setVisibility(f15 > 0.0f ? 0 : 4);
            ag.l lVar2 = this.H;
            lVar2.setAlpha(f15);
            lVar2.setTranslationY(AndroidUtilities.dp(30.0f) * f14);
            lVar2.setVisibility(f15 > 0.0f ? 0 : 4);
            T();
            this.G.invalidate();
        }
    }

    public final void M(long j10, boolean z4, boolean z10) {
        hd0 hd0Var = this.w;
        if (hd0Var == null) {
            return;
        }
        this.s1 = z4;
        this.t1 = z10;
        if (z10 || z4) {
            this.r1 = j10;
        } else {
            this.r1 = 0L;
        }
        int i10 = z10 ? 2 : 0;
        LinearLayout linearLayout = hd0Var.d;
        View childAt = i10 >= linearLayout.getChildCount() ? null : linearLayout.getChildAt(i10);
        if (childAt != null) {
            childAt.setAlpha(this.r1 != 0 ? 0.15f : 1.0f);
            xw xwVar = this.h;
            if (z10) {
                if (this.r1 == 0 || xwVar.getCurrentItem() == 0) {
                    return;
                }
                N(true, true);
                S(false, true);
                xwVar.x(0, false);
                return;
            }
            if (this.r1 == 0 || xwVar.getCurrentItem() == 1) {
                return;
            }
            N(false, true);
            S(false, true);
            xwVar.x(1, false);
        }
    }

    public final void N(boolean z4, boolean z10) {
        yw ywVar = this.x;
        if (z4 && ywVar.getTag() == null) {
            return;
        }
        if ((z4 || ywVar.getTag() == null) && !this.l2) {
            AnimatorSet animatorSet = this.C;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.C = null;
            }
            ywVar.setTag(z4 ? null : 1);
            if (!z10) {
                ywVar.setAlpha(z4 ? 1.0f : 0.0f);
                ywVar.setScaleX(z4 ? 1.0f : 0.0f);
                ywVar.setScaleY(z4 ? 1.0f : 0.0f);
                ywVar.setVisibility(z4 ? 0 : 4);
                return;
            }
            if (z4) {
                ywVar.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.C = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(ywVar, (Property<yw, Float>) View.ALPHA, z4 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(ywVar, (Property<yw, Float>) View.SCALE_X, z4 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(ywVar, (Property<yw, Float>) View.SCALE_Y, z4 ? 1.0f : 0.0f));
            this.C.setDuration(200L);
            this.C.setInterpolator(pr.g);
            this.C.addListener(new gx(this, z4, r2));
            this.C.start();
        }
    }

    public final void O(boolean z4) {
        this.E = 0.0f;
        my myVar = this.q1;
        if (myVar != null && myVar.z()) {
            z4 = false;
        }
        FrameLayout frameLayout = this.n;
        if (z4 && frameLayout.getTag() == null) {
            return;
        }
        if (z4 || frameLayout.getTag() == null) {
            frameLayout.setTag(z4 ? null : 1);
            this.D2.a(z4, true);
        }
    }

    public final void P(boolean z4, boolean z10) {
        View view = this.L;
        if (z4 && view.getTag() == null) {
            return;
        }
        if (z4 || view.getTag() == null) {
            AnimatorSet animatorSet = this.T;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.T = null;
            }
            view.setTag(z4 ? null : 1);
            if (!z10) {
                view.setAlpha(z4 ? 1.0f : 0.0f);
                return;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.T = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z4 ? 1.0f : 0.0f));
            this.T.setDuration(200L);
            this.T.setInterpolator(pr.g);
            this.T.addListener(new a9(this, 18));
            this.T.start();
        }
    }

    public final void Q(boolean z4) {
        for (int i10 = 0; i10 < 3; i10++) {
            f2.w w10 = w(i10);
            int L0 = w10.L0();
            if (z4) {
                if (L0 == 1 || L0 == 2) {
                    w10.n0(0);
                    G(i10);
                }
            } else if (L0 == 0) {
                w10.h1(0, 0);
            }
        }
    }

    public final void R(boolean z4, boolean z10, boolean z11) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.Chat chat = MessagesController.getInstance(this.Z0).getChat(Long.valueOf(this.r1));
        if (chat == null) {
            return;
        }
        hg.q qVar = this.K0;
        if (z4) {
            if (ChatObject.hasAdminRights(chat) || (tL_chatBannedRights = chat.default_banned_rights) == null || !(tL_chatBannedRights.send_stickers || (z10 && tL_chatBannedRights.send_plain))) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.banned_rights;
                if (tL_chatBannedRights2 == null) {
                    return;
                }
                if (!AndroidUtilities.isBannedForever(tL_chatBannedRights2)) {
                    if (z10) {
                        qVar.setText(LocaleController.formatString("AttachPlainRestricted", R.string.AttachPlainRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    }
                    if (z11) {
                        qVar.setText(LocaleController.formatString("AttachGifRestricted", R.string.AttachGifRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    } else {
                        qVar.setText(LocaleController.formatString("AttachStickersRestricted", R.string.AttachStickersRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    }
                } else if (z10) {
                    qVar.setText(LocaleController.getString(R.string.AttachPlainRestrictedForever));
                } else if (z11) {
                    qVar.setText(LocaleController.getString(R.string.AttachGifRestrictedForever));
                } else {
                    qVar.setText(LocaleController.getString(R.string.AttachStickersRestrictedForever));
                }
            } else {
                org.telegram.ui.ActionBar.p2 p2Var = this.V1;
                if ((p2Var instanceof org.telegram.ui.xn) && ((org.telegram.ui.xn) p2Var).K6()) {
                    return;
                }
                if (z10) {
                    qVar.setText(LocaleController.getString(R.string.GlobalAttachEmojiRestricted));
                } else if (z11) {
                    qVar.setText(LocaleController.getString(R.string.GlobalAttachGifRestricted));
                } else {
                    qVar.setText(LocaleController.getString(R.string.GlobalAttachStickersRestricted));
                }
            }
            qVar.setVisibility(0);
        }
        AnimatorSet animatorSet = this.G2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.G2 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.G2 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(qVar, (Property<hg.q, Float>) View.ALPHA, z4 ? qVar.getAlpha() : 1.0f, z4 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(qVar, (Property<hg.q, Float>) View.TRANSLATION_Y, z4 ? AndroidUtilities.dp(12.0f) : qVar.getTranslationY(), z4 ? 0.0f : AndroidUtilities.dp(12.0f)));
        org.telegram.messenger.video.l lVar = this.H2;
        if (lVar != null) {
            AndroidUtilities.cancelRunOnUIThread(lVar);
        }
        if (z4) {
            org.telegram.messenger.video.l lVar2 = new org.telegram.messenger.video.l(this, z10, z11, 3);
            this.H2 = lVar2;
            AndroidUtilities.runOnUIThread(lVar2, 3500L);
        }
        this.G2.setDuration(320L);
        this.G2.setInterpolator(pr.h);
        this.G2.start();
    }

    public final void S(boolean z4, boolean z10) {
        ImageView imageView = this.y;
        if (imageView == null || this.m2) {
            return;
        }
        if (z4 && imageView.getTag() == null) {
            return;
        }
        if (z4 || imageView.getTag() == null) {
            AnimatorSet animatorSet = this.D;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.D = null;
            }
            int i10 = 1;
            imageView.setTag(z4 ? null : 1);
            if (!z10) {
                imageView.setAlpha(z4 ? 1.0f : 0.0f);
                imageView.setScaleX(z4 ? 1.0f : 0.0f);
                imageView.setScaleY(z4 ? 1.0f : 0.0f);
                imageView.setVisibility(z4 ? 0 : 4);
                return;
            }
            if (z4) {
                imageView.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.D = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.ALPHA, z4 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_X, z4 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_Y, z4 ? 1.0f : 0.0f));
            this.D.setDuration(200L);
            this.D.setInterpolator(pr.g);
            this.D.addListener(new gx(this, z4, i10));
            this.D.start();
        }
    }

    public final void T() {
        org.telegram.ui.ActionBar.p2 p2Var;
        if (((View) getParent()) != null) {
            float y10 = (getY() + (getLayoutParams().height > 0 ? getLayoutParams().height : getMeasuredHeight())) - (((AndroidUtilities.isInMultiwindow || ((p2Var = this.V1) != null && p2Var.isInBubbleMode())) && !this.S0) ? AndroidUtilities.dp(1.0f) : r0.getHeight());
            float f10 = this.o2;
            FrameLayout frameLayout = this.n;
            if (f10 >= 0.0f) {
                y10 += getMeasuredHeight() - this.o2;
            } else if (frameLayout.getTop() - y10 < 0.0f || !this.u2) {
                y10 = 0.0f;
            }
            float f11 = -y10;
            boolean z4 = this.a0;
            float lerp = f11 + AndroidUtilities.lerp(AndroidUtilities.dp(z4 ? 45.0f : 50.0f), -this.n2, this.D2.e);
            frameLayout.setTranslationY(lerp);
            if (z4) {
                this.r.setTranslationY(lerp);
            }
        }
    }

    public final void U() {
        yy yyVar;
        boolean z4;
        vv vvVar;
        boolean z10 = this.r0;
        View view = this.v;
        if (!z10) {
            setBackground(null);
            view.setBackground(null);
        } else if (AndroidUtilities.isInMultiwindow || this.K1) {
            Drawable background = getBackground();
            if (background != null) {
                background.setColorFilter(new PorterDuffColorFilter(A(org.telegram.ui.ActionBar.k6.He), PorterDuff.Mode.MULTIPLY));
            }
        } else {
            int i10 = org.telegram.ui.ActionBar.k6.He;
            setBackgroundColor(A(i10));
            if (this.a0) {
                view.setBackgroundColor(A(i10));
            }
        }
        hw hwVar = this.F;
        if (hwVar != null) {
            if (this.r0) {
                hwVar.setBackgroundColor(A(org.telegram.ui.ActionBar.k6.He));
                this.L.setBackgroundColor(A(org.telegram.ui.ActionBar.k6.Ke));
            } else {
                hwVar.setBackground(null);
            }
        }
        tu tuVar = this.y1;
        if (tuVar != null) {
            tuVar.c.a();
        }
        int i11 = 0;
        while (true) {
            yyVar = this.S;
            z4 = this.f2;
            if (i11 >= 3) {
                break;
            }
            if (i11 == 0) {
                yyVar = this.D0;
            } else if (i11 != 1) {
                yyVar = this.l0;
            }
            if (yyVar != null) {
                iq iqVar = yyVar.d;
                FrameLayout frameLayout = yyVar.n;
                View view2 = yyVar.f;
                if (this.r0) {
                    view2.setBackgroundColor(A(org.telegram.ui.ActionBar.k6.He));
                } else {
                    view2.setBackground(null);
                }
                yyVar.e.setBackgroundColor(A(org.telegram.ui.ActionBar.k6.Ke));
                yyVar.c.a(z4 ? v(0.4f) : A(org.telegram.ui.ActionBar.k6.Je));
                org.telegram.ui.ActionBar.k6.w1(z4 ? v(0.06f) : A(org.telegram.ui.ActionBar.k6.Ie), frameLayout.getBackground());
                frameLayout.invalidate();
                iqVar.setHintTextColor(z4 ? v(0.45f) : A(org.telegram.ui.ActionBar.k6.Je));
                iqVar.setTextColor(z4 ? v(0.8f) : A(org.telegram.ui.ActionBar.k6.G6));
            }
            i11++;
        }
        Paint paint = this.p1;
        if (paint != null) {
            paint.setColor(A(org.telegram.ui.ActionBar.k6.af));
        }
        kx kxVar = this.M;
        if (kxVar != null) {
            kxVar.setGlowColor(A(org.telegram.ui.ActionBar.k6.He));
        }
        rw rwVar = this.A0;
        if (rwVar != null) {
            rwVar.setGlowColor(A(org.telegram.ui.ActionBar.k6.He));
        }
        vw vwVar = this.y0;
        if (vwVar != null) {
            vwVar.setIndicatorColor(A(org.telegram.ui.ActionBar.k6.Qe));
            vwVar.setUnderlineColor(A(org.telegram.ui.ActionBar.k6.Ke));
            if (this.r0) {
                vwVar.setBackgroundColor(A(org.telegram.ui.ActionBar.k6.He));
            } else {
                vwVar.setBackground(null);
            }
        }
        rx rxVar = this.m0;
        if (rxVar != null) {
            rxVar.setIndicatorColor(A(org.telegram.ui.ActionBar.k6.Qe));
            rxVar.setUnderlineColor(A(org.telegram.ui.ActionBar.k6.Ke));
            if (this.r0) {
                rxVar.setBackgroundColor(A(org.telegram.ui.ActionBar.k6.He));
            } else {
                rxVar.setBackground(null);
            }
        }
        yw ywVar = this.x;
        if (ywVar != null) {
            ywVar.setColorFilter(new PorterDuffColorFilter(z4 ? v(0.6f) : A(org.telegram.ui.ActionBar.k6.Re), PorterDuff.Mode.MULTIPLY));
            if (yyVar == null) {
                Drawable background2 = ywVar.getBackground();
                int i12 = org.telegram.ui.ActionBar.k6.He;
                org.telegram.ui.ActionBar.k6.B1(background2, A(i12), false);
                org.telegram.ui.ActionBar.k6.B1(ywVar.getBackground(), A(i12), true);
            }
        }
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(z4 ? v(0.6f) : A(org.telegram.ui.ActionBar.k6.Re), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.B;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(z4 ? v(0.6f) : A(org.telegram.ui.ActionBar.k6.Re), PorterDuff.Mode.MULTIPLY));
        }
        hg.q qVar = this.K0;
        if (qVar != null) {
            ((ShapeDrawable) qVar.getBackground()).getPaint().setColor(A(org.telegram.ui.ActionBar.k6.qf));
            qVar.setTextColor(A(org.telegram.ui.ActionBar.k6.pf));
        }
        qy qyVar = this.g0;
        if (qyVar != null) {
            sy syVar = qyVar.e;
            ImageView imageView3 = syVar.a;
            int i13 = org.telegram.ui.ActionBar.k6.Le;
            imageView3.setColorFilter(new PorterDuffColorFilter(A(i13), PorterDuff.Mode.MULTIPLY));
            syVar.b.setTextColor(A(i13));
            syVar.c.setProgressColor(A(org.telegram.ui.ActionBar.k6.h6));
        }
        this.b2 = new PorterDuffColorFilter(A(org.telegram.ui.ActionBar.k6.Oh), PorterDuff.Mode.SRC_IN);
        int i14 = 0;
        while (true) {
            Drawable[] drawableArr = this.U0;
            if (i14 >= drawableArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.k6.y1(drawableArr[i14], z4 ? v(0.4f) : A(org.telegram.ui.ActionBar.k6.Ne), false);
            org.telegram.ui.ActionBar.k6.y1(drawableArr[i14], z4 ? v(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe), true);
            i14++;
        }
        if (hwVar != null && (vvVar = hwVar.y) != null) {
            vvVar.d();
        }
        int i15 = 0;
        while (true) {
            Drawable[] drawableArr2 = this.V0;
            if (i15 >= drawableArr2.length) {
                break;
            }
            org.telegram.ui.ActionBar.k6.y1(drawableArr2[i15], z4 ? v(0.4f) : A(org.telegram.ui.ActionBar.k6.Me), false);
            org.telegram.ui.ActionBar.k6.y1(drawableArr2[i15], z4 ? v(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe), true);
            i15++;
        }
        int i16 = 0;
        while (true) {
            Drawable[] drawableArr3 = this.W0;
            if (i16 >= drawableArr3.length) {
                break;
            }
            org.telegram.ui.ActionBar.k6.y1(drawableArr3[i16], z4 ? v(0.4f) : A(org.telegram.ui.ActionBar.k6.Me), false);
            org.telegram.ui.ActionBar.k6.y1(drawableArr3[i16], z4 ? v(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe), true);
            i16++;
        }
        org.telegram.ui.ActionBar.v5 v5Var = this.X1;
        if (v5Var != null) {
            org.telegram.ui.ActionBar.k6.y1(v5Var, z4 ? v(0.4f) : A(org.telegram.ui.ActionBar.k6.Ne), false);
            org.telegram.ui.ActionBar.k6.y1(v5Var, z4 ? v(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe), true);
        }
        org.telegram.ui.ActionBar.v5 v5Var2 = this.Y1;
        if (v5Var2 != null) {
            org.telegram.ui.ActionBar.k6.y1(v5Var2, z4 ? v(0.4f) : A(org.telegram.ui.ActionBar.k6.Qe), false);
            org.telegram.ui.ActionBar.k6.y1(v5Var2, z4 ? v(0.8f) : A(org.telegram.ui.ActionBar.k6.Qe), true);
        }
    }

    public final void V() {
        kx kxVar = this.M;
        if (kxVar == null) {
            return;
        }
        for (int i10 = 0; i10 < kxVar.getChildCount(); i10++) {
            View childAt = kxVar.getChildAt(i10);
            if (childAt instanceof cy) {
                ((cy) childAt).a(true);
            }
        }
    }

    public final void W(int i10) {
        if (this.c0) {
            return;
        }
        int i11 = -1;
        if (i10 != -1) {
            int size = getRecentEmoji().size() + (this.a0 ? 1 : 0);
            tx txVar = this.O;
            int i12 = txVar.c;
            ArrayList arrayList = txVar.x;
            int i13 = 0;
            int i14 = size + (i12 >= 0 ? 3 : 0);
            if (i10 >= i14) {
                int i15 = 0;
                while (true) {
                    String[][] strArr = EmojiData.dataColored;
                    if (i15 >= strArr.length) {
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
                    ArrayList<xx> emojipacks = getEmojipacks();
                    int size2 = arrayList.size() - 1;
                    while (true) {
                        if (size2 < 0) {
                            break;
                        }
                        if (((Integer) arrayList.get(size2)).intValue() <= i10) {
                            xx xxVar = (xx) this.n1.get(size2);
                            while (i13 < emojipacks.size()) {
                                long j10 = emojipacks.get(i13).b.id;
                                long j11 = xxVar.b.id;
                                if (j10 == j11 && (!xxVar.g || (!xxVar.f && !this.m1.contains(Long.valueOf(j11))))) {
                                    i13 = EmojiData.dataColored.length + 1 + i13;
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
                this.F.j(i13, true);
            }
        }
    }

    public final void X() {
        int i10;
        xy xyVar;
        int i11;
        boolean z4;
        rx rxVar = this.m0;
        int currentPosition = rxVar.getCurrentPosition();
        int i12 = this.o0;
        boolean z10 = currentPosition == i12;
        boolean z11 = i12 >= 0;
        boolean isEmpty = this.f1.isEmpty();
        rxVar.d(false);
        this.o0 = -2;
        this.p0 = -2;
        this.q0 = -2;
        Drawable[] drawableArr = this.W0;
        if (isEmpty) {
            i10 = 0;
        } else {
            this.o0 = 0;
            rxVar.b(0, drawableArr[0]).setContentDescription(LocaleController.getString(R.string.RecentStickers));
            i10 = 1;
        }
        this.p0 = i10;
        rxVar.b(1, drawableArr[1]).setContentDescription(LocaleController.getString(R.string.FeaturedGifs));
        this.q0 = i10 + 1;
        AndroidUtilities.dp(13.0f);
        AndroidUtilities.dp(11.0f);
        int i13 = this.Z0;
        ArrayList<String> arrayList = MessagesController.getInstance(i13).gifSearchEmojies;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            String str = arrayList.get(i14);
            Emoji.EmojiDrawable emojiDrawable = Emoji.getEmojiDrawable(str);
            if (emojiDrawable != null) {
                TLRPC.Document emojiAnimatedSticker = MediaDataController.getInstance(i13).getEmojiAnimatedSticker(str);
                String j10 = l.d.j(i14 + 3, "tab");
                int i15 = rxVar.x;
                rxVar.x = i15 + 1;
                gx0 gx0Var = (gx0) rxVar.n.get(j10);
                if (gx0Var != null) {
                    rxVar.g(j10, gx0Var, i15);
                    i11 = currentPosition;
                    z4 = z11;
                } else {
                    i11 = currentPosition;
                    z4 = z11;
                    gx0Var = new gx0(rxVar.getContext(), 2);
                    gx0Var.setFocusable(true);
                    gx0Var.setOnClickListener(new km0(rxVar, 2));
                    gx0Var.setExpanded(rxVar.c0);
                    gx0Var.a(rxVar.f0);
                    rxVar.e.addView(gx0Var, i15);
                }
                gx0Var.d = false;
                gx0Var.setTag(R.id.index_tag, Integer.valueOf(i15));
                gx0Var.setTag(R.id.parent_tag, emojiDrawable);
                gx0Var.setTag(R.id.object_tag, emojiAnimatedSticker);
                gx0Var.setSelected(i15 == rxVar.y);
                rxVar.h.put(j10, gx0Var);
                gx0Var.setContentDescription(str);
            } else {
                i11 = currentPosition;
                z4 = z11;
            }
            i14++;
            currentPosition = i11;
            z11 = z4;
        }
        int i16 = currentPosition;
        boolean z12 = z11;
        rxVar.h();
        rxVar.q();
        if (z10 && isEmpty) {
            rxVar.m(this.p0);
            ow owVar = this.l0;
            if (owVar == null || (xyVar = owVar.r) == null) {
                return;
            }
            xyVar.F1(null);
            return;
        }
        WeakHashMap weakHashMap = r0.j0.a;
        if (rxVar.isLaidOut()) {
            if (!isEmpty && !z12) {
                rxVar.k(i16 + 1, 0);
            } else if (isEmpty && z12) {
                rxVar.k(i16 - 1, 0);
            }
        }
    }

    public final void Y() {
        qy qyVar;
        int size = this.f1.size();
        long calcDocumentsHash = MediaDataController.calcDocumentsHash(this.f1, ConnectionsManager.DEFAULT_DATACENTER_ID);
        ArrayList<TLRPC.Document> recentGifs = MediaDataController.getInstance(this.Z0).getRecentGifs();
        this.f1 = recentGifs;
        long calcDocumentsHash2 = MediaDataController.calcDocumentsHash(recentGifs, ConnectionsManager.DEFAULT_DATACENTER_ID);
        if ((this.m0 != null && size == 0 && !this.f1.isEmpty()) || (size != 0 && this.f1.isEmpty())) {
            X();
        }
        if ((size == this.f1.size() && calcDocumentsHash == calcDocumentsHash2) || (qyVar = this.k0) == null) {
            return;
        }
        qyVar.l();
    }

    public final void Z(boolean z4) {
        TLRPC.Document document;
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet;
        vw vwVar = this.y0;
        if (vwVar != null) {
            ib1 ib1Var = vwVar.e;
            if (vwVar.s != null) {
                return;
            }
            this.C1 = -2;
            this.D1 = -2;
            this.E1 = -2;
            this.F1 = -2;
            this.b0 = false;
            this.B1 = 0;
            int currentPosition = vwVar.getCurrentPosition();
            boolean z10 = true;
            vwVar.d((getParent() == null || getVisibility() != 0 || (this.v1.size() == 0 && this.w1.size() == 0)) ? false : true);
            int i10 = this.Z0;
            MediaDataController mediaDataController = MediaDataController.getInstance(i10);
            SharedPreferences emojiSettings = MessagesController.getEmojiSettings(i10);
            ArrayList arrayList3 = this.j1;
            arrayList3.clear();
            ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
            int size = featuredStickerSets.size();
            for (int i11 = 0; i11 < size; i11++) {
                TLRPC.StickerSetCovered stickerSetCovered = featuredStickerSets.get(i11);
                if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.id)) {
                    arrayList3.add(stickerSetCovered);
                }
            }
            kz kzVar = this.C0;
            if (kzVar != null) {
                kzVar.l();
            }
            boolean isEmpty = featuredStickerSets.isEmpty();
            long j10 = 0;
            Drawable[] drawableArr = this.V0;
            if (!isEmpty && (arrayList3.isEmpty() || emojiSettings.getLong("featured_hidden", 0L) == featuredStickerSets.get(0).set.id)) {
                int i12 = mediaDataController.getUnreadStickerSets().isEmpty() ? 2 : 3;
                gx0 c3 = vwVar.c(i12, drawableArr[i12]);
                c3.h.setText(LocaleController.getString(R.string.FeaturedStickersShort));
                c3.setContentDescription(LocaleController.getString(R.string.FeaturedStickers));
                int i13 = this.B1;
                this.E1 = i13;
                this.B1 = i13 + 1;
            }
            if (!this.h1.isEmpty()) {
                int i14 = this.B1;
                this.D1 = i14;
                this.B1 = i14 + 1;
                gx0 c10 = vwVar.c(1, drawableArr[1]);
                c10.h.setText(LocaleController.getString(R.string.FavoriteStickersShort));
                c10.setContentDescription(LocaleController.getString(R.string.FavoriteStickers));
            }
            if (!this.g1.isEmpty()) {
                int i15 = this.B1;
                this.C1 = i15;
                this.B1 = i15 + 1;
                gx0 c11 = vwVar.c(0, drawableArr[0]);
                c11.h.setText(LocaleController.getString(R.string.RecentStickersShort));
                c11.setContentDescription(LocaleController.getString(R.string.RecentStickers));
            }
            ArrayList arrayList4 = this.a1;
            arrayList4.clear();
            org.telegram.ui.ActionBar.g6 g6Var = null;
            this.e1 = null;
            this.c1 = -1;
            this.b1 = -10;
            if (this.E2 == null || z4) {
                this.E2 = new ArrayList(mediaDataController.getStickerSets(0));
            }
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList5 = this.E2;
            int i16 = 0;
            while (true) {
                TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.u1;
                if (i16 >= stickerSetCoveredArr.length) {
                    break;
                }
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCoveredArr[i16];
                long j11 = j10;
                if (stickerSetCovered2 != null) {
                    TLRPC.TL_messages_stickerSet stickerSetById = mediaDataController.getStickerSetById(stickerSetCovered2.set.id);
                    if (stickerSetById == null || (stickerSet = stickerSetById.set) == null || stickerSet.archived) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = new TLRPC.TL_messages_stickerSet();
                        tL_messages_stickerSet.set = stickerSetCovered2.set;
                        TLRPC.Document document2 = stickerSetCovered2.cover;
                        if (document2 != null) {
                            tL_messages_stickerSet.documents.add(document2);
                        } else if (!stickerSetCovered2.covers.isEmpty()) {
                            tL_messages_stickerSet.documents.addAll(stickerSetCovered2.covers);
                        }
                        if (!tL_messages_stickerSet.documents.isEmpty()) {
                            arrayList4.add(tL_messages_stickerSet);
                        }
                    } else {
                        stickerSetCoveredArr[i16] = null;
                    }
                }
                i16++;
                j10 = j11;
            }
            long j12 = j10;
            ArrayList<TLRPC.TL_messages_stickerSet> filterPremiumStickers = MessagesController.getInstance(i10).filterPremiumStickers(arrayList5);
            for (int i17 = 0; i17 < filterPremiumStickers.size(); i17++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = filterPremiumStickers.get(i17);
                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
                if ((stickerSet2 == null || !stickerSet2.archived) && (arrayList2 = tL_messages_stickerSet2.documents) != null && !arrayList2.isEmpty()) {
                    arrayList4.add(tL_messages_stickerSet2);
                }
            }
            if (this.G1 != null) {
                long j13 = MessagesController.getEmojiSettings(i10).getLong("group_hide_stickers_" + this.G1.id, -1L);
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(this.G1.id));
                if (chat == null || this.G1.stickerset == null || !ChatObject.hasAdminRights(chat)) {
                    this.d1 = j13 != -1;
                } else {
                    TLRPC.StickerSet stickerSet3 = this.G1.stickerset;
                    if (stickerSet3 != null) {
                        this.d1 = j13 == stickerSet3.id;
                    }
                }
                TLRPC.ChatFull chatFull = this.G1;
                TLRPC.StickerSet stickerSet4 = chatFull.stickerset;
                if (stickerSet4 != null) {
                    TLRPC.TL_messages_stickerSet groupStickerSetById = mediaDataController.getGroupStickerSetById(stickerSet4);
                    if (groupStickerSetById != null && (arrayList = groupStickerSetById.documents) != null && !arrayList.isEmpty() && groupStickerSetById.set != null) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = new TLRPC.TL_messages_stickerSet();
                        tL_messages_stickerSet3.documents = groupStickerSetById.documents;
                        tL_messages_stickerSet3.packs = groupStickerSetById.packs;
                        tL_messages_stickerSet3.set = groupStickerSetById.set;
                        if (this.d1) {
                            this.b1 = arrayList4.size();
                            arrayList4.add(tL_messages_stickerSet3);
                        } else {
                            this.b1 = 0;
                            arrayList4.add(0, tL_messages_stickerSet3);
                        }
                        if (!this.G1.can_set_stickers) {
                            tL_messages_stickerSet3 = null;
                        }
                        this.e1 = tL_messages_stickerSet3;
                    }
                } else if (chatFull.can_set_stickers) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = new TLRPC.TL_messages_stickerSet();
                    if (this.d1) {
                        this.b1 = arrayList4.size();
                        arrayList4.add(tL_messages_stickerSet4);
                    } else {
                        this.b1 = 0;
                        arrayList4.add(0, tL_messages_stickerSet4);
                    }
                }
            }
            int i18 = 0;
            while (i18 < arrayList4.size()) {
                if (i18 == this.b1) {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(this.G1.id));
                    if (chat2 == null) {
                        arrayList4.remove(0);
                        i18--;
                    } else {
                        this.b0 = z10;
                        String str = "chat" + chat2.id;
                        int i19 = vwVar.x;
                        vwVar.x = i19 + 1;
                        gx0 gx0Var = (gx0) vwVar.n.get(str);
                        if (gx0Var != null) {
                            vwVar.g(str, gx0Var, i19);
                        } else {
                            gx0Var = new gx0(vwVar.getContext(), 0);
                            gx0Var.setFocusable(z10);
                            gx0Var.setOnClickListener(new km0(vwVar, 0));
                            ib1Var.addView(gx0Var, i19);
                            gx0Var.w = z10;
                            z8 z8Var = new z8(g6Var);
                            z8Var.u(AndroidUtilities.dp(14.0f));
                            z8Var.k(UserConfig.selectedAccount, chat2);
                            int i20 = vwVar.a;
                            p9 p9Var = gx0Var.e;
                            p9Var.setLayerNum(i20);
                            p9Var.e(chat2, z8Var);
                            p9Var.setAspectFit(z10);
                            gx0Var.setExpanded(vwVar.c0);
                            gx0Var.a(vwVar.f0);
                            gx0Var.h.setText(chat2.title);
                        }
                        gx0Var.d = z10;
                        gx0Var.setTag(R.id.index_tag, Integer.valueOf(i19));
                        gx0Var.setSelected(i19 == vwVar.y);
                        vwVar.h.put(str, gx0Var);
                    }
                } else {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i18);
                    TLRPC.StickerSet stickerSet5 = tL_messages_stickerSet5.set;
                    if (stickerSet5 != null && stickerSet5.thumb_document_id != j12) {
                        for (int i21 = 0; i21 < tL_messages_stickerSet5.documents.size(); i21++) {
                            document = tL_messages_stickerSet5.documents.get(i21);
                            if (document != null && tL_messages_stickerSet5.set.thumb_document_id == document.id) {
                                break;
                            }
                        }
                    }
                    document = null;
                    if (document == null) {
                        document = tL_messages_stickerSet5.documents.get(0);
                    }
                    Object closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_messages_stickerSet5.set.thumbs, 90);
                    if (closestPhotoSizeWithSize == null || tL_messages_stickerSet5.set.gifs) {
                        closestPhotoSizeWithSize = document;
                    }
                    String str2 = "set" + tL_messages_stickerSet5.set.id;
                    int i22 = vwVar.x;
                    vwVar.x = i22 + 1;
                    gx0 gx0Var2 = (gx0) vwVar.n.get(str2);
                    if (gx0Var2 != null) {
                        vwVar.g(str2, gx0Var2, i22);
                    } else {
                        gx0Var2 = new gx0(vwVar.getContext(), 0);
                        gx0Var2.setFocusable(z10);
                        gx0Var2.setOnClickListener(new km0(vwVar, 1));
                        gx0Var2.setExpanded(vwVar.c0);
                        gx0Var2.a(vwVar.f0);
                        ib1Var.addView(gx0Var2, i22);
                    }
                    gx0Var2.e.setLayerNum(vwVar.a);
                    gx0Var2.d = false;
                    gx0Var2.setTag(closestPhotoSizeWithSize);
                    gx0Var2.setTag(R.id.index_tag, Integer.valueOf(i22));
                    gx0Var2.setTag(R.id.parent_tag, tL_messages_stickerSet5);
                    gx0Var2.setTag(R.id.object_tag, document);
                    gx0Var2.setSelected(i22 == vwVar.y);
                    vwVar.h.put(str2, gx0Var2);
                    gx0Var2.setContentDescription(tL_messages_stickerSet5.set.title + ", " + LocaleController.getString(R.string.AccDescrStickerSet));
                }
                i18++;
                z10 = true;
                g6Var = null;
            }
            vwVar.h();
            vwVar.q();
            if (currentPosition != 0) {
                vwVar.k(currentPosition, currentPosition);
            }
            o();
        }
    }

    public final void a0() {
        ww wwVar = this.z0;
        vw vwVar = this.y0;
        if (vwVar != null && wwVar == null && this.q1 != null) {
            vwVar.setTranslationY(this.q1.p() * (-AndroidUtilities.dp(50.0f)));
        }
        if (wwVar == null) {
            return;
        }
        boolean z4 = getVisibility() == 0 && this.H0 && this.q1.p() != 1.0f;
        wwVar.setVisibility(z4 ? 0 : 8);
        if (z4) {
            Rect rect = this.v2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.u0, rect, null);
            float p10 = this.q1.p() * AndroidUtilities.dp(50.0f);
            int i10 = rect.left;
            if (i10 != 0 || p10 != 0.0f) {
                this.U1 = false;
            }
            wwVar.setTranslationX(i10);
            float translationY = (((getTranslationY() + getTop()) - wwVar.getTop()) - vwVar.getExpandedOffset()) - p10;
            if (wwVar.getTranslationY() != translationY) {
                wwVar.setTranslationY(translationY);
                wwVar.invalidate();
            }
        }
        if (this.U1 && z4 && this.M0) {
            vwVar.i(this.T1, true);
        } else {
            this.U1 = false;
            vwVar.i(this.T1, false);
        }
    }

    @Override // dh.a
    public final void b(int i10) {
        setBottomInset(i10);
    }

    public final void b0() {
        boolean z4;
        org.telegram.ui.Cells.r3 r3Var;
        LongSparseArray longSparseArray = this.w1;
        LongSparseArray longSparseArray2 = this.v1;
        int i10 = this.Z0;
        rw rwVar = this.A0;
        if (rwVar == null) {
            return;
        }
        try {
            int childCount = rwVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = rwVar.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.r3) && ((fl0) rwVar.T(childAt)) != null) {
                    org.telegram.ui.Cells.r3 r3Var2 = (org.telegram.ui.Cells.r3) childAt;
                    ArrayList<Long> unreadStickerSets = MediaDataController.getInstance(i10).getUnreadStickerSets();
                    TLRPC.StickerSetCovered stickerSet = r3Var2.getStickerSet();
                    boolean z10 = unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSet.set.id));
                    int i12 = 0;
                    while (true) {
                        TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.u1;
                        if (i12 >= stickerSetCoveredArr.length) {
                            z4 = false;
                            break;
                        }
                        TLRPC.StickerSetCovered stickerSetCovered = stickerSetCoveredArr[i12];
                        if (stickerSetCovered != null) {
                            r3Var = r3Var2;
                            if (stickerSetCovered.set.id == stickerSet.set.id) {
                                r3Var2 = r3Var;
                                z4 = true;
                                break;
                            }
                        } else {
                            r3Var = r3Var2;
                        }
                        i12++;
                        r3Var2 = r3Var;
                    }
                    r3Var2.c(stickerSet, z10, true, 0, 0, z4);
                    if (z10) {
                        MediaDataController.getInstance(i10).markFeaturedStickersByIdAsRead(false, stickerSet.set.id);
                    }
                    boolean z11 = longSparseArray2.indexOfKey(stickerSet.set.id) >= 0;
                    boolean z12 = longSparseArray.indexOfKey(stickerSet.set.id) >= 0;
                    if (z11 || z12) {
                        if (z11 && r3Var2.r) {
                            longSparseArray2.remove(stickerSet.set.id);
                            z11 = false;
                        } else if (z12 && !r3Var2.r) {
                            longSparseArray.remove(stickerSet.set.id);
                        }
                    }
                    r3Var2.b(!z4 && z11, true);
                }
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override // dh.a
    public final void c(float f10) {
        this.o2 = f10;
        T();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Utilities.Callback callback;
        TLRPC.StickerSet stickerSet;
        int i12 = NotificationCenter.stickersDidLoad;
        tx txVar = this.O;
        aw awVar = this.I2;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.v0 != null) {
                    Z(((Boolean) objArr[1]).booleanValue());
                    b0();
                    F();
                    o();
                    return;
                }
                return;
            }
            if (((Integer) objArr[0]).intValue() == 5) {
                if (!((Boolean) objArr[1]).booleanValue()) {
                    txVar.F(false);
                    return;
                } else {
                    AndroidUtilities.cancelRunOnUIThread(awVar);
                    AndroidUtilities.runOnUIThread(awVar, 100L);
                    return;
                }
            }
            return;
        }
        if (i10 == NotificationCenter.groupPackUpdated) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            TLRPC.ChatFull chatFull = this.G1;
            if (chatFull != null && chatFull.id == longValue && booleanValue) {
                txVar.F(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.recentDocumentsDidLoad) {
            boolean booleanValue2 = ((Boolean) objArr[0]).booleanValue();
            int intValue = ((Integer) objArr[1]).intValue();
            if (booleanValue2 || intValue == 0 || intValue == 2) {
                k(booleanValue2);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.featuredStickersDidLoad) {
            b0();
            hd0 hd0Var = this.w;
            if (hd0Var != null) {
                int childCount = hd0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    hd0Var.getChildAt(i13).invalidate();
                }
            }
            Z(false);
            return;
        }
        if (i10 == NotificationCenter.featuredEmojiDidLoad) {
            if (txVar != null) {
                txVar.F(false);
                return;
            }
            return;
        }
        int i14 = NotificationCenter.groupStickersDidLoad;
        ly lyVar = this.P;
        if (i10 == i14) {
            Long l10 = (Long) objArr[0];
            long longValue2 = l10.longValue();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = objArr.length > 1 ? (TLRPC.TL_messages_stickerSet) objArr[1] : null;
            if (tL_messages_stickerSet != null) {
                hz hzVar = this.w0;
                if (hzVar != null && hzVar.d == longValue2 && hzVar.f.size() < tL_messages_stickerSet.documents.size()) {
                    hzVar.f = tL_messages_stickerSet.documents;
                    hzVar.l();
                }
                if (lyVar != null && lyVar.d == longValue2 && lyVar.f.size() < tL_messages_stickerSet.documents.size()) {
                    lyVar.f = tL_messages_stickerSet.documents;
                    lyVar.l();
                }
            }
            TLRPC.ChatFull chatFull2 = this.G1;
            if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null && stickerSet.id == longValue2) {
                Z(false);
            }
            HashMap hashMap = this.o1;
            if (hashMap.containsKey(l10) && objArr.length >= 2 && ((Utilities.Callback) hashMap.get(l10)) != null && tL_messages_stickerSet != null && (callback = (Utilities.Callback) hashMap.remove(l10)) != null) {
                callback.run(tL_messages_stickerSet);
            }
            AndroidUtilities.cancelRunOnUIThread(awVar);
            AndroidUtilities.runOnUIThread(awVar, 100L);
            return;
        }
        int i15 = NotificationCenter.emojiLoaded;
        kx kxVar = this.M;
        if (i10 != i15) {
            if (i10 != NotificationCenter.newEmojiSuggestionsAvailable) {
                if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                    if (txVar != null) {
                        txVar.F(false);
                    }
                    V();
                    Z(false);
                    return;
                }
                return;
            }
            if (kxVar == null || !this.a0) {
                return;
            }
            if ((this.S.c.k == 2 || kxVar.getAdapter() == lyVar) && !TextUtils.isEmpty(lyVar.v)) {
                lyVar.F(lyVar.v, true);
                return;
            }
            return;
        }
        rw rwVar = this.A0;
        if (rwVar != null) {
            int childCount2 = rwVar.getChildCount();
            for (int i16 = 0; i16 < childCount2; i16++) {
                View childAt = rwVar.getChildAt(i16);
                if ((childAt instanceof org.telegram.ui.Cells.m8) || (childAt instanceof org.telegram.ui.Cells.d8)) {
                    childAt.invalidate();
                }
            }
        }
        if (kxVar != null) {
            kxVar.invalidate();
            int childCount3 = kxVar.getChildCount();
            for (int i17 = 0; i17 < childCount3; i17++) {
                View childAt2 = kxVar.getChildAt(i17);
                if (childAt2 instanceof uy) {
                    childAt2.invalidate();
                }
            }
        }
        tu tuVar = this.y1;
        if (tuVar != null) {
            tuVar.c.invalidate();
        }
        rx rxVar = this.m0;
        if (rxVar != null) {
            ib1 ib1Var = rxVar.e;
            int childCount4 = ib1Var.getChildCount();
            for (int i18 = 0; i18 < childCount4; i18++) {
                ib1Var.getChildAt(i18).invalidate();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        tg.d dVar;
        og.e eVar;
        if (Build.VERSION.SDK_INT >= 31 && (dVar = this.i2) != null && (eVar = this.g2) != null) {
            C();
            RecordingCanvas a2 = dVar.a(getMeasuredWidth(), getMeasuredHeight());
            a2.drawColor(A(org.telegram.ui.ActionBar.k6.d6));
            if (SharedConfig.chatBlurEnabled()) {
                eVar.b(a2, -2);
            }
            dVar.c();
        }
        T();
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.h) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        if (this.n.getVisibility() != 8 && !this.r0 && this.t0) {
            canvas.drawColor(i0.a.k(-1, 25));
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.n2);
        if (navigationBarThirdButtonsFactor > 0.0f) {
            int l1 = org.telegram.ui.ActionBar.k6.l1(navigationBarThirdButtonsFactor, A(org.telegram.ui.ActionBar.k6.He));
            int i10 = this.z2;
            GradientDrawable gradientDrawable = this.y2;
            if (i10 != l1) {
                gradientDrawable.setColors(new int[]{l1, org.telegram.ui.ActionBar.k6.l1(0.66f, l1), i0.a.k(l1, 0)});
                this.z2 = l1;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.n2, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
        canvas.restore();
        return drawChild;
    }

    public int getCurrentPage() {
        return this.x1;
    }

    public ArrayList<xx> getEmojipacks() {
        ArrayList<xx> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.n1;
            if (i10 >= arrayList2.size()) {
                return arrayList;
            }
            xx xxVar = (xx) arrayList2.get(i10);
            boolean z4 = xxVar.g;
            ArrayList arrayList3 = this.m1;
            if ((!z4 && (xxVar.f || arrayList3.contains(Long.valueOf(xxVar.b.id)))) || (xxVar.g && !xxVar.f && !arrayList3.contains(Long.valueOf(xxVar.b.id)))) {
                arrayList.add(xxVar);
            }
            i10++;
        }
    }

    public ArrayList<String> getRecentEmoji() {
        if (this.Z1) {
            return Emoji.recentEmoji;
        }
        if (this.A2 == null) {
            this.A2 = new ArrayList();
        }
        if (Emoji.recentEmoji.size() != this.B2) {
            this.A2.clear();
            int i10 = 0;
            while (true) {
                ArrayList<String> arrayList = Emoji.recentEmoji;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (!arrayList.get(i10).startsWith("animated_")) {
                    this.A2.add(arrayList.get(i10));
                }
                i10++;
            }
            this.B2 = this.A2.size();
        }
        return this.A2;
    }

    public float getStickersExpandOffset() {
        vw vwVar = this.y0;
        if (vwVar == null) {
            return 0.0f;
        }
        return vwVar.getExpandedOffset();
    }

    public final void h(String str) {
        if (str == null) {
            return;
        }
        if (!str.startsWith("animated_") && !Emoji.isValidEmoji(str)) {
            return;
        }
        Emoji.addRecentEmoji(str);
        int i10 = 0;
        if (getVisibility() != 0 || this.h.getCurrentItem() != 0) {
            Emoji.sortEmoji();
            this.O.F(false);
        }
        Emoji.saveRecentEmoji();
        if (this.Z1) {
            return;
        }
        ArrayList arrayList = this.A2;
        if (arrayList == null) {
            this.A2 = new ArrayList();
        } else {
            arrayList.clear();
        }
        while (true) {
            ArrayList<String> arrayList2 = Emoji.recentEmoji;
            if (i10 >= arrayList2.size()) {
                this.B2 = this.A2.size();
                return;
            } else {
                if (!arrayList2.get(i10).startsWith("animated_")) {
                    this.A2.add(arrayList2.get(i10));
                }
                i10++;
            }
        }
    }

    public final void i(int i10, int i11, boolean z4) {
        if (i10 == 2 || x(i10).K(0) == null) {
            return;
        }
        hx hxVar = new hx(getContext(), i11);
        hxVar.a = !z4 ? 1 : 0;
        w(i10).w0(hxVar);
    }

    public final void k(boolean z4) {
        if (z4) {
            Y();
            return;
        }
        int size = this.g1.size();
        int size2 = this.h1.size();
        int i10 = this.Z0;
        this.g1 = MediaDataController.getInstance(i10).getRecentStickers(0, true);
        this.h1 = MediaDataController.getInstance(i10).getRecentStickers(2);
        if (UserConfig.getInstance(i10).isPremium()) {
            this.i1 = MediaDataController.getInstance(i10).getRecentStickers(7);
        } else {
            this.i1 = new ArrayList();
        }
        for (int i11 = 0; i11 < this.h1.size(); i11++) {
            TLRPC.Document document = (TLRPC.Document) this.h1.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < this.g1.size()) {
                    TLRPC.Document document2 = (TLRPC.Document) this.g1.get(i12);
                    if (document2.dc_id == document.dc_id && document2.id == document.id) {
                        this.g1.remove(i12);
                        break;
                    }
                    i12++;
                }
            }
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            int i13 = 0;
            while (i13 < this.h1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.h1.get(i13))) {
                    this.h1.remove(i13);
                    i13--;
                }
                i13++;
            }
            int i14 = 0;
            while (i14 < this.g1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.g1.get(i14))) {
                    this.g1.remove(i14);
                    i14--;
                }
                i14++;
            }
        }
        if (size != this.g1.size() || size2 != this.h1.size()) {
            Z(false);
        }
        dz dzVar = this.v0;
        if (dzVar != null) {
            dzVar.l();
        }
        o();
    }

    public final void l(boolean z4) {
        my myVar = this.q1;
        xd.a aVar = this.b;
        kx kxVar = this.M;
        iw iwVar = this.S;
        if (myVar != null && myVar.z()) {
            f2.m1 K = kxVar.K(0);
            if (K == null) {
                yy.a(iwVar, true, !z4);
            } else {
                yy.a(iwVar, K.a.getTop() < kxVar.getPaddingTop(), !z4);
            }
            P(false, !z4);
            iwVar.setTranslationY(aVar.e * AndroidUtilities.dp(15.0f));
            return;
        }
        if (iwVar == null || kxVar == null) {
            return;
        }
        iwVar.setTranslationY((aVar.e * AndroidUtilities.dp(15.0f)) + (kxVar.K(0) != null ? r0.a.getTop() : -this.Y0));
        iwVar.a.a(false, !z4);
        m(Math.round(this.F.getTranslationY()));
    }

    public final void m(int i10) {
        ObjectAnimator objectAnimator = this.O0[1];
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            boolean z4 = false;
            f2.m1 K = this.M.K(0);
            int dp = AndroidUtilities.dp(38.0f) + i10;
            if (dp > 0 && (K == null || K.a.getBottom() < dp)) {
                z4 = true;
            }
            P(z4, !this.H1);
        }
    }

    public final void n(kx kxVar, int i10) {
        kx kxVar2;
        f2.m1 K;
        hw hwVar = this.F;
        int[] iArr = this.N0;
        if (kxVar == null) {
            iArr[1] = 0;
            hwVar.setTranslationY(0);
            return;
        }
        if (kxVar.getVisibility() != 0 || this.c0) {
            return;
        }
        my myVar = this.q1;
        if (myVar == null || !myVar.z()) {
            if (i10 > 0 && (kxVar2 = this.M) != null && kxVar2.getVisibility() == 0 && (K = kxVar2.K(0)) != null) {
                if (K.a.getTop() + (this.a0 ? this.Y0 : 0) >= kxVar2.getPaddingTop()) {
                    return;
                }
            }
            int i11 = iArr[1] - i10;
            iArr[1] = i11;
            if (i11 > 0) {
                iArr[1] = 0;
            } else if (i11 < (-AndroidUtilities.dp(108.0f))) {
                iArr[1] = -AndroidUtilities.dp(108.0f);
            }
            hwVar.setTranslationY(Math.max(-AndroidUtilities.dp(36.0f), iArr[1]));
        }
    }

    public final void o() {
        int L0;
        vw vwVar = this.y0;
        if (vwVar == null || (L0 = this.B0.L0()) == -1) {
            return;
        }
        int i10 = this.D1;
        if (i10 <= 0 && (i10 = this.C1) <= 0) {
            i10 = this.B1;
        }
        vwVar.k(this.v0.F(L0), i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        int i10 = this.Z0;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupPackUpdated);
        if (this.v0 != null) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.stickersDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.featuredStickersDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupStickersDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
            AndroidUtilities.runOnUIThread(new aw(this, 0));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        tu tuVar = this.y1;
        if (tuVar != null && tuVar.isShowing()) {
            tuVar.dismiss();
        }
        org.telegram.ui.qt q10 = org.telegram.ui.qt.q();
        if (q10.l == this.d2) {
            q10.W = null;
            q10.a0 = null;
            q10.Y = null;
            q10.l = null;
            q10.c0 = null;
            q10.u();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        if (this.L1 != i14) {
            this.L1 = i14;
            F();
        }
        super.onLayout(z4, i10, i11, i12, i13);
        T();
        a0();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.H1 = true;
        boolean z4 = AndroidUtilities.isInMultiwindow;
        View view = this.v;
        boolean z10 = this.a0;
        if (z4 || this.K1) {
            if (this.I1 != 1) {
                if (!this.F2) {
                    setOutlineProvider(this.J1);
                    setClipToOutline(true);
                    setElevation(AndroidUtilities.dp(2.0f));
                }
                setBackgroundResource(R.drawable.smiles_popup);
                Drawable background = getBackground();
                int i12 = org.telegram.ui.ActionBar.k6.He;
                background.setColorFilter(new PorterDuffColorFilter(A(i12), PorterDuff.Mode.MULTIPLY));
                if (z10 && this.r0) {
                    view.setBackgroundColor(A(i12));
                }
                this.I1 = 1;
            }
        } else if (this.I1 != 0) {
            if (!this.F2) {
                setOutlineProvider(null);
                setClipToOutline(false);
                setElevation(0.0f);
            }
            if (this.r0) {
                int i13 = org.telegram.ui.ActionBar.k6.He;
                setBackgroundColor(A(i13));
                if (z10) {
                    view.setBackgroundColor(A(i13));
                }
            }
            this.I1 = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
        this.H1 = false;
        setTranslationY(getTranslationY());
    }

    public final void p(int i10) {
        int L0;
        int L02;
        if (i10 == 0) {
            if (this.G0 || (L02 = this.B0.L0()) == -1 || this.A0 == null) {
                return;
            }
            int i11 = this.D1;
            if (i11 <= 0 && (i11 = this.C1) <= 0) {
                i11 = this.B1;
            }
            this.y0.k(this.v0.F(L02), i11);
            return;
        }
        if (i10 == 2) {
            f2.p0 adapter = this.e0.getAdapter();
            qy qyVar = this.k0;
            if (adapter != qyVar || qyVar.F < 0 || this.p0 < 0 || this.o0 < 0 || (L0 = this.f0.L0()) == -1) {
                return;
            }
            this.m0.k(L0 >= qyVar.F ? this.p0 : this.o0, 0);
        }
    }

    public final void q(boolean z4) {
        my myVar = this.q1;
        xd.a aVar = this.a;
        rw rwVar = this.A0;
        uw uwVar = this.D0;
        if (myVar != null && myVar.z()) {
            f2.m1 K = rwVar.K(0);
            if (K == null) {
                yy.a(uwVar, true, !z4);
            } else {
                yy.a(uwVar, K.a.getTop() < rwVar.getPaddingTop(), !z4);
            }
            uwVar.setTranslationY(aVar.e * AndroidUtilities.dp(15.0f));
            return;
        }
        if (uwVar == null || rwVar == null) {
            return;
        }
        uwVar.setTranslationY((aVar.e * AndroidUtilities.dp(15.0f)) + (rwVar.K(0) != null ? r0.a.getTop() : -this.Y0));
        uwVar.a.a(false, !z4);
    }

    public final void r() {
        Emoji.clearRecentEmoji();
        this.O.F(false);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.H1) {
            return;
        }
        super.requestLayout();
    }

    public final void s(long j10, boolean z4) {
        yy yyVar;
        f2.j0 j0Var;
        View view;
        tl0 tl0Var;
        int i10;
        TLRPC.TL_messages_stickerSet stickerSetById;
        dz dzVar;
        int E;
        AnimatorSet animatorSet = this.J0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.J0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        if (currentItem == 2 && j10 != -1 && (stickerSetById = MediaDataController.getInstance(this.Z0).getStickerSetById(j10)) != null && (E = (dzVar = this.v0).E(stickerSetById)) >= 0 && E < dzVar.h()) {
            I(E, AndroidUtilities.dp(48.0f));
        }
        qy qyVar = this.g0;
        if (qyVar != null) {
            qyVar.H = false;
        }
        for (int i11 = 0; i11 < 3; i11++) {
            tl0 tl0Var2 = this.A0;
            tl0 tl0Var3 = this.e0;
            ow owVar = this.l0;
            tl0 tl0Var4 = this.M;
            if (i11 == 0) {
                yyVar = this.S;
                j0Var = this.N;
                view = this.F;
                tl0Var = tl0Var4;
            } else if (i11 == 1) {
                j0Var = this.f0;
                view = this.m0;
                tl0Var = tl0Var3;
                yyVar = owVar;
            } else {
                yyVar = this.D0;
                j0Var = this.B0;
                view = this.y0;
                tl0Var = tl0Var2;
            }
            if (yyVar != null) {
                xy xyVar = yyVar.r;
                yyVar.d.setText("");
                if (xyVar != null) {
                    xyVar.F1(null);
                    xyVar.D1();
                }
                int i12 = this.Y0;
                if (i11 == currentItem && z4) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.J0 = animatorSet2;
                    Property property = View.TRANSLATION_Y;
                    if (view == null || i11 == 1) {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(tl0Var, (Property<tl0, Float>) property, AndroidUtilities.dp(36.0f) - i12));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofFloat(tl0Var, (Property<tl0, Float>) property, AndroidUtilities.dp(36.0f)), ObjectAnimator.ofFloat(yyVar, (Property<yy, Float>) property, AndroidUtilities.dp(36.0f)));
                    }
                    this.J0.setDuration(200L);
                    this.J0.setInterpolator(pr.h);
                    this.J0.addListener(new oh.h3(this, j0Var, tl0Var, 5));
                    this.J0.start();
                } else {
                    if (yyVar != owVar) {
                        yyVar.setTranslationY(AndroidUtilities.dp(36.0f) - i12);
                    }
                    if (view != null && i11 != 2) {
                        view.setTranslationY(0.0f);
                    }
                    if (tl0Var == tl0Var2) {
                        i10 = 0;
                        tl0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + this.n2);
                    } else {
                        i10 = 0;
                        if (tl0Var == tl0Var3) {
                            tl0Var.setPadding(0, AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(44.0f) + this.n2);
                        } else {
                            if (tl0Var == tl0Var4) {
                                tl0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + this.n2);
                            }
                            i10 = 0;
                        }
                    }
                    j0Var.h1(i10, i10);
                }
            }
        }
        if (z4) {
            return;
        }
        this.q1.i(0);
    }

    public void setBlurredBackgroundDrawableFactory(og.a aVar) {
        org.telegram.ui.ActionBar.g6 g6Var = this.W1;
        yw ywVar = this.x;
        if (ywVar != null) {
            qg.b c3 = aVar.c(ywVar, null, false);
            c3.n(sg.b.d(g6Var));
            c3.p(AndroidUtilities.dp(18.0f));
            c3.o(AndroidUtilities.dp(6.0f));
            ywVar.setBackground(c3);
        }
        ImageView imageView = this.B;
        if (imageView != null) {
            qg.b c10 = aVar.c(imageView, null, false);
            c10.n(sg.b.d(g6Var));
            c10.p(AndroidUtilities.dp(18.0f));
            c10.o(AndroidUtilities.dp(6.0f));
            imageView.setBackground(c10);
        }
        hd0 hd0Var = this.w;
        if (hd0Var != null) {
            qg.b c11 = aVar.c(hd0Var, null, false);
            c11.n(sg.b.d(g6Var));
            c11.p(AndroidUtilities.dp(18.0f));
            c11.o(AndroidUtilities.dp(6.0f));
            hd0Var.setBackground(c11);
        }
        ImageView imageView2 = this.y;
        if (imageView2 != null) {
            qg.b c12 = aVar.c(imageView2, null, false);
            c12.n(sg.b.d(g6Var));
            c12.p(AndroidUtilities.dp(18.0f));
            c12.o(AndroidUtilities.dp(6.0f));
            imageView2.setBackground(c12);
        }
    }

    public void setBottomInset(int i10) {
        if (this.n2 != i10) {
            this.n2 = i10;
            j(i10, this.H);
            j(i10, this.J);
            j(AndroidUtilities.dp(44.0f) + i10, this.M);
            j(AndroidUtilities.dp(44.0f) + i10, this.A0);
            j(AndroidUtilities.dp(44.0f) + i10, this.e0);
            FrameLayout frameLayout = this.s;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-i10);
            }
            T();
            invalidate();
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.G1 = chatFull;
        Z(false);
    }

    public void setDelegate(my myVar) {
        this.q1 = myVar;
    }

    public void setDragListener(qx qxVar) {
        this.L0 = qxVar;
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        uw uwVar = this.D0;
        if (uwVar != null) {
            uwVar.d.setEnabled(z4);
        }
        ow owVar = this.l0;
        if (owVar != null) {
            owVar.d.setEnabled(z4);
        }
        iw iwVar = this.S;
        if (iwVar != null) {
            iwVar.d.setEnabled(z4);
        }
    }

    public void setForseMultiwindowLayout(boolean z4) {
        this.K1 = z4;
    }

    public void setShouldDrawBackground(boolean z4) {
        if (this.r0 != z4) {
            this.r0 = z4;
            U();
        }
    }

    public void setShowing(boolean z4) {
        this.M0 = z4;
        a0();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        a0();
        T();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        boolean z4 = getVisibility() != i10;
        super.setVisibility(i10);
        if (z4) {
            if (i10 != 8) {
                Emoji.sortEmoji();
                this.O.F(false);
                int i11 = this.Z0;
                NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.stickersDidLoad);
                if (this.v0 != null) {
                    NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
                    Z(false);
                    F();
                }
                k(true);
                k(false);
                MediaDataController.getInstance(i11).loadRecents(0, true, true, false);
                MediaDataController.getInstance(i11).loadRecents(0, false, true, false);
                MediaDataController.getInstance(i11).loadRecents(2, false, true, false);
            }
            bx bxVar = this.Q0;
            if (bxVar != null) {
                bxVar.a();
            }
        }
    }

    public final void t(boolean z4) {
        s(-1L, z4);
    }

    public final void u(boolean z4) {
        dz dzVar;
        boolean z10 = this.K2;
        this.K2 = z4;
        if (!z10 || z4) {
            return;
        }
        int i10 = this.x1;
        if (i10 == 0) {
            tx txVar = this.O;
            if (txVar != null) {
                txVar.F(false);
                return;
            }
            return;
        }
        if (i10 == 1) {
            qy qyVar = this.k0;
            if (qyVar != null) {
                qyVar.l();
                return;
            }
            return;
        }
        if (i10 != 2 || (dzVar = this.v0) == null) {
            return;
        }
        dzVar.l();
    }

    public final int v(float f10) {
        return i0.a.k(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Wk, this.W1), (int) (f10 * 255.0f));
    }

    public final f2.w w(int i10) {
        if (i10 == 0) {
            return this.B0;
        }
        if (i10 == 1) {
            return this.N;
        }
        if (i10 == 2) {
            return this.f0;
        }
        throw new IllegalArgumentException(l.d.j(i10, "Unexpected argument: "));
    }

    public final tl0 x(int i10) {
        if (i10 == 0) {
            return this.A0;
        }
        if (i10 == 1) {
            return this.M;
        }
        if (i10 == 2) {
            return this.e0;
        }
        throw new IllegalArgumentException(l.d.j(i10, "Unexpected argument: "));
    }

    public final HorizontalScrollView y(int i10) {
        if (i10 == 0) {
            return this.y0;
        }
        if (i10 == 1) {
            return this.F;
        }
        if (i10 == 2) {
            return this.m0;
        }
        throw new IllegalArgumentException(l.d.j(i10, "Unexpected argument: "));
    }

    @Override // xd.b
    public final void z(float f10, int i10) {
    }
}
