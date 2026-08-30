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
import org.telegram.ui.hb1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class kz extends FrameLayout implements xd.b, NotificationCenter.NotificationCenterDelegate, ch.a {
    public static final /* synthetic */ int L2 = 0;
    public final pw A0;
    public final int[] A1;
    public ArrayList A2;
    public final ImageView B;
    public final qw B0;
    public int B1;
    public int B2;
    public AnimatorSet C;
    public iz C0;
    public int C1;
    public long C2;
    public AnimatorSet D;
    public final sw D0;
    public int D1;
    public final xd.a D2;
    public float E;
    public final ah.f E0;
    public int E1;
    public ArrayList E2;
    public final fw F;
    public boolean F0;
    public int F1;
    public boolean F2;
    public final hx G;
    public boolean G0;
    public TLRPC.ChatFull G1;
    public AnimatorSet G2;
    public final ah.d H;
    public boolean H0;
    public boolean H1;
    public org.telegram.messenger.video.l H2;
    public final ah.c I;
    public final cy I0;
    public int I1;
    public final yv I2;
    public final ah.d J;
    public AnimatorSet J0;
    public final lf.o0 J1;
    public boolean J2;
    public final ah.c K;
    public final gg.q K0;
    public boolean K1;
    public boolean K2;
    public final View L;
    public ox L0;
    public int L1;
    public final ix M;
    public boolean M0;
    public boolean M1;
    public final jx N;
    public final int[] N0;
    public boolean N1;
    public final rx O;
    public final ObjectAnimator[] O0;
    public sy O1;
    public final jy P;
    public boolean P0;
    public float P1;
    public iz Q;
    public zw Q0;
    public float Q1;
    public final ah.f R;
    public boolean R0;
    public float R1;
    public final gw S;
    public boolean S0;
    public float S1;
    public AnimatorSet T;
    public String[] T0;
    public float T1;
    public final c2.y U;
    public final Drawable[] U0;
    public boolean U1;
    public final c2.y V;
    public final Drawable[] V0;
    public final org.telegram.ui.ActionBar.p2 V1;
    public boolean W;
    public final Drawable[] W0;
    public final org.telegram.ui.ActionBar.f6 W1;
    public final String[] X0;
    public final org.telegram.ui.ActionBar.u5 X1;
    public final int Y0;
    public final org.telegram.ui.ActionBar.u5 Y1;
    public final int Z0;
    public final boolean Z1;
    public final xd.a a;
    public final boolean a0;
    public final ArrayList a1;
    public LongSparseArray a2;
    public final xd.a b;
    public boolean b0;
    public int b1;
    public PorterDuffColorFilter b2;
    public int c;
    public boolean c0;
    public int c1;
    public final m2.b c2;
    public final ArrayList d;
    public final iw d0;
    public boolean d1;
    public final ax d2;
    public final ArrayList e;
    public final jw e0;
    public TLRPC.TL_messages_stickerSet e1;
    public boolean e2;
    public boolean f;
    public final py f0;
    public ArrayList f1;
    public final boolean f2;
    public final oy g0;
    public ArrayList g1;
    public final ng.e g2;
    public final vw h;
    public final ry h0;
    public ArrayList h1;
    public final ah h2;
    public final HashMap i0;
    public ArrayList i1;
    public final sg.d i2;
    public final dw j0;
    public final ArrayList j1;
    public final sg.c j2;
    public final oy k0;
    public final ArrayList k1;
    public final ng.a k2;
    public final mw l0;
    public final ArrayList l1;
    public boolean l2;
    public final px m0;
    public final ArrayList m1;
    public boolean m2;
    public final FrameLayout n;
    public boolean n0;
    public final ArrayList n1;
    public int n2;
    public int o0;
    public final HashMap o1;
    public float o2;
    public int p0;
    public final Paint p1;
    public View p2;
    public int q0;
    public ky q1;
    public int q2;
    public final FrameLayout r;
    public boolean r0;
    public long r1;
    public int r2;
    public final FrameLayout s;
    public boolean s0;
    public boolean s1;
    public long s2;
    public boolean t0;
    public boolean t1;
    public boolean t2;
    public final nw u0;
    public final TLRPC.StickerSetCovered[] u1;
    public boolean u2;
    public final View v;
    public final bz v0;
    public final LongSparseArray v1;
    public final Rect v2;
    public final fd0 w;
    public final fz w0;
    public final LongSparseArray w1;
    public final RectF w2;
    public final ww x;
    public final dw x0;
    public int x1;
    public final ArrayList x2;
    public final ImageView y;
    public final tw y0;
    public final ru y1;
    public final GradientDrawable y2;
    public final uw z0;
    public final int z1;
    public int z2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v64, types: [org.telegram.ui.Components.dw, org.telegram.ui.Components.il0] */
    /* JADX WARN: Type inference failed for: r8v25, types: [org.telegram.ui.Components.dw, org.telegram.ui.Components.il0] */
    public kz(org.telegram.ui.ActionBar.p2 p2Var, boolean z4, boolean z10, boolean z11, Context context, boolean z12, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z13, final org.telegram.ui.ActionBar.f6 f6Var, boolean z14, boolean z15) {
        super(context);
        org.telegram.ui.ActionBar.u5 u5Var;
        int A;
        ix ixVar;
        yv yvVar;
        boolean z16;
        boolean z17;
        Context context2;
        int i10;
        rx rxVar;
        int i11;
        hx hxVar;
        final org.telegram.ui.ActionBar.f6 f6Var2;
        int i12;
        boolean z18;
        boolean z19;
        Field field;
        nr nrVar = nr.h;
        this.a = new xd.a(0, this, nrVar, 320L, false);
        this.b = new xd.a(1, this, nrVar, 320L, false);
        this.c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = new ArrayList();
        this.W = true;
        this.h0 = new ry(this);
        this.i0 = new HashMap();
        this.n0 = true;
        this.o0 = -2;
        this.p0 = -2;
        this.q0 = -2;
        this.r0 = true;
        this.t0 = true;
        this.F0 = true;
        this.N0 = new int[3];
        this.O0 = new ObjectAnimator[3];
        int i13 = UserConfig.selectedAccount;
        this.Z0 = i13;
        this.a1 = new ArrayList();
        this.f1 = new ArrayList();
        this.g1 = new ArrayList();
        this.h1 = new ArrayList();
        this.i1 = new ArrayList();
        this.j1 = new ArrayList();
        this.k1 = new ArrayList();
        new ArrayList();
        this.l1 = new ArrayList();
        this.m1 = new ArrayList();
        this.n1 = new ArrayList();
        this.o1 = new HashMap();
        this.u1 = new TLRPC.StickerSetCovered[10];
        this.v1 = new LongSparseArray();
        this.w1 = new LongSparseArray();
        this.A1 = new int[2];
        this.C1 = -2;
        this.D1 = -2;
        this.E1 = -2;
        this.F1 = -2;
        this.I1 = -1;
        this.c2 = new m2.b(this, 20);
        this.d2 = new ax(this);
        this.e2 = true;
        this.o2 = -1.0f;
        this.q2 = -1;
        this.r2 = -1;
        this.s2 = -1L;
        this.t2 = false;
        this.u2 = true;
        this.v2 = new Rect();
        RectF rectF = new RectF();
        this.w2 = rectF;
        ArrayList arrayList2 = new ArrayList(1);
        this.x2 = arrayList2;
        arrayList2.add(rectF);
        new Paint(1);
        this.y2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.D2 = new xd.a(0, new bw(this, 1), nrVar, 380L, true);
        this.I2 = new yv(this, 2);
        this.J2 = false;
        this.r0 = z13;
        this.V1 = p2Var;
        this.Z1 = z4;
        this.W1 = f6Var;
        this.f2 = z15;
        sg.c cVar = new sg.c();
        this.j2 = cVar;
        cVar.a(A(org.telegram.ui.ActionBar.j6.d6));
        if (z14) {
            u(true);
        }
        i0.a.k(A(org.telegram.ui.ActionBar.j6.Wk), 30);
        int dp = AndroidUtilities.dp(50.0f);
        this.Y0 = dp;
        this.a0 = z12;
        this.U0 = new Drawable[]{org.telegram.ui.ActionBar.j6.U(context, R.drawable.smiles_tab_smiles, z15 ? v(0.4f) : A(org.telegram.ui.ActionBar.j6.Re), z15 ? v(0.8f) : A(org.telegram.ui.ActionBar.j6.Oe)), org.telegram.ui.ActionBar.j6.U(context, R.drawable.smiles_tab_gif, z15 ? v(0.4f) : A(org.telegram.ui.ActionBar.j6.Re), z15 ? v(0.8f) : A(org.telegram.ui.ActionBar.j6.Oe)), org.telegram.ui.ActionBar.j6.U(context, R.drawable.smiles_tab_stickers, z15 ? v(0.4f) : A(org.telegram.ui.ActionBar.j6.Re), z15 ? v(0.8f) : A(org.telegram.ui.ActionBar.j6.Oe))};
        org.telegram.ui.ActionBar.u5 U = org.telegram.ui.ActionBar.j6.U(context, R.drawable.msg_emoji_recent, z15 ? v(0.4f) : A(org.telegram.ui.ActionBar.j6.Me), z15 ? v(0.8f) : A(org.telegram.ui.ActionBar.j6.Oe));
        org.telegram.ui.ActionBar.u5 U2 = org.telegram.ui.ActionBar.j6.U(context, R.drawable.emoji_tabs_faves, z15 ? v(0.4f) : A(org.telegram.ui.ActionBar.j6.Me), z15 ? v(0.8f) : A(org.telegram.ui.ActionBar.j6.Oe));
        org.telegram.ui.ActionBar.u5 U3 = org.telegram.ui.ActionBar.j6.U(context, R.drawable.emoji_tabs_new3, z15 ? v(0.4f) : A(org.telegram.ui.ActionBar.j6.Me), z15 ? v(0.8f) : A(org.telegram.ui.ActionBar.j6.Oe));
        int i14 = R.drawable.emoji_tabs_new1;
        if (z15) {
            u5Var = U3;
            A = v(0.4f);
        } else {
            u5Var = U3;
            A = A(org.telegram.ui.ActionBar.j6.Me);
        }
        org.telegram.ui.ActionBar.u5 U4 = org.telegram.ui.ActionBar.j6.U(context, i14, A, z15 ? v(0.8f) : A(org.telegram.ui.ActionBar.j6.Oe));
        this.X1 = U4;
        int i15 = R.drawable.emoji_tabs_new2;
        int i16 = org.telegram.ui.ActionBar.j6.Qe;
        org.telegram.ui.ActionBar.u5 U5 = org.telegram.ui.ActionBar.j6.U(context, i15, A(i16), A(i16));
        this.Y1 = U5;
        this.V0 = new Drawable[]{U, U2, u5Var, new LayerDrawable(new Drawable[]{U4, U5})};
        this.W0 = new Drawable[]{org.telegram.ui.ActionBar.j6.U(context, R.drawable.msg_emoji_recent, z15 ? v(0.4f) : A(org.telegram.ui.ActionBar.j6.Me), z15 ? v(0.8f) : A(org.telegram.ui.ActionBar.j6.Oe)), org.telegram.ui.ActionBar.j6.U(context, R.drawable.stickers_gifs_trending, z15 ? v(0.4f) : A(org.telegram.ui.ActionBar.j6.Me), z15 ? v(0.8f) : A(org.telegram.ui.ActionBar.j6.Oe))};
        this.X0 = new String[]{LocaleController.getString(R.string.Emoji1), LocaleController.getString(R.string.Emoji2), LocaleController.getString(R.string.Emoji3), LocaleController.getString(R.string.Emoji4), LocaleController.getString(R.string.Emoji5), LocaleController.getString(R.string.Emoji6), LocaleController.getString(R.string.Emoji7), LocaleController.getString(R.string.Emoji8)};
        this.G1 = chatFull;
        Paint paint = new Paint(1);
        this.p1 = paint;
        paint.setColor(A(org.telegram.ui.ActionBar.j6.af));
        float dp2 = AndroidUtilities.dp(6.0f);
        gg.j1 j1Var = lf.q0.a;
        this.J1 = new lf.o0(dp2);
        hx hxVar2 = new hx(this, context);
        this.G = hxVar2;
        gz gzVar = new gz();
        gzVar.a = 0;
        gzVar.b = hxVar2;
        arrayList.add(gzVar);
        if (z4) {
            MediaDataController.getInstance(i13).checkStickers(5);
            MediaDataController.getInstance(i13).checkFeaturedEmoji();
            this.b2 = new PorterDuffColorFilter(A(org.telegram.ui.ActionBar.j6.Oh), PorterDuff.Mode.SRC_IN);
        }
        ix ixVar2 = new ix(this, context);
        this.M = ixVar2;
        f2.l lVar = new f2.l();
        lVar.c = 220L;
        lVar.e = 220L;
        lVar.f = 160L;
        lVar.g = 160L;
        lVar.i = nr.g;
        ixVar2.setItemAnimator(lVar);
        final int i17 = 0;
        ixVar2.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.aw
            public final /* synthetic */ kz b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (i17) {
                    case 0:
                        org.telegram.ui.pt q10 = org.telegram.ui.pt.q();
                        kz kzVar = this.b;
                        ix ixVar3 = kzVar.M;
                        kzVar.getMeasuredHeight();
                        return q10.s(motionEvent, ixVar3, null, kzVar.d2, f6Var);
                    case 1:
                        org.telegram.ui.pt q11 = org.telegram.ui.pt.q();
                        kz kzVar2 = this.b;
                        return q11.s(motionEvent, kzVar2.e0, kzVar2.j0, kzVar2.d2, f6Var);
                    default:
                        org.telegram.ui.pt q12 = org.telegram.ui.pt.q();
                        kz kzVar3 = this.b;
                        pw pwVar = kzVar3.A0;
                        kzVar3.getMeasuredHeight();
                        return q12.s(motionEvent, pwVar, kzVar3.x0, kzVar3.d2, f6Var);
                }
            }
        });
        ixVar2.setOnItemLongClickListener(new bw(this, i17));
        ixVar2.setInstantClick(true);
        jx jxVar = new jx(this);
        this.N = jxVar;
        ixVar2.setLayoutManager(jxVar);
        ixVar2.setTopGlowOffset(AndroidUtilities.dp(38.0f));
        ixVar2.setBottomGlowOffset(AndroidUtilities.dp(36.0f));
        ixVar2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f));
        int i18 = org.telegram.ui.ActionBar.j6.He;
        ixVar2.setGlowColor(A(i18));
        ixVar2.setItemSelectorColorProvider(new k2(15));
        ixVar2.setClipToPadding(false);
        jxVar.O = new kx(this);
        rx rxVar2 = new rx(this);
        this.O = rxVar2;
        ixVar2.setAdapter(rxVar2);
        ixVar2.i(new gg.e2(this, 3));
        this.P = new jy(this, context);
        hxVar2.addView(ixVar2, k7.b6.c(-1.0f, -1));
        c2.y yVar = new c2.y(ixVar2, jxVar);
        this.V = yVar;
        yVar.i = new lx(this);
        ixVar2.setOnScrollListener(new mx(this));
        if (p2Var != null) {
            ixVar = ixVar2;
            yvVar = new yv(this, 5);
            z17 = z15;
            context2 = context;
            i10 = i16;
            rxVar = rxVar2;
            hxVar = hxVar2;
            z16 = z4;
            f6Var2 = f6Var;
            i12 = dp;
            i11 = -1;
        } else {
            ixVar = ixVar2;
            yvVar = null;
            z16 = z4;
            z17 = z15;
            context2 = context;
            i10 = i16;
            rxVar = rxVar2;
            i11 = -1;
            hxVar = hxVar2;
            f6Var2 = f6Var;
            i12 = dp;
        }
        fw fwVar = new fw(this, context2, f6Var2, z16, yvVar, z17);
        this.F = fwVar;
        if (z12) {
            gw gwVar = new gw(this, context2);
            this.S = gwVar;
            hxVar.addView(gwVar, new FrameLayout.LayoutParams(i11, AndroidUtilities.getShadowHeight() + i12));
            gwVar.d.setOnFocusChangeListener(new hw(this));
            ah.f fVar = new ah.f(context2, f6Var2);
            this.R = fVar;
            fVar.setVisibility(8);
            final int i19 = 0;
            fVar.setOnBackClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.cw
                public final /* synthetic */ kz b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i19) {
                        case 0:
                            jy jyVar = this.b.P;
                            dy dyVar = jyVar.c;
                            int childCount = dyVar.getChildCount();
                            for (int i20 = 0; i20 < childCount; i20++) {
                                ((ah.e) dyVar.getChildAt(i20)).a(false, true);
                            }
                            jyVar.d = 0L;
                            jyVar.C.b.a(false, true);
                            jyVar.l();
                            break;
                        case 1:
                            fz fzVar = this.b.w0;
                            ez ezVar = fzVar.c;
                            int childCount2 = ezVar.getChildCount();
                            for (int i21 = 0; i21 < childCount2; i21++) {
                                ((ah.e) ezVar.getChildAt(i21)).a(false, true);
                            }
                            fzVar.d = 0L;
                            fzVar.N.a.a(false, true);
                            fzVar.l();
                            break;
                        case 2:
                            ky kyVar = this.b.q1;
                            if (kyVar != null) {
                                kyVar.w();
                                break;
                            }
                            break;
                        default:
                            kz kzVar = this.b;
                            int currentItem = kzVar.h.getCurrentItem();
                            wy wyVar = currentItem == 0 ? kzVar.S : currentItem == 1 ? kzVar.l0 : kzVar.D0;
                            if (wyVar != null) {
                                gq gqVar = wyVar.d;
                                gqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                gqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                gqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
            hxVar.addView(fVar, new FrameLayout.LayoutParams(i11, i12));
        }
        int A2 = A(i18);
        if (Color.alpha(A2) >= 255) {
            fwVar.setBackgroundColor(A2);
        }
        rx rxVar3 = rxVar;
        rxVar3.G(true);
        fwVar.p(getEmojipacks());
        hxVar.addView(fwVar, k7.b6.c(36.0f, i11));
        View view = new View(context2);
        this.L = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i20 = org.telegram.ui.ActionBar.j6.Ke;
        view.setBackgroundColor(A(i20));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i11, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(36.0f);
        hxVar.addView(view, layoutParams);
        ah.c cVar2 = new ah.c(context2, f6Var2);
        this.I = cVar2;
        ah.d dVar = new ah.d(context2, 0, f6Var2);
        this.H = dVar;
        dVar.setVisibility(8);
        dVar.addView(cVar2, k7.b6.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
        hxVar.addView(dVar, k7.b6.e(i11, -2, 80));
        if (z10) {
            om0 om0Var = om0.b;
            if (z11) {
                iw iwVar = new iw(this, context2);
                this.d0 = iwVar;
                gz gzVar2 = new gz();
                gzVar2.a = 1;
                gzVar2.b = iwVar;
                this.d.add(gzVar2);
                jw jwVar = new jw(this, context2);
                this.e0 = jwVar;
                jwVar.setClipToPadding(false);
                py pyVar = new py(this);
                this.f0 = pyVar;
                jwVar.setLayoutManager(pyVar);
                jwVar.i(new kw(this));
                jwVar.setPadding(0, i12, 0, AndroidUtilities.dp(44.0f) + this.n2);
                jwVar.setOverScrollMode(2);
                ((f2.o1) jwVar.getItemAnimator()).m = false;
                oy oyVar = new oy(this, context2, true, ConnectionsManager.DEFAULT_DATACENTER_ID);
                this.k0 = oyVar;
                jwVar.setAdapter(oyVar);
                this.g0 = new oy(this, context2, false, 0);
                jwVar.setOnScrollListener(new lw(this));
                final int i21 = 1;
                jwVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.aw
                    public final /* synthetic */ kz b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (i21) {
                            case 0:
                                org.telegram.ui.pt q10 = org.telegram.ui.pt.q();
                                kz kzVar = this.b;
                                ix ixVar3 = kzVar.M;
                                kzVar.getMeasuredHeight();
                                return q10.s(motionEvent, ixVar3, null, kzVar.d2, f6Var2);
                            case 1:
                                org.telegram.ui.pt q11 = org.telegram.ui.pt.q();
                                kz kzVar2 = this.b;
                                return q11.s(motionEvent, kzVar2.e0, kzVar2.j0, kzVar2.d2, f6Var2);
                            default:
                                org.telegram.ui.pt q12 = org.telegram.ui.pt.q();
                                kz kzVar3 = this.b;
                                pw pwVar = kzVar3.A0;
                                kzVar3.getMeasuredHeight();
                                return q12.s(motionEvent, pwVar, kzVar3.x0, kzVar3.d2, f6Var2);
                        }
                    }
                });
                final int i22 = 0;
                ?? r82 = new il0(this) { // from class: org.telegram.ui.Components.dw
                    public final /* synthetic */ kz b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.ui.Components.il0
                    public final void f(int i23, View view2) {
                        switch (i22) {
                            case 0:
                                kz kzVar = this.b;
                                jw jwVar2 = kzVar.e0;
                                oy oyVar2 = kzVar.g0;
                                oy oyVar3 = kzVar.k0;
                                if (kzVar.q1 != null) {
                                    oyVar3.getClass();
                                    ArrayList arrayList3 = oyVar3.x;
                                    if (jwVar2.getAdapter() != oyVar3) {
                                        if (jwVar2.getAdapter() == oyVar2 && i23 >= 0 && i23 < oyVar2.x.size()) {
                                            kzVar.q1.v(view2, oyVar2.x.get(i23), oyVar2.w, oyVar2.n, true, 0, 0);
                                            kzVar.Y();
                                            break;
                                        }
                                    } else if (i23 >= 0) {
                                        int i24 = oyVar3.E;
                                        if (i23 >= i24) {
                                            int i25 = i24 > 0 ? (i23 - i24) - 1 : i23;
                                            if (i25 >= 0 && i25 < arrayList3.size()) {
                                                kzVar.q1.v(view2, arrayList3.get(i25), null, oyVar3.n, true, 0, 0);
                                                break;
                                            }
                                        } else {
                                            kzVar.q1.v(view2, kzVar.f1.get(i23), null, "gif", true, 0, 0);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                kz kzVar2 = this.b;
                                f2.o0 adapter = kzVar2.A0.getAdapter();
                                fz fzVar = kzVar2.w0;
                                String str = adapter == fzVar ? fzVar.K : null;
                                if (view2 instanceof org.telegram.ui.Cells.d8) {
                                    org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view2;
                                    if (d8Var.getSticker() != null && MessageObject.isPremiumSticker(d8Var.getSticker()) && !AccountInstance.getInstance(kzVar2.Z0).getUserConfig().isPremium()) {
                                        org.telegram.ui.pt.q().y(d8Var);
                                        break;
                                    } else {
                                        org.telegram.ui.pt.q().u();
                                        if (!d8Var.r) {
                                            d8Var.r = true;
                                            d8Var.n = 0.5f;
                                            d8Var.x = 0L;
                                            org.telegram.ui.Cells.c8 c8Var = d8Var.a;
                                            c8Var.setAlpha(0.5f * d8Var.E);
                                            c8Var.invalidate();
                                            d8Var.s = System.currentTimeMillis();
                                            d8Var.invalidate();
                                            kzVar2.q1.m(d8Var, d8Var.getSticker(), str, d8Var.getParentObject(), d8Var.getSendAnimationData(), true, 0);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                };
                this.j0 = r82;
                jwVar.setOnItemClickListener((il0) r82);
                iwVar.addView(jwVar, k7.b6.c(-1.0f, -1));
                mw mwVar = new mw(this, context2);
                this.l0 = mwVar;
                iwVar.addView(mwVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + i12));
                px pxVar = new px(this, context2, f6Var2);
                this.m0 = pxVar;
                pxVar.setType(om0Var);
                pxVar.setUnderlineHeight(AndroidUtilities.getShadowHeight());
                pxVar.setIndicatorColor(A(i10));
                pxVar.setUnderlineColor(A(i20));
                pxVar.setBackgroundColor(A(i18));
                X();
                pxVar.setDelegate(new bw(this, 2));
                oyVar.F("", "", true, true, true);
            }
            nw nwVar = new nw(this, context2, z13);
            this.u0 = nwVar;
            MediaDataController.getInstance(this.Z0).checkStickers(0);
            MediaDataController.getInstance(this.Z0).checkFeaturedStickers();
            pw pwVar = new pw(this, context2);
            this.A0 = pwVar;
            qw qwVar = new qw(this);
            this.B0 = qwVar;
            pwVar.setLayoutManager(qwVar);
            qwVar.O = new rw(this);
            pwVar.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f));
            pwVar.setClipToPadding(false);
            gz gzVar3 = new gz();
            gzVar3.a = 2;
            gzVar3.b = nwVar;
            this.d.add(gzVar3);
            this.w0 = new fz(this, context2);
            bz bzVar = new bz(this, context2);
            this.v0 = bzVar;
            pwVar.setAdapter(bzVar);
            final int i23 = 2;
            pwVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.aw
                public final /* synthetic */ kz b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (i23) {
                        case 0:
                            org.telegram.ui.pt q10 = org.telegram.ui.pt.q();
                            kz kzVar = this.b;
                            ix ixVar3 = kzVar.M;
                            kzVar.getMeasuredHeight();
                            return q10.s(motionEvent, ixVar3, null, kzVar.d2, f6Var2);
                        case 1:
                            org.telegram.ui.pt q11 = org.telegram.ui.pt.q();
                            kz kzVar2 = this.b;
                            return q11.s(motionEvent, kzVar2.e0, kzVar2.j0, kzVar2.d2, f6Var2);
                        default:
                            org.telegram.ui.pt q12 = org.telegram.ui.pt.q();
                            kz kzVar3 = this.b;
                            pw pwVar2 = kzVar3.A0;
                            kzVar3.getMeasuredHeight();
                            return q12.s(motionEvent, pwVar2, kzVar3.x0, kzVar3.d2, f6Var2);
                    }
                }
            });
            final int i24 = 1;
            ?? r42 = new il0(this) { // from class: org.telegram.ui.Components.dw
                public final /* synthetic */ kz b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.Components.il0
                public final void f(int i232, View view2) {
                    switch (i24) {
                        case 0:
                            kz kzVar = this.b;
                            jw jwVar2 = kzVar.e0;
                            oy oyVar2 = kzVar.g0;
                            oy oyVar3 = kzVar.k0;
                            if (kzVar.q1 != null) {
                                oyVar3.getClass();
                                ArrayList arrayList3 = oyVar3.x;
                                if (jwVar2.getAdapter() != oyVar3) {
                                    if (jwVar2.getAdapter() == oyVar2 && i232 >= 0 && i232 < oyVar2.x.size()) {
                                        kzVar.q1.v(view2, oyVar2.x.get(i232), oyVar2.w, oyVar2.n, true, 0, 0);
                                        kzVar.Y();
                                        break;
                                    }
                                } else if (i232 >= 0) {
                                    int i242 = oyVar3.E;
                                    if (i232 >= i242) {
                                        int i25 = i242 > 0 ? (i232 - i242) - 1 : i232;
                                        if (i25 >= 0 && i25 < arrayList3.size()) {
                                            kzVar.q1.v(view2, arrayList3.get(i25), null, oyVar3.n, true, 0, 0);
                                            break;
                                        }
                                    } else {
                                        kzVar.q1.v(view2, kzVar.f1.get(i232), null, "gif", true, 0, 0);
                                        break;
                                    }
                                }
                            }
                            break;
                        default:
                            kz kzVar2 = this.b;
                            f2.o0 adapter = kzVar2.A0.getAdapter();
                            fz fzVar = kzVar2.w0;
                            String str = adapter == fzVar ? fzVar.K : null;
                            if (view2 instanceof org.telegram.ui.Cells.d8) {
                                org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view2;
                                if (d8Var.getSticker() != null && MessageObject.isPremiumSticker(d8Var.getSticker()) && !AccountInstance.getInstance(kzVar2.Z0).getUserConfig().isPremium()) {
                                    org.telegram.ui.pt.q().y(d8Var);
                                    break;
                                } else {
                                    org.telegram.ui.pt.q().u();
                                    if (!d8Var.r) {
                                        d8Var.r = true;
                                        d8Var.n = 0.5f;
                                        d8Var.x = 0L;
                                        org.telegram.ui.Cells.c8 c8Var = d8Var.a;
                                        c8Var.setAlpha(0.5f * d8Var.E);
                                        c8Var.invalidate();
                                        d8Var.s = System.currentTimeMillis();
                                        d8Var.invalidate();
                                        kzVar2.q1.m(d8Var, d8Var.getSticker(), str, d8Var.getParentObject(), d8Var.getSendAnimationData(), true, 0);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            };
            this.x0 = r42;
            pwVar.setOnItemClickListener((il0) r42);
            pwVar.setGlowColor(A(i18));
            nwVar.addView(pwVar);
            this.U = new c2.y(pwVar, qwVar);
            sw swVar = new sw(this, context2);
            this.D0 = swVar;
            nwVar.addView(swVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + i12));
            ah.f fVar2 = new ah.f(context2, f6Var2);
            this.E0 = fVar2;
            fVar2.setVisibility(8);
            final int i25 = 1;
            fVar2.setOnBackClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.cw
                public final /* synthetic */ kz b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i25) {
                        case 0:
                            jy jyVar = this.b.P;
                            dy dyVar = jyVar.c;
                            int childCount = dyVar.getChildCount();
                            for (int i202 = 0; i202 < childCount; i202++) {
                                ((ah.e) dyVar.getChildAt(i202)).a(false, true);
                            }
                            jyVar.d = 0L;
                            jyVar.C.b.a(false, true);
                            jyVar.l();
                            break;
                        case 1:
                            fz fzVar = this.b.w0;
                            ez ezVar = fzVar.c;
                            int childCount2 = ezVar.getChildCount();
                            for (int i212 = 0; i212 < childCount2; i212++) {
                                ((ah.e) ezVar.getChildAt(i212)).a(false, true);
                            }
                            fzVar.d = 0L;
                            fzVar.N.a.a(false, true);
                            fzVar.l();
                            break;
                        case 2:
                            ky kyVar = this.b.q1;
                            if (kyVar != null) {
                                kyVar.w();
                                break;
                            }
                            break;
                        default:
                            kz kzVar = this.b;
                            int currentItem = kzVar.h.getCurrentItem();
                            wy wyVar = currentItem == 0 ? kzVar.S : currentItem == 1 ? kzVar.l0 : kzVar.D0;
                            if (wyVar != null) {
                                gq gqVar = wyVar.d;
                                gqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                gqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                gqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
            nwVar.addView(fVar2, new FrameLayout.LayoutParams(-1, i12));
            z18 = z13;
            z19 = true;
            tw twVar = new tw(this, context2, f6Var2, p2Var, z18);
            this.y0 = twVar;
            twVar.setDragEnabled(true);
            twVar.setWillNotDraw(false);
            twVar.setType(om0Var);
            twVar.setUnderlineHeight(pwVar.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
            twVar.setIndicatorColor(A(i10));
            twVar.setUnderlineColor(A(i20));
            if (viewGroup == null || !z18) {
                nwVar.addView(twVar, k7.b6.e(-1, 36, 51));
            } else {
                uw uwVar = new uw(this, context2);
                this.z0 = uwVar;
                uwVar.addView(twVar, k7.b6.e(-1, 36, 51));
                viewGroup.addView(uwVar, k7.b6.c(-2.0f, -1));
            }
            Z(true);
            twVar.setDelegate(new bw(this, 3));
            pwVar.setOnScrollListener(new jz(this, 0));
            ah.c cVar3 = new ah.c(context2, f6Var2);
            this.K = cVar3;
            ah.d dVar2 = new ah.d(context2, 0, f6Var2);
            this.J = dVar2;
            dVar2.setVisibility(8);
            dVar2.addView(cVar3, k7.b6.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
            nwVar.addView(dVar2, k7.b6.e(-1, -2, 80));
        } else {
            z18 = z13;
            z19 = true;
        }
        this.e.clear();
        this.e.addAll(this.d);
        vw vwVar = new vw(this, context2);
        this.h = vwVar;
        cy cyVar = new cy(this);
        this.I0 = cyVar;
        vwVar.setAdapter(cyVar);
        ww wwVar = new ww(this, context2);
        this.x = wwVar;
        wwVar.setHapticFeedbackEnabled(z19);
        wwVar.setImageResource(R.drawable.smiles_tab_clear);
        int v = z15 ? v(0.6f) : A(org.telegram.ui.ActionBar.j6.Re);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        wwVar.setColorFilter(new PorterDuffColorFilter(v, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        wwVar.setScaleType(scaleType);
        wwVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        wwVar.setFocusable(z19);
        wwVar.setOnClickListener(new xw());
        k7.d6.a(wwVar);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.r = frameLayout;
        if (z12) {
            addView(frameLayout, k7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, (AndroidUtilities.getShadowHeight() / AndroidUtilities.density) + 40.0f));
        } else {
            addView(frameLayout, k7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.s = frameLayout2;
        addView(frameLayout2, k7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.n = frameLayout3;
        View view2 = new View(context2);
        this.v = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(40.0f), 83));
        if (z12) {
            addView(frameLayout3, k7.b6.e(-1, 48, 80));
            frameLayout3.addView(wwVar, k7.b6.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
            if (z10) {
                ImageView imageView = new ImageView(context2);
                this.y = imageView;
                imageView.setImageResource(R.drawable.smiles_tab_settings);
                imageView.setColorFilter(new PorterDuffColorFilter(z15 ? v(0.6f) : A(org.telegram.ui.ActionBar.j6.Re), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(LocaleController.getString(R.string.Settings));
                k7.d6.a(imageView);
                frameLayout3.addView(imageView, k7.b6.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
                final int i26 = 2;
                imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.cw
                    public final /* synthetic */ kz b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i26) {
                            case 0:
                                jy jyVar = this.b.P;
                                dy dyVar = jyVar.c;
                                int childCount = dyVar.getChildCount();
                                for (int i202 = 0; i202 < childCount; i202++) {
                                    ((ah.e) dyVar.getChildAt(i202)).a(false, true);
                                }
                                jyVar.d = 0L;
                                jyVar.C.b.a(false, true);
                                jyVar.l();
                                break;
                            case 1:
                                fz fzVar = this.b.w0;
                                ez ezVar = fzVar.c;
                                int childCount2 = ezVar.getChildCount();
                                for (int i212 = 0; i212 < childCount2; i212++) {
                                    ((ah.e) ezVar.getChildAt(i212)).a(false, true);
                                }
                                fzVar.d = 0L;
                                fzVar.N.a.a(false, true);
                                fzVar.l();
                                break;
                            case 2:
                                ky kyVar = this.b.q1;
                                if (kyVar != null) {
                                    kyVar.w();
                                    break;
                                }
                                break;
                            default:
                                kz kzVar = this.b;
                                int currentItem = kzVar.h.getCurrentItem();
                                wy wyVar = currentItem == 0 ? kzVar.S : currentItem == 1 ? kzVar.l0 : kzVar.D0;
                                if (wyVar != null) {
                                    gq gqVar = wyVar.d;
                                    gqVar.requestFocus();
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                    gqVar.onTouchEvent(obtain);
                                    obtain.recycle();
                                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                    gqVar.onTouchEvent(obtain2);
                                    obtain2.recycle();
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
            fd0 fd0Var = new fd0(context2, f6Var2);
            this.w = fd0Var;
            fd0Var.setViewPager(vwVar);
            fd0Var.setShouldExpand(false);
            fd0Var.setIndicatorHeight(AndroidUtilities.dp(3.0f));
            fd0Var.setIndicatorColor(i0.a.k(A(org.telegram.ui.ActionBar.j6.Oe), 20));
            fd0Var.setUnderlineHeight(0);
            fd0Var.setTabPaddingLeftRight(AndroidUtilities.dp(11.0f));
            fd0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
            frameLayout3.addView(fd0Var, k7.b6.e(-2, 48, 81));
            fd0Var.setOnPageChangeListener(new yw(this, z18));
            ImageView imageView2 = new ImageView(context2);
            this.B = imageView2;
            imageView2.setImageResource(R.drawable.smiles_tab_search);
            imageView2.setColorFilter(new PorterDuffColorFilter(z15 ? v(0.6f) : A(org.telegram.ui.ActionBar.j6.Re), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(LocaleController.getString(R.string.Search));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, k7.b6.d(48, 48.0f, 83, 2.0f, 0.0f, 2.0f, 0.0f));
            final int i27 = 3;
            imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.cw
                public final /* synthetic */ kz b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view22) {
                    switch (i27) {
                        case 0:
                            jy jyVar = this.b.P;
                            dy dyVar = jyVar.c;
                            int childCount = dyVar.getChildCount();
                            for (int i202 = 0; i202 < childCount; i202++) {
                                ((ah.e) dyVar.getChildAt(i202)).a(false, true);
                            }
                            jyVar.d = 0L;
                            jyVar.C.b.a(false, true);
                            jyVar.l();
                            break;
                        case 1:
                            fz fzVar = this.b.w0;
                            ez ezVar = fzVar.c;
                            int childCount2 = ezVar.getChildCount();
                            for (int i212 = 0; i212 < childCount2; i212++) {
                                ((ah.e) ezVar.getChildAt(i212)).a(false, true);
                            }
                            fzVar.d = 0L;
                            fzVar.N.a.a(false, true);
                            fzVar.l();
                            break;
                        case 2:
                            ky kyVar = this.b.q1;
                            if (kyVar != null) {
                                kyVar.w();
                                break;
                            }
                            break;
                        default:
                            kz kzVar = this.b;
                            int currentItem = kzVar.h.getCurrentItem();
                            wy wyVar = currentItem == 0 ? kzVar.S : currentItem == 1 ? kzVar.l0 : kzVar.D0;
                            if (wyVar != null) {
                                gq gqVar = wyVar.d;
                                gqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                gqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                gqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            addView(frameLayout3, k7.b6.d(56, 48.0f, (LocaleController.isRTL ? 3 : 5) | 80, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(56.0f), A(i18), A(i18));
            k7.d6.a(wwVar);
            wwVar.setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
            wwVar.setBackground(h02);
            wwVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
            wwVar.setFocusable(true);
            frameLayout3.addView(wwVar, k7.b6.d(48, 48.0f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
            view2.setVisibility(8);
        }
        addView(vwVar, 0, k7.b6.e(-1, -1, 51));
        gg.q qVar = new gg.q(context2, 21);
        this.K0 = qVar;
        qVar.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(6.0f), A(org.telegram.ui.ActionBar.j6.qf)));
        qVar.setTextColor(A(org.telegram.ui.ActionBar.j6.pf));
        qVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f));
        qVar.setGravity(16);
        qVar.setTextSize(1, 14.0f);
        int i28 = 4;
        qVar.setVisibility(4);
        addView(qVar, k7.b6.d(-2, -2.0f, 81, 5.0f, 0.0f, 5.0f, 53.0f));
        this.z1 = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 32.0f);
        Field field2 = ru.f;
        ru ruVar = new ru(new qu(context2, f6Var2));
        if (ru.f == null) {
            try {
                field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    field.setAccessible(true);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                field = null;
            }
            ru.f = field;
        }
        Field field3 = ru.f;
        if (field3 != null) {
            try {
                ruVar.a = (ViewTreeObserver.OnScrollChangedListener) field3.get(ruVar);
                ru.f.set(ruVar, ru.g);
            } catch (Exception unused3) {
                ruVar.a = null;
            }
        }
        this.y1 = ruVar;
        ruVar.c.setOnSelectionUpdateListener(new d(this, 10));
        this.x1 = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
        Emoji.loadRecentEmoji();
        rxVar3.F(false);
        J(true, z10, z11, false);
        if (Build.VERSION.SDK_INT >= 31) {
            sg.d dVar3 = new sg.d(null);
            this.i2 = dVar3;
            ng.a aVar = new ng.a(dVar3);
            this.k2 = aVar;
            aVar.f = LiteMode.isEnabled(262144);
            this.g2 = new ng.e(false);
        } else {
            this.i2 = null;
            this.k2 = new ng.a(this.j2);
            this.g2 = null;
        }
        ug.i iVar = new ug.i(this);
        fd0 fd0Var2 = this.w;
        if (fd0Var2 != null) {
            iVar.d(fd0Var2, this, new bw(this, i28), false);
        }
        ng.a aVar2 = this.k2;
        aVar2.d = iVar;
        aVar2.e = this;
        og.a[] aVarArr = new og.a[3];
        ix ixVar3 = ixVar;
        ixVar3.C0(new yv(this, 1));
        aVarArr[0] = new ng.k(ixVar3, this, new zv(ixVar3, 0));
        jw jwVar2 = this.e0;
        if (jwVar2 != null) {
            jwVar2.C0(new yv(this, 3));
            jw jwVar3 = this.e0;
            Objects.requireNonNull(jwVar3);
            aVarArr[1] = new ng.k(jwVar3, this, new zv(jwVar3, 1));
        }
        pw pwVar2 = this.A0;
        if (pwVar2 != null) {
            pwVar2.C0(new yv(this, i28));
            aVarArr[2] = new ng.k(this.A0, this, new zv(this, 2));
        }
        this.h2 = new ah(aVarArr, 1);
        setBlurredBackgroundDrawableFactory(this.k2);
    }

    public static void a(kz kzVar, boolean z4) {
        jw jwVar = kzVar.e0;
        if (jwVar == null) {
            return;
        }
        int childCount = jwVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = jwVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.e2) {
                ImageReceiver photoImage = ((org.telegram.ui.Cells.e2) childAt).getPhotoImage();
                if (z4) {
                    photoImage.setAllowStartAnimation(true);
                    photoImage.startAnimation();
                } else {
                    photoImage.setAllowStartAnimation(false);
                    photoImage.stopAnimation();
                }
            }
        }
    }

    public static void d(kz kzVar, sy syVar, String str) {
        String str2;
        ky kyVar;
        org.telegram.ui.ActionBar.p2 p2Var = kzVar.V1;
        int i10 = kzVar.Z0;
        ArrayList arrayList = kzVar.n1;
        if (syVar == null) {
            return;
        }
        if (syVar.getSpan() == null) {
            kzVar.C2 = SystemClock.elapsedRealtime();
            kzVar.O(true);
            String str3 = str != null ? str : (String) syVar.getTag();
            new SpannableStringBuilder().append((CharSequence) str3);
            if (str != null) {
                ky kyVar2 = kzVar.q1;
                if (kyVar2 != null) {
                    kyVar2.l(Emoji.fixEmoji(str));
                    return;
                }
                return;
            }
            if (!syVar.c && (str2 = Emoji.emojiColor.get(str3)) != null) {
                str3 = g(str3, str2);
            }
            kzVar.h(str3);
            ky kyVar3 = kzVar.q1;
            if (kyVar3 != null) {
                kyVar3.l(Emoji.fixEmoji(str3));
                return;
            }
            return;
        }
        if (kzVar.q1 != null) {
            long j10 = syVar.getSpan().documentId;
            TLRPC.Document document = syVar.getSpan().document;
            vx vxVar = syVar.e;
            boolean z4 = vxVar != null && vxVar.i;
            if (document == null) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    vx vxVar2 = (vx) arrayList.get(i11);
                    int i12 = 0;
                    while (true) {
                        ArrayList arrayList2 = vxVar2.c;
                        if (arrayList2 != null && i12 < arrayList2.size()) {
                            if (((TLRPC.Document) vxVar2.c.get(i12)).id == j10) {
                                document = (TLRPC.Document) vxVar2.c.get(i12);
                                break;
                            }
                            i12++;
                        }
                    }
                }
            }
            if (document == null) {
                document = l5.f(i10, j10);
            }
            String findAnimatedEmojiEmoticon = document != null ? MessageObject.findAnimatedEmojiEmoticon(document) : null;
            if (MessageObject.isFreeEmoji(document) || UserConfig.getInstance(i10).isPremium() || (((kyVar = kzVar.q1) != null && kyVar.g()) || kzVar.R0 || z4)) {
                kzVar.C2 = SystemClock.elapsedRealtime();
                kzVar.O(true);
                kzVar.h("animated_" + j10);
                kzVar.q1.x(j10, document, findAnimatedEmojiEmoticon, syVar.c);
                return;
            }
            kzVar.O(false);
            qc a02 = p2Var != null ? qc.a0(p2Var) : new qc(kzVar.r, kzVar.W1);
            if (kzVar.e2 || p2Var == null) {
                a02.q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new yv(kzVar, 7)).j();
            } else {
                a02.J(R.raw.saved_messages, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint2)), LocaleController.getString(R.string.Open), new yv(kzVar, 8)).j();
            }
            kzVar.e2 = !kzVar.e2;
        }
    }

    public static void e(kz kzVar, int i10, int i11) {
        f2.l1 K;
        int[] iArr = kzVar.N0;
        if (i10 == 1) {
            kzVar.n(kzVar.M, i11);
            return;
        }
        ky kyVar = kzVar.q1;
        if ((kyVar == null || !kyVar.z()) && !kzVar.G0) {
            sl0 x10 = kzVar.x(i10);
            if (i11 <= 0 || x10 == null || x10.getVisibility() != 0 || (K = x10.K(0)) == null || K.a.getTop() + kzVar.Y0 < x10.getPaddingTop()) {
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

    public static void f(kz kzVar, boolean z4) {
        int N0;
        py pyVar = kzVar.f0;
        mw mwVar = kzVar.l0;
        jw jwVar = kzVar.e0;
        if (jwVar != null && (jwVar.getAdapter() instanceof oy)) {
            oy oyVar = (oy) jwVar.getAdapter();
            if (!oyVar.s && oyVar.h == 0 && !oyVar.x.isEmpty() && (N0 = pyVar.N0()) != -1 && N0 > pyVar.B() - 5) {
                String str = oyVar.w;
                String str2 = oyVar.r;
                boolean z10 = oyVar.v;
                oyVar.F(str, str2, true, z10, z10);
            }
        }
        ky kyVar = kzVar.q1;
        if (kyVar == null || !kyVar.z()) {
            if (mwVar == null || jwVar == null) {
                return;
            }
            mwVar.a.a(true, !z4);
            return;
        }
        f2.l1 K = jwVar.K(0);
        if (K == null) {
            wy.a(mwVar, true, !z4);
        } else {
            wy.a(mwVar, K.a.getTop() < jwVar.getPaddingTop(), !z4);
        }
    }

    public static String g(String str, String str2) {
        boolean z4;
        String str3;
        if (CompoundEmoji.isHandshake(str) != null) {
            return CompoundEmoji.applyColor(str, str2);
        }
        if (Emoji.endsWithRightArrow(str)) {
            str = e2.c.j(str, 2, 0);
            z4 = true;
        } else {
            z4 = false;
        }
        int length = str.length();
        if (length > 2 && str.charAt(str.length() - 2) == 8205) {
            str3 = str.substring(str.length() - 2);
            str = e2.c.j(str, 2, 0);
        } else if (length <= 3 || str.charAt(str.length() - 3) != 8205) {
            str3 = null;
        } else {
            str3 = str.substring(str.length() - 3);
            str = e2.c.j(str, 3, 0);
        }
        String k10 = vh.v2.k(str, str2);
        if (str3 != null) {
            k10 = vh.v2.k(k10, str3);
        }
        return z4 ? vh.v2.k(k10, "\u200d➡") : k10;
    }

    public static void j(int i10, View view) {
        if (view == null) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i10);
    }

    public final int A(int i10) {
        org.telegram.ui.ActionBar.f6 f6Var = this.W1;
        return f6Var != null ? f6Var.x0(i10) : org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    public final void B() {
        sw swVar = this.D0;
        if (swVar != null) {
            swVar.b();
        }
        mw mwVar = this.l0;
        if (mwVar != null) {
            mwVar.b();
        }
        gw gwVar = this.S;
        if (gwVar != null) {
            gwVar.b();
        }
    }

    public final void C() {
        ng.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.g2) == null) {
            return;
        }
        fd0 fd0Var = this.w;
        RectF rectF = this.w2;
        ug.i.c(fd0Var, this, rectF);
        rectF.inset(LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f), LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        rectF.right = getMeasuredWidth();
        rectF.bottom = Math.min(rectF.bottom, getMeasuredHeight());
        eVar.g(1, this.x2);
        eVar.e(this.h2, getWidth(), getHeight());
    }

    public final void D() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        int i10 = this.Z0;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.groupPackUpdated);
        if (this.v0 != null) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.featuredStickersDidLoad);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.groupStickersDidLoad);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        }
    }

    public final void E(boolean z4, boolean z10) {
        vy vyVar;
        if (this.x1 != 0 && this.t1) {
            this.x1 = 0;
        }
        if (this.x1 == 0 && this.s1) {
            this.x1 = 1;
        }
        int i10 = this.x1;
        vw vwVar = this.h;
        if (i10 == 0 || z4 || this.e.size() == 1) {
            N(true, false);
            S(false, false);
            if (vwVar.getCurrentItem() != 0) {
                vwVar.x(0, !z4);
            }
            if (z10) {
                AndroidUtilities.runOnUIThread(new yv(this, 9), 350L);
            }
        } else {
            int i11 = this.x1;
            if (i11 == 1) {
                N(false, false);
                S(this.r0 || this.s0, false);
                if (vwVar.getCurrentItem() != 2) {
                    vwVar.x(2, false);
                }
                tw twVar = this.y0;
                if (twVar != null) {
                    this.P0 = true;
                    int i12 = this.D1;
                    if (i12 >= 0) {
                        twVar.m(i12);
                    } else {
                        int i13 = this.C1;
                        if (i13 >= 0) {
                            twVar.m(i13);
                        } else {
                            twVar.m(this.B1);
                        }
                    }
                    this.P0 = false;
                    this.B0.h1(0, 0);
                }
            } else if (i11 == 2) {
                N(false, false);
                S(false, false);
                if (vwVar.getCurrentItem() != 1) {
                    vwVar.x(1, false);
                }
                px pxVar = this.m0;
                if (pxVar != null) {
                    pxVar.m(0);
                }
                mw mwVar = this.l0;
                if (mwVar != null && (vyVar = mwVar.r) != null) {
                    vyVar.F1(null);
                }
            }
        }
        O(true);
    }

    public final void F() {
        bz bzVar = this.v0;
        if (bzVar != null) {
            bzVar.l();
        }
        fz fzVar = this.w0;
        if (fzVar != null) {
            fzVar.l();
        }
        if (org.telegram.ui.pt.q().E) {
            org.telegram.ui.pt.q().n();
        }
        org.telegram.ui.pt.q().u();
    }

    public final void G(int i10) {
        ky kyVar = this.q1;
        if ((kyVar == null || !kyVar.z()) && i10 != 0) {
            HorizontalScrollView y10 = y(i10);
            this.N0[i10] = 0;
            y10.setTranslationY(0);
        }
    }

    public final void H(int i10, int i11) {
        jx jxVar = this.N;
        View m9 = jxVar.m(i10);
        int L0 = jxVar.L0();
        if ((m9 == null && Math.abs(i10 - L0) > jxVar.J * 9.0f) || !SharedConfig.animationsEnabled()) {
            int i12 = jxVar.L0() < i10 ? 0 : 1;
            c2.y yVar = this.V;
            yVar.b = i12;
            yVar.c(i10, i11, false, false);
            return;
        }
        this.G0 = true;
        dx dxVar = new dx(this, this.M.getContext(), 0);
        dxVar.a = i10;
        dxVar.p = i11;
        jxVar.w0(dxVar);
    }

    public final void I(int i10, int i11) {
        qw qwVar = this.B0;
        View m9 = qwVar.m(i10);
        int L0 = qwVar.L0();
        if (m9 != null || Math.abs(i10 - L0) <= 40) {
            this.G0 = true;
            this.A0.x0(i10);
        } else {
            int i12 = qwVar.L0() < i10 ? 0 : 1;
            c2.y yVar = this.U;
            yVar.b = i12;
            yVar.c(i10, i11, false, false);
        }
    }

    public final void J(boolean z4, boolean z10, boolean z11, boolean z12) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i10 >= arrayList2.size()) {
                break;
            }
            if (((gz) arrayList2.get(i10)).a == 0 && z4) {
                arrayList.add((gz) arrayList2.get(i10));
            }
            if (((gz) arrayList2.get(i10)).a == 1 && z11) {
                arrayList.add((gz) arrayList2.get(i10));
            }
            if (((gz) arrayList2.get(i10)).a == 2 && z10) {
                arrayList.add((gz) arrayList2.get(i10));
            }
            i10++;
        }
        fd0 fd0Var = this.w;
        if (fd0Var != null) {
            AndroidUtilities.updateViewVisibilityAnimated(fd0Var, arrayList.size() > 1, 1.0f, z12);
        }
        vw vwVar = this.h;
        if (vwVar != null) {
            vwVar.setAdapter(null);
            vwVar.setAdapter(this.I0);
            if (fd0Var != null) {
                fd0Var.setViewPager(vwVar);
            }
        }
    }

    public final void K(final ah.c cVar, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z4, boolean z10) {
        fz fzVar;
        jy jyVar;
        if (stickerSet == null) {
            return;
        }
        if (!z4 || (jyVar = this.P) == null || jyVar.d == stickerSet.id) {
            if (z4 || (fzVar = this.w0) == null || fzVar.d == stickerSet.id) {
                final boolean isStickerPackInstalled = MediaDataController.getInstance(this.Z0).isStickerPackInstalled(stickerSet.id);
                cVar.g(isStickerPackInstalled ? stickerSet.masks ? LocaleController.formatPluralString("RemoveManyMasksCount", stickerSet.count, new Object[0]) : stickerSet.emojis ? LocaleController.formatPluralString("RemoveManyEmojiCount", stickerSet.count, new Object[0]) : LocaleController.formatPluralString("RemoveManyStickersCount", stickerSet.count, new Object[0]) : stickerSet.masks ? LocaleController.formatPluralString("AddManyMasksCount", stickerSet.count, new Object[0]) : stickerSet.emojis ? LocaleController.formatPluralString("AddManyEmojiCount", stickerSet.count, new Object[0]) : LocaleController.formatPluralString("AddManyStickersCount", stickerSet.count, new Object[0]), z10, true);
                cVar.e0.a(!isStickerPackInstalled, z10);
                cVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ew
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        kz kzVar = kz.this;
                        MediaDataController mediaDataController = MediaDataController.getInstance(kzVar.Z0);
                        Context context = kzVar.getContext();
                        int i10 = isStickerPackInstalled ? 0 : 2;
                        org.telegram.ui.ActionBar.p2 p2Var = kzVar.V1;
                        FrameLayout frameLayout = kzVar.s;
                        ah.c cVar2 = cVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z11 = z4;
                        mediaDataController.toggleStickerSet(context, tLObject2, document2, i10, p2Var, frameLayout, false, true, new j3.n1(kzVar, cVar2, tLObject2, stickerSet2, document2, z11, 10), false);
                        kzVar.K(cVar2, tLObject2, stickerSet2, document2, z11, true);
                    }
                });
            }
        }
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        if (i10 == 0) {
            q(false);
            float f12 = 1.0f - this.a.e;
            sw swVar = this.D0;
            swVar.setAlpha(f12);
            swVar.setVisibility(f12 > 0.0f ? 0 : 4);
            float f13 = 1.0f - f12;
            ah.f fVar = this.E0;
            fVar.setAlpha(f13);
            fVar.setTranslationY((-AndroidUtilities.dp(15.0f)) * f12);
            fVar.setVisibility(f13 > 0.0f ? 0 : 4);
            ah.d dVar = this.J;
            dVar.setAlpha(f13);
            dVar.setTranslationY(AndroidUtilities.dp(30.0f) * f12);
            dVar.setVisibility(f13 > 0.0f ? 0 : 4);
            T();
            this.u0.invalidate();
            return;
        }
        if (i10 == 1) {
            l(false);
            float f14 = 1.0f - this.b.e;
            gw gwVar = this.S;
            gwVar.setAlpha(f14);
            gwVar.setVisibility(f14 > 0.0f ? 0 : 4);
            float f15 = 1.0f - f14;
            ah.f fVar2 = this.R;
            fVar2.setAlpha(f15);
            fVar2.setTranslationY((-AndroidUtilities.dp(15.0f)) * f14);
            fVar2.setVisibility(f15 > 0.0f ? 0 : 4);
            ah.d dVar2 = this.H;
            dVar2.setAlpha(f15);
            dVar2.setTranslationY(AndroidUtilities.dp(30.0f) * f14);
            dVar2.setVisibility(f15 > 0.0f ? 0 : 4);
            T();
            this.G.invalidate();
        }
    }

    public final void M(long j10, boolean z4, boolean z10) {
        fd0 fd0Var = this.w;
        if (fd0Var == null) {
            return;
        }
        this.s1 = z4;
        this.t1 = z10;
        if (z10 || z4) {
            this.r1 = j10;
        } else {
            this.r1 = 0L;
        }
        int i10 = z10 ? 2 : 0;
        LinearLayout linearLayout = fd0Var.d;
        View childAt = i10 >= linearLayout.getChildCount() ? null : linearLayout.getChildAt(i10);
        if (childAt != null) {
            childAt.setAlpha(this.r1 != 0 ? 0.15f : 1.0f);
            vw vwVar = this.h;
            if (z10) {
                if (this.r1 == 0 || vwVar.getCurrentItem() == 0) {
                    return;
                }
                N(true, true);
                S(false, true);
                vwVar.x(0, false);
                return;
            }
            if (this.r1 == 0 || vwVar.getCurrentItem() == 1) {
                return;
            }
            N(false, true);
            S(false, true);
            vwVar.x(1, false);
        }
    }

    public final void N(boolean z4, boolean z10) {
        ww wwVar = this.x;
        if (z4 && wwVar.getTag() == null) {
            return;
        }
        if ((z4 || wwVar.getTag() == null) && !this.l2) {
            AnimatorSet animatorSet = this.C;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.C = null;
            }
            wwVar.setTag(z4 ? null : 1);
            if (!z10) {
                wwVar.setAlpha(z4 ? 1.0f : 0.0f);
                wwVar.setScaleX(z4 ? 1.0f : 0.0f);
                wwVar.setScaleY(z4 ? 1.0f : 0.0f);
                wwVar.setVisibility(z4 ? 0 : 4);
                return;
            }
            if (z4) {
                wwVar.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.C = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(wwVar, (Property<ww, Float>) View.ALPHA, z4 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(wwVar, (Property<ww, Float>) View.SCALE_X, z4 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(wwVar, (Property<ww, Float>) View.SCALE_Y, z4 ? 1.0f : 0.0f));
            this.C.setDuration(200L);
            this.C.setInterpolator(nr.g);
            this.C.addListener(new ex(this, z4, r2));
            this.C.start();
        }
    }

    public final void O(boolean z4) {
        this.E = 0.0f;
        ky kyVar = this.q1;
        if (kyVar != null && kyVar.z()) {
            z4 = false;
        }
        FrameLayout frameLayout = this.n;
        if (z4 && frameLayout.getTag() == null) {
            return;
        }
        if (z4 || frameLayout.getTag() == null) {
            frameLayout.setTag(z4 ? null : 1);
            this.D2.a(z4, true);
        }
    }

    public final void P(boolean z4, boolean z10) {
        View view = this.L;
        if (z4 && view.getTag() == null) {
            return;
        }
        if (z4 || view.getTag() == null) {
            AnimatorSet animatorSet = this.T;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.T = null;
            }
            view.setTag(z4 ? null : 1);
            if (!z10) {
                view.setAlpha(z4 ? 1.0f : 0.0f);
                return;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.T = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z4 ? 1.0f : 0.0f));
            this.T.setDuration(200L);
            this.T.setInterpolator(nr.g);
            this.T.addListener(new a9(this, 18));
            this.T.start();
        }
    }

    public final void Q(boolean z4) {
        for (int i10 = 0; i10 < 3; i10++) {
            f2.w w10 = w(i10);
            int L0 = w10.L0();
            if (z4) {
                if (L0 == 1 || L0 == 2) {
                    w10.n0(0);
                    G(i10);
                }
            } else if (L0 == 0) {
                w10.h1(0, 0);
            }
        }
    }

    public final void R(boolean z4, boolean z10, boolean z11) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.Chat chat = MessagesController.getInstance(this.Z0).getChat(Long.valueOf(this.r1));
        if (chat == null) {
            return;
        }
        gg.q qVar = this.K0;
        if (z4) {
            if (ChatObject.hasAdminRights(chat) || (tL_chatBannedRights = chat.default_banned_rights) == null || !(tL_chatBannedRights.send_stickers || (z10 && tL_chatBannedRights.send_plain))) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.banned_rights;
                if (tL_chatBannedRights2 == null) {
                    return;
                }
                if (!AndroidUtilities.isBannedForever(tL_chatBannedRights2)) {
                    if (z10) {
                        qVar.setText(LocaleController.formatString("AttachPlainRestricted", R.string.AttachPlainRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    }
                    if (z11) {
                        qVar.setText(LocaleController.formatString("AttachGifRestricted", R.string.AttachGifRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    } else {
                        qVar.setText(LocaleController.formatString("AttachStickersRestricted", R.string.AttachStickersRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    }
                } else if (z10) {
                    qVar.setText(LocaleController.getString(R.string.AttachPlainRestrictedForever));
                } else if (z11) {
                    qVar.setText(LocaleController.getString(R.string.AttachGifRestrictedForever));
                } else {
                    qVar.setText(LocaleController.getString(R.string.AttachStickersRestrictedForever));
                }
            } else {
                org.telegram.ui.ActionBar.p2 p2Var = this.V1;
                if ((p2Var instanceof org.telegram.ui.xn) && ((org.telegram.ui.xn) p2Var).K6()) {
                    return;
                }
                if (z10) {
                    qVar.setText(LocaleController.getString(R.string.GlobalAttachEmojiRestricted));
                } else if (z11) {
                    qVar.setText(LocaleController.getString(R.string.GlobalAttachGifRestricted));
                } else {
                    qVar.setText(LocaleController.getString(R.string.GlobalAttachStickersRestricted));
                }
            }
            qVar.setVisibility(0);
        }
        AnimatorSet animatorSet = this.G2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.G2 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.G2 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(qVar, (Property<gg.q, Float>) View.ALPHA, z4 ? qVar.getAlpha() : 1.0f, z4 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(qVar, (Property<gg.q, Float>) View.TRANSLATION_Y, z4 ? AndroidUtilities.dp(12.0f) : qVar.getTranslationY(), z4 ? 0.0f : AndroidUtilities.dp(12.0f)));
        org.telegram.messenger.video.l lVar = this.H2;
        if (lVar != null) {
            AndroidUtilities.cancelRunOnUIThread(lVar);
        }
        if (z4) {
            org.telegram.messenger.video.l lVar2 = new org.telegram.messenger.video.l(this, z10, z11, 3);
            this.H2 = lVar2;
            AndroidUtilities.runOnUIThread(lVar2, 3500L);
        }
        this.G2.setDuration(320L);
        this.G2.setInterpolator(nr.h);
        this.G2.start();
    }

    public final void S(boolean z4, boolean z10) {
        ImageView imageView = this.y;
        if (imageView == null || this.m2) {
            return;
        }
        if (z4 && imageView.getTag() == null) {
            return;
        }
        if (z4 || imageView.getTag() == null) {
            AnimatorSet animatorSet = this.D;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.D = null;
            }
            int i10 = 1;
            imageView.setTag(z4 ? null : 1);
            if (!z10) {
                imageView.setAlpha(z4 ? 1.0f : 0.0f);
                imageView.setScaleX(z4 ? 1.0f : 0.0f);
                imageView.setScaleY(z4 ? 1.0f : 0.0f);
                imageView.setVisibility(z4 ? 0 : 4);
                return;
            }
            if (z4) {
                imageView.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.D = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.ALPHA, z4 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_X, z4 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_Y, z4 ? 1.0f : 0.0f));
            this.D.setDuration(200L);
            this.D.setInterpolator(nr.g);
            this.D.addListener(new ex(this, z4, i10));
            this.D.start();
        }
    }

    public final void T() {
        org.telegram.ui.ActionBar.p2 p2Var;
        if (((View) getParent()) != null) {
            float y10 = (getY() + (getLayoutParams().height > 0 ? getLayoutParams().height : getMeasuredHeight())) - (((AndroidUtilities.isInMultiwindow || ((p2Var = this.V1) != null && p2Var.isInBubbleMode())) && !this.S0) ? AndroidUtilities.dp(1.0f) : r0.getHeight());
            float f10 = this.o2;
            FrameLayout frameLayout = this.n;
            if (f10 >= 0.0f) {
                y10 += getMeasuredHeight() - this.o2;
            } else if (frameLayout.getTop() - y10 < 0.0f || !this.u2) {
                y10 = 0.0f;
            }
            float f11 = -y10;
            boolean z4 = this.a0;
            float lerp = f11 + AndroidUtilities.lerp(AndroidUtilities.dp(z4 ? 45.0f : 50.0f), -this.n2, this.D2.e);
            frameLayout.setTranslationY(lerp);
            if (z4) {
                this.r.setTranslationY(lerp);
            }
        }
    }

    public final void U() {
        wy wyVar;
        boolean z4;
        tv tvVar;
        boolean z10 = this.r0;
        View view = this.v;
        if (!z10) {
            setBackground(null);
            view.setBackground(null);
        } else if (AndroidUtilities.isInMultiwindow || this.K1) {
            Drawable background = getBackground();
            if (background != null) {
                background.setColorFilter(new PorterDuffColorFilter(A(org.telegram.ui.ActionBar.j6.He), PorterDuff.Mode.MULTIPLY));
            }
        } else {
            int i10 = org.telegram.ui.ActionBar.j6.He;
            setBackgroundColor(A(i10));
            if (this.a0) {
                view.setBackgroundColor(A(i10));
            }
        }
        fw fwVar = this.F;
        if (fwVar != null) {
            if (this.r0) {
                fwVar.setBackgroundColor(A(org.telegram.ui.ActionBar.j6.He));
                this.L.setBackgroundColor(A(org.telegram.ui.ActionBar.j6.Ke));
            } else {
                fwVar.setBackground(null);
            }
        }
        ru ruVar = this.y1;
        if (ruVar != null) {
            ruVar.c.a();
        }
        int i11 = 0;
        while (true) {
            wyVar = this.S;
            z4 = this.f2;
            if (i11 >= 3) {
                break;
            }
            if (i11 == 0) {
                wyVar = this.D0;
            } else if (i11 != 1) {
                wyVar = this.l0;
            }
            if (wyVar != null) {
                gq gqVar = wyVar.d;
                FrameLayout frameLayout = wyVar.n;
                View view2 = wyVar.f;
                if (this.r0) {
                    view2.setBackgroundColor(A(org.telegram.ui.ActionBar.j6.He));
                } else {
                    view2.setBackground(null);
                }
                wyVar.e.setBackgroundColor(A(org.telegram.ui.ActionBar.j6.Ke));
                wyVar.c.a(z4 ? v(0.4f) : A(org.telegram.ui.ActionBar.j6.Je));
                org.telegram.ui.ActionBar.j6.w1(z4 ? v(0.06f) : A(org.telegram.ui.ActionBar.j6.Ie), frameLayout.getBackground());
                frameLayout.invalidate();
                gqVar.setHintTextColor(z4 ? v(0.45f) : A(org.telegram.ui.ActionBar.j6.Je));
                gqVar.setTextColor(z4 ? v(0.8f) : A(org.telegram.ui.ActionBar.j6.G6));
            }
            i11++;
        }
        Paint paint = this.p1;
        if (paint != null) {
            paint.setColor(A(org.telegram.ui.ActionBar.j6.af));
        }
        ix ixVar = this.M;
        if (ixVar != null) {
            ixVar.setGlowColor(A(org.telegram.ui.ActionBar.j6.He));
        }
        pw pwVar = this.A0;
        if (pwVar != null) {
            pwVar.setGlowColor(A(org.telegram.ui.ActionBar.j6.He));
        }
        tw twVar = this.y0;
        if (twVar != null) {
            twVar.setIndicatorColor(A(org.telegram.ui.ActionBar.j6.Qe));
            twVar.setUnderlineColor(A(org.telegram.ui.ActionBar.j6.Ke));
            if (this.r0) {
                twVar.setBackgroundColor(A(org.telegram.ui.ActionBar.j6.He));
            } else {
                twVar.setBackground(null);
            }
        }
        px pxVar = this.m0;
        if (pxVar != null) {
            pxVar.setIndicatorColor(A(org.telegram.ui.ActionBar.j6.Qe));
            pxVar.setUnderlineColor(A(org.telegram.ui.ActionBar.j6.Ke));
            if (this.r0) {
                pxVar.setBackgroundColor(A(org.telegram.ui.ActionBar.j6.He));
            } else {
                pxVar.setBackground(null);
            }
        }
        ww wwVar = this.x;
        if (wwVar != null) {
            wwVar.setColorFilter(new PorterDuffColorFilter(z4 ? v(0.6f) : A(org.telegram.ui.ActionBar.j6.Re), PorterDuff.Mode.MULTIPLY));
            if (wyVar == null) {
                Drawable background2 = wwVar.getBackground();
                int i12 = org.telegram.ui.ActionBar.j6.He;
                org.telegram.ui.ActionBar.j6.B1(background2, A(i12), false);
                org.telegram.ui.ActionBar.j6.B1(wwVar.getBackground(), A(i12), true);
            }
        }
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(z4 ? v(0.6f) : A(org.telegram.ui.ActionBar.j6.Re), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.B;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(z4 ? v(0.6f) : A(org.telegram.ui.ActionBar.j6.Re), PorterDuff.Mode.MULTIPLY));
        }
        gg.q qVar = this.K0;
        if (qVar != null) {
            ((ShapeDrawable) qVar.getBackground()).getPaint().setColor(A(org.telegram.ui.ActionBar.j6.qf));
            qVar.setTextColor(A(org.telegram.ui.ActionBar.j6.pf));
        }
        oy oyVar = this.g0;
        if (oyVar != null) {
            qy qyVar = oyVar.e;
            ImageView imageView3 = qyVar.a;
            int i13 = org.telegram.ui.ActionBar.j6.Le;
            imageView3.setColorFilter(new PorterDuffColorFilter(A(i13), PorterDuff.Mode.MULTIPLY));
            qyVar.b.setTextColor(A(i13));
            qyVar.c.setProgressColor(A(org.telegram.ui.ActionBar.j6.h6));
        }
        this.b2 = new PorterDuffColorFilter(A(org.telegram.ui.ActionBar.j6.Oh), PorterDuff.Mode.SRC_IN);
        int i14 = 0;
        while (true) {
            Drawable[] drawableArr = this.U0;
            if (i14 >= drawableArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.j6.y1(drawableArr[i14], z4 ? v(0.4f) : A(org.telegram.ui.ActionBar.j6.Ne), false);
            org.telegram.ui.ActionBar.j6.y1(drawableArr[i14], z4 ? v(0.8f) : A(org.telegram.ui.ActionBar.j6.Oe), true);
            i14++;
        }
        if (fwVar != null && (tvVar = fwVar.y) != null) {
            tvVar.d();
        }
        int i15 = 0;
        while (true) {
            Drawable[] drawableArr2 = this.V0;
            if (i15 >= drawableArr2.length) {
                break;
            }
            org.telegram.ui.ActionBar.j6.y1(drawableArr2[i15], z4 ? v(0.4f) : A(org.telegram.ui.ActionBar.j6.Me), false);
            org.telegram.ui.ActionBar.j6.y1(drawableArr2[i15], z4 ? v(0.8f) : A(org.telegram.ui.ActionBar.j6.Oe), true);
            i15++;
        }
        int i16 = 0;
        while (true) {
            Drawable[] drawableArr3 = this.W0;
            if (i16 >= drawableArr3.length) {
                break;
            }
            org.telegram.ui.ActionBar.j6.y1(drawableArr3[i16], z4 ? v(0.4f) : A(org.telegram.ui.ActionBar.j6.Me), false);
            org.telegram.ui.ActionBar.j6.y1(drawableArr3[i16], z4 ? v(0.8f) : A(org.telegram.ui.ActionBar.j6.Oe), true);
            i16++;
        }
        org.telegram.ui.ActionBar.u5 u5Var = this.X1;
        if (u5Var != null) {
            org.telegram.ui.ActionBar.j6.y1(u5Var, z4 ? v(0.4f) : A(org.telegram.ui.ActionBar.j6.Ne), false);
            org.telegram.ui.ActionBar.j6.y1(u5Var, z4 ? v(0.8f) : A(org.telegram.ui.ActionBar.j6.Oe), true);
        }
        org.telegram.ui.ActionBar.u5 u5Var2 = this.Y1;
        if (u5Var2 != null) {
            org.telegram.ui.ActionBar.j6.y1(u5Var2, z4 ? v(0.4f) : A(org.telegram.ui.ActionBar.j6.Qe), false);
            org.telegram.ui.ActionBar.j6.y1(u5Var2, z4 ? v(0.8f) : A(org.telegram.ui.ActionBar.j6.Qe), true);
        }
    }

    public final void V() {
        ix ixVar = this.M;
        if (ixVar == null) {
            return;
        }
        for (int i10 = 0; i10 < ixVar.getChildCount(); i10++) {
            View childAt = ixVar.getChildAt(i10);
            if (childAt instanceof zx) {
                ((zx) childAt).a(true);
            }
        }
    }

    public final void W(int i10) {
        if (this.c0) {
            return;
        }
        int i11 = -1;
        if (i10 != -1) {
            int size = getRecentEmoji().size() + (this.a0 ? 1 : 0);
            rx rxVar = this.O;
            int i12 = rxVar.c;
            ArrayList arrayList = rxVar.x;
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
                    ArrayList<vx> emojipacks = getEmojipacks();
                    int size2 = arrayList.size() - 1;
                    while (true) {
                        if (size2 < 0) {
                            break;
                        }
                        if (((Integer) arrayList.get(size2)).intValue() <= i10) {
                            vx vxVar = (vx) this.n1.get(size2);
                            while (i13 < emojipacks.size()) {
                                long j10 = emojipacks.get(i13).b.id;
                                long j11 = vxVar.b.id;
                                if (j10 == j11 && (!vxVar.g || (!vxVar.f && !this.m1.contains(Long.valueOf(j11))))) {
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
                this.F.j(i13, true);
            }
        }
    }

    public final void X() {
        int i10;
        vy vyVar;
        int i11;
        boolean z4;
        px pxVar = this.m0;
        int currentPosition = pxVar.getCurrentPosition();
        int i12 = this.o0;
        boolean z10 = currentPosition == i12;
        boolean z11 = i12 >= 0;
        boolean isEmpty = this.f1.isEmpty();
        pxVar.d(false);
        this.o0 = -2;
        this.p0 = -2;
        this.q0 = -2;
        Drawable[] drawableArr = this.W0;
        if (isEmpty) {
            i10 = 0;
        } else {
            this.o0 = 0;
            pxVar.b(0, drawableArr[0]).setContentDescription(LocaleController.getString(R.string.RecentStickers));
            i10 = 1;
        }
        this.p0 = i10;
        pxVar.b(1, drawableArr[1]).setContentDescription(LocaleController.getString(R.string.FeaturedGifs));
        this.q0 = i10 + 1;
        AndroidUtilities.dp(13.0f);
        AndroidUtilities.dp(11.0f);
        int i13 = this.Z0;
        ArrayList<String> arrayList = MessagesController.getInstance(i13).gifSearchEmojies;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            String str = arrayList.get(i14);
            Emoji.EmojiDrawable emojiDrawable = Emoji.getEmojiDrawable(str);
            if (emojiDrawable != null) {
                TLRPC.Document emojiAnimatedSticker = MediaDataController.getInstance(i13).getEmojiAnimatedSticker(str);
                String j10 = kh.a2.j(i14 + 3, "tab");
                int i15 = pxVar.x;
                pxVar.x = i15 + 1;
                fx0 fx0Var = (fx0) pxVar.n.get(j10);
                if (fx0Var != null) {
                    pxVar.g(j10, fx0Var, i15);
                    i11 = currentPosition;
                    z4 = z11;
                } else {
                    i11 = currentPosition;
                    z4 = z11;
                    fx0Var = new fx0(pxVar.getContext(), 2);
                    fx0Var.setFocusable(true);
                    fx0Var.setOnClickListener(new jm0(pxVar, 2));
                    fx0Var.setExpanded(pxVar.c0);
                    fx0Var.a(pxVar.f0);
                    pxVar.e.addView(fx0Var, i15);
                }
                fx0Var.d = false;
                fx0Var.setTag(R.id.index_tag, Integer.valueOf(i15));
                fx0Var.setTag(R.id.parent_tag, emojiDrawable);
                fx0Var.setTag(R.id.object_tag, emojiAnimatedSticker);
                fx0Var.setSelected(i15 == pxVar.y);
                pxVar.h.put(j10, fx0Var);
                fx0Var.setContentDescription(str);
            } else {
                i11 = currentPosition;
                z4 = z11;
            }
            i14++;
            currentPosition = i11;
            z11 = z4;
        }
        int i16 = currentPosition;
        boolean z12 = z11;
        pxVar.h();
        pxVar.q();
        if (z10 && isEmpty) {
            pxVar.m(this.p0);
            mw mwVar = this.l0;
            if (mwVar == null || (vyVar = mwVar.r) == null) {
                return;
            }
            vyVar.F1(null);
            return;
        }
        WeakHashMap weakHashMap = r0.j0.a;
        if (pxVar.isLaidOut()) {
            if (!isEmpty && !z12) {
                pxVar.k(i16 + 1, 0);
            } else if (isEmpty && z12) {
                pxVar.k(i16 - 1, 0);
            }
        }
    }

    public final void Y() {
        oy oyVar;
        int size = this.f1.size();
        long calcDocumentsHash = MediaDataController.calcDocumentsHash(this.f1, ConnectionsManager.DEFAULT_DATACENTER_ID);
        ArrayList<TLRPC.Document> recentGifs = MediaDataController.getInstance(this.Z0).getRecentGifs();
        this.f1 = recentGifs;
        long calcDocumentsHash2 = MediaDataController.calcDocumentsHash(recentGifs, ConnectionsManager.DEFAULT_DATACENTER_ID);
        if ((this.m0 != null && size == 0 && !this.f1.isEmpty()) || (size != 0 && this.f1.isEmpty())) {
            X();
        }
        if ((size == this.f1.size() && calcDocumentsHash == calcDocumentsHash2) || (oyVar = this.k0) == null) {
            return;
        }
        oyVar.l();
    }

    public final void Z(boolean z4) {
        TLRPC.Document document;
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet;
        tw twVar = this.y0;
        if (twVar != null) {
            hb1 hb1Var = twVar.e;
            if (twVar.s != null) {
                return;
            }
            this.C1 = -2;
            this.D1 = -2;
            this.E1 = -2;
            this.F1 = -2;
            this.b0 = false;
            this.B1 = 0;
            int currentPosition = twVar.getCurrentPosition();
            boolean z10 = true;
            twVar.d((getParent() == null || getVisibility() != 0 || (this.v1.size() == 0 && this.w1.size() == 0)) ? false : true);
            int i10 = this.Z0;
            MediaDataController mediaDataController = MediaDataController.getInstance(i10);
            SharedPreferences emojiSettings = MessagesController.getEmojiSettings(i10);
            ArrayList arrayList3 = this.j1;
            arrayList3.clear();
            ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
            int size = featuredStickerSets.size();
            for (int i11 = 0; i11 < size; i11++) {
                TLRPC.StickerSetCovered stickerSetCovered = featuredStickerSets.get(i11);
                if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.id)) {
                    arrayList3.add(stickerSetCovered);
                }
            }
            iz izVar = this.C0;
            if (izVar != null) {
                izVar.l();
            }
            boolean isEmpty = featuredStickerSets.isEmpty();
            long j10 = 0;
            Drawable[] drawableArr = this.V0;
            if (!isEmpty && (arrayList3.isEmpty() || emojiSettings.getLong("featured_hidden", 0L) == featuredStickerSets.get(0).set.id)) {
                int i12 = mediaDataController.getUnreadStickerSets().isEmpty() ? 2 : 3;
                fx0 c3 = twVar.c(i12, drawableArr[i12]);
                c3.h.setText(LocaleController.getString(R.string.FeaturedStickersShort));
                c3.setContentDescription(LocaleController.getString(R.string.FeaturedStickers));
                int i13 = this.B1;
                this.E1 = i13;
                this.B1 = i13 + 1;
            }
            if (!this.h1.isEmpty()) {
                int i14 = this.B1;
                this.D1 = i14;
                this.B1 = i14 + 1;
                fx0 c10 = twVar.c(1, drawableArr[1]);
                c10.h.setText(LocaleController.getString(R.string.FavoriteStickersShort));
                c10.setContentDescription(LocaleController.getString(R.string.FavoriteStickers));
            }
            if (!this.g1.isEmpty()) {
                int i15 = this.B1;
                this.C1 = i15;
                this.B1 = i15 + 1;
                fx0 c11 = twVar.c(0, drawableArr[0]);
                c11.h.setText(LocaleController.getString(R.string.RecentStickersShort));
                c11.setContentDescription(LocaleController.getString(R.string.RecentStickers));
            }
            ArrayList arrayList4 = this.a1;
            arrayList4.clear();
            org.telegram.ui.ActionBar.f6 f6Var = null;
            this.e1 = null;
            this.c1 = -1;
            this.b1 = -10;
            if (this.E2 == null || z4) {
                this.E2 = new ArrayList(mediaDataController.getStickerSets(0));
            }
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList5 = this.E2;
            int i16 = 0;
            while (true) {
                TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.u1;
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
            if (this.G1 != null) {
                long j13 = MessagesController.getEmojiSettings(i10).getLong("group_hide_stickers_" + this.G1.id, -1L);
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(this.G1.id));
                if (chat == null || this.G1.stickerset == null || !ChatObject.hasAdminRights(chat)) {
                    this.d1 = j13 != -1;
                } else {
                    TLRPC.StickerSet stickerSet3 = this.G1.stickerset;
                    if (stickerSet3 != null) {
                        this.d1 = j13 == stickerSet3.id;
                    }
                }
                TLRPC.ChatFull chatFull = this.G1;
                TLRPC.StickerSet stickerSet4 = chatFull.stickerset;
                if (stickerSet4 != null) {
                    TLRPC.TL_messages_stickerSet groupStickerSetById = mediaDataController.getGroupStickerSetById(stickerSet4);
                    if (groupStickerSetById != null && (arrayList = groupStickerSetById.documents) != null && !arrayList.isEmpty() && groupStickerSetById.set != null) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = new TLRPC.TL_messages_stickerSet();
                        tL_messages_stickerSet3.documents = groupStickerSetById.documents;
                        tL_messages_stickerSet3.packs = groupStickerSetById.packs;
                        tL_messages_stickerSet3.set = groupStickerSetById.set;
                        if (this.d1) {
                            this.b1 = arrayList4.size();
                            arrayList4.add(tL_messages_stickerSet3);
                        } else {
                            this.b1 = 0;
                            arrayList4.add(0, tL_messages_stickerSet3);
                        }
                        if (!this.G1.can_set_stickers) {
                            tL_messages_stickerSet3 = null;
                        }
                        this.e1 = tL_messages_stickerSet3;
                    }
                } else if (chatFull.can_set_stickers) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = new TLRPC.TL_messages_stickerSet();
                    if (this.d1) {
                        this.b1 = arrayList4.size();
                        arrayList4.add(tL_messages_stickerSet4);
                    } else {
                        this.b1 = 0;
                        arrayList4.add(0, tL_messages_stickerSet4);
                    }
                }
            }
            int i18 = 0;
            while (i18 < arrayList4.size()) {
                if (i18 == this.b1) {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(this.G1.id));
                    if (chat2 == null) {
                        arrayList4.remove(0);
                        i18--;
                    } else {
                        this.b0 = z10;
                        String str = "chat" + chat2.id;
                        int i19 = twVar.x;
                        twVar.x = i19 + 1;
                        fx0 fx0Var = (fx0) twVar.n.get(str);
                        if (fx0Var != null) {
                            twVar.g(str, fx0Var, i19);
                        } else {
                            fx0Var = new fx0(twVar.getContext(), 0);
                            fx0Var.setFocusable(z10);
                            fx0Var.setOnClickListener(new jm0(twVar, 0));
                            hb1Var.addView(fx0Var, i19);
                            fx0Var.w = z10;
                            z8 z8Var = new z8(f6Var);
                            z8Var.u(AndroidUtilities.dp(14.0f));
                            z8Var.k(UserConfig.selectedAccount, chat2);
                            int i20 = twVar.a;
                            p9 p9Var = fx0Var.e;
                            p9Var.setLayerNum(i20);
                            p9Var.e(chat2, z8Var);
                            p9Var.setAspectFit(z10);
                            fx0Var.setExpanded(twVar.c0);
                            fx0Var.a(twVar.f0);
                            fx0Var.h.setText(chat2.title);
                        }
                        fx0Var.d = z10;
                        fx0Var.setTag(R.id.index_tag, Integer.valueOf(i19));
                        fx0Var.setSelected(i19 == twVar.y);
                        twVar.h.put(str, fx0Var);
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
                    int i22 = twVar.x;
                    twVar.x = i22 + 1;
                    fx0 fx0Var2 = (fx0) twVar.n.get(str2);
                    if (fx0Var2 != null) {
                        twVar.g(str2, fx0Var2, i22);
                    } else {
                        fx0Var2 = new fx0(twVar.getContext(), 0);
                        fx0Var2.setFocusable(z10);
                        fx0Var2.setOnClickListener(new jm0(twVar, 1));
                        fx0Var2.setExpanded(twVar.c0);
                        fx0Var2.a(twVar.f0);
                        hb1Var.addView(fx0Var2, i22);
                    }
                    fx0Var2.e.setLayerNum(twVar.a);
                    fx0Var2.d = false;
                    fx0Var2.setTag(closestPhotoSizeWithSize);
                    fx0Var2.setTag(R.id.index_tag, Integer.valueOf(i22));
                    fx0Var2.setTag(R.id.parent_tag, tL_messages_stickerSet5);
                    fx0Var2.setTag(R.id.object_tag, document);
                    fx0Var2.setSelected(i22 == twVar.y);
                    twVar.h.put(str2, fx0Var2);
                    fx0Var2.setContentDescription(tL_messages_stickerSet5.set.title + ", " + LocaleController.getString(R.string.AccDescrStickerSet));
                }
                i18++;
                z10 = true;
                f6Var = null;
            }
            twVar.h();
            twVar.q();
            if (currentPosition != 0) {
                twVar.k(currentPosition, currentPosition);
            }
            o();
        }
    }

    public final void a0() {
        uw uwVar = this.z0;
        tw twVar = this.y0;
        if (twVar != null && uwVar == null && this.q1 != null) {
            twVar.setTranslationY(this.q1.p() * (-AndroidUtilities.dp(50.0f)));
        }
        if (uwVar == null) {
            return;
        }
        boolean z4 = getVisibility() == 0 && this.H0 && this.q1.p() != 1.0f;
        uwVar.setVisibility(z4 ? 0 : 8);
        if (z4) {
            Rect rect = this.v2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.u0, rect, null);
            float p10 = this.q1.p() * AndroidUtilities.dp(50.0f);
            int i10 = rect.left;
            if (i10 != 0 || p10 != 0.0f) {
                this.U1 = false;
            }
            uwVar.setTranslationX(i10);
            float translationY = (((getTranslationY() + getTop()) - uwVar.getTop()) - twVar.getExpandedOffset()) - p10;
            if (uwVar.getTranslationY() != translationY) {
                uwVar.setTranslationY(translationY);
                uwVar.invalidate();
            }
        }
        if (this.U1 && z4 && this.M0) {
            twVar.i(this.T1, true);
        } else {
            this.U1 = false;
            twVar.i(this.T1, false);
        }
    }

    @Override // ch.a
    public final void b(int i10) {
        setBottomInset(i10);
    }

    public final void b0() {
        boolean z4;
        org.telegram.ui.Cells.r3 r3Var;
        LongSparseArray longSparseArray = this.w1;
        LongSparseArray longSparseArray2 = this.v1;
        int i10 = this.Z0;
        pw pwVar = this.A0;
        if (pwVar == null) {
            return;
        }
        try {
            int childCount = pwVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = pwVar.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.r3) && ((el0) pwVar.T(childAt)) != null) {
                    org.telegram.ui.Cells.r3 r3Var2 = (org.telegram.ui.Cells.r3) childAt;
                    ArrayList<Long> unreadStickerSets = MediaDataController.getInstance(i10).getUnreadStickerSets();
                    TLRPC.StickerSetCovered stickerSet = r3Var2.getStickerSet();
                    boolean z10 = unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSet.set.id));
                    int i12 = 0;
                    while (true) {
                        TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.u1;
                        if (i12 >= stickerSetCoveredArr.length) {
                            z4 = false;
                            break;
                        }
                        TLRPC.StickerSetCovered stickerSetCovered = stickerSetCoveredArr[i12];
                        if (stickerSetCovered != null) {
                            r3Var = r3Var2;
                            if (stickerSetCovered.set.id == stickerSet.set.id) {
                                r3Var2 = r3Var;
                                z4 = true;
                                break;
                            }
                        } else {
                            r3Var = r3Var2;
                        }
                        i12++;
                        r3Var2 = r3Var;
                    }
                    r3Var2.c(stickerSet, z10, true, 0, 0, z4);
                    if (z10) {
                        MediaDataController.getInstance(i10).markFeaturedStickersByIdAsRead(false, stickerSet.set.id);
                    }
                    boolean z11 = longSparseArray2.indexOfKey(stickerSet.set.id) >= 0;
                    boolean z12 = longSparseArray.indexOfKey(stickerSet.set.id) >= 0;
                    if (z11 || z12) {
                        if (z11 && r3Var2.r) {
                            longSparseArray2.remove(stickerSet.set.id);
                            z11 = false;
                        } else if (z12 && !r3Var2.r) {
                            longSparseArray.remove(stickerSet.set.id);
                        }
                    }
                    r3Var2.b(!z4 && z11, true);
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // ch.a
    public final void c(float f10) {
        this.o2 = f10;
        T();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Utilities.Callback callback;
        TLRPC.StickerSet stickerSet;
        int i12 = NotificationCenter.stickersDidLoad;
        rx rxVar = this.O;
        yv yvVar = this.I2;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.v0 != null) {
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
                    rxVar.F(false);
                    return;
                } else {
                    AndroidUtilities.cancelRunOnUIThread(yvVar);
                    AndroidUtilities.runOnUIThread(yvVar, 100L);
                    return;
                }
            }
            return;
        }
        if (i10 == NotificationCenter.groupPackUpdated) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            TLRPC.ChatFull chatFull = this.G1;
            if (chatFull != null && chatFull.id == longValue && booleanValue) {
                rxVar.F(true);
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
            fd0 fd0Var = this.w;
            if (fd0Var != null) {
                int childCount = fd0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    fd0Var.getChildAt(i13).invalidate();
                }
            }
            Z(false);
            return;
        }
        if (i10 == NotificationCenter.featuredEmojiDidLoad) {
            if (rxVar != null) {
                rxVar.F(false);
                return;
            }
            return;
        }
        int i14 = NotificationCenter.groupStickersDidLoad;
        jy jyVar = this.P;
        if (i10 == i14) {
            Long l10 = (Long) objArr[0];
            long longValue2 = l10.longValue();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = objArr.length > 1 ? (TLRPC.TL_messages_stickerSet) objArr[1] : null;
            if (tL_messages_stickerSet != null) {
                fz fzVar = this.w0;
                if (fzVar != null && fzVar.d == longValue2 && fzVar.f.size() < tL_messages_stickerSet.documents.size()) {
                    fzVar.f = tL_messages_stickerSet.documents;
                    fzVar.l();
                }
                if (jyVar != null && jyVar.d == longValue2 && jyVar.f.size() < tL_messages_stickerSet.documents.size()) {
                    jyVar.f = tL_messages_stickerSet.documents;
                    jyVar.l();
                }
            }
            TLRPC.ChatFull chatFull2 = this.G1;
            if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null && stickerSet.id == longValue2) {
                Z(false);
            }
            HashMap hashMap = this.o1;
            if (hashMap.containsKey(l10) && objArr.length >= 2 && ((Utilities.Callback) hashMap.get(l10)) != null && tL_messages_stickerSet != null && (callback = (Utilities.Callback) hashMap.remove(l10)) != null) {
                callback.run(tL_messages_stickerSet);
            }
            AndroidUtilities.cancelRunOnUIThread(yvVar);
            AndroidUtilities.runOnUIThread(yvVar, 100L);
            return;
        }
        int i15 = NotificationCenter.emojiLoaded;
        ix ixVar = this.M;
        if (i10 != i15) {
            if (i10 != NotificationCenter.newEmojiSuggestionsAvailable) {
                if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                    if (rxVar != null) {
                        rxVar.F(false);
                    }
                    V();
                    Z(false);
                    return;
                }
                return;
            }
            if (ixVar == null || !this.a0) {
                return;
            }
            if ((this.S.c.k == 2 || ixVar.getAdapter() == jyVar) && !TextUtils.isEmpty(jyVar.v)) {
                jyVar.F(jyVar.v, true);
                return;
            }
            return;
        }
        pw pwVar = this.A0;
        if (pwVar != null) {
            int childCount2 = pwVar.getChildCount();
            for (int i16 = 0; i16 < childCount2; i16++) {
                View childAt = pwVar.getChildAt(i16);
                if ((childAt instanceof org.telegram.ui.Cells.m8) || (childAt instanceof org.telegram.ui.Cells.d8)) {
                    childAt.invalidate();
                }
            }
        }
        if (ixVar != null) {
            ixVar.invalidate();
            int childCount3 = ixVar.getChildCount();
            for (int i17 = 0; i17 < childCount3; i17++) {
                View childAt2 = ixVar.getChildAt(i17);
                if (childAt2 instanceof sy) {
                    childAt2.invalidate();
                }
            }
        }
        ru ruVar = this.y1;
        if (ruVar != null) {
            ruVar.c.invalidate();
        }
        px pxVar = this.m0;
        if (pxVar != null) {
            hb1 hb1Var = pxVar.e;
            int childCount4 = hb1Var.getChildCount();
            for (int i18 = 0; i18 < childCount4; i18++) {
                hb1Var.getChildAt(i18).invalidate();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        sg.d dVar;
        ng.e eVar;
        if (Build.VERSION.SDK_INT >= 31 && (dVar = this.i2) != null && (eVar = this.g2) != null) {
            C();
            RecordingCanvas a2 = dVar.a(getMeasuredWidth(), getMeasuredHeight());
            a2.drawColor(A(org.telegram.ui.ActionBar.j6.d6));
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
        if (this.n.getVisibility() != 8 && !this.r0 && this.t0) {
            canvas.drawColor(i0.a.k(-1, 25));
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.n2);
        if (navigationBarThirdButtonsFactor > 0.0f) {
            int l1 = org.telegram.ui.ActionBar.j6.l1(navigationBarThirdButtonsFactor, A(org.telegram.ui.ActionBar.j6.He));
            int i10 = this.z2;
            GradientDrawable gradientDrawable = this.y2;
            if (i10 != l1) {
                gradientDrawable.setColors(new int[]{l1, org.telegram.ui.ActionBar.j6.l1(0.66f, l1), i0.a.k(l1, 0)});
                this.z2 = l1;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.n2, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
        canvas.restore();
        return drawChild;
    }

    public int getCurrentPage() {
        return this.x1;
    }

    public ArrayList<vx> getEmojipacks() {
        ArrayList<vx> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.n1;
            if (i10 >= arrayList2.size()) {
                return arrayList;
            }
            vx vxVar = (vx) arrayList2.get(i10);
            boolean z4 = vxVar.g;
            ArrayList arrayList3 = this.m1;
            if ((!z4 && (vxVar.f || arrayList3.contains(Long.valueOf(vxVar.b.id)))) || (vxVar.g && !vxVar.f && !arrayList3.contains(Long.valueOf(vxVar.b.id)))) {
                arrayList.add(vxVar);
            }
            i10++;
        }
    }

    public ArrayList<String> getRecentEmoji() {
        if (this.Z1) {
            return Emoji.recentEmoji;
        }
        if (this.A2 == null) {
            this.A2 = new ArrayList();
        }
        if (Emoji.recentEmoji.size() != this.B2) {
            this.A2.clear();
            int i10 = 0;
            while (true) {
                ArrayList<String> arrayList = Emoji.recentEmoji;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (!arrayList.get(i10).startsWith("animated_")) {
                    this.A2.add(arrayList.get(i10));
                }
                i10++;
            }
            this.B2 = this.A2.size();
        }
        return this.A2;
    }

    public float getStickersExpandOffset() {
        tw twVar = this.y0;
        if (twVar == null) {
            return 0.0f;
        }
        return twVar.getExpandedOffset();
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
            this.O.F(false);
        }
        Emoji.saveRecentEmoji();
        if (this.Z1) {
            return;
        }
        ArrayList arrayList = this.A2;
        if (arrayList == null) {
            this.A2 = new ArrayList();
        } else {
            arrayList.clear();
        }
        while (true) {
            ArrayList<String> arrayList2 = Emoji.recentEmoji;
            if (i10 >= arrayList2.size()) {
                this.B2 = this.A2.size();
                return;
            } else {
                if (!arrayList2.get(i10).startsWith("animated_")) {
                    this.A2.add(arrayList2.get(i10));
                }
                i10++;
            }
        }
    }

    public final void i(int i10, int i11, boolean z4) {
        if (i10 == 2 || x(i10).K(0) == null) {
            return;
        }
        fx fxVar = new fx(getContext(), i11);
        fxVar.a = !z4 ? 1 : 0;
        w(i10).w0(fxVar);
    }

    public final void k(boolean z4) {
        if (z4) {
            Y();
            return;
        }
        int size = this.g1.size();
        int size2 = this.h1.size();
        int i10 = this.Z0;
        this.g1 = MediaDataController.getInstance(i10).getRecentStickers(0, true);
        this.h1 = MediaDataController.getInstance(i10).getRecentStickers(2);
        if (UserConfig.getInstance(i10).isPremium()) {
            this.i1 = MediaDataController.getInstance(i10).getRecentStickers(7);
        } else {
            this.i1 = new ArrayList();
        }
        for (int i11 = 0; i11 < this.h1.size(); i11++) {
            TLRPC.Document document = (TLRPC.Document) this.h1.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < this.g1.size()) {
                    TLRPC.Document document2 = (TLRPC.Document) this.g1.get(i12);
                    if (document2.dc_id == document.dc_id && document2.id == document.id) {
                        this.g1.remove(i12);
                        break;
                    }
                    i12++;
                }
            }
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            int i13 = 0;
            while (i13 < this.h1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.h1.get(i13))) {
                    this.h1.remove(i13);
                    i13--;
                }
                i13++;
            }
            int i14 = 0;
            while (i14 < this.g1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.g1.get(i14))) {
                    this.g1.remove(i14);
                    i14--;
                }
                i14++;
            }
        }
        if (size != this.g1.size() || size2 != this.h1.size()) {
            Z(false);
        }
        bz bzVar = this.v0;
        if (bzVar != null) {
            bzVar.l();
        }
        o();
    }

    public final void l(boolean z4) {
        ky kyVar = this.q1;
        xd.a aVar = this.b;
        ix ixVar = this.M;
        gw gwVar = this.S;
        if (kyVar != null && kyVar.z()) {
            f2.l1 K = ixVar.K(0);
            if (K == null) {
                wy.a(gwVar, true, !z4);
            } else {
                wy.a(gwVar, K.a.getTop() < ixVar.getPaddingTop(), !z4);
            }
            P(false, !z4);
            gwVar.setTranslationY(aVar.e * AndroidUtilities.dp(15.0f));
            return;
        }
        if (gwVar == null || ixVar == null) {
            return;
        }
        gwVar.setTranslationY((aVar.e * AndroidUtilities.dp(15.0f)) + (ixVar.K(0) != null ? r0.a.getTop() : -this.Y0));
        gwVar.a.a(false, !z4);
        m(Math.round(this.F.getTranslationY()));
    }

    public final void m(int i10) {
        ObjectAnimator objectAnimator = this.O0[1];
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            boolean z4 = false;
            f2.l1 K = this.M.K(0);
            int dp = AndroidUtilities.dp(38.0f) + i10;
            if (dp > 0 && (K == null || K.a.getBottom() < dp)) {
                z4 = true;
            }
            P(z4, !this.H1);
        }
    }

    public final void n(ix ixVar, int i10) {
        ix ixVar2;
        f2.l1 K;
        fw fwVar = this.F;
        int[] iArr = this.N0;
        if (ixVar == null) {
            iArr[1] = 0;
            fwVar.setTranslationY(0);
            return;
        }
        if (ixVar.getVisibility() != 0 || this.c0) {
            return;
        }
        ky kyVar = this.q1;
        if (kyVar == null || !kyVar.z()) {
            if (i10 > 0 && (ixVar2 = this.M) != null && ixVar2.getVisibility() == 0 && (K = ixVar2.K(0)) != null) {
                if (K.a.getTop() + (this.a0 ? this.Y0 : 0) >= ixVar2.getPaddingTop()) {
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
            fwVar.setTranslationY(Math.max(-AndroidUtilities.dp(36.0f), iArr[1]));
        }
    }

    public final void o() {
        int L0;
        tw twVar = this.y0;
        if (twVar == null || (L0 = this.B0.L0()) == -1) {
            return;
        }
        int i10 = this.D1;
        if (i10 <= 0 && (i10 = this.C1) <= 0) {
            i10 = this.B1;
        }
        twVar.k(this.v0.F(L0), i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        int i10 = this.Z0;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupPackUpdated);
        if (this.v0 != null) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.stickersDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.featuredStickersDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupStickersDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
            AndroidUtilities.runOnUIThread(new yv(this, 0));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ru ruVar = this.y1;
        if (ruVar != null && ruVar.isShowing()) {
            ruVar.dismiss();
        }
        org.telegram.ui.pt q10 = org.telegram.ui.pt.q();
        if (q10.l == this.d2) {
            q10.W = null;
            q10.a0 = null;
            q10.Y = null;
            q10.l = null;
            q10.c0 = null;
            q10.u();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        if (this.L1 != i14) {
            this.L1 = i14;
            F();
        }
        super.onLayout(z4, i10, i11, i12, i13);
        T();
        a0();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.H1 = true;
        boolean z4 = AndroidUtilities.isInMultiwindow;
        View view = this.v;
        boolean z10 = this.a0;
        if (z4 || this.K1) {
            if (this.I1 != 1) {
                if (!this.F2) {
                    setOutlineProvider(this.J1);
                    setClipToOutline(true);
                    setElevation(AndroidUtilities.dp(2.0f));
                }
                setBackgroundResource(R.drawable.smiles_popup);
                Drawable background = getBackground();
                int i12 = org.telegram.ui.ActionBar.j6.He;
                background.setColorFilter(new PorterDuffColorFilter(A(i12), PorterDuff.Mode.MULTIPLY));
                if (z10 && this.r0) {
                    view.setBackgroundColor(A(i12));
                }
                this.I1 = 1;
            }
        } else if (this.I1 != 0) {
            if (!this.F2) {
                setOutlineProvider(null);
                setClipToOutline(false);
                setElevation(0.0f);
            }
            if (this.r0) {
                int i13 = org.telegram.ui.ActionBar.j6.He;
                setBackgroundColor(A(i13));
                if (z10) {
                    view.setBackgroundColor(A(i13));
                }
            }
            this.I1 = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
        this.H1 = false;
        setTranslationY(getTranslationY());
    }

    public final void p(int i10) {
        int L0;
        int L02;
        if (i10 == 0) {
            if (this.G0 || (L02 = this.B0.L0()) == -1 || this.A0 == null) {
                return;
            }
            int i11 = this.D1;
            if (i11 <= 0 && (i11 = this.C1) <= 0) {
                i11 = this.B1;
            }
            this.y0.k(this.v0.F(L02), i11);
            return;
        }
        if (i10 == 2) {
            f2.o0 adapter = this.e0.getAdapter();
            oy oyVar = this.k0;
            if (adapter != oyVar || oyVar.F < 0 || this.p0 < 0 || this.o0 < 0 || (L0 = this.f0.L0()) == -1) {
                return;
            }
            this.m0.k(L0 >= oyVar.F ? this.p0 : this.o0, 0);
        }
    }

    public final void q(boolean z4) {
        ky kyVar = this.q1;
        xd.a aVar = this.a;
        pw pwVar = this.A0;
        sw swVar = this.D0;
        if (kyVar != null && kyVar.z()) {
            f2.l1 K = pwVar.K(0);
            if (K == null) {
                wy.a(swVar, true, !z4);
            } else {
                wy.a(swVar, K.a.getTop() < pwVar.getPaddingTop(), !z4);
            }
            swVar.setTranslationY(aVar.e * AndroidUtilities.dp(15.0f));
            return;
        }
        if (swVar == null || pwVar == null) {
            return;
        }
        swVar.setTranslationY((aVar.e * AndroidUtilities.dp(15.0f)) + (pwVar.K(0) != null ? r0.a.getTop() : -this.Y0));
        swVar.a.a(false, !z4);
    }

    public final void r() {
        Emoji.clearRecentEmoji();
        this.O.F(false);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.H1) {
            return;
        }
        super.requestLayout();
    }

    public final void s(long j10, boolean z4) {
        wy wyVar;
        f2.i0 i0Var;
        View view;
        sl0 sl0Var;
        int i10;
        TLRPC.TL_messages_stickerSet stickerSetById;
        bz bzVar;
        int E;
        AnimatorSet animatorSet = this.J0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.J0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        if (currentItem == 2 && j10 != -1 && (stickerSetById = MediaDataController.getInstance(this.Z0).getStickerSetById(j10)) != null && (E = (bzVar = this.v0).E(stickerSetById)) >= 0 && E < bzVar.h()) {
            I(E, AndroidUtilities.dp(48.0f));
        }
        oy oyVar = this.g0;
        if (oyVar != null) {
            oyVar.H = false;
        }
        for (int i11 = 0; i11 < 3; i11++) {
            sl0 sl0Var2 = this.A0;
            sl0 sl0Var3 = this.e0;
            mw mwVar = this.l0;
            sl0 sl0Var4 = this.M;
            if (i11 == 0) {
                wyVar = this.S;
                i0Var = this.N;
                view = this.F;
                sl0Var = sl0Var4;
            } else if (i11 == 1) {
                i0Var = this.f0;
                view = this.m0;
                sl0Var = sl0Var3;
                wyVar = mwVar;
            } else {
                wyVar = this.D0;
                i0Var = this.B0;
                view = this.y0;
                sl0Var = sl0Var2;
            }
            if (wyVar != null) {
                vy vyVar = wyVar.r;
                wyVar.d.setText("");
                if (vyVar != null) {
                    vyVar.F1(null);
                    vyVar.D1();
                }
                int i12 = this.Y0;
                if (i11 == currentItem && z4) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.J0 = animatorSet2;
                    Property property = View.TRANSLATION_Y;
                    if (view == null || i11 == 1) {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(sl0Var, (Property<sl0, Float>) property, AndroidUtilities.dp(36.0f) - i12));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofFloat(sl0Var, (Property<sl0, Float>) property, AndroidUtilities.dp(36.0f)), ObjectAnimator.ofFloat(wyVar, (Property<wy, Float>) property, AndroidUtilities.dp(36.0f)));
                    }
                    this.J0.setDuration(200L);
                    this.J0.setInterpolator(nr.h);
                    this.J0.addListener(new nh.g3(this, i0Var, sl0Var, 5));
                    this.J0.start();
                } else {
                    if (wyVar != mwVar) {
                        wyVar.setTranslationY(AndroidUtilities.dp(36.0f) - i12);
                    }
                    if (view != null && i11 != 2) {
                        view.setTranslationY(0.0f);
                    }
                    if (sl0Var == sl0Var2) {
                        i10 = 0;
                        sl0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + this.n2);
                    } else {
                        i10 = 0;
                        if (sl0Var == sl0Var3) {
                            sl0Var.setPadding(0, AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(44.0f) + this.n2);
                        } else {
                            if (sl0Var == sl0Var4) {
                                sl0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + this.n2);
                            }
                            i10 = 0;
                        }
                    }
                    i0Var.h1(i10, i10);
                }
            }
        }
        if (z4) {
            return;
        }
        this.q1.i(0);
    }

    public void setBlurredBackgroundDrawableFactory(ng.a aVar) {
        org.telegram.ui.ActionBar.f6 f6Var = this.W1;
        ww wwVar = this.x;
        if (wwVar != null) {
            pg.b c3 = aVar.c(wwVar, null, false);
            c3.n(rg.b.d(f6Var));
            c3.p(AndroidUtilities.dp(18.0f));
            c3.o(AndroidUtilities.dp(6.0f));
            wwVar.setBackground(c3);
        }
        ImageView imageView = this.B;
        if (imageView != null) {
            pg.b c10 = aVar.c(imageView, null, false);
            c10.n(rg.b.d(f6Var));
            c10.p(AndroidUtilities.dp(18.0f));
            c10.o(AndroidUtilities.dp(6.0f));
            imageView.setBackground(c10);
        }
        fd0 fd0Var = this.w;
        if (fd0Var != null) {
            pg.b c11 = aVar.c(fd0Var, null, false);
            c11.n(rg.b.d(f6Var));
            c11.p(AndroidUtilities.dp(18.0f));
            c11.o(AndroidUtilities.dp(6.0f));
            fd0Var.setBackground(c11);
        }
        ImageView imageView2 = this.y;
        if (imageView2 != null) {
            pg.b c12 = aVar.c(imageView2, null, false);
            c12.n(rg.b.d(f6Var));
            c12.p(AndroidUtilities.dp(18.0f));
            c12.o(AndroidUtilities.dp(6.0f));
            imageView2.setBackground(c12);
        }
    }

    public void setBottomInset(int i10) {
        if (this.n2 != i10) {
            this.n2 = i10;
            j(i10, this.H);
            j(i10, this.J);
            j(AndroidUtilities.dp(44.0f) + i10, this.M);
            j(AndroidUtilities.dp(44.0f) + i10, this.A0);
            j(AndroidUtilities.dp(44.0f) + i10, this.e0);
            FrameLayout frameLayout = this.s;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-i10);
            }
            T();
            invalidate();
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.G1 = chatFull;
        Z(false);
    }

    public void setDelegate(ky kyVar) {
        this.q1 = kyVar;
    }

    public void setDragListener(ox oxVar) {
        this.L0 = oxVar;
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        sw swVar = this.D0;
        if (swVar != null) {
            swVar.d.setEnabled(z4);
        }
        mw mwVar = this.l0;
        if (mwVar != null) {
            mwVar.d.setEnabled(z4);
        }
        gw gwVar = this.S;
        if (gwVar != null) {
            gwVar.d.setEnabled(z4);
        }
    }

    public void setForseMultiwindowLayout(boolean z4) {
        this.K1 = z4;
    }

    public void setShouldDrawBackground(boolean z4) {
        if (this.r0 != z4) {
            this.r0 = z4;
            U();
        }
    }

    public void setShowing(boolean z4) {
        this.M0 = z4;
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
        boolean z4 = getVisibility() != i10;
        super.setVisibility(i10);
        if (z4) {
            if (i10 != 8) {
                Emoji.sortEmoji();
                this.O.F(false);
                int i11 = this.Z0;
                NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.stickersDidLoad);
                if (this.v0 != null) {
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
            zw zwVar = this.Q0;
            if (zwVar != null) {
                zwVar.a();
            }
        }
    }

    public final void t(boolean z4) {
        s(-1L, z4);
    }

    public final void u(boolean z4) {
        bz bzVar;
        boolean z10 = this.K2;
        this.K2 = z4;
        if (!z10 || z4) {
            return;
        }
        int i10 = this.x1;
        if (i10 == 0) {
            rx rxVar = this.O;
            if (rxVar != null) {
                rxVar.F(false);
                return;
            }
            return;
        }
        if (i10 == 1) {
            oy oyVar = this.k0;
            if (oyVar != null) {
                oyVar.l();
                return;
            }
            return;
        }
        if (i10 != 2 || (bzVar = this.v0) == null) {
            return;
        }
        bzVar.l();
    }

    public final int v(float f10) {
        return i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Wk, this.W1), (int) (f10 * 255.0f));
    }

    public final f2.w w(int i10) {
        if (i10 == 0) {
            return this.B0;
        }
        if (i10 == 1) {
            return this.N;
        }
        if (i10 == 2) {
            return this.f0;
        }
        throw new IllegalArgumentException(kh.a2.j(i10, "Unexpected argument: "));
    }

    public final sl0 x(int i10) {
        if (i10 == 0) {
            return this.A0;
        }
        if (i10 == 1) {
            return this.M;
        }
        if (i10 == 2) {
            return this.e0;
        }
        throw new IllegalArgumentException(kh.a2.j(i10, "Unexpected argument: "));
    }

    public final HorizontalScrollView y(int i10) {
        if (i10 == 0) {
            return this.y0;
        }
        if (i10 == 1) {
            return this.F;
        }
        if (i10 == 2) {
            return this.m0;
        }
        throw new IllegalArgumentException(kh.a2.j(i10, "Unexpected argument: "));
    }

    @Override // xd.b
    public final void z(float f10, int i10) {
    }
}
