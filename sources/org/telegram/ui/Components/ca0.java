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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ca0 extends FrameLayout {
    public final org.telegram.ui.ActionBar.z0 D;
    public final ha0 E;
    public final FrameLayout F;
    public final ha0 G;
    public final ha0 H;
    public final int I;
    public final h6.m J;
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
    public final org.telegram.ui.v8 b;
    public boolean b0;
    public final p90 c;
    public final /* synthetic */ ia0 c0;
    public final org.telegram.ui.Cells.u9 d;
    public final w90 e;
    public final bi.q1 f;
    public final y90 h;
    public final org.telegram.ui.x7 n;
    public org.telegram.messenger.kj r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout s;
    public final v90 w;
    public final v90 x;
    public final org.telegram.ui.ActionBar.z0 y;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x06f6  */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [android.graphics.drawable.Drawable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v9, types: [android.graphics.drawable.Drawable, java.lang.String, org.telegram.ui.ActionBar.p6] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ca0(ia0 ia0Var, Context context, int i7) {
        super(r4);
        org.telegram.messenger.mj mjVar;
        ViewOutlineProvider viewOutlineProvider;
        Context context2;
        boolean z9;
        ha0 ha0Var;
        ha0 ha0Var2;
        ca0 ca0Var;
        int i10;
        org.telegram.ui.Cells.u9 n10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        org.telegram.messenger.mj mjVar2;
        ?? r13;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3;
        org.telegram.messenger.mj mjVar3;
        boolean z10;
        Object obj;
        int i11;
        Context context3 = context;
        this.c0 = ia0Var;
        this.K = true;
        this.L = -1;
        this.M = -1;
        final int i12 = 0;
        this.N = false;
        this.Q = new Rect();
        this.U = false;
        this.b0 = true;
        this.J = new h6.m(context3);
        this.a = i7;
        int i13 = 5;
        setOnTouchListener(new yj(this, i13));
        org.telegram.ui.v8 v8Var = new org.telegram.ui.v8(1, context3, this);
        this.b = v8Var;
        ea0 ea0Var = ia0Var.F;
        boolean z11 = ia0Var.b;
        org.telegram.messenger.mj mjVar4 = ia0Var.d;
        Drawable m10 = ((org.telegram.ui.an) ea0Var).m();
        if (((org.telegram.ui.an) ea0Var).f == null) {
            int i14 = org.telegram.ui.ActionBar.m6.a;
        }
        v8Var.U(m10);
        v8Var.setOccupyStatusBar(false);
        v8Var.setOutlineProvider(new fh.a(this, i13));
        v8Var.setClipToOutline(true);
        v8Var.setElevation(org.telegram.messenger.g0.L(4.0f));
        p90 p90Var = new p90(context3, ea0Var);
        this.c = p90Var;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.s8, p90Var, ea0Var);
        w90 w90Var = new w90(this);
        this.e = w90Var;
        w90Var.D = new di.h2(this, 2);
        bi.q1 q1Var = new bi.q1(this, context3, ea0Var, 21);
        this.f = q1Var;
        y90 y90Var = new y90(this, q1Var, ea0Var);
        this.h = y90Var;
        q1Var.setItemAnimator(y90Var);
        q1Var.setOnScrollListener(new ti(this, 10));
        q1Var.setOnItemClickListener(new z90(this));
        org.telegram.ui.x7 x7Var = new org.telegram.ui.x7(this, i13);
        this.n = x7Var;
        q1Var.setAdapter(x7Var);
        q1Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        u90 u90Var = new u90(this, i12);
        u90Var.O = new ai.l(this, 9);
        q1Var.setClipToPadding(false);
        q1Var.setLayoutManager(u90Var);
        q1Var.i(new di.k(8));
        v8Var.addView(q1Var);
        addView(v8Var, c8.ha.d(-1, 400.0f, 0, 8.0f, 0.0f, 8.0f, 0.0f));
        v8Var.addView(p90Var, c8.ha.c(-2.0f, -1));
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 1, getContext(), ea0Var);
        this.s = actionBarPopupWindow$ActionBarPopupWindowLayout4;
        actionBarPopupWindow$ActionBarPopupWindowLayout4.getSwipeBack().setOnForegroundOpenFinished(new s90(this, 1));
        fh.g c10 = ia0Var.G.c(actionBarPopupWindow$ActionBarPopupWindowLayout4, null, false);
        c10.p(c8.g0.k(ea0Var));
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.Q.e = true;
        c10.r(org.telegram.messenger.g0.L(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout4.setBackground(c10);
        addView(actionBarPopupWindow$ActionBarPopupWindowLayout4, c8.ha.c(-2.0f, -2));
        if (i7 == 0) {
            org.telegram.messenger.kj kjVar = mjVar4.a;
            boolean z12 = mjVar4.s;
            if (kjVar != null) {
                if (!kjVar.j || mjVar4.i) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                    mjVar2 = mjVar4;
                    r13 = 0;
                } else {
                    LinearLayout f10 = org.telegram.messenger.k5.f(context3, 1);
                    if (z11) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                        mjVar3 = mjVar4;
                        z10 = true;
                        obj = null;
                        i11 = 2131746430;
                    } else {
                        mjVar3 = mjVar4;
                        actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                        obj = null;
                        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, context3, ia0Var.F, true, false);
                        z0Var.j(org.telegram.messenger.id.M0(2131753756, null), R.drawable.msg_arrow_back, null);
                        z0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.q90
                            public final /* synthetic */ ca0 b;

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
                                        ca0 ca0Var2 = this.b;
                                        ca0Var2.c0.d.d = null;
                                        ca0Var2.e.f(false);
                                        ca0Var2.h(false, false);
                                        ca0Var2.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        ca0 ca0Var3 = this.b;
                                        w90 w90Var2 = ca0Var3.e;
                                        ia0 ia0Var2 = ca0Var3.c0;
                                        if (ca0Var3.c(null) != null) {
                                            if (w90Var2.v - w90Var2.u <= org.telegram.messenger.qp.s1(ia0Var2.x).o4) {
                                                org.telegram.ui.Cells.q9 q9Var = w90Var2.W;
                                                org.telegram.messenger.ij c11 = ca0Var3.c(q9Var != null ? ((org.telegram.ui.Cells.q1) q9Var).getMessageObject() : null);
                                                org.telegram.messenger.mj mjVar5 = ia0Var2.d;
                                                int i16 = w90Var2.u;
                                                mjVar5.e = i16;
                                                int i17 = w90Var2.v;
                                                mjVar5.f = i17;
                                                mjVar5.d = org.telegram.ui.sm.b(i16, i17, c11);
                                                ia0Var2.b();
                                                ia0Var2.a(true);
                                                break;
                                            } else {
                                                ca0Var3.g();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        ca0 ca0Var4 = this.b;
                                        w90 w90Var3 = ca0Var4.e;
                                        ia0 ia0Var3 = ca0Var4.c0;
                                        org.telegram.messenger.mj mjVar6 = ia0Var3.d;
                                        int i18 = ia0Var3.x;
                                        boolean z13 = ia0Var3.b;
                                        if (mjVar6.d != null && !z13) {
                                            mjVar6.d = null;
                                            w90Var3.f(false);
                                            ca0Var4.h(false, true);
                                            ca0Var4.l(true);
                                            break;
                                        } else if (w90Var3.v - w90Var3.u <= org.telegram.messenger.qp.s1(i18).o4) {
                                            org.telegram.messenger.ij c12 = ca0Var4.c(null);
                                            if (c12 != null) {
                                                if (!w90Var3.x()) {
                                                    mjVar6.e = 0;
                                                    int min = Math.min(org.telegram.messenger.qp.s1(i18).o4, org.telegram.ui.sm.d(c12));
                                                    mjVar6.f = min;
                                                    mjVar6.d = org.telegram.ui.sm.b(mjVar6.e, min, c12);
                                                    View d = ca0Var4.d();
                                                    if (d instanceof org.telegram.ui.Cells.q1) {
                                                        w90Var3.a0((org.telegram.ui.Cells.q1) d, mjVar6.e, mjVar6.f);
                                                    }
                                                    if (!z13) {
                                                        ca0Var4.s.getSwipeBack().e(ca0Var4.I);
                                                    }
                                                    ca0Var4.h(true, true);
                                                    break;
                                                } else {
                                                    mjVar6.e = w90Var3.u;
                                                    mjVar6.f = w90Var3.v;
                                                    org.telegram.ui.Cells.q9 q9Var2 = w90Var3.W;
                                                    mjVar6.d = org.telegram.ui.sm.b(mjVar6.e, mjVar6.f, ca0Var4.c(q9Var2 != null ? ((org.telegram.ui.Cells.q1) q9Var2).getMessageObject() : null));
                                                    ia0Var3.b();
                                                    ia0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            ca0Var4.g();
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
                                        ia0 ia0Var4 = this.b.c0;
                                        if (!ia0Var4.b) {
                                            org.telegram.ui.nk nkVar = (org.telegram.ui.nk) ia0Var4;
                                            nkVar.a(true);
                                            org.telegram.ui.cn cnVar = nkVar.H;
                                            cnVar.D5 = null;
                                            cnVar.B5 = null;
                                            cnVar.v5.f(null, null, cnVar.j6, null);
                                            cnVar.A8();
                                            break;
                                        } else {
                                            org.telegram.ui.nk nkVar2 = (org.telegram.ui.nk) ia0Var4;
                                            nkVar2.a(true);
                                            org.telegram.ui.cn cnVar2 = nkVar2.H;
                                            cnVar2.B5 = null;
                                            cnVar2.hc(cnVar2.D5);
                                            break;
                                        }
                                    case 7:
                                        this.b.c0.c(true);
                                        break;
                                    case 8:
                                        this.b.c0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.nk nkVar3 = (org.telegram.ui.nk) this.b.c0;
                                        nkVar3.a(true);
                                        org.telegram.ui.cn cnVar3 = nkVar3.H;
                                        cnVar3.v5.d(null, cnVar3.j6);
                                        cnVar3.A8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.nk nkVar4 = (org.telegram.ui.nk) this.b.c0;
                                        nkVar4.a(true);
                                        org.telegram.ui.cn cnVar4 = nkVar4.H;
                                        cnVar4.W5 = null;
                                        org.telegram.ui.sj sjVar = cnVar4.Z;
                                        if (sjVar != null) {
                                            sjVar.X2 = null;
                                            sjVar.Y2 = false;
                                        }
                                        org.telegram.messenger.mj mjVar7 = cnVar4.v5;
                                        if (mjVar7 != null) {
                                            i15 = ((org.telegram.ui.ActionBar.f2) cnVar4).currentAccount;
                                            org.telegram.messenger.ij ijVar = cnVar4.D5;
                                            mjVar7.e(i15, null, null, ijVar == cnVar4.l4 ? null : ijVar, cnVar4.B5, cnVar4.F5);
                                        }
                                        cnVar4.A8();
                                        break;
                                    case 12:
                                        ca0 ca0Var5 = this.b;
                                        org.telegram.messenger.mj mjVar8 = ca0Var5.c0.d;
                                        if (mjVar8.o) {
                                            boolean z14 = !mjVar8.q;
                                            mjVar8.q = z14;
                                            ca0Var5.G.a(z14, true);
                                            ca0Var5.H.a(mjVar8.q, true);
                                            if (ca0Var5.r.e.size() > 0 && (message2 = ((org.telegram.messenger.ij) ca0Var5.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z15 = mjVar8.q;
                                                messageMedia2.force_small_media = z15;
                                                messageMedia2.force_large_media = !z15;
                                            }
                                            if (ca0Var5.r.f.size() > 0 && (message = ((org.telegram.messenger.ij) ca0Var5.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                                boolean z16 = mjVar8.q;
                                                messageMedia.force_small_media = z16;
                                                messageMedia.force_large_media = !z16;
                                            }
                                            ca0Var5.i();
                                            ca0Var5.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        ca0 ca0Var6 = this.b;
                                        org.telegram.messenger.mj mjVar9 = ca0Var6.c0.d;
                                        boolean z17 = mjVar9.r;
                                        mjVar9.r = !z17;
                                        ca0Var6.E.a(z17, true);
                                        if (ca0Var6.r.e.size() > 0 && (message4 = ((org.telegram.messenger.ij) ca0Var6.r.e.get(0)).k) != null) {
                                            message4.invert_media = mjVar9.r;
                                        }
                                        if (ca0Var6.r.f.size() > 0 && (message3 = ((org.telegram.messenger.ij) ca0Var6.r.f.get(0)).k) != null) {
                                            message3.invert_media = mjVar9.r;
                                        }
                                        ca0Var6.i();
                                        ca0Var6.U = true;
                                        break;
                                }
                            }
                        });
                        f10.addView(z0Var, c8.ha.o(-1, 48));
                        org.telegram.ui.ActionBar.d1 d1Var = new org.telegram.ui.ActionBar.d1(context3, ea0Var);
                        org.telegram.ui.ActionBar.t6.i(d1Var, org.telegram.ui.ActionBar.t6.K(0.06f, org.telegram.ui.ActionBar.m6.E8), ea0Var);
                        d1Var.setTag(R.id.fit_width_tag, 1);
                        f10.addView(d1Var, c8.ha.o(-1, 8));
                        org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(0, context3, ia0Var.F, false, true);
                        i11 = 2131746430;
                        z0Var2.j(org.telegram.messenger.id.M0(2131746430, null), R.drawable.menu_quote_specific, null);
                        z10 = true;
                        final boolean z13 = true ? 1 : 0;
                        z0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.q90
                            public final /* synthetic */ ca0 b;

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
                                switch (z13) {
                                    case 0:
                                        ca0 ca0Var2 = this.b;
                                        ca0Var2.c0.d.d = null;
                                        ca0Var2.e.f(false);
                                        ca0Var2.h(false, false);
                                        ca0Var2.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        ca0 ca0Var3 = this.b;
                                        w90 w90Var2 = ca0Var3.e;
                                        ia0 ia0Var2 = ca0Var3.c0;
                                        if (ca0Var3.c(null) != null) {
                                            if (w90Var2.v - w90Var2.u <= org.telegram.messenger.qp.s1(ia0Var2.x).o4) {
                                                org.telegram.ui.Cells.q9 q9Var = w90Var2.W;
                                                org.telegram.messenger.ij c11 = ca0Var3.c(q9Var != null ? ((org.telegram.ui.Cells.q1) q9Var).getMessageObject() : null);
                                                org.telegram.messenger.mj mjVar5 = ia0Var2.d;
                                                int i16 = w90Var2.u;
                                                mjVar5.e = i16;
                                                int i17 = w90Var2.v;
                                                mjVar5.f = i17;
                                                mjVar5.d = org.telegram.ui.sm.b(i16, i17, c11);
                                                ia0Var2.b();
                                                ia0Var2.a(true);
                                                break;
                                            } else {
                                                ca0Var3.g();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        ca0 ca0Var4 = this.b;
                                        w90 w90Var3 = ca0Var4.e;
                                        ia0 ia0Var3 = ca0Var4.c0;
                                        org.telegram.messenger.mj mjVar6 = ia0Var3.d;
                                        int i18 = ia0Var3.x;
                                        boolean z132 = ia0Var3.b;
                                        if (mjVar6.d != null && !z132) {
                                            mjVar6.d = null;
                                            w90Var3.f(false);
                                            ca0Var4.h(false, true);
                                            ca0Var4.l(true);
                                            break;
                                        } else if (w90Var3.v - w90Var3.u <= org.telegram.messenger.qp.s1(i18).o4) {
                                            org.telegram.messenger.ij c12 = ca0Var4.c(null);
                                            if (c12 != null) {
                                                if (!w90Var3.x()) {
                                                    mjVar6.e = 0;
                                                    int min = Math.min(org.telegram.messenger.qp.s1(i18).o4, org.telegram.ui.sm.d(c12));
                                                    mjVar6.f = min;
                                                    mjVar6.d = org.telegram.ui.sm.b(mjVar6.e, min, c12);
                                                    View d = ca0Var4.d();
                                                    if (d instanceof org.telegram.ui.Cells.q1) {
                                                        w90Var3.a0((org.telegram.ui.Cells.q1) d, mjVar6.e, mjVar6.f);
                                                    }
                                                    if (!z132) {
                                                        ca0Var4.s.getSwipeBack().e(ca0Var4.I);
                                                    }
                                                    ca0Var4.h(true, true);
                                                    break;
                                                } else {
                                                    mjVar6.e = w90Var3.u;
                                                    mjVar6.f = w90Var3.v;
                                                    org.telegram.ui.Cells.q9 q9Var2 = w90Var3.W;
                                                    mjVar6.d = org.telegram.ui.sm.b(mjVar6.e, mjVar6.f, ca0Var4.c(q9Var2 != null ? ((org.telegram.ui.Cells.q1) q9Var2).getMessageObject() : null));
                                                    ia0Var3.b();
                                                    ia0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            ca0Var4.g();
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
                                        ia0 ia0Var4 = this.b.c0;
                                        if (!ia0Var4.b) {
                                            org.telegram.ui.nk nkVar = (org.telegram.ui.nk) ia0Var4;
                                            nkVar.a(true);
                                            org.telegram.ui.cn cnVar = nkVar.H;
                                            cnVar.D5 = null;
                                            cnVar.B5 = null;
                                            cnVar.v5.f(null, null, cnVar.j6, null);
                                            cnVar.A8();
                                            break;
                                        } else {
                                            org.telegram.ui.nk nkVar2 = (org.telegram.ui.nk) ia0Var4;
                                            nkVar2.a(true);
                                            org.telegram.ui.cn cnVar2 = nkVar2.H;
                                            cnVar2.B5 = null;
                                            cnVar2.hc(cnVar2.D5);
                                            break;
                                        }
                                    case 7:
                                        this.b.c0.c(true);
                                        break;
                                    case 8:
                                        this.b.c0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.nk nkVar3 = (org.telegram.ui.nk) this.b.c0;
                                        nkVar3.a(true);
                                        org.telegram.ui.cn cnVar3 = nkVar3.H;
                                        cnVar3.v5.d(null, cnVar3.j6);
                                        cnVar3.A8();
                                        break;
                                    case 10:
                                        this.b.c0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.nk nkVar4 = (org.telegram.ui.nk) this.b.c0;
                                        nkVar4.a(true);
                                        org.telegram.ui.cn cnVar4 = nkVar4.H;
                                        cnVar4.W5 = null;
                                        org.telegram.ui.sj sjVar = cnVar4.Z;
                                        if (sjVar != null) {
                                            sjVar.X2 = null;
                                            sjVar.Y2 = false;
                                        }
                                        org.telegram.messenger.mj mjVar7 = cnVar4.v5;
                                        if (mjVar7 != null) {
                                            i15 = ((org.telegram.ui.ActionBar.f2) cnVar4).currentAccount;
                                            org.telegram.messenger.ij ijVar = cnVar4.D5;
                                            mjVar7.e(i15, null, null, ijVar == cnVar4.l4 ? null : ijVar, cnVar4.B5, cnVar4.F5);
                                        }
                                        cnVar4.A8();
                                        break;
                                    case 12:
                                        ca0 ca0Var5 = this.b;
                                        org.telegram.messenger.mj mjVar8 = ca0Var5.c0.d;
                                        if (mjVar8.o) {
                                            boolean z14 = !mjVar8.q;
                                            mjVar8.q = z14;
                                            ca0Var5.G.a(z14, true);
                                            ca0Var5.H.a(mjVar8.q, true);
                                            if (ca0Var5.r.e.size() > 0 && (message2 = ((org.telegram.messenger.ij) ca0Var5.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z15 = mjVar8.q;
                                                messageMedia2.force_small_media = z15;
                                                messageMedia2.force_large_media = !z15;
                                            }
                                            if (ca0Var5.r.f.size() > 0 && (message = ((org.telegram.messenger.ij) ca0Var5.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                                boolean z16 = mjVar8.q;
                                                messageMedia.force_small_media = z16;
                                                messageMedia.force_large_media = !z16;
                                            }
                                            ca0Var5.i();
                                            ca0Var5.U = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        ca0 ca0Var6 = this.b;
                                        org.telegram.messenger.mj mjVar9 = ca0Var6.c0.d;
                                        boolean z17 = mjVar9.r;
                                        mjVar9.r = !z17;
                                        ca0Var6.E.a(z17, true);
                                        if (ca0Var6.r.e.size() > 0 && (message4 = ((org.telegram.messenger.ij) ca0Var6.r.e.get(0)).k) != null) {
                                            message4.invert_media = mjVar9.r;
                                        }
                                        if (ca0Var6.r.f.size() > 0 && (message3 = ((org.telegram.messenger.ij) ca0Var6.r.f.get(0)).k) != null) {
                                            message3.invert_media = mjVar9.r;
                                        }
                                        ca0Var6.i();
                                        ca0Var6.U = true;
                                        break;
                                }
                            }
                        });
                        f10.addView(z0Var2, c8.ha.o(-1, 48));
                    }
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                    this.I = actionBarPopupWindow$ActionBarPopupWindowLayout5.b(f10);
                    actionBarPopupWindow$ActionBarPopupWindowLayout5.getSwipeBack().setStickToRight(z10);
                    FrameLayout frameLayout = new FrameLayout(context3);
                    int i15 = i11;
                    ?? r132 = obj;
                    mjVar2 = mjVar3;
                    v90 v90Var = new v90(1, 0, context, ia0Var.F, true, false);
                    this.w = v90Var;
                    v90Var.j(org.telegram.messenger.id.M0(z11 ? i15 : 2131745653, r132), R.drawable.menu_select_quote, r132);
                    v90 v90Var2 = new v90(1, 1, context, ia0Var.F, true, false);
                    context3 = context;
                    this.x = v90Var2;
                    v90Var2.j(org.telegram.messenger.id.M0(2131752072, r132), R.drawable.menu_quote_delete, r132);
                    int i16 = org.telegram.ui.ActionBar.m6.I5;
                    Drawable a02 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i16, ea0Var), 6, 0);
                    org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i16);
                    frameLayout.setBackground(a02);
                    org.telegram.ui.ActionBar.t6.j(frameLayout, a02, r132, M, ea0Var);
                    final int i17 = 2;
                    frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.q90
                        public final /* synthetic */ ca0 b;

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
                                    ca0 ca0Var2 = this.b;
                                    ca0Var2.c0.d.d = null;
                                    ca0Var2.e.f(false);
                                    ca0Var2.h(false, false);
                                    ca0Var2.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    ca0 ca0Var3 = this.b;
                                    w90 w90Var2 = ca0Var3.e;
                                    ia0 ia0Var2 = ca0Var3.c0;
                                    if (ca0Var3.c(null) != null) {
                                        if (w90Var2.v - w90Var2.u <= org.telegram.messenger.qp.s1(ia0Var2.x).o4) {
                                            org.telegram.ui.Cells.q9 q9Var = w90Var2.W;
                                            org.telegram.messenger.ij c11 = ca0Var3.c(q9Var != null ? ((org.telegram.ui.Cells.q1) q9Var).getMessageObject() : null);
                                            org.telegram.messenger.mj mjVar5 = ia0Var2.d;
                                            int i162 = w90Var2.u;
                                            mjVar5.e = i162;
                                            int i172 = w90Var2.v;
                                            mjVar5.f = i172;
                                            mjVar5.d = org.telegram.ui.sm.b(i162, i172, c11);
                                            ia0Var2.b();
                                            ia0Var2.a(true);
                                            break;
                                        } else {
                                            ca0Var3.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    ca0 ca0Var4 = this.b;
                                    w90 w90Var3 = ca0Var4.e;
                                    ia0 ia0Var3 = ca0Var4.c0;
                                    org.telegram.messenger.mj mjVar6 = ia0Var3.d;
                                    int i18 = ia0Var3.x;
                                    boolean z132 = ia0Var3.b;
                                    if (mjVar6.d != null && !z132) {
                                        mjVar6.d = null;
                                        w90Var3.f(false);
                                        ca0Var4.h(false, true);
                                        ca0Var4.l(true);
                                        break;
                                    } else if (w90Var3.v - w90Var3.u <= org.telegram.messenger.qp.s1(i18).o4) {
                                        org.telegram.messenger.ij c12 = ca0Var4.c(null);
                                        if (c12 != null) {
                                            if (!w90Var3.x()) {
                                                mjVar6.e = 0;
                                                int min = Math.min(org.telegram.messenger.qp.s1(i18).o4, org.telegram.ui.sm.d(c12));
                                                mjVar6.f = min;
                                                mjVar6.d = org.telegram.ui.sm.b(mjVar6.e, min, c12);
                                                View d = ca0Var4.d();
                                                if (d instanceof org.telegram.ui.Cells.q1) {
                                                    w90Var3.a0((org.telegram.ui.Cells.q1) d, mjVar6.e, mjVar6.f);
                                                }
                                                if (!z132) {
                                                    ca0Var4.s.getSwipeBack().e(ca0Var4.I);
                                                }
                                                ca0Var4.h(true, true);
                                                break;
                                            } else {
                                                mjVar6.e = w90Var3.u;
                                                mjVar6.f = w90Var3.v;
                                                org.telegram.ui.Cells.q9 q9Var2 = w90Var3.W;
                                                mjVar6.d = org.telegram.ui.sm.b(mjVar6.e, mjVar6.f, ca0Var4.c(q9Var2 != null ? ((org.telegram.ui.Cells.q1) q9Var2).getMessageObject() : null));
                                                ia0Var3.b();
                                                ia0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        ca0Var4.g();
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
                                    ia0 ia0Var4 = this.b.c0;
                                    if (!ia0Var4.b) {
                                        org.telegram.ui.nk nkVar = (org.telegram.ui.nk) ia0Var4;
                                        nkVar.a(true);
                                        org.telegram.ui.cn cnVar = nkVar.H;
                                        cnVar.D5 = null;
                                        cnVar.B5 = null;
                                        cnVar.v5.f(null, null, cnVar.j6, null);
                                        cnVar.A8();
                                        break;
                                    } else {
                                        org.telegram.ui.nk nkVar2 = (org.telegram.ui.nk) ia0Var4;
                                        nkVar2.a(true);
                                        org.telegram.ui.cn cnVar2 = nkVar2.H;
                                        cnVar2.B5 = null;
                                        cnVar2.hc(cnVar2.D5);
                                        break;
                                    }
                                case 7:
                                    this.b.c0.c(true);
                                    break;
                                case 8:
                                    this.b.c0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.nk nkVar3 = (org.telegram.ui.nk) this.b.c0;
                                    nkVar3.a(true);
                                    org.telegram.ui.cn cnVar3 = nkVar3.H;
                                    cnVar3.v5.d(null, cnVar3.j6);
                                    cnVar3.A8();
                                    break;
                                case 10:
                                    this.b.c0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.nk nkVar4 = (org.telegram.ui.nk) this.b.c0;
                                    nkVar4.a(true);
                                    org.telegram.ui.cn cnVar4 = nkVar4.H;
                                    cnVar4.W5 = null;
                                    org.telegram.ui.sj sjVar = cnVar4.Z;
                                    if (sjVar != null) {
                                        sjVar.X2 = null;
                                        sjVar.Y2 = false;
                                    }
                                    org.telegram.messenger.mj mjVar7 = cnVar4.v5;
                                    if (mjVar7 != null) {
                                        i152 = ((org.telegram.ui.ActionBar.f2) cnVar4).currentAccount;
                                        org.telegram.messenger.ij ijVar = cnVar4.D5;
                                        mjVar7.e(i152, null, null, ijVar == cnVar4.l4 ? null : ijVar, cnVar4.B5, cnVar4.F5);
                                    }
                                    cnVar4.A8();
                                    break;
                                case 12:
                                    ca0 ca0Var5 = this.b;
                                    org.telegram.messenger.mj mjVar8 = ca0Var5.c0.d;
                                    if (mjVar8.o) {
                                        boolean z14 = !mjVar8.q;
                                        mjVar8.q = z14;
                                        ca0Var5.G.a(z14, true);
                                        ca0Var5.H.a(mjVar8.q, true);
                                        if (ca0Var5.r.e.size() > 0 && (message2 = ((org.telegram.messenger.ij) ca0Var5.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z15 = mjVar8.q;
                                            messageMedia2.force_small_media = z15;
                                            messageMedia2.force_large_media = !z15;
                                        }
                                        if (ca0Var5.r.f.size() > 0 && (message = ((org.telegram.messenger.ij) ca0Var5.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z16 = mjVar8.q;
                                            messageMedia.force_small_media = z16;
                                            messageMedia.force_large_media = !z16;
                                        }
                                        ca0Var5.i();
                                        ca0Var5.U = true;
                                        break;
                                    }
                                    break;
                                default:
                                    ca0 ca0Var6 = this.b;
                                    org.telegram.messenger.mj mjVar9 = ca0Var6.c0.d;
                                    boolean z17 = mjVar9.r;
                                    mjVar9.r = !z17;
                                    ca0Var6.E.a(z17, true);
                                    if (ca0Var6.r.e.size() > 0 && (message4 = ((org.telegram.messenger.ij) ca0Var6.r.e.get(0)).k) != null) {
                                        message4.invert_media = mjVar9.r;
                                    }
                                    if (ca0Var6.r.f.size() > 0 && (message3 = ((org.telegram.messenger.ij) ca0Var6.r.f.get(0)).k) != null) {
                                        message3.invert_media = mjVar9.r;
                                    }
                                    ca0Var6.i();
                                    ca0Var6.U = true;
                                    break;
                            }
                        }
                    });
                    frameLayout.addView(v90Var, c8.ha.c(48.0f, -1));
                    frameLayout.addView(v90Var2, c8.ha.c(48.0f, -1));
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout5;
                    actionBarPopupWindow$ActionBarPopupWindowLayout6.a(frameLayout, c8.ha.o(-1, 48));
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout6;
                    r13 = r132;
                }
                mjVar = mjVar2;
                if (mjVar.t || z12 || mjVar.u) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                } else {
                    FrameLayout frameLayout2 = new FrameLayout(context3);
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(1, context3, ia0Var.F, false, false);
                    this.y = z0Var3;
                    z0Var3.j(org.telegram.messenger.id.M0(2131746253, r13), R.drawable.msg_forward_replace, r13);
                    final int i18 = 3;
                    z0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.q90
                        public final /* synthetic */ ca0 b;

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
                                    ca0 ca0Var2 = this.b;
                                    ca0Var2.c0.d.d = null;
                                    ca0Var2.e.f(false);
                                    ca0Var2.h(false, false);
                                    ca0Var2.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    ca0 ca0Var3 = this.b;
                                    w90 w90Var2 = ca0Var3.e;
                                    ia0 ia0Var2 = ca0Var3.c0;
                                    if (ca0Var3.c(null) != null) {
                                        if (w90Var2.v - w90Var2.u <= org.telegram.messenger.qp.s1(ia0Var2.x).o4) {
                                            org.telegram.ui.Cells.q9 q9Var = w90Var2.W;
                                            org.telegram.messenger.ij c11 = ca0Var3.c(q9Var != null ? ((org.telegram.ui.Cells.q1) q9Var).getMessageObject() : null);
                                            org.telegram.messenger.mj mjVar5 = ia0Var2.d;
                                            int i162 = w90Var2.u;
                                            mjVar5.e = i162;
                                            int i172 = w90Var2.v;
                                            mjVar5.f = i172;
                                            mjVar5.d = org.telegram.ui.sm.b(i162, i172, c11);
                                            ia0Var2.b();
                                            ia0Var2.a(true);
                                            break;
                                        } else {
                                            ca0Var3.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    ca0 ca0Var4 = this.b;
                                    w90 w90Var3 = ca0Var4.e;
                                    ia0 ia0Var3 = ca0Var4.c0;
                                    org.telegram.messenger.mj mjVar6 = ia0Var3.d;
                                    int i182 = ia0Var3.x;
                                    boolean z132 = ia0Var3.b;
                                    if (mjVar6.d != null && !z132) {
                                        mjVar6.d = null;
                                        w90Var3.f(false);
                                        ca0Var4.h(false, true);
                                        ca0Var4.l(true);
                                        break;
                                    } else if (w90Var3.v - w90Var3.u <= org.telegram.messenger.qp.s1(i182).o4) {
                                        org.telegram.messenger.ij c12 = ca0Var4.c(null);
                                        if (c12 != null) {
                                            if (!w90Var3.x()) {
                                                mjVar6.e = 0;
                                                int min = Math.min(org.telegram.messenger.qp.s1(i182).o4, org.telegram.ui.sm.d(c12));
                                                mjVar6.f = min;
                                                mjVar6.d = org.telegram.ui.sm.b(mjVar6.e, min, c12);
                                                View d = ca0Var4.d();
                                                if (d instanceof org.telegram.ui.Cells.q1) {
                                                    w90Var3.a0((org.telegram.ui.Cells.q1) d, mjVar6.e, mjVar6.f);
                                                }
                                                if (!z132) {
                                                    ca0Var4.s.getSwipeBack().e(ca0Var4.I);
                                                }
                                                ca0Var4.h(true, true);
                                                break;
                                            } else {
                                                mjVar6.e = w90Var3.u;
                                                mjVar6.f = w90Var3.v;
                                                org.telegram.ui.Cells.q9 q9Var2 = w90Var3.W;
                                                mjVar6.d = org.telegram.ui.sm.b(mjVar6.e, mjVar6.f, ca0Var4.c(q9Var2 != null ? ((org.telegram.ui.Cells.q1) q9Var2).getMessageObject() : null));
                                                ia0Var3.b();
                                                ia0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        ca0Var4.g();
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
                                    ia0 ia0Var4 = this.b.c0;
                                    if (!ia0Var4.b) {
                                        org.telegram.ui.nk nkVar = (org.telegram.ui.nk) ia0Var4;
                                        nkVar.a(true);
                                        org.telegram.ui.cn cnVar = nkVar.H;
                                        cnVar.D5 = null;
                                        cnVar.B5 = null;
                                        cnVar.v5.f(null, null, cnVar.j6, null);
                                        cnVar.A8();
                                        break;
                                    } else {
                                        org.telegram.ui.nk nkVar2 = (org.telegram.ui.nk) ia0Var4;
                                        nkVar2.a(true);
                                        org.telegram.ui.cn cnVar2 = nkVar2.H;
                                        cnVar2.B5 = null;
                                        cnVar2.hc(cnVar2.D5);
                                        break;
                                    }
                                case 7:
                                    this.b.c0.c(true);
                                    break;
                                case 8:
                                    this.b.c0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.nk nkVar3 = (org.telegram.ui.nk) this.b.c0;
                                    nkVar3.a(true);
                                    org.telegram.ui.cn cnVar3 = nkVar3.H;
                                    cnVar3.v5.d(null, cnVar3.j6);
                                    cnVar3.A8();
                                    break;
                                case 10:
                                    this.b.c0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.nk nkVar4 = (org.telegram.ui.nk) this.b.c0;
                                    nkVar4.a(true);
                                    org.telegram.ui.cn cnVar4 = nkVar4.H;
                                    cnVar4.W5 = null;
                                    org.telegram.ui.sj sjVar = cnVar4.Z;
                                    if (sjVar != null) {
                                        sjVar.X2 = null;
                                        sjVar.Y2 = false;
                                    }
                                    org.telegram.messenger.mj mjVar7 = cnVar4.v5;
                                    if (mjVar7 != null) {
                                        i152 = ((org.telegram.ui.ActionBar.f2) cnVar4).currentAccount;
                                        org.telegram.messenger.ij ijVar = cnVar4.D5;
                                        mjVar7.e(i152, null, null, ijVar == cnVar4.l4 ? null : ijVar, cnVar4.B5, cnVar4.F5);
                                    }
                                    cnVar4.A8();
                                    break;
                                case 12:
                                    ca0 ca0Var5 = this.b;
                                    org.telegram.messenger.mj mjVar8 = ca0Var5.c0.d;
                                    if (mjVar8.o) {
                                        boolean z14 = !mjVar8.q;
                                        mjVar8.q = z14;
                                        ca0Var5.G.a(z14, true);
                                        ca0Var5.H.a(mjVar8.q, true);
                                        if (ca0Var5.r.e.size() > 0 && (message2 = ((org.telegram.messenger.ij) ca0Var5.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z15 = mjVar8.q;
                                            messageMedia2.force_small_media = z15;
                                            messageMedia2.force_large_media = !z15;
                                        }
                                        if (ca0Var5.r.f.size() > 0 && (message = ((org.telegram.messenger.ij) ca0Var5.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z16 = mjVar8.q;
                                            messageMedia.force_small_media = z16;
                                            messageMedia.force_large_media = !z16;
                                        }
                                        ca0Var5.i();
                                        ca0Var5.U = true;
                                        break;
                                    }
                                    break;
                                default:
                                    ca0 ca0Var6 = this.b;
                                    org.telegram.messenger.mj mjVar9 = ca0Var6.c0.d;
                                    boolean z17 = mjVar9.r;
                                    mjVar9.r = !z17;
                                    ca0Var6.E.a(z17, true);
                                    if (ca0Var6.r.e.size() > 0 && (message4 = ((org.telegram.messenger.ij) ca0Var6.r.e.get(0)).k) != null) {
                                        message4.invert_media = mjVar9.r;
                                    }
                                    if (ca0Var6.r.f.size() > 0 && (message3 = ((org.telegram.messenger.ij) ca0Var6.r.f.get(0)).k) != null) {
                                        message3.invert_media = mjVar9.r;
                                    }
                                    ca0Var6.i();
                                    ca0Var6.U = true;
                                    break;
                            }
                        }
                    });
                    context3 = context;
                    org.telegram.ui.ActionBar.z0 z0Var4 = new org.telegram.ui.ActionBar.z0(1, context3, ia0Var.F, false, false);
                    this.D = z0Var4;
                    z0Var4.j(org.telegram.messenger.id.M0(2131746428, r13), R.drawable.msg_forward_replace, r13);
                    final int i19 = 4;
                    z0Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.q90
                        public final /* synthetic */ ca0 b;

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
                                    ca0 ca0Var2 = this.b;
                                    ca0Var2.c0.d.d = null;
                                    ca0Var2.e.f(false);
                                    ca0Var2.h(false, false);
                                    ca0Var2.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    ca0 ca0Var3 = this.b;
                                    w90 w90Var2 = ca0Var3.e;
                                    ia0 ia0Var2 = ca0Var3.c0;
                                    if (ca0Var3.c(null) != null) {
                                        if (w90Var2.v - w90Var2.u <= org.telegram.messenger.qp.s1(ia0Var2.x).o4) {
                                            org.telegram.ui.Cells.q9 q9Var = w90Var2.W;
                                            org.telegram.messenger.ij c11 = ca0Var3.c(q9Var != null ? ((org.telegram.ui.Cells.q1) q9Var).getMessageObject() : null);
                                            org.telegram.messenger.mj mjVar5 = ia0Var2.d;
                                            int i162 = w90Var2.u;
                                            mjVar5.e = i162;
                                            int i172 = w90Var2.v;
                                            mjVar5.f = i172;
                                            mjVar5.d = org.telegram.ui.sm.b(i162, i172, c11);
                                            ia0Var2.b();
                                            ia0Var2.a(true);
                                            break;
                                        } else {
                                            ca0Var3.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    ca0 ca0Var4 = this.b;
                                    w90 w90Var3 = ca0Var4.e;
                                    ia0 ia0Var3 = ca0Var4.c0;
                                    org.telegram.messenger.mj mjVar6 = ia0Var3.d;
                                    int i182 = ia0Var3.x;
                                    boolean z132 = ia0Var3.b;
                                    if (mjVar6.d != null && !z132) {
                                        mjVar6.d = null;
                                        w90Var3.f(false);
                                        ca0Var4.h(false, true);
                                        ca0Var4.l(true);
                                        break;
                                    } else if (w90Var3.v - w90Var3.u <= org.telegram.messenger.qp.s1(i182).o4) {
                                        org.telegram.messenger.ij c12 = ca0Var4.c(null);
                                        if (c12 != null) {
                                            if (!w90Var3.x()) {
                                                mjVar6.e = 0;
                                                int min = Math.min(org.telegram.messenger.qp.s1(i182).o4, org.telegram.ui.sm.d(c12));
                                                mjVar6.f = min;
                                                mjVar6.d = org.telegram.ui.sm.b(mjVar6.e, min, c12);
                                                View d = ca0Var4.d();
                                                if (d instanceof org.telegram.ui.Cells.q1) {
                                                    w90Var3.a0((org.telegram.ui.Cells.q1) d, mjVar6.e, mjVar6.f);
                                                }
                                                if (!z132) {
                                                    ca0Var4.s.getSwipeBack().e(ca0Var4.I);
                                                }
                                                ca0Var4.h(true, true);
                                                break;
                                            } else {
                                                mjVar6.e = w90Var3.u;
                                                mjVar6.f = w90Var3.v;
                                                org.telegram.ui.Cells.q9 q9Var2 = w90Var3.W;
                                                mjVar6.d = org.telegram.ui.sm.b(mjVar6.e, mjVar6.f, ca0Var4.c(q9Var2 != null ? ((org.telegram.ui.Cells.q1) q9Var2).getMessageObject() : null));
                                                ia0Var3.b();
                                                ia0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        ca0Var4.g();
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
                                    ia0 ia0Var4 = this.b.c0;
                                    if (!ia0Var4.b) {
                                        org.telegram.ui.nk nkVar = (org.telegram.ui.nk) ia0Var4;
                                        nkVar.a(true);
                                        org.telegram.ui.cn cnVar = nkVar.H;
                                        cnVar.D5 = null;
                                        cnVar.B5 = null;
                                        cnVar.v5.f(null, null, cnVar.j6, null);
                                        cnVar.A8();
                                        break;
                                    } else {
                                        org.telegram.ui.nk nkVar2 = (org.telegram.ui.nk) ia0Var4;
                                        nkVar2.a(true);
                                        org.telegram.ui.cn cnVar2 = nkVar2.H;
                                        cnVar2.B5 = null;
                                        cnVar2.hc(cnVar2.D5);
                                        break;
                                    }
                                case 7:
                                    this.b.c0.c(true);
                                    break;
                                case 8:
                                    this.b.c0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.nk nkVar3 = (org.telegram.ui.nk) this.b.c0;
                                    nkVar3.a(true);
                                    org.telegram.ui.cn cnVar3 = nkVar3.H;
                                    cnVar3.v5.d(null, cnVar3.j6);
                                    cnVar3.A8();
                                    break;
                                case 10:
                                    this.b.c0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.nk nkVar4 = (org.telegram.ui.nk) this.b.c0;
                                    nkVar4.a(true);
                                    org.telegram.ui.cn cnVar4 = nkVar4.H;
                                    cnVar4.W5 = null;
                                    org.telegram.ui.sj sjVar = cnVar4.Z;
                                    if (sjVar != null) {
                                        sjVar.X2 = null;
                                        sjVar.Y2 = false;
                                    }
                                    org.telegram.messenger.mj mjVar7 = cnVar4.v5;
                                    if (mjVar7 != null) {
                                        i152 = ((org.telegram.ui.ActionBar.f2) cnVar4).currentAccount;
                                        org.telegram.messenger.ij ijVar = cnVar4.D5;
                                        mjVar7.e(i152, null, null, ijVar == cnVar4.l4 ? null : ijVar, cnVar4.B5, cnVar4.F5);
                                    }
                                    cnVar4.A8();
                                    break;
                                case 12:
                                    ca0 ca0Var5 = this.b;
                                    org.telegram.messenger.mj mjVar8 = ca0Var5.c0.d;
                                    if (mjVar8.o) {
                                        boolean z14 = !mjVar8.q;
                                        mjVar8.q = z14;
                                        ca0Var5.G.a(z14, true);
                                        ca0Var5.H.a(mjVar8.q, true);
                                        if (ca0Var5.r.e.size() > 0 && (message2 = ((org.telegram.messenger.ij) ca0Var5.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z15 = mjVar8.q;
                                            messageMedia2.force_small_media = z15;
                                            messageMedia2.force_large_media = !z15;
                                        }
                                        if (ca0Var5.r.f.size() > 0 && (message = ((org.telegram.messenger.ij) ca0Var5.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z16 = mjVar8.q;
                                            messageMedia.force_small_media = z16;
                                            messageMedia.force_large_media = !z16;
                                        }
                                        ca0Var5.i();
                                        ca0Var5.U = true;
                                        break;
                                    }
                                    break;
                                default:
                                    ca0 ca0Var6 = this.b;
                                    org.telegram.messenger.mj mjVar9 = ca0Var6.c0.d;
                                    boolean z17 = mjVar9.r;
                                    mjVar9.r = !z17;
                                    ca0Var6.E.a(z17, true);
                                    if (ca0Var6.r.e.size() > 0 && (message4 = ((org.telegram.messenger.ij) ca0Var6.r.e.get(0)).k) != null) {
                                        message4.invert_media = mjVar9.r;
                                    }
                                    if (ca0Var6.r.f.size() > 0 && (message3 = ((org.telegram.messenger.ij) ca0Var6.r.f.get(0)).k) != null) {
                                        message3.invert_media = mjVar9.r;
                                    }
                                    ca0Var6.i();
                                    ca0Var6.U = true;
                                    break;
                            }
                        }
                    });
                    frameLayout2.addView(z0Var4, c8.ha.c(48.0f, -1));
                    frameLayout2.addView(z0Var3, c8.ha.c(48.0f, -1));
                    actionBarPopupWindow$ActionBarPopupWindowLayout7.a(frameLayout2, c8.ha.o(-1, 48));
                    actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout7;
                }
                if (!z12 && !mjVar.u) {
                    View d1Var2 = new org.telegram.ui.ActionBar.d1(context3, ea0Var);
                    org.telegram.ui.ActionBar.t6.i(d1Var2, org.telegram.ui.ActionBar.t6.K(0.06f, org.telegram.ui.ActionBar.m6.E8), ea0Var);
                    d1Var2.setTag(R.id.fit_width_tag, 1);
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.a(d1Var2, c8.ha.o(-1, 8));
                }
                h(mjVar.d != null, false);
                org.telegram.ui.ActionBar.z0 z0Var5 = new org.telegram.ui.ActionBar.z0(1, context3, ia0Var.F, false, false);
                z0Var5.j(org.telegram.messenger.id.M0(2131754218, r13), R.drawable.msg_select, r13);
                final int i20 = 5;
                z0Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.q90
                    public final /* synthetic */ ca0 b;

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
                                ca0 ca0Var2 = this.b;
                                ca0Var2.c0.d.d = null;
                                ca0Var2.e.f(false);
                                ca0Var2.h(false, false);
                                ca0Var2.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                ca0 ca0Var3 = this.b;
                                w90 w90Var2 = ca0Var3.e;
                                ia0 ia0Var2 = ca0Var3.c0;
                                if (ca0Var3.c(null) != null) {
                                    if (w90Var2.v - w90Var2.u <= org.telegram.messenger.qp.s1(ia0Var2.x).o4) {
                                        org.telegram.ui.Cells.q9 q9Var = w90Var2.W;
                                        org.telegram.messenger.ij c11 = ca0Var3.c(q9Var != null ? ((org.telegram.ui.Cells.q1) q9Var).getMessageObject() : null);
                                        org.telegram.messenger.mj mjVar5 = ia0Var2.d;
                                        int i162 = w90Var2.u;
                                        mjVar5.e = i162;
                                        int i172 = w90Var2.v;
                                        mjVar5.f = i172;
                                        mjVar5.d = org.telegram.ui.sm.b(i162, i172, c11);
                                        ia0Var2.b();
                                        ia0Var2.a(true);
                                        break;
                                    } else {
                                        ca0Var3.g();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                ca0 ca0Var4 = this.b;
                                w90 w90Var3 = ca0Var4.e;
                                ia0 ia0Var3 = ca0Var4.c0;
                                org.telegram.messenger.mj mjVar6 = ia0Var3.d;
                                int i182 = ia0Var3.x;
                                boolean z132 = ia0Var3.b;
                                if (mjVar6.d != null && !z132) {
                                    mjVar6.d = null;
                                    w90Var3.f(false);
                                    ca0Var4.h(false, true);
                                    ca0Var4.l(true);
                                    break;
                                } else if (w90Var3.v - w90Var3.u <= org.telegram.messenger.qp.s1(i182).o4) {
                                    org.telegram.messenger.ij c12 = ca0Var4.c(null);
                                    if (c12 != null) {
                                        if (!w90Var3.x()) {
                                            mjVar6.e = 0;
                                            int min = Math.min(org.telegram.messenger.qp.s1(i182).o4, org.telegram.ui.sm.d(c12));
                                            mjVar6.f = min;
                                            mjVar6.d = org.telegram.ui.sm.b(mjVar6.e, min, c12);
                                            View d = ca0Var4.d();
                                            if (d instanceof org.telegram.ui.Cells.q1) {
                                                w90Var3.a0((org.telegram.ui.Cells.q1) d, mjVar6.e, mjVar6.f);
                                            }
                                            if (!z132) {
                                                ca0Var4.s.getSwipeBack().e(ca0Var4.I);
                                            }
                                            ca0Var4.h(true, true);
                                            break;
                                        } else {
                                            mjVar6.e = w90Var3.u;
                                            mjVar6.f = w90Var3.v;
                                            org.telegram.ui.Cells.q9 q9Var2 = w90Var3.W;
                                            mjVar6.d = org.telegram.ui.sm.b(mjVar6.e, mjVar6.f, ca0Var4.c(q9Var2 != null ? ((org.telegram.ui.Cells.q1) q9Var2).getMessageObject() : null));
                                            ia0Var3.b();
                                            ia0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    ca0Var4.g();
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
                                ia0 ia0Var4 = this.b.c0;
                                if (!ia0Var4.b) {
                                    org.telegram.ui.nk nkVar = (org.telegram.ui.nk) ia0Var4;
                                    nkVar.a(true);
                                    org.telegram.ui.cn cnVar = nkVar.H;
                                    cnVar.D5 = null;
                                    cnVar.B5 = null;
                                    cnVar.v5.f(null, null, cnVar.j6, null);
                                    cnVar.A8();
                                    break;
                                } else {
                                    org.telegram.ui.nk nkVar2 = (org.telegram.ui.nk) ia0Var4;
                                    nkVar2.a(true);
                                    org.telegram.ui.cn cnVar2 = nkVar2.H;
                                    cnVar2.B5 = null;
                                    cnVar2.hc(cnVar2.D5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.nk nkVar3 = (org.telegram.ui.nk) this.b.c0;
                                nkVar3.a(true);
                                org.telegram.ui.cn cnVar3 = nkVar3.H;
                                cnVar3.v5.d(null, cnVar3.j6);
                                cnVar3.A8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.nk nkVar4 = (org.telegram.ui.nk) this.b.c0;
                                nkVar4.a(true);
                                org.telegram.ui.cn cnVar4 = nkVar4.H;
                                cnVar4.W5 = null;
                                org.telegram.ui.sj sjVar = cnVar4.Z;
                                if (sjVar != null) {
                                    sjVar.X2 = null;
                                    sjVar.Y2 = false;
                                }
                                org.telegram.messenger.mj mjVar7 = cnVar4.v5;
                                if (mjVar7 != null) {
                                    i152 = ((org.telegram.ui.ActionBar.f2) cnVar4).currentAccount;
                                    org.telegram.messenger.ij ijVar = cnVar4.D5;
                                    mjVar7.e(i152, null, null, ijVar == cnVar4.l4 ? null : ijVar, cnVar4.B5, cnVar4.F5);
                                }
                                cnVar4.A8();
                                break;
                            case 12:
                                ca0 ca0Var5 = this.b;
                                org.telegram.messenger.mj mjVar8 = ca0Var5.c0.d;
                                if (mjVar8.o) {
                                    boolean z14 = !mjVar8.q;
                                    mjVar8.q = z14;
                                    ca0Var5.G.a(z14, true);
                                    ca0Var5.H.a(mjVar8.q, true);
                                    if (ca0Var5.r.e.size() > 0 && (message2 = ((org.telegram.messenger.ij) ca0Var5.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = mjVar8.q;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (ca0Var5.r.f.size() > 0 && (message = ((org.telegram.messenger.ij) ca0Var5.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = mjVar8.q;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    ca0Var5.i();
                                    ca0Var5.U = true;
                                    break;
                                }
                                break;
                            default:
                                ca0 ca0Var6 = this.b;
                                org.telegram.messenger.mj mjVar9 = ca0Var6.c0.d;
                                boolean z17 = mjVar9.r;
                                mjVar9.r = !z17;
                                ca0Var6.E.a(z17, true);
                                if (ca0Var6.r.e.size() > 0 && (message4 = ((org.telegram.messenger.ij) ca0Var6.r.e.get(0)).k) != null) {
                                    message4.invert_media = mjVar9.r;
                                }
                                if (ca0Var6.r.f.size() > 0 && (message3 = ((org.telegram.messenger.ij) ca0Var6.r.f.get(0)).k) != null) {
                                    message3.invert_media = mjVar9.r;
                                }
                                ca0Var6.i();
                                ca0Var6.U = true;
                                break;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(z0Var5, c8.ha.o(-1, 48));
                org.telegram.ui.ActionBar.z0 z0Var6 = new org.telegram.ui.ActionBar.z0(1, context, ia0Var.F, false, true);
                z0Var6.j(org.telegram.messenger.id.M0(z11 ? 2131751360 : 2131751359, r13), R.drawable.msg_delete, r13);
                int i21 = org.telegram.ui.ActionBar.m6.q7;
                int i22 = org.telegram.ui.ActionBar.m6.p7;
                z0Var6.c(i21, i22);
                z0Var6.h(0.12f, i22);
                final int i23 = 6;
                z0Var6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.q90
                    public final /* synthetic */ ca0 b;

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
                                ca0 ca0Var2 = this.b;
                                ca0Var2.c0.d.d = null;
                                ca0Var2.e.f(false);
                                ca0Var2.h(false, false);
                                ca0Var2.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                ca0 ca0Var3 = this.b;
                                w90 w90Var2 = ca0Var3.e;
                                ia0 ia0Var2 = ca0Var3.c0;
                                if (ca0Var3.c(null) != null) {
                                    if (w90Var2.v - w90Var2.u <= org.telegram.messenger.qp.s1(ia0Var2.x).o4) {
                                        org.telegram.ui.Cells.q9 q9Var = w90Var2.W;
                                        org.telegram.messenger.ij c11 = ca0Var3.c(q9Var != null ? ((org.telegram.ui.Cells.q1) q9Var).getMessageObject() : null);
                                        org.telegram.messenger.mj mjVar5 = ia0Var2.d;
                                        int i162 = w90Var2.u;
                                        mjVar5.e = i162;
                                        int i172 = w90Var2.v;
                                        mjVar5.f = i172;
                                        mjVar5.d = org.telegram.ui.sm.b(i162, i172, c11);
                                        ia0Var2.b();
                                        ia0Var2.a(true);
                                        break;
                                    } else {
                                        ca0Var3.g();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                ca0 ca0Var4 = this.b;
                                w90 w90Var3 = ca0Var4.e;
                                ia0 ia0Var3 = ca0Var4.c0;
                                org.telegram.messenger.mj mjVar6 = ia0Var3.d;
                                int i182 = ia0Var3.x;
                                boolean z132 = ia0Var3.b;
                                if (mjVar6.d != null && !z132) {
                                    mjVar6.d = null;
                                    w90Var3.f(false);
                                    ca0Var4.h(false, true);
                                    ca0Var4.l(true);
                                    break;
                                } else if (w90Var3.v - w90Var3.u <= org.telegram.messenger.qp.s1(i182).o4) {
                                    org.telegram.messenger.ij c12 = ca0Var4.c(null);
                                    if (c12 != null) {
                                        if (!w90Var3.x()) {
                                            mjVar6.e = 0;
                                            int min = Math.min(org.telegram.messenger.qp.s1(i182).o4, org.telegram.ui.sm.d(c12));
                                            mjVar6.f = min;
                                            mjVar6.d = org.telegram.ui.sm.b(mjVar6.e, min, c12);
                                            View d = ca0Var4.d();
                                            if (d instanceof org.telegram.ui.Cells.q1) {
                                                w90Var3.a0((org.telegram.ui.Cells.q1) d, mjVar6.e, mjVar6.f);
                                            }
                                            if (!z132) {
                                                ca0Var4.s.getSwipeBack().e(ca0Var4.I);
                                            }
                                            ca0Var4.h(true, true);
                                            break;
                                        } else {
                                            mjVar6.e = w90Var3.u;
                                            mjVar6.f = w90Var3.v;
                                            org.telegram.ui.Cells.q9 q9Var2 = w90Var3.W;
                                            mjVar6.d = org.telegram.ui.sm.b(mjVar6.e, mjVar6.f, ca0Var4.c(q9Var2 != null ? ((org.telegram.ui.Cells.q1) q9Var2).getMessageObject() : null));
                                            ia0Var3.b();
                                            ia0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    ca0Var4.g();
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
                                ia0 ia0Var4 = this.b.c0;
                                if (!ia0Var4.b) {
                                    org.telegram.ui.nk nkVar = (org.telegram.ui.nk) ia0Var4;
                                    nkVar.a(true);
                                    org.telegram.ui.cn cnVar = nkVar.H;
                                    cnVar.D5 = null;
                                    cnVar.B5 = null;
                                    cnVar.v5.f(null, null, cnVar.j6, null);
                                    cnVar.A8();
                                    break;
                                } else {
                                    org.telegram.ui.nk nkVar2 = (org.telegram.ui.nk) ia0Var4;
                                    nkVar2.a(true);
                                    org.telegram.ui.cn cnVar2 = nkVar2.H;
                                    cnVar2.B5 = null;
                                    cnVar2.hc(cnVar2.D5);
                                    break;
                                }
                            case 7:
                                this.b.c0.c(true);
                                break;
                            case 8:
                                this.b.c0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.nk nkVar3 = (org.telegram.ui.nk) this.b.c0;
                                nkVar3.a(true);
                                org.telegram.ui.cn cnVar3 = nkVar3.H;
                                cnVar3.v5.d(null, cnVar3.j6);
                                cnVar3.A8();
                                break;
                            case 10:
                                this.b.c0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.nk nkVar4 = (org.telegram.ui.nk) this.b.c0;
                                nkVar4.a(true);
                                org.telegram.ui.cn cnVar4 = nkVar4.H;
                                cnVar4.W5 = null;
                                org.telegram.ui.sj sjVar = cnVar4.Z;
                                if (sjVar != null) {
                                    sjVar.X2 = null;
                                    sjVar.Y2 = false;
                                }
                                org.telegram.messenger.mj mjVar7 = cnVar4.v5;
                                if (mjVar7 != null) {
                                    i152 = ((org.telegram.ui.ActionBar.f2) cnVar4).currentAccount;
                                    org.telegram.messenger.ij ijVar = cnVar4.D5;
                                    mjVar7.e(i152, null, null, ijVar == cnVar4.l4 ? null : ijVar, cnVar4.B5, cnVar4.F5);
                                }
                                cnVar4.A8();
                                break;
                            case 12:
                                ca0 ca0Var5 = this.b;
                                org.telegram.messenger.mj mjVar8 = ca0Var5.c0.d;
                                if (mjVar8.o) {
                                    boolean z14 = !mjVar8.q;
                                    mjVar8.q = z14;
                                    ca0Var5.G.a(z14, true);
                                    ca0Var5.H.a(mjVar8.q, true);
                                    if (ca0Var5.r.e.size() > 0 && (message2 = ((org.telegram.messenger.ij) ca0Var5.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = mjVar8.q;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (ca0Var5.r.f.size() > 0 && (message = ((org.telegram.messenger.ij) ca0Var5.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = mjVar8.q;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    ca0Var5.i();
                                    ca0Var5.U = true;
                                    break;
                                }
                                break;
                            default:
                                ca0 ca0Var6 = this.b;
                                org.telegram.messenger.mj mjVar9 = ca0Var6.c0.d;
                                boolean z17 = mjVar9.r;
                                mjVar9.r = !z17;
                                ca0Var6.E.a(z17, true);
                                if (ca0Var6.r.e.size() > 0 && (message4 = ((org.telegram.messenger.ij) ca0Var6.r.e.get(0)).k) != null) {
                                    message4.invert_media = mjVar9.r;
                                }
                                if (ca0Var6.r.f.size() > 0 && (message3 = ((org.telegram.messenger.ij) ca0Var6.r.f.get(0)).k) != null) {
                                    message3.invert_media = mjVar9.r;
                                }
                                ca0Var6.i();
                                ca0Var6.U = true;
                                break;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(z0Var6, c8.ha.o(-1, 48));
                viewOutlineProvider = r13;
                context2 = context;
                ca0Var = this;
                r13 = viewOutlineProvider;
                i10 = ca0Var.a;
                if (i10 == 1) {
                    ca0Var.r = mjVar.b;
                } else if (i10 == 0) {
                    ca0Var.r = mjVar.a;
                } else if (i10 == 2) {
                    ca0Var.r = mjVar.c;
                }
                n10 = ca0Var.e.n(context2);
                ca0Var.d = n10;
                n10.setElevation(org.telegram.messenger.g0.L(8.0f));
                n10.setOutlineProvider(r13);
                if (n10.getParent() instanceof ViewGroup) {
                    ((ViewGroup) n10.getParent()).removeView(n10);
                }
                ca0Var.addView(n10, c8.ha.d(-1, -1.0f, 51, 0.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / org.telegram.messenger.g0.p, 0.0f, 0.0f));
                ca0Var.e.S(ca0Var.f);
            }
        }
        mjVar = mjVar4;
        viewOutlineProvider = null;
        viewOutlineProvider = null;
        viewOutlineProvider = null;
        ViewOutlineProvider viewOutlineProvider2 = null;
        viewOutlineProvider = null;
        if (i7 == 1 && mjVar.b != null) {
            if (!org.telegram.messenger.p10.i(ia0Var.x).q()) {
                for (int i24 = 0; i24 < mjVar.b.e.size(); i24++) {
                    if (((org.telegram.messenger.ij) mjVar.b.e.get(i24)).D == 36) {
                        z9 = false;
                        break;
                    }
                }
            }
            z9 = true;
            ha0 ha0Var3 = new ha0(context, R.raw.name_hide, org.telegram.messenger.id.M0(mjVar.j ? 2131745332 : 2131745331, null), R.raw.name_show, org.telegram.messenger.id.M0(mjVar.j ? 2131749309 : 2131749308, null), ia0Var.F);
            this.s.a(ha0Var3, c8.ha.o(-1, 48));
            if (mjVar.g) {
                ha0Var = ha0Var3;
                ha0 ha0Var4 = new ha0(context, R.raw.caption_hide, org.telegram.messenger.id.M0(2131745344, null), R.raw.caption_show, org.telegram.messenger.id.M0(2131749321, null), ia0Var.F);
                ha0Var4.a(mjVar.l, false);
                this.s.a(ha0Var4, c8.ha.o(-1, 48));
                ha0Var2 = ha0Var4;
            } else {
                ha0Var = ha0Var3;
                ha0Var2 = null;
            }
            org.telegram.ui.ActionBar.z0 z0Var7 = new org.telegram.ui.ActionBar.z0(0, context, ia0Var.F, true, false);
            final int i25 = 7;
            z0Var7.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.q90
                public final /* synthetic */ ca0 b;

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
                    switch (i25) {
                        case 0:
                            ca0 ca0Var2 = this.b;
                            ca0Var2.c0.d.d = null;
                            ca0Var2.e.f(false);
                            ca0Var2.h(false, false);
                            ca0Var2.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            ca0 ca0Var3 = this.b;
                            w90 w90Var2 = ca0Var3.e;
                            ia0 ia0Var2 = ca0Var3.c0;
                            if (ca0Var3.c(null) != null) {
                                if (w90Var2.v - w90Var2.u <= org.telegram.messenger.qp.s1(ia0Var2.x).o4) {
                                    org.telegram.ui.Cells.q9 q9Var = w90Var2.W;
                                    org.telegram.messenger.ij c11 = ca0Var3.c(q9Var != null ? ((org.telegram.ui.Cells.q1) q9Var).getMessageObject() : null);
                                    org.telegram.messenger.mj mjVar5 = ia0Var2.d;
                                    int i162 = w90Var2.u;
                                    mjVar5.e = i162;
                                    int i172 = w90Var2.v;
                                    mjVar5.f = i172;
                                    mjVar5.d = org.telegram.ui.sm.b(i162, i172, c11);
                                    ia0Var2.b();
                                    ia0Var2.a(true);
                                    break;
                                } else {
                                    ca0Var3.g();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            ca0 ca0Var4 = this.b;
                            w90 w90Var3 = ca0Var4.e;
                            ia0 ia0Var3 = ca0Var4.c0;
                            org.telegram.messenger.mj mjVar6 = ia0Var3.d;
                            int i182 = ia0Var3.x;
                            boolean z132 = ia0Var3.b;
                            if (mjVar6.d != null && !z132) {
                                mjVar6.d = null;
                                w90Var3.f(false);
                                ca0Var4.h(false, true);
                                ca0Var4.l(true);
                                break;
                            } else if (w90Var3.v - w90Var3.u <= org.telegram.messenger.qp.s1(i182).o4) {
                                org.telegram.messenger.ij c12 = ca0Var4.c(null);
                                if (c12 != null) {
                                    if (!w90Var3.x()) {
                                        mjVar6.e = 0;
                                        int min = Math.min(org.telegram.messenger.qp.s1(i182).o4, org.telegram.ui.sm.d(c12));
                                        mjVar6.f = min;
                                        mjVar6.d = org.telegram.ui.sm.b(mjVar6.e, min, c12);
                                        View d = ca0Var4.d();
                                        if (d instanceof org.telegram.ui.Cells.q1) {
                                            w90Var3.a0((org.telegram.ui.Cells.q1) d, mjVar6.e, mjVar6.f);
                                        }
                                        if (!z132) {
                                            ca0Var4.s.getSwipeBack().e(ca0Var4.I);
                                        }
                                        ca0Var4.h(true, true);
                                        break;
                                    } else {
                                        mjVar6.e = w90Var3.u;
                                        mjVar6.f = w90Var3.v;
                                        org.telegram.ui.Cells.q9 q9Var2 = w90Var3.W;
                                        mjVar6.d = org.telegram.ui.sm.b(mjVar6.e, mjVar6.f, ca0Var4.c(q9Var2 != null ? ((org.telegram.ui.Cells.q1) q9Var2).getMessageObject() : null));
                                        ia0Var3.b();
                                        ia0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                ca0Var4.g();
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
                            ia0 ia0Var4 = this.b.c0;
                            if (!ia0Var4.b) {
                                org.telegram.ui.nk nkVar = (org.telegram.ui.nk) ia0Var4;
                                nkVar.a(true);
                                org.telegram.ui.cn cnVar = nkVar.H;
                                cnVar.D5 = null;
                                cnVar.B5 = null;
                                cnVar.v5.f(null, null, cnVar.j6, null);
                                cnVar.A8();
                                break;
                            } else {
                                org.telegram.ui.nk nkVar2 = (org.telegram.ui.nk) ia0Var4;
                                nkVar2.a(true);
                                org.telegram.ui.cn cnVar2 = nkVar2.H;
                                cnVar2.B5 = null;
                                cnVar2.hc(cnVar2.D5);
                                break;
                            }
                        case 7:
                            this.b.c0.c(true);
                            break;
                        case 8:
                            this.b.c0.a(true);
                            break;
                        case 9:
                            org.telegram.ui.nk nkVar3 = (org.telegram.ui.nk) this.b.c0;
                            nkVar3.a(true);
                            org.telegram.ui.cn cnVar3 = nkVar3.H;
                            cnVar3.v5.d(null, cnVar3.j6);
                            cnVar3.A8();
                            break;
                        case 10:
                            this.b.c0.a(true);
                            break;
                        case 11:
                            org.telegram.ui.nk nkVar4 = (org.telegram.ui.nk) this.b.c0;
                            nkVar4.a(true);
                            org.telegram.ui.cn cnVar4 = nkVar4.H;
                            cnVar4.W5 = null;
                            org.telegram.ui.sj sjVar = cnVar4.Z;
                            if (sjVar != null) {
                                sjVar.X2 = null;
                                sjVar.Y2 = false;
                            }
                            org.telegram.messenger.mj mjVar7 = cnVar4.v5;
                            if (mjVar7 != null) {
                                i152 = ((org.telegram.ui.ActionBar.f2) cnVar4).currentAccount;
                                org.telegram.messenger.ij ijVar = cnVar4.D5;
                                mjVar7.e(i152, null, null, ijVar == cnVar4.l4 ? null : ijVar, cnVar4.B5, cnVar4.F5);
                            }
                            cnVar4.A8();
                            break;
                        case 12:
                            ca0 ca0Var5 = this.b;
                            org.telegram.messenger.mj mjVar8 = ca0Var5.c0.d;
                            if (mjVar8.o) {
                                boolean z14 = !mjVar8.q;
                                mjVar8.q = z14;
                                ca0Var5.G.a(z14, true);
                                ca0Var5.H.a(mjVar8.q, true);
                                if (ca0Var5.r.e.size() > 0 && (message2 = ((org.telegram.messenger.ij) ca0Var5.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z15 = mjVar8.q;
                                    messageMedia2.force_small_media = z15;
                                    messageMedia2.force_large_media = !z15;
                                }
                                if (ca0Var5.r.f.size() > 0 && (message = ((org.telegram.messenger.ij) ca0Var5.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                    boolean z16 = mjVar8.q;
                                    messageMedia.force_small_media = z16;
                                    messageMedia.force_large_media = !z16;
                                }
                                ca0Var5.i();
                                ca0Var5.U = true;
                                break;
                            }
                            break;
                        default:
                            ca0 ca0Var6 = this.b;
                            org.telegram.messenger.mj mjVar9 = ca0Var6.c0.d;
                            boolean z17 = mjVar9.r;
                            mjVar9.r = !z17;
                            ca0Var6.E.a(z17, true);
                            if (ca0Var6.r.e.size() > 0 && (message4 = ((org.telegram.messenger.ij) ca0Var6.r.e.get(0)).k) != null) {
                                message4.invert_media = mjVar9.r;
                            }
                            if (ca0Var6.r.f.size() > 0 && (message3 = ((org.telegram.messenger.ij) ca0Var6.r.f.get(0)).k) != null) {
                                message3.invert_media = mjVar9.r;
                            }
                            ca0Var6.i();
                            ca0Var6.U = true;
                            break;
                    }
                }
            });
            z0Var7.j(org.telegram.messenger.id.M0(2131752532, null), R.drawable.msg_forward_replace, null);
            this.s.a(z0Var7, c8.ha.o(-1, 48));
            org.telegram.ui.ActionBar.d1 d1Var3 = new org.telegram.ui.ActionBar.d1(context, ea0Var);
            org.telegram.ui.ActionBar.t6.i(d1Var3, org.telegram.ui.ActionBar.t6.K(0.06f, org.telegram.ui.ActionBar.m6.E8), ea0Var);
            d1Var3.setTag(R.id.fit_width_tag, 1);
            final int i26 = 8;
            this.s.a(d1Var3, c8.ha.o(-1, 8));
            org.telegram.ui.ActionBar.z0 z0Var8 = new org.telegram.ui.ActionBar.z0(1, context, ia0Var.F, false, false);
            z0Var8.j(org.telegram.messenger.id.M0(2131754218, null), R.drawable.msg_select, null);
            z0Var8.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.q90
                public final /* synthetic */ ca0 b;

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
                    switch (i26) {
                        case 0:
                            ca0 ca0Var2 = this.b;
                            ca0Var2.c0.d.d = null;
                            ca0Var2.e.f(false);
                            ca0Var2.h(false, false);
                            ca0Var2.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            ca0 ca0Var3 = this.b;
                            w90 w90Var2 = ca0Var3.e;
                            ia0 ia0Var2 = ca0Var3.c0;
                            if (ca0Var3.c(null) != null) {
                                if (w90Var2.v - w90Var2.u <= org.telegram.messenger.qp.s1(ia0Var2.x).o4) {
                                    org.telegram.ui.Cells.q9 q9Var = w90Var2.W;
                                    org.telegram.messenger.ij c11 = ca0Var3.c(q9Var != null ? ((org.telegram.ui.Cells.q1) q9Var).getMessageObject() : null);
                                    org.telegram.messenger.mj mjVar5 = ia0Var2.d;
                                    int i162 = w90Var2.u;
                                    mjVar5.e = i162;
                                    int i172 = w90Var2.v;
                                    mjVar5.f = i172;
                                    mjVar5.d = org.telegram.ui.sm.b(i162, i172, c11);
                                    ia0Var2.b();
                                    ia0Var2.a(true);
                                    break;
                                } else {
                                    ca0Var3.g();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            ca0 ca0Var4 = this.b;
                            w90 w90Var3 = ca0Var4.e;
                            ia0 ia0Var3 = ca0Var4.c0;
                            org.telegram.messenger.mj mjVar6 = ia0Var3.d;
                            int i182 = ia0Var3.x;
                            boolean z132 = ia0Var3.b;
                            if (mjVar6.d != null && !z132) {
                                mjVar6.d = null;
                                w90Var3.f(false);
                                ca0Var4.h(false, true);
                                ca0Var4.l(true);
                                break;
                            } else if (w90Var3.v - w90Var3.u <= org.telegram.messenger.qp.s1(i182).o4) {
                                org.telegram.messenger.ij c12 = ca0Var4.c(null);
                                if (c12 != null) {
                                    if (!w90Var3.x()) {
                                        mjVar6.e = 0;
                                        int min = Math.min(org.telegram.messenger.qp.s1(i182).o4, org.telegram.ui.sm.d(c12));
                                        mjVar6.f = min;
                                        mjVar6.d = org.telegram.ui.sm.b(mjVar6.e, min, c12);
                                        View d = ca0Var4.d();
                                        if (d instanceof org.telegram.ui.Cells.q1) {
                                            w90Var3.a0((org.telegram.ui.Cells.q1) d, mjVar6.e, mjVar6.f);
                                        }
                                        if (!z132) {
                                            ca0Var4.s.getSwipeBack().e(ca0Var4.I);
                                        }
                                        ca0Var4.h(true, true);
                                        break;
                                    } else {
                                        mjVar6.e = w90Var3.u;
                                        mjVar6.f = w90Var3.v;
                                        org.telegram.ui.Cells.q9 q9Var2 = w90Var3.W;
                                        mjVar6.d = org.telegram.ui.sm.b(mjVar6.e, mjVar6.f, ca0Var4.c(q9Var2 != null ? ((org.telegram.ui.Cells.q1) q9Var2).getMessageObject() : null));
                                        ia0Var3.b();
                                        ia0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                ca0Var4.g();
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
                            ia0 ia0Var4 = this.b.c0;
                            if (!ia0Var4.b) {
                                org.telegram.ui.nk nkVar = (org.telegram.ui.nk) ia0Var4;
                                nkVar.a(true);
                                org.telegram.ui.cn cnVar = nkVar.H;
                                cnVar.D5 = null;
                                cnVar.B5 = null;
                                cnVar.v5.f(null, null, cnVar.j6, null);
                                cnVar.A8();
                                break;
                            } else {
                                org.telegram.ui.nk nkVar2 = (org.telegram.ui.nk) ia0Var4;
                                nkVar2.a(true);
                                org.telegram.ui.cn cnVar2 = nkVar2.H;
                                cnVar2.B5 = null;
                                cnVar2.hc(cnVar2.D5);
                                break;
                            }
                        case 7:
                            this.b.c0.c(true);
                            break;
                        case 8:
                            this.b.c0.a(true);
                            break;
                        case 9:
                            org.telegram.ui.nk nkVar3 = (org.telegram.ui.nk) this.b.c0;
                            nkVar3.a(true);
                            org.telegram.ui.cn cnVar3 = nkVar3.H;
                            cnVar3.v5.d(null, cnVar3.j6);
                            cnVar3.A8();
                            break;
                        case 10:
                            this.b.c0.a(true);
                            break;
                        case 11:
                            org.telegram.ui.nk nkVar4 = (org.telegram.ui.nk) this.b.c0;
                            nkVar4.a(true);
                            org.telegram.ui.cn cnVar4 = nkVar4.H;
                            cnVar4.W5 = null;
                            org.telegram.ui.sj sjVar = cnVar4.Z;
                            if (sjVar != null) {
                                sjVar.X2 = null;
                                sjVar.Y2 = false;
                            }
                            org.telegram.messenger.mj mjVar7 = cnVar4.v5;
                            if (mjVar7 != null) {
                                i152 = ((org.telegram.ui.ActionBar.f2) cnVar4).currentAccount;
                                org.telegram.messenger.ij ijVar = cnVar4.D5;
                                mjVar7.e(i152, null, null, ijVar == cnVar4.l4 ? null : ijVar, cnVar4.B5, cnVar4.F5);
                            }
                            cnVar4.A8();
                            break;
                        case 12:
                            ca0 ca0Var5 = this.b;
                            org.telegram.messenger.mj mjVar8 = ca0Var5.c0.d;
                            if (mjVar8.o) {
                                boolean z14 = !mjVar8.q;
                                mjVar8.q = z14;
                                ca0Var5.G.a(z14, true);
                                ca0Var5.H.a(mjVar8.q, true);
                                if (ca0Var5.r.e.size() > 0 && (message2 = ((org.telegram.messenger.ij) ca0Var5.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z15 = mjVar8.q;
                                    messageMedia2.force_small_media = z15;
                                    messageMedia2.force_large_media = !z15;
                                }
                                if (ca0Var5.r.f.size() > 0 && (message = ((org.telegram.messenger.ij) ca0Var5.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                    boolean z16 = mjVar8.q;
                                    messageMedia.force_small_media = z16;
                                    messageMedia.force_large_media = !z16;
                                }
                                ca0Var5.i();
                                ca0Var5.U = true;
                                break;
                            }
                            break;
                        default:
                            ca0 ca0Var6 = this.b;
                            org.telegram.messenger.mj mjVar9 = ca0Var6.c0.d;
                            boolean z17 = mjVar9.r;
                            mjVar9.r = !z17;
                            ca0Var6.E.a(z17, true);
                            if (ca0Var6.r.e.size() > 0 && (message4 = ((org.telegram.messenger.ij) ca0Var6.r.e.get(0)).k) != null) {
                                message4.invert_media = mjVar9.r;
                            }
                            if (ca0Var6.r.f.size() > 0 && (message3 = ((org.telegram.messenger.ij) ca0Var6.r.f.get(0)).k) != null) {
                                message3.invert_media = mjVar9.r;
                            }
                            ca0Var6.i();
                            ca0Var6.U = true;
                            break;
                    }
                }
            });
            this.s.a(z0Var8, c8.ha.o(-1, 48));
            org.telegram.ui.ActionBar.z0 z0Var9 = new org.telegram.ui.ActionBar.z0(1, context, ia0Var.F, false, true);
            z0Var9.j(org.telegram.messenger.id.M0(2131751362, null), R.drawable.msg_delete, null);
            int i27 = org.telegram.ui.ActionBar.m6.q7;
            int i28 = org.telegram.ui.ActionBar.m6.p7;
            z0Var9.c(i27, i28);
            final int i29 = 9;
            z0Var9.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.q90
                public final /* synthetic */ ca0 b;

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
                    switch (i29) {
                        case 0:
                            ca0 ca0Var2 = this.b;
                            ca0Var2.c0.d.d = null;
                            ca0Var2.e.f(false);
                            ca0Var2.h(false, false);
                            ca0Var2.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            ca0 ca0Var3 = this.b;
                            w90 w90Var2 = ca0Var3.e;
                            ia0 ia0Var2 = ca0Var3.c0;
                            if (ca0Var3.c(null) != null) {
                                if (w90Var2.v - w90Var2.u <= org.telegram.messenger.qp.s1(ia0Var2.x).o4) {
                                    org.telegram.ui.Cells.q9 q9Var = w90Var2.W;
                                    org.telegram.messenger.ij c11 = ca0Var3.c(q9Var != null ? ((org.telegram.ui.Cells.q1) q9Var).getMessageObject() : null);
                                    org.telegram.messenger.mj mjVar5 = ia0Var2.d;
                                    int i162 = w90Var2.u;
                                    mjVar5.e = i162;
                                    int i172 = w90Var2.v;
                                    mjVar5.f = i172;
                                    mjVar5.d = org.telegram.ui.sm.b(i162, i172, c11);
                                    ia0Var2.b();
                                    ia0Var2.a(true);
                                    break;
                                } else {
                                    ca0Var3.g();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            ca0 ca0Var4 = this.b;
                            w90 w90Var3 = ca0Var4.e;
                            ia0 ia0Var3 = ca0Var4.c0;
                            org.telegram.messenger.mj mjVar6 = ia0Var3.d;
                            int i182 = ia0Var3.x;
                            boolean z132 = ia0Var3.b;
                            if (mjVar6.d != null && !z132) {
                                mjVar6.d = null;
                                w90Var3.f(false);
                                ca0Var4.h(false, true);
                                ca0Var4.l(true);
                                break;
                            } else if (w90Var3.v - w90Var3.u <= org.telegram.messenger.qp.s1(i182).o4) {
                                org.telegram.messenger.ij c12 = ca0Var4.c(null);
                                if (c12 != null) {
                                    if (!w90Var3.x()) {
                                        mjVar6.e = 0;
                                        int min = Math.min(org.telegram.messenger.qp.s1(i182).o4, org.telegram.ui.sm.d(c12));
                                        mjVar6.f = min;
                                        mjVar6.d = org.telegram.ui.sm.b(mjVar6.e, min, c12);
                                        View d = ca0Var4.d();
                                        if (d instanceof org.telegram.ui.Cells.q1) {
                                            w90Var3.a0((org.telegram.ui.Cells.q1) d, mjVar6.e, mjVar6.f);
                                        }
                                        if (!z132) {
                                            ca0Var4.s.getSwipeBack().e(ca0Var4.I);
                                        }
                                        ca0Var4.h(true, true);
                                        break;
                                    } else {
                                        mjVar6.e = w90Var3.u;
                                        mjVar6.f = w90Var3.v;
                                        org.telegram.ui.Cells.q9 q9Var2 = w90Var3.W;
                                        mjVar6.d = org.telegram.ui.sm.b(mjVar6.e, mjVar6.f, ca0Var4.c(q9Var2 != null ? ((org.telegram.ui.Cells.q1) q9Var2).getMessageObject() : null));
                                        ia0Var3.b();
                                        ia0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                ca0Var4.g();
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
                            ia0 ia0Var4 = this.b.c0;
                            if (!ia0Var4.b) {
                                org.telegram.ui.nk nkVar = (org.telegram.ui.nk) ia0Var4;
                                nkVar.a(true);
                                org.telegram.ui.cn cnVar = nkVar.H;
                                cnVar.D5 = null;
                                cnVar.B5 = null;
                                cnVar.v5.f(null, null, cnVar.j6, null);
                                cnVar.A8();
                                break;
                            } else {
                                org.telegram.ui.nk nkVar2 = (org.telegram.ui.nk) ia0Var4;
                                nkVar2.a(true);
                                org.telegram.ui.cn cnVar2 = nkVar2.H;
                                cnVar2.B5 = null;
                                cnVar2.hc(cnVar2.D5);
                                break;
                            }
                        case 7:
                            this.b.c0.c(true);
                            break;
                        case 8:
                            this.b.c0.a(true);
                            break;
                        case 9:
                            org.telegram.ui.nk nkVar3 = (org.telegram.ui.nk) this.b.c0;
                            nkVar3.a(true);
                            org.telegram.ui.cn cnVar3 = nkVar3.H;
                            cnVar3.v5.d(null, cnVar3.j6);
                            cnVar3.A8();
                            break;
                        case 10:
                            this.b.c0.a(true);
                            break;
                        case 11:
                            org.telegram.ui.nk nkVar4 = (org.telegram.ui.nk) this.b.c0;
                            nkVar4.a(true);
                            org.telegram.ui.cn cnVar4 = nkVar4.H;
                            cnVar4.W5 = null;
                            org.telegram.ui.sj sjVar = cnVar4.Z;
                            if (sjVar != null) {
                                sjVar.X2 = null;
                                sjVar.Y2 = false;
                            }
                            org.telegram.messenger.mj mjVar7 = cnVar4.v5;
                            if (mjVar7 != null) {
                                i152 = ((org.telegram.ui.ActionBar.f2) cnVar4).currentAccount;
                                org.telegram.messenger.ij ijVar = cnVar4.D5;
                                mjVar7.e(i152, null, null, ijVar == cnVar4.l4 ? null : ijVar, cnVar4.B5, cnVar4.F5);
                            }
                            cnVar4.A8();
                            break;
                        case 12:
                            ca0 ca0Var5 = this.b;
                            org.telegram.messenger.mj mjVar8 = ca0Var5.c0.d;
                            if (mjVar8.o) {
                                boolean z14 = !mjVar8.q;
                                mjVar8.q = z14;
                                ca0Var5.G.a(z14, true);
                                ca0Var5.H.a(mjVar8.q, true);
                                if (ca0Var5.r.e.size() > 0 && (message2 = ((org.telegram.messenger.ij) ca0Var5.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z15 = mjVar8.q;
                                    messageMedia2.force_small_media = z15;
                                    messageMedia2.force_large_media = !z15;
                                }
                                if (ca0Var5.r.f.size() > 0 && (message = ((org.telegram.messenger.ij) ca0Var5.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                    boolean z16 = mjVar8.q;
                                    messageMedia.force_small_media = z16;
                                    messageMedia.force_large_media = !z16;
                                }
                                ca0Var5.i();
                                ca0Var5.U = true;
                                break;
                            }
                            break;
                        default:
                            ca0 ca0Var6 = this.b;
                            org.telegram.messenger.mj mjVar9 = ca0Var6.c0.d;
                            boolean z17 = mjVar9.r;
                            mjVar9.r = !z17;
                            ca0Var6.E.a(z17, true);
                            if (ca0Var6.r.e.size() > 0 && (message4 = ((org.telegram.messenger.ij) ca0Var6.r.e.get(0)).k) != null) {
                                message4.invert_media = mjVar9.r;
                            }
                            if (ca0Var6.r.f.size() > 0 && (message3 = ((org.telegram.messenger.ij) ca0Var6.r.f.get(0)).k) != null) {
                                message3.invert_media = mjVar9.r;
                            }
                            ca0Var6.i();
                            ca0Var6.U = true;
                            break;
                    }
                }
            });
            z0Var9.h(0.12f, i28);
            this.s.a(z0Var9, c8.ha.o(-1, 48));
            ha0 ha0Var5 = ha0Var;
            ha0Var5.a(mjVar.k, false);
            ha0 ha0Var6 = ha0Var2;
            ha0Var5.setOnClickListener(new t90(this, z9, context, ha0Var6, ha0Var5, 0));
            if (ha0Var6 != null) {
                ha0Var6.setOnClickListener(new ah.g(this, ha0Var6, ha0Var5, 28));
            }
        } else if (i7 == 2 && mjVar.c != null) {
            final ca0 ca0Var2 = this;
            ha0 ha0Var7 = new ha0(context, R.raw.position_below, org.telegram.messenger.id.M0(2131748927, null), R.raw.position_above, org.telegram.messenger.id.M0(2131748923, null), ia0Var.F);
            ca0Var2.E = ha0Var7;
            ha0Var7.a(!mjVar.r, false);
            actionBarPopupWindow$ActionBarPopupWindowLayout4.a(ha0Var7, c8.ha.o(-1, 48));
            FrameLayout frameLayout3 = new FrameLayout(context);
            ca0Var2.F = frameLayout3;
            int i30 = org.telegram.ui.ActionBar.m6.I5;
            org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i30, ea0Var), 0, 0);
            org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i30);
            frameLayout3.setBackground(a03);
            org.telegram.ui.ActionBar.t6.j(frameLayout3, a03, null, M2, ea0Var);
            ha0 ha0Var8 = new ha0(context, R.raw.media_shrink, org.telegram.messenger.id.M0(2131748899, null), R.raw.media_enlarge, org.telegram.messenger.id.M0(2131748898, null), ia0Var.F);
            ca0Var2.G = ha0Var8;
            ha0Var8.setBackground(null);
            ha0Var8.setVisibility(mjVar.p ? 4 : 0);
            frameLayout3.addView(ha0Var8, c8.ha.o(-1, 48));
            ha0 ha0Var9 = new ha0(context, R.raw.media_shrink, org.telegram.messenger.id.M0(2131748885, null), R.raw.media_enlarge, org.telegram.messenger.id.M0(2131748884, null), ia0Var.F);
            ca0Var2.H = ha0Var9;
            ha0Var9.setBackground(null);
            ha0Var9.setVisibility(!mjVar.p ? 4 : 0);
            frameLayout3.setAlpha(mjVar.o ? 1.0f : 0.5f);
            frameLayout3.addView(ha0Var9, c8.ha.o(-1, 48));
            actionBarPopupWindow$ActionBarPopupWindowLayout4.a(frameLayout3, c8.ha.o(-1, 48));
            frameLayout3.setVisibility((!mjVar.n || mjVar.o) ? 0 : 8);
            ha0Var8.a(mjVar.q, false);
            ha0Var9.a(mjVar.q, false);
            View d1Var4 = new org.telegram.ui.ActionBar.d1(context, ea0Var);
            org.telegram.ui.ActionBar.t6.i(d1Var4, org.telegram.ui.ActionBar.t6.K(0.06f, org.telegram.ui.ActionBar.m6.E8), ea0Var);
            d1Var4.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout4.a(d1Var4, c8.ha.o(-1, 8));
            org.telegram.ui.ActionBar.z0 z0Var10 = new org.telegram.ui.ActionBar.z0(1, context, ia0Var.F, false, false);
            z0Var10.j(org.telegram.messenger.id.M0(2131754218, null), R.drawable.msg_select, null);
            final int i31 = 10;
            z0Var10.setOnClickListener(new View.OnClickListener(ca0Var2) { // from class: org.telegram.ui.Components.q90
                public final /* synthetic */ ca0 b;

                {
                    this.b = ca0Var2;
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
                    switch (i31) {
                        case 0:
                            ca0 ca0Var22 = this.b;
                            ca0Var22.c0.d.d = null;
                            ca0Var22.e.f(false);
                            ca0Var22.h(false, false);
                            ca0Var22.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            ca0 ca0Var3 = this.b;
                            w90 w90Var2 = ca0Var3.e;
                            ia0 ia0Var2 = ca0Var3.c0;
                            if (ca0Var3.c(null) != null) {
                                if (w90Var2.v - w90Var2.u <= org.telegram.messenger.qp.s1(ia0Var2.x).o4) {
                                    org.telegram.ui.Cells.q9 q9Var = w90Var2.W;
                                    org.telegram.messenger.ij c11 = ca0Var3.c(q9Var != null ? ((org.telegram.ui.Cells.q1) q9Var).getMessageObject() : null);
                                    org.telegram.messenger.mj mjVar5 = ia0Var2.d;
                                    int i162 = w90Var2.u;
                                    mjVar5.e = i162;
                                    int i172 = w90Var2.v;
                                    mjVar5.f = i172;
                                    mjVar5.d = org.telegram.ui.sm.b(i162, i172, c11);
                                    ia0Var2.b();
                                    ia0Var2.a(true);
                                    break;
                                } else {
                                    ca0Var3.g();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            ca0 ca0Var4 = this.b;
                            w90 w90Var3 = ca0Var4.e;
                            ia0 ia0Var3 = ca0Var4.c0;
                            org.telegram.messenger.mj mjVar6 = ia0Var3.d;
                            int i182 = ia0Var3.x;
                            boolean z132 = ia0Var3.b;
                            if (mjVar6.d != null && !z132) {
                                mjVar6.d = null;
                                w90Var3.f(false);
                                ca0Var4.h(false, true);
                                ca0Var4.l(true);
                                break;
                            } else if (w90Var3.v - w90Var3.u <= org.telegram.messenger.qp.s1(i182).o4) {
                                org.telegram.messenger.ij c12 = ca0Var4.c(null);
                                if (c12 != null) {
                                    if (!w90Var3.x()) {
                                        mjVar6.e = 0;
                                        int min = Math.min(org.telegram.messenger.qp.s1(i182).o4, org.telegram.ui.sm.d(c12));
                                        mjVar6.f = min;
                                        mjVar6.d = org.telegram.ui.sm.b(mjVar6.e, min, c12);
                                        View d = ca0Var4.d();
                                        if (d instanceof org.telegram.ui.Cells.q1) {
                                            w90Var3.a0((org.telegram.ui.Cells.q1) d, mjVar6.e, mjVar6.f);
                                        }
                                        if (!z132) {
                                            ca0Var4.s.getSwipeBack().e(ca0Var4.I);
                                        }
                                        ca0Var4.h(true, true);
                                        break;
                                    } else {
                                        mjVar6.e = w90Var3.u;
                                        mjVar6.f = w90Var3.v;
                                        org.telegram.ui.Cells.q9 q9Var2 = w90Var3.W;
                                        mjVar6.d = org.telegram.ui.sm.b(mjVar6.e, mjVar6.f, ca0Var4.c(q9Var2 != null ? ((org.telegram.ui.Cells.q1) q9Var2).getMessageObject() : null));
                                        ia0Var3.b();
                                        ia0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                ca0Var4.g();
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
                            ia0 ia0Var4 = this.b.c0;
                            if (!ia0Var4.b) {
                                org.telegram.ui.nk nkVar = (org.telegram.ui.nk) ia0Var4;
                                nkVar.a(true);
                                org.telegram.ui.cn cnVar = nkVar.H;
                                cnVar.D5 = null;
                                cnVar.B5 = null;
                                cnVar.v5.f(null, null, cnVar.j6, null);
                                cnVar.A8();
                                break;
                            } else {
                                org.telegram.ui.nk nkVar2 = (org.telegram.ui.nk) ia0Var4;
                                nkVar2.a(true);
                                org.telegram.ui.cn cnVar2 = nkVar2.H;
                                cnVar2.B5 = null;
                                cnVar2.hc(cnVar2.D5);
                                break;
                            }
                        case 7:
                            this.b.c0.c(true);
                            break;
                        case 8:
                            this.b.c0.a(true);
                            break;
                        case 9:
                            org.telegram.ui.nk nkVar3 = (org.telegram.ui.nk) this.b.c0;
                            nkVar3.a(true);
                            org.telegram.ui.cn cnVar3 = nkVar3.H;
                            cnVar3.v5.d(null, cnVar3.j6);
                            cnVar3.A8();
                            break;
                        case 10:
                            this.b.c0.a(true);
                            break;
                        case 11:
                            org.telegram.ui.nk nkVar4 = (org.telegram.ui.nk) this.b.c0;
                            nkVar4.a(true);
                            org.telegram.ui.cn cnVar4 = nkVar4.H;
                            cnVar4.W5 = null;
                            org.telegram.ui.sj sjVar = cnVar4.Z;
                            if (sjVar != null) {
                                sjVar.X2 = null;
                                sjVar.Y2 = false;
                            }
                            org.telegram.messenger.mj mjVar7 = cnVar4.v5;
                            if (mjVar7 != null) {
                                i152 = ((org.telegram.ui.ActionBar.f2) cnVar4).currentAccount;
                                org.telegram.messenger.ij ijVar = cnVar4.D5;
                                mjVar7.e(i152, null, null, ijVar == cnVar4.l4 ? null : ijVar, cnVar4.B5, cnVar4.F5);
                            }
                            cnVar4.A8();
                            break;
                        case 12:
                            ca0 ca0Var5 = this.b;
                            org.telegram.messenger.mj mjVar8 = ca0Var5.c0.d;
                            if (mjVar8.o) {
                                boolean z14 = !mjVar8.q;
                                mjVar8.q = z14;
                                ca0Var5.G.a(z14, true);
                                ca0Var5.H.a(mjVar8.q, true);
                                if (ca0Var5.r.e.size() > 0 && (message2 = ((org.telegram.messenger.ij) ca0Var5.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z15 = mjVar8.q;
                                    messageMedia2.force_small_media = z15;
                                    messageMedia2.force_large_media = !z15;
                                }
                                if (ca0Var5.r.f.size() > 0 && (message = ((org.telegram.messenger.ij) ca0Var5.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                    boolean z16 = mjVar8.q;
                                    messageMedia.force_small_media = z16;
                                    messageMedia.force_large_media = !z16;
                                }
                                ca0Var5.i();
                                ca0Var5.U = true;
                                break;
                            }
                            break;
                        default:
                            ca0 ca0Var6 = this.b;
                            org.telegram.messenger.mj mjVar9 = ca0Var6.c0.d;
                            boolean z17 = mjVar9.r;
                            mjVar9.r = !z17;
                            ca0Var6.E.a(z17, true);
                            if (ca0Var6.r.e.size() > 0 && (message4 = ((org.telegram.messenger.ij) ca0Var6.r.e.get(0)).k) != null) {
                                message4.invert_media = mjVar9.r;
                            }
                            if (ca0Var6.r.f.size() > 0 && (message3 = ((org.telegram.messenger.ij) ca0Var6.r.f.get(0)).k) != null) {
                                message3.invert_media = mjVar9.r;
                            }
                            ca0Var6.i();
                            ca0Var6.U = true;
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout4.a(z0Var10, c8.ha.o(-1, 48));
            org.telegram.ui.ActionBar.z0 z0Var11 = new org.telegram.ui.ActionBar.z0(1, context, ia0Var.F, false, true);
            context2 = context;
            z0Var11.j(org.telegram.messenger.id.M0(2131751361, null), R.drawable.msg_delete, null);
            int i32 = org.telegram.ui.ActionBar.m6.q7;
            int i33 = org.telegram.ui.ActionBar.m6.p7;
            z0Var11.c(i32, i33);
            final int i34 = 11;
            z0Var11.setOnClickListener(new View.OnClickListener(ca0Var2) { // from class: org.telegram.ui.Components.q90
                public final /* synthetic */ ca0 b;

                {
                    this.b = ca0Var2;
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
                    switch (i34) {
                        case 0:
                            ca0 ca0Var22 = this.b;
                            ca0Var22.c0.d.d = null;
                            ca0Var22.e.f(false);
                            ca0Var22.h(false, false);
                            ca0Var22.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            ca0 ca0Var3 = this.b;
                            w90 w90Var2 = ca0Var3.e;
                            ia0 ia0Var2 = ca0Var3.c0;
                            if (ca0Var3.c(null) != null) {
                                if (w90Var2.v - w90Var2.u <= org.telegram.messenger.qp.s1(ia0Var2.x).o4) {
                                    org.telegram.ui.Cells.q9 q9Var = w90Var2.W;
                                    org.telegram.messenger.ij c11 = ca0Var3.c(q9Var != null ? ((org.telegram.ui.Cells.q1) q9Var).getMessageObject() : null);
                                    org.telegram.messenger.mj mjVar5 = ia0Var2.d;
                                    int i162 = w90Var2.u;
                                    mjVar5.e = i162;
                                    int i172 = w90Var2.v;
                                    mjVar5.f = i172;
                                    mjVar5.d = org.telegram.ui.sm.b(i162, i172, c11);
                                    ia0Var2.b();
                                    ia0Var2.a(true);
                                    break;
                                } else {
                                    ca0Var3.g();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            ca0 ca0Var4 = this.b;
                            w90 w90Var3 = ca0Var4.e;
                            ia0 ia0Var3 = ca0Var4.c0;
                            org.telegram.messenger.mj mjVar6 = ia0Var3.d;
                            int i182 = ia0Var3.x;
                            boolean z132 = ia0Var3.b;
                            if (mjVar6.d != null && !z132) {
                                mjVar6.d = null;
                                w90Var3.f(false);
                                ca0Var4.h(false, true);
                                ca0Var4.l(true);
                                break;
                            } else if (w90Var3.v - w90Var3.u <= org.telegram.messenger.qp.s1(i182).o4) {
                                org.telegram.messenger.ij c12 = ca0Var4.c(null);
                                if (c12 != null) {
                                    if (!w90Var3.x()) {
                                        mjVar6.e = 0;
                                        int min = Math.min(org.telegram.messenger.qp.s1(i182).o4, org.telegram.ui.sm.d(c12));
                                        mjVar6.f = min;
                                        mjVar6.d = org.telegram.ui.sm.b(mjVar6.e, min, c12);
                                        View d = ca0Var4.d();
                                        if (d instanceof org.telegram.ui.Cells.q1) {
                                            w90Var3.a0((org.telegram.ui.Cells.q1) d, mjVar6.e, mjVar6.f);
                                        }
                                        if (!z132) {
                                            ca0Var4.s.getSwipeBack().e(ca0Var4.I);
                                        }
                                        ca0Var4.h(true, true);
                                        break;
                                    } else {
                                        mjVar6.e = w90Var3.u;
                                        mjVar6.f = w90Var3.v;
                                        org.telegram.ui.Cells.q9 q9Var2 = w90Var3.W;
                                        mjVar6.d = org.telegram.ui.sm.b(mjVar6.e, mjVar6.f, ca0Var4.c(q9Var2 != null ? ((org.telegram.ui.Cells.q1) q9Var2).getMessageObject() : null));
                                        ia0Var3.b();
                                        ia0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                ca0Var4.g();
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
                            ia0 ia0Var4 = this.b.c0;
                            if (!ia0Var4.b) {
                                org.telegram.ui.nk nkVar = (org.telegram.ui.nk) ia0Var4;
                                nkVar.a(true);
                                org.telegram.ui.cn cnVar = nkVar.H;
                                cnVar.D5 = null;
                                cnVar.B5 = null;
                                cnVar.v5.f(null, null, cnVar.j6, null);
                                cnVar.A8();
                                break;
                            } else {
                                org.telegram.ui.nk nkVar2 = (org.telegram.ui.nk) ia0Var4;
                                nkVar2.a(true);
                                org.telegram.ui.cn cnVar2 = nkVar2.H;
                                cnVar2.B5 = null;
                                cnVar2.hc(cnVar2.D5);
                                break;
                            }
                        case 7:
                            this.b.c0.c(true);
                            break;
                        case 8:
                            this.b.c0.a(true);
                            break;
                        case 9:
                            org.telegram.ui.nk nkVar3 = (org.telegram.ui.nk) this.b.c0;
                            nkVar3.a(true);
                            org.telegram.ui.cn cnVar3 = nkVar3.H;
                            cnVar3.v5.d(null, cnVar3.j6);
                            cnVar3.A8();
                            break;
                        case 10:
                            this.b.c0.a(true);
                            break;
                        case 11:
                            org.telegram.ui.nk nkVar4 = (org.telegram.ui.nk) this.b.c0;
                            nkVar4.a(true);
                            org.telegram.ui.cn cnVar4 = nkVar4.H;
                            cnVar4.W5 = null;
                            org.telegram.ui.sj sjVar = cnVar4.Z;
                            if (sjVar != null) {
                                sjVar.X2 = null;
                                sjVar.Y2 = false;
                            }
                            org.telegram.messenger.mj mjVar7 = cnVar4.v5;
                            if (mjVar7 != null) {
                                i152 = ((org.telegram.ui.ActionBar.f2) cnVar4).currentAccount;
                                org.telegram.messenger.ij ijVar = cnVar4.D5;
                                mjVar7.e(i152, null, null, ijVar == cnVar4.l4 ? null : ijVar, cnVar4.B5, cnVar4.F5);
                            }
                            cnVar4.A8();
                            break;
                        case 12:
                            ca0 ca0Var5 = this.b;
                            org.telegram.messenger.mj mjVar8 = ca0Var5.c0.d;
                            if (mjVar8.o) {
                                boolean z14 = !mjVar8.q;
                                mjVar8.q = z14;
                                ca0Var5.G.a(z14, true);
                                ca0Var5.H.a(mjVar8.q, true);
                                if (ca0Var5.r.e.size() > 0 && (message2 = ((org.telegram.messenger.ij) ca0Var5.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z15 = mjVar8.q;
                                    messageMedia2.force_small_media = z15;
                                    messageMedia2.force_large_media = !z15;
                                }
                                if (ca0Var5.r.f.size() > 0 && (message = ((org.telegram.messenger.ij) ca0Var5.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                    boolean z16 = mjVar8.q;
                                    messageMedia.force_small_media = z16;
                                    messageMedia.force_large_media = !z16;
                                }
                                ca0Var5.i();
                                ca0Var5.U = true;
                                break;
                            }
                            break;
                        default:
                            ca0 ca0Var6 = this.b;
                            org.telegram.messenger.mj mjVar9 = ca0Var6.c0.d;
                            boolean z17 = mjVar9.r;
                            mjVar9.r = !z17;
                            ca0Var6.E.a(z17, true);
                            if (ca0Var6.r.e.size() > 0 && (message4 = ((org.telegram.messenger.ij) ca0Var6.r.e.get(0)).k) != null) {
                                message4.invert_media = mjVar9.r;
                            }
                            if (ca0Var6.r.f.size() > 0 && (message3 = ((org.telegram.messenger.ij) ca0Var6.r.f.get(0)).k) != null) {
                                message3.invert_media = mjVar9.r;
                            }
                            ca0Var6.i();
                            ca0Var6.U = true;
                            break;
                    }
                }
            });
            z0Var11.h(0.12f, i33);
            actionBarPopupWindow$ActionBarPopupWindowLayout4.a(z0Var11, c8.ha.o(-1, 48));
            final int i35 = 12;
            frameLayout3.setOnClickListener(new View.OnClickListener(ca0Var2) { // from class: org.telegram.ui.Components.q90
                public final /* synthetic */ ca0 b;

                {
                    this.b = ca0Var2;
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
                    switch (i35) {
                        case 0:
                            ca0 ca0Var22 = this.b;
                            ca0Var22.c0.d.d = null;
                            ca0Var22.e.f(false);
                            ca0Var22.h(false, false);
                            ca0Var22.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            ca0 ca0Var3 = this.b;
                            w90 w90Var2 = ca0Var3.e;
                            ia0 ia0Var2 = ca0Var3.c0;
                            if (ca0Var3.c(null) != null) {
                                if (w90Var2.v - w90Var2.u <= org.telegram.messenger.qp.s1(ia0Var2.x).o4) {
                                    org.telegram.ui.Cells.q9 q9Var = w90Var2.W;
                                    org.telegram.messenger.ij c11 = ca0Var3.c(q9Var != null ? ((org.telegram.ui.Cells.q1) q9Var).getMessageObject() : null);
                                    org.telegram.messenger.mj mjVar5 = ia0Var2.d;
                                    int i162 = w90Var2.u;
                                    mjVar5.e = i162;
                                    int i172 = w90Var2.v;
                                    mjVar5.f = i172;
                                    mjVar5.d = org.telegram.ui.sm.b(i162, i172, c11);
                                    ia0Var2.b();
                                    ia0Var2.a(true);
                                    break;
                                } else {
                                    ca0Var3.g();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            ca0 ca0Var4 = this.b;
                            w90 w90Var3 = ca0Var4.e;
                            ia0 ia0Var3 = ca0Var4.c0;
                            org.telegram.messenger.mj mjVar6 = ia0Var3.d;
                            int i182 = ia0Var3.x;
                            boolean z132 = ia0Var3.b;
                            if (mjVar6.d != null && !z132) {
                                mjVar6.d = null;
                                w90Var3.f(false);
                                ca0Var4.h(false, true);
                                ca0Var4.l(true);
                                break;
                            } else if (w90Var3.v - w90Var3.u <= org.telegram.messenger.qp.s1(i182).o4) {
                                org.telegram.messenger.ij c12 = ca0Var4.c(null);
                                if (c12 != null) {
                                    if (!w90Var3.x()) {
                                        mjVar6.e = 0;
                                        int min = Math.min(org.telegram.messenger.qp.s1(i182).o4, org.telegram.ui.sm.d(c12));
                                        mjVar6.f = min;
                                        mjVar6.d = org.telegram.ui.sm.b(mjVar6.e, min, c12);
                                        View d = ca0Var4.d();
                                        if (d instanceof org.telegram.ui.Cells.q1) {
                                            w90Var3.a0((org.telegram.ui.Cells.q1) d, mjVar6.e, mjVar6.f);
                                        }
                                        if (!z132) {
                                            ca0Var4.s.getSwipeBack().e(ca0Var4.I);
                                        }
                                        ca0Var4.h(true, true);
                                        break;
                                    } else {
                                        mjVar6.e = w90Var3.u;
                                        mjVar6.f = w90Var3.v;
                                        org.telegram.ui.Cells.q9 q9Var2 = w90Var3.W;
                                        mjVar6.d = org.telegram.ui.sm.b(mjVar6.e, mjVar6.f, ca0Var4.c(q9Var2 != null ? ((org.telegram.ui.Cells.q1) q9Var2).getMessageObject() : null));
                                        ia0Var3.b();
                                        ia0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                ca0Var4.g();
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
                            ia0 ia0Var4 = this.b.c0;
                            if (!ia0Var4.b) {
                                org.telegram.ui.nk nkVar = (org.telegram.ui.nk) ia0Var4;
                                nkVar.a(true);
                                org.telegram.ui.cn cnVar = nkVar.H;
                                cnVar.D5 = null;
                                cnVar.B5 = null;
                                cnVar.v5.f(null, null, cnVar.j6, null);
                                cnVar.A8();
                                break;
                            } else {
                                org.telegram.ui.nk nkVar2 = (org.telegram.ui.nk) ia0Var4;
                                nkVar2.a(true);
                                org.telegram.ui.cn cnVar2 = nkVar2.H;
                                cnVar2.B5 = null;
                                cnVar2.hc(cnVar2.D5);
                                break;
                            }
                        case 7:
                            this.b.c0.c(true);
                            break;
                        case 8:
                            this.b.c0.a(true);
                            break;
                        case 9:
                            org.telegram.ui.nk nkVar3 = (org.telegram.ui.nk) this.b.c0;
                            nkVar3.a(true);
                            org.telegram.ui.cn cnVar3 = nkVar3.H;
                            cnVar3.v5.d(null, cnVar3.j6);
                            cnVar3.A8();
                            break;
                        case 10:
                            this.b.c0.a(true);
                            break;
                        case 11:
                            org.telegram.ui.nk nkVar4 = (org.telegram.ui.nk) this.b.c0;
                            nkVar4.a(true);
                            org.telegram.ui.cn cnVar4 = nkVar4.H;
                            cnVar4.W5 = null;
                            org.telegram.ui.sj sjVar = cnVar4.Z;
                            if (sjVar != null) {
                                sjVar.X2 = null;
                                sjVar.Y2 = false;
                            }
                            org.telegram.messenger.mj mjVar7 = cnVar4.v5;
                            if (mjVar7 != null) {
                                i152 = ((org.telegram.ui.ActionBar.f2) cnVar4).currentAccount;
                                org.telegram.messenger.ij ijVar = cnVar4.D5;
                                mjVar7.e(i152, null, null, ijVar == cnVar4.l4 ? null : ijVar, cnVar4.B5, cnVar4.F5);
                            }
                            cnVar4.A8();
                            break;
                        case 12:
                            ca0 ca0Var5 = this.b;
                            org.telegram.messenger.mj mjVar8 = ca0Var5.c0.d;
                            if (mjVar8.o) {
                                boolean z14 = !mjVar8.q;
                                mjVar8.q = z14;
                                ca0Var5.G.a(z14, true);
                                ca0Var5.H.a(mjVar8.q, true);
                                if (ca0Var5.r.e.size() > 0 && (message2 = ((org.telegram.messenger.ij) ca0Var5.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z15 = mjVar8.q;
                                    messageMedia2.force_small_media = z15;
                                    messageMedia2.force_large_media = !z15;
                                }
                                if (ca0Var5.r.f.size() > 0 && (message = ((org.telegram.messenger.ij) ca0Var5.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                    boolean z16 = mjVar8.q;
                                    messageMedia.force_small_media = z16;
                                    messageMedia.force_large_media = !z16;
                                }
                                ca0Var5.i();
                                ca0Var5.U = true;
                                break;
                            }
                            break;
                        default:
                            ca0 ca0Var6 = this.b;
                            org.telegram.messenger.mj mjVar9 = ca0Var6.c0.d;
                            boolean z17 = mjVar9.r;
                            mjVar9.r = !z17;
                            ca0Var6.E.a(z17, true);
                            if (ca0Var6.r.e.size() > 0 && (message4 = ((org.telegram.messenger.ij) ca0Var6.r.e.get(0)).k) != null) {
                                message4.invert_media = mjVar9.r;
                            }
                            if (ca0Var6.r.f.size() > 0 && (message3 = ((org.telegram.messenger.ij) ca0Var6.r.f.get(0)).k) != null) {
                                message3.invert_media = mjVar9.r;
                            }
                            ca0Var6.i();
                            ca0Var6.U = true;
                            break;
                    }
                }
            });
            final int i36 = 13;
            ha0Var7.setOnClickListener(new View.OnClickListener(ca0Var2) { // from class: org.telegram.ui.Components.q90
                public final /* synthetic */ ca0 b;

                {
                    this.b = ca0Var2;
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
                            ca0 ca0Var22 = this.b;
                            ca0Var22.c0.d.d = null;
                            ca0Var22.e.f(false);
                            ca0Var22.h(false, false);
                            ca0Var22.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            ca0 ca0Var3 = this.b;
                            w90 w90Var2 = ca0Var3.e;
                            ia0 ia0Var2 = ca0Var3.c0;
                            if (ca0Var3.c(null) != null) {
                                if (w90Var2.v - w90Var2.u <= org.telegram.messenger.qp.s1(ia0Var2.x).o4) {
                                    org.telegram.ui.Cells.q9 q9Var = w90Var2.W;
                                    org.telegram.messenger.ij c11 = ca0Var3.c(q9Var != null ? ((org.telegram.ui.Cells.q1) q9Var).getMessageObject() : null);
                                    org.telegram.messenger.mj mjVar5 = ia0Var2.d;
                                    int i162 = w90Var2.u;
                                    mjVar5.e = i162;
                                    int i172 = w90Var2.v;
                                    mjVar5.f = i172;
                                    mjVar5.d = org.telegram.ui.sm.b(i162, i172, c11);
                                    ia0Var2.b();
                                    ia0Var2.a(true);
                                    break;
                                } else {
                                    ca0Var3.g();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            ca0 ca0Var4 = this.b;
                            w90 w90Var3 = ca0Var4.e;
                            ia0 ia0Var3 = ca0Var4.c0;
                            org.telegram.messenger.mj mjVar6 = ia0Var3.d;
                            int i182 = ia0Var3.x;
                            boolean z132 = ia0Var3.b;
                            if (mjVar6.d != null && !z132) {
                                mjVar6.d = null;
                                w90Var3.f(false);
                                ca0Var4.h(false, true);
                                ca0Var4.l(true);
                                break;
                            } else if (w90Var3.v - w90Var3.u <= org.telegram.messenger.qp.s1(i182).o4) {
                                org.telegram.messenger.ij c12 = ca0Var4.c(null);
                                if (c12 != null) {
                                    if (!w90Var3.x()) {
                                        mjVar6.e = 0;
                                        int min = Math.min(org.telegram.messenger.qp.s1(i182).o4, org.telegram.ui.sm.d(c12));
                                        mjVar6.f = min;
                                        mjVar6.d = org.telegram.ui.sm.b(mjVar6.e, min, c12);
                                        View d = ca0Var4.d();
                                        if (d instanceof org.telegram.ui.Cells.q1) {
                                            w90Var3.a0((org.telegram.ui.Cells.q1) d, mjVar6.e, mjVar6.f);
                                        }
                                        if (!z132) {
                                            ca0Var4.s.getSwipeBack().e(ca0Var4.I);
                                        }
                                        ca0Var4.h(true, true);
                                        break;
                                    } else {
                                        mjVar6.e = w90Var3.u;
                                        mjVar6.f = w90Var3.v;
                                        org.telegram.ui.Cells.q9 q9Var2 = w90Var3.W;
                                        mjVar6.d = org.telegram.ui.sm.b(mjVar6.e, mjVar6.f, ca0Var4.c(q9Var2 != null ? ((org.telegram.ui.Cells.q1) q9Var2).getMessageObject() : null));
                                        ia0Var3.b();
                                        ia0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                ca0Var4.g();
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
                            ia0 ia0Var4 = this.b.c0;
                            if (!ia0Var4.b) {
                                org.telegram.ui.nk nkVar = (org.telegram.ui.nk) ia0Var4;
                                nkVar.a(true);
                                org.telegram.ui.cn cnVar = nkVar.H;
                                cnVar.D5 = null;
                                cnVar.B5 = null;
                                cnVar.v5.f(null, null, cnVar.j6, null);
                                cnVar.A8();
                                break;
                            } else {
                                org.telegram.ui.nk nkVar2 = (org.telegram.ui.nk) ia0Var4;
                                nkVar2.a(true);
                                org.telegram.ui.cn cnVar2 = nkVar2.H;
                                cnVar2.B5 = null;
                                cnVar2.hc(cnVar2.D5);
                                break;
                            }
                        case 7:
                            this.b.c0.c(true);
                            break;
                        case 8:
                            this.b.c0.a(true);
                            break;
                        case 9:
                            org.telegram.ui.nk nkVar3 = (org.telegram.ui.nk) this.b.c0;
                            nkVar3.a(true);
                            org.telegram.ui.cn cnVar3 = nkVar3.H;
                            cnVar3.v5.d(null, cnVar3.j6);
                            cnVar3.A8();
                            break;
                        case 10:
                            this.b.c0.a(true);
                            break;
                        case 11:
                            org.telegram.ui.nk nkVar4 = (org.telegram.ui.nk) this.b.c0;
                            nkVar4.a(true);
                            org.telegram.ui.cn cnVar4 = nkVar4.H;
                            cnVar4.W5 = null;
                            org.telegram.ui.sj sjVar = cnVar4.Z;
                            if (sjVar != null) {
                                sjVar.X2 = null;
                                sjVar.Y2 = false;
                            }
                            org.telegram.messenger.mj mjVar7 = cnVar4.v5;
                            if (mjVar7 != null) {
                                i152 = ((org.telegram.ui.ActionBar.f2) cnVar4).currentAccount;
                                org.telegram.messenger.ij ijVar = cnVar4.D5;
                                mjVar7.e(i152, null, null, ijVar == cnVar4.l4 ? null : ijVar, cnVar4.B5, cnVar4.F5);
                            }
                            cnVar4.A8();
                            break;
                        case 12:
                            ca0 ca0Var5 = this.b;
                            org.telegram.messenger.mj mjVar8 = ca0Var5.c0.d;
                            if (mjVar8.o) {
                                boolean z14 = !mjVar8.q;
                                mjVar8.q = z14;
                                ca0Var5.G.a(z14, true);
                                ca0Var5.H.a(mjVar8.q, true);
                                if (ca0Var5.r.e.size() > 0 && (message2 = ((org.telegram.messenger.ij) ca0Var5.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z15 = mjVar8.q;
                                    messageMedia2.force_small_media = z15;
                                    messageMedia2.force_large_media = !z15;
                                }
                                if (ca0Var5.r.f.size() > 0 && (message = ((org.telegram.messenger.ij) ca0Var5.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                    boolean z16 = mjVar8.q;
                                    messageMedia.force_small_media = z16;
                                    messageMedia.force_large_media = !z16;
                                }
                                ca0Var5.i();
                                ca0Var5.U = true;
                                break;
                            }
                            break;
                        default:
                            ca0 ca0Var6 = this.b;
                            org.telegram.messenger.mj mjVar9 = ca0Var6.c0.d;
                            boolean z17 = mjVar9.r;
                            mjVar9.r = !z17;
                            ca0Var6.E.a(z17, true);
                            if (ca0Var6.r.e.size() > 0 && (message4 = ((org.telegram.messenger.ij) ca0Var6.r.e.get(0)).k) != null) {
                                message4.invert_media = mjVar9.r;
                            }
                            if (ca0Var6.r.f.size() > 0 && (message3 = ((org.telegram.messenger.ij) ca0Var6.r.f.get(0)).k) != null) {
                                message3.invert_media = mjVar9.r;
                            }
                            ca0Var6.i();
                            ca0Var6.U = true;
                            break;
                    }
                }
            });
            ca0Var = ca0Var2;
            i10 = ca0Var.a;
            if (i10 == 1) {
            }
            n10 = ca0Var.e.n(context2);
            ca0Var.d = n10;
            n10.setElevation(org.telegram.messenger.g0.L(8.0f));
            n10.setOutlineProvider(viewOutlineProvider2);
            if (n10.getParent() instanceof ViewGroup) {
            }
            ca0Var.addView(n10, c8.ha.d(-1, -1.0f, 51, 0.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / org.telegram.messenger.g0.p, 0.0f, 0.0f));
            ca0Var.e.S(ca0Var.f);
        }
        context2 = context;
        ca0Var = this;
        viewOutlineProvider2 = viewOutlineProvider;
        i10 = ca0Var.a;
        if (i10 == 1) {
        }
        n10 = ca0Var.e.n(context2);
        ca0Var.d = n10;
        n10.setElevation(org.telegram.messenger.g0.L(8.0f));
        n10.setOutlineProvider(viewOutlineProvider2);
        if (n10.getParent() instanceof ViewGroup) {
        }
        ca0Var.addView(n10, c8.ha.d(-1, -1.0f, 51, 0.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / org.telegram.messenger.g0.p, 0.0f, 0.0f));
        ca0Var.e.S(ca0Var.f);
    }

    public static org.telegram.messenger.dj a(ca0 ca0Var, org.telegram.messenger.ij ijVar) {
        if (ijVar.c1() == 0) {
            return null;
        }
        org.telegram.messenger.dj djVar = (org.telegram.messenger.dj) ca0Var.r.d.get(ijVar.c1());
        if (djVar == null || (djVar.d.size() > 1 && djVar.d(ijVar) != null)) {
            return djVar;
        }
        return null;
    }

    public static void b(ca0 ca0Var, org.telegram.ui.Cells.q1 q1Var) {
        URLSpan uRLSpan;
        TLRPC.WebPage webPage;
        if (ca0Var.a == 2) {
            org.telegram.messenger.mj mjVar = ca0Var.c0.d;
            if (!mjVar.n && (uRLSpan = mjVar.w) != null && (webPage = mjVar.v) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                q1Var.q3(uRLSpan);
                return;
            }
        }
        q1Var.q3(null);
    }

    public final org.telegram.messenger.ij c(org.telegram.messenger.ij ijVar) {
        org.telegram.messenger.dj djVar;
        org.telegram.messenger.mj mjVar = this.c0.d;
        org.telegram.messenger.kj kjVar = mjVar.a;
        if (kjVar == null) {
            return null;
        }
        LongSparseArray longSparseArray = kjVar.d;
        if (longSparseArray == null || longSparseArray.size() <= 0 || (djVar = (org.telegram.messenger.dj) mjVar.a.d.valueAt(0)) == null) {
            return (org.telegram.messenger.ij) mjVar.a.e.get(0);
        }
        if (djVar.i) {
            if (ijVar != null) {
                return ijVar;
            }
            org.telegram.ui.sm smVar = mjVar.d;
            if (smVar != null) {
                return smVar.a;
            }
        }
        return djVar.h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        return r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View d() {
        org.telegram.messenger.ij c10 = c(null);
        if (c10 != null) {
            int i7 = 0;
            while (true) {
                bi.q1 q1Var = this.f;
                if (i7 >= q1Var.getChildCount()) {
                    break;
                }
                View childAt = q1Var.getChildAt(i7);
                org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) childAt;
                if (p4Var.getMessageObject() != null && (p4Var.getMessageObject() == c10 || p4Var.getMessageObject().e1() == c10.e1())) {
                    break;
                }
                i7++;
            }
        }
        return null;
    }

    public final boolean e(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.ij c10;
        if (q1Var == null || q1Var.getMessageObject() == null || (c10 = c(null)) == null) {
            return false;
        }
        return q1Var.getMessageObject() == c10 || q1Var.getMessageObject().e1() == c10.e1();
    }

    public final void f(float f10, int i7) {
        boolean z9 = this.c0.w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        p90 p90Var = this.c;
        org.telegram.ui.v8 v8Var = this.b;
        if (z9) {
            p90Var.setTranslationY(0.0f);
            v8Var.invalidateOutline();
            v8Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            p90Var.setTranslationY(i7);
            v8Var.invalidateOutline();
            v8Var.setTranslationY(f10);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((f10 + v8Var.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f));
        }
        float x10 = v8Var.getX();
        org.telegram.ui.Cells.u9 u9Var = this.d;
        u9Var.setTranslationX(x10);
        u9Var.setTranslationY(v8Var.getY());
    }

    public final void g() {
        ia0 ia0Var = this.c0;
        new gc(ia0Var, ia0Var.F).I(R.raw.error, org.telegram.messenger.id.M0(2131746437, null), org.telegram.messenger.id.M0(2131746436, null)).j();
    }

    public final void h(boolean z9, boolean z10) {
        if (this.c0.b) {
            z9 = false;
        }
        if (z10 && this.O == z9) {
            return;
        }
        this.O = z9;
        AnimatorSet animatorSet = this.P;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.P = null;
        }
        org.telegram.ui.ActionBar.z0 z0Var = this.D;
        org.telegram.ui.ActionBar.z0 z0Var2 = this.y;
        v90 v90Var = this.x;
        v90 v90Var2 = this.w;
        if (!z10) {
            if (v90Var2 != null) {
                v90Var2.setAlpha(!z9 ? 1.0f : 0.0f);
                v90Var2.setVisibility(!z9 ? 0 : 4);
            }
            if (v90Var != null) {
                v90Var.setAlpha(z9 ? 1.0f : 0.0f);
                v90Var.setVisibility(z9 ? 0 : 4);
            }
            if (z0Var2 != null) {
                z0Var2.setAlpha(!z9 ? 1.0f : 0.0f);
                z0Var2.setVisibility(!z9 ? 0 : 4);
            }
            if (z0Var != null) {
                z0Var.setAlpha(z9 ? 1.0f : 0.0f);
                z0Var.setVisibility(z9 ? 0 : 4);
                return;
            }
            return;
        }
        this.P = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        if (v90Var2 != null) {
            v90Var2.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(v90Var2, (Property<v90, Float>) property, !z9 ? 1.0f : 0.0f));
        }
        if (v90Var != null) {
            v90Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(v90Var, (Property<v90, Float>) property, z9 ? 1.0f : 0.0f));
        }
        if (z0Var2 != null) {
            z0Var2.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(z0Var2, (Property<org.telegram.ui.ActionBar.z0, Float>) property, !z9 ? 1.0f : 0.0f));
        }
        if (z0Var != null) {
            z0Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(z0Var, (Property<org.telegram.ui.ActionBar.z0, Float>) property, z9 ? 1.0f : 0.0f));
        }
        this.P.playTogether(arrayList);
        this.P.setDuration(360L);
        this.P.setInterpolator(wq.h);
        this.P.addListener(new s9(15, this, z9));
        this.P.start();
    }

    public final void i() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        ia0 ia0Var = this.c0;
        org.telegram.messenger.mj mjVar = ia0Var.d;
        y90 y90Var = this.h;
        if (y90Var.k()) {
            this.V = true;
            return;
        }
        for (int i7 = 0; i7 < this.r.f.size(); i7++) {
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) this.r.f.get(i7);
            ijVar.K1 = true;
            ijVar.f2 = ia0Var.a;
            if (mjVar.k) {
                ijVar.k.flags &= -5;
                ijVar.e2 = true;
            } else {
                ijVar.k.flags |= 4;
                ijVar.e2 = false;
            }
            if (this.a == 2) {
                TLRPC.WebPage webPage = mjVar.v;
                if (webPage != null && ((messageMedia = (message = ijVar.k).media) == null || messageMedia.webpage != webPage)) {
                    message.flags |= 512;
                    message.media = new TLRPC.TL_messageMediaWebPage();
                    TLRPC.MessageMedia messageMedia2 = ijVar.k.media;
                    messageMedia2.webpage = mjVar.v;
                    boolean z9 = mjVar.q;
                    messageMedia2.force_large_media = !z9;
                    messageMedia2.force_small_media = z9;
                    messageMedia2.manual = true;
                    ijVar.y = null;
                    ijVar.o0();
                    ijVar.n0 = null;
                    ijVar.o0 = null;
                    ijVar.l0 = null;
                    ijVar.m0 = null;
                    ijVar.r0(true);
                    ijVar.K(true);
                } else if (webPage == null) {
                    TLRPC.Message message2 = ijVar.k;
                    message2.flags &= -513;
                    message2.media = null;
                }
            }
            if (mjVar.l) {
                ijVar.z = null;
            } else {
                ijVar.k0();
            }
            if (ijVar.T3()) {
                org.telegram.messenger.lj ljVar = (org.telegram.messenger.lj) ijVar.k.media;
                ljVar.results.total_voters = mjVar.l ? 0 : ljVar.a;
            }
        }
        for (int i10 = 0; i10 < this.r.h.size(); i10++) {
            ((TLRPC.PollAnswerVoters) this.r.h.get(i10)).chosen = !mjVar.k;
        }
        for (int i11 = 0; i11 < this.r.d.size(); i11++) {
            y90Var.V((org.telegram.messenger.dj) this.r.d.valueAt(i11));
        }
        this.n.k(0, this.r.f.size());
    }

    public final void j() {
        int i7 = this.R;
        float f10 = this.S;
        ia0 ia0Var = this.c0;
        boolean z9 = ia0Var.w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        bi.q1 q1Var = this.f;
        if (z9) {
            this.S = 0.0f;
            this.R = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(org.telegram.messenger.g0.L(8.0f) + q1Var.getMeasuredWidth());
        } else {
            int measuredHeight = q1Var.getMeasuredHeight();
            int i10 = 0;
            for (int i11 = 0; i11 < q1Var.getChildCount(); i11++) {
                View childAt = q1Var.getChildAt(i11);
                if (RecyclerView.R(childAt) != -1) {
                    measuredHeight = Math.min(measuredHeight, childAt.getTop());
                    i10++;
                }
            }
            org.telegram.messenger.kj kjVar = this.r;
            if (kjVar == null || i10 == 0 || i10 > kjVar.f.size()) {
                this.R = 0;
            } else {
                int e10 = jg.g.e(4.0f, measuredHeight, 0);
                this.R = e10;
                this.R = Math.min(((q1Var.getMeasuredHeight() - this.R) + e10) - ((int) ((((org.telegram.messenger.g0.q.y - (Build.VERSION.SDK_INT >= 35 ? org.telegram.messenger.g0.n : 0)) * 0.8f) - this.W) - org.telegram.messenger.g0.L(8.0f))), this.R);
            }
            float A = com.google.android.recaptcha.internal.a.A(getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f), (this.b.getMeasuredHeight() - this.R) + (this.W - org.telegram.messenger.g0.L(8.0f)), 2.0f, org.telegram.messenger.g0.L(8.0f)) - this.R;
            this.S = A;
            if (A > org.telegram.messenger.g0.L(8.0f)) {
                this.S = org.telegram.messenger.g0.L(8.0f);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        }
        boolean z10 = this.K;
        if (z10 || (this.R == i7 && this.S == f10)) {
            if (z10) {
                float f11 = this.S;
                int i12 = this.R;
                this.T = i12;
                f(f11, i12);
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = ia0Var.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ia0Var.h = ofFloat;
        ofFloat.addUpdateListener(new gj(this, i7, f10, 1));
        ia0Var.h.setDuration(250L);
        ia0Var.h.setInterpolator(mi.l.V);
        ia0Var.h.addListener(new e60(this, 4));
        org.telegram.messenger.g0.i3(ia0Var.D, 50L);
        this.T = i7;
        f(f10, i7);
    }

    public final void k() {
        org.telegram.messenger.ij ijVar;
        ia0 ia0Var = this.c0;
        org.telegram.messenger.mj mjVar = ia0Var.d;
        if (this.a == 0) {
            w90 w90Var = this.e;
            if (w90Var.v - w90Var.u > org.telegram.messenger.qp.s1(ia0Var.x).o4) {
                return;
            }
            org.telegram.ui.Cells.q9 q9Var = w90Var.W;
            org.telegram.messenger.ij c10 = c(q9Var != null ? ((org.telegram.ui.Cells.q1) q9Var).getMessageObject() : null);
            if (mjVar.d != null && w90Var.x()) {
                mjVar.e = w90Var.u;
                mjVar.f = w90Var.v;
                if (c10 != null) {
                    org.telegram.ui.sm smVar = mjVar.d;
                    if (smVar.m || (ijVar = smVar.a) == null || ijVar.e1() != c10.e1()) {
                        mjVar.d = org.telegram.ui.sm.b(mjVar.e, mjVar.f, c10);
                        ia0Var.b();
                    }
                }
            }
            w90Var.f(false);
        }
    }

    public final void l(boolean z9) {
        ia0 ia0Var = this.c0;
        TLRPC.User user = ia0Var.n;
        org.telegram.messenger.mj mjVar = ia0Var.d;
        TLRPC.Chat chat = ia0Var.r;
        p90 p90Var = this.c;
        int i7 = this.a;
        if (i7 == 1) {
            org.telegram.messenger.kj kjVar = mjVar.b;
            p90Var.b(org.telegram.messenger.id.G(kjVar == null ? 0 : kjVar.g.size(), "PreviewForwardMessagesCount", new Object[0]), z9);
            p90Var.a(!mjVar.h ? mjVar.m ? user != null ? org.telegram.messenger.id.a0("ForwardPreviewSendersNameVisible", null, 2131750579, org.telegram.messenger.g5.m(0, user.first_name, user.last_name)) : (!org.telegram.messenger.t3.T(chat) || chat.megagroup) ? org.telegram.messenger.id.M0(2131750577, null) : org.telegram.messenger.id.M0(2131750578, null) : user != null ? org.telegram.messenger.id.a0("ForwardPreviewSendersNameVisible", null, 2131750579, org.telegram.messenger.g5.m(0, user.first_name, user.last_name)) : (!org.telegram.messenger.t3.T(chat) || chat.megagroup) ? org.telegram.messenger.id.M0(2131750580, null) : org.telegram.messenger.id.M0(2131750581, null) : !mjVar.k ? user != null ? org.telegram.messenger.id.a0("ForwardPreviewSendersNameVisible", null, 2131750579, org.telegram.messenger.g5.m(0, user.first_name, user.last_name)) : (!org.telegram.messenger.t3.T(chat) || chat.megagroup) ? org.telegram.messenger.id.M0(2131750577, null) : org.telegram.messenger.id.M0(2131750578, null) : user != null ? org.telegram.messenger.id.a0("ForwardPreviewSendersNameHidden", null, 2131750582, org.telegram.messenger.g5.m(0, user.first_name, user.last_name)) : (!org.telegram.messenger.t3.T(chat) || chat.megagroup) ? org.telegram.messenger.id.M0(2131750580, null) : org.telegram.messenger.id.M0(2131750581, null), z9);
        } else {
            if (i7 != 0) {
                if (i7 == 2) {
                    p90Var.b(org.telegram.messenger.id.M0(2131748548, null), z9);
                    p90Var.a(org.telegram.messenger.id.M0(2131748549, null), z9);
                    return;
                }
                return;
            }
            if (mjVar.d == null || !mjVar.a.j) {
                p90Var.b(org.telegram.messenger.id.M0(2131748545, null), z9);
                p90Var.a(mjVar.a.j ? org.telegram.messenger.id.M0(2131748546, null) : "", z9);
            } else {
                p90Var.b(org.telegram.messenger.id.M0(2131746880, null), z9);
                p90Var.a(org.telegram.messenger.id.M0(2131746879, null), z9);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a == 0) {
            org.telegram.messenger.g0.d0(this.f, new r2(this, 7));
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
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        j();
        this.K = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        boolean z9 = View.MeasureSpec.getSize(i7) > View.MeasureSpec.getSize(i10);
        ia0 ia0Var = this.c0;
        ia0Var.w = z9;
        this.W = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i7, makeMeasureSpec);
        int i11 = this.W;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.Q;
        this.W = Math.max(i11, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        boolean z10 = ia0Var.w;
        org.telegram.ui.v8 v8Var = this.b;
        if (z10) {
            v8Var.getLayoutParams().height = -1;
            ((ViewGroup.MarginLayoutParams) v8Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(8.0f);
            ((ViewGroup.MarginLayoutParams) v8Var.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(8.0f);
            v8Var.getLayoutParams().width = (int) Math.min(View.MeasureSpec.getSize(i7), Math.max(org.telegram.messenger.g0.L(340.0f), View.MeasureSpec.getSize(i7) * 0.6f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) v8Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) v8Var.getLayoutParams()).bottomMargin = 0;
            v8Var.getLayoutParams().height = (View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.L(6.0f)) - this.W;
            if (v8Var.getLayoutParams().height < View.MeasureSpec.getSize(i10) * 0.5f) {
                v8Var.getLayoutParams().height = (int) (View.MeasureSpec.getSize(i10) * 0.5f);
            }
            v8Var.getLayoutParams().width = -1;
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = View.MeasureSpec.getSize(i10) - v8Var.getLayoutParams().height;
        }
        int size = (View.MeasureSpec.getSize(i10) + View.MeasureSpec.getSize(i7)) << 16;
        if (this.a0 != size) {
            for (int i12 = 0; i12 < this.r.f.size(); i12++) {
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) this.r.f.get(i12);
                ijVar.b2 = ia0Var.w ? v8Var.getLayoutParams().width : View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(16.0f);
                ijVar.Q1 = false;
                ijVar.K1 = true;
                org.telegram.ui.x7 x7Var = this.n;
                if (x7Var != null) {
                    x7Var.f();
                }
            }
            this.K = true;
        }
        this.a0 = size;
        super.onMeasure(i7, i10);
    }
}
