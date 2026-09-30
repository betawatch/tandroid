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
import org.telegram.ui.ub1;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public class mz extends FrameLayout implements le.e, NotificationCenter.NotificationCenterDelegate, ph.a {
    public static final /* synthetic */ int O2 = 0;
    public final kw A0;
    public int A1;
    public final GradientDrawable A2;
    public final zw B0;
    public final zu B1;
    public int B2;
    public final ax C0;
    public final int C1;
    public ArrayList C2;
    public final vw D0;
    public final int[] D1;
    public int D2;
    public final ImageView E;
    public final ww E0;
    public int E1;
    public long E2;
    public AnimatorSet F;
    public kz F0;
    public int F1;
    public final le.c F2;
    public AnimatorSet G;
    public final yw G0;
    public int G1;
    public ArrayList G2;
    public float H;
    public final nh.d H0;
    public int H1;
    public boolean H2;
    public final qx I;
    public boolean I0;
    public int I1;
    public NotificationCenter.ObserversGroup I2;
    public final lx J;
    public boolean J0;
    public TLRPC.ChatFull J1;
    public AnimatorSet J2;
    public final ci.m6 K;
    public boolean K0;
    public boolean K1;
    public org.telegram.messenger.video.k K2;
    public final nh.b L;
    public final gy L0;
    public int L1;
    public final gw L2;
    public final ci.m6 M;
    public AnimatorSet M0;
    public final ai.i6 M1;
    public boolean M2;
    public final nh.b N;
    public final ai.p4 N0;
    public boolean N1;
    public boolean N2;
    public final View O;
    public sx O0;
    public int O1;
    public final yx P;
    public boolean P0;
    public boolean P1;
    public final mx Q;
    public final int[] Q0;
    public boolean Q1;
    public final vx R;
    public final ObjectAnimator[] R0;
    public vy R1;
    public final my S;
    public boolean S0;
    public float S1;
    public kz T;
    public gg.g1 T0;
    public float T1;
    public final nh.d U;
    public boolean U0;
    public float U1;
    public final mw V;
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
    public final org.telegram.ui.ActionBar.d6 Z1;
    public final le.c a;
    public final bl0 a0;
    public final String[] a1;
    public final org.telegram.ui.ActionBar.s5 a2;
    public final le.c b;
    public final bl0 b0;
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
    public final ow g0;
    public boolean g1;
    public final gx g2;
    public final bx h;
    public final pw h0;
    public TLRPC.TL_messages_stickerSet h1;
    public boolean h2;
    public final sy i0;
    public ArrayList i1;
    public final boolean i2;
    public final ry j0;
    public ArrayList j1;
    public final ah.h j2;
    public final uy k0;
    public ArrayList k1;
    public final lh k2;
    public final HashMap l0;
    public ArrayList l1;
    public final ah.c l2;
    public final kw m0;
    public final ArrayList m1;
    public final li.e m2;
    public final FrameLayout n;
    public final ry n0;
    public final ArrayList n1;
    public boolean n2;
    public final sw o0;
    public final ArrayList o1;
    public boolean o2;
    public final tx p0;
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
    public ny t1;
    public int t2;
    public boolean u0;
    public long u1;
    public long u2;
    public final View v;
    public boolean v0;
    public boolean v1;
    public boolean v2;
    public final qd0 w;
    public boolean w0;
    public boolean w1;
    public boolean w2;
    public final cx x;
    public final tw x0;
    public final TLRPC.StickerSetCovered[] x1;
    public final Rect x2;
    public final ImageView y;
    public final dz y0;
    public final LongSparseArray y1;
    public final RectF y2;
    public final hz z0;
    public final LongSparseArray z1;
    public final ArrayList z2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [org.telegram.ui.Components.kw, org.telegram.ui.Components.ml0] */
    /* JADX WARN: Type inference failed for: r4v65, types: [org.telegram.ui.Components.kw, org.telegram.ui.Components.ml0] */
    public mz(org.telegram.ui.ActionBar.m2 m2Var, boolean z10, boolean z11, boolean z12, Context context, boolean z13, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z14, final org.telegram.ui.ActionBar.d6 d6Var, boolean z15, boolean z16) {
        super(context);
        org.telegram.ui.ActionBar.s5 s5Var;
        int z17;
        lx lxVar;
        Context context2;
        gw gwVar;
        boolean z18;
        Field field;
        int i10;
        sr srVar = sr.h;
        this.a = new le.c(0, this, srVar, 320L, false);
        this.b = new le.c(1, this, srVar, 320L, false);
        this.c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = new ArrayList();
        this.c0 = true;
        this.k0 = new uy(this);
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
        this.f2 = new org.telegram.ui.Cells.t6(this, 12);
        this.g2 = new gx(this);
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
        this.F2 = new le.c(0, new hw(this, 3), srVar, 380L, true);
        this.L2 = new gw(this, 1);
        this.M2 = false;
        this.u0 = z14;
        this.Y1 = m2Var;
        this.c2 = z10;
        this.Z1 = d6Var;
        this.i2 = z16;
        fh.c cVar = new fh.c();
        cVar.a(z(org.telegram.ui.ActionBar.h6.d6));
        if (z15) {
            u(true);
        }
        i0.a.k(z(org.telegram.ui.ActionBar.h6.Wk), 30);
        int dp = AndroidUtilities.dp(50.0f);
        this.b1 = dp;
        this.d0 = z13;
        this.X0 = new Drawable[]{org.telegram.ui.ActionBar.h6.U(context, R.drawable.smiles_tab_smiles, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.h6.Re), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.h6.Oe)), org.telegram.ui.ActionBar.h6.U(context, R.drawable.smiles_tab_gif, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.h6.Re), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.h6.Oe)), org.telegram.ui.ActionBar.h6.U(context, R.drawable.smiles_tab_stickers, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.h6.Re), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.h6.Oe))};
        org.telegram.ui.ActionBar.s5 U = org.telegram.ui.ActionBar.h6.U(context, R.drawable.msg_emoji_recent, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.h6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.h6.Oe));
        org.telegram.ui.ActionBar.s5 U2 = org.telegram.ui.ActionBar.h6.U(context, R.drawable.emoji_tabs_faves, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.h6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.h6.Oe));
        org.telegram.ui.ActionBar.s5 U3 = org.telegram.ui.ActionBar.h6.U(context, R.drawable.emoji_tabs_new3, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.h6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.h6.Oe));
        int i12 = R.drawable.emoji_tabs_new1;
        if (z16) {
            s5Var = U3;
            z17 = v(0.4f);
        } else {
            s5Var = U3;
            z17 = z(org.telegram.ui.ActionBar.h6.Me);
        }
        org.telegram.ui.ActionBar.s5 U4 = org.telegram.ui.ActionBar.h6.U(context, i12, z17, z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.h6.Oe));
        this.a2 = U4;
        int i13 = R.drawable.emoji_tabs_new2;
        int i14 = org.telegram.ui.ActionBar.h6.Qe;
        org.telegram.ui.ActionBar.s5 U5 = org.telegram.ui.ActionBar.h6.U(context, i13, z(i14), z(i14));
        this.b2 = U5;
        this.Y0 = new Drawable[]{U, U2, s5Var, new LayerDrawable(new Drawable[]{U4, U5})};
        this.Z0 = new Drawable[]{org.telegram.ui.ActionBar.h6.U(context, R.drawable.msg_emoji_recent, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.h6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.h6.Oe)), org.telegram.ui.ActionBar.h6.U(context, R.drawable.stickers_gifs_trending, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.h6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.h6.Oe))};
        this.a1 = new String[]{LocaleController.getString(R.string.Emoji1), LocaleController.getString(R.string.Emoji2), LocaleController.getString(R.string.Emoji3), LocaleController.getString(R.string.Emoji4), LocaleController.getString(R.string.Emoji5), LocaleController.getString(R.string.Emoji6), LocaleController.getString(R.string.Emoji7), LocaleController.getString(R.string.Emoji8)};
        this.J1 = chatFull;
        Paint paint = new Paint(1);
        this.s1 = paint;
        paint.setColor(z(org.telegram.ui.ActionBar.h6.af));
        float dp2 = AndroidUtilities.dp(6.0f);
        ai.k2 k2Var = yf.i0.a;
        this.M1 = new ai.i6(dp2);
        lx lxVar2 = new lx(this, context);
        this.J = lxVar2;
        iz izVar = new iz();
        izVar.a = 0;
        izVar.b = lxVar2;
        arrayList.add(izVar);
        if (z10) {
            MediaDataController.getInstance(i11).checkStickers(5);
            MediaDataController.getInstance(i11).checkFeaturedEmoji();
            this.e2 = new PorterDuffColorFilter(z(org.telegram.ui.ActionBar.h6.Oh), PorterDuff.Mode.SRC_IN);
        }
        yx yxVar = new yx(this, context);
        this.P = yxVar;
        eVar.a(yxVar);
        s4.j jVar = new s4.j();
        jVar.c = 220L;
        jVar.e = 220L;
        jVar.f = 160L;
        jVar.g = 160L;
        jVar.i = sr.g;
        yxVar.setItemAnimator(jVar);
        final int i15 = 0;
        yxVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.iw
            public final /* synthetic */ mz b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (i15) {
                    case 0:
                        org.telegram.ui.nt q6 = org.telegram.ui.nt.q();
                        mz mzVar = this.b;
                        yx yxVar2 = mzVar.P;
                        mzVar.getMeasuredHeight();
                        return q6.s(motionEvent, yxVar2, null, mzVar.g2, d6Var);
                    case 1:
                        org.telegram.ui.nt q10 = org.telegram.ui.nt.q();
                        mz mzVar2 = this.b;
                        return q10.s(motionEvent, mzVar2.h0, mzVar2.m0, mzVar2.g2, d6Var);
                    default:
                        org.telegram.ui.nt q11 = org.telegram.ui.nt.q();
                        mz mzVar3 = this.b;
                        vw vwVar = mzVar3.D0;
                        mzVar3.getMeasuredHeight();
                        return q11.s(motionEvent, vwVar, mzVar3.A0, mzVar3.g2, d6Var);
                }
            }
        });
        yxVar.setOnItemLongClickListener(new hw(this, 1));
        yxVar.setInstantClick(true);
        mx mxVar = new mx(this);
        this.Q = mxVar;
        yxVar.setLayoutManager(mxVar);
        yxVar.setTopGlowOffset(AndroidUtilities.dp(38.0f));
        yxVar.setBottomGlowOffset(AndroidUtilities.dp(36.0f));
        yxVar.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f));
        int i16 = org.telegram.ui.ActionBar.h6.He;
        yxVar.setGlowColor(z(i16));
        yxVar.setItemSelectorColorProvider(new x1(29));
        yxVar.setClipToPadding(false);
        mxVar.O = new nx(this);
        vx vxVar = new vx(this);
        this.R = vxVar;
        yxVar.setAdapter(vxVar);
        yxVar.i(new ci.r1(this, 3));
        this.S = new my(this, context);
        lxVar2.addView(yxVar, w7.y5.c(-1.0f, -1));
        bl0 bl0Var = new bl0(yxVar, mxVar);
        this.b0 = bl0Var;
        bl0Var.i = new ox(this);
        yxVar.setOnScrollListener(new px(this));
        if (m2Var != null) {
            lxVar = lxVar2;
            context2 = context;
            gwVar = new gw(this, 2);
        } else {
            lxVar = lxVar2;
            context2 = context;
            gwVar = null;
        }
        qx qxVar = new qx(this, context2, d6Var, z10, gwVar, z16);
        this.I = qxVar;
        if (z13) {
            mw mwVar = new mw(this, context2);
            this.V = mwVar;
            lxVar.addView(mwVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
            mwVar.d.setOnFocusChangeListener(new nw(this));
            nh.d dVar = new nh.d(context2, d6Var);
            this.U = dVar;
            dVar.setVisibility(8);
            final int i17 = 0;
            dVar.setOnBackClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jw
                public final /* synthetic */ mz b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i17) {
                        case 0:
                            my myVar = this.b.S;
                            hy hyVar = myVar.c;
                            int childCount = hyVar.getChildCount();
                            for (int i18 = 0; i18 < childCount; i18++) {
                                ((nh.c) hyVar.getChildAt(i18)).a(false, true);
                            }
                            myVar.d = 0L;
                            myVar.F.b.a(false, true);
                            myVar.l();
                            break;
                        case 1:
                            hz hzVar = this.b.z0;
                            gz gzVar = hzVar.c;
                            int childCount2 = gzVar.getChildCount();
                            for (int i19 = 0; i19 < childCount2; i19++) {
                                ((nh.c) gzVar.getChildAt(i19)).a(false, true);
                            }
                            hzVar.d = 0L;
                            hzVar.Q.a.a(false, true);
                            hzVar.l();
                            break;
                        case 2:
                            ny nyVar = this.b.t1;
                            if (nyVar != null) {
                                nyVar.w();
                                break;
                            }
                            break;
                        default:
                            mz mzVar = this.b;
                            int currentItem = mzVar.h.getCurrentItem();
                            zy zyVar = currentItem == 0 ? mzVar.V : currentItem == 1 ? mzVar.o0 : mzVar.G0;
                            if (zyVar != null) {
                                kq kqVar = zyVar.d;
                                kqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                kqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                kqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
            lxVar.addView(dVar, new FrameLayout.LayoutParams(-1, dp));
        }
        int z19 = z(i16);
        if (Color.alpha(z19) >= 255) {
            qxVar.setBackgroundColor(z19);
        }
        vxVar.G(true);
        qxVar.p(getEmojipacks());
        lxVar.addView(qxVar, w7.y5.c(36.0f, -1));
        View view = new View(context2);
        this.O = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i18 = org.telegram.ui.ActionBar.h6.Ke;
        view.setBackgroundColor(z(i18));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(36.0f);
        lxVar.addView(view, layoutParams);
        nh.b bVar = new nh.b(context2, d6Var);
        this.L = bVar;
        ci.m6 m6Var = new ci.m6(context2, 3, d6Var);
        this.K = m6Var;
        m6Var.setVisibility(8);
        m6Var.addView(bVar, w7.y5.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
        lxVar.addView(m6Var, w7.y5.e(-1, -2, 80));
        if (z11) {
            vm0 vm0Var = vm0.b;
            if (z12) {
                ow owVar = new ow(this, context2);
                this.g0 = owVar;
                iz izVar2 = new iz();
                izVar2.a = 1;
                izVar2.b = owVar;
                this.d.add(izVar2);
                pw pwVar = new pw(this, context2);
                this.h0 = pwVar;
                eVar.a(pwVar);
                final int i19 = 0;
                pwVar.setClipToPadding(false);
                sy syVar = new sy(this);
                this.i0 = syVar;
                pwVar.setLayoutManager(syVar);
                pwVar.i(new qw(this));
                pwVar.setPadding(0, dp, 0, AndroidUtilities.dp(44.0f) + this.p2);
                ((s4.f1) pwVar.getItemAnimator()).m = false;
                final int i20 = 1;
                ry ryVar = new ry(this, context2, true, ConnectionsManager.DEFAULT_DATACENTER_ID);
                this.n0 = ryVar;
                pwVar.setAdapter(ryVar);
                this.j0 = new ry(this, context2, false, 0);
                pwVar.setOnScrollListener(new rw(this));
                pwVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.iw
                    public final /* synthetic */ mz b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (i20) {
                            case 0:
                                org.telegram.ui.nt q6 = org.telegram.ui.nt.q();
                                mz mzVar = this.b;
                                yx yxVar2 = mzVar.P;
                                mzVar.getMeasuredHeight();
                                return q6.s(motionEvent, yxVar2, null, mzVar.g2, d6Var);
                            case 1:
                                org.telegram.ui.nt q10 = org.telegram.ui.nt.q();
                                mz mzVar2 = this.b;
                                return q10.s(motionEvent, mzVar2.h0, mzVar2.m0, mzVar2.g2, d6Var);
                            default:
                                org.telegram.ui.nt q11 = org.telegram.ui.nt.q();
                                mz mzVar3 = this.b;
                                vw vwVar = mzVar3.D0;
                                mzVar3.getMeasuredHeight();
                                return q11.s(motionEvent, vwVar, mzVar3.A0, mzVar3.g2, d6Var);
                        }
                    }
                });
                ?? r12 = new ml0(this) { // from class: org.telegram.ui.Components.kw
                    public final /* synthetic */ mz b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.ui.Components.ml0
                    public final void d(int i21, View view2) {
                        switch (i19) {
                            case 0:
                                mz mzVar = this.b;
                                pw pwVar2 = mzVar.h0;
                                ry ryVar2 = mzVar.j0;
                                ry ryVar3 = mzVar.n0;
                                if (mzVar.t1 != null) {
                                    ryVar3.getClass();
                                    ArrayList arrayList3 = ryVar3.x;
                                    if (pwVar2.getAdapter() != ryVar3) {
                                        if (pwVar2.getAdapter() == ryVar2 && i21 >= 0 && i21 < ryVar2.x.size()) {
                                            mzVar.t1.v(view2, ryVar2.x.get(i21), ryVar2.w, ryVar2.n, true, 0, 0);
                                            mzVar.W();
                                            break;
                                        }
                                    } else if (i21 >= 0) {
                                        int i22 = ryVar3.H;
                                        if (i21 >= i22) {
                                            int i23 = i22 > 0 ? (i21 - i22) - 1 : i21;
                                            if (i23 >= 0 && i23 < arrayList3.size()) {
                                                mzVar.t1.v(view2, arrayList3.get(i23), null, ryVar3.n, true, 0, 0);
                                                break;
                                            }
                                        } else {
                                            mzVar.t1.v(view2, mzVar.i1.get(i21), null, "gif", true, 0, 0);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                mz mzVar2 = this.b;
                                s4.h0 adapter = mzVar2.D0.getAdapter();
                                hz hzVar = mzVar2.z0;
                                String str = adapter == hzVar ? hzVar.N : null;
                                if (view2 instanceof org.telegram.ui.Cells.f8) {
                                    org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view2;
                                    if (f8Var.getSticker() != null && MessageObject.isPremiumSticker(f8Var.getSticker()) && !AccountInstance.getInstance(mzVar2.c1).getUserConfig().isPremium()) {
                                        org.telegram.ui.nt.q().y(f8Var);
                                        break;
                                    } else {
                                        org.telegram.ui.nt.q().u();
                                        if (!f8Var.r) {
                                            f8Var.r = true;
                                            f8Var.n = 0.5f;
                                            f8Var.x = 0L;
                                            org.telegram.ui.Cells.e8 e8Var = f8Var.a;
                                            e8Var.setAlpha(0.5f * f8Var.H);
                                            e8Var.invalidate();
                                            f8Var.s = System.currentTimeMillis();
                                            f8Var.invalidate();
                                            mzVar2.t1.m(f8Var, f8Var.getSticker(), str, f8Var.getParentObject(), f8Var.getSendAnimationData(), true, 0);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                };
                this.m0 = r12;
                pwVar.setOnItemClickListener((ml0) r12);
                owVar.addView(pwVar, w7.y5.c(-1.0f, -1));
                sw swVar = new sw(this, context2);
                this.o0 = swVar;
                owVar.addView(swVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
                tx txVar = new tx(this, context2, d6Var);
                this.p0 = txVar;
                txVar.setType(vm0Var);
                txVar.setUnderlineHeight(AndroidUtilities.getShadowHeight());
                i10 = i14;
                txVar.setIndicatorColor(z(i10));
                txVar.setUnderlineColor(z(i18));
                txVar.setBackgroundColor(z(i16));
                V();
                txVar.setDelegate(new hw(this, 2));
                ryVar.F("", "", true, true, true);
            } else {
                i10 = i14;
            }
            tw twVar = new tw(this, context2, z14);
            this.x0 = twVar;
            MediaDataController.getInstance(this.c1).checkStickers(0);
            MediaDataController.getInstance(this.c1).checkFeaturedStickers();
            vw vwVar = new vw(this, context2);
            this.D0 = vwVar;
            this.m2.a(vwVar);
            ww wwVar = new ww(this);
            this.E0 = wwVar;
            vwVar.setLayoutManager(wwVar);
            wwVar.O = new xw(this);
            vwVar.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f));
            vwVar.setClipToPadding(false);
            iz izVar3 = new iz();
            izVar3.a = 2;
            izVar3.b = twVar;
            this.d.add(izVar3);
            this.z0 = new hz(this, context2);
            dz dzVar = new dz(this, context2);
            this.y0 = dzVar;
            vwVar.setAdapter(dzVar);
            final int i21 = 2;
            vwVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.iw
                public final /* synthetic */ mz b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (i21) {
                        case 0:
                            org.telegram.ui.nt q6 = org.telegram.ui.nt.q();
                            mz mzVar = this.b;
                            yx yxVar2 = mzVar.P;
                            mzVar.getMeasuredHeight();
                            return q6.s(motionEvent, yxVar2, null, mzVar.g2, d6Var);
                        case 1:
                            org.telegram.ui.nt q10 = org.telegram.ui.nt.q();
                            mz mzVar2 = this.b;
                            return q10.s(motionEvent, mzVar2.h0, mzVar2.m0, mzVar2.g2, d6Var);
                        default:
                            org.telegram.ui.nt q11 = org.telegram.ui.nt.q();
                            mz mzVar3 = this.b;
                            vw vwVar2 = mzVar3.D0;
                            mzVar3.getMeasuredHeight();
                            return q11.s(motionEvent, vwVar2, mzVar3.A0, mzVar3.g2, d6Var);
                    }
                }
            });
            final int i22 = 1;
            ?? r42 = new ml0(this) { // from class: org.telegram.ui.Components.kw
                public final /* synthetic */ mz b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.Components.ml0
                public final void d(int i212, View view2) {
                    switch (i22) {
                        case 0:
                            mz mzVar = this.b;
                            pw pwVar2 = mzVar.h0;
                            ry ryVar2 = mzVar.j0;
                            ry ryVar3 = mzVar.n0;
                            if (mzVar.t1 != null) {
                                ryVar3.getClass();
                                ArrayList arrayList3 = ryVar3.x;
                                if (pwVar2.getAdapter() != ryVar3) {
                                    if (pwVar2.getAdapter() == ryVar2 && i212 >= 0 && i212 < ryVar2.x.size()) {
                                        mzVar.t1.v(view2, ryVar2.x.get(i212), ryVar2.w, ryVar2.n, true, 0, 0);
                                        mzVar.W();
                                        break;
                                    }
                                } else if (i212 >= 0) {
                                    int i222 = ryVar3.H;
                                    if (i212 >= i222) {
                                        int i23 = i222 > 0 ? (i212 - i222) - 1 : i212;
                                        if (i23 >= 0 && i23 < arrayList3.size()) {
                                            mzVar.t1.v(view2, arrayList3.get(i23), null, ryVar3.n, true, 0, 0);
                                            break;
                                        }
                                    } else {
                                        mzVar.t1.v(view2, mzVar.i1.get(i212), null, "gif", true, 0, 0);
                                        break;
                                    }
                                }
                            }
                            break;
                        default:
                            mz mzVar2 = this.b;
                            s4.h0 adapter = mzVar2.D0.getAdapter();
                            hz hzVar = mzVar2.z0;
                            String str = adapter == hzVar ? hzVar.N : null;
                            if (view2 instanceof org.telegram.ui.Cells.f8) {
                                org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view2;
                                if (f8Var.getSticker() != null && MessageObject.isPremiumSticker(f8Var.getSticker()) && !AccountInstance.getInstance(mzVar2.c1).getUserConfig().isPremium()) {
                                    org.telegram.ui.nt.q().y(f8Var);
                                    break;
                                } else {
                                    org.telegram.ui.nt.q().u();
                                    if (!f8Var.r) {
                                        f8Var.r = true;
                                        f8Var.n = 0.5f;
                                        f8Var.x = 0L;
                                        org.telegram.ui.Cells.e8 e8Var = f8Var.a;
                                        e8Var.setAlpha(0.5f * f8Var.H);
                                        e8Var.invalidate();
                                        f8Var.s = System.currentTimeMillis();
                                        f8Var.invalidate();
                                        mzVar2.t1.m(f8Var, f8Var.getSticker(), str, f8Var.getParentObject(), f8Var.getSendAnimationData(), true, 0);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            };
            this.A0 = r42;
            vwVar.setOnItemClickListener((ml0) r42);
            vwVar.setGlowColor(z(i16));
            twVar.addView(vwVar);
            this.a0 = new bl0(vwVar, wwVar);
            yw ywVar = new yw(this, context2);
            this.G0 = ywVar;
            twVar.addView(ywVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
            nh.d dVar2 = new nh.d(context2, d6Var);
            this.H0 = dVar2;
            dVar2.setVisibility(8);
            final int i23 = 1;
            dVar2.setOnBackClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jw
                public final /* synthetic */ mz b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i23) {
                        case 0:
                            my myVar = this.b.S;
                            hy hyVar = myVar.c;
                            int childCount = hyVar.getChildCount();
                            for (int i182 = 0; i182 < childCount; i182++) {
                                ((nh.c) hyVar.getChildAt(i182)).a(false, true);
                            }
                            myVar.d = 0L;
                            myVar.F.b.a(false, true);
                            myVar.l();
                            break;
                        case 1:
                            hz hzVar = this.b.z0;
                            gz gzVar = hzVar.c;
                            int childCount2 = gzVar.getChildCount();
                            for (int i192 = 0; i192 < childCount2; i192++) {
                                ((nh.c) gzVar.getChildAt(i192)).a(false, true);
                            }
                            hzVar.d = 0L;
                            hzVar.Q.a.a(false, true);
                            hzVar.l();
                            break;
                        case 2:
                            ny nyVar = this.b.t1;
                            if (nyVar != null) {
                                nyVar.w();
                                break;
                            }
                            break;
                        default:
                            mz mzVar = this.b;
                            int currentItem = mzVar.h.getCurrentItem();
                            zy zyVar = currentItem == 0 ? mzVar.V : currentItem == 1 ? mzVar.o0 : mzVar.G0;
                            if (zyVar != null) {
                                kq kqVar = zyVar.d;
                                kqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                kqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                kqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
            twVar.addView(dVar2, new FrameLayout.LayoutParams(-1, dp));
            z18 = z14;
            zw zwVar = new zw(this, context2, d6Var, m2Var, z18);
            this.B0 = zwVar;
            zwVar.setDragEnabled(true);
            zwVar.setWillNotDraw(false);
            zwVar.setType(vm0Var);
            zwVar.setUnderlineHeight(vwVar.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
            zwVar.setIndicatorColor(z(i10));
            zwVar.setUnderlineColor(z(i18));
            if (viewGroup == null || !z18) {
                twVar.addView(zwVar, w7.y5.e(-1, 36, 51));
            } else {
                ax axVar = new ax(this, context2);
                this.C0 = axVar;
                axVar.addView(zwVar, w7.y5.e(-1, 36, 51));
                viewGroup.addView(axVar, w7.y5.c(-2.0f, -1));
            }
            X(true);
            zwVar.setDelegate(new hw(this, 4));
            vwVar.setOnScrollListener(new lz(this, 0));
            nh.b bVar2 = new nh.b(context2, d6Var);
            this.N = bVar2;
            ci.m6 m6Var2 = new ci.m6(context2, 3, d6Var);
            this.M = m6Var2;
            m6Var2.setVisibility(8);
            m6Var2.addView(bVar2, w7.y5.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
            twVar.addView(m6Var2, w7.y5.e(-1, -2, 80));
        } else {
            z18 = z14;
        }
        this.e.clear();
        this.e.addAll(this.d);
        bx bxVar = new bx(this, context2);
        this.h = bxVar;
        li.e eVar2 = this.m2;
        eVar2.getClass();
        bxVar.b(new ai.n7(eVar2, 1));
        bxVar.setOverScrollMode(2);
        gy gyVar = new gy(this);
        this.L0 = gyVar;
        bxVar.setAdapter(gyVar);
        cx cxVar = new cx(this, context2);
        this.x = cxVar;
        cxVar.setHapticFeedbackEnabled(true);
        cxVar.setImageResource(R.drawable.smiles_tab_clear);
        int v = z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.h6.Re);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        cxVar.setColorFilter(new PorterDuffColorFilter(v, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        cxVar.setScaleType(scaleType);
        cxVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        cxVar.setFocusable(true);
        cxVar.setOnClickListener(new dx());
        w7.a6.a(cxVar);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.r = frameLayout;
        if (z13) {
            addView(frameLayout, w7.y5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, (AndroidUtilities.getShadowHeight() / AndroidUtilities.density) + 40.0f));
        } else {
            addView(frameLayout, w7.y5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.s = frameLayout2;
        addView(frameLayout2, w7.y5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.n = frameLayout3;
        View view2 = new View(context2);
        this.v = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(40.0f), 83));
        if (z13) {
            addView(frameLayout3, w7.y5.e(-1, 48, 80));
            frameLayout3.addView(cxVar, w7.y5.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
            if (z11) {
                ImageView imageView = new ImageView(context2);
                this.y = imageView;
                imageView.setImageResource(R.drawable.smiles_tab_settings);
                imageView.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.h6.Re), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(LocaleController.getString(R.string.Settings));
                w7.a6.a(imageView);
                frameLayout3.addView(imageView, w7.y5.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
                final int i24 = 2;
                imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jw
                    public final /* synthetic */ mz b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i24) {
                            case 0:
                                my myVar = this.b.S;
                                hy hyVar = myVar.c;
                                int childCount = hyVar.getChildCount();
                                for (int i182 = 0; i182 < childCount; i182++) {
                                    ((nh.c) hyVar.getChildAt(i182)).a(false, true);
                                }
                                myVar.d = 0L;
                                myVar.F.b.a(false, true);
                                myVar.l();
                                break;
                            case 1:
                                hz hzVar = this.b.z0;
                                gz gzVar = hzVar.c;
                                int childCount2 = gzVar.getChildCount();
                                for (int i192 = 0; i192 < childCount2; i192++) {
                                    ((nh.c) gzVar.getChildAt(i192)).a(false, true);
                                }
                                hzVar.d = 0L;
                                hzVar.Q.a.a(false, true);
                                hzVar.l();
                                break;
                            case 2:
                                ny nyVar = this.b.t1;
                                if (nyVar != null) {
                                    nyVar.w();
                                    break;
                                }
                                break;
                            default:
                                mz mzVar = this.b;
                                int currentItem = mzVar.h.getCurrentItem();
                                zy zyVar = currentItem == 0 ? mzVar.V : currentItem == 1 ? mzVar.o0 : mzVar.G0;
                                if (zyVar != null) {
                                    kq kqVar = zyVar.d;
                                    kqVar.requestFocus();
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                    kqVar.onTouchEvent(obtain);
                                    obtain.recycle();
                                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                    kqVar.onTouchEvent(obtain2);
                                    obtain2.recycle();
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
            qd0 qd0Var = new qd0(context2, d6Var);
            this.w = qd0Var;
            qd0Var.setViewPager(bxVar);
            qd0Var.setShouldExpand(false);
            qd0Var.setIndicatorHeight(AndroidUtilities.dp(3.0f));
            qd0Var.setIndicatorColor(i0.a.k(z(org.telegram.ui.ActionBar.h6.Oe), 20));
            qd0Var.setUnderlineHeight(0);
            qd0Var.setTabPaddingLeftRight(AndroidUtilities.dp(11.0f));
            qd0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
            frameLayout3.addView(qd0Var, w7.y5.e(-2, 48, 81));
            qd0Var.setOnPageChangeListener(new ex(this, z18));
            ImageView imageView2 = new ImageView(context2);
            this.E = imageView2;
            imageView2.setImageResource(R.drawable.smiles_tab_search);
            imageView2.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.h6.Re), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(LocaleController.getString(R.string.Search));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, w7.y5.d(48, 48.0f, 83, 2.0f, 0.0f, 2.0f, 0.0f));
            final int i25 = 3;
            imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jw
                public final /* synthetic */ mz b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view22) {
                    switch (i25) {
                        case 0:
                            my myVar = this.b.S;
                            hy hyVar = myVar.c;
                            int childCount = hyVar.getChildCount();
                            for (int i182 = 0; i182 < childCount; i182++) {
                                ((nh.c) hyVar.getChildAt(i182)).a(false, true);
                            }
                            myVar.d = 0L;
                            myVar.F.b.a(false, true);
                            myVar.l();
                            break;
                        case 1:
                            hz hzVar = this.b.z0;
                            gz gzVar = hzVar.c;
                            int childCount2 = gzVar.getChildCount();
                            for (int i192 = 0; i192 < childCount2; i192++) {
                                ((nh.c) gzVar.getChildAt(i192)).a(false, true);
                            }
                            hzVar.d = 0L;
                            hzVar.Q.a.a(false, true);
                            hzVar.l();
                            break;
                        case 2:
                            ny nyVar = this.b.t1;
                            if (nyVar != null) {
                                nyVar.w();
                                break;
                            }
                            break;
                        default:
                            mz mzVar = this.b;
                            int currentItem = mzVar.h.getCurrentItem();
                            zy zyVar = currentItem == 0 ? mzVar.V : currentItem == 1 ? mzVar.o0 : mzVar.G0;
                            if (zyVar != null) {
                                kq kqVar = zyVar.d;
                                kqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                kqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                kqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            addView(frameLayout3, w7.y5.d(56, 48.0f, (LocaleController.isRTL ? 3 : 5) | 80, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.h6.h0(AndroidUtilities.dp(56.0f), z(i16), z(i16));
            w7.a6.a(cxVar);
            cxVar.setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
            cxVar.setBackground(h02);
            cxVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
            cxVar.setFocusable(true);
            frameLayout3.addView(cxVar, w7.y5.d(48, 48.0f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
            view2.setVisibility(8);
        }
        addView(bxVar, 0, w7.y5.e(-1, -1, 51));
        ai.p4 p4Var = new ai.p4(context2, 22);
        this.N0 = p4Var;
        p4Var.setBackground(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(6.0f), z(org.telegram.ui.ActionBar.h6.qf)));
        p4Var.setTextColor(z(org.telegram.ui.ActionBar.h6.pf));
        p4Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f));
        p4Var.setGravity(16);
        p4Var.setTextSize(1, 14.0f);
        p4Var.setVisibility(4);
        addView(p4Var, w7.y5.d(-2, -2.0f, 81, 5.0f, 0.0f, 5.0f, 53.0f));
        this.C1 = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 32.0f);
        Field field2 = zu.f;
        zu zuVar = new zu(new yu(context2, d6Var));
        if (zu.f == null) {
            try {
                field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    field.setAccessible(true);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                field = null;
            }
            zu.f = field;
        }
        Field field3 = zu.f;
        if (field3 != null) {
            try {
                zuVar.a = (ViewTreeObserver.OnScrollChangedListener) field3.get(zuVar);
                zu.f.set(zuVar, zu.g);
            } catch (Exception unused3) {
                zuVar.a = null;
            }
        }
        this.B1 = zuVar;
        zuVar.c.setOnSelectionUpdateListener(new d(this, 10));
        this.A1 = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
        Emoji.loadRecentEmoji();
        vxVar.F(false);
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
        this.k2 = new lh(this, 1);
        setBlurredBackgroundDrawableFactory(this.l2);
        this.m2.b(this);
        this.m2.a = new hw(this, 0);
    }

    public static void a(mz mzVar, boolean z10) {
        pw pwVar = mzVar.h0;
        if (pwVar == null) {
            return;
        }
        int childCount = pwVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = pwVar.getChildAt(i10);
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

    public static void c(mz mzVar, vy vyVar, String str) {
        String str2;
        ny nyVar;
        org.telegram.ui.ActionBar.m2 m2Var = mzVar.Y1;
        int i10 = mzVar.c1;
        ArrayList arrayList = mzVar.q1;
        if (vyVar == null) {
            return;
        }
        if (vyVar.getSpan() == null) {
            mzVar.E2 = SystemClock.elapsedRealtime();
            mzVar.M(true);
            String str3 = str != null ? str : (String) vyVar.getTag();
            new SpannableStringBuilder().append((CharSequence) str3);
            if (str != null) {
                ny nyVar2 = mzVar.t1;
                if (nyVar2 != null) {
                    nyVar2.l(Emoji.fixEmoji(str));
                    return;
                }
                return;
            }
            if (!vyVar.c && (str2 = Emoji.emojiColor.get(str3)) != null) {
                str3 = g(str3, str2);
            }
            mzVar.h(str3);
            ny nyVar3 = mzVar.t1;
            if (nyVar3 != null) {
                nyVar3.l(Emoji.fixEmoji(str3));
                return;
            }
            return;
        }
        if (mzVar.t1 != null) {
            long j3 = vyVar.getSpan().documentId;
            TLRPC.Document document = vyVar.getSpan().document;
            zx zxVar = vyVar.e;
            boolean z10 = zxVar != null && zxVar.i;
            if (document == null) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    zx zxVar2 = (zx) arrayList.get(i11);
                    int i12 = 0;
                    while (true) {
                        ArrayList arrayList2 = zxVar2.c;
                        if (arrayList2 != null && i12 < arrayList2.size()) {
                            if (((TLRPC.Document) zxVar2.c.get(i12)).id == j3) {
                                document = (TLRPC.Document) zxVar2.c.get(i12);
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
            if (MessageObject.isFreeEmoji(document) || UserConfig.getInstance(i10).isPremium() || (((nyVar = mzVar.t1) != null && nyVar.g()) || mzVar.U0 || z10)) {
                mzVar.E2 = SystemClock.elapsedRealtime();
                mzVar.M(true);
                mzVar.h("animated_" + j3);
                mzVar.t1.x(j3, document, findAnimatedEmojiEmoticon, vyVar.c);
                return;
            }
            mzVar.M(false);
            yc a02 = m2Var != null ? yc.a0(m2Var) : new yc(mzVar.r, mzVar.Z1);
            if (mzVar.h2 || m2Var == null) {
                a02.q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new gw(mzVar, 3)).j();
            } else {
                a02.J(R.raw.saved_messages, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint2)), LocaleController.getString(R.string.Open), new gw(mzVar, 4)).j();
            }
            mzVar.h2 = !mzVar.h2;
        }
    }

    public static void e(mz mzVar, int i10, int i11) {
        s4.c1 K;
        int[] iArr = mzVar.Q0;
        if (i10 == 1) {
            mzVar.n(i11, mzVar.P);
            return;
        }
        ny nyVar = mzVar.t1;
        if ((nyVar == null || !nyVar.z()) && !mzVar.J0) {
            yl0 x10 = mzVar.x(i10);
            if (i11 <= 0 || x10 == null || x10.getVisibility() != 0 || (K = x10.K(0)) == null || K.a.getTop() + mzVar.b1 < x10.getPaddingTop()) {
                int i12 = iArr[i10] - i11;
                iArr[i10] = i12;
                if (i12 > 0) {
                    iArr[i10] = 0;
                } else if (i12 < (-AndroidUtilities.dp(288.0f))) {
                    iArr[i10] = -AndroidUtilities.dp(288.0f);
                }
                if (i10 == 0) {
                    mzVar.Y();
                } else {
                    mzVar.y(i10).setTranslationY(Math.max(-AndroidUtilities.dp(48.0f), iArr[i10]));
                }
            }
        }
    }

    public static void f(mz mzVar, boolean z10) {
        int N0;
        sy syVar = mzVar.i0;
        sw swVar = mzVar.o0;
        pw pwVar = mzVar.h0;
        if (pwVar != null && (pwVar.getAdapter() instanceof ry)) {
            ry ryVar = (ry) pwVar.getAdapter();
            if (!ryVar.s && ryVar.h == 0 && !ryVar.x.isEmpty() && (N0 = syVar.N0()) != -1 && N0 > syVar.B() - 5) {
                String str = ryVar.w;
                String str2 = ryVar.r;
                boolean z11 = ryVar.v;
                ryVar.F(str, str2, true, z11, z11);
            }
        }
        ny nyVar = mzVar.t1;
        if (nyVar == null || !nyVar.z()) {
            if (swVar == null || pwVar == null) {
                return;
            }
            swVar.a.a(true, !z10);
            return;
        }
        s4.c1 K = pwVar.K(0);
        if (K == null) {
            zy.a(swVar, true, !z10);
        } else {
            zy.a(swVar, K.a.getTop() < pwVar.getPaddingTop(), !z10);
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
        String t10 = v7.j.t(str, str2);
        if (str3 != null) {
            t10 = v7.j.t(t10, str3);
        }
        return z10 ? v7.j.t(t10, "\u200d➡") : t10;
    }

    public static void j(int i10, View view) {
        if (view == null) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i10);
    }

    public final void A() {
        yw ywVar = this.G0;
        if (ywVar != null) {
            ywVar.b();
        }
        sw swVar = this.o0;
        if (swVar != null) {
            swVar.b();
        }
        mw mwVar = this.V;
        if (mwVar != null) {
            mwVar.b();
        }
    }

    public final void B(boolean z10, boolean z11) {
        yy yyVar;
        if (this.A1 != 0 && this.w1) {
            this.A1 = 0;
        }
        if (this.A1 == 0 && this.v1) {
            this.A1 = 1;
        }
        int i10 = this.A1;
        bx bxVar = this.h;
        if (i10 == 0 || z10 || this.e.size() == 1) {
            L(true, false);
            Q(false, false);
            if (bxVar.getCurrentItem() != 0) {
                bxVar.x(0, !z10);
            }
            if (z11) {
                AndroidUtilities.runOnUIThread(new gw(this, 5), 350L);
            }
        } else {
            int i11 = this.A1;
            if (i11 == 1) {
                L(false, false);
                Q(this.u0 || this.v0, false);
                if (bxVar.getCurrentItem() != 2) {
                    bxVar.x(2, false);
                }
                zw zwVar = this.B0;
                if (zwVar != null) {
                    this.S0 = true;
                    int i12 = this.G1;
                    if (i12 >= 0) {
                        zwVar.m(i12);
                    } else {
                        int i13 = this.F1;
                        if (i13 >= 0) {
                            zwVar.m(i13);
                        } else {
                            zwVar.m(this.E1);
                        }
                    }
                    this.S0 = false;
                    this.E0.h1(0, 0);
                }
            } else if (i11 == 2) {
                L(false, false);
                Q(false, false);
                if (bxVar.getCurrentItem() != 1) {
                    bxVar.x(1, false);
                }
                tx txVar = this.p0;
                if (txVar != null) {
                    txVar.m(0);
                }
                sw swVar = this.o0;
                if (swVar != null && (yyVar = swVar.r) != null) {
                    yyVar.F1(null);
                }
            }
        }
        M(true);
    }

    @Override // le.e
    public final void D(int i10, float f7, float f10, le.f fVar) {
        if (i10 == 0) {
            q(false);
            float f11 = 1.0f - this.a.e;
            yw ywVar = this.G0;
            ywVar.setAlpha(f11);
            ywVar.setVisibility(f11 > 0.0f ? 0 : 4);
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
            mw mwVar = this.V;
            mwVar.setAlpha(f13);
            mwVar.setVisibility(f13 > 0.0f ? 0 : 4);
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

    public final void E() {
        dz dzVar = this.y0;
        if (dzVar != null) {
            dzVar.l();
        }
        hz hzVar = this.z0;
        if (hzVar != null) {
            hzVar.l();
        }
        if (org.telegram.ui.nt.q().E) {
            org.telegram.ui.nt.q().n();
        }
        org.telegram.ui.nt.q().u();
    }

    public final void F(int i10) {
        ny nyVar = this.t1;
        if ((nyVar == null || !nyVar.z()) && i10 != 0) {
            HorizontalScrollView y3 = y(i10);
            this.Q0[i10] = 0;
            y3.setTranslationY(0);
        }
    }

    public final void G(int i10, int i11) {
        mx mxVar = this.Q;
        View m10 = mxVar.m(i10);
        int L0 = mxVar.L0();
        if ((m10 == null && Math.abs(i10 - L0) > mxVar.J * 9.0f) || !SharedConfig.animationsEnabled()) {
            int i12 = mxVar.L0() < i10 ? 0 : 1;
            bl0 bl0Var = this.b0;
            bl0Var.b = i12;
            bl0Var.c(i10, i11, false, false);
            return;
        }
        this.J0 = true;
        ci.m1 m1Var = new ci.m1(this, this.P.getContext(), 1);
        m1Var.a = i10;
        m1Var.p = i11;
        mxVar.w0(m1Var);
    }

    public final void H(int i10, int i11) {
        ww wwVar = this.E0;
        View m10 = wwVar.m(i10);
        int L0 = wwVar.L0();
        if (m10 != null || Math.abs(i10 - L0) <= 40) {
            this.J0 = true;
            this.D0.x0(i10);
        } else {
            int i12 = wwVar.L0() < i10 ? 0 : 1;
            bl0 bl0Var = this.a0;
            bl0Var.b = i12;
            bl0Var.c(i10, i11, false, false);
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
            if (((iz) arrayList2.get(i10)).a == 0 && z10) {
                arrayList.add((iz) arrayList2.get(i10));
            }
            if (((iz) arrayList2.get(i10)).a == 1 && z12) {
                arrayList.add((iz) arrayList2.get(i10));
            }
            if (((iz) arrayList2.get(i10)).a == 2 && z11) {
                arrayList.add((iz) arrayList2.get(i10));
            }
            i10++;
        }
        qd0 qd0Var = this.w;
        if (qd0Var != null) {
            AndroidUtilities.updateViewVisibilityAnimated(qd0Var, arrayList.size() > 1, 1.0f, z13);
        }
        bx bxVar = this.h;
        if (bxVar != null) {
            bxVar.setAdapter(null);
            bxVar.setAdapter(this.L0);
            if (qd0Var != null) {
                qd0Var.setViewPager(bxVar);
            }
        }
    }

    public final void J(final nh.b bVar, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z10, boolean z11) {
        hz hzVar;
        my myVar;
        if (stickerSet == null) {
            return;
        }
        if (!z10 || (myVar = this.S) == null || myVar.d == stickerSet.id) {
            if (z10 || (hzVar = this.z0) == null || hzVar.d == stickerSet.id) {
                final boolean isStickerPackInstalled = MediaDataController.getInstance(this.c1).isStickerPackInstalled(stickerSet.id);
                bVar.g(isStickerPackInstalled ? stickerSet.masks ? LocaleController.formatPluralString("RemoveManyMasksCount", stickerSet.count, new Object[0]) : stickerSet.emojis ? LocaleController.formatPluralString("RemoveManyEmojiCount", stickerSet.count, new Object[0]) : LocaleController.formatPluralString("RemoveManyStickersCount", stickerSet.count, new Object[0]) : stickerSet.masks ? LocaleController.formatPluralString("AddManyMasksCount", stickerSet.count, new Object[0]) : stickerSet.emojis ? LocaleController.formatPluralString("AddManyEmojiCount", stickerSet.count, new Object[0]) : LocaleController.formatPluralString("AddManyStickersCount", stickerSet.count, new Object[0]), z11, true);
                bVar.h0.a(!isStickerPackInstalled, z11);
                bVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.lw
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        mz mzVar = mz.this;
                        MediaDataController mediaDataController = MediaDataController.getInstance(mzVar.c1);
                        Context context = mzVar.getContext();
                        int i10 = isStickerPackInstalled ? 0 : 2;
                        org.telegram.ui.ActionBar.m2 m2Var = mzVar.Y1;
                        FrameLayout frameLayout = mzVar.s;
                        nh.b bVar2 = bVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z12 = z10;
                        mediaDataController.toggleStickerSet(context, tLObject2, document2, i10, m2Var, frameLayout, false, true, new i2.c1(mzVar, bVar2, tLObject2, stickerSet2, document2, z12, 9), false);
                        mzVar.J(bVar2, tLObject2, stickerSet2, document2, z12, true);
                    }
                });
            }
        }
    }

    public final void K(long j3, boolean z10, boolean z11) {
        qd0 qd0Var = this.w;
        if (qd0Var == null) {
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
        LinearLayout linearLayout = qd0Var.d;
        View childAt = i10 >= linearLayout.getChildCount() ? null : linearLayout.getChildAt(i10);
        if (childAt != null) {
            childAt.setAlpha(this.u1 != 0 ? 0.15f : 1.0f);
            bx bxVar = this.h;
            if (z11) {
                if (this.u1 == 0 || bxVar.getCurrentItem() == 0) {
                    return;
                }
                L(true, true);
                Q(false, true);
                bxVar.x(0, false);
                return;
            }
            if (this.u1 == 0 || bxVar.getCurrentItem() == 1) {
                return;
            }
            L(false, true);
            Q(false, true);
            bxVar.x(1, false);
        }
    }

    public final void L(boolean z10, boolean z11) {
        cx cxVar = this.x;
        if (z10 && cxVar.getTag() == null) {
            return;
        }
        if ((z10 || cxVar.getTag() == null) && !this.n2) {
            AnimatorSet animatorSet = this.F;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.F = null;
            }
            cxVar.setTag(z10 ? null : 1);
            if (!z11) {
                cxVar.setAlpha(z10 ? 1.0f : 0.0f);
                cxVar.setScaleX(z10 ? 1.0f : 0.0f);
                cxVar.setScaleY(z10 ? 1.0f : 0.0f);
                cxVar.setVisibility(z10 ? 0 : 4);
                return;
            }
            if (z10) {
                cxVar.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.F = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(cxVar, (Property<cx, Float>) View.ALPHA, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(cxVar, (Property<cx, Float>) View.SCALE_X, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(cxVar, (Property<cx, Float>) View.SCALE_Y, z10 ? 1.0f : 0.0f));
            this.F.setDuration(200L);
            this.F.setInterpolator(sr.g);
            this.F.addListener(new ix(this, z10, r2));
            this.F.start();
        }
    }

    public final void M(boolean z10) {
        this.H = 0.0f;
        ny nyVar = this.t1;
        if (nyVar != null && nyVar.z()) {
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
            this.W.setInterpolator(sr.g);
            this.W.addListener(new r8(this, 19));
            this.W.start();
        }
    }

    public final void O(boolean z10) {
        for (int i10 = 0; i10 < 3; i10++) {
            s4.s w10 = w(i10);
            int L0 = w10.L0();
            if (z10) {
                if (L0 == 1 || L0 == 2) {
                    w10.n0(0);
                    F(i10);
                }
            } else if (L0 == 0) {
                w10.h1(0, 0);
            }
        }
    }

    public final void P(boolean z10, boolean z11, boolean z12) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.Chat chat = MessagesController.getInstance(this.c1).getChat(Long.valueOf(this.u1));
        if (chat == null) {
            return;
        }
        ai.p4 p4Var = this.N0;
        if (z10) {
            if (ChatObject.hasAdminRights(chat) || (tL_chatBannedRights = chat.default_banned_rights) == null || !(tL_chatBannedRights.send_stickers || (z11 && tL_chatBannedRights.send_plain))) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.banned_rights;
                if (tL_chatBannedRights2 == null) {
                    return;
                }
                if (!AndroidUtilities.isBannedForever(tL_chatBannedRights2)) {
                    if (z11) {
                        p4Var.setText(LocaleController.formatString("AttachPlainRestricted", R.string.AttachPlainRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    }
                    if (z12) {
                        p4Var.setText(LocaleController.formatString("AttachGifRestricted", R.string.AttachGifRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    } else {
                        p4Var.setText(LocaleController.formatString("AttachStickersRestricted", R.string.AttachStickersRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    }
                } else if (z11) {
                    p4Var.setText(LocaleController.getString(R.string.AttachPlainRestrictedForever));
                } else if (z12) {
                    p4Var.setText(LocaleController.getString(R.string.AttachGifRestrictedForever));
                } else {
                    p4Var.setText(LocaleController.getString(R.string.AttachStickersRestrictedForever));
                }
            } else {
                org.telegram.ui.ActionBar.m2 m2Var = this.Y1;
                if ((m2Var instanceof org.telegram.ui.wn) && ((org.telegram.ui.wn) m2Var).K6()) {
                    return;
                }
                if (z11) {
                    p4Var.setText(LocaleController.getString(R.string.GlobalAttachEmojiRestricted));
                } else if (z12) {
                    p4Var.setText(LocaleController.getString(R.string.GlobalAttachGifRestricted));
                } else {
                    p4Var.setText(LocaleController.getString(R.string.GlobalAttachStickersRestricted));
                }
            }
            p4Var.setVisibility(0);
        }
        AnimatorSet animatorSet = this.J2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.J2 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.J2 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(p4Var, (Property<ai.p4, Float>) View.ALPHA, z10 ? p4Var.getAlpha() : 1.0f, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(p4Var, (Property<ai.p4, Float>) View.TRANSLATION_Y, z10 ? AndroidUtilities.dp(12.0f) : p4Var.getTranslationY(), z10 ? 0.0f : AndroidUtilities.dp(12.0f)));
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
        this.J2.setInterpolator(sr.h);
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
            this.G.setInterpolator(sr.g);
            this.G.addListener(new ix(this, z10, i10));
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
        zy zyVar;
        boolean z10;
        bw bwVar;
        boolean z11 = this.u0;
        View view = this.v;
        if (!z11) {
            setBackground(null);
            view.setBackground(null);
        } else if (AndroidUtilities.isInMultiwindow || this.N1) {
            Drawable background = getBackground();
            if (background != null) {
                background.setColorFilter(new PorterDuffColorFilter(z(org.telegram.ui.ActionBar.h6.He), PorterDuff.Mode.MULTIPLY));
            }
        } else {
            int i10 = org.telegram.ui.ActionBar.h6.He;
            setBackgroundColor(z(i10));
            if (this.d0) {
                view.setBackgroundColor(z(i10));
            }
        }
        qx qxVar = this.I;
        if (qxVar != null) {
            if (this.u0) {
                qxVar.setBackgroundColor(z(org.telegram.ui.ActionBar.h6.He));
                this.O.setBackgroundColor(z(org.telegram.ui.ActionBar.h6.Ke));
            } else {
                qxVar.setBackground(null);
            }
        }
        zu zuVar = this.B1;
        if (zuVar != null) {
            zuVar.c.a();
        }
        int i11 = 0;
        while (true) {
            zyVar = this.V;
            z10 = this.i2;
            if (i11 >= 3) {
                break;
            }
            if (i11 == 0) {
                zyVar = this.G0;
            } else if (i11 != 1) {
                zyVar = this.o0;
            }
            if (zyVar != null) {
                kq kqVar = zyVar.d;
                FrameLayout frameLayout = zyVar.n;
                View view2 = zyVar.f;
                if (this.u0) {
                    view2.setBackgroundColor(z(org.telegram.ui.ActionBar.h6.He));
                } else {
                    view2.setBackground(null);
                }
                zyVar.e.setBackgroundColor(z(org.telegram.ui.ActionBar.h6.Ke));
                zyVar.c.a(z10 ? v(0.4f) : z(org.telegram.ui.ActionBar.h6.Je));
                org.telegram.ui.ActionBar.h6.w1(z10 ? v(0.06f) : z(org.telegram.ui.ActionBar.h6.Ie), frameLayout.getBackground());
                frameLayout.invalidate();
                kqVar.setHintTextColor(z10 ? v(0.45f) : z(org.telegram.ui.ActionBar.h6.Je));
                kqVar.setTextColor(z10 ? v(0.8f) : z(org.telegram.ui.ActionBar.h6.G6));
            }
            i11++;
        }
        Paint paint = this.s1;
        if (paint != null) {
            paint.setColor(z(org.telegram.ui.ActionBar.h6.af));
        }
        yx yxVar = this.P;
        if (yxVar != null) {
            yxVar.setGlowColor(z(org.telegram.ui.ActionBar.h6.He));
        }
        vw vwVar = this.D0;
        if (vwVar != null) {
            vwVar.setGlowColor(z(org.telegram.ui.ActionBar.h6.He));
        }
        zw zwVar = this.B0;
        if (zwVar != null) {
            zwVar.setIndicatorColor(z(org.telegram.ui.ActionBar.h6.Qe));
            zwVar.setUnderlineColor(z(org.telegram.ui.ActionBar.h6.Ke));
            if (this.u0) {
                zwVar.setBackgroundColor(z(org.telegram.ui.ActionBar.h6.He));
            } else {
                zwVar.setBackground(null);
            }
        }
        tx txVar = this.p0;
        if (txVar != null) {
            txVar.setIndicatorColor(z(org.telegram.ui.ActionBar.h6.Qe));
            txVar.setUnderlineColor(z(org.telegram.ui.ActionBar.h6.Ke));
            if (this.u0) {
                txVar.setBackgroundColor(z(org.telegram.ui.ActionBar.h6.He));
            } else {
                txVar.setBackground(null);
            }
        }
        cx cxVar = this.x;
        if (cxVar != null) {
            cxVar.setColorFilter(new PorterDuffColorFilter(z10 ? v(0.6f) : z(org.telegram.ui.ActionBar.h6.Re), PorterDuff.Mode.MULTIPLY));
            if (zyVar == null) {
                Drawable background2 = cxVar.getBackground();
                int i12 = org.telegram.ui.ActionBar.h6.He;
                org.telegram.ui.ActionBar.h6.B1(background2, z(i12), false);
                org.telegram.ui.ActionBar.h6.B1(cxVar.getBackground(), z(i12), true);
            }
        }
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(z10 ? v(0.6f) : z(org.telegram.ui.ActionBar.h6.Re), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.E;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(z10 ? v(0.6f) : z(org.telegram.ui.ActionBar.h6.Re), PorterDuff.Mode.MULTIPLY));
        }
        ai.p4 p4Var = this.N0;
        if (p4Var != null) {
            ((ShapeDrawable) p4Var.getBackground()).getPaint().setColor(z(org.telegram.ui.ActionBar.h6.qf));
            p4Var.setTextColor(z(org.telegram.ui.ActionBar.h6.pf));
        }
        ry ryVar = this.j0;
        if (ryVar != null) {
            ty tyVar = ryVar.e;
            ImageView imageView3 = tyVar.a;
            int i13 = org.telegram.ui.ActionBar.h6.Le;
            imageView3.setColorFilter(new PorterDuffColorFilter(z(i13), PorterDuff.Mode.MULTIPLY));
            tyVar.b.setTextColor(z(i13));
            tyVar.c.setProgressColor(z(org.telegram.ui.ActionBar.h6.h6));
        }
        this.e2 = new PorterDuffColorFilter(z(org.telegram.ui.ActionBar.h6.Oh), PorterDuff.Mode.SRC_IN);
        int i14 = 0;
        while (true) {
            Drawable[] drawableArr = this.X0;
            if (i14 >= drawableArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.h6.y1(drawableArr[i14], z10 ? v(0.4f) : z(org.telegram.ui.ActionBar.h6.Ne), false);
            org.telegram.ui.ActionBar.h6.y1(drawableArr[i14], z10 ? v(0.8f) : z(org.telegram.ui.ActionBar.h6.Oe), true);
            i14++;
        }
        if (qxVar != null && (bwVar = qxVar.y) != null) {
            bwVar.d();
        }
        int i15 = 0;
        while (true) {
            Drawable[] drawableArr2 = this.Y0;
            if (i15 >= drawableArr2.length) {
                break;
            }
            org.telegram.ui.ActionBar.h6.y1(drawableArr2[i15], z10 ? v(0.4f) : z(org.telegram.ui.ActionBar.h6.Me), false);
            org.telegram.ui.ActionBar.h6.y1(drawableArr2[i15], z10 ? v(0.8f) : z(org.telegram.ui.ActionBar.h6.Oe), true);
            i15++;
        }
        int i16 = 0;
        while (true) {
            Drawable[] drawableArr3 = this.Z0;
            if (i16 >= drawableArr3.length) {
                break;
            }
            org.telegram.ui.ActionBar.h6.y1(drawableArr3[i16], z10 ? v(0.4f) : z(org.telegram.ui.ActionBar.h6.Me), false);
            org.telegram.ui.ActionBar.h6.y1(drawableArr3[i16], z10 ? v(0.8f) : z(org.telegram.ui.ActionBar.h6.Oe), true);
            i16++;
        }
        org.telegram.ui.ActionBar.s5 s5Var = this.a2;
        if (s5Var != null) {
            org.telegram.ui.ActionBar.h6.y1(s5Var, z10 ? v(0.4f) : z(org.telegram.ui.ActionBar.h6.Ne), false);
            org.telegram.ui.ActionBar.h6.y1(s5Var, z10 ? v(0.8f) : z(org.telegram.ui.ActionBar.h6.Oe), true);
        }
        org.telegram.ui.ActionBar.s5 s5Var2 = this.b2;
        if (s5Var2 != null) {
            org.telegram.ui.ActionBar.h6.y1(s5Var2, z10 ? v(0.4f) : z(org.telegram.ui.ActionBar.h6.Qe), false);
            org.telegram.ui.ActionBar.h6.y1(s5Var2, z10 ? v(0.8f) : z(org.telegram.ui.ActionBar.h6.Qe), true);
        }
    }

    public final void T() {
        yx yxVar = this.P;
        if (yxVar == null) {
            return;
        }
        for (int i10 = 0; i10 < yxVar.getChildCount(); i10++) {
            View childAt = yxVar.getChildAt(i10);
            if (childAt instanceof ey) {
                ((ey) childAt).a(true);
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
            vx vxVar = this.R;
            int i12 = vxVar.c;
            ArrayList arrayList = vxVar.x;
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
                    ArrayList<zx> emojipacks = getEmojipacks();
                    int size2 = arrayList.size() - 1;
                    while (true) {
                        if (size2 < 0) {
                            break;
                        }
                        if (((Integer) arrayList.get(size2)).intValue() <= i10) {
                            zx zxVar = (zx) this.q1.get(size2);
                            while (i13 < emojipacks.size()) {
                                long j3 = emojipacks.get(i13).b.id;
                                long j10 = zxVar.b.id;
                                if (j3 == j10 && (!zxVar.g || (!zxVar.f && !this.p1.contains(Long.valueOf(j10))))) {
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
        yy yyVar;
        int i11;
        boolean z10;
        tx txVar = this.p0;
        int currentPosition = txVar.getCurrentPosition();
        int i12 = this.r0;
        boolean z11 = currentPosition == i12;
        boolean z12 = i12 >= 0;
        boolean isEmpty = this.i1.isEmpty();
        txVar.d(false);
        this.r0 = -2;
        this.s0 = -2;
        this.t0 = -2;
        Drawable[] drawableArr = this.Z0;
        if (isEmpty) {
            i10 = 0;
        } else {
            this.r0 = 0;
            txVar.b(0, drawableArr[0]).setContentDescription(LocaleController.getString(R.string.RecentStickers));
            i10 = 1;
        }
        this.s0 = i10;
        txVar.b(1, drawableArr[1]).setContentDescription(LocaleController.getString(R.string.FeaturedGifs));
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
                int i15 = txVar.x;
                txVar.x = i15 + 1;
                px0 px0Var = (px0) txVar.n.get(h);
                if (px0Var != null) {
                    txVar.g(h, px0Var, i15);
                    i11 = currentPosition;
                    z10 = z12;
                } else {
                    i11 = currentPosition;
                    z10 = z12;
                    px0Var = new px0(txVar.getContext(), 2);
                    px0Var.setFocusable(true);
                    px0Var.setOnClickListener(new pm0(txVar, 2));
                    px0Var.setExpanded(txVar.f0);
                    px0Var.a(txVar.i0);
                    txVar.e.addView(px0Var, i15);
                }
                px0Var.d = false;
                px0Var.setTag(R.id.index_tag, Integer.valueOf(i15));
                px0Var.setTag(R.id.parent_tag, emojiDrawable);
                px0Var.setTag(R.id.object_tag, emojiAnimatedSticker);
                px0Var.setSelected(i15 == txVar.y);
                txVar.h.put(h, px0Var);
                px0Var.setContentDescription(str);
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
        txVar.h();
        txVar.q();
        if (z11 && isEmpty) {
            txVar.m(this.s0);
            sw swVar = this.o0;
            if (swVar == null || (yyVar = swVar.r) == null) {
                return;
            }
            yyVar.F1(null);
            return;
        }
        WeakHashMap weakHashMap = r0.i0.a;
        if (txVar.isLaidOut()) {
            if (!isEmpty && !z13) {
                txVar.k(i16 + 1, 0);
            } else if (isEmpty && z13) {
                txVar.k(i16 - 1, 0);
            }
        }
    }

    public final void W() {
        ry ryVar;
        int size = this.i1.size();
        long calcDocumentsHash = MediaDataController.calcDocumentsHash(this.i1, ConnectionsManager.DEFAULT_DATACENTER_ID);
        ArrayList<TLRPC.Document> recentGifs = MediaDataController.getInstance(this.c1).getRecentGifs();
        this.i1 = recentGifs;
        long calcDocumentsHash2 = MediaDataController.calcDocumentsHash(recentGifs, ConnectionsManager.DEFAULT_DATACENTER_ID);
        if ((this.p0 != null && size == 0 && !this.i1.isEmpty()) || (size != 0 && this.i1.isEmpty())) {
            V();
        }
        if ((size == this.i1.size() && calcDocumentsHash == calcDocumentsHash2) || (ryVar = this.n0) == null) {
            return;
        }
        ryVar.l();
    }

    public final void X(boolean z10) {
        TLRPC.Document document;
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet;
        zw zwVar = this.B0;
        if (zwVar != null) {
            ub1 ub1Var = zwVar.e;
            if (zwVar.s != null) {
                return;
            }
            this.F1 = -2;
            this.G1 = -2;
            this.H1 = -2;
            this.I1 = -2;
            this.e0 = false;
            this.E1 = 0;
            int currentPosition = zwVar.getCurrentPosition();
            boolean z11 = true;
            zwVar.d((getParent() == null || getVisibility() != 0 || (this.y1.size() == 0 && this.z1.size() == 0)) ? false : true);
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
            kz kzVar = this.F0;
            if (kzVar != null) {
                kzVar.l();
            }
            boolean isEmpty = featuredStickerSets.isEmpty();
            long j3 = 0;
            Drawable[] drawableArr = this.Y0;
            if (!isEmpty && (arrayList3.isEmpty() || emojiSettings.getLong("featured_hidden", 0L) == featuredStickerSets.get(0).set.id)) {
                int i12 = mediaDataController.getUnreadStickerSets().isEmpty() ? 2 : 3;
                px0 c10 = zwVar.c(i12, drawableArr[i12]);
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
                px0 c11 = zwVar.c(1, drawableArr[1]);
                c11.h.setText(LocaleController.getString(R.string.FavoriteStickersShort));
                c11.setContentDescription(LocaleController.getString(R.string.FavoriteStickers));
            }
            if (!this.j1.isEmpty()) {
                int i15 = this.E1;
                this.F1 = i15;
                this.E1 = i15 + 1;
                px0 c12 = zwVar.c(0, drawableArr[0]);
                c12.h.setText(LocaleController.getString(R.string.RecentStickersShort));
                c12.setContentDescription(LocaleController.getString(R.string.RecentStickers));
            }
            ArrayList arrayList4 = this.d1;
            arrayList4.clear();
            org.telegram.ui.ActionBar.d6 d6Var = null;
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
                        this.e0 = z11;
                        String str = "chat" + chat2.id;
                        int i19 = zwVar.x;
                        zwVar.x = i19 + 1;
                        px0 px0Var = (px0) zwVar.n.get(str);
                        if (px0Var != null) {
                            zwVar.g(str, px0Var, i19);
                        } else {
                            px0Var = new px0(zwVar.getContext(), 0);
                            px0Var.setFocusable(z11);
                            px0Var.setOnClickListener(new pm0(zwVar, 0));
                            ub1Var.addView(px0Var, i19);
                            px0Var.w = z11;
                            h9 h9Var = new h9(d6Var);
                            h9Var.u(AndroidUtilities.dp(14.0f));
                            h9Var.k(UserConfig.selectedAccount, chat2);
                            int i20 = zwVar.a;
                            w9 w9Var = px0Var.e;
                            w9Var.setLayerNum(i20);
                            w9Var.e(chat2, h9Var);
                            w9Var.setAspectFit(z11);
                            px0Var.setExpanded(zwVar.f0);
                            px0Var.a(zwVar.i0);
                            px0Var.h.setText(chat2.title);
                        }
                        px0Var.d = z11;
                        px0Var.setTag(R.id.index_tag, Integer.valueOf(i19));
                        px0Var.setSelected(i19 == zwVar.y);
                        zwVar.h.put(str, px0Var);
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
                    int i22 = zwVar.x;
                    zwVar.x = i22 + 1;
                    px0 px0Var2 = (px0) zwVar.n.get(str2);
                    if (px0Var2 != null) {
                        zwVar.g(str2, px0Var2, i22);
                    } else {
                        px0Var2 = new px0(zwVar.getContext(), 0);
                        px0Var2.setFocusable(z11);
                        px0Var2.setOnClickListener(new pm0(zwVar, 1));
                        px0Var2.setExpanded(zwVar.f0);
                        px0Var2.a(zwVar.i0);
                        ub1Var.addView(px0Var2, i22);
                    }
                    px0Var2.e.setLayerNum(zwVar.a);
                    px0Var2.d = false;
                    px0Var2.setTag(closestPhotoSizeWithSize);
                    px0Var2.setTag(R.id.index_tag, Integer.valueOf(i22));
                    px0Var2.setTag(R.id.parent_tag, tL_messages_stickerSet5);
                    px0Var2.setTag(R.id.object_tag, document);
                    px0Var2.setSelected(i22 == zwVar.y);
                    zwVar.h.put(str2, px0Var2);
                    px0Var2.setContentDescription(tL_messages_stickerSet5.set.title + ", " + LocaleController.getString(R.string.AccDescrStickerSet));
                }
                i18++;
                z11 = true;
                d6Var = null;
            }
            zwVar.h();
            zwVar.q();
            if (currentPosition != 0) {
                zwVar.k(currentPosition, currentPosition);
            }
            o();
        }
    }

    public final void Y() {
        ax axVar = this.C0;
        zw zwVar = this.B0;
        if (zwVar != null && axVar == null && this.t1 != null) {
            zwVar.setTranslationY(this.t1.p() * (-AndroidUtilities.dp(50.0f)));
        }
        if (axVar == null) {
            return;
        }
        boolean z10 = getVisibility() == 0 && this.K0 && this.t1.p() != 1.0f;
        axVar.setVisibility(z10 ? 0 : 8);
        if (z10) {
            Rect rect = this.x2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.x0, rect, null);
            float p5 = this.t1.p() * AndroidUtilities.dp(50.0f);
            int i10 = rect.left;
            if (i10 != 0 || p5 != 0.0f) {
                this.X1 = false;
            }
            axVar.setTranslationX(i10);
            float translationY = (((getTranslationY() + getTop()) - axVar.getTop()) - zwVar.getExpandedOffset()) - p5;
            if (axVar.getTranslationY() != translationY) {
                axVar.setTranslationY(translationY);
                axVar.invalidate();
            }
        }
        if (this.X1 && z10 && this.P0) {
            zwVar.i(this.W1, true);
        } else {
            this.X1 = false;
            zwVar.i(this.W1, false);
        }
    }

    public final void Z() {
        boolean z10;
        org.telegram.ui.Cells.s3 s3Var;
        LongSparseArray longSparseArray = this.z1;
        LongSparseArray longSparseArray2 = this.y1;
        int i10 = this.c1;
        vw vwVar = this.D0;
        if (vwVar == null) {
            return;
        }
        try {
            int childCount = vwVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = vwVar.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.s3) && ((il0) vwVar.T(childAt)) != null) {
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
        vx vxVar = this.R;
        gw gwVar = this.L2;
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
                    vxVar.F(false);
                    return;
                } else {
                    AndroidUtilities.cancelRunOnUIThread(gwVar);
                    AndroidUtilities.runOnUIThread(gwVar, 100L);
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
                vxVar.F(true);
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
            qd0 qd0Var = this.w;
            if (qd0Var != null) {
                int childCount = qd0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    qd0Var.getChildAt(i13).invalidate();
                }
            }
            X(false);
            return;
        }
        if (i10 == NotificationCenter.featuredEmojiDidLoad) {
            if (vxVar != null) {
                vxVar.F(false);
                return;
            }
            return;
        }
        int i14 = NotificationCenter.groupStickersDidLoad;
        my myVar = this.S;
        if (i10 == i14) {
            Long l4 = (Long) objArr[0];
            long longValue2 = l4.longValue();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = objArr.length > 1 ? (TLRPC.TL_messages_stickerSet) objArr[1] : null;
            if (tL_messages_stickerSet != null) {
                hz hzVar = this.z0;
                if (hzVar != null && hzVar.d == longValue2 && hzVar.f.size() < tL_messages_stickerSet.documents.size()) {
                    hzVar.f = tL_messages_stickerSet.documents;
                    hzVar.l();
                }
                if (myVar != null && myVar.d == longValue2 && myVar.f.size() < tL_messages_stickerSet.documents.size()) {
                    myVar.f = tL_messages_stickerSet.documents;
                    myVar.l();
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
            AndroidUtilities.cancelRunOnUIThread(gwVar);
            AndroidUtilities.runOnUIThread(gwVar, 100L);
            return;
        }
        int i15 = NotificationCenter.emojiLoaded;
        yx yxVar = this.P;
        if (i10 != i15) {
            if (i10 != NotificationCenter.newEmojiSuggestionsAvailable) {
                if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                    if (vxVar != null) {
                        vxVar.F(false);
                    }
                    T();
                    X(false);
                    return;
                }
                return;
            }
            if (yxVar == null || !this.d0) {
                return;
            }
            if ((this.V.c.k == 2 || yxVar.getAdapter() == myVar) && !TextUtils.isEmpty(myVar.v)) {
                myVar.F(myVar.v, true);
                return;
            }
            return;
        }
        vw vwVar = this.D0;
        if (vwVar != null) {
            int childCount2 = vwVar.getChildCount();
            for (int i16 = 0; i16 < childCount2; i16++) {
                View childAt = vwVar.getChildAt(i16);
                if ((childAt instanceof org.telegram.ui.Cells.o8) || (childAt instanceof org.telegram.ui.Cells.f8)) {
                    childAt.invalidate();
                }
            }
        }
        if (yxVar != null) {
            yxVar.invalidate();
            int childCount3 = yxVar.getChildCount();
            for (int i17 = 0; i17 < childCount3; i17++) {
                View childAt2 = yxVar.getChildAt(i17);
                if (childAt2 instanceof vy) {
                    childAt2.invalidate();
                }
            }
        }
        zu zuVar = this.B1;
        if (zuVar != null) {
            zuVar.c.invalidate();
        }
        tx txVar = this.p0;
        if (txVar != null) {
            ub1 ub1Var = txVar.e;
            int childCount4 = ub1Var.getChildCount();
            for (int i18 = 0; i18 < childCount4; i18++) {
                ub1Var.getChildAt(i18).invalidate();
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
            int l1 = org.telegram.ui.ActionBar.h6.l1(navigationBarThirdButtonsFactor, z(org.telegram.ui.ActionBar.h6.He));
            int i10 = this.B2;
            GradientDrawable gradientDrawable = this.A2;
            if (i10 != l1) {
                gradientDrawable.setColors(new int[]{l1, org.telegram.ui.ActionBar.h6.l1(0.66f, l1), i0.a.k(l1, 0)});
                this.B2 = l1;
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

    public ArrayList<zx> getEmojipacks() {
        ArrayList<zx> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.q1;
            if (i10 >= arrayList2.size()) {
                return arrayList;
            }
            zx zxVar = (zx) arrayList2.get(i10);
            boolean z10 = zxVar.g;
            ArrayList arrayList3 = this.p1;
            if ((!z10 && (zxVar.f || arrayList3.contains(Long.valueOf(zxVar.b.id)))) || (zxVar.g && !zxVar.f && !arrayList3.contains(Long.valueOf(zxVar.b.id)))) {
                arrayList.add(zxVar);
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
        zw zwVar = this.B0;
        if (zwVar == null) {
            return 0.0f;
        }
        return zwVar.getExpandedOffset();
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
        if (i10 == 2 || x(i10).K(0) == null) {
            return;
        }
        jx jxVar = new jx(getContext(), i11);
        jxVar.a = !z10 ? 1 : 0;
        w(i10).w0(jxVar);
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
        dz dzVar = this.y0;
        if (dzVar != null) {
            dzVar.l();
        }
        o();
    }

    public final void l(boolean z10) {
        ny nyVar = this.t1;
        le.c cVar = this.b;
        yx yxVar = this.P;
        mw mwVar = this.V;
        if (nyVar != null && nyVar.z()) {
            s4.c1 K = yxVar.K(0);
            if (K == null) {
                zy.a(mwVar, true, !z10);
            } else {
                zy.a(mwVar, K.a.getTop() < yxVar.getPaddingTop(), !z10);
            }
            N(false, !z10);
            mwVar.setTranslationY(cVar.e * AndroidUtilities.dp(15.0f));
            return;
        }
        if (mwVar == null || yxVar == null) {
            return;
        }
        mwVar.setTranslationY((cVar.e * AndroidUtilities.dp(15.0f)) + (yxVar.K(0) != null ? r0.a.getTop() : -this.b1));
        mwVar.a.a(false, !z10);
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
            N(z10, !this.K1);
        }
    }

    public final void n(int i10, View view) {
        yx yxVar;
        s4.c1 K;
        qx qxVar = this.I;
        int[] iArr = this.Q0;
        if (view == null) {
            iArr[1] = 0;
            qxVar.setTranslationY(0);
            return;
        }
        if (view.getVisibility() != 0 || this.f0) {
            return;
        }
        ny nyVar = this.t1;
        if (nyVar == null || !nyVar.z()) {
            if (i10 > 0 && (yxVar = this.P) != null && yxVar.getVisibility() == 0 && (K = yxVar.K(0)) != null) {
                if (K.a.getTop() + (this.d0 ? this.b1 : 0) >= yxVar.getPaddingTop()) {
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
            qxVar.setTranslationY(Math.max(-AndroidUtilities.dp(36.0f), iArr[1]));
        }
    }

    public final void o() {
        int L0;
        zw zwVar = this.B0;
        if (zwVar == null || (L0 = this.E0.L0()) == -1) {
            return;
        }
        int i10 = this.G1;
        if (i10 <= 0 && (i10 = this.F1) <= 0) {
            i10 = this.E1;
        }
        zwVar.k(this.y0.F(L0), i10);
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
            AndroidUtilities.runOnUIThread(new gw(this, 0));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zu zuVar = this.B1;
        if (zuVar != null && zuVar.isShowing()) {
            zuVar.dismiss();
        }
        org.telegram.ui.nt q6 = org.telegram.ui.nt.q();
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
                int i12 = org.telegram.ui.ActionBar.h6.He;
                background.setColorFilter(new PorterDuffColorFilter(z(i12), PorterDuff.Mode.MULTIPLY));
                if (z11 && this.u0) {
                    view.setBackgroundColor(z(i12));
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
                int i13 = org.telegram.ui.ActionBar.h6.He;
                setBackgroundColor(z(i13));
                if (z11) {
                    view.setBackgroundColor(z(i13));
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
            ry ryVar = this.n0;
            if (adapter != ryVar || ryVar.I < 0 || this.s0 < 0 || this.r0 < 0 || (L0 = this.i0.L0()) == -1) {
                return;
            }
            this.p0.k(L0 >= ryVar.I ? this.s0 : this.r0, 0);
        }
    }

    public final void q(boolean z10) {
        ny nyVar = this.t1;
        le.c cVar = this.a;
        vw vwVar = this.D0;
        yw ywVar = this.G0;
        if (nyVar != null && nyVar.z()) {
            s4.c1 K = vwVar.K(0);
            if (K == null) {
                zy.a(ywVar, true, !z10);
            } else {
                zy.a(ywVar, K.a.getTop() < vwVar.getPaddingTop(), !z10);
            }
            ywVar.setTranslationY(cVar.e * AndroidUtilities.dp(15.0f));
            return;
        }
        if (ywVar == null || vwVar == null) {
            return;
        }
        ywVar.setTranslationY((cVar.e * AndroidUtilities.dp(15.0f)) + (vwVar.K(0) != null ? r0.a.getTop() : -this.b1));
        ywVar.a.a(false, !z10);
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
        zy zyVar;
        s4.c0 c0Var;
        View view;
        View view2;
        int i10;
        TLRPC.TL_messages_stickerSet stickerSetById;
        dz dzVar;
        int E;
        AnimatorSet animatorSet = this.M0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.M0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        if (currentItem == 2 && j3 != -1 && (stickerSetById = MediaDataController.getInstance(this.c1).getStickerSetById(j3)) != null && (E = (dzVar = this.y0).E(stickerSetById)) >= 0 && E < dzVar.h()) {
            H(E, AndroidUtilities.dp(48.0f));
        }
        ry ryVar = this.j0;
        if (ryVar != null) {
            ryVar.K = false;
        }
        for (int i11 = 0; i11 < 3; i11++) {
            View view3 = this.D0;
            View view4 = this.h0;
            sw swVar = this.o0;
            View view5 = this.P;
            if (i11 == 0) {
                zyVar = this.V;
                c0Var = this.Q;
                view = this.I;
                view2 = view5;
            } else if (i11 == 1) {
                c0Var = this.i0;
                view = this.p0;
                view2 = view4;
                zyVar = swVar;
            } else {
                zyVar = this.G0;
                c0Var = this.E0;
                view = this.B0;
                view2 = view3;
            }
            if (zyVar != null) {
                yy yyVar = zyVar.r;
                zyVar.d.setText("");
                if (yyVar != null) {
                    yyVar.F1(null);
                    yyVar.D1();
                }
                int i12 = this.b1;
                if (i11 == currentItem && z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.M0 = animatorSet2;
                    Property property = View.TRANSLATION_Y;
                    if (view == null || i11 == 1) {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, AndroidUtilities.dp(36.0f) - i12));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, AndroidUtilities.dp(36.0f)), ObjectAnimator.ofFloat(zyVar, (Property<zy, Float>) property, AndroidUtilities.dp(36.0f)));
                    }
                    this.M0.setDuration(200L);
                    this.M0.setInterpolator(sr.h);
                    this.M0.addListener(new ai.y4(this, c0Var, view2, 5));
                    this.M0.start();
                } else {
                    if (zyVar != swVar) {
                        zyVar.setTranslationY(AndroidUtilities.dp(36.0f) - i12);
                    }
                    if (view != null && i11 != 2) {
                        view.setTranslationY(0.0f);
                    }
                    if (view2 == view3) {
                        i10 = 0;
                        view2.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + this.p2);
                    } else {
                        i10 = 0;
                        if (view2 == view4) {
                            view2.setPadding(0, AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(44.0f) + this.p2);
                        } else {
                            if (view2 == view5) {
                                view2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + this.p2);
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

    public void setBlurredBackgroundDrawableFactory(ah.c cVar) {
        org.telegram.ui.ActionBar.d6 d6Var = this.Z1;
        cx cxVar = this.x;
        if (cxVar != null) {
            ch.d c10 = cVar.c(cxVar, null, false);
            c10.o(eh.b.d(d6Var));
            c10.q(AndroidUtilities.dp(18.0f));
            c10.p(AndroidUtilities.dp(6.0f));
            cxVar.setBackground(c10);
        }
        ImageView imageView = this.E;
        if (imageView != null) {
            ch.d c11 = cVar.c(imageView, null, false);
            c11.o(eh.b.d(d6Var));
            c11.q(AndroidUtilities.dp(18.0f));
            c11.p(AndroidUtilities.dp(6.0f));
            imageView.setBackground(c11);
        }
        qd0 qd0Var = this.w;
        if (qd0Var != null) {
            ch.d c12 = cVar.c(qd0Var, null, false);
            c12.o(eh.b.d(d6Var));
            c12.q(AndroidUtilities.dp(18.0f));
            c12.p(AndroidUtilities.dp(6.0f));
            qd0Var.setBackground(c12);
        }
        ImageView imageView2 = this.y;
        if (imageView2 != null) {
            ch.d c13 = cVar.c(imageView2, null, false);
            c13.o(eh.b.d(d6Var));
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

    public void setDelegate(ny nyVar) {
        this.t1 = nyVar;
    }

    public void setDragListener(sx sxVar) {
        this.O0 = sxVar;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        yw ywVar = this.G0;
        if (ywVar != null) {
            ywVar.d.setEnabled(z10);
        }
        sw swVar = this.o0;
        if (swVar != null) {
            swVar.d.setEnabled(z10);
        }
        mw mwVar = this.V;
        if (mwVar != null) {
            mwVar.d.setEnabled(z10);
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
            gg.g1 g1Var = this.T0;
            if (g1Var != null) {
                g1Var.a();
            }
        }
    }

    public final void t(boolean z10) {
        s(-1L, z10);
    }

    public final void u(boolean z10) {
        dz dzVar;
        boolean z11 = this.N2;
        this.N2 = z10;
        if (!z11 || z10) {
            return;
        }
        int i10 = this.A1;
        if (i10 == 0) {
            vx vxVar = this.R;
            if (vxVar != null) {
                vxVar.F(false);
                return;
            }
            return;
        }
        if (i10 == 1) {
            ry ryVar = this.n0;
            if (ryVar != null) {
                ryVar.l();
                return;
            }
            return;
        }
        if (i10 != 2 || (dzVar = this.y0) == null) {
            return;
        }
        dzVar.l();
    }

    public final int v(float f7) {
        return i0.a.k(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Wk, this.Z1), (int) (f7 * 255.0f));
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
        throw new IllegalArgumentException(hg.c.h(i10, "Unexpected argument: "));
    }

    public final yl0 x(int i10) {
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
        throw new IllegalArgumentException(hg.c.h(i10, "Unexpected argument: "));
    }

    public final int z(int i10) {
        org.telegram.ui.ActionBar.d6 d6Var = this.Z1;
        return d6Var != null ? d6Var.G0(i10) : org.telegram.ui.ActionBar.h6.w0(null, i10, false);
    }

    @Override // le.e
    public final void C(float f7, int i10) {
    }
}
