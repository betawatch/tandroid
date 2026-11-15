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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ea0 extends FrameLayout {
    public final org.telegram.ui.ActionBar.z0 E;
    public final ja0 F;
    public final FrameLayout G;
    public final ja0 H;
    public final ja0 I;
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
    public final org.telegram.ui.v8 b;
    public int b0;
    public final s90 c;
    public boolean c0;
    public final org.telegram.ui.Cells.t9 d;
    public final /* synthetic */ ka0 d0;
    public final y90 e;
    public final di.c1 f;
    public final aa0 h;
    public final org.telegram.ui.y7 n;
    public org.telegram.messenger.ij r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout s;
    public final x90 w;
    public final x90 x;
    public final org.telegram.ui.ActionBar.z0 y;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x06f3  */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [android.graphics.drawable.Drawable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v5, types: [android.graphics.drawable.Drawable, java.lang.String, org.telegram.ui.ActionBar.m6] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ea0(ka0 ka0Var, Context context, int i7) {
        super(r4);
        org.telegram.messenger.kj kjVar;
        ViewOutlineProvider viewOutlineProvider;
        Context context2;
        ea0 ea0Var;
        boolean z10;
        ja0 ja0Var;
        ja0 ja0Var2;
        ea0 ea0Var2;
        int i10;
        org.telegram.ui.Cells.t9 n10;
        org.telegram.messenger.kj kjVar2;
        ?? r11;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3;
        org.telegram.messenger.kj kjVar3;
        boolean z11;
        Object obj;
        int i11;
        Context context3 = context;
        this.d0 = ka0Var;
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
        setOnTouchListener(new hk(this, i13));
        org.telegram.ui.v8 v8Var = new org.telegram.ui.v8(1, context3, this);
        this.b = v8Var;
        ga0 ga0Var = ka0Var.G;
        boolean z12 = ka0Var.b;
        org.telegram.messenger.kj kjVar4 = ka0Var.d;
        Drawable m10 = ((org.telegram.ui.ym) ga0Var).m();
        if (((org.telegram.ui.ym) ga0Var).f == null) {
            int i14 = org.telegram.ui.ActionBar.j6.a;
        }
        v8Var.U(m10);
        v8Var.setOccupyStatusBar(false);
        v8Var.setOutlineProvider(new fh.a(this, i13));
        v8Var.setClipToOutline(true);
        v8Var.setElevation(org.telegram.messenger.g0.L(4.0f));
        s90 s90Var = new s90(context3, ga0Var);
        this.c = s90Var;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.s8, s90Var, ga0Var);
        y90 y90Var = new y90(this);
        this.e = y90Var;
        y90Var.D = new fi.d2(this, 2);
        di.c1 c1Var = new di.c1(this, context3, ga0Var, 21);
        this.f = c1Var;
        aa0 aa0Var = new aa0(this, c1Var, ga0Var);
        this.h = aa0Var;
        c1Var.setItemAnimator(aa0Var);
        int i15 = 12;
        c1Var.setOnScrollListener(new ri(this, i15));
        c1Var.setOnItemClickListener(new ba0(this));
        org.telegram.ui.y7 y7Var = new org.telegram.ui.y7(this, i13);
        this.n = y7Var;
        c1Var.setAdapter(y7Var);
        c1Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        w90 w90Var = new w90(this, i12);
        w90Var.O = new bi.y1(this, i15);
        c1Var.setClipToPadding(false);
        c1Var.setLayoutManager(w90Var);
        c1Var.i(new fi.k(8));
        v8Var.addView(c1Var);
        addView(v8Var, c8.ja.d(-1, 400.0f, 0, 8.0f, 0.0f, 8.0f, 0.0f));
        v8Var.addView(s90Var, c8.ja.c(-2.0f, -1));
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 1, getContext(), ga0Var);
        this.s = actionBarPopupWindow$ActionBarPopupWindowLayout4;
        actionBarPopupWindow$ActionBarPopupWindowLayout4.getSwipeBack().setOnForegroundOpenFinished(new v90(this, 1));
        fh.g c10 = ka0Var.H.c(actionBarPopupWindow$ActionBarPopupWindowLayout4, null, false);
        c10.p(c8.g0.k(ga0Var));
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.R.e = true;
        c10.r(org.telegram.messenger.g0.L(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout4.setBackground(c10);
        addView(actionBarPopupWindow$ActionBarPopupWindowLayout4, c8.ja.c(-2.0f, -2));
        if (i7 == 0) {
            org.telegram.messenger.ij ijVar = kjVar4.a;
            boolean z13 = kjVar4.s;
            if (ijVar != null) {
                if (!ijVar.j || kjVar4.i) {
                    kjVar2 = kjVar4;
                    r11 = 0;
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                } else {
                    LinearLayout f10 = org.telegram.messenger.k5.f(context3, 1);
                    if (z12) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                        kjVar3 = kjVar4;
                        z11 = true;
                        obj = null;
                        i11 = 2131746430;
                    } else {
                        kjVar3 = kjVar4;
                        actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                        obj = null;
                        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, context3, ka0Var.G, true, false);
                        z0Var.j(org.telegram.messenger.hd.M0(2131753756, null), R.drawable.msg_arrow_back, null);
                        z0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.t90
                            public final /* synthetic */ ea0 b;

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
                                switch (i12) {
                                    case 0:
                                        ea0 ea0Var3 = this.b;
                                        ea0Var3.d0.d.d = null;
                                        ea0Var3.e.f(false);
                                        ea0Var3.h(false, false);
                                        ea0Var3.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        ea0 ea0Var4 = this.b;
                                        y90 y90Var2 = ea0Var4.e;
                                        ka0 ka0Var2 = ea0Var4.d0;
                                        if (ea0Var4.c(null) != null) {
                                            if (y90Var2.v - y90Var2.u <= org.telegram.messenger.np.s1(ka0Var2.x).p4) {
                                                org.telegram.ui.Cells.p9 p9Var = y90Var2.W;
                                                org.telegram.messenger.gj c11 = ea0Var4.c(p9Var != null ? ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() : null);
                                                org.telegram.messenger.kj kjVar5 = ka0Var2.d;
                                                int i17 = y90Var2.u;
                                                kjVar5.e = i17;
                                                int i18 = y90Var2.v;
                                                kjVar5.f = i18;
                                                kjVar5.d = org.telegram.ui.qm.b(i17, i18, c11);
                                                ka0Var2.b();
                                                ka0Var2.a(true);
                                                break;
                                            } else {
                                                ea0Var4.g();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        ea0 ea0Var5 = this.b;
                                        y90 y90Var3 = ea0Var5.e;
                                        ka0 ka0Var3 = ea0Var5.d0;
                                        org.telegram.messenger.kj kjVar6 = ka0Var3.d;
                                        int i19 = ka0Var3.x;
                                        boolean z14 = ka0Var3.b;
                                        if (kjVar6.d != null && !z14) {
                                            kjVar6.d = null;
                                            y90Var3.f(false);
                                            ea0Var5.h(false, true);
                                            ea0Var5.l(true);
                                            break;
                                        } else if (y90Var3.v - y90Var3.u <= org.telegram.messenger.np.s1(i19).p4) {
                                            org.telegram.messenger.gj c12 = ea0Var5.c(null);
                                            if (c12 != null) {
                                                if (!y90Var3.x()) {
                                                    kjVar6.e = 0;
                                                    int min = Math.min(org.telegram.messenger.np.s1(i19).p4, org.telegram.ui.qm.d(c12));
                                                    kjVar6.f = min;
                                                    kjVar6.d = org.telegram.ui.qm.b(kjVar6.e, min, c12);
                                                    View d = ea0Var5.d();
                                                    if (d instanceof org.telegram.ui.Cells.q1) {
                                                        y90Var3.a0((org.telegram.ui.Cells.q1) d, kjVar6.e, kjVar6.f);
                                                    }
                                                    if (!z14) {
                                                        ea0Var5.s.getSwipeBack().e(ea0Var5.J);
                                                    }
                                                    ea0Var5.h(true, true);
                                                    break;
                                                } else {
                                                    kjVar6.e = y90Var3.u;
                                                    kjVar6.f = y90Var3.v;
                                                    org.telegram.ui.Cells.p9 p9Var2 = y90Var3.W;
                                                    kjVar6.d = org.telegram.ui.qm.b(kjVar6.e, kjVar6.f, ea0Var5.c(p9Var2 != null ? ((org.telegram.ui.Cells.q1) p9Var2).getMessageObject() : null));
                                                    ka0Var3.b();
                                                    ka0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            ea0Var5.g();
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
                                        ka0 ka0Var4 = this.b.d0;
                                        if (!ka0Var4.b) {
                                            org.telegram.ui.lk lkVar = (org.telegram.ui.lk) ka0Var4;
                                            lkVar.a(true);
                                            org.telegram.ui.an anVar = lkVar.I;
                                            anVar.E5 = null;
                                            anVar.C5 = null;
                                            anVar.w5.f(null, null, anVar.k6, null);
                                            anVar.B8();
                                            break;
                                        } else {
                                            org.telegram.ui.lk lkVar2 = (org.telegram.ui.lk) ka0Var4;
                                            lkVar2.a(true);
                                            org.telegram.ui.an anVar2 = lkVar2.I;
                                            anVar2.C5 = null;
                                            anVar2.ic(anVar2.E5);
                                            break;
                                        }
                                    case 7:
                                        this.b.d0.c(true);
                                        break;
                                    case 8:
                                        this.b.d0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.lk lkVar3 = (org.telegram.ui.lk) this.b.d0;
                                        lkVar3.a(true);
                                        org.telegram.ui.an anVar3 = lkVar3.I;
                                        anVar3.w5.d(null, anVar3.k6);
                                        anVar3.B8();
                                        break;
                                    case 10:
                                        this.b.d0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.lk lkVar4 = (org.telegram.ui.lk) this.b.d0;
                                        lkVar4.a(true);
                                        org.telegram.ui.an anVar4 = lkVar4.I;
                                        anVar4.X5 = null;
                                        org.telegram.ui.qj qjVar = anVar4.a0;
                                        if (qjVar != null) {
                                            qjVar.F3 = null;
                                            qjVar.G3 = false;
                                        }
                                        org.telegram.messenger.kj kjVar7 = anVar4.w5;
                                        if (kjVar7 != null) {
                                            i16 = ((org.telegram.ui.ActionBar.e2) anVar4).currentAccount;
                                            org.telegram.messenger.gj gjVar = anVar4.E5;
                                            kjVar7.e(i16, null, null, gjVar == anVar4.m4 ? null : gjVar, anVar4.C5, anVar4.G5);
                                        }
                                        anVar4.B8();
                                        break;
                                    case 12:
                                        ea0 ea0Var6 = this.b;
                                        org.telegram.messenger.kj kjVar8 = ea0Var6.d0.d;
                                        if (kjVar8.o) {
                                            boolean z15 = !kjVar8.q;
                                            kjVar8.q = z15;
                                            ea0Var6.H.a(z15, true);
                                            ea0Var6.I.a(kjVar8.q, true);
                                            if (ea0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.gj) ea0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z16 = kjVar8.q;
                                                messageMedia2.force_small_media = z16;
                                                messageMedia2.force_large_media = !z16;
                                            }
                                            if (ea0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.gj) ea0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                                boolean z17 = kjVar8.q;
                                                messageMedia.force_small_media = z17;
                                                messageMedia.force_large_media = !z17;
                                            }
                                            ea0Var6.i();
                                            ea0Var6.V = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        ea0 ea0Var7 = this.b;
                                        org.telegram.messenger.kj kjVar9 = ea0Var7.d0.d;
                                        boolean z18 = kjVar9.r;
                                        kjVar9.r = !z18;
                                        ea0Var7.F.a(z18, true);
                                        if (ea0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.gj) ea0Var7.r.e.get(0)).k) != null) {
                                            message4.invert_media = kjVar9.r;
                                        }
                                        if (ea0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.gj) ea0Var7.r.f.get(0)).k) != null) {
                                            message3.invert_media = kjVar9.r;
                                        }
                                        ea0Var7.i();
                                        ea0Var7.V = true;
                                        break;
                                }
                            }
                        });
                        f10.addView(z0Var, c8.ja.o(-1, 48));
                        org.telegram.ui.ActionBar.d1 d1Var = new org.telegram.ui.ActionBar.d1(context3, ga0Var);
                        org.telegram.ui.ActionBar.q6.i(d1Var, org.telegram.ui.ActionBar.q6.K(0.06f, org.telegram.ui.ActionBar.j6.E8), ga0Var);
                        d1Var.setTag(R.id.fit_width_tag, 1);
                        f10.addView(d1Var, c8.ja.o(-1, 8));
                        org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(0, context3, ka0Var.G, false, true);
                        i11 = 2131746430;
                        z0Var2.j(org.telegram.messenger.hd.M0(2131746430, null), R.drawable.menu_quote_specific, null);
                        z11 = true;
                        final boolean z14 = true ? 1 : 0;
                        z0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.t90
                            public final /* synthetic */ ea0 b;

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
                                switch (z14) {
                                    case 0:
                                        ea0 ea0Var3 = this.b;
                                        ea0Var3.d0.d.d = null;
                                        ea0Var3.e.f(false);
                                        ea0Var3.h(false, false);
                                        ea0Var3.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        ea0 ea0Var4 = this.b;
                                        y90 y90Var2 = ea0Var4.e;
                                        ka0 ka0Var2 = ea0Var4.d0;
                                        if (ea0Var4.c(null) != null) {
                                            if (y90Var2.v - y90Var2.u <= org.telegram.messenger.np.s1(ka0Var2.x).p4) {
                                                org.telegram.ui.Cells.p9 p9Var = y90Var2.W;
                                                org.telegram.messenger.gj c11 = ea0Var4.c(p9Var != null ? ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() : null);
                                                org.telegram.messenger.kj kjVar5 = ka0Var2.d;
                                                int i17 = y90Var2.u;
                                                kjVar5.e = i17;
                                                int i18 = y90Var2.v;
                                                kjVar5.f = i18;
                                                kjVar5.d = org.telegram.ui.qm.b(i17, i18, c11);
                                                ka0Var2.b();
                                                ka0Var2.a(true);
                                                break;
                                            } else {
                                                ea0Var4.g();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        ea0 ea0Var5 = this.b;
                                        y90 y90Var3 = ea0Var5.e;
                                        ka0 ka0Var3 = ea0Var5.d0;
                                        org.telegram.messenger.kj kjVar6 = ka0Var3.d;
                                        int i19 = ka0Var3.x;
                                        boolean z142 = ka0Var3.b;
                                        if (kjVar6.d != null && !z142) {
                                            kjVar6.d = null;
                                            y90Var3.f(false);
                                            ea0Var5.h(false, true);
                                            ea0Var5.l(true);
                                            break;
                                        } else if (y90Var3.v - y90Var3.u <= org.telegram.messenger.np.s1(i19).p4) {
                                            org.telegram.messenger.gj c12 = ea0Var5.c(null);
                                            if (c12 != null) {
                                                if (!y90Var3.x()) {
                                                    kjVar6.e = 0;
                                                    int min = Math.min(org.telegram.messenger.np.s1(i19).p4, org.telegram.ui.qm.d(c12));
                                                    kjVar6.f = min;
                                                    kjVar6.d = org.telegram.ui.qm.b(kjVar6.e, min, c12);
                                                    View d = ea0Var5.d();
                                                    if (d instanceof org.telegram.ui.Cells.q1) {
                                                        y90Var3.a0((org.telegram.ui.Cells.q1) d, kjVar6.e, kjVar6.f);
                                                    }
                                                    if (!z142) {
                                                        ea0Var5.s.getSwipeBack().e(ea0Var5.J);
                                                    }
                                                    ea0Var5.h(true, true);
                                                    break;
                                                } else {
                                                    kjVar6.e = y90Var3.u;
                                                    kjVar6.f = y90Var3.v;
                                                    org.telegram.ui.Cells.p9 p9Var2 = y90Var3.W;
                                                    kjVar6.d = org.telegram.ui.qm.b(kjVar6.e, kjVar6.f, ea0Var5.c(p9Var2 != null ? ((org.telegram.ui.Cells.q1) p9Var2).getMessageObject() : null));
                                                    ka0Var3.b();
                                                    ka0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            ea0Var5.g();
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
                                        ka0 ka0Var4 = this.b.d0;
                                        if (!ka0Var4.b) {
                                            org.telegram.ui.lk lkVar = (org.telegram.ui.lk) ka0Var4;
                                            lkVar.a(true);
                                            org.telegram.ui.an anVar = lkVar.I;
                                            anVar.E5 = null;
                                            anVar.C5 = null;
                                            anVar.w5.f(null, null, anVar.k6, null);
                                            anVar.B8();
                                            break;
                                        } else {
                                            org.telegram.ui.lk lkVar2 = (org.telegram.ui.lk) ka0Var4;
                                            lkVar2.a(true);
                                            org.telegram.ui.an anVar2 = lkVar2.I;
                                            anVar2.C5 = null;
                                            anVar2.ic(anVar2.E5);
                                            break;
                                        }
                                    case 7:
                                        this.b.d0.c(true);
                                        break;
                                    case 8:
                                        this.b.d0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.lk lkVar3 = (org.telegram.ui.lk) this.b.d0;
                                        lkVar3.a(true);
                                        org.telegram.ui.an anVar3 = lkVar3.I;
                                        anVar3.w5.d(null, anVar3.k6);
                                        anVar3.B8();
                                        break;
                                    case 10:
                                        this.b.d0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.lk lkVar4 = (org.telegram.ui.lk) this.b.d0;
                                        lkVar4.a(true);
                                        org.telegram.ui.an anVar4 = lkVar4.I;
                                        anVar4.X5 = null;
                                        org.telegram.ui.qj qjVar = anVar4.a0;
                                        if (qjVar != null) {
                                            qjVar.F3 = null;
                                            qjVar.G3 = false;
                                        }
                                        org.telegram.messenger.kj kjVar7 = anVar4.w5;
                                        if (kjVar7 != null) {
                                            i16 = ((org.telegram.ui.ActionBar.e2) anVar4).currentAccount;
                                            org.telegram.messenger.gj gjVar = anVar4.E5;
                                            kjVar7.e(i16, null, null, gjVar == anVar4.m4 ? null : gjVar, anVar4.C5, anVar4.G5);
                                        }
                                        anVar4.B8();
                                        break;
                                    case 12:
                                        ea0 ea0Var6 = this.b;
                                        org.telegram.messenger.kj kjVar8 = ea0Var6.d0.d;
                                        if (kjVar8.o) {
                                            boolean z15 = !kjVar8.q;
                                            kjVar8.q = z15;
                                            ea0Var6.H.a(z15, true);
                                            ea0Var6.I.a(kjVar8.q, true);
                                            if (ea0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.gj) ea0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z16 = kjVar8.q;
                                                messageMedia2.force_small_media = z16;
                                                messageMedia2.force_large_media = !z16;
                                            }
                                            if (ea0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.gj) ea0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                                boolean z17 = kjVar8.q;
                                                messageMedia.force_small_media = z17;
                                                messageMedia.force_large_media = !z17;
                                            }
                                            ea0Var6.i();
                                            ea0Var6.V = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        ea0 ea0Var7 = this.b;
                                        org.telegram.messenger.kj kjVar9 = ea0Var7.d0.d;
                                        boolean z18 = kjVar9.r;
                                        kjVar9.r = !z18;
                                        ea0Var7.F.a(z18, true);
                                        if (ea0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.gj) ea0Var7.r.e.get(0)).k) != null) {
                                            message4.invert_media = kjVar9.r;
                                        }
                                        if (ea0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.gj) ea0Var7.r.f.get(0)).k) != null) {
                                            message3.invert_media = kjVar9.r;
                                        }
                                        ea0Var7.i();
                                        ea0Var7.V = true;
                                        break;
                                }
                            }
                        });
                        f10.addView(z0Var2, c8.ja.o(-1, 48));
                    }
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                    this.J = actionBarPopupWindow$ActionBarPopupWindowLayout5.b(f10);
                    actionBarPopupWindow$ActionBarPopupWindowLayout5.getSwipeBack().setStickToRight(z11);
                    FrameLayout frameLayout = new FrameLayout(context3);
                    int i16 = i11;
                    ?? r112 = obj;
                    kjVar2 = kjVar3;
                    x90 x90Var = new x90(1, 0, context, ka0Var.G, true, false);
                    this.w = x90Var;
                    x90Var.j(org.telegram.messenger.hd.M0(z12 ? i16 : 2131745653, r112), R.drawable.menu_select_quote, r112);
                    x90 x90Var2 = new x90(1, 1, context, ka0Var.G, true, false);
                    context3 = context;
                    this.x = x90Var2;
                    x90Var2.j(org.telegram.messenger.hd.M0(2131752072, r112), R.drawable.menu_quote_delete, r112);
                    int i17 = org.telegram.ui.ActionBar.j6.I5;
                    Drawable a02 = org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.w0(i17, ga0Var), 6, 0);
                    org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i17);
                    frameLayout.setBackground(a02);
                    org.telegram.ui.ActionBar.q6.j(frameLayout, a02, r112, M, ga0Var);
                    final int i18 = 2;
                    frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.t90
                        public final /* synthetic */ ea0 b;

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
                                    ea0 ea0Var3 = this.b;
                                    ea0Var3.d0.d.d = null;
                                    ea0Var3.e.f(false);
                                    ea0Var3.h(false, false);
                                    ea0Var3.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    ea0 ea0Var4 = this.b;
                                    y90 y90Var2 = ea0Var4.e;
                                    ka0 ka0Var2 = ea0Var4.d0;
                                    if (ea0Var4.c(null) != null) {
                                        if (y90Var2.v - y90Var2.u <= org.telegram.messenger.np.s1(ka0Var2.x).p4) {
                                            org.telegram.ui.Cells.p9 p9Var = y90Var2.W;
                                            org.telegram.messenger.gj c11 = ea0Var4.c(p9Var != null ? ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() : null);
                                            org.telegram.messenger.kj kjVar5 = ka0Var2.d;
                                            int i172 = y90Var2.u;
                                            kjVar5.e = i172;
                                            int i182 = y90Var2.v;
                                            kjVar5.f = i182;
                                            kjVar5.d = org.telegram.ui.qm.b(i172, i182, c11);
                                            ka0Var2.b();
                                            ka0Var2.a(true);
                                            break;
                                        } else {
                                            ea0Var4.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    ea0 ea0Var5 = this.b;
                                    y90 y90Var3 = ea0Var5.e;
                                    ka0 ka0Var3 = ea0Var5.d0;
                                    org.telegram.messenger.kj kjVar6 = ka0Var3.d;
                                    int i19 = ka0Var3.x;
                                    boolean z142 = ka0Var3.b;
                                    if (kjVar6.d != null && !z142) {
                                        kjVar6.d = null;
                                        y90Var3.f(false);
                                        ea0Var5.h(false, true);
                                        ea0Var5.l(true);
                                        break;
                                    } else if (y90Var3.v - y90Var3.u <= org.telegram.messenger.np.s1(i19).p4) {
                                        org.telegram.messenger.gj c12 = ea0Var5.c(null);
                                        if (c12 != null) {
                                            if (!y90Var3.x()) {
                                                kjVar6.e = 0;
                                                int min = Math.min(org.telegram.messenger.np.s1(i19).p4, org.telegram.ui.qm.d(c12));
                                                kjVar6.f = min;
                                                kjVar6.d = org.telegram.ui.qm.b(kjVar6.e, min, c12);
                                                View d = ea0Var5.d();
                                                if (d instanceof org.telegram.ui.Cells.q1) {
                                                    y90Var3.a0((org.telegram.ui.Cells.q1) d, kjVar6.e, kjVar6.f);
                                                }
                                                if (!z142) {
                                                    ea0Var5.s.getSwipeBack().e(ea0Var5.J);
                                                }
                                                ea0Var5.h(true, true);
                                                break;
                                            } else {
                                                kjVar6.e = y90Var3.u;
                                                kjVar6.f = y90Var3.v;
                                                org.telegram.ui.Cells.p9 p9Var2 = y90Var3.W;
                                                kjVar6.d = org.telegram.ui.qm.b(kjVar6.e, kjVar6.f, ea0Var5.c(p9Var2 != null ? ((org.telegram.ui.Cells.q1) p9Var2).getMessageObject() : null));
                                                ka0Var3.b();
                                                ka0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        ea0Var5.g();
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
                                    ka0 ka0Var4 = this.b.d0;
                                    if (!ka0Var4.b) {
                                        org.telegram.ui.lk lkVar = (org.telegram.ui.lk) ka0Var4;
                                        lkVar.a(true);
                                        org.telegram.ui.an anVar = lkVar.I;
                                        anVar.E5 = null;
                                        anVar.C5 = null;
                                        anVar.w5.f(null, null, anVar.k6, null);
                                        anVar.B8();
                                        break;
                                    } else {
                                        org.telegram.ui.lk lkVar2 = (org.telegram.ui.lk) ka0Var4;
                                        lkVar2.a(true);
                                        org.telegram.ui.an anVar2 = lkVar2.I;
                                        anVar2.C5 = null;
                                        anVar2.ic(anVar2.E5);
                                        break;
                                    }
                                case 7:
                                    this.b.d0.c(true);
                                    break;
                                case 8:
                                    this.b.d0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.lk lkVar3 = (org.telegram.ui.lk) this.b.d0;
                                    lkVar3.a(true);
                                    org.telegram.ui.an anVar3 = lkVar3.I;
                                    anVar3.w5.d(null, anVar3.k6);
                                    anVar3.B8();
                                    break;
                                case 10:
                                    this.b.d0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.lk lkVar4 = (org.telegram.ui.lk) this.b.d0;
                                    lkVar4.a(true);
                                    org.telegram.ui.an anVar4 = lkVar4.I;
                                    anVar4.X5 = null;
                                    org.telegram.ui.qj qjVar = anVar4.a0;
                                    if (qjVar != null) {
                                        qjVar.F3 = null;
                                        qjVar.G3 = false;
                                    }
                                    org.telegram.messenger.kj kjVar7 = anVar4.w5;
                                    if (kjVar7 != null) {
                                        i162 = ((org.telegram.ui.ActionBar.e2) anVar4).currentAccount;
                                        org.telegram.messenger.gj gjVar = anVar4.E5;
                                        kjVar7.e(i162, null, null, gjVar == anVar4.m4 ? null : gjVar, anVar4.C5, anVar4.G5);
                                    }
                                    anVar4.B8();
                                    break;
                                case 12:
                                    ea0 ea0Var6 = this.b;
                                    org.telegram.messenger.kj kjVar8 = ea0Var6.d0.d;
                                    if (kjVar8.o) {
                                        boolean z15 = !kjVar8.q;
                                        kjVar8.q = z15;
                                        ea0Var6.H.a(z15, true);
                                        ea0Var6.I.a(kjVar8.q, true);
                                        if (ea0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.gj) ea0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z16 = kjVar8.q;
                                            messageMedia2.force_small_media = z16;
                                            messageMedia2.force_large_media = !z16;
                                        }
                                        if (ea0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.gj) ea0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z17 = kjVar8.q;
                                            messageMedia.force_small_media = z17;
                                            messageMedia.force_large_media = !z17;
                                        }
                                        ea0Var6.i();
                                        ea0Var6.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    ea0 ea0Var7 = this.b;
                                    org.telegram.messenger.kj kjVar9 = ea0Var7.d0.d;
                                    boolean z18 = kjVar9.r;
                                    kjVar9.r = !z18;
                                    ea0Var7.F.a(z18, true);
                                    if (ea0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.gj) ea0Var7.r.e.get(0)).k) != null) {
                                        message4.invert_media = kjVar9.r;
                                    }
                                    if (ea0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.gj) ea0Var7.r.f.get(0)).k) != null) {
                                        message3.invert_media = kjVar9.r;
                                    }
                                    ea0Var7.i();
                                    ea0Var7.V = true;
                                    break;
                            }
                        }
                    });
                    frameLayout.addView(x90Var, c8.ja.c(48.0f, -1));
                    frameLayout.addView(x90Var2, c8.ja.c(48.0f, -1));
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout5;
                    actionBarPopupWindow$ActionBarPopupWindowLayout6.a(frameLayout, c8.ja.o(-1, 48));
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout6;
                    r11 = r112;
                }
                kjVar = kjVar2;
                if (kjVar.t || z13 || kjVar.u) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                } else {
                    FrameLayout frameLayout2 = new FrameLayout(context3);
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(1, context3, ka0Var.G, false, false);
                    this.y = z0Var3;
                    z0Var3.j(org.telegram.messenger.hd.M0(2131746253, r11), R.drawable.msg_forward_replace, r11);
                    final int i19 = 3;
                    z0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.t90
                        public final /* synthetic */ ea0 b;

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
                                    ea0 ea0Var3 = this.b;
                                    ea0Var3.d0.d.d = null;
                                    ea0Var3.e.f(false);
                                    ea0Var3.h(false, false);
                                    ea0Var3.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    ea0 ea0Var4 = this.b;
                                    y90 y90Var2 = ea0Var4.e;
                                    ka0 ka0Var2 = ea0Var4.d0;
                                    if (ea0Var4.c(null) != null) {
                                        if (y90Var2.v - y90Var2.u <= org.telegram.messenger.np.s1(ka0Var2.x).p4) {
                                            org.telegram.ui.Cells.p9 p9Var = y90Var2.W;
                                            org.telegram.messenger.gj c11 = ea0Var4.c(p9Var != null ? ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() : null);
                                            org.telegram.messenger.kj kjVar5 = ka0Var2.d;
                                            int i172 = y90Var2.u;
                                            kjVar5.e = i172;
                                            int i182 = y90Var2.v;
                                            kjVar5.f = i182;
                                            kjVar5.d = org.telegram.ui.qm.b(i172, i182, c11);
                                            ka0Var2.b();
                                            ka0Var2.a(true);
                                            break;
                                        } else {
                                            ea0Var4.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    ea0 ea0Var5 = this.b;
                                    y90 y90Var3 = ea0Var5.e;
                                    ka0 ka0Var3 = ea0Var5.d0;
                                    org.telegram.messenger.kj kjVar6 = ka0Var3.d;
                                    int i192 = ka0Var3.x;
                                    boolean z142 = ka0Var3.b;
                                    if (kjVar6.d != null && !z142) {
                                        kjVar6.d = null;
                                        y90Var3.f(false);
                                        ea0Var5.h(false, true);
                                        ea0Var5.l(true);
                                        break;
                                    } else if (y90Var3.v - y90Var3.u <= org.telegram.messenger.np.s1(i192).p4) {
                                        org.telegram.messenger.gj c12 = ea0Var5.c(null);
                                        if (c12 != null) {
                                            if (!y90Var3.x()) {
                                                kjVar6.e = 0;
                                                int min = Math.min(org.telegram.messenger.np.s1(i192).p4, org.telegram.ui.qm.d(c12));
                                                kjVar6.f = min;
                                                kjVar6.d = org.telegram.ui.qm.b(kjVar6.e, min, c12);
                                                View d = ea0Var5.d();
                                                if (d instanceof org.telegram.ui.Cells.q1) {
                                                    y90Var3.a0((org.telegram.ui.Cells.q1) d, kjVar6.e, kjVar6.f);
                                                }
                                                if (!z142) {
                                                    ea0Var5.s.getSwipeBack().e(ea0Var5.J);
                                                }
                                                ea0Var5.h(true, true);
                                                break;
                                            } else {
                                                kjVar6.e = y90Var3.u;
                                                kjVar6.f = y90Var3.v;
                                                org.telegram.ui.Cells.p9 p9Var2 = y90Var3.W;
                                                kjVar6.d = org.telegram.ui.qm.b(kjVar6.e, kjVar6.f, ea0Var5.c(p9Var2 != null ? ((org.telegram.ui.Cells.q1) p9Var2).getMessageObject() : null));
                                                ka0Var3.b();
                                                ka0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        ea0Var5.g();
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
                                    ka0 ka0Var4 = this.b.d0;
                                    if (!ka0Var4.b) {
                                        org.telegram.ui.lk lkVar = (org.telegram.ui.lk) ka0Var4;
                                        lkVar.a(true);
                                        org.telegram.ui.an anVar = lkVar.I;
                                        anVar.E5 = null;
                                        anVar.C5 = null;
                                        anVar.w5.f(null, null, anVar.k6, null);
                                        anVar.B8();
                                        break;
                                    } else {
                                        org.telegram.ui.lk lkVar2 = (org.telegram.ui.lk) ka0Var4;
                                        lkVar2.a(true);
                                        org.telegram.ui.an anVar2 = lkVar2.I;
                                        anVar2.C5 = null;
                                        anVar2.ic(anVar2.E5);
                                        break;
                                    }
                                case 7:
                                    this.b.d0.c(true);
                                    break;
                                case 8:
                                    this.b.d0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.lk lkVar3 = (org.telegram.ui.lk) this.b.d0;
                                    lkVar3.a(true);
                                    org.telegram.ui.an anVar3 = lkVar3.I;
                                    anVar3.w5.d(null, anVar3.k6);
                                    anVar3.B8();
                                    break;
                                case 10:
                                    this.b.d0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.lk lkVar4 = (org.telegram.ui.lk) this.b.d0;
                                    lkVar4.a(true);
                                    org.telegram.ui.an anVar4 = lkVar4.I;
                                    anVar4.X5 = null;
                                    org.telegram.ui.qj qjVar = anVar4.a0;
                                    if (qjVar != null) {
                                        qjVar.F3 = null;
                                        qjVar.G3 = false;
                                    }
                                    org.telegram.messenger.kj kjVar7 = anVar4.w5;
                                    if (kjVar7 != null) {
                                        i162 = ((org.telegram.ui.ActionBar.e2) anVar4).currentAccount;
                                        org.telegram.messenger.gj gjVar = anVar4.E5;
                                        kjVar7.e(i162, null, null, gjVar == anVar4.m4 ? null : gjVar, anVar4.C5, anVar4.G5);
                                    }
                                    anVar4.B8();
                                    break;
                                case 12:
                                    ea0 ea0Var6 = this.b;
                                    org.telegram.messenger.kj kjVar8 = ea0Var6.d0.d;
                                    if (kjVar8.o) {
                                        boolean z15 = !kjVar8.q;
                                        kjVar8.q = z15;
                                        ea0Var6.H.a(z15, true);
                                        ea0Var6.I.a(kjVar8.q, true);
                                        if (ea0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.gj) ea0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z16 = kjVar8.q;
                                            messageMedia2.force_small_media = z16;
                                            messageMedia2.force_large_media = !z16;
                                        }
                                        if (ea0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.gj) ea0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z17 = kjVar8.q;
                                            messageMedia.force_small_media = z17;
                                            messageMedia.force_large_media = !z17;
                                        }
                                        ea0Var6.i();
                                        ea0Var6.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    ea0 ea0Var7 = this.b;
                                    org.telegram.messenger.kj kjVar9 = ea0Var7.d0.d;
                                    boolean z18 = kjVar9.r;
                                    kjVar9.r = !z18;
                                    ea0Var7.F.a(z18, true);
                                    if (ea0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.gj) ea0Var7.r.e.get(0)).k) != null) {
                                        message4.invert_media = kjVar9.r;
                                    }
                                    if (ea0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.gj) ea0Var7.r.f.get(0)).k) != null) {
                                        message3.invert_media = kjVar9.r;
                                    }
                                    ea0Var7.i();
                                    ea0Var7.V = true;
                                    break;
                            }
                        }
                    });
                    context3 = context;
                    org.telegram.ui.ActionBar.z0 z0Var4 = new org.telegram.ui.ActionBar.z0(1, context3, ka0Var.G, false, false);
                    this.E = z0Var4;
                    z0Var4.j(org.telegram.messenger.hd.M0(2131746428, r11), R.drawable.msg_forward_replace, r11);
                    final int i20 = 4;
                    z0Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.t90
                        public final /* synthetic */ ea0 b;

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
                                    ea0 ea0Var3 = this.b;
                                    ea0Var3.d0.d.d = null;
                                    ea0Var3.e.f(false);
                                    ea0Var3.h(false, false);
                                    ea0Var3.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    ea0 ea0Var4 = this.b;
                                    y90 y90Var2 = ea0Var4.e;
                                    ka0 ka0Var2 = ea0Var4.d0;
                                    if (ea0Var4.c(null) != null) {
                                        if (y90Var2.v - y90Var2.u <= org.telegram.messenger.np.s1(ka0Var2.x).p4) {
                                            org.telegram.ui.Cells.p9 p9Var = y90Var2.W;
                                            org.telegram.messenger.gj c11 = ea0Var4.c(p9Var != null ? ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() : null);
                                            org.telegram.messenger.kj kjVar5 = ka0Var2.d;
                                            int i172 = y90Var2.u;
                                            kjVar5.e = i172;
                                            int i182 = y90Var2.v;
                                            kjVar5.f = i182;
                                            kjVar5.d = org.telegram.ui.qm.b(i172, i182, c11);
                                            ka0Var2.b();
                                            ka0Var2.a(true);
                                            break;
                                        } else {
                                            ea0Var4.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    ea0 ea0Var5 = this.b;
                                    y90 y90Var3 = ea0Var5.e;
                                    ka0 ka0Var3 = ea0Var5.d0;
                                    org.telegram.messenger.kj kjVar6 = ka0Var3.d;
                                    int i192 = ka0Var3.x;
                                    boolean z142 = ka0Var3.b;
                                    if (kjVar6.d != null && !z142) {
                                        kjVar6.d = null;
                                        y90Var3.f(false);
                                        ea0Var5.h(false, true);
                                        ea0Var5.l(true);
                                        break;
                                    } else if (y90Var3.v - y90Var3.u <= org.telegram.messenger.np.s1(i192).p4) {
                                        org.telegram.messenger.gj c12 = ea0Var5.c(null);
                                        if (c12 != null) {
                                            if (!y90Var3.x()) {
                                                kjVar6.e = 0;
                                                int min = Math.min(org.telegram.messenger.np.s1(i192).p4, org.telegram.ui.qm.d(c12));
                                                kjVar6.f = min;
                                                kjVar6.d = org.telegram.ui.qm.b(kjVar6.e, min, c12);
                                                View d = ea0Var5.d();
                                                if (d instanceof org.telegram.ui.Cells.q1) {
                                                    y90Var3.a0((org.telegram.ui.Cells.q1) d, kjVar6.e, kjVar6.f);
                                                }
                                                if (!z142) {
                                                    ea0Var5.s.getSwipeBack().e(ea0Var5.J);
                                                }
                                                ea0Var5.h(true, true);
                                                break;
                                            } else {
                                                kjVar6.e = y90Var3.u;
                                                kjVar6.f = y90Var3.v;
                                                org.telegram.ui.Cells.p9 p9Var2 = y90Var3.W;
                                                kjVar6.d = org.telegram.ui.qm.b(kjVar6.e, kjVar6.f, ea0Var5.c(p9Var2 != null ? ((org.telegram.ui.Cells.q1) p9Var2).getMessageObject() : null));
                                                ka0Var3.b();
                                                ka0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        ea0Var5.g();
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
                                    ka0 ka0Var4 = this.b.d0;
                                    if (!ka0Var4.b) {
                                        org.telegram.ui.lk lkVar = (org.telegram.ui.lk) ka0Var4;
                                        lkVar.a(true);
                                        org.telegram.ui.an anVar = lkVar.I;
                                        anVar.E5 = null;
                                        anVar.C5 = null;
                                        anVar.w5.f(null, null, anVar.k6, null);
                                        anVar.B8();
                                        break;
                                    } else {
                                        org.telegram.ui.lk lkVar2 = (org.telegram.ui.lk) ka0Var4;
                                        lkVar2.a(true);
                                        org.telegram.ui.an anVar2 = lkVar2.I;
                                        anVar2.C5 = null;
                                        anVar2.ic(anVar2.E5);
                                        break;
                                    }
                                case 7:
                                    this.b.d0.c(true);
                                    break;
                                case 8:
                                    this.b.d0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.lk lkVar3 = (org.telegram.ui.lk) this.b.d0;
                                    lkVar3.a(true);
                                    org.telegram.ui.an anVar3 = lkVar3.I;
                                    anVar3.w5.d(null, anVar3.k6);
                                    anVar3.B8();
                                    break;
                                case 10:
                                    this.b.d0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.lk lkVar4 = (org.telegram.ui.lk) this.b.d0;
                                    lkVar4.a(true);
                                    org.telegram.ui.an anVar4 = lkVar4.I;
                                    anVar4.X5 = null;
                                    org.telegram.ui.qj qjVar = anVar4.a0;
                                    if (qjVar != null) {
                                        qjVar.F3 = null;
                                        qjVar.G3 = false;
                                    }
                                    org.telegram.messenger.kj kjVar7 = anVar4.w5;
                                    if (kjVar7 != null) {
                                        i162 = ((org.telegram.ui.ActionBar.e2) anVar4).currentAccount;
                                        org.telegram.messenger.gj gjVar = anVar4.E5;
                                        kjVar7.e(i162, null, null, gjVar == anVar4.m4 ? null : gjVar, anVar4.C5, anVar4.G5);
                                    }
                                    anVar4.B8();
                                    break;
                                case 12:
                                    ea0 ea0Var6 = this.b;
                                    org.telegram.messenger.kj kjVar8 = ea0Var6.d0.d;
                                    if (kjVar8.o) {
                                        boolean z15 = !kjVar8.q;
                                        kjVar8.q = z15;
                                        ea0Var6.H.a(z15, true);
                                        ea0Var6.I.a(kjVar8.q, true);
                                        if (ea0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.gj) ea0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z16 = kjVar8.q;
                                            messageMedia2.force_small_media = z16;
                                            messageMedia2.force_large_media = !z16;
                                        }
                                        if (ea0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.gj) ea0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z17 = kjVar8.q;
                                            messageMedia.force_small_media = z17;
                                            messageMedia.force_large_media = !z17;
                                        }
                                        ea0Var6.i();
                                        ea0Var6.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    ea0 ea0Var7 = this.b;
                                    org.telegram.messenger.kj kjVar9 = ea0Var7.d0.d;
                                    boolean z18 = kjVar9.r;
                                    kjVar9.r = !z18;
                                    ea0Var7.F.a(z18, true);
                                    if (ea0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.gj) ea0Var7.r.e.get(0)).k) != null) {
                                        message4.invert_media = kjVar9.r;
                                    }
                                    if (ea0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.gj) ea0Var7.r.f.get(0)).k) != null) {
                                        message3.invert_media = kjVar9.r;
                                    }
                                    ea0Var7.i();
                                    ea0Var7.V = true;
                                    break;
                            }
                        }
                    });
                    frameLayout2.addView(z0Var4, c8.ja.c(48.0f, -1));
                    frameLayout2.addView(z0Var3, c8.ja.c(48.0f, -1));
                    actionBarPopupWindow$ActionBarPopupWindowLayout7.a(frameLayout2, c8.ja.o(-1, 48));
                    actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout7;
                }
                if (!z13 && !kjVar.u) {
                    View d1Var2 = new org.telegram.ui.ActionBar.d1(context3, ga0Var);
                    org.telegram.ui.ActionBar.q6.i(d1Var2, org.telegram.ui.ActionBar.q6.K(0.06f, org.telegram.ui.ActionBar.j6.E8), ga0Var);
                    d1Var2.setTag(R.id.fit_width_tag, 1);
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.a(d1Var2, c8.ja.o(-1, 8));
                }
                h(kjVar.d != null, false);
                org.telegram.ui.ActionBar.z0 z0Var5 = new org.telegram.ui.ActionBar.z0(1, context3, ka0Var.G, false, false);
                z0Var5.j(org.telegram.messenger.hd.M0(2131754218, r11), R.drawable.msg_select, r11);
                final int i21 = 5;
                z0Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.t90
                    public final /* synthetic */ ea0 b;

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
                        switch (i21) {
                            case 0:
                                ea0 ea0Var3 = this.b;
                                ea0Var3.d0.d.d = null;
                                ea0Var3.e.f(false);
                                ea0Var3.h(false, false);
                                ea0Var3.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                ea0 ea0Var4 = this.b;
                                y90 y90Var2 = ea0Var4.e;
                                ka0 ka0Var2 = ea0Var4.d0;
                                if (ea0Var4.c(null) != null) {
                                    if (y90Var2.v - y90Var2.u <= org.telegram.messenger.np.s1(ka0Var2.x).p4) {
                                        org.telegram.ui.Cells.p9 p9Var = y90Var2.W;
                                        org.telegram.messenger.gj c11 = ea0Var4.c(p9Var != null ? ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() : null);
                                        org.telegram.messenger.kj kjVar5 = ka0Var2.d;
                                        int i172 = y90Var2.u;
                                        kjVar5.e = i172;
                                        int i182 = y90Var2.v;
                                        kjVar5.f = i182;
                                        kjVar5.d = org.telegram.ui.qm.b(i172, i182, c11);
                                        ka0Var2.b();
                                        ka0Var2.a(true);
                                        break;
                                    } else {
                                        ea0Var4.g();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                ea0 ea0Var5 = this.b;
                                y90 y90Var3 = ea0Var5.e;
                                ka0 ka0Var3 = ea0Var5.d0;
                                org.telegram.messenger.kj kjVar6 = ka0Var3.d;
                                int i192 = ka0Var3.x;
                                boolean z142 = ka0Var3.b;
                                if (kjVar6.d != null && !z142) {
                                    kjVar6.d = null;
                                    y90Var3.f(false);
                                    ea0Var5.h(false, true);
                                    ea0Var5.l(true);
                                    break;
                                } else if (y90Var3.v - y90Var3.u <= org.telegram.messenger.np.s1(i192).p4) {
                                    org.telegram.messenger.gj c12 = ea0Var5.c(null);
                                    if (c12 != null) {
                                        if (!y90Var3.x()) {
                                            kjVar6.e = 0;
                                            int min = Math.min(org.telegram.messenger.np.s1(i192).p4, org.telegram.ui.qm.d(c12));
                                            kjVar6.f = min;
                                            kjVar6.d = org.telegram.ui.qm.b(kjVar6.e, min, c12);
                                            View d = ea0Var5.d();
                                            if (d instanceof org.telegram.ui.Cells.q1) {
                                                y90Var3.a0((org.telegram.ui.Cells.q1) d, kjVar6.e, kjVar6.f);
                                            }
                                            if (!z142) {
                                                ea0Var5.s.getSwipeBack().e(ea0Var5.J);
                                            }
                                            ea0Var5.h(true, true);
                                            break;
                                        } else {
                                            kjVar6.e = y90Var3.u;
                                            kjVar6.f = y90Var3.v;
                                            org.telegram.ui.Cells.p9 p9Var2 = y90Var3.W;
                                            kjVar6.d = org.telegram.ui.qm.b(kjVar6.e, kjVar6.f, ea0Var5.c(p9Var2 != null ? ((org.telegram.ui.Cells.q1) p9Var2).getMessageObject() : null));
                                            ka0Var3.b();
                                            ka0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    ea0Var5.g();
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
                                ka0 ka0Var4 = this.b.d0;
                                if (!ka0Var4.b) {
                                    org.telegram.ui.lk lkVar = (org.telegram.ui.lk) ka0Var4;
                                    lkVar.a(true);
                                    org.telegram.ui.an anVar = lkVar.I;
                                    anVar.E5 = null;
                                    anVar.C5 = null;
                                    anVar.w5.f(null, null, anVar.k6, null);
                                    anVar.B8();
                                    break;
                                } else {
                                    org.telegram.ui.lk lkVar2 = (org.telegram.ui.lk) ka0Var4;
                                    lkVar2.a(true);
                                    org.telegram.ui.an anVar2 = lkVar2.I;
                                    anVar2.C5 = null;
                                    anVar2.ic(anVar2.E5);
                                    break;
                                }
                            case 7:
                                this.b.d0.c(true);
                                break;
                            case 8:
                                this.b.d0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.lk lkVar3 = (org.telegram.ui.lk) this.b.d0;
                                lkVar3.a(true);
                                org.telegram.ui.an anVar3 = lkVar3.I;
                                anVar3.w5.d(null, anVar3.k6);
                                anVar3.B8();
                                break;
                            case 10:
                                this.b.d0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.lk lkVar4 = (org.telegram.ui.lk) this.b.d0;
                                lkVar4.a(true);
                                org.telegram.ui.an anVar4 = lkVar4.I;
                                anVar4.X5 = null;
                                org.telegram.ui.qj qjVar = anVar4.a0;
                                if (qjVar != null) {
                                    qjVar.F3 = null;
                                    qjVar.G3 = false;
                                }
                                org.telegram.messenger.kj kjVar7 = anVar4.w5;
                                if (kjVar7 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.e2) anVar4).currentAccount;
                                    org.telegram.messenger.gj gjVar = anVar4.E5;
                                    kjVar7.e(i162, null, null, gjVar == anVar4.m4 ? null : gjVar, anVar4.C5, anVar4.G5);
                                }
                                anVar4.B8();
                                break;
                            case 12:
                                ea0 ea0Var6 = this.b;
                                org.telegram.messenger.kj kjVar8 = ea0Var6.d0.d;
                                if (kjVar8.o) {
                                    boolean z15 = !kjVar8.q;
                                    kjVar8.q = z15;
                                    ea0Var6.H.a(z15, true);
                                    ea0Var6.I.a(kjVar8.q, true);
                                    if (ea0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.gj) ea0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z16 = kjVar8.q;
                                        messageMedia2.force_small_media = z16;
                                        messageMedia2.force_large_media = !z16;
                                    }
                                    if (ea0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.gj) ea0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                        boolean z17 = kjVar8.q;
                                        messageMedia.force_small_media = z17;
                                        messageMedia.force_large_media = !z17;
                                    }
                                    ea0Var6.i();
                                    ea0Var6.V = true;
                                    break;
                                }
                                break;
                            default:
                                ea0 ea0Var7 = this.b;
                                org.telegram.messenger.kj kjVar9 = ea0Var7.d0.d;
                                boolean z18 = kjVar9.r;
                                kjVar9.r = !z18;
                                ea0Var7.F.a(z18, true);
                                if (ea0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.gj) ea0Var7.r.e.get(0)).k) != null) {
                                    message4.invert_media = kjVar9.r;
                                }
                                if (ea0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.gj) ea0Var7.r.f.get(0)).k) != null) {
                                    message3.invert_media = kjVar9.r;
                                }
                                ea0Var7.i();
                                ea0Var7.V = true;
                                break;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(z0Var5, c8.ja.o(-1, 48));
                org.telegram.ui.ActionBar.z0 z0Var6 = new org.telegram.ui.ActionBar.z0(1, context, ka0Var.G, false, true);
                z0Var6.j(org.telegram.messenger.hd.M0(z12 ? 2131751360 : 2131751359, r11), R.drawable.msg_delete, r11);
                int i22 = org.telegram.ui.ActionBar.j6.q7;
                int i23 = org.telegram.ui.ActionBar.j6.p7;
                z0Var6.c(i22, i23);
                z0Var6.h(0.12f, i23);
                final int i24 = 6;
                z0Var6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.t90
                    public final /* synthetic */ ea0 b;

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
                        switch (i24) {
                            case 0:
                                ea0 ea0Var3 = this.b;
                                ea0Var3.d0.d.d = null;
                                ea0Var3.e.f(false);
                                ea0Var3.h(false, false);
                                ea0Var3.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                ea0 ea0Var4 = this.b;
                                y90 y90Var2 = ea0Var4.e;
                                ka0 ka0Var2 = ea0Var4.d0;
                                if (ea0Var4.c(null) != null) {
                                    if (y90Var2.v - y90Var2.u <= org.telegram.messenger.np.s1(ka0Var2.x).p4) {
                                        org.telegram.ui.Cells.p9 p9Var = y90Var2.W;
                                        org.telegram.messenger.gj c11 = ea0Var4.c(p9Var != null ? ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() : null);
                                        org.telegram.messenger.kj kjVar5 = ka0Var2.d;
                                        int i172 = y90Var2.u;
                                        kjVar5.e = i172;
                                        int i182 = y90Var2.v;
                                        kjVar5.f = i182;
                                        kjVar5.d = org.telegram.ui.qm.b(i172, i182, c11);
                                        ka0Var2.b();
                                        ka0Var2.a(true);
                                        break;
                                    } else {
                                        ea0Var4.g();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                ea0 ea0Var5 = this.b;
                                y90 y90Var3 = ea0Var5.e;
                                ka0 ka0Var3 = ea0Var5.d0;
                                org.telegram.messenger.kj kjVar6 = ka0Var3.d;
                                int i192 = ka0Var3.x;
                                boolean z142 = ka0Var3.b;
                                if (kjVar6.d != null && !z142) {
                                    kjVar6.d = null;
                                    y90Var3.f(false);
                                    ea0Var5.h(false, true);
                                    ea0Var5.l(true);
                                    break;
                                } else if (y90Var3.v - y90Var3.u <= org.telegram.messenger.np.s1(i192).p4) {
                                    org.telegram.messenger.gj c12 = ea0Var5.c(null);
                                    if (c12 != null) {
                                        if (!y90Var3.x()) {
                                            kjVar6.e = 0;
                                            int min = Math.min(org.telegram.messenger.np.s1(i192).p4, org.telegram.ui.qm.d(c12));
                                            kjVar6.f = min;
                                            kjVar6.d = org.telegram.ui.qm.b(kjVar6.e, min, c12);
                                            View d = ea0Var5.d();
                                            if (d instanceof org.telegram.ui.Cells.q1) {
                                                y90Var3.a0((org.telegram.ui.Cells.q1) d, kjVar6.e, kjVar6.f);
                                            }
                                            if (!z142) {
                                                ea0Var5.s.getSwipeBack().e(ea0Var5.J);
                                            }
                                            ea0Var5.h(true, true);
                                            break;
                                        } else {
                                            kjVar6.e = y90Var3.u;
                                            kjVar6.f = y90Var3.v;
                                            org.telegram.ui.Cells.p9 p9Var2 = y90Var3.W;
                                            kjVar6.d = org.telegram.ui.qm.b(kjVar6.e, kjVar6.f, ea0Var5.c(p9Var2 != null ? ((org.telegram.ui.Cells.q1) p9Var2).getMessageObject() : null));
                                            ka0Var3.b();
                                            ka0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    ea0Var5.g();
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
                                ka0 ka0Var4 = this.b.d0;
                                if (!ka0Var4.b) {
                                    org.telegram.ui.lk lkVar = (org.telegram.ui.lk) ka0Var4;
                                    lkVar.a(true);
                                    org.telegram.ui.an anVar = lkVar.I;
                                    anVar.E5 = null;
                                    anVar.C5 = null;
                                    anVar.w5.f(null, null, anVar.k6, null);
                                    anVar.B8();
                                    break;
                                } else {
                                    org.telegram.ui.lk lkVar2 = (org.telegram.ui.lk) ka0Var4;
                                    lkVar2.a(true);
                                    org.telegram.ui.an anVar2 = lkVar2.I;
                                    anVar2.C5 = null;
                                    anVar2.ic(anVar2.E5);
                                    break;
                                }
                            case 7:
                                this.b.d0.c(true);
                                break;
                            case 8:
                                this.b.d0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.lk lkVar3 = (org.telegram.ui.lk) this.b.d0;
                                lkVar3.a(true);
                                org.telegram.ui.an anVar3 = lkVar3.I;
                                anVar3.w5.d(null, anVar3.k6);
                                anVar3.B8();
                                break;
                            case 10:
                                this.b.d0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.lk lkVar4 = (org.telegram.ui.lk) this.b.d0;
                                lkVar4.a(true);
                                org.telegram.ui.an anVar4 = lkVar4.I;
                                anVar4.X5 = null;
                                org.telegram.ui.qj qjVar = anVar4.a0;
                                if (qjVar != null) {
                                    qjVar.F3 = null;
                                    qjVar.G3 = false;
                                }
                                org.telegram.messenger.kj kjVar7 = anVar4.w5;
                                if (kjVar7 != null) {
                                    i162 = ((org.telegram.ui.ActionBar.e2) anVar4).currentAccount;
                                    org.telegram.messenger.gj gjVar = anVar4.E5;
                                    kjVar7.e(i162, null, null, gjVar == anVar4.m4 ? null : gjVar, anVar4.C5, anVar4.G5);
                                }
                                anVar4.B8();
                                break;
                            case 12:
                                ea0 ea0Var6 = this.b;
                                org.telegram.messenger.kj kjVar8 = ea0Var6.d0.d;
                                if (kjVar8.o) {
                                    boolean z15 = !kjVar8.q;
                                    kjVar8.q = z15;
                                    ea0Var6.H.a(z15, true);
                                    ea0Var6.I.a(kjVar8.q, true);
                                    if (ea0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.gj) ea0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z16 = kjVar8.q;
                                        messageMedia2.force_small_media = z16;
                                        messageMedia2.force_large_media = !z16;
                                    }
                                    if (ea0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.gj) ea0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                        boolean z17 = kjVar8.q;
                                        messageMedia.force_small_media = z17;
                                        messageMedia.force_large_media = !z17;
                                    }
                                    ea0Var6.i();
                                    ea0Var6.V = true;
                                    break;
                                }
                                break;
                            default:
                                ea0 ea0Var7 = this.b;
                                org.telegram.messenger.kj kjVar9 = ea0Var7.d0.d;
                                boolean z18 = kjVar9.r;
                                kjVar9.r = !z18;
                                ea0Var7.F.a(z18, true);
                                if (ea0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.gj) ea0Var7.r.e.get(0)).k) != null) {
                                    message4.invert_media = kjVar9.r;
                                }
                                if (ea0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.gj) ea0Var7.r.f.get(0)).k) != null) {
                                    message3.invert_media = kjVar9.r;
                                }
                                ea0Var7.i();
                                ea0Var7.V = true;
                                break;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(z0Var6, c8.ja.o(-1, 48));
                context2 = context;
                ea0Var2 = this;
                viewOutlineProvider = r11;
                i10 = ea0Var2.a;
                if (i10 == 1) {
                    ea0Var2.r = kjVar.b;
                } else if (i10 == 0) {
                    ea0Var2.r = kjVar.a;
                } else if (i10 == 2) {
                    ea0Var2.r = kjVar.c;
                }
                n10 = ea0Var2.e.n(context2);
                ea0Var2.d = n10;
                n10.setElevation(org.telegram.messenger.g0.L(8.0f));
                n10.setOutlineProvider(viewOutlineProvider);
                if (n10.getParent() instanceof ViewGroup) {
                    ((ViewGroup) n10.getParent()).removeView(n10);
                }
                ea0Var2.addView(n10, c8.ja.d(-1, -1.0f, 51, 0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / org.telegram.messenger.g0.p, 0.0f, 0.0f));
                ea0Var2.e.S(ea0Var2.f);
            }
        }
        kjVar = kjVar4;
        viewOutlineProvider = null;
        viewOutlineProvider = null;
        if (i7 != 1 || kjVar.b == null) {
            final ea0 ea0Var3 = this;
            ea0Var = ea0Var3;
            if (i7 == 2) {
                ea0Var = ea0Var3;
                if (kjVar.c != null) {
                    ja0 ja0Var3 = new ja0(context, R.raw.position_below, org.telegram.messenger.hd.M0(2131748927, null), R.raw.position_above, org.telegram.messenger.hd.M0(2131748923, null), ka0Var.G);
                    ea0Var3.F = ja0Var3;
                    ja0Var3.a(!kjVar.r, false);
                    actionBarPopupWindow$ActionBarPopupWindowLayout4.a(ja0Var3, c8.ja.o(-1, 48));
                    FrameLayout frameLayout3 = new FrameLayout(context);
                    ea0Var3.G = frameLayout3;
                    int i25 = org.telegram.ui.ActionBar.j6.I5;
                    org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.w0(i25, ga0Var), 0, 0);
                    org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i25);
                    frameLayout3.setBackground(a03);
                    org.telegram.ui.ActionBar.q6.j(frameLayout3, a03, null, M2, ga0Var);
                    ja0 ja0Var4 = new ja0(context, R.raw.media_shrink, org.telegram.messenger.hd.M0(2131748899, null), R.raw.media_enlarge, org.telegram.messenger.hd.M0(2131748898, null), ka0Var.G);
                    ea0Var3.H = ja0Var4;
                    ja0Var4.setBackground(null);
                    ja0Var4.setVisibility(kjVar.p ? 4 : 0);
                    frameLayout3.addView(ja0Var4, c8.ja.o(-1, 48));
                    ja0 ja0Var5 = new ja0(context, R.raw.media_shrink, org.telegram.messenger.hd.M0(2131748885, null), R.raw.media_enlarge, org.telegram.messenger.hd.M0(2131748884, null), ka0Var.G);
                    ea0Var3.I = ja0Var5;
                    ja0Var5.setBackground(null);
                    ja0Var5.setVisibility(!kjVar.p ? 4 : 0);
                    frameLayout3.setAlpha(kjVar.o ? 1.0f : 0.5f);
                    frameLayout3.addView(ja0Var5, c8.ja.o(-1, 48));
                    actionBarPopupWindow$ActionBarPopupWindowLayout4.a(frameLayout3, c8.ja.o(-1, 48));
                    frameLayout3.setVisibility((!kjVar.n || kjVar.o) ? 0 : 8);
                    ja0Var4.a(kjVar.q, false);
                    ja0Var5.a(kjVar.q, false);
                    View d1Var3 = new org.telegram.ui.ActionBar.d1(context, ga0Var);
                    org.telegram.ui.ActionBar.q6.i(d1Var3, org.telegram.ui.ActionBar.q6.K(0.06f, org.telegram.ui.ActionBar.j6.E8), ga0Var);
                    d1Var3.setTag(R.id.fit_width_tag, 1);
                    actionBarPopupWindow$ActionBarPopupWindowLayout4.a(d1Var3, c8.ja.o(-1, 8));
                    org.telegram.ui.ActionBar.z0 z0Var7 = new org.telegram.ui.ActionBar.z0(1, context, ka0Var.G, false, false);
                    z0Var7.j(org.telegram.messenger.hd.M0(2131754218, null), R.drawable.msg_select, null);
                    final int i26 = 10;
                    z0Var7.setOnClickListener(new View.OnClickListener(ea0Var3) { // from class: org.telegram.ui.Components.t90
                        public final /* synthetic */ ea0 b;

                        {
                            this.b = ea0Var3;
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
                            switch (i26) {
                                case 0:
                                    ea0 ea0Var32 = this.b;
                                    ea0Var32.d0.d.d = null;
                                    ea0Var32.e.f(false);
                                    ea0Var32.h(false, false);
                                    ea0Var32.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    ea0 ea0Var4 = this.b;
                                    y90 y90Var2 = ea0Var4.e;
                                    ka0 ka0Var2 = ea0Var4.d0;
                                    if (ea0Var4.c(null) != null) {
                                        if (y90Var2.v - y90Var2.u <= org.telegram.messenger.np.s1(ka0Var2.x).p4) {
                                            org.telegram.ui.Cells.p9 p9Var = y90Var2.W;
                                            org.telegram.messenger.gj c11 = ea0Var4.c(p9Var != null ? ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() : null);
                                            org.telegram.messenger.kj kjVar5 = ka0Var2.d;
                                            int i172 = y90Var2.u;
                                            kjVar5.e = i172;
                                            int i182 = y90Var2.v;
                                            kjVar5.f = i182;
                                            kjVar5.d = org.telegram.ui.qm.b(i172, i182, c11);
                                            ka0Var2.b();
                                            ka0Var2.a(true);
                                            break;
                                        } else {
                                            ea0Var4.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    ea0 ea0Var5 = this.b;
                                    y90 y90Var3 = ea0Var5.e;
                                    ka0 ka0Var3 = ea0Var5.d0;
                                    org.telegram.messenger.kj kjVar6 = ka0Var3.d;
                                    int i192 = ka0Var3.x;
                                    boolean z142 = ka0Var3.b;
                                    if (kjVar6.d != null && !z142) {
                                        kjVar6.d = null;
                                        y90Var3.f(false);
                                        ea0Var5.h(false, true);
                                        ea0Var5.l(true);
                                        break;
                                    } else if (y90Var3.v - y90Var3.u <= org.telegram.messenger.np.s1(i192).p4) {
                                        org.telegram.messenger.gj c12 = ea0Var5.c(null);
                                        if (c12 != null) {
                                            if (!y90Var3.x()) {
                                                kjVar6.e = 0;
                                                int min = Math.min(org.telegram.messenger.np.s1(i192).p4, org.telegram.ui.qm.d(c12));
                                                kjVar6.f = min;
                                                kjVar6.d = org.telegram.ui.qm.b(kjVar6.e, min, c12);
                                                View d = ea0Var5.d();
                                                if (d instanceof org.telegram.ui.Cells.q1) {
                                                    y90Var3.a0((org.telegram.ui.Cells.q1) d, kjVar6.e, kjVar6.f);
                                                }
                                                if (!z142) {
                                                    ea0Var5.s.getSwipeBack().e(ea0Var5.J);
                                                }
                                                ea0Var5.h(true, true);
                                                break;
                                            } else {
                                                kjVar6.e = y90Var3.u;
                                                kjVar6.f = y90Var3.v;
                                                org.telegram.ui.Cells.p9 p9Var2 = y90Var3.W;
                                                kjVar6.d = org.telegram.ui.qm.b(kjVar6.e, kjVar6.f, ea0Var5.c(p9Var2 != null ? ((org.telegram.ui.Cells.q1) p9Var2).getMessageObject() : null));
                                                ka0Var3.b();
                                                ka0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        ea0Var5.g();
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
                                    ka0 ka0Var4 = this.b.d0;
                                    if (!ka0Var4.b) {
                                        org.telegram.ui.lk lkVar = (org.telegram.ui.lk) ka0Var4;
                                        lkVar.a(true);
                                        org.telegram.ui.an anVar = lkVar.I;
                                        anVar.E5 = null;
                                        anVar.C5 = null;
                                        anVar.w5.f(null, null, anVar.k6, null);
                                        anVar.B8();
                                        break;
                                    } else {
                                        org.telegram.ui.lk lkVar2 = (org.telegram.ui.lk) ka0Var4;
                                        lkVar2.a(true);
                                        org.telegram.ui.an anVar2 = lkVar2.I;
                                        anVar2.C5 = null;
                                        anVar2.ic(anVar2.E5);
                                        break;
                                    }
                                case 7:
                                    this.b.d0.c(true);
                                    break;
                                case 8:
                                    this.b.d0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.lk lkVar3 = (org.telegram.ui.lk) this.b.d0;
                                    lkVar3.a(true);
                                    org.telegram.ui.an anVar3 = lkVar3.I;
                                    anVar3.w5.d(null, anVar3.k6);
                                    anVar3.B8();
                                    break;
                                case 10:
                                    this.b.d0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.lk lkVar4 = (org.telegram.ui.lk) this.b.d0;
                                    lkVar4.a(true);
                                    org.telegram.ui.an anVar4 = lkVar4.I;
                                    anVar4.X5 = null;
                                    org.telegram.ui.qj qjVar = anVar4.a0;
                                    if (qjVar != null) {
                                        qjVar.F3 = null;
                                        qjVar.G3 = false;
                                    }
                                    org.telegram.messenger.kj kjVar7 = anVar4.w5;
                                    if (kjVar7 != null) {
                                        i162 = ((org.telegram.ui.ActionBar.e2) anVar4).currentAccount;
                                        org.telegram.messenger.gj gjVar = anVar4.E5;
                                        kjVar7.e(i162, null, null, gjVar == anVar4.m4 ? null : gjVar, anVar4.C5, anVar4.G5);
                                    }
                                    anVar4.B8();
                                    break;
                                case 12:
                                    ea0 ea0Var6 = this.b;
                                    org.telegram.messenger.kj kjVar8 = ea0Var6.d0.d;
                                    if (kjVar8.o) {
                                        boolean z15 = !kjVar8.q;
                                        kjVar8.q = z15;
                                        ea0Var6.H.a(z15, true);
                                        ea0Var6.I.a(kjVar8.q, true);
                                        if (ea0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.gj) ea0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z16 = kjVar8.q;
                                            messageMedia2.force_small_media = z16;
                                            messageMedia2.force_large_media = !z16;
                                        }
                                        if (ea0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.gj) ea0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z17 = kjVar8.q;
                                            messageMedia.force_small_media = z17;
                                            messageMedia.force_large_media = !z17;
                                        }
                                        ea0Var6.i();
                                        ea0Var6.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    ea0 ea0Var7 = this.b;
                                    org.telegram.messenger.kj kjVar9 = ea0Var7.d0.d;
                                    boolean z18 = kjVar9.r;
                                    kjVar9.r = !z18;
                                    ea0Var7.F.a(z18, true);
                                    if (ea0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.gj) ea0Var7.r.e.get(0)).k) != null) {
                                        message4.invert_media = kjVar9.r;
                                    }
                                    if (ea0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.gj) ea0Var7.r.f.get(0)).k) != null) {
                                        message3.invert_media = kjVar9.r;
                                    }
                                    ea0Var7.i();
                                    ea0Var7.V = true;
                                    break;
                            }
                        }
                    });
                    actionBarPopupWindow$ActionBarPopupWindowLayout4.a(z0Var7, c8.ja.o(-1, 48));
                    org.telegram.ui.ActionBar.z0 z0Var8 = new org.telegram.ui.ActionBar.z0(1, context, ka0Var.G, false, true);
                    context2 = context;
                    z0Var8.j(org.telegram.messenger.hd.M0(2131751361, null), R.drawable.msg_delete, null);
                    int i27 = org.telegram.ui.ActionBar.j6.q7;
                    int i28 = org.telegram.ui.ActionBar.j6.p7;
                    z0Var8.c(i27, i28);
                    final int i29 = 11;
                    z0Var8.setOnClickListener(new View.OnClickListener(ea0Var3) { // from class: org.telegram.ui.Components.t90
                        public final /* synthetic */ ea0 b;

                        {
                            this.b = ea0Var3;
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
                                    ea0 ea0Var32 = this.b;
                                    ea0Var32.d0.d.d = null;
                                    ea0Var32.e.f(false);
                                    ea0Var32.h(false, false);
                                    ea0Var32.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    ea0 ea0Var4 = this.b;
                                    y90 y90Var2 = ea0Var4.e;
                                    ka0 ka0Var2 = ea0Var4.d0;
                                    if (ea0Var4.c(null) != null) {
                                        if (y90Var2.v - y90Var2.u <= org.telegram.messenger.np.s1(ka0Var2.x).p4) {
                                            org.telegram.ui.Cells.p9 p9Var = y90Var2.W;
                                            org.telegram.messenger.gj c11 = ea0Var4.c(p9Var != null ? ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() : null);
                                            org.telegram.messenger.kj kjVar5 = ka0Var2.d;
                                            int i172 = y90Var2.u;
                                            kjVar5.e = i172;
                                            int i182 = y90Var2.v;
                                            kjVar5.f = i182;
                                            kjVar5.d = org.telegram.ui.qm.b(i172, i182, c11);
                                            ka0Var2.b();
                                            ka0Var2.a(true);
                                            break;
                                        } else {
                                            ea0Var4.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    ea0 ea0Var5 = this.b;
                                    y90 y90Var3 = ea0Var5.e;
                                    ka0 ka0Var3 = ea0Var5.d0;
                                    org.telegram.messenger.kj kjVar6 = ka0Var3.d;
                                    int i192 = ka0Var3.x;
                                    boolean z142 = ka0Var3.b;
                                    if (kjVar6.d != null && !z142) {
                                        kjVar6.d = null;
                                        y90Var3.f(false);
                                        ea0Var5.h(false, true);
                                        ea0Var5.l(true);
                                        break;
                                    } else if (y90Var3.v - y90Var3.u <= org.telegram.messenger.np.s1(i192).p4) {
                                        org.telegram.messenger.gj c12 = ea0Var5.c(null);
                                        if (c12 != null) {
                                            if (!y90Var3.x()) {
                                                kjVar6.e = 0;
                                                int min = Math.min(org.telegram.messenger.np.s1(i192).p4, org.telegram.ui.qm.d(c12));
                                                kjVar6.f = min;
                                                kjVar6.d = org.telegram.ui.qm.b(kjVar6.e, min, c12);
                                                View d = ea0Var5.d();
                                                if (d instanceof org.telegram.ui.Cells.q1) {
                                                    y90Var3.a0((org.telegram.ui.Cells.q1) d, kjVar6.e, kjVar6.f);
                                                }
                                                if (!z142) {
                                                    ea0Var5.s.getSwipeBack().e(ea0Var5.J);
                                                }
                                                ea0Var5.h(true, true);
                                                break;
                                            } else {
                                                kjVar6.e = y90Var3.u;
                                                kjVar6.f = y90Var3.v;
                                                org.telegram.ui.Cells.p9 p9Var2 = y90Var3.W;
                                                kjVar6.d = org.telegram.ui.qm.b(kjVar6.e, kjVar6.f, ea0Var5.c(p9Var2 != null ? ((org.telegram.ui.Cells.q1) p9Var2).getMessageObject() : null));
                                                ka0Var3.b();
                                                ka0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        ea0Var5.g();
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
                                    ka0 ka0Var4 = this.b.d0;
                                    if (!ka0Var4.b) {
                                        org.telegram.ui.lk lkVar = (org.telegram.ui.lk) ka0Var4;
                                        lkVar.a(true);
                                        org.telegram.ui.an anVar = lkVar.I;
                                        anVar.E5 = null;
                                        anVar.C5 = null;
                                        anVar.w5.f(null, null, anVar.k6, null);
                                        anVar.B8();
                                        break;
                                    } else {
                                        org.telegram.ui.lk lkVar2 = (org.telegram.ui.lk) ka0Var4;
                                        lkVar2.a(true);
                                        org.telegram.ui.an anVar2 = lkVar2.I;
                                        anVar2.C5 = null;
                                        anVar2.ic(anVar2.E5);
                                        break;
                                    }
                                case 7:
                                    this.b.d0.c(true);
                                    break;
                                case 8:
                                    this.b.d0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.lk lkVar3 = (org.telegram.ui.lk) this.b.d0;
                                    lkVar3.a(true);
                                    org.telegram.ui.an anVar3 = lkVar3.I;
                                    anVar3.w5.d(null, anVar3.k6);
                                    anVar3.B8();
                                    break;
                                case 10:
                                    this.b.d0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.lk lkVar4 = (org.telegram.ui.lk) this.b.d0;
                                    lkVar4.a(true);
                                    org.telegram.ui.an anVar4 = lkVar4.I;
                                    anVar4.X5 = null;
                                    org.telegram.ui.qj qjVar = anVar4.a0;
                                    if (qjVar != null) {
                                        qjVar.F3 = null;
                                        qjVar.G3 = false;
                                    }
                                    org.telegram.messenger.kj kjVar7 = anVar4.w5;
                                    if (kjVar7 != null) {
                                        i162 = ((org.telegram.ui.ActionBar.e2) anVar4).currentAccount;
                                        org.telegram.messenger.gj gjVar = anVar4.E5;
                                        kjVar7.e(i162, null, null, gjVar == anVar4.m4 ? null : gjVar, anVar4.C5, anVar4.G5);
                                    }
                                    anVar4.B8();
                                    break;
                                case 12:
                                    ea0 ea0Var6 = this.b;
                                    org.telegram.messenger.kj kjVar8 = ea0Var6.d0.d;
                                    if (kjVar8.o) {
                                        boolean z15 = !kjVar8.q;
                                        kjVar8.q = z15;
                                        ea0Var6.H.a(z15, true);
                                        ea0Var6.I.a(kjVar8.q, true);
                                        if (ea0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.gj) ea0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z16 = kjVar8.q;
                                            messageMedia2.force_small_media = z16;
                                            messageMedia2.force_large_media = !z16;
                                        }
                                        if (ea0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.gj) ea0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z17 = kjVar8.q;
                                            messageMedia.force_small_media = z17;
                                            messageMedia.force_large_media = !z17;
                                        }
                                        ea0Var6.i();
                                        ea0Var6.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    ea0 ea0Var7 = this.b;
                                    org.telegram.messenger.kj kjVar9 = ea0Var7.d0.d;
                                    boolean z18 = kjVar9.r;
                                    kjVar9.r = !z18;
                                    ea0Var7.F.a(z18, true);
                                    if (ea0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.gj) ea0Var7.r.e.get(0)).k) != null) {
                                        message4.invert_media = kjVar9.r;
                                    }
                                    if (ea0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.gj) ea0Var7.r.f.get(0)).k) != null) {
                                        message3.invert_media = kjVar9.r;
                                    }
                                    ea0Var7.i();
                                    ea0Var7.V = true;
                                    break;
                            }
                        }
                    });
                    z0Var8.h(0.12f, i28);
                    actionBarPopupWindow$ActionBarPopupWindowLayout4.a(z0Var8, c8.ja.o(-1, 48));
                    final int i30 = 12;
                    frameLayout3.setOnClickListener(new View.OnClickListener(ea0Var3) { // from class: org.telegram.ui.Components.t90
                        public final /* synthetic */ ea0 b;

                        {
                            this.b = ea0Var3;
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
                                    ea0 ea0Var32 = this.b;
                                    ea0Var32.d0.d.d = null;
                                    ea0Var32.e.f(false);
                                    ea0Var32.h(false, false);
                                    ea0Var32.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    ea0 ea0Var4 = this.b;
                                    y90 y90Var2 = ea0Var4.e;
                                    ka0 ka0Var2 = ea0Var4.d0;
                                    if (ea0Var4.c(null) != null) {
                                        if (y90Var2.v - y90Var2.u <= org.telegram.messenger.np.s1(ka0Var2.x).p4) {
                                            org.telegram.ui.Cells.p9 p9Var = y90Var2.W;
                                            org.telegram.messenger.gj c11 = ea0Var4.c(p9Var != null ? ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() : null);
                                            org.telegram.messenger.kj kjVar5 = ka0Var2.d;
                                            int i172 = y90Var2.u;
                                            kjVar5.e = i172;
                                            int i182 = y90Var2.v;
                                            kjVar5.f = i182;
                                            kjVar5.d = org.telegram.ui.qm.b(i172, i182, c11);
                                            ka0Var2.b();
                                            ka0Var2.a(true);
                                            break;
                                        } else {
                                            ea0Var4.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    ea0 ea0Var5 = this.b;
                                    y90 y90Var3 = ea0Var5.e;
                                    ka0 ka0Var3 = ea0Var5.d0;
                                    org.telegram.messenger.kj kjVar6 = ka0Var3.d;
                                    int i192 = ka0Var3.x;
                                    boolean z142 = ka0Var3.b;
                                    if (kjVar6.d != null && !z142) {
                                        kjVar6.d = null;
                                        y90Var3.f(false);
                                        ea0Var5.h(false, true);
                                        ea0Var5.l(true);
                                        break;
                                    } else if (y90Var3.v - y90Var3.u <= org.telegram.messenger.np.s1(i192).p4) {
                                        org.telegram.messenger.gj c12 = ea0Var5.c(null);
                                        if (c12 != null) {
                                            if (!y90Var3.x()) {
                                                kjVar6.e = 0;
                                                int min = Math.min(org.telegram.messenger.np.s1(i192).p4, org.telegram.ui.qm.d(c12));
                                                kjVar6.f = min;
                                                kjVar6.d = org.telegram.ui.qm.b(kjVar6.e, min, c12);
                                                View d = ea0Var5.d();
                                                if (d instanceof org.telegram.ui.Cells.q1) {
                                                    y90Var3.a0((org.telegram.ui.Cells.q1) d, kjVar6.e, kjVar6.f);
                                                }
                                                if (!z142) {
                                                    ea0Var5.s.getSwipeBack().e(ea0Var5.J);
                                                }
                                                ea0Var5.h(true, true);
                                                break;
                                            } else {
                                                kjVar6.e = y90Var3.u;
                                                kjVar6.f = y90Var3.v;
                                                org.telegram.ui.Cells.p9 p9Var2 = y90Var3.W;
                                                kjVar6.d = org.telegram.ui.qm.b(kjVar6.e, kjVar6.f, ea0Var5.c(p9Var2 != null ? ((org.telegram.ui.Cells.q1) p9Var2).getMessageObject() : null));
                                                ka0Var3.b();
                                                ka0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        ea0Var5.g();
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
                                    ka0 ka0Var4 = this.b.d0;
                                    if (!ka0Var4.b) {
                                        org.telegram.ui.lk lkVar = (org.telegram.ui.lk) ka0Var4;
                                        lkVar.a(true);
                                        org.telegram.ui.an anVar = lkVar.I;
                                        anVar.E5 = null;
                                        anVar.C5 = null;
                                        anVar.w5.f(null, null, anVar.k6, null);
                                        anVar.B8();
                                        break;
                                    } else {
                                        org.telegram.ui.lk lkVar2 = (org.telegram.ui.lk) ka0Var4;
                                        lkVar2.a(true);
                                        org.telegram.ui.an anVar2 = lkVar2.I;
                                        anVar2.C5 = null;
                                        anVar2.ic(anVar2.E5);
                                        break;
                                    }
                                case 7:
                                    this.b.d0.c(true);
                                    break;
                                case 8:
                                    this.b.d0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.lk lkVar3 = (org.telegram.ui.lk) this.b.d0;
                                    lkVar3.a(true);
                                    org.telegram.ui.an anVar3 = lkVar3.I;
                                    anVar3.w5.d(null, anVar3.k6);
                                    anVar3.B8();
                                    break;
                                case 10:
                                    this.b.d0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.lk lkVar4 = (org.telegram.ui.lk) this.b.d0;
                                    lkVar4.a(true);
                                    org.telegram.ui.an anVar4 = lkVar4.I;
                                    anVar4.X5 = null;
                                    org.telegram.ui.qj qjVar = anVar4.a0;
                                    if (qjVar != null) {
                                        qjVar.F3 = null;
                                        qjVar.G3 = false;
                                    }
                                    org.telegram.messenger.kj kjVar7 = anVar4.w5;
                                    if (kjVar7 != null) {
                                        i162 = ((org.telegram.ui.ActionBar.e2) anVar4).currentAccount;
                                        org.telegram.messenger.gj gjVar = anVar4.E5;
                                        kjVar7.e(i162, null, null, gjVar == anVar4.m4 ? null : gjVar, anVar4.C5, anVar4.G5);
                                    }
                                    anVar4.B8();
                                    break;
                                case 12:
                                    ea0 ea0Var6 = this.b;
                                    org.telegram.messenger.kj kjVar8 = ea0Var6.d0.d;
                                    if (kjVar8.o) {
                                        boolean z15 = !kjVar8.q;
                                        kjVar8.q = z15;
                                        ea0Var6.H.a(z15, true);
                                        ea0Var6.I.a(kjVar8.q, true);
                                        if (ea0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.gj) ea0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z16 = kjVar8.q;
                                            messageMedia2.force_small_media = z16;
                                            messageMedia2.force_large_media = !z16;
                                        }
                                        if (ea0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.gj) ea0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z17 = kjVar8.q;
                                            messageMedia.force_small_media = z17;
                                            messageMedia.force_large_media = !z17;
                                        }
                                        ea0Var6.i();
                                        ea0Var6.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    ea0 ea0Var7 = this.b;
                                    org.telegram.messenger.kj kjVar9 = ea0Var7.d0.d;
                                    boolean z18 = kjVar9.r;
                                    kjVar9.r = !z18;
                                    ea0Var7.F.a(z18, true);
                                    if (ea0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.gj) ea0Var7.r.e.get(0)).k) != null) {
                                        message4.invert_media = kjVar9.r;
                                    }
                                    if (ea0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.gj) ea0Var7.r.f.get(0)).k) != null) {
                                        message3.invert_media = kjVar9.r;
                                    }
                                    ea0Var7.i();
                                    ea0Var7.V = true;
                                    break;
                            }
                        }
                    });
                    final int i31 = 13;
                    ja0Var3.setOnClickListener(new View.OnClickListener(ea0Var3) { // from class: org.telegram.ui.Components.t90
                        public final /* synthetic */ ea0 b;

                        {
                            this.b = ea0Var3;
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
                            switch (i31) {
                                case 0:
                                    ea0 ea0Var32 = this.b;
                                    ea0Var32.d0.d.d = null;
                                    ea0Var32.e.f(false);
                                    ea0Var32.h(false, false);
                                    ea0Var32.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    ea0 ea0Var4 = this.b;
                                    y90 y90Var2 = ea0Var4.e;
                                    ka0 ka0Var2 = ea0Var4.d0;
                                    if (ea0Var4.c(null) != null) {
                                        if (y90Var2.v - y90Var2.u <= org.telegram.messenger.np.s1(ka0Var2.x).p4) {
                                            org.telegram.ui.Cells.p9 p9Var = y90Var2.W;
                                            org.telegram.messenger.gj c11 = ea0Var4.c(p9Var != null ? ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() : null);
                                            org.telegram.messenger.kj kjVar5 = ka0Var2.d;
                                            int i172 = y90Var2.u;
                                            kjVar5.e = i172;
                                            int i182 = y90Var2.v;
                                            kjVar5.f = i182;
                                            kjVar5.d = org.telegram.ui.qm.b(i172, i182, c11);
                                            ka0Var2.b();
                                            ka0Var2.a(true);
                                            break;
                                        } else {
                                            ea0Var4.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    ea0 ea0Var5 = this.b;
                                    y90 y90Var3 = ea0Var5.e;
                                    ka0 ka0Var3 = ea0Var5.d0;
                                    org.telegram.messenger.kj kjVar6 = ka0Var3.d;
                                    int i192 = ka0Var3.x;
                                    boolean z142 = ka0Var3.b;
                                    if (kjVar6.d != null && !z142) {
                                        kjVar6.d = null;
                                        y90Var3.f(false);
                                        ea0Var5.h(false, true);
                                        ea0Var5.l(true);
                                        break;
                                    } else if (y90Var3.v - y90Var3.u <= org.telegram.messenger.np.s1(i192).p4) {
                                        org.telegram.messenger.gj c12 = ea0Var5.c(null);
                                        if (c12 != null) {
                                            if (!y90Var3.x()) {
                                                kjVar6.e = 0;
                                                int min = Math.min(org.telegram.messenger.np.s1(i192).p4, org.telegram.ui.qm.d(c12));
                                                kjVar6.f = min;
                                                kjVar6.d = org.telegram.ui.qm.b(kjVar6.e, min, c12);
                                                View d = ea0Var5.d();
                                                if (d instanceof org.telegram.ui.Cells.q1) {
                                                    y90Var3.a0((org.telegram.ui.Cells.q1) d, kjVar6.e, kjVar6.f);
                                                }
                                                if (!z142) {
                                                    ea0Var5.s.getSwipeBack().e(ea0Var5.J);
                                                }
                                                ea0Var5.h(true, true);
                                                break;
                                            } else {
                                                kjVar6.e = y90Var3.u;
                                                kjVar6.f = y90Var3.v;
                                                org.telegram.ui.Cells.p9 p9Var2 = y90Var3.W;
                                                kjVar6.d = org.telegram.ui.qm.b(kjVar6.e, kjVar6.f, ea0Var5.c(p9Var2 != null ? ((org.telegram.ui.Cells.q1) p9Var2).getMessageObject() : null));
                                                ka0Var3.b();
                                                ka0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        ea0Var5.g();
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
                                    ka0 ka0Var4 = this.b.d0;
                                    if (!ka0Var4.b) {
                                        org.telegram.ui.lk lkVar = (org.telegram.ui.lk) ka0Var4;
                                        lkVar.a(true);
                                        org.telegram.ui.an anVar = lkVar.I;
                                        anVar.E5 = null;
                                        anVar.C5 = null;
                                        anVar.w5.f(null, null, anVar.k6, null);
                                        anVar.B8();
                                        break;
                                    } else {
                                        org.telegram.ui.lk lkVar2 = (org.telegram.ui.lk) ka0Var4;
                                        lkVar2.a(true);
                                        org.telegram.ui.an anVar2 = lkVar2.I;
                                        anVar2.C5 = null;
                                        anVar2.ic(anVar2.E5);
                                        break;
                                    }
                                case 7:
                                    this.b.d0.c(true);
                                    break;
                                case 8:
                                    this.b.d0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.lk lkVar3 = (org.telegram.ui.lk) this.b.d0;
                                    lkVar3.a(true);
                                    org.telegram.ui.an anVar3 = lkVar3.I;
                                    anVar3.w5.d(null, anVar3.k6);
                                    anVar3.B8();
                                    break;
                                case 10:
                                    this.b.d0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.lk lkVar4 = (org.telegram.ui.lk) this.b.d0;
                                    lkVar4.a(true);
                                    org.telegram.ui.an anVar4 = lkVar4.I;
                                    anVar4.X5 = null;
                                    org.telegram.ui.qj qjVar = anVar4.a0;
                                    if (qjVar != null) {
                                        qjVar.F3 = null;
                                        qjVar.G3 = false;
                                    }
                                    org.telegram.messenger.kj kjVar7 = anVar4.w5;
                                    if (kjVar7 != null) {
                                        i162 = ((org.telegram.ui.ActionBar.e2) anVar4).currentAccount;
                                        org.telegram.messenger.gj gjVar = anVar4.E5;
                                        kjVar7.e(i162, null, null, gjVar == anVar4.m4 ? null : gjVar, anVar4.C5, anVar4.G5);
                                    }
                                    anVar4.B8();
                                    break;
                                case 12:
                                    ea0 ea0Var6 = this.b;
                                    org.telegram.messenger.kj kjVar8 = ea0Var6.d0.d;
                                    if (kjVar8.o) {
                                        boolean z15 = !kjVar8.q;
                                        kjVar8.q = z15;
                                        ea0Var6.H.a(z15, true);
                                        ea0Var6.I.a(kjVar8.q, true);
                                        if (ea0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.gj) ea0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z16 = kjVar8.q;
                                            messageMedia2.force_small_media = z16;
                                            messageMedia2.force_large_media = !z16;
                                        }
                                        if (ea0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.gj) ea0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z17 = kjVar8.q;
                                            messageMedia.force_small_media = z17;
                                            messageMedia.force_large_media = !z17;
                                        }
                                        ea0Var6.i();
                                        ea0Var6.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    ea0 ea0Var7 = this.b;
                                    org.telegram.messenger.kj kjVar9 = ea0Var7.d0.d;
                                    boolean z18 = kjVar9.r;
                                    kjVar9.r = !z18;
                                    ea0Var7.F.a(z18, true);
                                    if (ea0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.gj) ea0Var7.r.e.get(0)).k) != null) {
                                        message4.invert_media = kjVar9.r;
                                    }
                                    if (ea0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.gj) ea0Var7.r.f.get(0)).k) != null) {
                                        message3.invert_media = kjVar9.r;
                                    }
                                    ea0Var7.i();
                                    ea0Var7.V = true;
                                    break;
                            }
                        }
                    });
                    ea0Var2 = ea0Var3;
                    i10 = ea0Var2.a;
                    if (i10 == 1) {
                    }
                    n10 = ea0Var2.e.n(context2);
                    ea0Var2.d = n10;
                    n10.setElevation(org.telegram.messenger.g0.L(8.0f));
                    n10.setOutlineProvider(viewOutlineProvider);
                    if (n10.getParent() instanceof ViewGroup) {
                    }
                    ea0Var2.addView(n10, c8.ja.d(-1, -1.0f, 51, 0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / org.telegram.messenger.g0.p, 0.0f, 0.0f));
                    ea0Var2.e.S(ea0Var2.f);
                }
            }
        } else {
            if (!org.telegram.messenger.m10.i(ka0Var.x).q()) {
                for (int i32 = 0; i32 < kjVar.b.e.size(); i32++) {
                    if (((org.telegram.messenger.gj) kjVar.b.e.get(i32)).D == 36) {
                        z10 = false;
                        break;
                    }
                }
            }
            z10 = true;
            ja0 ja0Var6 = new ja0(context, R.raw.name_hide, org.telegram.messenger.hd.M0(kjVar.j ? 2131745332 : 2131745331, null), R.raw.name_show, org.telegram.messenger.hd.M0(kjVar.j ? 2131749309 : 2131749308, null), ka0Var.G);
            this.s.a(ja0Var6, c8.ja.o(-1, 48));
            if (kjVar.g) {
                ja0Var = ja0Var6;
                ja0 ja0Var7 = new ja0(context, R.raw.caption_hide, org.telegram.messenger.hd.M0(2131745344, null), R.raw.caption_show, org.telegram.messenger.hd.M0(2131749321, null), ka0Var.G);
                ja0Var7.a(kjVar.l, false);
                this.s.a(ja0Var7, c8.ja.o(-1, 48));
                ja0Var2 = ja0Var7;
            } else {
                ja0Var = ja0Var6;
                ja0Var2 = null;
            }
            org.telegram.ui.ActionBar.z0 z0Var9 = new org.telegram.ui.ActionBar.z0(0, context, ka0Var.G, true, false);
            final int i33 = 7;
            z0Var9.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.t90
                public final /* synthetic */ ea0 b;

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
                            ea0 ea0Var32 = this.b;
                            ea0Var32.d0.d.d = null;
                            ea0Var32.e.f(false);
                            ea0Var32.h(false, false);
                            ea0Var32.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            ea0 ea0Var4 = this.b;
                            y90 y90Var2 = ea0Var4.e;
                            ka0 ka0Var2 = ea0Var4.d0;
                            if (ea0Var4.c(null) != null) {
                                if (y90Var2.v - y90Var2.u <= org.telegram.messenger.np.s1(ka0Var2.x).p4) {
                                    org.telegram.ui.Cells.p9 p9Var = y90Var2.W;
                                    org.telegram.messenger.gj c11 = ea0Var4.c(p9Var != null ? ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() : null);
                                    org.telegram.messenger.kj kjVar5 = ka0Var2.d;
                                    int i172 = y90Var2.u;
                                    kjVar5.e = i172;
                                    int i182 = y90Var2.v;
                                    kjVar5.f = i182;
                                    kjVar5.d = org.telegram.ui.qm.b(i172, i182, c11);
                                    ka0Var2.b();
                                    ka0Var2.a(true);
                                    break;
                                } else {
                                    ea0Var4.g();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            ea0 ea0Var5 = this.b;
                            y90 y90Var3 = ea0Var5.e;
                            ka0 ka0Var3 = ea0Var5.d0;
                            org.telegram.messenger.kj kjVar6 = ka0Var3.d;
                            int i192 = ka0Var3.x;
                            boolean z142 = ka0Var3.b;
                            if (kjVar6.d != null && !z142) {
                                kjVar6.d = null;
                                y90Var3.f(false);
                                ea0Var5.h(false, true);
                                ea0Var5.l(true);
                                break;
                            } else if (y90Var3.v - y90Var3.u <= org.telegram.messenger.np.s1(i192).p4) {
                                org.telegram.messenger.gj c12 = ea0Var5.c(null);
                                if (c12 != null) {
                                    if (!y90Var3.x()) {
                                        kjVar6.e = 0;
                                        int min = Math.min(org.telegram.messenger.np.s1(i192).p4, org.telegram.ui.qm.d(c12));
                                        kjVar6.f = min;
                                        kjVar6.d = org.telegram.ui.qm.b(kjVar6.e, min, c12);
                                        View d = ea0Var5.d();
                                        if (d instanceof org.telegram.ui.Cells.q1) {
                                            y90Var3.a0((org.telegram.ui.Cells.q1) d, kjVar6.e, kjVar6.f);
                                        }
                                        if (!z142) {
                                            ea0Var5.s.getSwipeBack().e(ea0Var5.J);
                                        }
                                        ea0Var5.h(true, true);
                                        break;
                                    } else {
                                        kjVar6.e = y90Var3.u;
                                        kjVar6.f = y90Var3.v;
                                        org.telegram.ui.Cells.p9 p9Var2 = y90Var3.W;
                                        kjVar6.d = org.telegram.ui.qm.b(kjVar6.e, kjVar6.f, ea0Var5.c(p9Var2 != null ? ((org.telegram.ui.Cells.q1) p9Var2).getMessageObject() : null));
                                        ka0Var3.b();
                                        ka0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                ea0Var5.g();
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
                            ka0 ka0Var4 = this.b.d0;
                            if (!ka0Var4.b) {
                                org.telegram.ui.lk lkVar = (org.telegram.ui.lk) ka0Var4;
                                lkVar.a(true);
                                org.telegram.ui.an anVar = lkVar.I;
                                anVar.E5 = null;
                                anVar.C5 = null;
                                anVar.w5.f(null, null, anVar.k6, null);
                                anVar.B8();
                                break;
                            } else {
                                org.telegram.ui.lk lkVar2 = (org.telegram.ui.lk) ka0Var4;
                                lkVar2.a(true);
                                org.telegram.ui.an anVar2 = lkVar2.I;
                                anVar2.C5 = null;
                                anVar2.ic(anVar2.E5);
                                break;
                            }
                        case 7:
                            this.b.d0.c(true);
                            break;
                        case 8:
                            this.b.d0.a(true);
                            break;
                        case 9:
                            org.telegram.ui.lk lkVar3 = (org.telegram.ui.lk) this.b.d0;
                            lkVar3.a(true);
                            org.telegram.ui.an anVar3 = lkVar3.I;
                            anVar3.w5.d(null, anVar3.k6);
                            anVar3.B8();
                            break;
                        case 10:
                            this.b.d0.a(true);
                            break;
                        case 11:
                            org.telegram.ui.lk lkVar4 = (org.telegram.ui.lk) this.b.d0;
                            lkVar4.a(true);
                            org.telegram.ui.an anVar4 = lkVar4.I;
                            anVar4.X5 = null;
                            org.telegram.ui.qj qjVar = anVar4.a0;
                            if (qjVar != null) {
                                qjVar.F3 = null;
                                qjVar.G3 = false;
                            }
                            org.telegram.messenger.kj kjVar7 = anVar4.w5;
                            if (kjVar7 != null) {
                                i162 = ((org.telegram.ui.ActionBar.e2) anVar4).currentAccount;
                                org.telegram.messenger.gj gjVar = anVar4.E5;
                                kjVar7.e(i162, null, null, gjVar == anVar4.m4 ? null : gjVar, anVar4.C5, anVar4.G5);
                            }
                            anVar4.B8();
                            break;
                        case 12:
                            ea0 ea0Var6 = this.b;
                            org.telegram.messenger.kj kjVar8 = ea0Var6.d0.d;
                            if (kjVar8.o) {
                                boolean z15 = !kjVar8.q;
                                kjVar8.q = z15;
                                ea0Var6.H.a(z15, true);
                                ea0Var6.I.a(kjVar8.q, true);
                                if (ea0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.gj) ea0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z16 = kjVar8.q;
                                    messageMedia2.force_small_media = z16;
                                    messageMedia2.force_large_media = !z16;
                                }
                                if (ea0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.gj) ea0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                    boolean z17 = kjVar8.q;
                                    messageMedia.force_small_media = z17;
                                    messageMedia.force_large_media = !z17;
                                }
                                ea0Var6.i();
                                ea0Var6.V = true;
                                break;
                            }
                            break;
                        default:
                            ea0 ea0Var7 = this.b;
                            org.telegram.messenger.kj kjVar9 = ea0Var7.d0.d;
                            boolean z18 = kjVar9.r;
                            kjVar9.r = !z18;
                            ea0Var7.F.a(z18, true);
                            if (ea0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.gj) ea0Var7.r.e.get(0)).k) != null) {
                                message4.invert_media = kjVar9.r;
                            }
                            if (ea0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.gj) ea0Var7.r.f.get(0)).k) != null) {
                                message3.invert_media = kjVar9.r;
                            }
                            ea0Var7.i();
                            ea0Var7.V = true;
                            break;
                    }
                }
            });
            z0Var9.j(org.telegram.messenger.hd.M0(2131752532, null), R.drawable.msg_forward_replace, null);
            this.s.a(z0Var9, c8.ja.o(-1, 48));
            org.telegram.ui.ActionBar.d1 d1Var4 = new org.telegram.ui.ActionBar.d1(context, ga0Var);
            org.telegram.ui.ActionBar.q6.i(d1Var4, org.telegram.ui.ActionBar.q6.K(0.06f, org.telegram.ui.ActionBar.j6.E8), ga0Var);
            d1Var4.setTag(R.id.fit_width_tag, 1);
            final int i34 = 8;
            this.s.a(d1Var4, c8.ja.o(-1, 8));
            org.telegram.ui.ActionBar.z0 z0Var10 = new org.telegram.ui.ActionBar.z0(1, context, ka0Var.G, false, false);
            z0Var10.j(org.telegram.messenger.hd.M0(2131754218, null), R.drawable.msg_select, null);
            z0Var10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.t90
                public final /* synthetic */ ea0 b;

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
                    switch (i34) {
                        case 0:
                            ea0 ea0Var32 = this.b;
                            ea0Var32.d0.d.d = null;
                            ea0Var32.e.f(false);
                            ea0Var32.h(false, false);
                            ea0Var32.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            ea0 ea0Var4 = this.b;
                            y90 y90Var2 = ea0Var4.e;
                            ka0 ka0Var2 = ea0Var4.d0;
                            if (ea0Var4.c(null) != null) {
                                if (y90Var2.v - y90Var2.u <= org.telegram.messenger.np.s1(ka0Var2.x).p4) {
                                    org.telegram.ui.Cells.p9 p9Var = y90Var2.W;
                                    org.telegram.messenger.gj c11 = ea0Var4.c(p9Var != null ? ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() : null);
                                    org.telegram.messenger.kj kjVar5 = ka0Var2.d;
                                    int i172 = y90Var2.u;
                                    kjVar5.e = i172;
                                    int i182 = y90Var2.v;
                                    kjVar5.f = i182;
                                    kjVar5.d = org.telegram.ui.qm.b(i172, i182, c11);
                                    ka0Var2.b();
                                    ka0Var2.a(true);
                                    break;
                                } else {
                                    ea0Var4.g();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            ea0 ea0Var5 = this.b;
                            y90 y90Var3 = ea0Var5.e;
                            ka0 ka0Var3 = ea0Var5.d0;
                            org.telegram.messenger.kj kjVar6 = ka0Var3.d;
                            int i192 = ka0Var3.x;
                            boolean z142 = ka0Var3.b;
                            if (kjVar6.d != null && !z142) {
                                kjVar6.d = null;
                                y90Var3.f(false);
                                ea0Var5.h(false, true);
                                ea0Var5.l(true);
                                break;
                            } else if (y90Var3.v - y90Var3.u <= org.telegram.messenger.np.s1(i192).p4) {
                                org.telegram.messenger.gj c12 = ea0Var5.c(null);
                                if (c12 != null) {
                                    if (!y90Var3.x()) {
                                        kjVar6.e = 0;
                                        int min = Math.min(org.telegram.messenger.np.s1(i192).p4, org.telegram.ui.qm.d(c12));
                                        kjVar6.f = min;
                                        kjVar6.d = org.telegram.ui.qm.b(kjVar6.e, min, c12);
                                        View d = ea0Var5.d();
                                        if (d instanceof org.telegram.ui.Cells.q1) {
                                            y90Var3.a0((org.telegram.ui.Cells.q1) d, kjVar6.e, kjVar6.f);
                                        }
                                        if (!z142) {
                                            ea0Var5.s.getSwipeBack().e(ea0Var5.J);
                                        }
                                        ea0Var5.h(true, true);
                                        break;
                                    } else {
                                        kjVar6.e = y90Var3.u;
                                        kjVar6.f = y90Var3.v;
                                        org.telegram.ui.Cells.p9 p9Var2 = y90Var3.W;
                                        kjVar6.d = org.telegram.ui.qm.b(kjVar6.e, kjVar6.f, ea0Var5.c(p9Var2 != null ? ((org.telegram.ui.Cells.q1) p9Var2).getMessageObject() : null));
                                        ka0Var3.b();
                                        ka0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                ea0Var5.g();
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
                            ka0 ka0Var4 = this.b.d0;
                            if (!ka0Var4.b) {
                                org.telegram.ui.lk lkVar = (org.telegram.ui.lk) ka0Var4;
                                lkVar.a(true);
                                org.telegram.ui.an anVar = lkVar.I;
                                anVar.E5 = null;
                                anVar.C5 = null;
                                anVar.w5.f(null, null, anVar.k6, null);
                                anVar.B8();
                                break;
                            } else {
                                org.telegram.ui.lk lkVar2 = (org.telegram.ui.lk) ka0Var4;
                                lkVar2.a(true);
                                org.telegram.ui.an anVar2 = lkVar2.I;
                                anVar2.C5 = null;
                                anVar2.ic(anVar2.E5);
                                break;
                            }
                        case 7:
                            this.b.d0.c(true);
                            break;
                        case 8:
                            this.b.d0.a(true);
                            break;
                        case 9:
                            org.telegram.ui.lk lkVar3 = (org.telegram.ui.lk) this.b.d0;
                            lkVar3.a(true);
                            org.telegram.ui.an anVar3 = lkVar3.I;
                            anVar3.w5.d(null, anVar3.k6);
                            anVar3.B8();
                            break;
                        case 10:
                            this.b.d0.a(true);
                            break;
                        case 11:
                            org.telegram.ui.lk lkVar4 = (org.telegram.ui.lk) this.b.d0;
                            lkVar4.a(true);
                            org.telegram.ui.an anVar4 = lkVar4.I;
                            anVar4.X5 = null;
                            org.telegram.ui.qj qjVar = anVar4.a0;
                            if (qjVar != null) {
                                qjVar.F3 = null;
                                qjVar.G3 = false;
                            }
                            org.telegram.messenger.kj kjVar7 = anVar4.w5;
                            if (kjVar7 != null) {
                                i162 = ((org.telegram.ui.ActionBar.e2) anVar4).currentAccount;
                                org.telegram.messenger.gj gjVar = anVar4.E5;
                                kjVar7.e(i162, null, null, gjVar == anVar4.m4 ? null : gjVar, anVar4.C5, anVar4.G5);
                            }
                            anVar4.B8();
                            break;
                        case 12:
                            ea0 ea0Var6 = this.b;
                            org.telegram.messenger.kj kjVar8 = ea0Var6.d0.d;
                            if (kjVar8.o) {
                                boolean z15 = !kjVar8.q;
                                kjVar8.q = z15;
                                ea0Var6.H.a(z15, true);
                                ea0Var6.I.a(kjVar8.q, true);
                                if (ea0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.gj) ea0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z16 = kjVar8.q;
                                    messageMedia2.force_small_media = z16;
                                    messageMedia2.force_large_media = !z16;
                                }
                                if (ea0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.gj) ea0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                    boolean z17 = kjVar8.q;
                                    messageMedia.force_small_media = z17;
                                    messageMedia.force_large_media = !z17;
                                }
                                ea0Var6.i();
                                ea0Var6.V = true;
                                break;
                            }
                            break;
                        default:
                            ea0 ea0Var7 = this.b;
                            org.telegram.messenger.kj kjVar9 = ea0Var7.d0.d;
                            boolean z18 = kjVar9.r;
                            kjVar9.r = !z18;
                            ea0Var7.F.a(z18, true);
                            if (ea0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.gj) ea0Var7.r.e.get(0)).k) != null) {
                                message4.invert_media = kjVar9.r;
                            }
                            if (ea0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.gj) ea0Var7.r.f.get(0)).k) != null) {
                                message3.invert_media = kjVar9.r;
                            }
                            ea0Var7.i();
                            ea0Var7.V = true;
                            break;
                    }
                }
            });
            this.s.a(z0Var10, c8.ja.o(-1, 48));
            org.telegram.ui.ActionBar.z0 z0Var11 = new org.telegram.ui.ActionBar.z0(1, context, ka0Var.G, false, true);
            z0Var11.j(org.telegram.messenger.hd.M0(2131751362, null), R.drawable.msg_delete, null);
            int i35 = org.telegram.ui.ActionBar.j6.q7;
            int i36 = org.telegram.ui.ActionBar.j6.p7;
            z0Var11.c(i35, i36);
            final int i37 = 9;
            z0Var11.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.t90
                public final /* synthetic */ ea0 b;

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
                    switch (i37) {
                        case 0:
                            ea0 ea0Var32 = this.b;
                            ea0Var32.d0.d.d = null;
                            ea0Var32.e.f(false);
                            ea0Var32.h(false, false);
                            ea0Var32.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            ea0 ea0Var4 = this.b;
                            y90 y90Var2 = ea0Var4.e;
                            ka0 ka0Var2 = ea0Var4.d0;
                            if (ea0Var4.c(null) != null) {
                                if (y90Var2.v - y90Var2.u <= org.telegram.messenger.np.s1(ka0Var2.x).p4) {
                                    org.telegram.ui.Cells.p9 p9Var = y90Var2.W;
                                    org.telegram.messenger.gj c11 = ea0Var4.c(p9Var != null ? ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() : null);
                                    org.telegram.messenger.kj kjVar5 = ka0Var2.d;
                                    int i172 = y90Var2.u;
                                    kjVar5.e = i172;
                                    int i182 = y90Var2.v;
                                    kjVar5.f = i182;
                                    kjVar5.d = org.telegram.ui.qm.b(i172, i182, c11);
                                    ka0Var2.b();
                                    ka0Var2.a(true);
                                    break;
                                } else {
                                    ea0Var4.g();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            ea0 ea0Var5 = this.b;
                            y90 y90Var3 = ea0Var5.e;
                            ka0 ka0Var3 = ea0Var5.d0;
                            org.telegram.messenger.kj kjVar6 = ka0Var3.d;
                            int i192 = ka0Var3.x;
                            boolean z142 = ka0Var3.b;
                            if (kjVar6.d != null && !z142) {
                                kjVar6.d = null;
                                y90Var3.f(false);
                                ea0Var5.h(false, true);
                                ea0Var5.l(true);
                                break;
                            } else if (y90Var3.v - y90Var3.u <= org.telegram.messenger.np.s1(i192).p4) {
                                org.telegram.messenger.gj c12 = ea0Var5.c(null);
                                if (c12 != null) {
                                    if (!y90Var3.x()) {
                                        kjVar6.e = 0;
                                        int min = Math.min(org.telegram.messenger.np.s1(i192).p4, org.telegram.ui.qm.d(c12));
                                        kjVar6.f = min;
                                        kjVar6.d = org.telegram.ui.qm.b(kjVar6.e, min, c12);
                                        View d = ea0Var5.d();
                                        if (d instanceof org.telegram.ui.Cells.q1) {
                                            y90Var3.a0((org.telegram.ui.Cells.q1) d, kjVar6.e, kjVar6.f);
                                        }
                                        if (!z142) {
                                            ea0Var5.s.getSwipeBack().e(ea0Var5.J);
                                        }
                                        ea0Var5.h(true, true);
                                        break;
                                    } else {
                                        kjVar6.e = y90Var3.u;
                                        kjVar6.f = y90Var3.v;
                                        org.telegram.ui.Cells.p9 p9Var2 = y90Var3.W;
                                        kjVar6.d = org.telegram.ui.qm.b(kjVar6.e, kjVar6.f, ea0Var5.c(p9Var2 != null ? ((org.telegram.ui.Cells.q1) p9Var2).getMessageObject() : null));
                                        ka0Var3.b();
                                        ka0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                ea0Var5.g();
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
                            ka0 ka0Var4 = this.b.d0;
                            if (!ka0Var4.b) {
                                org.telegram.ui.lk lkVar = (org.telegram.ui.lk) ka0Var4;
                                lkVar.a(true);
                                org.telegram.ui.an anVar = lkVar.I;
                                anVar.E5 = null;
                                anVar.C5 = null;
                                anVar.w5.f(null, null, anVar.k6, null);
                                anVar.B8();
                                break;
                            } else {
                                org.telegram.ui.lk lkVar2 = (org.telegram.ui.lk) ka0Var4;
                                lkVar2.a(true);
                                org.telegram.ui.an anVar2 = lkVar2.I;
                                anVar2.C5 = null;
                                anVar2.ic(anVar2.E5);
                                break;
                            }
                        case 7:
                            this.b.d0.c(true);
                            break;
                        case 8:
                            this.b.d0.a(true);
                            break;
                        case 9:
                            org.telegram.ui.lk lkVar3 = (org.telegram.ui.lk) this.b.d0;
                            lkVar3.a(true);
                            org.telegram.ui.an anVar3 = lkVar3.I;
                            anVar3.w5.d(null, anVar3.k6);
                            anVar3.B8();
                            break;
                        case 10:
                            this.b.d0.a(true);
                            break;
                        case 11:
                            org.telegram.ui.lk lkVar4 = (org.telegram.ui.lk) this.b.d0;
                            lkVar4.a(true);
                            org.telegram.ui.an anVar4 = lkVar4.I;
                            anVar4.X5 = null;
                            org.telegram.ui.qj qjVar = anVar4.a0;
                            if (qjVar != null) {
                                qjVar.F3 = null;
                                qjVar.G3 = false;
                            }
                            org.telegram.messenger.kj kjVar7 = anVar4.w5;
                            if (kjVar7 != null) {
                                i162 = ((org.telegram.ui.ActionBar.e2) anVar4).currentAccount;
                                org.telegram.messenger.gj gjVar = anVar4.E5;
                                kjVar7.e(i162, null, null, gjVar == anVar4.m4 ? null : gjVar, anVar4.C5, anVar4.G5);
                            }
                            anVar4.B8();
                            break;
                        case 12:
                            ea0 ea0Var6 = this.b;
                            org.telegram.messenger.kj kjVar8 = ea0Var6.d0.d;
                            if (kjVar8.o) {
                                boolean z15 = !kjVar8.q;
                                kjVar8.q = z15;
                                ea0Var6.H.a(z15, true);
                                ea0Var6.I.a(kjVar8.q, true);
                                if (ea0Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.gj) ea0Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z16 = kjVar8.q;
                                    messageMedia2.force_small_media = z16;
                                    messageMedia2.force_large_media = !z16;
                                }
                                if (ea0Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.gj) ea0Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                    boolean z17 = kjVar8.q;
                                    messageMedia.force_small_media = z17;
                                    messageMedia.force_large_media = !z17;
                                }
                                ea0Var6.i();
                                ea0Var6.V = true;
                                break;
                            }
                            break;
                        default:
                            ea0 ea0Var7 = this.b;
                            org.telegram.messenger.kj kjVar9 = ea0Var7.d0.d;
                            boolean z18 = kjVar9.r;
                            kjVar9.r = !z18;
                            ea0Var7.F.a(z18, true);
                            if (ea0Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.gj) ea0Var7.r.e.get(0)).k) != null) {
                                message4.invert_media = kjVar9.r;
                            }
                            if (ea0Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.gj) ea0Var7.r.f.get(0)).k) != null) {
                                message3.invert_media = kjVar9.r;
                            }
                            ea0Var7.i();
                            ea0Var7.V = true;
                            break;
                    }
                }
            });
            z0Var11.h(0.12f, i36);
            this.s.a(z0Var11, c8.ja.o(-1, 48));
            ja0 ja0Var8 = ja0Var;
            ja0Var8.a(kjVar.k, false);
            ja0 ja0Var9 = ja0Var2;
            boolean z15 = z10;
            ea0 ea0Var4 = this;
            ja0Var8.setOnClickListener(new bi.m3(this, z15, context, ja0Var9, ja0Var8, 1));
            ea0Var = ea0Var4;
            if (ja0Var9 != null) {
                ja0Var9.setOnClickListener(new lt(ea0Var4, ja0Var9, ja0Var8, 3));
                ea0Var = ea0Var4;
            }
        }
        context2 = context;
        ea0Var2 = ea0Var;
        i10 = ea0Var2.a;
        if (i10 == 1) {
        }
        n10 = ea0Var2.e.n(context2);
        ea0Var2.d = n10;
        n10.setElevation(org.telegram.messenger.g0.L(8.0f));
        n10.setOutlineProvider(viewOutlineProvider);
        if (n10.getParent() instanceof ViewGroup) {
        }
        ea0Var2.addView(n10, c8.ja.d(-1, -1.0f, 51, 0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / org.telegram.messenger.g0.p, 0.0f, 0.0f));
        ea0Var2.e.S(ea0Var2.f);
    }

    public static org.telegram.messenger.bj a(ea0 ea0Var, org.telegram.messenger.gj gjVar) {
        if (gjVar.c1() == 0) {
            return null;
        }
        org.telegram.messenger.bj bjVar = (org.telegram.messenger.bj) ea0Var.r.d.get(gjVar.c1());
        if (bjVar == null || (bjVar.d.size() > 1 && bjVar.d(gjVar) != null)) {
            return bjVar;
        }
        return null;
    }

    public static void b(ea0 ea0Var, org.telegram.ui.Cells.q1 q1Var) {
        URLSpan uRLSpan;
        TLRPC.WebPage webPage;
        if (ea0Var.a == 2) {
            org.telegram.messenger.kj kjVar = ea0Var.d0.d;
            if (!kjVar.n && (uRLSpan = kjVar.w) != null && (webPage = kjVar.v) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                q1Var.r3(uRLSpan);
                return;
            }
        }
        q1Var.r3(null);
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
            org.telegram.ui.qm qmVar = kjVar.d;
            if (qmVar != null) {
                return qmVar.a;
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
                di.c1 c1Var = this.f;
                if (i7 >= c1Var.getChildCount()) {
                    break;
                }
                View childAt = c1Var.getChildAt(i7);
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
        org.telegram.messenger.gj c10;
        if (q1Var == null || q1Var.getMessageObject() == null || (c10 = c(null)) == null) {
            return false;
        }
        return q1Var.getMessageObject() == c10 || q1Var.getMessageObject().e1() == c10.e1();
    }

    public final void f(float f10, int i7) {
        boolean z10 = this.d0.w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        s90 s90Var = this.c;
        org.telegram.ui.v8 v8Var = this.b;
        if (z10) {
            s90Var.setTranslationY(0.0f);
            v8Var.invalidateOutline();
            v8Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            s90Var.setTranslationY(i7);
            v8Var.invalidateOutline();
            v8Var.setTranslationY(f10);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((f10 + v8Var.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f));
        }
        float x10 = v8Var.getX();
        org.telegram.ui.Cells.t9 t9Var = this.d;
        t9Var.setTranslationX(x10);
        t9Var.setTranslationY(v8Var.getY());
    }

    public final void g() {
        ka0 ka0Var = this.d0;
        new cc(ka0Var, ka0Var.G).I(R.raw.error, org.telegram.messenger.hd.M0(2131746437, null), org.telegram.messenger.hd.M0(2131746436, null)).j();
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
        org.telegram.ui.ActionBar.z0 z0Var = this.E;
        org.telegram.ui.ActionBar.z0 z0Var2 = this.y;
        x90 x90Var = this.x;
        x90 x90Var2 = this.w;
        if (!z11) {
            if (x90Var2 != null) {
                x90Var2.setAlpha(!z10 ? 1.0f : 0.0f);
                x90Var2.setVisibility(!z10 ? 0 : 4);
            }
            if (x90Var != null) {
                x90Var.setAlpha(z10 ? 1.0f : 0.0f);
                x90Var.setVisibility(z10 ? 0 : 4);
            }
            if (z0Var2 != null) {
                z0Var2.setAlpha(!z10 ? 1.0f : 0.0f);
                z0Var2.setVisibility(!z10 ? 0 : 4);
            }
            if (z0Var != null) {
                z0Var.setAlpha(z10 ? 1.0f : 0.0f);
                z0Var.setVisibility(z10 ? 0 : 4);
                return;
            }
            return;
        }
        this.Q = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        if (x90Var2 != null) {
            x90Var2.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(x90Var2, (Property<x90, Float>) property, !z10 ? 1.0f : 0.0f));
        }
        if (x90Var != null) {
            x90Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(x90Var, (Property<x90, Float>) property, z10 ? 1.0f : 0.0f));
        }
        if (z0Var2 != null) {
            z0Var2.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(z0Var2, (Property<org.telegram.ui.ActionBar.z0, Float>) property, !z10 ? 1.0f : 0.0f));
        }
        if (z0Var != null) {
            z0Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(z0Var, (Property<org.telegram.ui.ActionBar.z0, Float>) property, z10 ? 1.0f : 0.0f));
        }
        this.Q.playTogether(arrayList);
        this.Q.setDuration(360L);
        this.Q.setInterpolator(er.h);
        this.Q.addListener(new org.telegram.ui.nn(16, this, z10));
        this.Q.start();
    }

    public final void i() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        ka0 ka0Var = this.d0;
        org.telegram.messenger.kj kjVar = ka0Var.d;
        aa0 aa0Var = this.h;
        if (aa0Var.k()) {
            this.W = true;
            return;
        }
        for (int i7 = 0; i7 < this.r.f.size(); i7++) {
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) this.r.f.get(i7);
            gjVar.M1 = true;
            gjVar.h2 = ka0Var.a;
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
            aa0Var.V((org.telegram.messenger.bj) this.r.d.valueAt(i11));
        }
        this.n.k(0, this.r.f.size());
    }

    public final void j() {
        int i7 = this.S;
        float f10 = this.T;
        ka0 ka0Var = this.d0;
        boolean z10 = ka0Var.w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        di.c1 c1Var = this.f;
        if (z10) {
            this.T = 0.0f;
            this.S = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(org.telegram.messenger.g0.L(8.0f) + c1Var.getMeasuredWidth());
        } else {
            int measuredHeight = c1Var.getMeasuredHeight();
            int i10 = 0;
            for (int i11 = 0; i11 < c1Var.getChildCount(); i11++) {
                View childAt = c1Var.getChildAt(i11);
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
                this.S = Math.min(((c1Var.getMeasuredHeight() - this.S) + d) - ((int) ((((org.telegram.messenger.g0.q.y - (Build.VERSION.SDK_INT >= 35 ? org.telegram.messenger.g0.n : 0)) * 0.8f) - this.a0) - org.telegram.messenger.g0.L(8.0f))), this.S);
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
        ValueAnimator valueAnimator = ka0Var.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ka0Var.h = ofFloat;
        ofFloat.addUpdateListener(new oj(this, i7, f10, 1));
        ka0Var.h.setDuration(250L);
        ka0Var.h.setInterpolator(pi.k.V);
        ka0Var.h.addListener(new h60(this, 4));
        org.telegram.messenger.g0.i3(ka0Var.E, 50L);
        this.U = i7;
        f(f10, i7);
    }

    public final void k() {
        org.telegram.messenger.gj gjVar;
        ka0 ka0Var = this.d0;
        org.telegram.messenger.kj kjVar = ka0Var.d;
        if (this.a == 0) {
            y90 y90Var = this.e;
            if (y90Var.v - y90Var.u > org.telegram.messenger.np.s1(ka0Var.x).p4) {
                return;
            }
            org.telegram.ui.Cells.p9 p9Var = y90Var.W;
            org.telegram.messenger.gj c10 = c(p9Var != null ? ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() : null);
            if (kjVar.d != null && y90Var.x()) {
                kjVar.e = y90Var.u;
                kjVar.f = y90Var.v;
                if (c10 != null) {
                    org.telegram.ui.qm qmVar = kjVar.d;
                    if (qmVar.m || (gjVar = qmVar.a) == null || gjVar.e1() != c10.e1()) {
                        kjVar.d = org.telegram.ui.qm.b(kjVar.e, kjVar.f, c10);
                        ka0Var.b();
                    }
                }
            }
            y90Var.f(false);
        }
    }

    public final void l(boolean z10) {
        ka0 ka0Var = this.d0;
        TLRPC.User user = ka0Var.n;
        org.telegram.messenger.kj kjVar = ka0Var.d;
        TLRPC.Chat chat = ka0Var.r;
        s90 s90Var = this.c;
        int i7 = this.a;
        if (i7 == 1) {
            org.telegram.messenger.ij ijVar = kjVar.b;
            s90Var.b(org.telegram.messenger.hd.G(ijVar == null ? 0 : ijVar.g.size(), "PreviewForwardMessagesCount", new Object[0]), z10);
            s90Var.a(!kjVar.h ? kjVar.m ? user != null ? org.telegram.messenger.hd.a0("ForwardPreviewSendersNameVisible", null, 2131750579, org.telegram.messenger.g5.m(0, user.first_name, user.last_name)) : (!org.telegram.messenger.t3.T(chat) || chat.megagroup) ? org.telegram.messenger.hd.M0(2131750577, null) : org.telegram.messenger.hd.M0(2131750578, null) : user != null ? org.telegram.messenger.hd.a0("ForwardPreviewSendersNameVisible", null, 2131750579, org.telegram.messenger.g5.m(0, user.first_name, user.last_name)) : (!org.telegram.messenger.t3.T(chat) || chat.megagroup) ? org.telegram.messenger.hd.M0(2131750580, null) : org.telegram.messenger.hd.M0(2131750581, null) : !kjVar.k ? user != null ? org.telegram.messenger.hd.a0("ForwardPreviewSendersNameVisible", null, 2131750579, org.telegram.messenger.g5.m(0, user.first_name, user.last_name)) : (!org.telegram.messenger.t3.T(chat) || chat.megagroup) ? org.telegram.messenger.hd.M0(2131750577, null) : org.telegram.messenger.hd.M0(2131750578, null) : user != null ? org.telegram.messenger.hd.a0("ForwardPreviewSendersNameHidden", null, 2131750582, org.telegram.messenger.g5.m(0, user.first_name, user.last_name)) : (!org.telegram.messenger.t3.T(chat) || chat.megagroup) ? org.telegram.messenger.hd.M0(2131750580, null) : org.telegram.messenger.hd.M0(2131750581, null), z10);
        } else {
            if (i7 != 0) {
                if (i7 == 2) {
                    s90Var.b(org.telegram.messenger.hd.M0(2131748548, null), z10);
                    s90Var.a(org.telegram.messenger.hd.M0(2131748549, null), z10);
                    return;
                }
                return;
            }
            if (kjVar.d == null || !kjVar.a.j) {
                s90Var.b(org.telegram.messenger.hd.M0(2131748545, null), z10);
                s90Var.a(kjVar.a.j ? org.telegram.messenger.hd.M0(2131748546, null) : "", z10);
            } else {
                s90Var.b(org.telegram.messenger.hd.M0(2131746880, null), z10);
                s90Var.a(org.telegram.messenger.hd.M0(2131746879, null), z10);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a == 0) {
            org.telegram.messenger.g0.d0(this.f, new q2(this, 9));
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
        ka0 ka0Var = this.d0;
        ka0Var.w = z10;
        this.a0 = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i7, makeMeasureSpec);
        int i11 = this.a0;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.R;
        this.a0 = Math.max(i11, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        boolean z11 = ka0Var.w;
        org.telegram.ui.v8 v8Var = this.b;
        if (z11) {
            v8Var.getLayoutParams().height = -1;
            ((ViewGroup.MarginLayoutParams) v8Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(8.0f);
            ((ViewGroup.MarginLayoutParams) v8Var.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(8.0f);
            v8Var.getLayoutParams().width = (int) Math.min(View.MeasureSpec.getSize(i7), Math.max(org.telegram.messenger.g0.L(340.0f), View.MeasureSpec.getSize(i7) * 0.6f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) v8Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) v8Var.getLayoutParams()).bottomMargin = 0;
            v8Var.getLayoutParams().height = (View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.L(6.0f)) - this.a0;
            if (v8Var.getLayoutParams().height < View.MeasureSpec.getSize(i10) * 0.5f) {
                v8Var.getLayoutParams().height = (int) (View.MeasureSpec.getSize(i10) * 0.5f);
            }
            v8Var.getLayoutParams().width = -1;
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = View.MeasureSpec.getSize(i10) - v8Var.getLayoutParams().height;
        }
        int size = (View.MeasureSpec.getSize(i10) + View.MeasureSpec.getSize(i7)) << 16;
        if (this.b0 != size) {
            for (int i12 = 0; i12 < this.r.f.size(); i12++) {
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) this.r.f.get(i12);
                gjVar.d2 = ka0Var.w ? v8Var.getLayoutParams().width : View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(16.0f);
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
