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
import org.telegram.ui.gc1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class rz extends FrameLayout implements le.d, NotificationCenter.NotificationCenterDelegate, oh.a {
    public static final /* synthetic */ int O2 = 0;
    public final mw A0;
    public int A1;
    public final ArrayList A2;
    public final cx B0;
    public final bv B1;
    public final GradientDrawable B2;
    public final dx C0;
    public final int C1;
    public int C2;
    public final yw D0;
    public final int[] D1;
    public ArrayList D2;
    public final ImageView E;
    public final zw E0;
    public int E1;
    public int E2;
    public AnimatorSet F;
    public pz F0;
    public int F1;
    public long F2;
    public AnimatorSet G;
    public final bx G0;
    public int G1;
    public final le.b G2;
    public float H;
    public final mh.d H0;
    public int H1;
    public ArrayList H2;
    public final ow I;
    public boolean I0;
    public int I1;
    public boolean I2;
    public final ox J;
    public boolean J0;
    public TLRPC.ChatFull J1;
    public AnimatorSet J2;
    public final bi.n7 K;
    public boolean K0;
    public boolean K1;
    public org.telegram.messenger.video.k K2;
    public final mh.b L;
    public final ky L0;
    public int L1;
    public final hw L2;
    public final bi.n7 M;
    public AnimatorSet M0;
    public final xf.i0 M1;
    public boolean M2;
    public final mh.b N;
    public final di.h N0;
    public boolean N1;
    public boolean N2;
    public final View O;
    public vx O0;
    public int O1;
    public final px P;
    public boolean P0;
    public boolean P1;
    public final qx Q;
    public final int[] Q0;
    public boolean Q1;
    public final yx R;
    public final ObjectAnimator[] R0;
    public az R1;
    public final ry S;
    public boolean S0;
    public float S1;
    public pz T;
    public fg.h1 T0;
    public float T1;
    public final mh.d U;
    public boolean U0;
    public float U1;
    public final pw V;
    public boolean V0;
    public float V1;
    public AnimatorSet W;
    public String[] W0;
    public float W1;
    public final Drawable[] X0;
    public boolean X1;
    public final Drawable[] Y0;
    public final org.telegram.ui.ActionBar.p2 Y1;
    public final Drawable[] Z0;
    public final org.telegram.ui.ActionBar.f6 Z1;
    public final le.b a;
    public final yk0 a0;
    public final String[] a1;
    public final org.telegram.ui.ActionBar.v5 a2;
    public final le.b b;
    public final yk0 b0;
    public final int b1;
    public final org.telegram.ui.ActionBar.v5 b2;
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
    public final org.telegram.ui.Cells.l9 f2;
    public final rw g0;
    public boolean g1;
    public final ix g2;
    public final ex h;
    public final sw h0;
    public TLRPC.TL_messages_stickerSet h1;
    public boolean h2;
    public final xy i0;
    public ArrayList i1;
    public final boolean i2;
    public final wy j0;
    public ArrayList j1;
    public final zg.e j2;
    public final zy k0;
    public ArrayList k1;
    public final nh k2;
    public final HashMap l0;
    public ArrayList l1;
    public final eh.d l2;
    public final mw m0;
    public final ArrayList m1;
    public final eh.c m2;
    public final FrameLayout n;
    public final wy n0;
    public final ArrayList n1;
    public final zg.a n2;
    public final vw o0;
    public final ArrayList o1;
    public boolean o2;
    public final wx p0;
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
    public sy t1;
    public int t2;
    public boolean u0;
    public long u1;
    public int u2;
    public final View v;
    public boolean v0;
    public boolean v1;
    public long v2;
    public final nd0 w;
    public boolean w0;
    public boolean w1;
    public boolean w2;
    public final fx x;
    public final ww x0;
    public final TLRPC.StickerSetCovered[] x1;
    public boolean x2;
    public final ImageView y;
    public final iz y0;
    public final LongSparseArray y1;
    public final Rect y2;
    public final mz z0;
    public final LongSparseArray z1;
    public final RectF z2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11, types: [org.telegram.ui.Components.jl0, org.telegram.ui.Components.mw] */
    /* JADX WARN: Type inference failed for: r4v66, types: [org.telegram.ui.Components.jl0, org.telegram.ui.Components.mw] */
    public rz(org.telegram.ui.ActionBar.p2 p2Var, boolean z10, boolean z11, boolean z12, Context context, boolean z13, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z14, final org.telegram.ui.ActionBar.f6 f6Var, boolean z15, boolean z16) {
        super(context);
        org.telegram.ui.ActionBar.v5 v5Var;
        int z17;
        ox oxVar;
        final org.telegram.ui.ActionBar.f6 f6Var2;
        hw hwVar;
        boolean z18;
        px pxVar;
        boolean z19;
        Context context2;
        int i10;
        int i11;
        boolean z20;
        Field field;
        wr wrVar = wr.h;
        this.a = new le.b(0, this, wrVar, 320L, false);
        this.b = new le.b(1, this, wrVar, 320L, false);
        this.c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = new ArrayList();
        this.c0 = true;
        this.k0 = new zy(this);
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
        this.f2 = new org.telegram.ui.Cells.l9(this, 9);
        this.g2 = new ix(this);
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
        this.G2 = new le.b(0, new kw(this, 1), wrVar, 380L, true);
        this.L2 = new hw(this, 2);
        this.M2 = false;
        this.u0 = z14;
        this.Y1 = p2Var;
        this.c2 = z10;
        this.Z1 = f6Var;
        this.i2 = z16;
        eh.c cVar = new eh.c();
        this.m2 = cVar;
        cVar.a(z(org.telegram.ui.ActionBar.j6.d6));
        if (z15) {
            u(true);
        }
        i0.a.k(z(org.telegram.ui.ActionBar.j6.Wk), 30);
        int dp = AndroidUtilities.dp(50.0f);
        this.b1 = dp;
        this.d0 = z13;
        this.X0 = new Drawable[]{org.telegram.ui.ActionBar.j6.U(context, R.drawable.smiles_tab_smiles, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.j6.Re), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.j6.Oe)), org.telegram.ui.ActionBar.j6.U(context, R.drawable.smiles_tab_gif, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.j6.Re), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.j6.Oe)), org.telegram.ui.ActionBar.j6.U(context, R.drawable.smiles_tab_stickers, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.j6.Re), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.j6.Oe))};
        org.telegram.ui.ActionBar.v5 U = org.telegram.ui.ActionBar.j6.U(context, R.drawable.msg_emoji_recent, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.j6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.j6.Oe));
        org.telegram.ui.ActionBar.v5 U2 = org.telegram.ui.ActionBar.j6.U(context, R.drawable.emoji_tabs_faves, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.j6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.j6.Oe));
        org.telegram.ui.ActionBar.v5 U3 = org.telegram.ui.ActionBar.j6.U(context, R.drawable.emoji_tabs_new3, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.j6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.j6.Oe));
        int i13 = R.drawable.emoji_tabs_new1;
        if (z16) {
            v5Var = U3;
            z17 = v(0.4f);
        } else {
            v5Var = U3;
            z17 = z(org.telegram.ui.ActionBar.j6.Me);
        }
        org.telegram.ui.ActionBar.v5 U4 = org.telegram.ui.ActionBar.j6.U(context, i13, z17, z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.j6.Oe));
        this.a2 = U4;
        int i14 = R.drawable.emoji_tabs_new2;
        int i15 = org.telegram.ui.ActionBar.j6.Qe;
        org.telegram.ui.ActionBar.v5 U5 = org.telegram.ui.ActionBar.j6.U(context, i14, z(i15), z(i15));
        this.b2 = U5;
        this.Y0 = new Drawable[]{U, U2, v5Var, new LayerDrawable(new Drawable[]{U4, U5})};
        this.Z0 = new Drawable[]{org.telegram.ui.ActionBar.j6.U(context, R.drawable.msg_emoji_recent, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.j6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.j6.Oe)), org.telegram.ui.ActionBar.j6.U(context, R.drawable.stickers_gifs_trending, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.j6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.j6.Oe))};
        this.a1 = new String[]{LocaleController.getString(R.string.Emoji1), LocaleController.getString(R.string.Emoji2), LocaleController.getString(R.string.Emoji3), LocaleController.getString(R.string.Emoji4), LocaleController.getString(R.string.Emoji5), LocaleController.getString(R.string.Emoji6), LocaleController.getString(R.string.Emoji7), LocaleController.getString(R.string.Emoji8)};
        this.J1 = chatFull;
        Paint paint = new Paint(1);
        this.s1 = paint;
        paint.setColor(z(org.telegram.ui.ActionBar.j6.af));
        float dp2 = AndroidUtilities.dp(6.0f);
        bi.g gVar = xf.k0.a;
        this.M1 = new xf.i0(dp2);
        ox oxVar2 = new ox(this, context);
        this.J = oxVar2;
        nz nzVar = new nz();
        nzVar.a = 0;
        nzVar.b = oxVar2;
        arrayList.add(nzVar);
        if (z10) {
            MediaDataController.getInstance(i12).checkStickers(5);
            MediaDataController.getInstance(i12).checkFeaturedEmoji();
            this.e2 = new PorterDuffColorFilter(z(org.telegram.ui.ActionBar.j6.Oh), PorterDuff.Mode.SRC_IN);
        }
        px pxVar2 = new px(this, context);
        this.P = pxVar2;
        s4.j jVar = new s4.j();
        jVar.c = 220L;
        jVar.e = 220L;
        jVar.f = 160L;
        jVar.g = 160L;
        jVar.i = wr.g;
        pxVar2.setItemAnimator(jVar);
        final int i16 = 0;
        pxVar2.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.jw
            public final /* synthetic */ rz b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (i16) {
                    case 0:
                        org.telegram.ui.tt q6 = org.telegram.ui.tt.q();
                        rz rzVar = this.b;
                        px pxVar3 = rzVar.P;
                        rzVar.getMeasuredHeight();
                        return q6.s(motionEvent, pxVar3, null, rzVar.g2, f6Var);
                    case 1:
                        org.telegram.ui.tt q10 = org.telegram.ui.tt.q();
                        rz rzVar2 = this.b;
                        return q10.s(motionEvent, rzVar2.h0, rzVar2.m0, rzVar2.g2, f6Var);
                    default:
                        org.telegram.ui.tt q11 = org.telegram.ui.tt.q();
                        rz rzVar3 = this.b;
                        yw ywVar = rzVar3.D0;
                        rzVar3.getMeasuredHeight();
                        return q11.s(motionEvent, ywVar, rzVar3.A0, rzVar3.g2, f6Var);
                }
            }
        });
        pxVar2.setOnItemLongClickListener(new kw(this, i16));
        pxVar2.setInstantClick(true);
        qx qxVar = new qx(this);
        this.Q = qxVar;
        pxVar2.setLayoutManager(qxVar);
        pxVar2.setTopGlowOffset(AndroidUtilities.dp(38.0f));
        pxVar2.setBottomGlowOffset(AndroidUtilities.dp(36.0f));
        pxVar2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f));
        int i17 = org.telegram.ui.ActionBar.j6.He;
        pxVar2.setGlowColor(z(i17));
        pxVar2.setItemSelectorColorProvider(new q2(12));
        pxVar2.setClipToPadding(false);
        qxVar.O = new rx(this);
        yx yxVar = new yx(this);
        this.R = yxVar;
        pxVar2.setAdapter(yxVar);
        pxVar2.i(new bi.z1(this, 3));
        this.S = new ry(this, context);
        oxVar2.addView(pxVar2, w7.a6.c(-1.0f, -1));
        yk0 yk0Var = new yk0(pxVar2, qxVar);
        this.b0 = yk0Var;
        yk0Var.i = new sx(this);
        pxVar2.setOnScrollListener(new tx(this));
        if (p2Var != null) {
            oxVar = oxVar2;
            f6Var2 = f6Var;
            hwVar = new hw(this, 5);
            pxVar = pxVar2;
            z19 = z16;
            context2 = context;
            i10 = dp;
            i11 = -1;
            z18 = z10;
        } else {
            oxVar = oxVar2;
            f6Var2 = f6Var;
            hwVar = null;
            z18 = z10;
            pxVar = pxVar2;
            z19 = z16;
            context2 = context;
            i10 = dp;
            i11 = -1;
        }
        ow owVar = new ow(this, context2, f6Var2, z18, hwVar, z19);
        this.I = owVar;
        if (z13) {
            pw pwVar = new pw(this, context2);
            this.V = pwVar;
            oxVar.addView(pwVar, new FrameLayout.LayoutParams(i11, AndroidUtilities.getShadowHeight() + i10));
            pwVar.d.setOnFocusChangeListener(new qw(this));
            mh.d dVar = new mh.d(context2, f6Var2);
            this.U = dVar;
            dVar.setVisibility(8);
            final int i18 = 0;
            dVar.setOnBackClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lw
                public final /* synthetic */ rz b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i18) {
                        case 0:
                            ry ryVar = this.b.S;
                            ly lyVar = ryVar.c;
                            int childCount = lyVar.getChildCount();
                            for (int i19 = 0; i19 < childCount; i19++) {
                                ((mh.c) lyVar.getChildAt(i19)).a(false, true);
                            }
                            ryVar.d = 0L;
                            ryVar.F.b.a(false, true);
                            ryVar.l();
                            break;
                        case 1:
                            mz mzVar = this.b.z0;
                            lz lzVar = mzVar.c;
                            int childCount2 = lzVar.getChildCount();
                            for (int i20 = 0; i20 < childCount2; i20++) {
                                ((mh.c) lzVar.getChildAt(i20)).a(false, true);
                            }
                            mzVar.d = 0L;
                            mzVar.Q.a.a(false, true);
                            mzVar.l();
                            break;
                        case 2:
                            sy syVar = this.b.t1;
                            if (syVar != null) {
                                syVar.w();
                                break;
                            }
                            break;
                        default:
                            rz rzVar = this.b;
                            int currentItem = rzVar.h.getCurrentItem();
                            ez ezVar = currentItem == 0 ? rzVar.V : currentItem == 1 ? rzVar.o0 : rzVar.G0;
                            if (ezVar != null) {
                                oq oqVar = ezVar.d;
                                oqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                oqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                oqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
            oxVar.addView(dVar, new FrameLayout.LayoutParams(i11, i10));
        }
        int z21 = z(i17);
        if (Color.alpha(z21) >= 255) {
            owVar.setBackgroundColor(z21);
        }
        yxVar.G(true);
        owVar.p(getEmojipacks());
        oxVar.addView(owVar, w7.a6.c(36.0f, i11));
        View view = new View(context2);
        this.O = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i19 = org.telegram.ui.ActionBar.j6.Ke;
        view.setBackgroundColor(z(i19));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i11, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(36.0f);
        oxVar.addView(view, layoutParams);
        mh.b bVar = new mh.b(context2, f6Var2);
        this.L = bVar;
        bi.n7 n7Var = new bi.n7(context2, 3, f6Var2);
        this.K = n7Var;
        n7Var.setVisibility(8);
        n7Var.addView(bVar, w7.a6.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
        oxVar.addView(n7Var, w7.a6.e(i11, -2, 80));
        if (z11) {
            rm0 rm0Var = rm0.b;
            if (z12) {
                rw rwVar = new rw(this, context2);
                this.g0 = rwVar;
                nz nzVar2 = new nz();
                nzVar2.a = 1;
                nzVar2.b = rwVar;
                this.d.add(nzVar2);
                sw swVar = new sw(this, context2);
                this.h0 = swVar;
                swVar.setClipToPadding(false);
                xy xyVar = new xy(this);
                this.i0 = xyVar;
                swVar.setLayoutManager(xyVar);
                swVar.i(new tw(this));
                swVar.setPadding(0, i10, 0, AndroidUtilities.dp(44.0f) + this.q2);
                swVar.setOverScrollMode(2);
                ((s4.f1) swVar.getItemAnimator()).m = false;
                wy wyVar = new wy(this, context2, true, ConnectionsManager.DEFAULT_DATACENTER_ID);
                this.n0 = wyVar;
                swVar.setAdapter(wyVar);
                this.j0 = new wy(this, context2, false, 0);
                swVar.setOnScrollListener(new uw(this));
                final int i20 = 1;
                swVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.jw
                    public final /* synthetic */ rz b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (i20) {
                            case 0:
                                org.telegram.ui.tt q6 = org.telegram.ui.tt.q();
                                rz rzVar = this.b;
                                px pxVar3 = rzVar.P;
                                rzVar.getMeasuredHeight();
                                return q6.s(motionEvent, pxVar3, null, rzVar.g2, f6Var2);
                            case 1:
                                org.telegram.ui.tt q10 = org.telegram.ui.tt.q();
                                rz rzVar2 = this.b;
                                return q10.s(motionEvent, rzVar2.h0, rzVar2.m0, rzVar2.g2, f6Var2);
                            default:
                                org.telegram.ui.tt q11 = org.telegram.ui.tt.q();
                                rz rzVar3 = this.b;
                                yw ywVar = rzVar3.D0;
                                rzVar3.getMeasuredHeight();
                                return q11.s(motionEvent, ywVar, rzVar3.A0, rzVar3.g2, f6Var2);
                        }
                    }
                });
                final int i21 = 0;
                ?? r12 = new jl0(this) { // from class: org.telegram.ui.Components.mw
                    public final /* synthetic */ rz b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.ui.Components.jl0
                    public final void d(int i22, View view2) {
                        switch (i21) {
                            case 0:
                                rz rzVar = this.b;
                                sw swVar2 = rzVar.h0;
                                wy wyVar2 = rzVar.j0;
                                wy wyVar3 = rzVar.n0;
                                if (rzVar.t1 != null) {
                                    wyVar3.getClass();
                                    ArrayList arrayList3 = wyVar3.x;
                                    if (swVar2.getAdapter() != wyVar3) {
                                        if (swVar2.getAdapter() == wyVar2 && i22 >= 0 && i22 < wyVar2.x.size()) {
                                            rzVar.t1.v(view2, wyVar2.x.get(i22), wyVar2.w, wyVar2.n, true, 0, 0);
                                            rzVar.Y();
                                            break;
                                        }
                                    } else if (i22 >= 0) {
                                        int i23 = wyVar3.H;
                                        if (i22 >= i23) {
                                            int i24 = i23 > 0 ? (i22 - i23) - 1 : i22;
                                            if (i24 >= 0 && i24 < arrayList3.size()) {
                                                rzVar.t1.v(view2, arrayList3.get(i24), null, wyVar3.n, true, 0, 0);
                                                break;
                                            }
                                        } else {
                                            rzVar.t1.v(view2, rzVar.i1.get(i22), null, "gif", true, 0, 0);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                rz rzVar2 = this.b;
                                s4.h0 adapter = rzVar2.D0.getAdapter();
                                mz mzVar = rzVar2.z0;
                                String str = adapter == mzVar ? mzVar.N : null;
                                if (view2 instanceof org.telegram.ui.Cells.g8) {
                                    org.telegram.ui.Cells.g8 g8Var = (org.telegram.ui.Cells.g8) view2;
                                    if (g8Var.getSticker() != null && MessageObject.isPremiumSticker(g8Var.getSticker()) && !AccountInstance.getInstance(rzVar2.c1).getUserConfig().isPremium()) {
                                        org.telegram.ui.tt.q().y(g8Var);
                                        break;
                                    } else {
                                        org.telegram.ui.tt.q().u();
                                        if (!g8Var.r) {
                                            g8Var.r = true;
                                            g8Var.n = 0.5f;
                                            g8Var.x = 0L;
                                            org.telegram.ui.Cells.f8 f8Var = g8Var.a;
                                            f8Var.setAlpha(0.5f * g8Var.H);
                                            f8Var.invalidate();
                                            g8Var.s = System.currentTimeMillis();
                                            g8Var.invalidate();
                                            rzVar2.t1.m(g8Var, g8Var.getSticker(), str, g8Var.getParentObject(), g8Var.getSendAnimationData(), true, 0);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                };
                this.m0 = r12;
                swVar.setOnItemClickListener((jl0) r12);
                rwVar.addView(swVar, w7.a6.c(-1.0f, -1));
                vw vwVar = new vw(this, context2);
                this.o0 = vwVar;
                rwVar.addView(vwVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + i10));
                wx wxVar = new wx(this, context2, f6Var2);
                this.p0 = wxVar;
                wxVar.setType(rm0Var);
                wxVar.setUnderlineHeight(AndroidUtilities.getShadowHeight());
                wxVar.setIndicatorColor(z(i15));
                wxVar.setUnderlineColor(z(i19));
                wxVar.setBackgroundColor(z(i17));
                X();
                wxVar.setDelegate(new kw(this, 2));
                wyVar.F("", "", true, true, true);
            }
            ww wwVar = new ww(this, context2, z14);
            this.x0 = wwVar;
            MediaDataController.getInstance(this.c1).checkStickers(0);
            MediaDataController.getInstance(this.c1).checkFeaturedStickers();
            yw ywVar = new yw(this, context2);
            this.D0 = ywVar;
            zw zwVar = new zw(this);
            this.E0 = zwVar;
            ywVar.setLayoutManager(zwVar);
            zwVar.O = new ax(this);
            ywVar.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f));
            ywVar.setClipToPadding(false);
            nz nzVar3 = new nz();
            nzVar3.a = 2;
            nzVar3.b = wwVar;
            this.d.add(nzVar3);
            this.z0 = new mz(this, context2);
            iz izVar = new iz(this, context2);
            this.y0 = izVar;
            ywVar.setAdapter(izVar);
            final int i22 = 2;
            ywVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.jw
                public final /* synthetic */ rz b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (i22) {
                        case 0:
                            org.telegram.ui.tt q6 = org.telegram.ui.tt.q();
                            rz rzVar = this.b;
                            px pxVar3 = rzVar.P;
                            rzVar.getMeasuredHeight();
                            return q6.s(motionEvent, pxVar3, null, rzVar.g2, f6Var2);
                        case 1:
                            org.telegram.ui.tt q10 = org.telegram.ui.tt.q();
                            rz rzVar2 = this.b;
                            return q10.s(motionEvent, rzVar2.h0, rzVar2.m0, rzVar2.g2, f6Var2);
                        default:
                            org.telegram.ui.tt q11 = org.telegram.ui.tt.q();
                            rz rzVar3 = this.b;
                            yw ywVar2 = rzVar3.D0;
                            rzVar3.getMeasuredHeight();
                            return q11.s(motionEvent, ywVar2, rzVar3.A0, rzVar3.g2, f6Var2);
                    }
                }
            });
            final int i23 = 1;
            ?? r42 = new jl0(this) { // from class: org.telegram.ui.Components.mw
                public final /* synthetic */ rz b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.Components.jl0
                public final void d(int i222, View view2) {
                    switch (i23) {
                        case 0:
                            rz rzVar = this.b;
                            sw swVar2 = rzVar.h0;
                            wy wyVar2 = rzVar.j0;
                            wy wyVar3 = rzVar.n0;
                            if (rzVar.t1 != null) {
                                wyVar3.getClass();
                                ArrayList arrayList3 = wyVar3.x;
                                if (swVar2.getAdapter() != wyVar3) {
                                    if (swVar2.getAdapter() == wyVar2 && i222 >= 0 && i222 < wyVar2.x.size()) {
                                        rzVar.t1.v(view2, wyVar2.x.get(i222), wyVar2.w, wyVar2.n, true, 0, 0);
                                        rzVar.Y();
                                        break;
                                    }
                                } else if (i222 >= 0) {
                                    int i232 = wyVar3.H;
                                    if (i222 >= i232) {
                                        int i24 = i232 > 0 ? (i222 - i232) - 1 : i222;
                                        if (i24 >= 0 && i24 < arrayList3.size()) {
                                            rzVar.t1.v(view2, arrayList3.get(i24), null, wyVar3.n, true, 0, 0);
                                            break;
                                        }
                                    } else {
                                        rzVar.t1.v(view2, rzVar.i1.get(i222), null, "gif", true, 0, 0);
                                        break;
                                    }
                                }
                            }
                            break;
                        default:
                            rz rzVar2 = this.b;
                            s4.h0 adapter = rzVar2.D0.getAdapter();
                            mz mzVar = rzVar2.z0;
                            String str = adapter == mzVar ? mzVar.N : null;
                            if (view2 instanceof org.telegram.ui.Cells.g8) {
                                org.telegram.ui.Cells.g8 g8Var = (org.telegram.ui.Cells.g8) view2;
                                if (g8Var.getSticker() != null && MessageObject.isPremiumSticker(g8Var.getSticker()) && !AccountInstance.getInstance(rzVar2.c1).getUserConfig().isPremium()) {
                                    org.telegram.ui.tt.q().y(g8Var);
                                    break;
                                } else {
                                    org.telegram.ui.tt.q().u();
                                    if (!g8Var.r) {
                                        g8Var.r = true;
                                        g8Var.n = 0.5f;
                                        g8Var.x = 0L;
                                        org.telegram.ui.Cells.f8 f8Var = g8Var.a;
                                        f8Var.setAlpha(0.5f * g8Var.H);
                                        f8Var.invalidate();
                                        g8Var.s = System.currentTimeMillis();
                                        g8Var.invalidate();
                                        rzVar2.t1.m(g8Var, g8Var.getSticker(), str, g8Var.getParentObject(), g8Var.getSendAnimationData(), true, 0);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            };
            this.A0 = r42;
            ywVar.setOnItemClickListener((jl0) r42);
            ywVar.setGlowColor(z(i17));
            wwVar.addView(ywVar);
            this.a0 = new yk0(ywVar, zwVar);
            bx bxVar = new bx(this, context2);
            this.G0 = bxVar;
            wwVar.addView(bxVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + i10));
            mh.d dVar2 = new mh.d(context2, f6Var2);
            this.H0 = dVar2;
            dVar2.setVisibility(8);
            final int i24 = 1;
            dVar2.setOnBackClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lw
                public final /* synthetic */ rz b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i24) {
                        case 0:
                            ry ryVar = this.b.S;
                            ly lyVar = ryVar.c;
                            int childCount = lyVar.getChildCount();
                            for (int i192 = 0; i192 < childCount; i192++) {
                                ((mh.c) lyVar.getChildAt(i192)).a(false, true);
                            }
                            ryVar.d = 0L;
                            ryVar.F.b.a(false, true);
                            ryVar.l();
                            break;
                        case 1:
                            mz mzVar = this.b.z0;
                            lz lzVar = mzVar.c;
                            int childCount2 = lzVar.getChildCount();
                            for (int i202 = 0; i202 < childCount2; i202++) {
                                ((mh.c) lzVar.getChildAt(i202)).a(false, true);
                            }
                            mzVar.d = 0L;
                            mzVar.Q.a.a(false, true);
                            mzVar.l();
                            break;
                        case 2:
                            sy syVar = this.b.t1;
                            if (syVar != null) {
                                syVar.w();
                                break;
                            }
                            break;
                        default:
                            rz rzVar = this.b;
                            int currentItem = rzVar.h.getCurrentItem();
                            ez ezVar = currentItem == 0 ? rzVar.V : currentItem == 1 ? rzVar.o0 : rzVar.G0;
                            if (ezVar != null) {
                                oq oqVar = ezVar.d;
                                oqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                oqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                oqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
            wwVar.addView(dVar2, new FrameLayout.LayoutParams(-1, i10));
            z20 = z14;
            cx cxVar = new cx(this, context2, f6Var2, p2Var, z20);
            this.B0 = cxVar;
            cxVar.setDragEnabled(true);
            cxVar.setWillNotDraw(false);
            cxVar.setType(rm0Var);
            cxVar.setUnderlineHeight(ywVar.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
            cxVar.setIndicatorColor(z(i15));
            cxVar.setUnderlineColor(z(i19));
            if (viewGroup == null || !z20) {
                wwVar.addView(cxVar, w7.a6.e(-1, 36, 51));
            } else {
                dx dxVar = new dx(this, context2);
                this.C0 = dxVar;
                dxVar.addView(cxVar, w7.a6.e(-1, 36, 51));
                viewGroup.addView(dxVar, w7.a6.c(-2.0f, -1));
            }
            Z(true);
            cxVar.setDelegate(new kw(this, 3));
            ywVar.setOnScrollListener(new qz(this, 0));
            mh.b bVar2 = new mh.b(context2, f6Var2);
            this.N = bVar2;
            bi.n7 n7Var2 = new bi.n7(context2, 3, f6Var2);
            this.M = n7Var2;
            n7Var2.setVisibility(8);
            n7Var2.addView(bVar2, w7.a6.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
            wwVar.addView(n7Var2, w7.a6.e(-1, -2, 80));
        } else {
            z20 = z14;
        }
        this.e.clear();
        this.e.addAll(this.d);
        ex exVar = new ex(this, context2);
        this.h = exVar;
        ky kyVar = new ky(this);
        this.L0 = kyVar;
        exVar.setAdapter(kyVar);
        fx fxVar = new fx(this, context2);
        this.x = fxVar;
        fxVar.setHapticFeedbackEnabled(true);
        fxVar.setImageResource(R.drawable.smiles_tab_clear);
        int v = z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.j6.Re);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        fxVar.setColorFilter(new PorterDuffColorFilter(v, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        fxVar.setScaleType(scaleType);
        fxVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        fxVar.setFocusable(true);
        fxVar.setOnClickListener(new gx());
        w7.c6.a(fxVar);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.r = frameLayout;
        if (z13) {
            addView(frameLayout, w7.a6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, (AndroidUtilities.getShadowHeight() / AndroidUtilities.density) + 40.0f));
        } else {
            addView(frameLayout, w7.a6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.s = frameLayout2;
        addView(frameLayout2, w7.a6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.n = frameLayout3;
        View view2 = new View(context2);
        this.v = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(40.0f), 83));
        if (z13) {
            addView(frameLayout3, w7.a6.e(-1, 48, 80));
            frameLayout3.addView(fxVar, w7.a6.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
            if (z11) {
                ImageView imageView = new ImageView(context2);
                this.y = imageView;
                imageView.setImageResource(R.drawable.smiles_tab_settings);
                imageView.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.j6.Re), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(LocaleController.getString(R.string.Settings));
                w7.c6.a(imageView);
                frameLayout3.addView(imageView, w7.a6.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
                final int i25 = 2;
                imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lw
                    public final /* synthetic */ rz b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i25) {
                            case 0:
                                ry ryVar = this.b.S;
                                ly lyVar = ryVar.c;
                                int childCount = lyVar.getChildCount();
                                for (int i192 = 0; i192 < childCount; i192++) {
                                    ((mh.c) lyVar.getChildAt(i192)).a(false, true);
                                }
                                ryVar.d = 0L;
                                ryVar.F.b.a(false, true);
                                ryVar.l();
                                break;
                            case 1:
                                mz mzVar = this.b.z0;
                                lz lzVar = mzVar.c;
                                int childCount2 = lzVar.getChildCount();
                                for (int i202 = 0; i202 < childCount2; i202++) {
                                    ((mh.c) lzVar.getChildAt(i202)).a(false, true);
                                }
                                mzVar.d = 0L;
                                mzVar.Q.a.a(false, true);
                                mzVar.l();
                                break;
                            case 2:
                                sy syVar = this.b.t1;
                                if (syVar != null) {
                                    syVar.w();
                                    break;
                                }
                                break;
                            default:
                                rz rzVar = this.b;
                                int currentItem = rzVar.h.getCurrentItem();
                                ez ezVar = currentItem == 0 ? rzVar.V : currentItem == 1 ? rzVar.o0 : rzVar.G0;
                                if (ezVar != null) {
                                    oq oqVar = ezVar.d;
                                    oqVar.requestFocus();
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                    oqVar.onTouchEvent(obtain);
                                    obtain.recycle();
                                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                    oqVar.onTouchEvent(obtain2);
                                    obtain2.recycle();
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
            nd0 nd0Var = new nd0(context2, f6Var2);
            this.w = nd0Var;
            nd0Var.setViewPager(exVar);
            nd0Var.setShouldExpand(false);
            nd0Var.setIndicatorHeight(AndroidUtilities.dp(3.0f));
            nd0Var.setIndicatorColor(i0.a.k(z(org.telegram.ui.ActionBar.j6.Oe), 20));
            nd0Var.setUnderlineHeight(0);
            nd0Var.setTabPaddingLeftRight(AndroidUtilities.dp(11.0f));
            nd0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
            frameLayout3.addView(nd0Var, w7.a6.e(-2, 48, 81));
            nd0Var.setOnPageChangeListener(new hx(this, z20));
            ImageView imageView2 = new ImageView(context2);
            this.E = imageView2;
            imageView2.setImageResource(R.drawable.smiles_tab_search);
            imageView2.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.j6.Re), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(LocaleController.getString(R.string.Search));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, w7.a6.d(48, 48.0f, 83, 2.0f, 0.0f, 2.0f, 0.0f));
            final int i26 = 3;
            imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lw
                public final /* synthetic */ rz b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view22) {
                    switch (i26) {
                        case 0:
                            ry ryVar = this.b.S;
                            ly lyVar = ryVar.c;
                            int childCount = lyVar.getChildCount();
                            for (int i192 = 0; i192 < childCount; i192++) {
                                ((mh.c) lyVar.getChildAt(i192)).a(false, true);
                            }
                            ryVar.d = 0L;
                            ryVar.F.b.a(false, true);
                            ryVar.l();
                            break;
                        case 1:
                            mz mzVar = this.b.z0;
                            lz lzVar = mzVar.c;
                            int childCount2 = lzVar.getChildCount();
                            for (int i202 = 0; i202 < childCount2; i202++) {
                                ((mh.c) lzVar.getChildAt(i202)).a(false, true);
                            }
                            mzVar.d = 0L;
                            mzVar.Q.a.a(false, true);
                            mzVar.l();
                            break;
                        case 2:
                            sy syVar = this.b.t1;
                            if (syVar != null) {
                                syVar.w();
                                break;
                            }
                            break;
                        default:
                            rz rzVar = this.b;
                            int currentItem = rzVar.h.getCurrentItem();
                            ez ezVar = currentItem == 0 ? rzVar.V : currentItem == 1 ? rzVar.o0 : rzVar.G0;
                            if (ezVar != null) {
                                oq oqVar = ezVar.d;
                                oqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                oqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                oqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            addView(frameLayout3, w7.a6.d(56, 48.0f, (LocaleController.isRTL ? 3 : 5) | 80, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(56.0f), z(i17), z(i17));
            w7.c6.a(fxVar);
            fxVar.setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
            fxVar.setBackground(h02);
            fxVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
            fxVar.setFocusable(true);
            frameLayout3.addView(fxVar, w7.a6.d(48, 48.0f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
            view2.setVisibility(8);
        }
        addView(exVar, 0, w7.a6.e(-1, -1, 51));
        di.h hVar = new di.h(context2, 21);
        this.N0 = hVar;
        hVar.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(6.0f), z(org.telegram.ui.ActionBar.j6.qf)));
        hVar.setTextColor(z(org.telegram.ui.ActionBar.j6.pf));
        hVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f));
        hVar.setGravity(16);
        hVar.setTextSize(1, 14.0f);
        hVar.setVisibility(4);
        addView(hVar, w7.a6.d(-2, -2.0f, 81, 5.0f, 0.0f, 5.0f, 53.0f));
        this.C1 = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 32.0f);
        Field field2 = bv.f;
        bv bvVar = new bv(new av(context2, f6Var2));
        if (bv.f == null) {
            try {
                field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    field.setAccessible(true);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                field = null;
            }
            bv.f = field;
        }
        Field field3 = bv.f;
        if (field3 != null) {
            try {
                bvVar.a = (ViewTreeObserver.OnScrollChangedListener) field3.get(bvVar);
                bv.f.set(bvVar, bv.g);
            } catch (Exception unused3) {
                bvVar.a = null;
            }
        }
        this.B1 = bvVar;
        bvVar.c.setOnSelectionUpdateListener(new e(this, 10));
        this.A1 = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
        Emoji.loadRecentEmoji();
        yxVar.F(false);
        K(true, z11, z12, false);
        if (Build.VERSION.SDK_INT >= 31) {
            eh.d dVar3 = new eh.d(null);
            this.l2 = dVar3;
            zg.a aVar = new zg.a(dVar3);
            this.n2 = aVar;
            aVar.f = LiteMode.isEnabled(262144);
            this.j2 = new zg.e(false);
        } else {
            this.l2 = null;
            this.n2 = new zg.a(this.m2);
            this.j2 = null;
        }
        gh.k kVar = new gh.k(this);
        nd0 nd0Var2 = this.w;
        if (nd0Var2 != null) {
            kVar.d(nd0Var2, this, new kw(this, 4), false);
        }
        zg.a aVar2 = this.n2;
        aVar2.d = kVar;
        aVar2.e = this;
        ah.a[] aVarArr = new ah.a[3];
        px pxVar3 = pxVar;
        pxVar3.C0(new hw(this, 1));
        aVarArr[0] = new zg.k(pxVar3, this, new iw(pxVar3, 0));
        sw swVar2 = this.h0;
        if (swVar2 != null) {
            swVar2.C0(new hw(this, 3));
            sw swVar3 = this.h0;
            Objects.requireNonNull(swVar3);
            aVarArr[1] = new zg.k(swVar3, this, new iw(swVar3, 1));
        }
        yw ywVar2 = this.D0;
        if (ywVar2 != null) {
            ywVar2.C0(new hw(this, 4));
            aVarArr[2] = new zg.k(this.D0, this, new iw(this, 2));
        }
        this.k2 = new nh(aVarArr, 1);
        setBlurredBackgroundDrawableFactory(this.n2);
    }

    public static void a(rz rzVar, boolean z10) {
        sw swVar = rzVar.h0;
        if (swVar == null) {
            return;
        }
        int childCount = swVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = swVar.getChildAt(i10);
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

    public static void d(rz rzVar, az azVar, String str) {
        String str2;
        sy syVar;
        org.telegram.ui.ActionBar.p2 p2Var = rzVar.Y1;
        int i10 = rzVar.c1;
        ArrayList arrayList = rzVar.q1;
        if (azVar == null) {
            return;
        }
        if (azVar.getSpan() == null) {
            rzVar.F2 = SystemClock.elapsedRealtime();
            rzVar.O(true);
            String str3 = str != null ? str : (String) azVar.getTag();
            new SpannableStringBuilder().append((CharSequence) str3);
            if (str != null) {
                sy syVar2 = rzVar.t1;
                if (syVar2 != null) {
                    syVar2.l(Emoji.fixEmoji(str));
                    return;
                }
                return;
            }
            if (!azVar.c && (str2 = Emoji.emojiColor.get(str3)) != null) {
                str3 = g(str3, str2);
            }
            rzVar.h(str3);
            sy syVar3 = rzVar.t1;
            if (syVar3 != null) {
                syVar3.l(Emoji.fixEmoji(str3));
                return;
            }
            return;
        }
        if (rzVar.t1 != null) {
            long j3 = azVar.getSpan().documentId;
            TLRPC.Document document = azVar.getSpan().document;
            dy dyVar = azVar.e;
            boolean z10 = dyVar != null && dyVar.i;
            if (document == null) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    dy dyVar2 = (dy) arrayList.get(i11);
                    int i12 = 0;
                    while (true) {
                        ArrayList arrayList2 = dyVar2.c;
                        if (arrayList2 != null && i12 < arrayList2.size()) {
                            if (((TLRPC.Document) dyVar2.c.get(i12)).id == j3) {
                                document = (TLRPC.Document) dyVar2.c.get(i12);
                                break;
                            }
                            i12++;
                        }
                    }
                }
            }
            if (document == null) {
                document = p5.f(i10, j3);
            }
            String findAnimatedEmojiEmoticon = document != null ? MessageObject.findAnimatedEmojiEmoticon(document) : null;
            if (MessageObject.isFreeEmoji(document) || UserConfig.getInstance(i10).isPremium() || (((syVar = rzVar.t1) != null && syVar.g()) || rzVar.U0 || z10)) {
                rzVar.F2 = SystemClock.elapsedRealtime();
                rzVar.O(true);
                rzVar.h("animated_" + j3);
                rzVar.t1.x(j3, document, findAnimatedEmojiEmoticon, azVar.c);
                return;
            }
            rzVar.O(false);
            wc a02 = p2Var != null ? wc.a0(p2Var) : new wc(rzVar.r, rzVar.Z1);
            if (rzVar.h2 || p2Var == null) {
                a02.q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new hw(rzVar, 7)).j();
            } else {
                a02.J(R.raw.saved_messages, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint2)), LocaleController.getString(R.string.Open), new hw(rzVar, 8)).j();
            }
            rzVar.h2 = !rzVar.h2;
        }
    }

    public static void e(rz rzVar, int i10, int i11) {
        s4.c1 K;
        int[] iArr = rzVar.Q0;
        if (i10 == 1) {
            rzVar.n(rzVar.P, i11);
            return;
        }
        sy syVar = rzVar.t1;
        if ((syVar == null || !syVar.z()) && !rzVar.J0) {
            vl0 x10 = rzVar.x(i10);
            if (i11 <= 0 || x10 == null || x10.getVisibility() != 0 || (K = x10.K(0)) == null || K.a.getTop() + rzVar.b1 < x10.getPaddingTop()) {
                int i12 = iArr[i10] - i11;
                iArr[i10] = i12;
                if (i12 > 0) {
                    iArr[i10] = 0;
                } else if (i12 < (-AndroidUtilities.dp(288.0f))) {
                    iArr[i10] = -AndroidUtilities.dp(288.0f);
                }
                if (i10 == 0) {
                    rzVar.a0();
                } else {
                    rzVar.y(i10).setTranslationY(Math.max(-AndroidUtilities.dp(48.0f), iArr[i10]));
                }
            }
        }
    }

    public static void f(rz rzVar, boolean z10) {
        int N0;
        xy xyVar = rzVar.i0;
        vw vwVar = rzVar.o0;
        sw swVar = rzVar.h0;
        if (swVar != null && (swVar.getAdapter() instanceof wy)) {
            wy wyVar = (wy) swVar.getAdapter();
            if (!wyVar.s && wyVar.h == 0 && !wyVar.x.isEmpty() && (N0 = xyVar.N0()) != -1 && N0 > xyVar.B() - 5) {
                String str = wyVar.w;
                String str2 = wyVar.r;
                boolean z11 = wyVar.v;
                wyVar.F(str, str2, true, z11, z11);
            }
        }
        sy syVar = rzVar.t1;
        if (syVar == null || !syVar.z()) {
            if (vwVar == null || swVar == null) {
                return;
            }
            vwVar.a.a(true, !z10);
            return;
        }
        s4.c1 K = swVar.K(0);
        if (K == null) {
            ez.a(vwVar, true, !z10);
        } else {
            ez.a(vwVar, K.a.getTop() < swVar.getPaddingTop(), !z10);
        }
    }

    public static String g(String str, String str2) {
        boolean z10;
        String str3;
        if (CompoundEmoji.isHandshake(str) != null) {
            return CompoundEmoji.applyColor(str, str2);
        }
        if (Emoji.endsWithRightArrow(str)) {
            str = com.google.android.gms.internal.vision.e2.h(2, 0, str);
            z10 = true;
        } else {
            z10 = false;
        }
        int length = str.length();
        if (length > 2 && str.charAt(str.length() - 2) == 8205) {
            str3 = str.substring(str.length() - 2);
            str = com.google.android.gms.internal.vision.e2.h(2, 0, str);
        } else if (length <= 3 || str.charAt(str.length() - 3) != 8205) {
            str3 = null;
        } else {
            str3 = str.substring(str.length() - 3);
            str = com.google.android.gms.internal.vision.e2.h(3, 0, str);
        }
        String t10 = org.telegram.ui.Cells.r6.t(str, str2);
        if (str3 != null) {
            t10 = org.telegram.ui.Cells.r6.t(t10, str3);
        }
        return z10 ? org.telegram.ui.Cells.r6.t(t10, "\u200d➡") : t10;
    }

    public static void j(int i10, View view) {
        if (view == null) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i10);
    }

    public final void A() {
        bx bxVar = this.G0;
        if (bxVar != null) {
            bxVar.b();
        }
        vw vwVar = this.o0;
        if (vwVar != null) {
            vwVar.b();
        }
        pw pwVar = this.V;
        if (pwVar != null) {
            pwVar.b();
        }
    }

    public final void C() {
        zg.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.j2) == null) {
            return;
        }
        nd0 nd0Var = this.w;
        RectF rectF = this.z2;
        gh.k.c(nd0Var, this, rectF);
        rectF.inset(LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f), LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        rectF.right = getMeasuredWidth();
        rectF.bottom = Math.min(rectF.bottom, getMeasuredHeight());
        eVar.g(1, this.A2);
        eVar.e(this.k2, getWidth(), getHeight());
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

    public final void E(boolean z10, boolean z11) {
        dz dzVar;
        if (this.A1 != 0 && this.w1) {
            this.A1 = 0;
        }
        if (this.A1 == 0 && this.v1) {
            this.A1 = 1;
        }
        int i10 = this.A1;
        ex exVar = this.h;
        if (i10 == 0 || z10 || this.e.size() == 1) {
            N(true, false);
            S(false, false);
            if (exVar.getCurrentItem() != 0) {
                exVar.x(0, !z10);
            }
            if (z11) {
                AndroidUtilities.runOnUIThread(new hw(this, 9), 350L);
            }
        } else {
            int i11 = this.A1;
            if (i11 == 1) {
                N(false, false);
                S(this.u0 || this.v0, false);
                if (exVar.getCurrentItem() != 2) {
                    exVar.x(2, false);
                }
                cx cxVar = this.B0;
                if (cxVar != null) {
                    this.S0 = true;
                    int i12 = this.G1;
                    if (i12 >= 0) {
                        cxVar.m(i12);
                    } else {
                        int i13 = this.F1;
                        if (i13 >= 0) {
                            cxVar.m(i13);
                        } else {
                            cxVar.m(this.E1);
                        }
                    }
                    this.S0 = false;
                    this.E0.h1(0, 0);
                }
            } else if (i11 == 2) {
                N(false, false);
                S(false, false);
                if (exVar.getCurrentItem() != 1) {
                    exVar.x(1, false);
                }
                wx wxVar = this.p0;
                if (wxVar != null) {
                    wxVar.m(0);
                }
                vw vwVar = this.o0;
                if (vwVar != null && (dzVar = vwVar.r) != null) {
                    dzVar.E1(null);
                }
            }
        }
        O(true);
    }

    public final void F() {
        iz izVar = this.y0;
        if (izVar != null) {
            izVar.l();
        }
        mz mzVar = this.z0;
        if (mzVar != null) {
            mzVar.l();
        }
        if (org.telegram.ui.tt.q().E) {
            org.telegram.ui.tt.q().n();
        }
        org.telegram.ui.tt.q().u();
    }

    @Override // le.d
    public final void G(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 0) {
            q(false);
            float f11 = 1.0f - this.a.e;
            bx bxVar = this.G0;
            bxVar.setAlpha(f11);
            bxVar.setVisibility(f11 > 0.0f ? 0 : 4);
            float f12 = 1.0f - f11;
            mh.d dVar = this.H0;
            dVar.setAlpha(f12);
            dVar.setTranslationY((-AndroidUtilities.dp(15.0f)) * f11);
            dVar.setVisibility(f12 > 0.0f ? 0 : 4);
            bi.n7 n7Var = this.M;
            n7Var.setAlpha(f12);
            n7Var.setTranslationY(AndroidUtilities.dp(30.0f) * f11);
            n7Var.setVisibility(f12 > 0.0f ? 0 : 4);
            T();
            this.x0.invalidate();
            return;
        }
        if (i10 == 1) {
            l(false);
            float f13 = 1.0f - this.b.e;
            pw pwVar = this.V;
            pwVar.setAlpha(f13);
            pwVar.setVisibility(f13 > 0.0f ? 0 : 4);
            float f14 = 1.0f - f13;
            mh.d dVar2 = this.U;
            dVar2.setAlpha(f14);
            dVar2.setTranslationY((-AndroidUtilities.dp(15.0f)) * f13);
            dVar2.setVisibility(f14 > 0.0f ? 0 : 4);
            bi.n7 n7Var2 = this.K;
            n7Var2.setAlpha(f14);
            n7Var2.setTranslationY(AndroidUtilities.dp(30.0f) * f13);
            n7Var2.setVisibility(f14 > 0.0f ? 0 : 4);
            T();
            this.J.invalidate();
        }
    }

    public final void H(int i10) {
        sy syVar = this.t1;
        if ((syVar == null || !syVar.z()) && i10 != 0) {
            HorizontalScrollView y3 = y(i10);
            this.Q0[i10] = 0;
            y3.setTranslationY(0);
        }
    }

    public final void I(int i10, int i11) {
        qx qxVar = this.Q;
        View m10 = qxVar.m(i10);
        int L0 = qxVar.L0();
        if ((m10 == null && Math.abs(i10 - L0) > qxVar.J * 9.0f) || !SharedConfig.animationsEnabled()) {
            int i12 = qxVar.L0() < i10 ? 0 : 1;
            yk0 yk0Var = this.b0;
            yk0Var.b = i12;
            yk0Var.c(i10, i11, false, false);
            return;
        }
        this.J0 = true;
        bi.t1 t1Var = new bi.t1(this, this.P.getContext(), 1);
        t1Var.a = i10;
        t1Var.p = i11;
        qxVar.w0(t1Var);
    }

    public final void J(int i10, int i11) {
        zw zwVar = this.E0;
        View m10 = zwVar.m(i10);
        int L0 = zwVar.L0();
        if (m10 != null || Math.abs(i10 - L0) <= 40) {
            this.J0 = true;
            this.D0.x0(i10);
        } else {
            int i12 = zwVar.L0() < i10 ? 0 : 1;
            yk0 yk0Var = this.a0;
            yk0Var.b = i12;
            yk0Var.c(i10, i11, false, false);
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
            if (((nz) arrayList2.get(i10)).a == 0 && z10) {
                arrayList.add((nz) arrayList2.get(i10));
            }
            if (((nz) arrayList2.get(i10)).a == 1 && z12) {
                arrayList.add((nz) arrayList2.get(i10));
            }
            if (((nz) arrayList2.get(i10)).a == 2 && z11) {
                arrayList.add((nz) arrayList2.get(i10));
            }
            i10++;
        }
        nd0 nd0Var = this.w;
        if (nd0Var != null) {
            AndroidUtilities.updateViewVisibilityAnimated(nd0Var, arrayList.size() > 1, 1.0f, z13);
        }
        ex exVar = this.h;
        if (exVar != null) {
            exVar.setAdapter(null);
            exVar.setAdapter(this.L0);
            if (nd0Var != null) {
                nd0Var.setViewPager(exVar);
            }
        }
    }

    public final void L(final mh.b bVar, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z10, boolean z11) {
        mz mzVar;
        ry ryVar;
        if (stickerSet == null) {
            return;
        }
        if (!z10 || (ryVar = this.S) == null || ryVar.d == stickerSet.id) {
            if (z10 || (mzVar = this.z0) == null || mzVar.d == stickerSet.id) {
                final boolean isStickerPackInstalled = MediaDataController.getInstance(this.c1).isStickerPackInstalled(stickerSet.id);
                bVar.g(isStickerPackInstalled ? stickerSet.masks ? LocaleController.formatPluralString("RemoveManyMasksCount", stickerSet.count, new Object[0]) : stickerSet.emojis ? LocaleController.formatPluralString("RemoveManyEmojiCount", stickerSet.count, new Object[0]) : LocaleController.formatPluralString("RemoveManyStickersCount", stickerSet.count, new Object[0]) : stickerSet.masks ? LocaleController.formatPluralString("AddManyMasksCount", stickerSet.count, new Object[0]) : stickerSet.emojis ? LocaleController.formatPluralString("AddManyEmojiCount", stickerSet.count, new Object[0]) : LocaleController.formatPluralString("AddManyStickersCount", stickerSet.count, new Object[0]), z11, true);
                bVar.h0.a(!isStickerPackInstalled, z11);
                bVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.nw
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        rz rzVar = rz.this;
                        MediaDataController mediaDataController = MediaDataController.getInstance(rzVar.c1);
                        Context context = rzVar.getContext();
                        int i10 = isStickerPackInstalled ? 0 : 2;
                        org.telegram.ui.ActionBar.p2 p2Var = rzVar.Y1;
                        FrameLayout frameLayout = rzVar.s;
                        mh.b bVar2 = bVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z12 = z10;
                        mediaDataController.toggleStickerSet(context, tLObject2, document2, i10, p2Var, frameLayout, false, true, new i2.a1(rzVar, bVar2, tLObject2, stickerSet2, document2, z12, 9), false);
                        rzVar.L(bVar2, tLObject2, stickerSet2, document2, z12, true);
                    }
                });
            }
        }
    }

    public final void M(long j3, boolean z10, boolean z11) {
        nd0 nd0Var = this.w;
        if (nd0Var == null) {
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
        LinearLayout linearLayout = nd0Var.d;
        View childAt = i10 >= linearLayout.getChildCount() ? null : linearLayout.getChildAt(i10);
        if (childAt != null) {
            childAt.setAlpha(this.u1 != 0 ? 0.15f : 1.0f);
            ex exVar = this.h;
            if (z11) {
                if (this.u1 == 0 || exVar.getCurrentItem() == 0) {
                    return;
                }
                N(true, true);
                S(false, true);
                exVar.x(0, false);
                return;
            }
            if (this.u1 == 0 || exVar.getCurrentItem() == 1) {
                return;
            }
            N(false, true);
            S(false, true);
            exVar.x(1, false);
        }
    }

    public final void N(boolean z10, boolean z11) {
        fx fxVar = this.x;
        if (z10 && fxVar.getTag() == null) {
            return;
        }
        if ((z10 || fxVar.getTag() == null) && !this.o2) {
            AnimatorSet animatorSet = this.F;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.F = null;
            }
            fxVar.setTag(z10 ? null : 1);
            if (!z11) {
                fxVar.setAlpha(z10 ? 1.0f : 0.0f);
                fxVar.setScaleX(z10 ? 1.0f : 0.0f);
                fxVar.setScaleY(z10 ? 1.0f : 0.0f);
                fxVar.setVisibility(z10 ? 0 : 4);
                return;
            }
            if (z10) {
                fxVar.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.F = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(fxVar, (Property<fx, Float>) View.ALPHA, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(fxVar, (Property<fx, Float>) View.SCALE_X, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(fxVar, (Property<fx, Float>) View.SCALE_Y, z10 ? 1.0f : 0.0f));
            this.F.setDuration(200L);
            this.F.setInterpolator(wr.g);
            this.F.addListener(new lx(this, z10, r2));
            this.F.start();
        }
    }

    public final void O(boolean z10) {
        this.H = 0.0f;
        sy syVar = this.t1;
        if (syVar != null && syVar.z()) {
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
            this.W.setInterpolator(wr.g);
            this.W.addListener(new rm(this, 9));
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
        di.h hVar = this.N0;
        if (z10) {
            if (ChatObject.hasAdminRights(chat) || (tL_chatBannedRights = chat.default_banned_rights) == null || !(tL_chatBannedRights.send_stickers || (z11 && tL_chatBannedRights.send_plain))) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.banned_rights;
                if (tL_chatBannedRights2 == null) {
                    return;
                }
                if (!AndroidUtilities.isBannedForever(tL_chatBannedRights2)) {
                    if (z11) {
                        hVar.setText(LocaleController.formatString("AttachPlainRestricted", R.string.AttachPlainRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    }
                    if (z12) {
                        hVar.setText(LocaleController.formatString("AttachGifRestricted", R.string.AttachGifRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    } else {
                        hVar.setText(LocaleController.formatString("AttachStickersRestricted", R.string.AttachStickersRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    }
                } else if (z11) {
                    hVar.setText(LocaleController.getString(R.string.AttachPlainRestrictedForever));
                } else if (z12) {
                    hVar.setText(LocaleController.getString(R.string.AttachGifRestrictedForever));
                } else {
                    hVar.setText(LocaleController.getString(R.string.AttachStickersRestrictedForever));
                }
            } else {
                org.telegram.ui.ActionBar.p2 p2Var = this.Y1;
                if ((p2Var instanceof org.telegram.ui.eo) && ((org.telegram.ui.eo) p2Var).K6()) {
                    return;
                }
                if (z11) {
                    hVar.setText(LocaleController.getString(R.string.GlobalAttachEmojiRestricted));
                } else if (z12) {
                    hVar.setText(LocaleController.getString(R.string.GlobalAttachGifRestricted));
                } else {
                    hVar.setText(LocaleController.getString(R.string.GlobalAttachStickersRestricted));
                }
            }
            hVar.setVisibility(0);
        }
        AnimatorSet animatorSet = this.J2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.J2 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.J2 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(hVar, (Property<di.h, Float>) View.ALPHA, z10 ? hVar.getAlpha() : 1.0f, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(hVar, (Property<di.h, Float>) View.TRANSLATION_Y, z10 ? AndroidUtilities.dp(12.0f) : hVar.getTranslationY(), z10 ? 0.0f : AndroidUtilities.dp(12.0f)));
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
        this.J2.setInterpolator(wr.h);
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
            this.G.setInterpolator(wr.g);
            this.G.addListener(new lx(this, z10, i10));
            this.G.start();
        }
    }

    public final void T() {
        org.telegram.ui.ActionBar.p2 p2Var;
        if (((View) getParent()) != null) {
            float y3 = (getY() + (getLayoutParams().height > 0 ? getLayoutParams().height : getMeasuredHeight())) - (((AndroidUtilities.isInMultiwindow || ((p2Var = this.Y1) != null && p2Var.isInBubbleMode())) && !this.V0) ? AndroidUtilities.dp(1.0f) : r0.getHeight());
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
        ez ezVar;
        boolean z10;
        cw cwVar;
        boolean z11 = this.u0;
        View view = this.v;
        if (!z11) {
            setBackground(null);
            view.setBackground(null);
        } else if (AndroidUtilities.isInMultiwindow || this.N1) {
            Drawable background = getBackground();
            if (background != null) {
                background.setColorFilter(new PorterDuffColorFilter(z(org.telegram.ui.ActionBar.j6.He), PorterDuff.Mode.MULTIPLY));
            }
        } else {
            int i10 = org.telegram.ui.ActionBar.j6.He;
            setBackgroundColor(z(i10));
            if (this.d0) {
                view.setBackgroundColor(z(i10));
            }
        }
        ow owVar = this.I;
        if (owVar != null) {
            if (this.u0) {
                owVar.setBackgroundColor(z(org.telegram.ui.ActionBar.j6.He));
                this.O.setBackgroundColor(z(org.telegram.ui.ActionBar.j6.Ke));
            } else {
                owVar.setBackground(null);
            }
        }
        bv bvVar = this.B1;
        if (bvVar != null) {
            bvVar.c.a();
        }
        int i11 = 0;
        while (true) {
            ezVar = this.V;
            z10 = this.i2;
            if (i11 >= 3) {
                break;
            }
            if (i11 == 0) {
                ezVar = this.G0;
            } else if (i11 != 1) {
                ezVar = this.o0;
            }
            if (ezVar != null) {
                oq oqVar = ezVar.d;
                FrameLayout frameLayout = ezVar.n;
                View view2 = ezVar.f;
                if (this.u0) {
                    view2.setBackgroundColor(z(org.telegram.ui.ActionBar.j6.He));
                } else {
                    view2.setBackground(null);
                }
                ezVar.e.setBackgroundColor(z(org.telegram.ui.ActionBar.j6.Ke));
                ezVar.c.a(z10 ? v(0.4f) : z(org.telegram.ui.ActionBar.j6.Je));
                org.telegram.ui.ActionBar.j6.w1(z10 ? v(0.06f) : z(org.telegram.ui.ActionBar.j6.Ie), frameLayout.getBackground());
                frameLayout.invalidate();
                oqVar.setHintTextColor(z10 ? v(0.45f) : z(org.telegram.ui.ActionBar.j6.Je));
                oqVar.setTextColor(z10 ? v(0.8f) : z(org.telegram.ui.ActionBar.j6.G6));
            }
            i11++;
        }
        Paint paint = this.s1;
        if (paint != null) {
            paint.setColor(z(org.telegram.ui.ActionBar.j6.af));
        }
        px pxVar = this.P;
        if (pxVar != null) {
            pxVar.setGlowColor(z(org.telegram.ui.ActionBar.j6.He));
        }
        yw ywVar = this.D0;
        if (ywVar != null) {
            ywVar.setGlowColor(z(org.telegram.ui.ActionBar.j6.He));
        }
        cx cxVar = this.B0;
        if (cxVar != null) {
            cxVar.setIndicatorColor(z(org.telegram.ui.ActionBar.j6.Qe));
            cxVar.setUnderlineColor(z(org.telegram.ui.ActionBar.j6.Ke));
            if (this.u0) {
                cxVar.setBackgroundColor(z(org.telegram.ui.ActionBar.j6.He));
            } else {
                cxVar.setBackground(null);
            }
        }
        wx wxVar = this.p0;
        if (wxVar != null) {
            wxVar.setIndicatorColor(z(org.telegram.ui.ActionBar.j6.Qe));
            wxVar.setUnderlineColor(z(org.telegram.ui.ActionBar.j6.Ke));
            if (this.u0) {
                wxVar.setBackgroundColor(z(org.telegram.ui.ActionBar.j6.He));
            } else {
                wxVar.setBackground(null);
            }
        }
        fx fxVar = this.x;
        if (fxVar != null) {
            fxVar.setColorFilter(new PorterDuffColorFilter(z10 ? v(0.6f) : z(org.telegram.ui.ActionBar.j6.Re), PorterDuff.Mode.MULTIPLY));
            if (ezVar == null) {
                Drawable background2 = fxVar.getBackground();
                int i12 = org.telegram.ui.ActionBar.j6.He;
                org.telegram.ui.ActionBar.j6.B1(background2, z(i12), false);
                org.telegram.ui.ActionBar.j6.B1(fxVar.getBackground(), z(i12), true);
            }
        }
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(z10 ? v(0.6f) : z(org.telegram.ui.ActionBar.j6.Re), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.E;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(z10 ? v(0.6f) : z(org.telegram.ui.ActionBar.j6.Re), PorterDuff.Mode.MULTIPLY));
        }
        di.h hVar = this.N0;
        if (hVar != null) {
            ((ShapeDrawable) hVar.getBackground()).getPaint().setColor(z(org.telegram.ui.ActionBar.j6.qf));
            hVar.setTextColor(z(org.telegram.ui.ActionBar.j6.pf));
        }
        wy wyVar = this.j0;
        if (wyVar != null) {
            yy yyVar = wyVar.e;
            ImageView imageView3 = yyVar.a;
            int i13 = org.telegram.ui.ActionBar.j6.Le;
            imageView3.setColorFilter(new PorterDuffColorFilter(z(i13), PorterDuff.Mode.MULTIPLY));
            yyVar.b.setTextColor(z(i13));
            yyVar.c.setProgressColor(z(org.telegram.ui.ActionBar.j6.h6));
        }
        this.e2 = new PorterDuffColorFilter(z(org.telegram.ui.ActionBar.j6.Oh), PorterDuff.Mode.SRC_IN);
        int i14 = 0;
        while (true) {
            Drawable[] drawableArr = this.X0;
            if (i14 >= drawableArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.j6.y1(drawableArr[i14], z10 ? v(0.4f) : z(org.telegram.ui.ActionBar.j6.Ne), false);
            org.telegram.ui.ActionBar.j6.y1(drawableArr[i14], z10 ? v(0.8f) : z(org.telegram.ui.ActionBar.j6.Oe), true);
            i14++;
        }
        if (owVar != null && (cwVar = owVar.y) != null) {
            cwVar.d();
        }
        int i15 = 0;
        while (true) {
            Drawable[] drawableArr2 = this.Y0;
            if (i15 >= drawableArr2.length) {
                break;
            }
            org.telegram.ui.ActionBar.j6.y1(drawableArr2[i15], z10 ? v(0.4f) : z(org.telegram.ui.ActionBar.j6.Me), false);
            org.telegram.ui.ActionBar.j6.y1(drawableArr2[i15], z10 ? v(0.8f) : z(org.telegram.ui.ActionBar.j6.Oe), true);
            i15++;
        }
        int i16 = 0;
        while (true) {
            Drawable[] drawableArr3 = this.Z0;
            if (i16 >= drawableArr3.length) {
                break;
            }
            org.telegram.ui.ActionBar.j6.y1(drawableArr3[i16], z10 ? v(0.4f) : z(org.telegram.ui.ActionBar.j6.Me), false);
            org.telegram.ui.ActionBar.j6.y1(drawableArr3[i16], z10 ? v(0.8f) : z(org.telegram.ui.ActionBar.j6.Oe), true);
            i16++;
        }
        org.telegram.ui.ActionBar.v5 v5Var = this.a2;
        if (v5Var != null) {
            org.telegram.ui.ActionBar.j6.y1(v5Var, z10 ? v(0.4f) : z(org.telegram.ui.ActionBar.j6.Ne), false);
            org.telegram.ui.ActionBar.j6.y1(v5Var, z10 ? v(0.8f) : z(org.telegram.ui.ActionBar.j6.Oe), true);
        }
        org.telegram.ui.ActionBar.v5 v5Var2 = this.b2;
        if (v5Var2 != null) {
            org.telegram.ui.ActionBar.j6.y1(v5Var2, z10 ? v(0.4f) : z(org.telegram.ui.ActionBar.j6.Qe), false);
            org.telegram.ui.ActionBar.j6.y1(v5Var2, z10 ? v(0.8f) : z(org.telegram.ui.ActionBar.j6.Qe), true);
        }
    }

    public final void V() {
        px pxVar = this.P;
        if (pxVar == null) {
            return;
        }
        for (int i10 = 0; i10 < pxVar.getChildCount(); i10++) {
            View childAt = pxVar.getChildAt(i10);
            if (childAt instanceof iy) {
                ((iy) childAt).a(true);
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
            yx yxVar = this.R;
            int i12 = yxVar.c;
            ArrayList arrayList = yxVar.x;
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
                    ArrayList<dy> emojipacks = getEmojipacks();
                    int size2 = arrayList.size() - 1;
                    while (true) {
                        if (size2 < 0) {
                            break;
                        }
                        if (((Integer) arrayList.get(size2)).intValue() <= i10) {
                            dy dyVar = (dy) this.q1.get(size2);
                            while (i13 < emojipacks.size()) {
                                long j3 = emojipacks.get(i13).b.id;
                                long j10 = dyVar.b.id;
                                if (j3 == j10 && (!dyVar.g || (!dyVar.f && !this.p1.contains(Long.valueOf(j10))))) {
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
        dz dzVar;
        int i11;
        boolean z10;
        wx wxVar = this.p0;
        int currentPosition = wxVar.getCurrentPosition();
        int i12 = this.r0;
        boolean z11 = currentPosition == i12;
        boolean z12 = i12 >= 0;
        boolean isEmpty = this.i1.isEmpty();
        wxVar.d(false);
        this.r0 = -2;
        this.s0 = -2;
        this.t0 = -2;
        Drawable[] drawableArr = this.Z0;
        if (isEmpty) {
            i10 = 0;
        } else {
            this.r0 = 0;
            wxVar.b(0, drawableArr[0]).setContentDescription(LocaleController.getString(R.string.RecentStickers));
            i10 = 1;
        }
        this.s0 = i10;
        wxVar.b(1, drawableArr[1]).setContentDescription(LocaleController.getString(R.string.FeaturedGifs));
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
                String j3 = hc.b.j(i14 + 3, "tab");
                int i15 = wxVar.x;
                wxVar.x = i15 + 1;
                ox0 ox0Var = (ox0) wxVar.n.get(j3);
                if (ox0Var != null) {
                    wxVar.g(j3, ox0Var, i15);
                    i11 = currentPosition;
                    z10 = z12;
                } else {
                    i11 = currentPosition;
                    z10 = z12;
                    ox0Var = new ox0(wxVar.getContext(), 2);
                    ox0Var.setFocusable(true);
                    ox0Var.setOnClickListener(new lm0(wxVar, 2));
                    ox0Var.setExpanded(wxVar.f0);
                    ox0Var.a(wxVar.i0);
                    wxVar.e.addView(ox0Var, i15);
                }
                ox0Var.d = false;
                ox0Var.setTag(R.id.index_tag, Integer.valueOf(i15));
                ox0Var.setTag(R.id.parent_tag, emojiDrawable);
                ox0Var.setTag(R.id.object_tag, emojiAnimatedSticker);
                ox0Var.setSelected(i15 == wxVar.y);
                wxVar.h.put(j3, ox0Var);
                ox0Var.setContentDescription(str);
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
        wxVar.h();
        wxVar.q();
        if (z11 && isEmpty) {
            wxVar.m(this.s0);
            vw vwVar = this.o0;
            if (vwVar == null || (dzVar = vwVar.r) == null) {
                return;
            }
            dzVar.E1(null);
            return;
        }
        WeakHashMap weakHashMap = r0.i0.a;
        if (wxVar.isLaidOut()) {
            if (!isEmpty && !z13) {
                wxVar.k(i16 + 1, 0);
            } else if (isEmpty && z13) {
                wxVar.k(i16 - 1, 0);
            }
        }
    }

    public final void Y() {
        wy wyVar;
        int size = this.i1.size();
        long calcDocumentsHash = MediaDataController.calcDocumentsHash(this.i1, ConnectionsManager.DEFAULT_DATACENTER_ID);
        ArrayList<TLRPC.Document> recentGifs = MediaDataController.getInstance(this.c1).getRecentGifs();
        this.i1 = recentGifs;
        long calcDocumentsHash2 = MediaDataController.calcDocumentsHash(recentGifs, ConnectionsManager.DEFAULT_DATACENTER_ID);
        if ((this.p0 != null && size == 0 && !this.i1.isEmpty()) || (size != 0 && this.i1.isEmpty())) {
            X();
        }
        if ((size == this.i1.size() && calcDocumentsHash == calcDocumentsHash2) || (wyVar = this.n0) == null) {
            return;
        }
        wyVar.l();
    }

    public final void Z(boolean z10) {
        TLRPC.Document document;
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet;
        cx cxVar = this.B0;
        if (cxVar != null) {
            gc1 gc1Var = cxVar.e;
            if (cxVar.s != null) {
                return;
            }
            this.F1 = -2;
            this.G1 = -2;
            this.H1 = -2;
            this.I1 = -2;
            this.e0 = false;
            this.E1 = 0;
            int currentPosition = cxVar.getCurrentPosition();
            boolean z11 = true;
            cxVar.d((getParent() == null || getVisibility() != 0 || (this.y1.size() == 0 && this.z1.size() == 0)) ? false : true);
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
            pz pzVar = this.F0;
            if (pzVar != null) {
                pzVar.l();
            }
            boolean isEmpty = featuredStickerSets.isEmpty();
            long j3 = 0;
            Drawable[] drawableArr = this.Y0;
            if (!isEmpty && (arrayList3.isEmpty() || emojiSettings.getLong("featured_hidden", 0L) == featuredStickerSets.get(0).set.id)) {
                int i12 = mediaDataController.getUnreadStickerSets().isEmpty() ? 2 : 3;
                ox0 c10 = cxVar.c(i12, drawableArr[i12]);
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
                ox0 c11 = cxVar.c(1, drawableArr[1]);
                c11.h.setText(LocaleController.getString(R.string.FavoriteStickersShort));
                c11.setContentDescription(LocaleController.getString(R.string.FavoriteStickers));
            }
            if (!this.j1.isEmpty()) {
                int i15 = this.E1;
                this.F1 = i15;
                this.E1 = i15 + 1;
                ox0 c12 = cxVar.c(0, drawableArr[0]);
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
                        int i19 = cxVar.x;
                        cxVar.x = i19 + 1;
                        ox0 ox0Var = (ox0) cxVar.n.get(str);
                        if (ox0Var != null) {
                            cxVar.g(str, ox0Var, i19);
                        } else {
                            ox0Var = new ox0(cxVar.getContext(), 0);
                            ox0Var.setFocusable(z11);
                            ox0Var.setOnClickListener(new lm0(cxVar, 0));
                            gc1Var.addView(ox0Var, i19);
                            ox0Var.w = z11;
                            g9 g9Var = new g9(f6Var);
                            g9Var.u(AndroidUtilities.dp(14.0f));
                            g9Var.k(UserConfig.selectedAccount, chat2);
                            int i20 = cxVar.a;
                            w9 w9Var = ox0Var.e;
                            w9Var.setLayerNum(i20);
                            w9Var.e(chat2, g9Var);
                            w9Var.setAspectFit(z11);
                            ox0Var.setExpanded(cxVar.f0);
                            ox0Var.a(cxVar.i0);
                            ox0Var.h.setText(chat2.title);
                        }
                        ox0Var.d = z11;
                        ox0Var.setTag(R.id.index_tag, Integer.valueOf(i19));
                        ox0Var.setSelected(i19 == cxVar.y);
                        cxVar.h.put(str, ox0Var);
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
                    int i22 = cxVar.x;
                    cxVar.x = i22 + 1;
                    ox0 ox0Var2 = (ox0) cxVar.n.get(str2);
                    if (ox0Var2 != null) {
                        cxVar.g(str2, ox0Var2, i22);
                    } else {
                        ox0Var2 = new ox0(cxVar.getContext(), 0);
                        ox0Var2.setFocusable(z11);
                        ox0Var2.setOnClickListener(new lm0(cxVar, 1));
                        ox0Var2.setExpanded(cxVar.f0);
                        ox0Var2.a(cxVar.i0);
                        gc1Var.addView(ox0Var2, i22);
                    }
                    ox0Var2.e.setLayerNum(cxVar.a);
                    ox0Var2.d = false;
                    ox0Var2.setTag(closestPhotoSizeWithSize);
                    ox0Var2.setTag(R.id.index_tag, Integer.valueOf(i22));
                    ox0Var2.setTag(R.id.parent_tag, tL_messages_stickerSet5);
                    ox0Var2.setTag(R.id.object_tag, document);
                    ox0Var2.setSelected(i22 == cxVar.y);
                    cxVar.h.put(str2, ox0Var2);
                    ox0Var2.setContentDescription(tL_messages_stickerSet5.set.title + ", " + LocaleController.getString(R.string.AccDescrStickerSet));
                }
                i18++;
                z11 = true;
                f6Var = null;
            }
            cxVar.h();
            cxVar.q();
            if (currentPosition != 0) {
                cxVar.k(currentPosition, currentPosition);
            }
            o();
        }
    }

    public final void a0() {
        dx dxVar = this.C0;
        cx cxVar = this.B0;
        if (cxVar != null && dxVar == null && this.t1 != null) {
            cxVar.setTranslationY(this.t1.p() * (-AndroidUtilities.dp(50.0f)));
        }
        if (dxVar == null) {
            return;
        }
        boolean z10 = getVisibility() == 0 && this.K0 && this.t1.p() != 1.0f;
        dxVar.setVisibility(z10 ? 0 : 8);
        if (z10) {
            Rect rect = this.y2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.x0, rect, null);
            float p5 = this.t1.p() * AndroidUtilities.dp(50.0f);
            int i10 = rect.left;
            if (i10 != 0 || p5 != 0.0f) {
                this.X1 = false;
            }
            dxVar.setTranslationX(i10);
            float translationY = (((getTranslationY() + getTop()) - dxVar.getTop()) - cxVar.getExpandedOffset()) - p5;
            if (dxVar.getTranslationY() != translationY) {
                dxVar.setTranslationY(translationY);
                dxVar.invalidate();
            }
        }
        if (this.X1 && z10 && this.P0) {
            cxVar.i(this.W1, true);
        } else {
            this.X1 = false;
            cxVar.i(this.W1, false);
        }
    }

    @Override // oh.a
    public final void b(int i10) {
        setBottomInset(i10);
    }

    public final void b0() {
        boolean z10;
        org.telegram.ui.Cells.r3 r3Var;
        LongSparseArray longSparseArray = this.z1;
        LongSparseArray longSparseArray2 = this.y1;
        int i10 = this.c1;
        yw ywVar = this.D0;
        if (ywVar == null) {
            return;
        }
        try {
            int childCount = ywVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = ywVar.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.r3) && ((fl0) ywVar.T(childAt)) != null) {
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

    @Override // oh.a
    public final void c(float f7) {
        this.r2 = f7;
        T();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Utilities.Callback callback;
        TLRPC.StickerSet stickerSet;
        int i12 = NotificationCenter.stickersDidLoad;
        yx yxVar = this.R;
        hw hwVar = this.L2;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.y0 != null) {
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
                    yxVar.F(false);
                    return;
                } else {
                    AndroidUtilities.cancelRunOnUIThread(hwVar);
                    AndroidUtilities.runOnUIThread(hwVar, 100L);
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
                yxVar.F(true);
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
            nd0 nd0Var = this.w;
            if (nd0Var != null) {
                int childCount = nd0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    nd0Var.getChildAt(i13).invalidate();
                }
            }
            Z(false);
            return;
        }
        if (i10 == NotificationCenter.featuredEmojiDidLoad) {
            if (yxVar != null) {
                yxVar.F(false);
                return;
            }
            return;
        }
        int i14 = NotificationCenter.groupStickersDidLoad;
        ry ryVar = this.S;
        if (i10 == i14) {
            Long l4 = (Long) objArr[0];
            long longValue2 = l4.longValue();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = objArr.length > 1 ? (TLRPC.TL_messages_stickerSet) objArr[1] : null;
            if (tL_messages_stickerSet != null) {
                mz mzVar = this.z0;
                if (mzVar != null && mzVar.d == longValue2 && mzVar.f.size() < tL_messages_stickerSet.documents.size()) {
                    mzVar.f = tL_messages_stickerSet.documents;
                    mzVar.l();
                }
                if (ryVar != null && ryVar.d == longValue2 && ryVar.f.size() < tL_messages_stickerSet.documents.size()) {
                    ryVar.f = tL_messages_stickerSet.documents;
                    ryVar.l();
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
            AndroidUtilities.cancelRunOnUIThread(hwVar);
            AndroidUtilities.runOnUIThread(hwVar, 100L);
            return;
        }
        int i15 = NotificationCenter.emojiLoaded;
        px pxVar = this.P;
        if (i10 != i15) {
            if (i10 != NotificationCenter.newEmojiSuggestionsAvailable) {
                if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                    if (yxVar != null) {
                        yxVar.F(false);
                    }
                    V();
                    Z(false);
                    return;
                }
                return;
            }
            if (pxVar == null || !this.d0) {
                return;
            }
            if ((this.V.c.k == 2 || pxVar.getAdapter() == ryVar) && !TextUtils.isEmpty(ryVar.v)) {
                ryVar.F(ryVar.v, true);
                return;
            }
            return;
        }
        yw ywVar = this.D0;
        if (ywVar != null) {
            int childCount2 = ywVar.getChildCount();
            for (int i16 = 0; i16 < childCount2; i16++) {
                View childAt = ywVar.getChildAt(i16);
                if ((childAt instanceof org.telegram.ui.Cells.p8) || (childAt instanceof org.telegram.ui.Cells.g8)) {
                    childAt.invalidate();
                }
            }
        }
        if (pxVar != null) {
            pxVar.invalidate();
            int childCount3 = pxVar.getChildCount();
            for (int i17 = 0; i17 < childCount3; i17++) {
                View childAt2 = pxVar.getChildAt(i17);
                if (childAt2 instanceof az) {
                    childAt2.invalidate();
                }
            }
        }
        bv bvVar = this.B1;
        if (bvVar != null) {
            bvVar.c.invalidate();
        }
        wx wxVar = this.p0;
        if (wxVar != null) {
            gc1 gc1Var = wxVar.e;
            int childCount4 = gc1Var.getChildCount();
            for (int i18 = 0; i18 < childCount4; i18++) {
                gc1Var.getChildAt(i18).invalidate();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        eh.d dVar;
        zg.e eVar;
        if (Build.VERSION.SDK_INT >= 31 && (dVar = this.l2) != null && (eVar = this.j2) != null) {
            C();
            RecordingCanvas a2 = dVar.a(getMeasuredWidth(), getMeasuredHeight());
            a2.drawColor(z(org.telegram.ui.ActionBar.j6.d6));
            if (SharedConfig.chatBlurEnabled()) {
                eVar.b(a2, -2);
            }
            dVar.c();
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
            int l1 = org.telegram.ui.ActionBar.j6.l1(navigationBarThirdButtonsFactor, z(org.telegram.ui.ActionBar.j6.He));
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

    public ArrayList<dy> getEmojipacks() {
        ArrayList<dy> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.q1;
            if (i10 >= arrayList2.size()) {
                return arrayList;
            }
            dy dyVar = (dy) arrayList2.get(i10);
            boolean z10 = dyVar.g;
            ArrayList arrayList3 = this.p1;
            if ((!z10 && (dyVar.f || arrayList3.contains(Long.valueOf(dyVar.b.id)))) || (dyVar.g && !dyVar.f && !arrayList3.contains(Long.valueOf(dyVar.b.id)))) {
                arrayList.add(dyVar);
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
        cx cxVar = this.B0;
        if (cxVar == null) {
            return 0.0f;
        }
        return cxVar.getExpandedOffset();
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
        mx mxVar = new mx(getContext(), i11);
        mxVar.a = !z10 ? 1 : 0;
        w(i10).w0(mxVar);
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
        iz izVar = this.y0;
        if (izVar != null) {
            izVar.l();
        }
        o();
    }

    public final void l(boolean z10) {
        sy syVar = this.t1;
        le.b bVar = this.b;
        px pxVar = this.P;
        pw pwVar = this.V;
        if (syVar != null && syVar.z()) {
            s4.c1 K = pxVar.K(0);
            if (K == null) {
                ez.a(pwVar, true, !z10);
            } else {
                ez.a(pwVar, K.a.getTop() < pxVar.getPaddingTop(), !z10);
            }
            P(false, !z10);
            pwVar.setTranslationY(bVar.e * AndroidUtilities.dp(15.0f));
            return;
        }
        if (pwVar == null || pxVar == null) {
            return;
        }
        pwVar.setTranslationY((bVar.e * AndroidUtilities.dp(15.0f)) + (pxVar.K(0) != null ? r0.a.getTop() : -this.b1));
        pwVar.a.a(false, !z10);
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

    public final void n(px pxVar, int i10) {
        px pxVar2;
        s4.c1 K;
        ow owVar = this.I;
        int[] iArr = this.Q0;
        if (pxVar == null) {
            iArr[1] = 0;
            owVar.setTranslationY(0);
            return;
        }
        if (pxVar.getVisibility() != 0 || this.f0) {
            return;
        }
        sy syVar = this.t1;
        if (syVar == null || !syVar.z()) {
            if (i10 > 0 && (pxVar2 = this.P) != null && pxVar2.getVisibility() == 0 && (K = pxVar2.K(0)) != null) {
                if (K.a.getTop() + (this.d0 ? this.b1 : 0) >= pxVar2.getPaddingTop()) {
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
            owVar.setTranslationY(Math.max(-AndroidUtilities.dp(36.0f), iArr[1]));
        }
    }

    public final void o() {
        int L0;
        cx cxVar = this.B0;
        if (cxVar == null || (L0 = this.E0.L0()) == -1) {
            return;
        }
        int i10 = this.G1;
        if (i10 <= 0 && (i10 = this.F1) <= 0) {
            i10 = this.E1;
        }
        cxVar.k(this.y0.F(L0), i10);
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
            AndroidUtilities.runOnUIThread(new hw(this, 0));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bv bvVar = this.B1;
        if (bvVar != null && bvVar.isShowing()) {
            bvVar.dismiss();
        }
        org.telegram.ui.tt q6 = org.telegram.ui.tt.q();
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
            F();
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
                background.setColorFilter(new PorterDuffColorFilter(z(i12), PorterDuff.Mode.MULTIPLY));
                if (z11 && this.u0) {
                    view.setBackgroundColor(z(i12));
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
            wy wyVar = this.n0;
            if (adapter != wyVar || wyVar.I < 0 || this.s0 < 0 || this.r0 < 0 || (L0 = this.i0.L0()) == -1) {
                return;
            }
            this.p0.k(L0 >= wyVar.I ? this.s0 : this.r0, 0);
        }
    }

    public final void q(boolean z10) {
        sy syVar = this.t1;
        le.b bVar = this.a;
        yw ywVar = this.D0;
        bx bxVar = this.G0;
        if (syVar != null && syVar.z()) {
            s4.c1 K = ywVar.K(0);
            if (K == null) {
                ez.a(bxVar, true, !z10);
            } else {
                ez.a(bxVar, K.a.getTop() < ywVar.getPaddingTop(), !z10);
            }
            bxVar.setTranslationY(bVar.e * AndroidUtilities.dp(15.0f));
            return;
        }
        if (bxVar == null || ywVar == null) {
            return;
        }
        bxVar.setTranslationY((bVar.e * AndroidUtilities.dp(15.0f)) + (ywVar.K(0) != null ? r0.a.getTop() : -this.b1));
        bxVar.a.a(false, !z10);
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
        ez ezVar;
        s4.c0 c0Var;
        View view;
        vl0 vl0Var;
        int i10;
        TLRPC.TL_messages_stickerSet stickerSetById;
        iz izVar;
        int E;
        AnimatorSet animatorSet = this.M0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.M0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        if (currentItem == 2 && j3 != -1 && (stickerSetById = MediaDataController.getInstance(this.c1).getStickerSetById(j3)) != null && (E = (izVar = this.y0).E(stickerSetById)) >= 0 && E < izVar.h()) {
            J(E, AndroidUtilities.dp(48.0f));
        }
        wy wyVar = this.j0;
        if (wyVar != null) {
            wyVar.K = false;
        }
        for (int i11 = 0; i11 < 3; i11++) {
            vl0 vl0Var2 = this.D0;
            vl0 vl0Var3 = this.h0;
            vw vwVar = this.o0;
            vl0 vl0Var4 = this.P;
            if (i11 == 0) {
                ezVar = this.V;
                c0Var = this.Q;
                view = this.I;
                vl0Var = vl0Var4;
            } else if (i11 == 1) {
                c0Var = this.i0;
                view = this.p0;
                vl0Var = vl0Var3;
                ezVar = vwVar;
            } else {
                ezVar = this.G0;
                c0Var = this.E0;
                view = this.B0;
                vl0Var = vl0Var2;
            }
            if (ezVar != null) {
                dz dzVar = ezVar.r;
                ezVar.d.setText("");
                if (dzVar != null) {
                    dzVar.E1(null);
                    dzVar.C1();
                }
                int i12 = this.b1;
                if (i11 == currentItem && z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.M0 = animatorSet2;
                    Property property = View.TRANSLATION_Y;
                    if (view == null || i11 == 1) {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(vl0Var, (Property<vl0, Float>) property, AndroidUtilities.dp(36.0f) - i12));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofFloat(vl0Var, (Property<vl0, Float>) property, AndroidUtilities.dp(36.0f)), ObjectAnimator.ofFloat(ezVar, (Property<ez, Float>) property, AndroidUtilities.dp(36.0f)));
                    }
                    this.M0.setDuration(200L);
                    this.M0.setInterpolator(wr.h);
                    this.M0.addListener(new org.telegram.ui.ActionBar.l1(this, c0Var, vl0Var, 4));
                    this.M0.start();
                } else {
                    if (ezVar != vwVar) {
                        ezVar.setTranslationY(AndroidUtilities.dp(36.0f) - i12);
                    }
                    if (view != null && i11 != 2) {
                        view.setTranslationY(0.0f);
                    }
                    if (vl0Var == vl0Var2) {
                        i10 = 0;
                        vl0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + this.q2);
                    } else {
                        i10 = 0;
                        if (vl0Var == vl0Var3) {
                            vl0Var.setPadding(0, AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(44.0f) + this.q2);
                        } else {
                            if (vl0Var == vl0Var4) {
                                vl0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + this.q2);
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

    public void setBlurredBackgroundDrawableFactory(zg.a aVar) {
        org.telegram.ui.ActionBar.f6 f6Var = this.Z1;
        fx fxVar = this.x;
        if (fxVar != null) {
            bh.d c10 = aVar.c(fxVar, null, false);
            c10.n(dh.c.d(f6Var));
            c10.p(AndroidUtilities.dp(18.0f));
            c10.o(AndroidUtilities.dp(6.0f));
            fxVar.setBackground(c10);
        }
        ImageView imageView = this.E;
        if (imageView != null) {
            bh.d c11 = aVar.c(imageView, null, false);
            c11.n(dh.c.d(f6Var));
            c11.p(AndroidUtilities.dp(18.0f));
            c11.o(AndroidUtilities.dp(6.0f));
            imageView.setBackground(c11);
        }
        nd0 nd0Var = this.w;
        if (nd0Var != null) {
            bh.d c12 = aVar.c(nd0Var, null, false);
            c12.n(dh.c.d(f6Var));
            c12.p(AndroidUtilities.dp(18.0f));
            c12.o(AndroidUtilities.dp(6.0f));
            nd0Var.setBackground(c12);
        }
        ImageView imageView2 = this.y;
        if (imageView2 != null) {
            bh.d c13 = aVar.c(imageView2, null, false);
            c13.n(dh.c.d(f6Var));
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

    public void setDelegate(sy syVar) {
        this.t1 = syVar;
    }

    public void setDragListener(vx vxVar) {
        this.O0 = vxVar;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        bx bxVar = this.G0;
        if (bxVar != null) {
            bxVar.d.setEnabled(z10);
        }
        vw vwVar = this.o0;
        if (vwVar != null) {
            vwVar.d.setEnabled(z10);
        }
        pw pwVar = this.V;
        if (pwVar != null) {
            pwVar.d.setEnabled(z10);
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
                    F();
                }
                k(true);
                k(false);
                MediaDataController.getInstance(i11).loadRecents(0, true, true, false);
                MediaDataController.getInstance(i11).loadRecents(0, false, true, false);
                MediaDataController.getInstance(i11).loadRecents(2, false, true, false);
            }
            fg.h1 h1Var = this.T0;
            if (h1Var != null) {
                h1Var.a();
            }
        }
    }

    public final void t(boolean z10) {
        s(-1L, z10);
    }

    public final void u(boolean z10) {
        iz izVar;
        boolean z11 = this.N2;
        this.N2 = z10;
        if (!z11 || z10) {
            return;
        }
        int i10 = this.A1;
        if (i10 == 0) {
            yx yxVar = this.R;
            if (yxVar != null) {
                yxVar.F(false);
                return;
            }
            return;
        }
        if (i10 == 1) {
            wy wyVar = this.n0;
            if (wyVar != null) {
                wyVar.l();
                return;
            }
            return;
        }
        if (i10 != 2 || (izVar = this.y0) == null) {
            return;
        }
        izVar.l();
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
        throw new IllegalArgumentException(hc.b.j(i10, "Unexpected argument: "));
    }

    public final vl0 x(int i10) {
        if (i10 == 0) {
            return this.D0;
        }
        if (i10 == 1) {
            return this.P;
        }
        if (i10 == 2) {
            return this.h0;
        }
        throw new IllegalArgumentException(hc.b.j(i10, "Unexpected argument: "));
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
        throw new IllegalArgumentException(hc.b.j(i10, "Unexpected argument: "));
    }

    public final int z(int i10) {
        org.telegram.ui.ActionBar.f6 f6Var = this.Z1;
        return f6Var != null ? f6Var.F0(i10) : org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    @Override // le.d
    public final void B(float f7, int i10) {
    }
}
