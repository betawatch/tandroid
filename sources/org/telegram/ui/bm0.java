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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class bm0 extends FrameLayout {
    public static final /* synthetic */ int q0 = 0;
    public am0 D;
    public final gm0 E;
    public View F;
    public boolean G;
    public boolean H;
    public TL_stars.TL_starGiftUnique I;
    public zh.b3 J;
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
    public final fm0 a;
    public int a0;
    public final sl0 b;
    public int b0;
    public final v4.s c;
    public int c0;
    public final ul0 d;
    public int d0;
    public final j2.n e;
    public int e0;
    public em0 f;
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
    public yl0 o0;
    public final /* synthetic */ hm0 p0;
    public TLRPC.TL_emojiStatusCollectible r;
    public TLRPC.TL_peerColorCollectible s;
    public final wl0 w;
    public final View x;
    public final View y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public bm0(hm0 hm0Var, Context context, int i7) {
        super(context);
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var4;
        this.p0 = hm0Var;
        Object[] objArr = 0;
        this.e = new j2.n(20, false);
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
        this.m0 = i7;
        d();
        Context context2 = getContext();
        org.telegram.ui.ActionBar.f6 resourceProvider = hm0Var.getResourceProvider();
        dh.c cVar = hm0Var.G;
        sl0 sl0Var = new sl0(this, context2, resourceProvider, i7);
        this.b = sl0Var;
        sl0Var.setClipToPadding(false);
        sl0Var.setSections(true);
        ((v4.k) sl0Var.getItemAnimator()).m = false;
        getContext();
        v4.s sVar = new v4.s(3);
        this.c = sVar;
        sVar.O = new ai.l(this, 12);
        sl0Var.i(new fi.o1(this, 7));
        sl0Var.setLayoutManager(sVar);
        ul0 ul0Var = new ul0(this, context, i7);
        this.d = ul0Var;
        sl0Var.setAdapter(ul0Var);
        sl0Var.setOnItemClickListener(new org.telegram.ui.Components.yk0(this, i7, 1));
        sl0Var.j(new vl0(this, i7));
        addView(sl0Var, c8.ha.c(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        String M0 = org.telegram.messenger.id.M0(hm0Var.a ? 2131752435 : 2131743758, null);
        this.O = M0;
        this.N = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append((CharSequence) M0);
        this.P = org.telegram.messenger.id.M0(2131743757, null);
        f(false);
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        kVar.m = false;
        sl0Var.setItemAnimator(kVar);
        View view = new View(getContext());
        this.x = view;
        dh.d dVar = new dh.d(cVar.c(view, null, false));
        dVar.b(-org.telegram.messenger.g0.L(24.0f), true);
        dVar.G = org.telegram.messenger.qs.x3;
        view.setBackground(dVar);
        addView(view, c8.ha.e(-1, 72, 55));
        if (i7 == 0) {
            Context context3 = getContext();
            i10 = ((org.telegram.ui.ActionBar.f2) hm0Var).currentAccount;
            f6Var4 = ((org.telegram.ui.ActionBar.f2) hm0Var).resourceProvider;
            this.a = new fm0(i10, 0L, context3, f6Var4);
            j(false);
        } else {
            View view2 = new View(getContext());
            this.y = view2;
            dh.d dVar2 = new dh.d(cVar.c(view2, null, false));
            dVar2.b(-org.telegram.messenger.g0.L(16.0f), false);
            view2.setBackground(dVar2);
            addView(view2, c8.ha.e(-1, 16, 55));
            Context context4 = getContext();
            q4Var = ((org.telegram.ui.ActionBar.f2) hm0Var).parentLayout;
            f6Var = ((org.telegram.ui.ActionBar.f2) hm0Var).resourceProvider;
            wl0 wl0Var = new wl0(context4, q4Var, 3, 0L, f6Var);
            this.w = wl0Var;
            wl0Var.setImportantForAccessibility(4);
            wl0Var.x = hm0Var;
            wl0Var.setClipToOutline(true);
            float L = org.telegram.messenger.g0.L(16.0f);
            bg.q0 q0Var = bg.u0.a;
            wl0Var.setOutlineProvider(new bg.s0(0, L));
            addView(wl0Var, c8.ha.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        Context context5 = getContext();
        f6Var2 = ((org.telegram.ui.ActionBar.f2) hm0Var).resourceProvider;
        gm0 gm0Var = new gm0(context5, f6Var2);
        this.E = gm0Var;
        fh.g c10 = hm0Var.E.c(gm0Var, null, false);
        f6Var3 = ((org.telegram.ui.ActionBar.f2) hm0Var).resourceProvider;
        gh.e eVar = new gh.e(f6Var3);
        eVar.e = new g2.c(17);
        eVar.f(0, 0);
        eVar.e(0, 0);
        eVar.d(0, 0);
        c10.p(eVar);
        c10.r(org.telegram.messenger.g0.L(18.0f));
        c10.Q.e = true;
        gm0Var.H = c10;
        gm0Var.G = c10;
        gm0Var.F = new rl0(this, objArr == true ? 1 : 0);
        gm0Var.setVisibility(4);
        addView(gm0Var, c8.ha.d(-1, 36.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        View view3 = this.a;
        if (view3 != null) {
            addView(view3, c8.ha.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(bm0 bm0Var) {
        int i7;
        sl0 sl0Var = bm0Var.b;
        boolean z9 = bm0Var.H;
        if (z9) {
            sl0Var.C0();
        }
        bm0Var.e();
        if (!z9 || (i7 = bm0Var.h0) < 0) {
            return;
        }
        bm0Var.c.h1(i7, bm0Var.p0.f);
        sl0Var.post(new rl0(bm0Var, 1));
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
        hm0 hm0Var = this.p0;
        boolean z9 = hm0Var.a;
        int i7 = this.m0;
        long j3 = 0;
        if (z9) {
            TLRPC.Chat M0 = hm0Var.getMessagesController().M0(0L);
            if (M0 != null) {
                if (i7 != 1) {
                    if (this.h == (M0.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? -1 : org.telegram.messenger.t3.I(M0))) {
                        long j10 = this.n;
                        TLRPC.EmojiStatus emojiStatus = M0.emoji_status;
                        if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible)) {
                            TLRPC.PeerColor peerColor = M0.profile_color;
                            if ((peerColor instanceof TLRPC.TL_peerColor) && (peerColor.flags & 2) != 0) {
                                j3 = peerColor.background_emoji_id;
                            }
                        }
                        if (j10 != j3 || !hm0.G0(emojiStatus, this.r)) {
                        }
                    }
                    return true;
                }
                if (this.h == org.telegram.messenger.t3.F(M0) && this.n == org.telegram.messenger.t3.G(M0)) {
                    TLRPC.PeerColor peerColor2 = M0.color;
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = peerColor2 instanceof TLRPC.TL_peerColorCollectible ? (TLRPC.TL_peerColorCollectible) peerColor2 : null;
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible2 = this.s;
                    if (tL_peerColorCollectible != tL_peerColorCollectible2 && ((tL_peerColorCollectible != null || tL_peerColorCollectible2 != null) && (tL_peerColorCollectible == null || tL_peerColorCollectible2 == null || tL_peerColorCollectible.collectible_id != tL_peerColorCollectible2.collectible_id))) {
                    }
                }
                return true;
            }
            return false;
        }
        TLRPC.User f10 = hm0Var.getUserConfig().f();
        if (f10 != null) {
            if (i7 == 1) {
                ?? r12 = this.h == (f10.color instanceof TLRPC.TL_peerColorCollectible ? -1 : org.telegram.messenger.t10.e(f10));
                ?? r22 = this.n == org.telegram.messenger.t10.f(f10);
                TLRPC.PeerColor peerColor3 = f10.color;
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible3 = peerColor3 instanceof TLRPC.TL_peerColorCollectible ? (TLRPC.TL_peerColorCollectible) peerColor3 : null;
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible4 = this.s;
                ?? r02 = tL_peerColorCollectible3 == tL_peerColorCollectible4 || (tL_peerColorCollectible3 == null && tL_peerColorCollectible4 == null) || !(tL_peerColorCollectible3 == null || tL_peerColorCollectible4 == null || tL_peerColorCollectible3.collectible_id != tL_peerColorCollectible4.collectible_id);
                if (r12 == false || r22 == false || r02 == false) {
                    return true;
                }
            } else {
                ?? r13 = this.h == (f10.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? -1 : org.telegram.messenger.t10.l(f10));
                long j11 = this.n;
                TLRPC.EmojiStatus emojiStatus2 = f10.emoji_status;
                if (!(emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible)) {
                    TLRPC.PeerColor peerColor4 = f10.profile_color;
                    if ((peerColor4 instanceof TLRPC.TL_peerColor) && (peerColor4.flags & 2) != 0) {
                        j3 = peerColor4.background_emoji_id;
                    }
                }
                ?? r03 = j11 == j3;
                boolean G0 = hm0.G0(emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible ? (TLRPC.TL_emojiStatusCollectible) emojiStatus2 : null, this.r);
                if (r13 == false || r03 == false || !G0) {
                }
            }
        }
        return false;
    }

    public final boolean c() {
        sl0 sl0Var = this.b;
        if (sl0Var != null) {
            for (int i7 = 0; i7 < sl0Var.getChildCount(); i7++) {
                if (sl0Var.getChildAt(i7) instanceof org.telegram.ui.Components.mz) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i7 = this.m0;
        hm0 hm0Var = this.p0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i7 == 0) {
            TLRPC.User f10 = hm0Var.getUserConfig().f();
            this.h = org.telegram.messenger.t10.l(f10);
            this.n = org.telegram.messenger.t10.m(f10);
            if (f10 != null) {
                TLRPC.EmojiStatus emojiStatus = f10.emoji_status;
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
            TLRPC.User f11 = hm0Var.getUserConfig().f();
            this.h = org.telegram.messenger.t10.e(f11);
            this.n = org.telegram.messenger.t10.f(f11);
            this.r = null;
            if (f11 != null) {
                TLRPC.PeerColor peerColor = f11.color;
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.E || this.H) {
            return super.drawChild(canvas, view, j3);
        }
        return false;
    }

    public final void e() {
        k();
        this.d.f();
    }

    public final void f(boolean z9) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.I;
        hm0 hm0Var = this.p0;
        j2.n nVar = this.e;
        if (tL_starGiftUnique != null) {
            cg.a resellAmount = tL_starGiftUnique.getResellAmount(cg.b.a);
            if (tL_starGiftUnique.resale_ton_only) {
                nVar.b = bi.dd.s1(bi.dd.V0(org.telegram.messenger.id.a0(null, null, 2131746149, tL_starGiftUnique.getResellAmount(cg.b.b).d()), true), true);
                nVar.c = bi.dd.T0(org.telegram.messenger.id.H(',', "ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                nVar.b = bi.dd.T0(org.telegram.messenger.id.H(',', "ResellGiftBuy", (int) resellAmount.a()));
                nVar.c = null;
            }
        } else {
            nVar.b = (hm0Var.getUserConfig().q() || hm0Var.a) ? this.r != null ? this.P : this.O : this.N;
            nVar.c = null;
        }
        if (hm0Var.H0() == this) {
            hm0Var.R = this;
            hm0Var.Q.i((CharSequence) nVar.b, z9, true);
            hm0Var.Q.g((SpannableStringBuilder) nVar.c, z9);
        }
    }

    public final void g() {
        fi.d dVar = this.p0.Q;
        if (dVar != null) {
            dVar.updateColors();
        }
        wl0 wl0Var = this.w;
        if (wl0Var != null) {
            wl0Var.invalidate();
        }
        j(true);
        org.telegram.messenger.g0.d0(this.b, new r3(this, 16));
        gm0 gm0Var = this.E;
        if (gm0Var != null) {
            l(gm0Var);
        }
    }

    public final void h() {
        int i7;
        int i10 = this.p0.f;
        View view = this.x;
        gm0 gm0Var = this.E;
        if (gm0Var == null || (i7 = this.h0) < 0) {
            this.G = false;
            this.H = false;
            if (view != null) {
                view.setTranslationY(0.0f);
            }
            if (gm0Var != null) {
                gm0Var.setVisibility(4);
                boolean z9 = this.G;
                if (gm0Var.I != z9) {
                    gm0Var.I = z9;
                    gm0Var.invalidate();
                    return;
                }
                return;
            }
            return;
        }
        v4.s sVar = this.c;
        this.F = sVar.m(i7);
        sl0 sl0Var = this.b;
        int paddingTop = sl0Var.getPaddingTop() + i10;
        int L0 = sVar.L0();
        View view2 = this.F;
        if (view2 != null) {
            boolean z10 = view2.getTop() <= paddingTop;
            this.H = z10;
            this.G = !z10;
            gm0Var.setVisibility(0);
            gm0Var.setTranslationY((Math.max(this.F.getTop(), paddingTop) + sl0Var.getTop()) - gm0Var.getTop());
        } else if (L0 == -1 || L0 <= this.h0) {
            this.H = false;
            this.G = false;
            gm0Var.setVisibility(0);
            gm0Var.setTranslationY((org.telegram.messenger.g0.L(1.0f) + getHeight()) - gm0Var.getTop());
        } else {
            this.H = true;
            this.G = false;
            gm0Var.setVisibility(0);
            gm0Var.setTranslationY((sl0Var.getTop() + paddingTop) - gm0Var.getTop());
        }
        boolean z11 = this.G;
        if (gm0Var.I != z11) {
            gm0Var.I = z11;
            gm0Var.invalidate();
        }
        view.setTranslationY(this.H ? org.telegram.messenger.g0.L(36.0f) + i10 : 0.0f);
        sl0Var.invalidate();
        invalidate();
    }

    public final void i() {
        org.telegram.messenger.ij messageObject;
        wl0 wl0Var = this.w;
        if (wl0Var != null) {
            org.telegram.ui.Cells.q1[] cells = wl0Var.getCells();
            for (int i7 = 0; i7 < cells.length; i7++) {
                org.telegram.ui.Cells.q1 q1Var = cells[i7];
                if (q1Var != null && (messageObject = q1Var.getMessageObject()) != null) {
                    messageObject.u1 = true;
                    em0 em0Var = this.f;
                    if (em0Var != null) {
                        messageObject.c1 = em0Var.getColorId();
                    }
                    messageObject.d1 = this.n;
                    messageObject.e1 = this.s;
                    cells[i7].setAvatar(messageObject);
                    cells[i7].invalidate();
                }
            }
        }
    }

    public final void j(boolean z9) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        int i7;
        hm0 hm0Var;
        ml0 ml0Var;
        int i10;
        em0 em0Var = this.f;
        if (em0Var != null) {
            em0Var.a(this.h, z9);
        }
        fm0 fm0Var = this.a;
        if (fm0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.r;
            if (tL_emojiStatusCollectible != null) {
                fm0Var.e(tL_emojiStatusCollectible.document_id, true, z9);
                fm0Var.c(org.telegram.messenger.fp.a(this.r), z9);
                fm0Var.d(this.r.pattern_document_id, true, z9);
            } else {
                if (org.telegram.messenger.m5.A()) {
                    fm0Var.e(0L, false, z9);
                } else {
                    TLRPC.User a22 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).a2(0L);
                    fm0Var.e(a22 != null ? org.telegram.messenger.m5.f(a22.emoji_status) : 0L, org.telegram.messenger.m5.A(), z9);
                }
                fm0Var.b(this.h, z9);
                fm0Var.d(this.n, false, z9);
            }
        }
        int i11 = this.m0;
        if (i11 == 0 && (ml0Var = (hm0Var = this.p0).e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.r;
            if (tL_emojiStatusCollectible2 != null) {
                ml0Var.c(org.telegram.messenger.fp.a(tL_emojiStatusCollectible2), z9);
            } else {
                i10 = ((org.telegram.ui.ActionBar.f2) hm0Var).currentAccount;
                ml0Var.b(i10, this.h, z9);
            }
        }
        if (i11 == 0) {
            int i12 = this.V;
            k();
            ul0 ul0Var = this.d;
            if (i12 >= 0 && this.V < 0) {
                ul0Var.p(i12, 2);
            } else if (i12 < 0 && (i7 = this.V) >= 0) {
                ul0Var.o(i7, 2);
            }
        }
        int i13 = 0;
        while (true) {
            sl0 sl0Var = this.b;
            if (i13 >= sl0Var.getChildCount()) {
                return;
            }
            View childAt = sl0Var.getChildAt(i13);
            if (childAt instanceof ql0) {
                ql0 ql0Var = (ql0) childAt;
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.r;
                ql0Var.b((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == ql0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.s) != null && tL_peerColorCollectible2.collectible_id == ql0Var.getGiftId()), true);
            } else if (childAt instanceof zh.y0) {
                zh.y0 y0Var = (zh.y0) childAt;
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.r;
                y0Var.f((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == y0Var.getGiftId()) || ((tL_peerColorCollectible = this.s) != null && tL_peerColorCollectible.collectible_id == y0Var.getGiftId()), true);
            }
            i13++;
        }
    }

    public final void k() {
        int i7;
        hm0 hm0Var = this.p0;
        bi.v9 v9Var = hm0Var.b;
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
        int i10 = 3;
        this.k0 = 3;
        this.R = 2;
        int i11 = this.m0;
        if (i11 == 0 && (this.h >= 0 || this.r != null || this.s != null)) {
            this.V = 3;
            this.k0 = 5;
            this.W = 4;
        }
        bi.v9 v9Var2 = i11 == 1 ? hm0Var.c : v9Var;
        if ((i11 == 0 || i11 == 1) && v9Var2 != null) {
            ArrayList arrayList2 = v9Var2.l;
            int i12 = this.k0;
            this.k0 = i12 + 1;
            this.h0 = i12;
            if (this.K == null) {
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i13)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i14 = this.k0;
                this.b0 = i14;
                this.k0 = arrayList.size() + i14;
                int size = arrayList.size() + this.f0;
                this.f0 = size;
                int i15 = this.k0;
                this.c0 = i15;
                if (v9Var.i || !v9Var.j) {
                    this.d0 = i15;
                    int i16 = 3 - (size % 3);
                    if (size <= 0) {
                        i10 = 9;
                    } else if (i16 > 0) {
                        i10 = i16;
                    }
                    int i17 = i15 + i10;
                    this.k0 = i17;
                    this.f0 = size + i10;
                    this.e0 = i17;
                } else if (arrayList.isEmpty()) {
                    int i18 = this.k0;
                    this.j0 = i18;
                    this.k0 = i18 + 2;
                    this.i0 = i18 + 1;
                }
                if (c()) {
                    v9Var2.a();
                }
            } else if (this.J != null) {
                i7 = ((org.telegram.ui.ActionBar.f2) hm0Var).currentAccount;
                long e10 = org.telegram.messenger.p10.i(i7).e();
                for (int i19 = 0; i19 < this.J.d.size(); i19++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.J.d.get(i19);
                    if (org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id) != e10 && org.telegram.messenger.m5.o(tL_starGiftUnique.host_id) != e10) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i20 = this.k0;
                this.b0 = i20;
                this.k0 = arrayList.size() + i20;
                int size2 = arrayList.size() + this.f0;
                this.f0 = size2;
                int i21 = this.k0;
                this.c0 = i21;
                zh.b3 b3Var = this.J;
                if (b3Var.t || !b3Var.u) {
                    this.d0 = i21;
                    int i22 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i10 = 9;
                    } else if (i22 > 0) {
                        i10 = i22;
                    }
                    int i23 = i21 + i10;
                    this.k0 = i23;
                    this.f0 = size2 + i10;
                    this.e0 = i23;
                }
                if (c()) {
                    this.J.g(false);
                }
            }
            int i24 = this.k0;
            this.k0 = i24 + 1;
            this.g0 = i24;
        }
        int i25 = this.k0;
        this.k0 = i25 + 1;
        this.U = i25;
        gm0 gm0Var = this.E;
        if (gm0Var != null) {
            gm0Var.post(new rl0(this, 1));
        }
    }

    public final void l(gm0 gm0Var) {
        int i7 = org.telegram.ui.ActionBar.k6.d6;
        hm0 hm0Var = this.p0;
        int themedColor = hm0Var.getThemedColor(i7);
        hm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.a7);
        int themedColor2 = hm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.z6);
        int themedColor3 = hm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.G6);
        gm0Var.w.setColor(themedColor);
        gm0Var.y = org.telegram.ui.ActionBar.k6.r1(0.06f, themedColor3);
        gm0Var.D = themedColor2;
        gm0Var.E = themedColor3;
        zs zsVar = gm0Var.a;
        for (int i10 = 0; i10 < zsVar.getChildCount(); i10++) {
            View childAt = zsVar.getChildAt(i10);
            int R = RecyclerView.R(childAt);
            if (R != -1 && (childAt instanceof TextView)) {
                ((TextView) childAt).setTextColor(R == gm0Var.d ? gm0Var.E : gm0Var.D);
                childAt.invalidate();
            }
        }
        zsVar.invalidate();
        gm0Var.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11 = this.m0;
        View view = this.x;
        sl0 sl0Var = this.b;
        if (i11 == 1) {
            super.onMeasure(i7, i10);
            wl0 wl0Var = this.w;
            this.n0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + wl0Var.getMeasuredHeight() + org.telegram.messenger.g0.m;
            ((ViewGroup.MarginLayoutParams) wl0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m;
            ((ViewGroup.MarginLayoutParams) sl0Var.getLayoutParams()).topMargin = this.n0 - org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.n0 - org.telegram.messenger.g0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) this.y.getLayoutParams()).topMargin = this.n0 - org.telegram.messenger.g0.L(16.0f);
            sl0Var.setPadding(sl0Var.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), sl0Var.getPaddingRight(), sl0Var.getPaddingBottom());
        } else {
            this.n0 = org.telegram.messenger.g0.L(230.0f) + org.telegram.messenger.g0.m;
            ((ViewGroup.MarginLayoutParams) sl0Var.getLayoutParams()).topMargin = this.n0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.n0 - org.telegram.messenger.g0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).height = this.n0;
        }
        super.onMeasure(i7, i10);
    }
}
