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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class qa0 extends FrameLayout {
    public final org.telegram.ui.ActionBar.y0 E;
    public final va0 F;
    public final FrameLayout G;
    public final va0 H;
    public final va0 I;
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
    public final ea0 c;
    public boolean c0;
    public final org.telegram.ui.Cells.v9 d;
    public final /* synthetic */ wa0 d0;
    public final ka0 e;
    public final di.b1 f;
    public final ma0 h;
    public final org.telegram.ui.y7 n;
    public org.telegram.messenger.ij r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout s;
    public final ja0 w;
    public final ja0 x;
    public final org.telegram.ui.ActionBar.y0 y;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x06f5  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [android.graphics.drawable.Drawable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v8, types: [android.graphics.drawable.Drawable, java.lang.String, org.telegram.ui.ActionBar.p6] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qa0(wa0 wa0Var, Context context, int i7) {
        super(r4);
        org.telegram.messenger.kj kjVar;
        ViewOutlineProvider viewOutlineProvider;
        Context context2;
        qa0 qa0Var;
        boolean z10;
        va0 va0Var;
        va0 va0Var2;
        qa0 qa0Var2;
        int i10;
        org.telegram.ui.Cells.v9 n10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        org.telegram.messenger.kj kjVar2;
        ?? r13;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3;
        org.telegram.messenger.kj kjVar3;
        boolean z11;
        Object obj;
        int i11;
        Context context3 = context;
        this.d0 = wa0Var;
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
        setOnTouchListener(new qk(this, i13));
        org.telegram.ui.w8 w8Var = new org.telegram.ui.w8(1, context3, this);
        this.b = w8Var;
        sa0 sa0Var = wa0Var.G;
        boolean z12 = wa0Var.b;
        org.telegram.messenger.kj kjVar4 = wa0Var.d;
        Drawable c10 = ((org.telegram.ui.zm) sa0Var).c();
        if (((org.telegram.ui.zm) sa0Var).f == null) {
            int i14 = org.telegram.ui.ActionBar.m6.a;
        }
        w8Var.U(c10);
        w8Var.setOccupyStatusBar(false);
        w8Var.setOutlineProvider(new fh.a(this, i13));
        w8Var.setClipToOutline(true);
        w8Var.setElevation(org.telegram.messenger.g0.L(4.0f));
        ea0 ea0Var = new ea0(context3, sa0Var);
        this.c = ea0Var;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.s8, ea0Var, sa0Var);
        ka0 ka0Var = new ka0(this);
        this.e = ka0Var;
        ka0Var.D = new fi.b2(this, 2);
        di.b1 b1Var = new di.b1(this, context3, sa0Var, 21);
        this.f = b1Var;
        ma0 ma0Var = new ma0(this, b1Var, sa0Var);
        this.h = ma0Var;
        b1Var.setItemAnimator(ma0Var);
        b1Var.setOnScrollListener(new oa(this, 13));
        b1Var.setOnItemClickListener(new na0(this));
        org.telegram.ui.y7 y7Var = new org.telegram.ui.y7(this, i13);
        this.n = y7Var;
        b1Var.setAdapter(y7Var);
        b1Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        ia0 ia0Var = new ia0(this, i12);
        ia0Var.O = new bi.w2(this, 12);
        b1Var.setClipToPadding(false);
        b1Var.setLayoutManager(ia0Var);
        b1Var.i(new fi.k(8));
        w8Var.addView(b1Var);
        addView(w8Var, c8.ma.d(-1, 400.0f, 0, 8.0f, 0.0f, 8.0f, 0.0f));
        w8Var.addView(ea0Var, c8.ma.c(-2.0f, -1));
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 1, getContext(), sa0Var);
        this.s = actionBarPopupWindow$ActionBarPopupWindowLayout4;
        actionBarPopupWindow$ActionBarPopupWindowLayout4.getSwipeBack().setOnForegroundOpenFinished(new ha0(this, 1));
        fh.g c11 = wa0Var.H.c(actionBarPopupWindow$ActionBarPopupWindowLayout4, null, false);
        c11.p(c8.i0.l(sa0Var));
        c11.q(org.telegram.messenger.g0.L(8.0f));
        c11.R.e = true;
        c11.r(org.telegram.messenger.g0.L(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout4.setBackground(c11);
        addView(actionBarPopupWindow$ActionBarPopupWindowLayout4, c8.ma.c(-2.0f, -2));
        if (i7 == 0) {
            org.telegram.messenger.ij ijVar = kjVar4.a;
            boolean z13 = kjVar4.s;
            if (ijVar != null) {
                if (!ijVar.j || kjVar4.i) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                    kjVar2 = kjVar4;
                    r13 = 0;
                } else {
                    LinearLayout g10 = org.telegram.messenger.f3.g(context3, 1);
                    if (z12) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                        kjVar3 = kjVar4;
                        z11 = true;
                        obj = null;
                        i11 = 2131746234;
                    } else {
                        kjVar3 = kjVar4;
                        actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                        obj = null;
                        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, context3, wa0Var.G, true, false);
                        y0Var.j(org.telegram.messenger.hd.N0(2131753753, null), R.drawable.msg_arrow_back, null);
                        y0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fa0
                            public final /* synthetic */ qa0 b;

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
                                        qa0 qa0Var3 = this.b;
                                        qa0Var3.d0.d.d = null;
                                        qa0Var3.e.f(false);
                                        qa0Var3.h(false, false);
                                        qa0Var3.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        qa0 qa0Var4 = this.b;
                                        ka0 ka0Var2 = qa0Var4.e;
                                        wa0 wa0Var2 = qa0Var4.d0;
                                        if (qa0Var4.c(null) != null) {
                                            if (ka0Var2.v - ka0Var2.u <= org.telegram.messenger.np.u1(wa0Var2.x).r4) {
                                                org.telegram.ui.Cells.r9 r9Var = ka0Var2.W;
                                                org.telegram.messenger.gj c12 = qa0Var4.c(r9Var != null ? ((org.telegram.ui.Cells.r1) r9Var).getMessageObject() : null);
                                                org.telegram.messenger.kj kjVar5 = wa0Var2.d;
                                                int i16 = ka0Var2.u;
                                                kjVar5.e = i16;
                                                int i17 = ka0Var2.v;
                                                kjVar5.f = i17;
                                                kjVar5.d = org.telegram.ui.rm.b(i16, i17, c12);
                                                wa0Var2.b();
                                                wa0Var2.a(true);
                                                break;
                                            } else {
                                                qa0Var4.g();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        qa0 qa0Var5 = this.b;
                                        ka0 ka0Var3 = qa0Var5.e;
                                        wa0 wa0Var3 = qa0Var5.d0;
                                        org.telegram.messenger.kj kjVar6 = wa0Var3.d;
                                        int i18 = wa0Var3.x;
                                        boolean z14 = wa0Var3.b;
                                        if (kjVar6.d != null && !z14) {
                                            kjVar6.d = null;
                                            ka0Var3.f(false);
                                            qa0Var5.h(false, true);
                                            qa0Var5.l(true);
                                            break;
                                        } else if (ka0Var3.v - ka0Var3.u <= org.telegram.messenger.np.u1(i18).r4) {
                                            org.telegram.messenger.gj c13 = qa0Var5.c(null);
                                            if (c13 != null) {
                                                if (!ka0Var3.x()) {
                                                    kjVar6.e = 0;
                                                    int min = Math.min(org.telegram.messenger.np.u1(i18).r4, org.telegram.ui.rm.d(c13));
                                                    kjVar6.f = min;
                                                    kjVar6.d = org.telegram.ui.rm.b(kjVar6.e, min, c13);
                                                    View d = qa0Var5.d();
                                                    if (d instanceof org.telegram.ui.Cells.r1) {
                                                        ka0Var3.a0((org.telegram.ui.Cells.r1) d, kjVar6.e, kjVar6.f);
                                                    }
                                                    if (!z14) {
                                                        qa0Var5.s.getSwipeBack().e(qa0Var5.J);
                                                    }
                                                    qa0Var5.h(true, true);
                                                    break;
                                                } else {
                                                    kjVar6.e = ka0Var3.u;
                                                    kjVar6.f = ka0Var3.v;
                                                    org.telegram.ui.Cells.r9 r9Var2 = ka0Var3.W;
                                                    kjVar6.d = org.telegram.ui.rm.b(kjVar6.e, kjVar6.f, qa0Var5.c(r9Var2 != null ? ((org.telegram.ui.Cells.r1) r9Var2).getMessageObject() : null));
                                                    wa0Var3.b();
                                                    wa0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            qa0Var5.g();
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
                                        wa0 wa0Var4 = this.b.d0;
                                        if (!wa0Var4.b) {
                                            org.telegram.ui.mk mkVar = (org.telegram.ui.mk) wa0Var4;
                                            mkVar.a(true);
                                            org.telegram.ui.bn bnVar = mkVar.I;
                                            bnVar.F5 = null;
                                            bnVar.D5 = null;
                                            bnVar.x5.f(null, null, bnVar.l6, null);
                                            bnVar.B8();
                                            break;
                                        } else {
                                            org.telegram.ui.mk mkVar2 = (org.telegram.ui.mk) wa0Var4;
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
                                        org.telegram.messenger.kj kjVar7 = bnVar4.x5;
                                        if (kjVar7 != null) {
                                            i15 = ((org.telegram.ui.ActionBar.g2) bnVar4).currentAccount;
                                            org.telegram.messenger.gj gjVar = bnVar4.F5;
                                            kjVar7.e(i15, null, null, gjVar == bnVar4.m4 ? null : gjVar, bnVar4.D5, bnVar4.H5);
                                        }
                                        bnVar4.B8();
                                        break;
                                    case 12:
                                        qa0 qa0Var6 = this.b;
                                        org.telegram.messenger.kj kjVar8 = qa0Var6.d0.d;
                                        if (kjVar8.o) {
                                            boolean z15 = !kjVar8.q;
                                            kjVar8.q = z15;
                                            qa0Var6.H.a(z15, true);
                                            qa0Var6.I.a(kjVar8.q, true);
                                            if (qa0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.gj) qa0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z16 = kjVar8.q;
                                                messageMedia2.force_small_media = z16;
                                                messageMedia2.force_large_media = !z16;
                                            }
                                            if (qa0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.gj) qa0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                                boolean z17 = kjVar8.q;
                                                messageMedia.force_small_media = z17;
                                                messageMedia.force_large_media = !z17;
                                            }
                                            qa0Var6.i();
                                            qa0Var6.V = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        qa0 qa0Var7 = this.b;
                                        org.telegram.messenger.kj kjVar9 = qa0Var7.d0.d;
                                        boolean z18 = kjVar9.r;
                                        kjVar9.r = !z18;
                                        qa0Var7.F.a(z18, true);
                                        if (qa0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.gj) qa0Var7.r.e.get(0)).k) != null) {
                                            message4.invert_media = kjVar9.r;
                                        }
                                        if (qa0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.gj) qa0Var7.r.f.get(0)).k) != null) {
                                            message3.invert_media = kjVar9.r;
                                        }
                                        qa0Var7.i();
                                        qa0Var7.V = true;
                                        break;
                                }
                            }
                        });
                        g10.addView(y0Var, c8.ma.o(-1, 48));
                        org.telegram.ui.ActionBar.d1 d1Var = new org.telegram.ui.ActionBar.d1(context3, sa0Var);
                        org.telegram.ui.ActionBar.t6.i(d1Var, org.telegram.ui.ActionBar.t6.K(0.06f, org.telegram.ui.ActionBar.m6.E8), sa0Var);
                        d1Var.setTag(R.id.fit_width_tag, 1);
                        g10.addView(d1Var, c8.ma.o(-1, 8));
                        org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(0, context3, wa0Var.G, false, true);
                        i11 = 2131746234;
                        y0Var2.j(org.telegram.messenger.hd.N0(2131746234, null), R.drawable.menu_quote_specific, null);
                        z11 = true;
                        final boolean z14 = true ? 1 : 0;
                        y0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fa0
                            public final /* synthetic */ qa0 b;

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
                                        qa0 qa0Var3 = this.b;
                                        qa0Var3.d0.d.d = null;
                                        qa0Var3.e.f(false);
                                        qa0Var3.h(false, false);
                                        qa0Var3.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        qa0 qa0Var4 = this.b;
                                        ka0 ka0Var2 = qa0Var4.e;
                                        wa0 wa0Var2 = qa0Var4.d0;
                                        if (qa0Var4.c(null) != null) {
                                            if (ka0Var2.v - ka0Var2.u <= org.telegram.messenger.np.u1(wa0Var2.x).r4) {
                                                org.telegram.ui.Cells.r9 r9Var = ka0Var2.W;
                                                org.telegram.messenger.gj c12 = qa0Var4.c(r9Var != null ? ((org.telegram.ui.Cells.r1) r9Var).getMessageObject() : null);
                                                org.telegram.messenger.kj kjVar5 = wa0Var2.d;
                                                int i16 = ka0Var2.u;
                                                kjVar5.e = i16;
                                                int i17 = ka0Var2.v;
                                                kjVar5.f = i17;
                                                kjVar5.d = org.telegram.ui.rm.b(i16, i17, c12);
                                                wa0Var2.b();
                                                wa0Var2.a(true);
                                                break;
                                            } else {
                                                qa0Var4.g();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        qa0 qa0Var5 = this.b;
                                        ka0 ka0Var3 = qa0Var5.e;
                                        wa0 wa0Var3 = qa0Var5.d0;
                                        org.telegram.messenger.kj kjVar6 = wa0Var3.d;
                                        int i18 = wa0Var3.x;
                                        boolean z142 = wa0Var3.b;
                                        if (kjVar6.d != null && !z142) {
                                            kjVar6.d = null;
                                            ka0Var3.f(false);
                                            qa0Var5.h(false, true);
                                            qa0Var5.l(true);
                                            break;
                                        } else if (ka0Var3.v - ka0Var3.u <= org.telegram.messenger.np.u1(i18).r4) {
                                            org.telegram.messenger.gj c13 = qa0Var5.c(null);
                                            if (c13 != null) {
                                                if (!ka0Var3.x()) {
                                                    kjVar6.e = 0;
                                                    int min = Math.min(org.telegram.messenger.np.u1(i18).r4, org.telegram.ui.rm.d(c13));
                                                    kjVar6.f = min;
                                                    kjVar6.d = org.telegram.ui.rm.b(kjVar6.e, min, c13);
                                                    View d = qa0Var5.d();
                                                    if (d instanceof org.telegram.ui.Cells.r1) {
                                                        ka0Var3.a0((org.telegram.ui.Cells.r1) d, kjVar6.e, kjVar6.f);
                                                    }
                                                    if (!z142) {
                                                        qa0Var5.s.getSwipeBack().e(qa0Var5.J);
                                                    }
                                                    qa0Var5.h(true, true);
                                                    break;
                                                } else {
                                                    kjVar6.e = ka0Var3.u;
                                                    kjVar6.f = ka0Var3.v;
                                                    org.telegram.ui.Cells.r9 r9Var2 = ka0Var3.W;
                                                    kjVar6.d = org.telegram.ui.rm.b(kjVar6.e, kjVar6.f, qa0Var5.c(r9Var2 != null ? ((org.telegram.ui.Cells.r1) r9Var2).getMessageObject() : null));
                                                    wa0Var3.b();
                                                    wa0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            qa0Var5.g();
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
                                        wa0 wa0Var4 = this.b.d0;
                                        if (!wa0Var4.b) {
                                            org.telegram.ui.mk mkVar = (org.telegram.ui.mk) wa0Var4;
                                            mkVar.a(true);
                                            org.telegram.ui.bn bnVar = mkVar.I;
                                            bnVar.F5 = null;
                                            bnVar.D5 = null;
                                            bnVar.x5.f(null, null, bnVar.l6, null);
                                            bnVar.B8();
                                            break;
                                        } else {
                                            org.telegram.ui.mk mkVar2 = (org.telegram.ui.mk) wa0Var4;
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
                                        org.telegram.messenger.kj kjVar7 = bnVar4.x5;
                                        if (kjVar7 != null) {
                                            i15 = ((org.telegram.ui.ActionBar.g2) bnVar4).currentAccount;
                                            org.telegram.messenger.gj gjVar = bnVar4.F5;
                                            kjVar7.e(i15, null, null, gjVar == bnVar4.m4 ? null : gjVar, bnVar4.D5, bnVar4.H5);
                                        }
                                        bnVar4.B8();
                                        break;
                                    case 12:
                                        qa0 qa0Var6 = this.b;
                                        org.telegram.messenger.kj kjVar8 = qa0Var6.d0.d;
                                        if (kjVar8.o) {
                                            boolean z15 = !kjVar8.q;
                                            kjVar8.q = z15;
                                            qa0Var6.H.a(z15, true);
                                            qa0Var6.I.a(kjVar8.q, true);
                                            if (qa0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.gj) qa0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z16 = kjVar8.q;
                                                messageMedia2.force_small_media = z16;
                                                messageMedia2.force_large_media = !z16;
                                            }
                                            if (qa0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.gj) qa0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                                boolean z17 = kjVar8.q;
                                                messageMedia.force_small_media = z17;
                                                messageMedia.force_large_media = !z17;
                                            }
                                            qa0Var6.i();
                                            qa0Var6.V = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        qa0 qa0Var7 = this.b;
                                        org.telegram.messenger.kj kjVar9 = qa0Var7.d0.d;
                                        boolean z18 = kjVar9.r;
                                        kjVar9.r = !z18;
                                        qa0Var7.F.a(z18, true);
                                        if (qa0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.gj) qa0Var7.r.e.get(0)).k) != null) {
                                            message4.invert_media = kjVar9.r;
                                        }
                                        if (qa0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.gj) qa0Var7.r.f.get(0)).k) != null) {
                                            message3.invert_media = kjVar9.r;
                                        }
                                        qa0Var7.i();
                                        qa0Var7.V = true;
                                        break;
                                }
                            }
                        });
                        g10.addView(y0Var2, c8.ma.o(-1, 48));
                    }
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                    this.J = actionBarPopupWindow$ActionBarPopupWindowLayout5.b(g10);
                    actionBarPopupWindow$ActionBarPopupWindowLayout5.getSwipeBack().setStickToRight(z11);
                    FrameLayout frameLayout = new FrameLayout(context3);
                    int i15 = i11;
                    ?? r132 = obj;
                    kjVar2 = kjVar3;
                    ja0 ja0Var = new ja0(1, 0, context, wa0Var.G, true, false);
                    this.w = ja0Var;
                    ja0Var.j(org.telegram.messenger.hd.N0(z12 ? i15 : 2131745457, r132), R.drawable.menu_select_quote, r132);
                    ja0 ja0Var2 = new ja0(1, 1, context, wa0Var.G, true, false);
                    context3 = context;
                    this.x = ja0Var2;
                    ja0Var2.j(org.telegram.messenger.hd.N0(2131752060, r132), R.drawable.menu_quote_delete, r132);
                    int i16 = org.telegram.ui.ActionBar.m6.I5;
                    Drawable a02 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i16, sa0Var), 6, 0);
                    org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i16);
                    frameLayout.setBackground(a02);
                    org.telegram.ui.ActionBar.t6.j(frameLayout, a02, r132, M, sa0Var);
                    final int i17 = 2;
                    frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fa0
                        public final /* synthetic */ qa0 b;

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
                                    qa0 qa0Var3 = this.b;
                                    qa0Var3.d0.d.d = null;
                                    qa0Var3.e.f(false);
                                    qa0Var3.h(false, false);
                                    qa0Var3.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    qa0 qa0Var4 = this.b;
                                    ka0 ka0Var2 = qa0Var4.e;
                                    wa0 wa0Var2 = qa0Var4.d0;
                                    if (qa0Var4.c(null) != null) {
                                        if (ka0Var2.v - ka0Var2.u <= org.telegram.messenger.np.u1(wa0Var2.x).r4) {
                                            org.telegram.ui.Cells.r9 r9Var = ka0Var2.W;
                                            org.telegram.messenger.gj c12 = qa0Var4.c(r9Var != null ? ((org.telegram.ui.Cells.r1) r9Var).getMessageObject() : null);
                                            org.telegram.messenger.kj kjVar5 = wa0Var2.d;
                                            int i162 = ka0Var2.u;
                                            kjVar5.e = i162;
                                            int i172 = ka0Var2.v;
                                            kjVar5.f = i172;
                                            kjVar5.d = org.telegram.ui.rm.b(i162, i172, c12);
                                            wa0Var2.b();
                                            wa0Var2.a(true);
                                            break;
                                        } else {
                                            qa0Var4.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    qa0 qa0Var5 = this.b;
                                    ka0 ka0Var3 = qa0Var5.e;
                                    wa0 wa0Var3 = qa0Var5.d0;
                                    org.telegram.messenger.kj kjVar6 = wa0Var3.d;
                                    int i18 = wa0Var3.x;
                                    boolean z142 = wa0Var3.b;
                                    if (kjVar6.d != null && !z142) {
                                        kjVar6.d = null;
                                        ka0Var3.f(false);
                                        qa0Var5.h(false, true);
                                        qa0Var5.l(true);
                                        break;
                                    } else if (ka0Var3.v - ka0Var3.u <= org.telegram.messenger.np.u1(i18).r4) {
                                        org.telegram.messenger.gj c13 = qa0Var5.c(null);
                                        if (c13 != null) {
                                            if (!ka0Var3.x()) {
                                                kjVar6.e = 0;
                                                int min = Math.min(org.telegram.messenger.np.u1(i18).r4, org.telegram.ui.rm.d(c13));
                                                kjVar6.f = min;
                                                kjVar6.d = org.telegram.ui.rm.b(kjVar6.e, min, c13);
                                                View d = qa0Var5.d();
                                                if (d instanceof org.telegram.ui.Cells.r1) {
                                                    ka0Var3.a0((org.telegram.ui.Cells.r1) d, kjVar6.e, kjVar6.f);
                                                }
                                                if (!z142) {
                                                    qa0Var5.s.getSwipeBack().e(qa0Var5.J);
                                                }
                                                qa0Var5.h(true, true);
                                                break;
                                            } else {
                                                kjVar6.e = ka0Var3.u;
                                                kjVar6.f = ka0Var3.v;
                                                org.telegram.ui.Cells.r9 r9Var2 = ka0Var3.W;
                                                kjVar6.d = org.telegram.ui.rm.b(kjVar6.e, kjVar6.f, qa0Var5.c(r9Var2 != null ? ((org.telegram.ui.Cells.r1) r9Var2).getMessageObject() : null));
                                                wa0Var3.b();
                                                wa0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        qa0Var5.g();
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
                                    wa0 wa0Var4 = this.b.d0;
                                    if (!wa0Var4.b) {
                                        org.telegram.ui.mk mkVar = (org.telegram.ui.mk) wa0Var4;
                                        mkVar.a(true);
                                        org.telegram.ui.bn bnVar = mkVar.I;
                                        bnVar.F5 = null;
                                        bnVar.D5 = null;
                                        bnVar.x5.f(null, null, bnVar.l6, null);
                                        bnVar.B8();
                                        break;
                                    } else {
                                        org.telegram.ui.mk mkVar2 = (org.telegram.ui.mk) wa0Var4;
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
                                    org.telegram.messenger.kj kjVar7 = bnVar4.x5;
                                    if (kjVar7 != null) {
                                        i152 = ((org.telegram.ui.ActionBar.g2) bnVar4).currentAccount;
                                        org.telegram.messenger.gj gjVar = bnVar4.F5;
                                        kjVar7.e(i152, null, null, gjVar == bnVar4.m4 ? null : gjVar, bnVar4.D5, bnVar4.H5);
                                    }
                                    bnVar4.B8();
                                    break;
                                case 12:
                                    qa0 qa0Var6 = this.b;
                                    org.telegram.messenger.kj kjVar8 = qa0Var6.d0.d;
                                    if (kjVar8.o) {
                                        boolean z15 = !kjVar8.q;
                                        kjVar8.q = z15;
                                        qa0Var6.H.a(z15, true);
                                        qa0Var6.I.a(kjVar8.q, true);
                                        if (qa0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.gj) qa0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z16 = kjVar8.q;
                                            messageMedia2.force_small_media = z16;
                                            messageMedia2.force_large_media = !z16;
                                        }
                                        if (qa0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.gj) qa0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z17 = kjVar8.q;
                                            messageMedia.force_small_media = z17;
                                            messageMedia.force_large_media = !z17;
                                        }
                                        qa0Var6.i();
                                        qa0Var6.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    qa0 qa0Var7 = this.b;
                                    org.telegram.messenger.kj kjVar9 = qa0Var7.d0.d;
                                    boolean z18 = kjVar9.r;
                                    kjVar9.r = !z18;
                                    qa0Var7.F.a(z18, true);
                                    if (qa0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.gj) qa0Var7.r.e.get(0)).k) != null) {
                                        message4.invert_media = kjVar9.r;
                                    }
                                    if (qa0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.gj) qa0Var7.r.f.get(0)).k) != null) {
                                        message3.invert_media = kjVar9.r;
                                    }
                                    qa0Var7.i();
                                    qa0Var7.V = true;
                                    break;
                            }
                        }
                    });
                    frameLayout.addView(ja0Var, c8.ma.c(48.0f, -1));
                    frameLayout.addView(ja0Var2, c8.ma.c(48.0f, -1));
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout5;
                    actionBarPopupWindow$ActionBarPopupWindowLayout6.a(frameLayout, c8.ma.o(-1, 48));
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout6;
                    r13 = r132;
                }
                kjVar = kjVar2;
                if (kjVar.t || z13 || kjVar.u) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                } else {
                    FrameLayout frameLayout2 = new FrameLayout(context3);
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    org.telegram.ui.ActionBar.y0 y0Var3 = new org.telegram.ui.ActionBar.y0(1, context3, wa0Var.G, false, false);
                    this.y = y0Var3;
                    y0Var3.j(org.telegram.messenger.hd.N0(2131746057, r13), R.drawable.msg_forward_replace, r13);
                    final int i18 = 3;
                    y0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fa0
                        public final /* synthetic */ qa0 b;

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
                                    qa0 qa0Var3 = this.b;
                                    qa0Var3.d0.d.d = null;
                                    qa0Var3.e.f(false);
                                    qa0Var3.h(false, false);
                                    qa0Var3.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    qa0 qa0Var4 = this.b;
                                    ka0 ka0Var2 = qa0Var4.e;
                                    wa0 wa0Var2 = qa0Var4.d0;
                                    if (qa0Var4.c(null) != null) {
                                        if (ka0Var2.v - ka0Var2.u <= org.telegram.messenger.np.u1(wa0Var2.x).r4) {
                                            org.telegram.ui.Cells.r9 r9Var = ka0Var2.W;
                                            org.telegram.messenger.gj c12 = qa0Var4.c(r9Var != null ? ((org.telegram.ui.Cells.r1) r9Var).getMessageObject() : null);
                                            org.telegram.messenger.kj kjVar5 = wa0Var2.d;
                                            int i162 = ka0Var2.u;
                                            kjVar5.e = i162;
                                            int i172 = ka0Var2.v;
                                            kjVar5.f = i172;
                                            kjVar5.d = org.telegram.ui.rm.b(i162, i172, c12);
                                            wa0Var2.b();
                                            wa0Var2.a(true);
                                            break;
                                        } else {
                                            qa0Var4.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    qa0 qa0Var5 = this.b;
                                    ka0 ka0Var3 = qa0Var5.e;
                                    wa0 wa0Var3 = qa0Var5.d0;
                                    org.telegram.messenger.kj kjVar6 = wa0Var3.d;
                                    int i182 = wa0Var3.x;
                                    boolean z142 = wa0Var3.b;
                                    if (kjVar6.d != null && !z142) {
                                        kjVar6.d = null;
                                        ka0Var3.f(false);
                                        qa0Var5.h(false, true);
                                        qa0Var5.l(true);
                                        break;
                                    } else if (ka0Var3.v - ka0Var3.u <= org.telegram.messenger.np.u1(i182).r4) {
                                        org.telegram.messenger.gj c13 = qa0Var5.c(null);
                                        if (c13 != null) {
                                            if (!ka0Var3.x()) {
                                                kjVar6.e = 0;
                                                int min = Math.min(org.telegram.messenger.np.u1(i182).r4, org.telegram.ui.rm.d(c13));
                                                kjVar6.f = min;
                                                kjVar6.d = org.telegram.ui.rm.b(kjVar6.e, min, c13);
                                                View d = qa0Var5.d();
                                                if (d instanceof org.telegram.ui.Cells.r1) {
                                                    ka0Var3.a0((org.telegram.ui.Cells.r1) d, kjVar6.e, kjVar6.f);
                                                }
                                                if (!z142) {
                                                    qa0Var5.s.getSwipeBack().e(qa0Var5.J);
                                                }
                                                qa0Var5.h(true, true);
                                                break;
                                            } else {
                                                kjVar6.e = ka0Var3.u;
                                                kjVar6.f = ka0Var3.v;
                                                org.telegram.ui.Cells.r9 r9Var2 = ka0Var3.W;
                                                kjVar6.d = org.telegram.ui.rm.b(kjVar6.e, kjVar6.f, qa0Var5.c(r9Var2 != null ? ((org.telegram.ui.Cells.r1) r9Var2).getMessageObject() : null));
                                                wa0Var3.b();
                                                wa0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        qa0Var5.g();
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
                                    wa0 wa0Var4 = this.b.d0;
                                    if (!wa0Var4.b) {
                                        org.telegram.ui.mk mkVar = (org.telegram.ui.mk) wa0Var4;
                                        mkVar.a(true);
                                        org.telegram.ui.bn bnVar = mkVar.I;
                                        bnVar.F5 = null;
                                        bnVar.D5 = null;
                                        bnVar.x5.f(null, null, bnVar.l6, null);
                                        bnVar.B8();
                                        break;
                                    } else {
                                        org.telegram.ui.mk mkVar2 = (org.telegram.ui.mk) wa0Var4;
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
                                    org.telegram.messenger.kj kjVar7 = bnVar4.x5;
                                    if (kjVar7 != null) {
                                        i152 = ((org.telegram.ui.ActionBar.g2) bnVar4).currentAccount;
                                        org.telegram.messenger.gj gjVar = bnVar4.F5;
                                        kjVar7.e(i152, null, null, gjVar == bnVar4.m4 ? null : gjVar, bnVar4.D5, bnVar4.H5);
                                    }
                                    bnVar4.B8();
                                    break;
                                case 12:
                                    qa0 qa0Var6 = this.b;
                                    org.telegram.messenger.kj kjVar8 = qa0Var6.d0.d;
                                    if (kjVar8.o) {
                                        boolean z15 = !kjVar8.q;
                                        kjVar8.q = z15;
                                        qa0Var6.H.a(z15, true);
                                        qa0Var6.I.a(kjVar8.q, true);
                                        if (qa0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.gj) qa0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z16 = kjVar8.q;
                                            messageMedia2.force_small_media = z16;
                                            messageMedia2.force_large_media = !z16;
                                        }
                                        if (qa0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.gj) qa0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z17 = kjVar8.q;
                                            messageMedia.force_small_media = z17;
                                            messageMedia.force_large_media = !z17;
                                        }
                                        qa0Var6.i();
                                        qa0Var6.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    qa0 qa0Var7 = this.b;
                                    org.telegram.messenger.kj kjVar9 = qa0Var7.d0.d;
                                    boolean z18 = kjVar9.r;
                                    kjVar9.r = !z18;
                                    qa0Var7.F.a(z18, true);
                                    if (qa0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.gj) qa0Var7.r.e.get(0)).k) != null) {
                                        message4.invert_media = kjVar9.r;
                                    }
                                    if (qa0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.gj) qa0Var7.r.f.get(0)).k) != null) {
                                        message3.invert_media = kjVar9.r;
                                    }
                                    qa0Var7.i();
                                    qa0Var7.V = true;
                                    break;
                            }
                        }
                    });
                    context3 = context;
                    org.telegram.ui.ActionBar.y0 y0Var4 = new org.telegram.ui.ActionBar.y0(1, context3, wa0Var.G, false, false);
                    this.E = y0Var4;
                    y0Var4.j(org.telegram.messenger.hd.N0(2131746232, r13), R.drawable.msg_forward_replace, r13);
                    final int i19 = 4;
                    y0Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fa0
                        public final /* synthetic */ qa0 b;

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
                                    qa0 qa0Var3 = this.b;
                                    qa0Var3.d0.d.d = null;
                                    qa0Var3.e.f(false);
                                    qa0Var3.h(false, false);
                                    qa0Var3.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    qa0 qa0Var4 = this.b;
                                    ka0 ka0Var2 = qa0Var4.e;
                                    wa0 wa0Var2 = qa0Var4.d0;
                                    if (qa0Var4.c(null) != null) {
                                        if (ka0Var2.v - ka0Var2.u <= org.telegram.messenger.np.u1(wa0Var2.x).r4) {
                                            org.telegram.ui.Cells.r9 r9Var = ka0Var2.W;
                                            org.telegram.messenger.gj c12 = qa0Var4.c(r9Var != null ? ((org.telegram.ui.Cells.r1) r9Var).getMessageObject() : null);
                                            org.telegram.messenger.kj kjVar5 = wa0Var2.d;
                                            int i162 = ka0Var2.u;
                                            kjVar5.e = i162;
                                            int i172 = ka0Var2.v;
                                            kjVar5.f = i172;
                                            kjVar5.d = org.telegram.ui.rm.b(i162, i172, c12);
                                            wa0Var2.b();
                                            wa0Var2.a(true);
                                            break;
                                        } else {
                                            qa0Var4.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    qa0 qa0Var5 = this.b;
                                    ka0 ka0Var3 = qa0Var5.e;
                                    wa0 wa0Var3 = qa0Var5.d0;
                                    org.telegram.messenger.kj kjVar6 = wa0Var3.d;
                                    int i182 = wa0Var3.x;
                                    boolean z142 = wa0Var3.b;
                                    if (kjVar6.d != null && !z142) {
                                        kjVar6.d = null;
                                        ka0Var3.f(false);
                                        qa0Var5.h(false, true);
                                        qa0Var5.l(true);
                                        break;
                                    } else if (ka0Var3.v - ka0Var3.u <= org.telegram.messenger.np.u1(i182).r4) {
                                        org.telegram.messenger.gj c13 = qa0Var5.c(null);
                                        if (c13 != null) {
                                            if (!ka0Var3.x()) {
                                                kjVar6.e = 0;
                                                int min = Math.min(org.telegram.messenger.np.u1(i182).r4, org.telegram.ui.rm.d(c13));
                                                kjVar6.f = min;
                                                kjVar6.d = org.telegram.ui.rm.b(kjVar6.e, min, c13);
                                                View d = qa0Var5.d();
                                                if (d instanceof org.telegram.ui.Cells.r1) {
                                                    ka0Var3.a0((org.telegram.ui.Cells.r1) d, kjVar6.e, kjVar6.f);
                                                }
                                                if (!z142) {
                                                    qa0Var5.s.getSwipeBack().e(qa0Var5.J);
                                                }
                                                qa0Var5.h(true, true);
                                                break;
                                            } else {
                                                kjVar6.e = ka0Var3.u;
                                                kjVar6.f = ka0Var3.v;
                                                org.telegram.ui.Cells.r9 r9Var2 = ka0Var3.W;
                                                kjVar6.d = org.telegram.ui.rm.b(kjVar6.e, kjVar6.f, qa0Var5.c(r9Var2 != null ? ((org.telegram.ui.Cells.r1) r9Var2).getMessageObject() : null));
                                                wa0Var3.b();
                                                wa0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        qa0Var5.g();
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
                                    wa0 wa0Var4 = this.b.d0;
                                    if (!wa0Var4.b) {
                                        org.telegram.ui.mk mkVar = (org.telegram.ui.mk) wa0Var4;
                                        mkVar.a(true);
                                        org.telegram.ui.bn bnVar = mkVar.I;
                                        bnVar.F5 = null;
                                        bnVar.D5 = null;
                                        bnVar.x5.f(null, null, bnVar.l6, null);
                                        bnVar.B8();
                                        break;
                                    } else {
                                        org.telegram.ui.mk mkVar2 = (org.telegram.ui.mk) wa0Var4;
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
                                    org.telegram.messenger.kj kjVar7 = bnVar4.x5;
                                    if (kjVar7 != null) {
                                        i152 = ((org.telegram.ui.ActionBar.g2) bnVar4).currentAccount;
                                        org.telegram.messenger.gj gjVar = bnVar4.F5;
                                        kjVar7.e(i152, null, null, gjVar == bnVar4.m4 ? null : gjVar, bnVar4.D5, bnVar4.H5);
                                    }
                                    bnVar4.B8();
                                    break;
                                case 12:
                                    qa0 qa0Var6 = this.b;
                                    org.telegram.messenger.kj kjVar8 = qa0Var6.d0.d;
                                    if (kjVar8.o) {
                                        boolean z15 = !kjVar8.q;
                                        kjVar8.q = z15;
                                        qa0Var6.H.a(z15, true);
                                        qa0Var6.I.a(kjVar8.q, true);
                                        if (qa0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.gj) qa0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z16 = kjVar8.q;
                                            messageMedia2.force_small_media = z16;
                                            messageMedia2.force_large_media = !z16;
                                        }
                                        if (qa0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.gj) qa0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z17 = kjVar8.q;
                                            messageMedia.force_small_media = z17;
                                            messageMedia.force_large_media = !z17;
                                        }
                                        qa0Var6.i();
                                        qa0Var6.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    qa0 qa0Var7 = this.b;
                                    org.telegram.messenger.kj kjVar9 = qa0Var7.d0.d;
                                    boolean z18 = kjVar9.r;
                                    kjVar9.r = !z18;
                                    qa0Var7.F.a(z18, true);
                                    if (qa0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.gj) qa0Var7.r.e.get(0)).k) != null) {
                                        message4.invert_media = kjVar9.r;
                                    }
                                    if (qa0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.gj) qa0Var7.r.f.get(0)).k) != null) {
                                        message3.invert_media = kjVar9.r;
                                    }
                                    qa0Var7.i();
                                    qa0Var7.V = true;
                                    break;
                            }
                        }
                    });
                    frameLayout2.addView(y0Var4, c8.ma.c(48.0f, -1));
                    frameLayout2.addView(y0Var3, c8.ma.c(48.0f, -1));
                    actionBarPopupWindow$ActionBarPopupWindowLayout7.a(frameLayout2, c8.ma.o(-1, 48));
                    actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout7;
                }
                if (!z13 && !kjVar.u) {
                    View d1Var2 = new org.telegram.ui.ActionBar.d1(context3, sa0Var);
                    org.telegram.ui.ActionBar.t6.i(d1Var2, org.telegram.ui.ActionBar.t6.K(0.06f, org.telegram.ui.ActionBar.m6.E8), sa0Var);
                    d1Var2.setTag(R.id.fit_width_tag, 1);
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.a(d1Var2, c8.ma.o(-1, 8));
                }
                h(kjVar.d != null, false);
                org.telegram.ui.ActionBar.y0 y0Var5 = new org.telegram.ui.ActionBar.y0(1, context3, wa0Var.G, false, false);
                y0Var5.j(org.telegram.messenger.hd.N0(2131754215, r13), R.drawable.msg_select, r13);
                final int i20 = 5;
                y0Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fa0
                    public final /* synthetic */ qa0 b;

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
                                qa0 qa0Var3 = this.b;
                                qa0Var3.d0.d.d = null;
                                qa0Var3.e.f(false);
                                qa0Var3.h(false, false);
                                qa0Var3.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                qa0 qa0Var4 = this.b;
                                ka0 ka0Var2 = qa0Var4.e;
                                wa0 wa0Var2 = qa0Var4.d0;
                                if (qa0Var4.c(null) != null) {
                                    if (ka0Var2.v - ka0Var2.u <= org.telegram.messenger.np.u1(wa0Var2.x).r4) {
                                        org.telegram.ui.Cells.r9 r9Var = ka0Var2.W;
                                        org.telegram.messenger.gj c12 = qa0Var4.c(r9Var != null ? ((org.telegram.ui.Cells.r1) r9Var).getMessageObject() : null);
                                        org.telegram.messenger.kj kjVar5 = wa0Var2.d;
                                        int i162 = ka0Var2.u;
                                        kjVar5.e = i162;
                                        int i172 = ka0Var2.v;
                                        kjVar5.f = i172;
                                        kjVar5.d = org.telegram.ui.rm.b(i162, i172, c12);
                                        wa0Var2.b();
                                        wa0Var2.a(true);
                                        break;
                                    } else {
                                        qa0Var4.g();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                qa0 qa0Var5 = this.b;
                                ka0 ka0Var3 = qa0Var5.e;
                                wa0 wa0Var3 = qa0Var5.d0;
                                org.telegram.messenger.kj kjVar6 = wa0Var3.d;
                                int i182 = wa0Var3.x;
                                boolean z142 = wa0Var3.b;
                                if (kjVar6.d != null && !z142) {
                                    kjVar6.d = null;
                                    ka0Var3.f(false);
                                    qa0Var5.h(false, true);
                                    qa0Var5.l(true);
                                    break;
                                } else if (ka0Var3.v - ka0Var3.u <= org.telegram.messenger.np.u1(i182).r4) {
                                    org.telegram.messenger.gj c13 = qa0Var5.c(null);
                                    if (c13 != null) {
                                        if (!ka0Var3.x()) {
                                            kjVar6.e = 0;
                                            int min = Math.min(org.telegram.messenger.np.u1(i182).r4, org.telegram.ui.rm.d(c13));
                                            kjVar6.f = min;
                                            kjVar6.d = org.telegram.ui.rm.b(kjVar6.e, min, c13);
                                            View d = qa0Var5.d();
                                            if (d instanceof org.telegram.ui.Cells.r1) {
                                                ka0Var3.a0((org.telegram.ui.Cells.r1) d, kjVar6.e, kjVar6.f);
                                            }
                                            if (!z142) {
                                                qa0Var5.s.getSwipeBack().e(qa0Var5.J);
                                            }
                                            qa0Var5.h(true, true);
                                            break;
                                        } else {
                                            kjVar6.e = ka0Var3.u;
                                            kjVar6.f = ka0Var3.v;
                                            org.telegram.ui.Cells.r9 r9Var2 = ka0Var3.W;
                                            kjVar6.d = org.telegram.ui.rm.b(kjVar6.e, kjVar6.f, qa0Var5.c(r9Var2 != null ? ((org.telegram.ui.Cells.r1) r9Var2).getMessageObject() : null));
                                            wa0Var3.b();
                                            wa0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    qa0Var5.g();
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
                                wa0 wa0Var4 = this.b.d0;
                                if (!wa0Var4.b) {
                                    org.telegram.ui.mk mkVar = (org.telegram.ui.mk) wa0Var4;
                                    mkVar.a(true);
                                    org.telegram.ui.bn bnVar = mkVar.I;
                                    bnVar.F5 = null;
                                    bnVar.D5 = null;
                                    bnVar.x5.f(null, null, bnVar.l6, null);
                                    bnVar.B8();
                                    break;
                                } else {
                                    org.telegram.ui.mk mkVar2 = (org.telegram.ui.mk) wa0Var4;
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
                                org.telegram.messenger.kj kjVar7 = bnVar4.x5;
                                if (kjVar7 != null) {
                                    i152 = ((org.telegram.ui.ActionBar.g2) bnVar4).currentAccount;
                                    org.telegram.messenger.gj gjVar = bnVar4.F5;
                                    kjVar7.e(i152, null, null, gjVar == bnVar4.m4 ? null : gjVar, bnVar4.D5, bnVar4.H5);
                                }
                                bnVar4.B8();
                                break;
                            case 12:
                                qa0 qa0Var6 = this.b;
                                org.telegram.messenger.kj kjVar8 = qa0Var6.d0.d;
                                if (kjVar8.o) {
                                    boolean z15 = !kjVar8.q;
                                    kjVar8.q = z15;
                                    qa0Var6.H.a(z15, true);
                                    qa0Var6.I.a(kjVar8.q, true);
                                    if (qa0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.gj) qa0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z16 = kjVar8.q;
                                        messageMedia2.force_small_media = z16;
                                        messageMedia2.force_large_media = !z16;
                                    }
                                    if (qa0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.gj) qa0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                        boolean z17 = kjVar8.q;
                                        messageMedia.force_small_media = z17;
                                        messageMedia.force_large_media = !z17;
                                    }
                                    qa0Var6.i();
                                    qa0Var6.V = true;
                                    break;
                                }
                                break;
                            default:
                                qa0 qa0Var7 = this.b;
                                org.telegram.messenger.kj kjVar9 = qa0Var7.d0.d;
                                boolean z18 = kjVar9.r;
                                kjVar9.r = !z18;
                                qa0Var7.F.a(z18, true);
                                if (qa0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.gj) qa0Var7.r.e.get(0)).k) != null) {
                                    message4.invert_media = kjVar9.r;
                                }
                                if (qa0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.gj) qa0Var7.r.f.get(0)).k) != null) {
                                    message3.invert_media = kjVar9.r;
                                }
                                qa0Var7.i();
                                qa0Var7.V = true;
                                break;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(y0Var5, c8.ma.o(-1, 48));
                org.telegram.ui.ActionBar.y0 y0Var6 = new org.telegram.ui.ActionBar.y0(1, context, wa0Var.G, false, true);
                y0Var6.j(org.telegram.messenger.hd.N0(z12 ? 2131751348 : 2131751347, r13), R.drawable.msg_delete, r13);
                int i21 = org.telegram.ui.ActionBar.m6.q7;
                int i22 = org.telegram.ui.ActionBar.m6.p7;
                y0Var6.c(i21, i22);
                y0Var6.h(0.12f, i22);
                final int i23 = 6;
                y0Var6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fa0
                    public final /* synthetic */ qa0 b;

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
                                qa0 qa0Var3 = this.b;
                                qa0Var3.d0.d.d = null;
                                qa0Var3.e.f(false);
                                qa0Var3.h(false, false);
                                qa0Var3.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                qa0 qa0Var4 = this.b;
                                ka0 ka0Var2 = qa0Var4.e;
                                wa0 wa0Var2 = qa0Var4.d0;
                                if (qa0Var4.c(null) != null) {
                                    if (ka0Var2.v - ka0Var2.u <= org.telegram.messenger.np.u1(wa0Var2.x).r4) {
                                        org.telegram.ui.Cells.r9 r9Var = ka0Var2.W;
                                        org.telegram.messenger.gj c12 = qa0Var4.c(r9Var != null ? ((org.telegram.ui.Cells.r1) r9Var).getMessageObject() : null);
                                        org.telegram.messenger.kj kjVar5 = wa0Var2.d;
                                        int i162 = ka0Var2.u;
                                        kjVar5.e = i162;
                                        int i172 = ka0Var2.v;
                                        kjVar5.f = i172;
                                        kjVar5.d = org.telegram.ui.rm.b(i162, i172, c12);
                                        wa0Var2.b();
                                        wa0Var2.a(true);
                                        break;
                                    } else {
                                        qa0Var4.g();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                qa0 qa0Var5 = this.b;
                                ka0 ka0Var3 = qa0Var5.e;
                                wa0 wa0Var3 = qa0Var5.d0;
                                org.telegram.messenger.kj kjVar6 = wa0Var3.d;
                                int i182 = wa0Var3.x;
                                boolean z142 = wa0Var3.b;
                                if (kjVar6.d != null && !z142) {
                                    kjVar6.d = null;
                                    ka0Var3.f(false);
                                    qa0Var5.h(false, true);
                                    qa0Var5.l(true);
                                    break;
                                } else if (ka0Var3.v - ka0Var3.u <= org.telegram.messenger.np.u1(i182).r4) {
                                    org.telegram.messenger.gj c13 = qa0Var5.c(null);
                                    if (c13 != null) {
                                        if (!ka0Var3.x()) {
                                            kjVar6.e = 0;
                                            int min = Math.min(org.telegram.messenger.np.u1(i182).r4, org.telegram.ui.rm.d(c13));
                                            kjVar6.f = min;
                                            kjVar6.d = org.telegram.ui.rm.b(kjVar6.e, min, c13);
                                            View d = qa0Var5.d();
                                            if (d instanceof org.telegram.ui.Cells.r1) {
                                                ka0Var3.a0((org.telegram.ui.Cells.r1) d, kjVar6.e, kjVar6.f);
                                            }
                                            if (!z142) {
                                                qa0Var5.s.getSwipeBack().e(qa0Var5.J);
                                            }
                                            qa0Var5.h(true, true);
                                            break;
                                        } else {
                                            kjVar6.e = ka0Var3.u;
                                            kjVar6.f = ka0Var3.v;
                                            org.telegram.ui.Cells.r9 r9Var2 = ka0Var3.W;
                                            kjVar6.d = org.telegram.ui.rm.b(kjVar6.e, kjVar6.f, qa0Var5.c(r9Var2 != null ? ((org.telegram.ui.Cells.r1) r9Var2).getMessageObject() : null));
                                            wa0Var3.b();
                                            wa0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    qa0Var5.g();
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
                                wa0 wa0Var4 = this.b.d0;
                                if (!wa0Var4.b) {
                                    org.telegram.ui.mk mkVar = (org.telegram.ui.mk) wa0Var4;
                                    mkVar.a(true);
                                    org.telegram.ui.bn bnVar = mkVar.I;
                                    bnVar.F5 = null;
                                    bnVar.D5 = null;
                                    bnVar.x5.f(null, null, bnVar.l6, null);
                                    bnVar.B8();
                                    break;
                                } else {
                                    org.telegram.ui.mk mkVar2 = (org.telegram.ui.mk) wa0Var4;
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
                                org.telegram.messenger.kj kjVar7 = bnVar4.x5;
                                if (kjVar7 != null) {
                                    i152 = ((org.telegram.ui.ActionBar.g2) bnVar4).currentAccount;
                                    org.telegram.messenger.gj gjVar = bnVar4.F5;
                                    kjVar7.e(i152, null, null, gjVar == bnVar4.m4 ? null : gjVar, bnVar4.D5, bnVar4.H5);
                                }
                                bnVar4.B8();
                                break;
                            case 12:
                                qa0 qa0Var6 = this.b;
                                org.telegram.messenger.kj kjVar8 = qa0Var6.d0.d;
                                if (kjVar8.o) {
                                    boolean z15 = !kjVar8.q;
                                    kjVar8.q = z15;
                                    qa0Var6.H.a(z15, true);
                                    qa0Var6.I.a(kjVar8.q, true);
                                    if (qa0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.gj) qa0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z16 = kjVar8.q;
                                        messageMedia2.force_small_media = z16;
                                        messageMedia2.force_large_media = !z16;
                                    }
                                    if (qa0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.gj) qa0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                        boolean z17 = kjVar8.q;
                                        messageMedia.force_small_media = z17;
                                        messageMedia.force_large_media = !z17;
                                    }
                                    qa0Var6.i();
                                    qa0Var6.V = true;
                                    break;
                                }
                                break;
                            default:
                                qa0 qa0Var7 = this.b;
                                org.telegram.messenger.kj kjVar9 = qa0Var7.d0.d;
                                boolean z18 = kjVar9.r;
                                kjVar9.r = !z18;
                                qa0Var7.F.a(z18, true);
                                if (qa0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.gj) qa0Var7.r.e.get(0)).k) != null) {
                                    message4.invert_media = kjVar9.r;
                                }
                                if (qa0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.gj) qa0Var7.r.f.get(0)).k) != null) {
                                    message3.invert_media = kjVar9.r;
                                }
                                qa0Var7.i();
                                qa0Var7.V = true;
                                break;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(y0Var6, c8.ma.o(-1, 48));
                context2 = context;
                qa0Var2 = this;
                viewOutlineProvider = r13;
                i10 = qa0Var2.a;
                if (i10 == 1) {
                    qa0Var2.r = kjVar.b;
                } else if (i10 == 0) {
                    qa0Var2.r = kjVar.a;
                } else if (i10 == 2) {
                    qa0Var2.r = kjVar.c;
                }
                n10 = qa0Var2.e.n(context2);
                qa0Var2.d = n10;
                n10.setElevation(org.telegram.messenger.g0.L(8.0f));
                n10.setOutlineProvider(viewOutlineProvider);
                if (n10.getParent() instanceof ViewGroup) {
                    ((ViewGroup) n10.getParent()).removeView(n10);
                }
                qa0Var2.addView(n10, c8.ma.d(-1, -1.0f, 51, 0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / org.telegram.messenger.g0.p, 0.0f, 0.0f));
                qa0Var2.e.S(qa0Var2.f);
            }
        }
        kjVar = kjVar4;
        viewOutlineProvider = null;
        viewOutlineProvider = null;
        if (i7 != 1 || kjVar.b == null) {
            final qa0 qa0Var3 = this;
            qa0Var = qa0Var3;
            if (i7 == 2) {
                qa0Var = qa0Var3;
                if (kjVar.c != null) {
                    va0 va0Var3 = new va0(context, R.raw.position_below, org.telegram.messenger.hd.N0(2131748734, null), R.raw.position_above, org.telegram.messenger.hd.N0(2131748730, null), wa0Var.G);
                    qa0Var3.F = va0Var3;
                    va0Var3.a(!kjVar.r, false);
                    actionBarPopupWindow$ActionBarPopupWindowLayout4.a(va0Var3, c8.ma.o(-1, 48));
                    FrameLayout frameLayout3 = new FrameLayout(context);
                    qa0Var3.G = frameLayout3;
                    int i24 = org.telegram.ui.ActionBar.m6.I5;
                    org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i24, sa0Var), 0, 0);
                    org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i24);
                    frameLayout3.setBackground(a03);
                    org.telegram.ui.ActionBar.t6.j(frameLayout3, a03, null, M2, sa0Var);
                    va0 va0Var4 = new va0(context, R.raw.media_shrink, org.telegram.messenger.hd.N0(2131748706, null), R.raw.media_enlarge, org.telegram.messenger.hd.N0(2131748705, null), wa0Var.G);
                    qa0Var3.H = va0Var4;
                    va0Var4.setBackground(null);
                    va0Var4.setVisibility(kjVar.p ? 4 : 0);
                    frameLayout3.addView(va0Var4, c8.ma.o(-1, 48));
                    va0 va0Var5 = new va0(context, R.raw.media_shrink, org.telegram.messenger.hd.N0(2131748692, null), R.raw.media_enlarge, org.telegram.messenger.hd.N0(2131748691, null), wa0Var.G);
                    qa0Var3.I = va0Var5;
                    va0Var5.setBackground(null);
                    va0Var5.setVisibility(!kjVar.p ? 4 : 0);
                    frameLayout3.setAlpha(kjVar.o ? 1.0f : 0.5f);
                    frameLayout3.addView(va0Var5, c8.ma.o(-1, 48));
                    actionBarPopupWindow$ActionBarPopupWindowLayout4.a(frameLayout3, c8.ma.o(-1, 48));
                    frameLayout3.setVisibility((!kjVar.n || kjVar.o) ? 0 : 8);
                    va0Var4.a(kjVar.q, false);
                    va0Var5.a(kjVar.q, false);
                    View d1Var3 = new org.telegram.ui.ActionBar.d1(context, sa0Var);
                    org.telegram.ui.ActionBar.t6.i(d1Var3, org.telegram.ui.ActionBar.t6.K(0.06f, org.telegram.ui.ActionBar.m6.E8), sa0Var);
                    d1Var3.setTag(R.id.fit_width_tag, 1);
                    actionBarPopupWindow$ActionBarPopupWindowLayout4.a(d1Var3, c8.ma.o(-1, 8));
                    org.telegram.ui.ActionBar.y0 y0Var7 = new org.telegram.ui.ActionBar.y0(1, context, wa0Var.G, false, false);
                    y0Var7.j(org.telegram.messenger.hd.N0(2131754215, null), R.drawable.msg_select, null);
                    final int i25 = 10;
                    y0Var7.setOnClickListener(new View.OnClickListener(qa0Var3) { // from class: org.telegram.ui.Components.fa0
                        public final /* synthetic */ qa0 b;

                        {
                            this.b = qa0Var3;
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
                                    qa0 qa0Var32 = this.b;
                                    qa0Var32.d0.d.d = null;
                                    qa0Var32.e.f(false);
                                    qa0Var32.h(false, false);
                                    qa0Var32.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    qa0 qa0Var4 = this.b;
                                    ka0 ka0Var2 = qa0Var4.e;
                                    wa0 wa0Var2 = qa0Var4.d0;
                                    if (qa0Var4.c(null) != null) {
                                        if (ka0Var2.v - ka0Var2.u <= org.telegram.messenger.np.u1(wa0Var2.x).r4) {
                                            org.telegram.ui.Cells.r9 r9Var = ka0Var2.W;
                                            org.telegram.messenger.gj c12 = qa0Var4.c(r9Var != null ? ((org.telegram.ui.Cells.r1) r9Var).getMessageObject() : null);
                                            org.telegram.messenger.kj kjVar5 = wa0Var2.d;
                                            int i162 = ka0Var2.u;
                                            kjVar5.e = i162;
                                            int i172 = ka0Var2.v;
                                            kjVar5.f = i172;
                                            kjVar5.d = org.telegram.ui.rm.b(i162, i172, c12);
                                            wa0Var2.b();
                                            wa0Var2.a(true);
                                            break;
                                        } else {
                                            qa0Var4.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    qa0 qa0Var5 = this.b;
                                    ka0 ka0Var3 = qa0Var5.e;
                                    wa0 wa0Var3 = qa0Var5.d0;
                                    org.telegram.messenger.kj kjVar6 = wa0Var3.d;
                                    int i182 = wa0Var3.x;
                                    boolean z142 = wa0Var3.b;
                                    if (kjVar6.d != null && !z142) {
                                        kjVar6.d = null;
                                        ka0Var3.f(false);
                                        qa0Var5.h(false, true);
                                        qa0Var5.l(true);
                                        break;
                                    } else if (ka0Var3.v - ka0Var3.u <= org.telegram.messenger.np.u1(i182).r4) {
                                        org.telegram.messenger.gj c13 = qa0Var5.c(null);
                                        if (c13 != null) {
                                            if (!ka0Var3.x()) {
                                                kjVar6.e = 0;
                                                int min = Math.min(org.telegram.messenger.np.u1(i182).r4, org.telegram.ui.rm.d(c13));
                                                kjVar6.f = min;
                                                kjVar6.d = org.telegram.ui.rm.b(kjVar6.e, min, c13);
                                                View d = qa0Var5.d();
                                                if (d instanceof org.telegram.ui.Cells.r1) {
                                                    ka0Var3.a0((org.telegram.ui.Cells.r1) d, kjVar6.e, kjVar6.f);
                                                }
                                                if (!z142) {
                                                    qa0Var5.s.getSwipeBack().e(qa0Var5.J);
                                                }
                                                qa0Var5.h(true, true);
                                                break;
                                            } else {
                                                kjVar6.e = ka0Var3.u;
                                                kjVar6.f = ka0Var3.v;
                                                org.telegram.ui.Cells.r9 r9Var2 = ka0Var3.W;
                                                kjVar6.d = org.telegram.ui.rm.b(kjVar6.e, kjVar6.f, qa0Var5.c(r9Var2 != null ? ((org.telegram.ui.Cells.r1) r9Var2).getMessageObject() : null));
                                                wa0Var3.b();
                                                wa0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        qa0Var5.g();
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
                                    wa0 wa0Var4 = this.b.d0;
                                    if (!wa0Var4.b) {
                                        org.telegram.ui.mk mkVar = (org.telegram.ui.mk) wa0Var4;
                                        mkVar.a(true);
                                        org.telegram.ui.bn bnVar = mkVar.I;
                                        bnVar.F5 = null;
                                        bnVar.D5 = null;
                                        bnVar.x5.f(null, null, bnVar.l6, null);
                                        bnVar.B8();
                                        break;
                                    } else {
                                        org.telegram.ui.mk mkVar2 = (org.telegram.ui.mk) wa0Var4;
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
                                    org.telegram.messenger.kj kjVar7 = bnVar4.x5;
                                    if (kjVar7 != null) {
                                        i152 = ((org.telegram.ui.ActionBar.g2) bnVar4).currentAccount;
                                        org.telegram.messenger.gj gjVar = bnVar4.F5;
                                        kjVar7.e(i152, null, null, gjVar == bnVar4.m4 ? null : gjVar, bnVar4.D5, bnVar4.H5);
                                    }
                                    bnVar4.B8();
                                    break;
                                case 12:
                                    qa0 qa0Var6 = this.b;
                                    org.telegram.messenger.kj kjVar8 = qa0Var6.d0.d;
                                    if (kjVar8.o) {
                                        boolean z15 = !kjVar8.q;
                                        kjVar8.q = z15;
                                        qa0Var6.H.a(z15, true);
                                        qa0Var6.I.a(kjVar8.q, true);
                                        if (qa0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.gj) qa0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z16 = kjVar8.q;
                                            messageMedia2.force_small_media = z16;
                                            messageMedia2.force_large_media = !z16;
                                        }
                                        if (qa0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.gj) qa0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z17 = kjVar8.q;
                                            messageMedia.force_small_media = z17;
                                            messageMedia.force_large_media = !z17;
                                        }
                                        qa0Var6.i();
                                        qa0Var6.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    qa0 qa0Var7 = this.b;
                                    org.telegram.messenger.kj kjVar9 = qa0Var7.d0.d;
                                    boolean z18 = kjVar9.r;
                                    kjVar9.r = !z18;
                                    qa0Var7.F.a(z18, true);
                                    if (qa0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.gj) qa0Var7.r.e.get(0)).k) != null) {
                                        message4.invert_media = kjVar9.r;
                                    }
                                    if (qa0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.gj) qa0Var7.r.f.get(0)).k) != null) {
                                        message3.invert_media = kjVar9.r;
                                    }
                                    qa0Var7.i();
                                    qa0Var7.V = true;
                                    break;
                            }
                        }
                    });
                    actionBarPopupWindow$ActionBarPopupWindowLayout4.a(y0Var7, c8.ma.o(-1, 48));
                    org.telegram.ui.ActionBar.y0 y0Var8 = new org.telegram.ui.ActionBar.y0(1, context, wa0Var.G, false, true);
                    context2 = context;
                    y0Var8.j(org.telegram.messenger.hd.N0(2131751349, null), R.drawable.msg_delete, null);
                    int i26 = org.telegram.ui.ActionBar.m6.q7;
                    int i27 = org.telegram.ui.ActionBar.m6.p7;
                    y0Var8.c(i26, i27);
                    final int i28 = 11;
                    y0Var8.setOnClickListener(new View.OnClickListener(qa0Var3) { // from class: org.telegram.ui.Components.fa0
                        public final /* synthetic */ qa0 b;

                        {
                            this.b = qa0Var3;
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
                                    qa0 qa0Var32 = this.b;
                                    qa0Var32.d0.d.d = null;
                                    qa0Var32.e.f(false);
                                    qa0Var32.h(false, false);
                                    qa0Var32.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    qa0 qa0Var4 = this.b;
                                    ka0 ka0Var2 = qa0Var4.e;
                                    wa0 wa0Var2 = qa0Var4.d0;
                                    if (qa0Var4.c(null) != null) {
                                        if (ka0Var2.v - ka0Var2.u <= org.telegram.messenger.np.u1(wa0Var2.x).r4) {
                                            org.telegram.ui.Cells.r9 r9Var = ka0Var2.W;
                                            org.telegram.messenger.gj c12 = qa0Var4.c(r9Var != null ? ((org.telegram.ui.Cells.r1) r9Var).getMessageObject() : null);
                                            org.telegram.messenger.kj kjVar5 = wa0Var2.d;
                                            int i162 = ka0Var2.u;
                                            kjVar5.e = i162;
                                            int i172 = ka0Var2.v;
                                            kjVar5.f = i172;
                                            kjVar5.d = org.telegram.ui.rm.b(i162, i172, c12);
                                            wa0Var2.b();
                                            wa0Var2.a(true);
                                            break;
                                        } else {
                                            qa0Var4.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    qa0 qa0Var5 = this.b;
                                    ka0 ka0Var3 = qa0Var5.e;
                                    wa0 wa0Var3 = qa0Var5.d0;
                                    org.telegram.messenger.kj kjVar6 = wa0Var3.d;
                                    int i182 = wa0Var3.x;
                                    boolean z142 = wa0Var3.b;
                                    if (kjVar6.d != null && !z142) {
                                        kjVar6.d = null;
                                        ka0Var3.f(false);
                                        qa0Var5.h(false, true);
                                        qa0Var5.l(true);
                                        break;
                                    } else if (ka0Var3.v - ka0Var3.u <= org.telegram.messenger.np.u1(i182).r4) {
                                        org.telegram.messenger.gj c13 = qa0Var5.c(null);
                                        if (c13 != null) {
                                            if (!ka0Var3.x()) {
                                                kjVar6.e = 0;
                                                int min = Math.min(org.telegram.messenger.np.u1(i182).r4, org.telegram.ui.rm.d(c13));
                                                kjVar6.f = min;
                                                kjVar6.d = org.telegram.ui.rm.b(kjVar6.e, min, c13);
                                                View d = qa0Var5.d();
                                                if (d instanceof org.telegram.ui.Cells.r1) {
                                                    ka0Var3.a0((org.telegram.ui.Cells.r1) d, kjVar6.e, kjVar6.f);
                                                }
                                                if (!z142) {
                                                    qa0Var5.s.getSwipeBack().e(qa0Var5.J);
                                                }
                                                qa0Var5.h(true, true);
                                                break;
                                            } else {
                                                kjVar6.e = ka0Var3.u;
                                                kjVar6.f = ka0Var3.v;
                                                org.telegram.ui.Cells.r9 r9Var2 = ka0Var3.W;
                                                kjVar6.d = org.telegram.ui.rm.b(kjVar6.e, kjVar6.f, qa0Var5.c(r9Var2 != null ? ((org.telegram.ui.Cells.r1) r9Var2).getMessageObject() : null));
                                                wa0Var3.b();
                                                wa0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        qa0Var5.g();
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
                                    wa0 wa0Var4 = this.b.d0;
                                    if (!wa0Var4.b) {
                                        org.telegram.ui.mk mkVar = (org.telegram.ui.mk) wa0Var4;
                                        mkVar.a(true);
                                        org.telegram.ui.bn bnVar = mkVar.I;
                                        bnVar.F5 = null;
                                        bnVar.D5 = null;
                                        bnVar.x5.f(null, null, bnVar.l6, null);
                                        bnVar.B8();
                                        break;
                                    } else {
                                        org.telegram.ui.mk mkVar2 = (org.telegram.ui.mk) wa0Var4;
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
                                    org.telegram.messenger.kj kjVar7 = bnVar4.x5;
                                    if (kjVar7 != null) {
                                        i152 = ((org.telegram.ui.ActionBar.g2) bnVar4).currentAccount;
                                        org.telegram.messenger.gj gjVar = bnVar4.F5;
                                        kjVar7.e(i152, null, null, gjVar == bnVar4.m4 ? null : gjVar, bnVar4.D5, bnVar4.H5);
                                    }
                                    bnVar4.B8();
                                    break;
                                case 12:
                                    qa0 qa0Var6 = this.b;
                                    org.telegram.messenger.kj kjVar8 = qa0Var6.d0.d;
                                    if (kjVar8.o) {
                                        boolean z15 = !kjVar8.q;
                                        kjVar8.q = z15;
                                        qa0Var6.H.a(z15, true);
                                        qa0Var6.I.a(kjVar8.q, true);
                                        if (qa0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.gj) qa0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z16 = kjVar8.q;
                                            messageMedia2.force_small_media = z16;
                                            messageMedia2.force_large_media = !z16;
                                        }
                                        if (qa0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.gj) qa0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z17 = kjVar8.q;
                                            messageMedia.force_small_media = z17;
                                            messageMedia.force_large_media = !z17;
                                        }
                                        qa0Var6.i();
                                        qa0Var6.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    qa0 qa0Var7 = this.b;
                                    org.telegram.messenger.kj kjVar9 = qa0Var7.d0.d;
                                    boolean z18 = kjVar9.r;
                                    kjVar9.r = !z18;
                                    qa0Var7.F.a(z18, true);
                                    if (qa0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.gj) qa0Var7.r.e.get(0)).k) != null) {
                                        message4.invert_media = kjVar9.r;
                                    }
                                    if (qa0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.gj) qa0Var7.r.f.get(0)).k) != null) {
                                        message3.invert_media = kjVar9.r;
                                    }
                                    qa0Var7.i();
                                    qa0Var7.V = true;
                                    break;
                            }
                        }
                    });
                    y0Var8.h(0.12f, i27);
                    actionBarPopupWindow$ActionBarPopupWindowLayout4.a(y0Var8, c8.ma.o(-1, 48));
                    final int i29 = 12;
                    frameLayout3.setOnClickListener(new View.OnClickListener(qa0Var3) { // from class: org.telegram.ui.Components.fa0
                        public final /* synthetic */ qa0 b;

                        {
                            this.b = qa0Var3;
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
                                    qa0 qa0Var32 = this.b;
                                    qa0Var32.d0.d.d = null;
                                    qa0Var32.e.f(false);
                                    qa0Var32.h(false, false);
                                    qa0Var32.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    qa0 qa0Var4 = this.b;
                                    ka0 ka0Var2 = qa0Var4.e;
                                    wa0 wa0Var2 = qa0Var4.d0;
                                    if (qa0Var4.c(null) != null) {
                                        if (ka0Var2.v - ka0Var2.u <= org.telegram.messenger.np.u1(wa0Var2.x).r4) {
                                            org.telegram.ui.Cells.r9 r9Var = ka0Var2.W;
                                            org.telegram.messenger.gj c12 = qa0Var4.c(r9Var != null ? ((org.telegram.ui.Cells.r1) r9Var).getMessageObject() : null);
                                            org.telegram.messenger.kj kjVar5 = wa0Var2.d;
                                            int i162 = ka0Var2.u;
                                            kjVar5.e = i162;
                                            int i172 = ka0Var2.v;
                                            kjVar5.f = i172;
                                            kjVar5.d = org.telegram.ui.rm.b(i162, i172, c12);
                                            wa0Var2.b();
                                            wa0Var2.a(true);
                                            break;
                                        } else {
                                            qa0Var4.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    qa0 qa0Var5 = this.b;
                                    ka0 ka0Var3 = qa0Var5.e;
                                    wa0 wa0Var3 = qa0Var5.d0;
                                    org.telegram.messenger.kj kjVar6 = wa0Var3.d;
                                    int i182 = wa0Var3.x;
                                    boolean z142 = wa0Var3.b;
                                    if (kjVar6.d != null && !z142) {
                                        kjVar6.d = null;
                                        ka0Var3.f(false);
                                        qa0Var5.h(false, true);
                                        qa0Var5.l(true);
                                        break;
                                    } else if (ka0Var3.v - ka0Var3.u <= org.telegram.messenger.np.u1(i182).r4) {
                                        org.telegram.messenger.gj c13 = qa0Var5.c(null);
                                        if (c13 != null) {
                                            if (!ka0Var3.x()) {
                                                kjVar6.e = 0;
                                                int min = Math.min(org.telegram.messenger.np.u1(i182).r4, org.telegram.ui.rm.d(c13));
                                                kjVar6.f = min;
                                                kjVar6.d = org.telegram.ui.rm.b(kjVar6.e, min, c13);
                                                View d = qa0Var5.d();
                                                if (d instanceof org.telegram.ui.Cells.r1) {
                                                    ka0Var3.a0((org.telegram.ui.Cells.r1) d, kjVar6.e, kjVar6.f);
                                                }
                                                if (!z142) {
                                                    qa0Var5.s.getSwipeBack().e(qa0Var5.J);
                                                }
                                                qa0Var5.h(true, true);
                                                break;
                                            } else {
                                                kjVar6.e = ka0Var3.u;
                                                kjVar6.f = ka0Var3.v;
                                                org.telegram.ui.Cells.r9 r9Var2 = ka0Var3.W;
                                                kjVar6.d = org.telegram.ui.rm.b(kjVar6.e, kjVar6.f, qa0Var5.c(r9Var2 != null ? ((org.telegram.ui.Cells.r1) r9Var2).getMessageObject() : null));
                                                wa0Var3.b();
                                                wa0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        qa0Var5.g();
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
                                    wa0 wa0Var4 = this.b.d0;
                                    if (!wa0Var4.b) {
                                        org.telegram.ui.mk mkVar = (org.telegram.ui.mk) wa0Var4;
                                        mkVar.a(true);
                                        org.telegram.ui.bn bnVar = mkVar.I;
                                        bnVar.F5 = null;
                                        bnVar.D5 = null;
                                        bnVar.x5.f(null, null, bnVar.l6, null);
                                        bnVar.B8();
                                        break;
                                    } else {
                                        org.telegram.ui.mk mkVar2 = (org.telegram.ui.mk) wa0Var4;
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
                                    org.telegram.messenger.kj kjVar7 = bnVar4.x5;
                                    if (kjVar7 != null) {
                                        i152 = ((org.telegram.ui.ActionBar.g2) bnVar4).currentAccount;
                                        org.telegram.messenger.gj gjVar = bnVar4.F5;
                                        kjVar7.e(i152, null, null, gjVar == bnVar4.m4 ? null : gjVar, bnVar4.D5, bnVar4.H5);
                                    }
                                    bnVar4.B8();
                                    break;
                                case 12:
                                    qa0 qa0Var6 = this.b;
                                    org.telegram.messenger.kj kjVar8 = qa0Var6.d0.d;
                                    if (kjVar8.o) {
                                        boolean z15 = !kjVar8.q;
                                        kjVar8.q = z15;
                                        qa0Var6.H.a(z15, true);
                                        qa0Var6.I.a(kjVar8.q, true);
                                        if (qa0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.gj) qa0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z16 = kjVar8.q;
                                            messageMedia2.force_small_media = z16;
                                            messageMedia2.force_large_media = !z16;
                                        }
                                        if (qa0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.gj) qa0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z17 = kjVar8.q;
                                            messageMedia.force_small_media = z17;
                                            messageMedia.force_large_media = !z17;
                                        }
                                        qa0Var6.i();
                                        qa0Var6.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    qa0 qa0Var7 = this.b;
                                    org.telegram.messenger.kj kjVar9 = qa0Var7.d0.d;
                                    boolean z18 = kjVar9.r;
                                    kjVar9.r = !z18;
                                    qa0Var7.F.a(z18, true);
                                    if (qa0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.gj) qa0Var7.r.e.get(0)).k) != null) {
                                        message4.invert_media = kjVar9.r;
                                    }
                                    if (qa0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.gj) qa0Var7.r.f.get(0)).k) != null) {
                                        message3.invert_media = kjVar9.r;
                                    }
                                    qa0Var7.i();
                                    qa0Var7.V = true;
                                    break;
                            }
                        }
                    });
                    final int i30 = 13;
                    va0Var3.setOnClickListener(new View.OnClickListener(qa0Var3) { // from class: org.telegram.ui.Components.fa0
                        public final /* synthetic */ qa0 b;

                        {
                            this.b = qa0Var3;
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
                                    qa0 qa0Var32 = this.b;
                                    qa0Var32.d0.d.d = null;
                                    qa0Var32.e.f(false);
                                    qa0Var32.h(false, false);
                                    qa0Var32.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    qa0 qa0Var4 = this.b;
                                    ka0 ka0Var2 = qa0Var4.e;
                                    wa0 wa0Var2 = qa0Var4.d0;
                                    if (qa0Var4.c(null) != null) {
                                        if (ka0Var2.v - ka0Var2.u <= org.telegram.messenger.np.u1(wa0Var2.x).r4) {
                                            org.telegram.ui.Cells.r9 r9Var = ka0Var2.W;
                                            org.telegram.messenger.gj c12 = qa0Var4.c(r9Var != null ? ((org.telegram.ui.Cells.r1) r9Var).getMessageObject() : null);
                                            org.telegram.messenger.kj kjVar5 = wa0Var2.d;
                                            int i162 = ka0Var2.u;
                                            kjVar5.e = i162;
                                            int i172 = ka0Var2.v;
                                            kjVar5.f = i172;
                                            kjVar5.d = org.telegram.ui.rm.b(i162, i172, c12);
                                            wa0Var2.b();
                                            wa0Var2.a(true);
                                            break;
                                        } else {
                                            qa0Var4.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    qa0 qa0Var5 = this.b;
                                    ka0 ka0Var3 = qa0Var5.e;
                                    wa0 wa0Var3 = qa0Var5.d0;
                                    org.telegram.messenger.kj kjVar6 = wa0Var3.d;
                                    int i182 = wa0Var3.x;
                                    boolean z142 = wa0Var3.b;
                                    if (kjVar6.d != null && !z142) {
                                        kjVar6.d = null;
                                        ka0Var3.f(false);
                                        qa0Var5.h(false, true);
                                        qa0Var5.l(true);
                                        break;
                                    } else if (ka0Var3.v - ka0Var3.u <= org.telegram.messenger.np.u1(i182).r4) {
                                        org.telegram.messenger.gj c13 = qa0Var5.c(null);
                                        if (c13 != null) {
                                            if (!ka0Var3.x()) {
                                                kjVar6.e = 0;
                                                int min = Math.min(org.telegram.messenger.np.u1(i182).r4, org.telegram.ui.rm.d(c13));
                                                kjVar6.f = min;
                                                kjVar6.d = org.telegram.ui.rm.b(kjVar6.e, min, c13);
                                                View d = qa0Var5.d();
                                                if (d instanceof org.telegram.ui.Cells.r1) {
                                                    ka0Var3.a0((org.telegram.ui.Cells.r1) d, kjVar6.e, kjVar6.f);
                                                }
                                                if (!z142) {
                                                    qa0Var5.s.getSwipeBack().e(qa0Var5.J);
                                                }
                                                qa0Var5.h(true, true);
                                                break;
                                            } else {
                                                kjVar6.e = ka0Var3.u;
                                                kjVar6.f = ka0Var3.v;
                                                org.telegram.ui.Cells.r9 r9Var2 = ka0Var3.W;
                                                kjVar6.d = org.telegram.ui.rm.b(kjVar6.e, kjVar6.f, qa0Var5.c(r9Var2 != null ? ((org.telegram.ui.Cells.r1) r9Var2).getMessageObject() : null));
                                                wa0Var3.b();
                                                wa0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        qa0Var5.g();
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
                                    wa0 wa0Var4 = this.b.d0;
                                    if (!wa0Var4.b) {
                                        org.telegram.ui.mk mkVar = (org.telegram.ui.mk) wa0Var4;
                                        mkVar.a(true);
                                        org.telegram.ui.bn bnVar = mkVar.I;
                                        bnVar.F5 = null;
                                        bnVar.D5 = null;
                                        bnVar.x5.f(null, null, bnVar.l6, null);
                                        bnVar.B8();
                                        break;
                                    } else {
                                        org.telegram.ui.mk mkVar2 = (org.telegram.ui.mk) wa0Var4;
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
                                    org.telegram.messenger.kj kjVar7 = bnVar4.x5;
                                    if (kjVar7 != null) {
                                        i152 = ((org.telegram.ui.ActionBar.g2) bnVar4).currentAccount;
                                        org.telegram.messenger.gj gjVar = bnVar4.F5;
                                        kjVar7.e(i152, null, null, gjVar == bnVar4.m4 ? null : gjVar, bnVar4.D5, bnVar4.H5);
                                    }
                                    bnVar4.B8();
                                    break;
                                case 12:
                                    qa0 qa0Var6 = this.b;
                                    org.telegram.messenger.kj kjVar8 = qa0Var6.d0.d;
                                    if (kjVar8.o) {
                                        boolean z15 = !kjVar8.q;
                                        kjVar8.q = z15;
                                        qa0Var6.H.a(z15, true);
                                        qa0Var6.I.a(kjVar8.q, true);
                                        if (qa0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.gj) qa0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z16 = kjVar8.q;
                                            messageMedia2.force_small_media = z16;
                                            messageMedia2.force_large_media = !z16;
                                        }
                                        if (qa0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.gj) qa0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z17 = kjVar8.q;
                                            messageMedia.force_small_media = z17;
                                            messageMedia.force_large_media = !z17;
                                        }
                                        qa0Var6.i();
                                        qa0Var6.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    qa0 qa0Var7 = this.b;
                                    org.telegram.messenger.kj kjVar9 = qa0Var7.d0.d;
                                    boolean z18 = kjVar9.r;
                                    kjVar9.r = !z18;
                                    qa0Var7.F.a(z18, true);
                                    if (qa0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.gj) qa0Var7.r.e.get(0)).k) != null) {
                                        message4.invert_media = kjVar9.r;
                                    }
                                    if (qa0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.gj) qa0Var7.r.f.get(0)).k) != null) {
                                        message3.invert_media = kjVar9.r;
                                    }
                                    qa0Var7.i();
                                    qa0Var7.V = true;
                                    break;
                            }
                        }
                    });
                    qa0Var2 = qa0Var3;
                    i10 = qa0Var2.a;
                    if (i10 == 1) {
                    }
                    n10 = qa0Var2.e.n(context2);
                    qa0Var2.d = n10;
                    n10.setElevation(org.telegram.messenger.g0.L(8.0f));
                    n10.setOutlineProvider(viewOutlineProvider);
                    if (n10.getParent() instanceof ViewGroup) {
                    }
                    qa0Var2.addView(n10, c8.ma.d(-1, -1.0f, 51, 0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / org.telegram.messenger.g0.p, 0.0f, 0.0f));
                    qa0Var2.e.S(qa0Var2.f);
                }
            }
        } else {
            if (!org.telegram.messenger.k10.i(wa0Var.x).q()) {
                for (int i31 = 0; i31 < kjVar.b.e.size(); i31++) {
                    if (((org.telegram.messenger.gj) kjVar.b.e.get(i31)).D == 36) {
                        z10 = false;
                        break;
                    }
                }
            }
            z10 = true;
            va0 va0Var6 = new va0(context, R.raw.name_hide, org.telegram.messenger.hd.N0(kjVar.j ? 2131745136 : 2131745135, null), R.raw.name_show, org.telegram.messenger.hd.N0(kjVar.j ? 2131749116 : 2131749115, null), wa0Var.G);
            this.s.a(va0Var6, c8.ma.o(-1, 48));
            if (kjVar.g) {
                va0Var = va0Var6;
                va0 va0Var7 = new va0(context, R.raw.caption_hide, org.telegram.messenger.hd.N0(2131745148, null), R.raw.caption_show, org.telegram.messenger.hd.N0(2131749128, null), wa0Var.G);
                va0Var7.a(kjVar.l, false);
                this.s.a(va0Var7, c8.ma.o(-1, 48));
                va0Var2 = va0Var7;
            } else {
                va0Var = va0Var6;
                va0Var2 = null;
            }
            org.telegram.ui.ActionBar.y0 y0Var9 = new org.telegram.ui.ActionBar.y0(0, context, wa0Var.G, true, false);
            final int i32 = 7;
            y0Var9.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fa0
                public final /* synthetic */ qa0 b;

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
                            qa0 qa0Var32 = this.b;
                            qa0Var32.d0.d.d = null;
                            qa0Var32.e.f(false);
                            qa0Var32.h(false, false);
                            qa0Var32.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            qa0 qa0Var4 = this.b;
                            ka0 ka0Var2 = qa0Var4.e;
                            wa0 wa0Var2 = qa0Var4.d0;
                            if (qa0Var4.c(null) != null) {
                                if (ka0Var2.v - ka0Var2.u <= org.telegram.messenger.np.u1(wa0Var2.x).r4) {
                                    org.telegram.ui.Cells.r9 r9Var = ka0Var2.W;
                                    org.telegram.messenger.gj c12 = qa0Var4.c(r9Var != null ? ((org.telegram.ui.Cells.r1) r9Var).getMessageObject() : null);
                                    org.telegram.messenger.kj kjVar5 = wa0Var2.d;
                                    int i162 = ka0Var2.u;
                                    kjVar5.e = i162;
                                    int i172 = ka0Var2.v;
                                    kjVar5.f = i172;
                                    kjVar5.d = org.telegram.ui.rm.b(i162, i172, c12);
                                    wa0Var2.b();
                                    wa0Var2.a(true);
                                    break;
                                } else {
                                    qa0Var4.g();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            qa0 qa0Var5 = this.b;
                            ka0 ka0Var3 = qa0Var5.e;
                            wa0 wa0Var3 = qa0Var5.d0;
                            org.telegram.messenger.kj kjVar6 = wa0Var3.d;
                            int i182 = wa0Var3.x;
                            boolean z142 = wa0Var3.b;
                            if (kjVar6.d != null && !z142) {
                                kjVar6.d = null;
                                ka0Var3.f(false);
                                qa0Var5.h(false, true);
                                qa0Var5.l(true);
                                break;
                            } else if (ka0Var3.v - ka0Var3.u <= org.telegram.messenger.np.u1(i182).r4) {
                                org.telegram.messenger.gj c13 = qa0Var5.c(null);
                                if (c13 != null) {
                                    if (!ka0Var3.x()) {
                                        kjVar6.e = 0;
                                        int min = Math.min(org.telegram.messenger.np.u1(i182).r4, org.telegram.ui.rm.d(c13));
                                        kjVar6.f = min;
                                        kjVar6.d = org.telegram.ui.rm.b(kjVar6.e, min, c13);
                                        View d = qa0Var5.d();
                                        if (d instanceof org.telegram.ui.Cells.r1) {
                                            ka0Var3.a0((org.telegram.ui.Cells.r1) d, kjVar6.e, kjVar6.f);
                                        }
                                        if (!z142) {
                                            qa0Var5.s.getSwipeBack().e(qa0Var5.J);
                                        }
                                        qa0Var5.h(true, true);
                                        break;
                                    } else {
                                        kjVar6.e = ka0Var3.u;
                                        kjVar6.f = ka0Var3.v;
                                        org.telegram.ui.Cells.r9 r9Var2 = ka0Var3.W;
                                        kjVar6.d = org.telegram.ui.rm.b(kjVar6.e, kjVar6.f, qa0Var5.c(r9Var2 != null ? ((org.telegram.ui.Cells.r1) r9Var2).getMessageObject() : null));
                                        wa0Var3.b();
                                        wa0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                qa0Var5.g();
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
                            wa0 wa0Var4 = this.b.d0;
                            if (!wa0Var4.b) {
                                org.telegram.ui.mk mkVar = (org.telegram.ui.mk) wa0Var4;
                                mkVar.a(true);
                                org.telegram.ui.bn bnVar = mkVar.I;
                                bnVar.F5 = null;
                                bnVar.D5 = null;
                                bnVar.x5.f(null, null, bnVar.l6, null);
                                bnVar.B8();
                                break;
                            } else {
                                org.telegram.ui.mk mkVar2 = (org.telegram.ui.mk) wa0Var4;
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
                            org.telegram.messenger.kj kjVar7 = bnVar4.x5;
                            if (kjVar7 != null) {
                                i152 = ((org.telegram.ui.ActionBar.g2) bnVar4).currentAccount;
                                org.telegram.messenger.gj gjVar = bnVar4.F5;
                                kjVar7.e(i152, null, null, gjVar == bnVar4.m4 ? null : gjVar, bnVar4.D5, bnVar4.H5);
                            }
                            bnVar4.B8();
                            break;
                        case 12:
                            qa0 qa0Var6 = this.b;
                            org.telegram.messenger.kj kjVar8 = qa0Var6.d0.d;
                            if (kjVar8.o) {
                                boolean z15 = !kjVar8.q;
                                kjVar8.q = z15;
                                qa0Var6.H.a(z15, true);
                                qa0Var6.I.a(kjVar8.q, true);
                                if (qa0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.gj) qa0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z16 = kjVar8.q;
                                    messageMedia2.force_small_media = z16;
                                    messageMedia2.force_large_media = !z16;
                                }
                                if (qa0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.gj) qa0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                    boolean z17 = kjVar8.q;
                                    messageMedia.force_small_media = z17;
                                    messageMedia.force_large_media = !z17;
                                }
                                qa0Var6.i();
                                qa0Var6.V = true;
                                break;
                            }
                            break;
                        default:
                            qa0 qa0Var7 = this.b;
                            org.telegram.messenger.kj kjVar9 = qa0Var7.d0.d;
                            boolean z18 = kjVar9.r;
                            kjVar9.r = !z18;
                            qa0Var7.F.a(z18, true);
                            if (qa0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.gj) qa0Var7.r.e.get(0)).k) != null) {
                                message4.invert_media = kjVar9.r;
                            }
                            if (qa0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.gj) qa0Var7.r.f.get(0)).k) != null) {
                                message3.invert_media = kjVar9.r;
                            }
                            qa0Var7.i();
                            qa0Var7.V = true;
                            break;
                    }
                }
            });
            y0Var9.j(org.telegram.messenger.hd.N0(2131752520, null), R.drawable.msg_forward_replace, null);
            this.s.a(y0Var9, c8.ma.o(-1, 48));
            org.telegram.ui.ActionBar.d1 d1Var4 = new org.telegram.ui.ActionBar.d1(context, sa0Var);
            org.telegram.ui.ActionBar.t6.i(d1Var4, org.telegram.ui.ActionBar.t6.K(0.06f, org.telegram.ui.ActionBar.m6.E8), sa0Var);
            d1Var4.setTag(R.id.fit_width_tag, 1);
            final int i33 = 8;
            this.s.a(d1Var4, c8.ma.o(-1, 8));
            org.telegram.ui.ActionBar.y0 y0Var10 = new org.telegram.ui.ActionBar.y0(1, context, wa0Var.G, false, false);
            y0Var10.j(org.telegram.messenger.hd.N0(2131754215, null), R.drawable.msg_select, null);
            y0Var10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fa0
                public final /* synthetic */ qa0 b;

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
                            qa0 qa0Var32 = this.b;
                            qa0Var32.d0.d.d = null;
                            qa0Var32.e.f(false);
                            qa0Var32.h(false, false);
                            qa0Var32.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            qa0 qa0Var4 = this.b;
                            ka0 ka0Var2 = qa0Var4.e;
                            wa0 wa0Var2 = qa0Var4.d0;
                            if (qa0Var4.c(null) != null) {
                                if (ka0Var2.v - ka0Var2.u <= org.telegram.messenger.np.u1(wa0Var2.x).r4) {
                                    org.telegram.ui.Cells.r9 r9Var = ka0Var2.W;
                                    org.telegram.messenger.gj c12 = qa0Var4.c(r9Var != null ? ((org.telegram.ui.Cells.r1) r9Var).getMessageObject() : null);
                                    org.telegram.messenger.kj kjVar5 = wa0Var2.d;
                                    int i162 = ka0Var2.u;
                                    kjVar5.e = i162;
                                    int i172 = ka0Var2.v;
                                    kjVar5.f = i172;
                                    kjVar5.d = org.telegram.ui.rm.b(i162, i172, c12);
                                    wa0Var2.b();
                                    wa0Var2.a(true);
                                    break;
                                } else {
                                    qa0Var4.g();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            qa0 qa0Var5 = this.b;
                            ka0 ka0Var3 = qa0Var5.e;
                            wa0 wa0Var3 = qa0Var5.d0;
                            org.telegram.messenger.kj kjVar6 = wa0Var3.d;
                            int i182 = wa0Var3.x;
                            boolean z142 = wa0Var3.b;
                            if (kjVar6.d != null && !z142) {
                                kjVar6.d = null;
                                ka0Var3.f(false);
                                qa0Var5.h(false, true);
                                qa0Var5.l(true);
                                break;
                            } else if (ka0Var3.v - ka0Var3.u <= org.telegram.messenger.np.u1(i182).r4) {
                                org.telegram.messenger.gj c13 = qa0Var5.c(null);
                                if (c13 != null) {
                                    if (!ka0Var3.x()) {
                                        kjVar6.e = 0;
                                        int min = Math.min(org.telegram.messenger.np.u1(i182).r4, org.telegram.ui.rm.d(c13));
                                        kjVar6.f = min;
                                        kjVar6.d = org.telegram.ui.rm.b(kjVar6.e, min, c13);
                                        View d = qa0Var5.d();
                                        if (d instanceof org.telegram.ui.Cells.r1) {
                                            ka0Var3.a0((org.telegram.ui.Cells.r1) d, kjVar6.e, kjVar6.f);
                                        }
                                        if (!z142) {
                                            qa0Var5.s.getSwipeBack().e(qa0Var5.J);
                                        }
                                        qa0Var5.h(true, true);
                                        break;
                                    } else {
                                        kjVar6.e = ka0Var3.u;
                                        kjVar6.f = ka0Var3.v;
                                        org.telegram.ui.Cells.r9 r9Var2 = ka0Var3.W;
                                        kjVar6.d = org.telegram.ui.rm.b(kjVar6.e, kjVar6.f, qa0Var5.c(r9Var2 != null ? ((org.telegram.ui.Cells.r1) r9Var2).getMessageObject() : null));
                                        wa0Var3.b();
                                        wa0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                qa0Var5.g();
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
                            wa0 wa0Var4 = this.b.d0;
                            if (!wa0Var4.b) {
                                org.telegram.ui.mk mkVar = (org.telegram.ui.mk) wa0Var4;
                                mkVar.a(true);
                                org.telegram.ui.bn bnVar = mkVar.I;
                                bnVar.F5 = null;
                                bnVar.D5 = null;
                                bnVar.x5.f(null, null, bnVar.l6, null);
                                bnVar.B8();
                                break;
                            } else {
                                org.telegram.ui.mk mkVar2 = (org.telegram.ui.mk) wa0Var4;
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
                            org.telegram.messenger.kj kjVar7 = bnVar4.x5;
                            if (kjVar7 != null) {
                                i152 = ((org.telegram.ui.ActionBar.g2) bnVar4).currentAccount;
                                org.telegram.messenger.gj gjVar = bnVar4.F5;
                                kjVar7.e(i152, null, null, gjVar == bnVar4.m4 ? null : gjVar, bnVar4.D5, bnVar4.H5);
                            }
                            bnVar4.B8();
                            break;
                        case 12:
                            qa0 qa0Var6 = this.b;
                            org.telegram.messenger.kj kjVar8 = qa0Var6.d0.d;
                            if (kjVar8.o) {
                                boolean z15 = !kjVar8.q;
                                kjVar8.q = z15;
                                qa0Var6.H.a(z15, true);
                                qa0Var6.I.a(kjVar8.q, true);
                                if (qa0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.gj) qa0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z16 = kjVar8.q;
                                    messageMedia2.force_small_media = z16;
                                    messageMedia2.force_large_media = !z16;
                                }
                                if (qa0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.gj) qa0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                    boolean z17 = kjVar8.q;
                                    messageMedia.force_small_media = z17;
                                    messageMedia.force_large_media = !z17;
                                }
                                qa0Var6.i();
                                qa0Var6.V = true;
                                break;
                            }
                            break;
                        default:
                            qa0 qa0Var7 = this.b;
                            org.telegram.messenger.kj kjVar9 = qa0Var7.d0.d;
                            boolean z18 = kjVar9.r;
                            kjVar9.r = !z18;
                            qa0Var7.F.a(z18, true);
                            if (qa0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.gj) qa0Var7.r.e.get(0)).k) != null) {
                                message4.invert_media = kjVar9.r;
                            }
                            if (qa0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.gj) qa0Var7.r.f.get(0)).k) != null) {
                                message3.invert_media = kjVar9.r;
                            }
                            qa0Var7.i();
                            qa0Var7.V = true;
                            break;
                    }
                }
            });
            this.s.a(y0Var10, c8.ma.o(-1, 48));
            org.telegram.ui.ActionBar.y0 y0Var11 = new org.telegram.ui.ActionBar.y0(1, context, wa0Var.G, false, true);
            y0Var11.j(org.telegram.messenger.hd.N0(2131751350, null), R.drawable.msg_delete, null);
            int i34 = org.telegram.ui.ActionBar.m6.q7;
            int i35 = org.telegram.ui.ActionBar.m6.p7;
            y0Var11.c(i34, i35);
            final int i36 = 9;
            y0Var11.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fa0
                public final /* synthetic */ qa0 b;

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
                            qa0 qa0Var32 = this.b;
                            qa0Var32.d0.d.d = null;
                            qa0Var32.e.f(false);
                            qa0Var32.h(false, false);
                            qa0Var32.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            qa0 qa0Var4 = this.b;
                            ka0 ka0Var2 = qa0Var4.e;
                            wa0 wa0Var2 = qa0Var4.d0;
                            if (qa0Var4.c(null) != null) {
                                if (ka0Var2.v - ka0Var2.u <= org.telegram.messenger.np.u1(wa0Var2.x).r4) {
                                    org.telegram.ui.Cells.r9 r9Var = ka0Var2.W;
                                    org.telegram.messenger.gj c12 = qa0Var4.c(r9Var != null ? ((org.telegram.ui.Cells.r1) r9Var).getMessageObject() : null);
                                    org.telegram.messenger.kj kjVar5 = wa0Var2.d;
                                    int i162 = ka0Var2.u;
                                    kjVar5.e = i162;
                                    int i172 = ka0Var2.v;
                                    kjVar5.f = i172;
                                    kjVar5.d = org.telegram.ui.rm.b(i162, i172, c12);
                                    wa0Var2.b();
                                    wa0Var2.a(true);
                                    break;
                                } else {
                                    qa0Var4.g();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            qa0 qa0Var5 = this.b;
                            ka0 ka0Var3 = qa0Var5.e;
                            wa0 wa0Var3 = qa0Var5.d0;
                            org.telegram.messenger.kj kjVar6 = wa0Var3.d;
                            int i182 = wa0Var3.x;
                            boolean z142 = wa0Var3.b;
                            if (kjVar6.d != null && !z142) {
                                kjVar6.d = null;
                                ka0Var3.f(false);
                                qa0Var5.h(false, true);
                                qa0Var5.l(true);
                                break;
                            } else if (ka0Var3.v - ka0Var3.u <= org.telegram.messenger.np.u1(i182).r4) {
                                org.telegram.messenger.gj c13 = qa0Var5.c(null);
                                if (c13 != null) {
                                    if (!ka0Var3.x()) {
                                        kjVar6.e = 0;
                                        int min = Math.min(org.telegram.messenger.np.u1(i182).r4, org.telegram.ui.rm.d(c13));
                                        kjVar6.f = min;
                                        kjVar6.d = org.telegram.ui.rm.b(kjVar6.e, min, c13);
                                        View d = qa0Var5.d();
                                        if (d instanceof org.telegram.ui.Cells.r1) {
                                            ka0Var3.a0((org.telegram.ui.Cells.r1) d, kjVar6.e, kjVar6.f);
                                        }
                                        if (!z142) {
                                            qa0Var5.s.getSwipeBack().e(qa0Var5.J);
                                        }
                                        qa0Var5.h(true, true);
                                        break;
                                    } else {
                                        kjVar6.e = ka0Var3.u;
                                        kjVar6.f = ka0Var3.v;
                                        org.telegram.ui.Cells.r9 r9Var2 = ka0Var3.W;
                                        kjVar6.d = org.telegram.ui.rm.b(kjVar6.e, kjVar6.f, qa0Var5.c(r9Var2 != null ? ((org.telegram.ui.Cells.r1) r9Var2).getMessageObject() : null));
                                        wa0Var3.b();
                                        wa0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                qa0Var5.g();
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
                            wa0 wa0Var4 = this.b.d0;
                            if (!wa0Var4.b) {
                                org.telegram.ui.mk mkVar = (org.telegram.ui.mk) wa0Var4;
                                mkVar.a(true);
                                org.telegram.ui.bn bnVar = mkVar.I;
                                bnVar.F5 = null;
                                bnVar.D5 = null;
                                bnVar.x5.f(null, null, bnVar.l6, null);
                                bnVar.B8();
                                break;
                            } else {
                                org.telegram.ui.mk mkVar2 = (org.telegram.ui.mk) wa0Var4;
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
                            org.telegram.messenger.kj kjVar7 = bnVar4.x5;
                            if (kjVar7 != null) {
                                i152 = ((org.telegram.ui.ActionBar.g2) bnVar4).currentAccount;
                                org.telegram.messenger.gj gjVar = bnVar4.F5;
                                kjVar7.e(i152, null, null, gjVar == bnVar4.m4 ? null : gjVar, bnVar4.D5, bnVar4.H5);
                            }
                            bnVar4.B8();
                            break;
                        case 12:
                            qa0 qa0Var6 = this.b;
                            org.telegram.messenger.kj kjVar8 = qa0Var6.d0.d;
                            if (kjVar8.o) {
                                boolean z15 = !kjVar8.q;
                                kjVar8.q = z15;
                                qa0Var6.H.a(z15, true);
                                qa0Var6.I.a(kjVar8.q, true);
                                if (qa0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.gj) qa0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z16 = kjVar8.q;
                                    messageMedia2.force_small_media = z16;
                                    messageMedia2.force_large_media = !z16;
                                }
                                if (qa0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.gj) qa0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                    boolean z17 = kjVar8.q;
                                    messageMedia.force_small_media = z17;
                                    messageMedia.force_large_media = !z17;
                                }
                                qa0Var6.i();
                                qa0Var6.V = true;
                                break;
                            }
                            break;
                        default:
                            qa0 qa0Var7 = this.b;
                            org.telegram.messenger.kj kjVar9 = qa0Var7.d0.d;
                            boolean z18 = kjVar9.r;
                            kjVar9.r = !z18;
                            qa0Var7.F.a(z18, true);
                            if (qa0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.gj) qa0Var7.r.e.get(0)).k) != null) {
                                message4.invert_media = kjVar9.r;
                            }
                            if (qa0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.gj) qa0Var7.r.f.get(0)).k) != null) {
                                message3.invert_media = kjVar9.r;
                            }
                            qa0Var7.i();
                            qa0Var7.V = true;
                            break;
                    }
                }
            });
            y0Var11.h(0.12f, i35);
            this.s.a(y0Var11, c8.ma.o(-1, 48));
            va0 va0Var8 = va0Var;
            va0Var8.a(kjVar.k, false);
            va0 va0Var9 = va0Var2;
            boolean z15 = z10;
            qa0 qa0Var4 = this;
            va0Var8.setOnClickListener(new bi.w5(this, z15, context, va0Var9, va0Var8, 1));
            qa0Var = qa0Var4;
            if (va0Var9 != null) {
                va0Var9.setOnClickListener(new st(qa0Var4, va0Var9, va0Var8, 3));
                qa0Var = qa0Var4;
            }
        }
        context2 = context;
        qa0Var2 = qa0Var;
        i10 = qa0Var2.a;
        if (i10 == 1) {
        }
        n10 = qa0Var2.e.n(context2);
        qa0Var2.d = n10;
        n10.setElevation(org.telegram.messenger.g0.L(8.0f));
        n10.setOutlineProvider(viewOutlineProvider);
        if (n10.getParent() instanceof ViewGroup) {
        }
        qa0Var2.addView(n10, c8.ma.d(-1, -1.0f, 51, 0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / org.telegram.messenger.g0.p, 0.0f, 0.0f));
        qa0Var2.e.S(qa0Var2.f);
    }

    public static org.telegram.messenger.bj a(qa0 qa0Var, org.telegram.messenger.gj gjVar) {
        if (gjVar.c1() == 0) {
            return null;
        }
        org.telegram.messenger.bj bjVar = (org.telegram.messenger.bj) qa0Var.r.d.get(gjVar.c1());
        if (bjVar == null || (bjVar.d.size() > 1 && bjVar.d(gjVar) != null)) {
            return bjVar;
        }
        return null;
    }

    public static void b(qa0 qa0Var, org.telegram.ui.Cells.r1 r1Var) {
        URLSpan uRLSpan;
        TLRPC.WebPage webPage;
        if (qa0Var.a == 2) {
            org.telegram.messenger.kj kjVar = qa0Var.d0.d;
            if (!kjVar.n && (uRLSpan = kjVar.w) != null && (webPage = kjVar.v) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                r1Var.s3(uRLSpan);
                return;
            }
        }
        r1Var.s3(null);
    }

    public final org.telegram.messenger.gj c(org.telegram.messenger.gj gjVar) {
        org.telegram.messenger.bj bjVar;
        org.telegram.messenger.kj kjVar = this.d0.d;
        org.telegram.messenger.ij ijVar = kjVar.a;
        if (ijVar == null) {
            return null;
        }
        LongSparseArray longSparseArray = ijVar.d;
        if (longSparseArray == null || longSparseArray.size() <= 0 || (bjVar = (org.telegram.messenger.bj) kjVar.a.d.valueAt(0)) == null) {
            return (org.telegram.messenger.gj) kjVar.a.e.get(0);
        }
        if (bjVar.i) {
            if (gjVar != null) {
                return gjVar;
            }
            org.telegram.ui.rm rmVar = kjVar.d;
            if (rmVar != null) {
                return rmVar.a;
            }
        }
        return bjVar.h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        return r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View d() {
        org.telegram.messenger.gj c10 = c(null);
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
        org.telegram.messenger.gj c10;
        if (r1Var == null || r1Var.getMessageObject() == null || (c10 = c(null)) == null) {
            return false;
        }
        return r1Var.getMessageObject() == c10 || r1Var.getMessageObject().e1() == c10.e1();
    }

    public final void f(float f10, int i7) {
        boolean z10 = this.d0.w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        ea0 ea0Var = this.c;
        org.telegram.ui.w8 w8Var = this.b;
        if (z10) {
            ea0Var.setTranslationY(0.0f);
            w8Var.invalidateOutline();
            w8Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            ea0Var.setTranslationY(i7);
            w8Var.invalidateOutline();
            w8Var.setTranslationY(f10);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((f10 + w8Var.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f));
        }
        float x10 = w8Var.getX();
        org.telegram.ui.Cells.v9 v9Var = this.d;
        v9Var.setTranslationX(x10);
        v9Var.setTranslationY(w8Var.getY());
    }

    public final void g() {
        wa0 wa0Var = this.d0;
        new lc(wa0Var, wa0Var.G).I(R.raw.error, org.telegram.messenger.hd.N0(2131746241, null), org.telegram.messenger.hd.N0(2131746240, null)).j();
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
        ja0 ja0Var = this.x;
        ja0 ja0Var2 = this.w;
        if (!z11) {
            if (ja0Var2 != null) {
                ja0Var2.setAlpha(!z10 ? 1.0f : 0.0f);
                ja0Var2.setVisibility(!z10 ? 0 : 4);
            }
            if (ja0Var != null) {
                ja0Var.setAlpha(z10 ? 1.0f : 0.0f);
                ja0Var.setVisibility(z10 ? 0 : 4);
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
        if (ja0Var2 != null) {
            ja0Var2.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(ja0Var2, (Property<ja0, Float>) property, !z10 ? 1.0f : 0.0f));
        }
        if (ja0Var != null) {
            ja0Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(ja0Var, (Property<ja0, Float>) property, z10 ? 1.0f : 0.0f));
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
        this.Q.setInterpolator(nr.h);
        this.Q.addListener(new org.telegram.ui.on(16, this, z10));
        this.Q.start();
    }

    public final void i() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        wa0 wa0Var = this.d0;
        org.telegram.messenger.kj kjVar = wa0Var.d;
        ma0 ma0Var = this.h;
        if (ma0Var.k()) {
            this.W = true;
            return;
        }
        for (int i7 = 0; i7 < this.r.f.size(); i7++) {
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) this.r.f.get(i7);
            gjVar.M1 = true;
            gjVar.h2 = wa0Var.a;
            if (kjVar.k) {
                gjVar.k.flags &= -5;
                gjVar.g2 = true;
            } else {
                gjVar.k.flags |= 4;
                gjVar.g2 = false;
            }
            if (this.a == 2) {
                TLRPC.WebPage webPage = kjVar.v;
                if (webPage != null && ((messageMedia = (message = gjVar.k).media) == null || messageMedia.webpage != webPage)) {
                    message.flags |= 512;
                    message.media = new TLRPC.TL_messageMediaWebPage();
                    TLRPC.MessageMedia messageMedia2 = gjVar.k.media;
                    messageMedia2.webpage = kjVar.v;
                    boolean z10 = kjVar.q;
                    messageMedia2.force_large_media = !z10;
                    messageMedia2.force_small_media = z10;
                    messageMedia2.manual = true;
                    gjVar.y = null;
                    gjVar.o0();
                    gjVar.p0 = null;
                    gjVar.q0 = null;
                    gjVar.n0 = null;
                    gjVar.o0 = null;
                    gjVar.r0(true);
                    gjVar.K(true);
                } else if (webPage == null) {
                    TLRPC.Message message2 = gjVar.k;
                    message2.flags &= -513;
                    message2.media = null;
                }
            }
            if (kjVar.l) {
                gjVar.z = null;
            } else {
                gjVar.k0();
            }
            if (gjVar.T3()) {
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) gjVar.k.media;
                jjVar.results.total_voters = kjVar.l ? 0 : jjVar.a;
            }
        }
        for (int i10 = 0; i10 < this.r.h.size(); i10++) {
            ((TLRPC.PollAnswerVoters) this.r.h.get(i10)).chosen = !kjVar.k;
        }
        for (int i11 = 0; i11 < this.r.d.size(); i11++) {
            ma0Var.V((org.telegram.messenger.bj) this.r.d.valueAt(i11));
        }
        this.n.k(0, this.r.f.size());
    }

    public final void j() {
        int i7 = this.S;
        float f10 = this.T;
        wa0 wa0Var = this.d0;
        boolean z10 = wa0Var.w;
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
            org.telegram.messenger.ij ijVar = this.r;
            if (ijVar == null || i10 == 0 || i10 > ijVar.f.size()) {
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
        ValueAnimator valueAnimator = wa0Var.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        wa0Var.h = ofFloat;
        ofFloat.addUpdateListener(new xj(this, i7, f10, 1));
        wa0Var.h.setDuration(250L);
        wa0Var.h.setInterpolator(pi.k.V);
        wa0Var.h.addListener(new s60(this, 4));
        org.telegram.messenger.g0.h3(wa0Var.E, 50L);
        this.U = i7;
        f(f10, i7);
    }

    public final void k() {
        org.telegram.messenger.gj gjVar;
        wa0 wa0Var = this.d0;
        org.telegram.messenger.kj kjVar = wa0Var.d;
        if (this.a == 0) {
            ka0 ka0Var = this.e;
            if (ka0Var.v - ka0Var.u > org.telegram.messenger.np.u1(wa0Var.x).r4) {
                return;
            }
            org.telegram.ui.Cells.r9 r9Var = ka0Var.W;
            org.telegram.messenger.gj c10 = c(r9Var != null ? ((org.telegram.ui.Cells.r1) r9Var).getMessageObject() : null);
            if (kjVar.d != null && ka0Var.x()) {
                kjVar.e = ka0Var.u;
                kjVar.f = ka0Var.v;
                if (c10 != null) {
                    org.telegram.ui.rm rmVar = kjVar.d;
                    if (rmVar.m || (gjVar = rmVar.a) == null || gjVar.e1() != c10.e1()) {
                        kjVar.d = org.telegram.ui.rm.b(kjVar.e, kjVar.f, c10);
                        wa0Var.b();
                    }
                }
            }
            ka0Var.f(false);
        }
    }

    public final void l(boolean z10) {
        wa0 wa0Var = this.d0;
        TLRPC.User user = wa0Var.n;
        org.telegram.messenger.kj kjVar = wa0Var.d;
        TLRPC.Chat chat = wa0Var.r;
        ea0 ea0Var = this.c;
        int i7 = this.a;
        if (i7 == 1) {
            org.telegram.messenger.ij ijVar = kjVar.b;
            ea0Var.b(org.telegram.messenger.hd.G(ijVar == null ? 0 : ijVar.g.size(), "PreviewForwardMessagesCount", new Object[0]), z10);
            ea0Var.a(!kjVar.h ? kjVar.m ? user != null ? org.telegram.messenger.hd.a0("ForwardPreviewSendersNameVisible", null, 2131750562, org.telegram.messenger.i5.m(0, user.first_name, user.last_name)) : (!org.telegram.messenger.v3.T(chat) || chat.megagroup) ? org.telegram.messenger.hd.N0(2131750560, null) : org.telegram.messenger.hd.N0(2131750561, null) : user != null ? org.telegram.messenger.hd.a0("ForwardPreviewSendersNameVisible", null, 2131750562, org.telegram.messenger.i5.m(0, user.first_name, user.last_name)) : (!org.telegram.messenger.v3.T(chat) || chat.megagroup) ? org.telegram.messenger.hd.N0(2131750563, null) : org.telegram.messenger.hd.N0(2131750564, null) : !kjVar.k ? user != null ? org.telegram.messenger.hd.a0("ForwardPreviewSendersNameVisible", null, 2131750562, org.telegram.messenger.i5.m(0, user.first_name, user.last_name)) : (!org.telegram.messenger.v3.T(chat) || chat.megagroup) ? org.telegram.messenger.hd.N0(2131750560, null) : org.telegram.messenger.hd.N0(2131750561, null) : user != null ? org.telegram.messenger.hd.a0("ForwardPreviewSendersNameHidden", null, 2131750565, org.telegram.messenger.i5.m(0, user.first_name, user.last_name)) : (!org.telegram.messenger.v3.T(chat) || chat.megagroup) ? org.telegram.messenger.hd.N0(2131750563, null) : org.telegram.messenger.hd.N0(2131750564, null), z10);
        } else {
            if (i7 != 0) {
                if (i7 == 2) {
                    ea0Var.b(org.telegram.messenger.hd.N0(2131748355, null), z10);
                    ea0Var.a(org.telegram.messenger.hd.N0(2131748356, null), z10);
                    return;
                }
                return;
            }
            if (kjVar.d == null || !kjVar.a.j) {
                ea0Var.b(org.telegram.messenger.hd.N0(2131748352, null), z10);
                ea0Var.a(kjVar.a.j ? org.telegram.messenger.hd.N0(2131748353, null) : "", z10);
            } else {
                ea0Var.b(org.telegram.messenger.hd.N0(2131746686, null), z10);
                ea0Var.a(org.telegram.messenger.hd.N0(2131746685, null), z10);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a == 0) {
            org.telegram.messenger.g0.d0(this.f, new z2(this, 9));
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
        wa0 wa0Var = this.d0;
        wa0Var.w = z10;
        this.a0 = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i7, makeMeasureSpec);
        int i11 = this.a0;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.R;
        this.a0 = Math.max(i11, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        boolean z11 = wa0Var.w;
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
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) this.r.f.get(i12);
                gjVar.d2 = wa0Var.w ? w8Var.getLayoutParams().width : View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(16.0f);
                gjVar.S1 = false;
                gjVar.M1 = true;
                org.telegram.ui.y7 y7Var = this.n;
                if (y7Var != null) {
                    y7Var.f();
                }
            }
            this.L = true;
        }
        this.b0 = size;
        super.onMeasure(i7, i10);
    }
}
