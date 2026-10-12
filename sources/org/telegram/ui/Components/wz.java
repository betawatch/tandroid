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
import org.telegram.ui.ic1;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public class wz extends FrameLayout implements ne.d, NotificationCenter.NotificationCenterDelegate, qh.a {
    public static final /* synthetic */ int O2 = 0;
    public final tw A0;
    public int A1;
    public final GradientDrawable A2;
    public final ix B0;
    public final jv B1;
    public int B2;
    public final jx C0;
    public final int C1;
    public ArrayList C2;
    public final ex D0;
    public final int[] D1;
    public int D2;
    public final ImageView E;
    public final fx E0;
    public int E1;
    public long E2;
    public AnimatorSet F;
    public uz F0;
    public int F1;
    public final ne.b F2;
    public AnimatorSet G;
    public final hx G0;
    public int G1;
    public ArrayList G2;
    public float H;
    public final oh.d H0;
    public int H1;
    public boolean H2;
    public final zx I;
    public boolean I0;
    public int I1;
    public NotificationCenter.ObserversGroup I2;
    public final ux J;
    public boolean J0;
    public TLRPC.ChatFull J1;
    public AnimatorSet J2;
    public final ah.v K;
    public boolean K0;
    public boolean K1;
    public e2.n0 K2;
    public final oh.b L;
    public final py L0;
    public int L1;
    public final pw L2;
    public final ah.v M;
    public AnimatorSet M0;
    public final bi.u5 M1;
    public boolean M2;
    public final oh.b N;
    public final bi.f4 N0;
    public boolean N1;
    public boolean N2;
    public final View O;
    public cy O0;
    public int O1;
    public final iy P;
    public boolean P0;
    public boolean P1;
    public final vx Q;
    public final int[] Q0;
    public boolean Q1;
    public final fy R;
    public final ObjectAnimator[] R0;
    public ez R1;
    public final vy S;
    public boolean S0;
    public float S1;
    public uz T;
    public hg.f1 T0;
    public float T1;
    public final oh.d U;
    public boolean U0;
    public float U1;
    public final vw V;
    public boolean V0;
    public float V1;
    public AnimatorSet W;
    public String[] W0;
    public float W1;
    public final Drawable[] X0;
    public boolean X1;
    public final Drawable[] Y0;
    public final org.telegram.ui.ActionBar.m2 Y1;
    public final Drawable[] Z0;
    public final org.telegram.ui.ActionBar.c6 Z1;
    public final ne.b a;
    public final pl0 a0;
    public final String[] a1;
    public final org.telegram.ui.ActionBar.s5 a2;
    public final ne.b b;
    public final pl0 b0;
    public final int b1;
    public final org.telegram.ui.ActionBar.s5 b2;
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
    public final org.telegram.ui.Cells.t6 f2;
    public final xw g0;
    public boolean g1;
    public final px g2;
    public final kx h;
    public final yw h0;
    public TLRPC.TL_messages_stickerSet h1;
    public boolean h2;
    public final bz i0;
    public ArrayList i1;
    public final boolean i2;
    public final az j0;
    public ArrayList j1;
    public final bh.f j2;
    public final dz k0;
    public ArrayList k1;
    public final lh k2;
    public final HashMap l0;
    public ArrayList l1;
    public final bh.b l2;
    public final tw m0;
    public final ArrayList m1;
    public final ni.e m2;
    public final FrameLayout n;
    public final az n0;
    public final ArrayList n1;
    public boolean n2;
    public final bx o0;
    public final ArrayList o1;
    public boolean o2;
    public final dy p0;
    public final ArrayList p1;
    public int p2;
    public boolean q0;
    public final ArrayList q1;
    public float q2;
    public final FrameLayout r;
    public int r0;
    public final HashMap r1;
    public View r2;
    public final FrameLayout s;
    public int s0;
    public final Paint s1;
    public int s2;
    public int t0;
    public wy t1;
    public int t2;
    public boolean u0;
    public long u1;
    public long u2;
    public final View v;
    public boolean v0;
    public boolean v1;
    public boolean v2;
    public final de0 w;
    public boolean w0;
    public boolean w1;
    public boolean w2;
    public final lx x;
    public final cx x0;
    public final TLRPC.StickerSetCovered[] x1;
    public final Rect x2;
    public final ImageView y;
    public final mz y0;
    public final LongSparseArray y1;
    public final RectF y2;
    public final rz z0;
    public final LongSparseArray z1;
    public final ArrayList z2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v19, types: [org.telegram.ui.Components.am0, org.telegram.ui.Components.tw] */
    /* JADX WARN: Type inference failed for: r4v60, types: [org.telegram.ui.Components.am0, org.telegram.ui.Components.tw] */
    public wz(org.telegram.ui.ActionBar.m2 m2Var, boolean z10, boolean z11, boolean z12, Context context, boolean z13, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z14, final org.telegram.ui.ActionBar.c6 c6Var, boolean z15, boolean z16) {
        super(context);
        org.telegram.ui.ActionBar.s5 s5Var;
        int A;
        int i10;
        pw pwVar;
        boolean z17;
        ux uxVar;
        int i11;
        Context context2;
        final org.telegram.ui.ActionBar.c6 c6Var2;
        ni.e eVar;
        fy fyVar;
        boolean z18;
        int i12;
        boolean z19;
        Field field;
        es esVar = es.h;
        this.a = new ne.b(0, this, esVar, 320L, false);
        this.b = new ne.b(1, this, esVar, 320L, false);
        this.c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = new ArrayList();
        this.c0 = true;
        this.k0 = new dz(this);
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
        int i13 = UserConfig.selectedAccount;
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
        this.f2 = new org.telegram.ui.Cells.t6(this, 11);
        this.g2 = new px(this);
        this.h2 = true;
        ni.e eVar2 = new ni.e();
        this.m2 = eVar2;
        this.q2 = -1.0f;
        this.s2 = -1;
        this.t2 = -1;
        this.u2 = -1L;
        this.v2 = false;
        this.w2 = true;
        this.x2 = new Rect();
        RectF rectF = new RectF();
        this.y2 = rectF;
        ArrayList arrayList2 = new ArrayList(1);
        this.z2 = arrayList2;
        arrayList2.add(rectF);
        this.A2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.F2 = new ne.b(0, new qw(this, 3), esVar, 380L, true);
        this.L2 = new pw(this, 1);
        this.M2 = false;
        this.u0 = z14;
        this.Y1 = m2Var;
        this.c2 = z10;
        this.Z1 = c6Var;
        this.i2 = z16;
        gh.c cVar = new gh.c();
        cVar.a(A(org.telegram.ui.ActionBar.g6.d6));
        if (z15) {
            v(true);
        }
        i0.a.k(A(org.telegram.ui.ActionBar.g6.Wk), 30);
        int dp = AndroidUtilities.dp(50.0f);
        this.b1 = dp;
        this.d0 = z13;
        this.X0 = new Drawable[]{org.telegram.ui.ActionBar.g6.V(context, R.drawable.smiles_tab_smiles, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.g6.Re), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.g6.Oe)), org.telegram.ui.ActionBar.g6.V(context, R.drawable.smiles_tab_gif, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.g6.Re), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.g6.Oe)), org.telegram.ui.ActionBar.g6.V(context, R.drawable.smiles_tab_stickers, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.g6.Re), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.g6.Oe))};
        org.telegram.ui.ActionBar.s5 V = org.telegram.ui.ActionBar.g6.V(context, R.drawable.msg_emoji_recent, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.g6.Me), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.g6.Oe));
        org.telegram.ui.ActionBar.s5 V2 = org.telegram.ui.ActionBar.g6.V(context, R.drawable.emoji_tabs_faves, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.g6.Me), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.g6.Oe));
        org.telegram.ui.ActionBar.s5 V3 = org.telegram.ui.ActionBar.g6.V(context, R.drawable.emoji_tabs_new3, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.g6.Me), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.g6.Oe));
        int i14 = R.drawable.emoji_tabs_new1;
        if (z16) {
            s5Var = V3;
            A = w(0.4f);
        } else {
            s5Var = V3;
            A = A(org.telegram.ui.ActionBar.g6.Me);
        }
        org.telegram.ui.ActionBar.s5 V4 = org.telegram.ui.ActionBar.g6.V(context, i14, A, z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.g6.Oe));
        this.a2 = V4;
        int i15 = R.drawable.emoji_tabs_new2;
        int i16 = org.telegram.ui.ActionBar.g6.Qe;
        org.telegram.ui.ActionBar.s5 V5 = org.telegram.ui.ActionBar.g6.V(context, i15, A(i16), A(i16));
        this.b2 = V5;
        this.Y0 = new Drawable[]{V, V2, s5Var, new LayerDrawable(new Drawable[]{V4, V5})};
        this.Z0 = new Drawable[]{org.telegram.ui.ActionBar.g6.V(context, R.drawable.msg_emoji_recent, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.g6.Me), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.g6.Oe)), org.telegram.ui.ActionBar.g6.V(context, R.drawable.stickers_gifs_trending, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.g6.Me), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.g6.Oe))};
        this.a1 = new String[]{LocaleController.getString(R.string.Emoji1), LocaleController.getString(R.string.Emoji2), LocaleController.getString(R.string.Emoji3), LocaleController.getString(R.string.Emoji4), LocaleController.getString(R.string.Emoji5), LocaleController.getString(R.string.Emoji6), LocaleController.getString(R.string.Emoji7), LocaleController.getString(R.string.Emoji8)};
        this.J1 = chatFull;
        Paint paint = new Paint(1);
        this.s1 = paint;
        paint.setColor(A(org.telegram.ui.ActionBar.g6.af));
        float dp2 = AndroidUtilities.dp(6.0f);
        bi.a2 a2Var = zf.j0.a;
        this.M1 = new bi.u5(dp2);
        ux uxVar2 = new ux(this, context);
        this.J = uxVar2;
        sz szVar = new sz();
        szVar.a = 0;
        szVar.b = uxVar2;
        arrayList.add(szVar);
        if (z10) {
            MediaDataController.getInstance(i13).checkStickers(5);
            MediaDataController.getInstance(i13).checkFeaturedEmoji();
            this.e2 = new PorterDuffColorFilter(A(org.telegram.ui.ActionBar.g6.Oh), PorterDuff.Mode.SRC_IN);
        }
        iy iyVar = new iy(this, context);
        this.P = iyVar;
        eVar2.a(iyVar);
        s4.k kVar = new s4.k();
        kVar.c = 220L;
        kVar.e = 220L;
        kVar.f = 160L;
        kVar.g = 160L;
        kVar.i = es.g;
        iyVar.setItemAnimator(kVar);
        final int i17 = 0;
        iyVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.rw
            public final /* synthetic */ wz b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (i17) {
                    case 0:
                        org.telegram.ui.xt q6 = org.telegram.ui.xt.q();
                        wz wzVar = this.b;
                        iy iyVar2 = wzVar.P;
                        wzVar.getMeasuredHeight();
                        return q6.s(motionEvent, iyVar2, null, wzVar.g2, c6Var);
                    case 1:
                        org.telegram.ui.xt q10 = org.telegram.ui.xt.q();
                        wz wzVar2 = this.b;
                        return q10.s(motionEvent, wzVar2.h0, wzVar2.m0, wzVar2.g2, c6Var);
                    default:
                        org.telegram.ui.xt q11 = org.telegram.ui.xt.q();
                        wz wzVar3 = this.b;
                        ex exVar = wzVar3.D0;
                        wzVar3.getMeasuredHeight();
                        return q11.s(motionEvent, exVar, wzVar3.A0, wzVar3.g2, c6Var);
                }
            }
        });
        iyVar.setOnItemLongClickListener(new qw(this, 1));
        iyVar.setInstantClick(true);
        vx vxVar = new vx(this);
        this.Q = vxVar;
        iyVar.setLayoutManager(vxVar);
        iyVar.setTopGlowOffset(AndroidUtilities.dp(38.0f));
        iyVar.setBottomGlowOffset(AndroidUtilities.dp(36.0f));
        iyVar.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f));
        int i18 = org.telegram.ui.ActionBar.g6.He;
        iyVar.setGlowColor(A(i18));
        iyVar.setItemSelectorColorProvider(new l2(16));
        iyVar.setClipToPadding(false);
        vxVar.O = new wx(this);
        fy fyVar2 = new fy(this);
        this.R = fyVar2;
        iyVar.setAdapter(fyVar2);
        iyVar.i(new di.q1(this, 3));
        this.S = new vy(this, context);
        uxVar2.addView(iyVar, w7.a6.d(-1.0f, -1));
        pl0 pl0Var = new pl0(iyVar, vxVar);
        this.b0 = pl0Var;
        pl0Var.i = new xx(this);
        iyVar.setOnScrollListener(new yx(this));
        if (m2Var != null) {
            i10 = -1;
            pwVar = new pw(this, 2);
            z17 = z10;
            uxVar = uxVar2;
            i11 = i16;
            context2 = context;
            eVar = eVar2;
            z18 = z16;
            c6Var2 = c6Var;
            fyVar = fyVar2;
        } else {
            i10 = -1;
            pwVar = null;
            z17 = z10;
            uxVar = uxVar2;
            i11 = i16;
            context2 = context;
            c6Var2 = c6Var;
            eVar = eVar2;
            fyVar = fyVar2;
            z18 = z16;
        }
        zx zxVar = new zx(this, context2, c6Var2, z17, pwVar, z18);
        this.I = zxVar;
        if (z13) {
            vw vwVar = new vw(this, context2);
            this.V = vwVar;
            uxVar.addView(vwVar, new FrameLayout.LayoutParams(i10, AndroidUtilities.getShadowHeight() + dp));
            vwVar.d.setOnFocusChangeListener(new ww(this));
            oh.d dVar = new oh.d(context2, c6Var2);
            this.U = dVar;
            dVar.setVisibility(8);
            final int i19 = 0;
            dVar.setOnBackClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sw
                public final /* synthetic */ wz b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i19) {
                        case 0:
                            vy vyVar = this.b.S;
                            qy qyVar = vyVar.c;
                            int childCount = qyVar.getChildCount();
                            for (int i20 = 0; i20 < childCount; i20++) {
                                ((oh.c) qyVar.getChildAt(i20)).a(false, true);
                            }
                            vyVar.d = 0L;
                            vyVar.F.b.a(false, true);
                            vyVar.l();
                            break;
                        case 1:
                            rz rzVar = this.b.z0;
                            qz qzVar = rzVar.c;
                            int childCount2 = qzVar.getChildCount();
                            for (int i21 = 0; i21 < childCount2; i21++) {
                                ((oh.c) qzVar.getChildAt(i21)).a(false, true);
                            }
                            rzVar.d = 0L;
                            rzVar.Q.a.a(false, true);
                            rzVar.l();
                            break;
                        case 2:
                            wy wyVar = this.b.t1;
                            if (wyVar != null) {
                                wyVar.w();
                                break;
                            }
                            break;
                        default:
                            wz wzVar = this.b;
                            int currentItem = wzVar.h.getCurrentItem();
                            iz izVar = currentItem == 0 ? wzVar.V : currentItem == 1 ? wzVar.o0 : wzVar.G0;
                            if (izVar != null) {
                                vq vqVar = izVar.d;
                                vqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                vqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                vqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
            uxVar.addView(dVar, new FrameLayout.LayoutParams(i10, dp));
        }
        int A2 = A(i18);
        if (Color.alpha(A2) >= 255) {
            zxVar.setBackgroundColor(A2);
        }
        fyVar.G(true);
        zxVar.p(getEmojipacks());
        uxVar.addView(zxVar, w7.a6.d(36.0f, i10));
        View view = new View(context2);
        this.O = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i20 = org.telegram.ui.ActionBar.g6.Ke;
        view.setBackgroundColor(A(i20));
        fy fyVar3 = fyVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i10, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(36.0f);
        uxVar.addView(view, layoutParams);
        oh.b bVar = new oh.b(context2, c6Var2);
        this.L = bVar;
        ah.v vVar = new ah.v(context2, 5, c6Var2);
        this.K = vVar;
        vVar.setVisibility(8);
        vVar.addView(bVar, w7.a6.a(48.0f, 10.0f, 5.0f, 10.0f, 10.0f, -1, 80));
        uxVar.addView(vVar, w7.a6.e(i10, -2, 80));
        if (z11) {
            jn0 jn0Var = jn0.b;
            if (z12) {
                xw xwVar = new xw(this, context2);
                this.g0 = xwVar;
                sz szVar2 = new sz();
                szVar2.a = 1;
                szVar2.b = xwVar;
                this.d.add(szVar2);
                yw ywVar = new yw(this, context2);
                this.h0 = ywVar;
                eVar.a(ywVar);
                final int i21 = 0;
                ywVar.setClipToPadding(false);
                bz bzVar = new bz(this);
                this.i0 = bzVar;
                ywVar.setLayoutManager(bzVar);
                ywVar.i(new zw(this));
                ywVar.setPadding(0, dp, 0, AndroidUtilities.dp(44.0f) + this.p2);
                ((s4.e1) ywVar.getItemAnimator()).m = false;
                final int i22 = 1;
                az azVar = new az(this, context2, true, ConnectionsManager.DEFAULT_DATACENTER_ID);
                this.n0 = azVar;
                ywVar.setAdapter(azVar);
                this.j0 = new az(this, context2, false, 0);
                ywVar.setOnScrollListener(new ax(this));
                ywVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.rw
                    public final /* synthetic */ wz b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (i22) {
                            case 0:
                                org.telegram.ui.xt q6 = org.telegram.ui.xt.q();
                                wz wzVar = this.b;
                                iy iyVar2 = wzVar.P;
                                wzVar.getMeasuredHeight();
                                return q6.s(motionEvent, iyVar2, null, wzVar.g2, c6Var2);
                            case 1:
                                org.telegram.ui.xt q10 = org.telegram.ui.xt.q();
                                wz wzVar2 = this.b;
                                return q10.s(motionEvent, wzVar2.h0, wzVar2.m0, wzVar2.g2, c6Var2);
                            default:
                                org.telegram.ui.xt q11 = org.telegram.ui.xt.q();
                                wz wzVar3 = this.b;
                                ex exVar = wzVar3.D0;
                                wzVar3.getMeasuredHeight();
                                return q11.s(motionEvent, exVar, wzVar3.A0, wzVar3.g2, c6Var2);
                        }
                    }
                });
                ?? r10 = new am0(this) { // from class: org.telegram.ui.Components.tw
                    public final /* synthetic */ wz b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.ui.Components.am0
                    public final void a(int i23, View view2) {
                        switch (i21) {
                            case 0:
                                wz wzVar = this.b;
                                yw ywVar2 = wzVar.h0;
                                az azVar2 = wzVar.j0;
                                az azVar3 = wzVar.n0;
                                if (wzVar.t1 != null) {
                                    azVar3.getClass();
                                    ArrayList arrayList3 = azVar3.x;
                                    if (ywVar2.getAdapter() != azVar3) {
                                        if (ywVar2.getAdapter() == azVar2 && i23 >= 0 && i23 < azVar2.x.size()) {
                                            wzVar.t1.v(view2, azVar2.x.get(i23), azVar2.w, azVar2.n, true, 0, 0);
                                            wzVar.W();
                                            break;
                                        }
                                    } else if (i23 >= 0) {
                                        int i24 = azVar3.H;
                                        if (i23 >= i24) {
                                            int i25 = i24 > 0 ? (i23 - i24) - 1 : i23;
                                            if (i25 >= 0 && i25 < arrayList3.size()) {
                                                wzVar.t1.v(view2, arrayList3.get(i25), null, azVar3.n, true, 0, 0);
                                                break;
                                            }
                                        } else {
                                            wzVar.t1.v(view2, wzVar.i1.get(i23), null, "gif", true, 0, 0);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                wz wzVar2 = this.b;
                                s4.g0 adapter = wzVar2.D0.getAdapter();
                                rz rzVar = wzVar2.z0;
                                String str = adapter == rzVar ? rzVar.N : null;
                                if (view2 instanceof org.telegram.ui.Cells.f8) {
                                    org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view2;
                                    if (f8Var.getSticker() != null && MessageObject.isPremiumSticker(f8Var.getSticker()) && !AccountInstance.getInstance(wzVar2.c1).getUserConfig().isPremium()) {
                                        org.telegram.ui.xt.q().y(f8Var);
                                        break;
                                    } else {
                                        org.telegram.ui.xt.q().u();
                                        if (!f8Var.r) {
                                            f8Var.r = true;
                                            f8Var.n = 0.5f;
                                            f8Var.x = 0L;
                                            org.telegram.ui.Cells.e8 e8Var = f8Var.a;
                                            e8Var.setAlpha(0.5f * f8Var.H);
                                            e8Var.invalidate();
                                            f8Var.s = System.currentTimeMillis();
                                            f8Var.invalidate();
                                            wzVar2.t1.m(f8Var, f8Var.getSticker(), str, f8Var.getParentObject(), f8Var.getSendAnimationData(), true, 0);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                };
                this.m0 = r10;
                ywVar.setOnItemClickListener((am0) r10);
                xwVar.addView(ywVar, w7.a6.d(-1.0f, -1));
                bx bxVar = new bx(this, context2);
                this.o0 = bxVar;
                xwVar.addView(bxVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
                dy dyVar = new dy(this, context2, c6Var2);
                this.p0 = dyVar;
                dyVar.setType(jn0Var);
                dyVar.setUnderlineHeight(AndroidUtilities.getShadowHeight());
                dyVar.setIndicatorColor(A(i11));
                dyVar.setUnderlineColor(A(i20));
                dyVar.setBackgroundColor(A(i18));
                V();
                dyVar.setDelegate(new qw(this, 2));
                azVar.F("", "", true, true, true);
            }
            cx cxVar = new cx(this, context2, z14);
            this.x0 = cxVar;
            MediaDataController.getInstance(this.c1).checkStickers(0);
            MediaDataController.getInstance(this.c1).checkFeaturedStickers();
            ex exVar = new ex(this, context2);
            this.D0 = exVar;
            this.m2.a(exVar);
            fx fxVar = new fx(this);
            this.E0 = fxVar;
            exVar.setLayoutManager(fxVar);
            fxVar.O = new gx(this);
            exVar.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f));
            exVar.setClipToPadding(false);
            sz szVar3 = new sz();
            szVar3.a = 2;
            szVar3.b = cxVar;
            this.d.add(szVar3);
            this.z0 = new rz(this, context2);
            mz mzVar = new mz(this, context2);
            this.y0 = mzVar;
            exVar.setAdapter(mzVar);
            final int i23 = 2;
            exVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.rw
                public final /* synthetic */ wz b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (i23) {
                        case 0:
                            org.telegram.ui.xt q6 = org.telegram.ui.xt.q();
                            wz wzVar = this.b;
                            iy iyVar2 = wzVar.P;
                            wzVar.getMeasuredHeight();
                            return q6.s(motionEvent, iyVar2, null, wzVar.g2, c6Var2);
                        case 1:
                            org.telegram.ui.xt q10 = org.telegram.ui.xt.q();
                            wz wzVar2 = this.b;
                            return q10.s(motionEvent, wzVar2.h0, wzVar2.m0, wzVar2.g2, c6Var2);
                        default:
                            org.telegram.ui.xt q11 = org.telegram.ui.xt.q();
                            wz wzVar3 = this.b;
                            ex exVar2 = wzVar3.D0;
                            wzVar3.getMeasuredHeight();
                            return q11.s(motionEvent, exVar2, wzVar3.A0, wzVar3.g2, c6Var2);
                    }
                }
            });
            final int i24 = 1;
            ?? r42 = new am0(this) { // from class: org.telegram.ui.Components.tw
                public final /* synthetic */ wz b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.Components.am0
                public final void a(int i232, View view2) {
                    switch (i24) {
                        case 0:
                            wz wzVar = this.b;
                            yw ywVar2 = wzVar.h0;
                            az azVar2 = wzVar.j0;
                            az azVar3 = wzVar.n0;
                            if (wzVar.t1 != null) {
                                azVar3.getClass();
                                ArrayList arrayList3 = azVar3.x;
                                if (ywVar2.getAdapter() != azVar3) {
                                    if (ywVar2.getAdapter() == azVar2 && i232 >= 0 && i232 < azVar2.x.size()) {
                                        wzVar.t1.v(view2, azVar2.x.get(i232), azVar2.w, azVar2.n, true, 0, 0);
                                        wzVar.W();
                                        break;
                                    }
                                } else if (i232 >= 0) {
                                    int i242 = azVar3.H;
                                    if (i232 >= i242) {
                                        int i25 = i242 > 0 ? (i232 - i242) - 1 : i232;
                                        if (i25 >= 0 && i25 < arrayList3.size()) {
                                            wzVar.t1.v(view2, arrayList3.get(i25), null, azVar3.n, true, 0, 0);
                                            break;
                                        }
                                    } else {
                                        wzVar.t1.v(view2, wzVar.i1.get(i232), null, "gif", true, 0, 0);
                                        break;
                                    }
                                }
                            }
                            break;
                        default:
                            wz wzVar2 = this.b;
                            s4.g0 adapter = wzVar2.D0.getAdapter();
                            rz rzVar = wzVar2.z0;
                            String str = adapter == rzVar ? rzVar.N : null;
                            if (view2 instanceof org.telegram.ui.Cells.f8) {
                                org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view2;
                                if (f8Var.getSticker() != null && MessageObject.isPremiumSticker(f8Var.getSticker()) && !AccountInstance.getInstance(wzVar2.c1).getUserConfig().isPremium()) {
                                    org.telegram.ui.xt.q().y(f8Var);
                                    break;
                                } else {
                                    org.telegram.ui.xt.q().u();
                                    if (!f8Var.r) {
                                        f8Var.r = true;
                                        f8Var.n = 0.5f;
                                        f8Var.x = 0L;
                                        org.telegram.ui.Cells.e8 e8Var = f8Var.a;
                                        e8Var.setAlpha(0.5f * f8Var.H);
                                        e8Var.invalidate();
                                        f8Var.s = System.currentTimeMillis();
                                        f8Var.invalidate();
                                        wzVar2.t1.m(f8Var, f8Var.getSticker(), str, f8Var.getParentObject(), f8Var.getSendAnimationData(), true, 0);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            };
            this.A0 = r42;
            exVar.setOnItemClickListener((am0) r42);
            exVar.setGlowColor(A(i18));
            cxVar.addView(exVar);
            this.a0 = new pl0(exVar, fxVar);
            hx hxVar = new hx(this, context2);
            this.G0 = hxVar;
            cxVar.addView(hxVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
            oh.d dVar2 = new oh.d(context2, c6Var2);
            this.H0 = dVar2;
            dVar2.setVisibility(8);
            final int i25 = 1;
            dVar2.setOnBackClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sw
                public final /* synthetic */ wz b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i25) {
                        case 0:
                            vy vyVar = this.b.S;
                            qy qyVar = vyVar.c;
                            int childCount = qyVar.getChildCount();
                            for (int i202 = 0; i202 < childCount; i202++) {
                                ((oh.c) qyVar.getChildAt(i202)).a(false, true);
                            }
                            vyVar.d = 0L;
                            vyVar.F.b.a(false, true);
                            vyVar.l();
                            break;
                        case 1:
                            rz rzVar = this.b.z0;
                            qz qzVar = rzVar.c;
                            int childCount2 = qzVar.getChildCount();
                            for (int i212 = 0; i212 < childCount2; i212++) {
                                ((oh.c) qzVar.getChildAt(i212)).a(false, true);
                            }
                            rzVar.d = 0L;
                            rzVar.Q.a.a(false, true);
                            rzVar.l();
                            break;
                        case 2:
                            wy wyVar = this.b.t1;
                            if (wyVar != null) {
                                wyVar.w();
                                break;
                            }
                            break;
                        default:
                            wz wzVar = this.b;
                            int currentItem = wzVar.h.getCurrentItem();
                            iz izVar = currentItem == 0 ? wzVar.V : currentItem == 1 ? wzVar.o0 : wzVar.G0;
                            if (izVar != null) {
                                vq vqVar = izVar.d;
                                vqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                vqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                vqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
            cxVar.addView(dVar2, new FrameLayout.LayoutParams(-1, dp));
            z19 = z14;
            i12 = 80;
            ix ixVar = new ix(this, context2, c6Var2, m2Var, z19);
            this.B0 = ixVar;
            ixVar.setDragEnabled(true);
            ixVar.setWillNotDraw(false);
            ixVar.setType(jn0Var);
            ixVar.setUnderlineHeight(exVar.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
            ixVar.setIndicatorColor(A(i11));
            ixVar.setUnderlineColor(A(i20));
            if (viewGroup == null || !z19) {
                cxVar.addView(ixVar, w7.a6.e(-1, 36, 51));
            } else {
                jx jxVar = new jx(this, context2);
                this.C0 = jxVar;
                jxVar.addView(ixVar, w7.a6.e(-1, 36, 51));
                viewGroup.addView(jxVar, w7.a6.d(-2.0f, -1));
            }
            X(true);
            ixVar.setDelegate(new qw(this, 4));
            exVar.setOnScrollListener(new vz(this, 0));
            oh.b bVar2 = new oh.b(context2, c6Var2);
            this.N = bVar2;
            ah.v vVar2 = new ah.v(context2, 5, c6Var2);
            this.M = vVar2;
            vVar2.setVisibility(8);
            vVar2.addView(bVar2, w7.a6.a(48.0f, 10.0f, 5.0f, 10.0f, 10.0f, -1, 80));
            cxVar.addView(vVar2, w7.a6.e(-1, -2, 80));
        } else {
            i12 = 80;
            z19 = z14;
        }
        this.e.clear();
        this.e.addAll(this.d);
        kx kxVar = new kx(this, context2);
        this.h = kxVar;
        ni.e eVar3 = this.m2;
        eVar3.getClass();
        kxVar.b(new bi.z6(eVar3, 1));
        kxVar.setOverScrollMode(2);
        py pyVar = new py(this);
        this.L0 = pyVar;
        kxVar.setAdapter(pyVar);
        lx lxVar = new lx(this, context2);
        this.x = lxVar;
        lxVar.setHapticFeedbackEnabled(true);
        lxVar.setImageResource(R.drawable.smiles_tab_clear);
        int w9 = z16 ? w(0.6f) : A(org.telegram.ui.ActionBar.g6.Re);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        lxVar.setColorFilter(new PorterDuffColorFilter(w9, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        lxVar.setScaleType(scaleType);
        lxVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        lxVar.setFocusable(true);
        lxVar.setOnClickListener(new mx());
        w7.c6.a(lxVar);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.r = frameLayout;
        if (z13) {
            addView(frameLayout, w7.a6.a(100.0f, 0.0f, 0.0f, 0.0f, (AndroidUtilities.getShadowHeight() / AndroidUtilities.density) + 40.0f, -1, 87));
        } else {
            addView(frameLayout, w7.a6.a(100.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 87));
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.s = frameLayout2;
        addView(frameLayout2, w7.a6.a(100.0f, 0.0f, 0.0f, 0.0f, 64.0f, -1, 87));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.n = frameLayout3;
        View view2 = new View(context2);
        this.v = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(40.0f), 83));
        if (z13) {
            addView(frameLayout3, w7.a6.e(-1, 48, i12));
            frameLayout3.addView(lxVar, w7.a6.a(48.0f, 2.0f, 0.0f, 2.0f, 0.0f, 48, 85));
            if (z11) {
                ImageView imageView = new ImageView(context2);
                this.y = imageView;
                imageView.setImageResource(R.drawable.smiles_tab_settings);
                imageView.setColorFilter(new PorterDuffColorFilter(z16 ? w(0.6f) : A(org.telegram.ui.ActionBar.g6.Re), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(LocaleController.getString(R.string.Settings));
                w7.c6.a(imageView);
                frameLayout3.addView(imageView, w7.a6.a(48.0f, 2.0f, 0.0f, 2.0f, 0.0f, 48, 85));
                final int i26 = 2;
                imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sw
                    public final /* synthetic */ wz b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i26) {
                            case 0:
                                vy vyVar = this.b.S;
                                qy qyVar = vyVar.c;
                                int childCount = qyVar.getChildCount();
                                for (int i202 = 0; i202 < childCount; i202++) {
                                    ((oh.c) qyVar.getChildAt(i202)).a(false, true);
                                }
                                vyVar.d = 0L;
                                vyVar.F.b.a(false, true);
                                vyVar.l();
                                break;
                            case 1:
                                rz rzVar = this.b.z0;
                                qz qzVar = rzVar.c;
                                int childCount2 = qzVar.getChildCount();
                                for (int i212 = 0; i212 < childCount2; i212++) {
                                    ((oh.c) qzVar.getChildAt(i212)).a(false, true);
                                }
                                rzVar.d = 0L;
                                rzVar.Q.a.a(false, true);
                                rzVar.l();
                                break;
                            case 2:
                                wy wyVar = this.b.t1;
                                if (wyVar != null) {
                                    wyVar.w();
                                    break;
                                }
                                break;
                            default:
                                wz wzVar = this.b;
                                int currentItem = wzVar.h.getCurrentItem();
                                iz izVar = currentItem == 0 ? wzVar.V : currentItem == 1 ? wzVar.o0 : wzVar.G0;
                                if (izVar != null) {
                                    vq vqVar = izVar.d;
                                    vqVar.requestFocus();
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                    vqVar.onTouchEvent(obtain);
                                    obtain.recycle();
                                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                    vqVar.onTouchEvent(obtain2);
                                    obtain2.recycle();
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
            de0 de0Var = new de0(context2, c6Var2);
            this.w = de0Var;
            de0Var.setViewPager(kxVar);
            de0Var.setShouldExpand(false);
            de0Var.setIndicatorHeight(AndroidUtilities.dp(3.0f));
            de0Var.setIndicatorColor(i0.a.k(A(org.telegram.ui.ActionBar.g6.Oe), 20));
            de0Var.setUnderlineHeight(0);
            de0Var.setTabPaddingLeftRight(AndroidUtilities.dp(11.0f));
            de0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
            frameLayout3.addView(de0Var, w7.a6.e(-2, 48, 81));
            de0Var.setOnPageChangeListener(new nx(this, z19));
            ImageView imageView2 = new ImageView(context2);
            this.E = imageView2;
            imageView2.setImageResource(R.drawable.smiles_tab_search);
            imageView2.setColorFilter(new PorterDuffColorFilter(z16 ? w(0.6f) : A(org.telegram.ui.ActionBar.g6.Re), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(LocaleController.getString(R.string.Search));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, w7.a6.a(48.0f, 2.0f, 0.0f, 2.0f, 0.0f, 48, 83));
            final int i27 = 3;
            imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sw
                public final /* synthetic */ wz b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view22) {
                    switch (i27) {
                        case 0:
                            vy vyVar = this.b.S;
                            qy qyVar = vyVar.c;
                            int childCount = qyVar.getChildCount();
                            for (int i202 = 0; i202 < childCount; i202++) {
                                ((oh.c) qyVar.getChildAt(i202)).a(false, true);
                            }
                            vyVar.d = 0L;
                            vyVar.F.b.a(false, true);
                            vyVar.l();
                            break;
                        case 1:
                            rz rzVar = this.b.z0;
                            qz qzVar = rzVar.c;
                            int childCount2 = qzVar.getChildCount();
                            for (int i212 = 0; i212 < childCount2; i212++) {
                                ((oh.c) qzVar.getChildAt(i212)).a(false, true);
                            }
                            rzVar.d = 0L;
                            rzVar.Q.a.a(false, true);
                            rzVar.l();
                            break;
                        case 2:
                            wy wyVar = this.b.t1;
                            if (wyVar != null) {
                                wyVar.w();
                                break;
                            }
                            break;
                        default:
                            wz wzVar = this.b;
                            int currentItem = wzVar.h.getCurrentItem();
                            iz izVar = currentItem == 0 ? wzVar.V : currentItem == 1 ? wzVar.o0 : wzVar.G0;
                            if (izVar != null) {
                                vq vqVar = izVar.d;
                                vqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                vqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                vqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            addView(frameLayout3, w7.a6.a(48.0f, 0.0f, 0.0f, 2.0f, 0.0f, 56, (LocaleController.isRTL ? 3 : 5) | 80));
            org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.g6.i0(AndroidUtilities.dp(56.0f), A(i18), A(i18));
            w7.c6.a(lxVar);
            lxVar.setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
            lxVar.setBackground(i02);
            lxVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
            lxVar.setFocusable(true);
            frameLayout3.addView(lxVar, w7.a6.a(48.0f, 2.0f, 0.0f, 2.0f, 0.0f, 48, 51));
            view2.setVisibility(8);
        }
        addView(kxVar, 0, w7.a6.e(-1, -1, 51));
        bi.f4 f4Var = new bi.f4(context2, 22);
        this.N0 = f4Var;
        f4Var.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(6.0f), A(org.telegram.ui.ActionBar.g6.qf)));
        f4Var.setTextColor(A(org.telegram.ui.ActionBar.g6.pf));
        f4Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f));
        f4Var.setGravity(16);
        f4Var.setTextSize(1, 14.0f);
        f4Var.setVisibility(4);
        addView(f4Var, w7.a6.a(-2.0f, 5.0f, 0.0f, 5.0f, 53.0f, -2, 81));
        this.C1 = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 32.0f);
        Field field2 = jv.f;
        jv jvVar = new jv(new iv(context2, c6Var2));
        if (jv.f == null) {
            try {
                field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    field.setAccessible(true);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                field = null;
            }
            jv.f = field;
        }
        Field field3 = jv.f;
        if (field3 != null) {
            try {
                jvVar.a = (ViewTreeObserver.OnScrollChangedListener) field3.get(jvVar);
                jv.f.set(jvVar, jv.g);
            } catch (Exception unused3) {
                jvVar.a = null;
            }
        }
        this.B1 = jvVar;
        jvVar.c.setOnSelectionUpdateListener(new d(this, 10));
        this.A1 = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
        Emoji.loadRecentEmoji();
        fyVar3.F(false);
        I(true, z11, z12, false);
        if (Build.VERSION.SDK_INT >= 31) {
            bh.f fVar = new bh.f(false);
            this.j2 = fVar;
            gh.d dVar3 = new gh.d(null);
            dVar3.f = cVar;
            dVar3.d = fVar;
            dVar3.e = -2;
            bh.b bVar3 = new bh.b(dVar3);
            this.l2 = bVar3;
            bVar3.i = LiteMode.isEnabled(262144);
            int dp3 = AndroidUtilities.dp(LiteMode.isEnabled(262144) ? 8.0f : 48.0f);
            bVar3.b = dp3;
            bVar3.c = dp3;
            bVar3.h = this.m2;
        } else {
            bh.b bVar4 = new bh.b(cVar);
            this.l2 = bVar4;
            bVar4.h = this.m2;
            this.j2 = null;
        }
        this.k2 = new lh(this, 1);
        setBlurredBackgroundDrawableFactory(this.l2);
        this.m2.b(this);
        this.m2.a = new qw(this, 0);
    }

    public static void c(wz wzVar, boolean z10) {
        yw ywVar = wzVar.h0;
        if (ywVar == null) {
            return;
        }
        int childCount = ywVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ywVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.f2) {
                ImageReceiver photoImage = ((org.telegram.ui.Cells.f2) childAt).getPhotoImage();
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

    public static void d(wz wzVar, ez ezVar, String str) {
        String str2;
        wy wyVar;
        org.telegram.ui.ActionBar.m2 m2Var = wzVar.Y1;
        int i10 = wzVar.c1;
        ArrayList arrayList = wzVar.q1;
        if (ezVar == null) {
            return;
        }
        if (ezVar.getSpan() == null) {
            wzVar.E2 = SystemClock.elapsedRealtime();
            wzVar.M(true);
            String str3 = str != null ? str : (String) ezVar.getTag();
            new SpannableStringBuilder().append((CharSequence) str3);
            if (str != null) {
                wy wyVar2 = wzVar.t1;
                if (wyVar2 != null) {
                    wyVar2.l(Emoji.fixEmoji(str));
                    return;
                }
                return;
            }
            if (!ezVar.c && (str2 = Emoji.emojiColor.get(str3)) != null) {
                str3 = g(str3, str2);
            }
            wzVar.h(str3);
            wy wyVar3 = wzVar.t1;
            if (wyVar3 != null) {
                wyVar3.l(Emoji.fixEmoji(str3));
                return;
            }
            return;
        }
        if (wzVar.t1 != null) {
            long j10 = ezVar.getSpan().documentId;
            TLRPC.Document document = ezVar.getSpan().document;
            jy jyVar = ezVar.e;
            boolean z10 = jyVar != null && jyVar.i;
            if (document == null) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    jy jyVar2 = (jy) arrayList.get(i11);
                    int i12 = 0;
                    while (true) {
                        ArrayList arrayList2 = jyVar2.c;
                        if (arrayList2 != null && i12 < arrayList2.size()) {
                            if (((TLRPC.Document) jyVar2.c.get(i12)).id == j10) {
                                document = (TLRPC.Document) jyVar2.c.get(i12);
                                break;
                            }
                            i12++;
                        }
                    }
                }
            }
            if (document == null) {
                document = s5.f(i10, j10);
            }
            TLRPC.Document document2 = document;
            String findAnimatedEmojiEmoticon = document2 != null ? MessageObject.findAnimatedEmojiEmoticon(document2) : null;
            if (MessageObject.isFreeEmoji(document2) || UserConfig.getInstance(i10).isPremium() || (((wyVar = wzVar.t1) != null && wyVar.g()) || wzVar.U0 || z10)) {
                wzVar.E2 = SystemClock.elapsedRealtime();
                wzVar.M(true);
                wzVar.h("animated_" + j10);
                wzVar.t1.x(j10, document2, findAnimatedEmojiEmoticon, ezVar.c);
                return;
            }
            wzVar.M(false);
            zc a02 = m2Var != null ? zc.a0(m2Var) : new zc(wzVar.r, wzVar.Z1);
            if (wzVar.h2 || m2Var == null) {
                a02.q(document2, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new pw(wzVar, 3)).j();
            } else {
                a02.J(R.raw.saved_messages, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint2)), LocaleController.getString(R.string.Open), new pw(wzVar, 4)).j();
            }
            wzVar.h2 = !wzVar.h2;
        }
    }

    public static void e(wz wzVar, int i10, int i11) {
        s4.b1 K;
        int[] iArr = wzVar.Q0;
        if (i10 == 1) {
            wzVar.n(i11, wzVar.P);
            return;
        }
        wy wyVar = wzVar.t1;
        if ((wyVar == null || !wyVar.z()) && !wzVar.J0) {
            mm0 y3 = wzVar.y(i10);
            if (i11 <= 0 || y3 == null || y3.getVisibility() != 0 || (K = y3.K(0)) == null || K.a.getTop() + wzVar.b1 < y3.getPaddingTop()) {
                int i12 = iArr[i10] - i11;
                iArr[i10] = i12;
                if (i12 > 0) {
                    iArr[i10] = 0;
                } else if (i12 < (-AndroidUtilities.dp(288.0f))) {
                    iArr[i10] = -AndroidUtilities.dp(288.0f);
                }
                if (i10 == 0) {
                    wzVar.Y();
                } else {
                    wzVar.z(i10).setTranslationY(Math.max(-AndroidUtilities.dp(48.0f), iArr[i10]));
                }
            }
        }
    }

    public static void f(wz wzVar, boolean z10) {
        int N0;
        bz bzVar = wzVar.i0;
        bx bxVar = wzVar.o0;
        yw ywVar = wzVar.h0;
        if (ywVar != null && (ywVar.getAdapter() instanceof az)) {
            az azVar = (az) ywVar.getAdapter();
            if (!azVar.s && azVar.h == 0 && !azVar.x.isEmpty() && (N0 = bzVar.N0()) != -1 && N0 > bzVar.B() - 5) {
                String str = azVar.w;
                String str2 = azVar.r;
                boolean z11 = azVar.v;
                azVar.F(str, str2, true, z11, z11);
            }
        }
        wy wyVar = wzVar.t1;
        if (wyVar == null || !wyVar.z()) {
            if (bxVar == null || ywVar == null) {
                return;
            }
            bxVar.a.a(true, !z10);
            return;
        }
        s4.b1 K = ywVar.K(0);
        if (K == null) {
            iz.a(bxVar, true, !z10);
        } else {
            iz.a(bxVar, K.a.getTop() < ywVar.getPaddingTop(), !z10);
        }
    }

    public static String g(String str, String str2) {
        boolean z10;
        String str3;
        if (CompoundEmoji.isHandshake(str) != null) {
            return CompoundEmoji.applyColor(str, str2);
        }
        if (Emoji.endsWithRightArrow(str)) {
            str = com.google.android.gms.internal.play_billing.k3.j(2, 0, str);
            z10 = true;
        } else {
            z10 = false;
        }
        int length = str.length();
        if (length > 2 && str.charAt(str.length() - 2) == 8205) {
            str3 = str.substring(str.length() - 2);
            str = com.google.android.gms.internal.play_billing.k3.j(2, 0, str);
        } else if (length <= 3 || str.charAt(str.length() - 3) != 8205) {
            str3 = null;
        } else {
            str3 = str.substring(str.length() - 3);
            str = com.google.android.gms.internal.play_billing.k3.j(3, 0, str);
        }
        String u10 = t8.b.u(str, str2);
        if (str3 != null) {
            u10 = t8.b.u(u10, str3);
        }
        return z10 ? t8.b.u(u10, "\u200d➡") : u10;
    }

    public static void j(int i10, View view) {
        if (view == null) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i10);
    }

    public final int A(int i10) {
        org.telegram.ui.ActionBar.c6 c6Var = this.Z1;
        return c6Var != null ? c6Var.F0(i10) : org.telegram.ui.ActionBar.g6.x0(null, i10, false);
    }

    public final void B() {
        hx hxVar = this.G0;
        if (hxVar != null) {
            hxVar.b();
        }
        bx bxVar = this.o0;
        if (bxVar != null) {
            bxVar.b();
        }
        vw vwVar = this.V;
        if (vwVar != null) {
            vwVar.b();
        }
    }

    public final void D(boolean z10, boolean z11) {
        hz hzVar;
        if (this.A1 != 0 && this.w1) {
            this.A1 = 0;
        }
        if (this.A1 == 0 && this.v1) {
            this.A1 = 1;
        }
        int i10 = this.A1;
        kx kxVar = this.h;
        if (i10 == 0 || z10 || this.e.size() == 1) {
            L(true, false);
            Q(false, false);
            if (kxVar.getCurrentItem() != 0) {
                kxVar.x(0, !z10);
            }
            if (z11) {
                AndroidUtilities.runOnUIThread(new pw(this, 5), 350L);
            }
        } else {
            int i11 = this.A1;
            if (i11 == 1) {
                L(false, false);
                Q(this.u0 || this.v0, false);
                if (kxVar.getCurrentItem() != 2) {
                    kxVar.x(2, false);
                }
                ix ixVar = this.B0;
                if (ixVar != null) {
                    this.S0 = true;
                    int i12 = this.G1;
                    if (i12 >= 0) {
                        ixVar.m(i12);
                    } else {
                        int i13 = this.F1;
                        if (i13 >= 0) {
                            ixVar.m(i13);
                        } else {
                            ixVar.m(this.E1);
                        }
                    }
                    this.S0 = false;
                    this.E0.h1(0, 0);
                }
            } else if (i11 == 2) {
                L(false, false);
                Q(false, false);
                if (kxVar.getCurrentItem() != 1) {
                    kxVar.x(1, false);
                }
                dy dyVar = this.p0;
                if (dyVar != null) {
                    dyVar.m(0);
                }
                bx bxVar = this.o0;
                if (bxVar != null && (hzVar = bxVar.r) != null) {
                    hzVar.G1(null);
                }
            }
        }
        M(true);
    }

    public final void E() {
        mz mzVar = this.y0;
        if (mzVar != null) {
            mzVar.l();
        }
        rz rzVar = this.z0;
        if (rzVar != null) {
            rzVar.l();
        }
        if (org.telegram.ui.xt.q().E) {
            org.telegram.ui.xt.q().n();
        }
        org.telegram.ui.xt.q().u();
    }

    public final void F(int i10) {
        wy wyVar = this.t1;
        if ((wyVar == null || !wyVar.z()) && i10 != 0) {
            HorizontalScrollView z10 = z(i10);
            this.Q0[i10] = 0;
            z10.setTranslationY(0);
        }
    }

    public final void G(int i10, int i11) {
        vx vxVar = this.Q;
        View m10 = vxVar.m(i10);
        int L0 = vxVar.L0();
        if ((m10 == null && Math.abs(i10 - L0) > vxVar.J * 9.0f) || !SharedConfig.animationsEnabled()) {
            int i12 = vxVar.L0() < i10 ? 0 : 1;
            pl0 pl0Var = this.b0;
            pl0Var.b = i12;
            pl0Var.c(i10, i11, false, false);
            return;
        }
        this.J0 = true;
        di.l1 l1Var = new di.l1(this, this.P.getContext(), 1);
        l1Var.a = i10;
        l1Var.p = i11;
        vxVar.w0(l1Var);
    }

    public final void H(int i10, int i11) {
        fx fxVar = this.E0;
        View m10 = fxVar.m(i10);
        int L0 = fxVar.L0();
        if (m10 != null || Math.abs(i10 - L0) <= 40) {
            this.J0 = true;
            this.D0.x0(i10);
        } else {
            int i12 = fxVar.L0() < i10 ? 0 : 1;
            pl0 pl0Var = this.a0;
            pl0Var.b = i12;
            pl0Var.c(i10, i11, false, false);
        }
    }

    public final void I(boolean z10, boolean z11, boolean z12, boolean z13) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i10 >= arrayList2.size()) {
                break;
            }
            if (((sz) arrayList2.get(i10)).a == 0 && z10) {
                arrayList.add((sz) arrayList2.get(i10));
            }
            if (((sz) arrayList2.get(i10)).a == 1 && z12) {
                arrayList.add((sz) arrayList2.get(i10));
            }
            if (((sz) arrayList2.get(i10)).a == 2 && z11) {
                arrayList.add((sz) arrayList2.get(i10));
            }
            i10++;
        }
        de0 de0Var = this.w;
        if (de0Var != null) {
            AndroidUtilities.updateViewVisibilityAnimated(de0Var, arrayList.size() > 1, 1.0f, z13);
        }
        kx kxVar = this.h;
        if (kxVar != null) {
            kxVar.setAdapter(null);
            kxVar.setAdapter(this.L0);
            if (de0Var != null) {
                de0Var.setViewPager(kxVar);
            }
        }
    }

    public final void J(final oh.b bVar, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z10, boolean z11) {
        rz rzVar;
        vy vyVar;
        if (stickerSet == null) {
            return;
        }
        if (!z10 || (vyVar = this.S) == null || vyVar.d == stickerSet.id) {
            if (z10 || (rzVar = this.z0) == null || rzVar.d == stickerSet.id) {
                final boolean isStickerPackInstalled = MediaDataController.getInstance(this.c1).isStickerPackInstalled(stickerSet.id);
                bVar.g(isStickerPackInstalled ? stickerSet.masks ? LocaleController.formatPluralString("RemoveManyMasksCount", stickerSet.count, new Object[0]) : stickerSet.emojis ? LocaleController.formatPluralString("RemoveManyEmojiCount", stickerSet.count, new Object[0]) : LocaleController.formatPluralString("RemoveManyStickersCount", stickerSet.count, new Object[0]) : stickerSet.masks ? LocaleController.formatPluralString("AddManyMasksCount", stickerSet.count, new Object[0]) : stickerSet.emojis ? LocaleController.formatPluralString("AddManyEmojiCount", stickerSet.count, new Object[0]) : LocaleController.formatPluralString("AddManyStickersCount", stickerSet.count, new Object[0]), z11, true);
                bVar.h0.a(!isStickerPackInstalled, z11);
                bVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.uw
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        wz wzVar = wz.this;
                        MediaDataController mediaDataController = MediaDataController.getInstance(wzVar.c1);
                        Context context = wzVar.getContext();
                        int i10 = isStickerPackInstalled ? 0 : 2;
                        org.telegram.ui.ActionBar.m2 m2Var = wzVar.Y1;
                        FrameLayout frameLayout = wzVar.s;
                        oh.b bVar2 = bVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z12 = z10;
                        mediaDataController.toggleStickerSet(context, tLObject2, document2, i10, m2Var, frameLayout, false, true, new i2.f1(wzVar, bVar2, tLObject2, stickerSet2, document2, z12, 10), false);
                        wzVar.J(bVar2, tLObject2, stickerSet2, document2, z12, true);
                    }
                });
            }
        }
    }

    public final void K(long j10, boolean z10, boolean z11) {
        de0 de0Var = this.w;
        if (de0Var == null) {
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
        LinearLayout linearLayout = de0Var.d;
        View childAt = i10 >= linearLayout.getChildCount() ? null : linearLayout.getChildAt(i10);
        if (childAt != null) {
            childAt.setAlpha(this.u1 != 0 ? 0.15f : 1.0f);
            kx kxVar = this.h;
            if (z11) {
                if (this.u1 == 0 || kxVar.getCurrentItem() == 0) {
                    return;
                }
                L(true, true);
                Q(false, true);
                kxVar.x(0, false);
                return;
            }
            if (this.u1 == 0 || kxVar.getCurrentItem() == 1) {
                return;
            }
            L(false, true);
            Q(false, true);
            kxVar.x(1, false);
        }
    }

    public final void L(boolean z10, boolean z11) {
        lx lxVar = this.x;
        if (z10 && lxVar.getTag() == null) {
            return;
        }
        if ((z10 || lxVar.getTag() == null) && !this.n2) {
            AnimatorSet animatorSet = this.F;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.F = null;
            }
            lxVar.setTag(z10 ? null : 1);
            if (!z11) {
                lxVar.setAlpha(z10 ? 1.0f : 0.0f);
                lxVar.setScaleX(z10 ? 1.0f : 0.0f);
                lxVar.setScaleY(z10 ? 1.0f : 0.0f);
                lxVar.setVisibility(z10 ? 0 : 4);
                return;
            }
            if (z10) {
                lxVar.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.F = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(lxVar, (Property<lx, Float>) View.ALPHA, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(lxVar, (Property<lx, Float>) View.SCALE_X, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(lxVar, (Property<lx, Float>) View.SCALE_Y, z10 ? 1.0f : 0.0f));
            this.F.setDuration(200L);
            this.F.setInterpolator(es.g);
            this.F.addListener(new rx(this, z10, r2));
            this.F.start();
        }
    }

    public final void M(boolean z10) {
        this.H = 0.0f;
        wy wyVar = this.t1;
        if (wyVar != null && wyVar.z()) {
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
            this.W.setInterpolator(es.g);
            this.W.addListener(new l6(this, 22));
            this.W.start();
        }
    }

    public final void O(boolean z10) {
        for (int i10 = 0; i10 < 3; i10++) {
            s4.s x10 = x(i10);
            int L0 = x10.L0();
            if (z10) {
                if (L0 == 1 || L0 == 2) {
                    x10.n0(0);
                    F(i10);
                }
            } else if (L0 == 0) {
                x10.h1(0, 0);
            }
        }
    }

    public final void P(boolean z10, boolean z11, boolean z12) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.Chat chat = MessagesController.getInstance(this.c1).getChat(Long.valueOf(this.u1));
        if (chat == null) {
            return;
        }
        bi.f4 f4Var = this.N0;
        if (z10) {
            if (ChatObject.hasAdminRights(chat) || (tL_chatBannedRights = chat.default_banned_rights) == null || !(tL_chatBannedRights.send_stickers || (z11 && tL_chatBannedRights.send_plain))) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.banned_rights;
                if (tL_chatBannedRights2 == null) {
                    return;
                }
                if (!AndroidUtilities.isBannedForever(tL_chatBannedRights2)) {
                    if (z11) {
                        f4Var.setText(LocaleController.formatString("AttachPlainRestricted", R.string.AttachPlainRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    }
                    if (z12) {
                        f4Var.setText(LocaleController.formatString("AttachGifRestricted", R.string.AttachGifRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    } else {
                        f4Var.setText(LocaleController.formatString("AttachStickersRestricted", R.string.AttachStickersRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    }
                } else if (z11) {
                    f4Var.setText(LocaleController.getString(R.string.AttachPlainRestrictedForever));
                } else if (z12) {
                    f4Var.setText(LocaleController.getString(R.string.AttachGifRestrictedForever));
                } else {
                    f4Var.setText(LocaleController.getString(R.string.AttachStickersRestrictedForever));
                }
            } else {
                org.telegram.ui.ActionBar.m2 m2Var = this.Y1;
                if ((m2Var instanceof org.telegram.ui.fo) && ((org.telegram.ui.fo) m2Var).N6()) {
                    return;
                }
                if (z11) {
                    f4Var.setText(LocaleController.getString(R.string.GlobalAttachEmojiRestricted));
                } else if (z12) {
                    f4Var.setText(LocaleController.getString(R.string.GlobalAttachGifRestricted));
                } else {
                    f4Var.setText(LocaleController.getString(R.string.GlobalAttachStickersRestricted));
                }
            }
            f4Var.setVisibility(0);
        }
        AnimatorSet animatorSet = this.J2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.J2 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.J2 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(f4Var, (Property<bi.f4, Float>) View.ALPHA, z10 ? f4Var.getAlpha() : 1.0f, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(f4Var, (Property<bi.f4, Float>) View.TRANSLATION_Y, z10 ? AndroidUtilities.dp(12.0f) : f4Var.getTranslationY(), z10 ? 0.0f : AndroidUtilities.dp(12.0f)));
        e2.n0 n0Var = this.K2;
        if (n0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(n0Var);
        }
        if (z10) {
            e2.n0 n0Var2 = new e2.n0(this, z11, z12, 4);
            this.K2 = n0Var2;
            AndroidUtilities.runOnUIThread(n0Var2, 3500L);
        }
        this.J2.setDuration(320L);
        this.J2.setInterpolator(es.h);
        this.J2.start();
    }

    public final void Q(boolean z10, boolean z11) {
        ImageView imageView = this.y;
        if (imageView == null || this.o2) {
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
            this.G.setInterpolator(es.g);
            this.G.addListener(new rx(this, z10, i10));
            this.G.start();
        }
    }

    public final void R() {
        org.telegram.ui.ActionBar.m2 m2Var;
        if (((View) getParent()) != null) {
            float y3 = (getY() + (getLayoutParams().height > 0 ? getLayoutParams().height : getMeasuredHeight())) - (((AndroidUtilities.isInMultiwindow || ((m2Var = this.Y1) != null && m2Var.isInBubbleMode())) && !this.V0) ? AndroidUtilities.dp(1.0f) : r0.getHeight());
            float f7 = this.q2;
            FrameLayout frameLayout = this.n;
            if (f7 >= 0.0f) {
                y3 += getMeasuredHeight() - this.q2;
            } else if (frameLayout.getTop() - y3 < 0.0f || !this.w2) {
                y3 = 0.0f;
            }
            float lerp = (-y3) + AndroidUtilities.lerp(AndroidUtilities.dp(50.0f), -this.p2, this.F2.e);
            frameLayout.setTranslationY(lerp);
            if (this.d0) {
                this.r.setTranslationY(lerp);
            }
        }
    }

    public final void S() {
        iz izVar;
        boolean z10;
        kw kwVar;
        boolean z11 = this.u0;
        View view = this.v;
        if (!z11) {
            setBackground(null);
            view.setBackground(null);
        } else if (AndroidUtilities.isInMultiwindow || this.N1) {
            Drawable background = getBackground();
            if (background != null) {
                background.setColorFilter(new PorterDuffColorFilter(A(org.telegram.ui.ActionBar.g6.He), PorterDuff.Mode.MULTIPLY));
            }
        } else {
            int i10 = org.telegram.ui.ActionBar.g6.He;
            setBackgroundColor(A(i10));
            if (this.d0) {
                view.setBackgroundColor(A(i10));
            }
        }
        zx zxVar = this.I;
        if (zxVar != null) {
            if (this.u0) {
                zxVar.setBackgroundColor(A(org.telegram.ui.ActionBar.g6.He));
                this.O.setBackgroundColor(A(org.telegram.ui.ActionBar.g6.Ke));
            } else {
                zxVar.setBackground(null);
            }
        }
        jv jvVar = this.B1;
        if (jvVar != null) {
            jvVar.c.a();
        }
        int i11 = 0;
        while (true) {
            izVar = this.V;
            z10 = this.i2;
            if (i11 >= 3) {
                break;
            }
            if (i11 == 0) {
                izVar = this.G0;
            } else if (i11 != 1) {
                izVar = this.o0;
            }
            if (izVar != null) {
                vq vqVar = izVar.d;
                FrameLayout frameLayout = izVar.n;
                View view2 = izVar.f;
                if (this.u0) {
                    view2.setBackgroundColor(A(org.telegram.ui.ActionBar.g6.He));
                } else {
                    view2.setBackground(null);
                }
                izVar.e.setBackgroundColor(A(org.telegram.ui.ActionBar.g6.Ke));
                izVar.c.a(z10 ? w(0.4f) : A(org.telegram.ui.ActionBar.g6.Je));
                org.telegram.ui.ActionBar.g6.x1(z10 ? w(0.06f) : A(org.telegram.ui.ActionBar.g6.Ie), frameLayout.getBackground());
                frameLayout.invalidate();
                vqVar.setHintTextColor(z10 ? w(0.45f) : A(org.telegram.ui.ActionBar.g6.Je));
                vqVar.setTextColor(z10 ? w(0.8f) : A(org.telegram.ui.ActionBar.g6.G6));
            }
            i11++;
        }
        Paint paint = this.s1;
        if (paint != null) {
            paint.setColor(A(org.telegram.ui.ActionBar.g6.af));
        }
        iy iyVar = this.P;
        if (iyVar != null) {
            iyVar.setGlowColor(A(org.telegram.ui.ActionBar.g6.He));
        }
        ex exVar = this.D0;
        if (exVar != null) {
            exVar.setGlowColor(A(org.telegram.ui.ActionBar.g6.He));
        }
        ix ixVar = this.B0;
        if (ixVar != null) {
            ixVar.setIndicatorColor(A(org.telegram.ui.ActionBar.g6.Qe));
            ixVar.setUnderlineColor(A(org.telegram.ui.ActionBar.g6.Ke));
            if (this.u0) {
                ixVar.setBackgroundColor(A(org.telegram.ui.ActionBar.g6.He));
            } else {
                ixVar.setBackground(null);
            }
        }
        dy dyVar = this.p0;
        if (dyVar != null) {
            dyVar.setIndicatorColor(A(org.telegram.ui.ActionBar.g6.Qe));
            dyVar.setUnderlineColor(A(org.telegram.ui.ActionBar.g6.Ke));
            if (this.u0) {
                dyVar.setBackgroundColor(A(org.telegram.ui.ActionBar.g6.He));
            } else {
                dyVar.setBackground(null);
            }
        }
        lx lxVar = this.x;
        if (lxVar != null) {
            lxVar.setColorFilter(new PorterDuffColorFilter(z10 ? w(0.6f) : A(org.telegram.ui.ActionBar.g6.Re), PorterDuff.Mode.MULTIPLY));
            if (izVar == null) {
                Drawable background2 = lxVar.getBackground();
                int i12 = org.telegram.ui.ActionBar.g6.He;
                org.telegram.ui.ActionBar.g6.C1(background2, A(i12), false);
                org.telegram.ui.ActionBar.g6.C1(lxVar.getBackground(), A(i12), true);
            }
        }
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(z10 ? w(0.6f) : A(org.telegram.ui.ActionBar.g6.Re), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.E;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(z10 ? w(0.6f) : A(org.telegram.ui.ActionBar.g6.Re), PorterDuff.Mode.MULTIPLY));
        }
        bi.f4 f4Var = this.N0;
        if (f4Var != null) {
            ((ShapeDrawable) f4Var.getBackground()).getPaint().setColor(A(org.telegram.ui.ActionBar.g6.qf));
            f4Var.setTextColor(A(org.telegram.ui.ActionBar.g6.pf));
        }
        az azVar = this.j0;
        if (azVar != null) {
            cz czVar = azVar.e;
            ImageView imageView3 = czVar.a;
            int i13 = org.telegram.ui.ActionBar.g6.Le;
            imageView3.setColorFilter(new PorterDuffColorFilter(A(i13), PorterDuff.Mode.MULTIPLY));
            czVar.b.setTextColor(A(i13));
            czVar.c.setProgressColor(A(org.telegram.ui.ActionBar.g6.h6));
        }
        this.e2 = new PorterDuffColorFilter(A(org.telegram.ui.ActionBar.g6.Oh), PorterDuff.Mode.SRC_IN);
        int i14 = 0;
        while (true) {
            Drawable[] drawableArr = this.X0;
            if (i14 >= drawableArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.g6.z1(drawableArr[i14], z10 ? w(0.4f) : A(org.telegram.ui.ActionBar.g6.Ne), false);
            org.telegram.ui.ActionBar.g6.z1(drawableArr[i14], z10 ? w(0.8f) : A(org.telegram.ui.ActionBar.g6.Oe), true);
            i14++;
        }
        if (zxVar != null && (kwVar = zxVar.y) != null) {
            kwVar.d();
        }
        int i15 = 0;
        while (true) {
            Drawable[] drawableArr2 = this.Y0;
            if (i15 >= drawableArr2.length) {
                break;
            }
            org.telegram.ui.ActionBar.g6.z1(drawableArr2[i15], z10 ? w(0.4f) : A(org.telegram.ui.ActionBar.g6.Me), false);
            org.telegram.ui.ActionBar.g6.z1(drawableArr2[i15], z10 ? w(0.8f) : A(org.telegram.ui.ActionBar.g6.Oe), true);
            i15++;
        }
        int i16 = 0;
        while (true) {
            Drawable[] drawableArr3 = this.Z0;
            if (i16 >= drawableArr3.length) {
                break;
            }
            org.telegram.ui.ActionBar.g6.z1(drawableArr3[i16], z10 ? w(0.4f) : A(org.telegram.ui.ActionBar.g6.Me), false);
            org.telegram.ui.ActionBar.g6.z1(drawableArr3[i16], z10 ? w(0.8f) : A(org.telegram.ui.ActionBar.g6.Oe), true);
            i16++;
        }
        org.telegram.ui.ActionBar.s5 s5Var = this.a2;
        if (s5Var != null) {
            org.telegram.ui.ActionBar.g6.z1(s5Var, z10 ? w(0.4f) : A(org.telegram.ui.ActionBar.g6.Ne), false);
            org.telegram.ui.ActionBar.g6.z1(s5Var, z10 ? w(0.8f) : A(org.telegram.ui.ActionBar.g6.Oe), true);
        }
        org.telegram.ui.ActionBar.s5 s5Var2 = this.b2;
        if (s5Var2 != null) {
            org.telegram.ui.ActionBar.g6.z1(s5Var2, z10 ? w(0.4f) : A(org.telegram.ui.ActionBar.g6.Qe), false);
            org.telegram.ui.ActionBar.g6.z1(s5Var2, z10 ? w(0.8f) : A(org.telegram.ui.ActionBar.g6.Qe), true);
        }
    }

    public final void T() {
        iy iyVar = this.P;
        if (iyVar == null) {
            return;
        }
        for (int i10 = 0; i10 < iyVar.getChildCount(); i10++) {
            View childAt = iyVar.getChildAt(i10);
            if (childAt instanceof ny) {
                ((ny) childAt).a(true);
            }
        }
    }

    public final void U(int i10) {
        if (this.f0) {
            return;
        }
        int i11 = -1;
        if (i10 != -1) {
            int size = getRecentEmoji().size() + (this.d0 ? 1 : 0);
            fy fyVar = this.R;
            int i12 = fyVar.c;
            ArrayList arrayList = fyVar.x;
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
                    ArrayList<jy> emojipacks = getEmojipacks();
                    int size2 = arrayList.size() - 1;
                    while (true) {
                        if (size2 < 0) {
                            break;
                        }
                        if (((Integer) arrayList.get(size2)).intValue() <= i10) {
                            jy jyVar = (jy) this.q1.get(size2);
                            while (i13 < emojipacks.size()) {
                                long j10 = emojipacks.get(i13).b.id;
                                long j11 = jyVar.b.id;
                                if (j10 == j11 && (!jyVar.g || (!jyVar.f && !this.p1.contains(Long.valueOf(j11))))) {
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

    public final void V() {
        int i10;
        hz hzVar;
        int i11;
        boolean z10;
        dy dyVar = this.p0;
        int currentPosition = dyVar.getCurrentPosition();
        int i12 = this.r0;
        boolean z11 = currentPosition == i12;
        boolean z12 = i12 >= 0;
        boolean isEmpty = this.i1.isEmpty();
        dyVar.d(false);
        this.r0 = -2;
        this.s0 = -2;
        this.t0 = -2;
        Drawable[] drawableArr = this.Z0;
        if (isEmpty) {
            i10 = 0;
        } else {
            this.r0 = 0;
            dyVar.b(0, drawableArr[0]).setContentDescription(LocaleController.getString(R.string.RecentStickers));
            i10 = 1;
        }
        this.s0 = i10;
        dyVar.b(1, drawableArr[1]).setContentDescription(LocaleController.getString(R.string.FeaturedGifs));
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
                String i15 = i2.d.i(i14 + 3, "tab");
                int i16 = dyVar.x;
                dyVar.x = i16 + 1;
                by0 by0Var = (by0) dyVar.n.get(i15);
                if (by0Var != null) {
                    dyVar.g(i15, by0Var, i16);
                    i11 = currentPosition;
                    z10 = z12;
                } else {
                    i11 = currentPosition;
                    z10 = z12;
                    by0Var = new by0(dyVar.getContext(), 2);
                    by0Var.setFocusable(true);
                    by0Var.setOnClickListener(new dn0(dyVar, 2));
                    by0Var.setExpanded(dyVar.f0);
                    by0Var.a(dyVar.i0);
                    dyVar.e.addView(by0Var, i16);
                }
                by0Var.d = false;
                by0Var.setTag(R.id.index_tag, Integer.valueOf(i16));
                by0Var.setTag(R.id.parent_tag, emojiDrawable);
                by0Var.setTag(R.id.object_tag, emojiAnimatedSticker);
                by0Var.setSelected(i16 == dyVar.y);
                dyVar.h.put(i15, by0Var);
                by0Var.setContentDescription(str);
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
        dyVar.h();
        dyVar.q();
        if (z11 && isEmpty) {
            dyVar.m(this.s0);
            bx bxVar = this.o0;
            if (bxVar == null || (hzVar = bxVar.r) == null) {
                return;
            }
            hzVar.G1(null);
            return;
        }
        WeakHashMap weakHashMap = r0.j0.a;
        if (dyVar.isLaidOut()) {
            if (!isEmpty && !z13) {
                dyVar.k(i17 + 1, 0);
            } else if (isEmpty && z13) {
                dyVar.k(i17 - 1, 0);
            }
        }
    }

    public final void W() {
        az azVar;
        int size = this.i1.size();
        long calcDocumentsHash = MediaDataController.calcDocumentsHash(this.i1, ConnectionsManager.DEFAULT_DATACENTER_ID);
        ArrayList<TLRPC.Document> recentGifs = MediaDataController.getInstance(this.c1).getRecentGifs();
        this.i1 = recentGifs;
        long calcDocumentsHash2 = MediaDataController.calcDocumentsHash(recentGifs, ConnectionsManager.DEFAULT_DATACENTER_ID);
        if ((this.p0 != null && size == 0 && !this.i1.isEmpty()) || (size != 0 && this.i1.isEmpty())) {
            V();
        }
        if ((size == this.i1.size() && calcDocumentsHash == calcDocumentsHash2) || (azVar = this.n0) == null) {
            return;
        }
        azVar.l();
    }

    public final void X(boolean z10) {
        TLRPC.Document document;
        boolean z11;
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet;
        ix ixVar = this.B0;
        if (ixVar != null) {
            ic1 ic1Var = ixVar.e;
            if (ixVar.s != null) {
                return;
            }
            this.F1 = -2;
            this.G1 = -2;
            this.H1 = -2;
            this.I1 = -2;
            this.e0 = false;
            this.E1 = 0;
            int currentPosition = ixVar.getCurrentPosition();
            boolean z12 = true;
            ixVar.d((getParent() == null || getVisibility() != 0 || (this.y1.size() == 0 && this.z1.size() == 0)) ? false : true);
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
            uz uzVar = this.F0;
            if (uzVar != null) {
                uzVar.l();
            }
            boolean isEmpty = featuredStickerSets.isEmpty();
            long j10 = 0;
            Drawable[] drawableArr = this.Y0;
            if (!isEmpty && (arrayList3.isEmpty() || emojiSettings.getLong("featured_hidden", 0L) == featuredStickerSets.get(0).set.id)) {
                int i12 = mediaDataController.getUnreadStickerSets().isEmpty() ? 2 : 3;
                by0 c10 = ixVar.c(i12, drawableArr[i12]);
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
                by0 c11 = ixVar.c(1, drawableArr[1]);
                c11.h.setText(LocaleController.getString(R.string.FavoriteStickersShort));
                c11.setContentDescription(LocaleController.getString(R.string.FavoriteStickers));
            }
            if (!this.j1.isEmpty()) {
                int i15 = this.E1;
                this.F1 = i15;
                this.E1 = i15 + 1;
                by0 c12 = ixVar.c(0, drawableArr[0]);
                c12.h.setText(LocaleController.getString(R.string.RecentStickersShort));
                c12.setContentDescription(LocaleController.getString(R.string.RecentStickers));
            }
            ArrayList arrayList4 = this.d1;
            arrayList4.clear();
            org.telegram.ui.ActionBar.c6 c6Var = null;
            this.h1 = null;
            this.f1 = -1;
            this.e1 = -10;
            if (this.G2 == null || z10) {
                this.G2 = new ArrayList(mediaDataController.getStickerSets(0));
            }
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList5 = this.G2;
            int i16 = 0;
            while (true) {
                TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.x1;
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
            if (this.J1 != null) {
                long j13 = MessagesController.getEmojiSettings(i10).getLong("group_hide_stickers_" + this.J1.id, -1L);
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(this.J1.id));
                if (chat == null || this.J1.stickerset == null || !ChatObject.hasAdminRights(chat)) {
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
                        this.e0 = z12;
                        String str = "chat" + chat2.id;
                        int i19 = ixVar.x;
                        ixVar.x = i19 + 1;
                        by0 by0Var = (by0) ixVar.n.get(str);
                        if (by0Var != null) {
                            ixVar.g(str, by0Var, i19);
                        } else {
                            by0Var = new by0(ixVar.getContext(), 0);
                            by0Var.setFocusable(z12);
                            by0Var.setOnClickListener(new dn0(ixVar, 0));
                            ic1Var.addView(by0Var, i19);
                            by0Var.w = z12;
                            k9 k9Var = new k9(c6Var);
                            k9Var.u(AndroidUtilities.dp(14.0f));
                            k9Var.k(UserConfig.selectedAccount, chat2);
                            int i20 = ixVar.a;
                            z9 z9Var = by0Var.e;
                            z9Var.setLayerNum(i20);
                            z9Var.e(chat2, k9Var);
                            z9Var.setAspectFit(z12);
                            by0Var.setExpanded(ixVar.f0);
                            by0Var.a(ixVar.i0);
                            by0Var.h.setText(chat2.title);
                        }
                        by0Var.d = z12;
                        by0Var.setTag(R.id.index_tag, Integer.valueOf(i19));
                        by0Var.setSelected(i19 == ixVar.y ? z12 : false);
                        ixVar.h.put(str, by0Var);
                    }
                    z11 = z12;
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
                    int i22 = ixVar.x;
                    ixVar.x = i22 + 1;
                    by0 by0Var2 = (by0) ixVar.n.get(str2);
                    if (by0Var2 != null) {
                        ixVar.g(str2, by0Var2, i22);
                        z11 = z12;
                    } else {
                        by0Var2 = new by0(ixVar.getContext(), 0);
                        by0Var2.setFocusable(z12);
                        z11 = z12;
                        by0Var2.setOnClickListener(new dn0(ixVar, 1));
                        by0Var2.setExpanded(ixVar.f0);
                        by0Var2.a(ixVar.i0);
                        ic1Var.addView(by0Var2, i22);
                    }
                    by0Var2.e.setLayerNum(ixVar.a);
                    by0Var2.d = false;
                    by0Var2.setTag(closestPhotoSizeWithSize);
                    by0Var2.setTag(R.id.index_tag, Integer.valueOf(i22));
                    by0Var2.setTag(R.id.parent_tag, tL_messages_stickerSet5);
                    by0Var2.setTag(R.id.object_tag, document);
                    by0Var2.setSelected(i22 == ixVar.y ? z11 : false);
                    ixVar.h.put(str2, by0Var2);
                    by0Var2.setContentDescription(tL_messages_stickerSet5.set.title + ", " + LocaleController.getString(R.string.AccDescrStickerSet));
                }
                i18++;
                z12 = z11;
                c6Var = null;
            }
            ixVar.h();
            ixVar.q();
            if (currentPosition != 0) {
                ixVar.k(currentPosition, currentPosition);
            }
            o();
        }
    }

    public final void Y() {
        jx jxVar = this.C0;
        ix ixVar = this.B0;
        if (ixVar != null && jxVar == null && this.t1 != null) {
            ixVar.setTranslationY(this.t1.p() * (-AndroidUtilities.dp(50.0f)));
        }
        if (jxVar == null) {
            return;
        }
        boolean z10 = getVisibility() == 0 && this.K0 && this.t1.p() != 1.0f;
        jxVar.setVisibility(z10 ? 0 : 8);
        if (z10) {
            Rect rect = this.x2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.x0, rect, null);
            float p5 = this.t1.p() * AndroidUtilities.dp(50.0f);
            int i10 = rect.left;
            if (i10 != 0 || p5 != 0.0f) {
                this.X1 = false;
            }
            jxVar.setTranslationX(i10);
            float translationY = (((getTranslationY() + getTop()) - jxVar.getTop()) - ixVar.getExpandedOffset()) - p5;
            if (jxVar.getTranslationY() != translationY) {
                jxVar.setTranslationY(translationY);
                jxVar.invalidate();
            }
        }
        if (this.X1 && z10 && this.P0) {
            ixVar.i(this.W1, true);
        } else {
            this.X1 = false;
            ixVar.i(this.W1, false);
        }
    }

    public final void Z() {
        boolean z10;
        org.telegram.ui.Cells.s3 s3Var;
        LongSparseArray longSparseArray = this.z1;
        LongSparseArray longSparseArray2 = this.y1;
        int i10 = this.c1;
        ex exVar = this.D0;
        if (exVar == null) {
            return;
        }
        try {
            int childCount = exVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = exVar.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.s3) && ((wl0) exVar.T(childAt)) != null) {
                    org.telegram.ui.Cells.s3 s3Var2 = (org.telegram.ui.Cells.s3) childAt;
                    ArrayList<Long> unreadStickerSets = MediaDataController.getInstance(i10).getUnreadStickerSets();
                    TLRPC.StickerSetCovered stickerSet = s3Var2.getStickerSet();
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
                            s3Var = s3Var2;
                            if (stickerSetCovered.set.id == stickerSet.set.id) {
                                s3Var2 = s3Var;
                                z10 = true;
                                break;
                            }
                        } else {
                            s3Var = s3Var2;
                        }
                        i12++;
                        s3Var2 = s3Var;
                    }
                    s3Var2.c(stickerSet, z11, true, 0, 0, z10);
                    if (z11) {
                        MediaDataController.getInstance(i10).markFeaturedStickersByIdAsRead(false, stickerSet.set.id);
                    }
                    boolean z12 = longSparseArray2.indexOfKey(stickerSet.set.id) >= 0;
                    boolean z13 = longSparseArray.indexOfKey(stickerSet.set.id) >= 0;
                    if (z12 || z13) {
                        if (z12 && s3Var2.r) {
                            longSparseArray2.remove(stickerSet.set.id);
                            z12 = false;
                        } else if (z13 && !s3Var2.r) {
                            longSparseArray.remove(stickerSet.set.id);
                        }
                    }
                    s3Var2.b(!z10 && z12, true);
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // qh.a
    public final void a(int i10) {
        setBottomInset(i10);
    }

    @Override // qh.a
    public final void b(float f7) {
        this.q2 = f7;
        R();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Utilities.Callback callback;
        TLRPC.StickerSet stickerSet;
        int i12 = NotificationCenter.stickersDidLoad;
        fy fyVar = this.R;
        pw pwVar = this.L2;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.y0 != null) {
                    X(((Boolean) objArr[1]).booleanValue());
                    Z();
                    E();
                    o();
                    return;
                }
                return;
            }
            if (((Integer) objArr[0]).intValue() == 5) {
                if (!((Boolean) objArr[1]).booleanValue()) {
                    fyVar.F(false);
                    return;
                } else {
                    AndroidUtilities.cancelRunOnUIThread(pwVar);
                    AndroidUtilities.runOnUIThread(pwVar, 100L);
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
                fyVar.F(true);
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
            Z();
            de0 de0Var = this.w;
            if (de0Var != null) {
                int childCount = de0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    de0Var.getChildAt(i13).invalidate();
                }
            }
            X(false);
            return;
        }
        if (i10 == NotificationCenter.featuredEmojiDidLoad) {
            if (fyVar != null) {
                fyVar.F(false);
                return;
            }
            return;
        }
        int i14 = NotificationCenter.groupStickersDidLoad;
        vy vyVar = this.S;
        if (i10 == i14) {
            Long l4 = (Long) objArr[0];
            long longValue2 = l4.longValue();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = objArr.length > 1 ? (TLRPC.TL_messages_stickerSet) objArr[1] : null;
            if (tL_messages_stickerSet != null) {
                rz rzVar = this.z0;
                if (rzVar != null && rzVar.d == longValue2 && rzVar.f.size() < tL_messages_stickerSet.documents.size()) {
                    rzVar.f = tL_messages_stickerSet.documents;
                    rzVar.l();
                }
                if (vyVar != null && vyVar.d == longValue2 && vyVar.f.size() < tL_messages_stickerSet.documents.size()) {
                    vyVar.f = tL_messages_stickerSet.documents;
                    vyVar.l();
                }
            }
            TLRPC.ChatFull chatFull2 = this.J1;
            if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null && stickerSet.id == longValue2) {
                X(false);
            }
            HashMap hashMap = this.r1;
            if (hashMap.containsKey(l4) && objArr.length >= 2 && ((Utilities.Callback) hashMap.get(l4)) != null && tL_messages_stickerSet != null && (callback = (Utilities.Callback) hashMap.remove(l4)) != null) {
                callback.run(tL_messages_stickerSet);
            }
            AndroidUtilities.cancelRunOnUIThread(pwVar);
            AndroidUtilities.runOnUIThread(pwVar, 100L);
            return;
        }
        int i15 = NotificationCenter.emojiLoaded;
        iy iyVar = this.P;
        if (i10 != i15) {
            if (i10 != NotificationCenter.newEmojiSuggestionsAvailable) {
                if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                    if (fyVar != null) {
                        fyVar.F(false);
                    }
                    T();
                    X(false);
                    return;
                }
                return;
            }
            if (iyVar == null || !this.d0) {
                return;
            }
            if ((this.V.c.k == 2 || iyVar.getAdapter() == vyVar) && !TextUtils.isEmpty(vyVar.v)) {
                vyVar.F(vyVar.v, true);
                return;
            }
            return;
        }
        ex exVar = this.D0;
        if (exVar != null) {
            int childCount2 = exVar.getChildCount();
            for (int i16 = 0; i16 < childCount2; i16++) {
                View childAt = exVar.getChildAt(i16);
                if ((childAt instanceof org.telegram.ui.Cells.o8) || (childAt instanceof org.telegram.ui.Cells.f8)) {
                    childAt.invalidate();
                }
            }
        }
        if (iyVar != null) {
            iyVar.invalidate();
            int childCount3 = iyVar.getChildCount();
            for (int i17 = 0; i17 < childCount3; i17++) {
                View childAt2 = iyVar.getChildAt(i17);
                if (childAt2 instanceof ez) {
                    childAt2.invalidate();
                }
            }
        }
        jv jvVar = this.B1;
        if (jvVar != null) {
            jvVar.c.invalidate();
        }
        dy dyVar = this.p0;
        if (dyVar != null) {
            ic1 ic1Var = dyVar.e;
            int childCount4 = ic1Var.getChildCount();
            for (int i18 = 0; i18 < childCount4; i18++) {
                ic1Var.getChildAt(i18).invalidate();
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
        if (this.n.getVisibility() != 8 && !this.u0 && this.w0) {
            canvas.drawColor(i0.a.k(-1, 25));
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.p2);
        if (navigationBarThirdButtonsFactor > 0.0f) {
            int m12 = org.telegram.ui.ActionBar.g6.m1(navigationBarThirdButtonsFactor, A(org.telegram.ui.ActionBar.g6.He));
            int i10 = this.B2;
            GradientDrawable gradientDrawable = this.A2;
            if (i10 != m12) {
                gradientDrawable.setColors(new int[]{m12, org.telegram.ui.ActionBar.g6.m1(0.66f, m12), i0.a.k(m12, 0)});
                this.B2 = m12;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.p2, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
        canvas.restore();
        return drawChild;
    }

    public int getCurrentPage() {
        return this.A1;
    }

    public ArrayList<jy> getEmojipacks() {
        ArrayList<jy> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.q1;
            if (i10 >= arrayList2.size()) {
                return arrayList;
            }
            jy jyVar = (jy) arrayList2.get(i10);
            boolean z10 = jyVar.g;
            ArrayList arrayList3 = this.p1;
            if ((!z10 && (jyVar.f || arrayList3.contains(Long.valueOf(jyVar.b.id)))) || (jyVar.g && !jyVar.f && !arrayList3.contains(Long.valueOf(jyVar.b.id)))) {
                arrayList.add(jyVar);
            }
            i10++;
        }
    }

    public ArrayList<String> getRecentEmoji() {
        if (this.c2) {
            return Emoji.recentEmoji;
        }
        if (this.C2 == null) {
            this.C2 = new ArrayList();
        }
        if (Emoji.recentEmoji.size() != this.D2) {
            this.C2.clear();
            int i10 = 0;
            while (true) {
                ArrayList<String> arrayList = Emoji.recentEmoji;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (!arrayList.get(i10).startsWith("animated_")) {
                    this.C2.add(arrayList.get(i10));
                }
                i10++;
            }
            this.D2 = this.C2.size();
        }
        return this.C2;
    }

    public float getStickersExpandOffset() {
        ix ixVar = this.B0;
        if (ixVar == null) {
            return 0.0f;
        }
        return ixVar.getExpandedOffset();
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
        ArrayList arrayList = this.C2;
        if (arrayList == null) {
            this.C2 = new ArrayList();
        } else {
            arrayList.clear();
        }
        while (true) {
            ArrayList<String> arrayList2 = Emoji.recentEmoji;
            if (i10 >= arrayList2.size()) {
                this.D2 = this.C2.size();
                return;
            } else {
                if (!arrayList2.get(i10).startsWith("animated_")) {
                    this.C2.add(arrayList2.get(i10));
                }
                i10++;
            }
        }
    }

    public final void i(int i10, int i11, boolean z10) {
        if (i10 == 2 || y(i10).K(0) == null) {
            return;
        }
        sx sxVar = new sx(getContext(), i11);
        sxVar.a = !z10 ? 1 : 0;
        x(i10).w0(sxVar);
    }

    public final void k(boolean z10) {
        if (z10) {
            W();
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
            X(false);
        }
        mz mzVar = this.y0;
        if (mzVar != null) {
            mzVar.l();
        }
        o();
    }

    public final void l(boolean z10) {
        wy wyVar = this.t1;
        ne.b bVar = this.b;
        iy iyVar = this.P;
        vw vwVar = this.V;
        if (wyVar != null && wyVar.z()) {
            s4.b1 K = iyVar.K(0);
            if (K == null) {
                iz.a(vwVar, true, !z10);
            } else {
                iz.a(vwVar, K.a.getTop() < iyVar.getPaddingTop(), !z10);
            }
            N(false, !z10);
            vwVar.setTranslationY(bVar.e * AndroidUtilities.dp(15.0f));
            return;
        }
        if (vwVar == null || iyVar == null) {
            return;
        }
        vwVar.setTranslationY((bVar.e * AndroidUtilities.dp(15.0f)) + (iyVar.K(0) != null ? r0.a.getTop() : -this.b1));
        vwVar.a.a(false, !z10);
        m(Math.round(this.I.getTranslationY()));
    }

    public final void m(int i10) {
        ObjectAnimator objectAnimator = this.R0[1];
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            boolean z10 = false;
            s4.b1 K = this.P.K(0);
            int dp = AndroidUtilities.dp(38.0f) + i10;
            if (dp > 0 && (K == null || K.a.getBottom() < dp)) {
                z10 = true;
            }
            N(z10, !this.K1);
        }
    }

    public final void n(int i10, View view) {
        iy iyVar;
        s4.b1 K;
        zx zxVar = this.I;
        int[] iArr = this.Q0;
        if (view == null) {
            iArr[1] = 0;
            zxVar.setTranslationY(0);
            return;
        }
        if (view.getVisibility() != 0 || this.f0) {
            return;
        }
        wy wyVar = this.t1;
        if (wyVar == null || !wyVar.z()) {
            if (i10 > 0 && (iyVar = this.P) != null && iyVar.getVisibility() == 0 && (K = iyVar.K(0)) != null) {
                if (K.a.getTop() + (this.d0 ? this.b1 : 0) >= iyVar.getPaddingTop()) {
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
            zxVar.setTranslationY(Math.max(-AndroidUtilities.dp(36.0f), iArr[1]));
        }
    }

    public final void o() {
        int L0;
        ix ixVar = this.B0;
        if (ixVar == null || (L0 = this.E0.L0()) == -1) {
            return;
        }
        int i10 = this.G1;
        if (i10 <= 0 && (i10 = this.F1) <= 0) {
            i10 = this.E1;
        }
        ixVar.k(this.y0.F(L0), i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.ObserversGroup observersGroup = this.I2;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.I2 = null;
        }
        NotificationCenter.ObserversGroup add = NotificationCenter.getInstance(this.c1).createWeakObserversGroup(this).addGlobal(NotificationCenter.emojiLoaded).add(NotificationCenter.newEmojiSuggestionsAvailable).add(NotificationCenter.groupPackUpdated);
        this.I2 = add;
        if (this.y0 != null) {
            add.add(NotificationCenter.stickersDidLoad).add(NotificationCenter.recentDocumentsDidLoad).add(NotificationCenter.featuredStickersDidLoad).add(NotificationCenter.groupStickersDidLoad).add(NotificationCenter.currentUserPremiumStatusChanged);
            AndroidUtilities.runOnUIThread(new pw(this, 0));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jv jvVar = this.B1;
        if (jvVar != null && jvVar.isShowing()) {
            jvVar.dismiss();
        }
        org.telegram.ui.xt q6 = org.telegram.ui.xt.q();
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
            E();
        }
        super.onLayout(z10, i10, i11, i12, i13);
        R();
        Y();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.K1 = true;
        boolean z10 = AndroidUtilities.isInMultiwindow;
        View view = this.v;
        boolean z11 = this.d0;
        if (z10 || this.N1) {
            if (this.L1 != 1) {
                if (!this.H2) {
                    setOutlineProvider(this.M1);
                    setClipToOutline(true);
                    setElevation(AndroidUtilities.dp(2.0f));
                }
                setBackgroundResource(R.drawable.smiles_popup);
                Drawable background = getBackground();
                int i12 = org.telegram.ui.ActionBar.g6.He;
                background.setColorFilter(new PorterDuffColorFilter(A(i12), PorterDuff.Mode.MULTIPLY));
                if (z11 && this.u0) {
                    view.setBackgroundColor(A(i12));
                }
                this.L1 = 1;
            }
        } else if (this.L1 != 0) {
            if (!this.H2) {
                setOutlineProvider(null);
                setClipToOutline(false);
                setElevation(0.0f);
            }
            if (this.u0) {
                int i13 = org.telegram.ui.ActionBar.g6.He;
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

    @Override // ne.d
    public final void p(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 0) {
            r(false);
            float f11 = 1.0f - this.a.e;
            hx hxVar = this.G0;
            hxVar.setAlpha(f11);
            hxVar.setVisibility(f11 > 0.0f ? 0 : 4);
            float f12 = 1.0f - f11;
            oh.d dVar = this.H0;
            dVar.setAlpha(f12);
            dVar.setTranslationY((-AndroidUtilities.dp(15.0f)) * f11);
            dVar.setVisibility(f12 > 0.0f ? 0 : 4);
            ah.v vVar = this.M;
            vVar.setAlpha(f12);
            vVar.setTranslationY(AndroidUtilities.dp(30.0f) * f11);
            vVar.setVisibility(f12 > 0.0f ? 0 : 4);
            R();
            this.x0.invalidate();
            return;
        }
        if (i10 == 1) {
            l(false);
            float f13 = 1.0f - this.b.e;
            vw vwVar = this.V;
            vwVar.setAlpha(f13);
            vwVar.setVisibility(f13 > 0.0f ? 0 : 4);
            float f14 = 1.0f - f13;
            oh.d dVar2 = this.U;
            dVar2.setAlpha(f14);
            dVar2.setTranslationY((-AndroidUtilities.dp(15.0f)) * f13);
            dVar2.setVisibility(f14 > 0.0f ? 0 : 4);
            ah.v vVar2 = this.K;
            vVar2.setAlpha(f14);
            vVar2.setTranslationY(AndroidUtilities.dp(30.0f) * f13);
            vVar2.setVisibility(f14 > 0.0f ? 0 : 4);
            R();
            this.J.invalidate();
        }
    }

    public final void q(int i10) {
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
            az azVar = this.n0;
            if (adapter != azVar || azVar.I < 0 || this.s0 < 0 || this.r0 < 0 || (L0 = this.i0.L0()) == -1) {
                return;
            }
            this.p0.k(L0 >= azVar.I ? this.s0 : this.r0, 0);
        }
    }

    public final void r(boolean z10) {
        wy wyVar = this.t1;
        ne.b bVar = this.a;
        ex exVar = this.D0;
        hx hxVar = this.G0;
        if (wyVar != null && wyVar.z()) {
            s4.b1 K = exVar.K(0);
            if (K == null) {
                iz.a(hxVar, true, !z10);
            } else {
                iz.a(hxVar, K.a.getTop() < exVar.getPaddingTop(), !z10);
            }
            hxVar.setTranslationY(bVar.e * AndroidUtilities.dp(15.0f));
            return;
        }
        if (hxVar == null || exVar == null) {
            return;
        }
        hxVar.setTranslationY((bVar.e * AndroidUtilities.dp(15.0f)) + (exVar.K(0) != null ? r0.a.getTop() : -this.b1));
        hxVar.a.a(false, !z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.K1) {
            return;
        }
        super.requestLayout();
    }

    public final void s() {
        Emoji.clearRecentEmoji();
        this.R.F(false);
    }

    public void setBlurredBackgroundDrawableFactory(bh.b bVar) {
        org.telegram.ui.ActionBar.c6 c6Var = this.Z1;
        lx lxVar = this.x;
        if (lxVar != null) {
            dh.d c10 = bVar.c(lxVar, null, false);
            c10.o(fh.b.d(c6Var));
            c10.q(AndroidUtilities.dp(18.0f));
            c10.p(AndroidUtilities.dp(6.0f));
            lxVar.setBackground(c10);
        }
        ImageView imageView = this.E;
        if (imageView != null) {
            dh.d c11 = bVar.c(imageView, null, false);
            c11.o(fh.b.d(c6Var));
            c11.q(AndroidUtilities.dp(18.0f));
            c11.p(AndroidUtilities.dp(6.0f));
            imageView.setBackground(c11);
        }
        de0 de0Var = this.w;
        if (de0Var != null) {
            dh.d c12 = bVar.c(de0Var, null, false);
            c12.o(fh.b.d(c6Var));
            c12.q(AndroidUtilities.dp(18.0f));
            c12.p(AndroidUtilities.dp(6.0f));
            de0Var.setBackground(c12);
        }
        ImageView imageView2 = this.y;
        if (imageView2 != null) {
            dh.d c13 = bVar.c(imageView2, null, false);
            c13.o(fh.b.d(c6Var));
            c13.q(AndroidUtilities.dp(18.0f));
            c13.p(AndroidUtilities.dp(6.0f));
            imageView2.setBackground(c13);
        }
    }

    public void setBottomInset(int i10) {
        if (this.p2 != i10) {
            this.p2 = i10;
            j(i10, this.K);
            j(i10, this.M);
            j(AndroidUtilities.dp(44.0f) + i10, this.P);
            j(AndroidUtilities.dp(44.0f) + i10, this.D0);
            j(AndroidUtilities.dp(44.0f) + i10, this.h0);
            FrameLayout frameLayout = this.s;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-i10);
            }
            R();
            invalidate();
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.J1 = chatFull;
        X(false);
    }

    public void setDelegate(wy wyVar) {
        this.t1 = wyVar;
    }

    public void setDragListener(cy cyVar) {
        this.O0 = cyVar;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        hx hxVar = this.G0;
        if (hxVar != null) {
            hxVar.d.setEnabled(z10);
        }
        bx bxVar = this.o0;
        if (bxVar != null) {
            bxVar.d.setEnabled(z10);
        }
        vw vwVar = this.V;
        if (vwVar != null) {
            vwVar.d.setEnabled(z10);
        }
    }

    public void setForseMultiwindowLayout(boolean z10) {
        this.N1 = z10;
    }

    public void setShouldDrawBackground(boolean z10) {
        if (this.u0 != z10) {
            this.u0 = z10;
            S();
        }
    }

    public void setShowing(boolean z10) {
        this.P0 = z10;
        Y();
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        Y();
        R();
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
                    X(false);
                    E();
                }
                k(true);
                k(false);
                MediaDataController.getInstance(i11).loadRecents(0, true, true, false);
                MediaDataController.getInstance(i11).loadRecents(0, false, true, false);
                MediaDataController.getInstance(i11).loadRecents(2, false, true, false);
            }
            hg.f1 f1Var = this.T0;
            if (f1Var != null) {
                f1Var.a();
            }
        }
    }

    public final void t(long j10, boolean z10) {
        iz izVar;
        s4.b0 b0Var;
        View view;
        View view2;
        int i10;
        int i11;
        TLRPC.TL_messages_stickerSet stickerSetById;
        mz mzVar;
        int E;
        AnimatorSet animatorSet = this.M0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.M0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        int i12 = 2;
        if (currentItem == 2 && j10 != -1 && (stickerSetById = MediaDataController.getInstance(this.c1).getStickerSetById(j10)) != null && (E = (mzVar = this.y0).E(stickerSetById)) >= 0 && E < mzVar.h()) {
            H(E, AndroidUtilities.dp(48.0f));
        }
        int i13 = 0;
        az azVar = this.j0;
        if (azVar != null) {
            azVar.K = false;
        }
        int i14 = 0;
        while (i14 < 3) {
            View view3 = this.D0;
            View view4 = this.h0;
            bx bxVar = this.o0;
            View view5 = this.P;
            if (i14 == 0) {
                izVar = this.V;
                b0Var = this.Q;
                view = this.I;
                view2 = view5;
            } else if (i14 == 1) {
                b0Var = this.i0;
                view = this.p0;
                view2 = view4;
                izVar = bxVar;
            } else {
                izVar = this.G0;
                b0Var = this.E0;
                view = this.B0;
                view2 = view3;
            }
            if (izVar == null) {
                i11 = i13;
                i10 = i12;
            } else {
                int i15 = i13;
                hz hzVar = izVar.r;
                int i16 = i12;
                izVar.d.setText("");
                if (hzVar != null) {
                    hzVar.G1(null);
                    hzVar.E1();
                }
                int i17 = this.b1;
                if (i14 == currentItem && z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.M0 = animatorSet2;
                    Property property = View.TRANSLATION_Y;
                    if (view == null || i14 == 1) {
                        float[] fArr = new float[1];
                        fArr[i15] = AndroidUtilities.dp(36.0f) - i17;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, fArr);
                        Animator[] animatorArr = new Animator[1];
                        animatorArr[i15] = ofFloat;
                        animatorSet2.playTogether(animatorArr);
                    } else {
                        float[] fArr2 = new float[1];
                        fArr2[i15] = 0.0f;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr2);
                        float[] fArr3 = new float[1];
                        fArr3[i15] = AndroidUtilities.dp(36.0f);
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, fArr3);
                        float[] fArr4 = new float[1];
                        fArr4[i15] = AndroidUtilities.dp(36.0f);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(izVar, (Property<iz, Float>) property, fArr4);
                        Animator[] animatorArr2 = new Animator[3];
                        animatorArr2[i15] = ofFloat2;
                        animatorArr2[1] = ofFloat3;
                        animatorArr2[i16] = ofFloat4;
                        animatorSet2.playTogether(animatorArr2);
                    }
                    this.M0.setDuration(200L);
                    this.M0.setInterpolator(es.h);
                    this.M0.addListener(new bi.m4(this, b0Var, view2, 5));
                    this.M0.start();
                    i11 = i15;
                    i10 = i16;
                } else {
                    if (izVar != bxVar) {
                        izVar.setTranslationY(AndroidUtilities.dp(36.0f) - i17);
                    }
                    i10 = i16;
                    if (view != null && i14 != i10) {
                        view.setTranslationY(0.0f);
                    }
                    if (view2 == view3) {
                        i11 = i15;
                        view2.setPadding(i11, AndroidUtilities.dp(36.0f), i11, AndroidUtilities.dp(44.0f) + this.p2);
                    } else {
                        i11 = i15;
                        if (view2 == view4) {
                            view2.setPadding(i11, AndroidUtilities.dp(40.0f), i11, AndroidUtilities.dp(44.0f) + this.p2);
                        } else {
                            if (view2 == view5) {
                                view2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + this.p2);
                            }
                            i11 = 0;
                        }
                    }
                    b0Var.h1(i11, i11);
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

    public final void u(boolean z10) {
        t(-1L, z10);
    }

    public final void v(boolean z10) {
        mz mzVar;
        boolean z11 = this.N2;
        this.N2 = z10;
        if (!z11 || z10) {
            return;
        }
        int i10 = this.A1;
        if (i10 == 0) {
            fy fyVar = this.R;
            if (fyVar != null) {
                fyVar.F(false);
                return;
            }
            return;
        }
        if (i10 == 1) {
            az azVar = this.n0;
            if (azVar != null) {
                azVar.l();
                return;
            }
            return;
        }
        if (i10 != 2 || (mzVar = this.y0) == null) {
            return;
        }
        mzVar.l();
    }

    public final int w(float f7) {
        return i0.a.k(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Wk, this.Z1), (int) (f7 * 255.0f));
    }

    public final s4.s x(int i10) {
        if (i10 == 0) {
            return this.E0;
        }
        if (i10 == 1) {
            return this.Q;
        }
        if (i10 == 2) {
            return this.i0;
        }
        throw new IllegalArgumentException(i2.d.i(i10, "Unexpected argument: "));
    }

    public final mm0 y(int i10) {
        if (i10 == 0) {
            return this.D0;
        }
        if (i10 == 1) {
            return this.P;
        }
        if (i10 == 2) {
            return this.h0;
        }
        throw new IllegalArgumentException(i2.d.i(i10, "Unexpected argument: "));
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
        throw new IllegalArgumentException(i2.d.i(i10, "Unexpected argument: "));
    }

    @Override // ne.d
    public final void C(float f7, int i10) {
    }
}
