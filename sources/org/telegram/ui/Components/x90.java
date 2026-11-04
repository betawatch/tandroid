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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x90 extends FrameLayout {
    public final org.telegram.ui.ActionBar.y0 E;
    public final ca0 F;
    public final FrameLayout G;
    public final ca0 H;
    public final ca0 I;
    public final int J;
    public final k4.j K;
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
    public final ai.h5 b;
    public int b0;
    public final l90 c;
    public boolean c0;
    public final org.telegram.ui.Cells.t9 d;
    public final /* synthetic */ da0 d0;
    public final r90 e;
    public final ci.j1 f;
    public final t90 h;
    public final org.telegram.ui.y7 n;
    public org.telegram.messenger.bj r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout s;
    public final q90 w;
    public final q90 x;
    public final org.telegram.ui.ActionBar.y0 y;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x06ea  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [android.graphics.drawable.Drawable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.graphics.drawable.Drawable, java.lang.String, org.telegram.ui.ActionBar.n6] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x90(da0 da0Var, Context context, int i3) {
        super(r4);
        org.telegram.messenger.dj djVar;
        ViewOutlineProvider viewOutlineProvider;
        Context context2;
        x90 x90Var;
        boolean z10;
        ca0 ca0Var;
        ca0 ca0Var2;
        x90 x90Var2;
        int i10;
        org.telegram.ui.Cells.t9 n4;
        float f10;
        ?? r11;
        int i11;
        org.telegram.messenger.dj djVar2;
        boolean z11;
        ?? r112;
        Context context3 = context;
        this.d0 = da0Var;
        this.L = true;
        this.M = -1;
        this.N = -1;
        final int i12 = 0;
        this.O = false;
        this.R = new Rect();
        this.V = false;
        this.c0 = true;
        this.K = new k4.j(context3);
        this.a = i3;
        int i13 = 5;
        setOnTouchListener(new yj(this, i13));
        int i14 = 2;
        ai.h5 h5Var = new ai.h5(i14, context3, this);
        this.b = h5Var;
        z90 z90Var = da0Var.G;
        boolean z12 = da0Var.b;
        org.telegram.messenger.dj djVar3 = da0Var.d;
        Drawable m10 = ((org.telegram.ui.um) z90Var).m();
        if (((org.telegram.ui.um) z90Var).f == null) {
            int i15 = org.telegram.ui.ActionBar.k6.a;
        }
        h5Var.U(m10);
        h5Var.setOccupyStatusBar(false);
        h5Var.setOutlineProvider(new gh.a(this, i13));
        h5Var.setClipToOutline(true);
        h5Var.setElevation(org.telegram.messenger.g0.L(4.0f));
        l90 l90Var = new l90(context3, z90Var);
        this.c = l90Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.s8, l90Var, z90Var);
        r90 r90Var = new r90(this);
        this.e = r90Var;
        r90Var.D = new ei.l2(this, i14);
        ci.j1 j1Var = new ci.j1(this, context3, z90Var, 21);
        this.f = j1Var;
        t90 t90Var = new t90(this, j1Var, z90Var);
        this.h = t90Var;
        j1Var.setItemAnimator(t90Var);
        int i16 = 12;
        j1Var.setOnScrollListener(new ji(this, i16));
        j1Var.setOnItemClickListener(new u90(this));
        org.telegram.ui.y7 y7Var = new org.telegram.ui.y7(this, i13);
        this.n = y7Var;
        j1Var.setAdapter(y7Var);
        j1Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        p90 p90Var = new p90(this, i12);
        p90Var.O = new ai.g2(this, i16);
        j1Var.setClipToPadding(false);
        j1Var.setLayoutManager(p90Var);
        j1Var.i(new ei.l(8));
        h5Var.addView(j1Var);
        addView(h5Var, b8.mf.d(-1, 400.0f, 0, 8.0f, 0.0f, 8.0f, 0.0f));
        h5Var.addView(l90Var, b8.mf.c(-2.0f, -1));
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 1, getContext(), z90Var);
        this.s = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().setOnForegroundOpenFinished(new o90(this, 1));
        gh.g c2 = da0Var.H.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c2.p(b8.cd.k(z90Var));
        c2.q(org.telegram.messenger.g0.L(8.0f));
        c2.R.e = true;
        c2.r(org.telegram.messenger.g0.L(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c2);
        addView(actionBarPopupWindow$ActionBarPopupWindowLayout, b8.mf.c(-2.0f, -2));
        if (i3 == 0) {
            org.telegram.messenger.bj bjVar = djVar3.a;
            boolean z13 = djVar3.s;
            if (bjVar != null) {
                if (!bjVar.j || djVar3.i) {
                    f10 = 48.0f;
                    r11 = 0;
                    djVar = djVar3;
                } else {
                    LinearLayout f11 = org.telegram.messenger.k5.f(context3, 1);
                    if (z12) {
                        i11 = 2131746438;
                        djVar2 = djVar3;
                        z11 = true;
                        r112 = 0;
                    } else {
                        djVar2 = djVar3;
                        r112 = 0;
                        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, context3, da0Var.G, true, false);
                        y0Var.j(org.telegram.messenger.bd.M0(2131753756, null), R.drawable.msg_arrow_back, null);
                        y0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.m90
                            public final /* synthetic */ x90 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i17;
                                TLRPC.Message message;
                                TLRPC.MessageMedia messageMedia;
                                TLRPC.Message message2;
                                TLRPC.MessageMedia messageMedia2;
                                TLRPC.Message message3;
                                TLRPC.Message message4;
                                switch (i12) {
                                    case 0:
                                        x90 x90Var3 = this.b;
                                        x90Var3.d0.d.d = null;
                                        x90Var3.e.f(false);
                                        x90Var3.h(false, false);
                                        x90Var3.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        x90 x90Var4 = this.b;
                                        r90 r90Var2 = x90Var4.e;
                                        da0 da0Var2 = x90Var4.d0;
                                        if (x90Var4.c(null) != null) {
                                            if (r90Var2.v - r90Var2.u <= org.telegram.messenger.hp.s1(da0Var2.x).o4) {
                                                org.telegram.ui.Cells.p9 p9Var = r90Var2.W;
                                                org.telegram.messenger.zi c10 = x90Var4.c(p9Var != null ? ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() : null);
                                                org.telegram.messenger.dj djVar4 = da0Var2.d;
                                                int i18 = r90Var2.u;
                                                djVar4.e = i18;
                                                int i19 = r90Var2.v;
                                                djVar4.f = i19;
                                                djVar4.d = org.telegram.ui.mm.b(i18, i19, c10);
                                                da0Var2.b();
                                                da0Var2.a(true);
                                                break;
                                            } else {
                                                x90Var4.g();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        x90 x90Var5 = this.b;
                                        r90 r90Var3 = x90Var5.e;
                                        da0 da0Var3 = x90Var5.d0;
                                        org.telegram.messenger.dj djVar5 = da0Var3.d;
                                        int i20 = da0Var3.x;
                                        boolean z14 = da0Var3.b;
                                        if (djVar5.d != null && !z14) {
                                            djVar5.d = null;
                                            r90Var3.f(false);
                                            x90Var5.h(false, true);
                                            x90Var5.l(true);
                                            break;
                                        } else if (r90Var3.v - r90Var3.u <= org.telegram.messenger.hp.s1(i20).o4) {
                                            org.telegram.messenger.zi c11 = x90Var5.c(null);
                                            if (c11 != null) {
                                                if (!r90Var3.x()) {
                                                    djVar5.e = 0;
                                                    int min = Math.min(org.telegram.messenger.hp.s1(i20).o4, org.telegram.ui.mm.d(c11));
                                                    djVar5.f = min;
                                                    djVar5.d = org.telegram.ui.mm.b(djVar5.e, min, c11);
                                                    View d = x90Var5.d();
                                                    if (d instanceof org.telegram.ui.Cells.q1) {
                                                        r90Var3.a0((org.telegram.ui.Cells.q1) d, djVar5.e, djVar5.f);
                                                    }
                                                    if (!z14) {
                                                        x90Var5.s.getSwipeBack().e(x90Var5.J);
                                                    }
                                                    x90Var5.h(true, true);
                                                    break;
                                                } else {
                                                    djVar5.e = r90Var3.u;
                                                    djVar5.f = r90Var3.v;
                                                    org.telegram.ui.Cells.p9 p9Var2 = r90Var3.W;
                                                    djVar5.d = org.telegram.ui.mm.b(djVar5.e, djVar5.f, x90Var5.c(p9Var2 != null ? ((org.telegram.ui.Cells.q1) p9Var2).getMessageObject() : null));
                                                    da0Var3.b();
                                                    da0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            x90Var5.g();
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
                                        da0 da0Var4 = this.b.d0;
                                        if (!da0Var4.b) {
                                            org.telegram.ui.hk hkVar = (org.telegram.ui.hk) da0Var4;
                                            hkVar.a(true);
                                            org.telegram.ui.wm wmVar = hkVar.I;
                                            wmVar.E5 = null;
                                            wmVar.C5 = null;
                                            wmVar.w5.f(null, null, wmVar.k6, null);
                                            wmVar.z8();
                                            break;
                                        } else {
                                            org.telegram.ui.hk hkVar2 = (org.telegram.ui.hk) da0Var4;
                                            hkVar2.a(true);
                                            org.telegram.ui.wm wmVar2 = hkVar2.I;
                                            wmVar2.C5 = null;
                                            wmVar2.ec(wmVar2.E5);
                                            break;
                                        }
                                    case 7:
                                        this.b.d0.c(true);
                                        break;
                                    case 8:
                                        this.b.d0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.hk hkVar3 = (org.telegram.ui.hk) this.b.d0;
                                        hkVar3.a(true);
                                        org.telegram.ui.wm wmVar3 = hkVar3.I;
                                        wmVar3.w5.d(null, wmVar3.k6);
                                        wmVar3.z8();
                                        break;
                                    case 10:
                                        this.b.d0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.hk hkVar4 = (org.telegram.ui.hk) this.b.d0;
                                        hkVar4.a(true);
                                        org.telegram.ui.wm wmVar4 = hkVar4.I;
                                        wmVar4.X5 = null;
                                        org.telegram.ui.mj mjVar = wmVar4.a0;
                                        if (mjVar != null) {
                                            mjVar.Y2 = null;
                                            mjVar.Z2 = false;
                                        }
                                        org.telegram.messenger.dj djVar6 = wmVar4.w5;
                                        if (djVar6 != null) {
                                            i17 = ((org.telegram.ui.ActionBar.d2) wmVar4).currentAccount;
                                            org.telegram.messenger.zi ziVar = wmVar4.E5;
                                            djVar6.e(i17, null, null, ziVar == wmVar4.m4 ? null : ziVar, wmVar4.C5, wmVar4.G5);
                                        }
                                        wmVar4.z8();
                                        break;
                                    case 12:
                                        x90 x90Var6 = this.b;
                                        org.telegram.messenger.dj djVar7 = x90Var6.d0.d;
                                        if (djVar7.o) {
                                            boolean z15 = !djVar7.q;
                                            djVar7.q = z15;
                                            x90Var6.H.a(z15, true);
                                            x90Var6.I.a(djVar7.q, true);
                                            if (x90Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.zi) x90Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z16 = djVar7.q;
                                                messageMedia2.force_small_media = z16;
                                                messageMedia2.force_large_media = !z16;
                                            }
                                            if (x90Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.zi) x90Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                                boolean z17 = djVar7.q;
                                                messageMedia.force_small_media = z17;
                                                messageMedia.force_large_media = !z17;
                                            }
                                            x90Var6.i();
                                            x90Var6.V = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        x90 x90Var7 = this.b;
                                        org.telegram.messenger.dj djVar8 = x90Var7.d0.d;
                                        boolean z18 = djVar8.r;
                                        djVar8.r = !z18;
                                        x90Var7.F.a(z18, true);
                                        if (x90Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.zi) x90Var7.r.e.get(0)).k) != null) {
                                            message4.invert_media = djVar8.r;
                                        }
                                        if (x90Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.zi) x90Var7.r.f.get(0)).k) != null) {
                                            message3.invert_media = djVar8.r;
                                        }
                                        x90Var7.i();
                                        x90Var7.V = true;
                                        break;
                                }
                            }
                        });
                        f11.addView(y0Var, b8.mf.o(-1, 48));
                        org.telegram.ui.ActionBar.c1 c1Var = new org.telegram.ui.ActionBar.c1(context3, z90Var);
                        org.telegram.ui.ActionBar.r6.j(c1Var, org.telegram.ui.ActionBar.r6.L(0.06f, org.telegram.ui.ActionBar.k6.E8), z90Var);
                        c1Var.setTag(R.id.fit_width_tag, 1);
                        f11.addView(c1Var, b8.mf.o(-1, 8));
                        org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(0, context3, da0Var.G, false, true);
                        i11 = 2131746438;
                        y0Var2.j(org.telegram.messenger.bd.M0(2131746438, null), R.drawable.menu_quote_specific, null);
                        z11 = true;
                        final boolean z14 = true ? 1 : 0;
                        y0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.m90
                            public final /* synthetic */ x90 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i17;
                                TLRPC.Message message;
                                TLRPC.MessageMedia messageMedia;
                                TLRPC.Message message2;
                                TLRPC.MessageMedia messageMedia2;
                                TLRPC.Message message3;
                                TLRPC.Message message4;
                                switch (z14) {
                                    case 0:
                                        x90 x90Var3 = this.b;
                                        x90Var3.d0.d.d = null;
                                        x90Var3.e.f(false);
                                        x90Var3.h(false, false);
                                        x90Var3.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        x90 x90Var4 = this.b;
                                        r90 r90Var2 = x90Var4.e;
                                        da0 da0Var2 = x90Var4.d0;
                                        if (x90Var4.c(null) != null) {
                                            if (r90Var2.v - r90Var2.u <= org.telegram.messenger.hp.s1(da0Var2.x).o4) {
                                                org.telegram.ui.Cells.p9 p9Var = r90Var2.W;
                                                org.telegram.messenger.zi c10 = x90Var4.c(p9Var != null ? ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() : null);
                                                org.telegram.messenger.dj djVar4 = da0Var2.d;
                                                int i18 = r90Var2.u;
                                                djVar4.e = i18;
                                                int i19 = r90Var2.v;
                                                djVar4.f = i19;
                                                djVar4.d = org.telegram.ui.mm.b(i18, i19, c10);
                                                da0Var2.b();
                                                da0Var2.a(true);
                                                break;
                                            } else {
                                                x90Var4.g();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        x90 x90Var5 = this.b;
                                        r90 r90Var3 = x90Var5.e;
                                        da0 da0Var3 = x90Var5.d0;
                                        org.telegram.messenger.dj djVar5 = da0Var3.d;
                                        int i20 = da0Var3.x;
                                        boolean z142 = da0Var3.b;
                                        if (djVar5.d != null && !z142) {
                                            djVar5.d = null;
                                            r90Var3.f(false);
                                            x90Var5.h(false, true);
                                            x90Var5.l(true);
                                            break;
                                        } else if (r90Var3.v - r90Var3.u <= org.telegram.messenger.hp.s1(i20).o4) {
                                            org.telegram.messenger.zi c11 = x90Var5.c(null);
                                            if (c11 != null) {
                                                if (!r90Var3.x()) {
                                                    djVar5.e = 0;
                                                    int min = Math.min(org.telegram.messenger.hp.s1(i20).o4, org.telegram.ui.mm.d(c11));
                                                    djVar5.f = min;
                                                    djVar5.d = org.telegram.ui.mm.b(djVar5.e, min, c11);
                                                    View d = x90Var5.d();
                                                    if (d instanceof org.telegram.ui.Cells.q1) {
                                                        r90Var3.a0((org.telegram.ui.Cells.q1) d, djVar5.e, djVar5.f);
                                                    }
                                                    if (!z142) {
                                                        x90Var5.s.getSwipeBack().e(x90Var5.J);
                                                    }
                                                    x90Var5.h(true, true);
                                                    break;
                                                } else {
                                                    djVar5.e = r90Var3.u;
                                                    djVar5.f = r90Var3.v;
                                                    org.telegram.ui.Cells.p9 p9Var2 = r90Var3.W;
                                                    djVar5.d = org.telegram.ui.mm.b(djVar5.e, djVar5.f, x90Var5.c(p9Var2 != null ? ((org.telegram.ui.Cells.q1) p9Var2).getMessageObject() : null));
                                                    da0Var3.b();
                                                    da0Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            x90Var5.g();
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
                                        da0 da0Var4 = this.b.d0;
                                        if (!da0Var4.b) {
                                            org.telegram.ui.hk hkVar = (org.telegram.ui.hk) da0Var4;
                                            hkVar.a(true);
                                            org.telegram.ui.wm wmVar = hkVar.I;
                                            wmVar.E5 = null;
                                            wmVar.C5 = null;
                                            wmVar.w5.f(null, null, wmVar.k6, null);
                                            wmVar.z8();
                                            break;
                                        } else {
                                            org.telegram.ui.hk hkVar2 = (org.telegram.ui.hk) da0Var4;
                                            hkVar2.a(true);
                                            org.telegram.ui.wm wmVar2 = hkVar2.I;
                                            wmVar2.C5 = null;
                                            wmVar2.ec(wmVar2.E5);
                                            break;
                                        }
                                    case 7:
                                        this.b.d0.c(true);
                                        break;
                                    case 8:
                                        this.b.d0.a(true);
                                        break;
                                    case 9:
                                        org.telegram.ui.hk hkVar3 = (org.telegram.ui.hk) this.b.d0;
                                        hkVar3.a(true);
                                        org.telegram.ui.wm wmVar3 = hkVar3.I;
                                        wmVar3.w5.d(null, wmVar3.k6);
                                        wmVar3.z8();
                                        break;
                                    case 10:
                                        this.b.d0.a(true);
                                        break;
                                    case 11:
                                        org.telegram.ui.hk hkVar4 = (org.telegram.ui.hk) this.b.d0;
                                        hkVar4.a(true);
                                        org.telegram.ui.wm wmVar4 = hkVar4.I;
                                        wmVar4.X5 = null;
                                        org.telegram.ui.mj mjVar = wmVar4.a0;
                                        if (mjVar != null) {
                                            mjVar.Y2 = null;
                                            mjVar.Z2 = false;
                                        }
                                        org.telegram.messenger.dj djVar6 = wmVar4.w5;
                                        if (djVar6 != null) {
                                            i17 = ((org.telegram.ui.ActionBar.d2) wmVar4).currentAccount;
                                            org.telegram.messenger.zi ziVar = wmVar4.E5;
                                            djVar6.e(i17, null, null, ziVar == wmVar4.m4 ? null : ziVar, wmVar4.C5, wmVar4.G5);
                                        }
                                        wmVar4.z8();
                                        break;
                                    case 12:
                                        x90 x90Var6 = this.b;
                                        org.telegram.messenger.dj djVar7 = x90Var6.d0.d;
                                        if (djVar7.o) {
                                            boolean z15 = !djVar7.q;
                                            djVar7.q = z15;
                                            x90Var6.H.a(z15, true);
                                            x90Var6.I.a(djVar7.q, true);
                                            if (x90Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.zi) x90Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z16 = djVar7.q;
                                                messageMedia2.force_small_media = z16;
                                                messageMedia2.force_large_media = !z16;
                                            }
                                            if (x90Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.zi) x90Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                                boolean z17 = djVar7.q;
                                                messageMedia.force_small_media = z17;
                                                messageMedia.force_large_media = !z17;
                                            }
                                            x90Var6.i();
                                            x90Var6.V = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        x90 x90Var7 = this.b;
                                        org.telegram.messenger.dj djVar8 = x90Var7.d0.d;
                                        boolean z18 = djVar8.r;
                                        djVar8.r = !z18;
                                        x90Var7.F.a(z18, true);
                                        if (x90Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.zi) x90Var7.r.e.get(0)).k) != null) {
                                            message4.invert_media = djVar8.r;
                                        }
                                        if (x90Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.zi) x90Var7.r.f.get(0)).k) != null) {
                                            message3.invert_media = djVar8.r;
                                        }
                                        x90Var7.i();
                                        x90Var7.V = true;
                                        break;
                                }
                            }
                        });
                        f11.addView(y0Var2, b8.mf.o(-1, 48));
                    }
                    this.J = actionBarPopupWindow$ActionBarPopupWindowLayout.b(f11);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().setStickToRight(z11);
                    FrameLayout frameLayout = new FrameLayout(context3);
                    int i17 = i11;
                    q90 q90Var = new q90(1, 0, context, da0Var.G, true, false);
                    this.w = q90Var;
                    q90Var.j(org.telegram.messenger.bd.M0(z12 ? i17 : 2131745663, r112), R.drawable.menu_select_quote, r112);
                    q90 q90Var2 = new q90(1, 1, context, da0Var.G, true, false);
                    context3 = context;
                    this.x = q90Var2;
                    q90Var2.j(org.telegram.messenger.bd.M0(2131752072, r112), R.drawable.menu_quote_delete, r112);
                    int i18 = org.telegram.ui.ActionBar.k6.I5;
                    Drawable a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i18, z90Var), 6, 0);
                    org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i18);
                    frameLayout.setBackground(a02);
                    org.telegram.ui.ActionBar.r6.k(frameLayout, a02, r112, N, z90Var);
                    final int i19 = 2;
                    frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.m90
                        public final /* synthetic */ x90 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i172;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (i19) {
                                case 0:
                                    x90 x90Var3 = this.b;
                                    x90Var3.d0.d.d = null;
                                    x90Var3.e.f(false);
                                    x90Var3.h(false, false);
                                    x90Var3.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    x90 x90Var4 = this.b;
                                    r90 r90Var2 = x90Var4.e;
                                    da0 da0Var2 = x90Var4.d0;
                                    if (x90Var4.c(null) != null) {
                                        if (r90Var2.v - r90Var2.u <= org.telegram.messenger.hp.s1(da0Var2.x).o4) {
                                            org.telegram.ui.Cells.p9 p9Var = r90Var2.W;
                                            org.telegram.messenger.zi c10 = x90Var4.c(p9Var != null ? ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() : null);
                                            org.telegram.messenger.dj djVar4 = da0Var2.d;
                                            int i182 = r90Var2.u;
                                            djVar4.e = i182;
                                            int i192 = r90Var2.v;
                                            djVar4.f = i192;
                                            djVar4.d = org.telegram.ui.mm.b(i182, i192, c10);
                                            da0Var2.b();
                                            da0Var2.a(true);
                                            break;
                                        } else {
                                            x90Var4.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    x90 x90Var5 = this.b;
                                    r90 r90Var3 = x90Var5.e;
                                    da0 da0Var3 = x90Var5.d0;
                                    org.telegram.messenger.dj djVar5 = da0Var3.d;
                                    int i20 = da0Var3.x;
                                    boolean z142 = da0Var3.b;
                                    if (djVar5.d != null && !z142) {
                                        djVar5.d = null;
                                        r90Var3.f(false);
                                        x90Var5.h(false, true);
                                        x90Var5.l(true);
                                        break;
                                    } else if (r90Var3.v - r90Var3.u <= org.telegram.messenger.hp.s1(i20).o4) {
                                        org.telegram.messenger.zi c11 = x90Var5.c(null);
                                        if (c11 != null) {
                                            if (!r90Var3.x()) {
                                                djVar5.e = 0;
                                                int min = Math.min(org.telegram.messenger.hp.s1(i20).o4, org.telegram.ui.mm.d(c11));
                                                djVar5.f = min;
                                                djVar5.d = org.telegram.ui.mm.b(djVar5.e, min, c11);
                                                View d = x90Var5.d();
                                                if (d instanceof org.telegram.ui.Cells.q1) {
                                                    r90Var3.a0((org.telegram.ui.Cells.q1) d, djVar5.e, djVar5.f);
                                                }
                                                if (!z142) {
                                                    x90Var5.s.getSwipeBack().e(x90Var5.J);
                                                }
                                                x90Var5.h(true, true);
                                                break;
                                            } else {
                                                djVar5.e = r90Var3.u;
                                                djVar5.f = r90Var3.v;
                                                org.telegram.ui.Cells.p9 p9Var2 = r90Var3.W;
                                                djVar5.d = org.telegram.ui.mm.b(djVar5.e, djVar5.f, x90Var5.c(p9Var2 != null ? ((org.telegram.ui.Cells.q1) p9Var2).getMessageObject() : null));
                                                da0Var3.b();
                                                da0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        x90Var5.g();
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
                                    da0 da0Var4 = this.b.d0;
                                    if (!da0Var4.b) {
                                        org.telegram.ui.hk hkVar = (org.telegram.ui.hk) da0Var4;
                                        hkVar.a(true);
                                        org.telegram.ui.wm wmVar = hkVar.I;
                                        wmVar.E5 = null;
                                        wmVar.C5 = null;
                                        wmVar.w5.f(null, null, wmVar.k6, null);
                                        wmVar.z8();
                                        break;
                                    } else {
                                        org.telegram.ui.hk hkVar2 = (org.telegram.ui.hk) da0Var4;
                                        hkVar2.a(true);
                                        org.telegram.ui.wm wmVar2 = hkVar2.I;
                                        wmVar2.C5 = null;
                                        wmVar2.ec(wmVar2.E5);
                                        break;
                                    }
                                case 7:
                                    this.b.d0.c(true);
                                    break;
                                case 8:
                                    this.b.d0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.hk hkVar3 = (org.telegram.ui.hk) this.b.d0;
                                    hkVar3.a(true);
                                    org.telegram.ui.wm wmVar3 = hkVar3.I;
                                    wmVar3.w5.d(null, wmVar3.k6);
                                    wmVar3.z8();
                                    break;
                                case 10:
                                    this.b.d0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.hk hkVar4 = (org.telegram.ui.hk) this.b.d0;
                                    hkVar4.a(true);
                                    org.telegram.ui.wm wmVar4 = hkVar4.I;
                                    wmVar4.X5 = null;
                                    org.telegram.ui.mj mjVar = wmVar4.a0;
                                    if (mjVar != null) {
                                        mjVar.Y2 = null;
                                        mjVar.Z2 = false;
                                    }
                                    org.telegram.messenger.dj djVar6 = wmVar4.w5;
                                    if (djVar6 != null) {
                                        i172 = ((org.telegram.ui.ActionBar.d2) wmVar4).currentAccount;
                                        org.telegram.messenger.zi ziVar = wmVar4.E5;
                                        djVar6.e(i172, null, null, ziVar == wmVar4.m4 ? null : ziVar, wmVar4.C5, wmVar4.G5);
                                    }
                                    wmVar4.z8();
                                    break;
                                case 12:
                                    x90 x90Var6 = this.b;
                                    org.telegram.messenger.dj djVar7 = x90Var6.d0.d;
                                    if (djVar7.o) {
                                        boolean z15 = !djVar7.q;
                                        djVar7.q = z15;
                                        x90Var6.H.a(z15, true);
                                        x90Var6.I.a(djVar7.q, true);
                                        if (x90Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.zi) x90Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z16 = djVar7.q;
                                            messageMedia2.force_small_media = z16;
                                            messageMedia2.force_large_media = !z16;
                                        }
                                        if (x90Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.zi) x90Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z17 = djVar7.q;
                                            messageMedia.force_small_media = z17;
                                            messageMedia.force_large_media = !z17;
                                        }
                                        x90Var6.i();
                                        x90Var6.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    x90 x90Var7 = this.b;
                                    org.telegram.messenger.dj djVar8 = x90Var7.d0.d;
                                    boolean z18 = djVar8.r;
                                    djVar8.r = !z18;
                                    x90Var7.F.a(z18, true);
                                    if (x90Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.zi) x90Var7.r.e.get(0)).k) != null) {
                                        message4.invert_media = djVar8.r;
                                    }
                                    if (x90Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.zi) x90Var7.r.f.get(0)).k) != null) {
                                        message3.invert_media = djVar8.r;
                                    }
                                    x90Var7.i();
                                    x90Var7.V = true;
                                    break;
                            }
                        }
                    });
                    f10 = 48.0f;
                    frameLayout.addView(q90Var, b8.mf.c(48.0f, -1));
                    frameLayout.addView(q90Var2, b8.mf.c(48.0f, -1));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, b8.mf.o(-1, 48));
                    djVar = djVar2;
                    r11 = r112;
                }
                if (!djVar.t && !z13 && !djVar.u) {
                    FrameLayout frameLayout2 = new FrameLayout(context3);
                    float f12 = f10;
                    org.telegram.ui.ActionBar.y0 y0Var3 = new org.telegram.ui.ActionBar.y0(1, context3, da0Var.G, false, false);
                    this.y = y0Var3;
                    y0Var3.j(org.telegram.messenger.bd.M0(2131746263, r11), R.drawable.msg_forward_replace, r11);
                    final int i20 = 3;
                    y0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.m90
                        public final /* synthetic */ x90 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i172;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (i20) {
                                case 0:
                                    x90 x90Var3 = this.b;
                                    x90Var3.d0.d.d = null;
                                    x90Var3.e.f(false);
                                    x90Var3.h(false, false);
                                    x90Var3.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    x90 x90Var4 = this.b;
                                    r90 r90Var2 = x90Var4.e;
                                    da0 da0Var2 = x90Var4.d0;
                                    if (x90Var4.c(null) != null) {
                                        if (r90Var2.v - r90Var2.u <= org.telegram.messenger.hp.s1(da0Var2.x).o4) {
                                            org.telegram.ui.Cells.p9 p9Var = r90Var2.W;
                                            org.telegram.messenger.zi c10 = x90Var4.c(p9Var != null ? ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() : null);
                                            org.telegram.messenger.dj djVar4 = da0Var2.d;
                                            int i182 = r90Var2.u;
                                            djVar4.e = i182;
                                            int i192 = r90Var2.v;
                                            djVar4.f = i192;
                                            djVar4.d = org.telegram.ui.mm.b(i182, i192, c10);
                                            da0Var2.b();
                                            da0Var2.a(true);
                                            break;
                                        } else {
                                            x90Var4.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    x90 x90Var5 = this.b;
                                    r90 r90Var3 = x90Var5.e;
                                    da0 da0Var3 = x90Var5.d0;
                                    org.telegram.messenger.dj djVar5 = da0Var3.d;
                                    int i202 = da0Var3.x;
                                    boolean z142 = da0Var3.b;
                                    if (djVar5.d != null && !z142) {
                                        djVar5.d = null;
                                        r90Var3.f(false);
                                        x90Var5.h(false, true);
                                        x90Var5.l(true);
                                        break;
                                    } else if (r90Var3.v - r90Var3.u <= org.telegram.messenger.hp.s1(i202).o4) {
                                        org.telegram.messenger.zi c11 = x90Var5.c(null);
                                        if (c11 != null) {
                                            if (!r90Var3.x()) {
                                                djVar5.e = 0;
                                                int min = Math.min(org.telegram.messenger.hp.s1(i202).o4, org.telegram.ui.mm.d(c11));
                                                djVar5.f = min;
                                                djVar5.d = org.telegram.ui.mm.b(djVar5.e, min, c11);
                                                View d = x90Var5.d();
                                                if (d instanceof org.telegram.ui.Cells.q1) {
                                                    r90Var3.a0((org.telegram.ui.Cells.q1) d, djVar5.e, djVar5.f);
                                                }
                                                if (!z142) {
                                                    x90Var5.s.getSwipeBack().e(x90Var5.J);
                                                }
                                                x90Var5.h(true, true);
                                                break;
                                            } else {
                                                djVar5.e = r90Var3.u;
                                                djVar5.f = r90Var3.v;
                                                org.telegram.ui.Cells.p9 p9Var2 = r90Var3.W;
                                                djVar5.d = org.telegram.ui.mm.b(djVar5.e, djVar5.f, x90Var5.c(p9Var2 != null ? ((org.telegram.ui.Cells.q1) p9Var2).getMessageObject() : null));
                                                da0Var3.b();
                                                da0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        x90Var5.g();
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
                                    da0 da0Var4 = this.b.d0;
                                    if (!da0Var4.b) {
                                        org.telegram.ui.hk hkVar = (org.telegram.ui.hk) da0Var4;
                                        hkVar.a(true);
                                        org.telegram.ui.wm wmVar = hkVar.I;
                                        wmVar.E5 = null;
                                        wmVar.C5 = null;
                                        wmVar.w5.f(null, null, wmVar.k6, null);
                                        wmVar.z8();
                                        break;
                                    } else {
                                        org.telegram.ui.hk hkVar2 = (org.telegram.ui.hk) da0Var4;
                                        hkVar2.a(true);
                                        org.telegram.ui.wm wmVar2 = hkVar2.I;
                                        wmVar2.C5 = null;
                                        wmVar2.ec(wmVar2.E5);
                                        break;
                                    }
                                case 7:
                                    this.b.d0.c(true);
                                    break;
                                case 8:
                                    this.b.d0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.hk hkVar3 = (org.telegram.ui.hk) this.b.d0;
                                    hkVar3.a(true);
                                    org.telegram.ui.wm wmVar3 = hkVar3.I;
                                    wmVar3.w5.d(null, wmVar3.k6);
                                    wmVar3.z8();
                                    break;
                                case 10:
                                    this.b.d0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.hk hkVar4 = (org.telegram.ui.hk) this.b.d0;
                                    hkVar4.a(true);
                                    org.telegram.ui.wm wmVar4 = hkVar4.I;
                                    wmVar4.X5 = null;
                                    org.telegram.ui.mj mjVar = wmVar4.a0;
                                    if (mjVar != null) {
                                        mjVar.Y2 = null;
                                        mjVar.Z2 = false;
                                    }
                                    org.telegram.messenger.dj djVar6 = wmVar4.w5;
                                    if (djVar6 != null) {
                                        i172 = ((org.telegram.ui.ActionBar.d2) wmVar4).currentAccount;
                                        org.telegram.messenger.zi ziVar = wmVar4.E5;
                                        djVar6.e(i172, null, null, ziVar == wmVar4.m4 ? null : ziVar, wmVar4.C5, wmVar4.G5);
                                    }
                                    wmVar4.z8();
                                    break;
                                case 12:
                                    x90 x90Var6 = this.b;
                                    org.telegram.messenger.dj djVar7 = x90Var6.d0.d;
                                    if (djVar7.o) {
                                        boolean z15 = !djVar7.q;
                                        djVar7.q = z15;
                                        x90Var6.H.a(z15, true);
                                        x90Var6.I.a(djVar7.q, true);
                                        if (x90Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.zi) x90Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z16 = djVar7.q;
                                            messageMedia2.force_small_media = z16;
                                            messageMedia2.force_large_media = !z16;
                                        }
                                        if (x90Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.zi) x90Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z17 = djVar7.q;
                                            messageMedia.force_small_media = z17;
                                            messageMedia.force_large_media = !z17;
                                        }
                                        x90Var6.i();
                                        x90Var6.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    x90 x90Var7 = this.b;
                                    org.telegram.messenger.dj djVar8 = x90Var7.d0.d;
                                    boolean z18 = djVar8.r;
                                    djVar8.r = !z18;
                                    x90Var7.F.a(z18, true);
                                    if (x90Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.zi) x90Var7.r.e.get(0)).k) != null) {
                                        message4.invert_media = djVar8.r;
                                    }
                                    if (x90Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.zi) x90Var7.r.f.get(0)).k) != null) {
                                        message3.invert_media = djVar8.r;
                                    }
                                    x90Var7.i();
                                    x90Var7.V = true;
                                    break;
                            }
                        }
                    });
                    context3 = context;
                    org.telegram.ui.ActionBar.y0 y0Var4 = new org.telegram.ui.ActionBar.y0(1, context3, da0Var.G, false, false);
                    this.E = y0Var4;
                    y0Var4.j(org.telegram.messenger.bd.M0(2131746436, r11), R.drawable.msg_forward_replace, r11);
                    final int i21 = 4;
                    y0Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.m90
                        public final /* synthetic */ x90 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i172;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (i21) {
                                case 0:
                                    x90 x90Var3 = this.b;
                                    x90Var3.d0.d.d = null;
                                    x90Var3.e.f(false);
                                    x90Var3.h(false, false);
                                    x90Var3.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    x90 x90Var4 = this.b;
                                    r90 r90Var2 = x90Var4.e;
                                    da0 da0Var2 = x90Var4.d0;
                                    if (x90Var4.c(null) != null) {
                                        if (r90Var2.v - r90Var2.u <= org.telegram.messenger.hp.s1(da0Var2.x).o4) {
                                            org.telegram.ui.Cells.p9 p9Var = r90Var2.W;
                                            org.telegram.messenger.zi c10 = x90Var4.c(p9Var != null ? ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() : null);
                                            org.telegram.messenger.dj djVar4 = da0Var2.d;
                                            int i182 = r90Var2.u;
                                            djVar4.e = i182;
                                            int i192 = r90Var2.v;
                                            djVar4.f = i192;
                                            djVar4.d = org.telegram.ui.mm.b(i182, i192, c10);
                                            da0Var2.b();
                                            da0Var2.a(true);
                                            break;
                                        } else {
                                            x90Var4.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    x90 x90Var5 = this.b;
                                    r90 r90Var3 = x90Var5.e;
                                    da0 da0Var3 = x90Var5.d0;
                                    org.telegram.messenger.dj djVar5 = da0Var3.d;
                                    int i202 = da0Var3.x;
                                    boolean z142 = da0Var3.b;
                                    if (djVar5.d != null && !z142) {
                                        djVar5.d = null;
                                        r90Var3.f(false);
                                        x90Var5.h(false, true);
                                        x90Var5.l(true);
                                        break;
                                    } else if (r90Var3.v - r90Var3.u <= org.telegram.messenger.hp.s1(i202).o4) {
                                        org.telegram.messenger.zi c11 = x90Var5.c(null);
                                        if (c11 != null) {
                                            if (!r90Var3.x()) {
                                                djVar5.e = 0;
                                                int min = Math.min(org.telegram.messenger.hp.s1(i202).o4, org.telegram.ui.mm.d(c11));
                                                djVar5.f = min;
                                                djVar5.d = org.telegram.ui.mm.b(djVar5.e, min, c11);
                                                View d = x90Var5.d();
                                                if (d instanceof org.telegram.ui.Cells.q1) {
                                                    r90Var3.a0((org.telegram.ui.Cells.q1) d, djVar5.e, djVar5.f);
                                                }
                                                if (!z142) {
                                                    x90Var5.s.getSwipeBack().e(x90Var5.J);
                                                }
                                                x90Var5.h(true, true);
                                                break;
                                            } else {
                                                djVar5.e = r90Var3.u;
                                                djVar5.f = r90Var3.v;
                                                org.telegram.ui.Cells.p9 p9Var2 = r90Var3.W;
                                                djVar5.d = org.telegram.ui.mm.b(djVar5.e, djVar5.f, x90Var5.c(p9Var2 != null ? ((org.telegram.ui.Cells.q1) p9Var2).getMessageObject() : null));
                                                da0Var3.b();
                                                da0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        x90Var5.g();
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
                                    da0 da0Var4 = this.b.d0;
                                    if (!da0Var4.b) {
                                        org.telegram.ui.hk hkVar = (org.telegram.ui.hk) da0Var4;
                                        hkVar.a(true);
                                        org.telegram.ui.wm wmVar = hkVar.I;
                                        wmVar.E5 = null;
                                        wmVar.C5 = null;
                                        wmVar.w5.f(null, null, wmVar.k6, null);
                                        wmVar.z8();
                                        break;
                                    } else {
                                        org.telegram.ui.hk hkVar2 = (org.telegram.ui.hk) da0Var4;
                                        hkVar2.a(true);
                                        org.telegram.ui.wm wmVar2 = hkVar2.I;
                                        wmVar2.C5 = null;
                                        wmVar2.ec(wmVar2.E5);
                                        break;
                                    }
                                case 7:
                                    this.b.d0.c(true);
                                    break;
                                case 8:
                                    this.b.d0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.hk hkVar3 = (org.telegram.ui.hk) this.b.d0;
                                    hkVar3.a(true);
                                    org.telegram.ui.wm wmVar3 = hkVar3.I;
                                    wmVar3.w5.d(null, wmVar3.k6);
                                    wmVar3.z8();
                                    break;
                                case 10:
                                    this.b.d0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.hk hkVar4 = (org.telegram.ui.hk) this.b.d0;
                                    hkVar4.a(true);
                                    org.telegram.ui.wm wmVar4 = hkVar4.I;
                                    wmVar4.X5 = null;
                                    org.telegram.ui.mj mjVar = wmVar4.a0;
                                    if (mjVar != null) {
                                        mjVar.Y2 = null;
                                        mjVar.Z2 = false;
                                    }
                                    org.telegram.messenger.dj djVar6 = wmVar4.w5;
                                    if (djVar6 != null) {
                                        i172 = ((org.telegram.ui.ActionBar.d2) wmVar4).currentAccount;
                                        org.telegram.messenger.zi ziVar = wmVar4.E5;
                                        djVar6.e(i172, null, null, ziVar == wmVar4.m4 ? null : ziVar, wmVar4.C5, wmVar4.G5);
                                    }
                                    wmVar4.z8();
                                    break;
                                case 12:
                                    x90 x90Var6 = this.b;
                                    org.telegram.messenger.dj djVar7 = x90Var6.d0.d;
                                    if (djVar7.o) {
                                        boolean z15 = !djVar7.q;
                                        djVar7.q = z15;
                                        x90Var6.H.a(z15, true);
                                        x90Var6.I.a(djVar7.q, true);
                                        if (x90Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.zi) x90Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z16 = djVar7.q;
                                            messageMedia2.force_small_media = z16;
                                            messageMedia2.force_large_media = !z16;
                                        }
                                        if (x90Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.zi) x90Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z17 = djVar7.q;
                                            messageMedia.force_small_media = z17;
                                            messageMedia.force_large_media = !z17;
                                        }
                                        x90Var6.i();
                                        x90Var6.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    x90 x90Var7 = this.b;
                                    org.telegram.messenger.dj djVar8 = x90Var7.d0.d;
                                    boolean z18 = djVar8.r;
                                    djVar8.r = !z18;
                                    x90Var7.F.a(z18, true);
                                    if (x90Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.zi) x90Var7.r.e.get(0)).k) != null) {
                                        message4.invert_media = djVar8.r;
                                    }
                                    if (x90Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.zi) x90Var7.r.f.get(0)).k) != null) {
                                        message3.invert_media = djVar8.r;
                                    }
                                    x90Var7.i();
                                    x90Var7.V = true;
                                    break;
                            }
                        }
                    });
                    frameLayout2.addView(y0Var4, b8.mf.c(f12, -1));
                    frameLayout2.addView(y0Var3, b8.mf.c(f12, -1));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout2, b8.mf.o(-1, 48));
                }
                if (!z13 && !djVar.u) {
                    View c1Var2 = new org.telegram.ui.ActionBar.c1(context3, z90Var);
                    org.telegram.ui.ActionBar.r6.j(c1Var2, org.telegram.ui.ActionBar.r6.L(0.06f, org.telegram.ui.ActionBar.k6.E8), z90Var);
                    c1Var2.setTag(R.id.fit_width_tag, 1);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(c1Var2, b8.mf.o(-1, 8));
                }
                h(djVar.d != null, false);
                org.telegram.ui.ActionBar.y0 y0Var5 = new org.telegram.ui.ActionBar.y0(1, context3, da0Var.G, false, false);
                y0Var5.j(org.telegram.messenger.bd.M0(2131754218, r11), R.drawable.msg_select, r11);
                final int i22 = 5;
                y0Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.m90
                    public final /* synthetic */ x90 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i172;
                        TLRPC.Message message;
                        TLRPC.MessageMedia messageMedia;
                        TLRPC.Message message2;
                        TLRPC.MessageMedia messageMedia2;
                        TLRPC.Message message3;
                        TLRPC.Message message4;
                        switch (i22) {
                            case 0:
                                x90 x90Var3 = this.b;
                                x90Var3.d0.d.d = null;
                                x90Var3.e.f(false);
                                x90Var3.h(false, false);
                                x90Var3.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                x90 x90Var4 = this.b;
                                r90 r90Var2 = x90Var4.e;
                                da0 da0Var2 = x90Var4.d0;
                                if (x90Var4.c(null) != null) {
                                    if (r90Var2.v - r90Var2.u <= org.telegram.messenger.hp.s1(da0Var2.x).o4) {
                                        org.telegram.ui.Cells.p9 p9Var = r90Var2.W;
                                        org.telegram.messenger.zi c10 = x90Var4.c(p9Var != null ? ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() : null);
                                        org.telegram.messenger.dj djVar4 = da0Var2.d;
                                        int i182 = r90Var2.u;
                                        djVar4.e = i182;
                                        int i192 = r90Var2.v;
                                        djVar4.f = i192;
                                        djVar4.d = org.telegram.ui.mm.b(i182, i192, c10);
                                        da0Var2.b();
                                        da0Var2.a(true);
                                        break;
                                    } else {
                                        x90Var4.g();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                x90 x90Var5 = this.b;
                                r90 r90Var3 = x90Var5.e;
                                da0 da0Var3 = x90Var5.d0;
                                org.telegram.messenger.dj djVar5 = da0Var3.d;
                                int i202 = da0Var3.x;
                                boolean z142 = da0Var3.b;
                                if (djVar5.d != null && !z142) {
                                    djVar5.d = null;
                                    r90Var3.f(false);
                                    x90Var5.h(false, true);
                                    x90Var5.l(true);
                                    break;
                                } else if (r90Var3.v - r90Var3.u <= org.telegram.messenger.hp.s1(i202).o4) {
                                    org.telegram.messenger.zi c11 = x90Var5.c(null);
                                    if (c11 != null) {
                                        if (!r90Var3.x()) {
                                            djVar5.e = 0;
                                            int min = Math.min(org.telegram.messenger.hp.s1(i202).o4, org.telegram.ui.mm.d(c11));
                                            djVar5.f = min;
                                            djVar5.d = org.telegram.ui.mm.b(djVar5.e, min, c11);
                                            View d = x90Var5.d();
                                            if (d instanceof org.telegram.ui.Cells.q1) {
                                                r90Var3.a0((org.telegram.ui.Cells.q1) d, djVar5.e, djVar5.f);
                                            }
                                            if (!z142) {
                                                x90Var5.s.getSwipeBack().e(x90Var5.J);
                                            }
                                            x90Var5.h(true, true);
                                            break;
                                        } else {
                                            djVar5.e = r90Var3.u;
                                            djVar5.f = r90Var3.v;
                                            org.telegram.ui.Cells.p9 p9Var2 = r90Var3.W;
                                            djVar5.d = org.telegram.ui.mm.b(djVar5.e, djVar5.f, x90Var5.c(p9Var2 != null ? ((org.telegram.ui.Cells.q1) p9Var2).getMessageObject() : null));
                                            da0Var3.b();
                                            da0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    x90Var5.g();
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
                                da0 da0Var4 = this.b.d0;
                                if (!da0Var4.b) {
                                    org.telegram.ui.hk hkVar = (org.telegram.ui.hk) da0Var4;
                                    hkVar.a(true);
                                    org.telegram.ui.wm wmVar = hkVar.I;
                                    wmVar.E5 = null;
                                    wmVar.C5 = null;
                                    wmVar.w5.f(null, null, wmVar.k6, null);
                                    wmVar.z8();
                                    break;
                                } else {
                                    org.telegram.ui.hk hkVar2 = (org.telegram.ui.hk) da0Var4;
                                    hkVar2.a(true);
                                    org.telegram.ui.wm wmVar2 = hkVar2.I;
                                    wmVar2.C5 = null;
                                    wmVar2.ec(wmVar2.E5);
                                    break;
                                }
                            case 7:
                                this.b.d0.c(true);
                                break;
                            case 8:
                                this.b.d0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.hk hkVar3 = (org.telegram.ui.hk) this.b.d0;
                                hkVar3.a(true);
                                org.telegram.ui.wm wmVar3 = hkVar3.I;
                                wmVar3.w5.d(null, wmVar3.k6);
                                wmVar3.z8();
                                break;
                            case 10:
                                this.b.d0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.hk hkVar4 = (org.telegram.ui.hk) this.b.d0;
                                hkVar4.a(true);
                                org.telegram.ui.wm wmVar4 = hkVar4.I;
                                wmVar4.X5 = null;
                                org.telegram.ui.mj mjVar = wmVar4.a0;
                                if (mjVar != null) {
                                    mjVar.Y2 = null;
                                    mjVar.Z2 = false;
                                }
                                org.telegram.messenger.dj djVar6 = wmVar4.w5;
                                if (djVar6 != null) {
                                    i172 = ((org.telegram.ui.ActionBar.d2) wmVar4).currentAccount;
                                    org.telegram.messenger.zi ziVar = wmVar4.E5;
                                    djVar6.e(i172, null, null, ziVar == wmVar4.m4 ? null : ziVar, wmVar4.C5, wmVar4.G5);
                                }
                                wmVar4.z8();
                                break;
                            case 12:
                                x90 x90Var6 = this.b;
                                org.telegram.messenger.dj djVar7 = x90Var6.d0.d;
                                if (djVar7.o) {
                                    boolean z15 = !djVar7.q;
                                    djVar7.q = z15;
                                    x90Var6.H.a(z15, true);
                                    x90Var6.I.a(djVar7.q, true);
                                    if (x90Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.zi) x90Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z16 = djVar7.q;
                                        messageMedia2.force_small_media = z16;
                                        messageMedia2.force_large_media = !z16;
                                    }
                                    if (x90Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.zi) x90Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                        boolean z17 = djVar7.q;
                                        messageMedia.force_small_media = z17;
                                        messageMedia.force_large_media = !z17;
                                    }
                                    x90Var6.i();
                                    x90Var6.V = true;
                                    break;
                                }
                                break;
                            default:
                                x90 x90Var7 = this.b;
                                org.telegram.messenger.dj djVar8 = x90Var7.d0.d;
                                boolean z18 = djVar8.r;
                                djVar8.r = !z18;
                                x90Var7.F.a(z18, true);
                                if (x90Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.zi) x90Var7.r.e.get(0)).k) != null) {
                                    message4.invert_media = djVar8.r;
                                }
                                if (x90Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.zi) x90Var7.r.f.get(0)).k) != null) {
                                    message3.invert_media = djVar8.r;
                                }
                                x90Var7.i();
                                x90Var7.V = true;
                                break;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(y0Var5, b8.mf.o(-1, 48));
                org.telegram.ui.ActionBar.y0 y0Var6 = new org.telegram.ui.ActionBar.y0(1, context, da0Var.G, false, true);
                y0Var6.j(org.telegram.messenger.bd.M0(z12 ? 2131751361 : 2131751360, r11), R.drawable.msg_delete, r11);
                int i23 = org.telegram.ui.ActionBar.k6.q7;
                int i24 = org.telegram.ui.ActionBar.k6.p7;
                y0Var6.c(i23, i24);
                y0Var6.h(0.12f, i24);
                final int i25 = 6;
                y0Var6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.m90
                    public final /* synthetic */ x90 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i172;
                        TLRPC.Message message;
                        TLRPC.MessageMedia messageMedia;
                        TLRPC.Message message2;
                        TLRPC.MessageMedia messageMedia2;
                        TLRPC.Message message3;
                        TLRPC.Message message4;
                        switch (i25) {
                            case 0:
                                x90 x90Var3 = this.b;
                                x90Var3.d0.d.d = null;
                                x90Var3.e.f(false);
                                x90Var3.h(false, false);
                                x90Var3.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                x90 x90Var4 = this.b;
                                r90 r90Var2 = x90Var4.e;
                                da0 da0Var2 = x90Var4.d0;
                                if (x90Var4.c(null) != null) {
                                    if (r90Var2.v - r90Var2.u <= org.telegram.messenger.hp.s1(da0Var2.x).o4) {
                                        org.telegram.ui.Cells.p9 p9Var = r90Var2.W;
                                        org.telegram.messenger.zi c10 = x90Var4.c(p9Var != null ? ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() : null);
                                        org.telegram.messenger.dj djVar4 = da0Var2.d;
                                        int i182 = r90Var2.u;
                                        djVar4.e = i182;
                                        int i192 = r90Var2.v;
                                        djVar4.f = i192;
                                        djVar4.d = org.telegram.ui.mm.b(i182, i192, c10);
                                        da0Var2.b();
                                        da0Var2.a(true);
                                        break;
                                    } else {
                                        x90Var4.g();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                x90 x90Var5 = this.b;
                                r90 r90Var3 = x90Var5.e;
                                da0 da0Var3 = x90Var5.d0;
                                org.telegram.messenger.dj djVar5 = da0Var3.d;
                                int i202 = da0Var3.x;
                                boolean z142 = da0Var3.b;
                                if (djVar5.d != null && !z142) {
                                    djVar5.d = null;
                                    r90Var3.f(false);
                                    x90Var5.h(false, true);
                                    x90Var5.l(true);
                                    break;
                                } else if (r90Var3.v - r90Var3.u <= org.telegram.messenger.hp.s1(i202).o4) {
                                    org.telegram.messenger.zi c11 = x90Var5.c(null);
                                    if (c11 != null) {
                                        if (!r90Var3.x()) {
                                            djVar5.e = 0;
                                            int min = Math.min(org.telegram.messenger.hp.s1(i202).o4, org.telegram.ui.mm.d(c11));
                                            djVar5.f = min;
                                            djVar5.d = org.telegram.ui.mm.b(djVar5.e, min, c11);
                                            View d = x90Var5.d();
                                            if (d instanceof org.telegram.ui.Cells.q1) {
                                                r90Var3.a0((org.telegram.ui.Cells.q1) d, djVar5.e, djVar5.f);
                                            }
                                            if (!z142) {
                                                x90Var5.s.getSwipeBack().e(x90Var5.J);
                                            }
                                            x90Var5.h(true, true);
                                            break;
                                        } else {
                                            djVar5.e = r90Var3.u;
                                            djVar5.f = r90Var3.v;
                                            org.telegram.ui.Cells.p9 p9Var2 = r90Var3.W;
                                            djVar5.d = org.telegram.ui.mm.b(djVar5.e, djVar5.f, x90Var5.c(p9Var2 != null ? ((org.telegram.ui.Cells.q1) p9Var2).getMessageObject() : null));
                                            da0Var3.b();
                                            da0Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    x90Var5.g();
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
                                da0 da0Var4 = this.b.d0;
                                if (!da0Var4.b) {
                                    org.telegram.ui.hk hkVar = (org.telegram.ui.hk) da0Var4;
                                    hkVar.a(true);
                                    org.telegram.ui.wm wmVar = hkVar.I;
                                    wmVar.E5 = null;
                                    wmVar.C5 = null;
                                    wmVar.w5.f(null, null, wmVar.k6, null);
                                    wmVar.z8();
                                    break;
                                } else {
                                    org.telegram.ui.hk hkVar2 = (org.telegram.ui.hk) da0Var4;
                                    hkVar2.a(true);
                                    org.telegram.ui.wm wmVar2 = hkVar2.I;
                                    wmVar2.C5 = null;
                                    wmVar2.ec(wmVar2.E5);
                                    break;
                                }
                            case 7:
                                this.b.d0.c(true);
                                break;
                            case 8:
                                this.b.d0.a(true);
                                break;
                            case 9:
                                org.telegram.ui.hk hkVar3 = (org.telegram.ui.hk) this.b.d0;
                                hkVar3.a(true);
                                org.telegram.ui.wm wmVar3 = hkVar3.I;
                                wmVar3.w5.d(null, wmVar3.k6);
                                wmVar3.z8();
                                break;
                            case 10:
                                this.b.d0.a(true);
                                break;
                            case 11:
                                org.telegram.ui.hk hkVar4 = (org.telegram.ui.hk) this.b.d0;
                                hkVar4.a(true);
                                org.telegram.ui.wm wmVar4 = hkVar4.I;
                                wmVar4.X5 = null;
                                org.telegram.ui.mj mjVar = wmVar4.a0;
                                if (mjVar != null) {
                                    mjVar.Y2 = null;
                                    mjVar.Z2 = false;
                                }
                                org.telegram.messenger.dj djVar6 = wmVar4.w5;
                                if (djVar6 != null) {
                                    i172 = ((org.telegram.ui.ActionBar.d2) wmVar4).currentAccount;
                                    org.telegram.messenger.zi ziVar = wmVar4.E5;
                                    djVar6.e(i172, null, null, ziVar == wmVar4.m4 ? null : ziVar, wmVar4.C5, wmVar4.G5);
                                }
                                wmVar4.z8();
                                break;
                            case 12:
                                x90 x90Var6 = this.b;
                                org.telegram.messenger.dj djVar7 = x90Var6.d0.d;
                                if (djVar7.o) {
                                    boolean z15 = !djVar7.q;
                                    djVar7.q = z15;
                                    x90Var6.H.a(z15, true);
                                    x90Var6.I.a(djVar7.q, true);
                                    if (x90Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.zi) x90Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z16 = djVar7.q;
                                        messageMedia2.force_small_media = z16;
                                        messageMedia2.force_large_media = !z16;
                                    }
                                    if (x90Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.zi) x90Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                        boolean z17 = djVar7.q;
                                        messageMedia.force_small_media = z17;
                                        messageMedia.force_large_media = !z17;
                                    }
                                    x90Var6.i();
                                    x90Var6.V = true;
                                    break;
                                }
                                break;
                            default:
                                x90 x90Var7 = this.b;
                                org.telegram.messenger.dj djVar8 = x90Var7.d0.d;
                                boolean z18 = djVar8.r;
                                djVar8.r = !z18;
                                x90Var7.F.a(z18, true);
                                if (x90Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.zi) x90Var7.r.e.get(0)).k) != null) {
                                    message4.invert_media = djVar8.r;
                                }
                                if (x90Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.zi) x90Var7.r.f.get(0)).k) != null) {
                                    message3.invert_media = djVar8.r;
                                }
                                x90Var7.i();
                                x90Var7.V = true;
                                break;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(y0Var6, b8.mf.o(-1, 48));
                context2 = context;
                x90Var2 = this;
                viewOutlineProvider = r11;
                i10 = x90Var2.a;
                if (i10 == 1) {
                    x90Var2.r = djVar.b;
                } else if (i10 == 0) {
                    x90Var2.r = djVar.a;
                } else if (i10 == 2) {
                    x90Var2.r = djVar.c;
                }
                n4 = x90Var2.e.n(context2);
                x90Var2.d = n4;
                n4.setElevation(org.telegram.messenger.g0.L(8.0f));
                n4.setOutlineProvider(viewOutlineProvider);
                if (n4.getParent() instanceof ViewGroup) {
                    ((ViewGroup) n4.getParent()).removeView(n4);
                }
                x90Var2.addView(n4, b8.mf.d(-1, -1.0f, 51, 0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / org.telegram.messenger.g0.p, 0.0f, 0.0f));
                x90Var2.e.S(x90Var2.f);
            }
        }
        djVar = djVar3;
        viewOutlineProvider = null;
        viewOutlineProvider = null;
        if (i3 != 1 || djVar.b == null) {
            final x90 x90Var3 = this;
            x90Var = x90Var3;
            if (i3 == 2) {
                x90Var = x90Var3;
                if (djVar.c != null) {
                    ca0 ca0Var3 = new ca0(context, R.raw.position_below, org.telegram.messenger.bd.M0(2131748935, null), R.raw.position_above, org.telegram.messenger.bd.M0(2131748931, null), da0Var.G);
                    x90Var3.F = ca0Var3;
                    ca0Var3.a(!djVar.r, false);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(ca0Var3, b8.mf.o(-1, 48));
                    FrameLayout frameLayout3 = new FrameLayout(context);
                    x90Var3.G = frameLayout3;
                    int i26 = org.telegram.ui.ActionBar.k6.I5;
                    org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i26, z90Var), 0, 0);
                    org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i26);
                    frameLayout3.setBackground(a03);
                    org.telegram.ui.ActionBar.r6.k(frameLayout3, a03, null, N2, z90Var);
                    ca0 ca0Var4 = new ca0(context, R.raw.media_shrink, org.telegram.messenger.bd.M0(2131748907, null), R.raw.media_enlarge, org.telegram.messenger.bd.M0(2131748906, null), da0Var.G);
                    x90Var3.H = ca0Var4;
                    ca0Var4.setBackground(null);
                    ca0Var4.setVisibility(djVar.p ? 4 : 0);
                    frameLayout3.addView(ca0Var4, b8.mf.o(-1, 48));
                    ca0 ca0Var5 = new ca0(context, R.raw.media_shrink, org.telegram.messenger.bd.M0(2131748893, null), R.raw.media_enlarge, org.telegram.messenger.bd.M0(2131748892, null), da0Var.G);
                    x90Var3.I = ca0Var5;
                    ca0Var5.setBackground(null);
                    ca0Var5.setVisibility(!djVar.p ? 4 : 0);
                    frameLayout3.setAlpha(djVar.o ? 1.0f : 0.5f);
                    frameLayout3.addView(ca0Var5, b8.mf.o(-1, 48));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout3, b8.mf.o(-1, 48));
                    frameLayout3.setVisibility((!djVar.n || djVar.o) ? 0 : 8);
                    ca0Var4.a(djVar.q, false);
                    ca0Var5.a(djVar.q, false);
                    View c1Var3 = new org.telegram.ui.ActionBar.c1(context, z90Var);
                    org.telegram.ui.ActionBar.r6.j(c1Var3, org.telegram.ui.ActionBar.r6.L(0.06f, org.telegram.ui.ActionBar.k6.E8), z90Var);
                    c1Var3.setTag(R.id.fit_width_tag, 1);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(c1Var3, b8.mf.o(-1, 8));
                    org.telegram.ui.ActionBar.y0 y0Var7 = new org.telegram.ui.ActionBar.y0(1, context, da0Var.G, false, false);
                    y0Var7.j(org.telegram.messenger.bd.M0(2131754218, null), R.drawable.msg_select, null);
                    final int i27 = 10;
                    y0Var7.setOnClickListener(new View.OnClickListener(x90Var3) { // from class: org.telegram.ui.Components.m90
                        public final /* synthetic */ x90 b;

                        {
                            this.b = x90Var3;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i172;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (i27) {
                                case 0:
                                    x90 x90Var32 = this.b;
                                    x90Var32.d0.d.d = null;
                                    x90Var32.e.f(false);
                                    x90Var32.h(false, false);
                                    x90Var32.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    x90 x90Var4 = this.b;
                                    r90 r90Var2 = x90Var4.e;
                                    da0 da0Var2 = x90Var4.d0;
                                    if (x90Var4.c(null) != null) {
                                        if (r90Var2.v - r90Var2.u <= org.telegram.messenger.hp.s1(da0Var2.x).o4) {
                                            org.telegram.ui.Cells.p9 p9Var = r90Var2.W;
                                            org.telegram.messenger.zi c10 = x90Var4.c(p9Var != null ? ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() : null);
                                            org.telegram.messenger.dj djVar4 = da0Var2.d;
                                            int i182 = r90Var2.u;
                                            djVar4.e = i182;
                                            int i192 = r90Var2.v;
                                            djVar4.f = i192;
                                            djVar4.d = org.telegram.ui.mm.b(i182, i192, c10);
                                            da0Var2.b();
                                            da0Var2.a(true);
                                            break;
                                        } else {
                                            x90Var4.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    x90 x90Var5 = this.b;
                                    r90 r90Var3 = x90Var5.e;
                                    da0 da0Var3 = x90Var5.d0;
                                    org.telegram.messenger.dj djVar5 = da0Var3.d;
                                    int i202 = da0Var3.x;
                                    boolean z142 = da0Var3.b;
                                    if (djVar5.d != null && !z142) {
                                        djVar5.d = null;
                                        r90Var3.f(false);
                                        x90Var5.h(false, true);
                                        x90Var5.l(true);
                                        break;
                                    } else if (r90Var3.v - r90Var3.u <= org.telegram.messenger.hp.s1(i202).o4) {
                                        org.telegram.messenger.zi c11 = x90Var5.c(null);
                                        if (c11 != null) {
                                            if (!r90Var3.x()) {
                                                djVar5.e = 0;
                                                int min = Math.min(org.telegram.messenger.hp.s1(i202).o4, org.telegram.ui.mm.d(c11));
                                                djVar5.f = min;
                                                djVar5.d = org.telegram.ui.mm.b(djVar5.e, min, c11);
                                                View d = x90Var5.d();
                                                if (d instanceof org.telegram.ui.Cells.q1) {
                                                    r90Var3.a0((org.telegram.ui.Cells.q1) d, djVar5.e, djVar5.f);
                                                }
                                                if (!z142) {
                                                    x90Var5.s.getSwipeBack().e(x90Var5.J);
                                                }
                                                x90Var5.h(true, true);
                                                break;
                                            } else {
                                                djVar5.e = r90Var3.u;
                                                djVar5.f = r90Var3.v;
                                                org.telegram.ui.Cells.p9 p9Var2 = r90Var3.W;
                                                djVar5.d = org.telegram.ui.mm.b(djVar5.e, djVar5.f, x90Var5.c(p9Var2 != null ? ((org.telegram.ui.Cells.q1) p9Var2).getMessageObject() : null));
                                                da0Var3.b();
                                                da0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        x90Var5.g();
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
                                    da0 da0Var4 = this.b.d0;
                                    if (!da0Var4.b) {
                                        org.telegram.ui.hk hkVar = (org.telegram.ui.hk) da0Var4;
                                        hkVar.a(true);
                                        org.telegram.ui.wm wmVar = hkVar.I;
                                        wmVar.E5 = null;
                                        wmVar.C5 = null;
                                        wmVar.w5.f(null, null, wmVar.k6, null);
                                        wmVar.z8();
                                        break;
                                    } else {
                                        org.telegram.ui.hk hkVar2 = (org.telegram.ui.hk) da0Var4;
                                        hkVar2.a(true);
                                        org.telegram.ui.wm wmVar2 = hkVar2.I;
                                        wmVar2.C5 = null;
                                        wmVar2.ec(wmVar2.E5);
                                        break;
                                    }
                                case 7:
                                    this.b.d0.c(true);
                                    break;
                                case 8:
                                    this.b.d0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.hk hkVar3 = (org.telegram.ui.hk) this.b.d0;
                                    hkVar3.a(true);
                                    org.telegram.ui.wm wmVar3 = hkVar3.I;
                                    wmVar3.w5.d(null, wmVar3.k6);
                                    wmVar3.z8();
                                    break;
                                case 10:
                                    this.b.d0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.hk hkVar4 = (org.telegram.ui.hk) this.b.d0;
                                    hkVar4.a(true);
                                    org.telegram.ui.wm wmVar4 = hkVar4.I;
                                    wmVar4.X5 = null;
                                    org.telegram.ui.mj mjVar = wmVar4.a0;
                                    if (mjVar != null) {
                                        mjVar.Y2 = null;
                                        mjVar.Z2 = false;
                                    }
                                    org.telegram.messenger.dj djVar6 = wmVar4.w5;
                                    if (djVar6 != null) {
                                        i172 = ((org.telegram.ui.ActionBar.d2) wmVar4).currentAccount;
                                        org.telegram.messenger.zi ziVar = wmVar4.E5;
                                        djVar6.e(i172, null, null, ziVar == wmVar4.m4 ? null : ziVar, wmVar4.C5, wmVar4.G5);
                                    }
                                    wmVar4.z8();
                                    break;
                                case 12:
                                    x90 x90Var6 = this.b;
                                    org.telegram.messenger.dj djVar7 = x90Var6.d0.d;
                                    if (djVar7.o) {
                                        boolean z15 = !djVar7.q;
                                        djVar7.q = z15;
                                        x90Var6.H.a(z15, true);
                                        x90Var6.I.a(djVar7.q, true);
                                        if (x90Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.zi) x90Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z16 = djVar7.q;
                                            messageMedia2.force_small_media = z16;
                                            messageMedia2.force_large_media = !z16;
                                        }
                                        if (x90Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.zi) x90Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z17 = djVar7.q;
                                            messageMedia.force_small_media = z17;
                                            messageMedia.force_large_media = !z17;
                                        }
                                        x90Var6.i();
                                        x90Var6.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    x90 x90Var7 = this.b;
                                    org.telegram.messenger.dj djVar8 = x90Var7.d0.d;
                                    boolean z18 = djVar8.r;
                                    djVar8.r = !z18;
                                    x90Var7.F.a(z18, true);
                                    if (x90Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.zi) x90Var7.r.e.get(0)).k) != null) {
                                        message4.invert_media = djVar8.r;
                                    }
                                    if (x90Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.zi) x90Var7.r.f.get(0)).k) != null) {
                                        message3.invert_media = djVar8.r;
                                    }
                                    x90Var7.i();
                                    x90Var7.V = true;
                                    break;
                            }
                        }
                    });
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(y0Var7, b8.mf.o(-1, 48));
                    org.telegram.ui.ActionBar.y0 y0Var8 = new org.telegram.ui.ActionBar.y0(1, context, da0Var.G, false, true);
                    context2 = context;
                    y0Var8.j(org.telegram.messenger.bd.M0(2131751362, null), R.drawable.msg_delete, null);
                    int i28 = org.telegram.ui.ActionBar.k6.q7;
                    int i29 = org.telegram.ui.ActionBar.k6.p7;
                    y0Var8.c(i28, i29);
                    final int i30 = 11;
                    y0Var8.setOnClickListener(new View.OnClickListener(x90Var3) { // from class: org.telegram.ui.Components.m90
                        public final /* synthetic */ x90 b;

                        {
                            this.b = x90Var3;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i172;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (i30) {
                                case 0:
                                    x90 x90Var32 = this.b;
                                    x90Var32.d0.d.d = null;
                                    x90Var32.e.f(false);
                                    x90Var32.h(false, false);
                                    x90Var32.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    x90 x90Var4 = this.b;
                                    r90 r90Var2 = x90Var4.e;
                                    da0 da0Var2 = x90Var4.d0;
                                    if (x90Var4.c(null) != null) {
                                        if (r90Var2.v - r90Var2.u <= org.telegram.messenger.hp.s1(da0Var2.x).o4) {
                                            org.telegram.ui.Cells.p9 p9Var = r90Var2.W;
                                            org.telegram.messenger.zi c10 = x90Var4.c(p9Var != null ? ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() : null);
                                            org.telegram.messenger.dj djVar4 = da0Var2.d;
                                            int i182 = r90Var2.u;
                                            djVar4.e = i182;
                                            int i192 = r90Var2.v;
                                            djVar4.f = i192;
                                            djVar4.d = org.telegram.ui.mm.b(i182, i192, c10);
                                            da0Var2.b();
                                            da0Var2.a(true);
                                            break;
                                        } else {
                                            x90Var4.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    x90 x90Var5 = this.b;
                                    r90 r90Var3 = x90Var5.e;
                                    da0 da0Var3 = x90Var5.d0;
                                    org.telegram.messenger.dj djVar5 = da0Var3.d;
                                    int i202 = da0Var3.x;
                                    boolean z142 = da0Var3.b;
                                    if (djVar5.d != null && !z142) {
                                        djVar5.d = null;
                                        r90Var3.f(false);
                                        x90Var5.h(false, true);
                                        x90Var5.l(true);
                                        break;
                                    } else if (r90Var3.v - r90Var3.u <= org.telegram.messenger.hp.s1(i202).o4) {
                                        org.telegram.messenger.zi c11 = x90Var5.c(null);
                                        if (c11 != null) {
                                            if (!r90Var3.x()) {
                                                djVar5.e = 0;
                                                int min = Math.min(org.telegram.messenger.hp.s1(i202).o4, org.telegram.ui.mm.d(c11));
                                                djVar5.f = min;
                                                djVar5.d = org.telegram.ui.mm.b(djVar5.e, min, c11);
                                                View d = x90Var5.d();
                                                if (d instanceof org.telegram.ui.Cells.q1) {
                                                    r90Var3.a0((org.telegram.ui.Cells.q1) d, djVar5.e, djVar5.f);
                                                }
                                                if (!z142) {
                                                    x90Var5.s.getSwipeBack().e(x90Var5.J);
                                                }
                                                x90Var5.h(true, true);
                                                break;
                                            } else {
                                                djVar5.e = r90Var3.u;
                                                djVar5.f = r90Var3.v;
                                                org.telegram.ui.Cells.p9 p9Var2 = r90Var3.W;
                                                djVar5.d = org.telegram.ui.mm.b(djVar5.e, djVar5.f, x90Var5.c(p9Var2 != null ? ((org.telegram.ui.Cells.q1) p9Var2).getMessageObject() : null));
                                                da0Var3.b();
                                                da0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        x90Var5.g();
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
                                    da0 da0Var4 = this.b.d0;
                                    if (!da0Var4.b) {
                                        org.telegram.ui.hk hkVar = (org.telegram.ui.hk) da0Var4;
                                        hkVar.a(true);
                                        org.telegram.ui.wm wmVar = hkVar.I;
                                        wmVar.E5 = null;
                                        wmVar.C5 = null;
                                        wmVar.w5.f(null, null, wmVar.k6, null);
                                        wmVar.z8();
                                        break;
                                    } else {
                                        org.telegram.ui.hk hkVar2 = (org.telegram.ui.hk) da0Var4;
                                        hkVar2.a(true);
                                        org.telegram.ui.wm wmVar2 = hkVar2.I;
                                        wmVar2.C5 = null;
                                        wmVar2.ec(wmVar2.E5);
                                        break;
                                    }
                                case 7:
                                    this.b.d0.c(true);
                                    break;
                                case 8:
                                    this.b.d0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.hk hkVar3 = (org.telegram.ui.hk) this.b.d0;
                                    hkVar3.a(true);
                                    org.telegram.ui.wm wmVar3 = hkVar3.I;
                                    wmVar3.w5.d(null, wmVar3.k6);
                                    wmVar3.z8();
                                    break;
                                case 10:
                                    this.b.d0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.hk hkVar4 = (org.telegram.ui.hk) this.b.d0;
                                    hkVar4.a(true);
                                    org.telegram.ui.wm wmVar4 = hkVar4.I;
                                    wmVar4.X5 = null;
                                    org.telegram.ui.mj mjVar = wmVar4.a0;
                                    if (mjVar != null) {
                                        mjVar.Y2 = null;
                                        mjVar.Z2 = false;
                                    }
                                    org.telegram.messenger.dj djVar6 = wmVar4.w5;
                                    if (djVar6 != null) {
                                        i172 = ((org.telegram.ui.ActionBar.d2) wmVar4).currentAccount;
                                        org.telegram.messenger.zi ziVar = wmVar4.E5;
                                        djVar6.e(i172, null, null, ziVar == wmVar4.m4 ? null : ziVar, wmVar4.C5, wmVar4.G5);
                                    }
                                    wmVar4.z8();
                                    break;
                                case 12:
                                    x90 x90Var6 = this.b;
                                    org.telegram.messenger.dj djVar7 = x90Var6.d0.d;
                                    if (djVar7.o) {
                                        boolean z15 = !djVar7.q;
                                        djVar7.q = z15;
                                        x90Var6.H.a(z15, true);
                                        x90Var6.I.a(djVar7.q, true);
                                        if (x90Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.zi) x90Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z16 = djVar7.q;
                                            messageMedia2.force_small_media = z16;
                                            messageMedia2.force_large_media = !z16;
                                        }
                                        if (x90Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.zi) x90Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z17 = djVar7.q;
                                            messageMedia.force_small_media = z17;
                                            messageMedia.force_large_media = !z17;
                                        }
                                        x90Var6.i();
                                        x90Var6.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    x90 x90Var7 = this.b;
                                    org.telegram.messenger.dj djVar8 = x90Var7.d0.d;
                                    boolean z18 = djVar8.r;
                                    djVar8.r = !z18;
                                    x90Var7.F.a(z18, true);
                                    if (x90Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.zi) x90Var7.r.e.get(0)).k) != null) {
                                        message4.invert_media = djVar8.r;
                                    }
                                    if (x90Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.zi) x90Var7.r.f.get(0)).k) != null) {
                                        message3.invert_media = djVar8.r;
                                    }
                                    x90Var7.i();
                                    x90Var7.V = true;
                                    break;
                            }
                        }
                    });
                    y0Var8.h(0.12f, i29);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(y0Var8, b8.mf.o(-1, 48));
                    final int i31 = 12;
                    frameLayout3.setOnClickListener(new View.OnClickListener(x90Var3) { // from class: org.telegram.ui.Components.m90
                        public final /* synthetic */ x90 b;

                        {
                            this.b = x90Var3;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i172;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (i31) {
                                case 0:
                                    x90 x90Var32 = this.b;
                                    x90Var32.d0.d.d = null;
                                    x90Var32.e.f(false);
                                    x90Var32.h(false, false);
                                    x90Var32.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    x90 x90Var4 = this.b;
                                    r90 r90Var2 = x90Var4.e;
                                    da0 da0Var2 = x90Var4.d0;
                                    if (x90Var4.c(null) != null) {
                                        if (r90Var2.v - r90Var2.u <= org.telegram.messenger.hp.s1(da0Var2.x).o4) {
                                            org.telegram.ui.Cells.p9 p9Var = r90Var2.W;
                                            org.telegram.messenger.zi c10 = x90Var4.c(p9Var != null ? ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() : null);
                                            org.telegram.messenger.dj djVar4 = da0Var2.d;
                                            int i182 = r90Var2.u;
                                            djVar4.e = i182;
                                            int i192 = r90Var2.v;
                                            djVar4.f = i192;
                                            djVar4.d = org.telegram.ui.mm.b(i182, i192, c10);
                                            da0Var2.b();
                                            da0Var2.a(true);
                                            break;
                                        } else {
                                            x90Var4.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    x90 x90Var5 = this.b;
                                    r90 r90Var3 = x90Var5.e;
                                    da0 da0Var3 = x90Var5.d0;
                                    org.telegram.messenger.dj djVar5 = da0Var3.d;
                                    int i202 = da0Var3.x;
                                    boolean z142 = da0Var3.b;
                                    if (djVar5.d != null && !z142) {
                                        djVar5.d = null;
                                        r90Var3.f(false);
                                        x90Var5.h(false, true);
                                        x90Var5.l(true);
                                        break;
                                    } else if (r90Var3.v - r90Var3.u <= org.telegram.messenger.hp.s1(i202).o4) {
                                        org.telegram.messenger.zi c11 = x90Var5.c(null);
                                        if (c11 != null) {
                                            if (!r90Var3.x()) {
                                                djVar5.e = 0;
                                                int min = Math.min(org.telegram.messenger.hp.s1(i202).o4, org.telegram.ui.mm.d(c11));
                                                djVar5.f = min;
                                                djVar5.d = org.telegram.ui.mm.b(djVar5.e, min, c11);
                                                View d = x90Var5.d();
                                                if (d instanceof org.telegram.ui.Cells.q1) {
                                                    r90Var3.a0((org.telegram.ui.Cells.q1) d, djVar5.e, djVar5.f);
                                                }
                                                if (!z142) {
                                                    x90Var5.s.getSwipeBack().e(x90Var5.J);
                                                }
                                                x90Var5.h(true, true);
                                                break;
                                            } else {
                                                djVar5.e = r90Var3.u;
                                                djVar5.f = r90Var3.v;
                                                org.telegram.ui.Cells.p9 p9Var2 = r90Var3.W;
                                                djVar5.d = org.telegram.ui.mm.b(djVar5.e, djVar5.f, x90Var5.c(p9Var2 != null ? ((org.telegram.ui.Cells.q1) p9Var2).getMessageObject() : null));
                                                da0Var3.b();
                                                da0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        x90Var5.g();
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
                                    da0 da0Var4 = this.b.d0;
                                    if (!da0Var4.b) {
                                        org.telegram.ui.hk hkVar = (org.telegram.ui.hk) da0Var4;
                                        hkVar.a(true);
                                        org.telegram.ui.wm wmVar = hkVar.I;
                                        wmVar.E5 = null;
                                        wmVar.C5 = null;
                                        wmVar.w5.f(null, null, wmVar.k6, null);
                                        wmVar.z8();
                                        break;
                                    } else {
                                        org.telegram.ui.hk hkVar2 = (org.telegram.ui.hk) da0Var4;
                                        hkVar2.a(true);
                                        org.telegram.ui.wm wmVar2 = hkVar2.I;
                                        wmVar2.C5 = null;
                                        wmVar2.ec(wmVar2.E5);
                                        break;
                                    }
                                case 7:
                                    this.b.d0.c(true);
                                    break;
                                case 8:
                                    this.b.d0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.hk hkVar3 = (org.telegram.ui.hk) this.b.d0;
                                    hkVar3.a(true);
                                    org.telegram.ui.wm wmVar3 = hkVar3.I;
                                    wmVar3.w5.d(null, wmVar3.k6);
                                    wmVar3.z8();
                                    break;
                                case 10:
                                    this.b.d0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.hk hkVar4 = (org.telegram.ui.hk) this.b.d0;
                                    hkVar4.a(true);
                                    org.telegram.ui.wm wmVar4 = hkVar4.I;
                                    wmVar4.X5 = null;
                                    org.telegram.ui.mj mjVar = wmVar4.a0;
                                    if (mjVar != null) {
                                        mjVar.Y2 = null;
                                        mjVar.Z2 = false;
                                    }
                                    org.telegram.messenger.dj djVar6 = wmVar4.w5;
                                    if (djVar6 != null) {
                                        i172 = ((org.telegram.ui.ActionBar.d2) wmVar4).currentAccount;
                                        org.telegram.messenger.zi ziVar = wmVar4.E5;
                                        djVar6.e(i172, null, null, ziVar == wmVar4.m4 ? null : ziVar, wmVar4.C5, wmVar4.G5);
                                    }
                                    wmVar4.z8();
                                    break;
                                case 12:
                                    x90 x90Var6 = this.b;
                                    org.telegram.messenger.dj djVar7 = x90Var6.d0.d;
                                    if (djVar7.o) {
                                        boolean z15 = !djVar7.q;
                                        djVar7.q = z15;
                                        x90Var6.H.a(z15, true);
                                        x90Var6.I.a(djVar7.q, true);
                                        if (x90Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.zi) x90Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z16 = djVar7.q;
                                            messageMedia2.force_small_media = z16;
                                            messageMedia2.force_large_media = !z16;
                                        }
                                        if (x90Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.zi) x90Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z17 = djVar7.q;
                                            messageMedia.force_small_media = z17;
                                            messageMedia.force_large_media = !z17;
                                        }
                                        x90Var6.i();
                                        x90Var6.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    x90 x90Var7 = this.b;
                                    org.telegram.messenger.dj djVar8 = x90Var7.d0.d;
                                    boolean z18 = djVar8.r;
                                    djVar8.r = !z18;
                                    x90Var7.F.a(z18, true);
                                    if (x90Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.zi) x90Var7.r.e.get(0)).k) != null) {
                                        message4.invert_media = djVar8.r;
                                    }
                                    if (x90Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.zi) x90Var7.r.f.get(0)).k) != null) {
                                        message3.invert_media = djVar8.r;
                                    }
                                    x90Var7.i();
                                    x90Var7.V = true;
                                    break;
                            }
                        }
                    });
                    final int i32 = 13;
                    ca0Var3.setOnClickListener(new View.OnClickListener(x90Var3) { // from class: org.telegram.ui.Components.m90
                        public final /* synthetic */ x90 b;

                        {
                            this.b = x90Var3;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i172;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (i32) {
                                case 0:
                                    x90 x90Var32 = this.b;
                                    x90Var32.d0.d.d = null;
                                    x90Var32.e.f(false);
                                    x90Var32.h(false, false);
                                    x90Var32.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    x90 x90Var4 = this.b;
                                    r90 r90Var2 = x90Var4.e;
                                    da0 da0Var2 = x90Var4.d0;
                                    if (x90Var4.c(null) != null) {
                                        if (r90Var2.v - r90Var2.u <= org.telegram.messenger.hp.s1(da0Var2.x).o4) {
                                            org.telegram.ui.Cells.p9 p9Var = r90Var2.W;
                                            org.telegram.messenger.zi c10 = x90Var4.c(p9Var != null ? ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() : null);
                                            org.telegram.messenger.dj djVar4 = da0Var2.d;
                                            int i182 = r90Var2.u;
                                            djVar4.e = i182;
                                            int i192 = r90Var2.v;
                                            djVar4.f = i192;
                                            djVar4.d = org.telegram.ui.mm.b(i182, i192, c10);
                                            da0Var2.b();
                                            da0Var2.a(true);
                                            break;
                                        } else {
                                            x90Var4.g();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    x90 x90Var5 = this.b;
                                    r90 r90Var3 = x90Var5.e;
                                    da0 da0Var3 = x90Var5.d0;
                                    org.telegram.messenger.dj djVar5 = da0Var3.d;
                                    int i202 = da0Var3.x;
                                    boolean z142 = da0Var3.b;
                                    if (djVar5.d != null && !z142) {
                                        djVar5.d = null;
                                        r90Var3.f(false);
                                        x90Var5.h(false, true);
                                        x90Var5.l(true);
                                        break;
                                    } else if (r90Var3.v - r90Var3.u <= org.telegram.messenger.hp.s1(i202).o4) {
                                        org.telegram.messenger.zi c11 = x90Var5.c(null);
                                        if (c11 != null) {
                                            if (!r90Var3.x()) {
                                                djVar5.e = 0;
                                                int min = Math.min(org.telegram.messenger.hp.s1(i202).o4, org.telegram.ui.mm.d(c11));
                                                djVar5.f = min;
                                                djVar5.d = org.telegram.ui.mm.b(djVar5.e, min, c11);
                                                View d = x90Var5.d();
                                                if (d instanceof org.telegram.ui.Cells.q1) {
                                                    r90Var3.a0((org.telegram.ui.Cells.q1) d, djVar5.e, djVar5.f);
                                                }
                                                if (!z142) {
                                                    x90Var5.s.getSwipeBack().e(x90Var5.J);
                                                }
                                                x90Var5.h(true, true);
                                                break;
                                            } else {
                                                djVar5.e = r90Var3.u;
                                                djVar5.f = r90Var3.v;
                                                org.telegram.ui.Cells.p9 p9Var2 = r90Var3.W;
                                                djVar5.d = org.telegram.ui.mm.b(djVar5.e, djVar5.f, x90Var5.c(p9Var2 != null ? ((org.telegram.ui.Cells.q1) p9Var2).getMessageObject() : null));
                                                da0Var3.b();
                                                da0Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        x90Var5.g();
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
                                    da0 da0Var4 = this.b.d0;
                                    if (!da0Var4.b) {
                                        org.telegram.ui.hk hkVar = (org.telegram.ui.hk) da0Var4;
                                        hkVar.a(true);
                                        org.telegram.ui.wm wmVar = hkVar.I;
                                        wmVar.E5 = null;
                                        wmVar.C5 = null;
                                        wmVar.w5.f(null, null, wmVar.k6, null);
                                        wmVar.z8();
                                        break;
                                    } else {
                                        org.telegram.ui.hk hkVar2 = (org.telegram.ui.hk) da0Var4;
                                        hkVar2.a(true);
                                        org.telegram.ui.wm wmVar2 = hkVar2.I;
                                        wmVar2.C5 = null;
                                        wmVar2.ec(wmVar2.E5);
                                        break;
                                    }
                                case 7:
                                    this.b.d0.c(true);
                                    break;
                                case 8:
                                    this.b.d0.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.hk hkVar3 = (org.telegram.ui.hk) this.b.d0;
                                    hkVar3.a(true);
                                    org.telegram.ui.wm wmVar3 = hkVar3.I;
                                    wmVar3.w5.d(null, wmVar3.k6);
                                    wmVar3.z8();
                                    break;
                                case 10:
                                    this.b.d0.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.hk hkVar4 = (org.telegram.ui.hk) this.b.d0;
                                    hkVar4.a(true);
                                    org.telegram.ui.wm wmVar4 = hkVar4.I;
                                    wmVar4.X5 = null;
                                    org.telegram.ui.mj mjVar = wmVar4.a0;
                                    if (mjVar != null) {
                                        mjVar.Y2 = null;
                                        mjVar.Z2 = false;
                                    }
                                    org.telegram.messenger.dj djVar6 = wmVar4.w5;
                                    if (djVar6 != null) {
                                        i172 = ((org.telegram.ui.ActionBar.d2) wmVar4).currentAccount;
                                        org.telegram.messenger.zi ziVar = wmVar4.E5;
                                        djVar6.e(i172, null, null, ziVar == wmVar4.m4 ? null : ziVar, wmVar4.C5, wmVar4.G5);
                                    }
                                    wmVar4.z8();
                                    break;
                                case 12:
                                    x90 x90Var6 = this.b;
                                    org.telegram.messenger.dj djVar7 = x90Var6.d0.d;
                                    if (djVar7.o) {
                                        boolean z15 = !djVar7.q;
                                        djVar7.q = z15;
                                        x90Var6.H.a(z15, true);
                                        x90Var6.I.a(djVar7.q, true);
                                        if (x90Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.zi) x90Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z16 = djVar7.q;
                                            messageMedia2.force_small_media = z16;
                                            messageMedia2.force_large_media = !z16;
                                        }
                                        if (x90Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.zi) x90Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z17 = djVar7.q;
                                            messageMedia.force_small_media = z17;
                                            messageMedia.force_large_media = !z17;
                                        }
                                        x90Var6.i();
                                        x90Var6.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    x90 x90Var7 = this.b;
                                    org.telegram.messenger.dj djVar8 = x90Var7.d0.d;
                                    boolean z18 = djVar8.r;
                                    djVar8.r = !z18;
                                    x90Var7.F.a(z18, true);
                                    if (x90Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.zi) x90Var7.r.e.get(0)).k) != null) {
                                        message4.invert_media = djVar8.r;
                                    }
                                    if (x90Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.zi) x90Var7.r.f.get(0)).k) != null) {
                                        message3.invert_media = djVar8.r;
                                    }
                                    x90Var7.i();
                                    x90Var7.V = true;
                                    break;
                            }
                        }
                    });
                    x90Var2 = x90Var3;
                    i10 = x90Var2.a;
                    if (i10 == 1) {
                    }
                    n4 = x90Var2.e.n(context2);
                    x90Var2.d = n4;
                    n4.setElevation(org.telegram.messenger.g0.L(8.0f));
                    n4.setOutlineProvider(viewOutlineProvider);
                    if (n4.getParent() instanceof ViewGroup) {
                    }
                    x90Var2.addView(n4, b8.mf.d(-1, -1.0f, 51, 0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / org.telegram.messenger.g0.p, 0.0f, 0.0f));
                    x90Var2.e.S(x90Var2.f);
                }
            }
        } else {
            if (!org.telegram.messenger.h10.i(da0Var.x).q()) {
                for (int i33 = 0; i33 < djVar.b.e.size(); i33++) {
                    if (((org.telegram.messenger.zi) djVar.b.e.get(i33)).D == 36) {
                        z10 = false;
                        break;
                    }
                }
            }
            z10 = true;
            ca0 ca0Var6 = new ca0(context, R.raw.name_hide, org.telegram.messenger.bd.M0(djVar.j ? 2131745342 : 2131745341, null), R.raw.name_show, org.telegram.messenger.bd.M0(djVar.j ? 2131749317 : 2131749316, null), da0Var.G);
            this.s.a(ca0Var6, b8.mf.o(-1, 48));
            if (djVar.g) {
                ca0Var = ca0Var6;
                ca0 ca0Var7 = new ca0(context, R.raw.caption_hide, org.telegram.messenger.bd.M0(2131745354, null), R.raw.caption_show, org.telegram.messenger.bd.M0(2131749329, null), da0Var.G);
                ca0Var7.a(djVar.l, false);
                this.s.a(ca0Var7, b8.mf.o(-1, 48));
                ca0Var2 = ca0Var7;
            } else {
                ca0Var = ca0Var6;
                ca0Var2 = null;
            }
            org.telegram.ui.ActionBar.y0 y0Var9 = new org.telegram.ui.ActionBar.y0(0, context, da0Var.G, true, false);
            final int i34 = 7;
            y0Var9.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.m90
                public final /* synthetic */ x90 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i172;
                    TLRPC.Message message;
                    TLRPC.MessageMedia messageMedia;
                    TLRPC.Message message2;
                    TLRPC.MessageMedia messageMedia2;
                    TLRPC.Message message3;
                    TLRPC.Message message4;
                    switch (i34) {
                        case 0:
                            x90 x90Var32 = this.b;
                            x90Var32.d0.d.d = null;
                            x90Var32.e.f(false);
                            x90Var32.h(false, false);
                            x90Var32.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            x90 x90Var4 = this.b;
                            r90 r90Var2 = x90Var4.e;
                            da0 da0Var2 = x90Var4.d0;
                            if (x90Var4.c(null) != null) {
                                if (r90Var2.v - r90Var2.u <= org.telegram.messenger.hp.s1(da0Var2.x).o4) {
                                    org.telegram.ui.Cells.p9 p9Var = r90Var2.W;
                                    org.telegram.messenger.zi c10 = x90Var4.c(p9Var != null ? ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() : null);
                                    org.telegram.messenger.dj djVar4 = da0Var2.d;
                                    int i182 = r90Var2.u;
                                    djVar4.e = i182;
                                    int i192 = r90Var2.v;
                                    djVar4.f = i192;
                                    djVar4.d = org.telegram.ui.mm.b(i182, i192, c10);
                                    da0Var2.b();
                                    da0Var2.a(true);
                                    break;
                                } else {
                                    x90Var4.g();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            x90 x90Var5 = this.b;
                            r90 r90Var3 = x90Var5.e;
                            da0 da0Var3 = x90Var5.d0;
                            org.telegram.messenger.dj djVar5 = da0Var3.d;
                            int i202 = da0Var3.x;
                            boolean z142 = da0Var3.b;
                            if (djVar5.d != null && !z142) {
                                djVar5.d = null;
                                r90Var3.f(false);
                                x90Var5.h(false, true);
                                x90Var5.l(true);
                                break;
                            } else if (r90Var3.v - r90Var3.u <= org.telegram.messenger.hp.s1(i202).o4) {
                                org.telegram.messenger.zi c11 = x90Var5.c(null);
                                if (c11 != null) {
                                    if (!r90Var3.x()) {
                                        djVar5.e = 0;
                                        int min = Math.min(org.telegram.messenger.hp.s1(i202).o4, org.telegram.ui.mm.d(c11));
                                        djVar5.f = min;
                                        djVar5.d = org.telegram.ui.mm.b(djVar5.e, min, c11);
                                        View d = x90Var5.d();
                                        if (d instanceof org.telegram.ui.Cells.q1) {
                                            r90Var3.a0((org.telegram.ui.Cells.q1) d, djVar5.e, djVar5.f);
                                        }
                                        if (!z142) {
                                            x90Var5.s.getSwipeBack().e(x90Var5.J);
                                        }
                                        x90Var5.h(true, true);
                                        break;
                                    } else {
                                        djVar5.e = r90Var3.u;
                                        djVar5.f = r90Var3.v;
                                        org.telegram.ui.Cells.p9 p9Var2 = r90Var3.W;
                                        djVar5.d = org.telegram.ui.mm.b(djVar5.e, djVar5.f, x90Var5.c(p9Var2 != null ? ((org.telegram.ui.Cells.q1) p9Var2).getMessageObject() : null));
                                        da0Var3.b();
                                        da0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                x90Var5.g();
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
                            da0 da0Var4 = this.b.d0;
                            if (!da0Var4.b) {
                                org.telegram.ui.hk hkVar = (org.telegram.ui.hk) da0Var4;
                                hkVar.a(true);
                                org.telegram.ui.wm wmVar = hkVar.I;
                                wmVar.E5 = null;
                                wmVar.C5 = null;
                                wmVar.w5.f(null, null, wmVar.k6, null);
                                wmVar.z8();
                                break;
                            } else {
                                org.telegram.ui.hk hkVar2 = (org.telegram.ui.hk) da0Var4;
                                hkVar2.a(true);
                                org.telegram.ui.wm wmVar2 = hkVar2.I;
                                wmVar2.C5 = null;
                                wmVar2.ec(wmVar2.E5);
                                break;
                            }
                        case 7:
                            this.b.d0.c(true);
                            break;
                        case 8:
                            this.b.d0.a(true);
                            break;
                        case 9:
                            org.telegram.ui.hk hkVar3 = (org.telegram.ui.hk) this.b.d0;
                            hkVar3.a(true);
                            org.telegram.ui.wm wmVar3 = hkVar3.I;
                            wmVar3.w5.d(null, wmVar3.k6);
                            wmVar3.z8();
                            break;
                        case 10:
                            this.b.d0.a(true);
                            break;
                        case 11:
                            org.telegram.ui.hk hkVar4 = (org.telegram.ui.hk) this.b.d0;
                            hkVar4.a(true);
                            org.telegram.ui.wm wmVar4 = hkVar4.I;
                            wmVar4.X5 = null;
                            org.telegram.ui.mj mjVar = wmVar4.a0;
                            if (mjVar != null) {
                                mjVar.Y2 = null;
                                mjVar.Z2 = false;
                            }
                            org.telegram.messenger.dj djVar6 = wmVar4.w5;
                            if (djVar6 != null) {
                                i172 = ((org.telegram.ui.ActionBar.d2) wmVar4).currentAccount;
                                org.telegram.messenger.zi ziVar = wmVar4.E5;
                                djVar6.e(i172, null, null, ziVar == wmVar4.m4 ? null : ziVar, wmVar4.C5, wmVar4.G5);
                            }
                            wmVar4.z8();
                            break;
                        case 12:
                            x90 x90Var6 = this.b;
                            org.telegram.messenger.dj djVar7 = x90Var6.d0.d;
                            if (djVar7.o) {
                                boolean z15 = !djVar7.q;
                                djVar7.q = z15;
                                x90Var6.H.a(z15, true);
                                x90Var6.I.a(djVar7.q, true);
                                if (x90Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.zi) x90Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z16 = djVar7.q;
                                    messageMedia2.force_small_media = z16;
                                    messageMedia2.force_large_media = !z16;
                                }
                                if (x90Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.zi) x90Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                    boolean z17 = djVar7.q;
                                    messageMedia.force_small_media = z17;
                                    messageMedia.force_large_media = !z17;
                                }
                                x90Var6.i();
                                x90Var6.V = true;
                                break;
                            }
                            break;
                        default:
                            x90 x90Var7 = this.b;
                            org.telegram.messenger.dj djVar8 = x90Var7.d0.d;
                            boolean z18 = djVar8.r;
                            djVar8.r = !z18;
                            x90Var7.F.a(z18, true);
                            if (x90Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.zi) x90Var7.r.e.get(0)).k) != null) {
                                message4.invert_media = djVar8.r;
                            }
                            if (x90Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.zi) x90Var7.r.f.get(0)).k) != null) {
                                message3.invert_media = djVar8.r;
                            }
                            x90Var7.i();
                            x90Var7.V = true;
                            break;
                    }
                }
            });
            y0Var9.j(org.telegram.messenger.bd.M0(2131752532, null), R.drawable.msg_forward_replace, null);
            this.s.a(y0Var9, b8.mf.o(-1, 48));
            org.telegram.ui.ActionBar.c1 c1Var4 = new org.telegram.ui.ActionBar.c1(context, z90Var);
            org.telegram.ui.ActionBar.r6.j(c1Var4, org.telegram.ui.ActionBar.r6.L(0.06f, org.telegram.ui.ActionBar.k6.E8), z90Var);
            c1Var4.setTag(R.id.fit_width_tag, 1);
            final int i35 = 8;
            this.s.a(c1Var4, b8.mf.o(-1, 8));
            org.telegram.ui.ActionBar.y0 y0Var10 = new org.telegram.ui.ActionBar.y0(1, context, da0Var.G, false, false);
            y0Var10.j(org.telegram.messenger.bd.M0(2131754218, null), R.drawable.msg_select, null);
            y0Var10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.m90
                public final /* synthetic */ x90 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i172;
                    TLRPC.Message message;
                    TLRPC.MessageMedia messageMedia;
                    TLRPC.Message message2;
                    TLRPC.MessageMedia messageMedia2;
                    TLRPC.Message message3;
                    TLRPC.Message message4;
                    switch (i35) {
                        case 0:
                            x90 x90Var32 = this.b;
                            x90Var32.d0.d.d = null;
                            x90Var32.e.f(false);
                            x90Var32.h(false, false);
                            x90Var32.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            x90 x90Var4 = this.b;
                            r90 r90Var2 = x90Var4.e;
                            da0 da0Var2 = x90Var4.d0;
                            if (x90Var4.c(null) != null) {
                                if (r90Var2.v - r90Var2.u <= org.telegram.messenger.hp.s1(da0Var2.x).o4) {
                                    org.telegram.ui.Cells.p9 p9Var = r90Var2.W;
                                    org.telegram.messenger.zi c10 = x90Var4.c(p9Var != null ? ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() : null);
                                    org.telegram.messenger.dj djVar4 = da0Var2.d;
                                    int i182 = r90Var2.u;
                                    djVar4.e = i182;
                                    int i192 = r90Var2.v;
                                    djVar4.f = i192;
                                    djVar4.d = org.telegram.ui.mm.b(i182, i192, c10);
                                    da0Var2.b();
                                    da0Var2.a(true);
                                    break;
                                } else {
                                    x90Var4.g();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            x90 x90Var5 = this.b;
                            r90 r90Var3 = x90Var5.e;
                            da0 da0Var3 = x90Var5.d0;
                            org.telegram.messenger.dj djVar5 = da0Var3.d;
                            int i202 = da0Var3.x;
                            boolean z142 = da0Var3.b;
                            if (djVar5.d != null && !z142) {
                                djVar5.d = null;
                                r90Var3.f(false);
                                x90Var5.h(false, true);
                                x90Var5.l(true);
                                break;
                            } else if (r90Var3.v - r90Var3.u <= org.telegram.messenger.hp.s1(i202).o4) {
                                org.telegram.messenger.zi c11 = x90Var5.c(null);
                                if (c11 != null) {
                                    if (!r90Var3.x()) {
                                        djVar5.e = 0;
                                        int min = Math.min(org.telegram.messenger.hp.s1(i202).o4, org.telegram.ui.mm.d(c11));
                                        djVar5.f = min;
                                        djVar5.d = org.telegram.ui.mm.b(djVar5.e, min, c11);
                                        View d = x90Var5.d();
                                        if (d instanceof org.telegram.ui.Cells.q1) {
                                            r90Var3.a0((org.telegram.ui.Cells.q1) d, djVar5.e, djVar5.f);
                                        }
                                        if (!z142) {
                                            x90Var5.s.getSwipeBack().e(x90Var5.J);
                                        }
                                        x90Var5.h(true, true);
                                        break;
                                    } else {
                                        djVar5.e = r90Var3.u;
                                        djVar5.f = r90Var3.v;
                                        org.telegram.ui.Cells.p9 p9Var2 = r90Var3.W;
                                        djVar5.d = org.telegram.ui.mm.b(djVar5.e, djVar5.f, x90Var5.c(p9Var2 != null ? ((org.telegram.ui.Cells.q1) p9Var2).getMessageObject() : null));
                                        da0Var3.b();
                                        da0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                x90Var5.g();
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
                            da0 da0Var4 = this.b.d0;
                            if (!da0Var4.b) {
                                org.telegram.ui.hk hkVar = (org.telegram.ui.hk) da0Var4;
                                hkVar.a(true);
                                org.telegram.ui.wm wmVar = hkVar.I;
                                wmVar.E5 = null;
                                wmVar.C5 = null;
                                wmVar.w5.f(null, null, wmVar.k6, null);
                                wmVar.z8();
                                break;
                            } else {
                                org.telegram.ui.hk hkVar2 = (org.telegram.ui.hk) da0Var4;
                                hkVar2.a(true);
                                org.telegram.ui.wm wmVar2 = hkVar2.I;
                                wmVar2.C5 = null;
                                wmVar2.ec(wmVar2.E5);
                                break;
                            }
                        case 7:
                            this.b.d0.c(true);
                            break;
                        case 8:
                            this.b.d0.a(true);
                            break;
                        case 9:
                            org.telegram.ui.hk hkVar3 = (org.telegram.ui.hk) this.b.d0;
                            hkVar3.a(true);
                            org.telegram.ui.wm wmVar3 = hkVar3.I;
                            wmVar3.w5.d(null, wmVar3.k6);
                            wmVar3.z8();
                            break;
                        case 10:
                            this.b.d0.a(true);
                            break;
                        case 11:
                            org.telegram.ui.hk hkVar4 = (org.telegram.ui.hk) this.b.d0;
                            hkVar4.a(true);
                            org.telegram.ui.wm wmVar4 = hkVar4.I;
                            wmVar4.X5 = null;
                            org.telegram.ui.mj mjVar = wmVar4.a0;
                            if (mjVar != null) {
                                mjVar.Y2 = null;
                                mjVar.Z2 = false;
                            }
                            org.telegram.messenger.dj djVar6 = wmVar4.w5;
                            if (djVar6 != null) {
                                i172 = ((org.telegram.ui.ActionBar.d2) wmVar4).currentAccount;
                                org.telegram.messenger.zi ziVar = wmVar4.E5;
                                djVar6.e(i172, null, null, ziVar == wmVar4.m4 ? null : ziVar, wmVar4.C5, wmVar4.G5);
                            }
                            wmVar4.z8();
                            break;
                        case 12:
                            x90 x90Var6 = this.b;
                            org.telegram.messenger.dj djVar7 = x90Var6.d0.d;
                            if (djVar7.o) {
                                boolean z15 = !djVar7.q;
                                djVar7.q = z15;
                                x90Var6.H.a(z15, true);
                                x90Var6.I.a(djVar7.q, true);
                                if (x90Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.zi) x90Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z16 = djVar7.q;
                                    messageMedia2.force_small_media = z16;
                                    messageMedia2.force_large_media = !z16;
                                }
                                if (x90Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.zi) x90Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                    boolean z17 = djVar7.q;
                                    messageMedia.force_small_media = z17;
                                    messageMedia.force_large_media = !z17;
                                }
                                x90Var6.i();
                                x90Var6.V = true;
                                break;
                            }
                            break;
                        default:
                            x90 x90Var7 = this.b;
                            org.telegram.messenger.dj djVar8 = x90Var7.d0.d;
                            boolean z18 = djVar8.r;
                            djVar8.r = !z18;
                            x90Var7.F.a(z18, true);
                            if (x90Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.zi) x90Var7.r.e.get(0)).k) != null) {
                                message4.invert_media = djVar8.r;
                            }
                            if (x90Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.zi) x90Var7.r.f.get(0)).k) != null) {
                                message3.invert_media = djVar8.r;
                            }
                            x90Var7.i();
                            x90Var7.V = true;
                            break;
                    }
                }
            });
            this.s.a(y0Var10, b8.mf.o(-1, 48));
            org.telegram.ui.ActionBar.y0 y0Var11 = new org.telegram.ui.ActionBar.y0(1, context, da0Var.G, false, true);
            y0Var11.j(org.telegram.messenger.bd.M0(2131751363, null), R.drawable.msg_delete, null);
            int i36 = org.telegram.ui.ActionBar.k6.q7;
            int i37 = org.telegram.ui.ActionBar.k6.p7;
            y0Var11.c(i36, i37);
            final int i38 = 9;
            y0Var11.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.m90
                public final /* synthetic */ x90 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i172;
                    TLRPC.Message message;
                    TLRPC.MessageMedia messageMedia;
                    TLRPC.Message message2;
                    TLRPC.MessageMedia messageMedia2;
                    TLRPC.Message message3;
                    TLRPC.Message message4;
                    switch (i38) {
                        case 0:
                            x90 x90Var32 = this.b;
                            x90Var32.d0.d.d = null;
                            x90Var32.e.f(false);
                            x90Var32.h(false, false);
                            x90Var32.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            x90 x90Var4 = this.b;
                            r90 r90Var2 = x90Var4.e;
                            da0 da0Var2 = x90Var4.d0;
                            if (x90Var4.c(null) != null) {
                                if (r90Var2.v - r90Var2.u <= org.telegram.messenger.hp.s1(da0Var2.x).o4) {
                                    org.telegram.ui.Cells.p9 p9Var = r90Var2.W;
                                    org.telegram.messenger.zi c10 = x90Var4.c(p9Var != null ? ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() : null);
                                    org.telegram.messenger.dj djVar4 = da0Var2.d;
                                    int i182 = r90Var2.u;
                                    djVar4.e = i182;
                                    int i192 = r90Var2.v;
                                    djVar4.f = i192;
                                    djVar4.d = org.telegram.ui.mm.b(i182, i192, c10);
                                    da0Var2.b();
                                    da0Var2.a(true);
                                    break;
                                } else {
                                    x90Var4.g();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            x90 x90Var5 = this.b;
                            r90 r90Var3 = x90Var5.e;
                            da0 da0Var3 = x90Var5.d0;
                            org.telegram.messenger.dj djVar5 = da0Var3.d;
                            int i202 = da0Var3.x;
                            boolean z142 = da0Var3.b;
                            if (djVar5.d != null && !z142) {
                                djVar5.d = null;
                                r90Var3.f(false);
                                x90Var5.h(false, true);
                                x90Var5.l(true);
                                break;
                            } else if (r90Var3.v - r90Var3.u <= org.telegram.messenger.hp.s1(i202).o4) {
                                org.telegram.messenger.zi c11 = x90Var5.c(null);
                                if (c11 != null) {
                                    if (!r90Var3.x()) {
                                        djVar5.e = 0;
                                        int min = Math.min(org.telegram.messenger.hp.s1(i202).o4, org.telegram.ui.mm.d(c11));
                                        djVar5.f = min;
                                        djVar5.d = org.telegram.ui.mm.b(djVar5.e, min, c11);
                                        View d = x90Var5.d();
                                        if (d instanceof org.telegram.ui.Cells.q1) {
                                            r90Var3.a0((org.telegram.ui.Cells.q1) d, djVar5.e, djVar5.f);
                                        }
                                        if (!z142) {
                                            x90Var5.s.getSwipeBack().e(x90Var5.J);
                                        }
                                        x90Var5.h(true, true);
                                        break;
                                    } else {
                                        djVar5.e = r90Var3.u;
                                        djVar5.f = r90Var3.v;
                                        org.telegram.ui.Cells.p9 p9Var2 = r90Var3.W;
                                        djVar5.d = org.telegram.ui.mm.b(djVar5.e, djVar5.f, x90Var5.c(p9Var2 != null ? ((org.telegram.ui.Cells.q1) p9Var2).getMessageObject() : null));
                                        da0Var3.b();
                                        da0Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                x90Var5.g();
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
                            da0 da0Var4 = this.b.d0;
                            if (!da0Var4.b) {
                                org.telegram.ui.hk hkVar = (org.telegram.ui.hk) da0Var4;
                                hkVar.a(true);
                                org.telegram.ui.wm wmVar = hkVar.I;
                                wmVar.E5 = null;
                                wmVar.C5 = null;
                                wmVar.w5.f(null, null, wmVar.k6, null);
                                wmVar.z8();
                                break;
                            } else {
                                org.telegram.ui.hk hkVar2 = (org.telegram.ui.hk) da0Var4;
                                hkVar2.a(true);
                                org.telegram.ui.wm wmVar2 = hkVar2.I;
                                wmVar2.C5 = null;
                                wmVar2.ec(wmVar2.E5);
                                break;
                            }
                        case 7:
                            this.b.d0.c(true);
                            break;
                        case 8:
                            this.b.d0.a(true);
                            break;
                        case 9:
                            org.telegram.ui.hk hkVar3 = (org.telegram.ui.hk) this.b.d0;
                            hkVar3.a(true);
                            org.telegram.ui.wm wmVar3 = hkVar3.I;
                            wmVar3.w5.d(null, wmVar3.k6);
                            wmVar3.z8();
                            break;
                        case 10:
                            this.b.d0.a(true);
                            break;
                        case 11:
                            org.telegram.ui.hk hkVar4 = (org.telegram.ui.hk) this.b.d0;
                            hkVar4.a(true);
                            org.telegram.ui.wm wmVar4 = hkVar4.I;
                            wmVar4.X5 = null;
                            org.telegram.ui.mj mjVar = wmVar4.a0;
                            if (mjVar != null) {
                                mjVar.Y2 = null;
                                mjVar.Z2 = false;
                            }
                            org.telegram.messenger.dj djVar6 = wmVar4.w5;
                            if (djVar6 != null) {
                                i172 = ((org.telegram.ui.ActionBar.d2) wmVar4).currentAccount;
                                org.telegram.messenger.zi ziVar = wmVar4.E5;
                                djVar6.e(i172, null, null, ziVar == wmVar4.m4 ? null : ziVar, wmVar4.C5, wmVar4.G5);
                            }
                            wmVar4.z8();
                            break;
                        case 12:
                            x90 x90Var6 = this.b;
                            org.telegram.messenger.dj djVar7 = x90Var6.d0.d;
                            if (djVar7.o) {
                                boolean z15 = !djVar7.q;
                                djVar7.q = z15;
                                x90Var6.H.a(z15, true);
                                x90Var6.I.a(djVar7.q, true);
                                if (x90Var6.r.e.size() > 0 && (message2 = ((org.telegram.messenger.zi) x90Var6.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z16 = djVar7.q;
                                    messageMedia2.force_small_media = z16;
                                    messageMedia2.force_large_media = !z16;
                                }
                                if (x90Var6.r.f.size() > 0 && (message = ((org.telegram.messenger.zi) x90Var6.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                    boolean z17 = djVar7.q;
                                    messageMedia.force_small_media = z17;
                                    messageMedia.force_large_media = !z17;
                                }
                                x90Var6.i();
                                x90Var6.V = true;
                                break;
                            }
                            break;
                        default:
                            x90 x90Var7 = this.b;
                            org.telegram.messenger.dj djVar8 = x90Var7.d0.d;
                            boolean z18 = djVar8.r;
                            djVar8.r = !z18;
                            x90Var7.F.a(z18, true);
                            if (x90Var7.r.e.size() > 0 && (message4 = ((org.telegram.messenger.zi) x90Var7.r.e.get(0)).k) != null) {
                                message4.invert_media = djVar8.r;
                            }
                            if (x90Var7.r.f.size() > 0 && (message3 = ((org.telegram.messenger.zi) x90Var7.r.f.get(0)).k) != null) {
                                message3.invert_media = djVar8.r;
                            }
                            x90Var7.i();
                            x90Var7.V = true;
                            break;
                    }
                }
            });
            y0Var11.h(0.12f, i37);
            this.s.a(y0Var11, b8.mf.o(-1, 48));
            ca0 ca0Var8 = ca0Var;
            ca0Var8.a(djVar.k, false);
            ca0 ca0Var9 = ca0Var2;
            x90 x90Var4 = this;
            ca0Var8.setOnClickListener(new ai.x3(this, z10, context, ca0Var9, ca0Var8, 1));
            x90Var = x90Var4;
            if (ca0Var9 != null) {
                ca0Var9.setOnClickListener(new ct(x90Var4, ca0Var9, ca0Var8, 3));
                x90Var = x90Var4;
            }
        }
        context2 = context;
        x90Var2 = x90Var;
        i10 = x90Var2.a;
        if (i10 == 1) {
        }
        n4 = x90Var2.e.n(context2);
        x90Var2.d = n4;
        n4.setElevation(org.telegram.messenger.g0.L(8.0f));
        n4.setOutlineProvider(viewOutlineProvider);
        if (n4.getParent() instanceof ViewGroup) {
        }
        x90Var2.addView(n4, b8.mf.d(-1, -1.0f, 51, 0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / org.telegram.messenger.g0.p, 0.0f, 0.0f));
        x90Var2.e.S(x90Var2.f);
    }

    public static org.telegram.messenger.ui a(x90 x90Var, org.telegram.messenger.zi ziVar) {
        if (ziVar.d1() == 0) {
            return null;
        }
        org.telegram.messenger.ui uiVar = (org.telegram.messenger.ui) x90Var.r.d.get(ziVar.d1());
        if (uiVar == null || (uiVar.d.size() > 1 && uiVar.d(ziVar) != null)) {
            return uiVar;
        }
        return null;
    }

    public static void b(x90 x90Var, org.telegram.ui.Cells.q1 q1Var) {
        URLSpan uRLSpan;
        TLRPC.WebPage webPage;
        if (x90Var.a == 2) {
            org.telegram.messenger.dj djVar = x90Var.d0.d;
            if (!djVar.n && (uRLSpan = djVar.w) != null && (webPage = djVar.v) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                q1Var.o3(uRLSpan);
                return;
            }
        }
        q1Var.o3(null);
    }

    public final org.telegram.messenger.zi c(org.telegram.messenger.zi ziVar) {
        org.telegram.messenger.ui uiVar;
        org.telegram.messenger.dj djVar = this.d0.d;
        org.telegram.messenger.bj bjVar = djVar.a;
        if (bjVar == null) {
            return null;
        }
        LongSparseArray longSparseArray = bjVar.d;
        if (longSparseArray == null || longSparseArray.size() <= 0 || (uiVar = (org.telegram.messenger.ui) djVar.a.d.valueAt(0)) == null) {
            return (org.telegram.messenger.zi) djVar.a.e.get(0);
        }
        if (uiVar.i) {
            if (ziVar != null) {
                return ziVar;
            }
            org.telegram.ui.mm mmVar = djVar.d;
            if (mmVar != null) {
                return mmVar.a;
            }
        }
        return uiVar.h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        return r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View d() {
        org.telegram.messenger.zi c2 = c(null);
        if (c2 != null) {
            int i3 = 0;
            while (true) {
                ci.j1 j1Var = this.f;
                if (i3 >= j1Var.getChildCount()) {
                    break;
                }
                View childAt = j1Var.getChildAt(i3);
                org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) childAt;
                if (p4Var.getMessageObject() != null && (p4Var.getMessageObject() == c2 || p4Var.getMessageObject().f1() == c2.f1())) {
                    break;
                }
                i3++;
            }
        }
        return null;
    }

    public final boolean e(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.zi c2;
        if (q1Var == null || q1Var.getMessageObject() == null || (c2 = c(null)) == null) {
            return false;
        }
        return q1Var.getMessageObject() == c2 || q1Var.getMessageObject().f1() == c2.f1();
    }

    public final void f(float f10, int i3) {
        boolean z10 = this.d0.w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        l90 l90Var = this.c;
        ai.h5 h5Var = this.b;
        if (z10) {
            l90Var.setTranslationY(0.0f);
            h5Var.invalidateOutline();
            h5Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            l90Var.setTranslationY(i3);
            h5Var.invalidateOutline();
            h5Var.setTranslationY(f10);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((f10 + h5Var.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f));
        }
        float x10 = h5Var.getX();
        org.telegram.ui.Cells.t9 t9Var = this.d;
        t9Var.setTranslationX(x10);
        t9Var.setTranslationY(h5Var.getY());
    }

    public final void g() {
        da0 da0Var = this.d0;
        new fc(da0Var, da0Var.G).I(R.raw.error, org.telegram.messenger.bd.M0(2131746445, null), org.telegram.messenger.bd.M0(2131746444, null)).j();
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
        q90 q90Var = this.x;
        q90 q90Var2 = this.w;
        if (!z11) {
            if (q90Var2 != null) {
                q90Var2.setAlpha(!z10 ? 1.0f : 0.0f);
                q90Var2.setVisibility(!z10 ? 0 : 4);
            }
            if (q90Var != null) {
                q90Var.setAlpha(z10 ? 1.0f : 0.0f);
                q90Var.setVisibility(z10 ? 0 : 4);
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
        if (q90Var2 != null) {
            q90Var2.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(q90Var2, (Property<q90, Float>) property, !z10 ? 1.0f : 0.0f));
        }
        if (q90Var != null) {
            q90Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(q90Var, (Property<q90, Float>) property, z10 ? 1.0f : 0.0f));
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
        this.Q.setInterpolator(xq.h);
        this.Q.addListener(new s9(15, this, z10));
        this.Q.start();
    }

    public final void i() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        da0 da0Var = this.d0;
        org.telegram.messenger.dj djVar = da0Var.d;
        t90 t90Var = this.h;
        if (t90Var.k()) {
            this.W = true;
            return;
        }
        for (int i3 = 0; i3 < this.r.f.size(); i3++) {
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) this.r.f.get(i3);
            ziVar.K1 = true;
            ziVar.f2 = da0Var.a;
            if (djVar.k) {
                ziVar.k.flags &= -5;
                ziVar.e2 = true;
            } else {
                ziVar.k.flags |= 4;
                ziVar.e2 = false;
            }
            if (this.a == 2) {
                TLRPC.WebPage webPage = djVar.v;
                if (webPage != null && ((messageMedia = (message = ziVar.k).media) == null || messageMedia.webpage != webPage)) {
                    message.flags |= 512;
                    message.media = new TLRPC.TL_messageMediaWebPage();
                    TLRPC.MessageMedia messageMedia2 = ziVar.k.media;
                    messageMedia2.webpage = djVar.v;
                    boolean z10 = djVar.q;
                    messageMedia2.force_large_media = !z10;
                    messageMedia2.force_small_media = z10;
                    messageMedia2.manual = true;
                    ziVar.y = null;
                    ziVar.o0();
                    ziVar.n0 = null;
                    ziVar.o0 = null;
                    ziVar.l0 = null;
                    ziVar.m0 = null;
                    ziVar.r0(true);
                    ziVar.K(true);
                } else if (webPage == null) {
                    TLRPC.Message message2 = ziVar.k;
                    message2.flags &= -513;
                    message2.media = null;
                }
            }
            if (djVar.l) {
                ziVar.z = null;
            } else {
                ziVar.k0();
            }
            if (ziVar.U3()) {
                org.telegram.messenger.cj cjVar = (org.telegram.messenger.cj) ziVar.k.media;
                cjVar.results.total_voters = djVar.l ? 0 : cjVar.a;
            }
        }
        for (int i10 = 0; i10 < this.r.h.size(); i10++) {
            ((TLRPC.PollAnswerVoters) this.r.h.get(i10)).chosen = !djVar.k;
        }
        for (int i11 = 0; i11 < this.r.d.size(); i11++) {
            t90Var.V((org.telegram.messenger.ui) this.r.d.valueAt(i11));
        }
        this.n.k(0, this.r.f.size());
    }

    public final void j() {
        int i3 = this.S;
        float f10 = this.T;
        da0 da0Var = this.d0;
        boolean z10 = da0Var.w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        ci.j1 j1Var = this.f;
        if (z10) {
            this.T = 0.0f;
            this.S = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(org.telegram.messenger.g0.L(8.0f) + j1Var.getMeasuredWidth());
        } else {
            int measuredHeight = j1Var.getMeasuredHeight();
            int i10 = 0;
            for (int i11 = 0; i11 < j1Var.getChildCount(); i11++) {
                View childAt = j1Var.getChildAt(i11);
                if (RecyclerView.R(childAt) != -1) {
                    measuredHeight = Math.min(measuredHeight, childAt.getTop());
                    i10++;
                }
            }
            org.telegram.messenger.bj bjVar = this.r;
            if (bjVar == null || i10 == 0 || i10 > bjVar.f.size()) {
                this.S = 0;
            } else {
                int d = k2.p1.d(4.0f, measuredHeight, 0);
                this.S = d;
                this.S = Math.min(((j1Var.getMeasuredHeight() - this.S) + d) - ((int) ((((org.telegram.messenger.g0.q.y - (Build.VERSION.SDK_INT >= 35 ? org.telegram.messenger.g0.n : 0)) * 0.8f) - this.a0) - org.telegram.messenger.g0.L(8.0f))), this.S);
            }
            float z11 = com.google.android.recaptcha.internal.a.z(getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f), (this.b.getMeasuredHeight() - this.S) + (this.a0 - org.telegram.messenger.g0.L(8.0f)), 2.0f, org.telegram.messenger.g0.L(8.0f)) - this.S;
            this.T = z11;
            if (z11 > org.telegram.messenger.g0.L(8.0f)) {
                this.T = org.telegram.messenger.g0.L(8.0f);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        }
        boolean z12 = this.L;
        if (z12 || (this.S == i3 && this.T == f10)) {
            if (z12) {
                float f11 = this.T;
                int i12 = this.S;
                this.U = i12;
                f(f11, i12);
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = da0Var.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        da0Var.h = ofFloat;
        ofFloat.addUpdateListener(new gj(this, i3, f10, 1));
        da0Var.h.setDuration(250L);
        da0Var.h.setInterpolator(ni.l.V);
        da0Var.h.addListener(new a60(this, 4));
        org.telegram.messenger.g0.i3(da0Var.E, 50L);
        this.U = i3;
        f(f10, i3);
    }

    public final void k() {
        org.telegram.messenger.zi ziVar;
        da0 da0Var = this.d0;
        org.telegram.messenger.dj djVar = da0Var.d;
        if (this.a == 0) {
            r90 r90Var = this.e;
            if (r90Var.v - r90Var.u > org.telegram.messenger.hp.s1(da0Var.x).o4) {
                return;
            }
            org.telegram.ui.Cells.p9 p9Var = r90Var.W;
            org.telegram.messenger.zi c2 = c(p9Var != null ? ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() : null);
            if (djVar.d != null && r90Var.x()) {
                djVar.e = r90Var.u;
                djVar.f = r90Var.v;
                if (c2 != null) {
                    org.telegram.ui.mm mmVar = djVar.d;
                    if (mmVar.m || (ziVar = mmVar.a) == null || ziVar.f1() != c2.f1()) {
                        djVar.d = org.telegram.ui.mm.b(djVar.e, djVar.f, c2);
                        da0Var.b();
                    }
                }
            }
            r90Var.f(false);
        }
    }

    public final void l(boolean z10) {
        da0 da0Var = this.d0;
        TLRPC.User user = da0Var.n;
        org.telegram.messenger.dj djVar = da0Var.d;
        TLRPC.Chat chat = da0Var.r;
        l90 l90Var = this.c;
        int i3 = this.a;
        if (i3 == 1) {
            org.telegram.messenger.bj bjVar = djVar.b;
            l90Var.b(org.telegram.messenger.bd.G(bjVar == null ? 0 : bjVar.g.size(), "PreviewForwardMessagesCount", new Object[0]), z10);
            l90Var.a(!djVar.h ? djVar.m ? user != null ? org.telegram.messenger.bd.a0("ForwardPreviewSendersNameVisible", null, 2131750580, org.telegram.messenger.g5.m(0, user.first_name, user.last_name)) : (!org.telegram.messenger.t3.T(chat) || chat.megagroup) ? org.telegram.messenger.bd.M0(2131750578, null) : org.telegram.messenger.bd.M0(2131750579, null) : user != null ? org.telegram.messenger.bd.a0("ForwardPreviewSendersNameVisible", null, 2131750580, org.telegram.messenger.g5.m(0, user.first_name, user.last_name)) : (!org.telegram.messenger.t3.T(chat) || chat.megagroup) ? org.telegram.messenger.bd.M0(2131750581, null) : org.telegram.messenger.bd.M0(2131750582, null) : !djVar.k ? user != null ? org.telegram.messenger.bd.a0("ForwardPreviewSendersNameVisible", null, 2131750580, org.telegram.messenger.g5.m(0, user.first_name, user.last_name)) : (!org.telegram.messenger.t3.T(chat) || chat.megagroup) ? org.telegram.messenger.bd.M0(2131750578, null) : org.telegram.messenger.bd.M0(2131750579, null) : user != null ? org.telegram.messenger.bd.a0("ForwardPreviewSendersNameHidden", null, 2131750583, org.telegram.messenger.g5.m(0, user.first_name, user.last_name)) : (!org.telegram.messenger.t3.T(chat) || chat.megagroup) ? org.telegram.messenger.bd.M0(2131750581, null) : org.telegram.messenger.bd.M0(2131750582, null), z10);
        } else {
            if (i3 != 0) {
                if (i3 == 2) {
                    l90Var.b(org.telegram.messenger.bd.M0(2131748556, null), z10);
                    l90Var.a(org.telegram.messenger.bd.M0(2131748557, null), z10);
                    return;
                }
                return;
            }
            if (djVar.d == null || !djVar.a.j) {
                l90Var.b(org.telegram.messenger.bd.M0(2131748553, null), z10);
                l90Var.a(djVar.a.j ? org.telegram.messenger.bd.M0(2131748554, null) : "", z10);
            } else {
                l90Var.b(org.telegram.messenger.bd.M0(2131746888, null), z10);
                l90Var.a(org.telegram.messenger.bd.M0(2131746887, null), z10);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a == 0) {
            org.telegram.messenger.g0.d0(this.f, new p2(this, 7));
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
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        j();
        this.L = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        boolean z10 = View.MeasureSpec.getSize(i3) > View.MeasureSpec.getSize(i10);
        da0 da0Var = this.d0;
        da0Var.w = z10;
        this.a0 = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i3, makeMeasureSpec);
        int i11 = this.a0;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.R;
        this.a0 = Math.max(i11, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        boolean z11 = da0Var.w;
        ai.h5 h5Var = this.b;
        if (z11) {
            h5Var.getLayoutParams().height = -1;
            ((ViewGroup.MarginLayoutParams) h5Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(8.0f);
            ((ViewGroup.MarginLayoutParams) h5Var.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(8.0f);
            h5Var.getLayoutParams().width = (int) Math.min(View.MeasureSpec.getSize(i3), Math.max(org.telegram.messenger.g0.L(340.0f), View.MeasureSpec.getSize(i3) * 0.6f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) h5Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) h5Var.getLayoutParams()).bottomMargin = 0;
            h5Var.getLayoutParams().height = (View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.L(6.0f)) - this.a0;
            if (h5Var.getLayoutParams().height < View.MeasureSpec.getSize(i10) * 0.5f) {
                h5Var.getLayoutParams().height = (int) (View.MeasureSpec.getSize(i10) * 0.5f);
            }
            h5Var.getLayoutParams().width = -1;
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = View.MeasureSpec.getSize(i10) - h5Var.getLayoutParams().height;
        }
        int size = (View.MeasureSpec.getSize(i10) + View.MeasureSpec.getSize(i3)) << 16;
        if (this.b0 != size) {
            for (int i12 = 0; i12 < this.r.f.size(); i12++) {
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) this.r.f.get(i12);
                ziVar.b2 = da0Var.w ? h5Var.getLayoutParams().width : View.MeasureSpec.getSize(i3) - org.telegram.messenger.g0.L(16.0f);
                ziVar.Q1 = false;
                ziVar.K1 = true;
                org.telegram.ui.y7 y7Var = this.n;
                if (y7Var != null) {
                    y7Var.f();
                }
            }
            this.L = true;
        }
        this.b0 = size;
        super.onMeasure(i3, i10);
    }
}
