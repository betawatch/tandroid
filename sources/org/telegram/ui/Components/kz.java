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
import org.telegram.ui.cc1;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public class kz extends FrameLayout implements le.d, NotificationCenter.NotificationCenterDelegate, qh.a {
    public static final /* synthetic */ int O2 = 0;
    public final hw A0;
    public int A1;
    public final ArrayList A2;
    public final xw B0;
    public final vu B1;
    public final GradientDrawable B2;
    public final yw C0;
    public final int C1;
    public int C2;
    public final tw D0;
    public final int[] D1;
    public ArrayList D2;
    public final ImageView E;
    public final uw E0;
    public int E1;
    public int E2;
    public AnimatorSet F;
    public iz F0;
    public int F1;
    public long F2;
    public AnimatorSet G;
    public final ww G0;
    public int G1;
    public final le.b G2;
    public float H;
    public final oh.d H0;
    public int H1;
    public ArrayList H2;
    public final jw I;
    public boolean I0;
    public int I1;
    public boolean I2;
    public final jx J;
    public boolean J0;
    public TLRPC.ChatFull J1;
    public AnimatorSet J2;
    public final ah.w K;
    public boolean K0;
    public boolean K1;
    public org.telegram.messenger.video.k K2;
    public final oh.b L;
    public final ey L0;
    public int L1;
    public final cw L2;
    public final ah.w M;
    public AnimatorSet M0;
    public final bi.s5 M1;
    public boolean M2;
    public final oh.b N;
    public final bi.c4 N0;
    public boolean N1;
    public boolean N2;
    public final View O;
    public qx O0;
    public int O1;
    public final kx P;
    public boolean P0;
    public boolean P1;
    public final lx Q;
    public final int[] Q0;
    public boolean Q1;
    public final tx R;
    public final ObjectAnimator[] R0;
    public ty R1;
    public final ky S;
    public boolean S0;
    public float S1;
    public iz T;
    public hg.g1 T0;
    public float T1;
    public final oh.d U;
    public boolean U0;
    public float U1;
    public final kw V;
    public boolean V0;
    public float V1;
    public AnimatorSet W;
    public String[] W0;
    public float W1;
    public final Drawable[] X0;
    public boolean X1;
    public final Drawable[] Y0;
    public final org.telegram.ui.ActionBar.n2 Y1;
    public final Drawable[] Z0;
    public final org.telegram.ui.ActionBar.f6 Z1;
    public final le.b a;
    public final ok0 a0;
    public final String[] a1;
    public final org.telegram.ui.ActionBar.u5 a2;
    public final le.b b;
    public final ok0 b0;
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
    public final org.telegram.ui.Cells.l7 f2;
    public final mw g0;
    public boolean g1;
    public final dx g2;
    public final zw h;
    public final nw h0;
    public TLRPC.TL_messages_stickerSet h1;
    public boolean h2;
    public final qy i0;
    public ArrayList i1;
    public final boolean i2;
    public final py j0;
    public ArrayList j1;
    public final bh.f j2;
    public final sy k0;
    public ArrayList k1;
    public final lh k2;
    public final HashMap l0;
    public ArrayList l1;
    public final gh.d l2;
    public final hw m0;
    public final ArrayList m1;
    public final gh.c m2;
    public final FrameLayout n;
    public final py n0;
    public final ArrayList n1;
    public final bh.b n2;
    public final qw o0;
    public final ArrayList o1;
    public boolean o2;
    public final rx p0;
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
    public ly t1;
    public int t2;
    public boolean u0;
    public long u1;
    public int u2;
    public final View v;
    public boolean v0;
    public boolean v1;
    public long v2;
    public final ed0 w;
    public boolean w0;
    public boolean w1;
    public boolean w2;
    public final ax x;
    public final rw x0;
    public final TLRPC.StickerSetCovered[] x1;
    public boolean x2;
    public final ImageView y;
    public final bz y0;
    public final LongSparseArray y1;
    public final Rect y2;
    public final fz z0;
    public final LongSparseArray z1;
    public final RectF z2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v20, types: [org.telegram.ui.Components.hw, org.telegram.ui.Components.zk0] */
    /* JADX WARN: Type inference failed for: r4v66, types: [org.telegram.ui.Components.hw, org.telegram.ui.Components.zk0] */
    public kz(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11, boolean z12, Context context, boolean z13, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z14, final org.telegram.ui.ActionBar.f6 f6Var, boolean z15, boolean z16) {
        super(context);
        org.telegram.ui.ActionBar.u5 u5Var;
        int A;
        jx jxVar;
        final org.telegram.ui.ActionBar.f6 f6Var2;
        cw cwVar;
        boolean z17;
        kx kxVar;
        boolean z18;
        Context context2;
        int i10;
        int i11;
        boolean z19;
        Field field;
        pr prVar = pr.h;
        this.a = new le.b(0, this, prVar, 320L, false);
        this.b = new le.b(1, this, prVar, 320L, false);
        this.c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = new ArrayList();
        this.c0 = true;
        this.k0 = new sy(this);
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
        int i12 = UserConfig.selectedAccount;
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
        this.f2 = new org.telegram.ui.Cells.l7(this, 11);
        this.g2 = new dx(this);
        this.h2 = true;
        this.r2 = -1.0f;
        this.t2 = -1;
        this.u2 = -1;
        this.v2 = -1L;
        this.w2 = false;
        this.x2 = true;
        this.y2 = new Rect();
        RectF rectF = new RectF();
        this.z2 = rectF;
        ArrayList arrayList2 = new ArrayList(1);
        this.A2 = arrayList2;
        arrayList2.add(rectF);
        new Paint(1);
        this.B2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.G2 = new le.b(0, new fw(this, 1), prVar, 380L, true);
        this.L2 = new cw(this, 2);
        this.M2 = false;
        this.u0 = z14;
        this.Y1 = n2Var;
        this.c2 = z10;
        this.Z1 = f6Var;
        this.i2 = z16;
        gh.c cVar = new gh.c();
        this.m2 = cVar;
        cVar.a(A(org.telegram.ui.ActionBar.j6.d6));
        if (z15) {
            u(true);
        }
        i0.a.k(A(org.telegram.ui.ActionBar.j6.Wk), 30);
        int dp = AndroidUtilities.dp(50.0f);
        this.b1 = dp;
        this.d0 = z13;
        this.X0 = new Drawable[]{org.telegram.ui.ActionBar.j6.U(context, R.drawable.smiles_tab_smiles, z16 ? v(0.4f) : A(org.telegram.ui.ActionBar.j6.Re), z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.j6.Oe)), org.telegram.ui.ActionBar.j6.U(context, R.drawable.smiles_tab_gif, z16 ? v(0.4f) : A(org.telegram.ui.ActionBar.j6.Re), z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.j6.Oe)), org.telegram.ui.ActionBar.j6.U(context, R.drawable.smiles_tab_stickers, z16 ? v(0.4f) : A(org.telegram.ui.ActionBar.j6.Re), z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.j6.Oe))};
        org.telegram.ui.ActionBar.u5 U = org.telegram.ui.ActionBar.j6.U(context, R.drawable.msg_emoji_recent, z16 ? v(0.4f) : A(org.telegram.ui.ActionBar.j6.Me), z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.j6.Oe));
        org.telegram.ui.ActionBar.u5 U2 = org.telegram.ui.ActionBar.j6.U(context, R.drawable.emoji_tabs_faves, z16 ? v(0.4f) : A(org.telegram.ui.ActionBar.j6.Me), z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.j6.Oe));
        org.telegram.ui.ActionBar.u5 U3 = org.telegram.ui.ActionBar.j6.U(context, R.drawable.emoji_tabs_new3, z16 ? v(0.4f) : A(org.telegram.ui.ActionBar.j6.Me), z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.j6.Oe));
        int i13 = R.drawable.emoji_tabs_new1;
        if (z16) {
            u5Var = U3;
            A = v(0.4f);
        } else {
            u5Var = U3;
            A = A(org.telegram.ui.ActionBar.j6.Me);
        }
        org.telegram.ui.ActionBar.u5 U4 = org.telegram.ui.ActionBar.j6.U(context, i13, A, z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.j6.Oe));
        this.a2 = U4;
        int i14 = R.drawable.emoji_tabs_new2;
        int i15 = org.telegram.ui.ActionBar.j6.Qe;
        org.telegram.ui.ActionBar.u5 U5 = org.telegram.ui.ActionBar.j6.U(context, i14, A(i15), A(i15));
        this.b2 = U5;
        this.Y0 = new Drawable[]{U, U2, u5Var, new LayerDrawable(new Drawable[]{U4, U5})};
        this.Z0 = new Drawable[]{org.telegram.ui.ActionBar.j6.U(context, R.drawable.msg_emoji_recent, z16 ? v(0.4f) : A(org.telegram.ui.ActionBar.j6.Me), z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.j6.Oe)), org.telegram.ui.ActionBar.j6.U(context, R.drawable.stickers_gifs_trending, z16 ? v(0.4f) : A(org.telegram.ui.ActionBar.j6.Me), z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.j6.Oe))};
        this.a1 = new String[]{LocaleController.getString(R.string.Emoji1), LocaleController.getString(R.string.Emoji2), LocaleController.getString(R.string.Emoji3), LocaleController.getString(R.string.Emoji4), LocaleController.getString(R.string.Emoji5), LocaleController.getString(R.string.Emoji6), LocaleController.getString(R.string.Emoji7), LocaleController.getString(R.string.Emoji8)};
        this.J1 = chatFull;
        Paint paint = new Paint(1);
        this.s1 = paint;
        paint.setColor(A(org.telegram.ui.ActionBar.j6.af));
        float dp2 = AndroidUtilities.dp(6.0f);
        bi.z1 z1Var = yf.j0.a;
        this.M1 = new bi.s5(dp2);
        jx jxVar2 = new jx(this, context);
        this.J = jxVar2;
        gz gzVar = new gz();
        gzVar.a = 0;
        gzVar.b = jxVar2;
        arrayList.add(gzVar);
        if (z10) {
            MediaDataController.getInstance(i12).checkStickers(5);
            MediaDataController.getInstance(i12).checkFeaturedEmoji();
            this.e2 = new PorterDuffColorFilter(A(org.telegram.ui.ActionBar.j6.Oh), PorterDuff.Mode.SRC_IN);
        }
        kx kxVar2 = new kx(this, context);
        this.P = kxVar2;
        s4.j jVar = new s4.j();
        jVar.c = 220L;
        jVar.e = 220L;
        jVar.f = 160L;
        jVar.g = 160L;
        jVar.i = pr.g;
        kxVar2.setItemAnimator(jVar);
        final int i16 = 0;
        kxVar2.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.ew
            public final /* synthetic */ kz b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (i16) {
                    case 0:
                        org.telegram.ui.st q6 = org.telegram.ui.st.q();
                        kz kzVar = this.b;
                        kx kxVar3 = kzVar.P;
                        kzVar.getMeasuredHeight();
                        return q6.s(motionEvent, kxVar3, null, kzVar.g2, f6Var);
                    case 1:
                        org.telegram.ui.st q10 = org.telegram.ui.st.q();
                        kz kzVar2 = this.b;
                        return q10.s(motionEvent, kzVar2.h0, kzVar2.m0, kzVar2.g2, f6Var);
                    default:
                        org.telegram.ui.st q11 = org.telegram.ui.st.q();
                        kz kzVar3 = this.b;
                        tw twVar = kzVar3.D0;
                        kzVar3.getMeasuredHeight();
                        return q11.s(motionEvent, twVar, kzVar3.A0, kzVar3.g2, f6Var);
                }
            }
        });
        kxVar2.setOnItemLongClickListener(new fw(this, i16));
        kxVar2.setInstantClick(true);
        lx lxVar = new lx(this);
        this.Q = lxVar;
        kxVar2.setLayoutManager(lxVar);
        kxVar2.setTopGlowOffset(AndroidUtilities.dp(38.0f));
        kxVar2.setBottomGlowOffset(AndroidUtilities.dp(36.0f));
        kxVar2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f));
        int i17 = org.telegram.ui.ActionBar.j6.He;
        kxVar2.setGlowColor(A(i17));
        kxVar2.setItemSelectorColorProvider(new p2(11));
        kxVar2.setClipToPadding(false);
        lxVar.O = new mx(this);
        tx txVar = new tx(this);
        this.R = txVar;
        kxVar2.setAdapter(txVar);
        kxVar2.i(new di.r1(this, 3));
        this.S = new ky(this, context);
        jxVar2.addView(kxVar2, w7.x5.c(-1.0f, -1));
        ok0 ok0Var = new ok0(kxVar2, lxVar);
        this.b0 = ok0Var;
        ok0Var.i = new nx(this);
        kxVar2.setOnScrollListener(new ox(this));
        if (n2Var != null) {
            jxVar = jxVar2;
            f6Var2 = f6Var;
            cwVar = new cw(this, 5);
            kxVar = kxVar2;
            z18 = z16;
            context2 = context;
            i10 = dp;
            i11 = -1;
            z17 = z10;
        } else {
            jxVar = jxVar2;
            f6Var2 = f6Var;
            cwVar = null;
            z17 = z10;
            kxVar = kxVar2;
            z18 = z16;
            context2 = context;
            i10 = dp;
            i11 = -1;
        }
        jw jwVar = new jw(this, context2, f6Var2, z17, cwVar, z18);
        this.I = jwVar;
        if (z13) {
            kw kwVar = new kw(this, context2);
            this.V = kwVar;
            jxVar.addView(kwVar, new FrameLayout.LayoutParams(i11, AndroidUtilities.getShadowHeight() + i10));
            kwVar.d.setOnFocusChangeListener(new lw(this));
            oh.d dVar = new oh.d(context2, f6Var2);
            this.U = dVar;
            dVar.setVisibility(8);
            final int i18 = 0;
            dVar.setOnBackClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gw
                public final /* synthetic */ kz b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i18) {
                        case 0:
                            ky kyVar = this.b.S;
                            fy fyVar = kyVar.c;
                            int childCount = fyVar.getChildCount();
                            for (int i19 = 0; i19 < childCount; i19++) {
                                ((oh.c) fyVar.getChildAt(i19)).a(false, true);
                            }
                            kyVar.d = 0L;
                            kyVar.F.b.a(false, true);
                            kyVar.l();
                            break;
                        case 1:
                            fz fzVar = this.b.z0;
                            ez ezVar = fzVar.c;
                            int childCount2 = ezVar.getChildCount();
                            for (int i20 = 0; i20 < childCount2; i20++) {
                                ((oh.c) ezVar.getChildAt(i20)).a(false, true);
                            }
                            fzVar.d = 0L;
                            fzVar.Q.a.a(false, true);
                            fzVar.l();
                            break;
                        case 2:
                            ly lyVar = this.b.t1;
                            if (lyVar != null) {
                                lyVar.w();
                                break;
                            }
                            break;
                        default:
                            kz kzVar = this.b;
                            int currentItem = kzVar.h.getCurrentItem();
                            xy xyVar = currentItem == 0 ? kzVar.V : currentItem == 1 ? kzVar.o0 : kzVar.G0;
                            if (xyVar != null) {
                                hq hqVar = xyVar.d;
                                hqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                hqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                hqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
            jxVar.addView(dVar, new FrameLayout.LayoutParams(i11, i10));
        }
        int A2 = A(i17);
        if (Color.alpha(A2) >= 255) {
            jwVar.setBackgroundColor(A2);
        }
        txVar.G(true);
        jwVar.p(getEmojipacks());
        jxVar.addView(jwVar, w7.x5.c(36.0f, i11));
        View view = new View(context2);
        this.O = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i19 = org.telegram.ui.ActionBar.j6.Ke;
        view.setBackgroundColor(A(i19));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i11, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(36.0f);
        jxVar.addView(view, layoutParams);
        oh.b bVar = new oh.b(context2, f6Var2);
        this.L = bVar;
        ah.w wVar = new ah.w(context2, 5, f6Var2);
        this.K = wVar;
        wVar.setVisibility(8);
        wVar.addView(bVar, w7.x5.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
        jxVar.addView(wVar, w7.x5.e(i11, -2, 80));
        if (z11) {
            hm0 hm0Var = hm0.b;
            if (z12) {
                mw mwVar = new mw(this, context2);
                this.g0 = mwVar;
                gz gzVar2 = new gz();
                gzVar2.a = 1;
                gzVar2.b = mwVar;
                this.d.add(gzVar2);
                nw nwVar = new nw(this, context2);
                this.h0 = nwVar;
                nwVar.setClipToPadding(false);
                qy qyVar = new qy(this);
                this.i0 = qyVar;
                nwVar.setLayoutManager(qyVar);
                nwVar.i(new ow(this));
                nwVar.setPadding(0, i10, 0, AndroidUtilities.dp(44.0f) + this.q2);
                nwVar.setOverScrollMode(2);
                ((s4.f1) nwVar.getItemAnimator()).m = false;
                py pyVar = new py(this, context2, true, ConnectionsManager.DEFAULT_DATACENTER_ID);
                this.n0 = pyVar;
                nwVar.setAdapter(pyVar);
                this.j0 = new py(this, context2, false, 0);
                nwVar.setOnScrollListener(new pw(this));
                final int i20 = 1;
                nwVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.ew
                    public final /* synthetic */ kz b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (i20) {
                            case 0:
                                org.telegram.ui.st q6 = org.telegram.ui.st.q();
                                kz kzVar = this.b;
                                kx kxVar3 = kzVar.P;
                                kzVar.getMeasuredHeight();
                                return q6.s(motionEvent, kxVar3, null, kzVar.g2, f6Var2);
                            case 1:
                                org.telegram.ui.st q10 = org.telegram.ui.st.q();
                                kz kzVar2 = this.b;
                                return q10.s(motionEvent, kzVar2.h0, kzVar2.m0, kzVar2.g2, f6Var2);
                            default:
                                org.telegram.ui.st q11 = org.telegram.ui.st.q();
                                kz kzVar3 = this.b;
                                tw twVar = kzVar3.D0;
                                kzVar3.getMeasuredHeight();
                                return q11.s(motionEvent, twVar, kzVar3.A0, kzVar3.g2, f6Var2);
                        }
                    }
                });
                final int i21 = 0;
                ?? r12 = new zk0(this) { // from class: org.telegram.ui.Components.hw
                    public final /* synthetic */ kz b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.ui.Components.zk0
                    public final void a(int i22, View view2) {
                        switch (i21) {
                            case 0:
                                kz kzVar = this.b;
                                nw nwVar2 = kzVar.h0;
                                py pyVar2 = kzVar.j0;
                                py pyVar3 = kzVar.n0;
                                if (kzVar.t1 != null) {
                                    pyVar3.getClass();
                                    ArrayList arrayList3 = pyVar3.x;
                                    if (nwVar2.getAdapter() != pyVar3) {
                                        if (nwVar2.getAdapter() == pyVar2 && i22 >= 0 && i22 < pyVar2.x.size()) {
                                            kzVar.t1.v(view2, pyVar2.x.get(i22), pyVar2.w, pyVar2.n, true, 0, 0);
                                            kzVar.Y();
                                            break;
                                        }
                                    } else if (i22 >= 0) {
                                        int i23 = pyVar3.H;
                                        if (i22 >= i23) {
                                            int i24 = i23 > 0 ? (i22 - i23) - 1 : i22;
                                            if (i24 >= 0 && i24 < arrayList3.size()) {
                                                kzVar.t1.v(view2, arrayList3.get(i24), null, pyVar3.n, true, 0, 0);
                                                break;
                                            }
                                        } else {
                                            kzVar.t1.v(view2, kzVar.i1.get(i22), null, "gif", true, 0, 0);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                kz kzVar2 = this.b;
                                s4.h0 adapter = kzVar2.D0.getAdapter();
                                fz fzVar = kzVar2.z0;
                                String str = adapter == fzVar ? fzVar.N : null;
                                if (view2 instanceof org.telegram.ui.Cells.f8) {
                                    org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view2;
                                    if (f8Var.getSticker() != null && MessageObject.isPremiumSticker(f8Var.getSticker()) && !AccountInstance.getInstance(kzVar2.c1).getUserConfig().isPremium()) {
                                        org.telegram.ui.st.q().y(f8Var);
                                        break;
                                    } else {
                                        org.telegram.ui.st.q().u();
                                        if (!f8Var.r) {
                                            f8Var.r = true;
                                            f8Var.n = 0.5f;
                                            f8Var.x = 0L;
                                            org.telegram.ui.Cells.e8 e8Var = f8Var.a;
                                            e8Var.setAlpha(0.5f * f8Var.H);
                                            e8Var.invalidate();
                                            f8Var.s = System.currentTimeMillis();
                                            f8Var.invalidate();
                                            kzVar2.t1.m(f8Var, f8Var.getSticker(), str, f8Var.getParentObject(), f8Var.getSendAnimationData(), true, 0);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                };
                this.m0 = r12;
                nwVar.setOnItemClickListener((zk0) r12);
                mwVar.addView(nwVar, w7.x5.c(-1.0f, -1));
                qw qwVar = new qw(this, context2);
                this.o0 = qwVar;
                mwVar.addView(qwVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + i10));
                rx rxVar = new rx(this, context2, f6Var2);
                this.p0 = rxVar;
                rxVar.setType(hm0Var);
                rxVar.setUnderlineHeight(AndroidUtilities.getShadowHeight());
                rxVar.setIndicatorColor(A(i15));
                rxVar.setUnderlineColor(A(i19));
                rxVar.setBackgroundColor(A(i17));
                X();
                rxVar.setDelegate(new fw(this, 2));
                pyVar.F("", "", true, true, true);
            }
            rw rwVar = new rw(this, context2, z14);
            this.x0 = rwVar;
            MediaDataController.getInstance(this.c1).checkStickers(0);
            MediaDataController.getInstance(this.c1).checkFeaturedStickers();
            tw twVar = new tw(this, context2);
            this.D0 = twVar;
            uw uwVar = new uw(this);
            this.E0 = uwVar;
            twVar.setLayoutManager(uwVar);
            uwVar.O = new vw(this);
            twVar.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f));
            twVar.setClipToPadding(false);
            gz gzVar3 = new gz();
            gzVar3.a = 2;
            gzVar3.b = rwVar;
            this.d.add(gzVar3);
            this.z0 = new fz(this, context2);
            bz bzVar = new bz(this, context2);
            this.y0 = bzVar;
            twVar.setAdapter(bzVar);
            final int i22 = 2;
            twVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.ew
                public final /* synthetic */ kz b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (i22) {
                        case 0:
                            org.telegram.ui.st q6 = org.telegram.ui.st.q();
                            kz kzVar = this.b;
                            kx kxVar3 = kzVar.P;
                            kzVar.getMeasuredHeight();
                            return q6.s(motionEvent, kxVar3, null, kzVar.g2, f6Var2);
                        case 1:
                            org.telegram.ui.st q10 = org.telegram.ui.st.q();
                            kz kzVar2 = this.b;
                            return q10.s(motionEvent, kzVar2.h0, kzVar2.m0, kzVar2.g2, f6Var2);
                        default:
                            org.telegram.ui.st q11 = org.telegram.ui.st.q();
                            kz kzVar3 = this.b;
                            tw twVar2 = kzVar3.D0;
                            kzVar3.getMeasuredHeight();
                            return q11.s(motionEvent, twVar2, kzVar3.A0, kzVar3.g2, f6Var2);
                    }
                }
            });
            final int i23 = 1;
            ?? r42 = new zk0(this) { // from class: org.telegram.ui.Components.hw
                public final /* synthetic */ kz b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.Components.zk0
                public final void a(int i222, View view2) {
                    switch (i23) {
                        case 0:
                            kz kzVar = this.b;
                            nw nwVar2 = kzVar.h0;
                            py pyVar2 = kzVar.j0;
                            py pyVar3 = kzVar.n0;
                            if (kzVar.t1 != null) {
                                pyVar3.getClass();
                                ArrayList arrayList3 = pyVar3.x;
                                if (nwVar2.getAdapter() != pyVar3) {
                                    if (nwVar2.getAdapter() == pyVar2 && i222 >= 0 && i222 < pyVar2.x.size()) {
                                        kzVar.t1.v(view2, pyVar2.x.get(i222), pyVar2.w, pyVar2.n, true, 0, 0);
                                        kzVar.Y();
                                        break;
                                    }
                                } else if (i222 >= 0) {
                                    int i232 = pyVar3.H;
                                    if (i222 >= i232) {
                                        int i24 = i232 > 0 ? (i222 - i232) - 1 : i222;
                                        if (i24 >= 0 && i24 < arrayList3.size()) {
                                            kzVar.t1.v(view2, arrayList3.get(i24), null, pyVar3.n, true, 0, 0);
                                            break;
                                        }
                                    } else {
                                        kzVar.t1.v(view2, kzVar.i1.get(i222), null, "gif", true, 0, 0);
                                        break;
                                    }
                                }
                            }
                            break;
                        default:
                            kz kzVar2 = this.b;
                            s4.h0 adapter = kzVar2.D0.getAdapter();
                            fz fzVar = kzVar2.z0;
                            String str = adapter == fzVar ? fzVar.N : null;
                            if (view2 instanceof org.telegram.ui.Cells.f8) {
                                org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view2;
                                if (f8Var.getSticker() != null && MessageObject.isPremiumSticker(f8Var.getSticker()) && !AccountInstance.getInstance(kzVar2.c1).getUserConfig().isPremium()) {
                                    org.telegram.ui.st.q().y(f8Var);
                                    break;
                                } else {
                                    org.telegram.ui.st.q().u();
                                    if (!f8Var.r) {
                                        f8Var.r = true;
                                        f8Var.n = 0.5f;
                                        f8Var.x = 0L;
                                        org.telegram.ui.Cells.e8 e8Var = f8Var.a;
                                        e8Var.setAlpha(0.5f * f8Var.H);
                                        e8Var.invalidate();
                                        f8Var.s = System.currentTimeMillis();
                                        f8Var.invalidate();
                                        kzVar2.t1.m(f8Var, f8Var.getSticker(), str, f8Var.getParentObject(), f8Var.getSendAnimationData(), true, 0);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            };
            this.A0 = r42;
            twVar.setOnItemClickListener((zk0) r42);
            twVar.setGlowColor(A(i17));
            rwVar.addView(twVar);
            this.a0 = new ok0(twVar, uwVar);
            ww wwVar = new ww(this, context2);
            this.G0 = wwVar;
            rwVar.addView(wwVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + i10));
            oh.d dVar2 = new oh.d(context2, f6Var2);
            this.H0 = dVar2;
            dVar2.setVisibility(8);
            final int i24 = 1;
            dVar2.setOnBackClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gw
                public final /* synthetic */ kz b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i24) {
                        case 0:
                            ky kyVar = this.b.S;
                            fy fyVar = kyVar.c;
                            int childCount = fyVar.getChildCount();
                            for (int i192 = 0; i192 < childCount; i192++) {
                                ((oh.c) fyVar.getChildAt(i192)).a(false, true);
                            }
                            kyVar.d = 0L;
                            kyVar.F.b.a(false, true);
                            kyVar.l();
                            break;
                        case 1:
                            fz fzVar = this.b.z0;
                            ez ezVar = fzVar.c;
                            int childCount2 = ezVar.getChildCount();
                            for (int i202 = 0; i202 < childCount2; i202++) {
                                ((oh.c) ezVar.getChildAt(i202)).a(false, true);
                            }
                            fzVar.d = 0L;
                            fzVar.Q.a.a(false, true);
                            fzVar.l();
                            break;
                        case 2:
                            ly lyVar = this.b.t1;
                            if (lyVar != null) {
                                lyVar.w();
                                break;
                            }
                            break;
                        default:
                            kz kzVar = this.b;
                            int currentItem = kzVar.h.getCurrentItem();
                            xy xyVar = currentItem == 0 ? kzVar.V : currentItem == 1 ? kzVar.o0 : kzVar.G0;
                            if (xyVar != null) {
                                hq hqVar = xyVar.d;
                                hqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                hqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                hqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
            rwVar.addView(dVar2, new FrameLayout.LayoutParams(-1, i10));
            z19 = z14;
            xw xwVar = new xw(this, context2, f6Var2, n2Var, z19);
            this.B0 = xwVar;
            xwVar.setDragEnabled(true);
            xwVar.setWillNotDraw(false);
            xwVar.setType(hm0Var);
            xwVar.setUnderlineHeight(twVar.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
            xwVar.setIndicatorColor(A(i15));
            xwVar.setUnderlineColor(A(i19));
            if (viewGroup == null || !z19) {
                rwVar.addView(xwVar, w7.x5.e(-1, 36, 51));
            } else {
                yw ywVar = new yw(this, context2);
                this.C0 = ywVar;
                ywVar.addView(xwVar, w7.x5.e(-1, 36, 51));
                viewGroup.addView(ywVar, w7.x5.c(-2.0f, -1));
            }
            Z(true);
            xwVar.setDelegate(new fw(this, 3));
            twVar.setOnScrollListener(new jz(this, 0));
            oh.b bVar2 = new oh.b(context2, f6Var2);
            this.N = bVar2;
            ah.w wVar2 = new ah.w(context2, 5, f6Var2);
            this.M = wVar2;
            wVar2.setVisibility(8);
            wVar2.addView(bVar2, w7.x5.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
            rwVar.addView(wVar2, w7.x5.e(-1, -2, 80));
        } else {
            z19 = z14;
        }
        this.e.clear();
        this.e.addAll(this.d);
        zw zwVar = new zw(this, context2);
        this.h = zwVar;
        ey eyVar = new ey(this);
        this.L0 = eyVar;
        zwVar.setAdapter(eyVar);
        ax axVar = new ax(this, context2);
        this.x = axVar;
        axVar.setHapticFeedbackEnabled(true);
        axVar.setImageResource(R.drawable.smiles_tab_clear);
        int v = z16 ? v(0.6f) : A(org.telegram.ui.ActionBar.j6.Re);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        axVar.setColorFilter(new PorterDuffColorFilter(v, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        axVar.setScaleType(scaleType);
        axVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        axVar.setFocusable(true);
        axVar.setOnClickListener(new bx());
        w7.z5.a(axVar);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.r = frameLayout;
        if (z13) {
            addView(frameLayout, w7.x5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, (AndroidUtilities.getShadowHeight() / AndroidUtilities.density) + 40.0f));
        } else {
            addView(frameLayout, w7.x5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.s = frameLayout2;
        addView(frameLayout2, w7.x5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.n = frameLayout3;
        View view2 = new View(context2);
        this.v = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(40.0f), 83));
        if (z13) {
            addView(frameLayout3, w7.x5.e(-1, 48, 80));
            frameLayout3.addView(axVar, w7.x5.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
            if (z11) {
                ImageView imageView = new ImageView(context2);
                this.y = imageView;
                imageView.setImageResource(R.drawable.smiles_tab_settings);
                imageView.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : A(org.telegram.ui.ActionBar.j6.Re), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(LocaleController.getString(R.string.Settings));
                w7.z5.a(imageView);
                frameLayout3.addView(imageView, w7.x5.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
                final int i25 = 2;
                imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gw
                    public final /* synthetic */ kz b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i25) {
                            case 0:
                                ky kyVar = this.b.S;
                                fy fyVar = kyVar.c;
                                int childCount = fyVar.getChildCount();
                                for (int i192 = 0; i192 < childCount; i192++) {
                                    ((oh.c) fyVar.getChildAt(i192)).a(false, true);
                                }
                                kyVar.d = 0L;
                                kyVar.F.b.a(false, true);
                                kyVar.l();
                                break;
                            case 1:
                                fz fzVar = this.b.z0;
                                ez ezVar = fzVar.c;
                                int childCount2 = ezVar.getChildCount();
                                for (int i202 = 0; i202 < childCount2; i202++) {
                                    ((oh.c) ezVar.getChildAt(i202)).a(false, true);
                                }
                                fzVar.d = 0L;
                                fzVar.Q.a.a(false, true);
                                fzVar.l();
                                break;
                            case 2:
                                ly lyVar = this.b.t1;
                                if (lyVar != null) {
                                    lyVar.w();
                                    break;
                                }
                                break;
                            default:
                                kz kzVar = this.b;
                                int currentItem = kzVar.h.getCurrentItem();
                                xy xyVar = currentItem == 0 ? kzVar.V : currentItem == 1 ? kzVar.o0 : kzVar.G0;
                                if (xyVar != null) {
                                    hq hqVar = xyVar.d;
                                    hqVar.requestFocus();
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                    hqVar.onTouchEvent(obtain);
                                    obtain.recycle();
                                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                    hqVar.onTouchEvent(obtain2);
                                    obtain2.recycle();
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
            ed0 ed0Var = new ed0(context2, f6Var2);
            this.w = ed0Var;
            ed0Var.setViewPager(zwVar);
            ed0Var.setShouldExpand(false);
            ed0Var.setIndicatorHeight(AndroidUtilities.dp(3.0f));
            ed0Var.setIndicatorColor(i0.a.k(A(org.telegram.ui.ActionBar.j6.Oe), 20));
            ed0Var.setUnderlineHeight(0);
            ed0Var.setTabPaddingLeftRight(AndroidUtilities.dp(11.0f));
            ed0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
            frameLayout3.addView(ed0Var, w7.x5.e(-2, 48, 81));
            ed0Var.setOnPageChangeListener(new cx(this, z19));
            ImageView imageView2 = new ImageView(context2);
            this.E = imageView2;
            imageView2.setImageResource(R.drawable.smiles_tab_search);
            imageView2.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : A(org.telegram.ui.ActionBar.j6.Re), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(LocaleController.getString(R.string.Search));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, w7.x5.d(48, 48.0f, 83, 2.0f, 0.0f, 2.0f, 0.0f));
            final int i26 = 3;
            imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gw
                public final /* synthetic */ kz b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view22) {
                    switch (i26) {
                        case 0:
                            ky kyVar = this.b.S;
                            fy fyVar = kyVar.c;
                            int childCount = fyVar.getChildCount();
                            for (int i192 = 0; i192 < childCount; i192++) {
                                ((oh.c) fyVar.getChildAt(i192)).a(false, true);
                            }
                            kyVar.d = 0L;
                            kyVar.F.b.a(false, true);
                            kyVar.l();
                            break;
                        case 1:
                            fz fzVar = this.b.z0;
                            ez ezVar = fzVar.c;
                            int childCount2 = ezVar.getChildCount();
                            for (int i202 = 0; i202 < childCount2; i202++) {
                                ((oh.c) ezVar.getChildAt(i202)).a(false, true);
                            }
                            fzVar.d = 0L;
                            fzVar.Q.a.a(false, true);
                            fzVar.l();
                            break;
                        case 2:
                            ly lyVar = this.b.t1;
                            if (lyVar != null) {
                                lyVar.w();
                                break;
                            }
                            break;
                        default:
                            kz kzVar = this.b;
                            int currentItem = kzVar.h.getCurrentItem();
                            xy xyVar = currentItem == 0 ? kzVar.V : currentItem == 1 ? kzVar.o0 : kzVar.G0;
                            if (xyVar != null) {
                                hq hqVar = xyVar.d;
                                hqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                hqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                hqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            addView(frameLayout3, w7.x5.d(56, 48.0f, (LocaleController.isRTL ? 3 : 5) | 80, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(56.0f), A(i17), A(i17));
            w7.z5.a(axVar);
            axVar.setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
            axVar.setBackground(h02);
            axVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
            axVar.setFocusable(true);
            frameLayout3.addView(axVar, w7.x5.d(48, 48.0f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
            view2.setVisibility(8);
        }
        addView(zwVar, 0, w7.x5.e(-1, -1, 51));
        bi.c4 c4Var = new bi.c4(context2, 22);
        this.N0 = c4Var;
        c4Var.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(6.0f), A(org.telegram.ui.ActionBar.j6.qf)));
        c4Var.setTextColor(A(org.telegram.ui.ActionBar.j6.pf));
        c4Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f));
        c4Var.setGravity(16);
        c4Var.setTextSize(1, 14.0f);
        c4Var.setVisibility(4);
        addView(c4Var, w7.x5.d(-2, -2.0f, 81, 5.0f, 0.0f, 5.0f, 53.0f));
        this.C1 = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 32.0f);
        Field field2 = vu.f;
        vu vuVar = new vu(new uu(context2, f6Var2));
        if (vu.f == null) {
            try {
                field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    field.setAccessible(true);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                field = null;
            }
            vu.f = field;
        }
        Field field3 = vu.f;
        if (field3 != null) {
            try {
                vuVar.a = (ViewTreeObserver.OnScrollChangedListener) field3.get(vuVar);
                vu.f.set(vuVar, vu.g);
            } catch (Exception unused3) {
                vuVar.a = null;
            }
        }
        this.B1 = vuVar;
        vuVar.c.setOnSelectionUpdateListener(new d(this, 10));
        this.A1 = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
        Emoji.loadRecentEmoji();
        txVar.F(false);
        K(true, z11, z12, false);
        if (Build.VERSION.SDK_INT >= 31) {
            gh.d dVar3 = new gh.d(null);
            this.l2 = dVar3;
            bh.b bVar3 = new bh.b(dVar3);
            this.n2 = bVar3;
            bVar3.f = LiteMode.isEnabled(262144);
            this.j2 = new bh.f(false);
        } else {
            this.l2 = null;
            this.n2 = new bh.b(this.m2);
            this.j2 = null;
        }
        ih.k kVar = new ih.k(this);
        ed0 ed0Var2 = this.w;
        if (ed0Var2 != null) {
            kVar.d(ed0Var2, this, new fw(this, 4), false);
        }
        bh.b bVar4 = this.n2;
        bVar4.d = kVar;
        bVar4.e = this;
        ch.a[] aVarArr = new ch.a[3];
        kx kxVar3 = kxVar;
        kxVar3.C0(new cw(this, 1));
        aVarArr[0] = new bh.l(kxVar3, this, new dw(kxVar3, 0));
        nw nwVar2 = this.h0;
        if (nwVar2 != null) {
            nwVar2.C0(new cw(this, 3));
            nw nwVar3 = this.h0;
            Objects.requireNonNull(nwVar3);
            aVarArr[1] = new bh.l(nwVar3, this, new dw(nwVar3, 1));
        }
        tw twVar2 = this.D0;
        if (twVar2 != null) {
            twVar2.C0(new cw(this, 4));
            aVarArr[2] = new bh.l(this.D0, this, new dw(this, 2));
        }
        this.k2 = new lh(aVarArr, 1);
        setBlurredBackgroundDrawableFactory(this.n2);
    }

    public static void c(kz kzVar, boolean z10) {
        nw nwVar = kzVar.h0;
        if (nwVar == null) {
            return;
        }
        int childCount = nwVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = nwVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.e2) {
                ImageReceiver photoImage = ((org.telegram.ui.Cells.e2) childAt).getPhotoImage();
                if (z10) {
                    photoImage.setAllowStartAnimation(true);
                    photoImage.startAnimation();
                } else {
                    photoImage.setAllowStartAnimation(false);
                    photoImage.stopAnimation();
                }
            }
        }
    }

    public static void d(kz kzVar, ty tyVar, String str) {
        String str2;
        ly lyVar;
        org.telegram.ui.ActionBar.n2 n2Var = kzVar.Y1;
        int i10 = kzVar.c1;
        ArrayList arrayList = kzVar.q1;
        if (tyVar == null) {
            return;
        }
        if (tyVar.getSpan() == null) {
            kzVar.F2 = SystemClock.elapsedRealtime();
            kzVar.O(true);
            String str3 = str != null ? str : (String) tyVar.getTag();
            new SpannableStringBuilder().append((CharSequence) str3);
            if (str != null) {
                ly lyVar2 = kzVar.t1;
                if (lyVar2 != null) {
                    lyVar2.l(Emoji.fixEmoji(str));
                    return;
                }
                return;
            }
            if (!tyVar.c && (str2 = Emoji.emojiColor.get(str3)) != null) {
                str3 = g(str3, str2);
            }
            kzVar.h(str3);
            ly lyVar3 = kzVar.t1;
            if (lyVar3 != null) {
                lyVar3.l(Emoji.fixEmoji(str3));
                return;
            }
            return;
        }
        if (kzVar.t1 != null) {
            long j3 = tyVar.getSpan().documentId;
            TLRPC.Document document = tyVar.getSpan().document;
            xx xxVar = tyVar.e;
            boolean z10 = xxVar != null && xxVar.i;
            if (document == null) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    xx xxVar2 = (xx) arrayList.get(i11);
                    int i12 = 0;
                    while (true) {
                        ArrayList arrayList2 = xxVar2.c;
                        if (arrayList2 != null && i12 < arrayList2.size()) {
                            if (((TLRPC.Document) xxVar2.c.get(i12)).id == j3) {
                                document = (TLRPC.Document) xxVar2.c.get(i12);
                                break;
                            }
                            i12++;
                        }
                    }
                }
            }
            if (document == null) {
                document = q5.f(i10, j3);
            }
            String findAnimatedEmojiEmoticon = document != null ? MessageObject.findAnimatedEmojiEmoticon(document) : null;
            if (MessageObject.isFreeEmoji(document) || UserConfig.getInstance(i10).isPremium() || (((lyVar = kzVar.t1) != null && lyVar.g()) || kzVar.U0 || z10)) {
                kzVar.F2 = SystemClock.elapsedRealtime();
                kzVar.O(true);
                kzVar.h("animated_" + j3);
                kzVar.t1.x(j3, document, findAnimatedEmojiEmoticon, tyVar.c);
                return;
            }
            kzVar.O(false);
            yc a02 = n2Var != null ? yc.a0(n2Var) : new yc(kzVar.r, kzVar.Z1);
            if (kzVar.h2 || n2Var == null) {
                a02.q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new cw(kzVar, 7)).j();
            } else {
                a02.J(R.raw.saved_messages, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint2)), LocaleController.getString(R.string.Open), new cw(kzVar, 8)).j();
            }
            kzVar.h2 = !kzVar.h2;
        }
    }

    public static void e(kz kzVar, int i10, int i11) {
        s4.c1 K;
        int[] iArr = kzVar.Q0;
        if (i10 == 1) {
            kzVar.n(kzVar.P, i11);
            return;
        }
        ly lyVar = kzVar.t1;
        if ((lyVar == null || !lyVar.z()) && !kzVar.J0) {
            ll0 x10 = kzVar.x(i10);
            if (i11 <= 0 || x10 == null || x10.getVisibility() != 0 || (K = x10.K(0)) == null || K.a.getTop() + kzVar.b1 < x10.getPaddingTop()) {
                int i12 = iArr[i10] - i11;
                iArr[i10] = i12;
                if (i12 > 0) {
                    iArr[i10] = 0;
                } else if (i12 < (-AndroidUtilities.dp(288.0f))) {
                    iArr[i10] = -AndroidUtilities.dp(288.0f);
                }
                if (i10 == 0) {
                    kzVar.a0();
                } else {
                    kzVar.y(i10).setTranslationY(Math.max(-AndroidUtilities.dp(48.0f), iArr[i10]));
                }
            }
        }
    }

    public static void f(kz kzVar, boolean z10) {
        int N0;
        qy qyVar = kzVar.i0;
        qw qwVar = kzVar.o0;
        nw nwVar = kzVar.h0;
        if (nwVar != null && (nwVar.getAdapter() instanceof py)) {
            py pyVar = (py) nwVar.getAdapter();
            if (!pyVar.s && pyVar.h == 0 && !pyVar.x.isEmpty() && (N0 = qyVar.N0()) != -1 && N0 > qyVar.B() - 5) {
                String str = pyVar.w;
                String str2 = pyVar.r;
                boolean z11 = pyVar.v;
                pyVar.F(str, str2, true, z11, z11);
            }
        }
        ly lyVar = kzVar.t1;
        if (lyVar == null || !lyVar.z()) {
            if (qwVar == null || nwVar == null) {
                return;
            }
            qwVar.a.a(true, !z10);
            return;
        }
        s4.c1 K = nwVar.K(0);
        if (K == null) {
            xy.a(qwVar, true, !z10);
        } else {
            xy.a(qwVar, K.a.getTop() < nwVar.getPaddingTop(), !z10);
        }
    }

    public static String g(String str, String str2) {
        boolean z10;
        String str3;
        if (CompoundEmoji.isHandshake(str) != null) {
            return CompoundEmoji.applyColor(str, str2);
        }
        if (Emoji.endsWithRightArrow(str)) {
            str = com.google.android.gms.internal.vision.e2.i(2, 0, str);
            z10 = true;
        } else {
            z10 = false;
        }
        int length = str.length();
        if (length > 2 && str.charAt(str.length() - 2) == 8205) {
            str3 = str.substring(str.length() - 2);
            str = com.google.android.gms.internal.vision.e2.i(2, 0, str);
        } else if (length <= 3 || str.charAt(str.length() - 3) != 8205) {
            str3 = null;
        } else {
            str3 = str.substring(str.length() - 3);
            str = com.google.android.gms.internal.vision.e2.i(3, 0, str);
        }
        String t10 = org.telegram.ui.Cells.p6.t(str, str2);
        if (str3 != null) {
            t10 = org.telegram.ui.Cells.p6.t(t10, str3);
        }
        return z10 ? org.telegram.ui.Cells.p6.t(t10, "\u200d➡") : t10;
    }

    public static void j(int i10, View view) {
        if (view == null) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i10);
    }

    public final int A(int i10) {
        org.telegram.ui.ActionBar.f6 f6Var = this.Z1;
        return f6Var != null ? f6Var.G0(i10) : org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    public final void B() {
        ww wwVar = this.G0;
        if (wwVar != null) {
            wwVar.b();
        }
        qw qwVar = this.o0;
        if (qwVar != null) {
            qwVar.b();
        }
        kw kwVar = this.V;
        if (kwVar != null) {
            kwVar.b();
        }
    }

    public final void C() {
        bh.f fVar;
        if (Build.VERSION.SDK_INT < 31 || (fVar = this.j2) == null) {
            return;
        }
        ed0 ed0Var = this.w;
        RectF rectF = this.z2;
        ih.k.c(ed0Var, this, rectF);
        rectF.inset(LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f), LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        rectF.right = getMeasuredWidth();
        rectF.bottom = Math.min(rectF.bottom, getMeasuredHeight());
        fVar.g(1, this.A2);
        fVar.e(this.k2, getWidth(), getHeight());
    }

    public final void D() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        int i10 = this.c1;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.groupPackUpdated);
        if (this.y0 != null) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.featuredStickersDidLoad);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.groupStickersDidLoad);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        }
    }

    @Override // le.d
    public final void E(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 0) {
            q(false);
            float f11 = 1.0f - this.a.e;
            ww wwVar = this.G0;
            wwVar.setAlpha(f11);
            wwVar.setVisibility(f11 > 0.0f ? 0 : 4);
            float f12 = 1.0f - f11;
            oh.d dVar = this.H0;
            dVar.setAlpha(f12);
            dVar.setTranslationY((-AndroidUtilities.dp(15.0f)) * f11);
            dVar.setVisibility(f12 > 0.0f ? 0 : 4);
            ah.w wVar = this.M;
            wVar.setAlpha(f12);
            wVar.setTranslationY(AndroidUtilities.dp(30.0f) * f11);
            wVar.setVisibility(f12 > 0.0f ? 0 : 4);
            T();
            this.x0.invalidate();
            return;
        }
        if (i10 == 1) {
            l(false);
            float f13 = 1.0f - this.b.e;
            kw kwVar = this.V;
            kwVar.setAlpha(f13);
            kwVar.setVisibility(f13 > 0.0f ? 0 : 4);
            float f14 = 1.0f - f13;
            oh.d dVar2 = this.U;
            dVar2.setAlpha(f14);
            dVar2.setTranslationY((-AndroidUtilities.dp(15.0f)) * f13);
            dVar2.setVisibility(f14 > 0.0f ? 0 : 4);
            ah.w wVar2 = this.K;
            wVar2.setAlpha(f14);
            wVar2.setTranslationY(AndroidUtilities.dp(30.0f) * f13);
            wVar2.setVisibility(f14 > 0.0f ? 0 : 4);
            T();
            this.J.invalidate();
        }
    }

    public final void F(boolean z10, boolean z11) {
        wy wyVar;
        if (this.A1 != 0 && this.w1) {
            this.A1 = 0;
        }
        if (this.A1 == 0 && this.v1) {
            this.A1 = 1;
        }
        int i10 = this.A1;
        zw zwVar = this.h;
        if (i10 == 0 || z10 || this.e.size() == 1) {
            N(true, false);
            S(false, false);
            if (zwVar.getCurrentItem() != 0) {
                zwVar.x(0, !z10);
            }
            if (z11) {
                AndroidUtilities.runOnUIThread(new cw(this, 9), 350L);
            }
        } else {
            int i11 = this.A1;
            if (i11 == 1) {
                N(false, false);
                S(this.u0 || this.v0, false);
                if (zwVar.getCurrentItem() != 2) {
                    zwVar.x(2, false);
                }
                xw xwVar = this.B0;
                if (xwVar != null) {
                    this.S0 = true;
                    int i12 = this.G1;
                    if (i12 >= 0) {
                        xwVar.m(i12);
                    } else {
                        int i13 = this.F1;
                        if (i13 >= 0) {
                            xwVar.m(i13);
                        } else {
                            xwVar.m(this.E1);
                        }
                    }
                    this.S0 = false;
                    this.E0.h1(0, 0);
                }
            } else if (i11 == 2) {
                N(false, false);
                S(false, false);
                if (zwVar.getCurrentItem() != 1) {
                    zwVar.x(1, false);
                }
                rx rxVar = this.p0;
                if (rxVar != null) {
                    rxVar.m(0);
                }
                qw qwVar = this.o0;
                if (qwVar != null && (wyVar = qwVar.r) != null) {
                    wyVar.E1(null);
                }
            }
        }
        O(true);
    }

    public final void G() {
        bz bzVar = this.y0;
        if (bzVar != null) {
            bzVar.l();
        }
        fz fzVar = this.z0;
        if (fzVar != null) {
            fzVar.l();
        }
        if (org.telegram.ui.st.q().E) {
            org.telegram.ui.st.q().n();
        }
        org.telegram.ui.st.q().u();
    }

    public final void H(int i10) {
        ly lyVar = this.t1;
        if ((lyVar == null || !lyVar.z()) && i10 != 0) {
            HorizontalScrollView y3 = y(i10);
            this.Q0[i10] = 0;
            y3.setTranslationY(0);
        }
    }

    public final void I(int i10, int i11) {
        lx lxVar = this.Q;
        View m10 = lxVar.m(i10);
        int L0 = lxVar.L0();
        if ((m10 == null && Math.abs(i10 - L0) > lxVar.J * 9.0f) || !SharedConfig.animationsEnabled()) {
            int i12 = lxVar.L0() < i10 ? 0 : 1;
            ok0 ok0Var = this.b0;
            ok0Var.b = i12;
            ok0Var.c(i10, i11, false, false);
            return;
        }
        this.J0 = true;
        di.m1 m1Var = new di.m1(this, this.P.getContext(), 1);
        m1Var.a = i10;
        m1Var.p = i11;
        lxVar.w0(m1Var);
    }

    public final void J(int i10, int i11) {
        uw uwVar = this.E0;
        View m10 = uwVar.m(i10);
        int L0 = uwVar.L0();
        if (m10 != null || Math.abs(i10 - L0) <= 40) {
            this.J0 = true;
            this.D0.x0(i10);
        } else {
            int i12 = uwVar.L0() < i10 ? 0 : 1;
            ok0 ok0Var = this.a0;
            ok0Var.b = i12;
            ok0Var.c(i10, i11, false, false);
        }
    }

    public final void K(boolean z10, boolean z11, boolean z12, boolean z13) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i10 >= arrayList2.size()) {
                break;
            }
            if (((gz) arrayList2.get(i10)).a == 0 && z10) {
                arrayList.add((gz) arrayList2.get(i10));
            }
            if (((gz) arrayList2.get(i10)).a == 1 && z12) {
                arrayList.add((gz) arrayList2.get(i10));
            }
            if (((gz) arrayList2.get(i10)).a == 2 && z11) {
                arrayList.add((gz) arrayList2.get(i10));
            }
            i10++;
        }
        ed0 ed0Var = this.w;
        if (ed0Var != null) {
            AndroidUtilities.updateViewVisibilityAnimated(ed0Var, arrayList.size() > 1, 1.0f, z13);
        }
        zw zwVar = this.h;
        if (zwVar != null) {
            zwVar.setAdapter(null);
            zwVar.setAdapter(this.L0);
            if (ed0Var != null) {
                ed0Var.setViewPager(zwVar);
            }
        }
    }

    public final void L(final oh.b bVar, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z10, boolean z11) {
        fz fzVar;
        ky kyVar;
        if (stickerSet == null) {
            return;
        }
        if (!z10 || (kyVar = this.S) == null || kyVar.d == stickerSet.id) {
            if (z10 || (fzVar = this.z0) == null || fzVar.d == stickerSet.id) {
                final boolean isStickerPackInstalled = MediaDataController.getInstance(this.c1).isStickerPackInstalled(stickerSet.id);
                bVar.g(isStickerPackInstalled ? stickerSet.masks ? LocaleController.formatPluralString("RemoveManyMasksCount", stickerSet.count, new Object[0]) : stickerSet.emojis ? LocaleController.formatPluralString("RemoveManyEmojiCount", stickerSet.count, new Object[0]) : LocaleController.formatPluralString("RemoveManyStickersCount", stickerSet.count, new Object[0]) : stickerSet.masks ? LocaleController.formatPluralString("AddManyMasksCount", stickerSet.count, new Object[0]) : stickerSet.emojis ? LocaleController.formatPluralString("AddManyEmojiCount", stickerSet.count, new Object[0]) : LocaleController.formatPluralString("AddManyStickersCount", stickerSet.count, new Object[0]), z11, true);
                bVar.h0.a(!isStickerPackInstalled, z11);
                bVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.iw
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        kz kzVar = kz.this;
                        MediaDataController mediaDataController = MediaDataController.getInstance(kzVar.c1);
                        Context context = kzVar.getContext();
                        int i10 = isStickerPackInstalled ? 0 : 2;
                        org.telegram.ui.ActionBar.n2 n2Var = kzVar.Y1;
                        FrameLayout frameLayout = kzVar.s;
                        oh.b bVar2 = bVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z12 = z10;
                        mediaDataController.toggleStickerSet(context, tLObject2, document2, i10, n2Var, frameLayout, false, true, new i2.b1(kzVar, bVar2, tLObject2, stickerSet2, document2, z12, 9), false);
                        kzVar.L(bVar2, tLObject2, stickerSet2, document2, z12, true);
                    }
                });
            }
        }
    }

    public final void M(long j3, boolean z10, boolean z11) {
        ed0 ed0Var = this.w;
        if (ed0Var == null) {
            return;
        }
        this.v1 = z10;
        this.w1 = z11;
        if (z11 || z10) {
            this.u1 = j3;
        } else {
            this.u1 = 0L;
        }
        int i10 = z11 ? 2 : 0;
        LinearLayout linearLayout = ed0Var.d;
        View childAt = i10 >= linearLayout.getChildCount() ? null : linearLayout.getChildAt(i10);
        if (childAt != null) {
            childAt.setAlpha(this.u1 != 0 ? 0.15f : 1.0f);
            zw zwVar = this.h;
            if (z11) {
                if (this.u1 == 0 || zwVar.getCurrentItem() == 0) {
                    return;
                }
                N(true, true);
                S(false, true);
                zwVar.x(0, false);
                return;
            }
            if (this.u1 == 0 || zwVar.getCurrentItem() == 1) {
                return;
            }
            N(false, true);
            S(false, true);
            zwVar.x(1, false);
        }
    }

    public final void N(boolean z10, boolean z11) {
        ax axVar = this.x;
        if (z10 && axVar.getTag() == null) {
            return;
        }
        if ((z10 || axVar.getTag() == null) && !this.o2) {
            AnimatorSet animatorSet = this.F;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.F = null;
            }
            axVar.setTag(z10 ? null : 1);
            if (!z11) {
                axVar.setAlpha(z10 ? 1.0f : 0.0f);
                axVar.setScaleX(z10 ? 1.0f : 0.0f);
                axVar.setScaleY(z10 ? 1.0f : 0.0f);
                axVar.setVisibility(z10 ? 0 : 4);
                return;
            }
            if (z10) {
                axVar.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.F = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(axVar, (Property<ax, Float>) View.ALPHA, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(axVar, (Property<ax, Float>) View.SCALE_X, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(axVar, (Property<ax, Float>) View.SCALE_Y, z10 ? 1.0f : 0.0f));
            this.F.setDuration(200L);
            this.F.setInterpolator(pr.g);
            this.F.addListener(new gx(this, z10, r2));
            this.F.start();
        }
    }

    public final void O(boolean z10) {
        this.H = 0.0f;
        ly lyVar = this.t1;
        if (lyVar != null && lyVar.z()) {
            z10 = false;
        }
        FrameLayout frameLayout = this.n;
        if (z10 && frameLayout.getTag() == null) {
            return;
        }
        if (z10 || frameLayout.getTag() == null) {
            frameLayout.setTag(z10 ? null : 1);
            this.G2.a(z10, true);
        }
    }

    public final void P(boolean z10, boolean z11) {
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
            this.W.setInterpolator(pr.g);
            this.W.addListener(new j6(this, 22));
            this.W.start();
        }
    }

    public final void Q(boolean z10) {
        for (int i10 = 0; i10 < 3; i10++) {
            s4.s w10 = w(i10);
            int L0 = w10.L0();
            if (z10) {
                if (L0 == 1 || L0 == 2) {
                    w10.n0(0);
                    H(i10);
                }
            } else if (L0 == 0) {
                w10.h1(0, 0);
            }
        }
    }

    public final void R(boolean z10, boolean z11, boolean z12) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.Chat chat = MessagesController.getInstance(this.c1).getChat(Long.valueOf(this.u1));
        if (chat == null) {
            return;
        }
        bi.c4 c4Var = this.N0;
        if (z10) {
            if (ChatObject.hasAdminRights(chat) || (tL_chatBannedRights = chat.default_banned_rights) == null || !(tL_chatBannedRights.send_stickers || (z11 && tL_chatBannedRights.send_plain))) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.banned_rights;
                if (tL_chatBannedRights2 == null) {
                    return;
                }
                if (!AndroidUtilities.isBannedForever(tL_chatBannedRights2)) {
                    if (z11) {
                        c4Var.setText(LocaleController.formatString("AttachPlainRestricted", R.string.AttachPlainRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    }
                    if (z12) {
                        c4Var.setText(LocaleController.formatString("AttachGifRestricted", R.string.AttachGifRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    } else {
                        c4Var.setText(LocaleController.formatString("AttachStickersRestricted", R.string.AttachStickersRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    }
                } else if (z11) {
                    c4Var.setText(LocaleController.getString(R.string.AttachPlainRestrictedForever));
                } else if (z12) {
                    c4Var.setText(LocaleController.getString(R.string.AttachGifRestrictedForever));
                } else {
                    c4Var.setText(LocaleController.getString(R.string.AttachStickersRestrictedForever));
                }
            } else {
                org.telegram.ui.ActionBar.n2 n2Var = this.Y1;
                if ((n2Var instanceof org.telegram.ui.co) && ((org.telegram.ui.co) n2Var).K6()) {
                    return;
                }
                if (z11) {
                    c4Var.setText(LocaleController.getString(R.string.GlobalAttachEmojiRestricted));
                } else if (z12) {
                    c4Var.setText(LocaleController.getString(R.string.GlobalAttachGifRestricted));
                } else {
                    c4Var.setText(LocaleController.getString(R.string.GlobalAttachStickersRestricted));
                }
            }
            c4Var.setVisibility(0);
        }
        AnimatorSet animatorSet = this.J2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.J2 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.J2 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(c4Var, (Property<bi.c4, Float>) View.ALPHA, z10 ? c4Var.getAlpha() : 1.0f, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(c4Var, (Property<bi.c4, Float>) View.TRANSLATION_Y, z10 ? AndroidUtilities.dp(12.0f) : c4Var.getTranslationY(), z10 ? 0.0f : AndroidUtilities.dp(12.0f)));
        org.telegram.messenger.video.k kVar = this.K2;
        if (kVar != null) {
            AndroidUtilities.cancelRunOnUIThread(kVar);
        }
        if (z10) {
            org.telegram.messenger.video.k kVar2 = new org.telegram.messenger.video.k(this, z11, z12, 3);
            this.K2 = kVar2;
            AndroidUtilities.runOnUIThread(kVar2, 3500L);
        }
        this.J2.setDuration(320L);
        this.J2.setInterpolator(pr.h);
        this.J2.start();
    }

    public final void S(boolean z10, boolean z11) {
        ImageView imageView = this.y;
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
            this.G.setInterpolator(pr.g);
            this.G.addListener(new gx(this, z10, i10));
            this.G.start();
        }
    }

    public final void T() {
        org.telegram.ui.ActionBar.n2 n2Var;
        if (((View) getParent()) != null) {
            float y3 = (getY() + (getLayoutParams().height > 0 ? getLayoutParams().height : getMeasuredHeight())) - (((AndroidUtilities.isInMultiwindow || ((n2Var = this.Y1) != null && n2Var.isInBubbleMode())) && !this.V0) ? AndroidUtilities.dp(1.0f) : r0.getHeight());
            float f7 = this.r2;
            FrameLayout frameLayout = this.n;
            if (f7 >= 0.0f) {
                y3 += getMeasuredHeight() - this.r2;
            } else if (frameLayout.getTop() - y3 < 0.0f || !this.x2) {
                y3 = 0.0f;
            }
            float f10 = -y3;
            boolean z10 = this.d0;
            float lerp = f10 + AndroidUtilities.lerp(AndroidUtilities.dp(z10 ? 45.0f : 50.0f), -this.q2, this.G2.e);
            frameLayout.setTranslationY(lerp);
            if (z10) {
                this.r.setTranslationY(lerp);
            }
        }
    }

    public final void U() {
        xy xyVar;
        boolean z10;
        xv xvVar;
        boolean z11 = this.u0;
        View view = this.v;
        if (!z11) {
            setBackground(null);
            view.setBackground(null);
        } else if (AndroidUtilities.isInMultiwindow || this.N1) {
            Drawable background = getBackground();
            if (background != null) {
                background.setColorFilter(new PorterDuffColorFilter(A(org.telegram.ui.ActionBar.j6.He), PorterDuff.Mode.MULTIPLY));
            }
        } else {
            int i10 = org.telegram.ui.ActionBar.j6.He;
            setBackgroundColor(A(i10));
            if (this.d0) {
                view.setBackgroundColor(A(i10));
            }
        }
        jw jwVar = this.I;
        if (jwVar != null) {
            if (this.u0) {
                jwVar.setBackgroundColor(A(org.telegram.ui.ActionBar.j6.He));
                this.O.setBackgroundColor(A(org.telegram.ui.ActionBar.j6.Ke));
            } else {
                jwVar.setBackground(null);
            }
        }
        vu vuVar = this.B1;
        if (vuVar != null) {
            vuVar.c.a();
        }
        int i11 = 0;
        while (true) {
            xyVar = this.V;
            z10 = this.i2;
            if (i11 >= 3) {
                break;
            }
            if (i11 == 0) {
                xyVar = this.G0;
            } else if (i11 != 1) {
                xyVar = this.o0;
            }
            if (xyVar != null) {
                hq hqVar = xyVar.d;
                FrameLayout frameLayout = xyVar.n;
                View view2 = xyVar.f;
                if (this.u0) {
                    view2.setBackgroundColor(A(org.telegram.ui.ActionBar.j6.He));
                } else {
                    view2.setBackground(null);
                }
                xyVar.e.setBackgroundColor(A(org.telegram.ui.ActionBar.j6.Ke));
                xyVar.c.a(z10 ? v(0.4f) : A(org.telegram.ui.ActionBar.j6.Je));
                org.telegram.ui.ActionBar.j6.w1(z10 ? v(0.06f) : A(org.telegram.ui.ActionBar.j6.Ie), frameLayout.getBackground());
                frameLayout.invalidate();
                hqVar.setHintTextColor(z10 ? v(0.45f) : A(org.telegram.ui.ActionBar.j6.Je));
                hqVar.setTextColor(z10 ? v(0.8f) : A(org.telegram.ui.ActionBar.j6.G6));
            }
            i11++;
        }
        Paint paint = this.s1;
        if (paint != null) {
            paint.setColor(A(org.telegram.ui.ActionBar.j6.af));
        }
        kx kxVar = this.P;
        if (kxVar != null) {
            kxVar.setGlowColor(A(org.telegram.ui.ActionBar.j6.He));
        }
        tw twVar = this.D0;
        if (twVar != null) {
            twVar.setGlowColor(A(org.telegram.ui.ActionBar.j6.He));
        }
        xw xwVar = this.B0;
        if (xwVar != null) {
            xwVar.setIndicatorColor(A(org.telegram.ui.ActionBar.j6.Qe));
            xwVar.setUnderlineColor(A(org.telegram.ui.ActionBar.j6.Ke));
            if (this.u0) {
                xwVar.setBackgroundColor(A(org.telegram.ui.ActionBar.j6.He));
            } else {
                xwVar.setBackground(null);
            }
        }
        rx rxVar = this.p0;
        if (rxVar != null) {
            rxVar.setIndicatorColor(A(org.telegram.ui.ActionBar.j6.Qe));
            rxVar.setUnderlineColor(A(org.telegram.ui.ActionBar.j6.Ke));
            if (this.u0) {
                rxVar.setBackgroundColor(A(org.telegram.ui.ActionBar.j6.He));
            } else {
                rxVar.setBackground(null);
            }
        }
        ax axVar = this.x;
        if (axVar != null) {
            axVar.setColorFilter(new PorterDuffColorFilter(z10 ? v(0.6f) : A(org.telegram.ui.ActionBar.j6.Re), PorterDuff.Mode.MULTIPLY));
            if (xyVar == null) {
                Drawable background2 = axVar.getBackground();
                int i12 = org.telegram.ui.ActionBar.j6.He;
                org.telegram.ui.ActionBar.j6.B1(background2, A(i12), false);
                org.telegram.ui.ActionBar.j6.B1(axVar.getBackground(), A(i12), true);
            }
        }
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(z10 ? v(0.6f) : A(org.telegram.ui.ActionBar.j6.Re), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.E;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(z10 ? v(0.6f) : A(org.telegram.ui.ActionBar.j6.Re), PorterDuff.Mode.MULTIPLY));
        }
        bi.c4 c4Var = this.N0;
        if (c4Var != null) {
            ((ShapeDrawable) c4Var.getBackground()).getPaint().setColor(A(org.telegram.ui.ActionBar.j6.qf));
            c4Var.setTextColor(A(org.telegram.ui.ActionBar.j6.pf));
        }
        py pyVar = this.j0;
        if (pyVar != null) {
            ry ryVar = pyVar.e;
            ImageView imageView3 = ryVar.a;
            int i13 = org.telegram.ui.ActionBar.j6.Le;
            imageView3.setColorFilter(new PorterDuffColorFilter(A(i13), PorterDuff.Mode.MULTIPLY));
            ryVar.b.setTextColor(A(i13));
            ryVar.c.setProgressColor(A(org.telegram.ui.ActionBar.j6.h6));
        }
        this.e2 = new PorterDuffColorFilter(A(org.telegram.ui.ActionBar.j6.Oh), PorterDuff.Mode.SRC_IN);
        int i14 = 0;
        while (true) {
            Drawable[] drawableArr = this.X0;
            if (i14 >= drawableArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.j6.y1(drawableArr[i14], z10 ? v(0.4f) : A(org.telegram.ui.ActionBar.j6.Ne), false);
            org.telegram.ui.ActionBar.j6.y1(drawableArr[i14], z10 ? v(0.8f) : A(org.telegram.ui.ActionBar.j6.Oe), true);
            i14++;
        }
        if (jwVar != null && (xvVar = jwVar.y) != null) {
            xvVar.d();
        }
        int i15 = 0;
        while (true) {
            Drawable[] drawableArr2 = this.Y0;
            if (i15 >= drawableArr2.length) {
                break;
            }
            org.telegram.ui.ActionBar.j6.y1(drawableArr2[i15], z10 ? v(0.4f) : A(org.telegram.ui.ActionBar.j6.Me), false);
            org.telegram.ui.ActionBar.j6.y1(drawableArr2[i15], z10 ? v(0.8f) : A(org.telegram.ui.ActionBar.j6.Oe), true);
            i15++;
        }
        int i16 = 0;
        while (true) {
            Drawable[] drawableArr3 = this.Z0;
            if (i16 >= drawableArr3.length) {
                break;
            }
            org.telegram.ui.ActionBar.j6.y1(drawableArr3[i16], z10 ? v(0.4f) : A(org.telegram.ui.ActionBar.j6.Me), false);
            org.telegram.ui.ActionBar.j6.y1(drawableArr3[i16], z10 ? v(0.8f) : A(org.telegram.ui.ActionBar.j6.Oe), true);
            i16++;
        }
        org.telegram.ui.ActionBar.u5 u5Var = this.a2;
        if (u5Var != null) {
            org.telegram.ui.ActionBar.j6.y1(u5Var, z10 ? v(0.4f) : A(org.telegram.ui.ActionBar.j6.Ne), false);
            org.telegram.ui.ActionBar.j6.y1(u5Var, z10 ? v(0.8f) : A(org.telegram.ui.ActionBar.j6.Oe), true);
        }
        org.telegram.ui.ActionBar.u5 u5Var2 = this.b2;
        if (u5Var2 != null) {
            org.telegram.ui.ActionBar.j6.y1(u5Var2, z10 ? v(0.4f) : A(org.telegram.ui.ActionBar.j6.Qe), false);
            org.telegram.ui.ActionBar.j6.y1(u5Var2, z10 ? v(0.8f) : A(org.telegram.ui.ActionBar.j6.Qe), true);
        }
    }

    public final void V() {
        kx kxVar = this.P;
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
        if (this.f0) {
            return;
        }
        int i11 = -1;
        if (i10 != -1) {
            int size = getRecentEmoji().size() + (this.d0 ? 1 : 0);
            tx txVar = this.R;
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
                            xx xxVar = (xx) this.q1.get(size2);
                            while (i13 < emojipacks.size()) {
                                long j3 = emojipacks.get(i13).b.id;
                                long j10 = xxVar.b.id;
                                if (j3 == j10 && (!xxVar.g || (!xxVar.f && !this.p1.contains(Long.valueOf(j10))))) {
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
                this.I.j(i13, true);
            }
        }
    }

    public final void X() {
        int i10;
        wy wyVar;
        int i11;
        boolean z10;
        rx rxVar = this.p0;
        int currentPosition = rxVar.getCurrentPosition();
        int i12 = this.r0;
        boolean z11 = currentPosition == i12;
        boolean z12 = i12 >= 0;
        boolean isEmpty = this.i1.isEmpty();
        rxVar.d(false);
        this.r0 = -2;
        this.s0 = -2;
        this.t0 = -2;
        Drawable[] drawableArr = this.Z0;
        if (isEmpty) {
            i10 = 0;
        } else {
            this.r0 = 0;
            rxVar.b(0, drawableArr[0]).setContentDescription(LocaleController.getString(R.string.RecentStickers));
            i10 = 1;
        }
        this.s0 = i10;
        rxVar.b(1, drawableArr[1]).setContentDescription(LocaleController.getString(R.string.FeaturedGifs));
        this.t0 = i10 + 1;
        AndroidUtilities.dp(13.0f);
        AndroidUtilities.dp(11.0f);
        int i13 = this.c1;
        ArrayList<String> arrayList = MessagesController.getInstance(i13).gifSearchEmojies;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            String str = arrayList.get(i14);
            Emoji.EmojiDrawable emojiDrawable = Emoji.getEmojiDrawable(str);
            if (emojiDrawable != null) {
                TLRPC.Document emojiAnimatedSticker = MediaDataController.getInstance(i13).getEmojiAnimatedSticker(str);
                String i15 = i2.g.i(i14 + 3, "tab");
                int i16 = rxVar.x;
                rxVar.x = i16 + 1;
                cx0 cx0Var = (cx0) rxVar.n.get(i15);
                if (cx0Var != null) {
                    rxVar.g(i15, cx0Var, i16);
                    i11 = currentPosition;
                    z10 = z12;
                } else {
                    i11 = currentPosition;
                    z10 = z12;
                    cx0Var = new cx0(rxVar.getContext(), 2);
                    cx0Var.setFocusable(true);
                    cx0Var.setOnClickListener(new bm0(rxVar, 2));
                    cx0Var.setExpanded(rxVar.f0);
                    cx0Var.a(rxVar.i0);
                    rxVar.e.addView(cx0Var, i16);
                }
                cx0Var.d = false;
                cx0Var.setTag(R.id.index_tag, Integer.valueOf(i16));
                cx0Var.setTag(R.id.parent_tag, emojiDrawable);
                cx0Var.setTag(R.id.object_tag, emojiAnimatedSticker);
                cx0Var.setSelected(i16 == rxVar.y);
                rxVar.h.put(i15, cx0Var);
                cx0Var.setContentDescription(str);
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
        rxVar.h();
        rxVar.q();
        if (z11 && isEmpty) {
            rxVar.m(this.s0);
            qw qwVar = this.o0;
            if (qwVar == null || (wyVar = qwVar.r) == null) {
                return;
            }
            wyVar.E1(null);
            return;
        }
        WeakHashMap weakHashMap = r0.i0.a;
        if (rxVar.isLaidOut()) {
            if (!isEmpty && !z13) {
                rxVar.k(i17 + 1, 0);
            } else if (isEmpty && z13) {
                rxVar.k(i17 - 1, 0);
            }
        }
    }

    public final void Y() {
        py pyVar;
        int size = this.i1.size();
        long calcDocumentsHash = MediaDataController.calcDocumentsHash(this.i1, ConnectionsManager.DEFAULT_DATACENTER_ID);
        ArrayList<TLRPC.Document> recentGifs = MediaDataController.getInstance(this.c1).getRecentGifs();
        this.i1 = recentGifs;
        long calcDocumentsHash2 = MediaDataController.calcDocumentsHash(recentGifs, ConnectionsManager.DEFAULT_DATACENTER_ID);
        if ((this.p0 != null && size == 0 && !this.i1.isEmpty()) || (size != 0 && this.i1.isEmpty())) {
            X();
        }
        if ((size == this.i1.size() && calcDocumentsHash == calcDocumentsHash2) || (pyVar = this.n0) == null) {
            return;
        }
        pyVar.l();
    }

    public final void Z(boolean z10) {
        TLRPC.Document document;
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet;
        xw xwVar = this.B0;
        if (xwVar != null) {
            cc1 cc1Var = xwVar.e;
            if (xwVar.s != null) {
                return;
            }
            this.F1 = -2;
            this.G1 = -2;
            this.H1 = -2;
            this.I1 = -2;
            this.e0 = false;
            this.E1 = 0;
            int currentPosition = xwVar.getCurrentPosition();
            boolean z11 = true;
            xwVar.d((getParent() == null || getVisibility() != 0 || (this.y1.size() == 0 && this.z1.size() == 0)) ? false : true);
            int i10 = this.c1;
            MediaDataController mediaDataController = MediaDataController.getInstance(i10);
            SharedPreferences emojiSettings = MessagesController.getEmojiSettings(i10);
            ArrayList arrayList3 = this.m1;
            arrayList3.clear();
            ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
            int size = featuredStickerSets.size();
            for (int i11 = 0; i11 < size; i11++) {
                TLRPC.StickerSetCovered stickerSetCovered = featuredStickerSets.get(i11);
                if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.id)) {
                    arrayList3.add(stickerSetCovered);
                }
            }
            iz izVar = this.F0;
            if (izVar != null) {
                izVar.l();
            }
            boolean isEmpty = featuredStickerSets.isEmpty();
            long j3 = 0;
            Drawable[] drawableArr = this.Y0;
            if (!isEmpty && (arrayList3.isEmpty() || emojiSettings.getLong("featured_hidden", 0L) == featuredStickerSets.get(0).set.id)) {
                int i12 = mediaDataController.getUnreadStickerSets().isEmpty() ? 2 : 3;
                cx0 c10 = xwVar.c(i12, drawableArr[i12]);
                c10.h.setText(LocaleController.getString(R.string.FeaturedStickersShort));
                c10.setContentDescription(LocaleController.getString(R.string.FeaturedStickers));
                int i13 = this.E1;
                this.H1 = i13;
                this.E1 = i13 + 1;
            }
            if (!this.k1.isEmpty()) {
                int i14 = this.E1;
                this.G1 = i14;
                this.E1 = i14 + 1;
                cx0 c11 = xwVar.c(1, drawableArr[1]);
                c11.h.setText(LocaleController.getString(R.string.FavoriteStickersShort));
                c11.setContentDescription(LocaleController.getString(R.string.FavoriteStickers));
            }
            if (!this.j1.isEmpty()) {
                int i15 = this.E1;
                this.F1 = i15;
                this.E1 = i15 + 1;
                cx0 c12 = xwVar.c(0, drawableArr[0]);
                c12.h.setText(LocaleController.getString(R.string.RecentStickersShort));
                c12.setContentDescription(LocaleController.getString(R.string.RecentStickers));
            }
            ArrayList arrayList4 = this.d1;
            arrayList4.clear();
            org.telegram.ui.ActionBar.f6 f6Var = null;
            this.h1 = null;
            this.f1 = -1;
            this.e1 = -10;
            if (this.H2 == null || z10) {
                this.H2 = new ArrayList(mediaDataController.getStickerSets(0));
            }
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList5 = this.H2;
            int i16 = 0;
            while (true) {
                TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.x1;
                if (i16 >= stickerSetCoveredArr.length) {
                    break;
                }
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCoveredArr[i16];
                long j10 = j3;
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
                j3 = j10;
            }
            long j11 = j3;
            ArrayList<TLRPC.TL_messages_stickerSet> filterPremiumStickers = MessagesController.getInstance(i10).filterPremiumStickers(arrayList5);
            for (int i17 = 0; i17 < filterPremiumStickers.size(); i17++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = filterPremiumStickers.get(i17);
                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
                if ((stickerSet2 == null || !stickerSet2.archived) && (arrayList2 = tL_messages_stickerSet2.documents) != null && !arrayList2.isEmpty()) {
                    arrayList4.add(tL_messages_stickerSet2);
                }
            }
            if (this.J1 != null) {
                long j12 = MessagesController.getEmojiSettings(i10).getLong("group_hide_stickers_" + this.J1.id, -1L);
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(this.J1.id));
                if (chat == null || this.J1.stickerset == null || !ChatObject.hasAdminRights(chat)) {
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
                    TLRPC.TL_messages_stickerSet groupStickerSetById = mediaDataController.getGroupStickerSetById(stickerSet4);
                    if (groupStickerSetById != null && (arrayList = groupStickerSetById.documents) != null && !arrayList.isEmpty() && groupStickerSetById.set != null) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = new TLRPC.TL_messages_stickerSet();
                        tL_messages_stickerSet3.documents = groupStickerSetById.documents;
                        tL_messages_stickerSet3.packs = groupStickerSetById.packs;
                        tL_messages_stickerSet3.set = groupStickerSetById.set;
                        if (this.g1) {
                            this.e1 = arrayList4.size();
                            arrayList4.add(tL_messages_stickerSet3);
                        } else {
                            this.e1 = 0;
                            arrayList4.add(0, tL_messages_stickerSet3);
                        }
                        if (!this.J1.can_set_stickers) {
                            tL_messages_stickerSet3 = null;
                        }
                        this.h1 = tL_messages_stickerSet3;
                    }
                } else if (chatFull.can_set_stickers) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = new TLRPC.TL_messages_stickerSet();
                    if (this.g1) {
                        this.e1 = arrayList4.size();
                        arrayList4.add(tL_messages_stickerSet4);
                    } else {
                        this.e1 = 0;
                        arrayList4.add(0, tL_messages_stickerSet4);
                    }
                }
            }
            int i18 = 0;
            while (i18 < arrayList4.size()) {
                if (i18 == this.e1) {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(this.J1.id));
                    if (chat2 == null) {
                        arrayList4.remove(0);
                        i18--;
                    } else {
                        this.e0 = z11;
                        String str = "chat" + chat2.id;
                        int i19 = xwVar.x;
                        xwVar.x = i19 + 1;
                        cx0 cx0Var = (cx0) xwVar.n.get(str);
                        if (cx0Var != null) {
                            xwVar.g(str, cx0Var, i19);
                        } else {
                            cx0Var = new cx0(xwVar.getContext(), 0);
                            cx0Var.setFocusable(z11);
                            cx0Var.setOnClickListener(new bm0(xwVar, 0));
                            cc1Var.addView(cx0Var, i19);
                            cx0Var.w = z11;
                            i9 i9Var = new i9(f6Var);
                            i9Var.u(AndroidUtilities.dp(14.0f));
                            i9Var.k(UserConfig.selectedAccount, chat2);
                            int i20 = xwVar.a;
                            x9 x9Var = cx0Var.e;
                            x9Var.setLayerNum(i20);
                            x9Var.e(chat2, i9Var);
                            x9Var.setAspectFit(z11);
                            cx0Var.setExpanded(xwVar.f0);
                            cx0Var.a(xwVar.i0);
                            cx0Var.h.setText(chat2.title);
                        }
                        cx0Var.d = z11;
                        cx0Var.setTag(R.id.index_tag, Integer.valueOf(i19));
                        cx0Var.setSelected(i19 == xwVar.y);
                        xwVar.h.put(str, cx0Var);
                    }
                } else {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i18);
                    TLRPC.StickerSet stickerSet5 = tL_messages_stickerSet5.set;
                    if (stickerSet5 != null && stickerSet5.thumb_document_id != j11) {
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
                    int i22 = xwVar.x;
                    xwVar.x = i22 + 1;
                    cx0 cx0Var2 = (cx0) xwVar.n.get(str2);
                    if (cx0Var2 != null) {
                        xwVar.g(str2, cx0Var2, i22);
                    } else {
                        cx0Var2 = new cx0(xwVar.getContext(), 0);
                        cx0Var2.setFocusable(z11);
                        cx0Var2.setOnClickListener(new bm0(xwVar, 1));
                        cx0Var2.setExpanded(xwVar.f0);
                        cx0Var2.a(xwVar.i0);
                        cc1Var.addView(cx0Var2, i22);
                    }
                    cx0Var2.e.setLayerNum(xwVar.a);
                    cx0Var2.d = false;
                    cx0Var2.setTag(closestPhotoSizeWithSize);
                    cx0Var2.setTag(R.id.index_tag, Integer.valueOf(i22));
                    cx0Var2.setTag(R.id.parent_tag, tL_messages_stickerSet5);
                    cx0Var2.setTag(R.id.object_tag, document);
                    cx0Var2.setSelected(i22 == xwVar.y);
                    xwVar.h.put(str2, cx0Var2);
                    cx0Var2.setContentDescription(tL_messages_stickerSet5.set.title + ", " + LocaleController.getString(R.string.AccDescrStickerSet));
                }
                i18++;
                z11 = true;
                f6Var = null;
            }
            xwVar.h();
            xwVar.q();
            if (currentPosition != 0) {
                xwVar.k(currentPosition, currentPosition);
            }
            o();
        }
    }

    @Override // qh.a
    public final void a(int i10) {
        setBottomInset(i10);
    }

    public final void a0() {
        yw ywVar = this.C0;
        xw xwVar = this.B0;
        if (xwVar != null && ywVar == null && this.t1 != null) {
            xwVar.setTranslationY(this.t1.p() * (-AndroidUtilities.dp(50.0f)));
        }
        if (ywVar == null) {
            return;
        }
        boolean z10 = getVisibility() == 0 && this.K0 && this.t1.p() != 1.0f;
        ywVar.setVisibility(z10 ? 0 : 8);
        if (z10) {
            Rect rect = this.y2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.x0, rect, null);
            float p5 = this.t1.p() * AndroidUtilities.dp(50.0f);
            int i10 = rect.left;
            if (i10 != 0 || p5 != 0.0f) {
                this.X1 = false;
            }
            ywVar.setTranslationX(i10);
            float translationY = (((getTranslationY() + getTop()) - ywVar.getTop()) - xwVar.getExpandedOffset()) - p5;
            if (ywVar.getTranslationY() != translationY) {
                ywVar.setTranslationY(translationY);
                ywVar.invalidate();
            }
        }
        if (this.X1 && z10 && this.P0) {
            xwVar.i(this.W1, true);
        } else {
            this.X1 = false;
            xwVar.i(this.W1, false);
        }
    }

    @Override // qh.a
    public final void b(float f7) {
        this.r2 = f7;
        T();
    }

    public final void b0() {
        boolean z10;
        org.telegram.ui.Cells.r3 r3Var;
        LongSparseArray longSparseArray = this.z1;
        LongSparseArray longSparseArray2 = this.y1;
        int i10 = this.c1;
        tw twVar = this.D0;
        if (twVar == null) {
            return;
        }
        try {
            int childCount = twVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = twVar.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.r3) && ((vk0) twVar.T(childAt)) != null) {
                    org.telegram.ui.Cells.r3 r3Var2 = (org.telegram.ui.Cells.r3) childAt;
                    ArrayList<Long> unreadStickerSets = MediaDataController.getInstance(i10).getUnreadStickerSets();
                    TLRPC.StickerSetCovered stickerSet = r3Var2.getStickerSet();
                    boolean z11 = unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSet.set.id));
                    int i12 = 0;
                    while (true) {
                        TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.x1;
                        if (i12 >= stickerSetCoveredArr.length) {
                            z10 = false;
                            break;
                        }
                        TLRPC.StickerSetCovered stickerSetCovered = stickerSetCoveredArr[i12];
                        if (stickerSetCovered != null) {
                            r3Var = r3Var2;
                            if (stickerSetCovered.set.id == stickerSet.set.id) {
                                r3Var2 = r3Var;
                                z10 = true;
                                break;
                            }
                        } else {
                            r3Var = r3Var2;
                        }
                        i12++;
                        r3Var2 = r3Var;
                    }
                    r3Var2.c(stickerSet, z11, true, 0, 0, z10);
                    if (z11) {
                        MediaDataController.getInstance(i10).markFeaturedStickersByIdAsRead(false, stickerSet.set.id);
                    }
                    boolean z12 = longSparseArray2.indexOfKey(stickerSet.set.id) >= 0;
                    boolean z13 = longSparseArray.indexOfKey(stickerSet.set.id) >= 0;
                    if (z12 || z13) {
                        if (z12 && r3Var2.r) {
                            longSparseArray2.remove(stickerSet.set.id);
                            z12 = false;
                        } else if (z13 && !r3Var2.r) {
                            longSparseArray.remove(stickerSet.set.id);
                        }
                    }
                    r3Var2.b(!z10 && z12, true);
                }
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Utilities.Callback callback;
        TLRPC.StickerSet stickerSet;
        int i12 = NotificationCenter.stickersDidLoad;
        tx txVar = this.R;
        cw cwVar = this.L2;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.y0 != null) {
                    Z(((Boolean) objArr[1]).booleanValue());
                    b0();
                    G();
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
                    AndroidUtilities.cancelRunOnUIThread(cwVar);
                    AndroidUtilities.runOnUIThread(cwVar, 100L);
                    return;
                }
            }
            return;
        }
        if (i10 == NotificationCenter.groupPackUpdated) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            TLRPC.ChatFull chatFull = this.J1;
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
            ed0 ed0Var = this.w;
            if (ed0Var != null) {
                int childCount = ed0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    ed0Var.getChildAt(i13).invalidate();
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
        ky kyVar = this.S;
        if (i10 == i14) {
            Long l4 = (Long) objArr[0];
            long longValue2 = l4.longValue();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = objArr.length > 1 ? (TLRPC.TL_messages_stickerSet) objArr[1] : null;
            if (tL_messages_stickerSet != null) {
                fz fzVar = this.z0;
                if (fzVar != null && fzVar.d == longValue2 && fzVar.f.size() < tL_messages_stickerSet.documents.size()) {
                    fzVar.f = tL_messages_stickerSet.documents;
                    fzVar.l();
                }
                if (kyVar != null && kyVar.d == longValue2 && kyVar.f.size() < tL_messages_stickerSet.documents.size()) {
                    kyVar.f = tL_messages_stickerSet.documents;
                    kyVar.l();
                }
            }
            TLRPC.ChatFull chatFull2 = this.J1;
            if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null && stickerSet.id == longValue2) {
                Z(false);
            }
            HashMap hashMap = this.r1;
            if (hashMap.containsKey(l4) && objArr.length >= 2 && ((Utilities.Callback) hashMap.get(l4)) != null && tL_messages_stickerSet != null && (callback = (Utilities.Callback) hashMap.remove(l4)) != null) {
                callback.run(tL_messages_stickerSet);
            }
            AndroidUtilities.cancelRunOnUIThread(cwVar);
            AndroidUtilities.runOnUIThread(cwVar, 100L);
            return;
        }
        int i15 = NotificationCenter.emojiLoaded;
        kx kxVar = this.P;
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
            if (kxVar == null || !this.d0) {
                return;
            }
            if ((this.V.c.k == 2 || kxVar.getAdapter() == kyVar) && !TextUtils.isEmpty(kyVar.v)) {
                kyVar.F(kyVar.v, true);
                return;
            }
            return;
        }
        tw twVar = this.D0;
        if (twVar != null) {
            int childCount2 = twVar.getChildCount();
            for (int i16 = 0; i16 < childCount2; i16++) {
                View childAt = twVar.getChildAt(i16);
                if ((childAt instanceof org.telegram.ui.Cells.o8) || (childAt instanceof org.telegram.ui.Cells.f8)) {
                    childAt.invalidate();
                }
            }
        }
        if (kxVar != null) {
            kxVar.invalidate();
            int childCount3 = kxVar.getChildCount();
            for (int i17 = 0; i17 < childCount3; i17++) {
                View childAt2 = kxVar.getChildAt(i17);
                if (childAt2 instanceof ty) {
                    childAt2.invalidate();
                }
            }
        }
        vu vuVar = this.B1;
        if (vuVar != null) {
            vuVar.c.invalidate();
        }
        rx rxVar = this.p0;
        if (rxVar != null) {
            cc1 cc1Var = rxVar.e;
            int childCount4 = cc1Var.getChildCount();
            for (int i18 = 0; i18 < childCount4; i18++) {
                cc1Var.getChildAt(i18).invalidate();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        gh.d dVar;
        bh.f fVar;
        if (Build.VERSION.SDK_INT >= 31 && (dVar = this.l2) != null && (fVar = this.j2) != null) {
            C();
            RecordingCanvas a2 = dVar.a(getMeasuredWidth(), getMeasuredHeight());
            a2.drawColor(A(org.telegram.ui.ActionBar.j6.d6));
            if (SharedConfig.chatBlurEnabled()) {
                fVar.b(a2, -2);
            }
            dVar.b();
        }
        T();
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.h) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        if (this.n.getVisibility() != 8 && !this.u0 && this.w0) {
            canvas.drawColor(i0.a.k(-1, 25));
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.q2);
        if (navigationBarThirdButtonsFactor > 0.0f) {
            int l1 = org.telegram.ui.ActionBar.j6.l1(navigationBarThirdButtonsFactor, A(org.telegram.ui.ActionBar.j6.He));
            int i10 = this.C2;
            GradientDrawable gradientDrawable = this.B2;
            if (i10 != l1) {
                gradientDrawable.setColors(new int[]{l1, org.telegram.ui.ActionBar.j6.l1(0.66f, l1), i0.a.k(l1, 0)});
                this.C2 = l1;
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

    public ArrayList<xx> getEmojipacks() {
        ArrayList<xx> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.q1;
            if (i10 >= arrayList2.size()) {
                return arrayList;
            }
            xx xxVar = (xx) arrayList2.get(i10);
            boolean z10 = xxVar.g;
            ArrayList arrayList3 = this.p1;
            if ((!z10 && (xxVar.f || arrayList3.contains(Long.valueOf(xxVar.b.id)))) || (xxVar.g && !xxVar.f && !arrayList3.contains(Long.valueOf(xxVar.b.id)))) {
                arrayList.add(xxVar);
            }
            i10++;
        }
    }

    public ArrayList<String> getRecentEmoji() {
        if (this.c2) {
            return Emoji.recentEmoji;
        }
        if (this.D2 == null) {
            this.D2 = new ArrayList();
        }
        if (Emoji.recentEmoji.size() != this.E2) {
            this.D2.clear();
            int i10 = 0;
            while (true) {
                ArrayList<String> arrayList = Emoji.recentEmoji;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (!arrayList.get(i10).startsWith("animated_")) {
                    this.D2.add(arrayList.get(i10));
                }
                i10++;
            }
            this.E2 = this.D2.size();
        }
        return this.D2;
    }

    public float getStickersExpandOffset() {
        xw xwVar = this.B0;
        if (xwVar == null) {
            return 0.0f;
        }
        return xwVar.getExpandedOffset();
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
            this.R.F(false);
        }
        Emoji.saveRecentEmoji();
        if (this.c2) {
            return;
        }
        ArrayList arrayList = this.D2;
        if (arrayList == null) {
            this.D2 = new ArrayList();
        } else {
            arrayList.clear();
        }
        while (true) {
            ArrayList<String> arrayList2 = Emoji.recentEmoji;
            if (i10 >= arrayList2.size()) {
                this.E2 = this.D2.size();
                return;
            } else {
                if (!arrayList2.get(i10).startsWith("animated_")) {
                    this.D2.add(arrayList2.get(i10));
                }
                i10++;
            }
        }
    }

    public final void i(int i10, int i11, boolean z10) {
        if (i10 == 2 || x(i10).K(0) == null) {
            return;
        }
        hx hxVar = new hx(getContext(), i11);
        hxVar.a = !z10 ? 1 : 0;
        w(i10).w0(hxVar);
    }

    public final void k(boolean z10) {
        if (z10) {
            Y();
            return;
        }
        int size = this.j1.size();
        int size2 = this.k1.size();
        int i10 = this.c1;
        this.j1 = MediaDataController.getInstance(i10).getRecentStickers(0, true);
        this.k1 = MediaDataController.getInstance(i10).getRecentStickers(2);
        if (UserConfig.getInstance(i10).isPremium()) {
            this.l1 = MediaDataController.getInstance(i10).getRecentStickers(7);
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
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            int i13 = 0;
            while (i13 < this.k1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.k1.get(i13))) {
                    this.k1.remove(i13);
                    i13--;
                }
                i13++;
            }
            int i14 = 0;
            while (i14 < this.j1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.j1.get(i14))) {
                    this.j1.remove(i14);
                    i14--;
                }
                i14++;
            }
        }
        if (size != this.j1.size() || size2 != this.k1.size()) {
            Z(false);
        }
        bz bzVar = this.y0;
        if (bzVar != null) {
            bzVar.l();
        }
        o();
    }

    public final void l(boolean z10) {
        ly lyVar = this.t1;
        le.b bVar = this.b;
        kx kxVar = this.P;
        kw kwVar = this.V;
        if (lyVar != null && lyVar.z()) {
            s4.c1 K = kxVar.K(0);
            if (K == null) {
                xy.a(kwVar, true, !z10);
            } else {
                xy.a(kwVar, K.a.getTop() < kxVar.getPaddingTop(), !z10);
            }
            P(false, !z10);
            kwVar.setTranslationY(bVar.e * AndroidUtilities.dp(15.0f));
            return;
        }
        if (kwVar == null || kxVar == null) {
            return;
        }
        kwVar.setTranslationY((bVar.e * AndroidUtilities.dp(15.0f)) + (kxVar.K(0) != null ? r0.a.getTop() : -this.b1));
        kwVar.a.a(false, !z10);
        m(Math.round(this.I.getTranslationY()));
    }

    public final void m(int i10) {
        ObjectAnimator objectAnimator = this.R0[1];
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            boolean z10 = false;
            s4.c1 K = this.P.K(0);
            int dp = AndroidUtilities.dp(38.0f) + i10;
            if (dp > 0 && (K == null || K.a.getBottom() < dp)) {
                z10 = true;
            }
            P(z10, !this.K1);
        }
    }

    public final void n(kx kxVar, int i10) {
        kx kxVar2;
        s4.c1 K;
        jw jwVar = this.I;
        int[] iArr = this.Q0;
        if (kxVar == null) {
            iArr[1] = 0;
            jwVar.setTranslationY(0);
            return;
        }
        if (kxVar.getVisibility() != 0 || this.f0) {
            return;
        }
        ly lyVar = this.t1;
        if (lyVar == null || !lyVar.z()) {
            if (i10 > 0 && (kxVar2 = this.P) != null && kxVar2.getVisibility() == 0 && (K = kxVar2.K(0)) != null) {
                if (K.a.getTop() + (this.d0 ? this.b1 : 0) >= kxVar2.getPaddingTop()) {
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
            jwVar.setTranslationY(Math.max(-AndroidUtilities.dp(36.0f), iArr[1]));
        }
    }

    public final void o() {
        int L0;
        xw xwVar = this.B0;
        if (xwVar == null || (L0 = this.E0.L0()) == -1) {
            return;
        }
        int i10 = this.G1;
        if (i10 <= 0 && (i10 = this.F1) <= 0) {
            i10 = this.E1;
        }
        xwVar.k(this.y0.F(L0), i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        int i10 = this.c1;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupPackUpdated);
        if (this.y0 != null) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.stickersDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.featuredStickersDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupStickersDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
            AndroidUtilities.runOnUIThread(new cw(this, 0));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        vu vuVar = this.B1;
        if (vuVar != null && vuVar.isShowing()) {
            vuVar.dismiss();
        }
        org.telegram.ui.st q6 = org.telegram.ui.st.q();
        if (q6.l == this.g2) {
            q6.W = null;
            q6.a0 = null;
            q6.Y = null;
            q6.l = null;
            q6.c0 = null;
            q6.u();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        if (this.O1 != i14) {
            this.O1 = i14;
            G();
        }
        super.onLayout(z10, i10, i11, i12, i13);
        T();
        a0();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.K1 = true;
        boolean z10 = AndroidUtilities.isInMultiwindow;
        View view = this.v;
        boolean z11 = this.d0;
        if (z10 || this.N1) {
            if (this.L1 != 1) {
                if (!this.I2) {
                    setOutlineProvider(this.M1);
                    setClipToOutline(true);
                    setElevation(AndroidUtilities.dp(2.0f));
                }
                setBackgroundResource(R.drawable.smiles_popup);
                Drawable background = getBackground();
                int i12 = org.telegram.ui.ActionBar.j6.He;
                background.setColorFilter(new PorterDuffColorFilter(A(i12), PorterDuff.Mode.MULTIPLY));
                if (z11 && this.u0) {
                    view.setBackgroundColor(A(i12));
                }
                this.L1 = 1;
            }
        } else if (this.L1 != 0) {
            if (!this.I2) {
                setOutlineProvider(null);
                setClipToOutline(false);
                setElevation(0.0f);
            }
            if (this.u0) {
                int i13 = org.telegram.ui.ActionBar.j6.He;
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
            s4.h0 adapter = this.h0.getAdapter();
            py pyVar = this.n0;
            if (adapter != pyVar || pyVar.I < 0 || this.s0 < 0 || this.r0 < 0 || (L0 = this.i0.L0()) == -1) {
                return;
            }
            this.p0.k(L0 >= pyVar.I ? this.s0 : this.r0, 0);
        }
    }

    public final void q(boolean z10) {
        ly lyVar = this.t1;
        le.b bVar = this.a;
        tw twVar = this.D0;
        ww wwVar = this.G0;
        if (lyVar != null && lyVar.z()) {
            s4.c1 K = twVar.K(0);
            if (K == null) {
                xy.a(wwVar, true, !z10);
            } else {
                xy.a(wwVar, K.a.getTop() < twVar.getPaddingTop(), !z10);
            }
            wwVar.setTranslationY(bVar.e * AndroidUtilities.dp(15.0f));
            return;
        }
        if (wwVar == null || twVar == null) {
            return;
        }
        wwVar.setTranslationY((bVar.e * AndroidUtilities.dp(15.0f)) + (twVar.K(0) != null ? r0.a.getTop() : -this.b1));
        wwVar.a.a(false, !z10);
    }

    public final void r() {
        Emoji.clearRecentEmoji();
        this.R.F(false);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.K1) {
            return;
        }
        super.requestLayout();
    }

    public final void s(long j3, boolean z10) {
        xy xyVar;
        s4.c0 c0Var;
        View view;
        View view2;
        int i10;
        TLRPC.TL_messages_stickerSet stickerSetById;
        bz bzVar;
        int E;
        AnimatorSet animatorSet = this.M0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.M0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        if (currentItem == 2 && j3 != -1 && (stickerSetById = MediaDataController.getInstance(this.c1).getStickerSetById(j3)) != null && (E = (bzVar = this.y0).E(stickerSetById)) >= 0 && E < bzVar.h()) {
            J(E, AndroidUtilities.dp(48.0f));
        }
        py pyVar = this.j0;
        if (pyVar != null) {
            pyVar.K = false;
        }
        for (int i11 = 0; i11 < 3; i11++) {
            View view3 = this.D0;
            View view4 = this.h0;
            qw qwVar = this.o0;
            View view5 = this.P;
            if (i11 == 0) {
                xyVar = this.V;
                c0Var = this.Q;
                view = this.I;
                view2 = view5;
            } else if (i11 == 1) {
                c0Var = this.i0;
                view = this.p0;
                view2 = view4;
                xyVar = qwVar;
            } else {
                xyVar = this.G0;
                c0Var = this.E0;
                view = this.B0;
                view2 = view3;
            }
            if (xyVar != null) {
                wy wyVar = xyVar.r;
                xyVar.d.setText("");
                if (wyVar != null) {
                    wyVar.E1(null);
                    wyVar.C1();
                }
                int i12 = this.b1;
                if (i11 == currentItem && z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.M0 = animatorSet2;
                    Property property = View.TRANSLATION_Y;
                    if (view == null || i11 == 1) {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, AndroidUtilities.dp(36.0f) - i12));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, AndroidUtilities.dp(36.0f)), ObjectAnimator.ofFloat(xyVar, (Property<xy, Float>) property, AndroidUtilities.dp(36.0f)));
                    }
                    this.M0.setDuration(200L);
                    this.M0.setInterpolator(pr.h);
                    this.M0.addListener(new bi.j4(this, c0Var, view2, 5));
                    this.M0.start();
                } else {
                    if (xyVar != qwVar) {
                        xyVar.setTranslationY(AndroidUtilities.dp(36.0f) - i12);
                    }
                    if (view != null && i11 != 2) {
                        view.setTranslationY(0.0f);
                    }
                    if (view2 == view3) {
                        i10 = 0;
                        view2.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + this.q2);
                    } else {
                        i10 = 0;
                        if (view2 == view4) {
                            view2.setPadding(0, AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(44.0f) + this.q2);
                        } else {
                            if (view2 == view5) {
                                view2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + this.q2);
                            }
                            i10 = 0;
                        }
                    }
                    c0Var.h1(i10, i10);
                }
            }
        }
        if (z10) {
            return;
        }
        this.t1.i(0);
    }

    public void setBlurredBackgroundDrawableFactory(bh.b bVar) {
        org.telegram.ui.ActionBar.f6 f6Var = this.Z1;
        ax axVar = this.x;
        if (axVar != null) {
            dh.d c10 = bVar.c(axVar, null, false);
            c10.n(fh.b.d(f6Var));
            c10.p(AndroidUtilities.dp(18.0f));
            c10.o(AndroidUtilities.dp(6.0f));
            axVar.setBackground(c10);
        }
        ImageView imageView = this.E;
        if (imageView != null) {
            dh.d c11 = bVar.c(imageView, null, false);
            c11.n(fh.b.d(f6Var));
            c11.p(AndroidUtilities.dp(18.0f));
            c11.o(AndroidUtilities.dp(6.0f));
            imageView.setBackground(c11);
        }
        ed0 ed0Var = this.w;
        if (ed0Var != null) {
            dh.d c12 = bVar.c(ed0Var, null, false);
            c12.n(fh.b.d(f6Var));
            c12.p(AndroidUtilities.dp(18.0f));
            c12.o(AndroidUtilities.dp(6.0f));
            ed0Var.setBackground(c12);
        }
        ImageView imageView2 = this.y;
        if (imageView2 != null) {
            dh.d c13 = bVar.c(imageView2, null, false);
            c13.n(fh.b.d(f6Var));
            c13.p(AndroidUtilities.dp(18.0f));
            c13.o(AndroidUtilities.dp(6.0f));
            imageView2.setBackground(c13);
        }
    }

    public void setBottomInset(int i10) {
        if (this.q2 != i10) {
            this.q2 = i10;
            j(i10, this.K);
            j(i10, this.M);
            j(AndroidUtilities.dp(44.0f) + i10, this.P);
            j(AndroidUtilities.dp(44.0f) + i10, this.D0);
            j(AndroidUtilities.dp(44.0f) + i10, this.h0);
            FrameLayout frameLayout = this.s;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-i10);
            }
            T();
            invalidate();
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.J1 = chatFull;
        Z(false);
    }

    public void setDelegate(ly lyVar) {
        this.t1 = lyVar;
    }

    public void setDragListener(qx qxVar) {
        this.O0 = qxVar;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        ww wwVar = this.G0;
        if (wwVar != null) {
            wwVar.d.setEnabled(z10);
        }
        qw qwVar = this.o0;
        if (qwVar != null) {
            qwVar.d.setEnabled(z10);
        }
        kw kwVar = this.V;
        if (kwVar != null) {
            kwVar.d.setEnabled(z10);
        }
    }

    public void setForseMultiwindowLayout(boolean z10) {
        this.N1 = z10;
    }

    public void setShouldDrawBackground(boolean z10) {
        if (this.u0 != z10) {
            this.u0 = z10;
            U();
        }
    }

    public void setShowing(boolean z10) {
        this.P0 = z10;
        a0();
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        a0();
        T();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        boolean z10 = getVisibility() != i10;
        super.setVisibility(i10);
        if (z10) {
            if (i10 != 8) {
                Emoji.sortEmoji();
                this.R.F(false);
                int i11 = this.c1;
                NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.stickersDidLoad);
                if (this.y0 != null) {
                    NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
                    Z(false);
                    G();
                }
                k(true);
                k(false);
                MediaDataController.getInstance(i11).loadRecents(0, true, true, false);
                MediaDataController.getInstance(i11).loadRecents(0, false, true, false);
                MediaDataController.getInstance(i11).loadRecents(2, false, true, false);
            }
            hg.g1 g1Var = this.T0;
            if (g1Var != null) {
                g1Var.a();
            }
        }
    }

    public final void t(boolean z10) {
        s(-1L, z10);
    }

    public final void u(boolean z10) {
        bz bzVar;
        boolean z11 = this.N2;
        this.N2 = z10;
        if (!z11 || z10) {
            return;
        }
        int i10 = this.A1;
        if (i10 == 0) {
            tx txVar = this.R;
            if (txVar != null) {
                txVar.F(false);
                return;
            }
            return;
        }
        if (i10 == 1) {
            py pyVar = this.n0;
            if (pyVar != null) {
                pyVar.l();
                return;
            }
            return;
        }
        if (i10 != 2 || (bzVar = this.y0) == null) {
            return;
        }
        bzVar.l();
    }

    public final int v(float f7) {
        return i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Wk, this.Z1), (int) (f7 * 255.0f));
    }

    public final s4.s w(int i10) {
        if (i10 == 0) {
            return this.E0;
        }
        if (i10 == 1) {
            return this.Q;
        }
        if (i10 == 2) {
            return this.i0;
        }
        throw new IllegalArgumentException(i2.g.i(i10, "Unexpected argument: "));
    }

    public final ll0 x(int i10) {
        if (i10 == 0) {
            return this.D0;
        }
        if (i10 == 1) {
            return this.P;
        }
        if (i10 == 2) {
            return this.h0;
        }
        throw new IllegalArgumentException(i2.g.i(i10, "Unexpected argument: "));
    }

    public final HorizontalScrollView y(int i10) {
        if (i10 == 0) {
            return this.B0;
        }
        if (i10 == 1) {
            return this.I;
        }
        if (i10 == 2) {
            return this.p0;
        }
        throw new IllegalArgumentException(i2.g.i(i10, "Unexpected argument: "));
    }

    @Override // le.d
    public final void z(float f7, int i10) {
    }
}
