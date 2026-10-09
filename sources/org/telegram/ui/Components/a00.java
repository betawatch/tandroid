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
import org.telegram.ui.dc1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class a00 extends FrameLayout implements me.d, NotificationCenter.NotificationCenterDelegate, ph.a {
    public static final /* synthetic */ int O2 = 0;
    public final xw A0;
    public int A1;
    public final GradientDrawable A2;
    public final mx B0;
    public final nv B1;
    public int B2;
    public final nx C0;
    public final int C1;
    public ArrayList C2;
    public final ix D0;
    public final int[] D1;
    public int D2;
    public final ImageView E;
    public final jx E0;
    public int E1;
    public long E2;
    public AnimatorSet F;
    public yz F0;
    public int F1;
    public final me.b F2;
    public AnimatorSet G;
    public final lx G0;
    public int G1;
    public ArrayList G2;
    public float H;
    public final nh.d H0;
    public int H1;
    public boolean H2;
    public final ey I;
    public boolean I0;
    public int I1;
    public NotificationCenter.ObserversGroup I2;
    public final yx J;
    public boolean J0;
    public TLRPC.ChatFull J1;
    public AnimatorSet J2;
    public final ci.m6 K;
    public boolean K0;
    public boolean K1;
    public org.telegram.messenger.video.l K2;
    public final nh.b L;
    public final ty L0;
    public int L1;
    public final tw L2;
    public final ci.m6 M;
    public AnimatorSet M0;
    public final ai.j6 M1;
    public boolean M2;
    public final nh.b N;
    public final ai.q4 N0;
    public boolean N1;
    public boolean N2;
    public final View O;
    public gy O0;
    public int O1;
    public final my P;
    public boolean P0;
    public boolean P1;
    public final zx Q;
    public final int[] Q0;
    public boolean Q1;
    public final jy R;
    public final ObjectAnimator[] R0;
    public iz R1;
    public final zy S;
    public boolean S0;
    public float S1;
    public yz T;
    public gg.f1 T0;
    public float T1;
    public final nh.d U;
    public boolean U0;
    public float U1;
    public final zw V;
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
    public final org.telegram.ui.ActionBar.e6 Z1;
    public final me.b a;
    public final tl0 a0;
    public final String[] a1;
    public final org.telegram.ui.ActionBar.u5 a2;
    public final me.b b;
    public final tl0 b0;
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
    public final org.telegram.ui.Cells.t6 f2;
    public final bx g0;
    public boolean g1;
    public final tx g2;
    public final ox h;
    public final cx h0;
    public TLRPC.TL_messages_stickerSet h1;
    public boolean h2;
    public final fz i0;
    public ArrayList i1;
    public final boolean i2;
    public final ez j0;
    public ArrayList j1;
    public final ah.h j2;
    public final hz k0;
    public ArrayList k1;
    public final nh k2;
    public final HashMap l0;
    public ArrayList l1;
    public final ah.c l2;
    public final xw m0;
    public final ArrayList m1;
    public final li.e m2;
    public final FrameLayout n;
    public final ez n0;
    public final ArrayList n1;
    public boolean n2;
    public final fx o0;
    public final ArrayList o1;
    public boolean o2;
    public final hy p0;
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
    public az t1;
    public int t2;
    public boolean u0;
    public long u1;
    public long u2;
    public final View v;
    public boolean v0;
    public boolean v1;
    public boolean v2;
    public final ee0 w;
    public boolean w0;
    public boolean w1;
    public boolean w2;
    public final px x;
    public final gx x0;
    public final TLRPC.StickerSetCovered[] x1;
    public final Rect x2;
    public final ImageView y;
    public final qz y0;
    public final LongSparseArray y1;
    public final RectF y2;
    public final vz z0;
    public final LongSparseArray z1;
    public final ArrayList z2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [org.telegram.ui.Components.em0, org.telegram.ui.Components.xw] */
    /* JADX WARN: Type inference failed for: r4v65, types: [org.telegram.ui.Components.em0, org.telegram.ui.Components.xw] */
    public a00(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11, boolean z12, Context context, boolean z13, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z14, final org.telegram.ui.ActionBar.e6 e6Var, boolean z15, boolean z16) {
        super(context);
        org.telegram.ui.ActionBar.u5 u5Var;
        int B;
        yx yxVar;
        Context context2;
        tw twVar;
        boolean z17;
        Field field;
        int i10;
        hs hsVar = hs.h;
        this.a = new me.b(0, this, hsVar, 320L, false);
        this.b = new me.b(1, this, hsVar, 320L, false);
        this.c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = new ArrayList();
        this.c0 = true;
        this.k0 = new hz(this);
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
        int i11 = UserConfig.selectedAccount;
        this.c1 = i11;
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
        this.g2 = new tx(this);
        this.h2 = true;
        li.e eVar = new li.e();
        this.m2 = eVar;
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
        this.F2 = new me.b(0, new uw(this, 3), hsVar, 380L, true);
        this.L2 = new tw(this, 1);
        this.M2 = false;
        this.u0 = z14;
        this.Y1 = n2Var;
        this.c2 = z10;
        this.Z1 = e6Var;
        this.i2 = z16;
        fh.c cVar = new fh.c();
        cVar.a(B(org.telegram.ui.ActionBar.i6.d6));
        if (z15) {
            v(true);
        }
        i0.a.k(B(org.telegram.ui.ActionBar.i6.Wk), 30);
        int dp = AndroidUtilities.dp(50.0f);
        this.b1 = dp;
        this.d0 = z13;
        this.X0 = new Drawable[]{org.telegram.ui.ActionBar.i6.V(context, R.drawable.smiles_tab_smiles, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.i6.Re), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.i6.Oe)), org.telegram.ui.ActionBar.i6.V(context, R.drawable.smiles_tab_gif, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.i6.Re), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.i6.Oe)), org.telegram.ui.ActionBar.i6.V(context, R.drawable.smiles_tab_stickers, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.i6.Re), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.i6.Oe))};
        org.telegram.ui.ActionBar.u5 V = org.telegram.ui.ActionBar.i6.V(context, R.drawable.msg_emoji_recent, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.i6.Me), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.i6.Oe));
        org.telegram.ui.ActionBar.u5 V2 = org.telegram.ui.ActionBar.i6.V(context, R.drawable.emoji_tabs_faves, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.i6.Me), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.i6.Oe));
        org.telegram.ui.ActionBar.u5 V3 = org.telegram.ui.ActionBar.i6.V(context, R.drawable.emoji_tabs_new3, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.i6.Me), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.i6.Oe));
        int i12 = R.drawable.emoji_tabs_new1;
        if (z16) {
            u5Var = V3;
            B = w(0.4f);
        } else {
            u5Var = V3;
            B = B(org.telegram.ui.ActionBar.i6.Me);
        }
        org.telegram.ui.ActionBar.u5 V4 = org.telegram.ui.ActionBar.i6.V(context, i12, B, z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.i6.Oe));
        this.a2 = V4;
        int i13 = R.drawable.emoji_tabs_new2;
        int i14 = org.telegram.ui.ActionBar.i6.Qe;
        org.telegram.ui.ActionBar.u5 V5 = org.telegram.ui.ActionBar.i6.V(context, i13, B(i14), B(i14));
        this.b2 = V5;
        this.Y0 = new Drawable[]{V, V2, u5Var, new LayerDrawable(new Drawable[]{V4, V5})};
        this.Z0 = new Drawable[]{org.telegram.ui.ActionBar.i6.V(context, R.drawable.msg_emoji_recent, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.i6.Me), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.i6.Oe)), org.telegram.ui.ActionBar.i6.V(context, R.drawable.stickers_gifs_trending, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.i6.Me), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.i6.Oe))};
        this.a1 = new String[]{LocaleController.getString(R.string.Emoji1), LocaleController.getString(R.string.Emoji2), LocaleController.getString(R.string.Emoji3), LocaleController.getString(R.string.Emoji4), LocaleController.getString(R.string.Emoji5), LocaleController.getString(R.string.Emoji6), LocaleController.getString(R.string.Emoji7), LocaleController.getString(R.string.Emoji8)};
        this.J1 = chatFull;
        Paint paint = new Paint(1);
        this.s1 = paint;
        paint.setColor(B(org.telegram.ui.ActionBar.i6.af));
        float dp2 = AndroidUtilities.dp(6.0f);
        ai.l2 l2Var = yf.i0.a;
        this.M1 = new ai.j6(dp2);
        yx yxVar2 = new yx(this, context);
        this.J = yxVar2;
        wz wzVar = new wz();
        wzVar.a = 0;
        wzVar.b = yxVar2;
        arrayList.add(wzVar);
        if (z10) {
            MediaDataController.getInstance(i11).checkStickers(5);
            MediaDataController.getInstance(i11).checkFeaturedEmoji();
            this.e2 = new PorterDuffColorFilter(B(org.telegram.ui.ActionBar.i6.Oh), PorterDuff.Mode.SRC_IN);
        }
        my myVar = new my(this, context);
        this.P = myVar;
        eVar.a(myVar);
        s4.j jVar = new s4.j();
        jVar.c = 220L;
        jVar.e = 220L;
        jVar.f = 160L;
        jVar.g = 160L;
        jVar.i = hs.g;
        myVar.setItemAnimator(jVar);
        final int i15 = 0;
        myVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.vw
            public final /* synthetic */ a00 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (i15) {
                    case 0:
                        org.telegram.ui.rt q6 = org.telegram.ui.rt.q();
                        a00 a00Var = this.b;
                        my myVar2 = a00Var.P;
                        a00Var.getMeasuredHeight();
                        return q6.s(motionEvent, myVar2, null, a00Var.g2, e6Var);
                    case 1:
                        org.telegram.ui.rt q10 = org.telegram.ui.rt.q();
                        a00 a00Var2 = this.b;
                        return q10.s(motionEvent, a00Var2.h0, a00Var2.m0, a00Var2.g2, e6Var);
                    default:
                        org.telegram.ui.rt q11 = org.telegram.ui.rt.q();
                        a00 a00Var3 = this.b;
                        ix ixVar = a00Var3.D0;
                        a00Var3.getMeasuredHeight();
                        return q11.s(motionEvent, ixVar, a00Var3.A0, a00Var3.g2, e6Var);
                }
            }
        });
        myVar.setOnItemLongClickListener(new uw(this, 1));
        myVar.setInstantClick(true);
        zx zxVar = new zx(this);
        this.Q = zxVar;
        myVar.setLayoutManager(zxVar);
        myVar.setTopGlowOffset(AndroidUtilities.dp(38.0f));
        myVar.setBottomGlowOffset(AndroidUtilities.dp(36.0f));
        myVar.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f));
        int i16 = org.telegram.ui.ActionBar.i6.He;
        myVar.setGlowColor(B(i16));
        myVar.setItemSelectorColorProvider(new f2(21));
        myVar.setClipToPadding(false);
        zxVar.O = new ay(this);
        jy jyVar = new jy(this);
        this.R = jyVar;
        myVar.setAdapter(jyVar);
        myVar.i(new ci.q1(this, 3));
        this.S = new zy(this, context);
        yxVar2.addView(myVar, w7.x5.d(-1.0f, -1));
        tl0 tl0Var = new tl0(myVar, zxVar);
        this.b0 = tl0Var;
        tl0Var.i = new cy(this);
        myVar.setOnScrollListener(new dy(this));
        if (n2Var != null) {
            yxVar = yxVar2;
            context2 = context;
            twVar = new tw(this, 2);
        } else {
            yxVar = yxVar2;
            context2 = context;
            twVar = null;
        }
        ey eyVar = new ey(this, context2, e6Var, z10, twVar, z16);
        this.I = eyVar;
        if (z13) {
            zw zwVar = new zw(this, context2);
            this.V = zwVar;
            yxVar.addView(zwVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
            zwVar.d.setOnFocusChangeListener(new ax(this));
            nh.d dVar = new nh.d(context2, e6Var);
            this.U = dVar;
            dVar.setVisibility(8);
            final int i17 = 0;
            dVar.setOnBackClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ww
                public final /* synthetic */ a00 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i17) {
                        case 0:
                            zy zyVar = this.b.S;
                            uy uyVar = zyVar.c;
                            int childCount = uyVar.getChildCount();
                            for (int i18 = 0; i18 < childCount; i18++) {
                                ((nh.c) uyVar.getChildAt(i18)).a(false, true);
                            }
                            zyVar.d = 0L;
                            zyVar.F.b.a(false, true);
                            zyVar.l();
                            break;
                        case 1:
                            vz vzVar = this.b.z0;
                            uz uzVar = vzVar.c;
                            int childCount2 = uzVar.getChildCount();
                            for (int i19 = 0; i19 < childCount2; i19++) {
                                ((nh.c) uzVar.getChildAt(i19)).a(false, true);
                            }
                            vzVar.d = 0L;
                            vzVar.Q.a.a(false, true);
                            vzVar.l();
                            break;
                        case 2:
                            az azVar = this.b.t1;
                            if (azVar != null) {
                                azVar.w();
                                break;
                            }
                            break;
                        default:
                            a00 a00Var = this.b;
                            int currentItem = a00Var.h.getCurrentItem();
                            mz mzVar = currentItem == 0 ? a00Var.V : currentItem == 1 ? a00Var.o0 : a00Var.G0;
                            if (mzVar != null) {
                                yq yqVar = mzVar.d;
                                yqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                yqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                yqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
            yxVar.addView(dVar, new FrameLayout.LayoutParams(-1, dp));
        }
        int B2 = B(i16);
        if (Color.alpha(B2) >= 255) {
            eyVar.setBackgroundColor(B2);
        }
        jyVar.G(true);
        eyVar.p(getEmojipacks());
        yxVar.addView(eyVar, w7.x5.d(36.0f, -1));
        View view = new View(context2);
        this.O = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i18 = org.telegram.ui.ActionBar.i6.Ke;
        view.setBackgroundColor(B(i18));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(36.0f);
        yxVar.addView(view, layoutParams);
        nh.b bVar = new nh.b(context2, e6Var);
        this.L = bVar;
        ci.m6 m6Var = new ci.m6(context2, 3, e6Var);
        this.K = m6Var;
        m6Var.setVisibility(8);
        m6Var.addView(bVar, w7.x5.a(48.0f, 10.0f, 5.0f, 10.0f, 10.0f, -1, 80));
        yxVar.addView(m6Var, w7.x5.e(-1, -2, 80));
        if (z11) {
            nn0 nn0Var = nn0.b;
            if (z12) {
                bx bxVar = new bx(this, context2);
                this.g0 = bxVar;
                wz wzVar2 = new wz();
                wzVar2.a = 1;
                wzVar2.b = bxVar;
                this.d.add(wzVar2);
                cx cxVar = new cx(this, context2);
                this.h0 = cxVar;
                eVar.a(cxVar);
                final int i19 = 0;
                cxVar.setClipToPadding(false);
                fz fzVar = new fz(this);
                this.i0 = fzVar;
                cxVar.setLayoutManager(fzVar);
                cxVar.i(new dx(this));
                cxVar.setPadding(0, dp, 0, AndroidUtilities.dp(44.0f) + this.p2);
                ((s4.g1) cxVar.getItemAnimator()).m = false;
                final int i20 = 1;
                ez ezVar = new ez(this, context2, true, ConnectionsManager.DEFAULT_DATACENTER_ID);
                this.n0 = ezVar;
                cxVar.setAdapter(ezVar);
                this.j0 = new ez(this, context2, false, 0);
                cxVar.setOnScrollListener(new ex(this));
                cxVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.vw
                    public final /* synthetic */ a00 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (i20) {
                            case 0:
                                org.telegram.ui.rt q6 = org.telegram.ui.rt.q();
                                a00 a00Var = this.b;
                                my myVar2 = a00Var.P;
                                a00Var.getMeasuredHeight();
                                return q6.s(motionEvent, myVar2, null, a00Var.g2, e6Var);
                            case 1:
                                org.telegram.ui.rt q10 = org.telegram.ui.rt.q();
                                a00 a00Var2 = this.b;
                                return q10.s(motionEvent, a00Var2.h0, a00Var2.m0, a00Var2.g2, e6Var);
                            default:
                                org.telegram.ui.rt q11 = org.telegram.ui.rt.q();
                                a00 a00Var3 = this.b;
                                ix ixVar = a00Var3.D0;
                                a00Var3.getMeasuredHeight();
                                return q11.s(motionEvent, ixVar, a00Var3.A0, a00Var3.g2, e6Var);
                        }
                    }
                });
                ?? r12 = new em0(this) { // from class: org.telegram.ui.Components.xw
                    public final /* synthetic */ a00 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.ui.Components.em0
                    public final void d(int i21, View view2) {
                        switch (i19) {
                            case 0:
                                a00 a00Var = this.b;
                                cx cxVar2 = a00Var.h0;
                                ez ezVar2 = a00Var.j0;
                                ez ezVar3 = a00Var.n0;
                                if (a00Var.t1 != null) {
                                    ezVar3.getClass();
                                    ArrayList arrayList3 = ezVar3.x;
                                    if (cxVar2.getAdapter() != ezVar3) {
                                        if (cxVar2.getAdapter() == ezVar2 && i21 >= 0 && i21 < ezVar2.x.size()) {
                                            a00Var.t1.v(view2, ezVar2.x.get(i21), ezVar2.w, ezVar2.n, true, 0, 0);
                                            a00Var.W();
                                            break;
                                        }
                                    } else if (i21 >= 0) {
                                        int i22 = ezVar3.H;
                                        if (i21 >= i22) {
                                            int i23 = i22 > 0 ? (i21 - i22) - 1 : i21;
                                            if (i23 >= 0 && i23 < arrayList3.size()) {
                                                a00Var.t1.v(view2, arrayList3.get(i23), null, ezVar3.n, true, 0, 0);
                                                break;
                                            }
                                        } else {
                                            a00Var.t1.v(view2, a00Var.i1.get(i21), null, "gif", true, 0, 0);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                a00 a00Var2 = this.b;
                                s4.i0 adapter = a00Var2.D0.getAdapter();
                                vz vzVar = a00Var2.z0;
                                String str = adapter == vzVar ? vzVar.N : null;
                                if (view2 instanceof org.telegram.ui.Cells.f8) {
                                    org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view2;
                                    if (f8Var.getSticker() != null && MessageObject.isPremiumSticker(f8Var.getSticker()) && !AccountInstance.getInstance(a00Var2.c1).getUserConfig().isPremium()) {
                                        org.telegram.ui.rt.q().y(f8Var);
                                        break;
                                    } else {
                                        org.telegram.ui.rt.q().u();
                                        if (!f8Var.r) {
                                            f8Var.r = true;
                                            f8Var.n = 0.5f;
                                            f8Var.x = 0L;
                                            org.telegram.ui.Cells.e8 e8Var = f8Var.a;
                                            e8Var.setAlpha(0.5f * f8Var.H);
                                            e8Var.invalidate();
                                            f8Var.s = System.currentTimeMillis();
                                            f8Var.invalidate();
                                            a00Var2.t1.m(f8Var, f8Var.getSticker(), str, f8Var.getParentObject(), f8Var.getSendAnimationData(), true, 0);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                };
                this.m0 = r12;
                cxVar.setOnItemClickListener((em0) r12);
                bxVar.addView(cxVar, w7.x5.d(-1.0f, -1));
                fx fxVar = new fx(this, context2);
                this.o0 = fxVar;
                bxVar.addView(fxVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
                hy hyVar = new hy(this, context2, e6Var);
                this.p0 = hyVar;
                hyVar.setType(nn0Var);
                hyVar.setUnderlineHeight(AndroidUtilities.getShadowHeight());
                i10 = i14;
                hyVar.setIndicatorColor(B(i10));
                hyVar.setUnderlineColor(B(i18));
                hyVar.setBackgroundColor(B(i16));
                V();
                hyVar.setDelegate(new uw(this, 2));
                ezVar.F("", "", true, true, true);
            } else {
                i10 = i14;
            }
            gx gxVar = new gx(this, context2, z14);
            this.x0 = gxVar;
            MediaDataController.getInstance(this.c1).checkStickers(0);
            MediaDataController.getInstance(this.c1).checkFeaturedStickers();
            ix ixVar = new ix(this, context2);
            this.D0 = ixVar;
            this.m2.a(ixVar);
            jx jxVar = new jx(this);
            this.E0 = jxVar;
            ixVar.setLayoutManager(jxVar);
            jxVar.O = new kx(this);
            ixVar.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f));
            ixVar.setClipToPadding(false);
            wz wzVar3 = new wz();
            wzVar3.a = 2;
            wzVar3.b = gxVar;
            this.d.add(wzVar3);
            this.z0 = new vz(this, context2);
            qz qzVar = new qz(this, context2);
            this.y0 = qzVar;
            ixVar.setAdapter(qzVar);
            final int i21 = 2;
            ixVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.vw
                public final /* synthetic */ a00 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (i21) {
                        case 0:
                            org.telegram.ui.rt q6 = org.telegram.ui.rt.q();
                            a00 a00Var = this.b;
                            my myVar2 = a00Var.P;
                            a00Var.getMeasuredHeight();
                            return q6.s(motionEvent, myVar2, null, a00Var.g2, e6Var);
                        case 1:
                            org.telegram.ui.rt q10 = org.telegram.ui.rt.q();
                            a00 a00Var2 = this.b;
                            return q10.s(motionEvent, a00Var2.h0, a00Var2.m0, a00Var2.g2, e6Var);
                        default:
                            org.telegram.ui.rt q11 = org.telegram.ui.rt.q();
                            a00 a00Var3 = this.b;
                            ix ixVar2 = a00Var3.D0;
                            a00Var3.getMeasuredHeight();
                            return q11.s(motionEvent, ixVar2, a00Var3.A0, a00Var3.g2, e6Var);
                    }
                }
            });
            final int i22 = 1;
            ?? r42 = new em0(this) { // from class: org.telegram.ui.Components.xw
                public final /* synthetic */ a00 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.Components.em0
                public final void d(int i212, View view2) {
                    switch (i22) {
                        case 0:
                            a00 a00Var = this.b;
                            cx cxVar2 = a00Var.h0;
                            ez ezVar2 = a00Var.j0;
                            ez ezVar3 = a00Var.n0;
                            if (a00Var.t1 != null) {
                                ezVar3.getClass();
                                ArrayList arrayList3 = ezVar3.x;
                                if (cxVar2.getAdapter() != ezVar3) {
                                    if (cxVar2.getAdapter() == ezVar2 && i212 >= 0 && i212 < ezVar2.x.size()) {
                                        a00Var.t1.v(view2, ezVar2.x.get(i212), ezVar2.w, ezVar2.n, true, 0, 0);
                                        a00Var.W();
                                        break;
                                    }
                                } else if (i212 >= 0) {
                                    int i222 = ezVar3.H;
                                    if (i212 >= i222) {
                                        int i23 = i222 > 0 ? (i212 - i222) - 1 : i212;
                                        if (i23 >= 0 && i23 < arrayList3.size()) {
                                            a00Var.t1.v(view2, arrayList3.get(i23), null, ezVar3.n, true, 0, 0);
                                            break;
                                        }
                                    } else {
                                        a00Var.t1.v(view2, a00Var.i1.get(i212), null, "gif", true, 0, 0);
                                        break;
                                    }
                                }
                            }
                            break;
                        default:
                            a00 a00Var2 = this.b;
                            s4.i0 adapter = a00Var2.D0.getAdapter();
                            vz vzVar = a00Var2.z0;
                            String str = adapter == vzVar ? vzVar.N : null;
                            if (view2 instanceof org.telegram.ui.Cells.f8) {
                                org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view2;
                                if (f8Var.getSticker() != null && MessageObject.isPremiumSticker(f8Var.getSticker()) && !AccountInstance.getInstance(a00Var2.c1).getUserConfig().isPremium()) {
                                    org.telegram.ui.rt.q().y(f8Var);
                                    break;
                                } else {
                                    org.telegram.ui.rt.q().u();
                                    if (!f8Var.r) {
                                        f8Var.r = true;
                                        f8Var.n = 0.5f;
                                        f8Var.x = 0L;
                                        org.telegram.ui.Cells.e8 e8Var = f8Var.a;
                                        e8Var.setAlpha(0.5f * f8Var.H);
                                        e8Var.invalidate();
                                        f8Var.s = System.currentTimeMillis();
                                        f8Var.invalidate();
                                        a00Var2.t1.m(f8Var, f8Var.getSticker(), str, f8Var.getParentObject(), f8Var.getSendAnimationData(), true, 0);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            };
            this.A0 = r42;
            ixVar.setOnItemClickListener((em0) r42);
            ixVar.setGlowColor(B(i16));
            gxVar.addView(ixVar);
            this.a0 = new tl0(ixVar, jxVar);
            lx lxVar = new lx(this, context2);
            this.G0 = lxVar;
            gxVar.addView(lxVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
            nh.d dVar2 = new nh.d(context2, e6Var);
            this.H0 = dVar2;
            dVar2.setVisibility(8);
            final int i23 = 1;
            dVar2.setOnBackClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ww
                public final /* synthetic */ a00 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i23) {
                        case 0:
                            zy zyVar = this.b.S;
                            uy uyVar = zyVar.c;
                            int childCount = uyVar.getChildCount();
                            for (int i182 = 0; i182 < childCount; i182++) {
                                ((nh.c) uyVar.getChildAt(i182)).a(false, true);
                            }
                            zyVar.d = 0L;
                            zyVar.F.b.a(false, true);
                            zyVar.l();
                            break;
                        case 1:
                            vz vzVar = this.b.z0;
                            uz uzVar = vzVar.c;
                            int childCount2 = uzVar.getChildCount();
                            for (int i192 = 0; i192 < childCount2; i192++) {
                                ((nh.c) uzVar.getChildAt(i192)).a(false, true);
                            }
                            vzVar.d = 0L;
                            vzVar.Q.a.a(false, true);
                            vzVar.l();
                            break;
                        case 2:
                            az azVar = this.b.t1;
                            if (azVar != null) {
                                azVar.w();
                                break;
                            }
                            break;
                        default:
                            a00 a00Var = this.b;
                            int currentItem = a00Var.h.getCurrentItem();
                            mz mzVar = currentItem == 0 ? a00Var.V : currentItem == 1 ? a00Var.o0 : a00Var.G0;
                            if (mzVar != null) {
                                yq yqVar = mzVar.d;
                                yqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                yqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                yqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
            gxVar.addView(dVar2, new FrameLayout.LayoutParams(-1, dp));
            z17 = z14;
            mx mxVar = new mx(this, context2, e6Var, n2Var, z17);
            this.B0 = mxVar;
            mxVar.setDragEnabled(true);
            mxVar.setWillNotDraw(false);
            mxVar.setType(nn0Var);
            mxVar.setUnderlineHeight(ixVar.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
            mxVar.setIndicatorColor(B(i10));
            mxVar.setUnderlineColor(B(i18));
            if (viewGroup == null || !z17) {
                gxVar.addView(mxVar, w7.x5.e(-1, 36, 51));
            } else {
                nx nxVar = new nx(this, context2);
                this.C0 = nxVar;
                nxVar.addView(mxVar, w7.x5.e(-1, 36, 51));
                viewGroup.addView(nxVar, w7.x5.d(-2.0f, -1));
            }
            X(true);
            mxVar.setDelegate(new uw(this, 4));
            ixVar.setOnScrollListener(new zz(this, 0));
            nh.b bVar2 = new nh.b(context2, e6Var);
            this.N = bVar2;
            ci.m6 m6Var2 = new ci.m6(context2, 3, e6Var);
            this.M = m6Var2;
            m6Var2.setVisibility(8);
            m6Var2.addView(bVar2, w7.x5.a(48.0f, 10.0f, 5.0f, 10.0f, 10.0f, -1, 80));
            gxVar.addView(m6Var2, w7.x5.e(-1, -2, 80));
        } else {
            z17 = z14;
        }
        this.e.clear();
        this.e.addAll(this.d);
        ox oxVar = new ox(this, context2);
        this.h = oxVar;
        li.e eVar2 = this.m2;
        eVar2.getClass();
        oxVar.b(new ai.o7(eVar2, 1));
        oxVar.setOverScrollMode(2);
        ty tyVar = new ty(this);
        this.L0 = tyVar;
        oxVar.setAdapter(tyVar);
        px pxVar = new px(this, context2);
        this.x = pxVar;
        pxVar.setHapticFeedbackEnabled(true);
        pxVar.setImageResource(R.drawable.smiles_tab_clear);
        int w10 = z16 ? w(0.6f) : B(org.telegram.ui.ActionBar.i6.Re);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        pxVar.setColorFilter(new PorterDuffColorFilter(w10, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        pxVar.setScaleType(scaleType);
        pxVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        pxVar.setFocusable(true);
        pxVar.setOnClickListener(new qx());
        w7.z5.a(pxVar);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.r = frameLayout;
        if (z13) {
            addView(frameLayout, w7.x5.a(100.0f, 0.0f, 0.0f, 0.0f, (AndroidUtilities.getShadowHeight() / AndroidUtilities.density) + 40.0f, -1, 87));
        } else {
            addView(frameLayout, w7.x5.a(100.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 87));
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.s = frameLayout2;
        addView(frameLayout2, w7.x5.a(100.0f, 0.0f, 0.0f, 0.0f, 64.0f, -1, 87));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.n = frameLayout3;
        View view2 = new View(context2);
        this.v = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(40.0f), 83));
        if (z13) {
            addView(frameLayout3, w7.x5.e(-1, 48, 80));
            frameLayout3.addView(pxVar, w7.x5.a(48.0f, 2.0f, 0.0f, 2.0f, 0.0f, 48, 85));
            if (z11) {
                ImageView imageView = new ImageView(context2);
                this.y = imageView;
                imageView.setImageResource(R.drawable.smiles_tab_settings);
                imageView.setColorFilter(new PorterDuffColorFilter(z16 ? w(0.6f) : B(org.telegram.ui.ActionBar.i6.Re), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(LocaleController.getString(R.string.Settings));
                w7.z5.a(imageView);
                frameLayout3.addView(imageView, w7.x5.a(48.0f, 2.0f, 0.0f, 2.0f, 0.0f, 48, 85));
                final int i24 = 2;
                imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ww
                    public final /* synthetic */ a00 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i24) {
                            case 0:
                                zy zyVar = this.b.S;
                                uy uyVar = zyVar.c;
                                int childCount = uyVar.getChildCount();
                                for (int i182 = 0; i182 < childCount; i182++) {
                                    ((nh.c) uyVar.getChildAt(i182)).a(false, true);
                                }
                                zyVar.d = 0L;
                                zyVar.F.b.a(false, true);
                                zyVar.l();
                                break;
                            case 1:
                                vz vzVar = this.b.z0;
                                uz uzVar = vzVar.c;
                                int childCount2 = uzVar.getChildCount();
                                for (int i192 = 0; i192 < childCount2; i192++) {
                                    ((nh.c) uzVar.getChildAt(i192)).a(false, true);
                                }
                                vzVar.d = 0L;
                                vzVar.Q.a.a(false, true);
                                vzVar.l();
                                break;
                            case 2:
                                az azVar = this.b.t1;
                                if (azVar != null) {
                                    azVar.w();
                                    break;
                                }
                                break;
                            default:
                                a00 a00Var = this.b;
                                int currentItem = a00Var.h.getCurrentItem();
                                mz mzVar = currentItem == 0 ? a00Var.V : currentItem == 1 ? a00Var.o0 : a00Var.G0;
                                if (mzVar != null) {
                                    yq yqVar = mzVar.d;
                                    yqVar.requestFocus();
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                    yqVar.onTouchEvent(obtain);
                                    obtain.recycle();
                                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                    yqVar.onTouchEvent(obtain2);
                                    obtain2.recycle();
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
            ee0 ee0Var = new ee0(context2, e6Var);
            this.w = ee0Var;
            ee0Var.setViewPager(oxVar);
            ee0Var.setShouldExpand(false);
            ee0Var.setIndicatorHeight(AndroidUtilities.dp(3.0f));
            ee0Var.setIndicatorColor(i0.a.k(B(org.telegram.ui.ActionBar.i6.Oe), 20));
            ee0Var.setUnderlineHeight(0);
            ee0Var.setTabPaddingLeftRight(AndroidUtilities.dp(11.0f));
            ee0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
            frameLayout3.addView(ee0Var, w7.x5.e(-2, 48, 81));
            ee0Var.setOnPageChangeListener(new rx(this, z17));
            ImageView imageView2 = new ImageView(context2);
            this.E = imageView2;
            imageView2.setImageResource(R.drawable.smiles_tab_search);
            imageView2.setColorFilter(new PorterDuffColorFilter(z16 ? w(0.6f) : B(org.telegram.ui.ActionBar.i6.Re), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(LocaleController.getString(R.string.Search));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, w7.x5.a(48.0f, 2.0f, 0.0f, 2.0f, 0.0f, 48, 83));
            final int i25 = 3;
            imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ww
                public final /* synthetic */ a00 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view22) {
                    switch (i25) {
                        case 0:
                            zy zyVar = this.b.S;
                            uy uyVar = zyVar.c;
                            int childCount = uyVar.getChildCount();
                            for (int i182 = 0; i182 < childCount; i182++) {
                                ((nh.c) uyVar.getChildAt(i182)).a(false, true);
                            }
                            zyVar.d = 0L;
                            zyVar.F.b.a(false, true);
                            zyVar.l();
                            break;
                        case 1:
                            vz vzVar = this.b.z0;
                            uz uzVar = vzVar.c;
                            int childCount2 = uzVar.getChildCount();
                            for (int i192 = 0; i192 < childCount2; i192++) {
                                ((nh.c) uzVar.getChildAt(i192)).a(false, true);
                            }
                            vzVar.d = 0L;
                            vzVar.Q.a.a(false, true);
                            vzVar.l();
                            break;
                        case 2:
                            az azVar = this.b.t1;
                            if (azVar != null) {
                                azVar.w();
                                break;
                            }
                            break;
                        default:
                            a00 a00Var = this.b;
                            int currentItem = a00Var.h.getCurrentItem();
                            mz mzVar = currentItem == 0 ? a00Var.V : currentItem == 1 ? a00Var.o0 : a00Var.G0;
                            if (mzVar != null) {
                                yq yqVar = mzVar.d;
                                yqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                yqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                yqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            addView(frameLayout3, w7.x5.a(48.0f, 0.0f, 0.0f, 2.0f, 0.0f, 56, (LocaleController.isRTL ? 3 : 5) | 80));
            org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.i6.i0(AndroidUtilities.dp(56.0f), B(i16), B(i16));
            w7.z5.a(pxVar);
            pxVar.setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
            pxVar.setBackground(i02);
            pxVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
            pxVar.setFocusable(true);
            frameLayout3.addView(pxVar, w7.x5.a(48.0f, 2.0f, 0.0f, 2.0f, 0.0f, 48, 51));
            view2.setVisibility(8);
        }
        addView(oxVar, 0, w7.x5.e(-1, -1, 51));
        ai.q4 q4Var = new ai.q4(context2, 22);
        this.N0 = q4Var;
        q4Var.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(6.0f), B(org.telegram.ui.ActionBar.i6.qf)));
        q4Var.setTextColor(B(org.telegram.ui.ActionBar.i6.pf));
        q4Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f));
        q4Var.setGravity(16);
        q4Var.setTextSize(1, 14.0f);
        q4Var.setVisibility(4);
        addView(q4Var, w7.x5.a(-2.0f, 5.0f, 0.0f, 5.0f, 53.0f, -2, 81));
        this.C1 = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 32.0f);
        Field field2 = nv.f;
        nv nvVar = new nv(new mv(context2, e6Var));
        if (nv.f == null) {
            try {
                field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    field.setAccessible(true);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                field = null;
            }
            nv.f = field;
        }
        Field field3 = nv.f;
        if (field3 != null) {
            try {
                nvVar.a = (ViewTreeObserver.OnScrollChangedListener) field3.get(nvVar);
                nv.f.set(nvVar, nv.g);
            } catch (Exception unused3) {
                nvVar.a = null;
            }
        }
        this.B1 = nvVar;
        nvVar.c.setOnSelectionUpdateListener(new d(this, 10));
        this.A1 = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
        Emoji.loadRecentEmoji();
        jyVar.F(false);
        I(true, z11, z12, false);
        if (Build.VERSION.SDK_INT >= 31) {
            ah.h hVar = new ah.h(false);
            this.j2 = hVar;
            fh.d dVar3 = new fh.d(null);
            dVar3.f = cVar;
            dVar3.d = hVar;
            dVar3.e = -2;
            ah.c cVar2 = new ah.c(dVar3);
            this.l2 = cVar2;
            cVar2.i = LiteMode.isEnabled(262144);
            int dp3 = AndroidUtilities.dp(LiteMode.isEnabled(262144) ? 8.0f : 48.0f);
            cVar2.b = dp3;
            cVar2.c = dp3;
            cVar2.h = this.m2;
        } else {
            ah.c cVar3 = new ah.c(cVar);
            this.l2 = cVar3;
            cVar3.h = this.m2;
            this.j2 = null;
        }
        this.k2 = new nh(this, 1);
        setBlurredBackgroundDrawableFactory(this.l2);
        this.m2.b(this);
        this.m2.a = new uw(this, 0);
    }

    public static void a(a00 a00Var, boolean z10) {
        cx cxVar = a00Var.h0;
        if (cxVar == null) {
            return;
        }
        int childCount = cxVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = cxVar.getChildAt(i10);
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

    public static void c(a00 a00Var, iz izVar, String str) {
        String str2;
        az azVar;
        org.telegram.ui.ActionBar.n2 n2Var = a00Var.Y1;
        int i10 = a00Var.c1;
        ArrayList arrayList = a00Var.q1;
        if (izVar == null) {
            return;
        }
        if (izVar.getSpan() == null) {
            a00Var.E2 = SystemClock.elapsedRealtime();
            a00Var.M(true);
            String str3 = str != null ? str : (String) izVar.getTag();
            new SpannableStringBuilder().append((CharSequence) str3);
            if (str != null) {
                az azVar2 = a00Var.t1;
                if (azVar2 != null) {
                    azVar2.l(Emoji.fixEmoji(str));
                    return;
                }
                return;
            }
            if (!izVar.c && (str2 = Emoji.emojiColor.get(str3)) != null) {
                str3 = g(str3, str2);
            }
            a00Var.h(str3);
            az azVar3 = a00Var.t1;
            if (azVar3 != null) {
                azVar3.l(Emoji.fixEmoji(str3));
                return;
            }
            return;
        }
        if (a00Var.t1 != null) {
            long j3 = izVar.getSpan().documentId;
            TLRPC.Document document = izVar.getSpan().document;
            ny nyVar = izVar.e;
            boolean z10 = nyVar != null && nyVar.i;
            if (document == null) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ny nyVar2 = (ny) arrayList.get(i11);
                    int i12 = 0;
                    while (true) {
                        ArrayList arrayList2 = nyVar2.c;
                        if (arrayList2 != null && i12 < arrayList2.size()) {
                            if (((TLRPC.Document) nyVar2.c.get(i12)).id == j3) {
                                document = (TLRPC.Document) nyVar2.c.get(i12);
                                break;
                            }
                            i12++;
                        }
                    }
                }
            }
            if (document == null) {
                document = s5.f(i10, j3);
            }
            TLRPC.Document document2 = document;
            String findAnimatedEmojiEmoticon = document2 != null ? MessageObject.findAnimatedEmojiEmoticon(document2) : null;
            if (MessageObject.isFreeEmoji(document2) || UserConfig.getInstance(i10).isPremium() || (((azVar = a00Var.t1) != null && azVar.g()) || a00Var.U0 || z10)) {
                a00Var.E2 = SystemClock.elapsedRealtime();
                a00Var.M(true);
                a00Var.h("animated_" + j3);
                a00Var.t1.x(j3, document2, findAnimatedEmojiEmoticon, izVar.c);
                return;
            }
            a00Var.M(false);
            ad a02 = n2Var != null ? ad.a0(n2Var) : new ad(a00Var.r, a00Var.Z1);
            if (a00Var.h2 || n2Var == null) {
                a02.q(document2, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new tw(a00Var, 3)).j();
            } else {
                a02.J(R.raw.saved_messages, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint2)), LocaleController.getString(R.string.Open), new tw(a00Var, 4)).j();
            }
            a00Var.h2 = !a00Var.h2;
        }
    }

    public static void e(a00 a00Var, int i10, int i11) {
        s4.d1 K;
        int[] iArr = a00Var.Q0;
        if (i10 == 1) {
            a00Var.o(i11, a00Var.P);
            return;
        }
        az azVar = a00Var.t1;
        if ((azVar == null || !azVar.z()) && !a00Var.J0) {
            qm0 y3 = a00Var.y(i10);
            if (i11 <= 0 || y3 == null || y3.getVisibility() != 0 || (K = y3.K(0)) == null || K.a.getTop() + a00Var.b1 < y3.getPaddingTop()) {
                int i12 = iArr[i10] - i11;
                iArr[i10] = i12;
                if (i12 > 0) {
                    iArr[i10] = 0;
                } else if (i12 < (-AndroidUtilities.dp(288.0f))) {
                    iArr[i10] = -AndroidUtilities.dp(288.0f);
                }
                if (i10 == 0) {
                    a00Var.Y();
                } else {
                    a00Var.z(i10).setTranslationY(Math.max(-AndroidUtilities.dp(48.0f), iArr[i10]));
                }
            }
        }
    }

    public static void f(a00 a00Var, boolean z10) {
        int N0;
        fz fzVar = a00Var.i0;
        fx fxVar = a00Var.o0;
        cx cxVar = a00Var.h0;
        if (cxVar != null && (cxVar.getAdapter() instanceof ez)) {
            ez ezVar = (ez) cxVar.getAdapter();
            if (!ezVar.s && ezVar.h == 0 && !ezVar.x.isEmpty() && (N0 = fzVar.N0()) != -1 && N0 > fzVar.B() - 5) {
                String str = ezVar.w;
                String str2 = ezVar.r;
                boolean z11 = ezVar.v;
                ezVar.F(str, str2, true, z11, z11);
            }
        }
        az azVar = a00Var.t1;
        if (azVar == null || !azVar.z()) {
            if (fxVar == null || cxVar == null) {
                return;
            }
            fxVar.a.a(true, !z10);
            return;
        }
        s4.d1 K = cxVar.K(0);
        if (K == null) {
            mz.a(fxVar, true, !z10);
        } else {
            mz.a(fxVar, K.a.getTop() < cxVar.getPaddingTop(), !z10);
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
        String v = sc.v.v(str, str2);
        if (str3 != null) {
            v = sc.v.v(v, str3);
        }
        return z10 ? sc.v.v(v, "\u200d➡") : v;
    }

    public static void j(int i10, View view) {
        if (view == null) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i10);
    }

    public final int B(int i10) {
        org.telegram.ui.ActionBar.e6 e6Var = this.Z1;
        return e6Var != null ? e6Var.x0(i10) : org.telegram.ui.ActionBar.i6.x0(null, i10, false);
    }

    public final void C() {
        lx lxVar = this.G0;
        if (lxVar != null) {
            lxVar.b();
        }
        fx fxVar = this.o0;
        if (fxVar != null) {
            fxVar.b();
        }
        zw zwVar = this.V;
        if (zwVar != null) {
            zwVar.b();
        }
    }

    public final void D(boolean z10, boolean z11) {
        lz lzVar;
        if (this.A1 != 0 && this.w1) {
            this.A1 = 0;
        }
        if (this.A1 == 0 && this.v1) {
            this.A1 = 1;
        }
        int i10 = this.A1;
        ox oxVar = this.h;
        if (i10 == 0 || z10 || this.e.size() == 1) {
            L(true, false);
            Q(false, false);
            if (oxVar.getCurrentItem() != 0) {
                oxVar.x(0, !z10);
            }
            if (z11) {
                AndroidUtilities.runOnUIThread(new tw(this, 5), 350L);
            }
        } else {
            int i11 = this.A1;
            if (i11 == 1) {
                L(false, false);
                Q(this.u0 || this.v0, false);
                if (oxVar.getCurrentItem() != 2) {
                    oxVar.x(2, false);
                }
                mx mxVar = this.B0;
                if (mxVar != null) {
                    this.S0 = true;
                    int i12 = this.G1;
                    if (i12 >= 0) {
                        mxVar.m(i12);
                    } else {
                        int i13 = this.F1;
                        if (i13 >= 0) {
                            mxVar.m(i13);
                        } else {
                            mxVar.m(this.E1);
                        }
                    }
                    this.S0 = false;
                    this.E0.h1(0, 0);
                }
            } else if (i11 == 2) {
                L(false, false);
                Q(false, false);
                if (oxVar.getCurrentItem() != 1) {
                    oxVar.x(1, false);
                }
                hy hyVar = this.p0;
                if (hyVar != null) {
                    hyVar.m(0);
                }
                fx fxVar = this.o0;
                if (fxVar != null && (lzVar = fxVar.r) != null) {
                    lzVar.G1(null);
                }
            }
        }
        M(true);
    }

    public final void E() {
        qz qzVar = this.y0;
        if (qzVar != null) {
            qzVar.l();
        }
        vz vzVar = this.z0;
        if (vzVar != null) {
            vzVar.l();
        }
        if (org.telegram.ui.rt.q().E) {
            org.telegram.ui.rt.q().n();
        }
        org.telegram.ui.rt.q().u();
    }

    public final void F(int i10) {
        az azVar = this.t1;
        if ((azVar == null || !azVar.z()) && i10 != 0) {
            HorizontalScrollView z10 = z(i10);
            this.Q0[i10] = 0;
            z10.setTranslationY(0);
        }
    }

    public final void G(int i10, int i11) {
        zx zxVar = this.Q;
        View m10 = zxVar.m(i10);
        int L0 = zxVar.L0();
        if ((m10 == null && Math.abs(i10 - L0) > zxVar.J * 9.0f) || !SharedConfig.animationsEnabled()) {
            int i12 = zxVar.L0() < i10 ? 0 : 1;
            tl0 tl0Var = this.b0;
            tl0Var.b = i12;
            tl0Var.c(i10, i11, false, false);
            return;
        }
        this.J0 = true;
        ci.l1 l1Var = new ci.l1(this, this.P.getContext(), 1);
        l1Var.a = i10;
        l1Var.p = i11;
        zxVar.w0(l1Var);
    }

    public final void H(int i10, int i11) {
        jx jxVar = this.E0;
        View m10 = jxVar.m(i10);
        int L0 = jxVar.L0();
        if (m10 != null || Math.abs(i10 - L0) <= 40) {
            this.J0 = true;
            this.D0.x0(i10);
        } else {
            int i12 = jxVar.L0() < i10 ? 0 : 1;
            tl0 tl0Var = this.a0;
            tl0Var.b = i12;
            tl0Var.c(i10, i11, false, false);
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
            if (((wz) arrayList2.get(i10)).a == 0 && z10) {
                arrayList.add((wz) arrayList2.get(i10));
            }
            if (((wz) arrayList2.get(i10)).a == 1 && z12) {
                arrayList.add((wz) arrayList2.get(i10));
            }
            if (((wz) arrayList2.get(i10)).a == 2 && z11) {
                arrayList.add((wz) arrayList2.get(i10));
            }
            i10++;
        }
        ee0 ee0Var = this.w;
        if (ee0Var != null) {
            AndroidUtilities.updateViewVisibilityAnimated(ee0Var, arrayList.size() > 1, 1.0f, z13);
        }
        ox oxVar = this.h;
        if (oxVar != null) {
            oxVar.setAdapter(null);
            oxVar.setAdapter(this.L0);
            if (ee0Var != null) {
                ee0Var.setViewPager(oxVar);
            }
        }
    }

    public final void J(final nh.b bVar, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z10, boolean z11) {
        vz vzVar;
        zy zyVar;
        if (stickerSet == null) {
            return;
        }
        if (!z10 || (zyVar = this.S) == null || zyVar.d == stickerSet.id) {
            if (z10 || (vzVar = this.z0) == null || vzVar.d == stickerSet.id) {
                final boolean isStickerPackInstalled = MediaDataController.getInstance(this.c1).isStickerPackInstalled(stickerSet.id);
                bVar.g(isStickerPackInstalled ? stickerSet.masks ? LocaleController.formatPluralString("RemoveManyMasksCount", stickerSet.count, new Object[0]) : stickerSet.emojis ? LocaleController.formatPluralString("RemoveManyEmojiCount", stickerSet.count, new Object[0]) : LocaleController.formatPluralString("RemoveManyStickersCount", stickerSet.count, new Object[0]) : stickerSet.masks ? LocaleController.formatPluralString("AddManyMasksCount", stickerSet.count, new Object[0]) : stickerSet.emojis ? LocaleController.formatPluralString("AddManyEmojiCount", stickerSet.count, new Object[0]) : LocaleController.formatPluralString("AddManyStickersCount", stickerSet.count, new Object[0]), z11, true);
                bVar.h0.a(!isStickerPackInstalled, z11);
                bVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.yw
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        a00 a00Var = a00.this;
                        MediaDataController mediaDataController = MediaDataController.getInstance(a00Var.c1);
                        Context context = a00Var.getContext();
                        int i10 = isStickerPackInstalled ? 0 : 2;
                        org.telegram.ui.ActionBar.n2 n2Var = a00Var.Y1;
                        FrameLayout frameLayout = a00Var.s;
                        nh.b bVar2 = bVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z12 = z10;
                        mediaDataController.toggleStickerSet(context, tLObject2, document2, i10, n2Var, frameLayout, false, true, new i2.c1(a00Var, bVar2, tLObject2, stickerSet2, document2, z12, 10), false);
                        a00Var.J(bVar2, tLObject2, stickerSet2, document2, z12, true);
                    }
                });
            }
        }
    }

    public final void K(long j3, boolean z10, boolean z11) {
        ee0 ee0Var = this.w;
        if (ee0Var == null) {
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
        LinearLayout linearLayout = ee0Var.d;
        View childAt = i10 >= linearLayout.getChildCount() ? null : linearLayout.getChildAt(i10);
        if (childAt != null) {
            childAt.setAlpha(this.u1 != 0 ? 0.15f : 1.0f);
            ox oxVar = this.h;
            if (z11) {
                if (this.u1 == 0 || oxVar.getCurrentItem() == 0) {
                    return;
                }
                L(true, true);
                Q(false, true);
                oxVar.x(0, false);
                return;
            }
            if (this.u1 == 0 || oxVar.getCurrentItem() == 1) {
                return;
            }
            L(false, true);
            Q(false, true);
            oxVar.x(1, false);
        }
    }

    public final void L(boolean z10, boolean z11) {
        px pxVar = this.x;
        if (z10 && pxVar.getTag() == null) {
            return;
        }
        if ((z10 || pxVar.getTag() == null) && !this.n2) {
            AnimatorSet animatorSet = this.F;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.F = null;
            }
            pxVar.setTag(z10 ? null : 1);
            if (!z11) {
                pxVar.setAlpha(z10 ? 1.0f : 0.0f);
                pxVar.setScaleX(z10 ? 1.0f : 0.0f);
                pxVar.setScaleY(z10 ? 1.0f : 0.0f);
                pxVar.setVisibility(z10 ? 0 : 4);
                return;
            }
            if (z10) {
                pxVar.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.F = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(pxVar, (Property<px, Float>) View.ALPHA, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(pxVar, (Property<px, Float>) View.SCALE_X, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(pxVar, (Property<px, Float>) View.SCALE_Y, z10 ? 1.0f : 0.0f));
            this.F.setDuration(200L);
            this.F.setInterpolator(hs.g);
            this.F.addListener(new vx(this, z10, r2));
            this.F.start();
        }
    }

    public final void M(boolean z10) {
        this.H = 0.0f;
        az azVar = this.t1;
        if (azVar != null && azVar.z()) {
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
            this.W.setInterpolator(hs.g);
            this.W.addListener(new t8(this, 19));
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
        ai.q4 q4Var = this.N0;
        if (z10) {
            if (ChatObject.hasAdminRights(chat) || (tL_chatBannedRights = chat.default_banned_rights) == null || !(tL_chatBannedRights.send_stickers || (z11 && tL_chatBannedRights.send_plain))) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.banned_rights;
                if (tL_chatBannedRights2 == null) {
                    return;
                }
                if (!AndroidUtilities.isBannedForever(tL_chatBannedRights2)) {
                    if (z11) {
                        q4Var.setText(LocaleController.formatString("AttachPlainRestricted", R.string.AttachPlainRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    }
                    if (z12) {
                        q4Var.setText(LocaleController.formatString("AttachGifRestricted", R.string.AttachGifRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    } else {
                        q4Var.setText(LocaleController.formatString("AttachStickersRestricted", R.string.AttachStickersRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    }
                } else if (z11) {
                    q4Var.setText(LocaleController.getString(R.string.AttachPlainRestrictedForever));
                } else if (z12) {
                    q4Var.setText(LocaleController.getString(R.string.AttachGifRestrictedForever));
                } else {
                    q4Var.setText(LocaleController.getString(R.string.AttachStickersRestrictedForever));
                }
            } else {
                org.telegram.ui.ActionBar.n2 n2Var = this.Y1;
                if ((n2Var instanceof org.telegram.ui.zn) && ((org.telegram.ui.zn) n2Var).N6()) {
                    return;
                }
                if (z11) {
                    q4Var.setText(LocaleController.getString(R.string.GlobalAttachEmojiRestricted));
                } else if (z12) {
                    q4Var.setText(LocaleController.getString(R.string.GlobalAttachGifRestricted));
                } else {
                    q4Var.setText(LocaleController.getString(R.string.GlobalAttachStickersRestricted));
                }
            }
            q4Var.setVisibility(0);
        }
        AnimatorSet animatorSet = this.J2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.J2 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.J2 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(q4Var, (Property<ai.q4, Float>) View.ALPHA, z10 ? q4Var.getAlpha() : 1.0f, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(q4Var, (Property<ai.q4, Float>) View.TRANSLATION_Y, z10 ? AndroidUtilities.dp(12.0f) : q4Var.getTranslationY(), z10 ? 0.0f : AndroidUtilities.dp(12.0f)));
        org.telegram.messenger.video.l lVar = this.K2;
        if (lVar != null) {
            AndroidUtilities.cancelRunOnUIThread(lVar);
        }
        if (z10) {
            org.telegram.messenger.video.l lVar2 = new org.telegram.messenger.video.l(this, z11, z12, 3);
            this.K2 = lVar2;
            AndroidUtilities.runOnUIThread(lVar2, 3500L);
        }
        this.J2.setDuration(320L);
        this.J2.setInterpolator(hs.h);
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
            this.G.setInterpolator(hs.g);
            this.G.addListener(new vx(this, z10, i10));
            this.G.start();
        }
    }

    public final void R() {
        org.telegram.ui.ActionBar.n2 n2Var;
        if (((View) getParent()) != null) {
            float y3 = (getY() + (getLayoutParams().height > 0 ? getLayoutParams().height : getMeasuredHeight())) - (((AndroidUtilities.isInMultiwindow || ((n2Var = this.Y1) != null && n2Var.isInBubbleMode())) && !this.V0) ? AndroidUtilities.dp(1.0f) : r0.getHeight());
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
        mz mzVar;
        boolean z10;
        ow owVar;
        boolean z11 = this.u0;
        View view = this.v;
        if (!z11) {
            setBackground(null);
            view.setBackground(null);
        } else if (AndroidUtilities.isInMultiwindow || this.N1) {
            Drawable background = getBackground();
            if (background != null) {
                background.setColorFilter(new PorterDuffColorFilter(B(org.telegram.ui.ActionBar.i6.He), PorterDuff.Mode.MULTIPLY));
            }
        } else {
            int i10 = org.telegram.ui.ActionBar.i6.He;
            setBackgroundColor(B(i10));
            if (this.d0) {
                view.setBackgroundColor(B(i10));
            }
        }
        ey eyVar = this.I;
        if (eyVar != null) {
            if (this.u0) {
                eyVar.setBackgroundColor(B(org.telegram.ui.ActionBar.i6.He));
                this.O.setBackgroundColor(B(org.telegram.ui.ActionBar.i6.Ke));
            } else {
                eyVar.setBackground(null);
            }
        }
        nv nvVar = this.B1;
        if (nvVar != null) {
            nvVar.c.a();
        }
        int i11 = 0;
        while (true) {
            mzVar = this.V;
            z10 = this.i2;
            if (i11 >= 3) {
                break;
            }
            if (i11 == 0) {
                mzVar = this.G0;
            } else if (i11 != 1) {
                mzVar = this.o0;
            }
            if (mzVar != null) {
                yq yqVar = mzVar.d;
                FrameLayout frameLayout = mzVar.n;
                View view2 = mzVar.f;
                if (this.u0) {
                    view2.setBackgroundColor(B(org.telegram.ui.ActionBar.i6.He));
                } else {
                    view2.setBackground(null);
                }
                mzVar.e.setBackgroundColor(B(org.telegram.ui.ActionBar.i6.Ke));
                mzVar.c.a(z10 ? w(0.4f) : B(org.telegram.ui.ActionBar.i6.Je));
                org.telegram.ui.ActionBar.i6.x1(z10 ? w(0.06f) : B(org.telegram.ui.ActionBar.i6.Ie), frameLayout.getBackground());
                frameLayout.invalidate();
                yqVar.setHintTextColor(z10 ? w(0.45f) : B(org.telegram.ui.ActionBar.i6.Je));
                yqVar.setTextColor(z10 ? w(0.8f) : B(org.telegram.ui.ActionBar.i6.G6));
            }
            i11++;
        }
        Paint paint = this.s1;
        if (paint != null) {
            paint.setColor(B(org.telegram.ui.ActionBar.i6.af));
        }
        my myVar = this.P;
        if (myVar != null) {
            myVar.setGlowColor(B(org.telegram.ui.ActionBar.i6.He));
        }
        ix ixVar = this.D0;
        if (ixVar != null) {
            ixVar.setGlowColor(B(org.telegram.ui.ActionBar.i6.He));
        }
        mx mxVar = this.B0;
        if (mxVar != null) {
            mxVar.setIndicatorColor(B(org.telegram.ui.ActionBar.i6.Qe));
            mxVar.setUnderlineColor(B(org.telegram.ui.ActionBar.i6.Ke));
            if (this.u0) {
                mxVar.setBackgroundColor(B(org.telegram.ui.ActionBar.i6.He));
            } else {
                mxVar.setBackground(null);
            }
        }
        hy hyVar = this.p0;
        if (hyVar != null) {
            hyVar.setIndicatorColor(B(org.telegram.ui.ActionBar.i6.Qe));
            hyVar.setUnderlineColor(B(org.telegram.ui.ActionBar.i6.Ke));
            if (this.u0) {
                hyVar.setBackgroundColor(B(org.telegram.ui.ActionBar.i6.He));
            } else {
                hyVar.setBackground(null);
            }
        }
        px pxVar = this.x;
        if (pxVar != null) {
            pxVar.setColorFilter(new PorterDuffColorFilter(z10 ? w(0.6f) : B(org.telegram.ui.ActionBar.i6.Re), PorterDuff.Mode.MULTIPLY));
            if (mzVar == null) {
                Drawable background2 = pxVar.getBackground();
                int i12 = org.telegram.ui.ActionBar.i6.He;
                org.telegram.ui.ActionBar.i6.C1(background2, B(i12), false);
                org.telegram.ui.ActionBar.i6.C1(pxVar.getBackground(), B(i12), true);
            }
        }
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(z10 ? w(0.6f) : B(org.telegram.ui.ActionBar.i6.Re), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.E;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(z10 ? w(0.6f) : B(org.telegram.ui.ActionBar.i6.Re), PorterDuff.Mode.MULTIPLY));
        }
        ai.q4 q4Var = this.N0;
        if (q4Var != null) {
            ((ShapeDrawable) q4Var.getBackground()).getPaint().setColor(B(org.telegram.ui.ActionBar.i6.qf));
            q4Var.setTextColor(B(org.telegram.ui.ActionBar.i6.pf));
        }
        ez ezVar = this.j0;
        if (ezVar != null) {
            gz gzVar = ezVar.e;
            ImageView imageView3 = gzVar.a;
            int i13 = org.telegram.ui.ActionBar.i6.Le;
            imageView3.setColorFilter(new PorterDuffColorFilter(B(i13), PorterDuff.Mode.MULTIPLY));
            gzVar.b.setTextColor(B(i13));
            gzVar.c.setProgressColor(B(org.telegram.ui.ActionBar.i6.h6));
        }
        this.e2 = new PorterDuffColorFilter(B(org.telegram.ui.ActionBar.i6.Oh), PorterDuff.Mode.SRC_IN);
        int i14 = 0;
        while (true) {
            Drawable[] drawableArr = this.X0;
            if (i14 >= drawableArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.i6.z1(drawableArr[i14], z10 ? w(0.4f) : B(org.telegram.ui.ActionBar.i6.Ne), false);
            org.telegram.ui.ActionBar.i6.z1(drawableArr[i14], z10 ? w(0.8f) : B(org.telegram.ui.ActionBar.i6.Oe), true);
            i14++;
        }
        if (eyVar != null && (owVar = eyVar.y) != null) {
            owVar.d();
        }
        int i15 = 0;
        while (true) {
            Drawable[] drawableArr2 = this.Y0;
            if (i15 >= drawableArr2.length) {
                break;
            }
            org.telegram.ui.ActionBar.i6.z1(drawableArr2[i15], z10 ? w(0.4f) : B(org.telegram.ui.ActionBar.i6.Me), false);
            org.telegram.ui.ActionBar.i6.z1(drawableArr2[i15], z10 ? w(0.8f) : B(org.telegram.ui.ActionBar.i6.Oe), true);
            i15++;
        }
        int i16 = 0;
        while (true) {
            Drawable[] drawableArr3 = this.Z0;
            if (i16 >= drawableArr3.length) {
                break;
            }
            org.telegram.ui.ActionBar.i6.z1(drawableArr3[i16], z10 ? w(0.4f) : B(org.telegram.ui.ActionBar.i6.Me), false);
            org.telegram.ui.ActionBar.i6.z1(drawableArr3[i16], z10 ? w(0.8f) : B(org.telegram.ui.ActionBar.i6.Oe), true);
            i16++;
        }
        org.telegram.ui.ActionBar.u5 u5Var = this.a2;
        if (u5Var != null) {
            org.telegram.ui.ActionBar.i6.z1(u5Var, z10 ? w(0.4f) : B(org.telegram.ui.ActionBar.i6.Ne), false);
            org.telegram.ui.ActionBar.i6.z1(u5Var, z10 ? w(0.8f) : B(org.telegram.ui.ActionBar.i6.Oe), true);
        }
        org.telegram.ui.ActionBar.u5 u5Var2 = this.b2;
        if (u5Var2 != null) {
            org.telegram.ui.ActionBar.i6.z1(u5Var2, z10 ? w(0.4f) : B(org.telegram.ui.ActionBar.i6.Qe), false);
            org.telegram.ui.ActionBar.i6.z1(u5Var2, z10 ? w(0.8f) : B(org.telegram.ui.ActionBar.i6.Qe), true);
        }
    }

    public final void T() {
        my myVar = this.P;
        if (myVar == null) {
            return;
        }
        for (int i10 = 0; i10 < myVar.getChildCount(); i10++) {
            View childAt = myVar.getChildAt(i10);
            if (childAt instanceof ry) {
                ((ry) childAt).a(true);
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
            jy jyVar = this.R;
            int i12 = jyVar.c;
            ArrayList arrayList = jyVar.x;
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
                    ArrayList<ny> emojipacks = getEmojipacks();
                    int size2 = arrayList.size() - 1;
                    while (true) {
                        if (size2 < 0) {
                            break;
                        }
                        if (((Integer) arrayList.get(size2)).intValue() <= i10) {
                            ny nyVar = (ny) this.q1.get(size2);
                            while (i13 < emojipacks.size()) {
                                long j3 = emojipacks.get(i13).b.id;
                                long j10 = nyVar.b.id;
                                if (j3 == j10 && (!nyVar.g || (!nyVar.f && !this.p1.contains(Long.valueOf(j10))))) {
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
        lz lzVar;
        int i11;
        boolean z10;
        hy hyVar = this.p0;
        int currentPosition = hyVar.getCurrentPosition();
        int i12 = this.r0;
        boolean z11 = currentPosition == i12;
        boolean z12 = i12 >= 0;
        boolean isEmpty = this.i1.isEmpty();
        hyVar.d(false);
        this.r0 = -2;
        this.s0 = -2;
        this.t0 = -2;
        Drawable[] drawableArr = this.Z0;
        if (isEmpty) {
            i10 = 0;
        } else {
            this.r0 = 0;
            hyVar.b(0, drawableArr[0]).setContentDescription(LocaleController.getString(R.string.RecentStickers));
            i10 = 1;
        }
        this.s0 = i10;
        hyVar.b(1, drawableArr[1]).setContentDescription(LocaleController.getString(R.string.FeaturedGifs));
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
                String h = hg.c.h(i14 + 3, "tab");
                int i15 = hyVar.x;
                hyVar.x = i15 + 1;
                fy0 fy0Var = (fy0) hyVar.n.get(h);
                if (fy0Var != null) {
                    hyVar.g(h, fy0Var, i15);
                    i11 = currentPosition;
                    z10 = z12;
                } else {
                    i11 = currentPosition;
                    z10 = z12;
                    fy0Var = new fy0(hyVar.getContext(), 2);
                    fy0Var.setFocusable(true);
                    fy0Var.setOnClickListener(new hn0(hyVar, 2));
                    fy0Var.setExpanded(hyVar.f0);
                    fy0Var.a(hyVar.i0);
                    hyVar.e.addView(fy0Var, i15);
                }
                fy0Var.d = false;
                fy0Var.setTag(R.id.index_tag, Integer.valueOf(i15));
                fy0Var.setTag(R.id.parent_tag, emojiDrawable);
                fy0Var.setTag(R.id.object_tag, emojiAnimatedSticker);
                fy0Var.setSelected(i15 == hyVar.y);
                hyVar.h.put(h, fy0Var);
                fy0Var.setContentDescription(str);
            } else {
                i11 = currentPosition;
                z10 = z12;
            }
            i14++;
            currentPosition = i11;
            z12 = z10;
        }
        int i16 = currentPosition;
        boolean z13 = z12;
        hyVar.h();
        hyVar.q();
        if (z11 && isEmpty) {
            hyVar.m(this.s0);
            fx fxVar = this.o0;
            if (fxVar == null || (lzVar = fxVar.r) == null) {
                return;
            }
            lzVar.G1(null);
            return;
        }
        WeakHashMap weakHashMap = r0.i0.a;
        if (hyVar.isLaidOut()) {
            if (!isEmpty && !z13) {
                hyVar.k(i16 + 1, 0);
            } else if (isEmpty && z13) {
                hyVar.k(i16 - 1, 0);
            }
        }
    }

    public final void W() {
        ez ezVar;
        int size = this.i1.size();
        long calcDocumentsHash = MediaDataController.calcDocumentsHash(this.i1, ConnectionsManager.DEFAULT_DATACENTER_ID);
        ArrayList<TLRPC.Document> recentGifs = MediaDataController.getInstance(this.c1).getRecentGifs();
        this.i1 = recentGifs;
        long calcDocumentsHash2 = MediaDataController.calcDocumentsHash(recentGifs, ConnectionsManager.DEFAULT_DATACENTER_ID);
        if ((this.p0 != null && size == 0 && !this.i1.isEmpty()) || (size != 0 && this.i1.isEmpty())) {
            V();
        }
        if ((size == this.i1.size() && calcDocumentsHash == calcDocumentsHash2) || (ezVar = this.n0) == null) {
            return;
        }
        ezVar.l();
    }

    public final void X(boolean z10) {
        TLRPC.Document document;
        boolean z11;
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet;
        mx mxVar = this.B0;
        if (mxVar != null) {
            dc1 dc1Var = mxVar.e;
            if (mxVar.s != null) {
                return;
            }
            this.F1 = -2;
            this.G1 = -2;
            this.H1 = -2;
            this.I1 = -2;
            this.e0 = false;
            this.E1 = 0;
            int currentPosition = mxVar.getCurrentPosition();
            boolean z12 = true;
            mxVar.d((getParent() == null || getVisibility() != 0 || (this.y1.size() == 0 && this.z1.size() == 0)) ? false : true);
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
            yz yzVar = this.F0;
            if (yzVar != null) {
                yzVar.l();
            }
            boolean isEmpty = featuredStickerSets.isEmpty();
            long j3 = 0;
            Drawable[] drawableArr = this.Y0;
            if (!isEmpty && (arrayList3.isEmpty() || emojiSettings.getLong("featured_hidden", 0L) == featuredStickerSets.get(0).set.id)) {
                int i12 = mediaDataController.getUnreadStickerSets().isEmpty() ? 2 : 3;
                fy0 c10 = mxVar.c(i12, drawableArr[i12]);
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
                fy0 c11 = mxVar.c(1, drawableArr[1]);
                c11.h.setText(LocaleController.getString(R.string.FavoriteStickersShort));
                c11.setContentDescription(LocaleController.getString(R.string.FavoriteStickers));
            }
            if (!this.j1.isEmpty()) {
                int i15 = this.E1;
                this.F1 = i15;
                this.E1 = i15 + 1;
                fy0 c12 = mxVar.c(0, drawableArr[0]);
                c12.h.setText(LocaleController.getString(R.string.RecentStickersShort));
                c12.setContentDescription(LocaleController.getString(R.string.RecentStickers));
            }
            ArrayList arrayList4 = this.d1;
            arrayList4.clear();
            org.telegram.ui.ActionBar.e6 e6Var = null;
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
                        this.e0 = z12;
                        String str = "chat" + chat2.id;
                        int i19 = mxVar.x;
                        mxVar.x = i19 + 1;
                        fy0 fy0Var = (fy0) mxVar.n.get(str);
                        if (fy0Var != null) {
                            mxVar.g(str, fy0Var, i19);
                        } else {
                            fy0Var = new fy0(mxVar.getContext(), 0);
                            fy0Var.setFocusable(z12);
                            fy0Var.setOnClickListener(new hn0(mxVar, 0));
                            dc1Var.addView(fy0Var, i19);
                            fy0Var.w = z12;
                            j9 j9Var = new j9(e6Var);
                            j9Var.u(AndroidUtilities.dp(14.0f));
                            j9Var.k(UserConfig.selectedAccount, chat2);
                            int i20 = mxVar.a;
                            y9 y9Var = fy0Var.e;
                            y9Var.setLayerNum(i20);
                            y9Var.e(chat2, j9Var);
                            y9Var.setAspectFit(z12);
                            fy0Var.setExpanded(mxVar.f0);
                            fy0Var.a(mxVar.i0);
                            fy0Var.h.setText(chat2.title);
                        }
                        fy0Var.d = z12;
                        fy0Var.setTag(R.id.index_tag, Integer.valueOf(i19));
                        fy0Var.setSelected(i19 == mxVar.y ? z12 : false);
                        mxVar.h.put(str, fy0Var);
                    }
                    z11 = z12;
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
                    int i22 = mxVar.x;
                    mxVar.x = i22 + 1;
                    fy0 fy0Var2 = (fy0) mxVar.n.get(str2);
                    if (fy0Var2 != null) {
                        mxVar.g(str2, fy0Var2, i22);
                        z11 = z12;
                    } else {
                        fy0Var2 = new fy0(mxVar.getContext(), 0);
                        fy0Var2.setFocusable(z12);
                        z11 = z12;
                        fy0Var2.setOnClickListener(new hn0(mxVar, 1));
                        fy0Var2.setExpanded(mxVar.f0);
                        fy0Var2.a(mxVar.i0);
                        dc1Var.addView(fy0Var2, i22);
                    }
                    fy0Var2.e.setLayerNum(mxVar.a);
                    fy0Var2.d = false;
                    fy0Var2.setTag(closestPhotoSizeWithSize);
                    fy0Var2.setTag(R.id.index_tag, Integer.valueOf(i22));
                    fy0Var2.setTag(R.id.parent_tag, tL_messages_stickerSet5);
                    fy0Var2.setTag(R.id.object_tag, document);
                    fy0Var2.setSelected(i22 == mxVar.y ? z11 : false);
                    mxVar.h.put(str2, fy0Var2);
                    fy0Var2.setContentDescription(tL_messages_stickerSet5.set.title + ", " + LocaleController.getString(R.string.AccDescrStickerSet));
                }
                i18++;
                z12 = z11;
                e6Var = null;
            }
            mxVar.h();
            mxVar.q();
            if (currentPosition != 0) {
                mxVar.k(currentPosition, currentPosition);
            }
            p();
        }
    }

    public final void Y() {
        nx nxVar = this.C0;
        mx mxVar = this.B0;
        if (mxVar != null && nxVar == null && this.t1 != null) {
            mxVar.setTranslationY(this.t1.p() * (-AndroidUtilities.dp(50.0f)));
        }
        if (nxVar == null) {
            return;
        }
        boolean z10 = getVisibility() == 0 && this.K0 && this.t1.p() != 1.0f;
        nxVar.setVisibility(z10 ? 0 : 8);
        if (z10) {
            Rect rect = this.x2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.x0, rect, null);
            float p5 = this.t1.p() * AndroidUtilities.dp(50.0f);
            int i10 = rect.left;
            if (i10 != 0 || p5 != 0.0f) {
                this.X1 = false;
            }
            nxVar.setTranslationX(i10);
            float translationY = (((getTranslationY() + getTop()) - nxVar.getTop()) - mxVar.getExpandedOffset()) - p5;
            if (nxVar.getTranslationY() != translationY) {
                nxVar.setTranslationY(translationY);
                nxVar.invalidate();
            }
        }
        if (this.X1 && z10 && this.P0) {
            mxVar.i(this.W1, true);
        } else {
            this.X1 = false;
            mxVar.i(this.W1, false);
        }
    }

    public final void Z() {
        boolean z10;
        org.telegram.ui.Cells.s3 s3Var;
        LongSparseArray longSparseArray = this.z1;
        LongSparseArray longSparseArray2 = this.y1;
        int i10 = this.c1;
        ix ixVar = this.D0;
        if (ixVar == null) {
            return;
        }
        try {
            int childCount = ixVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = ixVar.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.s3) && ((am0) ixVar.T(childAt)) != null) {
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
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override // ph.a
    public final void b(int i10) {
        setBottomInset(i10);
    }

    @Override // ph.a
    public final void d(float f7) {
        this.q2 = f7;
        R();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Utilities.Callback callback;
        TLRPC.StickerSet stickerSet;
        int i12 = NotificationCenter.stickersDidLoad;
        jy jyVar = this.R;
        tw twVar = this.L2;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.y0 != null) {
                    X(((Boolean) objArr[1]).booleanValue());
                    Z();
                    E();
                    p();
                    return;
                }
                return;
            }
            if (((Integer) objArr[0]).intValue() == 5) {
                if (!((Boolean) objArr[1]).booleanValue()) {
                    jyVar.F(false);
                    return;
                } else {
                    AndroidUtilities.cancelRunOnUIThread(twVar);
                    AndroidUtilities.runOnUIThread(twVar, 100L);
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
                jyVar.F(true);
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
            ee0 ee0Var = this.w;
            if (ee0Var != null) {
                int childCount = ee0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    ee0Var.getChildAt(i13).invalidate();
                }
            }
            X(false);
            return;
        }
        if (i10 == NotificationCenter.featuredEmojiDidLoad) {
            if (jyVar != null) {
                jyVar.F(false);
                return;
            }
            return;
        }
        int i14 = NotificationCenter.groupStickersDidLoad;
        zy zyVar = this.S;
        if (i10 == i14) {
            Long l4 = (Long) objArr[0];
            long longValue2 = l4.longValue();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = objArr.length > 1 ? (TLRPC.TL_messages_stickerSet) objArr[1] : null;
            if (tL_messages_stickerSet != null) {
                vz vzVar = this.z0;
                if (vzVar != null && vzVar.d == longValue2 && vzVar.f.size() < tL_messages_stickerSet.documents.size()) {
                    vzVar.f = tL_messages_stickerSet.documents;
                    vzVar.l();
                }
                if (zyVar != null && zyVar.d == longValue2 && zyVar.f.size() < tL_messages_stickerSet.documents.size()) {
                    zyVar.f = tL_messages_stickerSet.documents;
                    zyVar.l();
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
            AndroidUtilities.cancelRunOnUIThread(twVar);
            AndroidUtilities.runOnUIThread(twVar, 100L);
            return;
        }
        int i15 = NotificationCenter.emojiLoaded;
        my myVar = this.P;
        if (i10 != i15) {
            if (i10 != NotificationCenter.newEmojiSuggestionsAvailable) {
                if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                    if (jyVar != null) {
                        jyVar.F(false);
                    }
                    T();
                    X(false);
                    return;
                }
                return;
            }
            if (myVar == null || !this.d0) {
                return;
            }
            if ((this.V.c.k == 2 || myVar.getAdapter() == zyVar) && !TextUtils.isEmpty(zyVar.v)) {
                zyVar.F(zyVar.v, true);
                return;
            }
            return;
        }
        ix ixVar = this.D0;
        if (ixVar != null) {
            int childCount2 = ixVar.getChildCount();
            for (int i16 = 0; i16 < childCount2; i16++) {
                View childAt = ixVar.getChildAt(i16);
                if ((childAt instanceof org.telegram.ui.Cells.o8) || (childAt instanceof org.telegram.ui.Cells.f8)) {
                    childAt.invalidate();
                }
            }
        }
        if (myVar != null) {
            myVar.invalidate();
            int childCount3 = myVar.getChildCount();
            for (int i17 = 0; i17 < childCount3; i17++) {
                View childAt2 = myVar.getChildAt(i17);
                if (childAt2 instanceof iz) {
                    childAt2.invalidate();
                }
            }
        }
        nv nvVar = this.B1;
        if (nvVar != null) {
            nvVar.c.invalidate();
        }
        hy hyVar = this.p0;
        if (hyVar != null) {
            dc1 dc1Var = hyVar.e;
            int childCount4 = dc1Var.getChildCount();
            for (int i18 = 0; i18 < childCount4; i18++) {
                dc1Var.getChildAt(i18).invalidate();
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
            canvas.drawColor(i0.a.k(-1, 25));
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.p2);
        if (navigationBarThirdButtonsFactor > 0.0f) {
            int m12 = org.telegram.ui.ActionBar.i6.m1(navigationBarThirdButtonsFactor, B(org.telegram.ui.ActionBar.i6.He));
            int i10 = this.B2;
            GradientDrawable gradientDrawable = this.A2;
            if (i10 != m12) {
                gradientDrawable.setColors(new int[]{m12, org.telegram.ui.ActionBar.i6.m1(0.66f, m12), i0.a.k(m12, 0)});
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

    public ArrayList<ny> getEmojipacks() {
        ArrayList<ny> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.q1;
            if (i10 >= arrayList2.size()) {
                return arrayList;
            }
            ny nyVar = (ny) arrayList2.get(i10);
            boolean z10 = nyVar.g;
            ArrayList arrayList3 = this.p1;
            if ((!z10 && (nyVar.f || arrayList3.contains(Long.valueOf(nyVar.b.id)))) || (nyVar.g && !nyVar.f && !arrayList3.contains(Long.valueOf(nyVar.b.id)))) {
                arrayList.add(nyVar);
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
        mx mxVar = this.B0;
        if (mxVar == null) {
            return 0.0f;
        }
        return mxVar.getExpandedOffset();
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
        wx wxVar = new wx(getContext(), i11);
        wxVar.a = !z10 ? 1 : 0;
        x(i10).w0(wxVar);
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
        qz qzVar = this.y0;
        if (qzVar != null) {
            qzVar.l();
        }
        p();
    }

    public final void l(boolean z10) {
        az azVar = this.t1;
        me.b bVar = this.b;
        my myVar = this.P;
        zw zwVar = this.V;
        if (azVar != null && azVar.z()) {
            s4.d1 K = myVar.K(0);
            if (K == null) {
                mz.a(zwVar, true, !z10);
            } else {
                mz.a(zwVar, K.a.getTop() < myVar.getPaddingTop(), !z10);
            }
            N(false, !z10);
            zwVar.setTranslationY(bVar.e * AndroidUtilities.dp(15.0f));
            return;
        }
        if (zwVar == null || myVar == null) {
            return;
        }
        zwVar.setTranslationY((bVar.e * AndroidUtilities.dp(15.0f)) + (myVar.K(0) != null ? r0.a.getTop() : -this.b1));
        zwVar.a.a(false, !z10);
        m(Math.round(this.I.getTranslationY()));
    }

    public final void m(int i10) {
        ObjectAnimator objectAnimator = this.R0[1];
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            boolean z10 = false;
            s4.d1 K = this.P.K(0);
            int dp = AndroidUtilities.dp(38.0f) + i10;
            if (dp > 0 && (K == null || K.a.getBottom() < dp)) {
                z10 = true;
            }
            N(z10, !this.K1);
        }
    }

    @Override // me.d
    public final void n(int i10, float f7, float f10, me.e eVar) {
        if (i10 == 0) {
            r(false);
            float f11 = 1.0f - this.a.e;
            lx lxVar = this.G0;
            lxVar.setAlpha(f11);
            lxVar.setVisibility(f11 > 0.0f ? 0 : 4);
            float f12 = 1.0f - f11;
            nh.d dVar = this.H0;
            dVar.setAlpha(f12);
            dVar.setTranslationY((-AndroidUtilities.dp(15.0f)) * f11);
            dVar.setVisibility(f12 > 0.0f ? 0 : 4);
            ci.m6 m6Var = this.M;
            m6Var.setAlpha(f12);
            m6Var.setTranslationY(AndroidUtilities.dp(30.0f) * f11);
            m6Var.setVisibility(f12 > 0.0f ? 0 : 4);
            R();
            this.x0.invalidate();
            return;
        }
        if (i10 == 1) {
            l(false);
            float f13 = 1.0f - this.b.e;
            zw zwVar = this.V;
            zwVar.setAlpha(f13);
            zwVar.setVisibility(f13 > 0.0f ? 0 : 4);
            float f14 = 1.0f - f13;
            nh.d dVar2 = this.U;
            dVar2.setAlpha(f14);
            dVar2.setTranslationY((-AndroidUtilities.dp(15.0f)) * f13);
            dVar2.setVisibility(f14 > 0.0f ? 0 : 4);
            ci.m6 m6Var2 = this.K;
            m6Var2.setAlpha(f14);
            m6Var2.setTranslationY(AndroidUtilities.dp(30.0f) * f13);
            m6Var2.setVisibility(f14 > 0.0f ? 0 : 4);
            R();
            this.J.invalidate();
        }
    }

    public final void o(int i10, View view) {
        my myVar;
        s4.d1 K;
        ey eyVar = this.I;
        int[] iArr = this.Q0;
        if (view == null) {
            iArr[1] = 0;
            eyVar.setTranslationY(0);
            return;
        }
        if (view.getVisibility() != 0 || this.f0) {
            return;
        }
        az azVar = this.t1;
        if (azVar == null || !azVar.z()) {
            if (i10 > 0 && (myVar = this.P) != null && myVar.getVisibility() == 0 && (K = myVar.K(0)) != null) {
                if (K.a.getTop() + (this.d0 ? this.b1 : 0) >= myVar.getPaddingTop()) {
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
            eyVar.setTranslationY(Math.max(-AndroidUtilities.dp(36.0f), iArr[1]));
        }
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
            AndroidUtilities.runOnUIThread(new tw(this, 0));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nv nvVar = this.B1;
        if (nvVar != null && nvVar.isShowing()) {
            nvVar.dismiss();
        }
        org.telegram.ui.rt q6 = org.telegram.ui.rt.q();
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
                int i12 = org.telegram.ui.ActionBar.i6.He;
                background.setColorFilter(new PorterDuffColorFilter(B(i12), PorterDuff.Mode.MULTIPLY));
                if (z11 && this.u0) {
                    view.setBackgroundColor(B(i12));
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
                int i13 = org.telegram.ui.ActionBar.i6.He;
                setBackgroundColor(B(i13));
                if (z11) {
                    view.setBackgroundColor(B(i13));
                }
            }
            this.L1 = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
        this.K1 = false;
        setTranslationY(getTranslationY());
    }

    public final void p() {
        int L0;
        mx mxVar = this.B0;
        if (mxVar == null || (L0 = this.E0.L0()) == -1) {
            return;
        }
        int i10 = this.G1;
        if (i10 <= 0 && (i10 = this.F1) <= 0) {
            i10 = this.E1;
        }
        mxVar.k(this.y0.F(L0), i10);
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
            s4.i0 adapter = this.h0.getAdapter();
            ez ezVar = this.n0;
            if (adapter != ezVar || ezVar.I < 0 || this.s0 < 0 || this.r0 < 0 || (L0 = this.i0.L0()) == -1) {
                return;
            }
            this.p0.k(L0 >= ezVar.I ? this.s0 : this.r0, 0);
        }
    }

    public final void r(boolean z10) {
        az azVar = this.t1;
        me.b bVar = this.a;
        ix ixVar = this.D0;
        lx lxVar = this.G0;
        if (azVar != null && azVar.z()) {
            s4.d1 K = ixVar.K(0);
            if (K == null) {
                mz.a(lxVar, true, !z10);
            } else {
                mz.a(lxVar, K.a.getTop() < ixVar.getPaddingTop(), !z10);
            }
            lxVar.setTranslationY(bVar.e * AndroidUtilities.dp(15.0f));
            return;
        }
        if (lxVar == null || ixVar == null) {
            return;
        }
        lxVar.setTranslationY((bVar.e * AndroidUtilities.dp(15.0f)) + (ixVar.K(0) != null ? r0.a.getTop() : -this.b1));
        lxVar.a.a(false, !z10);
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

    public void setBlurredBackgroundDrawableFactory(ah.c cVar) {
        org.telegram.ui.ActionBar.e6 e6Var = this.Z1;
        px pxVar = this.x;
        if (pxVar != null) {
            ch.d c10 = cVar.c(pxVar, null, false);
            c10.o(eh.b.d(e6Var));
            c10.q(AndroidUtilities.dp(18.0f));
            c10.p(AndroidUtilities.dp(6.0f));
            pxVar.setBackground(c10);
        }
        ImageView imageView = this.E;
        if (imageView != null) {
            ch.d c11 = cVar.c(imageView, null, false);
            c11.o(eh.b.d(e6Var));
            c11.q(AndroidUtilities.dp(18.0f));
            c11.p(AndroidUtilities.dp(6.0f));
            imageView.setBackground(c11);
        }
        ee0 ee0Var = this.w;
        if (ee0Var != null) {
            ch.d c12 = cVar.c(ee0Var, null, false);
            c12.o(eh.b.d(e6Var));
            c12.q(AndroidUtilities.dp(18.0f));
            c12.p(AndroidUtilities.dp(6.0f));
            ee0Var.setBackground(c12);
        }
        ImageView imageView2 = this.y;
        if (imageView2 != null) {
            ch.d c13 = cVar.c(imageView2, null, false);
            c13.o(eh.b.d(e6Var));
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

    public void setDelegate(az azVar) {
        this.t1 = azVar;
    }

    public void setDragListener(gy gyVar) {
        this.O0 = gyVar;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        lx lxVar = this.G0;
        if (lxVar != null) {
            lxVar.d.setEnabled(z10);
        }
        fx fxVar = this.o0;
        if (fxVar != null) {
            fxVar.d.setEnabled(z10);
        }
        zw zwVar = this.V;
        if (zwVar != null) {
            zwVar.d.setEnabled(z10);
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
            gg.f1 f1Var = this.T0;
            if (f1Var != null) {
                f1Var.a();
            }
        }
    }

    public final void t(long j3, boolean z10) {
        mz mzVar;
        s4.d0 d0Var;
        View view;
        qm0 qm0Var;
        int i10;
        int i11;
        TLRPC.TL_messages_stickerSet stickerSetById;
        qz qzVar;
        int E;
        AnimatorSet animatorSet = this.M0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.M0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        int i12 = 2;
        if (currentItem == 2 && j3 != -1 && (stickerSetById = MediaDataController.getInstance(this.c1).getStickerSetById(j3)) != null && (E = (qzVar = this.y0).E(stickerSetById)) >= 0 && E < qzVar.h()) {
            H(E, AndroidUtilities.dp(48.0f));
        }
        int i13 = 0;
        ez ezVar = this.j0;
        if (ezVar != null) {
            ezVar.K = false;
        }
        int i14 = 0;
        while (i14 < 3) {
            qm0 qm0Var2 = this.D0;
            qm0 qm0Var3 = this.h0;
            fx fxVar = this.o0;
            qm0 qm0Var4 = this.P;
            if (i14 == 0) {
                mzVar = this.V;
                d0Var = this.Q;
                view = this.I;
                qm0Var = qm0Var4;
            } else if (i14 == 1) {
                d0Var = this.i0;
                view = this.p0;
                qm0Var = qm0Var3;
                mzVar = fxVar;
            } else {
                mzVar = this.G0;
                d0Var = this.E0;
                view = this.B0;
                qm0Var = qm0Var2;
            }
            if (mzVar == null) {
                i11 = i13;
                i10 = i12;
            } else {
                int i15 = i13;
                lz lzVar = mzVar.r;
                int i16 = i12;
                mzVar.d.setText("");
                if (lzVar != null) {
                    lzVar.G1(null);
                    lzVar.E1();
                }
                int i17 = this.b1;
                if (i14 == currentItem && z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.M0 = animatorSet2;
                    Property property = View.TRANSLATION_Y;
                    if (view == null || i14 == 1) {
                        float[] fArr = new float[1];
                        fArr[i15] = AndroidUtilities.dp(36.0f) - i17;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(qm0Var, (Property<qm0, Float>) property, fArr);
                        Animator[] animatorArr = new Animator[1];
                        animatorArr[i15] = ofFloat;
                        animatorSet2.playTogether(animatorArr);
                    } else {
                        float[] fArr2 = new float[1];
                        fArr2[i15] = 0.0f;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr2);
                        float[] fArr3 = new float[1];
                        fArr3[i15] = AndroidUtilities.dp(36.0f);
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(qm0Var, (Property<qm0, Float>) property, fArr3);
                        float[] fArr4 = new float[1];
                        fArr4[i15] = AndroidUtilities.dp(36.0f);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(mzVar, (Property<mz, Float>) property, fArr4);
                        Animator[] animatorArr2 = new Animator[3];
                        animatorArr2[i15] = ofFloat2;
                        animatorArr2[1] = ofFloat3;
                        animatorArr2[i16] = ofFloat4;
                        animatorSet2.playTogether(animatorArr2);
                    }
                    this.M0.setDuration(200L);
                    this.M0.setInterpolator(hs.h);
                    this.M0.addListener(new ai.z4(this, d0Var, qm0Var, 5));
                    this.M0.start();
                    i11 = i15;
                    i10 = i16;
                } else {
                    if (mzVar != fxVar) {
                        mzVar.setTranslationY(AndroidUtilities.dp(36.0f) - i17);
                    }
                    i10 = i16;
                    if (view != null && i14 != i10) {
                        view.setTranslationY(0.0f);
                    }
                    if (qm0Var == qm0Var2) {
                        i11 = i15;
                        qm0Var.setPadding(i11, AndroidUtilities.dp(36.0f), i11, AndroidUtilities.dp(44.0f) + this.p2);
                    } else {
                        i11 = i15;
                        if (qm0Var == qm0Var3) {
                            qm0Var.setPadding(i11, AndroidUtilities.dp(40.0f), i11, AndroidUtilities.dp(44.0f) + this.p2);
                        } else {
                            if (qm0Var == qm0Var4) {
                                qm0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + this.p2);
                            }
                            i11 = 0;
                        }
                    }
                    d0Var.h1(i11, i11);
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
        qz qzVar;
        boolean z11 = this.N2;
        this.N2 = z10;
        if (!z11 || z10) {
            return;
        }
        int i10 = this.A1;
        if (i10 == 0) {
            jy jyVar = this.R;
            if (jyVar != null) {
                jyVar.F(false);
                return;
            }
            return;
        }
        if (i10 == 1) {
            ez ezVar = this.n0;
            if (ezVar != null) {
                ezVar.l();
                return;
            }
            return;
        }
        if (i10 != 2 || (qzVar = this.y0) == null) {
            return;
        }
        qzVar.l();
    }

    public final int w(float f7) {
        return i0.a.k(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Wk, this.Z1), (int) (f7 * 255.0f));
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
        throw new IllegalArgumentException(hg.c.h(i10, "Unexpected argument: "));
    }

    public final qm0 y(int i10) {
        if (i10 == 0) {
            return this.D0;
        }
        if (i10 == 1) {
            return this.P;
        }
        if (i10 == 2) {
            return this.h0;
        }
        throw new IllegalArgumentException(hg.c.h(i10, "Unexpected argument: "));
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
        throw new IllegalArgumentException(hg.c.h(i10, "Unexpected argument: "));
    }

    @Override // me.d
    public final void A(float f7, int i10) {
    }
}
