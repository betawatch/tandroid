package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ln0 extends FrameLayout {
    public static final /* synthetic */ int q0 = 0;
    public kn0 D;
    public final qn0 E;
    public View F;
    public boolean G;
    public boolean H;
    public TL_stars.TL_starGiftUnique I;
    public ph.h3 J;
    public TL_stars.StarGift K;
    public final ArrayList L;
    public final HashMap M;
    public final SpannableStringBuilder N;
    public final String O;
    public final String P;
    public int Q;
    public int R;
    public int S;
    public final int T;
    public int U;
    public int V;
    public int W;
    public final pn0 a;
    public int a0;
    public final cn0 b;
    public int b0;
    public final s4.r c;
    public int c0;
    public final en0 d;
    public int d0;
    public final m5.e e;
    public int e0;
    public on0 f;
    public int f0;
    public int g0;
    public int h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public final ArrayList l0;
    public final int m0;
    public long n;
    public int n0;
    public in0 o0;
    public final /* synthetic */ rn0 p0;
    public TLRPC.TL_emojiStatusCollectible r;
    public TLRPC.TL_peerColorCollectible s;
    public final gn0 w;
    public final View x;
    public final View y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ln0(rn0 rn0Var, Context context, int i10) {
        super(context);
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.p6 p6Var;
        org.telegram.ui.ActionBar.p6 p6Var2;
        org.telegram.ui.ActionBar.p6 p6Var3;
        int i11;
        org.telegram.ui.ActionBar.p6 p6Var4;
        this.p0 = rn0Var;
        Object[] objArr = 0;
        this.e = new m5.e(15, false);
        this.h = -1;
        this.n = 0L;
        this.r = null;
        this.s = null;
        this.K = null;
        this.L = new ArrayList();
        this.M = new HashMap();
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.a0 = -1;
        this.b0 = -1;
        this.c0 = -1;
        this.d0 = -1;
        this.e0 = -1;
        this.f0 = 0;
        this.g0 = -1;
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.l0 = new ArrayList();
        this.m0 = i10;
        d();
        Context context2 = getContext();
        org.telegram.ui.ActionBar.p6 resourceProvider = rn0Var.getResourceProvider();
        tg.b bVar = rn0Var.G;
        cn0 cn0Var = new cn0(this, context2, resourceProvider, i10);
        this.b = cn0Var;
        cn0Var.setClipToPadding(false);
        cn0Var.setSections(true);
        ((s4.j) cn0Var.getItemAnimator()).m = false;
        getContext();
        s4.r rVar = new s4.r(3);
        this.c = rVar;
        int i12 = 8;
        rVar.O = new jg.h1(this, i12);
        cn0Var.i(new mg.u1(this, i12));
        cn0Var.setLayoutManager(rVar);
        en0 en0Var = new en0(this, context, i10);
        this.d = en0Var;
        cn0Var.setAdapter(en0Var);
        cn0Var.setOnItemClickListener(new org.telegram.ui.Components.cm0(this, i10, 1));
        cn0Var.j(new fn0(this, i10));
        addView(cn0Var, w7.b6.c(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.dq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        String L0 = org.telegram.messenger.dd.L0(rn0Var.a ? 2131752435 : 2131743781, null);
        this.O = L0;
        this.N = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append((CharSequence) L0);
        this.P = org.telegram.messenger.dd.L0(2131743780, null);
        f(false);
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.C = false;
        jVar.m = false;
        cn0Var.setItemAnimator(jVar);
        View view = new View(getContext());
        this.x = view;
        tg.c cVar = new tg.c(bVar.c(view, null, false));
        cVar.b(-org.telegram.messenger.i0.L(24.0f), true);
        cVar.G = org.telegram.messenger.at.x3;
        view.setBackground(cVar);
        addView(view, w7.b6.e(-1, 72, 55));
        if (i10 == 0) {
            Context context3 = getContext();
            i11 = ((org.telegram.ui.ActionBar.k2) rn0Var).currentAccount;
            p6Var4 = ((org.telegram.ui.ActionBar.k2) rn0Var).resourceProvider;
            this.a = new pn0(i11, 0L, context3, p6Var4);
            j(false);
        } else {
            View view2 = new View(getContext());
            this.y = view2;
            tg.c cVar2 = new tg.c(bVar.c(view2, null, false));
            cVar2.b(-org.telegram.messenger.i0.L(16.0f), false);
            view2.setBackground(cVar2);
            addView(view2, w7.b6.e(-1, 16, 55));
            Context context4 = getContext();
            z4Var = ((org.telegram.ui.ActionBar.k2) rn0Var).parentLayout;
            p6Var = ((org.telegram.ui.ActionBar.k2) rn0Var).resourceProvider;
            gn0 gn0Var = new gn0(context4, z4Var, 3, 0L, p6Var);
            this.w = gn0Var;
            gn0Var.setImportantForAccessibility(4);
            gn0Var.x = rn0Var;
            gn0Var.setClipToOutline(true);
            float L = org.telegram.messenger.i0.L(16.0f);
            bi.d2 d2Var = rf.e0.a;
            gn0Var.setOutlineProvider(new rf.c0(0, L));
            addView(gn0Var, w7.b6.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        Context context5 = getContext();
        p6Var2 = ((org.telegram.ui.ActionBar.k2) rn0Var).resourceProvider;
        qn0 qn0Var = new qn0(context5, p6Var2);
        this.E = qn0Var;
        vg.f c10 = rn0Var.E.c(qn0Var, null, false);
        p6Var3 = ((org.telegram.ui.ActionBar.k2) rn0Var).resourceProvider;
        wg.d dVar = new wg.d(p6Var3);
        dVar.e = new xg.a(7);
        dVar.f(0, 0);
        dVar.e(0, 0);
        dVar.d(0, 0);
        c10.o(dVar);
        c10.q(org.telegram.messenger.i0.L(18.0f));
        c10.P.e = true;
        qn0Var.H = c10;
        qn0Var.G = c10;
        qn0Var.F = new bn0(this, objArr == true ? 1 : 0);
        qn0Var.setVisibility(4);
        addView(qn0Var, w7.b6.d(-1, 36.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        View view3 = this.a;
        if (view3 != null) {
            addView(view3, w7.b6.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(ln0 ln0Var) {
        int i10;
        cn0 cn0Var = ln0Var.b;
        boolean z10 = ln0Var.H;
        if (z10) {
            cn0Var.C0();
        }
        ln0Var.e();
        if (!z10 || (i10 = ln0Var.h0) < 0) {
            return;
        }
        ln0Var.c.h1(i10, ln0Var.p0.f);
        cn0Var.post(new bn0(ln0Var, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0127 A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b() {
        rn0 rn0Var = this.p0;
        boolean z10 = rn0Var.a;
        int i10 = this.m0;
        long j10 = 0;
        if (z10) {
            TLRPC.Chat L0 = rn0Var.getMessagesController().L0(0L);
            if (L0 != null) {
                if (i10 != 1) {
                    if (this.h == (L0.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? -1 : org.telegram.messenger.w3.I(L0))) {
                        long j11 = this.n;
                        TLRPC.EmojiStatus emojiStatus = L0.emoji_status;
                        if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible)) {
                            TLRPC.PeerColor peerColor = L0.profile_color;
                            if ((peerColor instanceof TLRPC.TL_peerColor) && (peerColor.flags & 2) != 0) {
                                j10 = peerColor.background_emoji_id;
                            }
                        }
                        if (j11 != j10 || !rn0.G0(emojiStatus, this.r)) {
                        }
                    }
                    return true;
                }
                if (this.h == org.telegram.messenger.w3.F(L0) && this.n == org.telegram.messenger.w3.G(L0)) {
                    TLRPC.PeerColor peerColor2 = L0.color;
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = peerColor2 instanceof TLRPC.TL_peerColorCollectible ? (TLRPC.TL_peerColorCollectible) peerColor2 : null;
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible2 = this.s;
                    if (tL_peerColorCollectible != tL_peerColorCollectible2 && ((tL_peerColorCollectible != null || tL_peerColorCollectible2 != null) && (tL_peerColorCollectible == null || tL_peerColorCollectible2 == null || tL_peerColorCollectible.collectible_id != tL_peerColorCollectible2.collectible_id))) {
                    }
                }
                return true;
            }
            return false;
        }
        TLRPC.User f7 = rn0Var.getUserConfig().f();
        if (f7 != null) {
            if (i10 == 1) {
                ?? r12 = this.h == (f7.color instanceof TLRPC.TL_peerColorCollectible ? -1 : org.telegram.messenger.i20.e(f7));
                ?? r22 = this.n == org.telegram.messenger.i20.f(f7);
                TLRPC.PeerColor peerColor3 = f7.color;
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible3 = peerColor3 instanceof TLRPC.TL_peerColorCollectible ? (TLRPC.TL_peerColorCollectible) peerColor3 : null;
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible4 = this.s;
                ?? r02 = tL_peerColorCollectible3 == tL_peerColorCollectible4 || (tL_peerColorCollectible3 == null && tL_peerColorCollectible4 == null) || !(tL_peerColorCollectible3 == null || tL_peerColorCollectible4 == null || tL_peerColorCollectible3.collectible_id != tL_peerColorCollectible4.collectible_id);
                if (r12 == false || r22 == false || r02 == false) {
                    return true;
                }
            } else {
                ?? r13 = this.h == (f7.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? -1 : org.telegram.messenger.i20.l(f7));
                long j12 = this.n;
                TLRPC.EmojiStatus emojiStatus2 = f7.emoji_status;
                if (!(emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible)) {
                    TLRPC.PeerColor peerColor4 = f7.profile_color;
                    if ((peerColor4 instanceof TLRPC.TL_peerColor) && (peerColor4.flags & 2) != 0) {
                        j10 = peerColor4.background_emoji_id;
                    }
                }
                ?? r03 = j12 == j10;
                boolean G0 = rn0.G0(emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible ? (TLRPC.TL_emojiStatusCollectible) emojiStatus2 : null, this.r);
                if (r13 == false || r03 == false || !G0) {
                }
            }
        }
        return false;
    }

    public final boolean c() {
        cn0 cn0Var = this.b;
        if (cn0Var != null) {
            for (int i10 = 0; i10 < cn0Var.getChildCount(); i10++) {
                if (cn0Var.getChildAt(i10) instanceof org.telegram.ui.Components.zz) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i10 = this.m0;
        rn0 rn0Var = this.p0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i10 == 0) {
            TLRPC.User f7 = rn0Var.getUserConfig().f();
            this.h = org.telegram.messenger.i20.l(f7);
            this.n = org.telegram.messenger.i20.m(f7);
            if (f7 != null) {
                TLRPC.EmojiStatus emojiStatus = f7.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    this.r = tL_emojiStatusCollectible;
                    this.s = null;
                }
            }
            tL_emojiStatusCollectible = null;
            this.r = tL_emojiStatusCollectible;
            this.s = null;
        } else {
            TLRPC.User f10 = rn0Var.getUserConfig().f();
            this.h = org.telegram.messenger.i20.e(f10);
            this.n = org.telegram.messenger.i20.f(f10);
            this.r = null;
            if (f10 != null) {
                TLRPC.PeerColor peerColor = f10.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                }
            }
            this.s = tL_peerColorCollectible;
        }
        if (this.r == null && this.s == null) {
            return;
        }
        this.h = -1;
        this.n = 0L;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.E || this.H) {
            return super.drawChild(canvas, view, j10);
        }
        return false;
    }

    public final void e() {
        k();
        this.d.f();
    }

    public final void f(boolean z10) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.I;
        rn0 rn0Var = this.p0;
        m5.e eVar = this.e;
        if (tL_starGiftUnique != null) {
            sf.a resellAmount = tL_starGiftUnique.getResellAmount(sf.b.a);
            if (tL_starGiftUnique.resale_ton_only) {
                eVar.b = rh.h8.s1(rh.h8.V0(org.telegram.messenger.dd.a0(null, null, 2131746163, tL_starGiftUnique.getResellAmount(sf.b.b).d()), true), true);
                eVar.c = rh.h8.T0(org.telegram.messenger.dd.H(',', "ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                eVar.b = rh.h8.T0(org.telegram.messenger.dd.H(',', "ResellGiftBuy", (int) resellAmount.a()));
                eVar.c = null;
            }
        } else {
            eVar.b = (rn0Var.getUserConfig().q() || rn0Var.a) ? this.r != null ? this.P : this.O : this.N;
            eVar.c = null;
        }
        if (rn0Var.H0() == this) {
            rn0Var.R = this;
            rn0Var.Q.i((CharSequence) eVar.b, z10, true);
            rn0Var.Q.g((SpannableStringBuilder) eVar.c, z10);
        }
    }

    public final void g() {
        vh.d dVar = this.p0.Q;
        if (dVar != null) {
            dVar.updateColors();
        }
        gn0 gn0Var = this.w;
        if (gn0Var != null) {
            gn0Var.invalidate();
        }
        j(true);
        org.telegram.messenger.i0.d0(this.b, new s3(this, 15));
        qn0 qn0Var = this.E;
        if (qn0Var != null) {
            l(qn0Var);
        }
    }

    public final void h() {
        int i10;
        int i11 = this.p0.f;
        View view = this.x;
        qn0 qn0Var = this.E;
        if (qn0Var == null || (i10 = this.h0) < 0) {
            this.G = false;
            this.H = false;
            if (view != null) {
                view.setTranslationY(0.0f);
            }
            if (qn0Var != null) {
                qn0Var.setVisibility(4);
                boolean z10 = this.G;
                if (qn0Var.I != z10) {
                    qn0Var.I = z10;
                    qn0Var.invalidate();
                    return;
                }
                return;
            }
            return;
        }
        s4.r rVar = this.c;
        this.F = rVar.m(i10);
        cn0 cn0Var = this.b;
        int paddingTop = cn0Var.getPaddingTop() + i11;
        int L0 = rVar.L0();
        View view2 = this.F;
        if (view2 != null) {
            boolean z11 = view2.getTop() <= paddingTop;
            this.H = z11;
            this.G = !z11;
            qn0Var.setVisibility(0);
            qn0Var.setTranslationY((Math.max(this.F.getTop(), paddingTop) + cn0Var.getTop()) - qn0Var.getTop());
        } else if (L0 == -1 || L0 <= this.h0) {
            this.H = false;
            this.G = false;
            qn0Var.setVisibility(0);
            qn0Var.setTranslationY((org.telegram.messenger.i0.L(1.0f) + getHeight()) - qn0Var.getTop());
        } else {
            this.H = true;
            this.G = false;
            qn0Var.setVisibility(0);
            qn0Var.setTranslationY((cn0Var.getTop() + paddingTop) - qn0Var.getTop());
        }
        boolean z12 = this.G;
        if (qn0Var.I != z12) {
            qn0Var.I = z12;
            qn0Var.invalidate();
        }
        view.setTranslationY(this.H ? org.telegram.messenger.i0.L(36.0f) + i11 : 0.0f);
        cn0Var.invalidate();
        invalidate();
    }

    public final void i() {
        org.telegram.messenger.kj messageObject;
        gn0 gn0Var = this.w;
        if (gn0Var != null) {
            org.telegram.ui.Cells.q1[] cells = gn0Var.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.q1 q1Var = cells[i10];
                if (q1Var != null && (messageObject = q1Var.getMessageObject()) != null) {
                    messageObject.u1 = true;
                    on0 on0Var = this.f;
                    if (on0Var != null) {
                        messageObject.c1 = on0Var.getColorId();
                    }
                    messageObject.d1 = this.n;
                    messageObject.e1 = this.s;
                    cells[i10].setAvatar(messageObject);
                    cells[i10].invalidate();
                }
            }
        }
    }

    public final void j(boolean z10) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        int i10;
        rn0 rn0Var;
        wm0 wm0Var;
        int i11;
        on0 on0Var = this.f;
        if (on0Var != null) {
            on0Var.a(this.h, z10);
        }
        pn0 pn0Var = this.a;
        if (pn0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.r;
            if (tL_emojiStatusCollectible != null) {
                pn0Var.e(tL_emojiStatusCollectible.document_id, true, z10);
                pn0Var.c(org.telegram.messenger.lp.a(this.r), z10);
                pn0Var.d(this.r.pattern_document_id, true, z10);
            } else {
                if (org.telegram.messenger.o5.A()) {
                    pn0Var.e(0L, false, z10);
                } else {
                    TLRPC.User Z1 = org.telegram.messenger.wp.r1(org.telegram.messenger.e20.s0).Z1(0L);
                    pn0Var.e(Z1 != null ? org.telegram.messenger.o5.f(Z1.emoji_status) : 0L, org.telegram.messenger.o5.A(), z10);
                }
                pn0Var.b(this.h, z10);
                pn0Var.d(this.n, false, z10);
            }
        }
        int i12 = this.m0;
        if (i12 == 0 && (wm0Var = (rn0Var = this.p0).e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.r;
            if (tL_emojiStatusCollectible2 != null) {
                wm0Var.c(org.telegram.messenger.lp.a(tL_emojiStatusCollectible2), z10);
            } else {
                i11 = ((org.telegram.ui.ActionBar.k2) rn0Var).currentAccount;
                wm0Var.b(i11, this.h, z10);
            }
        }
        if (i12 == 0) {
            int i13 = this.V;
            k();
            en0 en0Var = this.d;
            if (i13 >= 0 && this.V < 0) {
                en0Var.p(i13, 2);
            } else if (i13 < 0 && (i10 = this.V) >= 0) {
                en0Var.o(i10, 2);
            }
        }
        int i14 = 0;
        while (true) {
            cn0 cn0Var = this.b;
            if (i14 >= cn0Var.getChildCount()) {
                return;
            }
            View childAt = cn0Var.getChildAt(i14);
            if (childAt instanceof an0) {
                an0 an0Var = (an0) childAt;
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.r;
                an0Var.b((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == an0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.s) != null && tL_peerColorCollectible2.collectible_id == an0Var.getGiftId()), true);
            } else if (childAt instanceof ph.c1) {
                ph.c1 c1Var = (ph.c1) childAt;
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.r;
                c1Var.f((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == c1Var.getGiftId()) || ((tL_peerColorCollectible = this.s) != null && tL_peerColorCollectible.collectible_id == c1Var.getGiftId()), true);
            }
            i14++;
        }
    }

    public final void k() {
        int i10;
        rn0 rn0Var = this.p0;
        rh.v5 v5Var = rn0Var.b;
        this.V = -1;
        this.W = -1;
        this.a0 = -1;
        this.b0 = -1;
        this.d0 = -1;
        this.e0 = -1;
        this.c0 = -1;
        this.g0 = -1;
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.f0 = 0;
        ArrayList arrayList = this.l0;
        arrayList.clear();
        this.Q = 0;
        this.S = 1;
        int i11 = 3;
        this.k0 = 3;
        this.R = 2;
        int i12 = this.m0;
        if (i12 == 0 && (this.h >= 0 || this.r != null || this.s != null)) {
            this.V = 3;
            this.k0 = 5;
            this.W = 4;
        }
        rh.v5 v5Var2 = i12 == 1 ? rn0Var.c : v5Var;
        if ((i12 == 0 || i12 == 1) && v5Var2 != null) {
            ArrayList arrayList2 = v5Var2.l;
            int i13 = this.k0;
            this.k0 = i13 + 1;
            this.h0 = i13;
            if (this.K == null) {
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i14)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i15 = this.k0;
                this.b0 = i15;
                this.k0 = arrayList.size() + i15;
                int size = arrayList.size() + this.f0;
                this.f0 = size;
                int i16 = this.k0;
                this.c0 = i16;
                if (v5Var.i || !v5Var.j) {
                    this.d0 = i16;
                    int i17 = 3 - (size % 3);
                    if (size <= 0) {
                        i11 = 9;
                    } else if (i17 > 0) {
                        i11 = i17;
                    }
                    int i18 = i16 + i11;
                    this.k0 = i18;
                    this.f0 = size + i11;
                    this.e0 = i18;
                } else if (arrayList.isEmpty()) {
                    int i19 = this.k0;
                    this.j0 = i19;
                    this.k0 = i19 + 2;
                    this.i0 = i19 + 1;
                }
                if (c()) {
                    v5Var2.b();
                }
            } else if (this.J != null) {
                i10 = ((org.telegram.ui.ActionBar.k2) rn0Var).currentAccount;
                long e = org.telegram.messenger.e20.i(i10).e();
                for (int i20 = 0; i20 < this.J.d.size(); i20++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.J.d.get(i20);
                    if (org.telegram.messenger.o5.o(tL_starGiftUnique.owner_id) != e && org.telegram.messenger.o5.o(tL_starGiftUnique.host_id) != e) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i21 = this.k0;
                this.b0 = i21;
                this.k0 = arrayList.size() + i21;
                int size2 = arrayList.size() + this.f0;
                this.f0 = size2;
                int i22 = this.k0;
                this.c0 = i22;
                ph.h3 h3Var = this.J;
                if (h3Var.t || !h3Var.u) {
                    this.d0 = i22;
                    int i23 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i11 = 9;
                    } else if (i23 > 0) {
                        i11 = i23;
                    }
                    int i24 = i22 + i11;
                    this.k0 = i24;
                    this.f0 = size2 + i11;
                    this.e0 = i24;
                }
                if (c()) {
                    this.J.g(false);
                }
            }
            int i25 = this.k0;
            this.k0 = i25 + 1;
            this.g0 = i25;
        }
        int i26 = this.k0;
        this.k0 = i26 + 1;
        this.U = i26;
        qn0 qn0Var = this.E;
        if (qn0Var != null) {
            qn0Var.post(new bn0(this, 1));
        }
    }

    public final void l(qn0 qn0Var) {
        int i10 = org.telegram.ui.ActionBar.t6.d6;
        rn0 rn0Var = this.p0;
        int themedColor = rn0Var.getThemedColor(i10);
        rn0Var.getThemedColor(org.telegram.ui.ActionBar.t6.a7);
        int themedColor2 = rn0Var.getThemedColor(org.telegram.ui.ActionBar.t6.z6);
        int themedColor3 = rn0Var.getThemedColor(org.telegram.ui.ActionBar.t6.G6);
        qn0Var.w.setColor(themedColor);
        qn0Var.y = org.telegram.ui.ActionBar.t6.r1(0.06f, themedColor3);
        qn0Var.D = themedColor2;
        qn0Var.E = themedColor3;
        mb0 mb0Var = qn0Var.a;
        for (int i11 = 0; i11 < mb0Var.getChildCount(); i11++) {
            View childAt = mb0Var.getChildAt(i11);
            int R = RecyclerView.R(childAt);
            if (R != -1 && (childAt instanceof TextView)) {
                ((TextView) childAt).setTextColor(R == qn0Var.d ? qn0Var.E : qn0Var.D);
                childAt.invalidate();
            }
        }
        mb0Var.invalidate();
        qn0Var.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = this.m0;
        View view = this.x;
        cn0 cn0Var = this.b;
        if (i12 == 1) {
            super.onMeasure(i10, i11);
            gn0 gn0Var = this.w;
            this.n0 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + gn0Var.getMeasuredHeight() + org.telegram.messenger.i0.m;
            ((ViewGroup.MarginLayoutParams) gn0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.m;
            ((ViewGroup.MarginLayoutParams) cn0Var.getLayoutParams()).topMargin = this.n0 - org.telegram.messenger.i0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.n0 - org.telegram.messenger.i0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) this.y.getLayoutParams()).topMargin = this.n0 - org.telegram.messenger.i0.L(16.0f);
            cn0Var.setPadding(cn0Var.getPaddingLeft(), org.telegram.messenger.i0.L(16.0f), cn0Var.getPaddingRight(), cn0Var.getPaddingBottom());
        } else {
            this.n0 = org.telegram.messenger.i0.L(230.0f) + org.telegram.messenger.i0.m;
            ((ViewGroup.MarginLayoutParams) cn0Var.getLayoutParams()).topMargin = this.n0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.n0 - org.telegram.messenger.i0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).height = this.n0;
        }
        super.onMeasure(i10, i11);
    }
}
