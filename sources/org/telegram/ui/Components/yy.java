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
import org.telegram.ui.ra1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class yy extends FrameLayout implements ud.b, NotificationCenter.NotificationCenterDelegate, yg.a {
    public static final /* synthetic */ int K2 = 0;
    public final ImageView A;
    public final fw A0;
    public int A1;
    public int A2;
    public AnimatorSet B;
    public wy B0;
    public int B1;
    public long B2;
    public AnimatorSet C;
    public final hw C0;
    public int C1;
    public final ud.a C2;
    public float D;
    public final wg.d D0;
    public int D1;
    public ArrayList D2;
    public final uv E;
    public boolean E0;
    public int E1;
    public boolean E2;
    public final vw F;
    public boolean F0;
    public TLRPC.ChatFull F1;
    public AnimatorSet F2;
    public final vf.g G;
    public boolean G0;
    public boolean G1;
    public org.telegram.messenger.video.k G2;
    public final wg.b H;
    public final qx H0;
    public int H1;
    public final nv H2;
    public final vf.g I;
    public AnimatorSet I0;
    public final gf.p0 I1;
    public boolean I2;
    public final wg.b J;
    public final cg.q J0;
    public boolean J1;
    public boolean J2;
    public final View K;
    public cx K0;
    public int K1;
    public final ww L;
    public boolean L0;
    public boolean L1;
    public final xw M;
    public final int[] M0;
    public boolean M1;
    public final gx N;
    public final ObjectAnimator[] N0;
    public gy N1;
    public final wx O;
    public boolean O0;
    public float O1;
    public wy P;
    public ow P0;
    public float P1;
    public final wg.d Q;
    public boolean Q0;
    public float Q1;
    public final vv R;
    public boolean R0;
    public float R1;
    public AnimatorSet S;
    public String[] S0;
    public float S1;
    public final c2.x T;
    public final Drawable[] T0;
    public boolean T1;
    public final c2.x U;
    public final Drawable[] U0;
    public final org.telegram.ui.ActionBar.n2 U1;
    public boolean V;
    public final Drawable[] V0;
    public final org.telegram.ui.ActionBar.c6 V1;
    public final boolean W;
    public final String[] W0;
    public final org.telegram.ui.ActionBar.r5 W1;
    public final int X0;
    public final org.telegram.ui.ActionBar.r5 X1;
    public final int Y0;
    public final boolean Y1;
    public final ArrayList Z0;
    public LongSparseArray Z1;
    public final ud.a a;
    public boolean a0;
    public int a1;
    public PorterDuffColorFilter a2;
    public final ud.a b;
    public boolean b0;
    public int b1;
    public final m.i3 b2;
    public int c;
    public final xv c0;
    public boolean c1;
    public final pw c2;
    public final ArrayList d;
    public final yv d0;
    public TLRPC.TL_messages_stickerSet d1;
    public boolean d2;
    public final ArrayList e;
    public final dy e0;
    public ArrayList e1;
    public final boolean e2;
    public boolean f;
    public final cy f0;
    public ArrayList f1;
    public final jg.e f2;
    public final fy g0;
    public ArrayList g1;
    public final wg g2;
    public final kw h;
    public final HashMap h0;
    public ArrayList h1;
    public final og.d h2;
    public final sv i0;
    public final ArrayList i1;
    public final og.c i2;
    public final cy j0;
    public final ArrayList j1;
    public final jg.a j2;
    public final bw k0;
    public final ArrayList k1;
    public boolean k2;
    public final dx l0;
    public final ArrayList l1;
    public boolean l2;
    public boolean m0;
    public final ArrayList m1;
    public int m2;
    public final FrameLayout n;
    public int n0;
    public final HashMap n1;
    public float n2;
    public int o0;
    public final Paint o1;
    public View o2;
    public int p0;
    public xx p1;
    public int p2;
    public boolean q0;
    public long q1;
    public int q2;
    public final FrameLayout r;
    public boolean r0;
    public boolean r1;
    public long r2;
    public final FrameLayout s;
    public boolean s0;
    public boolean s1;
    public boolean s2;
    public final cw t0;
    public final TLRPC.StickerSetCovered[] t1;
    public boolean t2;
    public final py u0;
    public final LongSparseArray u1;
    public final Rect u2;
    public final View v;
    public final ty v0;
    public final LongSparseArray v1;
    public final RectF v2;
    public final oc0 w;
    public final sv w0;
    public int w1;
    public final ArrayList w2;
    public final lw x;
    public final iw x0;
    public final hu x1;
    public final GradientDrawable x2;
    public final ImageView y;
    public final jw y0;
    public final int y1;
    public int y2;
    public final ew z0;
    public final int[] z1;
    public ArrayList z2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11, types: [org.telegram.ui.Components.pk0, org.telegram.ui.Components.sv] */
    /* JADX WARN: Type inference failed for: r4v57, types: [org.telegram.ui.Components.pk0, org.telegram.ui.Components.sv] */
    public yy(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11, boolean z12, Context context, boolean z13, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z14, final org.telegram.ui.ActionBar.c6 c6Var, boolean z15, boolean z16) {
        super(context);
        Context context2;
        vw vwVar;
        nv nvVar;
        boolean z17;
        Field field;
        er erVar = er.h;
        this.a = new ud.a(0, this, erVar, 320L, false);
        this.b = new ud.a(1, this, erVar, 320L, false);
        this.c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = new ArrayList();
        this.V = true;
        this.g0 = new fy(this);
        this.h0 = new HashMap();
        this.m0 = true;
        this.n0 = -2;
        this.o0 = -2;
        this.p0 = -2;
        this.q0 = true;
        this.s0 = true;
        this.E0 = true;
        this.M0 = new int[3];
        this.N0 = new ObjectAnimator[3];
        int i10 = UserConfig.selectedAccount;
        this.Y0 = i10;
        this.Z0 = new ArrayList();
        this.e1 = new ArrayList();
        this.f1 = new ArrayList();
        this.g1 = new ArrayList();
        this.h1 = new ArrayList();
        this.i1 = new ArrayList();
        this.j1 = new ArrayList();
        new ArrayList();
        this.k1 = new ArrayList();
        this.l1 = new ArrayList();
        this.m1 = new ArrayList();
        this.n1 = new HashMap();
        this.t1 = new TLRPC.StickerSetCovered[10];
        this.u1 = new LongSparseArray();
        this.v1 = new LongSparseArray();
        this.z1 = new int[2];
        this.B1 = -2;
        this.C1 = -2;
        this.D1 = -2;
        this.E1 = -2;
        this.H1 = -1;
        this.b2 = new m.i3(this, 18);
        this.c2 = new pw(this);
        this.d2 = true;
        this.n2 = -1.0f;
        this.p2 = -1;
        this.q2 = -1;
        this.r2 = -1L;
        this.s2 = false;
        this.t2 = true;
        this.u2 = new Rect();
        RectF rectF = new RectF();
        this.v2 = rectF;
        ArrayList arrayList2 = new ArrayList(1);
        this.w2 = arrayList2;
        arrayList2.add(rectF);
        new Paint(1);
        this.x2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.C2 = new ud.a(0, new qv(this, 1), erVar, 380L, true);
        this.H2 = new nv(this, 2);
        this.I2 = false;
        this.q0 = z14;
        this.U1 = n2Var;
        this.Y1 = z10;
        this.V1 = c6Var;
        this.e2 = z16;
        og.c cVar = new og.c();
        this.i2 = cVar;
        cVar.a(B(org.telegram.ui.ActionBar.g6.d6));
        if (z15) {
            v(true);
        }
        i0.b.k(B(org.telegram.ui.ActionBar.g6.Wk), 30);
        int dp = AndroidUtilities.dp(50.0f);
        this.X0 = dp;
        this.W = z13;
        this.T0 = new Drawable[]{org.telegram.ui.ActionBar.g6.U(context, R.drawable.smiles_tab_smiles, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.g6.Re), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.g6.Oe)), org.telegram.ui.ActionBar.g6.U(context, R.drawable.smiles_tab_gif, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.g6.Re), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.g6.Oe)), org.telegram.ui.ActionBar.g6.U(context, R.drawable.smiles_tab_stickers, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.g6.Re), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.g6.Oe))};
        org.telegram.ui.ActionBar.r5 U = org.telegram.ui.ActionBar.g6.U(context, R.drawable.msg_emoji_recent, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.g6.Me), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.g6.Oe));
        org.telegram.ui.ActionBar.r5 U2 = org.telegram.ui.ActionBar.g6.U(context, R.drawable.emoji_tabs_faves, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.g6.Me), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.g6.Oe));
        org.telegram.ui.ActionBar.r5 U3 = org.telegram.ui.ActionBar.g6.U(context, R.drawable.emoji_tabs_new3, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.g6.Me), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.g6.Oe));
        org.telegram.ui.ActionBar.r5 U4 = org.telegram.ui.ActionBar.g6.U(context, R.drawable.emoji_tabs_new1, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.g6.Me), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.g6.Oe));
        this.W1 = U4;
        int i11 = R.drawable.emoji_tabs_new2;
        int i12 = org.telegram.ui.ActionBar.g6.Qe;
        org.telegram.ui.ActionBar.r5 U5 = org.telegram.ui.ActionBar.g6.U(context, i11, B(i12), B(i12));
        this.X1 = U5;
        this.U0 = new Drawable[]{U, U2, U3, new LayerDrawable(new Drawable[]{U4, U5})};
        this.V0 = new Drawable[]{org.telegram.ui.ActionBar.g6.U(context, R.drawable.msg_emoji_recent, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.g6.Me), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.g6.Oe)), org.telegram.ui.ActionBar.g6.U(context, R.drawable.stickers_gifs_trending, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.g6.Me), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.g6.Oe))};
        this.W0 = new String[]{LocaleController.getString(R.string.Emoji1), LocaleController.getString(R.string.Emoji2), LocaleController.getString(R.string.Emoji3), LocaleController.getString(R.string.Emoji4), LocaleController.getString(R.string.Emoji5), LocaleController.getString(R.string.Emoji6), LocaleController.getString(R.string.Emoji7), LocaleController.getString(R.string.Emoji8)};
        this.F1 = chatFull;
        Paint paint = new Paint(1);
        this.o1 = paint;
        paint.setColor(B(org.telegram.ui.ActionBar.g6.af));
        float dp2 = AndroidUtilities.dp(6.0f);
        cg.l1 l1Var = gf.r0.a;
        this.I1 = new gf.p0(dp2);
        vw vwVar2 = new vw(this, context);
        this.F = vwVar2;
        uy uyVar = new uy();
        uyVar.a = 0;
        uyVar.b = vwVar2;
        arrayList.add(uyVar);
        if (z10) {
            MediaDataController.getInstance(i10).checkStickers(5);
            MediaDataController.getInstance(i10).checkFeaturedEmoji();
            this.a2 = new PorterDuffColorFilter(B(org.telegram.ui.ActionBar.g6.Oh), PorterDuff.Mode.SRC_IN);
        }
        ww wwVar = new ww(this, context);
        this.L = wwVar;
        f2.l lVar = new f2.l();
        lVar.c = 220L;
        lVar.e = 220L;
        lVar.f = 160L;
        lVar.g = 160L;
        lVar.i = er.g;
        wwVar.setItemAnimator(lVar);
        final int i13 = 0;
        wwVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.pv
            public final /* synthetic */ yy b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (i13) {
                    case 0:
                        org.telegram.ui.kt q6 = org.telegram.ui.kt.q();
                        yy yyVar = this.b;
                        ww wwVar2 = yyVar.L;
                        yyVar.getMeasuredHeight();
                        return q6.s(motionEvent, wwVar2, null, yyVar.c2, c6Var);
                    case 1:
                        org.telegram.ui.kt q9 = org.telegram.ui.kt.q();
                        yy yyVar2 = this.b;
                        return q9.s(motionEvent, yyVar2.d0, yyVar2.i0, yyVar2.c2, c6Var);
                    default:
                        org.telegram.ui.kt q10 = org.telegram.ui.kt.q();
                        yy yyVar3 = this.b;
                        ew ewVar = yyVar3.z0;
                        yyVar3.getMeasuredHeight();
                        return q10.s(motionEvent, ewVar, yyVar3.w0, yyVar3.c2, c6Var);
                }
            }
        });
        wwVar.setOnItemLongClickListener(new qv(this, i13));
        wwVar.setInstantClick(true);
        xw xwVar = new xw(this);
        this.M = xwVar;
        wwVar.setLayoutManager(xwVar);
        wwVar.setTopGlowOffset(AndroidUtilities.dp(38.0f));
        wwVar.setBottomGlowOffset(AndroidUtilities.dp(36.0f));
        wwVar.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f));
        int i14 = org.telegram.ui.ActionBar.g6.He;
        wwVar.setGlowColor(B(i14));
        wwVar.setItemSelectorColorProvider(new c2(21));
        wwVar.setClipToPadding(false);
        xwVar.O = new yw(this);
        gx gxVar = new gx(this);
        this.N = gxVar;
        wwVar.setAdapter(gxVar);
        wwVar.i(new cg.h2(this, 4));
        this.O = new wx(this, context);
        vwVar2.addView(wwVar, h7.z5.c(-1.0f, -1));
        c2.x xVar = new c2.x(wwVar, xwVar);
        this.U = xVar;
        xVar.i = new zw(this);
        wwVar.setOnScrollListener(new ax(this));
        if (n2Var != null) {
            nvVar = new nv(this, 5);
            context2 = context;
            vwVar = vwVar2;
        } else {
            context2 = context;
            vwVar = vwVar2;
            nvVar = null;
        }
        uv uvVar = new uv(this, context2, c6Var, z10, nvVar, z16);
        this.E = uvVar;
        if (z13) {
            vv vvVar = new vv(this, context2);
            this.R = vvVar;
            vwVar.addView(vvVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
            vvVar.d.setOnFocusChangeListener(new wv(this));
            wg.d dVar = new wg.d(context2, c6Var);
            this.Q = dVar;
            dVar.setVisibility(8);
            final int i15 = 0;
            dVar.setOnBackClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rv
                public final /* synthetic */ yy b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i15) {
                        case 0:
                            wx wxVar = this.b.O;
                            rx rxVar = wxVar.c;
                            int childCount = rxVar.getChildCount();
                            for (int i16 = 0; i16 < childCount; i16++) {
                                ((wg.c) rxVar.getChildAt(i16)).a(false, true);
                            }
                            wxVar.d = 0L;
                            wxVar.B.b.a(false, true);
                            wxVar.l();
                            break;
                        case 1:
                            ty tyVar = this.b.v0;
                            sy syVar = tyVar.c;
                            int childCount2 = syVar.getChildCount();
                            for (int i17 = 0; i17 < childCount2; i17++) {
                                ((wg.c) syVar.getChildAt(i17)).a(false, true);
                            }
                            tyVar.d = 0L;
                            tyVar.M.a.a(false, true);
                            tyVar.l();
                            break;
                        case 2:
                            xx xxVar = this.b.p1;
                            if (xxVar != null) {
                                xxVar.w();
                                break;
                            }
                            break;
                        default:
                            yy yyVar = this.b;
                            int currentItem = yyVar.h.getCurrentItem();
                            ky kyVar = currentItem == 0 ? yyVar.R : currentItem == 1 ? yyVar.k0 : yyVar.C0;
                            if (kyVar != null) {
                                wp wpVar = kyVar.d;
                                wpVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                wpVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                wpVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
            vwVar.addView(dVar, new FrameLayout.LayoutParams(-1, dp));
        }
        int B = B(i14);
        if (Color.alpha(B) >= 255) {
            uvVar.setBackgroundColor(B);
        }
        gxVar.G(true);
        uvVar.p(getEmojipacks());
        vwVar.addView(uvVar, h7.z5.c(36.0f, -1));
        View view = new View(context2);
        this.K = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i16 = org.telegram.ui.ActionBar.g6.Ke;
        view.setBackgroundColor(B(i16));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(36.0f);
        vwVar.addView(view, layoutParams);
        wg.b bVar = new wg.b(context2, c6Var);
        this.H = bVar;
        vf.g gVar = new vf.g(context2, c6Var);
        this.G = gVar;
        gVar.setVisibility(8);
        gVar.addView(bVar, h7.z5.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
        vwVar.addView(gVar, h7.z5.e(-1, -2, 80));
        if (z11) {
            ul0 ul0Var = ul0.b;
            if (z12) {
                xv xvVar = new xv(this, context2);
                this.c0 = xvVar;
                uy uyVar2 = new uy();
                uyVar2.a = 1;
                uyVar2.b = xvVar;
                this.d.add(uyVar2);
                yv yvVar = new yv(this, context2);
                this.d0 = yvVar;
                yvVar.setClipToPadding(false);
                dy dyVar = new dy(this);
                this.e0 = dyVar;
                yvVar.setLayoutManager(dyVar);
                yvVar.i(new zv(this));
                yvVar.setPadding(0, dp, 0, AndroidUtilities.dp(44.0f) + this.m2);
                yvVar.setOverScrollMode(2);
                ((f2.r1) yvVar.getItemAnimator()).m = false;
                cy cyVar = new cy(this, context2, true, ConnectionsManager.DEFAULT_DATACENTER_ID);
                this.j0 = cyVar;
                yvVar.setAdapter(cyVar);
                this.f0 = new cy(this, context2, false, 0);
                yvVar.setOnScrollListener(new aw(this));
                final int i17 = 1;
                yvVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.pv
                    public final /* synthetic */ yy b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (i17) {
                            case 0:
                                org.telegram.ui.kt q6 = org.telegram.ui.kt.q();
                                yy yyVar = this.b;
                                ww wwVar2 = yyVar.L;
                                yyVar.getMeasuredHeight();
                                return q6.s(motionEvent, wwVar2, null, yyVar.c2, c6Var);
                            case 1:
                                org.telegram.ui.kt q9 = org.telegram.ui.kt.q();
                                yy yyVar2 = this.b;
                                return q9.s(motionEvent, yyVar2.d0, yyVar2.i0, yyVar2.c2, c6Var);
                            default:
                                org.telegram.ui.kt q10 = org.telegram.ui.kt.q();
                                yy yyVar3 = this.b;
                                ew ewVar = yyVar3.z0;
                                yyVar3.getMeasuredHeight();
                                return q10.s(motionEvent, ewVar, yyVar3.w0, yyVar3.c2, c6Var);
                        }
                    }
                });
                final int i18 = 0;
                ?? r11 = new pk0(this) { // from class: org.telegram.ui.Components.sv
                    public final /* synthetic */ yy b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.ui.Components.pk0
                    public final void a(int i19, View view2) {
                        switch (i18) {
                            case 0:
                                yy yyVar = this.b;
                                yv yvVar2 = yyVar.d0;
                                cy cyVar2 = yyVar.f0;
                                cy cyVar3 = yyVar.j0;
                                if (yyVar.p1 != null) {
                                    cyVar3.getClass();
                                    ArrayList arrayList3 = cyVar3.x;
                                    if (yvVar2.getAdapter() != cyVar3) {
                                        if (yvVar2.getAdapter() == cyVar2 && i19 >= 0 && i19 < cyVar2.x.size()) {
                                            yyVar.p1.v(view2, cyVar2.x.get(i19), cyVar2.w, cyVar2.n, true, 0, 0);
                                            yyVar.Y();
                                            break;
                                        }
                                    } else if (i19 >= 0) {
                                        int i20 = cyVar3.D;
                                        if (i19 >= i20) {
                                            int i21 = i20 > 0 ? (i19 - i20) - 1 : i19;
                                            if (i21 >= 0 && i21 < arrayList3.size()) {
                                                yyVar.p1.v(view2, arrayList3.get(i21), null, cyVar3.n, true, 0, 0);
                                                break;
                                            }
                                        } else {
                                            yyVar.p1.v(view2, yyVar.e1.get(i19), null, "gif", true, 0, 0);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                yy yyVar2 = this.b;
                                f2.q0 adapter = yyVar2.z0.getAdapter();
                                ty tyVar = yyVar2.v0;
                                String str = adapter == tyVar ? tyVar.J : null;
                                if (view2 instanceof org.telegram.ui.Cells.a8) {
                                    org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) view2;
                                    if (a8Var.getSticker() != null && MessageObject.isPremiumSticker(a8Var.getSticker()) && !AccountInstance.getInstance(yyVar2.Y0).getUserConfig().isPremium()) {
                                        org.telegram.ui.kt.q().y(a8Var);
                                        break;
                                    } else {
                                        org.telegram.ui.kt.q().u();
                                        if (!a8Var.r) {
                                            a8Var.r = true;
                                            a8Var.n = 0.5f;
                                            a8Var.x = 0L;
                                            org.telegram.ui.Cells.z7 z7Var = a8Var.a;
                                            z7Var.setAlpha(0.5f * a8Var.D);
                                            z7Var.invalidate();
                                            a8Var.s = System.currentTimeMillis();
                                            a8Var.invalidate();
                                            yyVar2.p1.m(a8Var, a8Var.getSticker(), str, a8Var.getParentObject(), a8Var.getSendAnimationData(), true, 0);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                };
                this.i0 = r11;
                yvVar.setOnItemClickListener((pk0) r11);
                xvVar.addView(yvVar, h7.z5.c(-1.0f, -1));
                bw bwVar = new bw(this, context2);
                this.k0 = bwVar;
                xvVar.addView(bwVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
                dx dxVar = new dx(this, context2, c6Var);
                this.l0 = dxVar;
                dxVar.setType(ul0Var);
                dxVar.setUnderlineHeight(AndroidUtilities.getShadowHeight());
                dxVar.setIndicatorColor(B(i12));
                dxVar.setUnderlineColor(B(i16));
                dxVar.setBackgroundColor(B(i14));
                X();
                dxVar.setDelegate(new qv(this, 2));
                cyVar.F("", "", true, true, true);
            }
            cw cwVar = new cw(this, context2, z14);
            this.t0 = cwVar;
            MediaDataController.getInstance(this.Y0).checkStickers(0);
            MediaDataController.getInstance(this.Y0).checkFeaturedStickers();
            ew ewVar = new ew(this, context2);
            this.z0 = ewVar;
            fw fwVar = new fw(this);
            this.A0 = fwVar;
            ewVar.setLayoutManager(fwVar);
            fwVar.O = new gw(this);
            ewVar.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f));
            ewVar.setClipToPadding(false);
            uy uyVar3 = new uy();
            uyVar3.a = 2;
            uyVar3.b = cwVar;
            this.d.add(uyVar3);
            this.v0 = new ty(this, context2);
            py pyVar = new py(this, context2);
            this.u0 = pyVar;
            ewVar.setAdapter(pyVar);
            final int i19 = 2;
            ewVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.pv
                public final /* synthetic */ yy b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (i19) {
                        case 0:
                            org.telegram.ui.kt q6 = org.telegram.ui.kt.q();
                            yy yyVar = this.b;
                            ww wwVar2 = yyVar.L;
                            yyVar.getMeasuredHeight();
                            return q6.s(motionEvent, wwVar2, null, yyVar.c2, c6Var);
                        case 1:
                            org.telegram.ui.kt q9 = org.telegram.ui.kt.q();
                            yy yyVar2 = this.b;
                            return q9.s(motionEvent, yyVar2.d0, yyVar2.i0, yyVar2.c2, c6Var);
                        default:
                            org.telegram.ui.kt q10 = org.telegram.ui.kt.q();
                            yy yyVar3 = this.b;
                            ew ewVar2 = yyVar3.z0;
                            yyVar3.getMeasuredHeight();
                            return q10.s(motionEvent, ewVar2, yyVar3.w0, yyVar3.c2, c6Var);
                    }
                }
            });
            final int i20 = 1;
            ?? r42 = new pk0(this) { // from class: org.telegram.ui.Components.sv
                public final /* synthetic */ yy b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.Components.pk0
                public final void a(int i192, View view2) {
                    switch (i20) {
                        case 0:
                            yy yyVar = this.b;
                            yv yvVar2 = yyVar.d0;
                            cy cyVar2 = yyVar.f0;
                            cy cyVar3 = yyVar.j0;
                            if (yyVar.p1 != null) {
                                cyVar3.getClass();
                                ArrayList arrayList3 = cyVar3.x;
                                if (yvVar2.getAdapter() != cyVar3) {
                                    if (yvVar2.getAdapter() == cyVar2 && i192 >= 0 && i192 < cyVar2.x.size()) {
                                        yyVar.p1.v(view2, cyVar2.x.get(i192), cyVar2.w, cyVar2.n, true, 0, 0);
                                        yyVar.Y();
                                        break;
                                    }
                                } else if (i192 >= 0) {
                                    int i202 = cyVar3.D;
                                    if (i192 >= i202) {
                                        int i21 = i202 > 0 ? (i192 - i202) - 1 : i192;
                                        if (i21 >= 0 && i21 < arrayList3.size()) {
                                            yyVar.p1.v(view2, arrayList3.get(i21), null, cyVar3.n, true, 0, 0);
                                            break;
                                        }
                                    } else {
                                        yyVar.p1.v(view2, yyVar.e1.get(i192), null, "gif", true, 0, 0);
                                        break;
                                    }
                                }
                            }
                            break;
                        default:
                            yy yyVar2 = this.b;
                            f2.q0 adapter = yyVar2.z0.getAdapter();
                            ty tyVar = yyVar2.v0;
                            String str = adapter == tyVar ? tyVar.J : null;
                            if (view2 instanceof org.telegram.ui.Cells.a8) {
                                org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) view2;
                                if (a8Var.getSticker() != null && MessageObject.isPremiumSticker(a8Var.getSticker()) && !AccountInstance.getInstance(yyVar2.Y0).getUserConfig().isPremium()) {
                                    org.telegram.ui.kt.q().y(a8Var);
                                    break;
                                } else {
                                    org.telegram.ui.kt.q().u();
                                    if (!a8Var.r) {
                                        a8Var.r = true;
                                        a8Var.n = 0.5f;
                                        a8Var.x = 0L;
                                        org.telegram.ui.Cells.z7 z7Var = a8Var.a;
                                        z7Var.setAlpha(0.5f * a8Var.D);
                                        z7Var.invalidate();
                                        a8Var.s = System.currentTimeMillis();
                                        a8Var.invalidate();
                                        yyVar2.p1.m(a8Var, a8Var.getSticker(), str, a8Var.getParentObject(), a8Var.getSendAnimationData(), true, 0);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            };
            this.w0 = r42;
            ewVar.setOnItemClickListener((pk0) r42);
            ewVar.setGlowColor(B(i14));
            cwVar.addView(ewVar);
            this.T = new c2.x(ewVar, fwVar);
            hw hwVar = new hw(this, context2);
            this.C0 = hwVar;
            cwVar.addView(hwVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
            wg.d dVar2 = new wg.d(context2, c6Var);
            this.D0 = dVar2;
            dVar2.setVisibility(8);
            final int i21 = 1;
            dVar2.setOnBackClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rv
                public final /* synthetic */ yy b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i21) {
                        case 0:
                            wx wxVar = this.b.O;
                            rx rxVar = wxVar.c;
                            int childCount = rxVar.getChildCount();
                            for (int i162 = 0; i162 < childCount; i162++) {
                                ((wg.c) rxVar.getChildAt(i162)).a(false, true);
                            }
                            wxVar.d = 0L;
                            wxVar.B.b.a(false, true);
                            wxVar.l();
                            break;
                        case 1:
                            ty tyVar = this.b.v0;
                            sy syVar = tyVar.c;
                            int childCount2 = syVar.getChildCount();
                            for (int i172 = 0; i172 < childCount2; i172++) {
                                ((wg.c) syVar.getChildAt(i172)).a(false, true);
                            }
                            tyVar.d = 0L;
                            tyVar.M.a.a(false, true);
                            tyVar.l();
                            break;
                        case 2:
                            xx xxVar = this.b.p1;
                            if (xxVar != null) {
                                xxVar.w();
                                break;
                            }
                            break;
                        default:
                            yy yyVar = this.b;
                            int currentItem = yyVar.h.getCurrentItem();
                            ky kyVar = currentItem == 0 ? yyVar.R : currentItem == 1 ? yyVar.k0 : yyVar.C0;
                            if (kyVar != null) {
                                wp wpVar = kyVar.d;
                                wpVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                wpVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                wpVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
            cwVar.addView(dVar2, new FrameLayout.LayoutParams(-1, dp));
            z17 = z14;
            iw iwVar = new iw(this, context2, c6Var, n2Var, z17);
            this.x0 = iwVar;
            iwVar.setDragEnabled(true);
            iwVar.setWillNotDraw(false);
            iwVar.setType(ul0Var);
            iwVar.setUnderlineHeight(ewVar.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
            iwVar.setIndicatorColor(B(i12));
            iwVar.setUnderlineColor(B(i16));
            if (viewGroup == null || !z17) {
                cwVar.addView(iwVar, h7.z5.e(-1, 36, 51));
            } else {
                jw jwVar = new jw(this, context2);
                this.y0 = jwVar;
                jwVar.addView(iwVar, h7.z5.e(-1, 36, 51));
                viewGroup.addView(jwVar, h7.z5.c(-2.0f, -1));
            }
            Z(true);
            iwVar.setDelegate(new qv(this, 3));
            ewVar.setOnScrollListener(new xy(this, 0));
            wg.b bVar2 = new wg.b(context2, c6Var);
            this.J = bVar2;
            vf.g gVar2 = new vf.g(context2, c6Var);
            this.I = gVar2;
            gVar2.setVisibility(8);
            gVar2.addView(bVar2, h7.z5.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
            cwVar.addView(gVar2, h7.z5.e(-1, -2, 80));
        } else {
            z17 = z14;
        }
        this.e.clear();
        this.e.addAll(this.d);
        kw kwVar = new kw(this, context2);
        this.h = kwVar;
        qx qxVar = new qx(this);
        this.H0 = qxVar;
        kwVar.setAdapter(qxVar);
        lw lwVar = new lw(this, context2);
        this.x = lwVar;
        lwVar.setHapticFeedbackEnabled(true);
        lwVar.setImageResource(R.drawable.smiles_tab_clear);
        int w10 = z16 ? w(0.6f) : B(org.telegram.ui.ActionBar.g6.Re);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        lwVar.setColorFilter(new PorterDuffColorFilter(w10, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        lwVar.setScaleType(scaleType);
        lwVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        lwVar.setFocusable(true);
        lwVar.setOnClickListener(new mw());
        h7.b6.a(lwVar);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.r = frameLayout;
        if (z13) {
            addView(frameLayout, h7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, (AndroidUtilities.getShadowHeight() / AndroidUtilities.density) + 40.0f));
        } else {
            addView(frameLayout, h7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.s = frameLayout2;
        addView(frameLayout2, h7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.n = frameLayout3;
        View view2 = new View(context2);
        this.v = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(40.0f), 83));
        if (z13) {
            addView(frameLayout3, h7.z5.e(-1, 48, 80));
            frameLayout3.addView(lwVar, h7.z5.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
            if (z11) {
                ImageView imageView = new ImageView(context2);
                this.y = imageView;
                imageView.setImageResource(R.drawable.smiles_tab_settings);
                imageView.setColorFilter(new PorterDuffColorFilter(z16 ? w(0.6f) : B(org.telegram.ui.ActionBar.g6.Re), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(LocaleController.getString(R.string.Settings));
                h7.b6.a(imageView);
                frameLayout3.addView(imageView, h7.z5.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
                final int i22 = 2;
                imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rv
                    public final /* synthetic */ yy b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i22) {
                            case 0:
                                wx wxVar = this.b.O;
                                rx rxVar = wxVar.c;
                                int childCount = rxVar.getChildCount();
                                for (int i162 = 0; i162 < childCount; i162++) {
                                    ((wg.c) rxVar.getChildAt(i162)).a(false, true);
                                }
                                wxVar.d = 0L;
                                wxVar.B.b.a(false, true);
                                wxVar.l();
                                break;
                            case 1:
                                ty tyVar = this.b.v0;
                                sy syVar = tyVar.c;
                                int childCount2 = syVar.getChildCount();
                                for (int i172 = 0; i172 < childCount2; i172++) {
                                    ((wg.c) syVar.getChildAt(i172)).a(false, true);
                                }
                                tyVar.d = 0L;
                                tyVar.M.a.a(false, true);
                                tyVar.l();
                                break;
                            case 2:
                                xx xxVar = this.b.p1;
                                if (xxVar != null) {
                                    xxVar.w();
                                    break;
                                }
                                break;
                            default:
                                yy yyVar = this.b;
                                int currentItem = yyVar.h.getCurrentItem();
                                ky kyVar = currentItem == 0 ? yyVar.R : currentItem == 1 ? yyVar.k0 : yyVar.C0;
                                if (kyVar != null) {
                                    wp wpVar = kyVar.d;
                                    wpVar.requestFocus();
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                    wpVar.onTouchEvent(obtain);
                                    obtain.recycle();
                                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                    wpVar.onTouchEvent(obtain2);
                                    obtain2.recycle();
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
            oc0 oc0Var = new oc0(context2, c6Var);
            this.w = oc0Var;
            oc0Var.setViewPager(kwVar);
            oc0Var.setShouldExpand(false);
            oc0Var.setIndicatorHeight(AndroidUtilities.dp(3.0f));
            oc0Var.setIndicatorColor(i0.b.k(B(org.telegram.ui.ActionBar.g6.Oe), 20));
            oc0Var.setUnderlineHeight(0);
            oc0Var.setTabPaddingLeftRight(AndroidUtilities.dp(11.0f));
            oc0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
            frameLayout3.addView(oc0Var, h7.z5.e(-2, 48, 81));
            oc0Var.setOnPageChangeListener(new nw(this, z17));
            ImageView imageView2 = new ImageView(context2);
            this.A = imageView2;
            imageView2.setImageResource(R.drawable.smiles_tab_search);
            imageView2.setColorFilter(new PorterDuffColorFilter(z16 ? w(0.6f) : B(org.telegram.ui.ActionBar.g6.Re), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(LocaleController.getString(R.string.Search));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, h7.z5.d(48, 48.0f, 83, 2.0f, 0.0f, 2.0f, 0.0f));
            final int i23 = 3;
            imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rv
                public final /* synthetic */ yy b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view22) {
                    switch (i23) {
                        case 0:
                            wx wxVar = this.b.O;
                            rx rxVar = wxVar.c;
                            int childCount = rxVar.getChildCount();
                            for (int i162 = 0; i162 < childCount; i162++) {
                                ((wg.c) rxVar.getChildAt(i162)).a(false, true);
                            }
                            wxVar.d = 0L;
                            wxVar.B.b.a(false, true);
                            wxVar.l();
                            break;
                        case 1:
                            ty tyVar = this.b.v0;
                            sy syVar = tyVar.c;
                            int childCount2 = syVar.getChildCount();
                            for (int i172 = 0; i172 < childCount2; i172++) {
                                ((wg.c) syVar.getChildAt(i172)).a(false, true);
                            }
                            tyVar.d = 0L;
                            tyVar.M.a.a(false, true);
                            tyVar.l();
                            break;
                        case 2:
                            xx xxVar = this.b.p1;
                            if (xxVar != null) {
                                xxVar.w();
                                break;
                            }
                            break;
                        default:
                            yy yyVar = this.b;
                            int currentItem = yyVar.h.getCurrentItem();
                            ky kyVar = currentItem == 0 ? yyVar.R : currentItem == 1 ? yyVar.k0 : yyVar.C0;
                            if (kyVar != null) {
                                wp wpVar = kyVar.d;
                                wpVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                wpVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                wpVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            addView(frameLayout3, h7.z5.d(56, 48.0f, (LocaleController.isRTL ? 3 : 5) | 80, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(56.0f), B(i14), B(i14));
            h7.b6.a(lwVar);
            lwVar.setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
            lwVar.setBackground(h02);
            lwVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
            lwVar.setFocusable(true);
            frameLayout3.addView(lwVar, h7.z5.d(48, 48.0f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
            view2.setVisibility(8);
        }
        addView(kwVar, 0, h7.z5.e(-1, -1, 51));
        cg.q qVar = new cg.q(context2, 23);
        this.J0 = qVar;
        qVar.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(6.0f), B(org.telegram.ui.ActionBar.g6.qf)));
        qVar.setTextColor(B(org.telegram.ui.ActionBar.g6.pf));
        qVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f));
        qVar.setGravity(16);
        qVar.setTextSize(1, 14.0f);
        qVar.setVisibility(4);
        addView(qVar, h7.z5.d(-2, -2.0f, 81, 5.0f, 0.0f, 5.0f, 53.0f));
        this.y1 = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 32.0f);
        Field field2 = hu.f;
        hu huVar = new hu(new gu(context2, c6Var));
        if (hu.f == null) {
            try {
                field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    field.setAccessible(true);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                field = null;
            }
            hu.f = field;
        }
        Field field3 = hu.f;
        if (field3 != null) {
            try {
                huVar.a = (ViewTreeObserver.OnScrollChangedListener) field3.get(huVar);
                hu.f.set(huVar, hu.g);
            } catch (Exception unused3) {
                huVar.a = null;
            }
        }
        this.x1 = huVar;
        huVar.c.setOnSelectionUpdateListener(new d(this, 10));
        this.w1 = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
        Emoji.loadRecentEmoji();
        gxVar.F(false);
        K(true, z11, z12, false);
        if (Build.VERSION.SDK_INT >= 31) {
            og.d dVar3 = new og.d(null);
            this.h2 = dVar3;
            jg.a aVar = new jg.a(dVar3);
            this.j2 = aVar;
            aVar.f = LiteMode.isEnabled(262144);
            this.f2 = new jg.e(false);
        } else {
            this.h2 = null;
            this.j2 = new jg.a(this.i2);
            this.f2 = null;
        }
        qg.j jVar = new qg.j(this);
        oc0 oc0Var2 = this.w;
        if (oc0Var2 != null) {
            jVar.d(oc0Var2, this, new qv(this, 4), false);
        }
        jg.a aVar2 = this.j2;
        aVar2.d = jVar;
        aVar2.e = this;
        kg.a[] aVarArr = new kg.a[3];
        wwVar.C0(new nv(this, 1));
        aVarArr[0] = new jg.k(wwVar, this, new ov(wwVar, 0));
        yv yvVar2 = this.d0;
        if (yvVar2 != null) {
            yvVar2.C0(new nv(this, 3));
            yv yvVar3 = this.d0;
            Objects.requireNonNull(yvVar3);
            aVarArr[1] = new jg.k(yvVar3, this, new ov(yvVar3, 1));
        }
        ew ewVar2 = this.z0;
        if (ewVar2 != null) {
            ewVar2.C0(new nv(this, 4));
            aVarArr[2] = new jg.k(this.z0, this, new ov(this, 2));
        }
        this.g2 = new wg(aVarArr, 1);
        setBlurredBackgroundDrawableFactory(this.j2);
    }

    public static void b(yy yyVar, boolean z10) {
        yv yvVar = yyVar.d0;
        if (yvVar == null) {
            return;
        }
        int childCount = yvVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = yvVar.getChildAt(i10);
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

    public static void c(yy yyVar, gy gyVar, String str) {
        String str2;
        xx xxVar;
        org.telegram.ui.ActionBar.n2 n2Var = yyVar.U1;
        int i10 = yyVar.Y0;
        ArrayList arrayList = yyVar.m1;
        if (gyVar == null) {
            return;
        }
        if (gyVar.getSpan() == null) {
            yyVar.B2 = SystemClock.elapsedRealtime();
            yyVar.O(true);
            String str3 = str != null ? str : (String) gyVar.getTag();
            new SpannableStringBuilder().append((CharSequence) str3);
            if (str != null) {
                xx xxVar2 = yyVar.p1;
                if (xxVar2 != null) {
                    xxVar2.l(Emoji.fixEmoji(str));
                    return;
                }
                return;
            }
            if (!gyVar.c && (str2 = Emoji.emojiColor.get(str3)) != null) {
                str3 = g(str3, str2);
            }
            yyVar.h(str3);
            xx xxVar3 = yyVar.p1;
            if (xxVar3 != null) {
                xxVar3.l(Emoji.fixEmoji(str3));
                return;
            }
            return;
        }
        if (yyVar.p1 != null) {
            long j10 = gyVar.getSpan().documentId;
            TLRPC.Document document = gyVar.getSpan().document;
            kx kxVar = gyVar.e;
            boolean z10 = kxVar != null && kxVar.i;
            if (document == null) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    kx kxVar2 = (kx) arrayList.get(i11);
                    int i12 = 0;
                    while (true) {
                        ArrayList arrayList2 = kxVar2.c;
                        if (arrayList2 != null && i12 < arrayList2.size()) {
                            if (((TLRPC.Document) kxVar2.c.get(i12)).id == j10) {
                                document = (TLRPC.Document) kxVar2.c.get(i12);
                                break;
                            }
                            i12++;
                        }
                    }
                }
            }
            if (document == null) {
                document = k5.f(i10, j10);
            }
            String findAnimatedEmojiEmoticon = document != null ? MessageObject.findAnimatedEmojiEmoticon(document) : null;
            if (MessageObject.isFreeEmoji(document) || UserConfig.getInstance(i10).isPremium() || (((xxVar = yyVar.p1) != null && xxVar.g()) || yyVar.Q0 || z10)) {
                yyVar.B2 = SystemClock.elapsedRealtime();
                yyVar.O(true);
                yyVar.h("animated_" + j10);
                yyVar.p1.x(j10, document, findAnimatedEmojiEmoticon, gyVar.c);
                return;
            }
            yyVar.O(false);
            mc a02 = n2Var != null ? mc.a0(n2Var) : new mc(yyVar.r, yyVar.V1);
            if (yyVar.d2 || n2Var == null) {
                a02.q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new nv(yyVar, 7)).j();
            } else {
                a02.J(R.raw.saved_messages, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint2)), LocaleController.getString(R.string.Open), new nv(yyVar, 8)).j();
            }
            yyVar.d2 = !yyVar.d2;
        }
    }

    public static void e(yy yyVar, int i10, int i11) {
        f2.o1 K;
        int[] iArr = yyVar.M0;
        if (i10 == 1) {
            yyVar.n(yyVar.L, i11);
            return;
        }
        xx xxVar = yyVar.p1;
        if ((xxVar == null || !xxVar.z()) && !yyVar.F0) {
            zk0 y10 = yyVar.y(i10);
            if (i11 <= 0 || y10 == null || y10.getVisibility() != 0 || (K = y10.K(0)) == null || K.a.getTop() + yyVar.X0 < y10.getPaddingTop()) {
                int i12 = iArr[i10] - i11;
                iArr[i10] = i12;
                if (i12 > 0) {
                    iArr[i10] = 0;
                } else if (i12 < (-AndroidUtilities.dp(288.0f))) {
                    iArr[i10] = -AndroidUtilities.dp(288.0f);
                }
                if (i10 == 0) {
                    yyVar.a0();
                } else {
                    yyVar.z(i10).setTranslationY(Math.max(-AndroidUtilities.dp(48.0f), iArr[i10]));
                }
            }
        }
    }

    public static void f(yy yyVar, boolean z10) {
        int N0;
        dy dyVar = yyVar.e0;
        bw bwVar = yyVar.k0;
        yv yvVar = yyVar.d0;
        if (yvVar != null && (yvVar.getAdapter() instanceof cy)) {
            cy cyVar = (cy) yvVar.getAdapter();
            if (!cyVar.s && cyVar.h == 0 && !cyVar.x.isEmpty() && (N0 = dyVar.N0()) != -1 && N0 > dyVar.B() - 5) {
                String str = cyVar.w;
                String str2 = cyVar.r;
                boolean z11 = cyVar.v;
                cyVar.F(str, str2, true, z11, z11);
            }
        }
        xx xxVar = yyVar.p1;
        if (xxVar == null || !xxVar.z()) {
            if (bwVar == null || yvVar == null) {
                return;
            }
            bwVar.a.a(true, !z10);
            return;
        }
        f2.o1 K = yvVar.K(0);
        if (K == null) {
            ky.a(bwVar, true, !z10);
        } else {
            ky.a(bwVar, K.a.getTop() < yvVar.getPaddingTop(), !z10);
        }
    }

    public static String g(String str, String str2) {
        boolean z10;
        String str3;
        if (CompoundEmoji.isHandshake(str) != null) {
            return CompoundEmoji.applyColor(str, str2);
        }
        if (Emoji.endsWithRightArrow(str)) {
            str = com.google.android.recaptcha.internal.a.n(str, 2, 0);
            z10 = true;
        } else {
            z10 = false;
        }
        int length = str.length();
        if (length > 2 && str.charAt(str.length() - 2) == 8205) {
            str3 = str.substring(str.length() - 2);
            str = com.google.android.recaptcha.internal.a.n(str, 2, 0);
        } else if (length <= 3 || str.charAt(str.length() - 3) != 8205) {
            str3 = null;
        } else {
            str3 = str.substring(str.length() - 3);
            str = com.google.android.recaptcha.internal.a.n(str, 3, 0);
        }
        String l10 = s3.c.l(str, str2);
        if (str3 != null) {
            l10 = s3.c.l(l10, str3);
        }
        return z10 ? s3.c.l(l10, "\u200d➡") : l10;
    }

    public static void j(int i10, View view) {
        if (view == null) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i10);
    }

    public final int B(int i10) {
        org.telegram.ui.ActionBar.c6 c6Var = this.V1;
        return c6Var != null ? c6Var.N0(i10) : org.telegram.ui.ActionBar.g6.w0(null, i10, false);
    }

    public final void C() {
        hw hwVar = this.C0;
        if (hwVar != null) {
            hwVar.b();
        }
        bw bwVar = this.k0;
        if (bwVar != null) {
            bwVar.b();
        }
        vv vvVar = this.R;
        if (vvVar != null) {
            vvVar.b();
        }
    }

    public final void D() {
        jg.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.f2) == null) {
            return;
        }
        oc0 oc0Var = this.w;
        RectF rectF = this.v2;
        qg.j.c(oc0Var, this, rectF);
        rectF.inset(LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f), LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        rectF.right = getMeasuredWidth();
        rectF.bottom = Math.min(rectF.bottom, getMeasuredHeight());
        eVar.g(1, this.w2);
        eVar.e(this.g2, getWidth(), getHeight());
    }

    public final void E() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        int i10 = this.Y0;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.groupPackUpdated);
        if (this.u0 != null) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.featuredStickersDidLoad);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.groupStickersDidLoad);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        }
    }

    public final void F(boolean z10, boolean z11) {
        jy jyVar;
        if (this.w1 != 0 && this.s1) {
            this.w1 = 0;
        }
        if (this.w1 == 0 && this.r1) {
            this.w1 = 1;
        }
        int i10 = this.w1;
        kw kwVar = this.h;
        if (i10 == 0 || z10 || this.e.size() == 1) {
            N(true, false);
            S(false, false);
            if (kwVar.getCurrentItem() != 0) {
                kwVar.x(0, !z10);
            }
            if (z11) {
                AndroidUtilities.runOnUIThread(new nv(this, 9), 350L);
            }
        } else {
            int i11 = this.w1;
            if (i11 == 1) {
                N(false, false);
                S(this.q0 || this.r0, false);
                if (kwVar.getCurrentItem() != 2) {
                    kwVar.x(2, false);
                }
                iw iwVar = this.x0;
                if (iwVar != null) {
                    this.O0 = true;
                    int i12 = this.C1;
                    if (i12 >= 0) {
                        iwVar.m(i12);
                    } else {
                        int i13 = this.B1;
                        if (i13 >= 0) {
                            iwVar.m(i13);
                        } else {
                            iwVar.m(this.A1);
                        }
                    }
                    this.O0 = false;
                    this.A0.h1(0, 0);
                }
            } else if (i11 == 2) {
                N(false, false);
                S(false, false);
                if (kwVar.getCurrentItem() != 1) {
                    kwVar.x(1, false);
                }
                dx dxVar = this.l0;
                if (dxVar != null) {
                    dxVar.m(0);
                }
                bw bwVar = this.k0;
                if (bwVar != null && (jyVar = bwVar.r) != null) {
                    jyVar.F1(null);
                }
            }
        }
        O(true);
    }

    public final void G() {
        py pyVar = this.u0;
        if (pyVar != null) {
            pyVar.l();
        }
        ty tyVar = this.v0;
        if (tyVar != null) {
            tyVar.l();
        }
        if (org.telegram.ui.kt.q().E) {
            org.telegram.ui.kt.q().n();
        }
        org.telegram.ui.kt.q().u();
    }

    public final void H(int i10) {
        xx xxVar = this.p1;
        if ((xxVar == null || !xxVar.z()) && i10 != 0) {
            HorizontalScrollView z10 = z(i10);
            this.M0[i10] = 0;
            z10.setTranslationY(0);
        }
    }

    public final void I(int i10, int i11) {
        xw xwVar = this.M;
        View m10 = xwVar.m(i10);
        int L0 = xwVar.L0();
        if ((m10 == null && Math.abs(i10 - L0) > xwVar.J * 9.0f) || !SharedConfig.animationsEnabled()) {
            int i12 = xwVar.L0() < i10 ? 0 : 1;
            c2.x xVar = this.U;
            xVar.b = i12;
            xVar.d(i10, i11, false, false);
            return;
        }
        this.F0 = true;
        lh.l1 l1Var = new lh.l1(this, this.L.getContext(), 1);
        l1Var.a = i10;
        l1Var.p = i11;
        xwVar.w0(l1Var);
    }

    public final void J(int i10, int i11) {
        fw fwVar = this.A0;
        View m10 = fwVar.m(i10);
        int L0 = fwVar.L0();
        if (m10 != null || Math.abs(i10 - L0) <= 40) {
            this.F0 = true;
            this.z0.x0(i10);
        } else {
            int i12 = fwVar.L0() < i10 ? 0 : 1;
            c2.x xVar = this.T;
            xVar.b = i12;
            xVar.d(i10, i11, false, false);
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
            if (((uy) arrayList2.get(i10)).a == 0 && z10) {
                arrayList.add((uy) arrayList2.get(i10));
            }
            if (((uy) arrayList2.get(i10)).a == 1 && z12) {
                arrayList.add((uy) arrayList2.get(i10));
            }
            if (((uy) arrayList2.get(i10)).a == 2 && z11) {
                arrayList.add((uy) arrayList2.get(i10));
            }
            i10++;
        }
        oc0 oc0Var = this.w;
        if (oc0Var != null) {
            AndroidUtilities.updateViewVisibilityAnimated(oc0Var, arrayList.size() > 1, 1.0f, z13);
        }
        kw kwVar = this.h;
        if (kwVar != null) {
            kwVar.setAdapter(null);
            kwVar.setAdapter(this.H0);
            if (oc0Var != null) {
                oc0Var.setViewPager(kwVar);
            }
        }
    }

    public final void L(final wg.b bVar, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z10, boolean z11) {
        ty tyVar;
        wx wxVar;
        if (stickerSet == null) {
            return;
        }
        if (!z10 || (wxVar = this.O) == null || wxVar.d == stickerSet.id) {
            if (z10 || (tyVar = this.v0) == null || tyVar.d == stickerSet.id) {
                final boolean isStickerPackInstalled = MediaDataController.getInstance(this.Y0).isStickerPackInstalled(stickerSet.id);
                bVar.g(isStickerPackInstalled ? stickerSet.masks ? LocaleController.formatPluralString("RemoveManyMasksCount", stickerSet.count, new Object[0]) : stickerSet.emojis ? LocaleController.formatPluralString("RemoveManyEmojiCount", stickerSet.count, new Object[0]) : LocaleController.formatPluralString("RemoveManyStickersCount", stickerSet.count, new Object[0]) : stickerSet.masks ? LocaleController.formatPluralString("AddManyMasksCount", stickerSet.count, new Object[0]) : stickerSet.emojis ? LocaleController.formatPluralString("AddManyEmojiCount", stickerSet.count, new Object[0]) : LocaleController.formatPluralString("AddManyStickersCount", stickerSet.count, new Object[0]), z11, true);
                bVar.d0.a(!isStickerPackInstalled, z11);
                bVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.tv
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        yy yyVar = yy.this;
                        MediaDataController mediaDataController = MediaDataController.getInstance(yyVar.Y0);
                        Context context = yyVar.getContext();
                        int i10 = isStickerPackInstalled ? 0 : 2;
                        org.telegram.ui.ActionBar.n2 n2Var = yyVar.U1;
                        FrameLayout frameLayout = yyVar.s;
                        wg.b bVar2 = bVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z12 = z10;
                        mediaDataController.toggleStickerSet(context, tLObject2, document2, i10, n2Var, frameLayout, false, true, new h3.p1(yyVar, bVar2, tLObject2, stickerSet2, document2, z12, 10), false);
                        yyVar.L(bVar2, tLObject2, stickerSet2, document2, z12, true);
                    }
                });
            }
        }
    }

    public final void M(long j10, boolean z10, boolean z11) {
        oc0 oc0Var = this.w;
        if (oc0Var == null) {
            return;
        }
        this.r1 = z10;
        this.s1 = z11;
        if (z11 || z10) {
            this.q1 = j10;
        } else {
            this.q1 = 0L;
        }
        int i10 = z11 ? 2 : 0;
        LinearLayout linearLayout = oc0Var.d;
        View childAt = i10 >= linearLayout.getChildCount() ? null : linearLayout.getChildAt(i10);
        if (childAt != null) {
            childAt.setAlpha(this.q1 != 0 ? 0.15f : 1.0f);
            kw kwVar = this.h;
            if (z11) {
                if (this.q1 == 0 || kwVar.getCurrentItem() == 0) {
                    return;
                }
                N(true, true);
                S(false, true);
                kwVar.x(0, false);
                return;
            }
            if (this.q1 == 0 || kwVar.getCurrentItem() == 1) {
                return;
            }
            N(false, true);
            S(false, true);
            kwVar.x(1, false);
        }
    }

    public final void N(boolean z10, boolean z11) {
        lw lwVar = this.x;
        if (z10 && lwVar.getTag() == null) {
            return;
        }
        if ((z10 || lwVar.getTag() == null) && !this.k2) {
            AnimatorSet animatorSet = this.B;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.B = null;
            }
            lwVar.setTag(z10 ? null : 1);
            if (!z11) {
                lwVar.setAlpha(z10 ? 1.0f : 0.0f);
                lwVar.setScaleX(z10 ? 1.0f : 0.0f);
                lwVar.setScaleY(z10 ? 1.0f : 0.0f);
                lwVar.setVisibility(z10 ? 0 : 4);
                return;
            }
            if (z10) {
                lwVar.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.B = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(lwVar, (Property<lw, Float>) View.ALPHA, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(lwVar, (Property<lw, Float>) View.SCALE_X, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(lwVar, (Property<lw, Float>) View.SCALE_Y, z10 ? 1.0f : 0.0f));
            this.B.setDuration(200L);
            this.B.setInterpolator(er.g);
            this.B.addListener(new sw(this, z10, r2));
            this.B.start();
        }
    }

    public final void O(boolean z10) {
        this.D = 0.0f;
        xx xxVar = this.p1;
        if (xxVar != null && xxVar.z()) {
            z10 = false;
        }
        FrameLayout frameLayout = this.n;
        if (z10 && frameLayout.getTag() == null) {
            return;
        }
        if (z10 || frameLayout.getTag() == null) {
            frameLayout.setTag(z10 ? null : 1);
            this.C2.a(z10, true);
        }
    }

    public final void P(boolean z10, boolean z11) {
        View view = this.K;
        if (z10 && view.getTag() == null) {
            return;
        }
        if (z10 || view.getTag() == null) {
            AnimatorSet animatorSet = this.S;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.S = null;
            }
            view.setTag(z10 ? null : 1);
            if (!z11) {
                view.setAlpha(z10 ? 1.0f : 0.0f);
                return;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.S = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
            this.S.setDuration(200L);
            this.S.setInterpolator(er.g);
            this.S.addListener(new org.telegram.ui.am(this, 27));
            this.S.start();
        }
    }

    public final void Q(boolean z10) {
        for (int i10 = 0; i10 < 3; i10++) {
            f2.x x8 = x(i10);
            int L0 = x8.L0();
            if (z10) {
                if (L0 == 1 || L0 == 2) {
                    x8.n0(0);
                    H(i10);
                }
            } else if (L0 == 0) {
                x8.h1(0, 0);
            }
        }
    }

    public final void R(boolean z10, boolean z11, boolean z12) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.Chat chat = MessagesController.getInstance(this.Y0).getChat(Long.valueOf(this.q1));
        if (chat == null) {
            return;
        }
        cg.q qVar = this.J0;
        if (z10) {
            if (ChatObject.hasAdminRights(chat) || (tL_chatBannedRights = chat.default_banned_rights) == null || !(tL_chatBannedRights.send_stickers || (z11 && tL_chatBannedRights.send_plain))) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.banned_rights;
                if (tL_chatBannedRights2 == null) {
                    return;
                }
                if (!AndroidUtilities.isBannedForever(tL_chatBannedRights2)) {
                    if (z11) {
                        qVar.setText(LocaleController.formatString("AttachPlainRestricted", R.string.AttachPlainRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    }
                    if (z12) {
                        qVar.setText(LocaleController.formatString("AttachGifRestricted", R.string.AttachGifRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    } else {
                        qVar.setText(LocaleController.formatString("AttachStickersRestricted", R.string.AttachStickersRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    }
                } else if (z11) {
                    qVar.setText(LocaleController.getString(R.string.AttachPlainRestrictedForever));
                } else if (z12) {
                    qVar.setText(LocaleController.getString(R.string.AttachGifRestrictedForever));
                } else {
                    qVar.setText(LocaleController.getString(R.string.AttachStickersRestrictedForever));
                }
            } else {
                org.telegram.ui.ActionBar.n2 n2Var = this.U1;
                if ((n2Var instanceof org.telegram.ui.rn) && ((org.telegram.ui.rn) n2Var).K6()) {
                    return;
                }
                if (z11) {
                    qVar.setText(LocaleController.getString(R.string.GlobalAttachEmojiRestricted));
                } else if (z12) {
                    qVar.setText(LocaleController.getString(R.string.GlobalAttachGifRestricted));
                } else {
                    qVar.setText(LocaleController.getString(R.string.GlobalAttachStickersRestricted));
                }
            }
            qVar.setVisibility(0);
        }
        AnimatorSet animatorSet = this.F2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.F2 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.F2 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(qVar, (Property<cg.q, Float>) View.ALPHA, z10 ? qVar.getAlpha() : 1.0f, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(qVar, (Property<cg.q, Float>) View.TRANSLATION_Y, z10 ? AndroidUtilities.dp(12.0f) : qVar.getTranslationY(), z10 ? 0.0f : AndroidUtilities.dp(12.0f)));
        org.telegram.messenger.video.k kVar = this.G2;
        if (kVar != null) {
            AndroidUtilities.cancelRunOnUIThread(kVar);
        }
        if (z10) {
            org.telegram.messenger.video.k kVar2 = new org.telegram.messenger.video.k(this, z11, z12, 3);
            this.G2 = kVar2;
            AndroidUtilities.runOnUIThread(kVar2, 3500L);
        }
        this.F2.setDuration(320L);
        this.F2.setInterpolator(er.h);
        this.F2.start();
    }

    public final void S(boolean z10, boolean z11) {
        ImageView imageView = this.y;
        if (imageView == null || this.l2) {
            return;
        }
        if (z10 && imageView.getTag() == null) {
            return;
        }
        if (z10 || imageView.getTag() == null) {
            AnimatorSet animatorSet = this.C;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.C = null;
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
            this.C = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.ALPHA, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_X, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_Y, z10 ? 1.0f : 0.0f));
            this.C.setDuration(200L);
            this.C.setInterpolator(er.g);
            this.C.addListener(new sw(this, z10, i10));
            this.C.start();
        }
    }

    public final void T() {
        org.telegram.ui.ActionBar.n2 n2Var;
        if (((View) getParent()) != null) {
            float y10 = (getY() + (getLayoutParams().height > 0 ? getLayoutParams().height : getMeasuredHeight())) - (((AndroidUtilities.isInMultiwindow || ((n2Var = this.U1) != null && n2Var.isInBubbleMode())) && !this.R0) ? AndroidUtilities.dp(1.0f) : r0.getHeight());
            float f10 = this.n2;
            FrameLayout frameLayout = this.n;
            if (f10 >= 0.0f) {
                y10 += getMeasuredHeight() - this.n2;
            } else if (frameLayout.getTop() - y10 < 0.0f || !this.t2) {
                y10 = 0.0f;
            }
            float f11 = -y10;
            boolean z10 = this.W;
            float lerp = f11 + AndroidUtilities.lerp(AndroidUtilities.dp(z10 ? 45.0f : 50.0f), -this.m2, this.C2.e);
            frameLayout.setTranslationY(lerp);
            if (z10) {
                this.r.setTranslationY(lerp);
            }
        }
    }

    public final void U() {
        ky kyVar;
        boolean z10;
        iv ivVar;
        boolean z11 = this.q0;
        View view = this.v;
        if (!z11) {
            setBackground(null);
            view.setBackground(null);
        } else if (AndroidUtilities.isInMultiwindow || this.J1) {
            Drawable background = getBackground();
            if (background != null) {
                background.setColorFilter(new PorterDuffColorFilter(B(org.telegram.ui.ActionBar.g6.He), PorterDuff.Mode.MULTIPLY));
            }
        } else {
            int i10 = org.telegram.ui.ActionBar.g6.He;
            setBackgroundColor(B(i10));
            if (this.W) {
                view.setBackgroundColor(B(i10));
            }
        }
        uv uvVar = this.E;
        if (uvVar != null) {
            if (this.q0) {
                uvVar.setBackgroundColor(B(org.telegram.ui.ActionBar.g6.He));
                this.K.setBackgroundColor(B(org.telegram.ui.ActionBar.g6.Ke));
            } else {
                uvVar.setBackground(null);
            }
        }
        hu huVar = this.x1;
        if (huVar != null) {
            huVar.c.a();
        }
        int i11 = 0;
        while (true) {
            kyVar = this.R;
            z10 = this.e2;
            if (i11 >= 3) {
                break;
            }
            if (i11 == 0) {
                kyVar = this.C0;
            } else if (i11 != 1) {
                kyVar = this.k0;
            }
            if (kyVar != null) {
                wp wpVar = kyVar.d;
                FrameLayout frameLayout = kyVar.n;
                View view2 = kyVar.f;
                if (this.q0) {
                    view2.setBackgroundColor(B(org.telegram.ui.ActionBar.g6.He));
                } else {
                    view2.setBackground(null);
                }
                kyVar.e.setBackgroundColor(B(org.telegram.ui.ActionBar.g6.Ke));
                kyVar.c.a(z10 ? w(0.4f) : B(org.telegram.ui.ActionBar.g6.Je));
                org.telegram.ui.ActionBar.g6.w1(z10 ? w(0.06f) : B(org.telegram.ui.ActionBar.g6.Ie), frameLayout.getBackground());
                frameLayout.invalidate();
                wpVar.setHintTextColor(z10 ? w(0.45f) : B(org.telegram.ui.ActionBar.g6.Je));
                wpVar.setTextColor(z10 ? w(0.8f) : B(org.telegram.ui.ActionBar.g6.G6));
            }
            i11++;
        }
        Paint paint = this.o1;
        if (paint != null) {
            paint.setColor(B(org.telegram.ui.ActionBar.g6.af));
        }
        ww wwVar = this.L;
        if (wwVar != null) {
            wwVar.setGlowColor(B(org.telegram.ui.ActionBar.g6.He));
        }
        ew ewVar = this.z0;
        if (ewVar != null) {
            ewVar.setGlowColor(B(org.telegram.ui.ActionBar.g6.He));
        }
        iw iwVar = this.x0;
        if (iwVar != null) {
            iwVar.setIndicatorColor(B(org.telegram.ui.ActionBar.g6.Qe));
            iwVar.setUnderlineColor(B(org.telegram.ui.ActionBar.g6.Ke));
            if (this.q0) {
                iwVar.setBackgroundColor(B(org.telegram.ui.ActionBar.g6.He));
            } else {
                iwVar.setBackground(null);
            }
        }
        dx dxVar = this.l0;
        if (dxVar != null) {
            dxVar.setIndicatorColor(B(org.telegram.ui.ActionBar.g6.Qe));
            dxVar.setUnderlineColor(B(org.telegram.ui.ActionBar.g6.Ke));
            if (this.q0) {
                dxVar.setBackgroundColor(B(org.telegram.ui.ActionBar.g6.He));
            } else {
                dxVar.setBackground(null);
            }
        }
        lw lwVar = this.x;
        if (lwVar != null) {
            lwVar.setColorFilter(new PorterDuffColorFilter(z10 ? w(0.6f) : B(org.telegram.ui.ActionBar.g6.Re), PorterDuff.Mode.MULTIPLY));
            if (kyVar == null) {
                Drawable background2 = lwVar.getBackground();
                int i12 = org.telegram.ui.ActionBar.g6.He;
                org.telegram.ui.ActionBar.g6.B1(background2, B(i12), false);
                org.telegram.ui.ActionBar.g6.B1(lwVar.getBackground(), B(i12), true);
            }
        }
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(z10 ? w(0.6f) : B(org.telegram.ui.ActionBar.g6.Re), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.A;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(z10 ? w(0.6f) : B(org.telegram.ui.ActionBar.g6.Re), PorterDuff.Mode.MULTIPLY));
        }
        cg.q qVar = this.J0;
        if (qVar != null) {
            ((ShapeDrawable) qVar.getBackground()).getPaint().setColor(B(org.telegram.ui.ActionBar.g6.qf));
            qVar.setTextColor(B(org.telegram.ui.ActionBar.g6.pf));
        }
        cy cyVar = this.f0;
        if (cyVar != null) {
            ey eyVar = cyVar.e;
            ImageView imageView3 = eyVar.a;
            int i13 = org.telegram.ui.ActionBar.g6.Le;
            imageView3.setColorFilter(new PorterDuffColorFilter(B(i13), PorterDuff.Mode.MULTIPLY));
            eyVar.b.setTextColor(B(i13));
            eyVar.c.setProgressColor(B(org.telegram.ui.ActionBar.g6.h6));
        }
        this.a2 = new PorterDuffColorFilter(B(org.telegram.ui.ActionBar.g6.Oh), PorterDuff.Mode.SRC_IN);
        int i14 = 0;
        while (true) {
            Drawable[] drawableArr = this.T0;
            if (i14 >= drawableArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.g6.y1(drawableArr[i14], z10 ? w(0.4f) : B(org.telegram.ui.ActionBar.g6.Ne), false);
            org.telegram.ui.ActionBar.g6.y1(drawableArr[i14], z10 ? w(0.8f) : B(org.telegram.ui.ActionBar.g6.Oe), true);
            i14++;
        }
        if (uvVar != null && (ivVar = uvVar.y) != null) {
            ivVar.d();
        }
        int i15 = 0;
        while (true) {
            Drawable[] drawableArr2 = this.U0;
            if (i15 >= drawableArr2.length) {
                break;
            }
            org.telegram.ui.ActionBar.g6.y1(drawableArr2[i15], z10 ? w(0.4f) : B(org.telegram.ui.ActionBar.g6.Me), false);
            org.telegram.ui.ActionBar.g6.y1(drawableArr2[i15], z10 ? w(0.8f) : B(org.telegram.ui.ActionBar.g6.Oe), true);
            i15++;
        }
        int i16 = 0;
        while (true) {
            Drawable[] drawableArr3 = this.V0;
            if (i16 >= drawableArr3.length) {
                break;
            }
            org.telegram.ui.ActionBar.g6.y1(drawableArr3[i16], z10 ? w(0.4f) : B(org.telegram.ui.ActionBar.g6.Me), false);
            org.telegram.ui.ActionBar.g6.y1(drawableArr3[i16], z10 ? w(0.8f) : B(org.telegram.ui.ActionBar.g6.Oe), true);
            i16++;
        }
        org.telegram.ui.ActionBar.r5 r5Var = this.W1;
        if (r5Var != null) {
            org.telegram.ui.ActionBar.g6.y1(r5Var, z10 ? w(0.4f) : B(org.telegram.ui.ActionBar.g6.Ne), false);
            org.telegram.ui.ActionBar.g6.y1(r5Var, z10 ? w(0.8f) : B(org.telegram.ui.ActionBar.g6.Oe), true);
        }
        org.telegram.ui.ActionBar.r5 r5Var2 = this.X1;
        if (r5Var2 != null) {
            org.telegram.ui.ActionBar.g6.y1(r5Var2, z10 ? w(0.4f) : B(org.telegram.ui.ActionBar.g6.Qe), false);
            org.telegram.ui.ActionBar.g6.y1(r5Var2, z10 ? w(0.8f) : B(org.telegram.ui.ActionBar.g6.Qe), true);
        }
    }

    public final void V() {
        ww wwVar = this.L;
        if (wwVar == null) {
            return;
        }
        for (int i10 = 0; i10 < wwVar.getChildCount(); i10++) {
            View childAt = wwVar.getChildAt(i10);
            if (childAt instanceof ox) {
                ((ox) childAt).a(true);
            }
        }
    }

    public final void W(int i10) {
        if (this.b0) {
            return;
        }
        int i11 = -1;
        if (i10 != -1) {
            int size = getRecentEmoji().size() + (this.W ? 1 : 0);
            gx gxVar = this.N;
            int i12 = gxVar.c;
            ArrayList arrayList = gxVar.x;
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
                    ArrayList<kx> emojipacks = getEmojipacks();
                    int size2 = arrayList.size() - 1;
                    while (true) {
                        if (size2 < 0) {
                            break;
                        }
                        if (((Integer) arrayList.get(size2)).intValue() <= i10) {
                            kx kxVar = (kx) this.m1.get(size2);
                            while (i13 < emojipacks.size()) {
                                long j10 = emojipacks.get(i13).b.id;
                                long j11 = kxVar.b.id;
                                if (j10 == j11 && (!kxVar.g || (!kxVar.f && !this.l1.contains(Long.valueOf(j11))))) {
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
                this.E.j(i13, true);
            }
        }
    }

    public final void X() {
        int i10;
        jy jyVar;
        int i11;
        boolean z10;
        dx dxVar = this.l0;
        int currentPosition = dxVar.getCurrentPosition();
        int i12 = this.n0;
        boolean z11 = currentPosition == i12;
        boolean z12 = i12 >= 0;
        boolean isEmpty = this.e1.isEmpty();
        dxVar.d(false);
        this.n0 = -2;
        this.o0 = -2;
        this.p0 = -2;
        Drawable[] drawableArr = this.V0;
        if (isEmpty) {
            i10 = 0;
        } else {
            this.n0 = 0;
            dxVar.b(0, drawableArr[0]).setContentDescription(LocaleController.getString(R.string.RecentStickers));
            i10 = 1;
        }
        this.o0 = i10;
        dxVar.b(1, drawableArr[1]).setContentDescription(LocaleController.getString(R.string.FeaturedGifs));
        this.p0 = i10 + 1;
        AndroidUtilities.dp(13.0f);
        AndroidUtilities.dp(11.0f);
        int i13 = this.Y0;
        ArrayList<String> arrayList = MessagesController.getInstance(i13).gifSearchEmojies;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            String str = arrayList.get(i14);
            Emoji.EmojiDrawable emojiDrawable = Emoji.getEmojiDrawable(str);
            if (emojiDrawable != null) {
                TLRPC.Document emojiAnimatedSticker = MediaDataController.getInstance(i13).getEmojiAnimatedSticker(str);
                String k10 = i0.a.k(i14 + 3, "tab");
                int i15 = dxVar.x;
                dxVar.x = i15 + 1;
                nw0 nw0Var = (nw0) dxVar.n.get(k10);
                if (nw0Var != null) {
                    dxVar.g(k10, nw0Var, i15);
                    i11 = currentPosition;
                    z10 = z12;
                } else {
                    i11 = currentPosition;
                    z10 = z12;
                    nw0Var = new nw0(dxVar.getContext(), 2);
                    nw0Var.setFocusable(true);
                    nw0Var.setOnClickListener(new pl0(dxVar, 2));
                    nw0Var.setExpanded(dxVar.b0);
                    nw0Var.a(dxVar.e0);
                    dxVar.e.addView(nw0Var, i15);
                }
                nw0Var.d = false;
                nw0Var.setTag(R.id.index_tag, Integer.valueOf(i15));
                nw0Var.setTag(R.id.parent_tag, emojiDrawable);
                nw0Var.setTag(R.id.object_tag, emojiAnimatedSticker);
                nw0Var.setSelected(i15 == dxVar.y);
                dxVar.h.put(k10, nw0Var);
                nw0Var.setContentDescription(str);
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
        dxVar.h();
        dxVar.q();
        if (z11 && isEmpty) {
            dxVar.m(this.o0);
            bw bwVar = this.k0;
            if (bwVar == null || (jyVar = bwVar.r) == null) {
                return;
            }
            jyVar.F1(null);
            return;
        }
        WeakHashMap weakHashMap = r0.j0.a;
        if (dxVar.isLaidOut()) {
            if (!isEmpty && !z13) {
                dxVar.k(i16 + 1, 0);
            } else if (isEmpty && z13) {
                dxVar.k(i16 - 1, 0);
            }
        }
    }

    public final void Y() {
        cy cyVar;
        int size = this.e1.size();
        long calcDocumentsHash = MediaDataController.calcDocumentsHash(this.e1, ConnectionsManager.DEFAULT_DATACENTER_ID);
        ArrayList<TLRPC.Document> recentGifs = MediaDataController.getInstance(this.Y0).getRecentGifs();
        this.e1 = recentGifs;
        long calcDocumentsHash2 = MediaDataController.calcDocumentsHash(recentGifs, ConnectionsManager.DEFAULT_DATACENTER_ID);
        if ((this.l0 != null && size == 0 && !this.e1.isEmpty()) || (size != 0 && this.e1.isEmpty())) {
            X();
        }
        if ((size == this.e1.size() && calcDocumentsHash == calcDocumentsHash2) || (cyVar = this.j0) == null) {
            return;
        }
        cyVar.l();
    }

    public final void Z(boolean z10) {
        TLRPC.Document document;
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet;
        iw iwVar = this.x0;
        if (iwVar != null) {
            ra1 ra1Var = iwVar.e;
            if (iwVar.s != null) {
                return;
            }
            this.B1 = -2;
            this.C1 = -2;
            this.D1 = -2;
            this.E1 = -2;
            this.a0 = false;
            this.A1 = 0;
            int currentPosition = iwVar.getCurrentPosition();
            boolean z11 = true;
            iwVar.d((getParent() == null || getVisibility() != 0 || (this.u1.size() == 0 && this.v1.size() == 0)) ? false : true);
            int i10 = this.Y0;
            MediaDataController mediaDataController = MediaDataController.getInstance(i10);
            SharedPreferences emojiSettings = MessagesController.getEmojiSettings(i10);
            ArrayList arrayList3 = this.i1;
            arrayList3.clear();
            ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
            int size = featuredStickerSets.size();
            for (int i11 = 0; i11 < size; i11++) {
                TLRPC.StickerSetCovered stickerSetCovered = featuredStickerSets.get(i11);
                if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.id)) {
                    arrayList3.add(stickerSetCovered);
                }
            }
            wy wyVar = this.B0;
            if (wyVar != null) {
                wyVar.l();
            }
            boolean isEmpty = featuredStickerSets.isEmpty();
            long j10 = 0;
            Drawable[] drawableArr = this.U0;
            if (!isEmpty && (arrayList3.isEmpty() || emojiSettings.getLong("featured_hidden", 0L) == featuredStickerSets.get(0).set.id)) {
                int i12 = mediaDataController.getUnreadStickerSets().isEmpty() ? 2 : 3;
                nw0 c10 = iwVar.c(i12, drawableArr[i12]);
                c10.h.setText(LocaleController.getString(R.string.FeaturedStickersShort));
                c10.setContentDescription(LocaleController.getString(R.string.FeaturedStickers));
                int i13 = this.A1;
                this.D1 = i13;
                this.A1 = i13 + 1;
            }
            if (!this.g1.isEmpty()) {
                int i14 = this.A1;
                this.C1 = i14;
                this.A1 = i14 + 1;
                nw0 c11 = iwVar.c(1, drawableArr[1]);
                c11.h.setText(LocaleController.getString(R.string.FavoriteStickersShort));
                c11.setContentDescription(LocaleController.getString(R.string.FavoriteStickers));
            }
            if (!this.f1.isEmpty()) {
                int i15 = this.A1;
                this.B1 = i15;
                this.A1 = i15 + 1;
                nw0 c12 = iwVar.c(0, drawableArr[0]);
                c12.h.setText(LocaleController.getString(R.string.RecentStickersShort));
                c12.setContentDescription(LocaleController.getString(R.string.RecentStickers));
            }
            ArrayList arrayList4 = this.Z0;
            arrayList4.clear();
            org.telegram.ui.ActionBar.c6 c6Var = null;
            this.d1 = null;
            this.b1 = -1;
            this.a1 = -10;
            if (this.D2 == null || z10) {
                this.D2 = new ArrayList(mediaDataController.getStickerSets(0));
            }
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList5 = this.D2;
            int i16 = 0;
            while (true) {
                TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.t1;
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
            if (this.F1 != null) {
                long j13 = MessagesController.getEmojiSettings(i10).getLong("group_hide_stickers_" + this.F1.id, -1L);
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(this.F1.id));
                if (chat == null || this.F1.stickerset == null || !ChatObject.hasAdminRights(chat)) {
                    this.c1 = j13 != -1;
                } else {
                    TLRPC.StickerSet stickerSet3 = this.F1.stickerset;
                    if (stickerSet3 != null) {
                        this.c1 = j13 == stickerSet3.id;
                    }
                }
                TLRPC.ChatFull chatFull = this.F1;
                TLRPC.StickerSet stickerSet4 = chatFull.stickerset;
                if (stickerSet4 != null) {
                    TLRPC.TL_messages_stickerSet groupStickerSetById = mediaDataController.getGroupStickerSetById(stickerSet4);
                    if (groupStickerSetById != null && (arrayList = groupStickerSetById.documents) != null && !arrayList.isEmpty() && groupStickerSetById.set != null) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = new TLRPC.TL_messages_stickerSet();
                        tL_messages_stickerSet3.documents = groupStickerSetById.documents;
                        tL_messages_stickerSet3.packs = groupStickerSetById.packs;
                        tL_messages_stickerSet3.set = groupStickerSetById.set;
                        if (this.c1) {
                            this.a1 = arrayList4.size();
                            arrayList4.add(tL_messages_stickerSet3);
                        } else {
                            this.a1 = 0;
                            arrayList4.add(0, tL_messages_stickerSet3);
                        }
                        if (!this.F1.can_set_stickers) {
                            tL_messages_stickerSet3 = null;
                        }
                        this.d1 = tL_messages_stickerSet3;
                    }
                } else if (chatFull.can_set_stickers) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = new TLRPC.TL_messages_stickerSet();
                    if (this.c1) {
                        this.a1 = arrayList4.size();
                        arrayList4.add(tL_messages_stickerSet4);
                    } else {
                        this.a1 = 0;
                        arrayList4.add(0, tL_messages_stickerSet4);
                    }
                }
            }
            int i18 = 0;
            while (i18 < arrayList4.size()) {
                if (i18 == this.a1) {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(this.F1.id));
                    if (chat2 == null) {
                        arrayList4.remove(0);
                        i18--;
                    } else {
                        this.a0 = z11;
                        String str = "chat" + chat2.id;
                        int i19 = iwVar.x;
                        iwVar.x = i19 + 1;
                        nw0 nw0Var = (nw0) iwVar.n.get(str);
                        if (nw0Var != null) {
                            iwVar.g(str, nw0Var, i19);
                        } else {
                            nw0Var = new nw0(iwVar.getContext(), 0);
                            nw0Var.setFocusable(z11);
                            nw0Var.setOnClickListener(new pl0(iwVar, 0));
                            ra1Var.addView(nw0Var, i19);
                            nw0Var.w = z11;
                            y8 y8Var = new y8(c6Var);
                            y8Var.u(AndroidUtilities.dp(14.0f));
                            y8Var.k(UserConfig.selectedAccount, chat2);
                            int i20 = iwVar.a;
                            n9 n9Var = nw0Var.e;
                            n9Var.setLayerNum(i20);
                            n9Var.e(chat2, y8Var);
                            n9Var.setAspectFit(z11);
                            nw0Var.setExpanded(iwVar.b0);
                            nw0Var.a(iwVar.e0);
                            nw0Var.h.setText(chat2.title);
                        }
                        nw0Var.d = z11;
                        nw0Var.setTag(R.id.index_tag, Integer.valueOf(i19));
                        nw0Var.setSelected(i19 == iwVar.y);
                        iwVar.h.put(str, nw0Var);
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
                    int i22 = iwVar.x;
                    iwVar.x = i22 + 1;
                    nw0 nw0Var2 = (nw0) iwVar.n.get(str2);
                    if (nw0Var2 != null) {
                        iwVar.g(str2, nw0Var2, i22);
                    } else {
                        nw0Var2 = new nw0(iwVar.getContext(), 0);
                        nw0Var2.setFocusable(z11);
                        nw0Var2.setOnClickListener(new pl0(iwVar, 1));
                        nw0Var2.setExpanded(iwVar.b0);
                        nw0Var2.a(iwVar.e0);
                        ra1Var.addView(nw0Var2, i22);
                    }
                    nw0Var2.e.setLayerNum(iwVar.a);
                    nw0Var2.d = false;
                    nw0Var2.setTag(closestPhotoSizeWithSize);
                    nw0Var2.setTag(R.id.index_tag, Integer.valueOf(i22));
                    nw0Var2.setTag(R.id.parent_tag, tL_messages_stickerSet5);
                    nw0Var2.setTag(R.id.object_tag, document);
                    nw0Var2.setSelected(i22 == iwVar.y);
                    iwVar.h.put(str2, nw0Var2);
                    nw0Var2.setContentDescription(tL_messages_stickerSet5.set.title + ", " + LocaleController.getString(R.string.AccDescrStickerSet));
                }
                i18++;
                z11 = true;
                c6Var = null;
            }
            iwVar.h();
            iwVar.q();
            if (currentPosition != 0) {
                iwVar.k(currentPosition, currentPosition);
            }
            p();
        }
    }

    @Override // yg.a
    public final void a(int i10) {
        setBottomInset(i10);
    }

    public final void a0() {
        jw jwVar = this.y0;
        iw iwVar = this.x0;
        if (iwVar != null && jwVar == null && this.p1 != null) {
            iwVar.setTranslationY(this.p1.p() * (-AndroidUtilities.dp(50.0f)));
        }
        if (jwVar == null) {
            return;
        }
        boolean z10 = getVisibility() == 0 && this.G0 && this.p1.p() != 1.0f;
        jwVar.setVisibility(z10 ? 0 : 8);
        if (z10) {
            Rect rect = this.u2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.t0, rect, null);
            float p6 = this.p1.p() * AndroidUtilities.dp(50.0f);
            int i10 = rect.left;
            if (i10 != 0 || p6 != 0.0f) {
                this.T1 = false;
            }
            jwVar.setTranslationX(i10);
            float translationY = (((getTranslationY() + getTop()) - jwVar.getTop()) - iwVar.getExpandedOffset()) - p6;
            if (jwVar.getTranslationY() != translationY) {
                jwVar.setTranslationY(translationY);
                jwVar.invalidate();
            }
        }
        if (this.T1 && z10 && this.L0) {
            iwVar.i(this.S1, true);
        } else {
            this.T1 = false;
            iwVar.i(this.S1, false);
        }
    }

    public final void b0() {
        boolean z10;
        org.telegram.ui.Cells.p3 p3Var;
        LongSparseArray longSparseArray = this.v1;
        LongSparseArray longSparseArray2 = this.u1;
        int i10 = this.Y0;
        ew ewVar = this.z0;
        if (ewVar == null) {
            return;
        }
        try {
            int childCount = ewVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = ewVar.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.p3) && ((lk0) ewVar.T(childAt)) != null) {
                    org.telegram.ui.Cells.p3 p3Var2 = (org.telegram.ui.Cells.p3) childAt;
                    ArrayList<Long> unreadStickerSets = MediaDataController.getInstance(i10).getUnreadStickerSets();
                    TLRPC.StickerSetCovered stickerSet = p3Var2.getStickerSet();
                    boolean z11 = unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSet.set.id));
                    int i12 = 0;
                    while (true) {
                        TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.t1;
                        if (i12 >= stickerSetCoveredArr.length) {
                            z10 = false;
                            break;
                        }
                        TLRPC.StickerSetCovered stickerSetCovered = stickerSetCoveredArr[i12];
                        if (stickerSetCovered != null) {
                            p3Var = p3Var2;
                            if (stickerSetCovered.set.id == stickerSet.set.id) {
                                p3Var2 = p3Var;
                                z10 = true;
                                break;
                            }
                        } else {
                            p3Var = p3Var2;
                        }
                        i12++;
                        p3Var2 = p3Var;
                    }
                    p3Var2.c(stickerSet, z11, true, 0, 0, z10);
                    if (z11) {
                        MediaDataController.getInstance(i10).markFeaturedStickersByIdAsRead(false, stickerSet.set.id);
                    }
                    boolean z12 = longSparseArray2.indexOfKey(stickerSet.set.id) >= 0;
                    boolean z13 = longSparseArray.indexOfKey(stickerSet.set.id) >= 0;
                    if (z12 || z13) {
                        if (z12 && p3Var2.r) {
                            longSparseArray2.remove(stickerSet.set.id);
                            z12 = false;
                        } else if (z13 && !p3Var2.r) {
                            longSparseArray.remove(stickerSet.set.id);
                        }
                    }
                    p3Var2.b(!z10 && z12, true);
                }
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override // yg.a
    public final void d(float f10) {
        this.n2 = f10;
        T();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Utilities.Callback callback;
        TLRPC.StickerSet stickerSet;
        int i12 = NotificationCenter.stickersDidLoad;
        gx gxVar = this.N;
        nv nvVar = this.H2;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.u0 != null) {
                    Z(((Boolean) objArr[1]).booleanValue());
                    b0();
                    G();
                    p();
                    return;
                }
                return;
            }
            if (((Integer) objArr[0]).intValue() == 5) {
                if (!((Boolean) objArr[1]).booleanValue()) {
                    gxVar.F(false);
                    return;
                } else {
                    AndroidUtilities.cancelRunOnUIThread(nvVar);
                    AndroidUtilities.runOnUIThread(nvVar, 100L);
                    return;
                }
            }
            return;
        }
        if (i10 == NotificationCenter.groupPackUpdated) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            TLRPC.ChatFull chatFull = this.F1;
            if (chatFull != null && chatFull.id == longValue && booleanValue) {
                gxVar.F(true);
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
            oc0 oc0Var = this.w;
            if (oc0Var != null) {
                int childCount = oc0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    oc0Var.getChildAt(i13).invalidate();
                }
            }
            Z(false);
            return;
        }
        if (i10 == NotificationCenter.featuredEmojiDidLoad) {
            if (gxVar != null) {
                gxVar.F(false);
                return;
            }
            return;
        }
        int i14 = NotificationCenter.groupStickersDidLoad;
        wx wxVar = this.O;
        if (i10 == i14) {
            Long l10 = (Long) objArr[0];
            long longValue2 = l10.longValue();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = objArr.length > 1 ? (TLRPC.TL_messages_stickerSet) objArr[1] : null;
            if (tL_messages_stickerSet != null) {
                ty tyVar = this.v0;
                if (tyVar != null && tyVar.d == longValue2 && tyVar.f.size() < tL_messages_stickerSet.documents.size()) {
                    tyVar.f = tL_messages_stickerSet.documents;
                    tyVar.l();
                }
                if (wxVar != null && wxVar.d == longValue2 && wxVar.f.size() < tL_messages_stickerSet.documents.size()) {
                    wxVar.f = tL_messages_stickerSet.documents;
                    wxVar.l();
                }
            }
            TLRPC.ChatFull chatFull2 = this.F1;
            if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null && stickerSet.id == longValue2) {
                Z(false);
            }
            HashMap hashMap = this.n1;
            if (hashMap.containsKey(l10) && objArr.length >= 2 && ((Utilities.Callback) hashMap.get(l10)) != null && tL_messages_stickerSet != null && (callback = (Utilities.Callback) hashMap.remove(l10)) != null) {
                callback.run(tL_messages_stickerSet);
            }
            AndroidUtilities.cancelRunOnUIThread(nvVar);
            AndroidUtilities.runOnUIThread(nvVar, 100L);
            return;
        }
        int i15 = NotificationCenter.emojiLoaded;
        ww wwVar = this.L;
        if (i10 != i15) {
            if (i10 != NotificationCenter.newEmojiSuggestionsAvailable) {
                if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                    if (gxVar != null) {
                        gxVar.F(false);
                    }
                    V();
                    Z(false);
                    return;
                }
                return;
            }
            if (wwVar == null || !this.W) {
                return;
            }
            if ((this.R.c.k == 2 || wwVar.getAdapter() == wxVar) && !TextUtils.isEmpty(wxVar.v)) {
                wxVar.F(wxVar.v, true);
                return;
            }
            return;
        }
        ew ewVar = this.z0;
        if (ewVar != null) {
            int childCount2 = ewVar.getChildCount();
            for (int i16 = 0; i16 < childCount2; i16++) {
                View childAt = ewVar.getChildAt(i16);
                if ((childAt instanceof org.telegram.ui.Cells.j8) || (childAt instanceof org.telegram.ui.Cells.a8)) {
                    childAt.invalidate();
                }
            }
        }
        if (wwVar != null) {
            wwVar.invalidate();
            int childCount3 = wwVar.getChildCount();
            for (int i17 = 0; i17 < childCount3; i17++) {
                View childAt2 = wwVar.getChildAt(i17);
                if (childAt2 instanceof gy) {
                    childAt2.invalidate();
                }
            }
        }
        hu huVar = this.x1;
        if (huVar != null) {
            huVar.c.invalidate();
        }
        dx dxVar = this.l0;
        if (dxVar != null) {
            ra1 ra1Var = dxVar.e;
            int childCount4 = ra1Var.getChildCount();
            for (int i18 = 0; i18 < childCount4; i18++) {
                ra1Var.getChildAt(i18).invalidate();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        og.d dVar;
        jg.e eVar;
        if (Build.VERSION.SDK_INT >= 31 && (dVar = this.h2) != null && (eVar = this.f2) != null) {
            D();
            RecordingCanvas a2 = dVar.a(getMeasuredWidth(), getMeasuredHeight());
            a2.drawColor(B(org.telegram.ui.ActionBar.g6.d6));
            if (SharedConfig.chatBlurEnabled()) {
                eVar.b(a2, -2);
            }
            dVar.b();
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
        if (this.n.getVisibility() != 8 && !this.q0 && this.s0) {
            canvas.drawColor(i0.b.k(-1, 25));
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.m2);
        if (navigationBarThirdButtonsFactor > 0.0f) {
            int l1 = org.telegram.ui.ActionBar.g6.l1(navigationBarThirdButtonsFactor, B(org.telegram.ui.ActionBar.g6.He));
            int i10 = this.y2;
            GradientDrawable gradientDrawable = this.x2;
            if (i10 != l1) {
                gradientDrawable.setColors(new int[]{l1, org.telegram.ui.ActionBar.g6.l1(0.66f, l1), i0.b.k(l1, 0)});
                this.y2 = l1;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.m2, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
        canvas.restore();
        return drawChild;
    }

    public int getCurrentPage() {
        return this.w1;
    }

    public ArrayList<kx> getEmojipacks() {
        ArrayList<kx> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.m1;
            if (i10 >= arrayList2.size()) {
                return arrayList;
            }
            kx kxVar = (kx) arrayList2.get(i10);
            boolean z10 = kxVar.g;
            ArrayList arrayList3 = this.l1;
            if ((!z10 && (kxVar.f || arrayList3.contains(Long.valueOf(kxVar.b.id)))) || (kxVar.g && !kxVar.f && !arrayList3.contains(Long.valueOf(kxVar.b.id)))) {
                arrayList.add(kxVar);
            }
            i10++;
        }
    }

    public ArrayList<String> getRecentEmoji() {
        if (this.Y1) {
            return Emoji.recentEmoji;
        }
        if (this.z2 == null) {
            this.z2 = new ArrayList();
        }
        if (Emoji.recentEmoji.size() != this.A2) {
            this.z2.clear();
            int i10 = 0;
            while (true) {
                ArrayList<String> arrayList = Emoji.recentEmoji;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (!arrayList.get(i10).startsWith("animated_")) {
                    this.z2.add(arrayList.get(i10));
                }
                i10++;
            }
            this.A2 = this.z2.size();
        }
        return this.z2;
    }

    public float getStickersExpandOffset() {
        iw iwVar = this.x0;
        if (iwVar == null) {
            return 0.0f;
        }
        return iwVar.getExpandedOffset();
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
            this.N.F(false);
        }
        Emoji.saveRecentEmoji();
        if (this.Y1) {
            return;
        }
        ArrayList arrayList = this.z2;
        if (arrayList == null) {
            this.z2 = new ArrayList();
        } else {
            arrayList.clear();
        }
        while (true) {
            ArrayList<String> arrayList2 = Emoji.recentEmoji;
            if (i10 >= arrayList2.size()) {
                this.A2 = this.z2.size();
                return;
            } else {
                if (!arrayList2.get(i10).startsWith("animated_")) {
                    this.z2.add(arrayList2.get(i10));
                }
                i10++;
            }
        }
    }

    public final void i(int i10, int i11, boolean z10) {
        if (i10 == 2 || y(i10).K(0) == null) {
            return;
        }
        tw twVar = new tw(getContext(), i11);
        twVar.a = !z10 ? 1 : 0;
        x(i10).w0(twVar);
    }

    public final void k(boolean z10) {
        if (z10) {
            Y();
            return;
        }
        int size = this.f1.size();
        int size2 = this.g1.size();
        int i10 = this.Y0;
        this.f1 = MediaDataController.getInstance(i10).getRecentStickers(0, true);
        this.g1 = MediaDataController.getInstance(i10).getRecentStickers(2);
        if (UserConfig.getInstance(i10).isPremium()) {
            this.h1 = MediaDataController.getInstance(i10).getRecentStickers(7);
        } else {
            this.h1 = new ArrayList();
        }
        for (int i11 = 0; i11 < this.g1.size(); i11++) {
            TLRPC.Document document = (TLRPC.Document) this.g1.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < this.f1.size()) {
                    TLRPC.Document document2 = (TLRPC.Document) this.f1.get(i12);
                    if (document2.dc_id == document.dc_id && document2.id == document.id) {
                        this.f1.remove(i12);
                        break;
                    }
                    i12++;
                }
            }
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            int i13 = 0;
            while (i13 < this.g1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.g1.get(i13))) {
                    this.g1.remove(i13);
                    i13--;
                }
                i13++;
            }
            int i14 = 0;
            while (i14 < this.f1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.f1.get(i14))) {
                    this.f1.remove(i14);
                    i14--;
                }
                i14++;
            }
        }
        if (size != this.f1.size() || size2 != this.g1.size()) {
            Z(false);
        }
        py pyVar = this.u0;
        if (pyVar != null) {
            pyVar.l();
        }
        p();
    }

    public final void l(boolean z10) {
        xx xxVar = this.p1;
        ud.a aVar = this.b;
        ww wwVar = this.L;
        vv vvVar = this.R;
        if (xxVar != null && xxVar.z()) {
            f2.o1 K = wwVar.K(0);
            if (K == null) {
                ky.a(vvVar, true, !z10);
            } else {
                ky.a(vvVar, K.a.getTop() < wwVar.getPaddingTop(), !z10);
            }
            P(false, !z10);
            vvVar.setTranslationY(aVar.e * AndroidUtilities.dp(15.0f));
            return;
        }
        if (vvVar == null || wwVar == null) {
            return;
        }
        vvVar.setTranslationY((aVar.e * AndroidUtilities.dp(15.0f)) + (wwVar.K(0) != null ? r0.a.getTop() : -this.X0));
        vvVar.a.a(false, !z10);
        m(Math.round(this.E.getTranslationY()));
    }

    public final void m(int i10) {
        ObjectAnimator objectAnimator = this.N0[1];
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            boolean z10 = false;
            f2.o1 K = this.L.K(0);
            int dp = AndroidUtilities.dp(38.0f) + i10;
            if (dp > 0 && (K == null || K.a.getBottom() < dp)) {
                z10 = true;
            }
            P(z10, !this.G1);
        }
    }

    public final void n(ww wwVar, int i10) {
        ww wwVar2;
        f2.o1 K;
        uv uvVar = this.E;
        int[] iArr = this.M0;
        if (wwVar == null) {
            iArr[1] = 0;
            uvVar.setTranslationY(0);
            return;
        }
        if (wwVar.getVisibility() != 0 || this.b0) {
            return;
        }
        xx xxVar = this.p1;
        if (xxVar == null || !xxVar.z()) {
            if (i10 > 0 && (wwVar2 = this.L) != null && wwVar2.getVisibility() == 0 && (K = wwVar2.K(0)) != null) {
                if (K.a.getTop() + (this.W ? this.X0 : 0) >= wwVar2.getPaddingTop()) {
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
            uvVar.setTranslationY(Math.max(-AndroidUtilities.dp(36.0f), iArr[1]));
        }
    }

    @Override // ud.b
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        if (i10 == 0) {
            r(false);
            float f12 = 1.0f - this.a.e;
            hw hwVar = this.C0;
            hwVar.setAlpha(f12);
            hwVar.setVisibility(f12 > 0.0f ? 0 : 4);
            float f13 = 1.0f - f12;
            wg.d dVar = this.D0;
            dVar.setAlpha(f13);
            dVar.setTranslationY((-AndroidUtilities.dp(15.0f)) * f12);
            dVar.setVisibility(f13 > 0.0f ? 0 : 4);
            vf.g gVar = this.I;
            gVar.setAlpha(f13);
            gVar.setTranslationY(AndroidUtilities.dp(30.0f) * f12);
            gVar.setVisibility(f13 > 0.0f ? 0 : 4);
            T();
            this.t0.invalidate();
            return;
        }
        if (i10 == 1) {
            l(false);
            float f14 = 1.0f - this.b.e;
            vv vvVar = this.R;
            vvVar.setAlpha(f14);
            vvVar.setVisibility(f14 > 0.0f ? 0 : 4);
            float f15 = 1.0f - f14;
            wg.d dVar2 = this.Q;
            dVar2.setAlpha(f15);
            dVar2.setTranslationY((-AndroidUtilities.dp(15.0f)) * f14);
            dVar2.setVisibility(f15 > 0.0f ? 0 : 4);
            vf.g gVar2 = this.G;
            gVar2.setAlpha(f15);
            gVar2.setTranslationY(AndroidUtilities.dp(30.0f) * f14);
            gVar2.setVisibility(f15 > 0.0f ? 0 : 4);
            T();
            this.F.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        int i10 = this.Y0;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupPackUpdated);
        if (this.u0 != null) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.stickersDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.featuredStickersDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupStickersDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
            AndroidUtilities.runOnUIThread(new nv(this, 0));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hu huVar = this.x1;
        if (huVar != null && huVar.isShowing()) {
            huVar.dismiss();
        }
        org.telegram.ui.kt q6 = org.telegram.ui.kt.q();
        if (q6.l == this.c2) {
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
        if (this.K1 != i14) {
            this.K1 = i14;
            G();
        }
        super.onLayout(z10, i10, i11, i12, i13);
        T();
        a0();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.G1 = true;
        boolean z10 = AndroidUtilities.isInMultiwindow;
        View view = this.v;
        boolean z11 = this.W;
        if (z10 || this.J1) {
            if (this.H1 != 1) {
                if (!this.E2) {
                    setOutlineProvider(this.I1);
                    setClipToOutline(true);
                    setElevation(AndroidUtilities.dp(2.0f));
                }
                setBackgroundResource(R.drawable.smiles_popup);
                Drawable background = getBackground();
                int i12 = org.telegram.ui.ActionBar.g6.He;
                background.setColorFilter(new PorterDuffColorFilter(B(i12), PorterDuff.Mode.MULTIPLY));
                if (z11 && this.q0) {
                    view.setBackgroundColor(B(i12));
                }
                this.H1 = 1;
            }
        } else if (this.H1 != 0) {
            if (!this.E2) {
                setOutlineProvider(null);
                setClipToOutline(false);
                setElevation(0.0f);
            }
            if (this.q0) {
                int i13 = org.telegram.ui.ActionBar.g6.He;
                setBackgroundColor(B(i13));
                if (z11) {
                    view.setBackgroundColor(B(i13));
                }
            }
            this.H1 = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
        this.G1 = false;
        setTranslationY(getTranslationY());
    }

    public final void p() {
        int L0;
        iw iwVar = this.x0;
        if (iwVar == null || (L0 = this.A0.L0()) == -1) {
            return;
        }
        int i10 = this.C1;
        if (i10 <= 0 && (i10 = this.B1) <= 0) {
            i10 = this.A1;
        }
        iwVar.k(this.u0.F(L0), i10);
    }

    public final void q(int i10) {
        int L0;
        int L02;
        if (i10 == 0) {
            if (this.F0 || (L02 = this.A0.L0()) == -1 || this.z0 == null) {
                return;
            }
            int i11 = this.C1;
            if (i11 <= 0 && (i11 = this.B1) <= 0) {
                i11 = this.A1;
            }
            this.x0.k(this.u0.F(L02), i11);
            return;
        }
        if (i10 == 2) {
            f2.q0 adapter = this.d0.getAdapter();
            cy cyVar = this.j0;
            if (adapter != cyVar || cyVar.E < 0 || this.o0 < 0 || this.n0 < 0 || (L0 = this.e0.L0()) == -1) {
                return;
            }
            this.l0.k(L0 >= cyVar.E ? this.o0 : this.n0, 0);
        }
    }

    public final void r(boolean z10) {
        xx xxVar = this.p1;
        ud.a aVar = this.a;
        ew ewVar = this.z0;
        hw hwVar = this.C0;
        if (xxVar != null && xxVar.z()) {
            f2.o1 K = ewVar.K(0);
            if (K == null) {
                ky.a(hwVar, true, !z10);
            } else {
                ky.a(hwVar, K.a.getTop() < ewVar.getPaddingTop(), !z10);
            }
            hwVar.setTranslationY(aVar.e * AndroidUtilities.dp(15.0f));
            return;
        }
        if (hwVar == null || ewVar == null) {
            return;
        }
        hwVar.setTranslationY((aVar.e * AndroidUtilities.dp(15.0f)) + (ewVar.K(0) != null ? r0.a.getTop() : -this.X0));
        hwVar.a.a(false, !z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.G1) {
            return;
        }
        super.requestLayout();
    }

    public final void s() {
        Emoji.clearRecentEmoji();
        this.N.F(false);
    }

    public void setBlurredBackgroundDrawableFactory(jg.a aVar) {
        org.telegram.ui.ActionBar.c6 c6Var = this.V1;
        lw lwVar = this.x;
        if (lwVar != null) {
            lg.d c10 = aVar.c(lwVar, null, false);
            c10.n(ng.c.d(c6Var));
            c10.p(AndroidUtilities.dp(18.0f));
            c10.o(AndroidUtilities.dp(6.0f));
            lwVar.setBackground(c10);
        }
        ImageView imageView = this.A;
        if (imageView != null) {
            lg.d c11 = aVar.c(imageView, null, false);
            c11.n(ng.c.d(c6Var));
            c11.p(AndroidUtilities.dp(18.0f));
            c11.o(AndroidUtilities.dp(6.0f));
            imageView.setBackground(c11);
        }
        oc0 oc0Var = this.w;
        if (oc0Var != null) {
            lg.d c12 = aVar.c(oc0Var, null, false);
            c12.n(ng.c.d(c6Var));
            c12.p(AndroidUtilities.dp(18.0f));
            c12.o(AndroidUtilities.dp(6.0f));
            oc0Var.setBackground(c12);
        }
        ImageView imageView2 = this.y;
        if (imageView2 != null) {
            lg.d c13 = aVar.c(imageView2, null, false);
            c13.n(ng.c.d(c6Var));
            c13.p(AndroidUtilities.dp(18.0f));
            c13.o(AndroidUtilities.dp(6.0f));
            imageView2.setBackground(c13);
        }
    }

    public void setBottomInset(int i10) {
        if (this.m2 != i10) {
            this.m2 = i10;
            j(i10, this.G);
            j(i10, this.I);
            j(AndroidUtilities.dp(44.0f) + i10, this.L);
            j(AndroidUtilities.dp(44.0f) + i10, this.z0);
            j(AndroidUtilities.dp(44.0f) + i10, this.d0);
            FrameLayout frameLayout = this.s;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-i10);
            }
            T();
            invalidate();
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.F1 = chatFull;
        Z(false);
    }

    public void setDelegate(xx xxVar) {
        this.p1 = xxVar;
    }

    public void setDragListener(cx cxVar) {
        this.K0 = cxVar;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        hw hwVar = this.C0;
        if (hwVar != null) {
            hwVar.d.setEnabled(z10);
        }
        bw bwVar = this.k0;
        if (bwVar != null) {
            bwVar.d.setEnabled(z10);
        }
        vv vvVar = this.R;
        if (vvVar != null) {
            vvVar.d.setEnabled(z10);
        }
    }

    public void setForseMultiwindowLayout(boolean z10) {
        this.J1 = z10;
    }

    public void setShouldDrawBackground(boolean z10) {
        if (this.q0 != z10) {
            this.q0 = z10;
            U();
        }
    }

    public void setShowing(boolean z10) {
        this.L0 = z10;
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
        boolean z10 = getVisibility() != i10;
        super.setVisibility(i10);
        if (z10) {
            if (i10 != 8) {
                Emoji.sortEmoji();
                this.N.F(false);
                int i11 = this.Y0;
                NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.stickersDidLoad);
                if (this.u0 != null) {
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
            ow owVar = this.P0;
            if (owVar != null) {
                owVar.a();
            }
        }
    }

    public final void t(long j10, boolean z10) {
        ky kyVar;
        f2.k0 k0Var;
        View view;
        View view2;
        int i10;
        TLRPC.TL_messages_stickerSet stickerSetById;
        py pyVar;
        int E;
        AnimatorSet animatorSet = this.I0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.I0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        if (currentItem == 2 && j10 != -1 && (stickerSetById = MediaDataController.getInstance(this.Y0).getStickerSetById(j10)) != null && (E = (pyVar = this.u0).E(stickerSetById)) >= 0 && E < pyVar.h()) {
            J(E, AndroidUtilities.dp(48.0f));
        }
        cy cyVar = this.f0;
        if (cyVar != null) {
            cyVar.G = false;
        }
        for (int i11 = 0; i11 < 3; i11++) {
            View view3 = this.z0;
            View view4 = this.d0;
            bw bwVar = this.k0;
            View view5 = this.L;
            if (i11 == 0) {
                kyVar = this.R;
                k0Var = this.M;
                view = this.E;
                view2 = view5;
            } else if (i11 == 1) {
                k0Var = this.e0;
                view = this.l0;
                view2 = view4;
                kyVar = bwVar;
            } else {
                kyVar = this.C0;
                k0Var = this.A0;
                view = this.x0;
                view2 = view3;
            }
            if (kyVar != null) {
                jy jyVar = kyVar.r;
                kyVar.d.setText("");
                if (jyVar != null) {
                    jyVar.F1(null);
                    jyVar.D1();
                }
                int i12 = this.X0;
                if (i11 == currentItem && z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.I0 = animatorSet2;
                    Property property = View.TRANSLATION_Y;
                    if (view == null || i11 == 1) {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, AndroidUtilities.dp(36.0f) - i12));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, AndroidUtilities.dp(36.0f)), ObjectAnimator.ofFloat(kyVar, (Property<ky, Float>) property, AndroidUtilities.dp(36.0f)));
                    }
                    this.I0.setDuration(200L);
                    this.I0.setInterpolator(er.h);
                    this.I0.addListener(new jh.h3(this, k0Var, view2, 5));
                    this.I0.start();
                } else {
                    if (kyVar != bwVar) {
                        kyVar.setTranslationY(AndroidUtilities.dp(36.0f) - i12);
                    }
                    if (view != null && i11 != 2) {
                        view.setTranslationY(0.0f);
                    }
                    if (view2 == view3) {
                        i10 = 0;
                        view2.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + this.m2);
                    } else {
                        i10 = 0;
                        if (view2 == view4) {
                            view2.setPadding(0, AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(44.0f) + this.m2);
                        } else {
                            if (view2 == view5) {
                                view2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + this.m2);
                            }
                            i10 = 0;
                        }
                    }
                    k0Var.h1(i10, i10);
                }
            }
        }
        if (z10) {
            return;
        }
        this.p1.i(0);
    }

    public final void u(boolean z10) {
        t(-1L, z10);
    }

    public final void v(boolean z10) {
        py pyVar;
        boolean z11 = this.J2;
        this.J2 = z10;
        if (!z11 || z10) {
            return;
        }
        int i10 = this.w1;
        if (i10 == 0) {
            gx gxVar = this.N;
            if (gxVar != null) {
                gxVar.F(false);
                return;
            }
            return;
        }
        if (i10 == 1) {
            cy cyVar = this.j0;
            if (cyVar != null) {
                cyVar.l();
                return;
            }
            return;
        }
        if (i10 != 2 || (pyVar = this.u0) == null) {
            return;
        }
        pyVar.l();
    }

    public final int w(float f10) {
        return i0.b.k(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Wk, this.V1), (int) (f10 * 255.0f));
    }

    public final f2.x x(int i10) {
        if (i10 == 0) {
            return this.A0;
        }
        if (i10 == 1) {
            return this.M;
        }
        if (i10 == 2) {
            return this.e0;
        }
        throw new IllegalArgumentException(i0.a.k(i10, "Unexpected argument: "));
    }

    public final zk0 y(int i10) {
        if (i10 == 0) {
            return this.z0;
        }
        if (i10 == 1) {
            return this.L;
        }
        if (i10 == 2) {
            return this.d0;
        }
        throw new IllegalArgumentException(i0.a.k(i10, "Unexpected argument: "));
    }

    public final HorizontalScrollView z(int i10) {
        if (i10 == 0) {
            return this.x0;
        }
        if (i10 == 1) {
            return this.E;
        }
        if (i10 == 2) {
            return this.l0;
        }
        throw new IllegalArgumentException(i0.a.k(i10, "Unexpected argument: "));
    }

    @Override // ud.b
    public final void A(float f10, int i10) {
    }
}
