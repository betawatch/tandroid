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
import org.telegram.ui.ta1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class wy extends FrameLayout implements td.b, NotificationCenter.NotificationCenterDelegate, xg.a {
    public static final /* synthetic */ int K2 = 0;
    public final ImageView A;
    public final gw A0;
    public int A1;
    public int A2;
    public AnimatorSet B;
    public uy B0;
    public int B1;
    public long B2;
    public AnimatorSet C;
    public final iw C0;
    public int C1;
    public final td.a C2;
    public float D;
    public final vg.e D0;
    public int D1;
    public ArrayList D2;
    public final vv E;
    public boolean E0;
    public int E1;
    public boolean E2;
    public final vw F;
    public boolean F0;
    public TLRPC.ChatFull F1;
    public AnimatorSet F2;
    public final vg.c G;
    public boolean G0;
    public boolean G1;
    public org.telegram.messenger.video.l G2;
    public final vg.b H;
    public final px H0;
    public int H1;
    public final ov H2;
    public final vg.c I;
    public AnimatorSet I0;
    public final ff.p0 I1;
    public boolean I2;
    public final vg.b J;
    public final bg.t J0;
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
    public final fx N;
    public final ObjectAnimator[] N0;
    public fy N1;
    public final vx O;
    public boolean O0;
    public float O1;
    public uy P;
    public of.b1 P0;
    public float P1;
    public final vg.e Q;
    public boolean Q0;
    public float Q1;
    public final wv R;
    public boolean R0;
    public float R1;
    public AnimatorSet S;
    public String[] S0;
    public float S1;
    public final c2.y T;
    public final Drawable[] T0;
    public boolean T1;
    public final c2.y U;
    public final Drawable[] U0;
    public final org.telegram.ui.ActionBar.o2 U1;
    public boolean V;
    public final Drawable[] V0;
    public final org.telegram.ui.ActionBar.b6 V1;
    public final boolean W;
    public final String[] W0;
    public final org.telegram.ui.ActionBar.r5 W1;
    public final int X0;
    public final org.telegram.ui.ActionBar.r5 X1;
    public final int Y0;
    public final boolean Y1;
    public final ArrayList Z0;
    public LongSparseArray Z1;
    public final td.a a;
    public boolean a0;
    public int a1;
    public PorterDuffColorFilter a2;
    public final td.a b;
    public boolean b0;
    public int b1;
    public final m.i3 b2;
    public int c;
    public final yv c0;
    public boolean c1;
    public final pw c2;
    public final ArrayList d;
    public final zv d0;
    public TLRPC.TL_messages_stickerSet d1;
    public boolean d2;
    public final ArrayList e;
    public final cy e0;
    public ArrayList e1;
    public final boolean e2;
    public boolean f;
    public final ay f0;
    public ArrayList f1;
    public final ig.e f2;
    public final ey g0;
    public ArrayList g1;
    public final ah g2;
    public final lw h;
    public final HashMap h0;
    public ArrayList h1;
    public final ng.d h2;
    public final tv i0;
    public final ArrayList i1;
    public final ng.c i2;
    public final ay j0;
    public final ArrayList j1;
    public final ig.a j2;
    public final cw k0;
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
    public wx p1;
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
    public final dw t0;
    public final TLRPC.StickerSetCovered[] t1;
    public boolean t2;
    public final ny u0;
    public final LongSparseArray u1;
    public final Rect u2;
    public final View v;
    public final ry v0;
    public final LongSparseArray v1;
    public final RectF v2;
    public final kc0 w;
    public final tv w0;
    public int w1;
    public final ArrayList w2;
    public final mw x;
    public final jw x0;
    public final iu x1;
    public final GradientDrawable x2;
    public final ImageView y;
    public final kw y0;
    public final int y1;
    public int y2;
    public final fw z0;
    public final int[] z1;
    public ArrayList z2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v15, types: [org.telegram.ui.Components.mk0, org.telegram.ui.Components.tv] */
    /* JADX WARN: Type inference failed for: r4v57, types: [org.telegram.ui.Components.mk0, org.telegram.ui.Components.tv] */
    public wy(org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11, boolean z12, Context context, boolean z13, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z14, final org.telegram.ui.ActionBar.b6 b6Var, boolean z15, boolean z16) {
        super(context);
        org.telegram.ui.ActionBar.r5 r5Var;
        int z17;
        Context context2;
        vw vwVar;
        ov ovVar;
        boolean z18;
        Field field;
        gr grVar = gr.h;
        this.a = new td.a(0, this, grVar, 320L, false);
        this.b = new td.a(1, this, grVar, 320L, false);
        this.c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = new ArrayList();
        this.V = true;
        this.g0 = new ey(this);
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
        int i9 = UserConfig.selectedAccount;
        this.Y0 = i9;
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
        this.C2 = new td.a(0, new rv(this, 1), grVar, 380L, true);
        this.H2 = new ov(this, 2);
        this.I2 = false;
        this.q0 = z14;
        this.U1 = o2Var;
        this.Y1 = z10;
        this.V1 = b6Var;
        this.e2 = z16;
        ng.c cVar = new ng.c();
        this.i2 = cVar;
        cVar.a(z(org.telegram.ui.ActionBar.f6.d6));
        if (z15) {
            u(true);
        }
        i0.a.k(z(org.telegram.ui.ActionBar.f6.Wk), 30);
        int dp = AndroidUtilities.dp(50.0f);
        this.X0 = dp;
        this.W = z13;
        this.T0 = new Drawable[]{org.telegram.ui.ActionBar.f6.U(context, R.drawable.smiles_tab_smiles, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.f6.Re), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.f6.Oe)), org.telegram.ui.ActionBar.f6.U(context, R.drawable.smiles_tab_gif, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.f6.Re), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.f6.Oe)), org.telegram.ui.ActionBar.f6.U(context, R.drawable.smiles_tab_stickers, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.f6.Re), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.f6.Oe))};
        org.telegram.ui.ActionBar.r5 U = org.telegram.ui.ActionBar.f6.U(context, R.drawable.msg_emoji_recent, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.f6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.f6.Oe));
        org.telegram.ui.ActionBar.r5 U2 = org.telegram.ui.ActionBar.f6.U(context, R.drawable.emoji_tabs_faves, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.f6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.f6.Oe));
        org.telegram.ui.ActionBar.r5 U3 = org.telegram.ui.ActionBar.f6.U(context, R.drawable.emoji_tabs_new3, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.f6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.f6.Oe));
        int i10 = R.drawable.emoji_tabs_new1;
        if (z16) {
            r5Var = U3;
            z17 = v(0.4f);
        } else {
            r5Var = U3;
            z17 = z(org.telegram.ui.ActionBar.f6.Me);
        }
        org.telegram.ui.ActionBar.r5 U4 = org.telegram.ui.ActionBar.f6.U(context, i10, z17, z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.f6.Oe));
        this.W1 = U4;
        int i11 = R.drawable.emoji_tabs_new2;
        int i12 = org.telegram.ui.ActionBar.f6.Qe;
        org.telegram.ui.ActionBar.r5 U5 = org.telegram.ui.ActionBar.f6.U(context, i11, z(i12), z(i12));
        this.X1 = U5;
        this.U0 = new Drawable[]{U, U2, r5Var, new LayerDrawable(new Drawable[]{U4, U5})};
        this.V0 = new Drawable[]{org.telegram.ui.ActionBar.f6.U(context, R.drawable.msg_emoji_recent, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.f6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.f6.Oe)), org.telegram.ui.ActionBar.f6.U(context, R.drawable.stickers_gifs_trending, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.f6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.f6.Oe))};
        this.W0 = new String[]{LocaleController.getString(R.string.Emoji1), LocaleController.getString(R.string.Emoji2), LocaleController.getString(R.string.Emoji3), LocaleController.getString(R.string.Emoji4), LocaleController.getString(R.string.Emoji5), LocaleController.getString(R.string.Emoji6), LocaleController.getString(R.string.Emoji7), LocaleController.getString(R.string.Emoji8)};
        this.F1 = chatFull;
        Paint paint = new Paint(1);
        this.o1 = paint;
        paint.setColor(z(org.telegram.ui.ActionBar.f6.af));
        float dp2 = AndroidUtilities.dp(6.0f);
        bg.q1 q1Var = ff.r0.a;
        this.I1 = new ff.p0(dp2);
        vw vwVar2 = new vw(this, context);
        this.F = vwVar2;
        sy syVar = new sy();
        syVar.a = 0;
        syVar.b = vwVar2;
        arrayList.add(syVar);
        if (z10) {
            MediaDataController.getInstance(i9).checkStickers(5);
            MediaDataController.getInstance(i9).checkFeaturedEmoji();
            this.a2 = new PorterDuffColorFilter(z(org.telegram.ui.ActionBar.f6.Oh), PorterDuff.Mode.SRC_IN);
        }
        ww wwVar = new ww(this, context);
        this.L = wwVar;
        f2.n nVar = new f2.n();
        nVar.c = 220L;
        nVar.e = 220L;
        nVar.f = 160L;
        nVar.g = 160L;
        nVar.i = gr.g;
        wwVar.setItemAnimator(nVar);
        final int i13 = 0;
        wwVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.qv
            public final /* synthetic */ wy b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (i13) {
                    case 0:
                        org.telegram.ui.ht q10 = org.telegram.ui.ht.q();
                        wy wyVar = this.b;
                        ww wwVar2 = wyVar.L;
                        wyVar.getMeasuredHeight();
                        return q10.s(motionEvent, wwVar2, null, wyVar.c2, b6Var);
                    case 1:
                        org.telegram.ui.ht q11 = org.telegram.ui.ht.q();
                        wy wyVar2 = this.b;
                        return q11.s(motionEvent, wyVar2.d0, wyVar2.i0, wyVar2.c2, b6Var);
                    default:
                        org.telegram.ui.ht q12 = org.telegram.ui.ht.q();
                        wy wyVar3 = this.b;
                        fw fwVar = wyVar3.z0;
                        wyVar3.getMeasuredHeight();
                        return q12.s(motionEvent, fwVar, wyVar3.w0, wyVar3.c2, b6Var);
                }
            }
        });
        wwVar.setOnItemLongClickListener(new rv(this, i13));
        wwVar.setInstantClick(true);
        xw xwVar = new xw(this);
        this.M = xwVar;
        wwVar.setLayoutManager(xwVar);
        wwVar.setTopGlowOffset(AndroidUtilities.dp(38.0f));
        wwVar.setBottomGlowOffset(AndroidUtilities.dp(36.0f));
        wwVar.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f));
        int i14 = org.telegram.ui.ActionBar.f6.He;
        wwVar.setGlowColor(z(i14));
        wwVar.setItemSelectorColorProvider(new g2(16));
        wwVar.setClipToPadding(false);
        xwVar.O = new yw(this);
        fx fxVar = new fx(this);
        this.N = fxVar;
        wwVar.setAdapter(fxVar);
        wwVar.i(new bg.p2(this, 4));
        this.O = new vx(this, context);
        vwVar2.addView(wwVar, g7.e6.c(-1.0f, -1));
        c2.y yVar = new c2.y(wwVar, xwVar);
        this.U = yVar;
        yVar.i = new zw(this);
        wwVar.setOnScrollListener(new ax(this));
        if (o2Var != null) {
            ovVar = new ov(this, 5);
            context2 = context;
            vwVar = vwVar2;
        } else {
            context2 = context;
            vwVar = vwVar2;
            ovVar = null;
        }
        vv vvVar = new vv(this, context2, b6Var, z10, ovVar, z16);
        this.E = vvVar;
        if (z13) {
            wv wvVar = new wv(this, context2);
            this.R = wvVar;
            vwVar.addView(wvVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
            wvVar.d.setOnFocusChangeListener(new xv(this));
            vg.e eVar = new vg.e(context2, b6Var);
            this.Q = eVar;
            eVar.setVisibility(8);
            final int i15 = 0;
            eVar.setOnBackClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sv
                public final /* synthetic */ wy b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i15) {
                        case 0:
                            vx vxVar = this.b.O;
                            qx qxVar = vxVar.c;
                            int childCount = qxVar.getChildCount();
                            for (int i16 = 0; i16 < childCount; i16++) {
                                ((vg.d) qxVar.getChildAt(i16)).a(false, true);
                            }
                            vxVar.d = 0L;
                            vxVar.B.b.a(false, true);
                            vxVar.l();
                            break;
                        case 1:
                            ry ryVar = this.b.v0;
                            qy qyVar = ryVar.c;
                            int childCount2 = qyVar.getChildCount();
                            for (int i17 = 0; i17 < childCount2; i17++) {
                                ((vg.d) qyVar.getChildAt(i17)).a(false, true);
                            }
                            ryVar.d = 0L;
                            ryVar.M.a.a(false, true);
                            ryVar.l();
                            break;
                        case 2:
                            wx wxVar = this.b.p1;
                            if (wxVar != null) {
                                wxVar.w();
                                break;
                            }
                            break;
                        default:
                            wy wyVar = this.b;
                            int currentItem = wyVar.h.getCurrentItem();
                            jy jyVar = currentItem == 0 ? wyVar.R : currentItem == 1 ? wyVar.k0 : wyVar.C0;
                            if (jyVar != null) {
                                yp ypVar = jyVar.d;
                                ypVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                ypVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                ypVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
            vwVar.addView(eVar, new FrameLayout.LayoutParams(-1, dp));
        }
        int z19 = z(i14);
        if (Color.alpha(z19) >= 255) {
            vvVar.setBackgroundColor(z19);
        }
        fxVar.G(true);
        vvVar.p(getEmojipacks());
        vwVar.addView(vvVar, g7.e6.c(36.0f, -1));
        View view = new View(context2);
        this.K = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i16 = org.telegram.ui.ActionBar.f6.Ke;
        view.setBackgroundColor(z(i16));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(36.0f);
        vwVar.addView(view, layoutParams);
        vg.b bVar = new vg.b(context2, b6Var);
        this.H = bVar;
        vg.c cVar2 = new vg.c(context2, b6Var);
        this.G = cVar2;
        cVar2.setVisibility(8);
        cVar2.addView(bVar, g7.e6.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
        vwVar.addView(cVar2, g7.e6.e(-1, -2, 80));
        if (z11) {
            rl0 rl0Var = rl0.b;
            if (z12) {
                yv yvVar = new yv(this, context2);
                this.c0 = yvVar;
                sy syVar2 = new sy();
                syVar2.a = 1;
                syVar2.b = yvVar;
                this.d.add(syVar2);
                zv zvVar = new zv(this, context2);
                this.d0 = zvVar;
                zvVar.setClipToPadding(false);
                cy cyVar = new cy(this);
                this.e0 = cyVar;
                zvVar.setLayoutManager(cyVar);
                zvVar.i(new aw(this));
                zvVar.setPadding(0, dp, 0, AndroidUtilities.dp(44.0f) + this.m2);
                zvVar.setOverScrollMode(2);
                ((f2.t1) zvVar.getItemAnimator()).m = false;
                ay ayVar = new ay(this, context2, true, ConnectionsManager.DEFAULT_DATACENTER_ID);
                this.j0 = ayVar;
                zvVar.setAdapter(ayVar);
                this.f0 = new ay(this, context2, false, 0);
                zvVar.setOnScrollListener(new bw(this));
                final int i17 = 1;
                zvVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.qv
                    public final /* synthetic */ wy b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (i17) {
                            case 0:
                                org.telegram.ui.ht q10 = org.telegram.ui.ht.q();
                                wy wyVar = this.b;
                                ww wwVar2 = wyVar.L;
                                wyVar.getMeasuredHeight();
                                return q10.s(motionEvent, wwVar2, null, wyVar.c2, b6Var);
                            case 1:
                                org.telegram.ui.ht q11 = org.telegram.ui.ht.q();
                                wy wyVar2 = this.b;
                                return q11.s(motionEvent, wyVar2.d0, wyVar2.i0, wyVar2.c2, b6Var);
                            default:
                                org.telegram.ui.ht q12 = org.telegram.ui.ht.q();
                                wy wyVar3 = this.b;
                                fw fwVar = wyVar3.z0;
                                wyVar3.getMeasuredHeight();
                                return q12.s(motionEvent, fwVar, wyVar3.w0, wyVar3.c2, b6Var);
                        }
                    }
                });
                final int i18 = 0;
                ?? r11 = new mk0(this) { // from class: org.telegram.ui.Components.tv
                    public final /* synthetic */ wy b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.ui.Components.mk0
                    public final void a(int i19, View view2) {
                        switch (i18) {
                            case 0:
                                wy wyVar = this.b;
                                zv zvVar2 = wyVar.d0;
                                ay ayVar2 = wyVar.f0;
                                ay ayVar3 = wyVar.j0;
                                if (wyVar.p1 != null) {
                                    ayVar3.getClass();
                                    ArrayList arrayList3 = ayVar3.x;
                                    if (zvVar2.getAdapter() != ayVar3) {
                                        if (zvVar2.getAdapter() == ayVar2 && i19 >= 0 && i19 < ayVar2.x.size()) {
                                            wyVar.p1.v(view2, ayVar2.x.get(i19), ayVar2.w, ayVar2.n, true, 0, 0);
                                            wyVar.X();
                                            break;
                                        }
                                    } else if (i19 >= 0) {
                                        int i20 = ayVar3.D;
                                        if (i19 >= i20) {
                                            int i21 = i20 > 0 ? (i19 - i20) - 1 : i19;
                                            if (i21 >= 0 && i21 < arrayList3.size()) {
                                                wyVar.p1.v(view2, arrayList3.get(i21), null, ayVar3.n, true, 0, 0);
                                                break;
                                            }
                                        } else {
                                            wyVar.p1.v(view2, wyVar.e1.get(i19), null, "gif", true, 0, 0);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                wy wyVar2 = this.b;
                                f2.r0 adapter = wyVar2.z0.getAdapter();
                                ry ryVar = wyVar2.v0;
                                String str = adapter == ryVar ? ryVar.J : null;
                                if (view2 instanceof org.telegram.ui.Cells.d8) {
                                    org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view2;
                                    if (d8Var.getSticker() != null && MessageObject.isPremiumSticker(d8Var.getSticker()) && !AccountInstance.getInstance(wyVar2.Y0).getUserConfig().isPremium()) {
                                        org.telegram.ui.ht.q().y(d8Var);
                                        break;
                                    } else {
                                        org.telegram.ui.ht.q().u();
                                        if (!d8Var.r) {
                                            d8Var.r = true;
                                            d8Var.n = 0.5f;
                                            d8Var.x = 0L;
                                            org.telegram.ui.Cells.c8 c8Var = d8Var.a;
                                            c8Var.setAlpha(0.5f * d8Var.D);
                                            c8Var.invalidate();
                                            d8Var.s = System.currentTimeMillis();
                                            d8Var.invalidate();
                                            wyVar2.p1.m(d8Var, d8Var.getSticker(), str, d8Var.getParentObject(), d8Var.getSendAnimationData(), true, 0);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                };
                this.i0 = r11;
                zvVar.setOnItemClickListener((mk0) r11);
                yvVar.addView(zvVar, g7.e6.c(-1.0f, -1));
                cw cwVar = new cw(this, context2);
                this.k0 = cwVar;
                yvVar.addView(cwVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
                dx dxVar = new dx(this, context2, b6Var);
                this.l0 = dxVar;
                dxVar.setType(rl0Var);
                dxVar.setUnderlineHeight(AndroidUtilities.getShadowHeight());
                dxVar.setIndicatorColor(z(i12));
                dxVar.setUnderlineColor(z(i16));
                dxVar.setBackgroundColor(z(i14));
                W();
                dxVar.setDelegate(new rv(this, 2));
                ayVar.F("", "", true, true, true);
            }
            dw dwVar = new dw(this, context2, z14);
            this.t0 = dwVar;
            MediaDataController.getInstance(this.Y0).checkStickers(0);
            MediaDataController.getInstance(this.Y0).checkFeaturedStickers();
            fw fwVar = new fw(this, context2);
            this.z0 = fwVar;
            gw gwVar = new gw(this);
            this.A0 = gwVar;
            fwVar.setLayoutManager(gwVar);
            gwVar.O = new hw(this);
            fwVar.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f));
            fwVar.setClipToPadding(false);
            sy syVar3 = new sy();
            syVar3.a = 2;
            syVar3.b = dwVar;
            this.d.add(syVar3);
            this.v0 = new ry(this, context2);
            ny nyVar = new ny(this, context2);
            this.u0 = nyVar;
            fwVar.setAdapter(nyVar);
            final int i19 = 2;
            fwVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.qv
                public final /* synthetic */ wy b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (i19) {
                        case 0:
                            org.telegram.ui.ht q10 = org.telegram.ui.ht.q();
                            wy wyVar = this.b;
                            ww wwVar2 = wyVar.L;
                            wyVar.getMeasuredHeight();
                            return q10.s(motionEvent, wwVar2, null, wyVar.c2, b6Var);
                        case 1:
                            org.telegram.ui.ht q11 = org.telegram.ui.ht.q();
                            wy wyVar2 = this.b;
                            return q11.s(motionEvent, wyVar2.d0, wyVar2.i0, wyVar2.c2, b6Var);
                        default:
                            org.telegram.ui.ht q12 = org.telegram.ui.ht.q();
                            wy wyVar3 = this.b;
                            fw fwVar2 = wyVar3.z0;
                            wyVar3.getMeasuredHeight();
                            return q12.s(motionEvent, fwVar2, wyVar3.w0, wyVar3.c2, b6Var);
                    }
                }
            });
            final int i20 = 1;
            ?? r42 = new mk0(this) { // from class: org.telegram.ui.Components.tv
                public final /* synthetic */ wy b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.Components.mk0
                public final void a(int i192, View view2) {
                    switch (i20) {
                        case 0:
                            wy wyVar = this.b;
                            zv zvVar2 = wyVar.d0;
                            ay ayVar2 = wyVar.f0;
                            ay ayVar3 = wyVar.j0;
                            if (wyVar.p1 != null) {
                                ayVar3.getClass();
                                ArrayList arrayList3 = ayVar3.x;
                                if (zvVar2.getAdapter() != ayVar3) {
                                    if (zvVar2.getAdapter() == ayVar2 && i192 >= 0 && i192 < ayVar2.x.size()) {
                                        wyVar.p1.v(view2, ayVar2.x.get(i192), ayVar2.w, ayVar2.n, true, 0, 0);
                                        wyVar.X();
                                        break;
                                    }
                                } else if (i192 >= 0) {
                                    int i202 = ayVar3.D;
                                    if (i192 >= i202) {
                                        int i21 = i202 > 0 ? (i192 - i202) - 1 : i192;
                                        if (i21 >= 0 && i21 < arrayList3.size()) {
                                            wyVar.p1.v(view2, arrayList3.get(i21), null, ayVar3.n, true, 0, 0);
                                            break;
                                        }
                                    } else {
                                        wyVar.p1.v(view2, wyVar.e1.get(i192), null, "gif", true, 0, 0);
                                        break;
                                    }
                                }
                            }
                            break;
                        default:
                            wy wyVar2 = this.b;
                            f2.r0 adapter = wyVar2.z0.getAdapter();
                            ry ryVar = wyVar2.v0;
                            String str = adapter == ryVar ? ryVar.J : null;
                            if (view2 instanceof org.telegram.ui.Cells.d8) {
                                org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view2;
                                if (d8Var.getSticker() != null && MessageObject.isPremiumSticker(d8Var.getSticker()) && !AccountInstance.getInstance(wyVar2.Y0).getUserConfig().isPremium()) {
                                    org.telegram.ui.ht.q().y(d8Var);
                                    break;
                                } else {
                                    org.telegram.ui.ht.q().u();
                                    if (!d8Var.r) {
                                        d8Var.r = true;
                                        d8Var.n = 0.5f;
                                        d8Var.x = 0L;
                                        org.telegram.ui.Cells.c8 c8Var = d8Var.a;
                                        c8Var.setAlpha(0.5f * d8Var.D);
                                        c8Var.invalidate();
                                        d8Var.s = System.currentTimeMillis();
                                        d8Var.invalidate();
                                        wyVar2.p1.m(d8Var, d8Var.getSticker(), str, d8Var.getParentObject(), d8Var.getSendAnimationData(), true, 0);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            };
            this.w0 = r42;
            fwVar.setOnItemClickListener((mk0) r42);
            fwVar.setGlowColor(z(i14));
            dwVar.addView(fwVar);
            this.T = new c2.y(fwVar, gwVar);
            iw iwVar = new iw(this, context2);
            this.C0 = iwVar;
            dwVar.addView(iwVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
            vg.e eVar2 = new vg.e(context2, b6Var);
            this.D0 = eVar2;
            eVar2.setVisibility(8);
            final int i21 = 1;
            eVar2.setOnBackClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sv
                public final /* synthetic */ wy b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i21) {
                        case 0:
                            vx vxVar = this.b.O;
                            qx qxVar = vxVar.c;
                            int childCount = qxVar.getChildCount();
                            for (int i162 = 0; i162 < childCount; i162++) {
                                ((vg.d) qxVar.getChildAt(i162)).a(false, true);
                            }
                            vxVar.d = 0L;
                            vxVar.B.b.a(false, true);
                            vxVar.l();
                            break;
                        case 1:
                            ry ryVar = this.b.v0;
                            qy qyVar = ryVar.c;
                            int childCount2 = qyVar.getChildCount();
                            for (int i172 = 0; i172 < childCount2; i172++) {
                                ((vg.d) qyVar.getChildAt(i172)).a(false, true);
                            }
                            ryVar.d = 0L;
                            ryVar.M.a.a(false, true);
                            ryVar.l();
                            break;
                        case 2:
                            wx wxVar = this.b.p1;
                            if (wxVar != null) {
                                wxVar.w();
                                break;
                            }
                            break;
                        default:
                            wy wyVar = this.b;
                            int currentItem = wyVar.h.getCurrentItem();
                            jy jyVar = currentItem == 0 ? wyVar.R : currentItem == 1 ? wyVar.k0 : wyVar.C0;
                            if (jyVar != null) {
                                yp ypVar = jyVar.d;
                                ypVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                ypVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                ypVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
            dwVar.addView(eVar2, new FrameLayout.LayoutParams(-1, dp));
            z18 = z14;
            jw jwVar = new jw(this, context2, b6Var, o2Var, z18);
            this.x0 = jwVar;
            jwVar.setDragEnabled(true);
            jwVar.setWillNotDraw(false);
            jwVar.setType(rl0Var);
            jwVar.setUnderlineHeight(fwVar.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
            jwVar.setIndicatorColor(z(i12));
            jwVar.setUnderlineColor(z(i16));
            if (viewGroup == null || !z18) {
                dwVar.addView(jwVar, g7.e6.e(-1, 36, 51));
            } else {
                kw kwVar = new kw(this, context2);
                this.y0 = kwVar;
                kwVar.addView(jwVar, g7.e6.e(-1, 36, 51));
                viewGroup.addView(kwVar, g7.e6.c(-2.0f, -1));
            }
            Y(true);
            jwVar.setDelegate(new rv(this, 3));
            fwVar.setOnScrollListener(new vy(this, 0));
            vg.b bVar2 = new vg.b(context2, b6Var);
            this.J = bVar2;
            vg.c cVar3 = new vg.c(context2, b6Var);
            this.I = cVar3;
            cVar3.setVisibility(8);
            cVar3.addView(bVar2, g7.e6.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
            dwVar.addView(cVar3, g7.e6.e(-1, -2, 80));
        } else {
            z18 = z14;
        }
        this.e.clear();
        this.e.addAll(this.d);
        lw lwVar = new lw(this, context2);
        this.h = lwVar;
        px pxVar = new px(this);
        this.H0 = pxVar;
        lwVar.setAdapter(pxVar);
        mw mwVar = new mw(this, context2);
        this.x = mwVar;
        mwVar.setHapticFeedbackEnabled(true);
        mwVar.setImageResource(R.drawable.smiles_tab_clear);
        int v = z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.f6.Re);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mwVar.setColorFilter(new PorterDuffColorFilter(v, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        mwVar.setScaleType(scaleType);
        mwVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        mwVar.setFocusable(true);
        mwVar.setOnClickListener(new nw());
        g7.g6.a(mwVar);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.r = frameLayout;
        if (z13) {
            addView(frameLayout, g7.e6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, (AndroidUtilities.getShadowHeight() / AndroidUtilities.density) + 40.0f));
        } else {
            addView(frameLayout, g7.e6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.s = frameLayout2;
        addView(frameLayout2, g7.e6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.n = frameLayout3;
        View view2 = new View(context2);
        this.v = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(40.0f), 83));
        if (z13) {
            addView(frameLayout3, g7.e6.e(-1, 48, 80));
            frameLayout3.addView(mwVar, g7.e6.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
            if (z11) {
                ImageView imageView = new ImageView(context2);
                this.y = imageView;
                imageView.setImageResource(R.drawable.smiles_tab_settings);
                imageView.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.f6.Re), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(LocaleController.getString(R.string.Settings));
                g7.g6.a(imageView);
                frameLayout3.addView(imageView, g7.e6.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
                final int i22 = 2;
                imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sv
                    public final /* synthetic */ wy b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i22) {
                            case 0:
                                vx vxVar = this.b.O;
                                qx qxVar = vxVar.c;
                                int childCount = qxVar.getChildCount();
                                for (int i162 = 0; i162 < childCount; i162++) {
                                    ((vg.d) qxVar.getChildAt(i162)).a(false, true);
                                }
                                vxVar.d = 0L;
                                vxVar.B.b.a(false, true);
                                vxVar.l();
                                break;
                            case 1:
                                ry ryVar = this.b.v0;
                                qy qyVar = ryVar.c;
                                int childCount2 = qyVar.getChildCount();
                                for (int i172 = 0; i172 < childCount2; i172++) {
                                    ((vg.d) qyVar.getChildAt(i172)).a(false, true);
                                }
                                ryVar.d = 0L;
                                ryVar.M.a.a(false, true);
                                ryVar.l();
                                break;
                            case 2:
                                wx wxVar = this.b.p1;
                                if (wxVar != null) {
                                    wxVar.w();
                                    break;
                                }
                                break;
                            default:
                                wy wyVar = this.b;
                                int currentItem = wyVar.h.getCurrentItem();
                                jy jyVar = currentItem == 0 ? wyVar.R : currentItem == 1 ? wyVar.k0 : wyVar.C0;
                                if (jyVar != null) {
                                    yp ypVar = jyVar.d;
                                    ypVar.requestFocus();
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                    ypVar.onTouchEvent(obtain);
                                    obtain.recycle();
                                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                    ypVar.onTouchEvent(obtain2);
                                    obtain2.recycle();
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
            kc0 kc0Var = new kc0(context2, b6Var);
            this.w = kc0Var;
            kc0Var.setViewPager(lwVar);
            kc0Var.setShouldExpand(false);
            kc0Var.setIndicatorHeight(AndroidUtilities.dp(3.0f));
            kc0Var.setIndicatorColor(i0.a.k(z(org.telegram.ui.ActionBar.f6.Oe), 20));
            kc0Var.setUnderlineHeight(0);
            kc0Var.setTabPaddingLeftRight(AndroidUtilities.dp(11.0f));
            kc0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
            frameLayout3.addView(kc0Var, g7.e6.e(-2, 48, 81));
            kc0Var.setOnPageChangeListener(new ow(this, z18));
            ImageView imageView2 = new ImageView(context2);
            this.A = imageView2;
            imageView2.setImageResource(R.drawable.smiles_tab_search);
            imageView2.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.f6.Re), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(LocaleController.getString(R.string.Search));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, g7.e6.d(48, 48.0f, 83, 2.0f, 0.0f, 2.0f, 0.0f));
            final int i23 = 3;
            imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sv
                public final /* synthetic */ wy b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view22) {
                    switch (i23) {
                        case 0:
                            vx vxVar = this.b.O;
                            qx qxVar = vxVar.c;
                            int childCount = qxVar.getChildCount();
                            for (int i162 = 0; i162 < childCount; i162++) {
                                ((vg.d) qxVar.getChildAt(i162)).a(false, true);
                            }
                            vxVar.d = 0L;
                            vxVar.B.b.a(false, true);
                            vxVar.l();
                            break;
                        case 1:
                            ry ryVar = this.b.v0;
                            qy qyVar = ryVar.c;
                            int childCount2 = qyVar.getChildCount();
                            for (int i172 = 0; i172 < childCount2; i172++) {
                                ((vg.d) qyVar.getChildAt(i172)).a(false, true);
                            }
                            ryVar.d = 0L;
                            ryVar.M.a.a(false, true);
                            ryVar.l();
                            break;
                        case 2:
                            wx wxVar = this.b.p1;
                            if (wxVar != null) {
                                wxVar.w();
                                break;
                            }
                            break;
                        default:
                            wy wyVar = this.b;
                            int currentItem = wyVar.h.getCurrentItem();
                            jy jyVar = currentItem == 0 ? wyVar.R : currentItem == 1 ? wyVar.k0 : wyVar.C0;
                            if (jyVar != null) {
                                yp ypVar = jyVar.d;
                                ypVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                ypVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                ypVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            addView(frameLayout3, g7.e6.d(56, 48.0f, (LocaleController.isRTL ? 3 : 5) | 80, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.f6.h0(AndroidUtilities.dp(56.0f), z(i14), z(i14));
            g7.g6.a(mwVar);
            mwVar.setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
            mwVar.setBackground(h02);
            mwVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
            mwVar.setFocusable(true);
            frameLayout3.addView(mwVar, g7.e6.d(48, 48.0f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
            view2.setVisibility(8);
        }
        addView(lwVar, 0, g7.e6.e(-1, -1, 51));
        bg.t tVar = new bg.t(context2, 23);
        this.J0 = tVar;
        tVar.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(6.0f), z(org.telegram.ui.ActionBar.f6.qf)));
        tVar.setTextColor(z(org.telegram.ui.ActionBar.f6.pf));
        tVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f));
        tVar.setGravity(16);
        tVar.setTextSize(1, 14.0f);
        int i24 = 4;
        tVar.setVisibility(4);
        addView(tVar, g7.e6.d(-2, -2.0f, 81, 5.0f, 0.0f, 5.0f, 53.0f));
        this.y1 = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 32.0f);
        Field field2 = iu.f;
        iu iuVar = new iu(new hu(context2, b6Var));
        if (iu.f == null) {
            try {
                field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    field.setAccessible(true);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                field = null;
            }
            iu.f = field;
        }
        Field field3 = iu.f;
        if (field3 != null) {
            try {
                iuVar.a = (ViewTreeObserver.OnScrollChangedListener) field3.get(iuVar);
                iu.f.set(iuVar, iu.g);
            } catch (Exception unused3) {
                iuVar.a = null;
            }
        }
        this.x1 = iuVar;
        iuVar.c.setOnSelectionUpdateListener(new d(this, 10));
        this.w1 = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
        Emoji.loadRecentEmoji();
        fxVar.F(false);
        J(true, z11, z12, false);
        if (Build.VERSION.SDK_INT >= 31) {
            ng.d dVar = new ng.d(null);
            this.h2 = dVar;
            ig.a aVar = new ig.a(dVar);
            this.j2 = aVar;
            aVar.f = LiteMode.isEnabled(262144);
            this.f2 = new ig.e(false);
        } else {
            this.h2 = null;
            this.j2 = new ig.a(this.i2);
            this.f2 = null;
        }
        pg.i iVar = new pg.i(this);
        kc0 kc0Var2 = this.w;
        if (kc0Var2 != null) {
            iVar.d(kc0Var2, this, new rv(this, i24), false);
        }
        ig.a aVar2 = this.j2;
        aVar2.d = iVar;
        aVar2.e = this;
        jg.a[] aVarArr = new jg.a[3];
        wwVar.C0(new ov(this, 1));
        aVarArr[0] = new ig.k(wwVar, this, new pv(wwVar, 0));
        zv zvVar2 = this.d0;
        if (zvVar2 != null) {
            zvVar2.C0(new ov(this, 3));
            zv zvVar3 = this.d0;
            Objects.requireNonNull(zvVar3);
            aVarArr[1] = new ig.k(zvVar3, this, new pv(zvVar3, 1));
        }
        fw fwVar2 = this.z0;
        if (fwVar2 != null) {
            fwVar2.C0(new ov(this, i24));
            aVarArr[2] = new ig.k(this.z0, this, new pv(this, 2));
        }
        this.g2 = new ah(aVarArr, 1);
        setBlurredBackgroundDrawableFactory(this.j2);
    }

    public static void b(wy wyVar, boolean z10) {
        zv zvVar = wyVar.d0;
        if (zvVar == null) {
            return;
        }
        int childCount = zvVar.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = zvVar.getChildAt(i9);
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

    public static void c(wy wyVar, fy fyVar, String str) {
        String str2;
        wx wxVar;
        org.telegram.ui.ActionBar.o2 o2Var = wyVar.U1;
        int i9 = wyVar.Y0;
        ArrayList arrayList = wyVar.m1;
        if (fyVar == null) {
            return;
        }
        if (fyVar.getSpan() == null) {
            wyVar.B2 = SystemClock.elapsedRealtime();
            wyVar.N(true);
            String str3 = str != null ? str : (String) fyVar.getTag();
            new SpannableStringBuilder().append((CharSequence) str3);
            if (str != null) {
                wx wxVar2 = wyVar.p1;
                if (wxVar2 != null) {
                    wxVar2.l(Emoji.fixEmoji(str));
                    return;
                }
                return;
            }
            if (!fyVar.c && (str2 = Emoji.emojiColor.get(str3)) != null) {
                str3 = g(str3, str2);
            }
            wyVar.h(str3);
            wx wxVar3 = wyVar.p1;
            if (wxVar3 != null) {
                wxVar3.l(Emoji.fixEmoji(str3));
                return;
            }
            return;
        }
        if (wyVar.p1 != null) {
            long j10 = fyVar.getSpan().documentId;
            TLRPC.Document document = fyVar.getSpan().document;
            jx jxVar = fyVar.e;
            boolean z10 = jxVar != null && jxVar.i;
            if (document == null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    jx jxVar2 = (jx) arrayList.get(i10);
                    int i11 = 0;
                    while (true) {
                        ArrayList arrayList2 = jxVar2.c;
                        if (arrayList2 != null && i11 < arrayList2.size()) {
                            if (((TLRPC.Document) jxVar2.c.get(i11)).id == j10) {
                                document = (TLRPC.Document) jxVar2.c.get(i11);
                                break;
                            }
                            i11++;
                        }
                    }
                }
            }
            if (document == null) {
                document = k5.f(i9, j10);
            }
            String findAnimatedEmojiEmoticon = document != null ? MessageObject.findAnimatedEmojiEmoticon(document) : null;
            if (MessageObject.isFreeEmoji(document) || UserConfig.getInstance(i9).isPremium() || (((wxVar = wyVar.p1) != null && wxVar.g()) || wyVar.Q0 || z10)) {
                wyVar.B2 = SystemClock.elapsedRealtime();
                wyVar.N(true);
                wyVar.h("animated_" + j10);
                wyVar.p1.x(j10, document, findAnimatedEmojiEmoticon, fyVar.c);
                return;
            }
            wyVar.N(false);
            oc a02 = o2Var != null ? oc.a0(o2Var) : new oc(wyVar.r, wyVar.V1);
            if (wyVar.d2 || o2Var == null) {
                a02.q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new ov(wyVar, 7)).j();
            } else {
                a02.J(R.raw.saved_messages, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint2)), LocaleController.getString(R.string.Open), new ov(wyVar, 8)).j();
            }
            wyVar.d2 = !wyVar.d2;
        }
    }

    public static void e(wy wyVar, int i9, int i10) {
        f2.q1 K;
        int[] iArr = wyVar.M0;
        if (i9 == 1) {
            wyVar.n(wyVar.L, i10);
            return;
        }
        wx wxVar = wyVar.p1;
        if ((wxVar == null || !wxVar.z()) && !wyVar.F0) {
            wk0 x10 = wyVar.x(i9);
            if (i10 <= 0 || x10 == null || x10.getVisibility() != 0 || (K = x10.K(0)) == null || K.a.getTop() + wyVar.X0 < x10.getPaddingTop()) {
                int i11 = iArr[i9] - i10;
                iArr[i9] = i11;
                if (i11 > 0) {
                    iArr[i9] = 0;
                } else if (i11 < (-AndroidUtilities.dp(288.0f))) {
                    iArr[i9] = -AndroidUtilities.dp(288.0f);
                }
                if (i9 == 0) {
                    wyVar.Z();
                } else {
                    wyVar.y(i9).setTranslationY(Math.max(-AndroidUtilities.dp(48.0f), iArr[i9]));
                }
            }
        }
    }

    public static void f(wy wyVar, boolean z10) {
        int N0;
        cy cyVar = wyVar.e0;
        cw cwVar = wyVar.k0;
        zv zvVar = wyVar.d0;
        if (zvVar != null && (zvVar.getAdapter() instanceof ay)) {
            ay ayVar = (ay) zvVar.getAdapter();
            if (!ayVar.s && ayVar.h == 0 && !ayVar.x.isEmpty() && (N0 = cyVar.N0()) != -1 && N0 > cyVar.B() - 5) {
                String str = ayVar.w;
                String str2 = ayVar.r;
                boolean z11 = ayVar.v;
                ayVar.F(str, str2, true, z11, z11);
            }
        }
        wx wxVar = wyVar.p1;
        if (wxVar == null || !wxVar.z()) {
            if (cwVar == null || zvVar == null) {
                return;
            }
            cwVar.a.a(true, !z10);
            return;
        }
        f2.q1 K = zvVar.K(0);
        if (K == null) {
            jy.a(cwVar, true, !z10);
        } else {
            jy.a(cwVar, K.a.getTop() < zvVar.getPaddingTop(), !z10);
        }
    }

    public static String g(String str, String str2) {
        boolean z10;
        String str3;
        if (CompoundEmoji.isHandshake(str) != null) {
            return CompoundEmoji.applyColor(str, str2);
        }
        if (Emoji.endsWithRightArrow(str)) {
            str = e2.c.m(str, 2, 0);
            z10 = true;
        } else {
            z10 = false;
        }
        int length = str.length();
        if (length > 2 && str.charAt(str.length() - 2) == 8205) {
            str3 = str.substring(str.length() - 2);
            str = e2.c.m(str, 2, 0);
        } else if (length <= 3 || str.charAt(str.length() - 3) != 8205) {
            str3 = null;
        } else {
            str3 = str.substring(str.length() - 3);
            str = e2.c.m(str, 3, 0);
        }
        String j10 = ta.b.j(str, str2);
        if (str3 != null) {
            j10 = ta.b.j(j10, str3);
        }
        return z10 ? ta.b.j(j10, "\u200d➡") : j10;
    }

    public static void j(int i9, View view) {
        if (view == null) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i9);
    }

    public final void A() {
        iw iwVar = this.C0;
        if (iwVar != null) {
            iwVar.b();
        }
        cw cwVar = this.k0;
        if (cwVar != null) {
            cwVar.b();
        }
        wv wvVar = this.R;
        if (wvVar != null) {
            wvVar.b();
        }
    }

    public final void C() {
        ig.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.f2) == null) {
            return;
        }
        kc0 kc0Var = this.w;
        RectF rectF = this.v2;
        pg.i.c(kc0Var, this, rectF);
        rectF.inset(LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f), LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        rectF.right = getMeasuredWidth();
        rectF.bottom = Math.min(rectF.bottom, getMeasuredHeight());
        eVar.g(1, this.w2);
        eVar.e(this.g2, getWidth(), getHeight());
    }

    public final void D() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        int i9 = this.Y0;
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.groupPackUpdated);
        if (this.u0 != null) {
            NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
            NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.featuredStickersDidLoad);
            NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.groupStickersDidLoad);
            NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        }
    }

    public final void E(boolean z10, boolean z11) {
        iy iyVar;
        if (this.w1 != 0 && this.s1) {
            this.w1 = 0;
        }
        if (this.w1 == 0 && this.r1) {
            this.w1 = 1;
        }
        int i9 = this.w1;
        lw lwVar = this.h;
        if (i9 == 0 || z10 || this.e.size() == 1) {
            M(true, false);
            R(false, false);
            if (lwVar.getCurrentItem() != 0) {
                lwVar.x(0, !z10);
            }
            if (z11) {
                AndroidUtilities.runOnUIThread(new ov(this, 9), 350L);
            }
        } else {
            int i10 = this.w1;
            if (i10 == 1) {
                M(false, false);
                R(this.q0 || this.r0, false);
                if (lwVar.getCurrentItem() != 2) {
                    lwVar.x(2, false);
                }
                jw jwVar = this.x0;
                if (jwVar != null) {
                    this.O0 = true;
                    int i11 = this.C1;
                    if (i11 >= 0) {
                        jwVar.m(i11);
                    } else {
                        int i12 = this.B1;
                        if (i12 >= 0) {
                            jwVar.m(i12);
                        } else {
                            jwVar.m(this.A1);
                        }
                    }
                    this.O0 = false;
                    this.A0.h1(0, 0);
                }
            } else if (i10 == 2) {
                M(false, false);
                R(false, false);
                if (lwVar.getCurrentItem() != 1) {
                    lwVar.x(1, false);
                }
                dx dxVar = this.l0;
                if (dxVar != null) {
                    dxVar.m(0);
                }
                cw cwVar = this.k0;
                if (cwVar != null && (iyVar = cwVar.r) != null) {
                    iyVar.F1(null);
                }
            }
        }
        N(true);
    }

    public final void F() {
        ny nyVar = this.u0;
        if (nyVar != null) {
            nyVar.l();
        }
        ry ryVar = this.v0;
        if (ryVar != null) {
            ryVar.l();
        }
        if (org.telegram.ui.ht.q().E) {
            org.telegram.ui.ht.q().n();
        }
        org.telegram.ui.ht.q().u();
    }

    public final void G(int i9) {
        wx wxVar = this.p1;
        if ((wxVar == null || !wxVar.z()) && i9 != 0) {
            HorizontalScrollView y10 = y(i9);
            this.M0[i9] = 0;
            y10.setTranslationY(0);
        }
    }

    public final void H(int i9, int i10) {
        xw xwVar = this.M;
        View m10 = xwVar.m(i9);
        int L0 = xwVar.L0();
        if ((m10 == null && Math.abs(i9 - L0) > xwVar.J * 9.0f) || !SharedConfig.animationsEnabled()) {
            int i11 = xwVar.L0() < i9 ? 0 : 1;
            c2.y yVar = this.U;
            yVar.b = i11;
            yVar.c(i9, i10, false, false);
            return;
        }
        this.F0 = true;
        kh.n1 n1Var = new kh.n1(this, this.L.getContext(), 1);
        n1Var.a = i9;
        n1Var.p = i10;
        xwVar.w0(n1Var);
    }

    public final void I(int i9, int i10) {
        gw gwVar = this.A0;
        View m10 = gwVar.m(i9);
        int L0 = gwVar.L0();
        if (m10 != null || Math.abs(i9 - L0) <= 40) {
            this.F0 = true;
            this.z0.x0(i9);
        } else {
            int i11 = gwVar.L0() < i9 ? 0 : 1;
            c2.y yVar = this.T;
            yVar.b = i11;
            yVar.c(i9, i10, false, false);
        }
    }

    public final void J(boolean z10, boolean z11, boolean z12, boolean z13) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        int i9 = 0;
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i9 >= arrayList2.size()) {
                break;
            }
            if (((sy) arrayList2.get(i9)).a == 0 && z10) {
                arrayList.add((sy) arrayList2.get(i9));
            }
            if (((sy) arrayList2.get(i9)).a == 1 && z12) {
                arrayList.add((sy) arrayList2.get(i9));
            }
            if (((sy) arrayList2.get(i9)).a == 2 && z11) {
                arrayList.add((sy) arrayList2.get(i9));
            }
            i9++;
        }
        kc0 kc0Var = this.w;
        if (kc0Var != null) {
            AndroidUtilities.updateViewVisibilityAnimated(kc0Var, arrayList.size() > 1, 1.0f, z13);
        }
        lw lwVar = this.h;
        if (lwVar != null) {
            lwVar.setAdapter(null);
            lwVar.setAdapter(this.H0);
            if (kc0Var != null) {
                kc0Var.setViewPager(lwVar);
            }
        }
    }

    @Override // td.b
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        if (i9 == 0) {
            q(false);
            float f12 = 1.0f - this.a.e;
            iw iwVar = this.C0;
            iwVar.setAlpha(f12);
            iwVar.setVisibility(f12 > 0.0f ? 0 : 4);
            float f13 = 1.0f - f12;
            vg.e eVar = this.D0;
            eVar.setAlpha(f13);
            eVar.setTranslationY((-AndroidUtilities.dp(15.0f)) * f12);
            eVar.setVisibility(f13 > 0.0f ? 0 : 4);
            vg.c cVar2 = this.I;
            cVar2.setAlpha(f13);
            cVar2.setTranslationY(AndroidUtilities.dp(30.0f) * f12);
            cVar2.setVisibility(f13 > 0.0f ? 0 : 4);
            S();
            this.t0.invalidate();
            return;
        }
        if (i9 == 1) {
            l(false);
            float f14 = 1.0f - this.b.e;
            wv wvVar = this.R;
            wvVar.setAlpha(f14);
            wvVar.setVisibility(f14 > 0.0f ? 0 : 4);
            float f15 = 1.0f - f14;
            vg.e eVar2 = this.Q;
            eVar2.setAlpha(f15);
            eVar2.setTranslationY((-AndroidUtilities.dp(15.0f)) * f14);
            eVar2.setVisibility(f15 > 0.0f ? 0 : 4);
            vg.c cVar3 = this.G;
            cVar3.setAlpha(f15);
            cVar3.setTranslationY(AndroidUtilities.dp(30.0f) * f14);
            cVar3.setVisibility(f15 > 0.0f ? 0 : 4);
            S();
            this.F.invalidate();
        }
    }

    public final void K(final vg.b bVar, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z10, boolean z11) {
        ry ryVar;
        vx vxVar;
        if (stickerSet == null) {
            return;
        }
        if (!z10 || (vxVar = this.O) == null || vxVar.d == stickerSet.id) {
            if (z10 || (ryVar = this.v0) == null || ryVar.d == stickerSet.id) {
                final boolean isStickerPackInstalled = MediaDataController.getInstance(this.Y0).isStickerPackInstalled(stickerSet.id);
                bVar.g(isStickerPackInstalled ? stickerSet.masks ? LocaleController.formatPluralString("RemoveManyMasksCount", stickerSet.count, new Object[0]) : stickerSet.emojis ? LocaleController.formatPluralString("RemoveManyEmojiCount", stickerSet.count, new Object[0]) : LocaleController.formatPluralString("RemoveManyStickersCount", stickerSet.count, new Object[0]) : stickerSet.masks ? LocaleController.formatPluralString("AddManyMasksCount", stickerSet.count, new Object[0]) : stickerSet.emojis ? LocaleController.formatPluralString("AddManyEmojiCount", stickerSet.count, new Object[0]) : LocaleController.formatPluralString("AddManyStickersCount", stickerSet.count, new Object[0]), z11, true);
                bVar.d0.a(!isStickerPackInstalled, z11);
                bVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.uv
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        wy wyVar = wy.this;
                        MediaDataController mediaDataController = MediaDataController.getInstance(wyVar.Y0);
                        Context context = wyVar.getContext();
                        int i9 = isStickerPackInstalled ? 0 : 2;
                        org.telegram.ui.ActionBar.o2 o2Var = wyVar.U1;
                        FrameLayout frameLayout = wyVar.s;
                        vg.b bVar2 = bVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z12 = z10;
                        mediaDataController.toggleStickerSet(context, tLObject2, document2, i9, o2Var, frameLayout, false, true, new h3.p1(wyVar, bVar2, tLObject2, stickerSet2, document2, z12, 10), false);
                        wyVar.K(bVar2, tLObject2, stickerSet2, document2, z12, true);
                    }
                });
            }
        }
    }

    public final void L(long j10, boolean z10, boolean z11) {
        kc0 kc0Var = this.w;
        if (kc0Var == null) {
            return;
        }
        this.r1 = z10;
        this.s1 = z11;
        if (z11 || z10) {
            this.q1 = j10;
        } else {
            this.q1 = 0L;
        }
        int i9 = z11 ? 2 : 0;
        LinearLayout linearLayout = kc0Var.d;
        View childAt = i9 >= linearLayout.getChildCount() ? null : linearLayout.getChildAt(i9);
        if (childAt != null) {
            childAt.setAlpha(this.q1 != 0 ? 0.15f : 1.0f);
            lw lwVar = this.h;
            if (z11) {
                if (this.q1 == 0 || lwVar.getCurrentItem() == 0) {
                    return;
                }
                M(true, true);
                R(false, true);
                lwVar.x(0, false);
                return;
            }
            if (this.q1 == 0 || lwVar.getCurrentItem() == 1) {
                return;
            }
            M(false, true);
            R(false, true);
            lwVar.x(1, false);
        }
    }

    public final void M(boolean z10, boolean z11) {
        mw mwVar = this.x;
        if (z10 && mwVar.getTag() == null) {
            return;
        }
        if ((z10 || mwVar.getTag() == null) && !this.k2) {
            AnimatorSet animatorSet = this.B;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.B = null;
            }
            mwVar.setTag(z10 ? null : 1);
            if (!z11) {
                mwVar.setAlpha(z10 ? 1.0f : 0.0f);
                mwVar.setScaleX(z10 ? 1.0f : 0.0f);
                mwVar.setScaleY(z10 ? 1.0f : 0.0f);
                mwVar.setVisibility(z10 ? 0 : 4);
                return;
            }
            if (z10) {
                mwVar.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.B = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(mwVar, (Property<mw, Float>) View.ALPHA, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(mwVar, (Property<mw, Float>) View.SCALE_X, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(mwVar, (Property<mw, Float>) View.SCALE_Y, z10 ? 1.0f : 0.0f));
            this.B.setDuration(200L);
            this.B.setInterpolator(gr.g);
            this.B.addListener(new sw(this, z10, r2));
            this.B.start();
        }
    }

    public final void N(boolean z10) {
        this.D = 0.0f;
        wx wxVar = this.p1;
        if (wxVar != null && wxVar.z()) {
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

    public final void O(boolean z10, boolean z11) {
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
            this.S.setInterpolator(gr.g);
            this.S.addListener(new org.telegram.ui.xp(this, 25));
            this.S.start();
        }
    }

    public final void P(boolean z10) {
        for (int i9 = 0; i9 < 3; i9++) {
            f2.y w8 = w(i9);
            int L0 = w8.L0();
            if (z10) {
                if (L0 == 1 || L0 == 2) {
                    w8.n0(0);
                    G(i9);
                }
            } else if (L0 == 0) {
                w8.h1(0, 0);
            }
        }
    }

    public final void Q(boolean z10, boolean z11, boolean z12) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.Chat chat = MessagesController.getInstance(this.Y0).getChat(Long.valueOf(this.q1));
        if (chat == null) {
            return;
        }
        bg.t tVar = this.J0;
        if (z10) {
            if (ChatObject.hasAdminRights(chat) || (tL_chatBannedRights = chat.default_banned_rights) == null || !(tL_chatBannedRights.send_stickers || (z11 && tL_chatBannedRights.send_plain))) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.banned_rights;
                if (tL_chatBannedRights2 == null) {
                    return;
                }
                if (!AndroidUtilities.isBannedForever(tL_chatBannedRights2)) {
                    if (z11) {
                        tVar.setText(LocaleController.formatString("AttachPlainRestricted", R.string.AttachPlainRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    }
                    if (z12) {
                        tVar.setText(LocaleController.formatString("AttachGifRestricted", R.string.AttachGifRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    } else {
                        tVar.setText(LocaleController.formatString("AttachStickersRestricted", R.string.AttachStickersRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    }
                } else if (z11) {
                    tVar.setText(LocaleController.getString(R.string.AttachPlainRestrictedForever));
                } else if (z12) {
                    tVar.setText(LocaleController.getString(R.string.AttachGifRestrictedForever));
                } else {
                    tVar.setText(LocaleController.getString(R.string.AttachStickersRestrictedForever));
                }
            } else {
                org.telegram.ui.ActionBar.o2 o2Var = this.U1;
                if ((o2Var instanceof org.telegram.ui.qn) && ((org.telegram.ui.qn) o2Var).K6()) {
                    return;
                }
                if (z11) {
                    tVar.setText(LocaleController.getString(R.string.GlobalAttachEmojiRestricted));
                } else if (z12) {
                    tVar.setText(LocaleController.getString(R.string.GlobalAttachGifRestricted));
                } else {
                    tVar.setText(LocaleController.getString(R.string.GlobalAttachStickersRestricted));
                }
            }
            tVar.setVisibility(0);
        }
        AnimatorSet animatorSet = this.F2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.F2 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.F2 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(tVar, (Property<bg.t, Float>) View.ALPHA, z10 ? tVar.getAlpha() : 1.0f, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(tVar, (Property<bg.t, Float>) View.TRANSLATION_Y, z10 ? AndroidUtilities.dp(12.0f) : tVar.getTranslationY(), z10 ? 0.0f : AndroidUtilities.dp(12.0f)));
        org.telegram.messenger.video.l lVar = this.G2;
        if (lVar != null) {
            AndroidUtilities.cancelRunOnUIThread(lVar);
        }
        if (z10) {
            org.telegram.messenger.video.l lVar2 = new org.telegram.messenger.video.l(this, z11, z12, 3);
            this.G2 = lVar2;
            AndroidUtilities.runOnUIThread(lVar2, 3500L);
        }
        this.F2.setDuration(320L);
        this.F2.setInterpolator(gr.h);
        this.F2.start();
    }

    public final void R(boolean z10, boolean z11) {
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
            int i9 = 1;
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
            this.C.setInterpolator(gr.g);
            this.C.addListener(new sw(this, z10, i9));
            this.C.start();
        }
    }

    public final void S() {
        org.telegram.ui.ActionBar.o2 o2Var;
        if (((View) getParent()) != null) {
            float y10 = (getY() + (getLayoutParams().height > 0 ? getLayoutParams().height : getMeasuredHeight())) - (((AndroidUtilities.isInMultiwindow || ((o2Var = this.U1) != null && o2Var.isInBubbleMode())) && !this.R0) ? AndroidUtilities.dp(1.0f) : r0.getHeight());
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

    public final void T() {
        jy jyVar;
        boolean z10;
        jv jvVar;
        boolean z11 = this.q0;
        View view = this.v;
        if (!z11) {
            setBackground(null);
            view.setBackground(null);
        } else if (AndroidUtilities.isInMultiwindow || this.J1) {
            Drawable background = getBackground();
            if (background != null) {
                background.setColorFilter(new PorterDuffColorFilter(z(org.telegram.ui.ActionBar.f6.He), PorterDuff.Mode.MULTIPLY));
            }
        } else {
            int i9 = org.telegram.ui.ActionBar.f6.He;
            setBackgroundColor(z(i9));
            if (this.W) {
                view.setBackgroundColor(z(i9));
            }
        }
        vv vvVar = this.E;
        if (vvVar != null) {
            if (this.q0) {
                vvVar.setBackgroundColor(z(org.telegram.ui.ActionBar.f6.He));
                this.K.setBackgroundColor(z(org.telegram.ui.ActionBar.f6.Ke));
            } else {
                vvVar.setBackground(null);
            }
        }
        iu iuVar = this.x1;
        if (iuVar != null) {
            iuVar.c.a();
        }
        int i10 = 0;
        while (true) {
            jyVar = this.R;
            z10 = this.e2;
            if (i10 >= 3) {
                break;
            }
            if (i10 == 0) {
                jyVar = this.C0;
            } else if (i10 != 1) {
                jyVar = this.k0;
            }
            if (jyVar != null) {
                yp ypVar = jyVar.d;
                FrameLayout frameLayout = jyVar.n;
                View view2 = jyVar.f;
                if (this.q0) {
                    view2.setBackgroundColor(z(org.telegram.ui.ActionBar.f6.He));
                } else {
                    view2.setBackground(null);
                }
                jyVar.e.setBackgroundColor(z(org.telegram.ui.ActionBar.f6.Ke));
                jyVar.c.a(z10 ? v(0.4f) : z(org.telegram.ui.ActionBar.f6.Je));
                org.telegram.ui.ActionBar.f6.w1(z10 ? v(0.06f) : z(org.telegram.ui.ActionBar.f6.Ie), frameLayout.getBackground());
                frameLayout.invalidate();
                ypVar.setHintTextColor(z10 ? v(0.45f) : z(org.telegram.ui.ActionBar.f6.Je));
                ypVar.setTextColor(z10 ? v(0.8f) : z(org.telegram.ui.ActionBar.f6.G6));
            }
            i10++;
        }
        Paint paint = this.o1;
        if (paint != null) {
            paint.setColor(z(org.telegram.ui.ActionBar.f6.af));
        }
        ww wwVar = this.L;
        if (wwVar != null) {
            wwVar.setGlowColor(z(org.telegram.ui.ActionBar.f6.He));
        }
        fw fwVar = this.z0;
        if (fwVar != null) {
            fwVar.setGlowColor(z(org.telegram.ui.ActionBar.f6.He));
        }
        jw jwVar = this.x0;
        if (jwVar != null) {
            jwVar.setIndicatorColor(z(org.telegram.ui.ActionBar.f6.Qe));
            jwVar.setUnderlineColor(z(org.telegram.ui.ActionBar.f6.Ke));
            if (this.q0) {
                jwVar.setBackgroundColor(z(org.telegram.ui.ActionBar.f6.He));
            } else {
                jwVar.setBackground(null);
            }
        }
        dx dxVar = this.l0;
        if (dxVar != null) {
            dxVar.setIndicatorColor(z(org.telegram.ui.ActionBar.f6.Qe));
            dxVar.setUnderlineColor(z(org.telegram.ui.ActionBar.f6.Ke));
            if (this.q0) {
                dxVar.setBackgroundColor(z(org.telegram.ui.ActionBar.f6.He));
            } else {
                dxVar.setBackground(null);
            }
        }
        mw mwVar = this.x;
        if (mwVar != null) {
            mwVar.setColorFilter(new PorterDuffColorFilter(z10 ? v(0.6f) : z(org.telegram.ui.ActionBar.f6.Re), PorterDuff.Mode.MULTIPLY));
            if (jyVar == null) {
                Drawable background2 = mwVar.getBackground();
                int i11 = org.telegram.ui.ActionBar.f6.He;
                org.telegram.ui.ActionBar.f6.B1(background2, z(i11), false);
                org.telegram.ui.ActionBar.f6.B1(mwVar.getBackground(), z(i11), true);
            }
        }
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(z10 ? v(0.6f) : z(org.telegram.ui.ActionBar.f6.Re), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.A;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(z10 ? v(0.6f) : z(org.telegram.ui.ActionBar.f6.Re), PorterDuff.Mode.MULTIPLY));
        }
        bg.t tVar = this.J0;
        if (tVar != null) {
            ((ShapeDrawable) tVar.getBackground()).getPaint().setColor(z(org.telegram.ui.ActionBar.f6.qf));
            tVar.setTextColor(z(org.telegram.ui.ActionBar.f6.pf));
        }
        ay ayVar = this.f0;
        if (ayVar != null) {
            dy dyVar = ayVar.e;
            ImageView imageView3 = dyVar.a;
            int i12 = org.telegram.ui.ActionBar.f6.Le;
            imageView3.setColorFilter(new PorterDuffColorFilter(z(i12), PorterDuff.Mode.MULTIPLY));
            dyVar.b.setTextColor(z(i12));
            dyVar.c.setProgressColor(z(org.telegram.ui.ActionBar.f6.h6));
        }
        this.a2 = new PorterDuffColorFilter(z(org.telegram.ui.ActionBar.f6.Oh), PorterDuff.Mode.SRC_IN);
        int i13 = 0;
        while (true) {
            Drawable[] drawableArr = this.T0;
            if (i13 >= drawableArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.f6.y1(drawableArr[i13], z10 ? v(0.4f) : z(org.telegram.ui.ActionBar.f6.Ne), false);
            org.telegram.ui.ActionBar.f6.y1(drawableArr[i13], z10 ? v(0.8f) : z(org.telegram.ui.ActionBar.f6.Oe), true);
            i13++;
        }
        if (vvVar != null && (jvVar = vvVar.y) != null) {
            jvVar.d();
        }
        int i14 = 0;
        while (true) {
            Drawable[] drawableArr2 = this.U0;
            if (i14 >= drawableArr2.length) {
                break;
            }
            org.telegram.ui.ActionBar.f6.y1(drawableArr2[i14], z10 ? v(0.4f) : z(org.telegram.ui.ActionBar.f6.Me), false);
            org.telegram.ui.ActionBar.f6.y1(drawableArr2[i14], z10 ? v(0.8f) : z(org.telegram.ui.ActionBar.f6.Oe), true);
            i14++;
        }
        int i15 = 0;
        while (true) {
            Drawable[] drawableArr3 = this.V0;
            if (i15 >= drawableArr3.length) {
                break;
            }
            org.telegram.ui.ActionBar.f6.y1(drawableArr3[i15], z10 ? v(0.4f) : z(org.telegram.ui.ActionBar.f6.Me), false);
            org.telegram.ui.ActionBar.f6.y1(drawableArr3[i15], z10 ? v(0.8f) : z(org.telegram.ui.ActionBar.f6.Oe), true);
            i15++;
        }
        org.telegram.ui.ActionBar.r5 r5Var = this.W1;
        if (r5Var != null) {
            org.telegram.ui.ActionBar.f6.y1(r5Var, z10 ? v(0.4f) : z(org.telegram.ui.ActionBar.f6.Ne), false);
            org.telegram.ui.ActionBar.f6.y1(r5Var, z10 ? v(0.8f) : z(org.telegram.ui.ActionBar.f6.Oe), true);
        }
        org.telegram.ui.ActionBar.r5 r5Var2 = this.X1;
        if (r5Var2 != null) {
            org.telegram.ui.ActionBar.f6.y1(r5Var2, z10 ? v(0.4f) : z(org.telegram.ui.ActionBar.f6.Qe), false);
            org.telegram.ui.ActionBar.f6.y1(r5Var2, z10 ? v(0.8f) : z(org.telegram.ui.ActionBar.f6.Qe), true);
        }
    }

    public final void U() {
        ww wwVar = this.L;
        if (wwVar == null) {
            return;
        }
        for (int i9 = 0; i9 < wwVar.getChildCount(); i9++) {
            View childAt = wwVar.getChildAt(i9);
            if (childAt instanceof nx) {
                ((nx) childAt).a(true);
            }
        }
    }

    public final void V(int i9) {
        if (this.b0) {
            return;
        }
        int i10 = -1;
        if (i9 != -1) {
            int size = getRecentEmoji().size() + (this.W ? 1 : 0);
            fx fxVar = this.N;
            int i11 = fxVar.c;
            ArrayList arrayList = fxVar.x;
            int i12 = 0;
            int i13 = size + (i11 >= 0 ? 3 : 0);
            if (i9 >= i13) {
                int i14 = 0;
                while (true) {
                    String[][] strArr = EmojiData.dataColored;
                    if (i14 >= strArr.length) {
                        break;
                    }
                    i13 += strArr[i14].length + 1;
                    if (i9 < i13) {
                        i10 = i14 + 1;
                        break;
                    }
                    i14++;
                }
                if (i10 < 0) {
                    ArrayList<jx> emojipacks = getEmojipacks();
                    int size2 = arrayList.size() - 1;
                    while (true) {
                        if (size2 < 0) {
                            break;
                        }
                        if (((Integer) arrayList.get(size2)).intValue() <= i9) {
                            jx jxVar = (jx) this.m1.get(size2);
                            while (i12 < emojipacks.size()) {
                                long j10 = emojipacks.get(i12).b.id;
                                long j11 = jxVar.b.id;
                                if (j10 == j11 && (!jxVar.g || (!jxVar.f && !this.l1.contains(Long.valueOf(j11))))) {
                                    i12 = EmojiData.dataColored.length + 1 + i12;
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
                this.E.j(i12, true);
            }
        }
    }

    public final void W() {
        int i9;
        iy iyVar;
        int i10;
        boolean z10;
        dx dxVar = this.l0;
        int currentPosition = dxVar.getCurrentPosition();
        int i11 = this.n0;
        boolean z11 = currentPosition == i11;
        boolean z12 = i11 >= 0;
        boolean isEmpty = this.e1.isEmpty();
        dxVar.d(false);
        this.n0 = -2;
        this.o0 = -2;
        this.p0 = -2;
        Drawable[] drawableArr = this.V0;
        if (isEmpty) {
            i9 = 0;
        } else {
            this.n0 = 0;
            dxVar.b(0, drawableArr[0]).setContentDescription(LocaleController.getString(R.string.RecentStickers));
            i9 = 1;
        }
        this.o0 = i9;
        dxVar.b(1, drawableArr[1]).setContentDescription(LocaleController.getString(R.string.FeaturedGifs));
        this.p0 = i9 + 1;
        AndroidUtilities.dp(13.0f);
        AndroidUtilities.dp(11.0f);
        int i12 = this.Y0;
        ArrayList<String> arrayList = MessagesController.getInstance(i12).gifSearchEmojies;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            String str = arrayList.get(i13);
            Emoji.EmojiDrawable emojiDrawable = Emoji.getEmojiDrawable(str);
            if (emojiDrawable != null) {
                TLRPC.Document emojiAnimatedSticker = MediaDataController.getInstance(i12).getEmojiAnimatedSticker(str);
                String l10 = j3.r0.l(i13 + 3, "tab");
                int i14 = dxVar.x;
                dxVar.x = i14 + 1;
                lw0 lw0Var = (lw0) dxVar.n.get(l10);
                if (lw0Var != null) {
                    dxVar.g(l10, lw0Var, i14);
                    i10 = currentPosition;
                    z10 = z12;
                } else {
                    i10 = currentPosition;
                    z10 = z12;
                    lw0Var = new lw0(dxVar.getContext(), 2);
                    lw0Var.setFocusable(true);
                    lw0Var.setOnClickListener(new ml0(dxVar, 2));
                    lw0Var.setExpanded(dxVar.b0);
                    lw0Var.a(dxVar.e0);
                    dxVar.e.addView(lw0Var, i14);
                }
                lw0Var.d = false;
                lw0Var.setTag(R.id.index_tag, Integer.valueOf(i14));
                lw0Var.setTag(R.id.parent_tag, emojiDrawable);
                lw0Var.setTag(R.id.object_tag, emojiAnimatedSticker);
                lw0Var.setSelected(i14 == dxVar.y);
                dxVar.h.put(l10, lw0Var);
                lw0Var.setContentDescription(str);
            } else {
                i10 = currentPosition;
                z10 = z12;
            }
            i13++;
            currentPosition = i10;
            z12 = z10;
        }
        int i15 = currentPosition;
        boolean z13 = z12;
        dxVar.h();
        dxVar.q();
        if (z11 && isEmpty) {
            dxVar.m(this.o0);
            cw cwVar = this.k0;
            if (cwVar == null || (iyVar = cwVar.r) == null) {
                return;
            }
            iyVar.F1(null);
            return;
        }
        WeakHashMap weakHashMap = r0.j0.a;
        if (dxVar.isLaidOut()) {
            if (!isEmpty && !z13) {
                dxVar.k(i15 + 1, 0);
            } else if (isEmpty && z13) {
                dxVar.k(i15 - 1, 0);
            }
        }
    }

    public final void X() {
        ay ayVar;
        int size = this.e1.size();
        long calcDocumentsHash = MediaDataController.calcDocumentsHash(this.e1, ConnectionsManager.DEFAULT_DATACENTER_ID);
        ArrayList<TLRPC.Document> recentGifs = MediaDataController.getInstance(this.Y0).getRecentGifs();
        this.e1 = recentGifs;
        long calcDocumentsHash2 = MediaDataController.calcDocumentsHash(recentGifs, ConnectionsManager.DEFAULT_DATACENTER_ID);
        if ((this.l0 != null && size == 0 && !this.e1.isEmpty()) || (size != 0 && this.e1.isEmpty())) {
            W();
        }
        if ((size == this.e1.size() && calcDocumentsHash == calcDocumentsHash2) || (ayVar = this.j0) == null) {
            return;
        }
        ayVar.l();
    }

    public final void Y(boolean z10) {
        TLRPC.Document document;
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet;
        jw jwVar = this.x0;
        if (jwVar != null) {
            ta1 ta1Var = jwVar.e;
            if (jwVar.s != null) {
                return;
            }
            this.B1 = -2;
            this.C1 = -2;
            this.D1 = -2;
            this.E1 = -2;
            this.a0 = false;
            this.A1 = 0;
            int currentPosition = jwVar.getCurrentPosition();
            boolean z11 = true;
            jwVar.d((getParent() == null || getVisibility() != 0 || (this.u1.size() == 0 && this.v1.size() == 0)) ? false : true);
            int i9 = this.Y0;
            MediaDataController mediaDataController = MediaDataController.getInstance(i9);
            SharedPreferences emojiSettings = MessagesController.getEmojiSettings(i9);
            ArrayList arrayList3 = this.i1;
            arrayList3.clear();
            ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
            int size = featuredStickerSets.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.StickerSetCovered stickerSetCovered = featuredStickerSets.get(i10);
                if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.id)) {
                    arrayList3.add(stickerSetCovered);
                }
            }
            uy uyVar = this.B0;
            if (uyVar != null) {
                uyVar.l();
            }
            boolean isEmpty = featuredStickerSets.isEmpty();
            long j10 = 0;
            Drawable[] drawableArr = this.U0;
            if (!isEmpty && (arrayList3.isEmpty() || emojiSettings.getLong("featured_hidden", 0L) == featuredStickerSets.get(0).set.id)) {
                int i11 = mediaDataController.getUnreadStickerSets().isEmpty() ? 2 : 3;
                lw0 c10 = jwVar.c(i11, drawableArr[i11]);
                c10.h.setText(LocaleController.getString(R.string.FeaturedStickersShort));
                c10.setContentDescription(LocaleController.getString(R.string.FeaturedStickers));
                int i12 = this.A1;
                this.D1 = i12;
                this.A1 = i12 + 1;
            }
            if (!this.g1.isEmpty()) {
                int i13 = this.A1;
                this.C1 = i13;
                this.A1 = i13 + 1;
                lw0 c11 = jwVar.c(1, drawableArr[1]);
                c11.h.setText(LocaleController.getString(R.string.FavoriteStickersShort));
                c11.setContentDescription(LocaleController.getString(R.string.FavoriteStickers));
            }
            if (!this.f1.isEmpty()) {
                int i14 = this.A1;
                this.B1 = i14;
                this.A1 = i14 + 1;
                lw0 c12 = jwVar.c(0, drawableArr[0]);
                c12.h.setText(LocaleController.getString(R.string.RecentStickersShort));
                c12.setContentDescription(LocaleController.getString(R.string.RecentStickers));
            }
            ArrayList arrayList4 = this.Z0;
            arrayList4.clear();
            org.telegram.ui.ActionBar.b6 b6Var = null;
            this.d1 = null;
            this.b1 = -1;
            this.a1 = -10;
            if (this.D2 == null || z10) {
                this.D2 = new ArrayList(mediaDataController.getStickerSets(0));
            }
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList5 = this.D2;
            int i15 = 0;
            while (true) {
                TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.t1;
                if (i15 >= stickerSetCoveredArr.length) {
                    break;
                }
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCoveredArr[i15];
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
                        stickerSetCoveredArr[i15] = null;
                    }
                }
                i15++;
                j10 = j11;
            }
            long j12 = j10;
            ArrayList<TLRPC.TL_messages_stickerSet> filterPremiumStickers = MessagesController.getInstance(i9).filterPremiumStickers(arrayList5);
            for (int i16 = 0; i16 < filterPremiumStickers.size(); i16++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = filterPremiumStickers.get(i16);
                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
                if ((stickerSet2 == null || !stickerSet2.archived) && (arrayList2 = tL_messages_stickerSet2.documents) != null && !arrayList2.isEmpty()) {
                    arrayList4.add(tL_messages_stickerSet2);
                }
            }
            if (this.F1 != null) {
                long j13 = MessagesController.getEmojiSettings(i9).getLong("group_hide_stickers_" + this.F1.id, -1L);
                TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(this.F1.id));
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
            int i17 = 0;
            while (i17 < arrayList4.size()) {
                if (i17 == this.a1) {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i9).getChat(Long.valueOf(this.F1.id));
                    if (chat2 == null) {
                        arrayList4.remove(0);
                        i17--;
                    } else {
                        this.a0 = z11;
                        String str = "chat" + chat2.id;
                        int i18 = jwVar.x;
                        jwVar.x = i18 + 1;
                        lw0 lw0Var = (lw0) jwVar.n.get(str);
                        if (lw0Var != null) {
                            jwVar.g(str, lw0Var, i18);
                        } else {
                            lw0Var = new lw0(jwVar.getContext(), 0);
                            lw0Var.setFocusable(z11);
                            lw0Var.setOnClickListener(new ml0(jwVar, 0));
                            ta1Var.addView(lw0Var, i18);
                            lw0Var.w = z11;
                            z8 z8Var = new z8(b6Var);
                            z8Var.u(AndroidUtilities.dp(14.0f));
                            z8Var.k(UserConfig.selectedAccount, chat2);
                            int i19 = jwVar.a;
                            o9 o9Var = lw0Var.e;
                            o9Var.setLayerNum(i19);
                            o9Var.e(chat2, z8Var);
                            o9Var.setAspectFit(z11);
                            lw0Var.setExpanded(jwVar.b0);
                            lw0Var.a(jwVar.e0);
                            lw0Var.h.setText(chat2.title);
                        }
                        lw0Var.d = z11;
                        lw0Var.setTag(R.id.index_tag, Integer.valueOf(i18));
                        lw0Var.setSelected(i18 == jwVar.y);
                        jwVar.h.put(str, lw0Var);
                    }
                } else {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i17);
                    TLRPC.StickerSet stickerSet5 = tL_messages_stickerSet5.set;
                    if (stickerSet5 != null && stickerSet5.thumb_document_id != j12) {
                        for (int i20 = 0; i20 < tL_messages_stickerSet5.documents.size(); i20++) {
                            document = tL_messages_stickerSet5.documents.get(i20);
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
                    int i21 = jwVar.x;
                    jwVar.x = i21 + 1;
                    lw0 lw0Var2 = (lw0) jwVar.n.get(str2);
                    if (lw0Var2 != null) {
                        jwVar.g(str2, lw0Var2, i21);
                    } else {
                        lw0Var2 = new lw0(jwVar.getContext(), 0);
                        lw0Var2.setFocusable(z11);
                        lw0Var2.setOnClickListener(new ml0(jwVar, 1));
                        lw0Var2.setExpanded(jwVar.b0);
                        lw0Var2.a(jwVar.e0);
                        ta1Var.addView(lw0Var2, i21);
                    }
                    lw0Var2.e.setLayerNum(jwVar.a);
                    lw0Var2.d = false;
                    lw0Var2.setTag(closestPhotoSizeWithSize);
                    lw0Var2.setTag(R.id.index_tag, Integer.valueOf(i21));
                    lw0Var2.setTag(R.id.parent_tag, tL_messages_stickerSet5);
                    lw0Var2.setTag(R.id.object_tag, document);
                    lw0Var2.setSelected(i21 == jwVar.y);
                    jwVar.h.put(str2, lw0Var2);
                    lw0Var2.setContentDescription(tL_messages_stickerSet5.set.title + ", " + LocaleController.getString(R.string.AccDescrStickerSet));
                }
                i17++;
                z11 = true;
                b6Var = null;
            }
            jwVar.h();
            jwVar.q();
            if (currentPosition != 0) {
                jwVar.k(currentPosition, currentPosition);
            }
            o();
        }
    }

    public final void Z() {
        kw kwVar = this.y0;
        jw jwVar = this.x0;
        if (jwVar != null && kwVar == null && this.p1 != null) {
            jwVar.setTranslationY(this.p1.p() * (-AndroidUtilities.dp(50.0f)));
        }
        if (kwVar == null) {
            return;
        }
        boolean z10 = getVisibility() == 0 && this.G0 && this.p1.p() != 1.0f;
        kwVar.setVisibility(z10 ? 0 : 8);
        if (z10) {
            Rect rect = this.u2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.t0, rect, null);
            float p6 = this.p1.p() * AndroidUtilities.dp(50.0f);
            int i9 = rect.left;
            if (i9 != 0 || p6 != 0.0f) {
                this.T1 = false;
            }
            kwVar.setTranslationX(i9);
            float translationY = (((getTranslationY() + getTop()) - kwVar.getTop()) - jwVar.getExpandedOffset()) - p6;
            if (kwVar.getTranslationY() != translationY) {
                kwVar.setTranslationY(translationY);
                kwVar.invalidate();
            }
        }
        if (this.T1 && z10 && this.L0) {
            jwVar.i(this.S1, true);
        } else {
            this.T1 = false;
            jwVar.i(this.S1, false);
        }
    }

    @Override // xg.a
    public final void a(int i9) {
        setBottomInset(i9);
    }

    public final void a0() {
        boolean z10;
        org.telegram.ui.Cells.s3 s3Var;
        LongSparseArray longSparseArray = this.v1;
        LongSparseArray longSparseArray2 = this.u1;
        int i9 = this.Y0;
        fw fwVar = this.z0;
        if (fwVar == null) {
            return;
        }
        try {
            int childCount = fwVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = fwVar.getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.s3) && ((ik0) fwVar.T(childAt)) != null) {
                    org.telegram.ui.Cells.s3 s3Var2 = (org.telegram.ui.Cells.s3) childAt;
                    ArrayList<Long> unreadStickerSets = MediaDataController.getInstance(i9).getUnreadStickerSets();
                    TLRPC.StickerSetCovered stickerSet = s3Var2.getStickerSet();
                    boolean z11 = unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSet.set.id));
                    int i11 = 0;
                    while (true) {
                        TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.t1;
                        if (i11 >= stickerSetCoveredArr.length) {
                            z10 = false;
                            break;
                        }
                        TLRPC.StickerSetCovered stickerSetCovered = stickerSetCoveredArr[i11];
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
                        i11++;
                        s3Var2 = s3Var;
                    }
                    s3Var2.c(stickerSet, z11, true, 0, 0, z10);
                    if (z11) {
                        MediaDataController.getInstance(i9).markFeaturedStickersByIdAsRead(false, stickerSet.set.id);
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
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // xg.a
    public final void d(float f10) {
        this.n2 = f10;
        S();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        Utilities.Callback callback;
        TLRPC.StickerSet stickerSet;
        int i11 = NotificationCenter.stickersDidLoad;
        fx fxVar = this.N;
        ov ovVar = this.H2;
        if (i9 == i11) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.u0 != null) {
                    Y(((Boolean) objArr[1]).booleanValue());
                    a0();
                    F();
                    o();
                    return;
                }
                return;
            }
            if (((Integer) objArr[0]).intValue() == 5) {
                if (!((Boolean) objArr[1]).booleanValue()) {
                    fxVar.F(false);
                    return;
                } else {
                    AndroidUtilities.cancelRunOnUIThread(ovVar);
                    AndroidUtilities.runOnUIThread(ovVar, 100L);
                    return;
                }
            }
            return;
        }
        if (i9 == NotificationCenter.groupPackUpdated) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            TLRPC.ChatFull chatFull = this.F1;
            if (chatFull != null && chatFull.id == longValue && booleanValue) {
                fxVar.F(true);
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.recentDocumentsDidLoad) {
            boolean booleanValue2 = ((Boolean) objArr[0]).booleanValue();
            int intValue = ((Integer) objArr[1]).intValue();
            if (booleanValue2 || intValue == 0 || intValue == 2) {
                k(booleanValue2);
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.featuredStickersDidLoad) {
            a0();
            kc0 kc0Var = this.w;
            if (kc0Var != null) {
                int childCount = kc0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    kc0Var.getChildAt(i12).invalidate();
                }
            }
            Y(false);
            return;
        }
        if (i9 == NotificationCenter.featuredEmojiDidLoad) {
            if (fxVar != null) {
                fxVar.F(false);
                return;
            }
            return;
        }
        int i13 = NotificationCenter.groupStickersDidLoad;
        vx vxVar = this.O;
        if (i9 == i13) {
            Long l10 = (Long) objArr[0];
            long longValue2 = l10.longValue();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = objArr.length > 1 ? (TLRPC.TL_messages_stickerSet) objArr[1] : null;
            if (tL_messages_stickerSet != null) {
                ry ryVar = this.v0;
                if (ryVar != null && ryVar.d == longValue2 && ryVar.f.size() < tL_messages_stickerSet.documents.size()) {
                    ryVar.f = tL_messages_stickerSet.documents;
                    ryVar.l();
                }
                if (vxVar != null && vxVar.d == longValue2 && vxVar.f.size() < tL_messages_stickerSet.documents.size()) {
                    vxVar.f = tL_messages_stickerSet.documents;
                    vxVar.l();
                }
            }
            TLRPC.ChatFull chatFull2 = this.F1;
            if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null && stickerSet.id == longValue2) {
                Y(false);
            }
            HashMap hashMap = this.n1;
            if (hashMap.containsKey(l10) && objArr.length >= 2 && ((Utilities.Callback) hashMap.get(l10)) != null && tL_messages_stickerSet != null && (callback = (Utilities.Callback) hashMap.remove(l10)) != null) {
                callback.run(tL_messages_stickerSet);
            }
            AndroidUtilities.cancelRunOnUIThread(ovVar);
            AndroidUtilities.runOnUIThread(ovVar, 100L);
            return;
        }
        int i14 = NotificationCenter.emojiLoaded;
        ww wwVar = this.L;
        if (i9 != i14) {
            if (i9 != NotificationCenter.newEmojiSuggestionsAvailable) {
                if (i9 == NotificationCenter.currentUserPremiumStatusChanged) {
                    if (fxVar != null) {
                        fxVar.F(false);
                    }
                    U();
                    Y(false);
                    return;
                }
                return;
            }
            if (wwVar == null || !this.W) {
                return;
            }
            if ((this.R.c.k == 2 || wwVar.getAdapter() == vxVar) && !TextUtils.isEmpty(vxVar.v)) {
                vxVar.F(vxVar.v, true);
                return;
            }
            return;
        }
        fw fwVar = this.z0;
        if (fwVar != null) {
            int childCount2 = fwVar.getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt = fwVar.getChildAt(i15);
                if ((childAt instanceof org.telegram.ui.Cells.m8) || (childAt instanceof org.telegram.ui.Cells.d8)) {
                    childAt.invalidate();
                }
            }
        }
        if (wwVar != null) {
            wwVar.invalidate();
            int childCount3 = wwVar.getChildCount();
            for (int i16 = 0; i16 < childCount3; i16++) {
                View childAt2 = wwVar.getChildAt(i16);
                if (childAt2 instanceof fy) {
                    childAt2.invalidate();
                }
            }
        }
        iu iuVar = this.x1;
        if (iuVar != null) {
            iuVar.c.invalidate();
        }
        dx dxVar = this.l0;
        if (dxVar != null) {
            ta1 ta1Var = dxVar.e;
            int childCount4 = ta1Var.getChildCount();
            for (int i17 = 0; i17 < childCount4; i17++) {
                ta1Var.getChildAt(i17).invalidate();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        ng.d dVar;
        ig.e eVar;
        if (Build.VERSION.SDK_INT >= 31 && (dVar = this.h2) != null && (eVar = this.f2) != null) {
            C();
            RecordingCanvas a2 = dVar.a(getMeasuredWidth(), getMeasuredHeight());
            a2.drawColor(z(org.telegram.ui.ActionBar.f6.d6));
            if (SharedConfig.chatBlurEnabled()) {
                eVar.b(a2, -2);
            }
            dVar.b();
        }
        S();
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.h) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        if (this.n.getVisibility() != 8 && !this.q0 && this.s0) {
            canvas.drawColor(i0.a.k(-1, 25));
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.m2);
        if (navigationBarThirdButtonsFactor > 0.0f) {
            int l1 = org.telegram.ui.ActionBar.f6.l1(navigationBarThirdButtonsFactor, z(org.telegram.ui.ActionBar.f6.He));
            int i9 = this.y2;
            GradientDrawable gradientDrawable = this.x2;
            if (i9 != l1) {
                gradientDrawable.setColors(new int[]{l1, org.telegram.ui.ActionBar.f6.l1(0.66f, l1), i0.a.k(l1, 0)});
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

    public ArrayList<jx> getEmojipacks() {
        ArrayList<jx> arrayList = new ArrayList<>();
        int i9 = 0;
        while (true) {
            ArrayList arrayList2 = this.m1;
            if (i9 >= arrayList2.size()) {
                return arrayList;
            }
            jx jxVar = (jx) arrayList2.get(i9);
            boolean z10 = jxVar.g;
            ArrayList arrayList3 = this.l1;
            if ((!z10 && (jxVar.f || arrayList3.contains(Long.valueOf(jxVar.b.id)))) || (jxVar.g && !jxVar.f && !arrayList3.contains(Long.valueOf(jxVar.b.id)))) {
                arrayList.add(jxVar);
            }
            i9++;
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
            int i9 = 0;
            while (true) {
                ArrayList<String> arrayList = Emoji.recentEmoji;
                if (i9 >= arrayList.size()) {
                    break;
                }
                if (!arrayList.get(i9).startsWith("animated_")) {
                    this.z2.add(arrayList.get(i9));
                }
                i9++;
            }
            this.A2 = this.z2.size();
        }
        return this.z2;
    }

    public float getStickersExpandOffset() {
        jw jwVar = this.x0;
        if (jwVar == null) {
            return 0.0f;
        }
        return jwVar.getExpandedOffset();
    }

    public final void h(String str) {
        if (str == null) {
            return;
        }
        if (!str.startsWith("animated_") && !Emoji.isValidEmoji(str)) {
            return;
        }
        Emoji.addRecentEmoji(str);
        int i9 = 0;
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
            if (i9 >= arrayList2.size()) {
                this.A2 = this.z2.size();
                return;
            } else {
                if (!arrayList2.get(i9).startsWith("animated_")) {
                    this.z2.add(arrayList2.get(i9));
                }
                i9++;
            }
        }
    }

    public final void i(int i9, int i10, boolean z10) {
        if (i9 == 2 || x(i9).K(0) == null) {
            return;
        }
        tw twVar = new tw(getContext(), i10);
        twVar.a = !z10 ? 1 : 0;
        w(i9).w0(twVar);
    }

    public final void k(boolean z10) {
        if (z10) {
            X();
            return;
        }
        int size = this.f1.size();
        int size2 = this.g1.size();
        int i9 = this.Y0;
        this.f1 = MediaDataController.getInstance(i9).getRecentStickers(0, true);
        this.g1 = MediaDataController.getInstance(i9).getRecentStickers(2);
        if (UserConfig.getInstance(i9).isPremium()) {
            this.h1 = MediaDataController.getInstance(i9).getRecentStickers(7);
        } else {
            this.h1 = new ArrayList();
        }
        for (int i10 = 0; i10 < this.g1.size(); i10++) {
            TLRPC.Document document = (TLRPC.Document) this.g1.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 < this.f1.size()) {
                    TLRPC.Document document2 = (TLRPC.Document) this.f1.get(i11);
                    if (document2.dc_id == document.dc_id && document2.id == document.id) {
                        this.f1.remove(i11);
                        break;
                    }
                    i11++;
                }
            }
        }
        if (MessagesController.getInstance(i9).premiumFeaturesBlocked()) {
            int i12 = 0;
            while (i12 < this.g1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.g1.get(i12))) {
                    this.g1.remove(i12);
                    i12--;
                }
                i12++;
            }
            int i13 = 0;
            while (i13 < this.f1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.f1.get(i13))) {
                    this.f1.remove(i13);
                    i13--;
                }
                i13++;
            }
        }
        if (size != this.f1.size() || size2 != this.g1.size()) {
            Y(false);
        }
        ny nyVar = this.u0;
        if (nyVar != null) {
            nyVar.l();
        }
        o();
    }

    public final void l(boolean z10) {
        wx wxVar = this.p1;
        td.a aVar = this.b;
        ww wwVar = this.L;
        wv wvVar = this.R;
        if (wxVar != null && wxVar.z()) {
            f2.q1 K = wwVar.K(0);
            if (K == null) {
                jy.a(wvVar, true, !z10);
            } else {
                jy.a(wvVar, K.a.getTop() < wwVar.getPaddingTop(), !z10);
            }
            O(false, !z10);
            wvVar.setTranslationY(aVar.e * AndroidUtilities.dp(15.0f));
            return;
        }
        if (wvVar == null || wwVar == null) {
            return;
        }
        wvVar.setTranslationY((aVar.e * AndroidUtilities.dp(15.0f)) + (wwVar.K(0) != null ? r0.a.getTop() : -this.X0));
        wvVar.a.a(false, !z10);
        m(Math.round(this.E.getTranslationY()));
    }

    public final void m(int i9) {
        ObjectAnimator objectAnimator = this.N0[1];
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            boolean z10 = false;
            f2.q1 K = this.L.K(0);
            int dp = AndroidUtilities.dp(38.0f) + i9;
            if (dp > 0 && (K == null || K.a.getBottom() < dp)) {
                z10 = true;
            }
            O(z10, !this.G1);
        }
    }

    public final void n(ww wwVar, int i9) {
        ww wwVar2;
        f2.q1 K;
        vv vvVar = this.E;
        int[] iArr = this.M0;
        if (wwVar == null) {
            iArr[1] = 0;
            vvVar.setTranslationY(0);
            return;
        }
        if (wwVar.getVisibility() != 0 || this.b0) {
            return;
        }
        wx wxVar = this.p1;
        if (wxVar == null || !wxVar.z()) {
            if (i9 > 0 && (wwVar2 = this.L) != null && wwVar2.getVisibility() == 0 && (K = wwVar2.K(0)) != null) {
                if (K.a.getTop() + (this.W ? this.X0 : 0) >= wwVar2.getPaddingTop()) {
                    return;
                }
            }
            int i10 = iArr[1] - i9;
            iArr[1] = i10;
            if (i10 > 0) {
                iArr[1] = 0;
            } else if (i10 < (-AndroidUtilities.dp(108.0f))) {
                iArr[1] = -AndroidUtilities.dp(108.0f);
            }
            vvVar.setTranslationY(Math.max(-AndroidUtilities.dp(36.0f), iArr[1]));
        }
    }

    public final void o() {
        int L0;
        jw jwVar = this.x0;
        if (jwVar == null || (L0 = this.A0.L0()) == -1) {
            return;
        }
        int i9 = this.C1;
        if (i9 <= 0 && (i9 = this.B1) <= 0) {
            i9 = this.A1;
        }
        jwVar.k(this.u0.F(L0), i9);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        int i9 = this.Y0;
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.groupPackUpdated);
        if (this.u0 != null) {
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.stickersDidLoad);
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.featuredStickersDidLoad);
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.groupStickersDidLoad);
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
            AndroidUtilities.runOnUIThread(new ov(this, 0));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        iu iuVar = this.x1;
        if (iuVar != null && iuVar.isShowing()) {
            iuVar.dismiss();
        }
        org.telegram.ui.ht q10 = org.telegram.ui.ht.q();
        if (q10.l == this.c2) {
            q10.W = null;
            q10.a0 = null;
            q10.Y = null;
            q10.l = null;
            q10.c0 = null;
            q10.u();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13 = i11 - i9;
        if (this.K1 != i13) {
            this.K1 = i13;
            F();
        }
        super.onLayout(z10, i9, i10, i11, i12);
        S();
        Z();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
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
                int i11 = org.telegram.ui.ActionBar.f6.He;
                background.setColorFilter(new PorterDuffColorFilter(z(i11), PorterDuff.Mode.MULTIPLY));
                if (z11 && this.q0) {
                    view.setBackgroundColor(z(i11));
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
                int i12 = org.telegram.ui.ActionBar.f6.He;
                setBackgroundColor(z(i12));
                if (z11) {
                    view.setBackgroundColor(z(i12));
                }
            }
            this.H1 = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
        this.G1 = false;
        setTranslationY(getTranslationY());
    }

    public final void p(int i9) {
        int L0;
        int L02;
        if (i9 == 0) {
            if (this.F0 || (L02 = this.A0.L0()) == -1 || this.z0 == null) {
                return;
            }
            int i10 = this.C1;
            if (i10 <= 0 && (i10 = this.B1) <= 0) {
                i10 = this.A1;
            }
            this.x0.k(this.u0.F(L02), i10);
            return;
        }
        if (i9 == 2) {
            f2.r0 adapter = this.d0.getAdapter();
            ay ayVar = this.j0;
            if (adapter != ayVar || ayVar.E < 0 || this.o0 < 0 || this.n0 < 0 || (L0 = this.e0.L0()) == -1) {
                return;
            }
            this.l0.k(L0 >= ayVar.E ? this.o0 : this.n0, 0);
        }
    }

    public final void q(boolean z10) {
        wx wxVar = this.p1;
        td.a aVar = this.a;
        fw fwVar = this.z0;
        iw iwVar = this.C0;
        if (wxVar != null && wxVar.z()) {
            f2.q1 K = fwVar.K(0);
            if (K == null) {
                jy.a(iwVar, true, !z10);
            } else {
                jy.a(iwVar, K.a.getTop() < fwVar.getPaddingTop(), !z10);
            }
            iwVar.setTranslationY(aVar.e * AndroidUtilities.dp(15.0f));
            return;
        }
        if (iwVar == null || fwVar == null) {
            return;
        }
        iwVar.setTranslationY((aVar.e * AndroidUtilities.dp(15.0f)) + (fwVar.K(0) != null ? r0.a.getTop() : -this.X0));
        iwVar.a.a(false, !z10);
    }

    public final void r() {
        Emoji.clearRecentEmoji();
        this.N.F(false);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.G1) {
            return;
        }
        super.requestLayout();
    }

    public final void s(long j10, boolean z10) {
        jy jyVar;
        f2.m0 m0Var;
        View view;
        View view2;
        int i9;
        TLRPC.TL_messages_stickerSet stickerSetById;
        ny nyVar;
        int E;
        AnimatorSet animatorSet = this.I0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.I0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        if (currentItem == 2 && j10 != -1 && (stickerSetById = MediaDataController.getInstance(this.Y0).getStickerSetById(j10)) != null && (E = (nyVar = this.u0).E(stickerSetById)) >= 0 && E < nyVar.h()) {
            I(E, AndroidUtilities.dp(48.0f));
        }
        ay ayVar = this.f0;
        if (ayVar != null) {
            ayVar.G = false;
        }
        for (int i10 = 0; i10 < 3; i10++) {
            View view3 = this.z0;
            View view4 = this.d0;
            cw cwVar = this.k0;
            View view5 = this.L;
            if (i10 == 0) {
                jyVar = this.R;
                m0Var = this.M;
                view = this.E;
                view2 = view5;
            } else if (i10 == 1) {
                m0Var = this.e0;
                view = this.l0;
                view2 = view4;
                jyVar = cwVar;
            } else {
                jyVar = this.C0;
                m0Var = this.A0;
                view = this.x0;
                view2 = view3;
            }
            if (jyVar != null) {
                iy iyVar = jyVar.r;
                jyVar.d.setText("");
                if (iyVar != null) {
                    iyVar.F1(null);
                    iyVar.D1();
                }
                int i11 = this.X0;
                if (i10 == currentItem && z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.I0 = animatorSet2;
                    Property property = View.TRANSLATION_Y;
                    if (view == null || i10 == 1) {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, AndroidUtilities.dp(36.0f) - i11));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, AndroidUtilities.dp(36.0f)), ObjectAnimator.ofFloat(jyVar, (Property<jy, Float>) property, AndroidUtilities.dp(36.0f)));
                    }
                    this.I0.setDuration(200L);
                    this.I0.setInterpolator(gr.h);
                    this.I0.addListener(new ih.j3(this, m0Var, view2, 5));
                    this.I0.start();
                } else {
                    if (jyVar != cwVar) {
                        jyVar.setTranslationY(AndroidUtilities.dp(36.0f) - i11);
                    }
                    if (view != null && i10 != 2) {
                        view.setTranslationY(0.0f);
                    }
                    if (view2 == view3) {
                        i9 = 0;
                        view2.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + this.m2);
                    } else {
                        i9 = 0;
                        if (view2 == view4) {
                            view2.setPadding(0, AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(44.0f) + this.m2);
                        } else {
                            if (view2 == view5) {
                                view2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + this.m2);
                            }
                            i9 = 0;
                        }
                    }
                    m0Var.h1(i9, i9);
                }
            }
        }
        if (z10) {
            return;
        }
        this.p1.i(0);
    }

    public void setBlurredBackgroundDrawableFactory(ig.a aVar) {
        org.telegram.ui.ActionBar.b6 b6Var = this.V1;
        mw mwVar = this.x;
        if (mwVar != null) {
            kg.d c10 = aVar.c(mwVar, null, false);
            c10.n(mg.c.d(b6Var));
            c10.p(AndroidUtilities.dp(18.0f));
            c10.o(AndroidUtilities.dp(6.0f));
            mwVar.setBackground(c10);
        }
        ImageView imageView = this.A;
        if (imageView != null) {
            kg.d c11 = aVar.c(imageView, null, false);
            c11.n(mg.c.d(b6Var));
            c11.p(AndroidUtilities.dp(18.0f));
            c11.o(AndroidUtilities.dp(6.0f));
            imageView.setBackground(c11);
        }
        kc0 kc0Var = this.w;
        if (kc0Var != null) {
            kg.d c12 = aVar.c(kc0Var, null, false);
            c12.n(mg.c.d(b6Var));
            c12.p(AndroidUtilities.dp(18.0f));
            c12.o(AndroidUtilities.dp(6.0f));
            kc0Var.setBackground(c12);
        }
        ImageView imageView2 = this.y;
        if (imageView2 != null) {
            kg.d c13 = aVar.c(imageView2, null, false);
            c13.n(mg.c.d(b6Var));
            c13.p(AndroidUtilities.dp(18.0f));
            c13.o(AndroidUtilities.dp(6.0f));
            imageView2.setBackground(c13);
        }
    }

    public void setBottomInset(int i9) {
        if (this.m2 != i9) {
            this.m2 = i9;
            j(i9, this.G);
            j(i9, this.I);
            j(AndroidUtilities.dp(44.0f) + i9, this.L);
            j(AndroidUtilities.dp(44.0f) + i9, this.z0);
            j(AndroidUtilities.dp(44.0f) + i9, this.d0);
            FrameLayout frameLayout = this.s;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-i9);
            }
            S();
            invalidate();
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.F1 = chatFull;
        Y(false);
    }

    public void setDelegate(wx wxVar) {
        this.p1 = wxVar;
    }

    public void setDragListener(cx cxVar) {
        this.K0 = cxVar;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        iw iwVar = this.C0;
        if (iwVar != null) {
            iwVar.d.setEnabled(z10);
        }
        cw cwVar = this.k0;
        if (cwVar != null) {
            cwVar.d.setEnabled(z10);
        }
        wv wvVar = this.R;
        if (wvVar != null) {
            wvVar.d.setEnabled(z10);
        }
    }

    public void setForseMultiwindowLayout(boolean z10) {
        this.J1 = z10;
    }

    public void setShouldDrawBackground(boolean z10) {
        if (this.q0 != z10) {
            this.q0 = z10;
            T();
        }
    }

    public void setShowing(boolean z10) {
        this.L0 = z10;
        Z();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        Z();
        S();
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        boolean z10 = getVisibility() != i9;
        super.setVisibility(i9);
        if (z10) {
            if (i9 != 8) {
                Emoji.sortEmoji();
                this.N.F(false);
                int i10 = this.Y0;
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.stickersDidLoad);
                if (this.u0 != null) {
                    NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
                    Y(false);
                    F();
                }
                k(true);
                k(false);
                MediaDataController.getInstance(i10).loadRecents(0, true, true, false);
                MediaDataController.getInstance(i10).loadRecents(0, false, true, false);
                MediaDataController.getInstance(i10).loadRecents(2, false, true, false);
            }
            of.b1 b1Var = this.P0;
            if (b1Var != null) {
                b1Var.a();
            }
        }
    }

    public final void t(boolean z10) {
        s(-1L, z10);
    }

    public final void u(boolean z10) {
        ny nyVar;
        boolean z11 = this.J2;
        this.J2 = z10;
        if (!z11 || z10) {
            return;
        }
        int i9 = this.w1;
        if (i9 == 0) {
            fx fxVar = this.N;
            if (fxVar != null) {
                fxVar.F(false);
                return;
            }
            return;
        }
        if (i9 == 1) {
            ay ayVar = this.j0;
            if (ayVar != null) {
                ayVar.l();
                return;
            }
            return;
        }
        if (i9 != 2 || (nyVar = this.u0) == null) {
            return;
        }
        nyVar.l();
    }

    public final int v(float f10) {
        return i0.a.k(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Wk, this.V1), (int) (f10 * 255.0f));
    }

    public final f2.y w(int i9) {
        if (i9 == 0) {
            return this.A0;
        }
        if (i9 == 1) {
            return this.M;
        }
        if (i9 == 2) {
            return this.e0;
        }
        throw new IllegalArgumentException(j3.r0.l(i9, "Unexpected argument: "));
    }

    public final wk0 x(int i9) {
        if (i9 == 0) {
            return this.z0;
        }
        if (i9 == 1) {
            return this.L;
        }
        if (i9 == 2) {
            return this.d0;
        }
        throw new IllegalArgumentException(j3.r0.l(i9, "Unexpected argument: "));
    }

    public final HorizontalScrollView y(int i9) {
        if (i9 == 0) {
            return this.x0;
        }
        if (i9 == 1) {
            return this.E;
        }
        if (i9 == 2) {
            return this.l0;
        }
        throw new IllegalArgumentException(j3.r0.l(i9, "Unexpected argument: "));
    }

    public final int z(int i9) {
        org.telegram.ui.ActionBar.b6 b6Var = this.V1;
        return b6Var != null ? b6Var.N0(i9) : org.telegram.ui.ActionBar.f6.w0(null, i9, false);
    }

    @Override // td.b
    public final void B(float f10, int i9) {
    }
}
