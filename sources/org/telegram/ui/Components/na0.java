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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class na0 extends FrameLayout {
    public final org.telegram.ui.ActionBar.y0 E;
    public final sa0 F;
    public final FrameLayout G;
    public final sa0 H;
    public final sa0 I;
    public final int J;
    public final h6.m K;
    public boolean L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public AnimatorSet Q;
    public final Rect R;
    public int S;
    public float T;
    public int U;
    public boolean V;
    public boolean W;
    public final int a;
    public int a0;
    public final org.telegram.ui.w8 b;
    public int b0;
    public final ba0 c;
    public boolean c0;
    public final org.telegram.ui.Cells.u9 d;
    public final /* synthetic */ ta0 d0;
    public final ha0 e;
    public final di.b1 f;
    public final ja0 h;
    public final org.telegram.ui.z7 n;
    public org.telegram.messenger.hj r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout s;
    public final ga0 w;
    public final ga0 x;
    public final org.telegram.ui.ActionBar.y0 y;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x06f5  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [android.graphics.drawable.Drawable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v8, types: [android.graphics.drawable.Drawable, java.lang.String, org.telegram.ui.ActionBar.q6] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public na0(ta0 ta0Var, Context context, int i7) {
        super(r4);
        org.telegram.messenger.jj jjVar;
        ViewOutlineProvider viewOutlineProvider;
        Context context2;
        na0 na0Var;
        boolean z10;
        sa0 sa0Var;
        sa0 sa0Var2;
        na0 na0Var2;
        int i10;
        org.telegram.ui.Cells.u9 n10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        org.telegram.messenger.jj jjVar2;
        ?? r13;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3;
        org.telegram.messenger.jj jjVar3;
        boolean z11;
        Object obj;
        int i11;
        Context context3 = context;
        this.d0 = ta0Var;
        this.L = true;
        this.M = -1;
        this.N = -1;
        final int i12 = 0;
        this.O = false;
        this.R = new Rect();
        this.V = false;
        this.c0 = true;
        this.K = new h6.m(context3);
        this.a = i7;
        int i13 = 5;
        setOnTouchListener(new ok(this, i13));
        org.telegram.ui.w8 w8Var = new org.telegram.ui.w8(1, context3, this);
        this.b = w8Var;
        pa0 pa0Var = ta0Var.G;
        boolean z12 = ta0Var.b;
        org.telegram.messenger.jj jjVar4 = ta0Var.d;
        Drawable m10 = ((org.telegram.ui.zm) pa0Var).m();
        if (((org.telegram.ui.zm) pa0Var).f == null) {
            int i14 = org.telegram.ui.ActionBar.n6.a;
        }
        w8Var.U(m10);
        w8Var.setOccupyStatusBar(false);
        w8Var.setOutlineProvider(new fh.a(this, i13));
        w8Var.setClipToOutline(true);
        w8Var.setElevation(org.telegram.messenger.g0.L(4.0f));
        ba0 ba0Var = new ba0(context3, pa0Var);
        this.c = ba0Var;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.s8, ba0Var, pa0Var);
        ha0 ha0Var = new ha0(this);
        this.e = ha0Var;
        ha0Var.D = new fi.b2(this, 2);
        di.b1 b1Var = new di.b1(this, context3, pa0Var, 21);
        this.f = b1Var;
        ja0 ja0Var = new ja0(this, b1Var, pa0Var);
        this.h = ja0Var;
        b1Var.setItemAnimator(ja0Var);
        b1Var.setOnScrollListener(new na(this, 13));
        b1Var.setOnItemClickListener(new ka0(this));
        org.telegram.ui.z7 z7Var = new org.telegram.ui.z7(this, i13);
        this.n = z7Var;
        b1Var.setAdapter(z7Var);
        b1Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        fa0 fa0Var = new fa0(this, i12);
        fa0Var.O = new bi.y2(this, 12);
        b1Var.setClipToPadding(false);
        b1Var.setLayoutManager(fa0Var);
        b1Var.i(new fi.k(8));
        w8Var.addView(b1Var);
        addView(w8Var, c8.na.d(-1, 400.0f, 0, 8.0f, 0.0f, 8.0f, 0.0f));
        w8Var.addView(ba0Var, c8.na.c(-2.0f, -1));
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 1, getContext(), pa0Var);
        this.s = actionBarPopupWindow$ActionBarPopupWindowLayout4;
        actionBarPopupWindow$ActionBarPopupWindowLayout4.getSwipeBack().setOnForegroundOpenFinished(new ea0(this, 1));
        fh.g c10 = ta0Var.H.c(actionBarPopupWindow$ActionBarPopupWindowLayout4, null, false);
        c10.p(c8.j0.l(pa0Var));
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.R.e = true;
        c10.r(org.telegram.messenger.g0.L(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout4.setBackground(c10);
        addView(actionBarPopupWindow$ActionBarPopupWindowLayout4, c8.na.c(-2.0f, -2));
        if (i7 == 0) {
            org.telegram.messenger.hj hjVar = jjVar4.a;
            boolean z13 = jjVar4.s;
            if (hjVar != null) {
                if (!hjVar.j || jjVar4.i) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                    jjVar2 = jjVar4;
                    r13 = 0;
                } else {
                    LinearLayout g10 = org.telegram.messenger.f3.g(context3, 1);
                    if (z12) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                        jjVar3 = jjVar4;
                        z11 = true;
                        obj = null;
                        i11 = 2131746234;
                    } else {
                        jjVar3 = jjVar4;
                        actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                        obj = null;
                        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, context3, ta0Var.G, true, false);
                        y0Var.j(org.telegram.messenger.gd.N0(2131753753, null), R.drawable.msg_arrow_back, null);
                        y0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ca0
                            public final /* synthetic */ na0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i15;
                                TLRPC.Message message;
                                TLRPC.MessageMedia messageMedia;
                                TLRPC.Message message2;
                                TLRPC.MessageMedia messageMedia2;
                                TLRPC.Message message3;
                                TLRPC.Message message4;
                                switch (i12) {
                                    case 0:
                                        na0 na0Var3 = this.b;
                                        na0Var3.d0.d.d = null;
                                        na0Var3.e.f(false);
                                        na0Var3.h(false, false);
                                        na0Var3.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        na0 na0Var4 = this.b;
                                        ha0 ha0Var2 = na0Var4.e;
                                        ta0 ta0Var2 = na0Var4.d0;
                                        if (na0Var4.c(null) != null) {
                                            if (ha0Var2.v - ha0Var2.u <= org.telegram.messenger.mp.u1(ta0Var2.x).r4) {
                                                org.telegram.ui.Cells.q9 q9Var = ha0Var2.W;
                                                org.telegram.messenger.fj c11 = na0Var4.c(q9Var != null ? ((org.telegram.ui.Cells.r1) q9Var).getMessageObject() : null);
                                                org.telegram.messenger.jj jjVar5 = ta0Var2.d;
                                                int i16 = ha0Var2.u;
                                                jjVar5.e = i16;
                                                int i17 = ha0Var2.v;
                                                jjVar5.f = i17;
                                                jjVar5.d = org.telegram.ui.rm.b(i16, i17, c11);
                                                ta0Var2.b();
                                                ta0Var2.a(true);
                                                break;
                                            } else {
                                                na0Var4.g();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        na0 na0Var5 = this.b;
                                        ha0 ha0Var3 = na0Var5.e;
                                        ta0 ta0Var3 = na0Var5.d0;
                                        org.telegram.messenger.jj jjVar6 = ta0Var3.d;
                                        int i18 = ta0Var3.x;
                                        boolean z14 = ta0Var3.b;
                                        if (jjVar6.d != null && !z14) {
                                            jjVar6.d = null;
                                            ha0Var3.f(false);
                                            na0Var5.h(false, true);
                                            na0Var5.l(true);
                                            break;
                                        } else if (ha0Var3.v - ha0Var3.u <= org.telegram.messenger.mp.u1(i18).r4) {
                                            org.telegram.messenger.fj c12 = na0Var5.c(null);
                                            if (c12 != null) {
                                                if (!ha0Var3.x()) {
                                                    jjVar6.e = 0;
                                                    int min = Math.min(org.telegram.messenger.mp.u1(i18).r4, org.telegram.ui.rm.d(c12));
                                                    jjVar6.f = min;
                                                    jjVar6.d = org.telegram.ui.rm.b(jjVar6.e, min, c12);
                                                    View d = na0Var5.d();
                                                    if (d instanceof org.telegram.ui.Cells.r1) {
                                                        ha0Var3.a0((org.telegram.ui.Cells.r1) d, jjVar6.e, jjVar6.f);
                                                    }
                                                    if (!z14) {
                                                        na0Var5.s.getSwipeBack().e(na0Var5.J);
                                                    }
                                                    na0Var5.h(true, true);
                                                    break;
                                                } else {
                                                    jjVar6.e = ha0Var3.u;
                                                    jjVar6.f = ha0Var3.v;
                                                    org.telegram.ui.Cells.q9 q9Var2 = ha0Var3.W;
                                                    jjVar6.d = org.telegram.ui.rm.b(jjVar6.e, jjVar6.f, na0Var5.c(q9Var2 != null ? ((org.telegram.ui.Cells.r1) q9Var2).getMessageObject() : null));
                                                    ta0Var3.b();
                                                    ta0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            na0Var5.g();
                                            break;
                                        }
                                        break;
                                    case 3:
                                        this.b.d0.c(false);
                                        break;
                                    case 4:
                                        this.b.d0.c(false);
                                        break;
                                    case 5:
                                        this.b.d0.a(true);
                                        break;
                                    case 6:
                                        ta0 ta0Var4 = this.b.d0;
                                        if (!ta0Var4.b) {
                                            org.telegram.ui.mk mkVar = (org.telegram.ui.mk) ta0Var4;
                                            mkVar.a(true);
                                            org.telegram.ui.bn bnVar = mkVar.I;
                                            bnVar.F5 = null;
                                            bnVar.D5 = null;
                                            bnVar.x5.f(null, null, bnVar.l6, null);
                                            bnVar.B8();
                                            break;
                                        } else {
                                            org.telegram.ui.mk mkVar2 = (org.telegram.ui.mk) ta0Var4;
                                            mkVar2.a(true);
                                            org.telegram.ui.bn bnVar2 = mkVar2.I;
                                            bnVar2.D5 = null;
                                            bnVar2.ic(bnVar2.F5);
                                            break;
                                        }
                                    case 7:
                                        this.b.d0.c(true);
                                        break;
                                    case 8:
                                        this.b.d0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.mk mkVar3 = (org.telegram.ui.mk) this.b.d0;
                                        mkVar3.a(true);
                                        org.telegram.ui.bn bnVar3 = mkVar3.I;
                                        bnVar3.x5.d(null, bnVar3.l6);
                                        bnVar3.B8();
                                        break;
                                    case 10:
                                        this.b.d0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.mk mkVar4 = (org.telegram.ui.mk) this.b.d0;
                                        mkVar4.a(true);
                                        org.telegram.ui.bn bnVar4 = mkVar4.I;
                                        bnVar4.Y5 = null;
                                        org.telegram.ui.rj rjVar = bnVar4.a0;
                                        if (rjVar != null) {
                                            rjVar.N3 = null;
                                            rjVar.O3 = false;
                                        }
                                        org.telegram.messenger.jj jjVar7 = bnVar4.x5;
                                        if (jjVar7 != null) {
                                            i15 = ((org.telegram.ui.ActionBar.g2) bnVar4).currentAccount;
                                            org.telegram.messenger.fj fjVar = bnVar4.F5;
                                            jjVar7.e(i15, null, null, fjVar == bnVar4.m4 ? null : fjVar, bnVar4.D5, bnVar4.H5);
                                        }
                                        bnVar4.B8();
                                        break;
                                    case 12:
                                        na0 na0Var6 = this.b;
                                        org.telegram.messenger.jj jjVar8 = na0Var6.d0.d;
                                        if (jjVar8.o) {
                                            boolean z15 = !jjVar8.q;
                                            jjVar8.q = z15;
                                            na0Var6.H.a(z15, true);
                                            na0Var6.I.a(jjVar8.q, true);
                                            if (na0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.fj) na0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z16 = jjVar8.q;
                                                messageMedia2.force_small_media = z16;
                                                messageMedia2.force_large_media = !z16;
                                            }
                                            if (na0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.fj) na0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                                boolean z17 = jjVar8.q;
                                                messageMedia.force_small_media = z17;
                                                messageMedia.force_large_media = !z17;
                                            }
                                            na0Var6.i();
                                            na0Var6.V = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        na0 na0Var7 = this.b;
                                        org.telegram.messenger.jj jjVar9 = na0Var7.d0.d;
                                        boolean z18 = jjVar9.r;
                                        jjVar9.r = !z18;
                                        na0Var7.F.a(z18, true);
                                        if (na0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.fj) na0Var7.r.e.get(0)).k) != null) {
                                            message4.invert_media = jjVar9.r;
                                        }
                                        if (na0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.fj) na0Var7.r.f.get(0)).k) != null) {
                                            message3.invert_media = jjVar9.r;
                                        }
                                        na0Var7.i();
                                        na0Var7.V = true;
                                        break;
                                }
                            }
                        });
                        g10.addView(y0Var, c8.na.o(-1, 48));
                        org.telegram.ui.ActionBar.d1 d1Var = new org.telegram.ui.ActionBar.d1(context3, pa0Var);
                        org.telegram.ui.ActionBar.u6.i(d1Var, org.telegram.ui.ActionBar.u6.K(0.06f, org.telegram.ui.ActionBar.n6.E8), pa0Var);
                        d1Var.setTag(R.id.fit_width_tag, 1);
                        g10.addView(d1Var, c8.na.o(-1, 8));
                        org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(0, context3, ta0Var.G, false, true);
                        i11 = 2131746234;
                        y0Var2.j(org.telegram.messenger.gd.N0(2131746234, null), R.drawable.menu_quote_specific, null);
                        z11 = true;
                        final boolean z14 = true ? 1 : 0;
                        y0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ca0
                            public final /* synthetic */ na0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i15;
                                TLRPC.Message message;
                                TLRPC.MessageMedia messageMedia;
                                TLRPC.Message message2;
                                TLRPC.MessageMedia messageMedia2;
                                TLRPC.Message message3;
                                TLRPC.Message message4;
                                switch (z14) {
                                    case 0:
                                        na0 na0Var3 = this.b;
                                        na0Var3.d0.d.d = null;
                                        na0Var3.e.f(false);
                                        na0Var3.h(false, false);
                                        na0Var3.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        na0 na0Var4 = this.b;
                                        ha0 ha0Var2 = na0Var4.e;
                                        ta0 ta0Var2 = na0Var4.d0;
                                        if (na0Var4.c(null) != null) {
                                            if (ha0Var2.v - ha0Var2.u <= org.telegram.messenger.mp.u1(ta0Var2.x).r4) {
                                                org.telegram.ui.Cells.q9 q9Var = ha0Var2.W;
                                                org.telegram.messenger.fj c11 = na0Var4.c(q9Var != null ? ((org.telegram.ui.Cells.r1) q9Var).getMessageObject() : null);
                                                org.telegram.messenger.jj jjVar5 = ta0Var2.d;
                                                int i16 = ha0Var2.u;
                                                jjVar5.e = i16;
                                                int i17 = ha0Var2.v;
                                                jjVar5.f = i17;
                                                jjVar5.d = org.telegram.ui.rm.b(i16, i17, c11);
                                                ta0Var2.b();
                                                ta0Var2.a(true);
                                                break;
                                            } else {
                                                na0Var4.g();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        na0 na0Var5 = this.b;
                                        ha0 ha0Var3 = na0Var5.e;
                                        ta0 ta0Var3 = na0Var5.d0;
                                        org.telegram.messenger.jj jjVar6 = ta0Var3.d;
                                        int i18 = ta0Var3.x;
                                        boolean z142 = ta0Var3.b;
                                        if (jjVar6.d != null && !z142) {
                                            jjVar6.d = null;
                                            ha0Var3.f(false);
                                            na0Var5.h(false, true);
                                            na0Var5.l(true);
                                            break;
                                        } else if (ha0Var3.v - ha0Var3.u <= org.telegram.messenger.mp.u1(i18).r4) {
                                            org.telegram.messenger.fj c12 = na0Var5.c(null);
                                            if (c12 != null) {
                                                if (!ha0Var3.x()) {
                                                    jjVar6.e = 0;
                                                    int min = Math.min(org.telegram.messenger.mp.u1(i18).r4, org.telegram.ui.rm.d(c12));
                                                    jjVar6.f = min;
                                                    jjVar6.d = org.telegram.ui.rm.b(jjVar6.e, min, c12);
                                                    View d = na0Var5.d();
                                                    if (d instanceof org.telegram.ui.Cells.r1) {
                                                        ha0Var3.a0((org.telegram.ui.Cells.r1) d, jjVar6.e, jjVar6.f);
                                                    }
                                                    if (!z142) {
                                                        na0Var5.s.getSwipeBack().e(na0Var5.J);
                                                    }
                                                    na0Var5.h(true, true);
                                                    break;
                                                } else {
                                                    jjVar6.e = ha0Var3.u;
                                                    jjVar6.f = ha0Var3.v;
                                                    org.telegram.ui.Cells.q9 q9Var2 = ha0Var3.W;
                                                    jjVar6.d = org.telegram.ui.rm.b(jjVar6.e, jjVar6.f, na0Var5.c(q9Var2 != null ? ((org.telegram.ui.Cells.r1) q9Var2).getMessageObject() : null));
                                                    ta0Var3.b();
                                                    ta0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            na0Var5.g();
                                            break;
                                        }
                                        break;
                                    case 3:
                                        this.b.d0.c(false);
                                        break;
                                    case 4:
                                        this.b.d0.c(false);
                                        break;
                                    case 5:
                                        this.b.d0.a(true);
                                        break;
                                    case 6:
                                        ta0 ta0Var4 = this.b.d0;
                                        if (!ta0Var4.b) {
                                            org.telegram.ui.mk mkVar = (org.telegram.ui.mk) ta0Var4;
                                            mkVar.a(true);
                                            org.telegram.ui.bn bnVar = mkVar.I;
                                            bnVar.F5 = null;
                                            bnVar.D5 = null;
                                            bnVar.x5.f(null, null, bnVar.l6, null);
                                            bnVar.B8();
                                            break;
                                        } else {
                                            org.telegram.ui.mk mkVar2 = (org.telegram.ui.mk) ta0Var4;
                                            mkVar2.a(true);
                                            org.telegram.ui.bn bnVar2 = mkVar2.I;
                                            bnVar2.D5 = null;
                                            bnVar2.ic(bnVar2.F5);
                                            break;
                                        }
                                    case 7:
                                        this.b.d0.c(true);
                                        break;
                                    case 8:
                                        this.b.d0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.mk mkVar3 = (org.telegram.ui.mk) this.b.d0;
                                        mkVar3.a(true);
                                        org.telegram.ui.bn bnVar3 = mkVar3.I;
                                        bnVar3.x5.d(null, bnVar3.l6);
                                        bnVar3.B8();
                                        break;
                                    case 10:
                                        this.b.d0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.mk mkVar4 = (org.telegram.ui.mk) this.b.d0;
                                        mkVar4.a(true);
                                        org.telegram.ui.bn bnVar4 = mkVar4.I;
                                        bnVar4.Y5 = null;
                                        org.telegram.ui.rj rjVar = bnVar4.a0;
                                        if (rjVar != null) {
                                            rjVar.N3 = null;
                                            rjVar.O3 = false;
                                        }
                                        org.telegram.messenger.jj jjVar7 = bnVar4.x5;
                                        if (jjVar7 != null) {
                                            i15 = ((org.telegram.ui.ActionBar.g2) bnVar4).currentAccount;
                                            org.telegram.messenger.fj fjVar = bnVar4.F5;
                                            jjVar7.e(i15, null, null, fjVar == bnVar4.m4 ? null : fjVar, bnVar4.D5, bnVar4.H5);
                                        }
                                        bnVar4.B8();
                                        break;
                                    case 12:
                                        na0 na0Var6 = this.b;
                                        org.telegram.messenger.jj jjVar8 = na0Var6.d0.d;
                                        if (jjVar8.o) {
                                            boolean z15 = !jjVar8.q;
                                            jjVar8.q = z15;
                                            na0Var6.H.a(z15, true);
                                            na0Var6.I.a(jjVar8.q, true);
                                            if (na0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.fj) na0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z16 = jjVar8.q;
                                                messageMedia2.force_small_media = z16;
                                                messageMedia2.force_large_media = !z16;
                                            }
                                            if (na0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.fj) na0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                                boolean z17 = jjVar8.q;
                                                messageMedia.force_small_media = z17;
                                                messageMedia.force_large_media = !z17;
                                            }
                                            na0Var6.i();
                                            na0Var6.V = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        na0 na0Var7 = this.b;
                                        org.telegram.messenger.jj jjVar9 = na0Var7.d0.d;
                                        boolean z18 = jjVar9.r;
                                        jjVar9.r = !z18;
                                        na0Var7.F.a(z18, true);
                                        if (na0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.fj) na0Var7.r.e.get(0)).k) != null) {
                                            message4.invert_media = jjVar9.r;
                                        }
                                        if (na0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.fj) na0Var7.r.f.get(0)).k) != null) {
                                            message3.invert_media = jjVar9.r;
                                        }
                                        na0Var7.i();
                                        na0Var7.V = true;
                                        break;
                                }
                            }
                        });
                        g10.addView(y0Var2, c8.na.o(-1, 48));
                    }
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                    this.J = actionBarPopupWindow$ActionBarPopupWindowLayout5.b(g10);
                    actionBarPopupWindow$ActionBarPopupWindowLayout5.getSwipeBack().setStickToRight(z11);
                    FrameLayout frameLayout = new FrameLayout(context3);
                    int i15 = i11;
                    ?? r132 = obj;
                    jjVar2 = jjVar3;
                    ga0 ga0Var = new ga0(1, 0, context, ta0Var.G, true, false);
                    this.w = ga0Var;
                    ga0Var.j(org.telegram.messenger.gd.N0(z12 ? i15 : 2131745457, r132), R.drawable.menu_select_quote, r132);
                    ga0 ga0Var2 = new ga0(1, 1, context, ta0Var.G, true, false);
                    context3 = context;
                    this.x = ga0Var2;
                    ga0Var2.j(org.telegram.messenger.gd.N0(2131752060, r132), R.drawable.menu_quote_delete, r132);
                    int i16 = org.telegram.ui.ActionBar.n6.I5;
                    Drawable a02 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(i16, pa0Var), 6, 0);
                    org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i16);
                    frameLayout.setBackground(a02);
                    org.telegram.ui.ActionBar.u6.j(frameLayout, a02, r132, M, pa0Var);
                    final int i17 = 2;
                    frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ca0
                        public final /* synthetic */ na0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i152;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (i17) {
                                case 0:
                                    na0 na0Var3 = this.b;
                                    na0Var3.d0.d.d = null;
                                    na0Var3.e.f(false);
                                    na0Var3.h(false, false);
                                    na0Var3.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    na0 na0Var4 = this.b;
                                    ha0 ha0Var2 = na0Var4.e;
                                    ta0 ta0Var2 = na0Var4.d0;
                                    if (na0Var4.c(null) != null) {
                                        if (ha0Var2.v - ha0Var2.u <= org.telegram.messenger.mp.u1(ta0Var2.x).r4) {
                                            org.telegram.ui.Cells.q9 q9Var = ha0Var2.W;
                                            org.telegram.messenger.fj c11 = na0Var4.c(q9Var != null ? ((org.telegram.ui.Cells.r1) q9Var).getMessageObject() : null);
                                            org.telegram.messenger.jj jjVar5 = ta0Var2.d;
                                            int i162 = ha0Var2.u;
                                            jjVar5.e = i162;
                                            int i172 = ha0Var2.v;
                                            jjVar5.f = i172;
                                            jjVar5.d = org.telegram.ui.rm.b(i162, i172, c11);
                                            ta0Var2.b();
                                            ta0Var2.a(true);
                                            break;
                                        } else {
                                            na0Var4.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    na0 na0Var5 = this.b;
                                    ha0 ha0Var3 = na0Var5.e;
                                    ta0 ta0Var3 = na0Var5.d0;
                                    org.telegram.messenger.jj jjVar6 = ta0Var3.d;
                                    int i18 = ta0Var3.x;
                                    boolean z142 = ta0Var3.b;
                                    if (jjVar6.d != null && !z142) {
                                        jjVar6.d = null;
                                        ha0Var3.f(false);
                                        na0Var5.h(false, true);
                                        na0Var5.l(true);
                                        break;
                                    } else if (ha0Var3.v - ha0Var3.u <= org.telegram.messenger.mp.u1(i18).r4) {
                                        org.telegram.messenger.fj c12 = na0Var5.c(null);
                                        if (c12 != null) {
                                            if (!ha0Var3.x()) {
                                                jjVar6.e = 0;
                                                int min = Math.min(org.telegram.messenger.mp.u1(i18).r4, org.telegram.ui.rm.d(c12));
                                                jjVar6.f = min;
                                                jjVar6.d = org.telegram.ui.rm.b(jjVar6.e, min, c12);
                                                View d = na0Var5.d();
                                                if (d instanceof org.telegram.ui.Cells.r1) {
                                                    ha0Var3.a0((org.telegram.ui.Cells.r1) d, jjVar6.e, jjVar6.f);
                                                }
                                                if (!z142) {
                                                    na0Var5.s.getSwipeBack().e(na0Var5.J);
                                                }
                                                na0Var5.h(true, true);
                                                break;
                                            } else {
                                                jjVar6.e = ha0Var3.u;
                                                jjVar6.f = ha0Var3.v;
                                                org.telegram.ui.Cells.q9 q9Var2 = ha0Var3.W;
                                                jjVar6.d = org.telegram.ui.rm.b(jjVar6.e, jjVar6.f, na0Var5.c(q9Var2 != null ? ((org.telegram.ui.Cells.r1) q9Var2).getMessageObject() : null));
                                                ta0Var3.b();
                                                ta0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        na0Var5.g();
                                        break;
                                    }
                                    break;
                                case 3:
                                    this.b.d0.c(false);
                                    break;
                                case 4:
                                    this.b.d0.c(false);
                                    break;
                                case 5:
                                    this.b.d0.a(true);
                                    break;
                                case 6:
                                    ta0 ta0Var4 = this.b.d0;
                                    if (!ta0Var4.b) {
                                        org.telegram.ui.mk mkVar = (org.telegram.ui.mk) ta0Var4;
                                        mkVar.a(true);
                                        org.telegram.ui.bn bnVar = mkVar.I;
                                        bnVar.F5 = null;
                                        bnVar.D5 = null;
                                        bnVar.x5.f(null, null, bnVar.l6, null);
                                        bnVar.B8();
                                        break;
                                    } else {
                                        org.telegram.ui.mk mkVar2 = (org.telegram.ui.mk) ta0Var4;
                                        mkVar2.a(true);
                                        org.telegram.ui.bn bnVar2 = mkVar2.I;
                                        bnVar2.D5 = null;
                                        bnVar2.ic(bnVar2.F5);
                                        break;
                                    }
                                case 7:
                                    this.b.d0.c(true);
                                    break;
                                case 8:
                                    this.b.d0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.mk mkVar3 = (org.telegram.ui.mk) this.b.d0;
                                    mkVar3.a(true);
                                    org.telegram.ui.bn bnVar3 = mkVar3.I;
                                    bnVar3.x5.d(null, bnVar3.l6);
                                    bnVar3.B8();
                                    break;
                                case 10:
                                    this.b.d0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.mk mkVar4 = (org.telegram.ui.mk) this.b.d0;
                                    mkVar4.a(true);
                                    org.telegram.ui.bn bnVar4 = mkVar4.I;
                                    bnVar4.Y5 = null;
                                    org.telegram.ui.rj rjVar = bnVar4.a0;
                                    if (rjVar != null) {
                                        rjVar.N3 = null;
                                        rjVar.O3 = false;
                                    }
                                    org.telegram.messenger.jj jjVar7 = bnVar4.x5;
                                    if (jjVar7 != null) {
                                        i152 = ((org.telegram.ui.ActionBar.g2) bnVar4).currentAccount;
                                        org.telegram.messenger.fj fjVar = bnVar4.F5;
                                        jjVar7.e(i152, null, null, fjVar == bnVar4.m4 ? null : fjVar, bnVar4.D5, bnVar4.H5);
                                    }
                                    bnVar4.B8();
                                    break;
                                case 12:
                                    na0 na0Var6 = this.b;
                                    org.telegram.messenger.jj jjVar8 = na0Var6.d0.d;
                                    if (jjVar8.o) {
                                        boolean z15 = !jjVar8.q;
                                        jjVar8.q = z15;
                                        na0Var6.H.a(z15, true);
                                        na0Var6.I.a(jjVar8.q, true);
                                        if (na0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.fj) na0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z16 = jjVar8.q;
                                            messageMedia2.force_small_media = z16;
                                            messageMedia2.force_large_media = !z16;
                                        }
                                        if (na0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.fj) na0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z17 = jjVar8.q;
                                            messageMedia.force_small_media = z17;
                                            messageMedia.force_large_media = !z17;
                                        }
                                        na0Var6.i();
                                        na0Var6.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    na0 na0Var7 = this.b;
                                    org.telegram.messenger.jj jjVar9 = na0Var7.d0.d;
                                    boolean z18 = jjVar9.r;
                                    jjVar9.r = !z18;
                                    na0Var7.F.a(z18, true);
                                    if (na0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.fj) na0Var7.r.e.get(0)).k) != null) {
                                        message4.invert_media = jjVar9.r;
                                    }
                                    if (na0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.fj) na0Var7.r.f.get(0)).k) != null) {
                                        message3.invert_media = jjVar9.r;
                                    }
                                    na0Var7.i();
                                    na0Var7.V = true;
                                    break;
                            }
                        }
                    });
                    frameLayout.addView(ga0Var, c8.na.c(48.0f, -1));
                    frameLayout.addView(ga0Var2, c8.na.c(48.0f, -1));
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout5;
                    actionBarPopupWindow$ActionBarPopupWindowLayout6.a(frameLayout, c8.na.o(-1, 48));
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout6;
                    r13 = r132;
                }
                jjVar = jjVar2;
                if (jjVar.t || z13 || jjVar.u) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                } else {
                    FrameLayout frameLayout2 = new FrameLayout(context3);
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    org.telegram.ui.ActionBar.y0 y0Var3 = new org.telegram.ui.ActionBar.y0(1, context3, ta0Var.G, false, false);
                    this.y = y0Var3;
                    y0Var3.j(org.telegram.messenger.gd.N0(2131746057, r13), R.drawable.msg_forward_replace, r13);
                    final int i18 = 3;
                    y0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ca0
                        public final /* synthetic */ na0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i152;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (i18) {
                                case 0:
                                    na0 na0Var3 = this.b;
                                    na0Var3.d0.d.d = null;
                                    na0Var3.e.f(false);
                                    na0Var3.h(false, false);
                                    na0Var3.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    na0 na0Var4 = this.b;
                                    ha0 ha0Var2 = na0Var4.e;
                                    ta0 ta0Var2 = na0Var4.d0;
                                    if (na0Var4.c(null) != null) {
                                        if (ha0Var2.v - ha0Var2.u <= org.telegram.messenger.mp.u1(ta0Var2.x).r4) {
                                            org.telegram.ui.Cells.q9 q9Var = ha0Var2.W;
                                            org.telegram.messenger.fj c11 = na0Var4.c(q9Var != null ? ((org.telegram.ui.Cells.r1) q9Var).getMessageObject() : null);
                                            org.telegram.messenger.jj jjVar5 = ta0Var2.d;
                                            int i162 = ha0Var2.u;
                                            jjVar5.e = i162;
                                            int i172 = ha0Var2.v;
                                            jjVar5.f = i172;
                                            jjVar5.d = org.telegram.ui.rm.b(i162, i172, c11);
                                            ta0Var2.b();
                                            ta0Var2.a(true);
                                            break;
                                        } else {
                                            na0Var4.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    na0 na0Var5 = this.b;
                                    ha0 ha0Var3 = na0Var5.e;
                                    ta0 ta0Var3 = na0Var5.d0;
                                    org.telegram.messenger.jj jjVar6 = ta0Var3.d;
                                    int i182 = ta0Var3.x;
                                    boolean z142 = ta0Var3.b;
                                    if (jjVar6.d != null && !z142) {
                                        jjVar6.d = null;
                                        ha0Var3.f(false);
                                        na0Var5.h(false, true);
                                        na0Var5.l(true);
                                        break;
                                    } else if (ha0Var3.v - ha0Var3.u <= org.telegram.messenger.mp.u1(i182).r4) {
                                        org.telegram.messenger.fj c12 = na0Var5.c(null);
                                        if (c12 != null) {
                                            if (!ha0Var3.x()) {
                                                jjVar6.e = 0;
                                                int min = Math.min(org.telegram.messenger.mp.u1(i182).r4, org.telegram.ui.rm.d(c12));
                                                jjVar6.f = min;
                                                jjVar6.d = org.telegram.ui.rm.b(jjVar6.e, min, c12);
                                                View d = na0Var5.d();
                                                if (d instanceof org.telegram.ui.Cells.r1) {
                                                    ha0Var3.a0((org.telegram.ui.Cells.r1) d, jjVar6.e, jjVar6.f);
                                                }
                                                if (!z142) {
                                                    na0Var5.s.getSwipeBack().e(na0Var5.J);
                                                }
                                                na0Var5.h(true, true);
                                                break;
                                            } else {
                                                jjVar6.e = ha0Var3.u;
                                                jjVar6.f = ha0Var3.v;
                                                org.telegram.ui.Cells.q9 q9Var2 = ha0Var3.W;
                                                jjVar6.d = org.telegram.ui.rm.b(jjVar6.e, jjVar6.f, na0Var5.c(q9Var2 != null ? ((org.telegram.ui.Cells.r1) q9Var2).getMessageObject() : null));
                                                ta0Var3.b();
                                                ta0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        na0Var5.g();
                                        break;
                                    }
                                    break;
                                case 3:
                                    this.b.d0.c(false);
                                    break;
                                case 4:
                                    this.b.d0.c(false);
                                    break;
                                case 5:
                                    this.b.d0.a(true);
                                    break;
                                case 6:
                                    ta0 ta0Var4 = this.b.d0;
                                    if (!ta0Var4.b) {
                                        org.telegram.ui.mk mkVar = (org.telegram.ui.mk) ta0Var4;
                                        mkVar.a(true);
                                        org.telegram.ui.bn bnVar = mkVar.I;
                                        bnVar.F5 = null;
                                        bnVar.D5 = null;
                                        bnVar.x5.f(null, null, bnVar.l6, null);
                                        bnVar.B8();
                                        break;
                                    } else {
                                        org.telegram.ui.mk mkVar2 = (org.telegram.ui.mk) ta0Var4;
                                        mkVar2.a(true);
                                        org.telegram.ui.bn bnVar2 = mkVar2.I;
                                        bnVar2.D5 = null;
                                        bnVar2.ic(bnVar2.F5);
                                        break;
                                    }
                                case 7:
                                    this.b.d0.c(true);
                                    break;
                                case 8:
                                    this.b.d0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.mk mkVar3 = (org.telegram.ui.mk) this.b.d0;
                                    mkVar3.a(true);
                                    org.telegram.ui.bn bnVar3 = mkVar3.I;
                                    bnVar3.x5.d(null, bnVar3.l6);
                                    bnVar3.B8();
                                    break;
                                case 10:
                                    this.b.d0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.mk mkVar4 = (org.telegram.ui.mk) this.b.d0;
                                    mkVar4.a(true);
                                    org.telegram.ui.bn bnVar4 = mkVar4.I;
                                    bnVar4.Y5 = null;
                                    org.telegram.ui.rj rjVar = bnVar4.a0;
                                    if (rjVar != null) {
                                        rjVar.N3 = null;
                                        rjVar.O3 = false;
                                    }
                                    org.telegram.messenger.jj jjVar7 = bnVar4.x5;
                                    if (jjVar7 != null) {
                                        i152 = ((org.telegram.ui.ActionBar.g2) bnVar4).currentAccount;
                                        org.telegram.messenger.fj fjVar = bnVar4.F5;
                                        jjVar7.e(i152, null, null, fjVar == bnVar4.m4 ? null : fjVar, bnVar4.D5, bnVar4.H5);
                                    }
                                    bnVar4.B8();
                                    break;
                                case 12:
                                    na0 na0Var6 = this.b;
                                    org.telegram.messenger.jj jjVar8 = na0Var6.d0.d;
                                    if (jjVar8.o) {
                                        boolean z15 = !jjVar8.q;
                                        jjVar8.q = z15;
                                        na0Var6.H.a(z15, true);
                                        na0Var6.I.a(jjVar8.q, true);
                                        if (na0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.fj) na0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z16 = jjVar8.q;
                                            messageMedia2.force_small_media = z16;
                                            messageMedia2.force_large_media = !z16;
                                        }
                                        if (na0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.fj) na0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z17 = jjVar8.q;
                                            messageMedia.force_small_media = z17;
                                            messageMedia.force_large_media = !z17;
                                        }
                                        na0Var6.i();
                                        na0Var6.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    na0 na0Var7 = this.b;
                                    org.telegram.messenger.jj jjVar9 = na0Var7.d0.d;
                                    boolean z18 = jjVar9.r;
                                    jjVar9.r = !z18;
                                    na0Var7.F.a(z18, true);
                                    if (na0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.fj) na0Var7.r.e.get(0)).k) != null) {
                                        message4.invert_media = jjVar9.r;
                                    }
                                    if (na0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.fj) na0Var7.r.f.get(0)).k) != null) {
                                        message3.invert_media = jjVar9.r;
                                    }
                                    na0Var7.i();
                                    na0Var7.V = true;
                                    break;
                            }
                        }
                    });
                    context3 = context;
                    org.telegram.ui.ActionBar.y0 y0Var4 = new org.telegram.ui.ActionBar.y0(1, context3, ta0Var.G, false, false);
                    this.E = y0Var4;
                    y0Var4.j(org.telegram.messenger.gd.N0(2131746232, r13), R.drawable.msg_forward_replace, r13);
                    final int i19 = 4;
                    y0Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ca0
                        public final /* synthetic */ na0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i152;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (i19) {
                                case 0:
                                    na0 na0Var3 = this.b;
                                    na0Var3.d0.d.d = null;
                                    na0Var3.e.f(false);
                                    na0Var3.h(false, false);
                                    na0Var3.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    na0 na0Var4 = this.b;
                                    ha0 ha0Var2 = na0Var4.e;
                                    ta0 ta0Var2 = na0Var4.d0;
                                    if (na0Var4.c(null) != null) {
                                        if (ha0Var2.v - ha0Var2.u <= org.telegram.messenger.mp.u1(ta0Var2.x).r4) {
                                            org.telegram.ui.Cells.q9 q9Var = ha0Var2.W;
                                            org.telegram.messenger.fj c11 = na0Var4.c(q9Var != null ? ((org.telegram.ui.Cells.r1) q9Var).getMessageObject() : null);
                                            org.telegram.messenger.jj jjVar5 = ta0Var2.d;
                                            int i162 = ha0Var2.u;
                                            jjVar5.e = i162;
                                            int i172 = ha0Var2.v;
                                            jjVar5.f = i172;
                                            jjVar5.d = org.telegram.ui.rm.b(i162, i172, c11);
                                            ta0Var2.b();
                                            ta0Var2.a(true);
                                            break;
                                        } else {
                                            na0Var4.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    na0 na0Var5 = this.b;
                                    ha0 ha0Var3 = na0Var5.e;
                                    ta0 ta0Var3 = na0Var5.d0;
                                    org.telegram.messenger.jj jjVar6 = ta0Var3.d;
                                    int i182 = ta0Var3.x;
                                    boolean z142 = ta0Var3.b;
                                    if (jjVar6.d != null && !z142) {
                                        jjVar6.d = null;
                                        ha0Var3.f(false);
                                        na0Var5.h(false, true);
                                        na0Var5.l(true);
                                        break;
                                    } else if (ha0Var3.v - ha0Var3.u <= org.telegram.messenger.mp.u1(i182).r4) {
                                        org.telegram.messenger.fj c12 = na0Var5.c(null);
                                        if (c12 != null) {
                                            if (!ha0Var3.x()) {
                                                jjVar6.e = 0;
                                                int min = Math.min(org.telegram.messenger.mp.u1(i182).r4, org.telegram.ui.rm.d(c12));
                                                jjVar6.f = min;
                                                jjVar6.d = org.telegram.ui.rm.b(jjVar6.e, min, c12);
                                                View d = na0Var5.d();
                                                if (d instanceof org.telegram.ui.Cells.r1) {
                                                    ha0Var3.a0((org.telegram.ui.Cells.r1) d, jjVar6.e, jjVar6.f);
                                                }
                                                if (!z142) {
                                                    na0Var5.s.getSwipeBack().e(na0Var5.J);
                                                }
                                                na0Var5.h(true, true);
                                                break;
                                            } else {
                                                jjVar6.e = ha0Var3.u;
                                                jjVar6.f = ha0Var3.v;
                                                org.telegram.ui.Cells.q9 q9Var2 = ha0Var3.W;
                                                jjVar6.d = org.telegram.ui.rm.b(jjVar6.e, jjVar6.f, na0Var5.c(q9Var2 != null ? ((org.telegram.ui.Cells.r1) q9Var2).getMessageObject() : null));
                                                ta0Var3.b();
                                                ta0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        na0Var5.g();
                                        break;
                                    }
                                    break;
                                case 3:
                                    this.b.d0.c(false);
                                    break;
                                case 4:
                                    this.b.d0.c(false);
                                    break;
                                case 5:
                                    this.b.d0.a(true);
                                    break;
                                case 6:
                                    ta0 ta0Var4 = this.b.d0;
                                    if (!ta0Var4.b) {
                                        org.telegram.ui.mk mkVar = (org.telegram.ui.mk) ta0Var4;
                                        mkVar.a(true);
                                        org.telegram.ui.bn bnVar = mkVar.I;
                                        bnVar.F5 = null;
                                        bnVar.D5 = null;
                                        bnVar.x5.f(null, null, bnVar.l6, null);
                                        bnVar.B8();
                                        break;
                                    } else {
                                        org.telegram.ui.mk mkVar2 = (org.telegram.ui.mk) ta0Var4;
                                        mkVar2.a(true);
                                        org.telegram.ui.bn bnVar2 = mkVar2.I;
                                        bnVar2.D5 = null;
                                        bnVar2.ic(bnVar2.F5);
                                        break;
                                    }
                                case 7:
                                    this.b.d0.c(true);
                                    break;
                                case 8:
                                    this.b.d0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.mk mkVar3 = (org.telegram.ui.mk) this.b.d0;
                                    mkVar3.a(true);
                                    org.telegram.ui.bn bnVar3 = mkVar3.I;
                                    bnVar3.x5.d(null, bnVar3.l6);
                                    bnVar3.B8();
                                    break;
                                case 10:
                                    this.b.d0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.mk mkVar4 = (org.telegram.ui.mk) this.b.d0;
                                    mkVar4.a(true);
                                    org.telegram.ui.bn bnVar4 = mkVar4.I;
                                    bnVar4.Y5 = null;
                                    org.telegram.ui.rj rjVar = bnVar4.a0;
                                    if (rjVar != null) {
                                        rjVar.N3 = null;
                                        rjVar.O3 = false;
                                    }
                                    org.telegram.messenger.jj jjVar7 = bnVar4.x5;
                                    if (jjVar7 != null) {
                                        i152 = ((org.telegram.ui.ActionBar.g2) bnVar4).currentAccount;
                                        org.telegram.messenger.fj fjVar = bnVar4.F5;
                                        jjVar7.e(i152, null, null, fjVar == bnVar4.m4 ? null : fjVar, bnVar4.D5, bnVar4.H5);
                                    }
                                    bnVar4.B8();
                                    break;
                                case 12:
                                    na0 na0Var6 = this.b;
                                    org.telegram.messenger.jj jjVar8 = na0Var6.d0.d;
                                    if (jjVar8.o) {
                                        boolean z15 = !jjVar8.q;
                                        jjVar8.q = z15;
                                        na0Var6.H.a(z15, true);
                                        na0Var6.I.a(jjVar8.q, true);
                                        if (na0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.fj) na0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z16 = jjVar8.q;
                                            messageMedia2.force_small_media = z16;
                                            messageMedia2.force_large_media = !z16;
                                        }
                                        if (na0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.fj) na0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z17 = jjVar8.q;
                                            messageMedia.force_small_media = z17;
                                            messageMedia.force_large_media = !z17;
                                        }
                                        na0Var6.i();
                                        na0Var6.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    na0 na0Var7 = this.b;
                                    org.telegram.messenger.jj jjVar9 = na0Var7.d0.d;
                                    boolean z18 = jjVar9.r;
                                    jjVar9.r = !z18;
                                    na0Var7.F.a(z18, true);
                                    if (na0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.fj) na0Var7.r.e.get(0)).k) != null) {
                                        message4.invert_media = jjVar9.r;
                                    }
                                    if (na0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.fj) na0Var7.r.f.get(0)).k) != null) {
                                        message3.invert_media = jjVar9.r;
                                    }
                                    na0Var7.i();
                                    na0Var7.V = true;
                                    break;
                            }
                        }
                    });
                    frameLayout2.addView(y0Var4, c8.na.c(48.0f, -1));
                    frameLayout2.addView(y0Var3, c8.na.c(48.0f, -1));
                    actionBarPopupWindow$ActionBarPopupWindowLayout7.a(frameLayout2, c8.na.o(-1, 48));
                    actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout7;
                }
                if (!z13 && !jjVar.u) {
                    View d1Var2 = new org.telegram.ui.ActionBar.d1(context3, pa0Var);
                    org.telegram.ui.ActionBar.u6.i(d1Var2, org.telegram.ui.ActionBar.u6.K(0.06f, org.telegram.ui.ActionBar.n6.E8), pa0Var);
                    d1Var2.setTag(R.id.fit_width_tag, 1);
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.a(d1Var2, c8.na.o(-1, 8));
                }
                h(jjVar.d != null, false);
                org.telegram.ui.ActionBar.y0 y0Var5 = new org.telegram.ui.ActionBar.y0(1, context3, ta0Var.G, false, false);
                y0Var5.j(org.telegram.messenger.gd.N0(2131754215, r13), R.drawable.msg_select, r13);
                final int i20 = 5;
                y0Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ca0
                    public final /* synthetic */ na0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i152;
                        TLRPC.Message message;
                        TLRPC.MessageMedia messageMedia;
                        TLRPC.Message message2;
                        TLRPC.MessageMedia messageMedia2;
                        TLRPC.Message message3;
                        TLRPC.Message message4;
                        switch (i20) {
                            case 0:
                                na0 na0Var3 = this.b;
                                na0Var3.d0.d.d = null;
                                na0Var3.e.f(false);
                                na0Var3.h(false, false);
                                na0Var3.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                na0 na0Var4 = this.b;
                                ha0 ha0Var2 = na0Var4.e;
                                ta0 ta0Var2 = na0Var4.d0;
                                if (na0Var4.c(null) != null) {
                                    if (ha0Var2.v - ha0Var2.u <= org.telegram.messenger.mp.u1(ta0Var2.x).r4) {
                                        org.telegram.ui.Cells.q9 q9Var = ha0Var2.W;
                                        org.telegram.messenger.fj c11 = na0Var4.c(q9Var != null ? ((org.telegram.ui.Cells.r1) q9Var).getMessageObject() : null);
                                        org.telegram.messenger.jj jjVar5 = ta0Var2.d;
                                        int i162 = ha0Var2.u;
                                        jjVar5.e = i162;
                                        int i172 = ha0Var2.v;
                                        jjVar5.f = i172;
                                        jjVar5.d = org.telegram.ui.rm.b(i162, i172, c11);
                                        ta0Var2.b();
                                        ta0Var2.a(true);
                                        break;
                                    } else {
                                        na0Var4.g();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                na0 na0Var5 = this.b;
                                ha0 ha0Var3 = na0Var5.e;
                                ta0 ta0Var3 = na0Var5.d0;
                                org.telegram.messenger.jj jjVar6 = ta0Var3.d;
                                int i182 = ta0Var3.x;
                                boolean z142 = ta0Var3.b;
                                if (jjVar6.d != null && !z142) {
                                    jjVar6.d = null;
                                    ha0Var3.f(false);
                                    na0Var5.h(false, true);
                                    na0Var5.l(true);
                                    break;
                                } else if (ha0Var3.v - ha0Var3.u <= org.telegram.messenger.mp.u1(i182).r4) {
                                    org.telegram.messenger.fj c12 = na0Var5.c(null);
                                    if (c12 != null) {
                                        if (!ha0Var3.x()) {
                                            jjVar6.e = 0;
                                            int min = Math.min(org.telegram.messenger.mp.u1(i182).r4, org.telegram.ui.rm.d(c12));
                                            jjVar6.f = min;
                                            jjVar6.d = org.telegram.ui.rm.b(jjVar6.e, min, c12);
                                            View d = na0Var5.d();
                                            if (d instanceof org.telegram.ui.Cells.r1) {
                                                ha0Var3.a0((org.telegram.ui.Cells.r1) d, jjVar6.e, jjVar6.f);
                                            }
                                            if (!z142) {
                                                na0Var5.s.getSwipeBack().e(na0Var5.J);
                                            }
                                            na0Var5.h(true, true);
                                            break;
                                        } else {
                                            jjVar6.e = ha0Var3.u;
                                            jjVar6.f = ha0Var3.v;
                                            org.telegram.ui.Cells.q9 q9Var2 = ha0Var3.W;
                                            jjVar6.d = org.telegram.ui.rm.b(jjVar6.e, jjVar6.f, na0Var5.c(q9Var2 != null ? ((org.telegram.ui.Cells.r1) q9Var2).getMessageObject() : null));
                                            ta0Var3.b();
                                            ta0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    na0Var5.g();
                                    break;
                                }
                                break;
                            case 3:
                                this.b.d0.c(false);
                                break;
                            case 4:
                                this.b.d0.c(false);
                                break;
                            case 5:
                                this.b.d0.a(true);
                                break;
                            case 6:
                                ta0 ta0Var4 = this.b.d0;
                                if (!ta0Var4.b) {
                                    org.telegram.ui.mk mkVar = (org.telegram.ui.mk) ta0Var4;
                                    mkVar.a(true);
                                    org.telegram.ui.bn bnVar = mkVar.I;
                                    bnVar.F5 = null;
                                    bnVar.D5 = null;
                                    bnVar.x5.f(null, null, bnVar.l6, null);
                                    bnVar.B8();
                                    break;
                                } else {
                                    org.telegram.ui.mk mkVar2 = (org.telegram.ui.mk) ta0Var4;
                                    mkVar2.a(true);
                                    org.telegram.ui.bn bnVar2 = mkVar2.I;
                                    bnVar2.D5 = null;
                                    bnVar2.ic(bnVar2.F5);
                                    break;
                                }
                            case 7:
                                this.b.d0.c(true);
                                break;
                            case 8:
                                this.b.d0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.mk mkVar3 = (org.telegram.ui.mk) this.b.d0;
                                mkVar3.a(true);
                                org.telegram.ui.bn bnVar3 = mkVar3.I;
                                bnVar3.x5.d(null, bnVar3.l6);
                                bnVar3.B8();
                                break;
                            case 10:
                                this.b.d0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.mk mkVar4 = (org.telegram.ui.mk) this.b.d0;
                                mkVar4.a(true);
                                org.telegram.ui.bn bnVar4 = mkVar4.I;
                                bnVar4.Y5 = null;
                                org.telegram.ui.rj rjVar = bnVar4.a0;
                                if (rjVar != null) {
                                    rjVar.N3 = null;
                                    rjVar.O3 = false;
                                }
                                org.telegram.messenger.jj jjVar7 = bnVar4.x5;
                                if (jjVar7 != null) {
                                    i152 = ((org.telegram.ui.ActionBar.g2) bnVar4).currentAccount;
                                    org.telegram.messenger.fj fjVar = bnVar4.F5;
                                    jjVar7.e(i152, null, null, fjVar == bnVar4.m4 ? null : fjVar, bnVar4.D5, bnVar4.H5);
                                }
                                bnVar4.B8();
                                break;
                            case 12:
                                na0 na0Var6 = this.b;
                                org.telegram.messenger.jj jjVar8 = na0Var6.d0.d;
                                if (jjVar8.o) {
                                    boolean z15 = !jjVar8.q;
                                    jjVar8.q = z15;
                                    na0Var6.H.a(z15, true);
                                    na0Var6.I.a(jjVar8.q, true);
                                    if (na0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.fj) na0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z16 = jjVar8.q;
                                        messageMedia2.force_small_media = z16;
                                        messageMedia2.force_large_media = !z16;
                                    }
                                    if (na0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.fj) na0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                        boolean z17 = jjVar8.q;
                                        messageMedia.force_small_media = z17;
                                        messageMedia.force_large_media = !z17;
                                    }
                                    na0Var6.i();
                                    na0Var6.V = true;
                                    break;
                                }
                                break;
                            default:
                                na0 na0Var7 = this.b;
                                org.telegram.messenger.jj jjVar9 = na0Var7.d0.d;
                                boolean z18 = jjVar9.r;
                                jjVar9.r = !z18;
                                na0Var7.F.a(z18, true);
                                if (na0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.fj) na0Var7.r.e.get(0)).k) != null) {
                                    message4.invert_media = jjVar9.r;
                                }
                                if (na0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.fj) na0Var7.r.f.get(0)).k) != null) {
                                    message3.invert_media = jjVar9.r;
                                }
                                na0Var7.i();
                                na0Var7.V = true;
                                break;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(y0Var5, c8.na.o(-1, 48));
                org.telegram.ui.ActionBar.y0 y0Var6 = new org.telegram.ui.ActionBar.y0(1, context, ta0Var.G, false, true);
                y0Var6.j(org.telegram.messenger.gd.N0(z12 ? 2131751348 : 2131751347, r13), R.drawable.msg_delete, r13);
                int i21 = org.telegram.ui.ActionBar.n6.q7;
                int i22 = org.telegram.ui.ActionBar.n6.p7;
                y0Var6.c(i21, i22);
                y0Var6.h(0.12f, i22);
                final int i23 = 6;
                y0Var6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ca0
                    public final /* synthetic */ na0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i152;
                        TLRPC.Message message;
                        TLRPC.MessageMedia messageMedia;
                        TLRPC.Message message2;
                        TLRPC.MessageMedia messageMedia2;
                        TLRPC.Message message3;
                        TLRPC.Message message4;
                        switch (i23) {
                            case 0:
                                na0 na0Var3 = this.b;
                                na0Var3.d0.d.d = null;
                                na0Var3.e.f(false);
                                na0Var3.h(false, false);
                                na0Var3.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                na0 na0Var4 = this.b;
                                ha0 ha0Var2 = na0Var4.e;
                                ta0 ta0Var2 = na0Var4.d0;
                                if (na0Var4.c(null) != null) {
                                    if (ha0Var2.v - ha0Var2.u <= org.telegram.messenger.mp.u1(ta0Var2.x).r4) {
                                        org.telegram.ui.Cells.q9 q9Var = ha0Var2.W;
                                        org.telegram.messenger.fj c11 = na0Var4.c(q9Var != null ? ((org.telegram.ui.Cells.r1) q9Var).getMessageObject() : null);
                                        org.telegram.messenger.jj jjVar5 = ta0Var2.d;
                                        int i162 = ha0Var2.u;
                                        jjVar5.e = i162;
                                        int i172 = ha0Var2.v;
                                        jjVar5.f = i172;
                                        jjVar5.d = org.telegram.ui.rm.b(i162, i172, c11);
                                        ta0Var2.b();
                                        ta0Var2.a(true);
                                        break;
                                    } else {
                                        na0Var4.g();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                na0 na0Var5 = this.b;
                                ha0 ha0Var3 = na0Var5.e;
                                ta0 ta0Var3 = na0Var5.d0;
                                org.telegram.messenger.jj jjVar6 = ta0Var3.d;
                                int i182 = ta0Var3.x;
                                boolean z142 = ta0Var3.b;
                                if (jjVar6.d != null && !z142) {
                                    jjVar6.d = null;
                                    ha0Var3.f(false);
                                    na0Var5.h(false, true);
                                    na0Var5.l(true);
                                    break;
                                } else if (ha0Var3.v - ha0Var3.u <= org.telegram.messenger.mp.u1(i182).r4) {
                                    org.telegram.messenger.fj c12 = na0Var5.c(null);
                                    if (c12 != null) {
                                        if (!ha0Var3.x()) {
                                            jjVar6.e = 0;
                                            int min = Math.min(org.telegram.messenger.mp.u1(i182).r4, org.telegram.ui.rm.d(c12));
                                            jjVar6.f = min;
                                            jjVar6.d = org.telegram.ui.rm.b(jjVar6.e, min, c12);
                                            View d = na0Var5.d();
                                            if (d instanceof org.telegram.ui.Cells.r1) {
                                                ha0Var3.a0((org.telegram.ui.Cells.r1) d, jjVar6.e, jjVar6.f);
                                            }
                                            if (!z142) {
                                                na0Var5.s.getSwipeBack().e(na0Var5.J);
                                            }
                                            na0Var5.h(true, true);
                                            break;
                                        } else {
                                            jjVar6.e = ha0Var3.u;
                                            jjVar6.f = ha0Var3.v;
                                            org.telegram.ui.Cells.q9 q9Var2 = ha0Var3.W;
                                            jjVar6.d = org.telegram.ui.rm.b(jjVar6.e, jjVar6.f, na0Var5.c(q9Var2 != null ? ((org.telegram.ui.Cells.r1) q9Var2).getMessageObject() : null));
                                            ta0Var3.b();
                                            ta0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    na0Var5.g();
                                    break;
                                }
                                break;
                            case 3:
                                this.b.d0.c(false);
                                break;
                            case 4:
                                this.b.d0.c(false);
                                break;
                            case 5:
                                this.b.d0.a(true);
                                break;
                            case 6:
                                ta0 ta0Var4 = this.b.d0;
                                if (!ta0Var4.b) {
                                    org.telegram.ui.mk mkVar = (org.telegram.ui.mk) ta0Var4;
                                    mkVar.a(true);
                                    org.telegram.ui.bn bnVar = mkVar.I;
                                    bnVar.F5 = null;
                                    bnVar.D5 = null;
                                    bnVar.x5.f(null, null, bnVar.l6, null);
                                    bnVar.B8();
                                    break;
                                } else {
                                    org.telegram.ui.mk mkVar2 = (org.telegram.ui.mk) ta0Var4;
                                    mkVar2.a(true);
                                    org.telegram.ui.bn bnVar2 = mkVar2.I;
                                    bnVar2.D5 = null;
                                    bnVar2.ic(bnVar2.F5);
                                    break;
                                }
                            case 7:
                                this.b.d0.c(true);
                                break;
                            case 8:
                                this.b.d0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.mk mkVar3 = (org.telegram.ui.mk) this.b.d0;
                                mkVar3.a(true);
                                org.telegram.ui.bn bnVar3 = mkVar3.I;
                                bnVar3.x5.d(null, bnVar3.l6);
                                bnVar3.B8();
                                break;
                            case 10:
                                this.b.d0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.mk mkVar4 = (org.telegram.ui.mk) this.b.d0;
                                mkVar4.a(true);
                                org.telegram.ui.bn bnVar4 = mkVar4.I;
                                bnVar4.Y5 = null;
                                org.telegram.ui.rj rjVar = bnVar4.a0;
                                if (rjVar != null) {
                                    rjVar.N3 = null;
                                    rjVar.O3 = false;
                                }
                                org.telegram.messenger.jj jjVar7 = bnVar4.x5;
                                if (jjVar7 != null) {
                                    i152 = ((org.telegram.ui.ActionBar.g2) bnVar4).currentAccount;
                                    org.telegram.messenger.fj fjVar = bnVar4.F5;
                                    jjVar7.e(i152, null, null, fjVar == bnVar4.m4 ? null : fjVar, bnVar4.D5, bnVar4.H5);
                                }
                                bnVar4.B8();
                                break;
                            case 12:
                                na0 na0Var6 = this.b;
                                org.telegram.messenger.jj jjVar8 = na0Var6.d0.d;
                                if (jjVar8.o) {
                                    boolean z15 = !jjVar8.q;
                                    jjVar8.q = z15;
                                    na0Var6.H.a(z15, true);
                                    na0Var6.I.a(jjVar8.q, true);
                                    if (na0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.fj) na0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z16 = jjVar8.q;
                                        messageMedia2.force_small_media = z16;
                                        messageMedia2.force_large_media = !z16;
                                    }
                                    if (na0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.fj) na0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                        boolean z17 = jjVar8.q;
                                        messageMedia.force_small_media = z17;
                                        messageMedia.force_large_media = !z17;
                                    }
                                    na0Var6.i();
                                    na0Var6.V = true;
                                    break;
                                }
                                break;
                            default:
                                na0 na0Var7 = this.b;
                                org.telegram.messenger.jj jjVar9 = na0Var7.d0.d;
                                boolean z18 = jjVar9.r;
                                jjVar9.r = !z18;
                                na0Var7.F.a(z18, true);
                                if (na0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.fj) na0Var7.r.e.get(0)).k) != null) {
                                    message4.invert_media = jjVar9.r;
                                }
                                if (na0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.fj) na0Var7.r.f.get(0)).k) != null) {
                                    message3.invert_media = jjVar9.r;
                                }
                                na0Var7.i();
                                na0Var7.V = true;
                                break;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(y0Var6, c8.na.o(-1, 48));
                context2 = context;
                na0Var2 = this;
                viewOutlineProvider = r13;
                i10 = na0Var2.a;
                if (i10 == 1) {
                    na0Var2.r = jjVar.b;
                } else if (i10 == 0) {
                    na0Var2.r = jjVar.a;
                } else if (i10 == 2) {
                    na0Var2.r = jjVar.c;
                }
                n10 = na0Var2.e.n(context2);
                na0Var2.d = n10;
                n10.setElevation(org.telegram.messenger.g0.L(8.0f));
                n10.setOutlineProvider(viewOutlineProvider);
                if (n10.getParent() instanceof ViewGroup) {
                    ((ViewGroup) n10.getParent()).removeView(n10);
                }
                na0Var2.addView(n10, c8.na.d(-1, -1.0f, 51, 0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / org.telegram.messenger.g0.p, 0.0f, 0.0f));
                na0Var2.e.S(na0Var2.f);
            }
        }
        jjVar = jjVar4;
        viewOutlineProvider = null;
        viewOutlineProvider = null;
        if (i7 != 1 || jjVar.b == null) {
            final na0 na0Var3 = this;
            na0Var = na0Var3;
            if (i7 == 2) {
                na0Var = na0Var3;
                if (jjVar.c != null) {
                    sa0 sa0Var3 = new sa0(context, R.raw.position_below, org.telegram.messenger.gd.N0(2131748734, null), R.raw.position_above, org.telegram.messenger.gd.N0(2131748730, null), ta0Var.G);
                    na0Var3.F = sa0Var3;
                    sa0Var3.a(!jjVar.r, false);
                    actionBarPopupWindow$ActionBarPopupWindowLayout4.a(sa0Var3, c8.na.o(-1, 48));
                    FrameLayout frameLayout3 = new FrameLayout(context);
                    na0Var3.G = frameLayout3;
                    int i24 = org.telegram.ui.ActionBar.n6.I5;
                    org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(i24, pa0Var), 0, 0);
                    org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i24);
                    frameLayout3.setBackground(a03);
                    org.telegram.ui.ActionBar.u6.j(frameLayout3, a03, null, M2, pa0Var);
                    sa0 sa0Var4 = new sa0(context, R.raw.media_shrink, org.telegram.messenger.gd.N0(2131748706, null), R.raw.media_enlarge, org.telegram.messenger.gd.N0(2131748705, null), ta0Var.G);
                    na0Var3.H = sa0Var4;
                    sa0Var4.setBackground(null);
                    sa0Var4.setVisibility(jjVar.p ? 4 : 0);
                    frameLayout3.addView(sa0Var4, c8.na.o(-1, 48));
                    sa0 sa0Var5 = new sa0(context, R.raw.media_shrink, org.telegram.messenger.gd.N0(2131748692, null), R.raw.media_enlarge, org.telegram.messenger.gd.N0(2131748691, null), ta0Var.G);
                    na0Var3.I = sa0Var5;
                    sa0Var5.setBackground(null);
                    sa0Var5.setVisibility(!jjVar.p ? 4 : 0);
                    frameLayout3.setAlpha(jjVar.o ? 1.0f : 0.5f);
                    frameLayout3.addView(sa0Var5, c8.na.o(-1, 48));
                    actionBarPopupWindow$ActionBarPopupWindowLayout4.a(frameLayout3, c8.na.o(-1, 48));
                    frameLayout3.setVisibility((!jjVar.n || jjVar.o) ? 0 : 8);
                    sa0Var4.a(jjVar.q, false);
                    sa0Var5.a(jjVar.q, false);
                    View d1Var3 = new org.telegram.ui.ActionBar.d1(context, pa0Var);
                    org.telegram.ui.ActionBar.u6.i(d1Var3, org.telegram.ui.ActionBar.u6.K(0.06f, org.telegram.ui.ActionBar.n6.E8), pa0Var);
                    d1Var3.setTag(R.id.fit_width_tag, 1);
                    actionBarPopupWindow$ActionBarPopupWindowLayout4.a(d1Var3, c8.na.o(-1, 8));
                    org.telegram.ui.ActionBar.y0 y0Var7 = new org.telegram.ui.ActionBar.y0(1, context, ta0Var.G, false, false);
                    y0Var7.j(org.telegram.messenger.gd.N0(2131754215, null), R.drawable.msg_select, null);
                    final int i25 = 10;
                    y0Var7.setOnClickListener(new View.OnClickListener(na0Var3) { // from class: org.telegram.ui.Components.ca0
                        public final /* synthetic */ na0 b;

                        {
                            this.b = na0Var3;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i152;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (i25) {
                                case 0:
                                    na0 na0Var32 = this.b;
                                    na0Var32.d0.d.d = null;
                                    na0Var32.e.f(false);
                                    na0Var32.h(false, false);
                                    na0Var32.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    na0 na0Var4 = this.b;
                                    ha0 ha0Var2 = na0Var4.e;
                                    ta0 ta0Var2 = na0Var4.d0;
                                    if (na0Var4.c(null) != null) {
                                        if (ha0Var2.v - ha0Var2.u <= org.telegram.messenger.mp.u1(ta0Var2.x).r4) {
                                            org.telegram.ui.Cells.q9 q9Var = ha0Var2.W;
                                            org.telegram.messenger.fj c11 = na0Var4.c(q9Var != null ? ((org.telegram.ui.Cells.r1) q9Var).getMessageObject() : null);
                                            org.telegram.messenger.jj jjVar5 = ta0Var2.d;
                                            int i162 = ha0Var2.u;
                                            jjVar5.e = i162;
                                            int i172 = ha0Var2.v;
                                            jjVar5.f = i172;
                                            jjVar5.d = org.telegram.ui.rm.b(i162, i172, c11);
                                            ta0Var2.b();
                                            ta0Var2.a(true);
                                            break;
                                        } else {
                                            na0Var4.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    na0 na0Var5 = this.b;
                                    ha0 ha0Var3 = na0Var5.e;
                                    ta0 ta0Var3 = na0Var5.d0;
                                    org.telegram.messenger.jj jjVar6 = ta0Var3.d;
                                    int i182 = ta0Var3.x;
                                    boolean z142 = ta0Var3.b;
                                    if (jjVar6.d != null && !z142) {
                                        jjVar6.d = null;
                                        ha0Var3.f(false);
                                        na0Var5.h(false, true);
                                        na0Var5.l(true);
                                        break;
                                    } else if (ha0Var3.v - ha0Var3.u <= org.telegram.messenger.mp.u1(i182).r4) {
                                        org.telegram.messenger.fj c12 = na0Var5.c(null);
                                        if (c12 != null) {
                                            if (!ha0Var3.x()) {
                                                jjVar6.e = 0;
                                                int min = Math.min(org.telegram.messenger.mp.u1(i182).r4, org.telegram.ui.rm.d(c12));
                                                jjVar6.f = min;
                                                jjVar6.d = org.telegram.ui.rm.b(jjVar6.e, min, c12);
                                                View d = na0Var5.d();
                                                if (d instanceof org.telegram.ui.Cells.r1) {
                                                    ha0Var3.a0((org.telegram.ui.Cells.r1) d, jjVar6.e, jjVar6.f);
                                                }
                                                if (!z142) {
                                                    na0Var5.s.getSwipeBack().e(na0Var5.J);
                                                }
                                                na0Var5.h(true, true);
                                                break;
                                            } else {
                                                jjVar6.e = ha0Var3.u;
                                                jjVar6.f = ha0Var3.v;
                                                org.telegram.ui.Cells.q9 q9Var2 = ha0Var3.W;
                                                jjVar6.d = org.telegram.ui.rm.b(jjVar6.e, jjVar6.f, na0Var5.c(q9Var2 != null ? ((org.telegram.ui.Cells.r1) q9Var2).getMessageObject() : null));
                                                ta0Var3.b();
                                                ta0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        na0Var5.g();
                                        break;
                                    }
                                    break;
                                case 3:
                                    this.b.d0.c(false);
                                    break;
                                case 4:
                                    this.b.d0.c(false);
                                    break;
                                case 5:
                                    this.b.d0.a(true);
                                    break;
                                case 6:
                                    ta0 ta0Var4 = this.b.d0;
                                    if (!ta0Var4.b) {
                                        org.telegram.ui.mk mkVar = (org.telegram.ui.mk) ta0Var4;
                                        mkVar.a(true);
                                        org.telegram.ui.bn bnVar = mkVar.I;
                                        bnVar.F5 = null;
                                        bnVar.D5 = null;
                                        bnVar.x5.f(null, null, bnVar.l6, null);
                                        bnVar.B8();
                                        break;
                                    } else {
                                        org.telegram.ui.mk mkVar2 = (org.telegram.ui.mk) ta0Var4;
                                        mkVar2.a(true);
                                        org.telegram.ui.bn bnVar2 = mkVar2.I;
                                        bnVar2.D5 = null;
                                        bnVar2.ic(bnVar2.F5);
                                        break;
                                    }
                                case 7:
                                    this.b.d0.c(true);
                                    break;
                                case 8:
                                    this.b.d0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.mk mkVar3 = (org.telegram.ui.mk) this.b.d0;
                                    mkVar3.a(true);
                                    org.telegram.ui.bn bnVar3 = mkVar3.I;
                                    bnVar3.x5.d(null, bnVar3.l6);
                                    bnVar3.B8();
                                    break;
                                case 10:
                                    this.b.d0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.mk mkVar4 = (org.telegram.ui.mk) this.b.d0;
                                    mkVar4.a(true);
                                    org.telegram.ui.bn bnVar4 = mkVar4.I;
                                    bnVar4.Y5 = null;
                                    org.telegram.ui.rj rjVar = bnVar4.a0;
                                    if (rjVar != null) {
                                        rjVar.N3 = null;
                                        rjVar.O3 = false;
                                    }
                                    org.telegram.messenger.jj jjVar7 = bnVar4.x5;
                                    if (jjVar7 != null) {
                                        i152 = ((org.telegram.ui.ActionBar.g2) bnVar4).currentAccount;
                                        org.telegram.messenger.fj fjVar = bnVar4.F5;
                                        jjVar7.e(i152, null, null, fjVar == bnVar4.m4 ? null : fjVar, bnVar4.D5, bnVar4.H5);
                                    }
                                    bnVar4.B8();
                                    break;
                                case 12:
                                    na0 na0Var6 = this.b;
                                    org.telegram.messenger.jj jjVar8 = na0Var6.d0.d;
                                    if (jjVar8.o) {
                                        boolean z15 = !jjVar8.q;
                                        jjVar8.q = z15;
                                        na0Var6.H.a(z15, true);
                                        na0Var6.I.a(jjVar8.q, true);
                                        if (na0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.fj) na0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z16 = jjVar8.q;
                                            messageMedia2.force_small_media = z16;
                                            messageMedia2.force_large_media = !z16;
                                        }
                                        if (na0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.fj) na0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z17 = jjVar8.q;
                                            messageMedia.force_small_media = z17;
                                            messageMedia.force_large_media = !z17;
                                        }
                                        na0Var6.i();
                                        na0Var6.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    na0 na0Var7 = this.b;
                                    org.telegram.messenger.jj jjVar9 = na0Var7.d0.d;
                                    boolean z18 = jjVar9.r;
                                    jjVar9.r = !z18;
                                    na0Var7.F.a(z18, true);
                                    if (na0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.fj) na0Var7.r.e.get(0)).k) != null) {
                                        message4.invert_media = jjVar9.r;
                                    }
                                    if (na0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.fj) na0Var7.r.f.get(0)).k) != null) {
                                        message3.invert_media = jjVar9.r;
                                    }
                                    na0Var7.i();
                                    na0Var7.V = true;
                                    break;
                            }
                        }
                    });
                    actionBarPopupWindow$ActionBarPopupWindowLayout4.a(y0Var7, c8.na.o(-1, 48));
                    org.telegram.ui.ActionBar.y0 y0Var8 = new org.telegram.ui.ActionBar.y0(1, context, ta0Var.G, false, true);
                    context2 = context;
                    y0Var8.j(org.telegram.messenger.gd.N0(2131751349, null), R.drawable.msg_delete, null);
                    int i26 = org.telegram.ui.ActionBar.n6.q7;
                    int i27 = org.telegram.ui.ActionBar.n6.p7;
                    y0Var8.c(i26, i27);
                    final int i28 = 11;
                    y0Var8.setOnClickListener(new View.OnClickListener(na0Var3) { // from class: org.telegram.ui.Components.ca0
                        public final /* synthetic */ na0 b;

                        {
                            this.b = na0Var3;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i152;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (i28) {
                                case 0:
                                    na0 na0Var32 = this.b;
                                    na0Var32.d0.d.d = null;
                                    na0Var32.e.f(false);
                                    na0Var32.h(false, false);
                                    na0Var32.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    na0 na0Var4 = this.b;
                                    ha0 ha0Var2 = na0Var4.e;
                                    ta0 ta0Var2 = na0Var4.d0;
                                    if (na0Var4.c(null) != null) {
                                        if (ha0Var2.v - ha0Var2.u <= org.telegram.messenger.mp.u1(ta0Var2.x).r4) {
                                            org.telegram.ui.Cells.q9 q9Var = ha0Var2.W;
                                            org.telegram.messenger.fj c11 = na0Var4.c(q9Var != null ? ((org.telegram.ui.Cells.r1) q9Var).getMessageObject() : null);
                                            org.telegram.messenger.jj jjVar5 = ta0Var2.d;
                                            int i162 = ha0Var2.u;
                                            jjVar5.e = i162;
                                            int i172 = ha0Var2.v;
                                            jjVar5.f = i172;
                                            jjVar5.d = org.telegram.ui.rm.b(i162, i172, c11);
                                            ta0Var2.b();
                                            ta0Var2.a(true);
                                            break;
                                        } else {
                                            na0Var4.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    na0 na0Var5 = this.b;
                                    ha0 ha0Var3 = na0Var5.e;
                                    ta0 ta0Var3 = na0Var5.d0;
                                    org.telegram.messenger.jj jjVar6 = ta0Var3.d;
                                    int i182 = ta0Var3.x;
                                    boolean z142 = ta0Var3.b;
                                    if (jjVar6.d != null && !z142) {
                                        jjVar6.d = null;
                                        ha0Var3.f(false);
                                        na0Var5.h(false, true);
                                        na0Var5.l(true);
                                        break;
                                    } else if (ha0Var3.v - ha0Var3.u <= org.telegram.messenger.mp.u1(i182).r4) {
                                        org.telegram.messenger.fj c12 = na0Var5.c(null);
                                        if (c12 != null) {
                                            if (!ha0Var3.x()) {
                                                jjVar6.e = 0;
                                                int min = Math.min(org.telegram.messenger.mp.u1(i182).r4, org.telegram.ui.rm.d(c12));
                                                jjVar6.f = min;
                                                jjVar6.d = org.telegram.ui.rm.b(jjVar6.e, min, c12);
                                                View d = na0Var5.d();
                                                if (d instanceof org.telegram.ui.Cells.r1) {
                                                    ha0Var3.a0((org.telegram.ui.Cells.r1) d, jjVar6.e, jjVar6.f);
                                                }
                                                if (!z142) {
                                                    na0Var5.s.getSwipeBack().e(na0Var5.J);
                                                }
                                                na0Var5.h(true, true);
                                                break;
                                            } else {
                                                jjVar6.e = ha0Var3.u;
                                                jjVar6.f = ha0Var3.v;
                                                org.telegram.ui.Cells.q9 q9Var2 = ha0Var3.W;
                                                jjVar6.d = org.telegram.ui.rm.b(jjVar6.e, jjVar6.f, na0Var5.c(q9Var2 != null ? ((org.telegram.ui.Cells.r1) q9Var2).getMessageObject() : null));
                                                ta0Var3.b();
                                                ta0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        na0Var5.g();
                                        break;
                                    }
                                    break;
                                case 3:
                                    this.b.d0.c(false);
                                    break;
                                case 4:
                                    this.b.d0.c(false);
                                    break;
                                case 5:
                                    this.b.d0.a(true);
                                    break;
                                case 6:
                                    ta0 ta0Var4 = this.b.d0;
                                    if (!ta0Var4.b) {
                                        org.telegram.ui.mk mkVar = (org.telegram.ui.mk) ta0Var4;
                                        mkVar.a(true);
                                        org.telegram.ui.bn bnVar = mkVar.I;
                                        bnVar.F5 = null;
                                        bnVar.D5 = null;
                                        bnVar.x5.f(null, null, bnVar.l6, null);
                                        bnVar.B8();
                                        break;
                                    } else {
                                        org.telegram.ui.mk mkVar2 = (org.telegram.ui.mk) ta0Var4;
                                        mkVar2.a(true);
                                        org.telegram.ui.bn bnVar2 = mkVar2.I;
                                        bnVar2.D5 = null;
                                        bnVar2.ic(bnVar2.F5);
                                        break;
                                    }
                                case 7:
                                    this.b.d0.c(true);
                                    break;
                                case 8:
                                    this.b.d0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.mk mkVar3 = (org.telegram.ui.mk) this.b.d0;
                                    mkVar3.a(true);
                                    org.telegram.ui.bn bnVar3 = mkVar3.I;
                                    bnVar3.x5.d(null, bnVar3.l6);
                                    bnVar3.B8();
                                    break;
                                case 10:
                                    this.b.d0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.mk mkVar4 = (org.telegram.ui.mk) this.b.d0;
                                    mkVar4.a(true);
                                    org.telegram.ui.bn bnVar4 = mkVar4.I;
                                    bnVar4.Y5 = null;
                                    org.telegram.ui.rj rjVar = bnVar4.a0;
                                    if (rjVar != null) {
                                        rjVar.N3 = null;
                                        rjVar.O3 = false;
                                    }
                                    org.telegram.messenger.jj jjVar7 = bnVar4.x5;
                                    if (jjVar7 != null) {
                                        i152 = ((org.telegram.ui.ActionBar.g2) bnVar4).currentAccount;
                                        org.telegram.messenger.fj fjVar = bnVar4.F5;
                                        jjVar7.e(i152, null, null, fjVar == bnVar4.m4 ? null : fjVar, bnVar4.D5, bnVar4.H5);
                                    }
                                    bnVar4.B8();
                                    break;
                                case 12:
                                    na0 na0Var6 = this.b;
                                    org.telegram.messenger.jj jjVar8 = na0Var6.d0.d;
                                    if (jjVar8.o) {
                                        boolean z15 = !jjVar8.q;
                                        jjVar8.q = z15;
                                        na0Var6.H.a(z15, true);
                                        na0Var6.I.a(jjVar8.q, true);
                                        if (na0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.fj) na0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z16 = jjVar8.q;
                                            messageMedia2.force_small_media = z16;
                                            messageMedia2.force_large_media = !z16;
                                        }
                                        if (na0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.fj) na0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z17 = jjVar8.q;
                                            messageMedia.force_small_media = z17;
                                            messageMedia.force_large_media = !z17;
                                        }
                                        na0Var6.i();
                                        na0Var6.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    na0 na0Var7 = this.b;
                                    org.telegram.messenger.jj jjVar9 = na0Var7.d0.d;
                                    boolean z18 = jjVar9.r;
                                    jjVar9.r = !z18;
                                    na0Var7.F.a(z18, true);
                                    if (na0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.fj) na0Var7.r.e.get(0)).k) != null) {
                                        message4.invert_media = jjVar9.r;
                                    }
                                    if (na0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.fj) na0Var7.r.f.get(0)).k) != null) {
                                        message3.invert_media = jjVar9.r;
                                    }
                                    na0Var7.i();
                                    na0Var7.V = true;
                                    break;
                            }
                        }
                    });
                    y0Var8.h(0.12f, i27);
                    actionBarPopupWindow$ActionBarPopupWindowLayout4.a(y0Var8, c8.na.o(-1, 48));
                    final int i29 = 12;
                    frameLayout3.setOnClickListener(new View.OnClickListener(na0Var3) { // from class: org.telegram.ui.Components.ca0
                        public final /* synthetic */ na0 b;

                        {
                            this.b = na0Var3;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i152;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (i29) {
                                case 0:
                                    na0 na0Var32 = this.b;
                                    na0Var32.d0.d.d = null;
                                    na0Var32.e.f(false);
                                    na0Var32.h(false, false);
                                    na0Var32.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    na0 na0Var4 = this.b;
                                    ha0 ha0Var2 = na0Var4.e;
                                    ta0 ta0Var2 = na0Var4.d0;
                                    if (na0Var4.c(null) != null) {
                                        if (ha0Var2.v - ha0Var2.u <= org.telegram.messenger.mp.u1(ta0Var2.x).r4) {
                                            org.telegram.ui.Cells.q9 q9Var = ha0Var2.W;
                                            org.telegram.messenger.fj c11 = na0Var4.c(q9Var != null ? ((org.telegram.ui.Cells.r1) q9Var).getMessageObject() : null);
                                            org.telegram.messenger.jj jjVar5 = ta0Var2.d;
                                            int i162 = ha0Var2.u;
                                            jjVar5.e = i162;
                                            int i172 = ha0Var2.v;
                                            jjVar5.f = i172;
                                            jjVar5.d = org.telegram.ui.rm.b(i162, i172, c11);
                                            ta0Var2.b();
                                            ta0Var2.a(true);
                                            break;
                                        } else {
                                            na0Var4.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    na0 na0Var5 = this.b;
                                    ha0 ha0Var3 = na0Var5.e;
                                    ta0 ta0Var3 = na0Var5.d0;
                                    org.telegram.messenger.jj jjVar6 = ta0Var3.d;
                                    int i182 = ta0Var3.x;
                                    boolean z142 = ta0Var3.b;
                                    if (jjVar6.d != null && !z142) {
                                        jjVar6.d = null;
                                        ha0Var3.f(false);
                                        na0Var5.h(false, true);
                                        na0Var5.l(true);
                                        break;
                                    } else if (ha0Var3.v - ha0Var3.u <= org.telegram.messenger.mp.u1(i182).r4) {
                                        org.telegram.messenger.fj c12 = na0Var5.c(null);
                                        if (c12 != null) {
                                            if (!ha0Var3.x()) {
                                                jjVar6.e = 0;
                                                int min = Math.min(org.telegram.messenger.mp.u1(i182).r4, org.telegram.ui.rm.d(c12));
                                                jjVar6.f = min;
                                                jjVar6.d = org.telegram.ui.rm.b(jjVar6.e, min, c12);
                                                View d = na0Var5.d();
                                                if (d instanceof org.telegram.ui.Cells.r1) {
                                                    ha0Var3.a0((org.telegram.ui.Cells.r1) d, jjVar6.e, jjVar6.f);
                                                }
                                                if (!z142) {
                                                    na0Var5.s.getSwipeBack().e(na0Var5.J);
                                                }
                                                na0Var5.h(true, true);
                                                break;
                                            } else {
                                                jjVar6.e = ha0Var3.u;
                                                jjVar6.f = ha0Var3.v;
                                                org.telegram.ui.Cells.q9 q9Var2 = ha0Var3.W;
                                                jjVar6.d = org.telegram.ui.rm.b(jjVar6.e, jjVar6.f, na0Var5.c(q9Var2 != null ? ((org.telegram.ui.Cells.r1) q9Var2).getMessageObject() : null));
                                                ta0Var3.b();
                                                ta0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        na0Var5.g();
                                        break;
                                    }
                                    break;
                                case 3:
                                    this.b.d0.c(false);
                                    break;
                                case 4:
                                    this.b.d0.c(false);
                                    break;
                                case 5:
                                    this.b.d0.a(true);
                                    break;
                                case 6:
                                    ta0 ta0Var4 = this.b.d0;
                                    if (!ta0Var4.b) {
                                        org.telegram.ui.mk mkVar = (org.telegram.ui.mk) ta0Var4;
                                        mkVar.a(true);
                                        org.telegram.ui.bn bnVar = mkVar.I;
                                        bnVar.F5 = null;
                                        bnVar.D5 = null;
                                        bnVar.x5.f(null, null, bnVar.l6, null);
                                        bnVar.B8();
                                        break;
                                    } else {
                                        org.telegram.ui.mk mkVar2 = (org.telegram.ui.mk) ta0Var4;
                                        mkVar2.a(true);
                                        org.telegram.ui.bn bnVar2 = mkVar2.I;
                                        bnVar2.D5 = null;
                                        bnVar2.ic(bnVar2.F5);
                                        break;
                                    }
                                case 7:
                                    this.b.d0.c(true);
                                    break;
                                case 8:
                                    this.b.d0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.mk mkVar3 = (org.telegram.ui.mk) this.b.d0;
                                    mkVar3.a(true);
                                    org.telegram.ui.bn bnVar3 = mkVar3.I;
                                    bnVar3.x5.d(null, bnVar3.l6);
                                    bnVar3.B8();
                                    break;
                                case 10:
                                    this.b.d0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.mk mkVar4 = (org.telegram.ui.mk) this.b.d0;
                                    mkVar4.a(true);
                                    org.telegram.ui.bn bnVar4 = mkVar4.I;
                                    bnVar4.Y5 = null;
                                    org.telegram.ui.rj rjVar = bnVar4.a0;
                                    if (rjVar != null) {
                                        rjVar.N3 = null;
                                        rjVar.O3 = false;
                                    }
                                    org.telegram.messenger.jj jjVar7 = bnVar4.x5;
                                    if (jjVar7 != null) {
                                        i152 = ((org.telegram.ui.ActionBar.g2) bnVar4).currentAccount;
                                        org.telegram.messenger.fj fjVar = bnVar4.F5;
                                        jjVar7.e(i152, null, null, fjVar == bnVar4.m4 ? null : fjVar, bnVar4.D5, bnVar4.H5);
                                    }
                                    bnVar4.B8();
                                    break;
                                case 12:
                                    na0 na0Var6 = this.b;
                                    org.telegram.messenger.jj jjVar8 = na0Var6.d0.d;
                                    if (jjVar8.o) {
                                        boolean z15 = !jjVar8.q;
                                        jjVar8.q = z15;
                                        na0Var6.H.a(z15, true);
                                        na0Var6.I.a(jjVar8.q, true);
                                        if (na0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.fj) na0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z16 = jjVar8.q;
                                            messageMedia2.force_small_media = z16;
                                            messageMedia2.force_large_media = !z16;
                                        }
                                        if (na0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.fj) na0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z17 = jjVar8.q;
                                            messageMedia.force_small_media = z17;
                                            messageMedia.force_large_media = !z17;
                                        }
                                        na0Var6.i();
                                        na0Var6.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    na0 na0Var7 = this.b;
                                    org.telegram.messenger.jj jjVar9 = na0Var7.d0.d;
                                    boolean z18 = jjVar9.r;
                                    jjVar9.r = !z18;
                                    na0Var7.F.a(z18, true);
                                    if (na0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.fj) na0Var7.r.e.get(0)).k) != null) {
                                        message4.invert_media = jjVar9.r;
                                    }
                                    if (na0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.fj) na0Var7.r.f.get(0)).k) != null) {
                                        message3.invert_media = jjVar9.r;
                                    }
                                    na0Var7.i();
                                    na0Var7.V = true;
                                    break;
                            }
                        }
                    });
                    final int i30 = 13;
                    sa0Var3.setOnClickListener(new View.OnClickListener(na0Var3) { // from class: org.telegram.ui.Components.ca0
                        public final /* synthetic */ na0 b;

                        {
                            this.b = na0Var3;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i152;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (i30) {
                                case 0:
                                    na0 na0Var32 = this.b;
                                    na0Var32.d0.d.d = null;
                                    na0Var32.e.f(false);
                                    na0Var32.h(false, false);
                                    na0Var32.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    na0 na0Var4 = this.b;
                                    ha0 ha0Var2 = na0Var4.e;
                                    ta0 ta0Var2 = na0Var4.d0;
                                    if (na0Var4.c(null) != null) {
                                        if (ha0Var2.v - ha0Var2.u <= org.telegram.messenger.mp.u1(ta0Var2.x).r4) {
                                            org.telegram.ui.Cells.q9 q9Var = ha0Var2.W;
                                            org.telegram.messenger.fj c11 = na0Var4.c(q9Var != null ? ((org.telegram.ui.Cells.r1) q9Var).getMessageObject() : null);
                                            org.telegram.messenger.jj jjVar5 = ta0Var2.d;
                                            int i162 = ha0Var2.u;
                                            jjVar5.e = i162;
                                            int i172 = ha0Var2.v;
                                            jjVar5.f = i172;
                                            jjVar5.d = org.telegram.ui.rm.b(i162, i172, c11);
                                            ta0Var2.b();
                                            ta0Var2.a(true);
                                            break;
                                        } else {
                                            na0Var4.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    na0 na0Var5 = this.b;
                                    ha0 ha0Var3 = na0Var5.e;
                                    ta0 ta0Var3 = na0Var5.d0;
                                    org.telegram.messenger.jj jjVar6 = ta0Var3.d;
                                    int i182 = ta0Var3.x;
                                    boolean z142 = ta0Var3.b;
                                    if (jjVar6.d != null && !z142) {
                                        jjVar6.d = null;
                                        ha0Var3.f(false);
                                        na0Var5.h(false, true);
                                        na0Var5.l(true);
                                        break;
                                    } else if (ha0Var3.v - ha0Var3.u <= org.telegram.messenger.mp.u1(i182).r4) {
                                        org.telegram.messenger.fj c12 = na0Var5.c(null);
                                        if (c12 != null) {
                                            if (!ha0Var3.x()) {
                                                jjVar6.e = 0;
                                                int min = Math.min(org.telegram.messenger.mp.u1(i182).r4, org.telegram.ui.rm.d(c12));
                                                jjVar6.f = min;
                                                jjVar6.d = org.telegram.ui.rm.b(jjVar6.e, min, c12);
                                                View d = na0Var5.d();
                                                if (d instanceof org.telegram.ui.Cells.r1) {
                                                    ha0Var3.a0((org.telegram.ui.Cells.r1) d, jjVar6.e, jjVar6.f);
                                                }
                                                if (!z142) {
                                                    na0Var5.s.getSwipeBack().e(na0Var5.J);
                                                }
                                                na0Var5.h(true, true);
                                                break;
                                            } else {
                                                jjVar6.e = ha0Var3.u;
                                                jjVar6.f = ha0Var3.v;
                                                org.telegram.ui.Cells.q9 q9Var2 = ha0Var3.W;
                                                jjVar6.d = org.telegram.ui.rm.b(jjVar6.e, jjVar6.f, na0Var5.c(q9Var2 != null ? ((org.telegram.ui.Cells.r1) q9Var2).getMessageObject() : null));
                                                ta0Var3.b();
                                                ta0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        na0Var5.g();
                                        break;
                                    }
                                    break;
                                case 3:
                                    this.b.d0.c(false);
                                    break;
                                case 4:
                                    this.b.d0.c(false);
                                    break;
                                case 5:
                                    this.b.d0.a(true);
                                    break;
                                case 6:
                                    ta0 ta0Var4 = this.b.d0;
                                    if (!ta0Var4.b) {
                                        org.telegram.ui.mk mkVar = (org.telegram.ui.mk) ta0Var4;
                                        mkVar.a(true);
                                        org.telegram.ui.bn bnVar = mkVar.I;
                                        bnVar.F5 = null;
                                        bnVar.D5 = null;
                                        bnVar.x5.f(null, null, bnVar.l6, null);
                                        bnVar.B8();
                                        break;
                                    } else {
                                        org.telegram.ui.mk mkVar2 = (org.telegram.ui.mk) ta0Var4;
                                        mkVar2.a(true);
                                        org.telegram.ui.bn bnVar2 = mkVar2.I;
                                        bnVar2.D5 = null;
                                        bnVar2.ic(bnVar2.F5);
                                        break;
                                    }
                                case 7:
                                    this.b.d0.c(true);
                                    break;
                                case 8:
                                    this.b.d0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.mk mkVar3 = (org.telegram.ui.mk) this.b.d0;
                                    mkVar3.a(true);
                                    org.telegram.ui.bn bnVar3 = mkVar3.I;
                                    bnVar3.x5.d(null, bnVar3.l6);
                                    bnVar3.B8();
                                    break;
                                case 10:
                                    this.b.d0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.mk mkVar4 = (org.telegram.ui.mk) this.b.d0;
                                    mkVar4.a(true);
                                    org.telegram.ui.bn bnVar4 = mkVar4.I;
                                    bnVar4.Y5 = null;
                                    org.telegram.ui.rj rjVar = bnVar4.a0;
                                    if (rjVar != null) {
                                        rjVar.N3 = null;
                                        rjVar.O3 = false;
                                    }
                                    org.telegram.messenger.jj jjVar7 = bnVar4.x5;
                                    if (jjVar7 != null) {
                                        i152 = ((org.telegram.ui.ActionBar.g2) bnVar4).currentAccount;
                                        org.telegram.messenger.fj fjVar = bnVar4.F5;
                                        jjVar7.e(i152, null, null, fjVar == bnVar4.m4 ? null : fjVar, bnVar4.D5, bnVar4.H5);
                                    }
                                    bnVar4.B8();
                                    break;
                                case 12:
                                    na0 na0Var6 = this.b;
                                    org.telegram.messenger.jj jjVar8 = na0Var6.d0.d;
                                    if (jjVar8.o) {
                                        boolean z15 = !jjVar8.q;
                                        jjVar8.q = z15;
                                        na0Var6.H.a(z15, true);
                                        na0Var6.I.a(jjVar8.q, true);
                                        if (na0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.fj) na0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z16 = jjVar8.q;
                                            messageMedia2.force_small_media = z16;
                                            messageMedia2.force_large_media = !z16;
                                        }
                                        if (na0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.fj) na0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z17 = jjVar8.q;
                                            messageMedia.force_small_media = z17;
                                            messageMedia.force_large_media = !z17;
                                        }
                                        na0Var6.i();
                                        na0Var6.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    na0 na0Var7 = this.b;
                                    org.telegram.messenger.jj jjVar9 = na0Var7.d0.d;
                                    boolean z18 = jjVar9.r;
                                    jjVar9.r = !z18;
                                    na0Var7.F.a(z18, true);
                                    if (na0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.fj) na0Var7.r.e.get(0)).k) != null) {
                                        message4.invert_media = jjVar9.r;
                                    }
                                    if (na0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.fj) na0Var7.r.f.get(0)).k) != null) {
                                        message3.invert_media = jjVar9.r;
                                    }
                                    na0Var7.i();
                                    na0Var7.V = true;
                                    break;
                            }
                        }
                    });
                    na0Var2 = na0Var3;
                    i10 = na0Var2.a;
                    if (i10 == 1) {
                    }
                    n10 = na0Var2.e.n(context2);
                    na0Var2.d = n10;
                    n10.setElevation(org.telegram.messenger.g0.L(8.0f));
                    n10.setOutlineProvider(viewOutlineProvider);
                    if (n10.getParent() instanceof ViewGroup) {
                    }
                    na0Var2.addView(n10, c8.na.d(-1, -1.0f, 51, 0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / org.telegram.messenger.g0.p, 0.0f, 0.0f));
                    na0Var2.e.S(na0Var2.f);
                }
            }
        } else {
            if (!org.telegram.messenger.i10.i(ta0Var.x).q()) {
                for (int i31 = 0; i31 < jjVar.b.e.size(); i31++) {
                    if (((org.telegram.messenger.fj) jjVar.b.e.get(i31)).D == 36) {
                        z10 = false;
                        break;
                    }
                }
            }
            z10 = true;
            sa0 sa0Var6 = new sa0(context, R.raw.name_hide, org.telegram.messenger.gd.N0(jjVar.j ? 2131745136 : 2131745135, null), R.raw.name_show, org.telegram.messenger.gd.N0(jjVar.j ? 2131749116 : 2131749115, null), ta0Var.G);
            this.s.a(sa0Var6, c8.na.o(-1, 48));
            if (jjVar.g) {
                sa0Var = sa0Var6;
                sa0 sa0Var7 = new sa0(context, R.raw.caption_hide, org.telegram.messenger.gd.N0(2131745148, null), R.raw.caption_show, org.telegram.messenger.gd.N0(2131749128, null), ta0Var.G);
                sa0Var7.a(jjVar.l, false);
                this.s.a(sa0Var7, c8.na.o(-1, 48));
                sa0Var2 = sa0Var7;
            } else {
                sa0Var = sa0Var6;
                sa0Var2 = null;
            }
            org.telegram.ui.ActionBar.y0 y0Var9 = new org.telegram.ui.ActionBar.y0(0, context, ta0Var.G, true, false);
            final int i32 = 7;
            y0Var9.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ca0
                public final /* synthetic */ na0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i152;
                    TLRPC.Message message;
                    TLRPC.MessageMedia messageMedia;
                    TLRPC.Message message2;
                    TLRPC.MessageMedia messageMedia2;
                    TLRPC.Message message3;
                    TLRPC.Message message4;
                    switch (i32) {
                        case 0:
                            na0 na0Var32 = this.b;
                            na0Var32.d0.d.d = null;
                            na0Var32.e.f(false);
                            na0Var32.h(false, false);
                            na0Var32.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            na0 na0Var4 = this.b;
                            ha0 ha0Var2 = na0Var4.e;
                            ta0 ta0Var2 = na0Var4.d0;
                            if (na0Var4.c(null) != null) {
                                if (ha0Var2.v - ha0Var2.u <= org.telegram.messenger.mp.u1(ta0Var2.x).r4) {
                                    org.telegram.ui.Cells.q9 q9Var = ha0Var2.W;
                                    org.telegram.messenger.fj c11 = na0Var4.c(q9Var != null ? ((org.telegram.ui.Cells.r1) q9Var).getMessageObject() : null);
                                    org.telegram.messenger.jj jjVar5 = ta0Var2.d;
                                    int i162 = ha0Var2.u;
                                    jjVar5.e = i162;
                                    int i172 = ha0Var2.v;
                                    jjVar5.f = i172;
                                    jjVar5.d = org.telegram.ui.rm.b(i162, i172, c11);
                                    ta0Var2.b();
                                    ta0Var2.a(true);
                                    break;
                                } else {
                                    na0Var4.g();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            na0 na0Var5 = this.b;
                            ha0 ha0Var3 = na0Var5.e;
                            ta0 ta0Var3 = na0Var5.d0;
                            org.telegram.messenger.jj jjVar6 = ta0Var3.d;
                            int i182 = ta0Var3.x;
                            boolean z142 = ta0Var3.b;
                            if (jjVar6.d != null && !z142) {
                                jjVar6.d = null;
                                ha0Var3.f(false);
                                na0Var5.h(false, true);
                                na0Var5.l(true);
                                break;
                            } else if (ha0Var3.v - ha0Var3.u <= org.telegram.messenger.mp.u1(i182).r4) {
                                org.telegram.messenger.fj c12 = na0Var5.c(null);
                                if (c12 != null) {
                                    if (!ha0Var3.x()) {
                                        jjVar6.e = 0;
                                        int min = Math.min(org.telegram.messenger.mp.u1(i182).r4, org.telegram.ui.rm.d(c12));
                                        jjVar6.f = min;
                                        jjVar6.d = org.telegram.ui.rm.b(jjVar6.e, min, c12);
                                        View d = na0Var5.d();
                                        if (d instanceof org.telegram.ui.Cells.r1) {
                                            ha0Var3.a0((org.telegram.ui.Cells.r1) d, jjVar6.e, jjVar6.f);
                                        }
                                        if (!z142) {
                                            na0Var5.s.getSwipeBack().e(na0Var5.J);
                                        }
                                        na0Var5.h(true, true);
                                        break;
                                    } else {
                                        jjVar6.e = ha0Var3.u;
                                        jjVar6.f = ha0Var3.v;
                                        org.telegram.ui.Cells.q9 q9Var2 = ha0Var3.W;
                                        jjVar6.d = org.telegram.ui.rm.b(jjVar6.e, jjVar6.f, na0Var5.c(q9Var2 != null ? ((org.telegram.ui.Cells.r1) q9Var2).getMessageObject() : null));
                                        ta0Var3.b();
                                        ta0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                na0Var5.g();
                                break;
                            }
                            break;
                        case 3:
                            this.b.d0.c(false);
                            break;
                        case 4:
                            this.b.d0.c(false);
                            break;
                        case 5:
                            this.b.d0.a(true);
                            break;
                        case 6:
                            ta0 ta0Var4 = this.b.d0;
                            if (!ta0Var4.b) {
                                org.telegram.ui.mk mkVar = (org.telegram.ui.mk) ta0Var4;
                                mkVar.a(true);
                                org.telegram.ui.bn bnVar = mkVar.I;
                                bnVar.F5 = null;
                                bnVar.D5 = null;
                                bnVar.x5.f(null, null, bnVar.l6, null);
                                bnVar.B8();
                                break;
                            } else {
                                org.telegram.ui.mk mkVar2 = (org.telegram.ui.mk) ta0Var4;
                                mkVar2.a(true);
                                org.telegram.ui.bn bnVar2 = mkVar2.I;
                                bnVar2.D5 = null;
                                bnVar2.ic(bnVar2.F5);
                                break;
                            }
                        case 7:
                            this.b.d0.c(true);
                            break;
                        case 8:
                            this.b.d0.a(true);
                            break;
                        case 9:
                            org.telegram.ui.mk mkVar3 = (org.telegram.ui.mk) this.b.d0;
                            mkVar3.a(true);
                            org.telegram.ui.bn bnVar3 = mkVar3.I;
                            bnVar3.x5.d(null, bnVar3.l6);
                            bnVar3.B8();
                            break;
                        case 10:
                            this.b.d0.a(true);
                            break;
                        case 11:
                            org.telegram.ui.mk mkVar4 = (org.telegram.ui.mk) this.b.d0;
                            mkVar4.a(true);
                            org.telegram.ui.bn bnVar4 = mkVar4.I;
                            bnVar4.Y5 = null;
                            org.telegram.ui.rj rjVar = bnVar4.a0;
                            if (rjVar != null) {
                                rjVar.N3 = null;
                                rjVar.O3 = false;
                            }
                            org.telegram.messenger.jj jjVar7 = bnVar4.x5;
                            if (jjVar7 != null) {
                                i152 = ((org.telegram.ui.ActionBar.g2) bnVar4).currentAccount;
                                org.telegram.messenger.fj fjVar = bnVar4.F5;
                                jjVar7.e(i152, null, null, fjVar == bnVar4.m4 ? null : fjVar, bnVar4.D5, bnVar4.H5);
                            }
                            bnVar4.B8();
                            break;
                        case 12:
                            na0 na0Var6 = this.b;
                            org.telegram.messenger.jj jjVar8 = na0Var6.d0.d;
                            if (jjVar8.o) {
                                boolean z15 = !jjVar8.q;
                                jjVar8.q = z15;
                                na0Var6.H.a(z15, true);
                                na0Var6.I.a(jjVar8.q, true);
                                if (na0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.fj) na0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z16 = jjVar8.q;
                                    messageMedia2.force_small_media = z16;
                                    messageMedia2.force_large_media = !z16;
                                }
                                if (na0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.fj) na0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                    boolean z17 = jjVar8.q;
                                    messageMedia.force_small_media = z17;
                                    messageMedia.force_large_media = !z17;
                                }
                                na0Var6.i();
                                na0Var6.V = true;
                                break;
                            }
                            break;
                        default:
                            na0 na0Var7 = this.b;
                            org.telegram.messenger.jj jjVar9 = na0Var7.d0.d;
                            boolean z18 = jjVar9.r;
                            jjVar9.r = !z18;
                            na0Var7.F.a(z18, true);
                            if (na0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.fj) na0Var7.r.e.get(0)).k) != null) {
                                message4.invert_media = jjVar9.r;
                            }
                            if (na0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.fj) na0Var7.r.f.get(0)).k) != null) {
                                message3.invert_media = jjVar9.r;
                            }
                            na0Var7.i();
                            na0Var7.V = true;
                            break;
                    }
                }
            });
            y0Var9.j(org.telegram.messenger.gd.N0(2131752520, null), R.drawable.msg_forward_replace, null);
            this.s.a(y0Var9, c8.na.o(-1, 48));
            org.telegram.ui.ActionBar.d1 d1Var4 = new org.telegram.ui.ActionBar.d1(context, pa0Var);
            org.telegram.ui.ActionBar.u6.i(d1Var4, org.telegram.ui.ActionBar.u6.K(0.06f, org.telegram.ui.ActionBar.n6.E8), pa0Var);
            d1Var4.setTag(R.id.fit_width_tag, 1);
            final int i33 = 8;
            this.s.a(d1Var4, c8.na.o(-1, 8));
            org.telegram.ui.ActionBar.y0 y0Var10 = new org.telegram.ui.ActionBar.y0(1, context, ta0Var.G, false, false);
            y0Var10.j(org.telegram.messenger.gd.N0(2131754215, null), R.drawable.msg_select, null);
            y0Var10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ca0
                public final /* synthetic */ na0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i152;
                    TLRPC.Message message;
                    TLRPC.MessageMedia messageMedia;
                    TLRPC.Message message2;
                    TLRPC.MessageMedia messageMedia2;
                    TLRPC.Message message3;
                    TLRPC.Message message4;
                    switch (i33) {
                        case 0:
                            na0 na0Var32 = this.b;
                            na0Var32.d0.d.d = null;
                            na0Var32.e.f(false);
                            na0Var32.h(false, false);
                            na0Var32.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            na0 na0Var4 = this.b;
                            ha0 ha0Var2 = na0Var4.e;
                            ta0 ta0Var2 = na0Var4.d0;
                            if (na0Var4.c(null) != null) {
                                if (ha0Var2.v - ha0Var2.u <= org.telegram.messenger.mp.u1(ta0Var2.x).r4) {
                                    org.telegram.ui.Cells.q9 q9Var = ha0Var2.W;
                                    org.telegram.messenger.fj c11 = na0Var4.c(q9Var != null ? ((org.telegram.ui.Cells.r1) q9Var).getMessageObject() : null);
                                    org.telegram.messenger.jj jjVar5 = ta0Var2.d;
                                    int i162 = ha0Var2.u;
                                    jjVar5.e = i162;
                                    int i172 = ha0Var2.v;
                                    jjVar5.f = i172;
                                    jjVar5.d = org.telegram.ui.rm.b(i162, i172, c11);
                                    ta0Var2.b();
                                    ta0Var2.a(true);
                                    break;
                                } else {
                                    na0Var4.g();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            na0 na0Var5 = this.b;
                            ha0 ha0Var3 = na0Var5.e;
                            ta0 ta0Var3 = na0Var5.d0;
                            org.telegram.messenger.jj jjVar6 = ta0Var3.d;
                            int i182 = ta0Var3.x;
                            boolean z142 = ta0Var3.b;
                            if (jjVar6.d != null && !z142) {
                                jjVar6.d = null;
                                ha0Var3.f(false);
                                na0Var5.h(false, true);
                                na0Var5.l(true);
                                break;
                            } else if (ha0Var3.v - ha0Var3.u <= org.telegram.messenger.mp.u1(i182).r4) {
                                org.telegram.messenger.fj c12 = na0Var5.c(null);
                                if (c12 != null) {
                                    if (!ha0Var3.x()) {
                                        jjVar6.e = 0;
                                        int min = Math.min(org.telegram.messenger.mp.u1(i182).r4, org.telegram.ui.rm.d(c12));
                                        jjVar6.f = min;
                                        jjVar6.d = org.telegram.ui.rm.b(jjVar6.e, min, c12);
                                        View d = na0Var5.d();
                                        if (d instanceof org.telegram.ui.Cells.r1) {
                                            ha0Var3.a0((org.telegram.ui.Cells.r1) d, jjVar6.e, jjVar6.f);
                                        }
                                        if (!z142) {
                                            na0Var5.s.getSwipeBack().e(na0Var5.J);
                                        }
                                        na0Var5.h(true, true);
                                        break;
                                    } else {
                                        jjVar6.e = ha0Var3.u;
                                        jjVar6.f = ha0Var3.v;
                                        org.telegram.ui.Cells.q9 q9Var2 = ha0Var3.W;
                                        jjVar6.d = org.telegram.ui.rm.b(jjVar6.e, jjVar6.f, na0Var5.c(q9Var2 != null ? ((org.telegram.ui.Cells.r1) q9Var2).getMessageObject() : null));
                                        ta0Var3.b();
                                        ta0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                na0Var5.g();
                                break;
                            }
                            break;
                        case 3:
                            this.b.d0.c(false);
                            break;
                        case 4:
                            this.b.d0.c(false);
                            break;
                        case 5:
                            this.b.d0.a(true);
                            break;
                        case 6:
                            ta0 ta0Var4 = this.b.d0;
                            if (!ta0Var4.b) {
                                org.telegram.ui.mk mkVar = (org.telegram.ui.mk) ta0Var4;
                                mkVar.a(true);
                                org.telegram.ui.bn bnVar = mkVar.I;
                                bnVar.F5 = null;
                                bnVar.D5 = null;
                                bnVar.x5.f(null, null, bnVar.l6, null);
                                bnVar.B8();
                                break;
                            } else {
                                org.telegram.ui.mk mkVar2 = (org.telegram.ui.mk) ta0Var4;
                                mkVar2.a(true);
                                org.telegram.ui.bn bnVar2 = mkVar2.I;
                                bnVar2.D5 = null;
                                bnVar2.ic(bnVar2.F5);
                                break;
                            }
                        case 7:
                            this.b.d0.c(true);
                            break;
                        case 8:
                            this.b.d0.a(true);
                            break;
                        case 9:
                            org.telegram.ui.mk mkVar3 = (org.telegram.ui.mk) this.b.d0;
                            mkVar3.a(true);
                            org.telegram.ui.bn bnVar3 = mkVar3.I;
                            bnVar3.x5.d(null, bnVar3.l6);
                            bnVar3.B8();
                            break;
                        case 10:
                            this.b.d0.a(true);
                            break;
                        case 11:
                            org.telegram.ui.mk mkVar4 = (org.telegram.ui.mk) this.b.d0;
                            mkVar4.a(true);
                            org.telegram.ui.bn bnVar4 = mkVar4.I;
                            bnVar4.Y5 = null;
                            org.telegram.ui.rj rjVar = bnVar4.a0;
                            if (rjVar != null) {
                                rjVar.N3 = null;
                                rjVar.O3 = false;
                            }
                            org.telegram.messenger.jj jjVar7 = bnVar4.x5;
                            if (jjVar7 != null) {
                                i152 = ((org.telegram.ui.ActionBar.g2) bnVar4).currentAccount;
                                org.telegram.messenger.fj fjVar = bnVar4.F5;
                                jjVar7.e(i152, null, null, fjVar == bnVar4.m4 ? null : fjVar, bnVar4.D5, bnVar4.H5);
                            }
                            bnVar4.B8();
                            break;
                        case 12:
                            na0 na0Var6 = this.b;
                            org.telegram.messenger.jj jjVar8 = na0Var6.d0.d;
                            if (jjVar8.o) {
                                boolean z15 = !jjVar8.q;
                                jjVar8.q = z15;
                                na0Var6.H.a(z15, true);
                                na0Var6.I.a(jjVar8.q, true);
                                if (na0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.fj) na0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z16 = jjVar8.q;
                                    messageMedia2.force_small_media = z16;
                                    messageMedia2.force_large_media = !z16;
                                }
                                if (na0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.fj) na0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                    boolean z17 = jjVar8.q;
                                    messageMedia.force_small_media = z17;
                                    messageMedia.force_large_media = !z17;
                                }
                                na0Var6.i();
                                na0Var6.V = true;
                                break;
                            }
                            break;
                        default:
                            na0 na0Var7 = this.b;
                            org.telegram.messenger.jj jjVar9 = na0Var7.d0.d;
                            boolean z18 = jjVar9.r;
                            jjVar9.r = !z18;
                            na0Var7.F.a(z18, true);
                            if (na0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.fj) na0Var7.r.e.get(0)).k) != null) {
                                message4.invert_media = jjVar9.r;
                            }
                            if (na0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.fj) na0Var7.r.f.get(0)).k) != null) {
                                message3.invert_media = jjVar9.r;
                            }
                            na0Var7.i();
                            na0Var7.V = true;
                            break;
                    }
                }
            });
            this.s.a(y0Var10, c8.na.o(-1, 48));
            org.telegram.ui.ActionBar.y0 y0Var11 = new org.telegram.ui.ActionBar.y0(1, context, ta0Var.G, false, true);
            y0Var11.j(org.telegram.messenger.gd.N0(2131751350, null), R.drawable.msg_delete, null);
            int i34 = org.telegram.ui.ActionBar.n6.q7;
            int i35 = org.telegram.ui.ActionBar.n6.p7;
            y0Var11.c(i34, i35);
            final int i36 = 9;
            y0Var11.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ca0
                public final /* synthetic */ na0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i152;
                    TLRPC.Message message;
                    TLRPC.MessageMedia messageMedia;
                    TLRPC.Message message2;
                    TLRPC.MessageMedia messageMedia2;
                    TLRPC.Message message3;
                    TLRPC.Message message4;
                    switch (i36) {
                        case 0:
                            na0 na0Var32 = this.b;
                            na0Var32.d0.d.d = null;
                            na0Var32.e.f(false);
                            na0Var32.h(false, false);
                            na0Var32.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            na0 na0Var4 = this.b;
                            ha0 ha0Var2 = na0Var4.e;
                            ta0 ta0Var2 = na0Var4.d0;
                            if (na0Var4.c(null) != null) {
                                if (ha0Var2.v - ha0Var2.u <= org.telegram.messenger.mp.u1(ta0Var2.x).r4) {
                                    org.telegram.ui.Cells.q9 q9Var = ha0Var2.W;
                                    org.telegram.messenger.fj c11 = na0Var4.c(q9Var != null ? ((org.telegram.ui.Cells.r1) q9Var).getMessageObject() : null);
                                    org.telegram.messenger.jj jjVar5 = ta0Var2.d;
                                    int i162 = ha0Var2.u;
                                    jjVar5.e = i162;
                                    int i172 = ha0Var2.v;
                                    jjVar5.f = i172;
                                    jjVar5.d = org.telegram.ui.rm.b(i162, i172, c11);
                                    ta0Var2.b();
                                    ta0Var2.a(true);
                                    break;
                                } else {
                                    na0Var4.g();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            na0 na0Var5 = this.b;
                            ha0 ha0Var3 = na0Var5.e;
                            ta0 ta0Var3 = na0Var5.d0;
                            org.telegram.messenger.jj jjVar6 = ta0Var3.d;
                            int i182 = ta0Var3.x;
                            boolean z142 = ta0Var3.b;
                            if (jjVar6.d != null && !z142) {
                                jjVar6.d = null;
                                ha0Var3.f(false);
                                na0Var5.h(false, true);
                                na0Var5.l(true);
                                break;
                            } else if (ha0Var3.v - ha0Var3.u <= org.telegram.messenger.mp.u1(i182).r4) {
                                org.telegram.messenger.fj c12 = na0Var5.c(null);
                                if (c12 != null) {
                                    if (!ha0Var3.x()) {
                                        jjVar6.e = 0;
                                        int min = Math.min(org.telegram.messenger.mp.u1(i182).r4, org.telegram.ui.rm.d(c12));
                                        jjVar6.f = min;
                                        jjVar6.d = org.telegram.ui.rm.b(jjVar6.e, min, c12);
                                        View d = na0Var5.d();
                                        if (d instanceof org.telegram.ui.Cells.r1) {
                                            ha0Var3.a0((org.telegram.ui.Cells.r1) d, jjVar6.e, jjVar6.f);
                                        }
                                        if (!z142) {
                                            na0Var5.s.getSwipeBack().e(na0Var5.J);
                                        }
                                        na0Var5.h(true, true);
                                        break;
                                    } else {
                                        jjVar6.e = ha0Var3.u;
                                        jjVar6.f = ha0Var3.v;
                                        org.telegram.ui.Cells.q9 q9Var2 = ha0Var3.W;
                                        jjVar6.d = org.telegram.ui.rm.b(jjVar6.e, jjVar6.f, na0Var5.c(q9Var2 != null ? ((org.telegram.ui.Cells.r1) q9Var2).getMessageObject() : null));
                                        ta0Var3.b();
                                        ta0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                na0Var5.g();
                                break;
                            }
                            break;
                        case 3:
                            this.b.d0.c(false);
                            break;
                        case 4:
                            this.b.d0.c(false);
                            break;
                        case 5:
                            this.b.d0.a(true);
                            break;
                        case 6:
                            ta0 ta0Var4 = this.b.d0;
                            if (!ta0Var4.b) {
                                org.telegram.ui.mk mkVar = (org.telegram.ui.mk) ta0Var4;
                                mkVar.a(true);
                                org.telegram.ui.bn bnVar = mkVar.I;
                                bnVar.F5 = null;
                                bnVar.D5 = null;
                                bnVar.x5.f(null, null, bnVar.l6, null);
                                bnVar.B8();
                                break;
                            } else {
                                org.telegram.ui.mk mkVar2 = (org.telegram.ui.mk) ta0Var4;
                                mkVar2.a(true);
                                org.telegram.ui.bn bnVar2 = mkVar2.I;
                                bnVar2.D5 = null;
                                bnVar2.ic(bnVar2.F5);
                                break;
                            }
                        case 7:
                            this.b.d0.c(true);
                            break;
                        case 8:
                            this.b.d0.a(true);
                            break;
                        case 9:
                            org.telegram.ui.mk mkVar3 = (org.telegram.ui.mk) this.b.d0;
                            mkVar3.a(true);
                            org.telegram.ui.bn bnVar3 = mkVar3.I;
                            bnVar3.x5.d(null, bnVar3.l6);
                            bnVar3.B8();
                            break;
                        case 10:
                            this.b.d0.a(true);
                            break;
                        case 11:
                            org.telegram.ui.mk mkVar4 = (org.telegram.ui.mk) this.b.d0;
                            mkVar4.a(true);
                            org.telegram.ui.bn bnVar4 = mkVar4.I;
                            bnVar4.Y5 = null;
                            org.telegram.ui.rj rjVar = bnVar4.a0;
                            if (rjVar != null) {
                                rjVar.N3 = null;
                                rjVar.O3 = false;
                            }
                            org.telegram.messenger.jj jjVar7 = bnVar4.x5;
                            if (jjVar7 != null) {
                                i152 = ((org.telegram.ui.ActionBar.g2) bnVar4).currentAccount;
                                org.telegram.messenger.fj fjVar = bnVar4.F5;
                                jjVar7.e(i152, null, null, fjVar == bnVar4.m4 ? null : fjVar, bnVar4.D5, bnVar4.H5);
                            }
                            bnVar4.B8();
                            break;
                        case 12:
                            na0 na0Var6 = this.b;
                            org.telegram.messenger.jj jjVar8 = na0Var6.d0.d;
                            if (jjVar8.o) {
                                boolean z15 = !jjVar8.q;
                                jjVar8.q = z15;
                                na0Var6.H.a(z15, true);
                                na0Var6.I.a(jjVar8.q, true);
                                if (na0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.fj) na0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z16 = jjVar8.q;
                                    messageMedia2.force_small_media = z16;
                                    messageMedia2.force_large_media = !z16;
                                }
                                if (na0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.fj) na0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                    boolean z17 = jjVar8.q;
                                    messageMedia.force_small_media = z17;
                                    messageMedia.force_large_media = !z17;
                                }
                                na0Var6.i();
                                na0Var6.V = true;
                                break;
                            }
                            break;
                        default:
                            na0 na0Var7 = this.b;
                            org.telegram.messenger.jj jjVar9 = na0Var7.d0.d;
                            boolean z18 = jjVar9.r;
                            jjVar9.r = !z18;
                            na0Var7.F.a(z18, true);
                            if (na0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.fj) na0Var7.r.e.get(0)).k) != null) {
                                message4.invert_media = jjVar9.r;
                            }
                            if (na0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.fj) na0Var7.r.f.get(0)).k) != null) {
                                message3.invert_media = jjVar9.r;
                            }
                            na0Var7.i();
                            na0Var7.V = true;
                            break;
                    }
                }
            });
            y0Var11.h(0.12f, i35);
            this.s.a(y0Var11, c8.na.o(-1, 48));
            sa0 sa0Var8 = sa0Var;
            sa0Var8.a(jjVar.k, false);
            sa0 sa0Var9 = sa0Var2;
            boolean z15 = z10;
            na0 na0Var4 = this;
            sa0Var8.setOnClickListener(new bi.z5(this, z15, context, sa0Var9, sa0Var8, 1));
            na0Var = na0Var4;
            if (sa0Var9 != null) {
                sa0Var9.setOnClickListener(new qt(na0Var4, sa0Var9, sa0Var8, 3));
                na0Var = na0Var4;
            }
        }
        context2 = context;
        na0Var2 = na0Var;
        i10 = na0Var2.a;
        if (i10 == 1) {
        }
        n10 = na0Var2.e.n(context2);
        na0Var2.d = n10;
        n10.setElevation(org.telegram.messenger.g0.L(8.0f));
        n10.setOutlineProvider(viewOutlineProvider);
        if (n10.getParent() instanceof ViewGroup) {
        }
        na0Var2.addView(n10, c8.na.d(-1, -1.0f, 51, 0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / org.telegram.messenger.g0.p, 0.0f, 0.0f));
        na0Var2.e.S(na0Var2.f);
    }

    public static org.telegram.messenger.aj a(na0 na0Var, org.telegram.messenger.fj fjVar) {
        if (fjVar.c1() == 0) {
            return null;
        }
        org.telegram.messenger.aj ajVar = (org.telegram.messenger.aj) na0Var.r.d.get(fjVar.c1());
        if (ajVar == null || (ajVar.d.size() > 1 && ajVar.d(fjVar) != null)) {
            return ajVar;
        }
        return null;
    }

    public static void b(na0 na0Var, org.telegram.ui.Cells.r1 r1Var) {
        URLSpan uRLSpan;
        TLRPC.WebPage webPage;
        if (na0Var.a == 2) {
            org.telegram.messenger.jj jjVar = na0Var.d0.d;
            if (!jjVar.n && (uRLSpan = jjVar.w) != null && (webPage = jjVar.v) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                r1Var.s3(uRLSpan);
                return;
            }
        }
        r1Var.s3(null);
    }

    public final org.telegram.messenger.fj c(org.telegram.messenger.fj fjVar) {
        org.telegram.messenger.aj ajVar;
        org.telegram.messenger.jj jjVar = this.d0.d;
        org.telegram.messenger.hj hjVar = jjVar.a;
        if (hjVar == null) {
            return null;
        }
        LongSparseArray longSparseArray = hjVar.d;
        if (longSparseArray == null || longSparseArray.size() <= 0 || (ajVar = (org.telegram.messenger.aj) jjVar.a.d.valueAt(0)) == null) {
            return (org.telegram.messenger.fj) jjVar.a.e.get(0);
        }
        if (ajVar.i) {
            if (fjVar != null) {
                return fjVar;
            }
            org.telegram.ui.rm rmVar = jjVar.d;
            if (rmVar != null) {
                return rmVar.a;
            }
        }
        return ajVar.h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        return r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View d() {
        org.telegram.messenger.fj c10 = c(null);
        if (c10 != null) {
            int i7 = 0;
            while (true) {
                di.b1 b1Var = this.f;
                if (i7 >= b1Var.getChildCount()) {
                    break;
                }
                View childAt = b1Var.getChildAt(i7);
                org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) childAt;
                if (q4Var.getMessageObject() != null && (q4Var.getMessageObject() == c10 || q4Var.getMessageObject().e1() == c10.e1())) {
                    break;
                }
                i7++;
            }
        }
        return null;
    }

    public final boolean e(org.telegram.ui.Cells.r1 r1Var) {
        org.telegram.messenger.fj c10;
        if (r1Var == null || r1Var.getMessageObject() == null || (c10 = c(null)) == null) {
            return false;
        }
        return r1Var.getMessageObject() == c10 || r1Var.getMessageObject().e1() == c10.e1();
    }

    public final void f(float f10, int i7) {
        boolean z10 = this.d0.w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        ba0 ba0Var = this.c;
        org.telegram.ui.w8 w8Var = this.b;
        if (z10) {
            ba0Var.setTranslationY(0.0f);
            w8Var.invalidateOutline();
            w8Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            ba0Var.setTranslationY(i7);
            w8Var.invalidateOutline();
            w8Var.setTranslationY(f10);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((f10 + w8Var.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f));
        }
        float x10 = w8Var.getX();
        org.telegram.ui.Cells.u9 u9Var = this.d;
        u9Var.setTranslationX(x10);
        u9Var.setTranslationY(w8Var.getY());
    }

    public final void g() {
        ta0 ta0Var = this.d0;
        new kc(ta0Var, ta0Var.G).I(R.raw.error, org.telegram.messenger.gd.N0(2131746241, null), org.telegram.messenger.gd.N0(2131746240, null)).j();
    }

    public final void h(boolean z10, boolean z11) {
        if (this.d0.b) {
            z10 = false;
        }
        if (z11 && this.P == z10) {
            return;
        }
        this.P = z10;
        AnimatorSet animatorSet = this.Q;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.Q = null;
        }
        org.telegram.ui.ActionBar.y0 y0Var = this.E;
        org.telegram.ui.ActionBar.y0 y0Var2 = this.y;
        ga0 ga0Var = this.x;
        ga0 ga0Var2 = this.w;
        if (!z11) {
            if (ga0Var2 != null) {
                ga0Var2.setAlpha(!z10 ? 1.0f : 0.0f);
                ga0Var2.setVisibility(!z10 ? 0 : 4);
            }
            if (ga0Var != null) {
                ga0Var.setAlpha(z10 ? 1.0f : 0.0f);
                ga0Var.setVisibility(z10 ? 0 : 4);
            }
            if (y0Var2 != null) {
                y0Var2.setAlpha(!z10 ? 1.0f : 0.0f);
                y0Var2.setVisibility(!z10 ? 0 : 4);
            }
            if (y0Var != null) {
                y0Var.setAlpha(z10 ? 1.0f : 0.0f);
                y0Var.setVisibility(z10 ? 0 : 4);
                return;
            }
            return;
        }
        this.Q = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        if (ga0Var2 != null) {
            ga0Var2.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(ga0Var2, (Property<ga0, Float>) property, !z10 ? 1.0f : 0.0f));
        }
        if (ga0Var != null) {
            ga0Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(ga0Var, (Property<ga0, Float>) property, z10 ? 1.0f : 0.0f));
        }
        if (y0Var2 != null) {
            y0Var2.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(y0Var2, (Property<org.telegram.ui.ActionBar.y0, Float>) property, !z10 ? 1.0f : 0.0f));
        }
        if (y0Var != null) {
            y0Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(y0Var, (Property<org.telegram.ui.ActionBar.y0, Float>) property, z10 ? 1.0f : 0.0f));
        }
        this.Q.playTogether(arrayList);
        this.Q.setDuration(360L);
        this.Q.setInterpolator(kr.h);
        this.Q.addListener(new org.telegram.ui.on(16, this, z10));
        this.Q.start();
    }

    public final void i() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        ta0 ta0Var = this.d0;
        org.telegram.messenger.jj jjVar = ta0Var.d;
        ja0 ja0Var = this.h;
        if (ja0Var.k()) {
            this.W = true;
            return;
        }
        for (int i7 = 0; i7 < this.r.f.size(); i7++) {
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.r.f.get(i7);
            fjVar.M1 = true;
            fjVar.h2 = ta0Var.a;
            if (jjVar.k) {
                fjVar.k.flags &= -5;
                fjVar.g2 = true;
            } else {
                fjVar.k.flags |= 4;
                fjVar.g2 = false;
            }
            if (this.a == 2) {
                TLRPC.WebPage webPage = jjVar.v;
                if (webPage != null && ((messageMedia = (message = fjVar.k).media) == null || messageMedia.webpage != webPage)) {
                    message.flags |= 512;
                    message.media = new TLRPC.TL_messageMediaWebPage();
                    TLRPC.MessageMedia messageMedia2 = fjVar.k.media;
                    messageMedia2.webpage = jjVar.v;
                    boolean z10 = jjVar.q;
                    messageMedia2.force_large_media = !z10;
                    messageMedia2.force_small_media = z10;
                    messageMedia2.manual = true;
                    fjVar.y = null;
                    fjVar.o0();
                    fjVar.p0 = null;
                    fjVar.q0 = null;
                    fjVar.n0 = null;
                    fjVar.o0 = null;
                    fjVar.r0(true);
                    fjVar.K(true);
                } else if (webPage == null) {
                    TLRPC.Message message2 = fjVar.k;
                    message2.flags &= -513;
                    message2.media = null;
                }
            }
            if (jjVar.l) {
                fjVar.z = null;
            } else {
                fjVar.k0();
            }
            if (fjVar.T3()) {
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) fjVar.k.media;
                ijVar.results.total_voters = jjVar.l ? 0 : ijVar.a;
            }
        }
        for (int i10 = 0; i10 < this.r.h.size(); i10++) {
            ((TLRPC.PollAnswerVoters) this.r.h.get(i10)).chosen = !jjVar.k;
        }
        for (int i11 = 0; i11 < this.r.d.size(); i11++) {
            ja0Var.V((org.telegram.messenger.aj) this.r.d.valueAt(i11));
        }
        this.n.k(0, this.r.f.size());
    }

    public final void j() {
        int i7 = this.S;
        float f10 = this.T;
        ta0 ta0Var = this.d0;
        boolean z10 = ta0Var.w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        di.b1 b1Var = this.f;
        if (z10) {
            this.T = 0.0f;
            this.S = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(org.telegram.messenger.g0.L(8.0f) + b1Var.getMeasuredWidth());
        } else {
            int measuredHeight = b1Var.getMeasuredHeight();
            int i10 = 0;
            for (int i11 = 0; i11 < b1Var.getChildCount(); i11++) {
                View childAt = b1Var.getChildAt(i11);
                if (RecyclerView.R(childAt) != -1) {
                    measuredHeight = Math.min(measuredHeight, childAt.getTop());
                    i10++;
                }
            }
            org.telegram.messenger.hj hjVar = this.r;
            if (hjVar == null || i10 == 0 || i10 > hjVar.f.size()) {
                this.S = 0;
            } else {
                int d = i5.c.d(4.0f, measuredHeight, 0);
                this.S = d;
                this.S = Math.min(((b1Var.getMeasuredHeight() - this.S) + d) - ((int) ((((org.telegram.messenger.g0.q.y - (Build.VERSION.SDK_INT >= 35 ? org.telegram.messenger.g0.n : 0)) * 0.8f) - this.a0) - org.telegram.messenger.g0.L(8.0f))), this.S);
            }
            float A = com.google.android.gms.internal.vision.e2.A(getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f), (this.b.getMeasuredHeight() - this.S) + (this.a0 - org.telegram.messenger.g0.L(8.0f)), 2.0f, org.telegram.messenger.g0.L(8.0f)) - this.S;
            this.T = A;
            if (A > org.telegram.messenger.g0.L(8.0f)) {
                this.T = org.telegram.messenger.g0.L(8.0f);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        }
        boolean z11 = this.L;
        if (z11 || (this.S == i7 && this.T == f10)) {
            if (z11) {
                float f11 = this.T;
                int i12 = this.S;
                this.U = i12;
                f(f11, i12);
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = ta0Var.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ta0Var.h = ofFloat;
        ofFloat.addUpdateListener(new wj(this, i7, f10, 1));
        ta0Var.h.setDuration(250L);
        ta0Var.h.setInterpolator(pi.k.V);
        ta0Var.h.addListener(new p60(this, 4));
        org.telegram.messenger.g0.h3(ta0Var.E, 50L);
        this.U = i7;
        f(f10, i7);
    }

    public final void k() {
        org.telegram.messenger.fj fjVar;
        ta0 ta0Var = this.d0;
        org.telegram.messenger.jj jjVar = ta0Var.d;
        if (this.a == 0) {
            ha0 ha0Var = this.e;
            if (ha0Var.v - ha0Var.u > org.telegram.messenger.mp.u1(ta0Var.x).r4) {
                return;
            }
            org.telegram.ui.Cells.q9 q9Var = ha0Var.W;
            org.telegram.messenger.fj c10 = c(q9Var != null ? ((org.telegram.ui.Cells.r1) q9Var).getMessageObject() : null);
            if (jjVar.d != null && ha0Var.x()) {
                jjVar.e = ha0Var.u;
                jjVar.f = ha0Var.v;
                if (c10 != null) {
                    org.telegram.ui.rm rmVar = jjVar.d;
                    if (rmVar.m || (fjVar = rmVar.a) == null || fjVar.e1() != c10.e1()) {
                        jjVar.d = org.telegram.ui.rm.b(jjVar.e, jjVar.f, c10);
                        ta0Var.b();
                    }
                }
            }
            ha0Var.f(false);
        }
    }

    public final void l(boolean z10) {
        ta0 ta0Var = this.d0;
        TLRPC.User user = ta0Var.n;
        org.telegram.messenger.jj jjVar = ta0Var.d;
        TLRPC.Chat chat = ta0Var.r;
        ba0 ba0Var = this.c;
        int i7 = this.a;
        if (i7 == 1) {
            org.telegram.messenger.hj hjVar = jjVar.b;
            ba0Var.b(org.telegram.messenger.gd.G(hjVar == null ? 0 : hjVar.g.size(), "PreviewForwardMessagesCount", new Object[0]), z10);
            ba0Var.a(!jjVar.h ? jjVar.m ? user != null ? org.telegram.messenger.gd.a0("ForwardPreviewSendersNameVisible", null, 2131750562, org.telegram.messenger.i5.m(0, user.first_name, user.last_name)) : (!org.telegram.messenger.v3.T(chat) || chat.megagroup) ? org.telegram.messenger.gd.N0(2131750560, null) : org.telegram.messenger.gd.N0(2131750561, null) : user != null ? org.telegram.messenger.gd.a0("ForwardPreviewSendersNameVisible", null, 2131750562, org.telegram.messenger.i5.m(0, user.first_name, user.last_name)) : (!org.telegram.messenger.v3.T(chat) || chat.megagroup) ? org.telegram.messenger.gd.N0(2131750563, null) : org.telegram.messenger.gd.N0(2131750564, null) : !jjVar.k ? user != null ? org.telegram.messenger.gd.a0("ForwardPreviewSendersNameVisible", null, 2131750562, org.telegram.messenger.i5.m(0, user.first_name, user.last_name)) : (!org.telegram.messenger.v3.T(chat) || chat.megagroup) ? org.telegram.messenger.gd.N0(2131750560, null) : org.telegram.messenger.gd.N0(2131750561, null) : user != null ? org.telegram.messenger.gd.a0("ForwardPreviewSendersNameHidden", null, 2131750565, org.telegram.messenger.i5.m(0, user.first_name, user.last_name)) : (!org.telegram.messenger.v3.T(chat) || chat.megagroup) ? org.telegram.messenger.gd.N0(2131750563, null) : org.telegram.messenger.gd.N0(2131750564, null), z10);
        } else {
            if (i7 != 0) {
                if (i7 == 2) {
                    ba0Var.b(org.telegram.messenger.gd.N0(2131748355, null), z10);
                    ba0Var.a(org.telegram.messenger.gd.N0(2131748356, null), z10);
                    return;
                }
                return;
            }
            if (jjVar.d == null || !jjVar.a.j) {
                ba0Var.b(org.telegram.messenger.gd.N0(2131748352, null), z10);
                ba0Var.a(jjVar.a.j ? org.telegram.messenger.gd.N0(2131748353, null) : "", z10);
            } else {
                ba0Var.b(org.telegram.messenger.gd.N0(2131746686, null), z10);
                ba0Var.a(org.telegram.messenger.gd.N0(2131746685, null), z10);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a == 0) {
            org.telegram.messenger.g0.d0(this.f, new y2(this, 9));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
        this.c0 = true;
        this.L = true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        j();
        this.L = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        boolean z10 = View.MeasureSpec.getSize(i7) > View.MeasureSpec.getSize(i10);
        ta0 ta0Var = this.d0;
        ta0Var.w = z10;
        this.a0 = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i7, makeMeasureSpec);
        int i11 = this.a0;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.R;
        this.a0 = Math.max(i11, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        boolean z11 = ta0Var.w;
        org.telegram.ui.w8 w8Var = this.b;
        if (z11) {
            w8Var.getLayoutParams().height = -1;
            ((ViewGroup.MarginLayoutParams) w8Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(8.0f);
            ((ViewGroup.MarginLayoutParams) w8Var.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(8.0f);
            w8Var.getLayoutParams().width = (int) Math.min(View.MeasureSpec.getSize(i7), Math.max(org.telegram.messenger.g0.L(340.0f), View.MeasureSpec.getSize(i7) * 0.6f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) w8Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) w8Var.getLayoutParams()).bottomMargin = 0;
            w8Var.getLayoutParams().height = (View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.L(6.0f)) - this.a0;
            if (w8Var.getLayoutParams().height < View.MeasureSpec.getSize(i10) * 0.5f) {
                w8Var.getLayoutParams().height = (int) (View.MeasureSpec.getSize(i10) * 0.5f);
            }
            w8Var.getLayoutParams().width = -1;
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = View.MeasureSpec.getSize(i10) - w8Var.getLayoutParams().height;
        }
        int size = (View.MeasureSpec.getSize(i10) + View.MeasureSpec.getSize(i7)) << 16;
        if (this.b0 != size) {
            for (int i12 = 0; i12 < this.r.f.size(); i12++) {
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.r.f.get(i12);
                fjVar.d2 = ta0Var.w ? w8Var.getLayoutParams().width : View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(16.0f);
                fjVar.S1 = false;
                fjVar.M1 = true;
                org.telegram.ui.z7 z7Var = this.n;
                if (z7Var != null) {
                    z7Var.f();
                }
            }
            this.L = true;
        }
        this.b0 = size;
        super.onMeasure(i7, i10);
    }
}
