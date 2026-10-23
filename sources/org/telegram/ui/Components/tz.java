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
import org.telegram.ui.va1;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public class tz extends FrameLayout implements org.telegram.ui.ActionBar.b6, ne.d, NotificationCenter.NotificationCenterDelegate, qh.a {
    public static final /* synthetic */ int U2 = 0;
    public final pw A0;
    public int A1;
    public final ArrayList A2;
    public final ex B0;
    public final ev B1;
    public final GradientDrawable B2;
    public final fx C0;
    public final int C1;
    public int C2;
    public final ax D0;
    public final int[] D1;
    public ArrayList D2;
    public final ImageView E;
    public final bx E0;
    public int E1;
    public int E2;
    public AnimatorSet F;
    public rz F0;
    public int F1;
    public long F2;
    public AnimatorSet G;
    public final dx G0;
    public int G1;
    public final ne.b G2;
    public float H;
    public final oh.d H0;
    public int H1;
    public ArrayList H2;
    public final vx I;
    public boolean I0;
    public int I1;
    public Drawable I2;
    public final qx J;
    public boolean J0;
    public TLRPC.ChatFull J1;
    public int J2;
    public final ah.v K;
    public boolean K0;
    public boolean K1;
    public int K2;
    public final oh.b L;
    public final ly L0;
    public int L1;
    public int L2;
    public final ah.v M;
    public AnimatorSet M0;
    public final ci.s4 M1;
    public int M2;
    public final oh.b N;
    public final ai.wd N0;
    public boolean N1;
    public boolean N2;
    public final View O;
    public xx O0;
    public int O1;
    public NotificationCenter.ObserversGroup O2;
    public final ey P;
    public boolean P0;
    public boolean P1;
    public AnimatorSet P2;
    public final rx Q;
    public final int[] Q0;
    public boolean Q1;
    public e2.n0 Q2;
    public final ay R;
    public final ObjectAnimator[] R0;
    public cz R1;
    public final lw R2;
    public final ty S;
    public boolean S0;
    public float S1;
    public boolean S2;
    public rz T;
    public hg.f1 T0;
    public float T1;
    public boolean T2;
    public final oh.d U;
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
    public final org.telegram.ui.ActionBar.o2 Y1;
    public final Drawable[] Z0;
    public final org.telegram.ui.ActionBar.g6 Z1;
    public final ne.b a;
    public final pl0 a0;
    public final String[] a1;
    public final org.telegram.ui.ActionBar.w5 a2;
    public final ne.b b;
    public final pl0 b0;
    public final int b1;
    public final org.telegram.ui.ActionBar.w5 b2;
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
    public final org.telegram.ui.Cells.u5 f2;
    public final tw g0;
    public boolean g1;
    public final lx g2;
    public final gx h;
    public final uw h0;
    public TLRPC.TL_messages_stickerSet h1;
    public boolean h2;
    public final zy i0;
    public ArrayList i1;
    public final boolean i2;
    public final yy j0;
    public ArrayList j1;
    public final bh.f j2;
    public final bz k0;
    public ArrayList k1;
    public final kh k2;
    public final HashMap l0;
    public ArrayList l1;
    public final gh.c l2;
    public final pw m0;
    public final ArrayList m1;
    public final bh.b m2;
    public final FrameLayout n;
    public final yy n0;
    public final ArrayList n1;
    public final ni.e n2;
    public final xw o0;
    public final ArrayList o1;
    public boolean o2;
    public final yx p0;
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
    public uy t1;
    public int t2;
    public boolean u0;
    public long u1;
    public int u2;
    public final View v;
    public boolean v0;
    public boolean v1;
    public long v2;
    public final ae0 w;
    public boolean w0;
    public boolean w1;
    public boolean w2;
    public final hx x;
    public final yw x0;
    public final TLRPC.StickerSetCovered[] x1;
    public boolean x2;
    public final ImageView y;
    public final kz y0;
    public final LongSparseArray y1;
    public final Rect y2;
    public final oz z0;
    public final LongSparseArray z1;
    public final RectF z2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v16, types: [org.telegram.ui.Components.am0, org.telegram.ui.Components.pw] */
    /* JADX WARN: Type inference failed for: r4v58, types: [org.telegram.ui.Components.am0, org.telegram.ui.Components.pw] */
    public tz(org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11, boolean z12, Context context, boolean z13, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z14, final org.telegram.ui.ActionBar.g6 g6Var, boolean z15, boolean z16) {
        super(context);
        org.telegram.ui.ActionBar.w5 w5Var;
        int A;
        int i10;
        lw lwVar;
        boolean z17;
        qx qxVar;
        int i11;
        Context context2;
        final org.telegram.ui.ActionBar.g6 g6Var2;
        ni.e eVar;
        ay ayVar;
        int i12;
        boolean z18;
        int i13;
        boolean z19;
        Field field;
        bs bsVar = bs.h;
        this.a = new ne.b(0, this, bsVar, 320L, false);
        this.b = new ne.b(1, this, bsVar, 320L, false);
        this.c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = new ArrayList();
        this.c0 = true;
        this.k0 = new bz(this);
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
        int i14 = UserConfig.selectedAccount;
        this.c1 = i14;
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
        this.f2 = new org.telegram.ui.Cells.u5(this, 12);
        this.g2 = new lx(this);
        this.h2 = true;
        ni.e eVar2 = new ni.e();
        this.n2 = eVar2;
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
        this.B2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.G2 = new ne.b(0, new mw(this, 3), bsVar, 380L, true);
        this.R2 = new lw(this, 1);
        this.S2 = false;
        this.u0 = z14;
        this.Y1 = o2Var;
        this.c2 = z10;
        this.Z1 = g6Var;
        this.i2 = z16;
        gh.c cVar = new gh.c();
        this.l2 = cVar;
        cVar.a(A(org.telegram.ui.ActionBar.k6.d6));
        if (z15) {
            v(true);
        }
        i0.a.o(A(org.telegram.ui.ActionBar.k6.Wk), 30);
        int dp = AndroidUtilities.dp(50.0f);
        this.b1 = dp;
        this.d0 = z13;
        this.X0 = new Drawable[]{org.telegram.ui.ActionBar.k6.V(context, R.drawable.smiles_tab_smiles, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.k6.Re), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe)), org.telegram.ui.ActionBar.k6.V(context, R.drawable.smiles_tab_gif, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.k6.Re), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe)), org.telegram.ui.ActionBar.k6.V(context, R.drawable.smiles_tab_stickers, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.k6.Re), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe))};
        org.telegram.ui.ActionBar.w5 V = org.telegram.ui.ActionBar.k6.V(context, R.drawable.msg_emoji_recent, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.k6.Me), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe));
        org.telegram.ui.ActionBar.w5 V2 = org.telegram.ui.ActionBar.k6.V(context, R.drawable.emoji_tabs_faves, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.k6.Me), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe));
        org.telegram.ui.ActionBar.w5 V3 = org.telegram.ui.ActionBar.k6.V(context, R.drawable.emoji_tabs_new3, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.k6.Me), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe));
        int i15 = R.drawable.emoji_tabs_new1;
        if (z16) {
            w5Var = V3;
            A = w(0.4f);
        } else {
            w5Var = V3;
            A = A(org.telegram.ui.ActionBar.k6.Me);
        }
        org.telegram.ui.ActionBar.w5 V4 = org.telegram.ui.ActionBar.k6.V(context, i15, A, z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe));
        this.a2 = V4;
        int i16 = R.drawable.emoji_tabs_new2;
        int i17 = org.telegram.ui.ActionBar.k6.Qe;
        org.telegram.ui.ActionBar.w5 V5 = org.telegram.ui.ActionBar.k6.V(context, i16, A(i17), A(i17));
        this.b2 = V5;
        this.Y0 = new Drawable[]{V, V2, w5Var, new LayerDrawable(new Drawable[]{V4, V5})};
        this.Z0 = new Drawable[]{org.telegram.ui.ActionBar.k6.V(context, R.drawable.msg_emoji_recent, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.k6.Me), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe)), org.telegram.ui.ActionBar.k6.V(context, R.drawable.stickers_gifs_trending, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.k6.Me), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe))};
        this.a1 = new String[]{LocaleController.getString(R.string.Emoji1), LocaleController.getString(R.string.Emoji2), LocaleController.getString(R.string.Emoji3), LocaleController.getString(R.string.Emoji4), LocaleController.getString(R.string.Emoji5), LocaleController.getString(R.string.Emoji6), LocaleController.getString(R.string.Emoji7), LocaleController.getString(R.string.Emoji8)};
        this.J1 = chatFull;
        Paint paint = new Paint(1);
        this.s1 = paint;
        paint.setColor(A(org.telegram.ui.ActionBar.k6.af));
        float dp2 = AndroidUtilities.dp(6.0f);
        ci.n1 n1Var = zf.j0.a;
        this.M1 = new ci.s4(dp2);
        qx qxVar2 = new qx(this, context);
        this.J = qxVar2;
        pz pzVar = new pz();
        pzVar.a = 0;
        pzVar.b = qxVar2;
        arrayList.add(pzVar);
        if (z10) {
            MediaDataController.getInstance(i14).checkStickers(5);
            MediaDataController.getInstance(i14).checkFeaturedEmoji();
            this.e2 = new PorterDuffColorFilter(A(org.telegram.ui.ActionBar.k6.Oh), PorterDuff.Mode.SRC_IN);
        }
        ey eyVar = new ey(this, context);
        this.P = eyVar;
        eVar2.a(eyVar);
        s4.k kVar = new s4.k();
        kVar.c = 220L;
        kVar.e = 220L;
        kVar.f = 160L;
        kVar.g = 160L;
        kVar.i = bs.g;
        eyVar.setItemAnimator(kVar);
        final int i18 = 0;
        eyVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.nw
            public final /* synthetic */ tz b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (i18) {
                    case 0:
                        org.telegram.ui.ht o10 = org.telegram.ui.ht.o();
                        tz tzVar = this.b;
                        ey eyVar2 = tzVar.P;
                        tzVar.getMeasuredHeight();
                        return o10.q(motionEvent, eyVar2, null, tzVar.g2, g6Var);
                    case 1:
                        org.telegram.ui.ht o11 = org.telegram.ui.ht.o();
                        tz tzVar2 = this.b;
                        return o11.q(motionEvent, tzVar2.h0, tzVar2.m0, tzVar2.g2, g6Var);
                    default:
                        org.telegram.ui.ht o12 = org.telegram.ui.ht.o();
                        tz tzVar3 = this.b;
                        ax axVar = tzVar3.D0;
                        tzVar3.getMeasuredHeight();
                        return o12.q(motionEvent, axVar, tzVar3.A0, tzVar3.g2, g6Var);
                }
            }
        });
        eyVar.setOnItemLongClickListener(new mw(this, 1));
        eyVar.setInstantClick(true);
        rx rxVar = new rx(this);
        this.Q = rxVar;
        eyVar.setLayoutManager(rxVar);
        eyVar.setTopGlowOffset(AndroidUtilities.dp(38.0f));
        eyVar.setBottomGlowOffset(AndroidUtilities.dp(36.0f));
        eyVar.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f));
        int i19 = org.telegram.ui.ActionBar.k6.He;
        org.telegram.ui.ActionBar.r6.m(eyVar, 21, i19, g6Var);
        eyVar.setItemSelectorColorProvider(new e2(22));
        eyVar.setClipToPadding(false);
        rxVar.O = new sx(this);
        ay ayVar2 = new ay(this);
        this.R = ayVar2;
        eyVar.setAdapter(ayVar2);
        eyVar.i(new ei.q1(this, 3));
        this.S = new ty(this, context);
        qxVar2.addView(eyVar, w7.z5.c(-1.0f, -1));
        pl0 pl0Var = new pl0(eyVar, rxVar);
        this.b0 = pl0Var;
        pl0Var.i = new tx(this);
        eyVar.setOnScrollListener(new ux(this));
        if (o2Var != null) {
            i10 = -1;
            lwVar = new lw(this, 2);
            z17 = z10;
            qxVar = qxVar2;
            i11 = i17;
            context2 = context;
            eVar = eVar2;
            i12 = 5;
            z18 = z16;
            g6Var2 = g6Var;
            ayVar = ayVar2;
        } else {
            i10 = -1;
            lwVar = null;
            z17 = z10;
            qxVar = qxVar2;
            i11 = i17;
            context2 = context;
            g6Var2 = g6Var;
            eVar = eVar2;
            ayVar = ayVar2;
            i12 = 5;
            z18 = z16;
        }
        vx vxVar = new vx(this, context2, g6Var2, z17, lwVar, z18);
        this.I = vxVar;
        if (z13) {
            rw rwVar = new rw(this, context2);
            this.V = rwVar;
            qxVar.addView(rwVar, new FrameLayout.LayoutParams(i10, AndroidUtilities.getShadowHeight() + dp));
            rwVar.d.setOnFocusChangeListener(new sw(this));
            oh.d dVar = new oh.d(context2, g6Var2);
            this.U = dVar;
            dVar.setVisibility(8);
            final int i20 = 0;
            dVar.setOnBackClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ow
                public final /* synthetic */ tz b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i20) {
                        case 0:
                            ty tyVar = this.b.S;
                            my myVar = tyVar.c;
                            int childCount = myVar.getChildCount();
                            for (int i21 = 0; i21 < childCount; i21++) {
                                ((oh.c) myVar.getChildAt(i21)).a(false, true);
                            }
                            tyVar.d = 0L;
                            tyVar.F.b.a(false, true);
                            tyVar.l();
                            break;
                        case 1:
                            oz ozVar = this.b.z0;
                            nz nzVar = ozVar.c;
                            int childCount2 = nzVar.getChildCount();
                            for (int i22 = 0; i22 < childCount2; i22++) {
                                ((oh.c) nzVar.getChildAt(i22)).a(false, true);
                            }
                            ozVar.d = 0L;
                            ozVar.Q.a.a(false, true);
                            ozVar.l();
                            break;
                        case 2:
                            uy uyVar = this.b.t1;
                            if (uyVar != null) {
                                uyVar.w();
                                break;
                            }
                            break;
                        default:
                            tz tzVar = this.b;
                            int currentItem = tzVar.h.getCurrentItem();
                            gz gzVar = currentItem == 0 ? tzVar.V : currentItem == 1 ? tzVar.o0 : tzVar.G0;
                            if (gzVar != null) {
                                sq sqVar = gzVar.d;
                                sqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                sqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                sqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
            qxVar.addView(dVar, new FrameLayout.LayoutParams(i10, dp));
        }
        if (Color.alpha(A(i19)) >= 255) {
            org.telegram.ui.ActionBar.r6.i(i19, vxVar, g6Var2);
        }
        ayVar.G(true);
        vxVar.p(getEmojipacks());
        qxVar.addView(vxVar, w7.z5.c(36.0f, i10));
        View view = new View(context2);
        this.O = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i21 = org.telegram.ui.ActionBar.k6.Ke;
        org.telegram.ui.ActionBar.r6.i(i21, view, g6Var2);
        ay ayVar3 = ayVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i10, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(36.0f);
        qxVar.addView(view, layoutParams);
        oh.b bVar = new oh.b(context2, g6Var2);
        this.L = bVar;
        ah.v vVar = new ah.v(context2, g6Var2);
        this.K = vVar;
        vVar.setVisibility(8);
        vVar.addView(bVar, w7.z5.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
        qxVar.addView(vVar, w7.z5.e(i10, -2, 80));
        if (z11) {
            jn0 jn0Var = jn0.b;
            if (z12) {
                tw twVar = new tw(this, context2);
                this.g0 = twVar;
                pz pzVar2 = new pz();
                pzVar2.a = 1;
                pzVar2.b = twVar;
                this.d.add(pzVar2);
                uw uwVar = new uw(this, context2);
                this.h0 = uwVar;
                eVar.a(uwVar);
                final int i22 = 0;
                uwVar.setClipToPadding(false);
                zy zyVar = new zy(this);
                this.i0 = zyVar;
                uwVar.setLayoutManager(zyVar);
                uwVar.i(new vw(this));
                uwVar.setPadding(0, dp, 0, AndroidUtilities.dp(44.0f) + this.q2);
                ((s4.e1) uwVar.getItemAnimator()).m = false;
                final int i23 = 1;
                yy yyVar = new yy(this, context2, true, ConnectionsManager.DEFAULT_DATACENTER_ID);
                this.n0 = yyVar;
                uwVar.setAdapter(yyVar);
                this.j0 = new yy(this, context2, false, 0);
                uwVar.setOnScrollListener(new ww(this));
                uwVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.nw
                    public final /* synthetic */ tz b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (i23) {
                            case 0:
                                org.telegram.ui.ht o10 = org.telegram.ui.ht.o();
                                tz tzVar = this.b;
                                ey eyVar2 = tzVar.P;
                                tzVar.getMeasuredHeight();
                                return o10.q(motionEvent, eyVar2, null, tzVar.g2, g6Var2);
                            case 1:
                                org.telegram.ui.ht o11 = org.telegram.ui.ht.o();
                                tz tzVar2 = this.b;
                                return o11.q(motionEvent, tzVar2.h0, tzVar2.m0, tzVar2.g2, g6Var2);
                            default:
                                org.telegram.ui.ht o12 = org.telegram.ui.ht.o();
                                tz tzVar3 = this.b;
                                ax axVar = tzVar3.D0;
                                tzVar3.getMeasuredHeight();
                                return o12.q(motionEvent, axVar, tzVar3.A0, tzVar3.g2, g6Var2);
                        }
                    }
                });
                ?? r10 = new am0(this) { // from class: org.telegram.ui.Components.pw
                    public final /* synthetic */ tz b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.ui.Components.am0
                    public final void d(int i24, View view2) {
                        switch (i22) {
                            case 0:
                                tz tzVar = this.b;
                                uw uwVar2 = tzVar.h0;
                                yy yyVar2 = tzVar.j0;
                                yy yyVar3 = tzVar.n0;
                                if (tzVar.t1 != null) {
                                    yyVar3.getClass();
                                    ArrayList arrayList3 = yyVar3.x;
                                    if (uwVar2.getAdapter() != yyVar3) {
                                        if (uwVar2.getAdapter() == yyVar2 && i24 >= 0 && i24 < yyVar2.x.size()) {
                                            tzVar.t1.v(view2, yyVar2.x.get(i24), yyVar2.w, yyVar2.n, true, 0, 0);
                                            tzVar.W();
                                            break;
                                        }
                                    } else if (i24 >= 0) {
                                        int i25 = yyVar3.H;
                                        if (i24 >= i25) {
                                            int i26 = i25 > 0 ? (i24 - i25) - 1 : i24;
                                            if (i26 >= 0 && i26 < arrayList3.size()) {
                                                tzVar.t1.v(view2, arrayList3.get(i26), null, yyVar3.n, true, 0, 0);
                                                break;
                                            }
                                        } else {
                                            tzVar.t1.v(view2, tzVar.i1.get(i24), null, "gif", true, 0, 0);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                tz tzVar2 = this.b;
                                s4.g0 adapter = tzVar2.D0.getAdapter();
                                oz ozVar = tzVar2.z0;
                                String str = adapter == ozVar ? ozVar.N : null;
                                if (view2 instanceof org.telegram.ui.Cells.e8) {
                                    org.telegram.ui.Cells.e8 e8Var = (org.telegram.ui.Cells.e8) view2;
                                    if (e8Var.getSticker() != null && MessageObject.isPremiumSticker(e8Var.getSticker()) && !AccountInstance.getInstance(tzVar2.c1).getUserConfig().isPremium()) {
                                        org.telegram.ui.ht.o().w(e8Var);
                                        break;
                                    } else {
                                        org.telegram.ui.ht.o().s();
                                        if (!e8Var.r) {
                                            e8Var.r = true;
                                            e8Var.n = 0.5f;
                                            e8Var.x = 0L;
                                            org.telegram.ui.Cells.d8 d8Var = e8Var.a;
                                            d8Var.setAlpha(0.5f * e8Var.H);
                                            d8Var.invalidate();
                                            e8Var.s = System.currentTimeMillis();
                                            e8Var.invalidate();
                                            tzVar2.t1.m(e8Var, e8Var.getSticker(), str, e8Var.getParentObject(), e8Var.getSendAnimationData(), true, 0);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                };
                this.m0 = r10;
                uwVar.setOnItemClickListener((am0) r10);
                twVar.addView(uwVar, w7.z5.c(-1.0f, -1));
                xw xwVar = new xw(this, context2);
                this.o0 = xwVar;
                twVar.addView(xwVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
                yx yxVar = new yx(this, context2, g6Var2);
                this.p0 = yxVar;
                yxVar.setType(jn0Var);
                yxVar.setUnderlineHeight(AndroidUtilities.getShadowHeight());
                yxVar.setIndicatorColor(A(i11));
                yxVar.setUnderlineColor(A(i21));
                org.telegram.ui.ActionBar.r6.i(i19, yxVar, g6Var2);
                V();
                yxVar.setDelegate(new mw(this, 2));
                yyVar.F("", "", true, true, true);
            }
            yw ywVar = new yw(this, context2, z14);
            this.x0 = ywVar;
            MediaDataController.getInstance(this.c1).checkStickers(0);
            MediaDataController.getInstance(this.c1).checkFeaturedStickers();
            ax axVar = new ax(this, context2);
            this.D0 = axVar;
            this.n2.a(axVar);
            bx bxVar = new bx(this);
            this.E0 = bxVar;
            axVar.setLayoutManager(bxVar);
            bxVar.O = new cx(this);
            axVar.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f));
            axVar.setClipToPadding(false);
            pz pzVar3 = new pz();
            pzVar3.a = 2;
            pzVar3.b = ywVar;
            this.d.add(pzVar3);
            this.z0 = new oz(this, context2);
            kz kzVar = new kz(this, context2);
            this.y0 = kzVar;
            axVar.setAdapter(kzVar);
            final int i24 = 2;
            axVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.nw
                public final /* synthetic */ tz b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (i24) {
                        case 0:
                            org.telegram.ui.ht o10 = org.telegram.ui.ht.o();
                            tz tzVar = this.b;
                            ey eyVar2 = tzVar.P;
                            tzVar.getMeasuredHeight();
                            return o10.q(motionEvent, eyVar2, null, tzVar.g2, g6Var2);
                        case 1:
                            org.telegram.ui.ht o11 = org.telegram.ui.ht.o();
                            tz tzVar2 = this.b;
                            return o11.q(motionEvent, tzVar2.h0, tzVar2.m0, tzVar2.g2, g6Var2);
                        default:
                            org.telegram.ui.ht o12 = org.telegram.ui.ht.o();
                            tz tzVar3 = this.b;
                            ax axVar2 = tzVar3.D0;
                            tzVar3.getMeasuredHeight();
                            return o12.q(motionEvent, axVar2, tzVar3.A0, tzVar3.g2, g6Var2);
                    }
                }
            });
            final int i25 = 1;
            ?? r42 = new am0(this) { // from class: org.telegram.ui.Components.pw
                public final /* synthetic */ tz b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.Components.am0
                public final void d(int i242, View view2) {
                    switch (i25) {
                        case 0:
                            tz tzVar = this.b;
                            uw uwVar2 = tzVar.h0;
                            yy yyVar2 = tzVar.j0;
                            yy yyVar3 = tzVar.n0;
                            if (tzVar.t1 != null) {
                                yyVar3.getClass();
                                ArrayList arrayList3 = yyVar3.x;
                                if (uwVar2.getAdapter() != yyVar3) {
                                    if (uwVar2.getAdapter() == yyVar2 && i242 >= 0 && i242 < yyVar2.x.size()) {
                                        tzVar.t1.v(view2, yyVar2.x.get(i242), yyVar2.w, yyVar2.n, true, 0, 0);
                                        tzVar.W();
                                        break;
                                    }
                                } else if (i242 >= 0) {
                                    int i252 = yyVar3.H;
                                    if (i242 >= i252) {
                                        int i26 = i252 > 0 ? (i242 - i252) - 1 : i242;
                                        if (i26 >= 0 && i26 < arrayList3.size()) {
                                            tzVar.t1.v(view2, arrayList3.get(i26), null, yyVar3.n, true, 0, 0);
                                            break;
                                        }
                                    } else {
                                        tzVar.t1.v(view2, tzVar.i1.get(i242), null, "gif", true, 0, 0);
                                        break;
                                    }
                                }
                            }
                            break;
                        default:
                            tz tzVar2 = this.b;
                            s4.g0 adapter = tzVar2.D0.getAdapter();
                            oz ozVar = tzVar2.z0;
                            String str = adapter == ozVar ? ozVar.N : null;
                            if (view2 instanceof org.telegram.ui.Cells.e8) {
                                org.telegram.ui.Cells.e8 e8Var = (org.telegram.ui.Cells.e8) view2;
                                if (e8Var.getSticker() != null && MessageObject.isPremiumSticker(e8Var.getSticker()) && !AccountInstance.getInstance(tzVar2.c1).getUserConfig().isPremium()) {
                                    org.telegram.ui.ht.o().w(e8Var);
                                    break;
                                } else {
                                    org.telegram.ui.ht.o().s();
                                    if (!e8Var.r) {
                                        e8Var.r = true;
                                        e8Var.n = 0.5f;
                                        e8Var.x = 0L;
                                        org.telegram.ui.Cells.d8 d8Var = e8Var.a;
                                        d8Var.setAlpha(0.5f * e8Var.H);
                                        d8Var.invalidate();
                                        e8Var.s = System.currentTimeMillis();
                                        e8Var.invalidate();
                                        tzVar2.t1.m(e8Var, e8Var.getSticker(), str, e8Var.getParentObject(), e8Var.getSendAnimationData(), true, 0);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            };
            this.A0 = r42;
            axVar.setOnItemClickListener((am0) r42);
            org.telegram.ui.ActionBar.r6.m(axVar, 21, i19, g6Var2);
            ywVar.addView(axVar);
            this.a0 = new pl0(axVar, bxVar);
            dx dxVar = new dx(this, context2);
            this.G0 = dxVar;
            ywVar.addView(dxVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
            oh.d dVar2 = new oh.d(context2, g6Var2);
            this.H0 = dVar2;
            dVar2.setVisibility(8);
            final int i26 = 1;
            dVar2.setOnBackClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ow
                public final /* synthetic */ tz b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i26) {
                        case 0:
                            ty tyVar = this.b.S;
                            my myVar = tyVar.c;
                            int childCount = myVar.getChildCount();
                            for (int i212 = 0; i212 < childCount; i212++) {
                                ((oh.c) myVar.getChildAt(i212)).a(false, true);
                            }
                            tyVar.d = 0L;
                            tyVar.F.b.a(false, true);
                            tyVar.l();
                            break;
                        case 1:
                            oz ozVar = this.b.z0;
                            nz nzVar = ozVar.c;
                            int childCount2 = nzVar.getChildCount();
                            for (int i222 = 0; i222 < childCount2; i222++) {
                                ((oh.c) nzVar.getChildAt(i222)).a(false, true);
                            }
                            ozVar.d = 0L;
                            ozVar.Q.a.a(false, true);
                            ozVar.l();
                            break;
                        case 2:
                            uy uyVar = this.b.t1;
                            if (uyVar != null) {
                                uyVar.w();
                                break;
                            }
                            break;
                        default:
                            tz tzVar = this.b;
                            int currentItem = tzVar.h.getCurrentItem();
                            gz gzVar = currentItem == 0 ? tzVar.V : currentItem == 1 ? tzVar.o0 : tzVar.G0;
                            if (gzVar != null) {
                                sq sqVar = gzVar.d;
                                sqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                sqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                sqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
            ywVar.addView(dVar2, new FrameLayout.LayoutParams(-1, dp));
            z19 = z14;
            i13 = 80;
            ex exVar = new ex(this, context2, g6Var2, o2Var, z19);
            this.B0 = exVar;
            exVar.setDragEnabled(true);
            exVar.setWillNotDraw(false);
            exVar.setType(jn0Var);
            exVar.setUnderlineHeight(axVar.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
            exVar.setIndicatorColor(A(i11));
            exVar.setUnderlineColor(A(i21));
            if (viewGroup == null || !z19) {
                ywVar.addView(exVar, w7.z5.e(-1, 36, 51));
            } else {
                fx fxVar = new fx(this, context2);
                this.C0 = fxVar;
                fxVar.addView(exVar, w7.z5.e(-1, 36, 51));
                viewGroup.addView(fxVar, w7.z5.c(-2.0f, -1));
            }
            X(true);
            exVar.setDelegate(new mw(this, 4));
            axVar.setOnScrollListener(new sz(this, 0));
            oh.b bVar2 = new oh.b(context2, g6Var2);
            this.N = bVar2;
            ah.v vVar2 = new ah.v(context2, g6Var2);
            this.M = vVar2;
            vVar2.setVisibility(8);
            vVar2.addView(bVar2, w7.z5.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
            ywVar.addView(vVar2, w7.z5.e(-1, -2, 80));
        } else {
            i13 = 80;
            z19 = z14;
        }
        this.e.clear();
        this.e.addAll(this.d);
        gx gxVar = new gx(this, context2);
        this.h = gxVar;
        ni.e eVar3 = this.n2;
        eVar3.getClass();
        gxVar.b(new ci.w5(eVar3, 1));
        gxVar.setOverScrollMode(2);
        ly lyVar = new ly(this);
        this.L0 = lyVar;
        gxVar.setAdapter(lyVar);
        hx hxVar = new hx(this, context2);
        this.x = hxVar;
        hxVar.setHapticFeedbackEnabled(true);
        hxVar.setImageResource(R.drawable.smiles_tab_clear);
        int w9 = z16 ? w(0.6f) : A(org.telegram.ui.ActionBar.k6.Re);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        hxVar.setColorFilter(new PorterDuffColorFilter(w9, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        hxVar.setScaleType(scaleType);
        hxVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        hxVar.setFocusable(true);
        hxVar.setOnClickListener(new ix());
        w7.b6.a(hxVar);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.r = frameLayout;
        if (z13) {
            addView(frameLayout, w7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, (AndroidUtilities.getShadowHeight() / AndroidUtilities.density) + 40.0f));
        } else {
            addView(frameLayout, w7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.s = frameLayout2;
        addView(frameLayout2, w7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.n = frameLayout3;
        View view2 = new View(context2);
        this.v = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(40.0f), 83));
        if (z13) {
            addView(frameLayout3, w7.z5.e(-1, 48, i13));
            frameLayout3.addView(hxVar, w7.z5.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
            if (z11) {
                ImageView imageView = new ImageView(context2);
                this.y = imageView;
                imageView.setImageResource(R.drawable.smiles_tab_settings);
                imageView.setColorFilter(new PorterDuffColorFilter(z16 ? w(0.6f) : A(org.telegram.ui.ActionBar.k6.Re), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(LocaleController.getString(R.string.Settings));
                w7.b6.a(imageView);
                frameLayout3.addView(imageView, w7.z5.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
                final int i27 = 2;
                imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ow
                    public final /* synthetic */ tz b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i27) {
                            case 0:
                                ty tyVar = this.b.S;
                                my myVar = tyVar.c;
                                int childCount = myVar.getChildCount();
                                for (int i212 = 0; i212 < childCount; i212++) {
                                    ((oh.c) myVar.getChildAt(i212)).a(false, true);
                                }
                                tyVar.d = 0L;
                                tyVar.F.b.a(false, true);
                                tyVar.l();
                                break;
                            case 1:
                                oz ozVar = this.b.z0;
                                nz nzVar = ozVar.c;
                                int childCount2 = nzVar.getChildCount();
                                for (int i222 = 0; i222 < childCount2; i222++) {
                                    ((oh.c) nzVar.getChildAt(i222)).a(false, true);
                                }
                                ozVar.d = 0L;
                                ozVar.Q.a.a(false, true);
                                ozVar.l();
                                break;
                            case 2:
                                uy uyVar = this.b.t1;
                                if (uyVar != null) {
                                    uyVar.w();
                                    break;
                                }
                                break;
                            default:
                                tz tzVar = this.b;
                                int currentItem = tzVar.h.getCurrentItem();
                                gz gzVar = currentItem == 0 ? tzVar.V : currentItem == 1 ? tzVar.o0 : tzVar.G0;
                                if (gzVar != null) {
                                    sq sqVar = gzVar.d;
                                    sqVar.requestFocus();
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                    sqVar.onTouchEvent(obtain);
                                    obtain.recycle();
                                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                    sqVar.onTouchEvent(obtain2);
                                    obtain2.recycle();
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
            ae0 ae0Var = new ae0(context2, g6Var2);
            this.w = ae0Var;
            ae0Var.setViewPager(gxVar);
            ae0Var.setShouldExpand(false);
            ae0Var.setIndicatorHeight(AndroidUtilities.dp(3.0f));
            ae0Var.setIndicatorColor(i0.a.o(A(org.telegram.ui.ActionBar.k6.Oe), 20));
            ae0Var.setUnderlineHeight(0);
            ae0Var.setTabPaddingLeftRight(AndroidUtilities.dp(11.0f));
            ae0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
            frameLayout3.addView(ae0Var, w7.z5.e(-2, 48, 81));
            ae0Var.setOnPageChangeListener(new jx(this, z19));
            ImageView imageView2 = new ImageView(context2);
            this.E = imageView2;
            imageView2.setImageResource(R.drawable.smiles_tab_search);
            imageView2.setColorFilter(new PorterDuffColorFilter(z16 ? w(0.6f) : A(org.telegram.ui.ActionBar.k6.Re), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(LocaleController.getString(R.string.Search));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, w7.z5.d(48, 48.0f, 83, 2.0f, 0.0f, 2.0f, 0.0f));
            final int i28 = 3;
            imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ow
                public final /* synthetic */ tz b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view22) {
                    switch (i28) {
                        case 0:
                            ty tyVar = this.b.S;
                            my myVar = tyVar.c;
                            int childCount = myVar.getChildCount();
                            for (int i212 = 0; i212 < childCount; i212++) {
                                ((oh.c) myVar.getChildAt(i212)).a(false, true);
                            }
                            tyVar.d = 0L;
                            tyVar.F.b.a(false, true);
                            tyVar.l();
                            break;
                        case 1:
                            oz ozVar = this.b.z0;
                            nz nzVar = ozVar.c;
                            int childCount2 = nzVar.getChildCount();
                            for (int i222 = 0; i222 < childCount2; i222++) {
                                ((oh.c) nzVar.getChildAt(i222)).a(false, true);
                            }
                            ozVar.d = 0L;
                            ozVar.Q.a.a(false, true);
                            ozVar.l();
                            break;
                        case 2:
                            uy uyVar = this.b.t1;
                            if (uyVar != null) {
                                uyVar.w();
                                break;
                            }
                            break;
                        default:
                            tz tzVar = this.b;
                            int currentItem = tzVar.h.getCurrentItem();
                            gz gzVar = currentItem == 0 ? tzVar.V : currentItem == 1 ? tzVar.o0 : tzVar.G0;
                            if (gzVar != null) {
                                sq sqVar = gzVar.d;
                                sqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                sqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                sqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            addView(frameLayout3, w7.z5.d(56, 48.0f, (LocaleController.isRTL ? 3 : i12) | 80, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.k6.i0(AndroidUtilities.dp(56.0f), A(i19), A(i19));
            w7.b6.a(hxVar);
            hxVar.setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
            hxVar.setBackground(i02);
            hxVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
            hxVar.setFocusable(true);
            frameLayout3.addView(hxVar, w7.z5.d(48, 48.0f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
            view2.setVisibility(8);
        }
        addView(gxVar, 0, w7.z5.e(-1, -1, 51));
        ai.wd wdVar = new ai.wd(context2, 22);
        this.N0 = wdVar;
        int dp3 = AndroidUtilities.dp(6.0f);
        int i29 = org.telegram.ui.ActionBar.k6.qf;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(dp3, A(i29));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i29);
        wdVar.setBackground(c02);
        org.telegram.ui.ActionBar.r6.k(wdVar, c02, O, null, g6Var2);
        org.telegram.ui.ActionBar.r6.W(wdVar, org.telegram.ui.ActionBar.k6.pf, g6Var2);
        wdVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f));
        wdVar.setGravity(16);
        wdVar.setTextSize(1, 14.0f);
        wdVar.setVisibility(4);
        addView(wdVar, w7.z5.d(-2, -2.0f, 81, 5.0f, 0.0f, 5.0f, 53.0f));
        this.C1 = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 32.0f);
        Field field2 = ev.f;
        ev evVar = new ev(new dv(context2, g6Var2));
        if (ev.f == null) {
            try {
                field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    field.setAccessible(true);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                field = null;
            }
            ev.f = field;
        }
        Field field3 = ev.f;
        if (field3 != null) {
            try {
                evVar.a = (ViewTreeObserver.OnScrollChangedListener) field3.get(evVar);
                ev.f.set(evVar, ev.g);
            } catch (Exception unused3) {
                evVar.a = null;
            }
        }
        this.B1 = evVar;
        evVar.c.setOnSelectionUpdateListener(new d(this, 10));
        this.A1 = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
        Emoji.loadRecentEmoji();
        ayVar3.F(false);
        I(true, z11, z12, false);
        if (Build.VERSION.SDK_INT >= 31) {
            bh.f fVar = new bh.f(false);
            this.j2 = fVar;
            gh.d dVar3 = new gh.d(null);
            dVar3.f = cVar;
            dVar3.d = fVar;
            dVar3.e = -2;
            bh.b bVar3 = new bh.b(dVar3);
            this.m2 = bVar3;
            bVar3.i = LiteMode.isEnabled(262144);
            int dp4 = AndroidUtilities.dp(LiteMode.isEnabled(262144) ? 8.0f : 48.0f);
            bVar3.b = dp4;
            bVar3.c = dp4;
            bVar3.h = this.n2;
        } else {
            bh.b bVar4 = new bh.b(cVar);
            this.m2 = bVar4;
            bVar4.h = this.n2;
            this.j2 = null;
        }
        this.k2 = new kh(this, 1);
        setBlurredBackgroundDrawableFactory(this.m2);
        this.n2.b(this);
        this.n2.a = new mw(this, 0);
    }

    public static void a(tz tzVar, boolean z10) {
        uw uwVar = tzVar.h0;
        if (uwVar == null) {
            return;
        }
        int childCount = uwVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = uwVar.getChildAt(i10);
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

    public static void d(tz tzVar, cz czVar, String str) {
        String str2;
        uy uyVar;
        org.telegram.ui.ActionBar.o2 o2Var = tzVar.Y1;
        int i10 = tzVar.c1;
        ArrayList arrayList = tzVar.q1;
        if (czVar == null) {
            return;
        }
        if (czVar.getSpan() == null) {
            tzVar.F2 = SystemClock.elapsedRealtime();
            tzVar.M(true);
            String str3 = str != null ? str : (String) czVar.getTag();
            new SpannableStringBuilder().append((CharSequence) str3);
            if (str != null) {
                uy uyVar2 = tzVar.t1;
                if (uyVar2 != null) {
                    uyVar2.l(Emoji.fixEmoji(str));
                    return;
                }
                return;
            }
            if (!czVar.c && (str2 = Emoji.emojiColor.get(str3)) != null) {
                str3 = g(str3, str2);
            }
            tzVar.h(str3);
            uy uyVar3 = tzVar.t1;
            if (uyVar3 != null) {
                uyVar3.l(Emoji.fixEmoji(str3));
                return;
            }
            return;
        }
        if (tzVar.t1 != null) {
            long j10 = czVar.getSpan().documentId;
            TLRPC.Document document = czVar.getSpan().document;
            fy fyVar = czVar.e;
            boolean z10 = fyVar != null && fyVar.i;
            if (document == null) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    fy fyVar2 = (fy) arrayList.get(i11);
                    int i12 = 0;
                    while (true) {
                        ArrayList arrayList2 = fyVar2.c;
                        if (arrayList2 != null && i12 < arrayList2.size()) {
                            if (((TLRPC.Document) fyVar2.c.get(i12)).id == j10) {
                                document = (TLRPC.Document) fyVar2.c.get(i12);
                                break;
                            }
                            i12++;
                        }
                    }
                }
            }
            if (document == null) {
                document = r5.f(i10, j10);
            }
            TLRPC.Document document2 = document;
            String findAnimatedEmojiEmoticon = document2 != null ? MessageObject.findAnimatedEmojiEmoticon(document2) : null;
            if (MessageObject.isFreeEmoji(document2) || UserConfig.getInstance(i10).isPremium() || (((uyVar = tzVar.t1) != null && uyVar.g()) || tzVar.U0 || z10)) {
                tzVar.F2 = SystemClock.elapsedRealtime();
                tzVar.M(true);
                tzVar.h("animated_" + j10);
                tzVar.t1.x(j10, document2, findAnimatedEmojiEmoticon, czVar.c);
                return;
            }
            tzVar.M(false);
            xc a02 = o2Var != null ? xc.a0(o2Var) : new xc(tzVar.r, tzVar.Z1);
            if (tzVar.h2 || o2Var == null) {
                a02.r(document2, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new lw(tzVar, 3)).j();
            } else {
                a02.J(R.raw.saved_messages, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint2)), LocaleController.getString(R.string.Open), new lw(tzVar, 4)).j();
            }
            tzVar.h2 = !tzVar.h2;
        }
    }

    public static void e(tz tzVar, int i10, int i11) {
        s4.b1 K;
        int[] iArr = tzVar.Q0;
        if (i10 == 1) {
            tzVar.n(i11, tzVar.P);
            return;
        }
        uy uyVar = tzVar.t1;
        if ((uyVar == null || !uyVar.z()) && !tzVar.J0) {
            mm0 y3 = tzVar.y(i10);
            if (i11 <= 0 || y3 == null || y3.getVisibility() != 0 || (K = y3.K(0)) == null || K.a.getTop() + tzVar.b1 < y3.getPaddingTop()) {
                int i12 = iArr[i10] - i11;
                iArr[i10] = i12;
                if (i12 > 0) {
                    iArr[i10] = 0;
                } else if (i12 < (-AndroidUtilities.dp(288.0f))) {
                    iArr[i10] = -AndroidUtilities.dp(288.0f);
                }
                if (i10 == 0) {
                    tzVar.Y();
                } else {
                    tzVar.z(i10).setTranslationY(Math.max(-AndroidUtilities.dp(48.0f), iArr[i10]));
                }
            }
        }
    }

    public static void f(tz tzVar, boolean z10) {
        int N0;
        zy zyVar = tzVar.i0;
        xw xwVar = tzVar.o0;
        uw uwVar = tzVar.h0;
        if (uwVar != null && (uwVar.getAdapter() instanceof yy)) {
            yy yyVar = (yy) uwVar.getAdapter();
            if (!yyVar.s && yyVar.h == 0 && !yyVar.x.isEmpty() && (N0 = zyVar.N0()) != -1 && N0 > zyVar.B() - 5) {
                String str = yyVar.w;
                String str2 = yyVar.r;
                boolean z11 = yyVar.v;
                yyVar.F(str, str2, true, z11, z11);
            }
        }
        uy uyVar = tzVar.t1;
        if (uyVar == null || !uyVar.z()) {
            if (xwVar == null || uwVar == null) {
                return;
            }
            xwVar.a.a(true, !z10);
            return;
        }
        s4.b1 K = uwVar.K(0);
        if (K == null) {
            gz.a(xwVar, true, !z10);
        } else {
            gz.a(xwVar, K.a.getTop() < uwVar.getPaddingTop(), !z10);
        }
    }

    public static String g(String str, String str2) {
        boolean z10;
        String str3;
        if (CompoundEmoji.isHandshake(str) != null) {
            return CompoundEmoji.applyColor(str, str2);
        }
        if (Emoji.endsWithRightArrow(str)) {
            str = com.google.android.gms.internal.play_billing.k3.i(2, 0, str);
            z10 = true;
        } else {
            z10 = false;
        }
        int length = str.length();
        if (length > 2 && str.charAt(str.length() - 2) == 8205) {
            str3 = str.substring(str.length() - 2);
            str = com.google.android.gms.internal.play_billing.k3.i(2, 0, str);
        } else if (length <= 3 || str.charAt(str.length() - 3) != 8205) {
            str3 = null;
        } else {
            str3 = str.substring(str.length() - 3);
            str = com.google.android.gms.internal.play_billing.k3.i(3, 0, str);
        }
        String u10 = si.o0.u(str, str2);
        if (str3 != null) {
            u10 = si.o0.u(u10, str3);
        }
        return z10 ? si.o0.u(u10, "\u200d➡") : u10;
    }

    public static void j(int i10, View view) {
        if (view == null) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i10);
    }

    public final int A(int i10) {
        org.telegram.ui.ActionBar.g6 g6Var = this.Z1;
        return g6Var != null ? g6Var.g(i10) : org.telegram.ui.ActionBar.k6.x0(null, i10, false);
    }

    public final void B() {
        dx dxVar = this.G0;
        if (dxVar != null) {
            dxVar.b();
        }
        xw xwVar = this.o0;
        if (xwVar != null) {
            xwVar.b();
        }
        rw rwVar = this.V;
        if (rwVar != null) {
            rwVar.b();
        }
    }

    public final void C(boolean z10, boolean z11) {
        fz fzVar;
        if (this.A1 != 0 && this.w1) {
            this.A1 = 0;
        }
        if (this.A1 == 0 && this.v1) {
            this.A1 = 1;
        }
        int i10 = this.A1;
        gx gxVar = this.h;
        if (i10 == 0 || z10 || this.e.size() == 1) {
            L(true, false);
            Q(false, false);
            if (gxVar.getCurrentItem() != 0) {
                gxVar.x(0, !z10);
            }
            if (z11) {
                AndroidUtilities.runOnUIThread(new lw(this, 5), 350L);
            }
        } else {
            int i11 = this.A1;
            if (i11 == 1) {
                L(false, false);
                Q(this.u0 || this.v0, false);
                if (gxVar.getCurrentItem() != 2) {
                    gxVar.x(2, false);
                }
                ex exVar = this.B0;
                if (exVar != null) {
                    this.S0 = true;
                    int i12 = this.G1;
                    if (i12 >= 0) {
                        exVar.m(i12);
                    } else {
                        int i13 = this.F1;
                        if (i13 >= 0) {
                            exVar.m(i13);
                        } else {
                            exVar.m(this.E1);
                        }
                    }
                    this.S0 = false;
                    this.E0.h1(0, 0);
                }
            } else if (i11 == 2) {
                L(false, false);
                Q(false, false);
                if (gxVar.getCurrentItem() != 1) {
                    gxVar.x(1, false);
                }
                yx yxVar = this.p0;
                if (yxVar != null) {
                    yxVar.m(0);
                }
                xw xwVar = this.o0;
                if (xwVar != null && (fzVar = xwVar.r) != null) {
                    fzVar.L1(null);
                }
            }
        }
        M(true);
    }

    public final void D() {
        kz kzVar = this.y0;
        if (kzVar != null) {
            kzVar.l();
        }
        oz ozVar = this.z0;
        if (ozVar != null) {
            ozVar.l();
        }
        if (org.telegram.ui.ht.o().E) {
            org.telegram.ui.ht.o().l();
        }
        org.telegram.ui.ht.o().s();
    }

    public final void E(int i10) {
        uy uyVar = this.t1;
        if ((uyVar == null || !uyVar.z()) && i10 != 0) {
            HorizontalScrollView z10 = z(i10);
            this.Q0[i10] = 0;
            z10.setTranslationY(0);
        }
    }

    public final void F(int i10, int i11) {
        rx rxVar = this.Q;
        View m10 = rxVar.m(i10);
        int L0 = rxVar.L0();
        if ((m10 == null && Math.abs(i10 - L0) > rxVar.J * 9.0f) || !SharedConfig.animationsEnabled()) {
            int i12 = rxVar.L0() < i10 ? 0 : 1;
            pl0 pl0Var = this.b0;
            pl0Var.b = i12;
            pl0Var.c(i10, i11, false, false);
            return;
        }
        this.J0 = true;
        ei.l1 l1Var = new ei.l1(this, this.P.getContext(), 1);
        l1Var.a = i10;
        l1Var.p = i11;
        rxVar.w0(l1Var);
    }

    public final void G(int i10, int i11) {
        bx bxVar = this.E0;
        View m10 = bxVar.m(i10);
        int L0 = bxVar.L0();
        if (m10 != null || Math.abs(i10 - L0) <= 40) {
            this.J0 = true;
            this.D0.x0(i10);
        } else {
            int i12 = bxVar.L0() < i10 ? 0 : 1;
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
            if (((pz) arrayList2.get(i10)).a == 0 && z10) {
                arrayList.add((pz) arrayList2.get(i10));
            }
            if (((pz) arrayList2.get(i10)).a == 1 && z12) {
                arrayList.add((pz) arrayList2.get(i10));
            }
            if (((pz) arrayList2.get(i10)).a == 2 && z11) {
                arrayList.add((pz) arrayList2.get(i10));
            }
            i10++;
        }
        ae0 ae0Var = this.w;
        if (ae0Var != null) {
            AndroidUtilities.updateViewVisibilityAnimated(ae0Var, arrayList.size() > 1, 1.0f, z13);
        }
        gx gxVar = this.h;
        if (gxVar != null) {
            gxVar.setAdapter(null);
            gxVar.setAdapter(this.L0);
            if (ae0Var != null) {
                ae0Var.setViewPager(gxVar);
            }
        }
    }

    public final void J(final oh.b bVar, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z10, boolean z11) {
        oz ozVar;
        ty tyVar;
        if (stickerSet == null) {
            return;
        }
        if (!z10 || (tyVar = this.S) == null || tyVar.d == stickerSet.id) {
            if (z10 || (ozVar = this.z0) == null || ozVar.d == stickerSet.id) {
                final boolean isStickerPackInstalled = MediaDataController.getInstance(this.c1).isStickerPackInstalled(stickerSet.id);
                bVar.i(isStickerPackInstalled ? stickerSet.masks ? LocaleController.formatPluralString("RemoveManyMasksCount", stickerSet.count, new Object[0]) : stickerSet.emojis ? LocaleController.formatPluralString("RemoveManyEmojiCount", stickerSet.count, new Object[0]) : LocaleController.formatPluralString("RemoveManyStickersCount", stickerSet.count, new Object[0]) : stickerSet.masks ? LocaleController.formatPluralString("AddManyMasksCount", stickerSet.count, new Object[0]) : stickerSet.emojis ? LocaleController.formatPluralString("AddManyEmojiCount", stickerSet.count, new Object[0]) : LocaleController.formatPluralString("AddManyStickersCount", stickerSet.count, new Object[0]), z11, true);
                bVar.k0.a(!isStickerPackInstalled, z11);
                bVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.qw
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        tz tzVar = tz.this;
                        MediaDataController mediaDataController = MediaDataController.getInstance(tzVar.c1);
                        Context context = tzVar.getContext();
                        int i10 = isStickerPackInstalled ? 0 : 2;
                        org.telegram.ui.ActionBar.o2 o2Var = tzVar.Y1;
                        FrameLayout frameLayout = tzVar.s;
                        oh.b bVar2 = bVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z12 = z10;
                        mediaDataController.toggleStickerSet(context, tLObject2, document2, i10, o2Var, frameLayout, false, true, new ai.p4(tzVar, bVar2, tLObject2, stickerSet2, document2, z12), false);
                        tzVar.J(bVar2, tLObject2, stickerSet2, document2, z12, true);
                    }
                });
            }
        }
    }

    public final void K(long j10, boolean z10, boolean z11) {
        ae0 ae0Var = this.w;
        if (ae0Var == null) {
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
        LinearLayout linearLayout = ae0Var.d;
        View childAt = i10 >= linearLayout.getChildCount() ? null : linearLayout.getChildAt(i10);
        if (childAt != null) {
            childAt.setAlpha(this.u1 != 0 ? 0.15f : 1.0f);
            gx gxVar = this.h;
            if (z11) {
                if (this.u1 == 0 || gxVar.getCurrentItem() == 0) {
                    return;
                }
                L(true, true);
                Q(false, true);
                gxVar.x(0, false);
                return;
            }
            if (this.u1 == 0 || gxVar.getCurrentItem() == 1) {
                return;
            }
            L(false, true);
            Q(false, true);
            gxVar.x(1, false);
        }
    }

    public final void L(boolean z10, boolean z11) {
        hx hxVar = this.x;
        if (z10 && hxVar.getTag() == null) {
            return;
        }
        if ((z10 || hxVar.getTag() == null) && !this.o2) {
            AnimatorSet animatorSet = this.F;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.F = null;
            }
            hxVar.setTag(z10 ? null : 1);
            if (!z11) {
                hxVar.setAlpha(z10 ? 1.0f : 0.0f);
                hxVar.setScaleX(z10 ? 1.0f : 0.0f);
                hxVar.setScaleY(z10 ? 1.0f : 0.0f);
                hxVar.setVisibility(z10 ? 0 : 4);
                return;
            }
            if (z10) {
                hxVar.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.F = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(hxVar, (Property<hx, Float>) View.ALPHA, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(hxVar, (Property<hx, Float>) View.SCALE_X, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(hxVar, (Property<hx, Float>) View.SCALE_Y, z10 ? 1.0f : 0.0f));
            this.F.setDuration(200L);
            this.F.setInterpolator(bs.g);
            this.F.addListener(new nx(this, z10, r2));
            this.F.start();
        }
    }

    public final void M(boolean z10) {
        this.H = 0.0f;
        uy uyVar = this.t1;
        if (uyVar != null && uyVar.z()) {
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
            this.W.setInterpolator(bs.g);
            this.W.addListener(new org.telegram.ui.pq(this, 25));
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
                    E(i10);
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
        ai.wd wdVar = this.N0;
        if (z10) {
            if (ChatObject.hasAdminRights(chat) || (tL_chatBannedRights = chat.default_banned_rights) == null || !(tL_chatBannedRights.send_stickers || (z11 && tL_chatBannedRights.send_plain))) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.banned_rights;
                if (tL_chatBannedRights2 == null) {
                    return;
                }
                if (!AndroidUtilities.isBannedForever(tL_chatBannedRights2)) {
                    if (z11) {
                        wdVar.setText(LocaleController.formatString("AttachPlainRestricted", R.string.AttachPlainRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    }
                    if (z12) {
                        wdVar.setText(LocaleController.formatString("AttachGifRestricted", R.string.AttachGifRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    } else {
                        wdVar.setText(LocaleController.formatString("AttachStickersRestricted", R.string.AttachStickersRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    }
                } else if (z11) {
                    wdVar.setText(LocaleController.getString(R.string.AttachPlainRestrictedForever));
                } else if (z12) {
                    wdVar.setText(LocaleController.getString(R.string.AttachGifRestrictedForever));
                } else {
                    wdVar.setText(LocaleController.getString(R.string.AttachStickersRestrictedForever));
                }
            } else {
                org.telegram.ui.ActionBar.o2 o2Var = this.Y1;
                if ((o2Var instanceof org.telegram.ui.sn) && ((org.telegram.ui.sn) o2Var).N6()) {
                    return;
                }
                if (z11) {
                    wdVar.setText(LocaleController.getString(R.string.GlobalAttachEmojiRestricted));
                } else if (z12) {
                    wdVar.setText(LocaleController.getString(R.string.GlobalAttachGifRestricted));
                } else {
                    wdVar.setText(LocaleController.getString(R.string.GlobalAttachStickersRestricted));
                }
            }
            wdVar.setVisibility(0);
        }
        AnimatorSet animatorSet = this.P2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.P2 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.P2 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(wdVar, (Property<ai.wd, Float>) View.ALPHA, z10 ? wdVar.getAlpha() : 1.0f, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(wdVar, (Property<ai.wd, Float>) View.TRANSLATION_Y, z10 ? AndroidUtilities.dp(12.0f) : wdVar.getTranslationY(), z10 ? 0.0f : AndroidUtilities.dp(12.0f)));
        e2.n0 n0Var = this.Q2;
        if (n0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(n0Var);
        }
        if (z10) {
            e2.n0 n0Var2 = new e2.n0(this, z11, z12, 4);
            this.Q2 = n0Var2;
            AndroidUtilities.runOnUIThread(n0Var2, 3500L);
        }
        this.P2.setDuration(320L);
        this.P2.setInterpolator(bs.h);
        this.P2.start();
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
            this.G.setInterpolator(bs.g);
            this.G.addListener(new nx(this, z10, i10));
            this.G.start();
        }
    }

    public final void R() {
        org.telegram.ui.ActionBar.o2 o2Var;
        if (((View) getParent()) != null) {
            float y3 = (getY() + (getLayoutParams().height > 0 ? getLayoutParams().height : getMeasuredHeight())) - (((AndroidUtilities.isInMultiwindow || ((o2Var = this.Y1) != null && o2Var.isInBubbleMode())) && !this.V0) ? AndroidUtilities.dp(1.0f) : r0.getHeight());
            float f7 = this.r2;
            FrameLayout frameLayout = this.n;
            if (f7 >= 0.0f) {
                y3 += getMeasuredHeight() - this.r2;
            } else if (frameLayout.getTop() - y3 < 0.0f || !this.x2) {
                y3 = 0.0f;
            }
            float lerp = (-y3) + AndroidUtilities.lerp(AndroidUtilities.dp(50.0f), -this.q2, this.G2.e);
            frameLayout.setTranslationY(lerp);
            if (this.d0) {
                this.r.setTranslationY(lerp);
            }
        }
    }

    public final void S() {
        gz gzVar;
        boolean z10;
        gw gwVar;
        boolean z11 = this.u0;
        View view = this.v;
        if (!z11) {
            setBackground(null);
            view.setBackground(null);
        } else if (AndroidUtilities.isInMultiwindow || this.N1) {
            Drawable background = getBackground();
            int A = A(org.telegram.ui.ActionBar.k6.He);
            if (background != null && (background != this.I2 || A != this.J2)) {
                this.I2 = background;
                this.J2 = A;
                background.setColorFilter(new PorterDuffColorFilter(A, PorterDuff.Mode.MULTIPLY));
            }
        } else {
            int i10 = org.telegram.ui.ActionBar.k6.He;
            setBackgroundColor(A(i10));
            if (this.d0) {
                view.setBackgroundColor(A(i10));
            }
        }
        vx vxVar = this.I;
        if (vxVar != null) {
            if (this.u0) {
                vxVar.setBackgroundColor(A(org.telegram.ui.ActionBar.k6.He));
                this.O.setBackgroundColor(A(org.telegram.ui.ActionBar.k6.Ke));
            } else {
                vxVar.setBackground(null);
            }
        }
        ev evVar = this.B1;
        if (evVar != null) {
            evVar.c.a();
        }
        int i11 = 0;
        while (true) {
            gzVar = this.V;
            z10 = this.i2;
            if (i11 >= 3) {
                break;
            }
            if (i11 == 0) {
                gzVar = this.G0;
            } else if (i11 != 1) {
                gzVar = this.o0;
            }
            if (gzVar != null) {
                sq sqVar = gzVar.d;
                FrameLayout frameLayout = gzVar.n;
                View view2 = gzVar.f;
                if (this.u0) {
                    view2.setBackgroundColor(A(org.telegram.ui.ActionBar.k6.He));
                } else {
                    view2.setBackground(null);
                }
                gzVar.e.setBackgroundColor(A(org.telegram.ui.ActionBar.k6.Ke));
                gzVar.c.a(z10 ? w(0.4f) : A(org.telegram.ui.ActionBar.k6.Je));
                org.telegram.ui.ActionBar.k6.z1(z10 ? w(0.06f) : A(org.telegram.ui.ActionBar.k6.Ie), frameLayout.getBackground());
                frameLayout.invalidate();
                sqVar.setHintTextColor(z10 ? w(0.45f) : A(org.telegram.ui.ActionBar.k6.Je));
                sqVar.setTextColor(z10 ? w(0.8f) : A(org.telegram.ui.ActionBar.k6.G6));
            }
            i11++;
        }
        Paint paint = this.s1;
        if (paint != null) {
            paint.setColor(A(org.telegram.ui.ActionBar.k6.af));
        }
        ey eyVar = this.P;
        if (eyVar != null) {
            eyVar.setGlowColor(A(org.telegram.ui.ActionBar.k6.He));
        }
        ax axVar = this.D0;
        if (axVar != null) {
            axVar.setGlowColor(A(org.telegram.ui.ActionBar.k6.He));
        }
        ex exVar = this.B0;
        if (exVar != null) {
            exVar.setIndicatorColor(A(org.telegram.ui.ActionBar.k6.Qe));
            exVar.setUnderlineColor(A(org.telegram.ui.ActionBar.k6.Ke));
            if (this.u0) {
                exVar.setBackgroundColor(A(org.telegram.ui.ActionBar.k6.He));
            } else {
                exVar.setBackground(null);
            }
        }
        yx yxVar = this.p0;
        if (yxVar != null) {
            yxVar.setIndicatorColor(A(org.telegram.ui.ActionBar.k6.Qe));
            yxVar.setUnderlineColor(A(org.telegram.ui.ActionBar.k6.Ke));
            if (this.u0) {
                yxVar.setBackgroundColor(A(org.telegram.ui.ActionBar.k6.He));
            } else {
                yxVar.setBackground(null);
            }
        }
        int w9 = z10 ? w(0.6f) : A(org.telegram.ui.ActionBar.k6.Re);
        boolean z12 = w9 != this.K2;
        this.K2 = w9;
        hx hxVar = this.x;
        if (hxVar != null) {
            if (z12) {
                hxVar.setColorFilter(new PorterDuffColorFilter(w9, PorterDuff.Mode.MULTIPLY));
            }
            if (gzVar == null) {
                Drawable background2 = hxVar.getBackground();
                int i12 = org.telegram.ui.ActionBar.k6.He;
                org.telegram.ui.ActionBar.k6.E1(background2, A(i12), false);
                org.telegram.ui.ActionBar.k6.E1(hxVar.getBackground(), A(i12), true);
            }
        }
        ImageView imageView = this.y;
        if (imageView != null && z12) {
            imageView.setColorFilter(new PorterDuffColorFilter(w9, PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.E;
        if (imageView2 != null && z12) {
            imageView2.setColorFilter(new PorterDuffColorFilter(w9, PorterDuff.Mode.MULTIPLY));
        }
        ai.wd wdVar = this.N0;
        if (wdVar != null) {
            if (wdVar.getBackground() instanceof ShapeDrawable) {
                ((ShapeDrawable) wdVar.getBackground()).getPaint().setColor(A(org.telegram.ui.ActionBar.k6.qf));
                wdVar.invalidate();
            }
            wdVar.setTextColor(A(org.telegram.ui.ActionBar.k6.pf));
        }
        yy yyVar = this.j0;
        if (yyVar != null) {
            az azVar = yyVar.e;
            int i13 = org.telegram.ui.ActionBar.k6.Le;
            int A2 = A(i13);
            if (A2 != this.L2) {
                this.L2 = A2;
                azVar.a.setColorFilter(new PorterDuffColorFilter(A2, PorterDuff.Mode.MULTIPLY));
            }
            azVar.b.setTextColor(A(i13));
            azVar.c.setProgressColor(A(org.telegram.ui.ActionBar.k6.h6));
        }
        int A3 = A(org.telegram.ui.ActionBar.k6.Oh);
        if (this.e2 == null || A3 != this.M2) {
            this.M2 = A3;
            this.e2 = new PorterDuffColorFilter(A3, PorterDuff.Mode.SRC_IN);
        }
        int i14 = 0;
        while (true) {
            Drawable[] drawableArr = this.X0;
            if (i14 >= drawableArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.k6.B1(drawableArr[i14], z10 ? w(0.4f) : A(org.telegram.ui.ActionBar.k6.Ne), false);
            org.telegram.ui.ActionBar.k6.B1(drawableArr[i14], z10 ? w(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe), true);
            i14++;
        }
        if (vxVar != null && (gwVar = vxVar.y) != null) {
            gwVar.d();
        }
        int i15 = 0;
        while (true) {
            Drawable[] drawableArr2 = this.Y0;
            if (i15 >= drawableArr2.length) {
                break;
            }
            org.telegram.ui.ActionBar.k6.B1(drawableArr2[i15], z10 ? w(0.4f) : A(org.telegram.ui.ActionBar.k6.Me), false);
            org.telegram.ui.ActionBar.k6.B1(drawableArr2[i15], z10 ? w(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe), true);
            i15++;
        }
        int i16 = 0;
        while (true) {
            Drawable[] drawableArr3 = this.Z0;
            if (i16 >= drawableArr3.length) {
                break;
            }
            org.telegram.ui.ActionBar.k6.B1(drawableArr3[i16], z10 ? w(0.4f) : A(org.telegram.ui.ActionBar.k6.Me), false);
            org.telegram.ui.ActionBar.k6.B1(drawableArr3[i16], z10 ? w(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe), true);
            i16++;
        }
        org.telegram.ui.ActionBar.w5 w5Var = this.a2;
        if (w5Var != null) {
            org.telegram.ui.ActionBar.k6.B1(w5Var, z10 ? w(0.4f) : A(org.telegram.ui.ActionBar.k6.Ne), false);
            org.telegram.ui.ActionBar.k6.B1(w5Var, z10 ? w(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe), true);
        }
        org.telegram.ui.ActionBar.w5 w5Var2 = this.b2;
        if (w5Var2 != null) {
            org.telegram.ui.ActionBar.k6.B1(w5Var2, z10 ? w(0.4f) : A(org.telegram.ui.ActionBar.k6.Qe), false);
            org.telegram.ui.ActionBar.k6.B1(w5Var2, z10 ? w(0.8f) : A(org.telegram.ui.ActionBar.k6.Qe), true);
        }
    }

    public final void T() {
        ey eyVar = this.P;
        if (eyVar == null) {
            return;
        }
        for (int i10 = 0; i10 < eyVar.getChildCount(); i10++) {
            View childAt = eyVar.getChildAt(i10);
            if (childAt instanceof jy) {
                ((jy) childAt).a(true);
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
            ay ayVar = this.R;
            int i12 = ayVar.c;
            ArrayList arrayList = ayVar.x;
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
                    ArrayList<fy> emojipacks = getEmojipacks();
                    int size2 = arrayList.size() - 1;
                    while (true) {
                        if (size2 < 0) {
                            break;
                        }
                        if (((Integer) arrayList.get(size2)).intValue() <= i10) {
                            fy fyVar = (fy) this.q1.get(size2);
                            while (i13 < emojipacks.size()) {
                                long j10 = emojipacks.get(i13).b.id;
                                long j11 = fyVar.b.id;
                                if (j10 == j11 && (!fyVar.g || (!fyVar.f && !this.p1.contains(Long.valueOf(j11))))) {
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
        fz fzVar;
        int i11;
        boolean z10;
        yx yxVar = this.p0;
        int currentPosition = yxVar.getCurrentPosition();
        int i12 = this.r0;
        boolean z11 = currentPosition == i12;
        boolean z12 = i12 >= 0;
        boolean isEmpty = this.i1.isEmpty();
        yxVar.d(false);
        this.r0 = -2;
        this.s0 = -2;
        this.t0 = -2;
        Drawable[] drawableArr = this.Z0;
        if (isEmpty) {
            i10 = 0;
        } else {
            this.r0 = 0;
            yxVar.b(0, drawableArr[0]).setContentDescription(LocaleController.getString(R.string.RecentStickers));
            i10 = 1;
        }
        this.s0 = i10;
        yxVar.b(1, drawableArr[1]).setContentDescription(LocaleController.getString(R.string.FeaturedGifs));
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
                String k10 = i2.o1.k(i14 + 3, "tab");
                int i15 = yxVar.x;
                yxVar.x = i15 + 1;
                by0 by0Var = (by0) yxVar.n.get(k10);
                if (by0Var != null) {
                    yxVar.g(k10, by0Var, i15);
                    i11 = currentPosition;
                    z10 = z12;
                } else {
                    i11 = currentPosition;
                    z10 = z12;
                    by0Var = new by0(yxVar.getContext(), 2);
                    by0Var.setFocusable(true);
                    by0Var.setOnClickListener(new dn0(yxVar, 2));
                    by0Var.setExpanded(yxVar.f0);
                    by0Var.a(yxVar.i0);
                    yxVar.e.addView(by0Var, i15);
                }
                by0Var.d = false;
                by0Var.setTag(R.id.index_tag, Integer.valueOf(i15));
                by0Var.setTag(R.id.parent_tag, emojiDrawable);
                by0Var.setTag(R.id.object_tag, emojiAnimatedSticker);
                by0Var.setSelected(i15 == yxVar.y);
                yxVar.h.put(k10, by0Var);
                by0Var.setContentDescription(str);
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
        yxVar.h();
        yxVar.q();
        if (z11 && isEmpty) {
            yxVar.m(this.s0);
            xw xwVar = this.o0;
            if (xwVar == null || (fzVar = xwVar.r) == null) {
                return;
            }
            fzVar.L1(null);
            return;
        }
        WeakHashMap weakHashMap = r0.i0.a;
        if (yxVar.isLaidOut()) {
            if (!isEmpty && !z13) {
                yxVar.k(i16 + 1, 0);
            } else if (isEmpty && z13) {
                yxVar.k(i16 - 1, 0);
            }
        }
    }

    public final void W() {
        yy yyVar;
        int size = this.i1.size();
        long calcDocumentsHash = MediaDataController.calcDocumentsHash(this.i1, ConnectionsManager.DEFAULT_DATACENTER_ID);
        ArrayList<TLRPC.Document> recentGifs = MediaDataController.getInstance(this.c1).getRecentGifs();
        this.i1 = recentGifs;
        long calcDocumentsHash2 = MediaDataController.calcDocumentsHash(recentGifs, ConnectionsManager.DEFAULT_DATACENTER_ID);
        if ((this.p0 != null && size == 0 && !this.i1.isEmpty()) || (size != 0 && this.i1.isEmpty())) {
            V();
        }
        if ((size == this.i1.size() && calcDocumentsHash == calcDocumentsHash2) || (yyVar = this.n0) == null) {
            return;
        }
        yyVar.l();
    }

    public final void X(boolean z10) {
        TLRPC.Document document;
        boolean z11;
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet;
        ex exVar = this.B0;
        if (exVar != null) {
            va1 va1Var = exVar.e;
            if (exVar.s != null) {
                return;
            }
            this.F1 = -2;
            this.G1 = -2;
            this.H1 = -2;
            this.I1 = -2;
            this.e0 = false;
            this.E1 = 0;
            int currentPosition = exVar.getCurrentPosition();
            boolean z12 = true;
            exVar.d((getParent() == null || getVisibility() != 0 || (this.y1.size() == 0 && this.z1.size() == 0)) ? false : true);
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
            rz rzVar = this.F0;
            if (rzVar != null) {
                rzVar.l();
            }
            boolean isEmpty = featuredStickerSets.isEmpty();
            long j10 = 0;
            Drawable[] drawableArr = this.Y0;
            if (!isEmpty && (arrayList3.isEmpty() || emojiSettings.getLong("featured_hidden", 0L) == featuredStickerSets.get(0).set.id)) {
                int i12 = mediaDataController.getUnreadStickerSets().isEmpty() ? 2 : 3;
                by0 c10 = exVar.c(i12, drawableArr[i12]);
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
                by0 c11 = exVar.c(1, drawableArr[1]);
                c11.h.setText(LocaleController.getString(R.string.FavoriteStickersShort));
                c11.setContentDescription(LocaleController.getString(R.string.FavoriteStickers));
            }
            if (!this.j1.isEmpty()) {
                int i15 = this.E1;
                this.F1 = i15;
                this.E1 = i15 + 1;
                by0 c12 = exVar.c(0, drawableArr[0]);
                c12.h.setText(LocaleController.getString(R.string.RecentStickersShort));
                c12.setContentDescription(LocaleController.getString(R.string.RecentStickers));
            }
            ArrayList arrayList4 = this.d1;
            arrayList4.clear();
            org.telegram.ui.ActionBar.g6 g6Var = null;
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
                        int i19 = exVar.x;
                        exVar.x = i19 + 1;
                        by0 by0Var = (by0) exVar.n.get(str);
                        if (by0Var != null) {
                            exVar.g(str, by0Var, i19);
                        } else {
                            by0Var = new by0(exVar.getContext(), 0);
                            by0Var.setFocusable(z12);
                            by0Var.setOnClickListener(new dn0(exVar, 0));
                            va1Var.addView(by0Var, i19);
                            by0Var.w = z12;
                            h9 h9Var = new h9(g6Var);
                            h9Var.u(AndroidUtilities.dp(14.0f));
                            h9Var.k(UserConfig.selectedAccount, chat2);
                            int i20 = exVar.a;
                            w9 w9Var = by0Var.e;
                            w9Var.setLayerNum(i20);
                            w9Var.e(chat2, h9Var);
                            w9Var.setAspectFit(z12);
                            by0Var.setExpanded(exVar.f0);
                            by0Var.a(exVar.i0);
                            by0Var.h.setText(chat2.title);
                        }
                        by0Var.d = z12;
                        by0Var.setTag(R.id.index_tag, Integer.valueOf(i19));
                        by0Var.setSelected(i19 == exVar.y ? z12 : false);
                        exVar.h.put(str, by0Var);
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
                    int i22 = exVar.x;
                    exVar.x = i22 + 1;
                    by0 by0Var2 = (by0) exVar.n.get(str2);
                    if (by0Var2 != null) {
                        exVar.g(str2, by0Var2, i22);
                        z11 = z12;
                    } else {
                        by0Var2 = new by0(exVar.getContext(), 0);
                        by0Var2.setFocusable(z12);
                        z11 = z12;
                        by0Var2.setOnClickListener(new dn0(exVar, 1));
                        by0Var2.setExpanded(exVar.f0);
                        by0Var2.a(exVar.i0);
                        va1Var.addView(by0Var2, i22);
                    }
                    by0Var2.e.setLayerNum(exVar.a);
                    by0Var2.d = false;
                    by0Var2.setTag(closestPhotoSizeWithSize);
                    by0Var2.setTag(R.id.index_tag, Integer.valueOf(i22));
                    by0Var2.setTag(R.id.parent_tag, tL_messages_stickerSet5);
                    by0Var2.setTag(R.id.object_tag, document);
                    by0Var2.setSelected(i22 == exVar.y ? z11 : false);
                    exVar.h.put(str2, by0Var2);
                    by0Var2.setContentDescription(tL_messages_stickerSet5.set.title + ", " + LocaleController.getString(R.string.AccDescrStickerSet));
                }
                i18++;
                z12 = z11;
                g6Var = null;
            }
            exVar.h();
            exVar.q();
            if (currentPosition != 0) {
                exVar.k(currentPosition, currentPosition);
            }
            p();
        }
    }

    public final void Y() {
        fx fxVar = this.C0;
        ex exVar = this.B0;
        if (exVar != null && fxVar == null && this.t1 != null) {
            exVar.setTranslationY(this.t1.p() * (-AndroidUtilities.dp(50.0f)));
        }
        if (fxVar == null) {
            return;
        }
        boolean z10 = getVisibility() == 0 && this.K0 && this.t1.p() != 1.0f;
        fxVar.setVisibility(z10 ? 0 : 8);
        if (z10) {
            Rect rect = this.y2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.x0, rect, null);
            float p5 = this.t1.p() * AndroidUtilities.dp(50.0f);
            int i10 = rect.left;
            if (i10 != 0 || p5 != 0.0f) {
                this.X1 = false;
            }
            fxVar.setTranslationX(i10);
            float translationY = (((getTranslationY() + getTop()) - fxVar.getTop()) - exVar.getExpandedOffset()) - p5;
            if (fxVar.getTranslationY() != translationY) {
                fxVar.setTranslationY(translationY);
                fxVar.invalidate();
            }
        }
        if (this.X1 && z10 && this.P0) {
            exVar.i(this.W1, true);
        } else {
            this.X1 = false;
            exVar.i(this.W1, false);
        }
    }

    public final void Z() {
        boolean z10;
        org.telegram.ui.Cells.r3 r3Var;
        LongSparseArray longSparseArray = this.z1;
        LongSparseArray longSparseArray2 = this.y1;
        int i10 = this.c1;
        ax axVar = this.D0;
        if (axVar == null) {
            return;
        }
        try {
            int childCount = axVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = axVar.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.r3) && ((wl0) axVar.T(childAt)) != null) {
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
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // qh.a
    public final void b(int i10) {
        setBottomInset(i10);
    }

    @Override // qh.a
    public final void c(float f7) {
        this.r2 = f7;
        R();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Utilities.Callback callback;
        TLRPC.StickerSet stickerSet;
        int i12 = NotificationCenter.stickersDidLoad;
        ay ayVar = this.R;
        lw lwVar = this.R2;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.y0 != null) {
                    X(((Boolean) objArr[1]).booleanValue());
                    Z();
                    D();
                    p();
                    return;
                }
                return;
            }
            if (((Integer) objArr[0]).intValue() == 5) {
                if (!((Boolean) objArr[1]).booleanValue()) {
                    ayVar.F(false);
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
                ayVar.F(true);
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
            ae0 ae0Var = this.w;
            if (ae0Var != null) {
                int childCount = ae0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    ae0Var.getChildAt(i13).invalidate();
                }
            }
            X(false);
            return;
        }
        if (i10 == NotificationCenter.featuredEmojiDidLoad) {
            if (ayVar != null) {
                ayVar.F(false);
                return;
            }
            return;
        }
        int i14 = NotificationCenter.groupStickersDidLoad;
        ty tyVar = this.S;
        if (i10 == i14) {
            Long l4 = (Long) objArr[0];
            long longValue2 = l4.longValue();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = objArr.length > 1 ? (TLRPC.TL_messages_stickerSet) objArr[1] : null;
            if (tL_messages_stickerSet != null) {
                oz ozVar = this.z0;
                if (ozVar != null && ozVar.d == longValue2 && ozVar.f.size() < tL_messages_stickerSet.documents.size()) {
                    ozVar.f = tL_messages_stickerSet.documents;
                    ozVar.l();
                }
                if (tyVar != null && tyVar.d == longValue2 && tyVar.f.size() < tL_messages_stickerSet.documents.size()) {
                    tyVar.f = tL_messages_stickerSet.documents;
                    tyVar.l();
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
        ey eyVar = this.P;
        if (i10 != i15) {
            if (i10 != NotificationCenter.newEmojiSuggestionsAvailable) {
                if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                    if (ayVar != null) {
                        ayVar.F(false);
                    }
                    T();
                    X(false);
                    return;
                }
                return;
            }
            if (eyVar == null || !this.d0) {
                return;
            }
            if ((this.V.c.k == 2 || eyVar.getAdapter() == tyVar) && !TextUtils.isEmpty(tyVar.v)) {
                tyVar.F(tyVar.v, true);
                return;
            }
            return;
        }
        ax axVar = this.D0;
        if (axVar != null) {
            int childCount2 = axVar.getChildCount();
            for (int i16 = 0; i16 < childCount2; i16++) {
                View childAt = axVar.getChildAt(i16);
                if ((childAt instanceof org.telegram.ui.Cells.o8) || (childAt instanceof org.telegram.ui.Cells.e8)) {
                    childAt.invalidate();
                }
            }
        }
        if (eyVar != null) {
            eyVar.invalidate();
            int childCount3 = eyVar.getChildCount();
            for (int i17 = 0; i17 < childCount3; i17++) {
                View childAt2 = eyVar.getChildAt(i17);
                if (childAt2 instanceof cz) {
                    childAt2.invalidate();
                }
            }
        }
        ev evVar = this.B1;
        if (evVar != null) {
            evVar.c.invalidate();
        }
        yx yxVar = this.p0;
        if (yxVar != null) {
            va1 va1Var = yxVar.e;
            int childCount4 = va1Var.getChildCount();
            for (int i18 = 0; i18 < childCount4; i18++) {
                va1Var.getChildAt(i18).invalidate();
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
            int o12 = org.telegram.ui.ActionBar.k6.o1(navigationBarThirdButtonsFactor, A(org.telegram.ui.ActionBar.k6.He));
            int i10 = this.C2;
            GradientDrawable gradientDrawable = this.B2;
            if (i10 != o12) {
                gradientDrawable.setColors(new int[]{o12, org.telegram.ui.ActionBar.k6.o1(0.66f, o12), i0.a.o(o12, 0)});
                this.C2 = o12;
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

    public ArrayList<fy> getEmojipacks() {
        ArrayList<fy> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.q1;
            if (i10 >= arrayList2.size()) {
                return arrayList;
            }
            fy fyVar = (fy) arrayList2.get(i10);
            boolean z10 = fyVar.g;
            ArrayList arrayList3 = this.p1;
            if ((!z10 && (fyVar.f || arrayList3.contains(Long.valueOf(fyVar.b.id)))) || (fyVar.g && !fyVar.f && !arrayList3.contains(Long.valueOf(fyVar.b.id)))) {
                arrayList.add(fyVar);
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
        ex exVar = this.B0;
        if (exVar == null) {
            return 0.0f;
        }
        return exVar.getExpandedOffset();
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
        if (i10 == 2 || y(i10).K(0) == null) {
            return;
        }
        ox oxVar = new ox(getContext(), i11);
        oxVar.a = !z10 ? 1 : 0;
        x(i10).w0(oxVar);
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
        kz kzVar = this.y0;
        if (kzVar != null) {
            kzVar.l();
        }
        p();
    }

    public final void l(boolean z10) {
        uy uyVar = this.t1;
        ne.b bVar = this.b;
        ey eyVar = this.P;
        rw rwVar = this.V;
        if (uyVar != null && uyVar.z()) {
            s4.b1 K = eyVar.K(0);
            if (K == null) {
                gz.a(rwVar, true, !z10);
            } else {
                gz.a(rwVar, K.a.getTop() < eyVar.getPaddingTop(), !z10);
            }
            N(false, !z10);
            rwVar.setTranslationY(bVar.e * AndroidUtilities.dp(15.0f));
            return;
        }
        if (rwVar == null || eyVar == null) {
            return;
        }
        rwVar.setTranslationY((bVar.e * AndroidUtilities.dp(15.0f)) + (eyVar.K(0) != null ? r0.a.getTop() : -this.b1));
        rwVar.a.a(false, !z10);
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
        ey eyVar;
        s4.b1 K;
        vx vxVar = this.I;
        int[] iArr = this.Q0;
        if (view == null) {
            iArr[1] = 0;
            vxVar.setTranslationY(0);
            return;
        }
        if (view.getVisibility() != 0 || this.f0) {
            return;
        }
        uy uyVar = this.t1;
        if (uyVar == null || !uyVar.z()) {
            if (i10 > 0 && (eyVar = this.P) != null && eyVar.getVisibility() == 0 && (K = eyVar.K(0)) != null) {
                if (K.a.getTop() + (this.d0 ? this.b1 : 0) >= eyVar.getPaddingTop()) {
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
            vxVar.setTranslationY(Math.max(-AndroidUtilities.dp(36.0f), iArr[1]));
        }
    }

    @Override // ne.d
    public final void o(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 0) {
            r(false);
            float f11 = 1.0f - this.a.e;
            dx dxVar = this.G0;
            dxVar.setAlpha(f11);
            dxVar.setVisibility(f11 > 0.0f ? 0 : 4);
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
            rw rwVar = this.V;
            rwVar.setAlpha(f13);
            rwVar.setVisibility(f13 > 0.0f ? 0 : 4);
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

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.ObserversGroup observersGroup = this.O2;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.O2 = null;
        }
        NotificationCenter.ObserversGroup add = NotificationCenter.getInstance(this.c1).createWeakObserversGroup(this).addGlobal(NotificationCenter.emojiLoaded).add(NotificationCenter.newEmojiSuggestionsAvailable).add(NotificationCenter.groupPackUpdated);
        this.O2 = add;
        if (this.y0 != null) {
            add.add(NotificationCenter.stickersDidLoad).add(NotificationCenter.recentDocumentsDidLoad).add(NotificationCenter.featuredStickersDidLoad).add(NotificationCenter.groupStickersDidLoad).add(NotificationCenter.currentUserPremiumStatusChanged);
            AndroidUtilities.runOnUIThread(new lw(this, 0));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ev evVar = this.B1;
        if (evVar != null && evVar.isShowing()) {
            evVar.dismiss();
        }
        org.telegram.ui.ht o10 = org.telegram.ui.ht.o();
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
                if (!this.N2) {
                    setOutlineProvider(this.M1);
                    setClipToOutline(true);
                    setElevation(AndroidUtilities.dp(2.0f));
                }
                setBackgroundResource(R.drawable.smiles_popup);
                Drawable background = getBackground();
                int i12 = org.telegram.ui.ActionBar.k6.He;
                background.setColorFilter(new PorterDuffColorFilter(A(i12), PorterDuff.Mode.MULTIPLY));
                if (z11 && this.u0) {
                    view.setBackgroundColor(A(i12));
                }
                this.L1 = 1;
            }
        } else if (this.L1 != 0) {
            if (!this.N2) {
                setOutlineProvider(null);
                setClipToOutline(false);
                setElevation(0.0f);
            }
            if (this.u0) {
                int i13 = org.telegram.ui.ActionBar.k6.He;
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

    public final void p() {
        int L0;
        ex exVar = this.B0;
        if (exVar == null || (L0 = this.E0.L0()) == -1) {
            return;
        }
        int i10 = this.G1;
        if (i10 <= 0 && (i10 = this.F1) <= 0) {
            i10 = this.E1;
        }
        exVar.k(this.y0.F(L0), i10);
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
            yy yyVar = this.n0;
            if (adapter != yyVar || yyVar.I < 0 || this.s0 < 0 || this.r0 < 0 || (L0 = this.i0.L0()) == -1) {
                return;
            }
            this.p0.k(L0 >= yyVar.I ? this.s0 : this.r0, 0);
        }
    }

    public final void r(boolean z10) {
        uy uyVar = this.t1;
        ne.b bVar = this.a;
        ax axVar = this.D0;
        dx dxVar = this.G0;
        if (uyVar != null && uyVar.z()) {
            s4.b1 K = axVar.K(0);
            if (K == null) {
                gz.a(dxVar, true, !z10);
            } else {
                gz.a(dxVar, K.a.getTop() < axVar.getPaddingTop(), !z10);
            }
            dxVar.setTranslationY(bVar.e * AndroidUtilities.dp(15.0f));
            return;
        }
        if (dxVar == null || axVar == null) {
            return;
        }
        dxVar.setTranslationY((bVar.e * AndroidUtilities.dp(15.0f)) + (axVar.K(0) != null ? r0.a.getTop() : -this.b1));
        dxVar.a.a(false, !z10);
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
        org.telegram.ui.ActionBar.g6 g6Var = this.Z1;
        hx hxVar = this.x;
        if (hxVar != null) {
            dh.d c10 = bVar.c(hxVar, null, false);
            c10.o(fh.c.d(g6Var));
            c10.q(AndroidUtilities.dp(18.0f));
            c10.p(AndroidUtilities.dp(6.0f));
            hxVar.setBackground(c10);
        }
        ImageView imageView = this.E;
        if (imageView != null) {
            dh.d c11 = bVar.c(imageView, null, false);
            c11.o(fh.c.d(g6Var));
            c11.q(AndroidUtilities.dp(18.0f));
            c11.p(AndroidUtilities.dp(6.0f));
            imageView.setBackground(c11);
        }
        ae0 ae0Var = this.w;
        if (ae0Var != null) {
            dh.d c12 = bVar.c(ae0Var, null, false);
            c12.o(fh.c.d(g6Var));
            c12.q(AndroidUtilities.dp(18.0f));
            c12.p(AndroidUtilities.dp(6.0f));
            ae0Var.setBackground(c12);
        }
        ImageView imageView2 = this.y;
        if (imageView2 != null) {
            dh.d c13 = bVar.c(imageView2, null, false);
            c13.o(fh.c.d(g6Var));
            c13.q(AndroidUtilities.dp(18.0f));
            c13.p(AndroidUtilities.dp(6.0f));
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

    public void setDelegate(uy uyVar) {
        this.t1 = uyVar;
    }

    public void setDragListener(xx xxVar) {
        this.O0 = xxVar;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        dx dxVar = this.G0;
        if (dxVar != null) {
            dxVar.d.setEnabled(z10);
        }
        xw xwVar = this.o0;
        if (xwVar != null) {
            xwVar.d.setEnabled(z10);
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
            hg.f1 f1Var = this.T0;
            if (f1Var != null) {
                f1Var.a();
            }
        }
    }

    public final void t(long j10, boolean z10) {
        gz gzVar;
        s4.b0 b0Var;
        View view;
        View view2;
        int i10;
        int i11;
        TLRPC.TL_messages_stickerSet stickerSetById;
        kz kzVar;
        int E;
        AnimatorSet animatorSet = this.M0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.M0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        int i12 = 2;
        if (currentItem == 2 && j10 != -1 && (stickerSetById = MediaDataController.getInstance(this.c1).getStickerSetById(j10)) != null && (E = (kzVar = this.y0).E(stickerSetById)) >= 0 && E < kzVar.h()) {
            G(E, AndroidUtilities.dp(48.0f));
        }
        int i13 = 0;
        yy yyVar = this.j0;
        if (yyVar != null) {
            yyVar.K = false;
        }
        int i14 = 0;
        while (i14 < 3) {
            View view3 = this.D0;
            View view4 = this.h0;
            xw xwVar = this.o0;
            View view5 = this.P;
            if (i14 == 0) {
                gzVar = this.V;
                b0Var = this.Q;
                view = this.I;
                view2 = view5;
            } else if (i14 == 1) {
                b0Var = this.i0;
                view = this.p0;
                view2 = view4;
                gzVar = xwVar;
            } else {
                gzVar = this.G0;
                b0Var = this.E0;
                view = this.B0;
                view2 = view3;
            }
            if (gzVar == null) {
                i11 = i13;
                i10 = i12;
            } else {
                int i15 = i13;
                fz fzVar = gzVar.r;
                int i16 = i12;
                gzVar.d.setText("");
                if (fzVar != null) {
                    fzVar.L1(null);
                    fzVar.J1();
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
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(gzVar, (Property<gz, Float>) property, fArr4);
                        Animator[] animatorArr2 = new Animator[3];
                        animatorArr2[i15] = ofFloat2;
                        animatorArr2[1] = ofFloat3;
                        animatorArr2[i16] = ofFloat4;
                        animatorSet2.playTogether(animatorArr2);
                    }
                    this.M0.setDuration(200L);
                    this.M0.setInterpolator(bs.h);
                    this.M0.addListener(new ci.o3(this, b0Var, view2, 5));
                    this.M0.start();
                    i11 = i15;
                    i10 = i16;
                } else {
                    if (gzVar != xwVar) {
                        gzVar.setTranslationY(AndroidUtilities.dp(36.0f) - i17);
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            S();
            gh.c cVar = this.l2;
            if (cVar != null) {
                cVar.a(A(org.telegram.ui.ActionBar.k6.d6));
            }
            ae0 ae0Var = this.w;
            if (ae0Var != null) {
                ae0Var.setIndicatorColor(i0.a.o(A(org.telegram.ui.ActionBar.k6.Oe), 20));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void v(boolean z10) {
        kz kzVar;
        boolean z11 = this.T2;
        this.T2 = z10;
        if (!z11 || z10) {
            return;
        }
        int i10 = this.A1;
        if (i10 == 0) {
            ay ayVar = this.R;
            if (ayVar != null) {
                ayVar.F(false);
                return;
            }
            return;
        }
        if (i10 == 1) {
            yy yyVar = this.n0;
            if (yyVar != null) {
                yyVar.l();
                return;
            }
            return;
        }
        if (i10 != 2 || (kzVar = this.y0) == null) {
            return;
        }
        kzVar.l();
    }

    public final int w(float f7) {
        return i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wk, this.Z1), (int) (f7 * 255.0f));
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
        throw new IllegalArgumentException(i2.o1.k(i10, "Unexpected argument: "));
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
        throw new IllegalArgumentException(i2.o1.k(i10, "Unexpected argument: "));
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
        throw new IllegalArgumentException(i2.o1.k(i10, "Unexpected argument: "));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // ne.d
    public final void H(float f7, int i10) {
    }
}
