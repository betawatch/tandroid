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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class sz extends FrameLayout implements org.telegram.ui.ActionBar.p6, oe.d, NotificationCenter.NotificationCenterDelegate, rh.a {
    public static final /* synthetic */ int S2 = 0;
    public final pw A0;
    public int A1;
    public int A2;
    public final dx B0;
    public final fv B1;
    public ArrayList B2;
    public final ex C0;
    public final int C1;
    public int C2;
    public final zw D0;
    public final int[] D1;
    public long D2;
    public final ImageView E;
    public final ax E0;
    public int E1;
    public final oe.b E2;
    public AnimatorSet F;
    public qz F0;
    public int F1;
    public ArrayList F2;
    public AnimatorSet G;
    public final cx G0;
    public int G1;
    public Drawable G2;
    public float H;
    public final ph.d H0;
    public int H1;
    public int H2;
    public final ux I;
    public boolean I0;
    public int I1;
    public int I2;
    public final px J;
    public boolean J0;
    public TLRPC.ChatFull J1;
    public int J2;
    public final bh.p K;
    public boolean K0;
    public boolean K1;
    public int K2;
    public final ph.b L;
    public final ky L0;
    public int L1;
    public boolean L2;
    public final bh.p M;
    public AnimatorSet M0;
    public final ag.w0 M1;
    public NotificationCenter.ObserversGroup M2;
    public final ph.b N;
    public final bi.md N0;
    public boolean N1;
    public AnimatorSet N2;
    public final View O;
    public wx O0;
    public int O1;
    public e2.o0 O2;
    public final dy P;
    public boolean P0;
    public boolean P1;
    public final lw P2;
    public final qx Q;
    public final int[] Q0;
    public boolean Q1;
    public boolean Q2;
    public final zx R;
    public final ObjectAnimator[] R0;
    public bz R1;
    public boolean R2;
    public final sy S;
    public boolean S0;
    public float S1;
    public qz T;
    public ig.f1 T0;
    public float T1;
    public final ph.d U;
    public boolean U0;
    public float U1;
    public final rw V;
    public boolean V0;
    public float V1;
    public AnimatorSet W;
    public String[] W0;
    public float W1;
    public final Drawable[] X0;
    public boolean X1;
    public final Drawable[] Y0;
    public final org.telegram.ui.ActionBar.r2 Y1;
    public final Drawable[] Z0;
    public final org.telegram.ui.ActionBar.u6 Z1;
    public final oe.b a;
    public final pl0 a0;
    public final String[] a1;
    public final org.telegram.ui.ActionBar.k6 a2;
    public final oe.b b;
    public final pl0 b0;
    public final int b1;
    public final org.telegram.ui.ActionBar.k6 b2;
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
    public final m.g3 f2;
    public final tw g0;
    public boolean g1;
    public final lx g2;
    public final fx h;
    public final uw h0;
    public TLRPC.TL_messages_stickerSet h1;
    public boolean h2;
    public final yy i0;
    public ArrayList i1;
    public final boolean i2;
    public final xy j0;
    public ArrayList j1;
    public final ch.f j2;
    public final az k0;
    public ArrayList k1;
    public final kh k2;
    public final HashMap l0;
    public ArrayList l1;
    public final hh.c l2;
    public final pw m0;
    public final ArrayList m1;
    public final ch.b m2;
    public final FrameLayout n;
    public final xy n0;
    public final ArrayList n1;
    public final oi.q n2;
    public final ww o0;
    public final ArrayList o1;
    public boolean o2;
    public final xx p0;
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
    public ty t1;
    public int t2;
    public boolean u0;
    public long u1;
    public int u2;
    public final View v;
    public boolean v0;
    public boolean v1;
    public long v2;
    public final wd0 w;
    public boolean w0;
    public boolean w1;
    public boolean w2;
    public final gx x;
    public final xw x0;
    public final TLRPC.StickerSetCovered[] x1;
    public boolean x2;
    public final ImageView y;
    public final jz y0;
    public final LongSparseArray y1;
    public final Rect y2;
    public final nz z0;
    public final LongSparseArray z1;
    public final GradientDrawable z2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v51, types: [org.telegram.ui.Components.pw, org.telegram.ui.Components.zl0] */
    /* JADX WARN: Type inference failed for: r9v22, types: [org.telegram.ui.Components.pw, org.telegram.ui.Components.zl0] */
    public sz(org.telegram.ui.ActionBar.r2 r2Var, boolean z10, boolean z11, boolean z12, Context context, boolean z13, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z14, final org.telegram.ui.ActionBar.u6 u6Var, boolean z15, boolean z16) {
        super(context);
        org.telegram.ui.ActionBar.k6 k6Var;
        int A;
        zx zxVar;
        lw lwVar;
        boolean z17;
        int i10;
        boolean z18;
        final org.telegram.ui.ActionBar.u6 u6Var2;
        oi.q qVar;
        int i11;
        int i12;
        boolean z19;
        Field field;
        ds dsVar = ds.h;
        this.a = new oe.b(0, this, dsVar, 320L, false);
        this.b = new oe.b(1, this, dsVar, 320L, false);
        this.c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = new ArrayList();
        this.c0 = true;
        this.k0 = new az(this);
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
        this.f2 = new m.g3(this, 16);
        this.g2 = new lx(this);
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
        this.E2 = new oe.b(0, new mw(this, 3), dsVar, 380L, true);
        this.P2 = new lw(this, 1);
        this.Q2 = false;
        this.u0 = z14;
        this.Y1 = r2Var;
        this.c2 = z10;
        this.Z1 = u6Var;
        this.i2 = z16;
        hh.c cVar = new hh.c();
        this.l2 = cVar;
        cVar.a(A(org.telegram.ui.ActionBar.y6.d6));
        if (z15) {
            u(true);
        }
        i0.a.o(A(org.telegram.ui.ActionBar.y6.Wk), 30);
        int dp = AndroidUtilities.dp(50.0f);
        this.b1 = dp;
        this.d0 = z13;
        this.X0 = new Drawable[]{org.telegram.ui.ActionBar.y6.V(context, R.drawable.smiles_tab_smiles, z16 ? v(0.4f) : A(org.telegram.ui.ActionBar.y6.Re), z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.y6.Oe)), org.telegram.ui.ActionBar.y6.V(context, R.drawable.smiles_tab_gif, z16 ? v(0.4f) : A(org.telegram.ui.ActionBar.y6.Re), z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.y6.Oe)), org.telegram.ui.ActionBar.y6.V(context, R.drawable.smiles_tab_stickers, z16 ? v(0.4f) : A(org.telegram.ui.ActionBar.y6.Re), z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.y6.Oe))};
        org.telegram.ui.ActionBar.k6 V = org.telegram.ui.ActionBar.y6.V(context, R.drawable.msg_emoji_recent, z16 ? v(0.4f) : A(org.telegram.ui.ActionBar.y6.Me), z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.y6.Oe));
        org.telegram.ui.ActionBar.k6 V2 = org.telegram.ui.ActionBar.y6.V(context, R.drawable.emoji_tabs_faves, z16 ? v(0.4f) : A(org.telegram.ui.ActionBar.y6.Me), z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.y6.Oe));
        org.telegram.ui.ActionBar.k6 V3 = org.telegram.ui.ActionBar.y6.V(context, R.drawable.emoji_tabs_new3, z16 ? v(0.4f) : A(org.telegram.ui.ActionBar.y6.Me), z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.y6.Oe));
        int i14 = R.drawable.emoji_tabs_new1;
        if (z16) {
            k6Var = V3;
            A = v(0.4f);
        } else {
            k6Var = V3;
            A = A(org.telegram.ui.ActionBar.y6.Me);
        }
        org.telegram.ui.ActionBar.k6 V4 = org.telegram.ui.ActionBar.y6.V(context, i14, A, z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.y6.Oe));
        this.a2 = V4;
        int i15 = R.drawable.emoji_tabs_new2;
        int i16 = org.telegram.ui.ActionBar.y6.Qe;
        org.telegram.ui.ActionBar.k6 V5 = org.telegram.ui.ActionBar.y6.V(context, i15, A(i16), A(i16));
        this.b2 = V5;
        this.Y0 = new Drawable[]{V, V2, k6Var, new LayerDrawable(new Drawable[]{V4, V5})};
        this.Z0 = new Drawable[]{org.telegram.ui.ActionBar.y6.V(context, R.drawable.msg_emoji_recent, z16 ? v(0.4f) : A(org.telegram.ui.ActionBar.y6.Me), z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.y6.Oe)), org.telegram.ui.ActionBar.y6.V(context, R.drawable.stickers_gifs_trending, z16 ? v(0.4f) : A(org.telegram.ui.ActionBar.y6.Me), z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.y6.Oe))};
        this.a1 = new String[]{LocaleController.getString(R.string.Emoji1), LocaleController.getString(R.string.Emoji2), LocaleController.getString(R.string.Emoji3), LocaleController.getString(R.string.Emoji4), LocaleController.getString(R.string.Emoji5), LocaleController.getString(R.string.Emoji6), LocaleController.getString(R.string.Emoji7), LocaleController.getString(R.string.Emoji8)};
        this.J1 = chatFull;
        Paint paint = new Paint(1);
        this.s1 = paint;
        paint.setColor(A(org.telegram.ui.ActionBar.y6.af));
        float dp2 = AndroidUtilities.dp(6.0f);
        ag.v0 v0Var = ag.z0.a;
        this.M1 = new ag.w0(dp2);
        px pxVar = new px(this, context);
        this.J = pxVar;
        oz ozVar = new oz();
        ozVar.a = 0;
        ozVar.b = pxVar;
        arrayList.add(ozVar);
        if (z10) {
            MediaDataController.getInstance(i13).checkStickers(5);
            MediaDataController.getInstance(i13).checkFeaturedEmoji();
            this.e2 = new PorterDuffColorFilter(A(org.telegram.ui.ActionBar.y6.Oh), PorterDuff.Mode.SRC_IN);
        }
        dy dyVar = new dy(this, context);
        this.P = dyVar;
        qVar2.b(dyVar);
        s4.l lVar = new s4.l();
        lVar.c = 220L;
        lVar.e = 220L;
        lVar.f = 160L;
        lVar.g = 160L;
        lVar.i = ds.g;
        dyVar.setItemAnimator(lVar);
        final int i17 = 0;
        dyVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.nw
            public final /* synthetic */ sz b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (i17) {
                    case 0:
                        org.telegram.ui.ft o10 = org.telegram.ui.ft.o();
                        sz szVar = this.b;
                        dy dyVar2 = szVar.P;
                        szVar.getMeasuredHeight();
                        return o10.q(motionEvent, dyVar2, null, szVar.g2, u6Var);
                    case 1:
                        org.telegram.ui.ft o11 = org.telegram.ui.ft.o();
                        sz szVar2 = this.b;
                        return o11.q(motionEvent, szVar2.h0, szVar2.m0, szVar2.g2, u6Var);
                    default:
                        org.telegram.ui.ft o12 = org.telegram.ui.ft.o();
                        sz szVar3 = this.b;
                        zw zwVar = szVar3.D0;
                        szVar3.getMeasuredHeight();
                        return o12.q(motionEvent, zwVar, szVar3.A0, szVar3.g2, u6Var);
                }
            }
        });
        dyVar.setOnItemLongClickListener(new mw(this, 1));
        dyVar.setInstantClick(true);
        qx qxVar = new qx(this);
        this.Q = qxVar;
        dyVar.setLayoutManager(qxVar);
        dyVar.setTopGlowOffset(AndroidUtilities.dp(38.0f));
        dyVar.setBottomGlowOffset(AndroidUtilities.dp(36.0f));
        dyVar.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f));
        int i18 = org.telegram.ui.ActionBar.y6.He;
        org.telegram.ui.ActionBar.f7.m(dyVar, 21, i18, u6Var);
        dyVar.setItemSelectorColorProvider(new f2(26));
        dyVar.setClipToPadding(false);
        qxVar.O = new rx(this);
        zx zxVar2 = new zx(this);
        this.R = zxVar2;
        dyVar.setAdapter(zxVar2);
        dyVar.i(new fi.p1(this, 3));
        this.S = new sy(this, context);
        pxVar.addView(dyVar, gb1.g(-1.0f, -1));
        pl0 pl0Var = new pl0(dyVar, qxVar);
        this.b0 = pl0Var;
        pl0Var.i = new sx(this);
        dyVar.setOnScrollListener(new tx(this));
        if (r2Var != null) {
            zxVar = zxVar2;
            lwVar = new lw(this, 2);
            z17 = z10;
            i10 = -1;
            z18 = z16;
            qVar = qVar2;
            i11 = 5;
            u6Var2 = u6Var;
        } else {
            zxVar = zxVar2;
            lwVar = null;
            z17 = z10;
            i10 = -1;
            z18 = z16;
            u6Var2 = u6Var;
            qVar = qVar2;
            i11 = 5;
        }
        ux uxVar = new ux(this, context, u6Var2, z17, lwVar, z18);
        this.I = uxVar;
        if (z13) {
            rw rwVar = new rw(this, context);
            this.V = rwVar;
            pxVar.addView(rwVar, new FrameLayout.LayoutParams(i10, AndroidUtilities.getShadowHeight() + dp));
            rwVar.d.setOnFocusChangeListener(new sw(this));
            ph.d dVar = new ph.d(context, u6Var2);
            this.U = dVar;
            dVar.setVisibility(8);
            final int i19 = 0;
            dVar.setOnBackClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ow
                public final /* synthetic */ sz b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i19) {
                        case 0:
                            sy syVar = this.b.S;
                            ly lyVar = syVar.c;
                            int childCount = lyVar.getChildCount();
                            for (int i20 = 0; i20 < childCount; i20++) {
                                ((ph.c) lyVar.getChildAt(i20)).a(false, true);
                            }
                            syVar.d = 0L;
                            syVar.F.b.a(false, true);
                            syVar.l();
                            break;
                        case 1:
                            nz nzVar = this.b.z0;
                            mz mzVar = nzVar.c;
                            int childCount2 = mzVar.getChildCount();
                            for (int i21 = 0; i21 < childCount2; i21++) {
                                ((ph.c) mzVar.getChildAt(i21)).a(false, true);
                            }
                            nzVar.d = 0L;
                            nzVar.Q.a.a(false, true);
                            nzVar.l();
                            break;
                        case 2:
                            ty tyVar = this.b.t1;
                            if (tyVar != null) {
                                tyVar.w();
                                break;
                            }
                            break;
                        default:
                            sz szVar = this.b;
                            int currentItem = szVar.h.getCurrentItem();
                            fz fzVar = currentItem == 0 ? szVar.V : currentItem == 1 ? szVar.o0 : szVar.G0;
                            if (fzVar != null) {
                                uq uqVar = fzVar.d;
                                uqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                uqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                uqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
            pxVar.addView(dVar, new FrameLayout.LayoutParams(i10, dp));
        }
        if (Color.alpha(A(i18)) >= 255) {
            org.telegram.ui.ActionBar.f7.i(i18, uxVar, u6Var2);
        }
        zxVar.G(true);
        uxVar.p(getEmojipacks());
        pxVar.addView(uxVar, gb1.g(36.0f, i10));
        View view = new View(context);
        this.O = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i20 = org.telegram.ui.ActionBar.y6.Ke;
        org.telegram.ui.ActionBar.f7.i(i20, view, u6Var2);
        zx zxVar3 = zxVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i10, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(36.0f);
        pxVar.addView(view, layoutParams);
        ph.b bVar = new ph.b(context, u6Var2);
        this.L = bVar;
        bh.p pVar = new bh.p(context, u6Var2);
        this.K = pVar;
        pVar.setVisibility(8);
        pVar.addView(bVar, gb1.h(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
        pxVar.addView(pVar, gb1.i(i10, -2, 80));
        if (z11) {
            on0 on0Var = on0.b;
            if (z12) {
                tw twVar = new tw(this, context);
                this.g0 = twVar;
                oz ozVar2 = new oz();
                ozVar2.a = 1;
                ozVar2.b = twVar;
                this.d.add(ozVar2);
                uw uwVar = new uw(this, context);
                this.h0 = uwVar;
                qVar.b(uwVar);
                uwVar.setClipToPadding(false);
                yy yyVar = new yy(this);
                this.i0 = yyVar;
                uwVar.setLayoutManager(yyVar);
                uwVar.i(new vw(this));
                uwVar.setPadding(0, dp, 0, AndroidUtilities.dp(44.0f) + this.q2);
                ((s4.g1) uwVar.getItemAnimator()).m = false;
                final int i21 = 1;
                xy xyVar = new xy(this, context, true, ConnectionsManager.DEFAULT_DATACENTER_ID);
                this.n0 = xyVar;
                uwVar.setAdapter(xyVar);
                this.j0 = new xy(this, context, false, 0);
                uwVar.setOnScrollListener(new rz(this, 2));
                uwVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.nw
                    public final /* synthetic */ sz b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (i21) {
                            case 0:
                                org.telegram.ui.ft o10 = org.telegram.ui.ft.o();
                                sz szVar = this.b;
                                dy dyVar2 = szVar.P;
                                szVar.getMeasuredHeight();
                                return o10.q(motionEvent, dyVar2, null, szVar.g2, u6Var2);
                            case 1:
                                org.telegram.ui.ft o11 = org.telegram.ui.ft.o();
                                sz szVar2 = this.b;
                                return o11.q(motionEvent, szVar2.h0, szVar2.m0, szVar2.g2, u6Var2);
                            default:
                                org.telegram.ui.ft o12 = org.telegram.ui.ft.o();
                                sz szVar3 = this.b;
                                zw zwVar = szVar3.D0;
                                szVar3.getMeasuredHeight();
                                return o12.q(motionEvent, zwVar, szVar3.A0, szVar3.g2, u6Var2);
                        }
                    }
                });
                final int i22 = 0;
                ?? r92 = new zl0(this) { // from class: org.telegram.ui.Components.pw
                    public final /* synthetic */ sz b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.ui.Components.zl0
                    public final void c(int i23, View view2) {
                        switch (i22) {
                            case 0:
                                sz szVar = this.b;
                                uw uwVar2 = szVar.h0;
                                xy xyVar2 = szVar.j0;
                                xy xyVar3 = szVar.n0;
                                if (szVar.t1 != null) {
                                    xyVar3.getClass();
                                    ArrayList arrayList2 = xyVar3.x;
                                    if (uwVar2.getAdapter() != xyVar3) {
                                        if (uwVar2.getAdapter() == xyVar2 && i23 >= 0 && i23 < xyVar2.x.size()) {
                                            szVar.t1.v(view2, xyVar2.x.get(i23), xyVar2.w, xyVar2.n, true, 0, 0);
                                            szVar.W();
                                            break;
                                        }
                                    } else if (i23 >= 0) {
                                        int i24 = xyVar3.H;
                                        if (i23 >= i24) {
                                            int i25 = i24 > 0 ? (i23 - i24) - 1 : i23;
                                            if (i25 >= 0 && i25 < arrayList2.size()) {
                                                szVar.t1.v(view2, arrayList2.get(i25), null, xyVar3.n, true, 0, 0);
                                                break;
                                            }
                                        } else {
                                            szVar.t1.v(view2, szVar.i1.get(i23), null, "gif", true, 0, 0);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                sz szVar2 = this.b;
                                s4.h0 adapter = szVar2.D0.getAdapter();
                                nz nzVar = szVar2.z0;
                                String str = adapter == nzVar ? nzVar.N : null;
                                if (view2 instanceof org.telegram.ui.Cells.i8) {
                                    org.telegram.ui.Cells.i8 i8Var = (org.telegram.ui.Cells.i8) view2;
                                    if (i8Var.getSticker() != null && MessageObject.isPremiumSticker(i8Var.getSticker()) && !AccountInstance.getInstance(szVar2.c1).getUserConfig().isPremium()) {
                                        org.telegram.ui.ft.o().w(i8Var);
                                        break;
                                    } else {
                                        org.telegram.ui.ft.o().s();
                                        if (!i8Var.r) {
                                            i8Var.r = true;
                                            i8Var.n = 0.5f;
                                            i8Var.x = 0L;
                                            org.telegram.ui.Cells.h8 h8Var = i8Var.a;
                                            h8Var.setAlpha(0.5f * i8Var.H);
                                            h8Var.invalidate();
                                            i8Var.s = System.currentTimeMillis();
                                            i8Var.invalidate();
                                            szVar2.t1.m(i8Var, i8Var.getSticker(), str, i8Var.getParentObject(), i8Var.getSendAnimationData(), true, 0);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                };
                this.m0 = r92;
                uwVar.setOnItemClickListener((zl0) r92);
                twVar.addView(uwVar, gb1.g(-1.0f, -1));
                ww wwVar = new ww(this, context);
                this.o0 = wwVar;
                twVar.addView(wwVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
                xx xxVar = new xx(this, context, u6Var2);
                this.p0 = xxVar;
                xxVar.setType(on0Var);
                xxVar.setUnderlineHeight(AndroidUtilities.getShadowHeight());
                xxVar.setIndicatorColor(A(i16));
                xxVar.setUnderlineColor(A(i20));
                org.telegram.ui.ActionBar.f7.i(i18, xxVar, u6Var2);
                V();
                xxVar.setDelegate(new mw(this, 2));
                xyVar.F("", "", true, true, true);
            }
            xw xwVar = new xw(this, context, z14);
            this.x0 = xwVar;
            MediaDataController.getInstance(this.c1).checkStickers(0);
            MediaDataController.getInstance(this.c1).checkFeaturedStickers();
            zw zwVar = new zw(this, context);
            this.D0 = zwVar;
            this.n2.b(zwVar);
            ax axVar = new ax(this);
            this.E0 = axVar;
            zwVar.setLayoutManager(axVar);
            axVar.O = new bx(this);
            zwVar.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f));
            zwVar.setClipToPadding(false);
            oz ozVar3 = new oz();
            ozVar3.a = 2;
            ozVar3.b = xwVar;
            this.d.add(ozVar3);
            this.z0 = new nz(this, context);
            jz jzVar = new jz(this, context);
            this.y0 = jzVar;
            zwVar.setAdapter(jzVar);
            final int i23 = 2;
            zwVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.nw
                public final /* synthetic */ sz b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (i23) {
                        case 0:
                            org.telegram.ui.ft o10 = org.telegram.ui.ft.o();
                            sz szVar = this.b;
                            dy dyVar2 = szVar.P;
                            szVar.getMeasuredHeight();
                            return o10.q(motionEvent, dyVar2, null, szVar.g2, u6Var2);
                        case 1:
                            org.telegram.ui.ft o11 = org.telegram.ui.ft.o();
                            sz szVar2 = this.b;
                            return o11.q(motionEvent, szVar2.h0, szVar2.m0, szVar2.g2, u6Var2);
                        default:
                            org.telegram.ui.ft o12 = org.telegram.ui.ft.o();
                            sz szVar3 = this.b;
                            zw zwVar2 = szVar3.D0;
                            szVar3.getMeasuredHeight();
                            return o12.q(motionEvent, zwVar2, szVar3.A0, szVar3.g2, u6Var2);
                    }
                }
            });
            final int i24 = 1;
            ?? r42 = new zl0(this) { // from class: org.telegram.ui.Components.pw
                public final /* synthetic */ sz b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.Components.zl0
                public final void c(int i232, View view2) {
                    switch (i24) {
                        case 0:
                            sz szVar = this.b;
                            uw uwVar2 = szVar.h0;
                            xy xyVar2 = szVar.j0;
                            xy xyVar3 = szVar.n0;
                            if (szVar.t1 != null) {
                                xyVar3.getClass();
                                ArrayList arrayList2 = xyVar3.x;
                                if (uwVar2.getAdapter() != xyVar3) {
                                    if (uwVar2.getAdapter() == xyVar2 && i232 >= 0 && i232 < xyVar2.x.size()) {
                                        szVar.t1.v(view2, xyVar2.x.get(i232), xyVar2.w, xyVar2.n, true, 0, 0);
                                        szVar.W();
                                        break;
                                    }
                                } else if (i232 >= 0) {
                                    int i242 = xyVar3.H;
                                    if (i232 >= i242) {
                                        int i25 = i242 > 0 ? (i232 - i242) - 1 : i232;
                                        if (i25 >= 0 && i25 < arrayList2.size()) {
                                            szVar.t1.v(view2, arrayList2.get(i25), null, xyVar3.n, true, 0, 0);
                                            break;
                                        }
                                    } else {
                                        szVar.t1.v(view2, szVar.i1.get(i232), null, "gif", true, 0, 0);
                                        break;
                                    }
                                }
                            }
                            break;
                        default:
                            sz szVar2 = this.b;
                            s4.h0 adapter = szVar2.D0.getAdapter();
                            nz nzVar = szVar2.z0;
                            String str = adapter == nzVar ? nzVar.N : null;
                            if (view2 instanceof org.telegram.ui.Cells.i8) {
                                org.telegram.ui.Cells.i8 i8Var = (org.telegram.ui.Cells.i8) view2;
                                if (i8Var.getSticker() != null && MessageObject.isPremiumSticker(i8Var.getSticker()) && !AccountInstance.getInstance(szVar2.c1).getUserConfig().isPremium()) {
                                    org.telegram.ui.ft.o().w(i8Var);
                                    break;
                                } else {
                                    org.telegram.ui.ft.o().s();
                                    if (!i8Var.r) {
                                        i8Var.r = true;
                                        i8Var.n = 0.5f;
                                        i8Var.x = 0L;
                                        org.telegram.ui.Cells.h8 h8Var = i8Var.a;
                                        h8Var.setAlpha(0.5f * i8Var.H);
                                        h8Var.invalidate();
                                        i8Var.s = System.currentTimeMillis();
                                        i8Var.invalidate();
                                        szVar2.t1.m(i8Var, i8Var.getSticker(), str, i8Var.getParentObject(), i8Var.getSendAnimationData(), true, 0);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            };
            this.A0 = r42;
            zwVar.setOnItemClickListener((zl0) r42);
            org.telegram.ui.ActionBar.f7.m(zwVar, 21, i18, u6Var2);
            xwVar.addView(zwVar);
            this.a0 = new pl0(zwVar, axVar);
            cx cxVar = new cx(this, context);
            this.G0 = cxVar;
            xwVar.addView(cxVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
            ph.d dVar2 = new ph.d(context, u6Var2);
            this.H0 = dVar2;
            dVar2.setVisibility(8);
            final int i25 = 1;
            dVar2.setOnBackClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ow
                public final /* synthetic */ sz b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i25) {
                        case 0:
                            sy syVar = this.b.S;
                            ly lyVar = syVar.c;
                            int childCount = lyVar.getChildCount();
                            for (int i202 = 0; i202 < childCount; i202++) {
                                ((ph.c) lyVar.getChildAt(i202)).a(false, true);
                            }
                            syVar.d = 0L;
                            syVar.F.b.a(false, true);
                            syVar.l();
                            break;
                        case 1:
                            nz nzVar = this.b.z0;
                            mz mzVar = nzVar.c;
                            int childCount2 = mzVar.getChildCount();
                            for (int i212 = 0; i212 < childCount2; i212++) {
                                ((ph.c) mzVar.getChildAt(i212)).a(false, true);
                            }
                            nzVar.d = 0L;
                            nzVar.Q.a.a(false, true);
                            nzVar.l();
                            break;
                        case 2:
                            ty tyVar = this.b.t1;
                            if (tyVar != null) {
                                tyVar.w();
                                break;
                            }
                            break;
                        default:
                            sz szVar = this.b;
                            int currentItem = szVar.h.getCurrentItem();
                            fz fzVar = currentItem == 0 ? szVar.V : currentItem == 1 ? szVar.o0 : szVar.G0;
                            if (fzVar != null) {
                                uq uqVar = fzVar.d;
                                uqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                uqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                uqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
            xwVar.addView(dVar2, new FrameLayout.LayoutParams(-1, dp));
            z19 = z14;
            i12 = 80;
            dx dxVar = new dx(this, context, u6Var2, r2Var, z19);
            this.B0 = dxVar;
            dxVar.setDragEnabled(true);
            dxVar.setWillNotDraw(false);
            dxVar.setType(on0Var);
            dxVar.setUnderlineHeight(zwVar.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
            dxVar.setIndicatorColor(A(i16));
            dxVar.setUnderlineColor(A(i20));
            if (viewGroup == null || !z19) {
                xwVar.addView(dxVar, gb1.i(-1, 36, 51));
            } else {
                ex exVar = new ex(this, context);
                this.C0 = exVar;
                exVar.addView(dxVar, gb1.i(-1, 36, 51));
                viewGroup.addView(exVar, gb1.g(-2.0f, -1));
            }
            X(true);
            dxVar.setDelegate(new mw(this, 4));
            zwVar.setOnScrollListener(new rz(this, 0));
            ph.b bVar2 = new ph.b(context, u6Var2);
            this.N = bVar2;
            bh.p pVar2 = new bh.p(context, u6Var2);
            this.M = pVar2;
            pVar2.setVisibility(8);
            pVar2.addView(bVar2, gb1.h(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
            xwVar.addView(pVar2, gb1.i(-1, -2, 80));
        } else {
            i12 = 80;
            z19 = z14;
        }
        this.e.clear();
        this.e.addAll(this.d);
        fx fxVar = new fx(this, context);
        this.h = fxVar;
        oi.q qVar3 = this.n2;
        qVar3.getClass();
        fxVar.b(new oi.i(qVar3, fxVar));
        fxVar.setOverScrollMode(2);
        ky kyVar = new ky(this);
        this.L0 = kyVar;
        fxVar.setAdapter(kyVar);
        gx gxVar = new gx(this, context);
        this.x = gxVar;
        gxVar.setHapticFeedbackEnabled(true);
        gxVar.setImageResource(R.drawable.smiles_tab_clear);
        int v = z16 ? v(0.6f) : A(org.telegram.ui.ActionBar.y6.Re);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        gxVar.setColorFilter(new PorterDuffColorFilter(v, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        gxVar.setScaleType(scaleType);
        gxVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        gxVar.setFocusable(true);
        gxVar.setOnClickListener(new hx());
        gb1.b(gxVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        if (z13) {
            addView(frameLayout, gb1.h(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, (AndroidUtilities.getShadowHeight() / AndroidUtilities.density) + 40.0f));
        } else {
            addView(frameLayout, gb1.h(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.s = frameLayout2;
        addView(frameLayout2, gb1.h(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.n = frameLayout3;
        View view2 = new View(context);
        this.v = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(40.0f), 83));
        if (z13) {
            addView(frameLayout3, gb1.i(-1, 48, i12));
            frameLayout3.addView(gxVar, gb1.h(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
            if (z11) {
                ImageView imageView = new ImageView(context);
                this.y = imageView;
                imageView.setImageResource(R.drawable.smiles_tab_settings);
                imageView.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : A(org.telegram.ui.ActionBar.y6.Re), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(LocaleController.getString(R.string.Settings));
                gb1.b(imageView);
                frameLayout3.addView(imageView, gb1.h(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
                final int i26 = 2;
                imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ow
                    public final /* synthetic */ sz b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i26) {
                            case 0:
                                sy syVar = this.b.S;
                                ly lyVar = syVar.c;
                                int childCount = lyVar.getChildCount();
                                for (int i202 = 0; i202 < childCount; i202++) {
                                    ((ph.c) lyVar.getChildAt(i202)).a(false, true);
                                }
                                syVar.d = 0L;
                                syVar.F.b.a(false, true);
                                syVar.l();
                                break;
                            case 1:
                                nz nzVar = this.b.z0;
                                mz mzVar = nzVar.c;
                                int childCount2 = mzVar.getChildCount();
                                for (int i212 = 0; i212 < childCount2; i212++) {
                                    ((ph.c) mzVar.getChildAt(i212)).a(false, true);
                                }
                                nzVar.d = 0L;
                                nzVar.Q.a.a(false, true);
                                nzVar.l();
                                break;
                            case 2:
                                ty tyVar = this.b.t1;
                                if (tyVar != null) {
                                    tyVar.w();
                                    break;
                                }
                                break;
                            default:
                                sz szVar = this.b;
                                int currentItem = szVar.h.getCurrentItem();
                                fz fzVar = currentItem == 0 ? szVar.V : currentItem == 1 ? szVar.o0 : szVar.G0;
                                if (fzVar != null) {
                                    uq uqVar = fzVar.d;
                                    uqVar.requestFocus();
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                    uqVar.onTouchEvent(obtain);
                                    obtain.recycle();
                                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                    uqVar.onTouchEvent(obtain2);
                                    obtain2.recycle();
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
            wd0 wd0Var = new wd0(context, u6Var2);
            this.w = wd0Var;
            wd0Var.setViewPager(fxVar);
            wd0Var.setShouldExpand(false);
            wd0Var.setIndicatorHeight(AndroidUtilities.dp(3.0f));
            wd0Var.setIndicatorColor(i0.a.o(A(org.telegram.ui.ActionBar.y6.Oe), 20));
            wd0Var.setUnderlineHeight(0);
            wd0Var.setTabPaddingLeftRight(AndroidUtilities.dp(11.0f));
            wd0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
            frameLayout3.addView(wd0Var, gb1.i(-2, 48, 81));
            wd0Var.setOnPageChangeListener(new ix(this, z19));
            ImageView imageView2 = new ImageView(context);
            this.E = imageView2;
            imageView2.setImageResource(R.drawable.smiles_tab_search);
            imageView2.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : A(org.telegram.ui.ActionBar.y6.Re), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(LocaleController.getString(R.string.Search));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, gb1.h(48, 48.0f, 83, 2.0f, 0.0f, 2.0f, 0.0f));
            final int i27 = 3;
            imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ow
                public final /* synthetic */ sz b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view22) {
                    switch (i27) {
                        case 0:
                            sy syVar = this.b.S;
                            ly lyVar = syVar.c;
                            int childCount = lyVar.getChildCount();
                            for (int i202 = 0; i202 < childCount; i202++) {
                                ((ph.c) lyVar.getChildAt(i202)).a(false, true);
                            }
                            syVar.d = 0L;
                            syVar.F.b.a(false, true);
                            syVar.l();
                            break;
                        case 1:
                            nz nzVar = this.b.z0;
                            mz mzVar = nzVar.c;
                            int childCount2 = mzVar.getChildCount();
                            for (int i212 = 0; i212 < childCount2; i212++) {
                                ((ph.c) mzVar.getChildAt(i212)).a(false, true);
                            }
                            nzVar.d = 0L;
                            nzVar.Q.a.a(false, true);
                            nzVar.l();
                            break;
                        case 2:
                            ty tyVar = this.b.t1;
                            if (tyVar != null) {
                                tyVar.w();
                                break;
                            }
                            break;
                        default:
                            sz szVar = this.b;
                            int currentItem = szVar.h.getCurrentItem();
                            fz fzVar = currentItem == 0 ? szVar.V : currentItem == 1 ? szVar.o0 : szVar.G0;
                            if (fzVar != null) {
                                uq uqVar = fzVar.d;
                                uqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                uqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                uqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            addView(frameLayout3, gb1.h(56, 48.0f, (LocaleController.isRTL ? 3 : i11) | 80, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.y6.i0(AndroidUtilities.dp(56.0f), A(i18), A(i18));
            gb1.b(gxVar);
            gxVar.setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
            gxVar.setBackground(i02);
            gxVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
            gxVar.setFocusable(true);
            frameLayout3.addView(gxVar, gb1.h(48, 48.0f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
            view2.setVisibility(8);
        }
        addView(fxVar, 0, gb1.i(-1, -1, 51));
        bi.md mdVar = new bi.md(context, 22);
        this.N0 = mdVar;
        int dp3 = AndroidUtilities.dp(6.0f);
        int i28 = org.telegram.ui.ActionBar.y6.qf;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp3, A(i28));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i28);
        mdVar.setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(mdVar, c02, N, null, u6Var2);
        org.telegram.ui.ActionBar.f7.V(mdVar, org.telegram.ui.ActionBar.y6.pf, u6Var2);
        mdVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f));
        mdVar.setGravity(16);
        mdVar.setTextSize(1, 14.0f);
        mdVar.setVisibility(4);
        addView(mdVar, gb1.h(-2, -2.0f, 81, 5.0f, 0.0f, 5.0f, 53.0f));
        this.C1 = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 32.0f);
        Field field2 = fv.f;
        fv fvVar = new fv(new ev(context, u6Var2));
        if (fv.f == null) {
            try {
                field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    field.setAccessible(true);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                field = null;
            }
            fv.f = field;
        }
        Field field3 = fv.f;
        if (field3 != null) {
            try {
                fvVar.a = (ViewTreeObserver.OnScrollChangedListener) field3.get(fvVar);
                fv.f.set(fvVar, fv.g);
            } catch (Exception unused3) {
                fvVar.a = null;
            }
        }
        this.B1 = fvVar;
        fvVar.c.setOnSelectionUpdateListener(new d(this, 10));
        this.A1 = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
        Emoji.loadRecentEmoji();
        zxVar3.F(false);
        I(true, z11, z12, false);
        if (Build.VERSION.SDK_INT >= 31) {
            ch.f fVar = new ch.f();
            this.j2 = fVar;
            this.n2.a(fVar);
            hh.d dVar3 = new hh.d(null);
            dVar3.f = this.l2;
            dVar3.d = fVar;
            dVar3.e = -2;
            ch.b bVar3 = new ch.b(dVar3);
            this.m2 = bVar3;
            bVar3.i = LiteMode.isEnabled(262144);
            int dp4 = AndroidUtilities.dp(LiteMode.isEnabled(262144) ? 8.0f : 48.0f);
            bVar3.b = dp4;
            bVar3.c = dp4;
            bVar3.h = this.n2;
        } else {
            ch.b bVar4 = new ch.b(this.l2);
            this.m2 = bVar4;
            bVar4.h = this.n2;
            this.j2 = null;
        }
        this.k2 = new kh(this, 1);
        setBlurredBackgroundDrawableFactory(this.m2);
        this.n2.i(this);
        this.n2.a = new mw(this, 0);
    }

    public static void a(sz szVar, boolean z10) {
        uw uwVar = szVar.h0;
        if (uwVar == null) {
            return;
        }
        int childCount = uwVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = uwVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.d2) {
                ImageReceiver photoImage = ((org.telegram.ui.Cells.d2) childAt).getPhotoImage();
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

    public static void b(sz szVar, bz bzVar, String str) {
        String str2;
        ty tyVar;
        org.telegram.ui.ActionBar.r2 r2Var = szVar.Y1;
        int i10 = szVar.c1;
        ArrayList arrayList = szVar.q1;
        if (bzVar == null) {
            return;
        }
        if (bzVar.getSpan() == null) {
            szVar.D2 = SystemClock.elapsedRealtime();
            szVar.M(true);
            String str3 = str != null ? str : (String) bzVar.getTag();
            new SpannableStringBuilder().append((CharSequence) str3);
            if (str != null) {
                ty tyVar2 = szVar.t1;
                if (tyVar2 != null) {
                    tyVar2.l(Emoji.fixEmoji(str));
                    return;
                }
                return;
            }
            if (!bzVar.c && (str2 = Emoji.emojiColor.get(str3)) != null) {
                str3 = g(str3, str2);
            }
            szVar.h(str3);
            ty tyVar3 = szVar.t1;
            if (tyVar3 != null) {
                tyVar3.l(Emoji.fixEmoji(str3));
                return;
            }
            return;
        }
        if (szVar.t1 != null) {
            long j10 = bzVar.getSpan().documentId;
            TLRPC.Document document = bzVar.getSpan().document;
            ey eyVar = bzVar.e;
            boolean z10 = eyVar != null && eyVar.i;
            if (document == null) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ey eyVar2 = (ey) arrayList.get(i11);
                    int i12 = 0;
                    while (true) {
                        ArrayList arrayList2 = eyVar2.c;
                        if (arrayList2 != null && i12 < arrayList2.size()) {
                            if (((TLRPC.Document) eyVar2.c.get(i12)).id == j10) {
                                document = (TLRPC.Document) eyVar2.c.get(i12);
                                break;
                            }
                            i12++;
                        }
                    }
                }
            }
            if (document == null) {
                document = t5.f(i10, j10);
            }
            TLRPC.Document document2 = document;
            String findAnimatedEmojiEmoticon = document2 != null ? MessageObject.findAnimatedEmojiEmoticon(document2) : null;
            if (MessageObject.isFreeEmoji(document2) || UserConfig.getInstance(i10).isPremium() || (((tyVar = szVar.t1) != null && tyVar.g()) || szVar.U0 || z10)) {
                szVar.D2 = SystemClock.elapsedRealtime();
                szVar.M(true);
                szVar.h("animated_" + j10);
                szVar.t1.x(j10, document2, findAnimatedEmojiEmoticon, bzVar.c);
                return;
            }
            szVar.M(false);
            wc b02 = r2Var != null ? wc.b0(r2Var) : new wc(szVar.r, szVar.Z1);
            if (szVar.h2 || r2Var == null) {
                b02.r(document2, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new lw(szVar, 3)).j();
            } else {
                b02.J(R.raw.saved_messages, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint2)), LocaleController.getString(R.string.Open), new lw(szVar, 4)).j();
            }
            szVar.h2 = !szVar.h2;
        }
    }

    public static void e(sz szVar, int i10, int i11) {
        s4.e1 K;
        int[] iArr = szVar.Q0;
        if (i10 == 1) {
            szVar.n(i11, szVar.P);
            return;
        }
        ty tyVar = szVar.t1;
        if ((tyVar == null || !tyVar.z()) && !szVar.J0) {
            mm0 x9 = szVar.x(i10);
            if (i11 <= 0 || x9 == null || x9.getVisibility() != 0 || (K = x9.K(0)) == null || K.a.getTop() + szVar.b1 < x9.getPaddingTop()) {
                int i12 = iArr[i10] - i11;
                iArr[i10] = i12;
                if (i12 > 0) {
                    iArr[i10] = 0;
                } else if (i12 < (-AndroidUtilities.dp(288.0f))) {
                    iArr[i10] = -AndroidUtilities.dp(288.0f);
                }
                if (i10 == 0) {
                    szVar.Y();
                } else {
                    szVar.y(i10).setTranslationY(Math.max(-AndroidUtilities.dp(48.0f), iArr[i10]));
                }
            }
        }
    }

    public static void f(sz szVar, boolean z10) {
        int N0;
        yy yyVar = szVar.i0;
        ww wwVar = szVar.o0;
        uw uwVar = szVar.h0;
        if (uwVar != null && (uwVar.getAdapter() instanceof xy)) {
            xy xyVar = (xy) uwVar.getAdapter();
            if (!xyVar.s && xyVar.h == 0 && !xyVar.x.isEmpty() && (N0 = yyVar.N0()) != -1 && N0 > yyVar.B() - 5) {
                String str = xyVar.w;
                String str2 = xyVar.r;
                boolean z11 = xyVar.v;
                xyVar.F(str, str2, true, z11, z11);
            }
        }
        ty tyVar = szVar.t1;
        if (tyVar == null || !tyVar.z()) {
            if (wwVar == null || uwVar == null) {
                return;
            }
            wwVar.a.a(true, !z10);
            return;
        }
        s4.e1 K = uwVar.K(0);
        if (K == null) {
            fz.a(wwVar, true, !z10);
        } else {
            fz.a(wwVar, K.a.getTop() < uwVar.getPaddingTop(), !z10);
        }
    }

    public static String g(String str, String str2) {
        boolean z10;
        String str3;
        if (CompoundEmoji.isHandshake(str) != null) {
            return CompoundEmoji.applyColor(str, str2);
        }
        if (Emoji.endsWithRightArrow(str)) {
            str = c3.h0.l(2, 0, str);
            z10 = true;
        } else {
            z10 = false;
        }
        int length = str.length();
        if (length > 2 && str.charAt(str.length() - 2) == 8205) {
            str3 = str.substring(str.length() - 2);
            str = c3.h0.l(2, 0, str);
        } else if (length <= 3 || str.charAt(str.length() - 3) != 8205) {
            str3 = null;
        } else {
            str3 = str.substring(str.length() - 3);
            str = c3.h0.l(3, 0, str);
        }
        String u10 = b10.u(str, str2);
        if (str3 != null) {
            u10 = b10.u(u10, str3);
        }
        return z10 ? b10.u(u10, "\u200d➡") : u10;
    }

    public static void j(int i10, View view) {
        if (view == null) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i10);
    }

    public final int A(int i10) {
        org.telegram.ui.ActionBar.u6 u6Var = this.Z1;
        return u6Var != null ? u6Var.g(i10) : org.telegram.ui.ActionBar.y6.x0(null, i10, false);
    }

    public final void B() {
        cx cxVar = this.G0;
        if (cxVar != null) {
            cxVar.b();
        }
        ww wwVar = this.o0;
        if (wwVar != null) {
            wwVar.b();
        }
        rw rwVar = this.V;
        if (rwVar != null) {
            rwVar.b();
        }
    }

    public final void C(boolean z10, boolean z11) {
        ez ezVar;
        if (this.A1 != 0 && this.w1) {
            this.A1 = 0;
        }
        if (this.A1 == 0 && this.v1) {
            this.A1 = 1;
        }
        int i10 = this.A1;
        fx fxVar = this.h;
        if (i10 == 0 || z10 || this.e.size() == 1) {
            L(true, false);
            Q(false, false);
            if (fxVar.getCurrentItem() != 0) {
                fxVar.x(0, !z10);
            }
            if (z11) {
                AndroidUtilities.runOnUIThread(new lw(this, 5), 350L);
            }
        } else {
            int i11 = this.A1;
            if (i11 == 1) {
                L(false, false);
                Q(this.u0 || this.v0, false);
                if (fxVar.getCurrentItem() != 2) {
                    fxVar.x(2, false);
                }
                dx dxVar = this.B0;
                if (dxVar != null) {
                    this.S0 = true;
                    int i12 = this.G1;
                    if (i12 >= 0) {
                        dxVar.m(i12);
                    } else {
                        int i13 = this.F1;
                        if (i13 >= 0) {
                            dxVar.m(i13);
                        } else {
                            dxVar.m(this.E1);
                        }
                    }
                    this.S0 = false;
                    this.E0.h1(0, 0);
                }
            } else if (i11 == 2) {
                L(false, false);
                Q(false, false);
                if (fxVar.getCurrentItem() != 1) {
                    fxVar.x(1, false);
                }
                xx xxVar = this.p0;
                if (xxVar != null) {
                    xxVar.m(0);
                }
                ww wwVar = this.o0;
                if (wwVar != null && (ezVar = wwVar.r) != null) {
                    ezVar.L1(null);
                }
            }
        }
        M(true);
    }

    public final void D() {
        jz jzVar = this.y0;
        if (jzVar != null) {
            jzVar.l();
        }
        nz nzVar = this.z0;
        if (nzVar != null) {
            nzVar.l();
        }
        if (org.telegram.ui.ft.o().E) {
            org.telegram.ui.ft.o().l();
        }
        org.telegram.ui.ft.o().s();
    }

    @Override // oe.d
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        if (i10 == 0) {
            q(false);
            float f11 = 1.0f - this.a.e;
            cx cxVar = this.G0;
            cxVar.setAlpha(f11);
            cxVar.setVisibility(f11 > 0.0f ? 0 : 4);
            float f12 = 1.0f - f11;
            ph.d dVar = this.H0;
            dVar.setAlpha(f12);
            dVar.setTranslationY((-AndroidUtilities.dp(15.0f)) * f11);
            dVar.setVisibility(f12 > 0.0f ? 0 : 4);
            bh.p pVar = this.M;
            pVar.setAlpha(f12);
            pVar.setTranslationY(AndroidUtilities.dp(30.0f) * f11);
            pVar.setVisibility(f12 > 0.0f ? 0 : 4);
            R();
            this.x0.invalidate();
            return;
        }
        if (i10 == 1) {
            l(false);
            float f13 = 1.0f - this.b.e;
            rw rwVar = this.V;
            rwVar.setAlpha(f13);
            rwVar.setVisibility(f13 > 0.0f ? 0 : 4);
            float f14 = 1.0f - f13;
            ph.d dVar2 = this.U;
            dVar2.setAlpha(f14);
            dVar2.setTranslationY((-AndroidUtilities.dp(15.0f)) * f13);
            dVar2.setVisibility(f14 > 0.0f ? 0 : 4);
            bh.p pVar2 = this.K;
            pVar2.setAlpha(f14);
            pVar2.setTranslationY(AndroidUtilities.dp(30.0f) * f13);
            pVar2.setVisibility(f14 > 0.0f ? 0 : 4);
            R();
            this.J.invalidate();
        }
    }

    public final void F(int i10) {
        ty tyVar = this.t1;
        if ((tyVar == null || !tyVar.z()) && i10 != 0) {
            HorizontalScrollView y3 = y(i10);
            this.Q0[i10] = 0;
            y3.setTranslationY(0);
        }
    }

    public final void G(int i10, int i11) {
        qx qxVar = this.Q;
        View m10 = qxVar.m(i10);
        int L0 = qxVar.L0();
        if ((m10 == null && Math.abs(i10 - L0) > qxVar.J * 9.0f) || !SharedConfig.animationsEnabled()) {
            int i12 = qxVar.L0() < i10 ? 0 : 1;
            pl0 pl0Var = this.b0;
            pl0Var.b = i12;
            pl0Var.c(i10, i11, false, false);
            return;
        }
        this.J0 = true;
        fi.k1 k1Var = new fi.k1(this, this.P.getContext(), 1);
        k1Var.a = i10;
        k1Var.p = i11;
        qxVar.w0(k1Var);
    }

    public final void H(int i10, int i11) {
        ax axVar = this.E0;
        View m10 = axVar.m(i10);
        int L0 = axVar.L0();
        if (m10 != null || Math.abs(i10 - L0) <= 40) {
            this.J0 = true;
            this.D0.y0(i10);
        } else {
            int i12 = axVar.L0() < i10 ? 0 : 1;
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
            if (((oz) arrayList2.get(i10)).a == 0 && z10) {
                arrayList.add((oz) arrayList2.get(i10));
            }
            if (((oz) arrayList2.get(i10)).a == 1 && z12) {
                arrayList.add((oz) arrayList2.get(i10));
            }
            if (((oz) arrayList2.get(i10)).a == 2 && z11) {
                arrayList.add((oz) arrayList2.get(i10));
            }
            i10++;
        }
        wd0 wd0Var = this.w;
        if (wd0Var != null) {
            AndroidUtilities.updateViewVisibilityAnimated(wd0Var, arrayList.size() > 1, 1.0f, z13);
        }
        fx fxVar = this.h;
        if (fxVar != null) {
            fxVar.setAdapter(null);
            fxVar.setAdapter(this.L0);
            if (wd0Var != null) {
                wd0Var.setViewPager(fxVar);
            }
        }
    }

    public final void J(final ph.b bVar, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z10, boolean z11) {
        nz nzVar;
        sy syVar;
        if (stickerSet == null) {
            return;
        }
        if (!z10 || (syVar = this.S) == null || syVar.d == stickerSet.id) {
            if (z10 || (nzVar = this.z0) == null || nzVar.d == stickerSet.id) {
                final boolean isStickerPackInstalled = MediaDataController.getInstance(this.c1).isStickerPackInstalled(stickerSet.id);
                bVar.i(isStickerPackInstalled ? stickerSet.masks ? LocaleController.formatPluralString("RemoveManyMasksCount", stickerSet.count, new Object[0]) : stickerSet.emojis ? LocaleController.formatPluralString("RemoveManyEmojiCount", stickerSet.count, new Object[0]) : LocaleController.formatPluralString("RemoveManyStickersCount", stickerSet.count, new Object[0]) : stickerSet.masks ? LocaleController.formatPluralString("AddManyMasksCount", stickerSet.count, new Object[0]) : stickerSet.emojis ? LocaleController.formatPluralString("AddManyEmojiCount", stickerSet.count, new Object[0]) : LocaleController.formatPluralString("AddManyStickersCount", stickerSet.count, new Object[0]), z11, true);
                bVar.k0.a(!isStickerPackInstalled, z11);
                bVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.qw
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        sz szVar = sz.this;
                        MediaDataController mediaDataController = MediaDataController.getInstance(szVar.c1);
                        Context context = szVar.getContext();
                        int i10 = isStickerPackInstalled ? 0 : 2;
                        org.telegram.ui.ActionBar.r2 r2Var = szVar.Y1;
                        FrameLayout frameLayout = szVar.s;
                        ph.b bVar2 = bVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z12 = z10;
                        mediaDataController.toggleStickerSet(context, tLObject2, document2, i10, r2Var, frameLayout, false, true, new bi.k4(szVar, bVar2, tLObject2, stickerSet2, document2, z12), false);
                        szVar.J(bVar2, tLObject2, stickerSet2, document2, z12, true);
                    }
                });
            }
        }
    }

    public final void K(long j10, boolean z10, boolean z11) {
        wd0 wd0Var = this.w;
        if (wd0Var == null) {
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
        LinearLayout linearLayout = wd0Var.d;
        View childAt = i10 >= linearLayout.getChildCount() ? null : linearLayout.getChildAt(i10);
        if (childAt != null) {
            childAt.setAlpha(this.u1 != 0 ? 0.15f : 1.0f);
            fx fxVar = this.h;
            if (z11) {
                if (this.u1 == 0 || fxVar.getCurrentItem() == 0) {
                    return;
                }
                L(true, true);
                Q(false, true);
                fxVar.x(0, false);
                return;
            }
            if (this.u1 == 0 || fxVar.getCurrentItem() == 1) {
                return;
            }
            L(false, true);
            Q(false, true);
            fxVar.x(1, false);
        }
    }

    public final void L(boolean z10, boolean z11) {
        gx gxVar = this.x;
        if (z10 && gxVar.getTag() == null) {
            return;
        }
        if ((z10 || gxVar.getTag() == null) && !this.o2) {
            AnimatorSet animatorSet = this.F;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.F = null;
            }
            gxVar.setTag(z10 ? null : 1);
            if (!z11) {
                gxVar.setAlpha(z10 ? 1.0f : 0.0f);
                gxVar.setScaleX(z10 ? 1.0f : 0.0f);
                gxVar.setScaleY(z10 ? 1.0f : 0.0f);
                gxVar.setVisibility(z10 ? 0 : 4);
                return;
            }
            if (z10) {
                gxVar.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.F = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(gxVar, (Property<gx, Float>) View.ALPHA, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(gxVar, (Property<gx, Float>) View.SCALE_X, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(gxVar, (Property<gx, Float>) View.SCALE_Y, z10 ? 1.0f : 0.0f));
            this.F.setDuration(200L);
            this.F.setInterpolator(ds.g);
            this.F.addListener(new mx(this, z10, r2));
            this.F.start();
        }
    }

    public final void M(boolean z10) {
        this.H = 0.0f;
        ty tyVar = this.t1;
        if (tyVar != null && tyVar.z()) {
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
            this.W.setInterpolator(ds.g);
            this.W.addListener(new org.telegram.ui.qp(this, 26));
            this.W.start();
        }
    }

    public final void O(boolean z10) {
        for (int i10 = 0; i10 < 3; i10++) {
            s4.t w10 = w(i10);
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
        bi.md mdVar = this.N0;
        if (z10) {
            if (ChatObject.hasAdminRights(chat) || (tL_chatBannedRights = chat.default_banned_rights) == null || !(tL_chatBannedRights.send_stickers || (z11 && tL_chatBannedRights.send_plain))) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.banned_rights;
                if (tL_chatBannedRights2 == null) {
                    return;
                }
                if (!AndroidUtilities.isBannedForever(tL_chatBannedRights2)) {
                    if (z11) {
                        mdVar.setText(LocaleController.formatString("AttachPlainRestricted", R.string.AttachPlainRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    }
                    if (z12) {
                        mdVar.setText(LocaleController.formatString("AttachGifRestricted", R.string.AttachGifRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    } else {
                        mdVar.setText(LocaleController.formatString("AttachStickersRestricted", R.string.AttachStickersRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    }
                } else if (z11) {
                    mdVar.setText(LocaleController.getString(R.string.AttachPlainRestrictedForever));
                } else if (z12) {
                    mdVar.setText(LocaleController.getString(R.string.AttachGifRestrictedForever));
                } else {
                    mdVar.setText(LocaleController.getString(R.string.AttachStickersRestrictedForever));
                }
            } else {
                org.telegram.ui.ActionBar.r2 r2Var = this.Y1;
                if ((r2Var instanceof org.telegram.ui.un) && ((org.telegram.ui.un) r2Var).R6()) {
                    return;
                }
                if (z11) {
                    mdVar.setText(LocaleController.getString(R.string.GlobalAttachEmojiRestricted));
                } else if (z12) {
                    mdVar.setText(LocaleController.getString(R.string.GlobalAttachGifRestricted));
                } else {
                    mdVar.setText(LocaleController.getString(R.string.GlobalAttachStickersRestricted));
                }
            }
            mdVar.setVisibility(0);
        }
        AnimatorSet animatorSet = this.N2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.N2 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.N2 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(mdVar, (Property<bi.md, Float>) View.ALPHA, z10 ? mdVar.getAlpha() : 1.0f, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(mdVar, (Property<bi.md, Float>) View.TRANSLATION_Y, z10 ? AndroidUtilities.dp(12.0f) : mdVar.getTranslationY(), z10 ? 0.0f : AndroidUtilities.dp(12.0f)));
        e2.o0 o0Var = this.O2;
        if (o0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(o0Var);
        }
        if (z10) {
            e2.o0 o0Var2 = new e2.o0(this, z11, z12, 4);
            this.O2 = o0Var2;
            AndroidUtilities.runOnUIThread(o0Var2, 3500L);
        }
        this.N2.setDuration(320L);
        this.N2.setInterpolator(ds.h);
        this.N2.start();
    }

    public final void Q(boolean z10, boolean z11) {
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
            this.G.setInterpolator(ds.g);
            this.G.addListener(new mx(this, z10, i10));
            this.G.start();
        }
    }

    public final void R() {
        org.telegram.ui.ActionBar.r2 r2Var;
        if (((View) getParent()) != null) {
            float y3 = (getY() + (getLayoutParams().height > 0 ? getLayoutParams().height : getMeasuredHeight())) - (((AndroidUtilities.isInMultiwindow || ((r2Var = this.Y1) != null && r2Var.isInBubbleMode())) && !this.V0) ? AndroidUtilities.dp(1.0f) : r0.getHeight());
            float f7 = this.r2;
            FrameLayout frameLayout = this.n;
            if (f7 >= 0.0f) {
                y3 += getMeasuredHeight() - this.r2;
            } else if (frameLayout.getTop() - y3 < 0.0f || !this.x2) {
                y3 = 0.0f;
            }
            float lerp = (-y3) + AndroidUtilities.lerp(AndroidUtilities.dp(50.0f), -this.q2, this.E2.e);
            frameLayout.setTranslationY(lerp);
            if (this.d0) {
                this.r.setTranslationY(lerp);
            }
        }
    }

    public final void S() {
        fz fzVar;
        boolean z10;
        gw gwVar;
        boolean z11 = this.u0;
        View view = this.v;
        if (!z11) {
            setBackground(null);
            view.setBackground(null);
        } else if (AndroidUtilities.isInMultiwindow || this.N1) {
            Drawable background = getBackground();
            int A = A(org.telegram.ui.ActionBar.y6.He);
            if (background != null && (background != this.G2 || A != this.H2)) {
                this.G2 = background;
                this.H2 = A;
                background.setColorFilter(new PorterDuffColorFilter(A, PorterDuff.Mode.MULTIPLY));
            }
        } else {
            int i10 = org.telegram.ui.ActionBar.y6.He;
            setBackgroundColor(A(i10));
            if (this.d0) {
                view.setBackgroundColor(A(i10));
            }
        }
        ux uxVar = this.I;
        if (uxVar != null) {
            if (this.u0) {
                uxVar.setBackgroundColor(A(org.telegram.ui.ActionBar.y6.He));
                this.O.setBackgroundColor(A(org.telegram.ui.ActionBar.y6.Ke));
            } else {
                uxVar.setBackground(null);
            }
        }
        fv fvVar = this.B1;
        if (fvVar != null) {
            fvVar.c.a();
        }
        int i11 = 0;
        while (true) {
            fzVar = this.V;
            z10 = this.i2;
            if (i11 >= 3) {
                break;
            }
            if (i11 == 0) {
                fzVar = this.G0;
            } else if (i11 != 1) {
                fzVar = this.o0;
            }
            if (fzVar != null) {
                uq uqVar = fzVar.d;
                FrameLayout frameLayout = fzVar.n;
                View view2 = fzVar.f;
                if (this.u0) {
                    view2.setBackgroundColor(A(org.telegram.ui.ActionBar.y6.He));
                } else {
                    view2.setBackground(null);
                }
                fzVar.e.setBackgroundColor(A(org.telegram.ui.ActionBar.y6.Ke));
                fzVar.c.a(z10 ? v(0.4f) : A(org.telegram.ui.ActionBar.y6.Je));
                org.telegram.ui.ActionBar.y6.z1(z10 ? v(0.06f) : A(org.telegram.ui.ActionBar.y6.Ie), frameLayout.getBackground());
                frameLayout.invalidate();
                uqVar.setHintTextColor(z10 ? v(0.45f) : A(org.telegram.ui.ActionBar.y6.Je));
                uqVar.setTextColor(z10 ? v(0.8f) : A(org.telegram.ui.ActionBar.y6.G6));
            }
            i11++;
        }
        Paint paint = this.s1;
        if (paint != null) {
            paint.setColor(A(org.telegram.ui.ActionBar.y6.af));
        }
        dy dyVar = this.P;
        if (dyVar != null) {
            dyVar.setGlowColor(A(org.telegram.ui.ActionBar.y6.He));
        }
        zw zwVar = this.D0;
        if (zwVar != null) {
            zwVar.setGlowColor(A(org.telegram.ui.ActionBar.y6.He));
        }
        dx dxVar = this.B0;
        if (dxVar != null) {
            dxVar.setIndicatorColor(A(org.telegram.ui.ActionBar.y6.Qe));
            dxVar.setUnderlineColor(A(org.telegram.ui.ActionBar.y6.Ke));
            if (this.u0) {
                dxVar.setBackgroundColor(A(org.telegram.ui.ActionBar.y6.He));
            } else {
                dxVar.setBackground(null);
            }
        }
        xx xxVar = this.p0;
        if (xxVar != null) {
            xxVar.setIndicatorColor(A(org.telegram.ui.ActionBar.y6.Qe));
            xxVar.setUnderlineColor(A(org.telegram.ui.ActionBar.y6.Ke));
            if (this.u0) {
                xxVar.setBackgroundColor(A(org.telegram.ui.ActionBar.y6.He));
            } else {
                xxVar.setBackground(null);
            }
        }
        int v = z10 ? v(0.6f) : A(org.telegram.ui.ActionBar.y6.Re);
        boolean z12 = v != this.I2;
        this.I2 = v;
        gx gxVar = this.x;
        if (gxVar != null) {
            if (z12) {
                gxVar.setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
            }
            if (fzVar == null) {
                Drawable background2 = gxVar.getBackground();
                int i12 = org.telegram.ui.ActionBar.y6.He;
                org.telegram.ui.ActionBar.y6.E1(background2, A(i12), false);
                org.telegram.ui.ActionBar.y6.E1(gxVar.getBackground(), A(i12), true);
            }
        }
        ImageView imageView = this.y;
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
                ((ShapeDrawable) mdVar.getBackground()).getPaint().setColor(A(org.telegram.ui.ActionBar.y6.qf));
                mdVar.invalidate();
            }
            mdVar.setTextColor(A(org.telegram.ui.ActionBar.y6.pf));
        }
        xy xyVar = this.j0;
        if (xyVar != null) {
            zy zyVar = xyVar.e;
            int i13 = org.telegram.ui.ActionBar.y6.Le;
            int A2 = A(i13);
            if (A2 != this.J2) {
                this.J2 = A2;
                zyVar.a.setColorFilter(new PorterDuffColorFilter(A2, PorterDuff.Mode.MULTIPLY));
            }
            zyVar.b.setTextColor(A(i13));
            zyVar.c.setProgressColor(A(org.telegram.ui.ActionBar.y6.h6));
        }
        int A3 = A(org.telegram.ui.ActionBar.y6.Oh);
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
            org.telegram.ui.ActionBar.y6.B1(drawableArr[i14], z10 ? v(0.4f) : A(org.telegram.ui.ActionBar.y6.Ne), false);
            org.telegram.ui.ActionBar.y6.B1(drawableArr[i14], z10 ? v(0.8f) : A(org.telegram.ui.ActionBar.y6.Oe), true);
            i14++;
        }
        if (uxVar != null && (gwVar = uxVar.y) != null) {
            gwVar.d();
        }
        int i15 = 0;
        while (true) {
            Drawable[] drawableArr2 = this.Y0;
            if (i15 >= drawableArr2.length) {
                break;
            }
            org.telegram.ui.ActionBar.y6.B1(drawableArr2[i15], z10 ? v(0.4f) : A(org.telegram.ui.ActionBar.y6.Me), false);
            org.telegram.ui.ActionBar.y6.B1(drawableArr2[i15], z10 ? v(0.8f) : A(org.telegram.ui.ActionBar.y6.Oe), true);
            i15++;
        }
        int i16 = 0;
        while (true) {
            Drawable[] drawableArr3 = this.Z0;
            if (i16 >= drawableArr3.length) {
                break;
            }
            org.telegram.ui.ActionBar.y6.B1(drawableArr3[i16], z10 ? v(0.4f) : A(org.telegram.ui.ActionBar.y6.Me), false);
            org.telegram.ui.ActionBar.y6.B1(drawableArr3[i16], z10 ? v(0.8f) : A(org.telegram.ui.ActionBar.y6.Oe), true);
            i16++;
        }
        org.telegram.ui.ActionBar.k6 k6Var = this.a2;
        if (k6Var != null) {
            org.telegram.ui.ActionBar.y6.B1(k6Var, z10 ? v(0.4f) : A(org.telegram.ui.ActionBar.y6.Ne), false);
            org.telegram.ui.ActionBar.y6.B1(k6Var, z10 ? v(0.8f) : A(org.telegram.ui.ActionBar.y6.Oe), true);
        }
        org.telegram.ui.ActionBar.k6 k6Var2 = this.b2;
        if (k6Var2 != null) {
            org.telegram.ui.ActionBar.y6.B1(k6Var2, z10 ? v(0.4f) : A(org.telegram.ui.ActionBar.y6.Qe), false);
            org.telegram.ui.ActionBar.y6.B1(k6Var2, z10 ? v(0.8f) : A(org.telegram.ui.ActionBar.y6.Qe), true);
        }
    }

    public final void T() {
        dy dyVar = this.P;
        if (dyVar == null) {
            return;
        }
        for (int i10 = 0; i10 < dyVar.getChildCount(); i10++) {
            View childAt = dyVar.getChildAt(i10);
            if (childAt instanceof iy) {
                ((iy) childAt).a(true);
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
            zx zxVar = this.R;
            int i12 = zxVar.c;
            ArrayList arrayList = zxVar.x;
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
                    ArrayList<ey> emojipacks = getEmojipacks();
                    int size2 = arrayList.size() - 1;
                    while (true) {
                        if (size2 < 0) {
                            break;
                        }
                        if (((Integer) arrayList.get(size2)).intValue() <= i10) {
                            ey eyVar = (ey) this.q1.get(size2);
                            while (i13 < emojipacks.size()) {
                                long j10 = emojipacks.get(i13).b.id;
                                long j11 = eyVar.b.id;
                                if (j10 == j11 && (!eyVar.g || (!eyVar.f && !this.p1.contains(Long.valueOf(j11))))) {
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
        ez ezVar;
        int i11;
        boolean z10;
        xx xxVar = this.p0;
        int currentPosition = xxVar.getCurrentPosition();
        int i12 = this.r0;
        boolean z11 = currentPosition == i12;
        boolean z12 = i12 >= 0;
        boolean isEmpty = this.i1.isEmpty();
        xxVar.d(false);
        this.r0 = -2;
        this.s0 = -2;
        this.t0 = -2;
        Drawable[] drawableArr = this.Z0;
        if (isEmpty) {
            i10 = 0;
        } else {
            this.r0 = 0;
            xxVar.b(0, drawableArr[0]).setContentDescription(LocaleController.getString(R.string.RecentStickers));
            i10 = 1;
        }
        this.s0 = i10;
        xxVar.b(1, drawableArr[1]).setContentDescription(LocaleController.getString(R.string.FeaturedGifs));
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
                String i15 = ic.a.i(i14 + 3, "tab");
                int i16 = xxVar.x;
                xxVar.x = i16 + 1;
                jy0 jy0Var = (jy0) xxVar.n.get(i15);
                if (jy0Var != null) {
                    xxVar.g(i15, jy0Var, i16);
                    i11 = currentPosition;
                    z10 = z12;
                } else {
                    i11 = currentPosition;
                    z10 = z12;
                    jy0Var = new jy0(xxVar.getContext(), 2);
                    jy0Var.setFocusable(true);
                    jy0Var.setOnClickListener(new in0(xxVar, 2));
                    jy0Var.setExpanded(xxVar.f0);
                    jy0Var.a(xxVar.i0);
                    xxVar.e.addView(jy0Var, i16);
                }
                jy0Var.d = false;
                jy0Var.setTag(R.id.index_tag, Integer.valueOf(i16));
                jy0Var.setTag(R.id.parent_tag, emojiDrawable);
                jy0Var.setTag(R.id.object_tag, emojiAnimatedSticker);
                jy0Var.setSelected(i16 == xxVar.y);
                xxVar.h.put(i15, jy0Var);
                jy0Var.setContentDescription(str);
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
        xxVar.h();
        xxVar.q();
        if (z11 && isEmpty) {
            xxVar.m(this.s0);
            ww wwVar = this.o0;
            if (wwVar == null || (ezVar = wwVar.r) == null) {
                return;
            }
            ezVar.L1(null);
            return;
        }
        WeakHashMap weakHashMap = r0.i0.a;
        if (xxVar.isLaidOut()) {
            if (!isEmpty && !z13) {
                xxVar.k(i17 + 1, 0);
            } else if (isEmpty && z13) {
                xxVar.k(i17 - 1, 0);
            }
        }
    }

    public final void W() {
        xy xyVar;
        int size = this.i1.size();
        long calcDocumentsHash = MediaDataController.calcDocumentsHash(this.i1, ConnectionsManager.DEFAULT_DATACENTER_ID);
        ArrayList<TLRPC.Document> recentGifs = MediaDataController.getInstance(this.c1).getRecentGifs();
        this.i1 = recentGifs;
        long calcDocumentsHash2 = MediaDataController.calcDocumentsHash(recentGifs, ConnectionsManager.DEFAULT_DATACENTER_ID);
        if ((this.p0 != null && size == 0 && !this.i1.isEmpty()) || (size != 0 && this.i1.isEmpty())) {
            V();
        }
        if ((size == this.i1.size() && calcDocumentsHash == calcDocumentsHash2) || (xyVar = this.n0) == null) {
            return;
        }
        xyVar.l();
    }

    public final void X(boolean z10) {
        TLRPC.Document document;
        boolean z11;
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet;
        dx dxVar = this.B0;
        if (dxVar != null) {
            org.telegram.ui.xa1 xa1Var = dxVar.e;
            if (dxVar.s != null) {
                return;
            }
            this.F1 = -2;
            this.G1 = -2;
            this.H1 = -2;
            this.I1 = -2;
            this.e0 = false;
            this.E1 = 0;
            int currentPosition = dxVar.getCurrentPosition();
            boolean z12 = true;
            dxVar.d((getParent() == null || getVisibility() != 0 || (this.y1.size() == 0 && this.z1.size() == 0)) ? false : true);
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
            qz qzVar = this.F0;
            if (qzVar != null) {
                qzVar.l();
            }
            boolean isEmpty = featuredStickerSets.isEmpty();
            long j10 = 0;
            Drawable[] drawableArr = this.Y0;
            if (!isEmpty && (arrayList3.isEmpty() || emojiSettings.getLong("featured_hidden", 0L) == featuredStickerSets.get(0).set.id)) {
                int i12 = mediaDataController.getUnreadStickerSets().isEmpty() ? 2 : 3;
                jy0 c10 = dxVar.c(i12, drawableArr[i12]);
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
                jy0 c11 = dxVar.c(1, drawableArr[1]);
                c11.h.setText(LocaleController.getString(R.string.FavoriteStickersShort));
                c11.setContentDescription(LocaleController.getString(R.string.FavoriteStickers));
            }
            if (!this.j1.isEmpty()) {
                int i15 = this.E1;
                this.F1 = i15;
                this.E1 = i15 + 1;
                jy0 c12 = dxVar.c(0, drawableArr[0]);
                c12.h.setText(LocaleController.getString(R.string.RecentStickersShort));
                c12.setContentDescription(LocaleController.getString(R.string.RecentStickers));
            }
            ArrayList arrayList4 = this.d1;
            arrayList4.clear();
            org.telegram.ui.ActionBar.u6 u6Var = null;
            this.h1 = null;
            this.f1 = -1;
            this.e1 = -10;
            if (this.F2 == null || z10) {
                this.F2 = new ArrayList(mediaDataController.getStickerSets(0));
            }
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList5 = this.F2;
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
                        int i19 = dxVar.x;
                        dxVar.x = i19 + 1;
                        jy0 jy0Var = (jy0) dxVar.n.get(str);
                        if (jy0Var != null) {
                            dxVar.g(str, jy0Var, i19);
                        } else {
                            jy0Var = new jy0(dxVar.getContext(), 0);
                            jy0Var.setFocusable(z12);
                            jy0Var.setOnClickListener(new in0(dxVar, 0));
                            xa1Var.addView(jy0Var, i19);
                            jy0Var.w = z12;
                            j9 j9Var = new j9(u6Var);
                            j9Var.u(AndroidUtilities.dp(14.0f));
                            j9Var.k(UserConfig.selectedAccount, chat2);
                            int i20 = dxVar.a;
                            y9 y9Var = jy0Var.e;
                            y9Var.setLayerNum(i20);
                            y9Var.f(chat2, j9Var);
                            y9Var.setAspectFit(z12);
                            jy0Var.setExpanded(dxVar.f0);
                            jy0Var.a(dxVar.i0);
                            jy0Var.h.setText(chat2.title);
                        }
                        jy0Var.d = z12;
                        jy0Var.setTag(R.id.index_tag, Integer.valueOf(i19));
                        jy0Var.setSelected(i19 == dxVar.y ? z12 : false);
                        dxVar.h.put(str, jy0Var);
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
                    int i22 = dxVar.x;
                    dxVar.x = i22 + 1;
                    jy0 jy0Var2 = (jy0) dxVar.n.get(str2);
                    if (jy0Var2 != null) {
                        dxVar.g(str2, jy0Var2, i22);
                        z11 = z12;
                    } else {
                        jy0Var2 = new jy0(dxVar.getContext(), 0);
                        jy0Var2.setFocusable(z12);
                        z11 = z12;
                        jy0Var2.setOnClickListener(new in0(dxVar, 1));
                        jy0Var2.setExpanded(dxVar.f0);
                        jy0Var2.a(dxVar.i0);
                        xa1Var.addView(jy0Var2, i22);
                    }
                    jy0Var2.e.setLayerNum(dxVar.a);
                    jy0Var2.d = false;
                    jy0Var2.setTag(closestPhotoSizeWithSize);
                    jy0Var2.setTag(R.id.index_tag, Integer.valueOf(i22));
                    jy0Var2.setTag(R.id.parent_tag, tL_messages_stickerSet5);
                    jy0Var2.setTag(R.id.object_tag, document);
                    jy0Var2.setSelected(i22 == dxVar.y ? z11 : false);
                    dxVar.h.put(str2, jy0Var2);
                    jy0Var2.setContentDescription(tL_messages_stickerSet5.set.title + ", " + LocaleController.getString(R.string.AccDescrStickerSet));
                }
                i18++;
                z12 = z11;
                u6Var = null;
            }
            dxVar.h();
            dxVar.q();
            if (currentPosition != 0) {
                dxVar.k(currentPosition, currentPosition);
            }
            o();
        }
    }

    public final void Y() {
        ex exVar = this.C0;
        dx dxVar = this.B0;
        if (dxVar != null && exVar == null && this.t1 != null) {
            dxVar.setTranslationY(this.t1.p() * (-AndroidUtilities.dp(50.0f)));
        }
        if (exVar == null) {
            return;
        }
        boolean z10 = getVisibility() == 0 && this.K0 && this.t1.p() != 1.0f;
        exVar.setVisibility(z10 ? 0 : 8);
        if (z10) {
            Rect rect = this.y2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.x0, rect, null);
            float p10 = this.t1.p() * AndroidUtilities.dp(50.0f);
            int i10 = rect.left;
            if (i10 != 0 || p10 != 0.0f) {
                this.X1 = false;
            }
            exVar.setTranslationX(i10);
            float translationY = (((getTranslationY() + getTop()) - exVar.getTop()) - dxVar.getExpandedOffset()) - p10;
            if (exVar.getTranslationY() != translationY) {
                exVar.setTranslationY(translationY);
                exVar.invalidate();
            }
        }
        if (this.X1 && z10 && this.P0) {
            dxVar.i(this.W1, true);
        } else {
            this.X1 = false;
            dxVar.i(this.W1, false);
        }
    }

    public final void Z() {
        boolean z10;
        org.telegram.ui.Cells.q3 q3Var;
        LongSparseArray longSparseArray = this.z1;
        LongSparseArray longSparseArray2 = this.y1;
        int i10 = this.c1;
        zw zwVar = this.D0;
        if (zwVar == null) {
            return;
        }
        try {
            int childCount = zwVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = zwVar.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.q3) && ((vl0) zwVar.T(childAt)) != null) {
                    org.telegram.ui.Cells.q3 q3Var2 = (org.telegram.ui.Cells.q3) childAt;
                    ArrayList<Long> unreadStickerSets = MediaDataController.getInstance(i10).getUnreadStickerSets();
                    TLRPC.StickerSetCovered stickerSet = q3Var2.getStickerSet();
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
                            q3Var = q3Var2;
                            if (stickerSetCovered.set.id == stickerSet.set.id) {
                                q3Var2 = q3Var;
                                z10 = true;
                                break;
                            }
                        } else {
                            q3Var = q3Var2;
                        }
                        i12++;
                        q3Var2 = q3Var;
                    }
                    q3Var2.c(stickerSet, z11, true, 0, 0, z10);
                    if (z11) {
                        MediaDataController.getInstance(i10).markFeaturedStickersByIdAsRead(false, stickerSet.set.id);
                    }
                    boolean z12 = longSparseArray2.indexOfKey(stickerSet.set.id) >= 0;
                    boolean z13 = longSparseArray.indexOfKey(stickerSet.set.id) >= 0;
                    if (z12 || z13) {
                        if (z12 && q3Var2.r) {
                            longSparseArray2.remove(stickerSet.set.id);
                            z12 = false;
                        } else if (z13 && !q3Var2.r) {
                            longSparseArray.remove(stickerSet.set.id);
                        }
                    }
                    q3Var2.b(!z10 && z12, true);
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // rh.a
    public final void c(int i10) {
        setBottomInset(i10);
    }

    @Override // rh.a
    public final void d(float f7) {
        this.r2 = f7;
        R();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Utilities.Callback callback;
        TLRPC.StickerSet stickerSet;
        int i12 = NotificationCenter.stickersDidLoad;
        zx zxVar = this.R;
        lw lwVar = this.P2;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.y0 != null) {
                    X(((Boolean) objArr[1]).booleanValue());
                    Z();
                    D();
                    o();
                    return;
                }
                return;
            }
            if (((Integer) objArr[0]).intValue() == 5) {
                if (!((Boolean) objArr[1]).booleanValue()) {
                    zxVar.F(false);
                    return;
                } else {
                    AndroidUtilities.cancelRunOnUIThread(lwVar);
                    AndroidUtilities.runOnUIThread(lwVar, 100L);
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
                zxVar.F(true);
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
            wd0 wd0Var = this.w;
            if (wd0Var != null) {
                int childCount = wd0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    wd0Var.getChildAt(i13).invalidate();
                }
            }
            X(false);
            return;
        }
        if (i10 == NotificationCenter.featuredEmojiDidLoad) {
            if (zxVar != null) {
                zxVar.F(false);
                return;
            }
            return;
        }
        int i14 = NotificationCenter.groupStickersDidLoad;
        sy syVar = this.S;
        if (i10 == i14) {
            Long l4 = (Long) objArr[0];
            long longValue2 = l4.longValue();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = objArr.length > 1 ? (TLRPC.TL_messages_stickerSet) objArr[1] : null;
            if (tL_messages_stickerSet != null) {
                nz nzVar = this.z0;
                if (nzVar != null && nzVar.d == longValue2 && nzVar.f.size() < tL_messages_stickerSet.documents.size()) {
                    nzVar.f = tL_messages_stickerSet.documents;
                    nzVar.l();
                }
                if (syVar != null && syVar.d == longValue2 && syVar.f.size() < tL_messages_stickerSet.documents.size()) {
                    syVar.f = tL_messages_stickerSet.documents;
                    syVar.l();
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
            AndroidUtilities.cancelRunOnUIThread(lwVar);
            AndroidUtilities.runOnUIThread(lwVar, 100L);
            return;
        }
        int i15 = NotificationCenter.emojiLoaded;
        dy dyVar = this.P;
        if (i10 != i15) {
            if (i10 != NotificationCenter.newEmojiSuggestionsAvailable) {
                if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                    if (zxVar != null) {
                        zxVar.F(false);
                    }
                    T();
                    X(false);
                    return;
                }
                return;
            }
            if (dyVar == null || !this.d0) {
                return;
            }
            if ((this.V.c.k == 2 || dyVar.getAdapter() == syVar) && !TextUtils.isEmpty(syVar.v)) {
                syVar.F(syVar.v, true);
                return;
            }
            return;
        }
        zw zwVar = this.D0;
        if (zwVar != null) {
            int childCount2 = zwVar.getChildCount();
            for (int i16 = 0; i16 < childCount2; i16++) {
                View childAt = zwVar.getChildAt(i16);
                if ((childAt instanceof org.telegram.ui.Cells.s8) || (childAt instanceof org.telegram.ui.Cells.i8)) {
                    childAt.invalidate();
                }
            }
        }
        if (dyVar != null) {
            dyVar.invalidate();
            int childCount3 = dyVar.getChildCount();
            for (int i17 = 0; i17 < childCount3; i17++) {
                View childAt2 = dyVar.getChildAt(i17);
                if (childAt2 instanceof bz) {
                    childAt2.invalidate();
                }
            }
        }
        fv fvVar = this.B1;
        if (fvVar != null) {
            fvVar.c.invalidate();
        }
        xx xxVar = this.p0;
        if (xxVar != null) {
            org.telegram.ui.xa1 xa1Var = xxVar.e;
            int childCount4 = xa1Var.getChildCount();
            for (int i18 = 0; i18 < childCount4; i18++) {
                xa1Var.getChildAt(i18).invalidate();
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
            canvas.drawColor(i0.a.o(-1, 25));
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.q2);
        if (navigationBarThirdButtonsFactor > 0.0f) {
            int o12 = org.telegram.ui.ActionBar.y6.o1(navigationBarThirdButtonsFactor, A(org.telegram.ui.ActionBar.y6.He));
            int i10 = this.A2;
            GradientDrawable gradientDrawable = this.z2;
            if (i10 != o12) {
                gradientDrawable.setColors(new int[]{o12, org.telegram.ui.ActionBar.y6.o1(0.66f, o12), i0.a.o(o12, 0)});
                this.A2 = o12;
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

    public ArrayList<ey> getEmojipacks() {
        ArrayList<ey> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.q1;
            if (i10 >= arrayList2.size()) {
                return arrayList;
            }
            ey eyVar = (ey) arrayList2.get(i10);
            boolean z10 = eyVar.g;
            ArrayList arrayList3 = this.p1;
            if ((!z10 && (eyVar.f || arrayList3.contains(Long.valueOf(eyVar.b.id)))) || (eyVar.g && !eyVar.f && !arrayList3.contains(Long.valueOf(eyVar.b.id)))) {
                arrayList.add(eyVar);
            }
            i10++;
        }
    }

    public ArrayList<String> getRecentEmoji() {
        if (this.c2) {
            return Emoji.recentEmoji;
        }
        if (this.B2 == null) {
            this.B2 = new ArrayList();
        }
        if (Emoji.recentEmoji.size() != this.C2) {
            this.B2.clear();
            int i10 = 0;
            while (true) {
                ArrayList<String> arrayList = Emoji.recentEmoji;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (!arrayList.get(i10).startsWith("animated_")) {
                    this.B2.add(arrayList.get(i10));
                }
                i10++;
            }
            this.C2 = this.B2.size();
        }
        return this.B2;
    }

    public float getStickersExpandOffset() {
        dx dxVar = this.B0;
        if (dxVar == null) {
            return 0.0f;
        }
        return dxVar.getExpandedOffset();
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
        ArrayList arrayList = this.B2;
        if (arrayList == null) {
            this.B2 = new ArrayList();
        } else {
            arrayList.clear();
        }
        while (true) {
            ArrayList<String> arrayList2 = Emoji.recentEmoji;
            if (i10 >= arrayList2.size()) {
                this.C2 = this.B2.size();
                return;
            } else {
                if (!arrayList2.get(i10).startsWith("animated_")) {
                    this.B2.add(arrayList2.get(i10));
                }
                i10++;
            }
        }
    }

    public final void i(int i10, int i11, boolean z10) {
        if (i10 == 2 || x(i10).K(0) == null) {
            return;
        }
        nx nxVar = new nx(getContext(), i11);
        nxVar.a = !z10 ? 1 : 0;
        w(i10).w0(nxVar);
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
        jz jzVar = this.y0;
        if (jzVar != null) {
            jzVar.l();
        }
        o();
    }

    public final void l(boolean z10) {
        ty tyVar = this.t1;
        oe.b bVar = this.b;
        dy dyVar = this.P;
        rw rwVar = this.V;
        if (tyVar != null && tyVar.z()) {
            s4.e1 K = dyVar.K(0);
            if (K == null) {
                fz.a(rwVar, true, !z10);
            } else {
                fz.a(rwVar, K.a.getTop() < dyVar.getPaddingTop(), !z10);
            }
            N(false, !z10);
            rwVar.setTranslationY(bVar.e * AndroidUtilities.dp(15.0f));
            return;
        }
        if (rwVar == null || dyVar == null) {
            return;
        }
        rwVar.setTranslationY((bVar.e * AndroidUtilities.dp(15.0f)) + (dyVar.K(0) != null ? r0.a.getTop() : -this.b1));
        rwVar.a.a(false, !z10);
        m(Math.round(this.I.getTranslationY()));
    }

    public final void m(int i10) {
        ObjectAnimator objectAnimator = this.R0[1];
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            boolean z10 = false;
            s4.e1 K = this.P.K(0);
            int dp = AndroidUtilities.dp(38.0f) + i10;
            if (dp > 0 && (K == null || K.a.getBottom() < dp)) {
                z10 = true;
            }
            N(z10, !this.K1);
        }
    }

    public final void n(int i10, View view) {
        dy dyVar;
        s4.e1 K;
        ux uxVar = this.I;
        int[] iArr = this.Q0;
        if (view == null) {
            iArr[1] = 0;
            uxVar.setTranslationY(0);
            return;
        }
        if (view.getVisibility() != 0 || this.f0) {
            return;
        }
        ty tyVar = this.t1;
        if (tyVar == null || !tyVar.z()) {
            if (i10 > 0 && (dyVar = this.P) != null && dyVar.getVisibility() == 0 && (K = dyVar.K(0)) != null) {
                if (K.a.getTop() + (this.d0 ? this.b1 : 0) >= dyVar.getPaddingTop()) {
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
            uxVar.setTranslationY(Math.max(-AndroidUtilities.dp(36.0f), iArr[1]));
        }
    }

    public final void o() {
        int L0;
        dx dxVar = this.B0;
        if (dxVar == null || (L0 = this.E0.L0()) == -1) {
            return;
        }
        int i10 = this.G1;
        if (i10 <= 0 && (i10 = this.F1) <= 0) {
            i10 = this.E1;
        }
        dxVar.k(this.y0.F(L0), i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.ObserversGroup observersGroup = this.M2;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.M2 = null;
        }
        NotificationCenter.ObserversGroup add = NotificationCenter.getInstance(this.c1).createWeakObserversGroup(this).addGlobal(NotificationCenter.emojiLoaded).add(NotificationCenter.newEmojiSuggestionsAvailable).add(NotificationCenter.groupPackUpdated);
        this.M2 = add;
        if (this.y0 != null) {
            add.add(NotificationCenter.stickersDidLoad).add(NotificationCenter.recentDocumentsDidLoad).add(NotificationCenter.featuredStickersDidLoad).add(NotificationCenter.groupStickersDidLoad).add(NotificationCenter.currentUserPremiumStatusChanged);
            AndroidUtilities.runOnUIThread(new lw(this, 0));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fv fvVar = this.B1;
        if (fvVar != null && fvVar.isShowing()) {
            fvVar.dismiss();
        }
        org.telegram.ui.ft o10 = org.telegram.ui.ft.o();
        if (o10.l == this.g2) {
            o10.W = null;
            o10.a0 = null;
            o10.Y = null;
            o10.l = null;
            o10.c0 = null;
            o10.s();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        if (this.O1 != i14) {
            this.O1 = i14;
            D();
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
                if (!this.L2) {
                    setOutlineProvider(this.M1);
                    setClipToOutline(true);
                    setElevation(AndroidUtilities.dp(2.0f));
                }
                setBackgroundResource(R.drawable.smiles_popup);
                Drawable background = getBackground();
                int i12 = org.telegram.ui.ActionBar.y6.He;
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
                int i13 = org.telegram.ui.ActionBar.y6.He;
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
            xy xyVar = this.n0;
            if (adapter != xyVar || xyVar.I < 0 || this.s0 < 0 || this.r0 < 0 || (L0 = this.i0.L0()) == -1) {
                return;
            }
            this.p0.k(L0 >= xyVar.I ? this.s0 : this.r0, 0);
        }
    }

    public final void q(boolean z10) {
        ty tyVar = this.t1;
        oe.b bVar = this.a;
        zw zwVar = this.D0;
        cx cxVar = this.G0;
        if (tyVar != null && tyVar.z()) {
            s4.e1 K = zwVar.K(0);
            if (K == null) {
                fz.a(cxVar, true, !z10);
            } else {
                fz.a(cxVar, K.a.getTop() < zwVar.getPaddingTop(), !z10);
            }
            cxVar.setTranslationY(bVar.e * AndroidUtilities.dp(15.0f));
            return;
        }
        if (cxVar == null || zwVar == null) {
            return;
        }
        cxVar.setTranslationY((bVar.e * AndroidUtilities.dp(15.0f)) + (zwVar.K(0) != null ? r0.a.getTop() : -this.b1));
        cxVar.a.a(false, !z10);
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

    public final void s(long j10, boolean z10) {
        fz fzVar;
        s4.c0 c0Var;
        View view;
        View view2;
        int i10;
        int i11;
        TLRPC.TL_messages_stickerSet stickerSetById;
        jz jzVar;
        int E;
        AnimatorSet animatorSet = this.M0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.M0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        int i12 = 2;
        if (currentItem == 2 && j10 != -1 && (stickerSetById = MediaDataController.getInstance(this.c1).getStickerSetById(j10)) != null && (E = (jzVar = this.y0).E(stickerSetById)) >= 0 && E < jzVar.h()) {
            H(E, AndroidUtilities.dp(48.0f));
        }
        int i13 = 0;
        xy xyVar = this.j0;
        if (xyVar != null) {
            xyVar.K = false;
        }
        int i14 = 0;
        while (i14 < 3) {
            View view3 = this.D0;
            View view4 = this.h0;
            ww wwVar = this.o0;
            View view5 = this.P;
            if (i14 == 0) {
                fzVar = this.V;
                c0Var = this.Q;
                view = this.I;
                view2 = view5;
            } else if (i14 == 1) {
                c0Var = this.i0;
                view = this.p0;
                view2 = view4;
                fzVar = wwVar;
            } else {
                fzVar = this.G0;
                c0Var = this.E0;
                view = this.B0;
                view2 = view3;
            }
            if (fzVar == null) {
                i11 = i13;
                i10 = i12;
            } else {
                int i15 = i13;
                ez ezVar = fzVar.r;
                int i16 = i12;
                fzVar.d.setText("");
                if (ezVar != null) {
                    ezVar.L1(null);
                    ezVar.J1();
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
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(fzVar, (Property<fz, Float>) property, fArr4);
                        Animator[] animatorArr2 = new Animator[3];
                        animatorArr2[i15] = ofFloat2;
                        animatorArr2[1] = ofFloat3;
                        animatorArr2[i16] = ofFloat4;
                        animatorSet2.playTogether(animatorArr2);
                    }
                    this.M0.setDuration(200L);
                    this.M0.setInterpolator(ds.h);
                    this.M0.addListener(new di.o3(this, c0Var, view2, 5));
                    this.M0.start();
                    i11 = i15;
                    i10 = i16;
                } else {
                    if (fzVar != wwVar) {
                        fzVar.setTranslationY(AndroidUtilities.dp(36.0f) - i17);
                    }
                    i10 = i16;
                    if (view != null && i14 != i10) {
                        view.setTranslationY(0.0f);
                    }
                    if (view2 == view3) {
                        i11 = i15;
                        view2.setPadding(i11, AndroidUtilities.dp(36.0f), i11, AndroidUtilities.dp(44.0f) + this.q2);
                    } else {
                        i11 = i15;
                        if (view2 == view4) {
                            view2.setPadding(i11, AndroidUtilities.dp(40.0f), i11, AndroidUtilities.dp(44.0f) + this.q2);
                        } else {
                            if (view2 == view5) {
                                view2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + this.q2);
                            }
                            i11 = 0;
                        }
                    }
                    c0Var.h1(i11, i11);
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

    public void setBlurredBackgroundDrawableFactory(ch.b bVar) {
        org.telegram.ui.ActionBar.u6 u6Var = this.Z1;
        gx gxVar = this.x;
        if (gxVar != null) {
            eh.d c10 = bVar.c(gxVar, null, false);
            c10.v(gh.c.d(u6Var));
            c10.x(AndroidUtilities.dp(18.0f));
            c10.w(AndroidUtilities.dp(6.0f));
            gxVar.setBackground(c10);
        }
        ImageView imageView = this.E;
        if (imageView != null) {
            eh.d c11 = bVar.c(imageView, null, false);
            c11.v(gh.c.d(u6Var));
            c11.x(AndroidUtilities.dp(18.0f));
            c11.w(AndroidUtilities.dp(6.0f));
            imageView.setBackground(c11);
        }
        wd0 wd0Var = this.w;
        if (wd0Var != null) {
            eh.d c12 = bVar.c(wd0Var, null, false);
            c12.v(gh.c.d(u6Var));
            c12.x(AndroidUtilities.dp(18.0f));
            c12.w(AndroidUtilities.dp(6.0f));
            wd0Var.setBackground(c12);
        }
        ImageView imageView2 = this.y;
        if (imageView2 != null) {
            eh.d c13 = bVar.c(imageView2, null, false);
            c13.v(gh.c.d(u6Var));
            c13.x(AndroidUtilities.dp(18.0f));
            c13.w(AndroidUtilities.dp(6.0f));
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
            R();
            invalidate();
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.J1 = chatFull;
        X(false);
    }

    public void setDelegate(ty tyVar) {
        this.t1 = tyVar;
    }

    public void setDragListener(wx wxVar) {
        this.O0 = wxVar;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        cx cxVar = this.G0;
        if (cxVar != null) {
            cxVar.d.setEnabled(z10);
        }
        ww wwVar = this.o0;
        if (wwVar != null) {
            wwVar.d.setEnabled(z10);
        }
        rw rwVar = this.V;
        if (rwVar != null) {
            rwVar.d.setEnabled(z10);
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
                    D();
                }
                k(true);
                k(false);
                MediaDataController.getInstance(i11).loadRecents(0, true, true, false);
                MediaDataController.getInstance(i11).loadRecents(0, false, true, false);
                MediaDataController.getInstance(i11).loadRecents(2, false, true, false);
            }
            ig.f1 f1Var = this.T0;
            if (f1Var != null) {
                f1Var.a();
            }
        }
    }

    public final void t(boolean z10) {
        s(-1L, z10);
    }

    public final void u(boolean z10) {
        jz jzVar;
        boolean z11 = this.R2;
        this.R2 = z10;
        if (!z11 || z10) {
            return;
        }
        int i10 = this.A1;
        if (i10 == 0) {
            zx zxVar = this.R;
            if (zxVar != null) {
                zxVar.F(false);
                return;
            }
            return;
        }
        if (i10 == 1) {
            xy xyVar = this.n0;
            if (xyVar != null) {
                xyVar.l();
                return;
            }
            return;
        }
        if (i10 != 2 || (jzVar = this.y0) == null) {
            return;
        }
        jzVar.l();
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        try {
            S();
            hh.c cVar = this.l2;
            if (cVar != null) {
                cVar.a(A(org.telegram.ui.ActionBar.y6.d6));
            }
            wd0 wd0Var = this.w;
            if (wd0Var != null) {
                wd0Var.setIndicatorColor(i0.a.o(A(org.telegram.ui.ActionBar.y6.Oe), 20));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final int v(float f7) {
        return i0.a.o(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Wk, this.Z1), (int) (f7 * 255.0f));
    }

    public final s4.t w(int i10) {
        if (i10 == 0) {
            return this.E0;
        }
        if (i10 == 1) {
            return this.Q;
        }
        if (i10 == 2) {
            return this.i0;
        }
        throw new IllegalArgumentException(ic.a.i(i10, "Unexpected argument: "));
    }

    public final mm0 x(int i10) {
        if (i10 == 0) {
            return this.D0;
        }
        if (i10 == 1) {
            return this.P;
        }
        if (i10 == 2) {
            return this.h0;
        }
        throw new IllegalArgumentException(ic.a.i(i10, "Unexpected argument: "));
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
        throw new IllegalArgumentException(ic.a.i(i10, "Unexpected argument: "));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // oe.d
    public final void z(float f7, int i10) {
    }
}
