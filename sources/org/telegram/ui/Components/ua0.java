package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.style.URLSpan;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ua0 extends FrameLayout {
    public final org.telegram.ui.ActionBar.b1 D;
    public final za0 E;
    public final FrameLayout F;
    public final za0 G;
    public final za0 H;
    public final int I;
    public final li.k J;
    public boolean K;
    public int L;
    public int M;
    public boolean N;
    public boolean O;
    public AnimatorSet P;
    public final Rect Q;
    public int R;
    public float S;
    public int T;
    public boolean U;
    public boolean V;
    public int W;
    public final int a;
    public int a0;
    public final org.telegram.ui.w8 b;
    public boolean b0;
    public final ia0 c;
    public final /* synthetic */ ab0 c0;
    public final org.telegram.ui.Cells.v9 d;
    public final oa0 e;
    public final ag.b1 f;
    public final qa0 h;
    public final org.telegram.ui.x7 n;
    public org.telegram.messenger.lj r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout s;
    public final na0 w;
    public final na0 x;
    public final org.telegram.ui.ActionBar.b1 y;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x06da  */
    /* JADX WARN: Type inference failed for: r11v5, types: [android.view.View, org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [android.graphics.drawable.Drawable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v7, types: [android.graphics.drawable.Drawable, java.lang.String, org.telegram.ui.ActionBar.w6] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r2v55, types: [android.view.View, org.telegram.ui.ActionBar.b1] */
    /* JADX WARN: Type inference failed for: r2v56, types: [android.view.View, org.telegram.ui.ActionBar.b1] */
    /* JADX WARN: Type inference failed for: r2v61, types: [android.view.View, org.telegram.ui.ActionBar.b1] */
    /* JADX WARN: Type inference failed for: r2v62, types: [android.view.View, org.telegram.ui.ActionBar.b1] */
    /* JADX WARN: Type inference failed for: r2v69, types: [android.view.View, org.telegram.ui.ActionBar.b1, org.telegram.ui.Components.na0] */
    /* JADX WARN: Type inference failed for: r2v70, types: [android.view.View, org.telegram.ui.ActionBar.b1, org.telegram.ui.Components.na0] */
    /* JADX WARN: Type inference failed for: r35v0, types: [android.view.KeyEvent$Callback, android.view.View, android.view.ViewGroup, android.widget.FrameLayout, java.lang.Object, org.telegram.ui.Components.ua0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.View, android.view.ViewGroup, org.telegram.ui.Components.uu0, org.telegram.ui.w8] */
    /* JADX WARN: Type inference failed for: r3v6, types: [tg.b] */
    /* JADX WARN: Type inference failed for: r9v10, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r9v6, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r9v9, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ua0(ab0 ab0Var, Context context, int i10) {
        super(r4);
        org.telegram.messenger.nj njVar;
        Context context2;
        ua0 ua0Var;
        boolean z10;
        za0 za0Var;
        za0 za0Var2;
        ViewOutlineProvider viewOutlineProvider;
        ua0 ua0Var2;
        int i11;
        org.telegram.ui.Cells.v9 n10;
        boolean z11;
        ?? r13;
        org.telegram.messenger.nj njVar2;
        boolean z12;
        LinearLayout linearLayout;
        Object obj;
        Context context3 = context;
        this.c0 = ab0Var;
        int i12 = 1;
        this.K = true;
        this.L = -1;
        this.M = -1;
        this.N = false;
        this.Q = new Rect();
        this.U = false;
        this.b0 = true;
        this.J = new li.k(context3);
        this.a = i10;
        int i13 = 5;
        setOnTouchListener(new bk(this, i13));
        ?? w8Var = new org.telegram.ui.w8(this, context3, i12);
        this.b = w8Var;
        wa0 wa0Var = ab0Var.F;
        boolean z13 = ab0Var.b;
        org.telegram.messenger.nj njVar3 = ab0Var.d;
        Drawable m10 = ((org.telegram.ui.sn) wa0Var).m();
        if (((org.telegram.ui.sn) wa0Var).f == null) {
            int i14 = org.telegram.ui.ActionBar.t6.a;
        }
        w8Var.U(m10);
        w8Var.setOccupyStatusBar(false);
        w8Var.setOutlineProvider(new org.telegram.ui.ol(this, 4));
        w8Var.setClipToOutline(true);
        w8Var.setElevation(org.telegram.messenger.i0.L(4.0f));
        ia0 ia0Var = new ia0(context3, wa0Var);
        this.c = ia0Var;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.s8, ia0Var, wa0Var);
        oa0 oa0Var = new oa0(this);
        this.e = oa0Var;
        oa0Var.D = new org.telegram.ui.tk(this, i12);
        ag.b1 b1Var = new ag.b1(this, context3, wa0Var, 16);
        this.f = b1Var;
        qa0 qa0Var = new qa0(this, b1Var, wa0Var);
        this.h = qa0Var;
        b1Var.setItemAnimator(qa0Var);
        b1Var.setOnScrollListener(new ag.u(this, 25));
        b1Var.setOnItemClickListener(new ra0(this));
        org.telegram.ui.x7 x7Var = new org.telegram.ui.x7(this, i13);
        this.n = x7Var;
        b1Var.setAdapter(x7Var);
        b1Var.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f));
        jg.g1 g1Var = new jg.g1(this, i12);
        g1Var.O = new jg.h1(this, i13);
        b1Var.setClipToPadding(false);
        b1Var.setLayoutManager(g1Var);
        b1Var.i(new dh.g(i13));
        w8Var.addView(b1Var);
        addView(w8Var, w7.b6.d(-1, 400.0f, 0, 8.0f, 0.0f, 8.0f, 0.0f));
        w8Var.addView(ia0Var, w7.b6.c(-2.0f, -1));
        ?? actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 1, getContext(), wa0Var);
        this.s = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().setOnForegroundOpenFinished(new la0(this, i12));
        vg.f c10 = ab0Var.G.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c10.o(w7.b9.k(wa0Var));
        c10.p(org.telegram.messenger.i0.L(8.0f));
        c10.M.e = true;
        c10.q(org.telegram.messenger.i0.L(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.b6.c(-2.0f, -2));
        if (i10 == 0) {
            org.telegram.messenger.lj ljVar = njVar3.a;
            boolean z14 = njVar3.s;
            if (ljVar != null) {
                if (!ljVar.j || njVar3.i) {
                    njVar = njVar3;
                    z11 = z14;
                    r13 = 0;
                } else {
                    LinearLayout f7 = org.telegram.messenger.m5.f(context3, 1);
                    if (z13) {
                        njVar2 = njVar3;
                        z12 = true;
                        linearLayout = f7;
                        obj = null;
                    } else {
                        njVar2 = njVar3;
                        ?? r92 = f7;
                        obj = null;
                        org.telegram.ui.ActionBar.b1 b1Var2 = new org.telegram.ui.ActionBar.b1(0, context3, ab0Var.F, true, false);
                        b1Var2.j(org.telegram.messenger.cd.L0(2131753756, null), R.drawable.msg_arrow_back, null);
                        final int i15 = 0;
                        b1Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ja0
                            public final /* synthetic */ ua0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i16;
                                TLRPC.Message message;
                                TLRPC.MessageMedia messageMedia;
                                TLRPC.Message message2;
                                TLRPC.MessageMedia messageMedia2;
                                TLRPC.Message message3;
                                TLRPC.Message message4;
                                switch (i15) {
                                    case 0:
                                        ua0 ua0Var3 = this.b;
                                        ua0Var3.c0.d.d = null;
                                        ua0Var3.e.f(false);
                                        ua0Var3.h(false, false);
                                        ua0Var3.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        ua0 ua0Var4 = this.b;
                                        oa0 oa0Var2 = ua0Var4.e;
                                        ab0 ab0Var2 = ua0Var4.c0;
                                        if (ua0Var4.c(null) != null) {
                                            if (oa0Var2.v - oa0Var2.u <= org.telegram.messenger.vp.r1(ab0Var2.x).p4) {
                                                org.telegram.ui.Cells.r9 r9Var = oa0Var2.W;
                                                org.telegram.messenger.jj c11 = ua0Var4.c(r9Var != null ? ((org.telegram.ui.Cells.q1) r9Var).getMessageObject() : null);
                                                org.telegram.messenger.nj njVar4 = ab0Var2.d;
                                                int i17 = oa0Var2.u;
                                                njVar4.e = i17;
                                                int i18 = oa0Var2.v;
                                                njVar4.f = i18;
                                                njVar4.d = org.telegram.ui.kn.b(i17, i18, c11);
                                                ab0Var2.b();
                                                ab0Var2.a(true);
                                                break;
                                            } else {
                                                ua0Var4.g();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        ua0 ua0Var5 = this.b;
                                        oa0 oa0Var3 = ua0Var5.e;
                                        ab0 ab0Var3 = ua0Var5.c0;
                                        org.telegram.messenger.nj njVar5 = ab0Var3.d;
                                        int i19 = ab0Var3.x;
                                        boolean z15 = ab0Var3.b;
                                        if (njVar5.d != null && !z15) {
                                            njVar5.d = null;
                                            oa0Var3.f(false);
                                            ua0Var5.h(false, true);
                                            ua0Var5.l(true);
                                            break;
                                        } else if (oa0Var3.v - oa0Var3.u <= org.telegram.messenger.vp.r1(i19).p4) {
                                            org.telegram.messenger.jj c12 = ua0Var5.c(null);
                                            if (c12 != null) {
                                                if (!oa0Var3.x()) {
                                                    njVar5.e = 0;
                                                    int min = Math.min(org.telegram.messenger.vp.r1(i19).p4, org.telegram.ui.kn.d(c12));
                                                    njVar5.f = min;
                                                    njVar5.d = org.telegram.ui.kn.b(njVar5.e, min, c12);
                                                    View d = ua0Var5.d();
                                                    if (d instanceof org.telegram.ui.Cells.q1) {
                                                        oa0Var3.a0((org.telegram.ui.Cells.q1) d, njVar5.e, njVar5.f);
                                                    }
                                                    if (!z15) {
                                                        ua0Var5.s.getSwipeBack().e(ua0Var5.I);
                                                    }
                                                    ua0Var5.h(true, true);
                                                    break;
                                                } else {
                                                    njVar5.e = oa0Var3.u;
                                                    njVar5.f = oa0Var3.v;
                                                    org.telegram.ui.Cells.r9 r9Var2 = oa0Var3.W;
                                                    njVar5.d = org.telegram.ui.kn.b(njVar5.e, njVar5.f, ua0Var5.c(r9Var2 != null ? ((org.telegram.ui.Cells.q1) r9Var2).getMessageObject() : null));
                                                    ab0Var3.b();
                                                    ab0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            ua0Var5.g();
                                            break;
                                        }
                                        break;
                                    case 3:
                                        this.b.c0.c(false);
                                        break;
                                    case 4:
                                        this.b.c0.c(false);
                                        break;
                                    case 5:
                                        this.b.c0.a(true);
                                        break;
                                    case 6:
                                        ab0 ab0Var4 = this.b.c0;
                                        if (!ab0Var4.b) {
                                            org.telegram.ui.hl hlVar = (org.telegram.ui.hl) ab0Var4;
                                            hlVar.a(true);
                                            org.telegram.ui.un unVar = hlVar.H;
                                            unVar.D5 = null;
                                            unVar.B5 = null;
                                            unVar.v5.f(null, null, unVar.j6, null);
                                            unVar.s8();
                                            break;
                                        } else {
                                            org.telegram.ui.hl hlVar2 = (org.telegram.ui.hl) ab0Var4;
                                            hlVar2.a(true);
                                            org.telegram.ui.un unVar2 = hlVar2.H;
                                            unVar2.B5 = null;
                                            unVar2.Ub(unVar2.D5);
                                            break;
                                        }
                                    case 7:
                                        this.b.c0.c(true);
                                        break;
                                    case 8:
                                        this.b.c0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.hl hlVar3 = (org.telegram.ui.hl) this.b.c0;
                                        hlVar3.a(true);
                                        org.telegram.ui.un unVar3 = hlVar3.H;
                                        unVar3.v5.d(null, unVar3.j6);
                                        unVar3.s8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.hl hlVar4 = (org.telegram.ui.hl) this.b.c0;
                                        hlVar4.a(true);
                                        org.telegram.ui.un unVar4 = hlVar4.H;
                                        unVar4.W5 = null;
                                        org.telegram.ui.mk mkVar = unVar4.Z;
                                        if (mkVar != null) {
                                            mkVar.X2 = null;
                                            mkVar.Y2 = false;
                                        }
                                        org.telegram.messenger.nj njVar6 = unVar4.v5;
                                        if (njVar6 != null) {
                                            i16 = ((org.telegram.ui.ActionBar.k2) unVar4).currentAccount;
                                            org.telegram.messenger.jj jjVar = unVar4.D5;
                                            njVar6.e(i16, null, null, jjVar == unVar4.l4 ? null : jjVar, unVar4.B5, unVar4.F5);
                                        }
                                        unVar4.s8();
                                        break;
                                    case 12:
                                        ua0 ua0Var6 = this.b;
                                        org.telegram.messenger.nj njVar7 = ua0Var6.c0.d;
                                        if (njVar7.o) {
                                            boolean z16 = !njVar7.q;
                                            njVar7.q = z16;
                                            ua0Var6.G.a(z16, true);
                                            ua0Var6.H.a(njVar7.q, true);
                                            if (ua0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.jj) ua0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z17 = njVar7.q;
                                                messageMedia2.force_small_media = z17;
                                                messageMedia2.force_large_media = !z17;
                                            }
                                            if (ua0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.jj) ua0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                                boolean z18 = njVar7.q;
                                                messageMedia.force_small_media = z18;
                                                messageMedia.force_large_media = !z18;
                                            }
                                            ua0Var6.i();
                                            ua0Var6.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        ua0 ua0Var7 = this.b;
                                        org.telegram.messenger.nj njVar8 = ua0Var7.c0.d;
                                        boolean z19 = njVar8.r;
                                        njVar8.r = !z19;
                                        ua0Var7.E.a(z19, true);
                                        if (ua0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.jj) ua0Var7.r.e.get(0)).k) != null) {
                                            message4.invert_media = njVar8.r;
                                        }
                                        if (ua0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.jj) ua0Var7.r.f.get(0)).k) != null) {
                                            message3.invert_media = njVar8.r;
                                        }
                                        ua0Var7.i();
                                        ua0Var7.U = true;
                                        break;
                                }
                            }
                        });
                        r92.addView(b1Var2, w7.b6.o(-1, 48));
                        org.telegram.ui.ActionBar.h1 h1Var = new org.telegram.ui.ActionBar.h1(context3, wa0Var);
                        org.telegram.ui.ActionBar.a7.j(h1Var, org.telegram.ui.ActionBar.a7.L(0.06f, org.telegram.ui.ActionBar.t6.E8), wa0Var);
                        h1Var.setTag(R.id.fit_width_tag, 1);
                        r92.addView(h1Var, w7.b6.o(-1, 8));
                        org.telegram.ui.ActionBar.b1 b1Var3 = new org.telegram.ui.ActionBar.b1(0, context3, ab0Var.F, false, true);
                        b1Var3.j(org.telegram.messenger.cd.L0(2131746445, null), R.drawable.menu_quote_specific, null);
                        z12 = true;
                        final boolean z15 = true ? 1 : 0;
                        b1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ja0
                            public final /* synthetic */ ua0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i16;
                                TLRPC.Message message;
                                TLRPC.MessageMedia messageMedia;
                                TLRPC.Message message2;
                                TLRPC.MessageMedia messageMedia2;
                                TLRPC.Message message3;
                                TLRPC.Message message4;
                                switch (z15) {
                                    case 0:
                                        ua0 ua0Var3 = this.b;
                                        ua0Var3.c0.d.d = null;
                                        ua0Var3.e.f(false);
                                        ua0Var3.h(false, false);
                                        ua0Var3.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        ua0 ua0Var4 = this.b;
                                        oa0 oa0Var2 = ua0Var4.e;
                                        ab0 ab0Var2 = ua0Var4.c0;
                                        if (ua0Var4.c(null) != null) {
                                            if (oa0Var2.v - oa0Var2.u <= org.telegram.messenger.vp.r1(ab0Var2.x).p4) {
                                                org.telegram.ui.Cells.r9 r9Var = oa0Var2.W;
                                                org.telegram.messenger.jj c11 = ua0Var4.c(r9Var != null ? ((org.telegram.ui.Cells.q1) r9Var).getMessageObject() : null);
                                                org.telegram.messenger.nj njVar4 = ab0Var2.d;
                                                int i17 = oa0Var2.u;
                                                njVar4.e = i17;
                                                int i18 = oa0Var2.v;
                                                njVar4.f = i18;
                                                njVar4.d = org.telegram.ui.kn.b(i17, i18, c11);
                                                ab0Var2.b();
                                                ab0Var2.a(true);
                                                break;
                                            } else {
                                                ua0Var4.g();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        ua0 ua0Var5 = this.b;
                                        oa0 oa0Var3 = ua0Var5.e;
                                        ab0 ab0Var3 = ua0Var5.c0;
                                        org.telegram.messenger.nj njVar5 = ab0Var3.d;
                                        int i19 = ab0Var3.x;
                                        boolean z152 = ab0Var3.b;
                                        if (njVar5.d != null && !z152) {
                                            njVar5.d = null;
                                            oa0Var3.f(false);
                                            ua0Var5.h(false, true);
                                            ua0Var5.l(true);
                                            break;
                                        } else if (oa0Var3.v - oa0Var3.u <= org.telegram.messenger.vp.r1(i19).p4) {
                                            org.telegram.messenger.jj c12 = ua0Var5.c(null);
                                            if (c12 != null) {
                                                if (!oa0Var3.x()) {
                                                    njVar5.e = 0;
                                                    int min = Math.min(org.telegram.messenger.vp.r1(i19).p4, org.telegram.ui.kn.d(c12));
                                                    njVar5.f = min;
                                                    njVar5.d = org.telegram.ui.kn.b(njVar5.e, min, c12);
                                                    View d = ua0Var5.d();
                                                    if (d instanceof org.telegram.ui.Cells.q1) {
                                                        oa0Var3.a0((org.telegram.ui.Cells.q1) d, njVar5.e, njVar5.f);
                                                    }
                                                    if (!z152) {
                                                        ua0Var5.s.getSwipeBack().e(ua0Var5.I);
                                                    }
                                                    ua0Var5.h(true, true);
                                                    break;
                                                } else {
                                                    njVar5.e = oa0Var3.u;
                                                    njVar5.f = oa0Var3.v;
                                                    org.telegram.ui.Cells.r9 r9Var2 = oa0Var3.W;
                                                    njVar5.d = org.telegram.ui.kn.b(njVar5.e, njVar5.f, ua0Var5.c(r9Var2 != null ? ((org.telegram.ui.Cells.q1) r9Var2).getMessageObject() : null));
                                                    ab0Var3.b();
                                                    ab0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            ua0Var5.g();
                                            break;
                                        }
                                        break;
                                    case 3:
                                        this.b.c0.c(false);
                                        break;
                                    case 4:
                                        this.b.c0.c(false);
                                        break;
                                    case 5:
                                        this.b.c0.a(true);
                                        break;
                                    case 6:
                                        ab0 ab0Var4 = this.b.c0;
                                        if (!ab0Var4.b) {
                                            org.telegram.ui.hl hlVar = (org.telegram.ui.hl) ab0Var4;
                                            hlVar.a(true);
                                            org.telegram.ui.un unVar = hlVar.H;
                                            unVar.D5 = null;
                                            unVar.B5 = null;
                                            unVar.v5.f(null, null, unVar.j6, null);
                                            unVar.s8();
                                            break;
                                        } else {
                                            org.telegram.ui.hl hlVar2 = (org.telegram.ui.hl) ab0Var4;
                                            hlVar2.a(true);
                                            org.telegram.ui.un unVar2 = hlVar2.H;
                                            unVar2.B5 = null;
                                            unVar2.Ub(unVar2.D5);
                                            break;
                                        }
                                    case 7:
                                        this.b.c0.c(true);
                                        break;
                                    case 8:
                                        this.b.c0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.hl hlVar3 = (org.telegram.ui.hl) this.b.c0;
                                        hlVar3.a(true);
                                        org.telegram.ui.un unVar3 = hlVar3.H;
                                        unVar3.v5.d(null, unVar3.j6);
                                        unVar3.s8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.hl hlVar4 = (org.telegram.ui.hl) this.b.c0;
                                        hlVar4.a(true);
                                        org.telegram.ui.un unVar4 = hlVar4.H;
                                        unVar4.W5 = null;
                                        org.telegram.ui.mk mkVar = unVar4.Z;
                                        if (mkVar != null) {
                                            mkVar.X2 = null;
                                            mkVar.Y2 = false;
                                        }
                                        org.telegram.messenger.nj njVar6 = unVar4.v5;
                                        if (njVar6 != null) {
                                            i16 = ((org.telegram.ui.ActionBar.k2) unVar4).currentAccount;
                                            org.telegram.messenger.jj jjVar = unVar4.D5;
                                            njVar6.e(i16, null, null, jjVar == unVar4.l4 ? null : jjVar, unVar4.B5, unVar4.F5);
                                        }
                                        unVar4.s8();
                                        break;
                                    case 12:
                                        ua0 ua0Var6 = this.b;
                                        org.telegram.messenger.nj njVar7 = ua0Var6.c0.d;
                                        if (njVar7.o) {
                                            boolean z16 = !njVar7.q;
                                            njVar7.q = z16;
                                            ua0Var6.G.a(z16, true);
                                            ua0Var6.H.a(njVar7.q, true);
                                            if (ua0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.jj) ua0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z17 = njVar7.q;
                                                messageMedia2.force_small_media = z17;
                                                messageMedia2.force_large_media = !z17;
                                            }
                                            if (ua0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.jj) ua0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                                boolean z18 = njVar7.q;
                                                messageMedia.force_small_media = z18;
                                                messageMedia.force_large_media = !z18;
                                            }
                                            ua0Var6.i();
                                            ua0Var6.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        ua0 ua0Var7 = this.b;
                                        org.telegram.messenger.nj njVar8 = ua0Var7.c0.d;
                                        boolean z19 = njVar8.r;
                                        njVar8.r = !z19;
                                        ua0Var7.E.a(z19, true);
                                        if (ua0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.jj) ua0Var7.r.e.get(0)).k) != null) {
                                            message4.invert_media = njVar8.r;
                                        }
                                        if (ua0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.jj) ua0Var7.r.f.get(0)).k) != null) {
                                            message3.invert_media = njVar8.r;
                                        }
                                        ua0Var7.i();
                                        ua0Var7.U = true;
                                        break;
                                }
                            }
                        });
                        r92.addView(b1Var3, w7.b6.o(-1, 48));
                        linearLayout = r92;
                    }
                    this.I = actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().setStickToRight(z12);
                    ?? frameLayout = new FrameLayout(context3);
                    njVar = njVar2;
                    z11 = z14;
                    ?? r132 = obj;
                    ?? na0Var = new na0(1, 0, context, ab0Var.F, true, false);
                    this.w = na0Var;
                    na0Var.j(org.telegram.messenger.cd.L0(z13 ? 2131746445 : 2131745670, r132), R.drawable.menu_select_quote, r132);
                    ?? na0Var2 = new na0(1, 1, context, ab0Var.F, true, false);
                    context3 = context;
                    this.x = na0Var2;
                    na0Var2.j(org.telegram.messenger.cd.L0(2131752072, r132), R.drawable.menu_quote_delete, r132);
                    int i16 = org.telegram.ui.ActionBar.t6.I5;
                    org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i16, wa0Var), 6, 0);
                    org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i16);
                    frameLayout.setBackground(a02);
                    org.telegram.ui.ActionBar.a7.k(frameLayout, a02, r132, N, wa0Var);
                    final int i17 = 2;
                    frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ja0
                        public final /* synthetic */ ua0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i162;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (i17) {
                                case 0:
                                    ua0 ua0Var3 = this.b;
                                    ua0Var3.c0.d.d = null;
                                    ua0Var3.e.f(false);
                                    ua0Var3.h(false, false);
                                    ua0Var3.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    ua0 ua0Var4 = this.b;
                                    oa0 oa0Var2 = ua0Var4.e;
                                    ab0 ab0Var2 = ua0Var4.c0;
                                    if (ua0Var4.c(null) != null) {
                                        if (oa0Var2.v - oa0Var2.u <= org.telegram.messenger.vp.r1(ab0Var2.x).p4) {
                                            org.telegram.ui.Cells.r9 r9Var = oa0Var2.W;
                                            org.telegram.messenger.jj c11 = ua0Var4.c(r9Var != null ? ((org.telegram.ui.Cells.q1) r9Var).getMessageObject() : null);
                                            org.telegram.messenger.nj njVar4 = ab0Var2.d;
                                            int i172 = oa0Var2.u;
                                            njVar4.e = i172;
                                            int i18 = oa0Var2.v;
                                            njVar4.f = i18;
                                            njVar4.d = org.telegram.ui.kn.b(i172, i18, c11);
                                            ab0Var2.b();
                                            ab0Var2.a(true);
                                            break;
                                        } else {
                                            ua0Var4.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    ua0 ua0Var5 = this.b;
                                    oa0 oa0Var3 = ua0Var5.e;
                                    ab0 ab0Var3 = ua0Var5.c0;
                                    org.telegram.messenger.nj njVar5 = ab0Var3.d;
                                    int i19 = ab0Var3.x;
                                    boolean z152 = ab0Var3.b;
                                    if (njVar5.d != null && !z152) {
                                        njVar5.d = null;
                                        oa0Var3.f(false);
                                        ua0Var5.h(false, true);
                                        ua0Var5.l(true);
                                        break;
                                    } else if (oa0Var3.v - oa0Var3.u <= org.telegram.messenger.vp.r1(i19).p4) {
                                        org.telegram.messenger.jj c12 = ua0Var5.c(null);
                                        if (c12 != null) {
                                            if (!oa0Var3.x()) {
                                                njVar5.e = 0;
                                                int min = Math.min(org.telegram.messenger.vp.r1(i19).p4, org.telegram.ui.kn.d(c12));
                                                njVar5.f = min;
                                                njVar5.d = org.telegram.ui.kn.b(njVar5.e, min, c12);
                                                View d = ua0Var5.d();
                                                if (d instanceof org.telegram.ui.Cells.q1) {
                                                    oa0Var3.a0((org.telegram.ui.Cells.q1) d, njVar5.e, njVar5.f);
                                                }
                                                if (!z152) {
                                                    ua0Var5.s.getSwipeBack().e(ua0Var5.I);
                                                }
                                                ua0Var5.h(true, true);
                                                break;
                                            } else {
                                                njVar5.e = oa0Var3.u;
                                                njVar5.f = oa0Var3.v;
                                                org.telegram.ui.Cells.r9 r9Var2 = oa0Var3.W;
                                                njVar5.d = org.telegram.ui.kn.b(njVar5.e, njVar5.f, ua0Var5.c(r9Var2 != null ? ((org.telegram.ui.Cells.q1) r9Var2).getMessageObject() : null));
                                                ab0Var3.b();
                                                ab0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        ua0Var5.g();
                                        break;
                                    }
                                    break;
                                case 3:
                                    this.b.c0.c(false);
                                    break;
                                case 4:
                                    this.b.c0.c(false);
                                    break;
                                case 5:
                                    this.b.c0.a(true);
                                    break;
                                case 6:
                                    ab0 ab0Var4 = this.b.c0;
                                    if (!ab0Var4.b) {
                                        org.telegram.ui.hl hlVar = (org.telegram.ui.hl) ab0Var4;
                                        hlVar.a(true);
                                        org.telegram.ui.un unVar = hlVar.H;
                                        unVar.D5 = null;
                                        unVar.B5 = null;
                                        unVar.v5.f(null, null, unVar.j6, null);
                                        unVar.s8();
                                        break;
                                    } else {
                                        org.telegram.ui.hl hlVar2 = (org.telegram.ui.hl) ab0Var4;
                                        hlVar2.a(true);
                                        org.telegram.ui.un unVar2 = hlVar2.H;
                                        unVar2.B5 = null;
                                        unVar2.Ub(unVar2.D5);
                                        break;
                                    }
                                case 7:
                                    this.b.c0.c(true);
                                    break;
                                case 8:
                                    this.b.c0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.hl hlVar3 = (org.telegram.ui.hl) this.b.c0;
                                    hlVar3.a(true);
                                    org.telegram.ui.un unVar3 = hlVar3.H;
                                    unVar3.v5.d(null, unVar3.j6);
                                    unVar3.s8();
                                    break;
                                case 10:
                                    this.b.c0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.hl hlVar4 = (org.telegram.ui.hl) this.b.c0;
                                    hlVar4.a(true);
                                    org.telegram.ui.un unVar4 = hlVar4.H;
                                    unVar4.W5 = null;
                                    org.telegram.ui.mk mkVar = unVar4.Z;
                                    if (mkVar != null) {
                                        mkVar.X2 = null;
                                        mkVar.Y2 = false;
                                    }
                                    org.telegram.messenger.nj njVar6 = unVar4.v5;
                                    if (njVar6 != null) {
                                        i162 = ((org.telegram.ui.ActionBar.k2) unVar4).currentAccount;
                                        org.telegram.messenger.jj jjVar = unVar4.D5;
                                        njVar6.e(i162, null, null, jjVar == unVar4.l4 ? null : jjVar, unVar4.B5, unVar4.F5);
                                    }
                                    unVar4.s8();
                                    break;
                                case 12:
                                    ua0 ua0Var6 = this.b;
                                    org.telegram.messenger.nj njVar7 = ua0Var6.c0.d;
                                    if (njVar7.o) {
                                        boolean z16 = !njVar7.q;
                                        njVar7.q = z16;
                                        ua0Var6.G.a(z16, true);
                                        ua0Var6.H.a(njVar7.q, true);
                                        if (ua0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.jj) ua0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z17 = njVar7.q;
                                            messageMedia2.force_small_media = z17;
                                            messageMedia2.force_large_media = !z17;
                                        }
                                        if (ua0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.jj) ua0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z18 = njVar7.q;
                                            messageMedia.force_small_media = z18;
                                            messageMedia.force_large_media = !z18;
                                        }
                                        ua0Var6.i();
                                        ua0Var6.U = true;
                                        break;
                                    }
                                    break;
                                default:
                                    ua0 ua0Var7 = this.b;
                                    org.telegram.messenger.nj njVar8 = ua0Var7.c0.d;
                                    boolean z19 = njVar8.r;
                                    njVar8.r = !z19;
                                    ua0Var7.E.a(z19, true);
                                    if (ua0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.jj) ua0Var7.r.e.get(0)).k) != null) {
                                        message4.invert_media = njVar8.r;
                                    }
                                    if (ua0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.jj) ua0Var7.r.f.get(0)).k) != null) {
                                        message3.invert_media = njVar8.r;
                                    }
                                    ua0Var7.i();
                                    ua0Var7.U = true;
                                    break;
                            }
                        }
                    });
                    frameLayout.addView(na0Var, w7.b6.c(48.0f, -1));
                    frameLayout.addView(na0Var2, w7.b6.c(48.0f, -1));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, w7.b6.o(-1, 48));
                    r13 = r132;
                }
                if (!njVar.t && !z11 && !njVar.u) {
                    ?? frameLayout2 = new FrameLayout(context3);
                    ?? b1Var4 = new org.telegram.ui.ActionBar.b1(1, context3, ab0Var.F, false, false);
                    this.y = b1Var4;
                    b1Var4.j(org.telegram.messenger.cd.L0(2131746270, r13), R.drawable.msg_forward_replace, r13);
                    final int i18 = 3;
                    b1Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ja0
                        public final /* synthetic */ ua0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i162;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (i18) {
                                case 0:
                                    ua0 ua0Var3 = this.b;
                                    ua0Var3.c0.d.d = null;
                                    ua0Var3.e.f(false);
                                    ua0Var3.h(false, false);
                                    ua0Var3.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    ua0 ua0Var4 = this.b;
                                    oa0 oa0Var2 = ua0Var4.e;
                                    ab0 ab0Var2 = ua0Var4.c0;
                                    if (ua0Var4.c(null) != null) {
                                        if (oa0Var2.v - oa0Var2.u <= org.telegram.messenger.vp.r1(ab0Var2.x).p4) {
                                            org.telegram.ui.Cells.r9 r9Var = oa0Var2.W;
                                            org.telegram.messenger.jj c11 = ua0Var4.c(r9Var != null ? ((org.telegram.ui.Cells.q1) r9Var).getMessageObject() : null);
                                            org.telegram.messenger.nj njVar4 = ab0Var2.d;
                                            int i172 = oa0Var2.u;
                                            njVar4.e = i172;
                                            int i182 = oa0Var2.v;
                                            njVar4.f = i182;
                                            njVar4.d = org.telegram.ui.kn.b(i172, i182, c11);
                                            ab0Var2.b();
                                            ab0Var2.a(true);
                                            break;
                                        } else {
                                            ua0Var4.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    ua0 ua0Var5 = this.b;
                                    oa0 oa0Var3 = ua0Var5.e;
                                    ab0 ab0Var3 = ua0Var5.c0;
                                    org.telegram.messenger.nj njVar5 = ab0Var3.d;
                                    int i19 = ab0Var3.x;
                                    boolean z152 = ab0Var3.b;
                                    if (njVar5.d != null && !z152) {
                                        njVar5.d = null;
                                        oa0Var3.f(false);
                                        ua0Var5.h(false, true);
                                        ua0Var5.l(true);
                                        break;
                                    } else if (oa0Var3.v - oa0Var3.u <= org.telegram.messenger.vp.r1(i19).p4) {
                                        org.telegram.messenger.jj c12 = ua0Var5.c(null);
                                        if (c12 != null) {
                                            if (!oa0Var3.x()) {
                                                njVar5.e = 0;
                                                int min = Math.min(org.telegram.messenger.vp.r1(i19).p4, org.telegram.ui.kn.d(c12));
                                                njVar5.f = min;
                                                njVar5.d = org.telegram.ui.kn.b(njVar5.e, min, c12);
                                                View d = ua0Var5.d();
                                                if (d instanceof org.telegram.ui.Cells.q1) {
                                                    oa0Var3.a0((org.telegram.ui.Cells.q1) d, njVar5.e, njVar5.f);
                                                }
                                                if (!z152) {
                                                    ua0Var5.s.getSwipeBack().e(ua0Var5.I);
                                                }
                                                ua0Var5.h(true, true);
                                                break;
                                            } else {
                                                njVar5.e = oa0Var3.u;
                                                njVar5.f = oa0Var3.v;
                                                org.telegram.ui.Cells.r9 r9Var2 = oa0Var3.W;
                                                njVar5.d = org.telegram.ui.kn.b(njVar5.e, njVar5.f, ua0Var5.c(r9Var2 != null ? ((org.telegram.ui.Cells.q1) r9Var2).getMessageObject() : null));
                                                ab0Var3.b();
                                                ab0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        ua0Var5.g();
                                        break;
                                    }
                                    break;
                                case 3:
                                    this.b.c0.c(false);
                                    break;
                                case 4:
                                    this.b.c0.c(false);
                                    break;
                                case 5:
                                    this.b.c0.a(true);
                                    break;
                                case 6:
                                    ab0 ab0Var4 = this.b.c0;
                                    if (!ab0Var4.b) {
                                        org.telegram.ui.hl hlVar = (org.telegram.ui.hl) ab0Var4;
                                        hlVar.a(true);
                                        org.telegram.ui.un unVar = hlVar.H;
                                        unVar.D5 = null;
                                        unVar.B5 = null;
                                        unVar.v5.f(null, null, unVar.j6, null);
                                        unVar.s8();
                                        break;
                                    } else {
                                        org.telegram.ui.hl hlVar2 = (org.telegram.ui.hl) ab0Var4;
                                        hlVar2.a(true);
                                        org.telegram.ui.un unVar2 = hlVar2.H;
                                        unVar2.B5 = null;
                                        unVar2.Ub(unVar2.D5);
                                        break;
                                    }
                                case 7:
                                    this.b.c0.c(true);
                                    break;
                                case 8:
                                    this.b.c0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.hl hlVar3 = (org.telegram.ui.hl) this.b.c0;
                                    hlVar3.a(true);
                                    org.telegram.ui.un unVar3 = hlVar3.H;
                                    unVar3.v5.d(null, unVar3.j6);
                                    unVar3.s8();
                                    break;
                                case 10:
                                    this.b.c0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.hl hlVar4 = (org.telegram.ui.hl) this.b.c0;
                                    hlVar4.a(true);
                                    org.telegram.ui.un unVar4 = hlVar4.H;
                                    unVar4.W5 = null;
                                    org.telegram.ui.mk mkVar = unVar4.Z;
                                    if (mkVar != null) {
                                        mkVar.X2 = null;
                                        mkVar.Y2 = false;
                                    }
                                    org.telegram.messenger.nj njVar6 = unVar4.v5;
                                    if (njVar6 != null) {
                                        i162 = ((org.telegram.ui.ActionBar.k2) unVar4).currentAccount;
                                        org.telegram.messenger.jj jjVar = unVar4.D5;
                                        njVar6.e(i162, null, null, jjVar == unVar4.l4 ? null : jjVar, unVar4.B5, unVar4.F5);
                                    }
                                    unVar4.s8();
                                    break;
                                case 12:
                                    ua0 ua0Var6 = this.b;
                                    org.telegram.messenger.nj njVar7 = ua0Var6.c0.d;
                                    if (njVar7.o) {
                                        boolean z16 = !njVar7.q;
                                        njVar7.q = z16;
                                        ua0Var6.G.a(z16, true);
                                        ua0Var6.H.a(njVar7.q, true);
                                        if (ua0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.jj) ua0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z17 = njVar7.q;
                                            messageMedia2.force_small_media = z17;
                                            messageMedia2.force_large_media = !z17;
                                        }
                                        if (ua0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.jj) ua0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z18 = njVar7.q;
                                            messageMedia.force_small_media = z18;
                                            messageMedia.force_large_media = !z18;
                                        }
                                        ua0Var6.i();
                                        ua0Var6.U = true;
                                        break;
                                    }
                                    break;
                                default:
                                    ua0 ua0Var7 = this.b;
                                    org.telegram.messenger.nj njVar8 = ua0Var7.c0.d;
                                    boolean z19 = njVar8.r;
                                    njVar8.r = !z19;
                                    ua0Var7.E.a(z19, true);
                                    if (ua0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.jj) ua0Var7.r.e.get(0)).k) != null) {
                                        message4.invert_media = njVar8.r;
                                    }
                                    if (ua0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.jj) ua0Var7.r.f.get(0)).k) != null) {
                                        message3.invert_media = njVar8.r;
                                    }
                                    ua0Var7.i();
                                    ua0Var7.U = true;
                                    break;
                            }
                        }
                    });
                    context3 = context;
                    ?? b1Var5 = new org.telegram.ui.ActionBar.b1(1, context3, ab0Var.F, false, false);
                    this.D = b1Var5;
                    b1Var5.j(org.telegram.messenger.cd.L0(2131746443, r13), R.drawable.msg_forward_replace, r13);
                    final int i19 = 4;
                    b1Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ja0
                        public final /* synthetic */ ua0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i162;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (i19) {
                                case 0:
                                    ua0 ua0Var3 = this.b;
                                    ua0Var3.c0.d.d = null;
                                    ua0Var3.e.f(false);
                                    ua0Var3.h(false, false);
                                    ua0Var3.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    ua0 ua0Var4 = this.b;
                                    oa0 oa0Var2 = ua0Var4.e;
                                    ab0 ab0Var2 = ua0Var4.c0;
                                    if (ua0Var4.c(null) != null) {
                                        if (oa0Var2.v - oa0Var2.u <= org.telegram.messenger.vp.r1(ab0Var2.x).p4) {
                                            org.telegram.ui.Cells.r9 r9Var = oa0Var2.W;
                                            org.telegram.messenger.jj c11 = ua0Var4.c(r9Var != null ? ((org.telegram.ui.Cells.q1) r9Var).getMessageObject() : null);
                                            org.telegram.messenger.nj njVar4 = ab0Var2.d;
                                            int i172 = oa0Var2.u;
                                            njVar4.e = i172;
                                            int i182 = oa0Var2.v;
                                            njVar4.f = i182;
                                            njVar4.d = org.telegram.ui.kn.b(i172, i182, c11);
                                            ab0Var2.b();
                                            ab0Var2.a(true);
                                            break;
                                        } else {
                                            ua0Var4.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    ua0 ua0Var5 = this.b;
                                    oa0 oa0Var3 = ua0Var5.e;
                                    ab0 ab0Var3 = ua0Var5.c0;
                                    org.telegram.messenger.nj njVar5 = ab0Var3.d;
                                    int i192 = ab0Var3.x;
                                    boolean z152 = ab0Var3.b;
                                    if (njVar5.d != null && !z152) {
                                        njVar5.d = null;
                                        oa0Var3.f(false);
                                        ua0Var5.h(false, true);
                                        ua0Var5.l(true);
                                        break;
                                    } else if (oa0Var3.v - oa0Var3.u <= org.telegram.messenger.vp.r1(i192).p4) {
                                        org.telegram.messenger.jj c12 = ua0Var5.c(null);
                                        if (c12 != null) {
                                            if (!oa0Var3.x()) {
                                                njVar5.e = 0;
                                                int min = Math.min(org.telegram.messenger.vp.r1(i192).p4, org.telegram.ui.kn.d(c12));
                                                njVar5.f = min;
                                                njVar5.d = org.telegram.ui.kn.b(njVar5.e, min, c12);
                                                View d = ua0Var5.d();
                                                if (d instanceof org.telegram.ui.Cells.q1) {
                                                    oa0Var3.a0((org.telegram.ui.Cells.q1) d, njVar5.e, njVar5.f);
                                                }
                                                if (!z152) {
                                                    ua0Var5.s.getSwipeBack().e(ua0Var5.I);
                                                }
                                                ua0Var5.h(true, true);
                                                break;
                                            } else {
                                                njVar5.e = oa0Var3.u;
                                                njVar5.f = oa0Var3.v;
                                                org.telegram.ui.Cells.r9 r9Var2 = oa0Var3.W;
                                                njVar5.d = org.telegram.ui.kn.b(njVar5.e, njVar5.f, ua0Var5.c(r9Var2 != null ? ((org.telegram.ui.Cells.q1) r9Var2).getMessageObject() : null));
                                                ab0Var3.b();
                                                ab0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        ua0Var5.g();
                                        break;
                                    }
                                    break;
                                case 3:
                                    this.b.c0.c(false);
                                    break;
                                case 4:
                                    this.b.c0.c(false);
                                    break;
                                case 5:
                                    this.b.c0.a(true);
                                    break;
                                case 6:
                                    ab0 ab0Var4 = this.b.c0;
                                    if (!ab0Var4.b) {
                                        org.telegram.ui.hl hlVar = (org.telegram.ui.hl) ab0Var4;
                                        hlVar.a(true);
                                        org.telegram.ui.un unVar = hlVar.H;
                                        unVar.D5 = null;
                                        unVar.B5 = null;
                                        unVar.v5.f(null, null, unVar.j6, null);
                                        unVar.s8();
                                        break;
                                    } else {
                                        org.telegram.ui.hl hlVar2 = (org.telegram.ui.hl) ab0Var4;
                                        hlVar2.a(true);
                                        org.telegram.ui.un unVar2 = hlVar2.H;
                                        unVar2.B5 = null;
                                        unVar2.Ub(unVar2.D5);
                                        break;
                                    }
                                case 7:
                                    this.b.c0.c(true);
                                    break;
                                case 8:
                                    this.b.c0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.hl hlVar3 = (org.telegram.ui.hl) this.b.c0;
                                    hlVar3.a(true);
                                    org.telegram.ui.un unVar3 = hlVar3.H;
                                    unVar3.v5.d(null, unVar3.j6);
                                    unVar3.s8();
                                    break;
                                case 10:
                                    this.b.c0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.hl hlVar4 = (org.telegram.ui.hl) this.b.c0;
                                    hlVar4.a(true);
                                    org.telegram.ui.un unVar4 = hlVar4.H;
                                    unVar4.W5 = null;
                                    org.telegram.ui.mk mkVar = unVar4.Z;
                                    if (mkVar != null) {
                                        mkVar.X2 = null;
                                        mkVar.Y2 = false;
                                    }
                                    org.telegram.messenger.nj njVar6 = unVar4.v5;
                                    if (njVar6 != null) {
                                        i162 = ((org.telegram.ui.ActionBar.k2) unVar4).currentAccount;
                                        org.telegram.messenger.jj jjVar = unVar4.D5;
                                        njVar6.e(i162, null, null, jjVar == unVar4.l4 ? null : jjVar, unVar4.B5, unVar4.F5);
                                    }
                                    unVar4.s8();
                                    break;
                                case 12:
                                    ua0 ua0Var6 = this.b;
                                    org.telegram.messenger.nj njVar7 = ua0Var6.c0.d;
                                    if (njVar7.o) {
                                        boolean z16 = !njVar7.q;
                                        njVar7.q = z16;
                                        ua0Var6.G.a(z16, true);
                                        ua0Var6.H.a(njVar7.q, true);
                                        if (ua0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.jj) ua0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z17 = njVar7.q;
                                            messageMedia2.force_small_media = z17;
                                            messageMedia2.force_large_media = !z17;
                                        }
                                        if (ua0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.jj) ua0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z18 = njVar7.q;
                                            messageMedia.force_small_media = z18;
                                            messageMedia.force_large_media = !z18;
                                        }
                                        ua0Var6.i();
                                        ua0Var6.U = true;
                                        break;
                                    }
                                    break;
                                default:
                                    ua0 ua0Var7 = this.b;
                                    org.telegram.messenger.nj njVar8 = ua0Var7.c0.d;
                                    boolean z19 = njVar8.r;
                                    njVar8.r = !z19;
                                    ua0Var7.E.a(z19, true);
                                    if (ua0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.jj) ua0Var7.r.e.get(0)).k) != null) {
                                        message4.invert_media = njVar8.r;
                                    }
                                    if (ua0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.jj) ua0Var7.r.f.get(0)).k) != null) {
                                        message3.invert_media = njVar8.r;
                                    }
                                    ua0Var7.i();
                                    ua0Var7.U = true;
                                    break;
                            }
                        }
                    });
                    frameLayout2.addView(b1Var5, w7.b6.c(48.0f, -1));
                    frameLayout2.addView(b1Var4, w7.b6.c(48.0f, -1));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout2, w7.b6.o(-1, 48));
                }
                if (!z11 && !njVar.u) {
                    org.telegram.ui.ActionBar.h1 h1Var2 = new org.telegram.ui.ActionBar.h1(context3, wa0Var);
                    org.telegram.ui.ActionBar.a7.j(h1Var2, org.telegram.ui.ActionBar.a7.L(0.06f, org.telegram.ui.ActionBar.t6.E8), wa0Var);
                    h1Var2.setTag(R.id.fit_width_tag, 1);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(h1Var2, w7.b6.o(-1, 8));
                }
                h(njVar.d != null, false);
                ?? b1Var6 = new org.telegram.ui.ActionBar.b1(1, context3, ab0Var.F, false, false);
                b1Var6.j(org.telegram.messenger.cd.L0(2131754218, r13), R.drawable.msg_select, r13);
                final int i20 = 5;
                b1Var6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ja0
                    public final /* synthetic */ ua0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i162;
                        TLRPC.Message message;
                        TLRPC.MessageMedia messageMedia;
                        TLRPC.Message message2;
                        TLRPC.MessageMedia messageMedia2;
                        TLRPC.Message message3;
                        TLRPC.Message message4;
                        switch (i20) {
                            case 0:
                                ua0 ua0Var3 = this.b;
                                ua0Var3.c0.d.d = null;
                                ua0Var3.e.f(false);
                                ua0Var3.h(false, false);
                                ua0Var3.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                ua0 ua0Var4 = this.b;
                                oa0 oa0Var2 = ua0Var4.e;
                                ab0 ab0Var2 = ua0Var4.c0;
                                if (ua0Var4.c(null) != null) {
                                    if (oa0Var2.v - oa0Var2.u <= org.telegram.messenger.vp.r1(ab0Var2.x).p4) {
                                        org.telegram.ui.Cells.r9 r9Var = oa0Var2.W;
                                        org.telegram.messenger.jj c11 = ua0Var4.c(r9Var != null ? ((org.telegram.ui.Cells.q1) r9Var).getMessageObject() : null);
                                        org.telegram.messenger.nj njVar4 = ab0Var2.d;
                                        int i172 = oa0Var2.u;
                                        njVar4.e = i172;
                                        int i182 = oa0Var2.v;
                                        njVar4.f = i182;
                                        njVar4.d = org.telegram.ui.kn.b(i172, i182, c11);
                                        ab0Var2.b();
                                        ab0Var2.a(true);
                                        break;
                                    } else {
                                        ua0Var4.g();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                ua0 ua0Var5 = this.b;
                                oa0 oa0Var3 = ua0Var5.e;
                                ab0 ab0Var3 = ua0Var5.c0;
                                org.telegram.messenger.nj njVar5 = ab0Var3.d;
                                int i192 = ab0Var3.x;
                                boolean z152 = ab0Var3.b;
                                if (njVar5.d != null && !z152) {
                                    njVar5.d = null;
                                    oa0Var3.f(false);
                                    ua0Var5.h(false, true);
                                    ua0Var5.l(true);
                                    break;
                                } else if (oa0Var3.v - oa0Var3.u <= org.telegram.messenger.vp.r1(i192).p4) {
                                    org.telegram.messenger.jj c12 = ua0Var5.c(null);
                                    if (c12 != null) {
                                        if (!oa0Var3.x()) {
                                            njVar5.e = 0;
                                            int min = Math.min(org.telegram.messenger.vp.r1(i192).p4, org.telegram.ui.kn.d(c12));
                                            njVar5.f = min;
                                            njVar5.d = org.telegram.ui.kn.b(njVar5.e, min, c12);
                                            View d = ua0Var5.d();
                                            if (d instanceof org.telegram.ui.Cells.q1) {
                                                oa0Var3.a0((org.telegram.ui.Cells.q1) d, njVar5.e, njVar5.f);
                                            }
                                            if (!z152) {
                                                ua0Var5.s.getSwipeBack().e(ua0Var5.I);
                                            }
                                            ua0Var5.h(true, true);
                                            break;
                                        } else {
                                            njVar5.e = oa0Var3.u;
                                            njVar5.f = oa0Var3.v;
                                            org.telegram.ui.Cells.r9 r9Var2 = oa0Var3.W;
                                            njVar5.d = org.telegram.ui.kn.b(njVar5.e, njVar5.f, ua0Var5.c(r9Var2 != null ? ((org.telegram.ui.Cells.q1) r9Var2).getMessageObject() : null));
                                            ab0Var3.b();
                                            ab0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    ua0Var5.g();
                                    break;
                                }
                                break;
                            case 3:
                                this.b.c0.c(false);
                                break;
                            case 4:
                                this.b.c0.c(false);
                                break;
                            case 5:
                                this.b.c0.a(true);
                                break;
                            case 6:
                                ab0 ab0Var4 = this.b.c0;
                                if (!ab0Var4.b) {
                                    org.telegram.ui.hl hlVar = (org.telegram.ui.hl) ab0Var4;
                                    hlVar.a(true);
                                    org.telegram.ui.un unVar = hlVar.H;
                                    unVar.D5 = null;
                                    unVar.B5 = null;
                                    unVar.v5.f(null, null, unVar.j6, null);
                                    unVar.s8();
                                    break;
                                } else {
                                    org.telegram.ui.hl hlVar2 = (org.telegram.ui.hl) ab0Var4;
                                    hlVar2.a(true);
                                    org.telegram.ui.un unVar2 = hlVar2.H;
                                    unVar2.B5 = null;
                                    unVar2.Ub(unVar2.D5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.hl hlVar3 = (org.telegram.ui.hl) this.b.c0;
                                hlVar3.a(true);
                                org.telegram.ui.un unVar3 = hlVar3.H;
                                unVar3.v5.d(null, unVar3.j6);
                                unVar3.s8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.hl hlVar4 = (org.telegram.ui.hl) this.b.c0;
                                hlVar4.a(true);
                                org.telegram.ui.un unVar4 = hlVar4.H;
                                unVar4.W5 = null;
                                org.telegram.ui.mk mkVar = unVar4.Z;
                                if (mkVar != null) {
                                    mkVar.X2 = null;
                                    mkVar.Y2 = false;
                                }
                                org.telegram.messenger.nj njVar6 = unVar4.v5;
                                if (njVar6 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.k2) unVar4).currentAccount;
                                    org.telegram.messenger.jj jjVar = unVar4.D5;
                                    njVar6.e(i162, null, null, jjVar == unVar4.l4 ? null : jjVar, unVar4.B5, unVar4.F5);
                                }
                                unVar4.s8();
                                break;
                            case 12:
                                ua0 ua0Var6 = this.b;
                                org.telegram.messenger.nj njVar7 = ua0Var6.c0.d;
                                if (njVar7.o) {
                                    boolean z16 = !njVar7.q;
                                    njVar7.q = z16;
                                    ua0Var6.G.a(z16, true);
                                    ua0Var6.H.a(njVar7.q, true);
                                    if (ua0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.jj) ua0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z17 = njVar7.q;
                                        messageMedia2.force_small_media = z17;
                                        messageMedia2.force_large_media = !z17;
                                    }
                                    if (ua0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.jj) ua0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                        boolean z18 = njVar7.q;
                                        messageMedia.force_small_media = z18;
                                        messageMedia.force_large_media = !z18;
                                    }
                                    ua0Var6.i();
                                    ua0Var6.U = true;
                                    break;
                                }
                                break;
                            default:
                                ua0 ua0Var7 = this.b;
                                org.telegram.messenger.nj njVar8 = ua0Var7.c0.d;
                                boolean z19 = njVar8.r;
                                njVar8.r = !z19;
                                ua0Var7.E.a(z19, true);
                                if (ua0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.jj) ua0Var7.r.e.get(0)).k) != null) {
                                    message4.invert_media = njVar8.r;
                                }
                                if (ua0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.jj) ua0Var7.r.f.get(0)).k) != null) {
                                    message3.invert_media = njVar8.r;
                                }
                                ua0Var7.i();
                                ua0Var7.U = true;
                                break;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(b1Var6, w7.b6.o(-1, 48));
                ?? b1Var7 = new org.telegram.ui.ActionBar.b1(1, context, ab0Var.F, false, true);
                b1Var7.j(org.telegram.messenger.cd.L0(z13 ? 2131751361 : 2131751360, r13), R.drawable.msg_delete, r13);
                int i21 = org.telegram.ui.ActionBar.t6.q7;
                int i22 = org.telegram.ui.ActionBar.t6.p7;
                b1Var7.c(i21, i22);
                b1Var7.h(0.12f, i22);
                final int i23 = 6;
                b1Var7.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ja0
                    public final /* synthetic */ ua0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i162;
                        TLRPC.Message message;
                        TLRPC.MessageMedia messageMedia;
                        TLRPC.Message message2;
                        TLRPC.MessageMedia messageMedia2;
                        TLRPC.Message message3;
                        TLRPC.Message message4;
                        switch (i23) {
                            case 0:
                                ua0 ua0Var3 = this.b;
                                ua0Var3.c0.d.d = null;
                                ua0Var3.e.f(false);
                                ua0Var3.h(false, false);
                                ua0Var3.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                ua0 ua0Var4 = this.b;
                                oa0 oa0Var2 = ua0Var4.e;
                                ab0 ab0Var2 = ua0Var4.c0;
                                if (ua0Var4.c(null) != null) {
                                    if (oa0Var2.v - oa0Var2.u <= org.telegram.messenger.vp.r1(ab0Var2.x).p4) {
                                        org.telegram.ui.Cells.r9 r9Var = oa0Var2.W;
                                        org.telegram.messenger.jj c11 = ua0Var4.c(r9Var != null ? ((org.telegram.ui.Cells.q1) r9Var).getMessageObject() : null);
                                        org.telegram.messenger.nj njVar4 = ab0Var2.d;
                                        int i172 = oa0Var2.u;
                                        njVar4.e = i172;
                                        int i182 = oa0Var2.v;
                                        njVar4.f = i182;
                                        njVar4.d = org.telegram.ui.kn.b(i172, i182, c11);
                                        ab0Var2.b();
                                        ab0Var2.a(true);
                                        break;
                                    } else {
                                        ua0Var4.g();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                ua0 ua0Var5 = this.b;
                                oa0 oa0Var3 = ua0Var5.e;
                                ab0 ab0Var3 = ua0Var5.c0;
                                org.telegram.messenger.nj njVar5 = ab0Var3.d;
                                int i192 = ab0Var3.x;
                                boolean z152 = ab0Var3.b;
                                if (njVar5.d != null && !z152) {
                                    njVar5.d = null;
                                    oa0Var3.f(false);
                                    ua0Var5.h(false, true);
                                    ua0Var5.l(true);
                                    break;
                                } else if (oa0Var3.v - oa0Var3.u <= org.telegram.messenger.vp.r1(i192).p4) {
                                    org.telegram.messenger.jj c12 = ua0Var5.c(null);
                                    if (c12 != null) {
                                        if (!oa0Var3.x()) {
                                            njVar5.e = 0;
                                            int min = Math.min(org.telegram.messenger.vp.r1(i192).p4, org.telegram.ui.kn.d(c12));
                                            njVar5.f = min;
                                            njVar5.d = org.telegram.ui.kn.b(njVar5.e, min, c12);
                                            View d = ua0Var5.d();
                                            if (d instanceof org.telegram.ui.Cells.q1) {
                                                oa0Var3.a0((org.telegram.ui.Cells.q1) d, njVar5.e, njVar5.f);
                                            }
                                            if (!z152) {
                                                ua0Var5.s.getSwipeBack().e(ua0Var5.I);
                                            }
                                            ua0Var5.h(true, true);
                                            break;
                                        } else {
                                            njVar5.e = oa0Var3.u;
                                            njVar5.f = oa0Var3.v;
                                            org.telegram.ui.Cells.r9 r9Var2 = oa0Var3.W;
                                            njVar5.d = org.telegram.ui.kn.b(njVar5.e, njVar5.f, ua0Var5.c(r9Var2 != null ? ((org.telegram.ui.Cells.q1) r9Var2).getMessageObject() : null));
                                            ab0Var3.b();
                                            ab0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    ua0Var5.g();
                                    break;
                                }
                                break;
                            case 3:
                                this.b.c0.c(false);
                                break;
                            case 4:
                                this.b.c0.c(false);
                                break;
                            case 5:
                                this.b.c0.a(true);
                                break;
                            case 6:
                                ab0 ab0Var4 = this.b.c0;
                                if (!ab0Var4.b) {
                                    org.telegram.ui.hl hlVar = (org.telegram.ui.hl) ab0Var4;
                                    hlVar.a(true);
                                    org.telegram.ui.un unVar = hlVar.H;
                                    unVar.D5 = null;
                                    unVar.B5 = null;
                                    unVar.v5.f(null, null, unVar.j6, null);
                                    unVar.s8();
                                    break;
                                } else {
                                    org.telegram.ui.hl hlVar2 = (org.telegram.ui.hl) ab0Var4;
                                    hlVar2.a(true);
                                    org.telegram.ui.un unVar2 = hlVar2.H;
                                    unVar2.B5 = null;
                                    unVar2.Ub(unVar2.D5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.hl hlVar3 = (org.telegram.ui.hl) this.b.c0;
                                hlVar3.a(true);
                                org.telegram.ui.un unVar3 = hlVar3.H;
                                unVar3.v5.d(null, unVar3.j6);
                                unVar3.s8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.hl hlVar4 = (org.telegram.ui.hl) this.b.c0;
                                hlVar4.a(true);
                                org.telegram.ui.un unVar4 = hlVar4.H;
                                unVar4.W5 = null;
                                org.telegram.ui.mk mkVar = unVar4.Z;
                                if (mkVar != null) {
                                    mkVar.X2 = null;
                                    mkVar.Y2 = false;
                                }
                                org.telegram.messenger.nj njVar6 = unVar4.v5;
                                if (njVar6 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.k2) unVar4).currentAccount;
                                    org.telegram.messenger.jj jjVar = unVar4.D5;
                                    njVar6.e(i162, null, null, jjVar == unVar4.l4 ? null : jjVar, unVar4.B5, unVar4.F5);
                                }
                                unVar4.s8();
                                break;
                            case 12:
                                ua0 ua0Var6 = this.b;
                                org.telegram.messenger.nj njVar7 = ua0Var6.c0.d;
                                if (njVar7.o) {
                                    boolean z16 = !njVar7.q;
                                    njVar7.q = z16;
                                    ua0Var6.G.a(z16, true);
                                    ua0Var6.H.a(njVar7.q, true);
                                    if (ua0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.jj) ua0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z17 = njVar7.q;
                                        messageMedia2.force_small_media = z17;
                                        messageMedia2.force_large_media = !z17;
                                    }
                                    if (ua0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.jj) ua0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                        boolean z18 = njVar7.q;
                                        messageMedia.force_small_media = z18;
                                        messageMedia.force_large_media = !z18;
                                    }
                                    ua0Var6.i();
                                    ua0Var6.U = true;
                                    break;
                                }
                                break;
                            default:
                                ua0 ua0Var7 = this.b;
                                org.telegram.messenger.nj njVar8 = ua0Var7.c0.d;
                                boolean z19 = njVar8.r;
                                njVar8.r = !z19;
                                ua0Var7.E.a(z19, true);
                                if (ua0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.jj) ua0Var7.r.e.get(0)).k) != null) {
                                    message4.invert_media = njVar8.r;
                                }
                                if (ua0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.jj) ua0Var7.r.f.get(0)).k) != null) {
                                    message3.invert_media = njVar8.r;
                                }
                                ua0Var7.i();
                                ua0Var7.U = true;
                                break;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(b1Var7, w7.b6.o(-1, 48));
                context2 = context;
                ua0Var2 = this;
                viewOutlineProvider = r13;
                i11 = ua0Var2.a;
                if (i11 == 1) {
                    ua0Var2.r = njVar.b;
                } else if (i11 == 0) {
                    ua0Var2.r = njVar.a;
                } else if (i11 == 2) {
                    ua0Var2.r = njVar.c;
                }
                n10 = ua0Var2.e.n(context2);
                ua0Var2.d = n10;
                n10.setElevation(org.telegram.messenger.i0.L(8.0f));
                n10.setOutlineProvider(viewOutlineProvider);
                if (n10.getParent() instanceof ViewGroup) {
                    ((ViewGroup) n10.getParent()).removeView(n10);
                }
                ua0Var2.addView(n10, w7.b6.d(-1, -1.0f, 51, 0.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / org.telegram.messenger.i0.p, 0.0f, 0.0f));
                ua0Var2.e.S(ua0Var2.f);
            }
        }
        njVar = njVar3;
        if (i10 != 1 || njVar.b == null) {
            final ua0 ua0Var3 = this;
            ua0Var = ua0Var3;
            if (i10 == 2) {
                ua0Var = ua0Var3;
                if (njVar.c != null) {
                    za0 za0Var3 = new za0(context, R.raw.position_below, org.telegram.messenger.cd.L0(2131748937, null), R.raw.position_above, org.telegram.messenger.cd.L0(2131748933, null), ab0Var.F);
                    ua0Var3.E = za0Var3;
                    za0Var3.a(!njVar.r, false);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(za0Var3, w7.b6.o(-1, 48));
                    FrameLayout frameLayout3 = new FrameLayout(context);
                    ua0Var3.F = frameLayout3;
                    int i24 = org.telegram.ui.ActionBar.t6.I5;
                    org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i24, wa0Var), 0, 0);
                    org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i24);
                    frameLayout3.setBackground(a03);
                    org.telegram.ui.ActionBar.a7.k(frameLayout3, a03, null, N2, wa0Var);
                    za0 za0Var4 = new za0(context, R.raw.media_shrink, org.telegram.messenger.cd.L0(2131748909, null), R.raw.media_enlarge, org.telegram.messenger.cd.L0(2131748908, null), ab0Var.F);
                    ua0Var3.G = za0Var4;
                    za0Var4.setBackground(null);
                    za0Var4.setVisibility(njVar.p ? 4 : 0);
                    frameLayout3.addView(za0Var4, w7.b6.o(-1, 48));
                    za0 za0Var5 = new za0(context, R.raw.media_shrink, org.telegram.messenger.cd.L0(2131748895, null), R.raw.media_enlarge, org.telegram.messenger.cd.L0(2131748894, null), ab0Var.F);
                    ua0Var3.H = za0Var5;
                    za0Var5.setBackground(null);
                    za0Var5.setVisibility(!njVar.p ? 4 : 0);
                    frameLayout3.setAlpha(njVar.o ? 1.0f : 0.5f);
                    frameLayout3.addView(za0Var5, w7.b6.o(-1, 48));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout3, w7.b6.o(-1, 48));
                    frameLayout3.setVisibility((!njVar.n || njVar.o) ? 0 : 8);
                    za0Var4.a(njVar.q, false);
                    za0Var5.a(njVar.q, false);
                    org.telegram.ui.ActionBar.h1 h1Var3 = new org.telegram.ui.ActionBar.h1(context, wa0Var);
                    org.telegram.ui.ActionBar.a7.j(h1Var3, org.telegram.ui.ActionBar.a7.L(0.06f, org.telegram.ui.ActionBar.t6.E8), wa0Var);
                    h1Var3.setTag(R.id.fit_width_tag, 1);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(h1Var3, w7.b6.o(-1, 8));
                    org.telegram.ui.ActionBar.b1 b1Var8 = new org.telegram.ui.ActionBar.b1(1, context, ab0Var.F, false, false);
                    b1Var8.j(org.telegram.messenger.cd.L0(2131754218, null), R.drawable.msg_select, null);
                    final int i25 = 10;
                    b1Var8.setOnClickListener(new View.OnClickListener(ua0Var3) { // from class: org.telegram.ui.Components.ja0
                        public final /* synthetic */ ua0 b;

                        {
                            this.b = ua0Var3;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i162;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (i25) {
                                case 0:
                                    ua0 ua0Var32 = this.b;
                                    ua0Var32.c0.d.d = null;
                                    ua0Var32.e.f(false);
                                    ua0Var32.h(false, false);
                                    ua0Var32.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    ua0 ua0Var4 = this.b;
                                    oa0 oa0Var2 = ua0Var4.e;
                                    ab0 ab0Var2 = ua0Var4.c0;
                                    if (ua0Var4.c(null) != null) {
                                        if (oa0Var2.v - oa0Var2.u <= org.telegram.messenger.vp.r1(ab0Var2.x).p4) {
                                            org.telegram.ui.Cells.r9 r9Var = oa0Var2.W;
                                            org.telegram.messenger.jj c11 = ua0Var4.c(r9Var != null ? ((org.telegram.ui.Cells.q1) r9Var).getMessageObject() : null);
                                            org.telegram.messenger.nj njVar4 = ab0Var2.d;
                                            int i172 = oa0Var2.u;
                                            njVar4.e = i172;
                                            int i182 = oa0Var2.v;
                                            njVar4.f = i182;
                                            njVar4.d = org.telegram.ui.kn.b(i172, i182, c11);
                                            ab0Var2.b();
                                            ab0Var2.a(true);
                                            break;
                                        } else {
                                            ua0Var4.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    ua0 ua0Var5 = this.b;
                                    oa0 oa0Var3 = ua0Var5.e;
                                    ab0 ab0Var3 = ua0Var5.c0;
                                    org.telegram.messenger.nj njVar5 = ab0Var3.d;
                                    int i192 = ab0Var3.x;
                                    boolean z152 = ab0Var3.b;
                                    if (njVar5.d != null && !z152) {
                                        njVar5.d = null;
                                        oa0Var3.f(false);
                                        ua0Var5.h(false, true);
                                        ua0Var5.l(true);
                                        break;
                                    } else if (oa0Var3.v - oa0Var3.u <= org.telegram.messenger.vp.r1(i192).p4) {
                                        org.telegram.messenger.jj c12 = ua0Var5.c(null);
                                        if (c12 != null) {
                                            if (!oa0Var3.x()) {
                                                njVar5.e = 0;
                                                int min = Math.min(org.telegram.messenger.vp.r1(i192).p4, org.telegram.ui.kn.d(c12));
                                                njVar5.f = min;
                                                njVar5.d = org.telegram.ui.kn.b(njVar5.e, min, c12);
                                                View d = ua0Var5.d();
                                                if (d instanceof org.telegram.ui.Cells.q1) {
                                                    oa0Var3.a0((org.telegram.ui.Cells.q1) d, njVar5.e, njVar5.f);
                                                }
                                                if (!z152) {
                                                    ua0Var5.s.getSwipeBack().e(ua0Var5.I);
                                                }
                                                ua0Var5.h(true, true);
                                                break;
                                            } else {
                                                njVar5.e = oa0Var3.u;
                                                njVar5.f = oa0Var3.v;
                                                org.telegram.ui.Cells.r9 r9Var2 = oa0Var3.W;
                                                njVar5.d = org.telegram.ui.kn.b(njVar5.e, njVar5.f, ua0Var5.c(r9Var2 != null ? ((org.telegram.ui.Cells.q1) r9Var2).getMessageObject() : null));
                                                ab0Var3.b();
                                                ab0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        ua0Var5.g();
                                        break;
                                    }
                                    break;
                                case 3:
                                    this.b.c0.c(false);
                                    break;
                                case 4:
                                    this.b.c0.c(false);
                                    break;
                                case 5:
                                    this.b.c0.a(true);
                                    break;
                                case 6:
                                    ab0 ab0Var4 = this.b.c0;
                                    if (!ab0Var4.b) {
                                        org.telegram.ui.hl hlVar = (org.telegram.ui.hl) ab0Var4;
                                        hlVar.a(true);
                                        org.telegram.ui.un unVar = hlVar.H;
                                        unVar.D5 = null;
                                        unVar.B5 = null;
                                        unVar.v5.f(null, null, unVar.j6, null);
                                        unVar.s8();
                                        break;
                                    } else {
                                        org.telegram.ui.hl hlVar2 = (org.telegram.ui.hl) ab0Var4;
                                        hlVar2.a(true);
                                        org.telegram.ui.un unVar2 = hlVar2.H;
                                        unVar2.B5 = null;
                                        unVar2.Ub(unVar2.D5);
                                        break;
                                    }
                                case 7:
                                    this.b.c0.c(true);
                                    break;
                                case 8:
                                    this.b.c0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.hl hlVar3 = (org.telegram.ui.hl) this.b.c0;
                                    hlVar3.a(true);
                                    org.telegram.ui.un unVar3 = hlVar3.H;
                                    unVar3.v5.d(null, unVar3.j6);
                                    unVar3.s8();
                                    break;
                                case 10:
                                    this.b.c0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.hl hlVar4 = (org.telegram.ui.hl) this.b.c0;
                                    hlVar4.a(true);
                                    org.telegram.ui.un unVar4 = hlVar4.H;
                                    unVar4.W5 = null;
                                    org.telegram.ui.mk mkVar = unVar4.Z;
                                    if (mkVar != null) {
                                        mkVar.X2 = null;
                                        mkVar.Y2 = false;
                                    }
                                    org.telegram.messenger.nj njVar6 = unVar4.v5;
                                    if (njVar6 != null) {
                                        i162 = ((org.telegram.ui.ActionBar.k2) unVar4).currentAccount;
                                        org.telegram.messenger.jj jjVar = unVar4.D5;
                                        njVar6.e(i162, null, null, jjVar == unVar4.l4 ? null : jjVar, unVar4.B5, unVar4.F5);
                                    }
                                    unVar4.s8();
                                    break;
                                case 12:
                                    ua0 ua0Var6 = this.b;
                                    org.telegram.messenger.nj njVar7 = ua0Var6.c0.d;
                                    if (njVar7.o) {
                                        boolean z16 = !njVar7.q;
                                        njVar7.q = z16;
                                        ua0Var6.G.a(z16, true);
                                        ua0Var6.H.a(njVar7.q, true);
                                        if (ua0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.jj) ua0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z17 = njVar7.q;
                                            messageMedia2.force_small_media = z17;
                                            messageMedia2.force_large_media = !z17;
                                        }
                                        if (ua0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.jj) ua0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z18 = njVar7.q;
                                            messageMedia.force_small_media = z18;
                                            messageMedia.force_large_media = !z18;
                                        }
                                        ua0Var6.i();
                                        ua0Var6.U = true;
                                        break;
                                    }
                                    break;
                                default:
                                    ua0 ua0Var7 = this.b;
                                    org.telegram.messenger.nj njVar8 = ua0Var7.c0.d;
                                    boolean z19 = njVar8.r;
                                    njVar8.r = !z19;
                                    ua0Var7.E.a(z19, true);
                                    if (ua0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.jj) ua0Var7.r.e.get(0)).k) != null) {
                                        message4.invert_media = njVar8.r;
                                    }
                                    if (ua0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.jj) ua0Var7.r.f.get(0)).k) != null) {
                                        message3.invert_media = njVar8.r;
                                    }
                                    ua0Var7.i();
                                    ua0Var7.U = true;
                                    break;
                            }
                        }
                    });
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(b1Var8, w7.b6.o(-1, 48));
                    org.telegram.ui.ActionBar.b1 b1Var9 = new org.telegram.ui.ActionBar.b1(1, context, ab0Var.F, false, true);
                    context2 = context;
                    b1Var9.j(org.telegram.messenger.cd.L0(2131751362, null), R.drawable.msg_delete, null);
                    int i26 = org.telegram.ui.ActionBar.t6.q7;
                    int i27 = org.telegram.ui.ActionBar.t6.p7;
                    b1Var9.c(i26, i27);
                    final int i28 = 11;
                    b1Var9.setOnClickListener(new View.OnClickListener(ua0Var3) { // from class: org.telegram.ui.Components.ja0
                        public final /* synthetic */ ua0 b;

                        {
                            this.b = ua0Var3;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i162;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (i28) {
                                case 0:
                                    ua0 ua0Var32 = this.b;
                                    ua0Var32.c0.d.d = null;
                                    ua0Var32.e.f(false);
                                    ua0Var32.h(false, false);
                                    ua0Var32.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    ua0 ua0Var4 = this.b;
                                    oa0 oa0Var2 = ua0Var4.e;
                                    ab0 ab0Var2 = ua0Var4.c0;
                                    if (ua0Var4.c(null) != null) {
                                        if (oa0Var2.v - oa0Var2.u <= org.telegram.messenger.vp.r1(ab0Var2.x).p4) {
                                            org.telegram.ui.Cells.r9 r9Var = oa0Var2.W;
                                            org.telegram.messenger.jj c11 = ua0Var4.c(r9Var != null ? ((org.telegram.ui.Cells.q1) r9Var).getMessageObject() : null);
                                            org.telegram.messenger.nj njVar4 = ab0Var2.d;
                                            int i172 = oa0Var2.u;
                                            njVar4.e = i172;
                                            int i182 = oa0Var2.v;
                                            njVar4.f = i182;
                                            njVar4.d = org.telegram.ui.kn.b(i172, i182, c11);
                                            ab0Var2.b();
                                            ab0Var2.a(true);
                                            break;
                                        } else {
                                            ua0Var4.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    ua0 ua0Var5 = this.b;
                                    oa0 oa0Var3 = ua0Var5.e;
                                    ab0 ab0Var3 = ua0Var5.c0;
                                    org.telegram.messenger.nj njVar5 = ab0Var3.d;
                                    int i192 = ab0Var3.x;
                                    boolean z152 = ab0Var3.b;
                                    if (njVar5.d != null && !z152) {
                                        njVar5.d = null;
                                        oa0Var3.f(false);
                                        ua0Var5.h(false, true);
                                        ua0Var5.l(true);
                                        break;
                                    } else if (oa0Var3.v - oa0Var3.u <= org.telegram.messenger.vp.r1(i192).p4) {
                                        org.telegram.messenger.jj c12 = ua0Var5.c(null);
                                        if (c12 != null) {
                                            if (!oa0Var3.x()) {
                                                njVar5.e = 0;
                                                int min = Math.min(org.telegram.messenger.vp.r1(i192).p4, org.telegram.ui.kn.d(c12));
                                                njVar5.f = min;
                                                njVar5.d = org.telegram.ui.kn.b(njVar5.e, min, c12);
                                                View d = ua0Var5.d();
                                                if (d instanceof org.telegram.ui.Cells.q1) {
                                                    oa0Var3.a0((org.telegram.ui.Cells.q1) d, njVar5.e, njVar5.f);
                                                }
                                                if (!z152) {
                                                    ua0Var5.s.getSwipeBack().e(ua0Var5.I);
                                                }
                                                ua0Var5.h(true, true);
                                                break;
                                            } else {
                                                njVar5.e = oa0Var3.u;
                                                njVar5.f = oa0Var3.v;
                                                org.telegram.ui.Cells.r9 r9Var2 = oa0Var3.W;
                                                njVar5.d = org.telegram.ui.kn.b(njVar5.e, njVar5.f, ua0Var5.c(r9Var2 != null ? ((org.telegram.ui.Cells.q1) r9Var2).getMessageObject() : null));
                                                ab0Var3.b();
                                                ab0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        ua0Var5.g();
                                        break;
                                    }
                                    break;
                                case 3:
                                    this.b.c0.c(false);
                                    break;
                                case 4:
                                    this.b.c0.c(false);
                                    break;
                                case 5:
                                    this.b.c0.a(true);
                                    break;
                                case 6:
                                    ab0 ab0Var4 = this.b.c0;
                                    if (!ab0Var4.b) {
                                        org.telegram.ui.hl hlVar = (org.telegram.ui.hl) ab0Var4;
                                        hlVar.a(true);
                                        org.telegram.ui.un unVar = hlVar.H;
                                        unVar.D5 = null;
                                        unVar.B5 = null;
                                        unVar.v5.f(null, null, unVar.j6, null);
                                        unVar.s8();
                                        break;
                                    } else {
                                        org.telegram.ui.hl hlVar2 = (org.telegram.ui.hl) ab0Var4;
                                        hlVar2.a(true);
                                        org.telegram.ui.un unVar2 = hlVar2.H;
                                        unVar2.B5 = null;
                                        unVar2.Ub(unVar2.D5);
                                        break;
                                    }
                                case 7:
                                    this.b.c0.c(true);
                                    break;
                                case 8:
                                    this.b.c0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.hl hlVar3 = (org.telegram.ui.hl) this.b.c0;
                                    hlVar3.a(true);
                                    org.telegram.ui.un unVar3 = hlVar3.H;
                                    unVar3.v5.d(null, unVar3.j6);
                                    unVar3.s8();
                                    break;
                                case 10:
                                    this.b.c0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.hl hlVar4 = (org.telegram.ui.hl) this.b.c0;
                                    hlVar4.a(true);
                                    org.telegram.ui.un unVar4 = hlVar4.H;
                                    unVar4.W5 = null;
                                    org.telegram.ui.mk mkVar = unVar4.Z;
                                    if (mkVar != null) {
                                        mkVar.X2 = null;
                                        mkVar.Y2 = false;
                                    }
                                    org.telegram.messenger.nj njVar6 = unVar4.v5;
                                    if (njVar6 != null) {
                                        i162 = ((org.telegram.ui.ActionBar.k2) unVar4).currentAccount;
                                        org.telegram.messenger.jj jjVar = unVar4.D5;
                                        njVar6.e(i162, null, null, jjVar == unVar4.l4 ? null : jjVar, unVar4.B5, unVar4.F5);
                                    }
                                    unVar4.s8();
                                    break;
                                case 12:
                                    ua0 ua0Var6 = this.b;
                                    org.telegram.messenger.nj njVar7 = ua0Var6.c0.d;
                                    if (njVar7.o) {
                                        boolean z16 = !njVar7.q;
                                        njVar7.q = z16;
                                        ua0Var6.G.a(z16, true);
                                        ua0Var6.H.a(njVar7.q, true);
                                        if (ua0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.jj) ua0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z17 = njVar7.q;
                                            messageMedia2.force_small_media = z17;
                                            messageMedia2.force_large_media = !z17;
                                        }
                                        if (ua0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.jj) ua0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z18 = njVar7.q;
                                            messageMedia.force_small_media = z18;
                                            messageMedia.force_large_media = !z18;
                                        }
                                        ua0Var6.i();
                                        ua0Var6.U = true;
                                        break;
                                    }
                                    break;
                                default:
                                    ua0 ua0Var7 = this.b;
                                    org.telegram.messenger.nj njVar8 = ua0Var7.c0.d;
                                    boolean z19 = njVar8.r;
                                    njVar8.r = !z19;
                                    ua0Var7.E.a(z19, true);
                                    if (ua0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.jj) ua0Var7.r.e.get(0)).k) != null) {
                                        message4.invert_media = njVar8.r;
                                    }
                                    if (ua0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.jj) ua0Var7.r.f.get(0)).k) != null) {
                                        message3.invert_media = njVar8.r;
                                    }
                                    ua0Var7.i();
                                    ua0Var7.U = true;
                                    break;
                            }
                        }
                    });
                    b1Var9.h(0.12f, i27);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(b1Var9, w7.b6.o(-1, 48));
                    final int i29 = 12;
                    frameLayout3.setOnClickListener(new View.OnClickListener(ua0Var3) { // from class: org.telegram.ui.Components.ja0
                        public final /* synthetic */ ua0 b;

                        {
                            this.b = ua0Var3;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i162;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (i29) {
                                case 0:
                                    ua0 ua0Var32 = this.b;
                                    ua0Var32.c0.d.d = null;
                                    ua0Var32.e.f(false);
                                    ua0Var32.h(false, false);
                                    ua0Var32.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    ua0 ua0Var4 = this.b;
                                    oa0 oa0Var2 = ua0Var4.e;
                                    ab0 ab0Var2 = ua0Var4.c0;
                                    if (ua0Var4.c(null) != null) {
                                        if (oa0Var2.v - oa0Var2.u <= org.telegram.messenger.vp.r1(ab0Var2.x).p4) {
                                            org.telegram.ui.Cells.r9 r9Var = oa0Var2.W;
                                            org.telegram.messenger.jj c11 = ua0Var4.c(r9Var != null ? ((org.telegram.ui.Cells.q1) r9Var).getMessageObject() : null);
                                            org.telegram.messenger.nj njVar4 = ab0Var2.d;
                                            int i172 = oa0Var2.u;
                                            njVar4.e = i172;
                                            int i182 = oa0Var2.v;
                                            njVar4.f = i182;
                                            njVar4.d = org.telegram.ui.kn.b(i172, i182, c11);
                                            ab0Var2.b();
                                            ab0Var2.a(true);
                                            break;
                                        } else {
                                            ua0Var4.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    ua0 ua0Var5 = this.b;
                                    oa0 oa0Var3 = ua0Var5.e;
                                    ab0 ab0Var3 = ua0Var5.c0;
                                    org.telegram.messenger.nj njVar5 = ab0Var3.d;
                                    int i192 = ab0Var3.x;
                                    boolean z152 = ab0Var3.b;
                                    if (njVar5.d != null && !z152) {
                                        njVar5.d = null;
                                        oa0Var3.f(false);
                                        ua0Var5.h(false, true);
                                        ua0Var5.l(true);
                                        break;
                                    } else if (oa0Var3.v - oa0Var3.u <= org.telegram.messenger.vp.r1(i192).p4) {
                                        org.telegram.messenger.jj c12 = ua0Var5.c(null);
                                        if (c12 != null) {
                                            if (!oa0Var3.x()) {
                                                njVar5.e = 0;
                                                int min = Math.min(org.telegram.messenger.vp.r1(i192).p4, org.telegram.ui.kn.d(c12));
                                                njVar5.f = min;
                                                njVar5.d = org.telegram.ui.kn.b(njVar5.e, min, c12);
                                                View d = ua0Var5.d();
                                                if (d instanceof org.telegram.ui.Cells.q1) {
                                                    oa0Var3.a0((org.telegram.ui.Cells.q1) d, njVar5.e, njVar5.f);
                                                }
                                                if (!z152) {
                                                    ua0Var5.s.getSwipeBack().e(ua0Var5.I);
                                                }
                                                ua0Var5.h(true, true);
                                                break;
                                            } else {
                                                njVar5.e = oa0Var3.u;
                                                njVar5.f = oa0Var3.v;
                                                org.telegram.ui.Cells.r9 r9Var2 = oa0Var3.W;
                                                njVar5.d = org.telegram.ui.kn.b(njVar5.e, njVar5.f, ua0Var5.c(r9Var2 != null ? ((org.telegram.ui.Cells.q1) r9Var2).getMessageObject() : null));
                                                ab0Var3.b();
                                                ab0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        ua0Var5.g();
                                        break;
                                    }
                                    break;
                                case 3:
                                    this.b.c0.c(false);
                                    break;
                                case 4:
                                    this.b.c0.c(false);
                                    break;
                                case 5:
                                    this.b.c0.a(true);
                                    break;
                                case 6:
                                    ab0 ab0Var4 = this.b.c0;
                                    if (!ab0Var4.b) {
                                        org.telegram.ui.hl hlVar = (org.telegram.ui.hl) ab0Var4;
                                        hlVar.a(true);
                                        org.telegram.ui.un unVar = hlVar.H;
                                        unVar.D5 = null;
                                        unVar.B5 = null;
                                        unVar.v5.f(null, null, unVar.j6, null);
                                        unVar.s8();
                                        break;
                                    } else {
                                        org.telegram.ui.hl hlVar2 = (org.telegram.ui.hl) ab0Var4;
                                        hlVar2.a(true);
                                        org.telegram.ui.un unVar2 = hlVar2.H;
                                        unVar2.B5 = null;
                                        unVar2.Ub(unVar2.D5);
                                        break;
                                    }
                                case 7:
                                    this.b.c0.c(true);
                                    break;
                                case 8:
                                    this.b.c0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.hl hlVar3 = (org.telegram.ui.hl) this.b.c0;
                                    hlVar3.a(true);
                                    org.telegram.ui.un unVar3 = hlVar3.H;
                                    unVar3.v5.d(null, unVar3.j6);
                                    unVar3.s8();
                                    break;
                                case 10:
                                    this.b.c0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.hl hlVar4 = (org.telegram.ui.hl) this.b.c0;
                                    hlVar4.a(true);
                                    org.telegram.ui.un unVar4 = hlVar4.H;
                                    unVar4.W5 = null;
                                    org.telegram.ui.mk mkVar = unVar4.Z;
                                    if (mkVar != null) {
                                        mkVar.X2 = null;
                                        mkVar.Y2 = false;
                                    }
                                    org.telegram.messenger.nj njVar6 = unVar4.v5;
                                    if (njVar6 != null) {
                                        i162 = ((org.telegram.ui.ActionBar.k2) unVar4).currentAccount;
                                        org.telegram.messenger.jj jjVar = unVar4.D5;
                                        njVar6.e(i162, null, null, jjVar == unVar4.l4 ? null : jjVar, unVar4.B5, unVar4.F5);
                                    }
                                    unVar4.s8();
                                    break;
                                case 12:
                                    ua0 ua0Var6 = this.b;
                                    org.telegram.messenger.nj njVar7 = ua0Var6.c0.d;
                                    if (njVar7.o) {
                                        boolean z16 = !njVar7.q;
                                        njVar7.q = z16;
                                        ua0Var6.G.a(z16, true);
                                        ua0Var6.H.a(njVar7.q, true);
                                        if (ua0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.jj) ua0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z17 = njVar7.q;
                                            messageMedia2.force_small_media = z17;
                                            messageMedia2.force_large_media = !z17;
                                        }
                                        if (ua0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.jj) ua0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z18 = njVar7.q;
                                            messageMedia.force_small_media = z18;
                                            messageMedia.force_large_media = !z18;
                                        }
                                        ua0Var6.i();
                                        ua0Var6.U = true;
                                        break;
                                    }
                                    break;
                                default:
                                    ua0 ua0Var7 = this.b;
                                    org.telegram.messenger.nj njVar8 = ua0Var7.c0.d;
                                    boolean z19 = njVar8.r;
                                    njVar8.r = !z19;
                                    ua0Var7.E.a(z19, true);
                                    if (ua0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.jj) ua0Var7.r.e.get(0)).k) != null) {
                                        message4.invert_media = njVar8.r;
                                    }
                                    if (ua0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.jj) ua0Var7.r.f.get(0)).k) != null) {
                                        message3.invert_media = njVar8.r;
                                    }
                                    ua0Var7.i();
                                    ua0Var7.U = true;
                                    break;
                            }
                        }
                    });
                    final int i30 = 13;
                    za0Var3.setOnClickListener(new View.OnClickListener(ua0Var3) { // from class: org.telegram.ui.Components.ja0
                        public final /* synthetic */ ua0 b;

                        {
                            this.b = ua0Var3;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i162;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (i30) {
                                case 0:
                                    ua0 ua0Var32 = this.b;
                                    ua0Var32.c0.d.d = null;
                                    ua0Var32.e.f(false);
                                    ua0Var32.h(false, false);
                                    ua0Var32.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    ua0 ua0Var4 = this.b;
                                    oa0 oa0Var2 = ua0Var4.e;
                                    ab0 ab0Var2 = ua0Var4.c0;
                                    if (ua0Var4.c(null) != null) {
                                        if (oa0Var2.v - oa0Var2.u <= org.telegram.messenger.vp.r1(ab0Var2.x).p4) {
                                            org.telegram.ui.Cells.r9 r9Var = oa0Var2.W;
                                            org.telegram.messenger.jj c11 = ua0Var4.c(r9Var != null ? ((org.telegram.ui.Cells.q1) r9Var).getMessageObject() : null);
                                            org.telegram.messenger.nj njVar4 = ab0Var2.d;
                                            int i172 = oa0Var2.u;
                                            njVar4.e = i172;
                                            int i182 = oa0Var2.v;
                                            njVar4.f = i182;
                                            njVar4.d = org.telegram.ui.kn.b(i172, i182, c11);
                                            ab0Var2.b();
                                            ab0Var2.a(true);
                                            break;
                                        } else {
                                            ua0Var4.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    ua0 ua0Var5 = this.b;
                                    oa0 oa0Var3 = ua0Var5.e;
                                    ab0 ab0Var3 = ua0Var5.c0;
                                    org.telegram.messenger.nj njVar5 = ab0Var3.d;
                                    int i192 = ab0Var3.x;
                                    boolean z152 = ab0Var3.b;
                                    if (njVar5.d != null && !z152) {
                                        njVar5.d = null;
                                        oa0Var3.f(false);
                                        ua0Var5.h(false, true);
                                        ua0Var5.l(true);
                                        break;
                                    } else if (oa0Var3.v - oa0Var3.u <= org.telegram.messenger.vp.r1(i192).p4) {
                                        org.telegram.messenger.jj c12 = ua0Var5.c(null);
                                        if (c12 != null) {
                                            if (!oa0Var3.x()) {
                                                njVar5.e = 0;
                                                int min = Math.min(org.telegram.messenger.vp.r1(i192).p4, org.telegram.ui.kn.d(c12));
                                                njVar5.f = min;
                                                njVar5.d = org.telegram.ui.kn.b(njVar5.e, min, c12);
                                                View d = ua0Var5.d();
                                                if (d instanceof org.telegram.ui.Cells.q1) {
                                                    oa0Var3.a0((org.telegram.ui.Cells.q1) d, njVar5.e, njVar5.f);
                                                }
                                                if (!z152) {
                                                    ua0Var5.s.getSwipeBack().e(ua0Var5.I);
                                                }
                                                ua0Var5.h(true, true);
                                                break;
                                            } else {
                                                njVar5.e = oa0Var3.u;
                                                njVar5.f = oa0Var3.v;
                                                org.telegram.ui.Cells.r9 r9Var2 = oa0Var3.W;
                                                njVar5.d = org.telegram.ui.kn.b(njVar5.e, njVar5.f, ua0Var5.c(r9Var2 != null ? ((org.telegram.ui.Cells.q1) r9Var2).getMessageObject() : null));
                                                ab0Var3.b();
                                                ab0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        ua0Var5.g();
                                        break;
                                    }
                                    break;
                                case 3:
                                    this.b.c0.c(false);
                                    break;
                                case 4:
                                    this.b.c0.c(false);
                                    break;
                                case 5:
                                    this.b.c0.a(true);
                                    break;
                                case 6:
                                    ab0 ab0Var4 = this.b.c0;
                                    if (!ab0Var4.b) {
                                        org.telegram.ui.hl hlVar = (org.telegram.ui.hl) ab0Var4;
                                        hlVar.a(true);
                                        org.telegram.ui.un unVar = hlVar.H;
                                        unVar.D5 = null;
                                        unVar.B5 = null;
                                        unVar.v5.f(null, null, unVar.j6, null);
                                        unVar.s8();
                                        break;
                                    } else {
                                        org.telegram.ui.hl hlVar2 = (org.telegram.ui.hl) ab0Var4;
                                        hlVar2.a(true);
                                        org.telegram.ui.un unVar2 = hlVar2.H;
                                        unVar2.B5 = null;
                                        unVar2.Ub(unVar2.D5);
                                        break;
                                    }
                                case 7:
                                    this.b.c0.c(true);
                                    break;
                                case 8:
                                    this.b.c0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.hl hlVar3 = (org.telegram.ui.hl) this.b.c0;
                                    hlVar3.a(true);
                                    org.telegram.ui.un unVar3 = hlVar3.H;
                                    unVar3.v5.d(null, unVar3.j6);
                                    unVar3.s8();
                                    break;
                                case 10:
                                    this.b.c0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.hl hlVar4 = (org.telegram.ui.hl) this.b.c0;
                                    hlVar4.a(true);
                                    org.telegram.ui.un unVar4 = hlVar4.H;
                                    unVar4.W5 = null;
                                    org.telegram.ui.mk mkVar = unVar4.Z;
                                    if (mkVar != null) {
                                        mkVar.X2 = null;
                                        mkVar.Y2 = false;
                                    }
                                    org.telegram.messenger.nj njVar6 = unVar4.v5;
                                    if (njVar6 != null) {
                                        i162 = ((org.telegram.ui.ActionBar.k2) unVar4).currentAccount;
                                        org.telegram.messenger.jj jjVar = unVar4.D5;
                                        njVar6.e(i162, null, null, jjVar == unVar4.l4 ? null : jjVar, unVar4.B5, unVar4.F5);
                                    }
                                    unVar4.s8();
                                    break;
                                case 12:
                                    ua0 ua0Var6 = this.b;
                                    org.telegram.messenger.nj njVar7 = ua0Var6.c0.d;
                                    if (njVar7.o) {
                                        boolean z16 = !njVar7.q;
                                        njVar7.q = z16;
                                        ua0Var6.G.a(z16, true);
                                        ua0Var6.H.a(njVar7.q, true);
                                        if (ua0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.jj) ua0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z17 = njVar7.q;
                                            messageMedia2.force_small_media = z17;
                                            messageMedia2.force_large_media = !z17;
                                        }
                                        if (ua0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.jj) ua0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z18 = njVar7.q;
                                            messageMedia.force_small_media = z18;
                                            messageMedia.force_large_media = !z18;
                                        }
                                        ua0Var6.i();
                                        ua0Var6.U = true;
                                        break;
                                    }
                                    break;
                                default:
                                    ua0 ua0Var7 = this.b;
                                    org.telegram.messenger.nj njVar8 = ua0Var7.c0.d;
                                    boolean z19 = njVar8.r;
                                    njVar8.r = !z19;
                                    ua0Var7.E.a(z19, true);
                                    if (ua0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.jj) ua0Var7.r.e.get(0)).k) != null) {
                                        message4.invert_media = njVar8.r;
                                    }
                                    if (ua0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.jj) ua0Var7.r.f.get(0)).k) != null) {
                                        message3.invert_media = njVar8.r;
                                    }
                                    ua0Var7.i();
                                    ua0Var7.U = true;
                                    break;
                            }
                        }
                    });
                    ua0Var2 = ua0Var3;
                    viewOutlineProvider = null;
                    i11 = ua0Var2.a;
                    if (i11 == 1) {
                    }
                    n10 = ua0Var2.e.n(context2);
                    ua0Var2.d = n10;
                    n10.setElevation(org.telegram.messenger.i0.L(8.0f));
                    n10.setOutlineProvider(viewOutlineProvider);
                    if (n10.getParent() instanceof ViewGroup) {
                    }
                    ua0Var2.addView(n10, w7.b6.d(-1, -1.0f, 51, 0.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / org.telegram.messenger.i0.p, 0.0f, 0.0f));
                    ua0Var2.e.S(ua0Var2.f);
                }
            }
        } else {
            if (!org.telegram.messenger.d20.i(ab0Var.x).q()) {
                for (int i31 = 0; i31 < njVar.b.e.size(); i31++) {
                    if (((org.telegram.messenger.jj) njVar.b.e.get(i31)).D == 36) {
                        z10 = false;
                        break;
                    }
                }
            }
            z10 = true;
            za0 za0Var6 = new za0(context, R.raw.name_hide, org.telegram.messenger.cd.L0(njVar.j ? 2131745350 : 2131745349, null), R.raw.name_show, org.telegram.messenger.cd.L0(njVar.j ? 2131749318 : 2131749317, null), ab0Var.F);
            this.s.a(za0Var6, w7.b6.o(-1, 48));
            if (njVar.g) {
                za0Var = za0Var6;
                za0 za0Var7 = new za0(context, R.raw.caption_hide, org.telegram.messenger.cd.L0(2131745362, null), R.raw.caption_show, org.telegram.messenger.cd.L0(2131749330, null), ab0Var.F);
                za0Var7.a(njVar.l, false);
                this.s.a(za0Var7, w7.b6.o(-1, 48));
                za0Var2 = za0Var7;
            } else {
                za0Var = za0Var6;
                za0Var2 = null;
            }
            org.telegram.ui.ActionBar.b1 b1Var10 = new org.telegram.ui.ActionBar.b1(0, context, ab0Var.F, true, false);
            final int i32 = 7;
            b1Var10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ja0
                public final /* synthetic */ ua0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i162;
                    TLRPC.Message message;
                    TLRPC.MessageMedia messageMedia;
                    TLRPC.Message message2;
                    TLRPC.MessageMedia messageMedia2;
                    TLRPC.Message message3;
                    TLRPC.Message message4;
                    switch (i32) {
                        case 0:
                            ua0 ua0Var32 = this.b;
                            ua0Var32.c0.d.d = null;
                            ua0Var32.e.f(false);
                            ua0Var32.h(false, false);
                            ua0Var32.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            ua0 ua0Var4 = this.b;
                            oa0 oa0Var2 = ua0Var4.e;
                            ab0 ab0Var2 = ua0Var4.c0;
                            if (ua0Var4.c(null) != null) {
                                if (oa0Var2.v - oa0Var2.u <= org.telegram.messenger.vp.r1(ab0Var2.x).p4) {
                                    org.telegram.ui.Cells.r9 r9Var = oa0Var2.W;
                                    org.telegram.messenger.jj c11 = ua0Var4.c(r9Var != null ? ((org.telegram.ui.Cells.q1) r9Var).getMessageObject() : null);
                                    org.telegram.messenger.nj njVar4 = ab0Var2.d;
                                    int i172 = oa0Var2.u;
                                    njVar4.e = i172;
                                    int i182 = oa0Var2.v;
                                    njVar4.f = i182;
                                    njVar4.d = org.telegram.ui.kn.b(i172, i182, c11);
                                    ab0Var2.b();
                                    ab0Var2.a(true);
                                    break;
                                } else {
                                    ua0Var4.g();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            ua0 ua0Var5 = this.b;
                            oa0 oa0Var3 = ua0Var5.e;
                            ab0 ab0Var3 = ua0Var5.c0;
                            org.telegram.messenger.nj njVar5 = ab0Var3.d;
                            int i192 = ab0Var3.x;
                            boolean z152 = ab0Var3.b;
                            if (njVar5.d != null && !z152) {
                                njVar5.d = null;
                                oa0Var3.f(false);
                                ua0Var5.h(false, true);
                                ua0Var5.l(true);
                                break;
                            } else if (oa0Var3.v - oa0Var3.u <= org.telegram.messenger.vp.r1(i192).p4) {
                                org.telegram.messenger.jj c12 = ua0Var5.c(null);
                                if (c12 != null) {
                                    if (!oa0Var3.x()) {
                                        njVar5.e = 0;
                                        int min = Math.min(org.telegram.messenger.vp.r1(i192).p4, org.telegram.ui.kn.d(c12));
                                        njVar5.f = min;
                                        njVar5.d = org.telegram.ui.kn.b(njVar5.e, min, c12);
                                        View d = ua0Var5.d();
                                        if (d instanceof org.telegram.ui.Cells.q1) {
                                            oa0Var3.a0((org.telegram.ui.Cells.q1) d, njVar5.e, njVar5.f);
                                        }
                                        if (!z152) {
                                            ua0Var5.s.getSwipeBack().e(ua0Var5.I);
                                        }
                                        ua0Var5.h(true, true);
                                        break;
                                    } else {
                                        njVar5.e = oa0Var3.u;
                                        njVar5.f = oa0Var3.v;
                                        org.telegram.ui.Cells.r9 r9Var2 = oa0Var3.W;
                                        njVar5.d = org.telegram.ui.kn.b(njVar5.e, njVar5.f, ua0Var5.c(r9Var2 != null ? ((org.telegram.ui.Cells.q1) r9Var2).getMessageObject() : null));
                                        ab0Var3.b();
                                        ab0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                ua0Var5.g();
                                break;
                            }
                            break;
                        case 3:
                            this.b.c0.c(false);
                            break;
                        case 4:
                            this.b.c0.c(false);
                            break;
                        case 5:
                            this.b.c0.a(true);
                            break;
                        case 6:
                            ab0 ab0Var4 = this.b.c0;
                            if (!ab0Var4.b) {
                                org.telegram.ui.hl hlVar = (org.telegram.ui.hl) ab0Var4;
                                hlVar.a(true);
                                org.telegram.ui.un unVar = hlVar.H;
                                unVar.D5 = null;
                                unVar.B5 = null;
                                unVar.v5.f(null, null, unVar.j6, null);
                                unVar.s8();
                                break;
                            } else {
                                org.telegram.ui.hl hlVar2 = (org.telegram.ui.hl) ab0Var4;
                                hlVar2.a(true);
                                org.telegram.ui.un unVar2 = hlVar2.H;
                                unVar2.B5 = null;
                                unVar2.Ub(unVar2.D5);
                                break;
                            }
                        case 7:
                            this.b.c0.c(true);
                            break;
                        case 8:
                            this.b.c0.a(true);
                            break;
                        case 9:
                            org.telegram.ui.hl hlVar3 = (org.telegram.ui.hl) this.b.c0;
                            hlVar3.a(true);
                            org.telegram.ui.un unVar3 = hlVar3.H;
                            unVar3.v5.d(null, unVar3.j6);
                            unVar3.s8();
                            break;
                        case 10:
                            this.b.c0.a(true);
                            break;
                        case 11:
                            org.telegram.ui.hl hlVar4 = (org.telegram.ui.hl) this.b.c0;
                            hlVar4.a(true);
                            org.telegram.ui.un unVar4 = hlVar4.H;
                            unVar4.W5 = null;
                            org.telegram.ui.mk mkVar = unVar4.Z;
                            if (mkVar != null) {
                                mkVar.X2 = null;
                                mkVar.Y2 = false;
                            }
                            org.telegram.messenger.nj njVar6 = unVar4.v5;
                            if (njVar6 != null) {
                                i162 = ((org.telegram.ui.ActionBar.k2) unVar4).currentAccount;
                                org.telegram.messenger.jj jjVar = unVar4.D5;
                                njVar6.e(i162, null, null, jjVar == unVar4.l4 ? null : jjVar, unVar4.B5, unVar4.F5);
                            }
                            unVar4.s8();
                            break;
                        case 12:
                            ua0 ua0Var6 = this.b;
                            org.telegram.messenger.nj njVar7 = ua0Var6.c0.d;
                            if (njVar7.o) {
                                boolean z16 = !njVar7.q;
                                njVar7.q = z16;
                                ua0Var6.G.a(z16, true);
                                ua0Var6.H.a(njVar7.q, true);
                                if (ua0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.jj) ua0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z17 = njVar7.q;
                                    messageMedia2.force_small_media = z17;
                                    messageMedia2.force_large_media = !z17;
                                }
                                if (ua0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.jj) ua0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                    boolean z18 = njVar7.q;
                                    messageMedia.force_small_media = z18;
                                    messageMedia.force_large_media = !z18;
                                }
                                ua0Var6.i();
                                ua0Var6.U = true;
                                break;
                            }
                            break;
                        default:
                            ua0 ua0Var7 = this.b;
                            org.telegram.messenger.nj njVar8 = ua0Var7.c0.d;
                            boolean z19 = njVar8.r;
                            njVar8.r = !z19;
                            ua0Var7.E.a(z19, true);
                            if (ua0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.jj) ua0Var7.r.e.get(0)).k) != null) {
                                message4.invert_media = njVar8.r;
                            }
                            if (ua0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.jj) ua0Var7.r.f.get(0)).k) != null) {
                                message3.invert_media = njVar8.r;
                            }
                            ua0Var7.i();
                            ua0Var7.U = true;
                            break;
                    }
                }
            });
            b1Var10.j(org.telegram.messenger.cd.L0(2131752532, null), R.drawable.msg_forward_replace, null);
            this.s.a(b1Var10, w7.b6.o(-1, 48));
            org.telegram.ui.ActionBar.h1 h1Var4 = new org.telegram.ui.ActionBar.h1(context, wa0Var);
            org.telegram.ui.ActionBar.a7.j(h1Var4, org.telegram.ui.ActionBar.a7.L(0.06f, org.telegram.ui.ActionBar.t6.E8), wa0Var);
            h1Var4.setTag(R.id.fit_width_tag, 1);
            final int i33 = 8;
            this.s.a(h1Var4, w7.b6.o(-1, 8));
            org.telegram.ui.ActionBar.b1 b1Var11 = new org.telegram.ui.ActionBar.b1(1, context, ab0Var.F, false, false);
            b1Var11.j(org.telegram.messenger.cd.L0(2131754218, null), R.drawable.msg_select, null);
            b1Var11.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ja0
                public final /* synthetic */ ua0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i162;
                    TLRPC.Message message;
                    TLRPC.MessageMedia messageMedia;
                    TLRPC.Message message2;
                    TLRPC.MessageMedia messageMedia2;
                    TLRPC.Message message3;
                    TLRPC.Message message4;
                    switch (i33) {
                        case 0:
                            ua0 ua0Var32 = this.b;
                            ua0Var32.c0.d.d = null;
                            ua0Var32.e.f(false);
                            ua0Var32.h(false, false);
                            ua0Var32.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            ua0 ua0Var4 = this.b;
                            oa0 oa0Var2 = ua0Var4.e;
                            ab0 ab0Var2 = ua0Var4.c0;
                            if (ua0Var4.c(null) != null) {
                                if (oa0Var2.v - oa0Var2.u <= org.telegram.messenger.vp.r1(ab0Var2.x).p4) {
                                    org.telegram.ui.Cells.r9 r9Var = oa0Var2.W;
                                    org.telegram.messenger.jj c11 = ua0Var4.c(r9Var != null ? ((org.telegram.ui.Cells.q1) r9Var).getMessageObject() : null);
                                    org.telegram.messenger.nj njVar4 = ab0Var2.d;
                                    int i172 = oa0Var2.u;
                                    njVar4.e = i172;
                                    int i182 = oa0Var2.v;
                                    njVar4.f = i182;
                                    njVar4.d = org.telegram.ui.kn.b(i172, i182, c11);
                                    ab0Var2.b();
                                    ab0Var2.a(true);
                                    break;
                                } else {
                                    ua0Var4.g();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            ua0 ua0Var5 = this.b;
                            oa0 oa0Var3 = ua0Var5.e;
                            ab0 ab0Var3 = ua0Var5.c0;
                            org.telegram.messenger.nj njVar5 = ab0Var3.d;
                            int i192 = ab0Var3.x;
                            boolean z152 = ab0Var3.b;
                            if (njVar5.d != null && !z152) {
                                njVar5.d = null;
                                oa0Var3.f(false);
                                ua0Var5.h(false, true);
                                ua0Var5.l(true);
                                break;
                            } else if (oa0Var3.v - oa0Var3.u <= org.telegram.messenger.vp.r1(i192).p4) {
                                org.telegram.messenger.jj c12 = ua0Var5.c(null);
                                if (c12 != null) {
                                    if (!oa0Var3.x()) {
                                        njVar5.e = 0;
                                        int min = Math.min(org.telegram.messenger.vp.r1(i192).p4, org.telegram.ui.kn.d(c12));
                                        njVar5.f = min;
                                        njVar5.d = org.telegram.ui.kn.b(njVar5.e, min, c12);
                                        View d = ua0Var5.d();
                                        if (d instanceof org.telegram.ui.Cells.q1) {
                                            oa0Var3.a0((org.telegram.ui.Cells.q1) d, njVar5.e, njVar5.f);
                                        }
                                        if (!z152) {
                                            ua0Var5.s.getSwipeBack().e(ua0Var5.I);
                                        }
                                        ua0Var5.h(true, true);
                                        break;
                                    } else {
                                        njVar5.e = oa0Var3.u;
                                        njVar5.f = oa0Var3.v;
                                        org.telegram.ui.Cells.r9 r9Var2 = oa0Var3.W;
                                        njVar5.d = org.telegram.ui.kn.b(njVar5.e, njVar5.f, ua0Var5.c(r9Var2 != null ? ((org.telegram.ui.Cells.q1) r9Var2).getMessageObject() : null));
                                        ab0Var3.b();
                                        ab0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                ua0Var5.g();
                                break;
                            }
                            break;
                        case 3:
                            this.b.c0.c(false);
                            break;
                        case 4:
                            this.b.c0.c(false);
                            break;
                        case 5:
                            this.b.c0.a(true);
                            break;
                        case 6:
                            ab0 ab0Var4 = this.b.c0;
                            if (!ab0Var4.b) {
                                org.telegram.ui.hl hlVar = (org.telegram.ui.hl) ab0Var4;
                                hlVar.a(true);
                                org.telegram.ui.un unVar = hlVar.H;
                                unVar.D5 = null;
                                unVar.B5 = null;
                                unVar.v5.f(null, null, unVar.j6, null);
                                unVar.s8();
                                break;
                            } else {
                                org.telegram.ui.hl hlVar2 = (org.telegram.ui.hl) ab0Var4;
                                hlVar2.a(true);
                                org.telegram.ui.un unVar2 = hlVar2.H;
                                unVar2.B5 = null;
                                unVar2.Ub(unVar2.D5);
                                break;
                            }
                        case 7:
                            this.b.c0.c(true);
                            break;
                        case 8:
                            this.b.c0.a(true);
                            break;
                        case 9:
                            org.telegram.ui.hl hlVar3 = (org.telegram.ui.hl) this.b.c0;
                            hlVar3.a(true);
                            org.telegram.ui.un unVar3 = hlVar3.H;
                            unVar3.v5.d(null, unVar3.j6);
                            unVar3.s8();
                            break;
                        case 10:
                            this.b.c0.a(true);
                            break;
                        case 11:
                            org.telegram.ui.hl hlVar4 = (org.telegram.ui.hl) this.b.c0;
                            hlVar4.a(true);
                            org.telegram.ui.un unVar4 = hlVar4.H;
                            unVar4.W5 = null;
                            org.telegram.ui.mk mkVar = unVar4.Z;
                            if (mkVar != null) {
                                mkVar.X2 = null;
                                mkVar.Y2 = false;
                            }
                            org.telegram.messenger.nj njVar6 = unVar4.v5;
                            if (njVar6 != null) {
                                i162 = ((org.telegram.ui.ActionBar.k2) unVar4).currentAccount;
                                org.telegram.messenger.jj jjVar = unVar4.D5;
                                njVar6.e(i162, null, null, jjVar == unVar4.l4 ? null : jjVar, unVar4.B5, unVar4.F5);
                            }
                            unVar4.s8();
                            break;
                        case 12:
                            ua0 ua0Var6 = this.b;
                            org.telegram.messenger.nj njVar7 = ua0Var6.c0.d;
                            if (njVar7.o) {
                                boolean z16 = !njVar7.q;
                                njVar7.q = z16;
                                ua0Var6.G.a(z16, true);
                                ua0Var6.H.a(njVar7.q, true);
                                if (ua0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.jj) ua0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z17 = njVar7.q;
                                    messageMedia2.force_small_media = z17;
                                    messageMedia2.force_large_media = !z17;
                                }
                                if (ua0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.jj) ua0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                    boolean z18 = njVar7.q;
                                    messageMedia.force_small_media = z18;
                                    messageMedia.force_large_media = !z18;
                                }
                                ua0Var6.i();
                                ua0Var6.U = true;
                                break;
                            }
                            break;
                        default:
                            ua0 ua0Var7 = this.b;
                            org.telegram.messenger.nj njVar8 = ua0Var7.c0.d;
                            boolean z19 = njVar8.r;
                            njVar8.r = !z19;
                            ua0Var7.E.a(z19, true);
                            if (ua0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.jj) ua0Var7.r.e.get(0)).k) != null) {
                                message4.invert_media = njVar8.r;
                            }
                            if (ua0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.jj) ua0Var7.r.f.get(0)).k) != null) {
                                message3.invert_media = njVar8.r;
                            }
                            ua0Var7.i();
                            ua0Var7.U = true;
                            break;
                    }
                }
            });
            this.s.a(b1Var11, w7.b6.o(-1, 48));
            org.telegram.ui.ActionBar.b1 b1Var12 = new org.telegram.ui.ActionBar.b1(1, context, ab0Var.F, false, true);
            b1Var12.j(org.telegram.messenger.cd.L0(2131751363, null), R.drawable.msg_delete, null);
            int i34 = org.telegram.ui.ActionBar.t6.q7;
            int i35 = org.telegram.ui.ActionBar.t6.p7;
            b1Var12.c(i34, i35);
            final int i36 = 9;
            b1Var12.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ja0
                public final /* synthetic */ ua0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i162;
                    TLRPC.Message message;
                    TLRPC.MessageMedia messageMedia;
                    TLRPC.Message message2;
                    TLRPC.MessageMedia messageMedia2;
                    TLRPC.Message message3;
                    TLRPC.Message message4;
                    switch (i36) {
                        case 0:
                            ua0 ua0Var32 = this.b;
                            ua0Var32.c0.d.d = null;
                            ua0Var32.e.f(false);
                            ua0Var32.h(false, false);
                            ua0Var32.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            ua0 ua0Var4 = this.b;
                            oa0 oa0Var2 = ua0Var4.e;
                            ab0 ab0Var2 = ua0Var4.c0;
                            if (ua0Var4.c(null) != null) {
                                if (oa0Var2.v - oa0Var2.u <= org.telegram.messenger.vp.r1(ab0Var2.x).p4) {
                                    org.telegram.ui.Cells.r9 r9Var = oa0Var2.W;
                                    org.telegram.messenger.jj c11 = ua0Var4.c(r9Var != null ? ((org.telegram.ui.Cells.q1) r9Var).getMessageObject() : null);
                                    org.telegram.messenger.nj njVar4 = ab0Var2.d;
                                    int i172 = oa0Var2.u;
                                    njVar4.e = i172;
                                    int i182 = oa0Var2.v;
                                    njVar4.f = i182;
                                    njVar4.d = org.telegram.ui.kn.b(i172, i182, c11);
                                    ab0Var2.b();
                                    ab0Var2.a(true);
                                    break;
                                } else {
                                    ua0Var4.g();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            ua0 ua0Var5 = this.b;
                            oa0 oa0Var3 = ua0Var5.e;
                            ab0 ab0Var3 = ua0Var5.c0;
                            org.telegram.messenger.nj njVar5 = ab0Var3.d;
                            int i192 = ab0Var3.x;
                            boolean z152 = ab0Var3.b;
                            if (njVar5.d != null && !z152) {
                                njVar5.d = null;
                                oa0Var3.f(false);
                                ua0Var5.h(false, true);
                                ua0Var5.l(true);
                                break;
                            } else if (oa0Var3.v - oa0Var3.u <= org.telegram.messenger.vp.r1(i192).p4) {
                                org.telegram.messenger.jj c12 = ua0Var5.c(null);
                                if (c12 != null) {
                                    if (!oa0Var3.x()) {
                                        njVar5.e = 0;
                                        int min = Math.min(org.telegram.messenger.vp.r1(i192).p4, org.telegram.ui.kn.d(c12));
                                        njVar5.f = min;
                                        njVar5.d = org.telegram.ui.kn.b(njVar5.e, min, c12);
                                        View d = ua0Var5.d();
                                        if (d instanceof org.telegram.ui.Cells.q1) {
                                            oa0Var3.a0((org.telegram.ui.Cells.q1) d, njVar5.e, njVar5.f);
                                        }
                                        if (!z152) {
                                            ua0Var5.s.getSwipeBack().e(ua0Var5.I);
                                        }
                                        ua0Var5.h(true, true);
                                        break;
                                    } else {
                                        njVar5.e = oa0Var3.u;
                                        njVar5.f = oa0Var3.v;
                                        org.telegram.ui.Cells.r9 r9Var2 = oa0Var3.W;
                                        njVar5.d = org.telegram.ui.kn.b(njVar5.e, njVar5.f, ua0Var5.c(r9Var2 != null ? ((org.telegram.ui.Cells.q1) r9Var2).getMessageObject() : null));
                                        ab0Var3.b();
                                        ab0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                ua0Var5.g();
                                break;
                            }
                            break;
                        case 3:
                            this.b.c0.c(false);
                            break;
                        case 4:
                            this.b.c0.c(false);
                            break;
                        case 5:
                            this.b.c0.a(true);
                            break;
                        case 6:
                            ab0 ab0Var4 = this.b.c0;
                            if (!ab0Var4.b) {
                                org.telegram.ui.hl hlVar = (org.telegram.ui.hl) ab0Var4;
                                hlVar.a(true);
                                org.telegram.ui.un unVar = hlVar.H;
                                unVar.D5 = null;
                                unVar.B5 = null;
                                unVar.v5.f(null, null, unVar.j6, null);
                                unVar.s8();
                                break;
                            } else {
                                org.telegram.ui.hl hlVar2 = (org.telegram.ui.hl) ab0Var4;
                                hlVar2.a(true);
                                org.telegram.ui.un unVar2 = hlVar2.H;
                                unVar2.B5 = null;
                                unVar2.Ub(unVar2.D5);
                                break;
                            }
                        case 7:
                            this.b.c0.c(true);
                            break;
                        case 8:
                            this.b.c0.a(true);
                            break;
                        case 9:
                            org.telegram.ui.hl hlVar3 = (org.telegram.ui.hl) this.b.c0;
                            hlVar3.a(true);
                            org.telegram.ui.un unVar3 = hlVar3.H;
                            unVar3.v5.d(null, unVar3.j6);
                            unVar3.s8();
                            break;
                        case 10:
                            this.b.c0.a(true);
                            break;
                        case 11:
                            org.telegram.ui.hl hlVar4 = (org.telegram.ui.hl) this.b.c0;
                            hlVar4.a(true);
                            org.telegram.ui.un unVar4 = hlVar4.H;
                            unVar4.W5 = null;
                            org.telegram.ui.mk mkVar = unVar4.Z;
                            if (mkVar != null) {
                                mkVar.X2 = null;
                                mkVar.Y2 = false;
                            }
                            org.telegram.messenger.nj njVar6 = unVar4.v5;
                            if (njVar6 != null) {
                                i162 = ((org.telegram.ui.ActionBar.k2) unVar4).currentAccount;
                                org.telegram.messenger.jj jjVar = unVar4.D5;
                                njVar6.e(i162, null, null, jjVar == unVar4.l4 ? null : jjVar, unVar4.B5, unVar4.F5);
                            }
                            unVar4.s8();
                            break;
                        case 12:
                            ua0 ua0Var6 = this.b;
                            org.telegram.messenger.nj njVar7 = ua0Var6.c0.d;
                            if (njVar7.o) {
                                boolean z16 = !njVar7.q;
                                njVar7.q = z16;
                                ua0Var6.G.a(z16, true);
                                ua0Var6.H.a(njVar7.q, true);
                                if (ua0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.jj) ua0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z17 = njVar7.q;
                                    messageMedia2.force_small_media = z17;
                                    messageMedia2.force_large_media = !z17;
                                }
                                if (ua0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.jj) ua0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                    boolean z18 = njVar7.q;
                                    messageMedia.force_small_media = z18;
                                    messageMedia.force_large_media = !z18;
                                }
                                ua0Var6.i();
                                ua0Var6.U = true;
                                break;
                            }
                            break;
                        default:
                            ua0 ua0Var7 = this.b;
                            org.telegram.messenger.nj njVar8 = ua0Var7.c0.d;
                            boolean z19 = njVar8.r;
                            njVar8.r = !z19;
                            ua0Var7.E.a(z19, true);
                            if (ua0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.jj) ua0Var7.r.e.get(0)).k) != null) {
                                message4.invert_media = njVar8.r;
                            }
                            if (ua0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.jj) ua0Var7.r.f.get(0)).k) != null) {
                                message3.invert_media = njVar8.r;
                            }
                            ua0Var7.i();
                            ua0Var7.U = true;
                            break;
                    }
                }
            });
            b1Var12.h(0.12f, i35);
            this.s.a(b1Var12, w7.b6.o(-1, 48));
            za0 za0Var8 = za0Var;
            za0Var8.a(njVar.k, false);
            za0 za0Var9 = za0Var2;
            ua0 ua0Var4 = this;
            za0Var8.setOnClickListener(new ma0(this, z10, context, za0Var9, za0Var8, 0));
            ua0Var = ua0Var4;
            if (za0Var9 != null) {
                za0Var9.setOnClickListener(new ag.i(ua0Var4, za0Var9, za0Var8, 18));
                ua0Var = ua0Var4;
            }
        }
        context2 = context;
        ua0Var2 = ua0Var;
        viewOutlineProvider = null;
        i11 = ua0Var2.a;
        if (i11 == 1) {
        }
        n10 = ua0Var2.e.n(context2);
        ua0Var2.d = n10;
        n10.setElevation(org.telegram.messenger.i0.L(8.0f));
        n10.setOutlineProvider(viewOutlineProvider);
        if (n10.getParent() instanceof ViewGroup) {
        }
        ua0Var2.addView(n10, w7.b6.d(-1, -1.0f, 51, 0.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / org.telegram.messenger.i0.p, 0.0f, 0.0f));
        ua0Var2.e.S(ua0Var2.f);
    }

    public static org.telegram.messenger.ej a(ua0 ua0Var, org.telegram.messenger.jj jjVar) {
        if (jjVar.d1() == 0) {
            return null;
        }
        org.telegram.messenger.ej ejVar = (org.telegram.messenger.ej) ua0Var.r.d.get(jjVar.d1());
        if (ejVar == null || (ejVar.d.size() > 1 && ejVar.d(jjVar) != null)) {
            return ejVar;
        }
        return null;
    }

    public static void b(ua0 ua0Var, org.telegram.ui.Cells.q1 q1Var) {
        URLSpan uRLSpan;
        TLRPC.WebPage webPage;
        if (ua0Var.a == 2) {
            org.telegram.messenger.nj njVar = ua0Var.c0.d;
            if (!njVar.n && (uRLSpan = njVar.w) != null && (webPage = njVar.v) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                q1Var.m3(uRLSpan);
                return;
            }
        }
        q1Var.m3(null);
    }

    public final org.telegram.messenger.jj c(org.telegram.messenger.jj jjVar) {
        org.telegram.messenger.ej ejVar;
        org.telegram.messenger.nj njVar = this.c0.d;
        org.telegram.messenger.lj ljVar = njVar.a;
        if (ljVar == null) {
            return null;
        }
        LongSparseArray longSparseArray = ljVar.d;
        if (longSparseArray == null || longSparseArray.size() <= 0 || (ejVar = (org.telegram.messenger.ej) njVar.a.d.valueAt(0)) == null) {
            return (org.telegram.messenger.jj) njVar.a.e.get(0);
        }
        if (ejVar.i) {
            if (jjVar != null) {
                return jjVar;
            }
            org.telegram.ui.kn knVar = njVar.d;
            if (knVar != null) {
                return knVar.a;
            }
        }
        return ejVar.h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        return r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View d() {
        org.telegram.messenger.jj c10 = c(null);
        if (c10 != null) {
            int i10 = 0;
            while (true) {
                ag.b1 b1Var = this.f;
                if (i10 >= b1Var.getChildCount()) {
                    break;
                }
                View childAt = b1Var.getChildAt(i10);
                org.telegram.ui.Cells.r4 r4Var = (org.telegram.ui.Cells.r4) childAt;
                if (r4Var.getMessageObject() != null && (r4Var.getMessageObject() == c10 || r4Var.getMessageObject().f1() == c10.f1())) {
                    break;
                }
                i10++;
            }
        }
        return null;
    }

    public final boolean e(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.jj c10;
        if (q1Var == null || q1Var.getMessageObject() == null || (c10 = c(null)) == null) {
            return false;
        }
        return q1Var.getMessageObject() == c10 || q1Var.getMessageObject().f1() == c10.f1();
    }

    public final void f(float f7, int i10) {
        boolean z10 = this.c0.w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        ia0 ia0Var = this.c;
        org.telegram.ui.w8 w8Var = this.b;
        if (z10) {
            ia0Var.setTranslationY(0.0f);
            w8Var.invalidateOutline();
            w8Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            ia0Var.setTranslationY(i10);
            w8Var.invalidateOutline();
            w8Var.setTranslationY(f7);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((f7 + w8Var.getMeasuredHeight()) - org.telegram.messenger.i0.L(2.0f));
        }
        float x10 = w8Var.getX();
        org.telegram.ui.Cells.v9 v9Var = this.d;
        v9Var.setTranslationX(x10);
        v9Var.setTranslationY(w8Var.getY());
    }

    public final void g() {
        ab0 ab0Var = this.c0;
        new cc(ab0Var, ab0Var.F).I(R.raw.error, org.telegram.messenger.cd.L0(2131746452, null), org.telegram.messenger.cd.L0(2131746451, null)).j();
    }

    public final void h(boolean z10, boolean z11) {
        if (this.c0.b) {
            z10 = false;
        }
        if (z11 && this.O == z10) {
            return;
        }
        this.O = z10;
        AnimatorSet animatorSet = this.P;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.P = null;
        }
        org.telegram.ui.ActionBar.b1 b1Var = this.D;
        org.telegram.ui.ActionBar.b1 b1Var2 = this.y;
        na0 na0Var = this.x;
        na0 na0Var2 = this.w;
        if (!z11) {
            if (na0Var2 != null) {
                na0Var2.setAlpha(!z10 ? 1.0f : 0.0f);
                na0Var2.setVisibility(!z10 ? 0 : 4);
            }
            if (na0Var != null) {
                na0Var.setAlpha(z10 ? 1.0f : 0.0f);
                na0Var.setVisibility(z10 ? 0 : 4);
            }
            if (b1Var2 != null) {
                b1Var2.setAlpha(!z10 ? 1.0f : 0.0f);
                b1Var2.setVisibility(!z10 ? 0 : 4);
            }
            if (b1Var != null) {
                b1Var.setAlpha(z10 ? 1.0f : 0.0f);
                b1Var.setVisibility(z10 ? 0 : 4);
                return;
            }
            return;
        }
        this.P = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        Property property = View.ALPHA;
        if (na0Var2 != null) {
            na0Var2.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(na0Var2, (Property<na0, Float>) property, !z10 ? 1.0f : 0.0f));
        }
        if (na0Var != null) {
            na0Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(na0Var, (Property<na0, Float>) property, z10 ? 1.0f : 0.0f));
        }
        if (b1Var2 != null) {
            b1Var2.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(b1Var2, (Property<org.telegram.ui.ActionBar.b1, Float>) property, !z10 ? 1.0f : 0.0f));
        }
        if (b1Var != null) {
            b1Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(b1Var, (Property<org.telegram.ui.ActionBar.b1, Float>) property, z10 ? 1.0f : 0.0f));
        }
        this.P.playTogether(arrayList);
        this.P.setDuration(360L);
        this.P.setInterpolator(gr.h);
        this.P.addListener(new ha0(i10, this, z10));
        this.P.start();
    }

    public final void i() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        ab0 ab0Var = this.c0;
        org.telegram.messenger.nj njVar = ab0Var.d;
        qa0 qa0Var = this.h;
        if (qa0Var.k()) {
            this.V = true;
            return;
        }
        for (int i10 = 0; i10 < this.r.f.size(); i10++) {
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) this.r.f.get(i10);
            jjVar.K1 = true;
            jjVar.f2 = ab0Var.a;
            if (njVar.k) {
                jjVar.k.flags &= -5;
                jjVar.e2 = true;
            } else {
                jjVar.k.flags |= 4;
                jjVar.e2 = false;
            }
            if (this.a == 2) {
                TLRPC.WebPage webPage = njVar.v;
                if (webPage != null && ((messageMedia = (message = jjVar.k).media) == null || messageMedia.webpage != webPage)) {
                    message.flags |= 512;
                    message.media = new TLRPC.TL_messageMediaWebPage();
                    TLRPC.MessageMedia messageMedia2 = jjVar.k.media;
                    messageMedia2.webpage = njVar.v;
                    boolean z10 = njVar.q;
                    messageMedia2.force_large_media = !z10;
                    messageMedia2.force_small_media = z10;
                    messageMedia2.manual = true;
                    jjVar.y = null;
                    jjVar.o0();
                    jjVar.n0 = null;
                    jjVar.o0 = null;
                    jjVar.l0 = null;
                    jjVar.m0 = null;
                    jjVar.r0(true);
                    jjVar.K(true);
                } else if (webPage == null) {
                    TLRPC.Message message2 = jjVar.k;
                    message2.flags &= -513;
                    message2.media = null;
                }
            }
            if (njVar.l) {
                jjVar.z = null;
            } else {
                jjVar.k0();
            }
            if (jjVar.T3()) {
                org.telegram.messenger.mj mjVar = (org.telegram.messenger.mj) jjVar.k.media;
                mjVar.results.total_voters = njVar.l ? 0 : mjVar.a;
            }
        }
        for (int i11 = 0; i11 < this.r.h.size(); i11++) {
            ((TLRPC.PollAnswerVoters) this.r.h.get(i11)).chosen = !njVar.k;
        }
        for (int i12 = 0; i12 < this.r.d.size(); i12++) {
            qa0Var.V((org.telegram.messenger.ej) this.r.d.valueAt(i12));
        }
        this.n.k(0, this.r.f.size());
    }

    public final void j() {
        int i10 = this.R;
        float f7 = this.S;
        ab0 ab0Var = this.c0;
        boolean z10 = ab0Var.w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        ag.b1 b1Var = this.f;
        if (z10) {
            this.S = 0.0f;
            this.R = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(org.telegram.messenger.i0.L(8.0f) + b1Var.getMeasuredWidth());
        } else {
            int measuredHeight = b1Var.getMeasuredHeight();
            int i11 = 0;
            for (int i12 = 0; i12 < b1Var.getChildCount(); i12++) {
                View childAt = b1Var.getChildAt(i12);
                if (RecyclerView.R(childAt) != -1) {
                    measuredHeight = Math.min(measuredHeight, childAt.getTop());
                    i11++;
                }
            }
            org.telegram.messenger.lj ljVar = this.r;
            if (ljVar == null || i11 == 0 || i11 > ljVar.f.size()) {
                this.R = 0;
            } else {
                int d = i0.a.d(4.0f, measuredHeight, 0);
                this.R = d;
                this.R = Math.min(((b1Var.getMeasuredHeight() - this.R) + d) - ((int) ((((org.telegram.messenger.i0.q.y - (Build.VERSION.SDK_INT >= 35 ? org.telegram.messenger.i0.n : 0)) * 0.8f) - this.W) - org.telegram.messenger.i0.L(8.0f))), this.R);
            }
            float B = c3.i0.B(getMeasuredHeight() - org.telegram.messenger.i0.L(16.0f), (this.b.getMeasuredHeight() - this.R) + (this.W - org.telegram.messenger.i0.L(8.0f)), 2.0f, org.telegram.messenger.i0.L(8.0f)) - this.R;
            this.S = B;
            if (B > org.telegram.messenger.i0.L(8.0f)) {
                this.S = org.telegram.messenger.i0.L(8.0f);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        }
        boolean z11 = this.K;
        if (z11 || (this.R == i10 && this.S == f7)) {
            if (z11) {
                float f10 = this.S;
                int i13 = this.R;
                this.T = i13;
                f(f10, i13);
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = ab0Var.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ab0Var.h = ofFloat;
        ofFloat.addUpdateListener(new gj(this, i10, f7, 1));
        ab0Var.h.setDuration(250L);
        ab0Var.h.setInterpolator(ci.o.V);
        ab0Var.h.addListener(new t60(this, 4));
        org.telegram.messenger.i0.h3(ab0Var.D, 50L);
        this.T = i10;
        f(f7, i10);
    }

    public final void k() {
        org.telegram.messenger.jj jjVar;
        ab0 ab0Var = this.c0;
        org.telegram.messenger.nj njVar = ab0Var.d;
        if (this.a == 0) {
            oa0 oa0Var = this.e;
            if (oa0Var.v - oa0Var.u > org.telegram.messenger.vp.r1(ab0Var.x).p4) {
                return;
            }
            org.telegram.ui.Cells.r9 r9Var = oa0Var.W;
            org.telegram.messenger.jj c10 = c(r9Var != null ? ((org.telegram.ui.Cells.q1) r9Var).getMessageObject() : null);
            if (njVar.d != null && oa0Var.x()) {
                njVar.e = oa0Var.u;
                njVar.f = oa0Var.v;
                if (c10 != null) {
                    org.telegram.ui.kn knVar = njVar.d;
                    if (knVar.m || (jjVar = knVar.a) == null || jjVar.f1() != c10.f1()) {
                        njVar.d = org.telegram.ui.kn.b(njVar.e, njVar.f, c10);
                        ab0Var.b();
                    }
                }
            }
            oa0Var.f(false);
        }
    }

    public final void l(boolean z10) {
        ab0 ab0Var = this.c0;
        TLRPC.User user = ab0Var.n;
        org.telegram.messenger.nj njVar = ab0Var.d;
        TLRPC.Chat chat = ab0Var.r;
        ia0 ia0Var = this.c;
        int i10 = this.a;
        if (i10 == 1) {
            org.telegram.messenger.lj ljVar = njVar.b;
            ia0Var.b(org.telegram.messenger.cd.G(ljVar == null ? 0 : ljVar.g.size(), "PreviewForwardMessagesCount", new Object[0]), z10);
            ia0Var.a(!njVar.h ? njVar.m ? user != null ? org.telegram.messenger.cd.a0("ForwardPreviewSendersNameVisible", null, 2131750581, org.telegram.messenger.i5.m(0, user.first_name, user.last_name)) : (!org.telegram.messenger.w3.T(chat) || chat.megagroup) ? org.telegram.messenger.cd.L0(2131750579, null) : org.telegram.messenger.cd.L0(2131750580, null) : user != null ? org.telegram.messenger.cd.a0("ForwardPreviewSendersNameVisible", null, 2131750581, org.telegram.messenger.i5.m(0, user.first_name, user.last_name)) : (!org.telegram.messenger.w3.T(chat) || chat.megagroup) ? org.telegram.messenger.cd.L0(2131750582, null) : org.telegram.messenger.cd.L0(2131750583, null) : !njVar.k ? user != null ? org.telegram.messenger.cd.a0("ForwardPreviewSendersNameVisible", null, 2131750581, org.telegram.messenger.i5.m(0, user.first_name, user.last_name)) : (!org.telegram.messenger.w3.T(chat) || chat.megagroup) ? org.telegram.messenger.cd.L0(2131750579, null) : org.telegram.messenger.cd.L0(2131750580, null) : user != null ? org.telegram.messenger.cd.a0("ForwardPreviewSendersNameHidden", null, 2131750584, org.telegram.messenger.i5.m(0, user.first_name, user.last_name)) : (!org.telegram.messenger.w3.T(chat) || chat.megagroup) ? org.telegram.messenger.cd.L0(2131750582, null) : org.telegram.messenger.cd.L0(2131750583, null), z10);
        } else {
            if (i10 != 0) {
                if (i10 == 2) {
                    ia0Var.b(org.telegram.messenger.cd.L0(2131748563, null), z10);
                    ia0Var.a(org.telegram.messenger.cd.L0(2131748564, null), z10);
                    return;
                }
                return;
            }
            if (njVar.d == null || !njVar.a.j) {
                ia0Var.b(org.telegram.messenger.cd.L0(2131748560, null), z10);
                ia0Var.a(njVar.a.j ? org.telegram.messenger.cd.L0(2131748561, null) : "", z10);
            } else {
                ia0Var.b(org.telegram.messenger.cd.L0(2131746895, null), z10);
                ia0Var.a(org.telegram.messenger.cd.L0(2131746894, null), z10);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a == 0) {
            org.telegram.messenger.i0.d0(this.f, new r2(this, 7));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
        this.b0 = true;
        this.K = true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        j();
        this.K = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10 = View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11);
        ab0 ab0Var = this.c0;
        ab0Var.w = z10;
        this.W = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i10, makeMeasureSpec);
        int i12 = this.W;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.Q;
        this.W = Math.max(i12, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        boolean z11 = ab0Var.w;
        org.telegram.ui.w8 w8Var = this.b;
        if (z11) {
            w8Var.getLayoutParams().height = -1;
            ((ViewGroup.MarginLayoutParams) w8Var.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(8.0f);
            ((ViewGroup.MarginLayoutParams) w8Var.getLayoutParams()).bottomMargin = org.telegram.messenger.i0.L(8.0f);
            w8Var.getLayoutParams().width = (int) Math.min(View.MeasureSpec.getSize(i10), Math.max(org.telegram.messenger.i0.L(340.0f), View.MeasureSpec.getSize(i10) * 0.6f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) w8Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) w8Var.getLayoutParams()).bottomMargin = 0;
            w8Var.getLayoutParams().height = (View.MeasureSpec.getSize(i11) - org.telegram.messenger.i0.L(6.0f)) - this.W;
            if (w8Var.getLayoutParams().height < View.MeasureSpec.getSize(i11) * 0.5f) {
                w8Var.getLayoutParams().height = (int) (View.MeasureSpec.getSize(i11) * 0.5f);
            }
            w8Var.getLayoutParams().width = -1;
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = View.MeasureSpec.getSize(i11) - w8Var.getLayoutParams().height;
        }
        int size = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.a0 != size) {
            for (int i13 = 0; i13 < this.r.f.size(); i13++) {
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) this.r.f.get(i13);
                jjVar.b2 = ab0Var.w ? w8Var.getLayoutParams().width : View.MeasureSpec.getSize(i10) - org.telegram.messenger.i0.L(16.0f);
                jjVar.Q1 = false;
                jjVar.K1 = true;
                org.telegram.ui.x7 x7Var = this.n;
                if (x7Var != null) {
                    x7Var.f();
                }
            }
            this.K = true;
        }
        this.a0 = size;
        super.onMeasure(i10, i11);
    }
}
