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
import org.telegram.ui.ua1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class fz extends FrameLayout implements vd.b, NotificationCenter.NotificationCenterDelegate, ah.a {
    public static final /* synthetic */ int K2 = 0;
    public final ImageView A;
    public final mw A0;
    public int A1;
    public int A2;
    public AnimatorSet B;
    public dz B0;
    public int B1;
    public long B2;
    public AnimatorSet C;
    public final ow C0;
    public int C1;
    public final vd.a C2;
    public float D;
    public final yg.d D0;
    public int D1;
    public ArrayList D2;
    public final bw E;
    public boolean E0;
    public int E1;
    public boolean E2;
    public final cx F;
    public boolean F0;
    public TLRPC.ChatFull F1;
    public AnimatorSet F2;
    public final rf.d G;
    public boolean G0;
    public boolean G1;
    public org.telegram.messenger.video.k G2;
    public final yg.b H;
    public final xx H0;
    public int H1;
    public final uv H2;
    public final rf.d I;
    public AnimatorSet I0;
    public final jf.o0 I1;
    public boolean I2;
    public final yg.b J;
    public final eg.r J0;
    public boolean J1;
    public boolean J2;
    public final View K;
    public jx K0;
    public int K1;
    public final dx L;
    public boolean L0;
    public boolean L1;
    public final ex M;
    public final int[] M0;
    public boolean M1;
    public final nx N;
    public final ObjectAnimator[] N0;
    public ny N1;
    public final ey O;
    public boolean O0;
    public float O1;
    public dz P;
    public vw P0;
    public float P1;
    public final yg.d Q;
    public boolean Q0;
    public float Q1;
    public final cw R;
    public boolean R0;
    public float R1;
    public AnimatorSet S;
    public String[] S0;
    public float S1;
    public final c2.z T;
    public final Drawable[] T0;
    public boolean T1;
    public final c2.z U;
    public final Drawable[] U0;
    public final org.telegram.ui.ActionBar.o2 U1;
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
    public final vd.a a;
    public boolean a0;
    public int a1;
    public PorterDuffColorFilter a2;
    public final vd.a b;
    public boolean b0;
    public int b1;
    public final lh.m7 b2;
    public int c;
    public final ew c0;
    public boolean c1;
    public final ww c2;
    public final ArrayList d;
    public final fw d0;
    public TLRPC.TL_messages_stickerSet d1;
    public boolean d2;
    public final ArrayList e;
    public final ky e0;
    public ArrayList e1;
    public final boolean e2;
    public boolean f;
    public final jy f0;
    public ArrayList f1;
    public final lg.e f2;
    public final my g0;
    public ArrayList g1;
    public final dh g2;
    public final rw h;
    public final HashMap h0;
    public ArrayList h1;
    public final qg.d h2;
    public final zv i0;
    public final ArrayList i1;
    public final qg.c i2;
    public final jy j0;
    public final ArrayList j1;
    public final lg.a j2;
    public final iw k0;
    public final ArrayList k1;
    public boolean k2;
    public final kx l0;
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
    public fy p1;
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
    public final jw t0;
    public final TLRPC.StickerSetCovered[] t1;
    public boolean t2;
    public final wy u0;
    public final LongSparseArray u1;
    public final Rect u2;
    public final View v;
    public final az v0;
    public final LongSparseArray v1;
    public final RectF v2;
    public final zc0 w;
    public final zv w0;
    public int w1;
    public final ArrayList w2;
    public final sw x;
    public final pw x0;
    public final ou x1;
    public final GradientDrawable x2;
    public final ImageView y;
    public final qw y0;
    public final int y1;
    public int y2;
    public final lw z0;
    public final int[] z1;
    public ArrayList z2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v52, types: [org.telegram.ui.Components.zk0, org.telegram.ui.Components.zv] */
    /* JADX WARN: Type inference failed for: r8v15, types: [org.telegram.ui.Components.zk0, org.telegram.ui.Components.zv] */
    public fz(org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11, boolean z12, Context context, boolean z13, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z14, final org.telegram.ui.ActionBar.c6 c6Var, boolean z15, boolean z16) {
        super(context);
        org.telegram.ui.ActionBar.r5 r5Var;
        int A;
        dx dxVar;
        uv uvVar;
        boolean z17;
        boolean z18;
        Field field;
        jr jrVar = jr.h;
        this.a = new vd.a(0, this, jrVar, 320L, false);
        this.b = new vd.a(1, this, jrVar, 320L, false);
        this.c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = new ArrayList();
        this.V = true;
        this.g0 = new my(this);
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
        this.b2 = new lh.m7(this, 21);
        this.c2 = new ww(this);
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
        this.C2 = new vd.a(0, new xv(this, 1), jrVar, 380L, true);
        this.H2 = new uv(this, 2);
        this.I2 = false;
        this.q0 = z14;
        this.U1 = o2Var;
        this.Y1 = z10;
        this.V1 = c6Var;
        this.e2 = z16;
        qg.c cVar = new qg.c();
        this.i2 = cVar;
        cVar.a(A(org.telegram.ui.ActionBar.g6.d6));
        if (z15) {
            u(true);
        }
        i0.a.k(A(org.telegram.ui.ActionBar.g6.Wk), 30);
        int dp = AndroidUtilities.dp(50.0f);
        this.X0 = dp;
        this.W = z13;
        this.T0 = new Drawable[]{org.telegram.ui.ActionBar.g6.U(context, R.drawable.smiles_tab_smiles, z16 ? v(0.4f) : A(org.telegram.ui.ActionBar.g6.Re), z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.g6.Oe)), org.telegram.ui.ActionBar.g6.U(context, R.drawable.smiles_tab_gif, z16 ? v(0.4f) : A(org.telegram.ui.ActionBar.g6.Re), z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.g6.Oe)), org.telegram.ui.ActionBar.g6.U(context, R.drawable.smiles_tab_stickers, z16 ? v(0.4f) : A(org.telegram.ui.ActionBar.g6.Re), z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.g6.Oe))};
        org.telegram.ui.ActionBar.r5 U = org.telegram.ui.ActionBar.g6.U(context, R.drawable.msg_emoji_recent, z16 ? v(0.4f) : A(org.telegram.ui.ActionBar.g6.Me), z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.g6.Oe));
        org.telegram.ui.ActionBar.r5 U2 = org.telegram.ui.ActionBar.g6.U(context, R.drawable.emoji_tabs_faves, z16 ? v(0.4f) : A(org.telegram.ui.ActionBar.g6.Me), z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.g6.Oe));
        org.telegram.ui.ActionBar.r5 U3 = org.telegram.ui.ActionBar.g6.U(context, R.drawable.emoji_tabs_new3, z16 ? v(0.4f) : A(org.telegram.ui.ActionBar.g6.Me), z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.g6.Oe));
        int i11 = R.drawable.emoji_tabs_new1;
        if (z16) {
            r5Var = U3;
            A = v(0.4f);
        } else {
            r5Var = U3;
            A = A(org.telegram.ui.ActionBar.g6.Me);
        }
        org.telegram.ui.ActionBar.r5 U4 = org.telegram.ui.ActionBar.g6.U(context, i11, A, z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.g6.Oe));
        this.W1 = U4;
        int i12 = R.drawable.emoji_tabs_new2;
        int i13 = org.telegram.ui.ActionBar.g6.Qe;
        org.telegram.ui.ActionBar.r5 U5 = org.telegram.ui.ActionBar.g6.U(context, i12, A(i13), A(i13));
        this.X1 = U5;
        this.U0 = new Drawable[]{U, U2, r5Var, new LayerDrawable(new Drawable[]{U4, U5})};
        this.V0 = new Drawable[]{org.telegram.ui.ActionBar.g6.U(context, R.drawable.msg_emoji_recent, z16 ? v(0.4f) : A(org.telegram.ui.ActionBar.g6.Me), z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.g6.Oe)), org.telegram.ui.ActionBar.g6.U(context, R.drawable.stickers_gifs_trending, z16 ? v(0.4f) : A(org.telegram.ui.ActionBar.g6.Me), z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.g6.Oe))};
        this.W0 = new String[]{LocaleController.getString(R.string.Emoji1), LocaleController.getString(R.string.Emoji2), LocaleController.getString(R.string.Emoji3), LocaleController.getString(R.string.Emoji4), LocaleController.getString(R.string.Emoji5), LocaleController.getString(R.string.Emoji6), LocaleController.getString(R.string.Emoji7), LocaleController.getString(R.string.Emoji8)};
        this.F1 = chatFull;
        Paint paint = new Paint(1);
        this.o1 = paint;
        paint.setColor(A(org.telegram.ui.ActionBar.g6.af));
        float dp2 = AndroidUtilities.dp(6.0f);
        eg.k1 k1Var = jf.q0.a;
        this.I1 = new jf.o0(dp2);
        cx cxVar = new cx(this, context);
        this.F = cxVar;
        bz bzVar = new bz();
        bzVar.a = 0;
        bzVar.b = cxVar;
        arrayList.add(bzVar);
        if (z10) {
            MediaDataController.getInstance(i10).checkStickers(5);
            MediaDataController.getInstance(i10).checkFeaturedEmoji();
            this.a2 = new PorterDuffColorFilter(A(org.telegram.ui.ActionBar.g6.Oh), PorterDuff.Mode.SRC_IN);
        }
        dx dxVar2 = new dx(this, context);
        this.L = dxVar2;
        f2.l lVar = new f2.l();
        lVar.c = 220L;
        lVar.e = 220L;
        lVar.f = 160L;
        lVar.g = 160L;
        lVar.i = jr.g;
        dxVar2.setItemAnimator(lVar);
        final int i14 = 0;
        dxVar2.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.wv
            public final /* synthetic */ fz b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (i14) {
                    case 0:
                        org.telegram.ui.ht q6 = org.telegram.ui.ht.q();
                        fz fzVar = this.b;
                        dx dxVar3 = fzVar.L;
                        fzVar.getMeasuredHeight();
                        return q6.s(motionEvent, dxVar3, null, fzVar.c2, c6Var);
                    case 1:
                        org.telegram.ui.ht q9 = org.telegram.ui.ht.q();
                        fz fzVar2 = this.b;
                        return q9.s(motionEvent, fzVar2.d0, fzVar2.i0, fzVar2.c2, c6Var);
                    default:
                        org.telegram.ui.ht q10 = org.telegram.ui.ht.q();
                        fz fzVar3 = this.b;
                        lw lwVar = fzVar3.z0;
                        fzVar3.getMeasuredHeight();
                        return q10.s(motionEvent, lwVar, fzVar3.w0, fzVar3.c2, c6Var);
                }
            }
        });
        dxVar2.setOnItemLongClickListener(new xv(this, i14));
        dxVar2.setInstantClick(true);
        ex exVar = new ex(this);
        this.M = exVar;
        dxVar2.setLayoutManager(exVar);
        dxVar2.setTopGlowOffset(AndroidUtilities.dp(38.0f));
        dxVar2.setBottomGlowOffset(AndroidUtilities.dp(36.0f));
        dxVar2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f));
        int i15 = org.telegram.ui.ActionBar.g6.He;
        dxVar2.setGlowColor(A(i15));
        dxVar2.setItemSelectorColorProvider(new r2(10));
        dxVar2.setClipToPadding(false);
        exVar.O = new fx(this);
        nx nxVar = new nx(this);
        this.N = nxVar;
        dxVar2.setAdapter(nxVar);
        dxVar2.i(new eg.f2(this, 4));
        this.O = new ey(this, context);
        cxVar.addView(dxVar2, i7.f6.c(-1.0f, -1));
        c2.z zVar = new c2.z(dxVar2, exVar);
        this.U = zVar;
        zVar.i = new gx(this);
        dxVar2.setOnScrollListener(new hx(this));
        if (o2Var != null) {
            dxVar = dxVar2;
            uvVar = new uv(this, 5);
        } else {
            dxVar = dxVar2;
            uvVar = null;
        }
        bw bwVar = new bw(this, context, c6Var, z10, uvVar, z16);
        this.E = bwVar;
        if (z13) {
            cw cwVar = new cw(this, context);
            this.R = cwVar;
            cxVar.addView(cwVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
            cwVar.d.setOnFocusChangeListener(new dw(this));
            yg.d dVar = new yg.d(context, c6Var);
            this.Q = dVar;
            dVar.setVisibility(8);
            final int i16 = 0;
            dVar.setOnBackClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.yv
                public final /* synthetic */ fz b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i16) {
                        case 0:
                            ey eyVar = this.b.O;
                            yx yxVar = eyVar.c;
                            int childCount = yxVar.getChildCount();
                            for (int i17 = 0; i17 < childCount; i17++) {
                                ((yg.c) yxVar.getChildAt(i17)).a(false, true);
                            }
                            eyVar.d = 0L;
                            eyVar.B.b.a(false, true);
                            eyVar.l();
                            break;
                        case 1:
                            az azVar = this.b.v0;
                            zy zyVar = azVar.c;
                            int childCount2 = zyVar.getChildCount();
                            for (int i18 = 0; i18 < childCount2; i18++) {
                                ((yg.c) zyVar.getChildAt(i18)).a(false, true);
                            }
                            azVar.d = 0L;
                            azVar.M.a.a(false, true);
                            azVar.l();
                            break;
                        case 2:
                            fy fyVar = this.b.p1;
                            if (fyVar != null) {
                                fyVar.w();
                                break;
                            }
                            break;
                        default:
                            fz fzVar = this.b;
                            int currentItem = fzVar.h.getCurrentItem();
                            ry ryVar = currentItem == 0 ? fzVar.R : currentItem == 1 ? fzVar.k0 : fzVar.C0;
                            if (ryVar != null) {
                                cq cqVar = ryVar.d;
                                cqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                cqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                cqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
            cxVar.addView(dVar, new FrameLayout.LayoutParams(-1, dp));
        }
        int A2 = A(i15);
        if (Color.alpha(A2) >= 255) {
            bwVar.setBackgroundColor(A2);
        }
        nxVar.G(true);
        bwVar.p(getEmojipacks());
        cxVar.addView(bwVar, i7.f6.c(36.0f, -1));
        View view = new View(context);
        this.K = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i17 = org.telegram.ui.ActionBar.g6.Ke;
        view.setBackgroundColor(A(i17));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(36.0f);
        cxVar.addView(view, layoutParams);
        yg.b bVar = new yg.b(context, c6Var);
        this.H = bVar;
        rf.d dVar2 = new rf.d(context, c6Var);
        this.G = dVar2;
        dVar2.setVisibility(8);
        dVar2.addView(bVar, i7.f6.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
        cxVar.addView(dVar2, i7.f6.e(-1, -2, 80));
        if (z11) {
            em0 em0Var = em0.b;
            if (z12) {
                ew ewVar = new ew(this, context);
                this.c0 = ewVar;
                bz bzVar2 = new bz();
                bzVar2.a = 1;
                bzVar2.b = ewVar;
                this.d.add(bzVar2);
                fw fwVar = new fw(this, context);
                this.d0 = fwVar;
                fwVar.setClipToPadding(false);
                ky kyVar = new ky(this);
                this.e0 = kyVar;
                fwVar.setLayoutManager(kyVar);
                fwVar.i(new gw(this));
                fwVar.setPadding(0, dp, 0, AndroidUtilities.dp(44.0f) + this.m2);
                fwVar.setOverScrollMode(2);
                ((f2.q1) fwVar.getItemAnimator()).m = false;
                jy jyVar = new jy(this, context, true, ConnectionsManager.DEFAULT_DATACENTER_ID);
                this.j0 = jyVar;
                fwVar.setAdapter(jyVar);
                this.f0 = new jy(this, context, false, 0);
                fwVar.setOnScrollListener(new hw(this));
                final int i18 = 1;
                fwVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.wv
                    public final /* synthetic */ fz b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (i18) {
                            case 0:
                                org.telegram.ui.ht q6 = org.telegram.ui.ht.q();
                                fz fzVar = this.b;
                                dx dxVar3 = fzVar.L;
                                fzVar.getMeasuredHeight();
                                return q6.s(motionEvent, dxVar3, null, fzVar.c2, c6Var);
                            case 1:
                                org.telegram.ui.ht q9 = org.telegram.ui.ht.q();
                                fz fzVar2 = this.b;
                                return q9.s(motionEvent, fzVar2.d0, fzVar2.i0, fzVar2.c2, c6Var);
                            default:
                                org.telegram.ui.ht q10 = org.telegram.ui.ht.q();
                                fz fzVar3 = this.b;
                                lw lwVar = fzVar3.z0;
                                fzVar3.getMeasuredHeight();
                                return q10.s(motionEvent, lwVar, fzVar3.w0, fzVar3.c2, c6Var);
                        }
                    }
                });
                final int i19 = 0;
                ?? r82 = new zk0(this) { // from class: org.telegram.ui.Components.zv
                    public final /* synthetic */ fz b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.ui.Components.zk0
                    public final void c(int i20, View view2) {
                        switch (i19) {
                            case 0:
                                fz fzVar = this.b;
                                fw fwVar2 = fzVar.d0;
                                jy jyVar2 = fzVar.f0;
                                jy jyVar3 = fzVar.j0;
                                if (fzVar.p1 != null) {
                                    jyVar3.getClass();
                                    ArrayList arrayList3 = jyVar3.x;
                                    if (fwVar2.getAdapter() != jyVar3) {
                                        if (fwVar2.getAdapter() == jyVar2 && i20 >= 0 && i20 < jyVar2.x.size()) {
                                            fzVar.p1.v(view2, jyVar2.x.get(i20), jyVar2.w, jyVar2.n, true, 0, 0);
                                            fzVar.Y();
                                            break;
                                        }
                                    } else if (i20 >= 0) {
                                        int i21 = jyVar3.D;
                                        if (i20 >= i21) {
                                            int i22 = i21 > 0 ? (i20 - i21) - 1 : i20;
                                            if (i22 >= 0 && i22 < arrayList3.size()) {
                                                fzVar.p1.v(view2, arrayList3.get(i22), null, jyVar3.n, true, 0, 0);
                                                break;
                                            }
                                        } else {
                                            fzVar.p1.v(view2, fzVar.e1.get(i20), null, "gif", true, 0, 0);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                fz fzVar2 = this.b;
                                f2.p0 adapter = fzVar2.z0.getAdapter();
                                az azVar = fzVar2.v0;
                                String str = adapter == azVar ? azVar.J : null;
                                if (view2 instanceof org.telegram.ui.Cells.b8) {
                                    org.telegram.ui.Cells.b8 b8Var = (org.telegram.ui.Cells.b8) view2;
                                    if (b8Var.getSticker() != null && MessageObject.isPremiumSticker(b8Var.getSticker()) && !AccountInstance.getInstance(fzVar2.Y0).getUserConfig().isPremium()) {
                                        org.telegram.ui.ht.q().y(b8Var);
                                        break;
                                    } else {
                                        org.telegram.ui.ht.q().u();
                                        if (!b8Var.r) {
                                            b8Var.r = true;
                                            b8Var.n = 0.5f;
                                            b8Var.x = 0L;
                                            org.telegram.ui.Cells.a8 a8Var = b8Var.a;
                                            a8Var.setAlpha(0.5f * b8Var.D);
                                            a8Var.invalidate();
                                            b8Var.s = System.currentTimeMillis();
                                            b8Var.invalidate();
                                            fzVar2.p1.m(b8Var, b8Var.getSticker(), str, b8Var.getParentObject(), b8Var.getSendAnimationData(), true, 0);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                };
                this.i0 = r82;
                fwVar.setOnItemClickListener((zk0) r82);
                ewVar.addView(fwVar, i7.f6.c(-1.0f, -1));
                iw iwVar = new iw(this, context);
                this.k0 = iwVar;
                ewVar.addView(iwVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
                kx kxVar = new kx(this, context, c6Var);
                this.l0 = kxVar;
                kxVar.setType(em0Var);
                kxVar.setUnderlineHeight(AndroidUtilities.getShadowHeight());
                kxVar.setIndicatorColor(A(i13));
                kxVar.setUnderlineColor(A(i17));
                kxVar.setBackgroundColor(A(i15));
                X();
                kxVar.setDelegate(new xv(this, 2));
                jyVar.F("", "", true, true, true);
            }
            jw jwVar = new jw(this, context, z14);
            this.t0 = jwVar;
            MediaDataController.getInstance(this.Y0).checkStickers(0);
            MediaDataController.getInstance(this.Y0).checkFeaturedStickers();
            lw lwVar = new lw(this, context);
            this.z0 = lwVar;
            mw mwVar = new mw(this);
            this.A0 = mwVar;
            lwVar.setLayoutManager(mwVar);
            mwVar.O = new nw(this);
            lwVar.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f));
            lwVar.setClipToPadding(false);
            bz bzVar3 = new bz();
            bzVar3.a = 2;
            bzVar3.b = jwVar;
            this.d.add(bzVar3);
            this.v0 = new az(this, context);
            wy wyVar = new wy(this, context);
            this.u0 = wyVar;
            lwVar.setAdapter(wyVar);
            final int i20 = 2;
            lwVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.wv
                public final /* synthetic */ fz b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (i20) {
                        case 0:
                            org.telegram.ui.ht q6 = org.telegram.ui.ht.q();
                            fz fzVar = this.b;
                            dx dxVar3 = fzVar.L;
                            fzVar.getMeasuredHeight();
                            return q6.s(motionEvent, dxVar3, null, fzVar.c2, c6Var);
                        case 1:
                            org.telegram.ui.ht q9 = org.telegram.ui.ht.q();
                            fz fzVar2 = this.b;
                            return q9.s(motionEvent, fzVar2.d0, fzVar2.i0, fzVar2.c2, c6Var);
                        default:
                            org.telegram.ui.ht q10 = org.telegram.ui.ht.q();
                            fz fzVar3 = this.b;
                            lw lwVar2 = fzVar3.z0;
                            fzVar3.getMeasuredHeight();
                            return q10.s(motionEvent, lwVar2, fzVar3.w0, fzVar3.c2, c6Var);
                    }
                }
            });
            final int i21 = 1;
            ?? r42 = new zk0(this) { // from class: org.telegram.ui.Components.zv
                public final /* synthetic */ fz b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.Components.zk0
                public final void c(int i202, View view2) {
                    switch (i21) {
                        case 0:
                            fz fzVar = this.b;
                            fw fwVar2 = fzVar.d0;
                            jy jyVar2 = fzVar.f0;
                            jy jyVar3 = fzVar.j0;
                            if (fzVar.p1 != null) {
                                jyVar3.getClass();
                                ArrayList arrayList3 = jyVar3.x;
                                if (fwVar2.getAdapter() != jyVar3) {
                                    if (fwVar2.getAdapter() == jyVar2 && i202 >= 0 && i202 < jyVar2.x.size()) {
                                        fzVar.p1.v(view2, jyVar2.x.get(i202), jyVar2.w, jyVar2.n, true, 0, 0);
                                        fzVar.Y();
                                        break;
                                    }
                                } else if (i202 >= 0) {
                                    int i212 = jyVar3.D;
                                    if (i202 >= i212) {
                                        int i22 = i212 > 0 ? (i202 - i212) - 1 : i202;
                                        if (i22 >= 0 && i22 < arrayList3.size()) {
                                            fzVar.p1.v(view2, arrayList3.get(i22), null, jyVar3.n, true, 0, 0);
                                            break;
                                        }
                                    } else {
                                        fzVar.p1.v(view2, fzVar.e1.get(i202), null, "gif", true, 0, 0);
                                        break;
                                    }
                                }
                            }
                            break;
                        default:
                            fz fzVar2 = this.b;
                            f2.p0 adapter = fzVar2.z0.getAdapter();
                            az azVar = fzVar2.v0;
                            String str = adapter == azVar ? azVar.J : null;
                            if (view2 instanceof org.telegram.ui.Cells.b8) {
                                org.telegram.ui.Cells.b8 b8Var = (org.telegram.ui.Cells.b8) view2;
                                if (b8Var.getSticker() != null && MessageObject.isPremiumSticker(b8Var.getSticker()) && !AccountInstance.getInstance(fzVar2.Y0).getUserConfig().isPremium()) {
                                    org.telegram.ui.ht.q().y(b8Var);
                                    break;
                                } else {
                                    org.telegram.ui.ht.q().u();
                                    if (!b8Var.r) {
                                        b8Var.r = true;
                                        b8Var.n = 0.5f;
                                        b8Var.x = 0L;
                                        org.telegram.ui.Cells.a8 a8Var = b8Var.a;
                                        a8Var.setAlpha(0.5f * b8Var.D);
                                        a8Var.invalidate();
                                        b8Var.s = System.currentTimeMillis();
                                        b8Var.invalidate();
                                        fzVar2.p1.m(b8Var, b8Var.getSticker(), str, b8Var.getParentObject(), b8Var.getSendAnimationData(), true, 0);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            };
            this.w0 = r42;
            lwVar.setOnItemClickListener((zk0) r42);
            lwVar.setGlowColor(A(i15));
            jwVar.addView(lwVar);
            this.T = new c2.z(lwVar, mwVar);
            ow owVar = new ow(this, context);
            this.C0 = owVar;
            jwVar.addView(owVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
            yg.d dVar3 = new yg.d(context, c6Var);
            this.D0 = dVar3;
            dVar3.setVisibility(8);
            final int i22 = 1;
            dVar3.setOnBackClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.yv
                public final /* synthetic */ fz b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i22) {
                        case 0:
                            ey eyVar = this.b.O;
                            yx yxVar = eyVar.c;
                            int childCount = yxVar.getChildCount();
                            for (int i172 = 0; i172 < childCount; i172++) {
                                ((yg.c) yxVar.getChildAt(i172)).a(false, true);
                            }
                            eyVar.d = 0L;
                            eyVar.B.b.a(false, true);
                            eyVar.l();
                            break;
                        case 1:
                            az azVar = this.b.v0;
                            zy zyVar = azVar.c;
                            int childCount2 = zyVar.getChildCount();
                            for (int i182 = 0; i182 < childCount2; i182++) {
                                ((yg.c) zyVar.getChildAt(i182)).a(false, true);
                            }
                            azVar.d = 0L;
                            azVar.M.a.a(false, true);
                            azVar.l();
                            break;
                        case 2:
                            fy fyVar = this.b.p1;
                            if (fyVar != null) {
                                fyVar.w();
                                break;
                            }
                            break;
                        default:
                            fz fzVar = this.b;
                            int currentItem = fzVar.h.getCurrentItem();
                            ry ryVar = currentItem == 0 ? fzVar.R : currentItem == 1 ? fzVar.k0 : fzVar.C0;
                            if (ryVar != null) {
                                cq cqVar = ryVar.d;
                                cqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                cqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                cqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
            jwVar.addView(dVar3, new FrameLayout.LayoutParams(-1, dp));
            z17 = z14;
            z18 = true;
            pw pwVar = new pw(this, context, c6Var, o2Var, z17);
            this.x0 = pwVar;
            pwVar.setDragEnabled(true);
            pwVar.setWillNotDraw(false);
            pwVar.setType(em0Var);
            pwVar.setUnderlineHeight(lwVar.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
            pwVar.setIndicatorColor(A(i13));
            pwVar.setUnderlineColor(A(i17));
            if (viewGroup == null || !z17) {
                jwVar.addView(pwVar, i7.f6.e(-1, 36, 51));
            } else {
                qw qwVar = new qw(this, context);
                this.y0 = qwVar;
                qwVar.addView(pwVar, i7.f6.e(-1, 36, 51));
                viewGroup.addView(qwVar, i7.f6.c(-2.0f, -1));
            }
            Z(true);
            pwVar.setDelegate(new xv(this, 3));
            lwVar.setOnScrollListener(new ez(this, 0));
            yg.b bVar2 = new yg.b(context, c6Var);
            this.J = bVar2;
            rf.d dVar4 = new rf.d(context, c6Var);
            this.I = dVar4;
            dVar4.setVisibility(8);
            dVar4.addView(bVar2, i7.f6.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
            jwVar.addView(dVar4, i7.f6.e(-1, -2, 80));
        } else {
            z17 = z14;
            z18 = true;
        }
        this.e.clear();
        this.e.addAll(this.d);
        rw rwVar = new rw(this, context);
        this.h = rwVar;
        xx xxVar = new xx(this);
        this.H0 = xxVar;
        rwVar.setAdapter(xxVar);
        sw swVar = new sw(this, context);
        this.x = swVar;
        swVar.setHapticFeedbackEnabled(z18);
        swVar.setImageResource(R.drawable.smiles_tab_clear);
        int v = z16 ? v(0.6f) : A(org.telegram.ui.ActionBar.g6.Re);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        swVar.setColorFilter(new PorterDuffColorFilter(v, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        swVar.setScaleType(scaleType);
        swVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        swVar.setFocusable(z18);
        swVar.setOnClickListener(new tw());
        i7.h6.a(swVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        if (z13) {
            addView(frameLayout, i7.f6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, (AndroidUtilities.getShadowHeight() / AndroidUtilities.density) + 40.0f));
        } else {
            addView(frameLayout, i7.f6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.s = frameLayout2;
        addView(frameLayout2, i7.f6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.n = frameLayout3;
        View view2 = new View(context);
        this.v = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(40.0f), 83));
        if (z13) {
            addView(frameLayout3, i7.f6.e(-1, 48, 80));
            frameLayout3.addView(swVar, i7.f6.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
            if (z11) {
                ImageView imageView = new ImageView(context);
                this.y = imageView;
                imageView.setImageResource(R.drawable.smiles_tab_settings);
                imageView.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : A(org.telegram.ui.ActionBar.g6.Re), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(LocaleController.getString(R.string.Settings));
                i7.h6.a(imageView);
                frameLayout3.addView(imageView, i7.f6.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
                final int i23 = 2;
                imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.yv
                    public final /* synthetic */ fz b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i23) {
                            case 0:
                                ey eyVar = this.b.O;
                                yx yxVar = eyVar.c;
                                int childCount = yxVar.getChildCount();
                                for (int i172 = 0; i172 < childCount; i172++) {
                                    ((yg.c) yxVar.getChildAt(i172)).a(false, true);
                                }
                                eyVar.d = 0L;
                                eyVar.B.b.a(false, true);
                                eyVar.l();
                                break;
                            case 1:
                                az azVar = this.b.v0;
                                zy zyVar = azVar.c;
                                int childCount2 = zyVar.getChildCount();
                                for (int i182 = 0; i182 < childCount2; i182++) {
                                    ((yg.c) zyVar.getChildAt(i182)).a(false, true);
                                }
                                azVar.d = 0L;
                                azVar.M.a.a(false, true);
                                azVar.l();
                                break;
                            case 2:
                                fy fyVar = this.b.p1;
                                if (fyVar != null) {
                                    fyVar.w();
                                    break;
                                }
                                break;
                            default:
                                fz fzVar = this.b;
                                int currentItem = fzVar.h.getCurrentItem();
                                ry ryVar = currentItem == 0 ? fzVar.R : currentItem == 1 ? fzVar.k0 : fzVar.C0;
                                if (ryVar != null) {
                                    cq cqVar = ryVar.d;
                                    cqVar.requestFocus();
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                    cqVar.onTouchEvent(obtain);
                                    obtain.recycle();
                                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                    cqVar.onTouchEvent(obtain2);
                                    obtain2.recycle();
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
            zc0 zc0Var = new zc0(context, c6Var);
            this.w = zc0Var;
            zc0Var.setViewPager(rwVar);
            zc0Var.setShouldExpand(false);
            zc0Var.setIndicatorHeight(AndroidUtilities.dp(3.0f));
            zc0Var.setIndicatorColor(i0.a.k(A(org.telegram.ui.ActionBar.g6.Oe), 20));
            zc0Var.setUnderlineHeight(0);
            zc0Var.setTabPaddingLeftRight(AndroidUtilities.dp(11.0f));
            zc0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
            frameLayout3.addView(zc0Var, i7.f6.e(-2, 48, 81));
            zc0Var.setOnPageChangeListener(new uw(this, z17));
            ImageView imageView2 = new ImageView(context);
            this.A = imageView2;
            imageView2.setImageResource(R.drawable.smiles_tab_search);
            imageView2.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : A(org.telegram.ui.ActionBar.g6.Re), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(LocaleController.getString(R.string.Search));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, i7.f6.d(48, 48.0f, 83, 2.0f, 0.0f, 2.0f, 0.0f));
            final int i24 = 3;
            imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.yv
                public final /* synthetic */ fz b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view22) {
                    switch (i24) {
                        case 0:
                            ey eyVar = this.b.O;
                            yx yxVar = eyVar.c;
                            int childCount = yxVar.getChildCount();
                            for (int i172 = 0; i172 < childCount; i172++) {
                                ((yg.c) yxVar.getChildAt(i172)).a(false, true);
                            }
                            eyVar.d = 0L;
                            eyVar.B.b.a(false, true);
                            eyVar.l();
                            break;
                        case 1:
                            az azVar = this.b.v0;
                            zy zyVar = azVar.c;
                            int childCount2 = zyVar.getChildCount();
                            for (int i182 = 0; i182 < childCount2; i182++) {
                                ((yg.c) zyVar.getChildAt(i182)).a(false, true);
                            }
                            azVar.d = 0L;
                            azVar.M.a.a(false, true);
                            azVar.l();
                            break;
                        case 2:
                            fy fyVar = this.b.p1;
                            if (fyVar != null) {
                                fyVar.w();
                                break;
                            }
                            break;
                        default:
                            fz fzVar = this.b;
                            int currentItem = fzVar.h.getCurrentItem();
                            ry ryVar = currentItem == 0 ? fzVar.R : currentItem == 1 ? fzVar.k0 : fzVar.C0;
                            if (ryVar != null) {
                                cq cqVar = ryVar.d;
                                cqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                cqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                cqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            addView(frameLayout3, i7.f6.d(56, 48.0f, (LocaleController.isRTL ? 3 : 5) | 80, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(56.0f), A(i15), A(i15));
            i7.h6.a(swVar);
            swVar.setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
            swVar.setBackground(h02);
            swVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
            swVar.setFocusable(true);
            frameLayout3.addView(swVar, i7.f6.d(48, 48.0f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
            view2.setVisibility(8);
        }
        addView(rwVar, 0, i7.f6.e(-1, -1, 51));
        eg.r rVar = new eg.r(context, 21);
        this.J0 = rVar;
        rVar.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(6.0f), A(org.telegram.ui.ActionBar.g6.qf)));
        rVar.setTextColor(A(org.telegram.ui.ActionBar.g6.pf));
        rVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f));
        rVar.setGravity(16);
        rVar.setTextSize(1, 14.0f);
        int i25 = 4;
        rVar.setVisibility(4);
        addView(rVar, i7.f6.d(-2, -2.0f, 81, 5.0f, 0.0f, 5.0f, 53.0f));
        this.y1 = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 32.0f);
        Field field2 = ou.f;
        ou ouVar = new ou(new nu(context, c6Var));
        if (ou.f == null) {
            try {
                field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    field.setAccessible(true);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                field = null;
            }
            ou.f = field;
        }
        Field field3 = ou.f;
        if (field3 != null) {
            try {
                ouVar.a = (ViewTreeObserver.OnScrollChangedListener) field3.get(ouVar);
                ou.f.set(ouVar, ou.g);
            } catch (Exception unused3) {
                ouVar.a = null;
            }
        }
        this.x1 = ouVar;
        ouVar.c.setOnSelectionUpdateListener(new d(this, 10));
        this.w1 = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
        Emoji.loadRecentEmoji();
        nxVar.F(false);
        J(true, z11, z12, false);
        if (Build.VERSION.SDK_INT >= 31) {
            qg.d dVar5 = new qg.d(null);
            this.h2 = dVar5;
            lg.a aVar = new lg.a(dVar5);
            this.j2 = aVar;
            aVar.f = LiteMode.isEnabled(262144);
            this.f2 = new lg.e(false);
        } else {
            this.h2 = null;
            this.j2 = new lg.a(this.i2);
            this.f2 = null;
        }
        sg.i iVar = new sg.i(this);
        zc0 zc0Var2 = this.w;
        if (zc0Var2 != null) {
            iVar.d(zc0Var2, this, new xv(this, i25), false);
        }
        lg.a aVar2 = this.j2;
        aVar2.d = iVar;
        aVar2.e = this;
        mg.a[] aVarArr = new mg.a[3];
        dx dxVar3 = dxVar;
        dxVar3.C0(new uv(this, 1));
        aVarArr[0] = new lg.k(dxVar3, this, new vv(dxVar3, 0));
        fw fwVar2 = this.d0;
        if (fwVar2 != null) {
            fwVar2.C0(new uv(this, 3));
            fw fwVar3 = this.d0;
            Objects.requireNonNull(fwVar3);
            aVarArr[1] = new lg.k(fwVar3, this, new vv(fwVar3, 1));
        }
        lw lwVar2 = this.z0;
        if (lwVar2 != null) {
            lwVar2.C0(new uv(this, i25));
            aVarArr[2] = new lg.k(this.z0, this, new vv(this, 2));
        }
        this.g2 = new dh(aVarArr, 1);
        setBlurredBackgroundDrawableFactory(this.j2);
    }

    public static void a(fz fzVar, boolean z10) {
        fw fwVar = fzVar.d0;
        if (fwVar == null) {
            return;
        }
        int childCount = fwVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = fwVar.getChildAt(i10);
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

    public static void b(fz fzVar, ny nyVar, String str) {
        String str2;
        fy fyVar;
        org.telegram.ui.ActionBar.o2 o2Var = fzVar.U1;
        int i10 = fzVar.Y0;
        ArrayList arrayList = fzVar.m1;
        if (nyVar == null) {
            return;
        }
        if (nyVar.getSpan() == null) {
            fzVar.B2 = SystemClock.elapsedRealtime();
            fzVar.O(true);
            String str3 = str != null ? str : (String) nyVar.getTag();
            new SpannableStringBuilder().append((CharSequence) str3);
            if (str != null) {
                fy fyVar2 = fzVar.p1;
                if (fyVar2 != null) {
                    fyVar2.l(Emoji.fixEmoji(str));
                    return;
                }
                return;
            }
            if (!nyVar.c && (str2 = Emoji.emojiColor.get(str3)) != null) {
                str3 = g(str3, str2);
            }
            fzVar.h(str3);
            fy fyVar3 = fzVar.p1;
            if (fyVar3 != null) {
                fyVar3.l(Emoji.fixEmoji(str3));
                return;
            }
            return;
        }
        if (fzVar.p1 != null) {
            long j10 = nyVar.getSpan().documentId;
            TLRPC.Document document = nyVar.getSpan().document;
            rx rxVar = nyVar.e;
            boolean z10 = rxVar != null && rxVar.i;
            if (document == null) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    rx rxVar2 = (rx) arrayList.get(i11);
                    int i12 = 0;
                    while (true) {
                        ArrayList arrayList2 = rxVar2.c;
                        if (arrayList2 != null && i12 < arrayList2.size()) {
                            if (((TLRPC.Document) rxVar2.c.get(i12)).id == j10) {
                                document = (TLRPC.Document) rxVar2.c.get(i12);
                                break;
                            }
                            i12++;
                        }
                    }
                }
            }
            if (document == null) {
                document = p5.f(i10, j10);
            }
            String findAnimatedEmojiEmoticon = document != null ? MessageObject.findAnimatedEmojiEmoticon(document) : null;
            if (MessageObject.isFreeEmoji(document) || UserConfig.getInstance(i10).isPremium() || (((fyVar = fzVar.p1) != null && fyVar.g()) || fzVar.Q0 || z10)) {
                fzVar.B2 = SystemClock.elapsedRealtime();
                fzVar.O(true);
                fzVar.h("animated_" + j10);
                fzVar.p1.x(j10, document, findAnimatedEmojiEmoticon, nyVar.c);
                return;
            }
            fzVar.O(false);
            tc a02 = o2Var != null ? tc.a0(o2Var) : new tc(fzVar.r, fzVar.V1);
            if (fzVar.d2 || o2Var == null) {
                a02.q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new uv(fzVar, 7)).j();
            } else {
                a02.J(R.raw.saved_messages, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint2)), LocaleController.getString(R.string.Open), new uv(fzVar, 8)).j();
            }
            fzVar.d2 = !fzVar.d2;
        }
    }

    public static void e(fz fzVar, int i10, int i11) {
        f2.n1 K;
        int[] iArr = fzVar.M0;
        if (i10 == 1) {
            fzVar.n(fzVar.L, i11);
            return;
        }
        fy fyVar = fzVar.p1;
        if ((fyVar == null || !fyVar.z()) && !fzVar.F0) {
            jl0 x4 = fzVar.x(i10);
            if (i11 <= 0 || x4 == null || x4.getVisibility() != 0 || (K = x4.K(0)) == null || K.a.getTop() + fzVar.X0 < x4.getPaddingTop()) {
                int i12 = iArr[i10] - i11;
                iArr[i10] = i12;
                if (i12 > 0) {
                    iArr[i10] = 0;
                } else if (i12 < (-AndroidUtilities.dp(288.0f))) {
                    iArr[i10] = -AndroidUtilities.dp(288.0f);
                }
                if (i10 == 0) {
                    fzVar.a0();
                } else {
                    fzVar.y(i10).setTranslationY(Math.max(-AndroidUtilities.dp(48.0f), iArr[i10]));
                }
            }
        }
    }

    public static void f(fz fzVar, boolean z10) {
        int N0;
        ky kyVar = fzVar.e0;
        iw iwVar = fzVar.k0;
        fw fwVar = fzVar.d0;
        if (fwVar != null && (fwVar.getAdapter() instanceof jy)) {
            jy jyVar = (jy) fwVar.getAdapter();
            if (!jyVar.s && jyVar.h == 0 && !jyVar.x.isEmpty() && (N0 = kyVar.N0()) != -1 && N0 > kyVar.B() - 5) {
                String str = jyVar.w;
                String str2 = jyVar.r;
                boolean z11 = jyVar.v;
                jyVar.F(str, str2, true, z11, z11);
            }
        }
        fy fyVar = fzVar.p1;
        if (fyVar == null || !fyVar.z()) {
            if (iwVar == null || fwVar == null) {
                return;
            }
            iwVar.a.a(true, !z10);
            return;
        }
        f2.n1 K = fwVar.K(0);
        if (K == null) {
            ry.a(iwVar, true, !z10);
        } else {
            ry.a(iwVar, K.a.getTop() < fwVar.getPaddingTop(), !z10);
        }
    }

    public static String g(String str, String str2) {
        boolean z10;
        String str3;
        if (CompoundEmoji.isHandshake(str) != null) {
            return CompoundEmoji.applyColor(str, str2);
        }
        if (Emoji.endsWithRightArrow(str)) {
            str = com.google.android.recaptcha.internal.a.m(str, 2, 0);
            z10 = true;
        } else {
            z10 = false;
        }
        int length = str.length();
        if (length > 2 && str.charAt(str.length() - 2) == 8205) {
            str3 = str.substring(str.length() - 2);
            str = com.google.android.recaptcha.internal.a.m(str, 2, 0);
        } else if (length <= 3 || str.charAt(str.length() - 3) != 8205) {
            str3 = null;
        } else {
            str3 = str.substring(str.length() - 3);
            str = com.google.android.recaptcha.internal.a.m(str, 3, 0);
        }
        String k9 = u3.c.k(str, str2);
        if (str3 != null) {
            k9 = u3.c.k(k9, str3);
        }
        return z10 ? u3.c.k(k9, "\u200d➡") : k9;
    }

    public static void j(int i10, View view) {
        if (view == null) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i10);
    }

    public final int A(int i10) {
        org.telegram.ui.ActionBar.c6 c6Var = this.V1;
        return c6Var != null ? c6Var.C0(i10) : org.telegram.ui.ActionBar.g6.w0(null, i10, false);
    }

    public final void B() {
        ow owVar = this.C0;
        if (owVar != null) {
            owVar.b();
        }
        iw iwVar = this.k0;
        if (iwVar != null) {
            iwVar.b();
        }
        cw cwVar = this.R;
        if (cwVar != null) {
            cwVar.b();
        }
    }

    public final void C() {
        lg.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.f2) == null) {
            return;
        }
        zc0 zc0Var = this.w;
        RectF rectF = this.v2;
        sg.i.c(zc0Var, this, rectF);
        rectF.inset(LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f), LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        rectF.right = getMeasuredWidth();
        rectF.bottom = Math.min(rectF.bottom, getMeasuredHeight());
        eVar.g(1, this.w2);
        eVar.e(this.g2, getWidth(), getHeight());
    }

    public final void D() {
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

    public final void E(boolean z10, boolean z11) {
        qy qyVar;
        if (this.w1 != 0 && this.s1) {
            this.w1 = 0;
        }
        if (this.w1 == 0 && this.r1) {
            this.w1 = 1;
        }
        int i10 = this.w1;
        rw rwVar = this.h;
        if (i10 == 0 || z10 || this.e.size() == 1) {
            M(true, false);
            S(false, false);
            if (rwVar.getCurrentItem() != 0) {
                rwVar.x(0, !z10);
            }
            if (z11) {
                AndroidUtilities.runOnUIThread(new uv(this, 9), 350L);
            }
        } else {
            int i11 = this.w1;
            if (i11 == 1) {
                M(false, false);
                S(this.q0 || this.r0, false);
                if (rwVar.getCurrentItem() != 2) {
                    rwVar.x(2, false);
                }
                pw pwVar = this.x0;
                if (pwVar != null) {
                    this.O0 = true;
                    int i12 = this.C1;
                    if (i12 >= 0) {
                        pwVar.m(i12);
                    } else {
                        int i13 = this.B1;
                        if (i13 >= 0) {
                            pwVar.m(i13);
                        } else {
                            pwVar.m(this.A1);
                        }
                    }
                    this.O0 = false;
                    this.A0.h1(0, 0);
                }
            } else if (i11 == 2) {
                M(false, false);
                S(false, false);
                if (rwVar.getCurrentItem() != 1) {
                    rwVar.x(1, false);
                }
                kx kxVar = this.l0;
                if (kxVar != null) {
                    kxVar.m(0);
                }
                iw iwVar = this.k0;
                if (iwVar != null && (qyVar = iwVar.r) != null) {
                    qyVar.F1(null);
                }
            }
        }
        O(true);
    }

    public final void F() {
        wy wyVar = this.u0;
        if (wyVar != null) {
            wyVar.l();
        }
        az azVar = this.v0;
        if (azVar != null) {
            azVar.l();
        }
        if (org.telegram.ui.ht.q().E) {
            org.telegram.ui.ht.q().n();
        }
        org.telegram.ui.ht.q().u();
    }

    public final void G(int i10) {
        fy fyVar = this.p1;
        if ((fyVar == null || !fyVar.z()) && i10 != 0) {
            HorizontalScrollView y8 = y(i10);
            this.M0[i10] = 0;
            y8.setTranslationY(0);
        }
    }

    public final void H(int i10, int i11) {
        ex exVar = this.M;
        View m10 = exVar.m(i10);
        int L0 = exVar.L0();
        if ((m10 == null && Math.abs(i10 - L0) > exVar.J * 9.0f) || !SharedConfig.animationsEnabled()) {
            int i12 = exVar.L0() < i10 ? 0 : 1;
            c2.z zVar = this.U;
            zVar.b = i12;
            zVar.c(i10, i11, false, false);
            return;
        }
        this.F0 = true;
        nh.k1 k1Var = new nh.k1(this, this.L.getContext(), 1);
        k1Var.a = i10;
        k1Var.p = i11;
        exVar.w0(k1Var);
    }

    public final void I(int i10, int i11) {
        mw mwVar = this.A0;
        View m10 = mwVar.m(i10);
        int L0 = mwVar.L0();
        if (m10 != null || Math.abs(i10 - L0) <= 40) {
            this.F0 = true;
            this.z0.x0(i10);
        } else {
            int i12 = mwVar.L0() < i10 ? 0 : 1;
            c2.z zVar = this.T;
            zVar.b = i12;
            zVar.c(i10, i11, false, false);
        }
    }

    public final void J(boolean z10, boolean z11, boolean z12, boolean z13) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i10 >= arrayList2.size()) {
                break;
            }
            if (((bz) arrayList2.get(i10)).a == 0 && z10) {
                arrayList.add((bz) arrayList2.get(i10));
            }
            if (((bz) arrayList2.get(i10)).a == 1 && z12) {
                arrayList.add((bz) arrayList2.get(i10));
            }
            if (((bz) arrayList2.get(i10)).a == 2 && z11) {
                arrayList.add((bz) arrayList2.get(i10));
            }
            i10++;
        }
        zc0 zc0Var = this.w;
        if (zc0Var != null) {
            AndroidUtilities.updateViewVisibilityAnimated(zc0Var, arrayList.size() > 1, 1.0f, z13);
        }
        rw rwVar = this.h;
        if (rwVar != null) {
            rwVar.setAdapter(null);
            rwVar.setAdapter(this.H0);
            if (zc0Var != null) {
                zc0Var.setViewPager(rwVar);
            }
        }
    }

    public final void K(final yg.b bVar, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z10, boolean z11) {
        az azVar;
        ey eyVar;
        if (stickerSet == null) {
            return;
        }
        if (!z10 || (eyVar = this.O) == null || eyVar.d == stickerSet.id) {
            if (z10 || (azVar = this.v0) == null || azVar.d == stickerSet.id) {
                final boolean isStickerPackInstalled = MediaDataController.getInstance(this.Y0).isStickerPackInstalled(stickerSet.id);
                bVar.g(isStickerPackInstalled ? stickerSet.masks ? LocaleController.formatPluralString("RemoveManyMasksCount", stickerSet.count, new Object[0]) : stickerSet.emojis ? LocaleController.formatPluralString("RemoveManyEmojiCount", stickerSet.count, new Object[0]) : LocaleController.formatPluralString("RemoveManyStickersCount", stickerSet.count, new Object[0]) : stickerSet.masks ? LocaleController.formatPluralString("AddManyMasksCount", stickerSet.count, new Object[0]) : stickerSet.emojis ? LocaleController.formatPluralString("AddManyEmojiCount", stickerSet.count, new Object[0]) : LocaleController.formatPluralString("AddManyStickersCount", stickerSet.count, new Object[0]), z11, true);
                bVar.d0.a(!isStickerPackInstalled, z11);
                bVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.aw
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        fz fzVar = fz.this;
                        MediaDataController mediaDataController = MediaDataController.getInstance(fzVar.Y0);
                        Context context = fzVar.getContext();
                        int i10 = isStickerPackInstalled ? 0 : 2;
                        org.telegram.ui.ActionBar.o2 o2Var = fzVar.U1;
                        FrameLayout frameLayout = fzVar.s;
                        yg.b bVar2 = bVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z12 = z10;
                        mediaDataController.toggleStickerSet(context, tLObject2, document2, i10, o2Var, frameLayout, false, true, new j3.p1(fzVar, bVar2, tLObject2, stickerSet2, document2, z12, 10), false);
                        fzVar.K(bVar2, tLObject2, stickerSet2, document2, z12, true);
                    }
                });
            }
        }
    }

    public final void L(long j10, boolean z10, boolean z11) {
        zc0 zc0Var = this.w;
        if (zc0Var == null) {
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
        LinearLayout linearLayout = zc0Var.d;
        View childAt = i10 >= linearLayout.getChildCount() ? null : linearLayout.getChildAt(i10);
        if (childAt != null) {
            childAt.setAlpha(this.q1 != 0 ? 0.15f : 1.0f);
            rw rwVar = this.h;
            if (z11) {
                if (this.q1 == 0 || rwVar.getCurrentItem() == 0) {
                    return;
                }
                M(true, true);
                S(false, true);
                rwVar.x(0, false);
                return;
            }
            if (this.q1 == 0 || rwVar.getCurrentItem() == 1) {
                return;
            }
            M(false, true);
            S(false, true);
            rwVar.x(1, false);
        }
    }

    public final void M(boolean z10, boolean z11) {
        sw swVar = this.x;
        if (z10 && swVar.getTag() == null) {
            return;
        }
        if ((z10 || swVar.getTag() == null) && !this.k2) {
            AnimatorSet animatorSet = this.B;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.B = null;
            }
            swVar.setTag(z10 ? null : 1);
            if (!z11) {
                swVar.setAlpha(z10 ? 1.0f : 0.0f);
                swVar.setScaleX(z10 ? 1.0f : 0.0f);
                swVar.setScaleY(z10 ? 1.0f : 0.0f);
                swVar.setVisibility(z10 ? 0 : 4);
                return;
            }
            if (z10) {
                swVar.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.B = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(swVar, (Property<sw, Float>) View.ALPHA, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(swVar, (Property<sw, Float>) View.SCALE_X, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(swVar, (Property<sw, Float>) View.SCALE_Y, z10 ? 1.0f : 0.0f));
            this.B.setDuration(200L);
            this.B.setInterpolator(jr.g);
            this.B.addListener(new zw(this, z10, r2));
            this.B.start();
        }
    }

    @Override // vd.b
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        if (i10 == 0) {
            q(false);
            float f11 = 1.0f - this.a.e;
            ow owVar = this.C0;
            owVar.setAlpha(f11);
            owVar.setVisibility(f11 > 0.0f ? 0 : 4);
            float f12 = 1.0f - f11;
            yg.d dVar = this.D0;
            dVar.setAlpha(f12);
            dVar.setTranslationY((-AndroidUtilities.dp(15.0f)) * f11);
            dVar.setVisibility(f12 > 0.0f ? 0 : 4);
            rf.d dVar2 = this.I;
            dVar2.setAlpha(f12);
            dVar2.setTranslationY(AndroidUtilities.dp(30.0f) * f11);
            dVar2.setVisibility(f12 > 0.0f ? 0 : 4);
            T();
            this.t0.invalidate();
            return;
        }
        if (i10 == 1) {
            l(false);
            float f13 = 1.0f - this.b.e;
            cw cwVar = this.R;
            cwVar.setAlpha(f13);
            cwVar.setVisibility(f13 > 0.0f ? 0 : 4);
            float f14 = 1.0f - f13;
            yg.d dVar3 = this.Q;
            dVar3.setAlpha(f14);
            dVar3.setTranslationY((-AndroidUtilities.dp(15.0f)) * f13);
            dVar3.setVisibility(f14 > 0.0f ? 0 : 4);
            rf.d dVar4 = this.G;
            dVar4.setAlpha(f14);
            dVar4.setTranslationY(AndroidUtilities.dp(30.0f) * f13);
            dVar4.setVisibility(f14 > 0.0f ? 0 : 4);
            T();
            this.F.invalidate();
        }
    }

    public final void O(boolean z10) {
        this.D = 0.0f;
        fy fyVar = this.p1;
        if (fyVar != null && fyVar.z()) {
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
            this.S.setInterpolator(jr.g);
            this.S.addListener(new org.telegram.ui.bm(this, 27));
            this.S.start();
        }
    }

    public final void Q(boolean z10) {
        for (int i10 = 0; i10 < 3; i10++) {
            f2.w w10 = w(i10);
            int L0 = w10.L0();
            if (z10) {
                if (L0 == 1 || L0 == 2) {
                    w10.n0(0);
                    G(i10);
                }
            } else if (L0 == 0) {
                w10.h1(0, 0);
            }
        }
    }

    public final void R(boolean z10, boolean z11, boolean z12) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.Chat chat = MessagesController.getInstance(this.Y0).getChat(Long.valueOf(this.q1));
        if (chat == null) {
            return;
        }
        eg.r rVar = this.J0;
        if (z10) {
            if (ChatObject.hasAdminRights(chat) || (tL_chatBannedRights = chat.default_banned_rights) == null || !(tL_chatBannedRights.send_stickers || (z11 && tL_chatBannedRights.send_plain))) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.banned_rights;
                if (tL_chatBannedRights2 == null) {
                    return;
                }
                if (!AndroidUtilities.isBannedForever(tL_chatBannedRights2)) {
                    if (z11) {
                        rVar.setText(LocaleController.formatString("AttachPlainRestricted", R.string.AttachPlainRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    }
                    if (z12) {
                        rVar.setText(LocaleController.formatString("AttachGifRestricted", R.string.AttachGifRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    } else {
                        rVar.setText(LocaleController.formatString("AttachStickersRestricted", R.string.AttachStickersRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    }
                } else if (z11) {
                    rVar.setText(LocaleController.getString(R.string.AttachPlainRestrictedForever));
                } else if (z12) {
                    rVar.setText(LocaleController.getString(R.string.AttachGifRestrictedForever));
                } else {
                    rVar.setText(LocaleController.getString(R.string.AttachStickersRestrictedForever));
                }
            } else {
                org.telegram.ui.ActionBar.o2 o2Var = this.U1;
                if ((o2Var instanceof org.telegram.ui.tn) && ((org.telegram.ui.tn) o2Var).K6()) {
                    return;
                }
                if (z11) {
                    rVar.setText(LocaleController.getString(R.string.GlobalAttachEmojiRestricted));
                } else if (z12) {
                    rVar.setText(LocaleController.getString(R.string.GlobalAttachGifRestricted));
                } else {
                    rVar.setText(LocaleController.getString(R.string.GlobalAttachStickersRestricted));
                }
            }
            rVar.setVisibility(0);
        }
        AnimatorSet animatorSet = this.F2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.F2 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.F2 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(rVar, (Property<eg.r, Float>) View.ALPHA, z10 ? rVar.getAlpha() : 1.0f, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(rVar, (Property<eg.r, Float>) View.TRANSLATION_Y, z10 ? AndroidUtilities.dp(12.0f) : rVar.getTranslationY(), z10 ? 0.0f : AndroidUtilities.dp(12.0f)));
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
        this.F2.setInterpolator(jr.h);
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
            this.C.setInterpolator(jr.g);
            this.C.addListener(new zw(this, z10, i10));
            this.C.start();
        }
    }

    public final void T() {
        org.telegram.ui.ActionBar.o2 o2Var;
        if (((View) getParent()) != null) {
            float y8 = (getY() + (getLayoutParams().height > 0 ? getLayoutParams().height : getMeasuredHeight())) - (((AndroidUtilities.isInMultiwindow || ((o2Var = this.U1) != null && o2Var.isInBubbleMode())) && !this.R0) ? AndroidUtilities.dp(1.0f) : r0.getHeight());
            float f9 = this.n2;
            FrameLayout frameLayout = this.n;
            if (f9 >= 0.0f) {
                y8 += getMeasuredHeight() - this.n2;
            } else if (frameLayout.getTop() - y8 < 0.0f || !this.t2) {
                y8 = 0.0f;
            }
            float f10 = -y8;
            boolean z10 = this.W;
            float lerp = f10 + AndroidUtilities.lerp(AndroidUtilities.dp(z10 ? 45.0f : 50.0f), -this.m2, this.C2.e);
            frameLayout.setTranslationY(lerp);
            if (z10) {
                this.r.setTranslationY(lerp);
            }
        }
    }

    public final void U() {
        ry ryVar;
        boolean z10;
        pv pvVar;
        boolean z11 = this.q0;
        View view = this.v;
        if (!z11) {
            setBackground(null);
            view.setBackground(null);
        } else if (AndroidUtilities.isInMultiwindow || this.J1) {
            Drawable background = getBackground();
            if (background != null) {
                background.setColorFilter(new PorterDuffColorFilter(A(org.telegram.ui.ActionBar.g6.He), PorterDuff.Mode.MULTIPLY));
            }
        } else {
            int i10 = org.telegram.ui.ActionBar.g6.He;
            setBackgroundColor(A(i10));
            if (this.W) {
                view.setBackgroundColor(A(i10));
            }
        }
        bw bwVar = this.E;
        if (bwVar != null) {
            if (this.q0) {
                bwVar.setBackgroundColor(A(org.telegram.ui.ActionBar.g6.He));
                this.K.setBackgroundColor(A(org.telegram.ui.ActionBar.g6.Ke));
            } else {
                bwVar.setBackground(null);
            }
        }
        ou ouVar = this.x1;
        if (ouVar != null) {
            ouVar.c.a();
        }
        int i11 = 0;
        while (true) {
            ryVar = this.R;
            z10 = this.e2;
            if (i11 >= 3) {
                break;
            }
            if (i11 == 0) {
                ryVar = this.C0;
            } else if (i11 != 1) {
                ryVar = this.k0;
            }
            if (ryVar != null) {
                cq cqVar = ryVar.d;
                FrameLayout frameLayout = ryVar.n;
                View view2 = ryVar.f;
                if (this.q0) {
                    view2.setBackgroundColor(A(org.telegram.ui.ActionBar.g6.He));
                } else {
                    view2.setBackground(null);
                }
                ryVar.e.setBackgroundColor(A(org.telegram.ui.ActionBar.g6.Ke));
                ryVar.c.a(z10 ? v(0.4f) : A(org.telegram.ui.ActionBar.g6.Je));
                org.telegram.ui.ActionBar.g6.w1(z10 ? v(0.06f) : A(org.telegram.ui.ActionBar.g6.Ie), frameLayout.getBackground());
                frameLayout.invalidate();
                cqVar.setHintTextColor(z10 ? v(0.45f) : A(org.telegram.ui.ActionBar.g6.Je));
                cqVar.setTextColor(z10 ? v(0.8f) : A(org.telegram.ui.ActionBar.g6.G6));
            }
            i11++;
        }
        Paint paint = this.o1;
        if (paint != null) {
            paint.setColor(A(org.telegram.ui.ActionBar.g6.af));
        }
        dx dxVar = this.L;
        if (dxVar != null) {
            dxVar.setGlowColor(A(org.telegram.ui.ActionBar.g6.He));
        }
        lw lwVar = this.z0;
        if (lwVar != null) {
            lwVar.setGlowColor(A(org.telegram.ui.ActionBar.g6.He));
        }
        pw pwVar = this.x0;
        if (pwVar != null) {
            pwVar.setIndicatorColor(A(org.telegram.ui.ActionBar.g6.Qe));
            pwVar.setUnderlineColor(A(org.telegram.ui.ActionBar.g6.Ke));
            if (this.q0) {
                pwVar.setBackgroundColor(A(org.telegram.ui.ActionBar.g6.He));
            } else {
                pwVar.setBackground(null);
            }
        }
        kx kxVar = this.l0;
        if (kxVar != null) {
            kxVar.setIndicatorColor(A(org.telegram.ui.ActionBar.g6.Qe));
            kxVar.setUnderlineColor(A(org.telegram.ui.ActionBar.g6.Ke));
            if (this.q0) {
                kxVar.setBackgroundColor(A(org.telegram.ui.ActionBar.g6.He));
            } else {
                kxVar.setBackground(null);
            }
        }
        sw swVar = this.x;
        if (swVar != null) {
            swVar.setColorFilter(new PorterDuffColorFilter(z10 ? v(0.6f) : A(org.telegram.ui.ActionBar.g6.Re), PorterDuff.Mode.MULTIPLY));
            if (ryVar == null) {
                Drawable background2 = swVar.getBackground();
                int i12 = org.telegram.ui.ActionBar.g6.He;
                org.telegram.ui.ActionBar.g6.B1(background2, A(i12), false);
                org.telegram.ui.ActionBar.g6.B1(swVar.getBackground(), A(i12), true);
            }
        }
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(z10 ? v(0.6f) : A(org.telegram.ui.ActionBar.g6.Re), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.A;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(z10 ? v(0.6f) : A(org.telegram.ui.ActionBar.g6.Re), PorterDuff.Mode.MULTIPLY));
        }
        eg.r rVar = this.J0;
        if (rVar != null) {
            ((ShapeDrawable) rVar.getBackground()).getPaint().setColor(A(org.telegram.ui.ActionBar.g6.qf));
            rVar.setTextColor(A(org.telegram.ui.ActionBar.g6.pf));
        }
        jy jyVar = this.f0;
        if (jyVar != null) {
            ly lyVar = jyVar.e;
            ImageView imageView3 = lyVar.a;
            int i13 = org.telegram.ui.ActionBar.g6.Le;
            imageView3.setColorFilter(new PorterDuffColorFilter(A(i13), PorterDuff.Mode.MULTIPLY));
            lyVar.b.setTextColor(A(i13));
            lyVar.c.setProgressColor(A(org.telegram.ui.ActionBar.g6.h6));
        }
        this.a2 = new PorterDuffColorFilter(A(org.telegram.ui.ActionBar.g6.Oh), PorterDuff.Mode.SRC_IN);
        int i14 = 0;
        while (true) {
            Drawable[] drawableArr = this.T0;
            if (i14 >= drawableArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.g6.y1(drawableArr[i14], z10 ? v(0.4f) : A(org.telegram.ui.ActionBar.g6.Ne), false);
            org.telegram.ui.ActionBar.g6.y1(drawableArr[i14], z10 ? v(0.8f) : A(org.telegram.ui.ActionBar.g6.Oe), true);
            i14++;
        }
        if (bwVar != null && (pvVar = bwVar.y) != null) {
            pvVar.d();
        }
        int i15 = 0;
        while (true) {
            Drawable[] drawableArr2 = this.U0;
            if (i15 >= drawableArr2.length) {
                break;
            }
            org.telegram.ui.ActionBar.g6.y1(drawableArr2[i15], z10 ? v(0.4f) : A(org.telegram.ui.ActionBar.g6.Me), false);
            org.telegram.ui.ActionBar.g6.y1(drawableArr2[i15], z10 ? v(0.8f) : A(org.telegram.ui.ActionBar.g6.Oe), true);
            i15++;
        }
        int i16 = 0;
        while (true) {
            Drawable[] drawableArr3 = this.V0;
            if (i16 >= drawableArr3.length) {
                break;
            }
            org.telegram.ui.ActionBar.g6.y1(drawableArr3[i16], z10 ? v(0.4f) : A(org.telegram.ui.ActionBar.g6.Me), false);
            org.telegram.ui.ActionBar.g6.y1(drawableArr3[i16], z10 ? v(0.8f) : A(org.telegram.ui.ActionBar.g6.Oe), true);
            i16++;
        }
        org.telegram.ui.ActionBar.r5 r5Var = this.W1;
        if (r5Var != null) {
            org.telegram.ui.ActionBar.g6.y1(r5Var, z10 ? v(0.4f) : A(org.telegram.ui.ActionBar.g6.Ne), false);
            org.telegram.ui.ActionBar.g6.y1(r5Var, z10 ? v(0.8f) : A(org.telegram.ui.ActionBar.g6.Oe), true);
        }
        org.telegram.ui.ActionBar.r5 r5Var2 = this.X1;
        if (r5Var2 != null) {
            org.telegram.ui.ActionBar.g6.y1(r5Var2, z10 ? v(0.4f) : A(org.telegram.ui.ActionBar.g6.Qe), false);
            org.telegram.ui.ActionBar.g6.y1(r5Var2, z10 ? v(0.8f) : A(org.telegram.ui.ActionBar.g6.Qe), true);
        }
    }

    public final void V() {
        dx dxVar = this.L;
        if (dxVar == null) {
            return;
        }
        for (int i10 = 0; i10 < dxVar.getChildCount(); i10++) {
            View childAt = dxVar.getChildAt(i10);
            if (childAt instanceof vx) {
                ((vx) childAt).a(true);
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
            nx nxVar = this.N;
            int i12 = nxVar.c;
            ArrayList arrayList = nxVar.x;
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
                    ArrayList<rx> emojipacks = getEmojipacks();
                    int size2 = arrayList.size() - 1;
                    while (true) {
                        if (size2 < 0) {
                            break;
                        }
                        if (((Integer) arrayList.get(size2)).intValue() <= i10) {
                            rx rxVar = (rx) this.m1.get(size2);
                            while (i13 < emojipacks.size()) {
                                long j10 = emojipacks.get(i13).b.id;
                                long j11 = rxVar.b.id;
                                if (j10 == j11 && (!rxVar.g || (!rxVar.f && !this.l1.contains(Long.valueOf(j11))))) {
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
        qy qyVar;
        int i11;
        boolean z10;
        kx kxVar = this.l0;
        int currentPosition = kxVar.getCurrentPosition();
        int i12 = this.n0;
        boolean z11 = currentPosition == i12;
        boolean z12 = i12 >= 0;
        boolean isEmpty = this.e1.isEmpty();
        kxVar.d(false);
        this.n0 = -2;
        this.o0 = -2;
        this.p0 = -2;
        Drawable[] drawableArr = this.V0;
        if (isEmpty) {
            i10 = 0;
        } else {
            this.n0 = 0;
            kxVar.b(0, drawableArr[0]).setContentDescription(LocaleController.getString(R.string.RecentStickers));
            i10 = 1;
        }
        this.o0 = i10;
        kxVar.b(1, drawableArr[1]).setContentDescription(LocaleController.getString(R.string.FeaturedGifs));
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
                String k9 = j7.l1.k(i14 + 3, "tab");
                int i15 = kxVar.x;
                kxVar.x = i15 + 1;
                vw0 vw0Var = (vw0) kxVar.n.get(k9);
                if (vw0Var != null) {
                    kxVar.g(k9, vw0Var, i15);
                    i11 = currentPosition;
                    z10 = z12;
                } else {
                    i11 = currentPosition;
                    z10 = z12;
                    vw0Var = new vw0(kxVar.getContext(), 2);
                    vw0Var.setFocusable(true);
                    vw0Var.setOnClickListener(new zl0(kxVar, 2));
                    vw0Var.setExpanded(kxVar.b0);
                    vw0Var.a(kxVar.e0);
                    kxVar.e.addView(vw0Var, i15);
                }
                vw0Var.d = false;
                vw0Var.setTag(R.id.index_tag, Integer.valueOf(i15));
                vw0Var.setTag(R.id.parent_tag, emojiDrawable);
                vw0Var.setTag(R.id.object_tag, emojiAnimatedSticker);
                vw0Var.setSelected(i15 == kxVar.y);
                kxVar.h.put(k9, vw0Var);
                vw0Var.setContentDescription(str);
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
        kxVar.h();
        kxVar.q();
        if (z11 && isEmpty) {
            kxVar.m(this.o0);
            iw iwVar = this.k0;
            if (iwVar == null || (qyVar = iwVar.r) == null) {
                return;
            }
            qyVar.F1(null);
            return;
        }
        WeakHashMap weakHashMap = r0.j0.a;
        if (kxVar.isLaidOut()) {
            if (!isEmpty && !z13) {
                kxVar.k(i16 + 1, 0);
            } else if (isEmpty && z13) {
                kxVar.k(i16 - 1, 0);
            }
        }
    }

    public final void Y() {
        jy jyVar;
        int size = this.e1.size();
        long calcDocumentsHash = MediaDataController.calcDocumentsHash(this.e1, ConnectionsManager.DEFAULT_DATACENTER_ID);
        ArrayList<TLRPC.Document> recentGifs = MediaDataController.getInstance(this.Y0).getRecentGifs();
        this.e1 = recentGifs;
        long calcDocumentsHash2 = MediaDataController.calcDocumentsHash(recentGifs, ConnectionsManager.DEFAULT_DATACENTER_ID);
        if ((this.l0 != null && size == 0 && !this.e1.isEmpty()) || (size != 0 && this.e1.isEmpty())) {
            X();
        }
        if ((size == this.e1.size() && calcDocumentsHash == calcDocumentsHash2) || (jyVar = this.j0) == null) {
            return;
        }
        jyVar.l();
    }

    public final void Z(boolean z10) {
        TLRPC.Document document;
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet;
        pw pwVar = this.x0;
        if (pwVar != null) {
            ua1 ua1Var = pwVar.e;
            if (pwVar.s != null) {
                return;
            }
            this.B1 = -2;
            this.C1 = -2;
            this.D1 = -2;
            this.E1 = -2;
            this.a0 = false;
            this.A1 = 0;
            int currentPosition = pwVar.getCurrentPosition();
            boolean z11 = true;
            pwVar.d((getParent() == null || getVisibility() != 0 || (this.u1.size() == 0 && this.v1.size() == 0)) ? false : true);
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
            dz dzVar = this.B0;
            if (dzVar != null) {
                dzVar.l();
            }
            boolean isEmpty = featuredStickerSets.isEmpty();
            long j10 = 0;
            Drawable[] drawableArr = this.U0;
            if (!isEmpty && (arrayList3.isEmpty() || emojiSettings.getLong("featured_hidden", 0L) == featuredStickerSets.get(0).set.id)) {
                int i12 = mediaDataController.getUnreadStickerSets().isEmpty() ? 2 : 3;
                vw0 c3 = pwVar.c(i12, drawableArr[i12]);
                c3.h.setText(LocaleController.getString(R.string.FeaturedStickersShort));
                c3.setContentDescription(LocaleController.getString(R.string.FeaturedStickers));
                int i13 = this.A1;
                this.D1 = i13;
                this.A1 = i13 + 1;
            }
            if (!this.g1.isEmpty()) {
                int i14 = this.A1;
                this.C1 = i14;
                this.A1 = i14 + 1;
                vw0 c6 = pwVar.c(1, drawableArr[1]);
                c6.h.setText(LocaleController.getString(R.string.FavoriteStickersShort));
                c6.setContentDescription(LocaleController.getString(R.string.FavoriteStickers));
            }
            if (!this.f1.isEmpty()) {
                int i15 = this.A1;
                this.B1 = i15;
                this.A1 = i15 + 1;
                vw0 c10 = pwVar.c(0, drawableArr[0]);
                c10.h.setText(LocaleController.getString(R.string.RecentStickersShort));
                c10.setContentDescription(LocaleController.getString(R.string.RecentStickers));
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
                        int i19 = pwVar.x;
                        pwVar.x = i19 + 1;
                        vw0 vw0Var = (vw0) pwVar.n.get(str);
                        if (vw0Var != null) {
                            pwVar.g(str, vw0Var, i19);
                        } else {
                            vw0Var = new vw0(pwVar.getContext(), 0);
                            vw0Var.setFocusable(z11);
                            vw0Var.setOnClickListener(new zl0(pwVar, 0));
                            ua1Var.addView(vw0Var, i19);
                            vw0Var.w = z11;
                            e9 e9Var = new e9(c6Var);
                            e9Var.u(AndroidUtilities.dp(14.0f));
                            e9Var.k(UserConfig.selectedAccount, chat2);
                            int i20 = pwVar.a;
                            t9 t9Var = vw0Var.e;
                            t9Var.setLayerNum(i20);
                            t9Var.e(chat2, e9Var);
                            t9Var.setAspectFit(z11);
                            vw0Var.setExpanded(pwVar.b0);
                            vw0Var.a(pwVar.e0);
                            vw0Var.h.setText(chat2.title);
                        }
                        vw0Var.d = z11;
                        vw0Var.setTag(R.id.index_tag, Integer.valueOf(i19));
                        vw0Var.setSelected(i19 == pwVar.y);
                        pwVar.h.put(str, vw0Var);
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
                    int i22 = pwVar.x;
                    pwVar.x = i22 + 1;
                    vw0 vw0Var2 = (vw0) pwVar.n.get(str2);
                    if (vw0Var2 != null) {
                        pwVar.g(str2, vw0Var2, i22);
                    } else {
                        vw0Var2 = new vw0(pwVar.getContext(), 0);
                        vw0Var2.setFocusable(z11);
                        vw0Var2.setOnClickListener(new zl0(pwVar, 1));
                        vw0Var2.setExpanded(pwVar.b0);
                        vw0Var2.a(pwVar.e0);
                        ua1Var.addView(vw0Var2, i22);
                    }
                    vw0Var2.e.setLayerNum(pwVar.a);
                    vw0Var2.d = false;
                    vw0Var2.setTag(closestPhotoSizeWithSize);
                    vw0Var2.setTag(R.id.index_tag, Integer.valueOf(i22));
                    vw0Var2.setTag(R.id.parent_tag, tL_messages_stickerSet5);
                    vw0Var2.setTag(R.id.object_tag, document);
                    vw0Var2.setSelected(i22 == pwVar.y);
                    pwVar.h.put(str2, vw0Var2);
                    vw0Var2.setContentDescription(tL_messages_stickerSet5.set.title + ", " + LocaleController.getString(R.string.AccDescrStickerSet));
                }
                i18++;
                z11 = true;
                c6Var = null;
            }
            pwVar.h();
            pwVar.q();
            if (currentPosition != 0) {
                pwVar.k(currentPosition, currentPosition);
            }
            o();
        }
    }

    public final void a0() {
        qw qwVar = this.y0;
        pw pwVar = this.x0;
        if (pwVar != null && qwVar == null && this.p1 != null) {
            pwVar.setTranslationY(this.p1.p() * (-AndroidUtilities.dp(50.0f)));
        }
        if (qwVar == null) {
            return;
        }
        boolean z10 = getVisibility() == 0 && this.G0 && this.p1.p() != 1.0f;
        qwVar.setVisibility(z10 ? 0 : 8);
        if (z10) {
            Rect rect = this.u2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.t0, rect, null);
            float p10 = this.p1.p() * AndroidUtilities.dp(50.0f);
            int i10 = rect.left;
            if (i10 != 0 || p10 != 0.0f) {
                this.T1 = false;
            }
            qwVar.setTranslationX(i10);
            float translationY = (((getTranslationY() + getTop()) - qwVar.getTop()) - pwVar.getExpandedOffset()) - p10;
            if (qwVar.getTranslationY() != translationY) {
                qwVar.setTranslationY(translationY);
                qwVar.invalidate();
            }
        }
        if (this.T1 && z10 && this.L0) {
            pwVar.i(this.S1, true);
        } else {
            this.T1 = false;
            pwVar.i(this.S1, false);
        }
    }

    public final void b0() {
        boolean z10;
        org.telegram.ui.Cells.p3 p3Var;
        LongSparseArray longSparseArray = this.v1;
        LongSparseArray longSparseArray2 = this.u1;
        int i10 = this.Y0;
        lw lwVar = this.z0;
        if (lwVar == null) {
            return;
        }
        try {
            int childCount = lwVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = lwVar.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.p3) && ((vk0) lwVar.T(childAt)) != null) {
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
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // ah.a
    public final void c(int i10) {
        setBottomInset(i10);
    }

    @Override // ah.a
    public final void d(float f9) {
        this.n2 = f9;
        T();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Utilities.Callback callback;
        TLRPC.StickerSet stickerSet;
        int i12 = NotificationCenter.stickersDidLoad;
        nx nxVar = this.N;
        uv uvVar = this.H2;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.u0 != null) {
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
                    nxVar.F(false);
                    return;
                } else {
                    AndroidUtilities.cancelRunOnUIThread(uvVar);
                    AndroidUtilities.runOnUIThread(uvVar, 100L);
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
                nxVar.F(true);
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
            zc0 zc0Var = this.w;
            if (zc0Var != null) {
                int childCount = zc0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    zc0Var.getChildAt(i13).invalidate();
                }
            }
            Z(false);
            return;
        }
        if (i10 == NotificationCenter.featuredEmojiDidLoad) {
            if (nxVar != null) {
                nxVar.F(false);
                return;
            }
            return;
        }
        int i14 = NotificationCenter.groupStickersDidLoad;
        ey eyVar = this.O;
        if (i10 == i14) {
            Long l10 = (Long) objArr[0];
            long longValue2 = l10.longValue();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = objArr.length > 1 ? (TLRPC.TL_messages_stickerSet) objArr[1] : null;
            if (tL_messages_stickerSet != null) {
                az azVar = this.v0;
                if (azVar != null && azVar.d == longValue2 && azVar.f.size() < tL_messages_stickerSet.documents.size()) {
                    azVar.f = tL_messages_stickerSet.documents;
                    azVar.l();
                }
                if (eyVar != null && eyVar.d == longValue2 && eyVar.f.size() < tL_messages_stickerSet.documents.size()) {
                    eyVar.f = tL_messages_stickerSet.documents;
                    eyVar.l();
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
            AndroidUtilities.cancelRunOnUIThread(uvVar);
            AndroidUtilities.runOnUIThread(uvVar, 100L);
            return;
        }
        int i15 = NotificationCenter.emojiLoaded;
        dx dxVar = this.L;
        if (i10 != i15) {
            if (i10 != NotificationCenter.newEmojiSuggestionsAvailable) {
                if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                    if (nxVar != null) {
                        nxVar.F(false);
                    }
                    V();
                    Z(false);
                    return;
                }
                return;
            }
            if (dxVar == null || !this.W) {
                return;
            }
            if ((this.R.c.k == 2 || dxVar.getAdapter() == eyVar) && !TextUtils.isEmpty(eyVar.v)) {
                eyVar.F(eyVar.v, true);
                return;
            }
            return;
        }
        lw lwVar = this.z0;
        if (lwVar != null) {
            int childCount2 = lwVar.getChildCount();
            for (int i16 = 0; i16 < childCount2; i16++) {
                View childAt = lwVar.getChildAt(i16);
                if ((childAt instanceof org.telegram.ui.Cells.k8) || (childAt instanceof org.telegram.ui.Cells.b8)) {
                    childAt.invalidate();
                }
            }
        }
        if (dxVar != null) {
            dxVar.invalidate();
            int childCount3 = dxVar.getChildCount();
            for (int i17 = 0; i17 < childCount3; i17++) {
                View childAt2 = dxVar.getChildAt(i17);
                if (childAt2 instanceof ny) {
                    childAt2.invalidate();
                }
            }
        }
        ou ouVar = this.x1;
        if (ouVar != null) {
            ouVar.c.invalidate();
        }
        kx kxVar = this.l0;
        if (kxVar != null) {
            ua1 ua1Var = kxVar.e;
            int childCount4 = ua1Var.getChildCount();
            for (int i18 = 0; i18 < childCount4; i18++) {
                ua1Var.getChildAt(i18).invalidate();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        qg.d dVar;
        lg.e eVar;
        if (Build.VERSION.SDK_INT >= 31 && (dVar = this.h2) != null && (eVar = this.f2) != null) {
            C();
            RecordingCanvas a2 = dVar.a(getMeasuredWidth(), getMeasuredHeight());
            a2.drawColor(A(org.telegram.ui.ActionBar.g6.d6));
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
            canvas.drawColor(i0.a.k(-1, 25));
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.m2);
        if (navigationBarThirdButtonsFactor > 0.0f) {
            int l1 = org.telegram.ui.ActionBar.g6.l1(navigationBarThirdButtonsFactor, A(org.telegram.ui.ActionBar.g6.He));
            int i10 = this.y2;
            GradientDrawable gradientDrawable = this.x2;
            if (i10 != l1) {
                gradientDrawable.setColors(new int[]{l1, org.telegram.ui.ActionBar.g6.l1(0.66f, l1), i0.a.k(l1, 0)});
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

    public ArrayList<rx> getEmojipacks() {
        ArrayList<rx> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.m1;
            if (i10 >= arrayList2.size()) {
                return arrayList;
            }
            rx rxVar = (rx) arrayList2.get(i10);
            boolean z10 = rxVar.g;
            ArrayList arrayList3 = this.l1;
            if ((!z10 && (rxVar.f || arrayList3.contains(Long.valueOf(rxVar.b.id)))) || (rxVar.g && !rxVar.f && !arrayList3.contains(Long.valueOf(rxVar.b.id)))) {
                arrayList.add(rxVar);
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
        pw pwVar = this.x0;
        if (pwVar == null) {
            return 0.0f;
        }
        return pwVar.getExpandedOffset();
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
        if (i10 == 2 || x(i10).K(0) == null) {
            return;
        }
        ax axVar = new ax(getContext(), i11);
        axVar.a = !z10 ? 1 : 0;
        w(i10).w0(axVar);
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
        wy wyVar = this.u0;
        if (wyVar != null) {
            wyVar.l();
        }
        o();
    }

    public final void l(boolean z10) {
        fy fyVar = this.p1;
        vd.a aVar = this.b;
        dx dxVar = this.L;
        cw cwVar = this.R;
        if (fyVar != null && fyVar.z()) {
            f2.n1 K = dxVar.K(0);
            if (K == null) {
                ry.a(cwVar, true, !z10);
            } else {
                ry.a(cwVar, K.a.getTop() < dxVar.getPaddingTop(), !z10);
            }
            P(false, !z10);
            cwVar.setTranslationY(aVar.e * AndroidUtilities.dp(15.0f));
            return;
        }
        if (cwVar == null || dxVar == null) {
            return;
        }
        cwVar.setTranslationY((aVar.e * AndroidUtilities.dp(15.0f)) + (dxVar.K(0) != null ? r0.a.getTop() : -this.X0));
        cwVar.a.a(false, !z10);
        m(Math.round(this.E.getTranslationY()));
    }

    public final void m(int i10) {
        ObjectAnimator objectAnimator = this.N0[1];
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            boolean z10 = false;
            f2.n1 K = this.L.K(0);
            int dp = AndroidUtilities.dp(38.0f) + i10;
            if (dp > 0 && (K == null || K.a.getBottom() < dp)) {
                z10 = true;
            }
            P(z10, !this.G1);
        }
    }

    public final void n(dx dxVar, int i10) {
        dx dxVar2;
        f2.n1 K;
        bw bwVar = this.E;
        int[] iArr = this.M0;
        if (dxVar == null) {
            iArr[1] = 0;
            bwVar.setTranslationY(0);
            return;
        }
        if (dxVar.getVisibility() != 0 || this.b0) {
            return;
        }
        fy fyVar = this.p1;
        if (fyVar == null || !fyVar.z()) {
            if (i10 > 0 && (dxVar2 = this.L) != null && dxVar2.getVisibility() == 0 && (K = dxVar2.K(0)) != null) {
                if (K.a.getTop() + (this.W ? this.X0 : 0) >= dxVar2.getPaddingTop()) {
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
            bwVar.setTranslationY(Math.max(-AndroidUtilities.dp(36.0f), iArr[1]));
        }
    }

    public final void o() {
        int L0;
        pw pwVar = this.x0;
        if (pwVar == null || (L0 = this.A0.L0()) == -1) {
            return;
        }
        int i10 = this.C1;
        if (i10 <= 0 && (i10 = this.B1) <= 0) {
            i10 = this.A1;
        }
        pwVar.k(this.u0.F(L0), i10);
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
            AndroidUtilities.runOnUIThread(new uv(this, 0));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ou ouVar = this.x1;
        if (ouVar != null && ouVar.isShowing()) {
            ouVar.dismiss();
        }
        org.telegram.ui.ht q6 = org.telegram.ui.ht.q();
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
            F();
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
                background.setColorFilter(new PorterDuffColorFilter(A(i12), PorterDuff.Mode.MULTIPLY));
                if (z11 && this.q0) {
                    view.setBackgroundColor(A(i12));
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
                setBackgroundColor(A(i13));
                if (z11) {
                    view.setBackgroundColor(A(i13));
                }
            }
            this.H1 = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
        this.G1 = false;
        setTranslationY(getTranslationY());
    }

    public final void p(int i10) {
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
            f2.p0 adapter = this.d0.getAdapter();
            jy jyVar = this.j0;
            if (adapter != jyVar || jyVar.E < 0 || this.o0 < 0 || this.n0 < 0 || (L0 = this.e0.L0()) == -1) {
                return;
            }
            this.l0.k(L0 >= jyVar.E ? this.o0 : this.n0, 0);
        }
    }

    public final void q(boolean z10) {
        fy fyVar = this.p1;
        vd.a aVar = this.a;
        lw lwVar = this.z0;
        ow owVar = this.C0;
        if (fyVar != null && fyVar.z()) {
            f2.n1 K = lwVar.K(0);
            if (K == null) {
                ry.a(owVar, true, !z10);
            } else {
                ry.a(owVar, K.a.getTop() < lwVar.getPaddingTop(), !z10);
            }
            owVar.setTranslationY(aVar.e * AndroidUtilities.dp(15.0f));
            return;
        }
        if (owVar == null || lwVar == null) {
            return;
        }
        owVar.setTranslationY((aVar.e * AndroidUtilities.dp(15.0f)) + (lwVar.K(0) != null ? r0.a.getTop() : -this.X0));
        owVar.a.a(false, !z10);
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
        ry ryVar;
        f2.j0 j0Var;
        View view;
        View view2;
        int i10;
        TLRPC.TL_messages_stickerSet stickerSetById;
        wy wyVar;
        int E;
        AnimatorSet animatorSet = this.I0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.I0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        if (currentItem == 2 && j10 != -1 && (stickerSetById = MediaDataController.getInstance(this.Y0).getStickerSetById(j10)) != null && (E = (wyVar = this.u0).E(stickerSetById)) >= 0 && E < wyVar.h()) {
            I(E, AndroidUtilities.dp(48.0f));
        }
        jy jyVar = this.f0;
        if (jyVar != null) {
            jyVar.G = false;
        }
        for (int i11 = 0; i11 < 3; i11++) {
            View view3 = this.z0;
            View view4 = this.d0;
            iw iwVar = this.k0;
            View view5 = this.L;
            if (i11 == 0) {
                ryVar = this.R;
                j0Var = this.M;
                view = this.E;
                view2 = view5;
            } else if (i11 == 1) {
                j0Var = this.e0;
                view = this.l0;
                view2 = view4;
                ryVar = iwVar;
            } else {
                ryVar = this.C0;
                j0Var = this.A0;
                view = this.x0;
                view2 = view3;
            }
            if (ryVar != null) {
                qy qyVar = ryVar.r;
                ryVar.d.setText("");
                if (qyVar != null) {
                    qyVar.F1(null);
                    qyVar.D1();
                }
                int i12 = this.X0;
                if (i11 == currentItem && z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.I0 = animatorSet2;
                    Property property = View.TRANSLATION_Y;
                    if (view == null || i11 == 1) {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, AndroidUtilities.dp(36.0f) - i12));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, AndroidUtilities.dp(36.0f)), ObjectAnimator.ofFloat(ryVar, (Property<ry, Float>) property, AndroidUtilities.dp(36.0f)));
                    }
                    this.I0.setDuration(200L);
                    this.I0.setInterpolator(jr.h);
                    this.I0.addListener(new lh.f3(this, j0Var, view2, 5));
                    this.I0.start();
                } else {
                    if (ryVar != iwVar) {
                        ryVar.setTranslationY(AndroidUtilities.dp(36.0f) - i12);
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
                    j0Var.h1(i10, i10);
                }
            }
        }
        if (z10) {
            return;
        }
        this.p1.i(0);
    }

    public void setBlurredBackgroundDrawableFactory(lg.a aVar) {
        org.telegram.ui.ActionBar.c6 c6Var = this.V1;
        sw swVar = this.x;
        if (swVar != null) {
            ng.d c3 = aVar.c(swVar, null, false);
            c3.n(pg.a.d(c6Var));
            c3.p(AndroidUtilities.dp(18.0f));
            c3.o(AndroidUtilities.dp(6.0f));
            swVar.setBackground(c3);
        }
        ImageView imageView = this.A;
        if (imageView != null) {
            ng.d c6 = aVar.c(imageView, null, false);
            c6.n(pg.a.d(c6Var));
            c6.p(AndroidUtilities.dp(18.0f));
            c6.o(AndroidUtilities.dp(6.0f));
            imageView.setBackground(c6);
        }
        zc0 zc0Var = this.w;
        if (zc0Var != null) {
            ng.d c10 = aVar.c(zc0Var, null, false);
            c10.n(pg.a.d(c6Var));
            c10.p(AndroidUtilities.dp(18.0f));
            c10.o(AndroidUtilities.dp(6.0f));
            zc0Var.setBackground(c10);
        }
        ImageView imageView2 = this.y;
        if (imageView2 != null) {
            ng.d c11 = aVar.c(imageView2, null, false);
            c11.n(pg.a.d(c6Var));
            c11.p(AndroidUtilities.dp(18.0f));
            c11.o(AndroidUtilities.dp(6.0f));
            imageView2.setBackground(c11);
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

    public void setDelegate(fy fyVar) {
        this.p1 = fyVar;
    }

    public void setDragListener(jx jxVar) {
        this.K0 = jxVar;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        ow owVar = this.C0;
        if (owVar != null) {
            owVar.d.setEnabled(z10);
        }
        iw iwVar = this.k0;
        if (iwVar != null) {
            iwVar.d.setEnabled(z10);
        }
        cw cwVar = this.R;
        if (cwVar != null) {
            cwVar.d.setEnabled(z10);
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
    public void setTranslationY(float f9) {
        super.setTranslationY(f9);
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
                    F();
                }
                k(true);
                k(false);
                MediaDataController.getInstance(i11).loadRecents(0, true, true, false);
                MediaDataController.getInstance(i11).loadRecents(0, false, true, false);
                MediaDataController.getInstance(i11).loadRecents(2, false, true, false);
            }
            vw vwVar = this.P0;
            if (vwVar != null) {
                vwVar.a();
            }
        }
    }

    public final void t(boolean z10) {
        s(-1L, z10);
    }

    public final void u(boolean z10) {
        wy wyVar;
        boolean z11 = this.J2;
        this.J2 = z10;
        if (!z11 || z10) {
            return;
        }
        int i10 = this.w1;
        if (i10 == 0) {
            nx nxVar = this.N;
            if (nxVar != null) {
                nxVar.F(false);
                return;
            }
            return;
        }
        if (i10 == 1) {
            jy jyVar = this.j0;
            if (jyVar != null) {
                jyVar.l();
                return;
            }
            return;
        }
        if (i10 != 2 || (wyVar = this.u0) == null) {
            return;
        }
        wyVar.l();
    }

    public final int v(float f9) {
        return i0.a.k(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Wk, this.V1), (int) (f9 * 255.0f));
    }

    public final f2.w w(int i10) {
        if (i10 == 0) {
            return this.A0;
        }
        if (i10 == 1) {
            return this.M;
        }
        if (i10 == 2) {
            return this.e0;
        }
        throw new IllegalArgumentException(j7.l1.k(i10, "Unexpected argument: "));
    }

    public final jl0 x(int i10) {
        if (i10 == 0) {
            return this.z0;
        }
        if (i10 == 1) {
            return this.L;
        }
        if (i10 == 2) {
            return this.d0;
        }
        throw new IllegalArgumentException(j7.l1.k(i10, "Unexpected argument: "));
    }

    public final HorizontalScrollView y(int i10) {
        if (i10 == 0) {
            return this.x0;
        }
        if (i10 == 1) {
            return this.E;
        }
        if (i10 == 2) {
            return this.l0;
        }
        throw new IllegalArgumentException(j7.l1.k(i10, "Unexpected argument: "));
    }

    @Override // vd.b
    public final void z(float f9, int i10) {
    }
}
