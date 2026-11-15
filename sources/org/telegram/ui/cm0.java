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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class cm0 extends FrameLayout {
    public static final /* synthetic */ int r0 = 0;
    public bm0 E;
    public final hm0 F;
    public View G;
    public boolean H;
    public boolean I;
    public TL_stars.TL_starGiftUnique J;
    public bi.o5 K;
    public TL_stars.StarGift L;
    public final ArrayList M;
    public final HashMap N;
    public final SpannableStringBuilder O;
    public final String P;
    public final String Q;
    public int R;
    public int S;
    public int T;
    public final int U;
    public int V;
    public int W;
    public final gm0 a;
    public int a0;
    public final tl0 b;
    public int b0;
    public final v4.s c;
    public int c0;
    public final vl0 d;
    public int d0;
    public final ji.j e;
    public int e0;
    public fm0 f;
    public int f0;
    public int g0;
    public int h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public final ArrayList m0;
    public long n;
    public final int n0;
    public int o0;
    public zl0 p0;
    public final /* synthetic */ im0 q0;
    public TLRPC.TL_emojiStatusCollectible r;
    public TLRPC.TL_peerColorCollectible s;
    public final xl0 w;
    public final View x;
    public final View y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public cm0(im0 im0Var, Context context, int i7) {
        super(context);
        org.telegram.ui.ActionBar.o4 o4Var;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var4;
        this.q0 = im0Var;
        Object[] objArr = 0;
        this.e = new ji.j(18, false);
        this.h = -1;
        this.n = 0L;
        this.r = null;
        this.s = null;
        this.L = null;
        this.M = new ArrayList();
        this.N = new HashMap();
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
        this.f0 = -1;
        this.g0 = 0;
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.k0 = -1;
        this.m0 = new ArrayList();
        this.n0 = i7;
        d();
        Context context2 = getContext();
        org.telegram.ui.ActionBar.e6 resourceProvider = im0Var.getResourceProvider();
        dh.c cVar = im0Var.H;
        tl0 tl0Var = new tl0(this, context2, resourceProvider, i7);
        this.b = tl0Var;
        tl0Var.setClipToPadding(false);
        tl0Var.setSections(true);
        ((v4.k) tl0Var.getItemAnimator()).m = false;
        getContext();
        v4.s sVar = new v4.s(3);
        this.c = sVar;
        sVar.O = new bi.y1(this, 15);
        tl0Var.i(new ai.h0(this, 8));
        tl0Var.setLayoutManager(sVar);
        vl0 vl0Var = new vl0(this, context, i7);
        this.d = vl0Var;
        tl0Var.setAdapter(vl0Var);
        tl0Var.setOnItemClickListener(new org.telegram.ui.Components.dl0(this, i7, 1));
        tl0Var.j(new wl0(this, i7));
        addView(tl0Var, c8.ja.c(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.eq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        String M0 = org.telegram.messenger.hd.M0(im0Var.a ? 2131752435 : 2131743755, null);
        this.P = M0;
        this.O = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append((CharSequence) M0);
        this.Q = org.telegram.messenger.hd.M0(2131743754, null);
        f(false);
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.er.h);
        kVar.C = false;
        kVar.m = false;
        tl0Var.setItemAnimator(kVar);
        View view = new View(getContext());
        this.x = view;
        dh.d dVar = new dh.d(cVar.c(view, null, false));
        dVar.b(-org.telegram.messenger.g0.L(24.0f), true);
        dVar.H = org.telegram.messenger.ns.x3;
        view.setBackground(dVar);
        addView(view, c8.ja.e(-1, 72, 55));
        if (i7 == 0) {
            Context context3 = getContext();
            i10 = ((org.telegram.ui.ActionBar.e2) im0Var).currentAccount;
            e6Var4 = ((org.telegram.ui.ActionBar.e2) im0Var).resourceProvider;
            this.a = new gm0(i10, 0L, context3, e6Var4);
            j(false);
        } else {
            View view2 = new View(getContext());
            this.y = view2;
            dh.d dVar2 = new dh.d(cVar.c(view2, null, false));
            dVar2.b(-org.telegram.messenger.g0.L(16.0f), false);
            view2.setBackground(dVar2);
            addView(view2, c8.ja.e(-1, 16, 55));
            Context context4 = getContext();
            o4Var = ((org.telegram.ui.ActionBar.e2) im0Var).parentLayout;
            e6Var = ((org.telegram.ui.ActionBar.e2) im0Var).resourceProvider;
            xl0 xl0Var = new xl0(context4, o4Var, 3, 0L, e6Var);
            this.w = xl0Var;
            xl0Var.setImportantForAccessibility(4);
            xl0Var.x = im0Var;
            xl0Var.setClipToOutline(true);
            float L = org.telegram.messenger.g0.L(16.0f);
            bg.p0 p0Var = bg.t0.a;
            xl0Var.setOutlineProvider(new bg.r0(0, L));
            addView(xl0Var, c8.ja.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        Context context5 = getContext();
        e6Var2 = ((org.telegram.ui.ActionBar.e2) im0Var).resourceProvider;
        hm0 hm0Var = new hm0(context5, e6Var2);
        this.F = hm0Var;
        fh.g c10 = im0Var.F.c(hm0Var, null, false);
        e6Var3 = ((org.telegram.ui.ActionBar.e2) im0Var).resourceProvider;
        gh.e eVar = new gh.e(e6Var3);
        eVar.e = new g0.e(19);
        eVar.f(0, 0);
        eVar.e(0, 0);
        eVar.d(0, 0);
        c10.p(eVar);
        c10.r(org.telegram.messenger.g0.L(18.0f));
        c10.R.e = true;
        hm0Var.I = c10;
        hm0Var.H = c10;
        hm0Var.G = new sl0(this, objArr == true ? 1 : 0);
        hm0Var.setVisibility(4);
        addView(hm0Var, c8.ja.d(-1, 36.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        View view3 = this.a;
        if (view3 != null) {
            addView(view3, c8.ja.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(cm0 cm0Var) {
        int i7;
        tl0 tl0Var = cm0Var.b;
        boolean z10 = cm0Var.I;
        if (z10) {
            tl0Var.C0();
        }
        cm0Var.e();
        if (!z10 || (i7 = cm0Var.i0) < 0) {
            return;
        }
        cm0Var.c.h1(i7, cm0Var.q0.f);
        tl0Var.post(new sl0(cm0Var, 1));
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
        im0 im0Var = this.q0;
        boolean z10 = im0Var.a;
        int i7 = this.n0;
        long j3 = 0;
        if (z10) {
            TLRPC.Chat M0 = im0Var.getMessagesController().M0(0L);
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
                        if (j10 != j3 || !im0.G0(emojiStatus, this.r)) {
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
        TLRPC.User f10 = im0Var.getUserConfig().f();
        if (f10 != null) {
            if (i7 == 1) {
                ?? r12 = this.h == (f10.color instanceof TLRPC.TL_peerColorCollectible ? -1 : org.telegram.messenger.q10.e(f10));
                ?? r22 = this.n == org.telegram.messenger.q10.f(f10);
                TLRPC.PeerColor peerColor3 = f10.color;
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible3 = peerColor3 instanceof TLRPC.TL_peerColorCollectible ? (TLRPC.TL_peerColorCollectible) peerColor3 : null;
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible4 = this.s;
                ?? r02 = tL_peerColorCollectible3 == tL_peerColorCollectible4 || (tL_peerColorCollectible3 == null && tL_peerColorCollectible4 == null) || !(tL_peerColorCollectible3 == null || tL_peerColorCollectible4 == null || tL_peerColorCollectible3.collectible_id != tL_peerColorCollectible4.collectible_id);
                if (r12 == false || r22 == false || r02 == false) {
                    return true;
                }
            } else {
                ?? r13 = this.h == (f10.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? -1 : org.telegram.messenger.q10.l(f10));
                long j11 = this.n;
                TLRPC.EmojiStatus emojiStatus2 = f10.emoji_status;
                if (!(emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible)) {
                    TLRPC.PeerColor peerColor4 = f10.profile_color;
                    if ((peerColor4 instanceof TLRPC.TL_peerColor) && (peerColor4.flags & 2) != 0) {
                        j3 = peerColor4.background_emoji_id;
                    }
                }
                ?? r03 = j11 == j3;
                boolean G0 = im0.G0(emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible ? (TLRPC.TL_emojiStatusCollectible) emojiStatus2 : null, this.r);
                if (r13 == false || r03 == false || !G0) {
                }
            }
        }
        return false;
    }

    public final boolean c() {
        tl0 tl0Var = this.b;
        if (tl0Var != null) {
            for (int i7 = 0; i7 < tl0Var.getChildCount(); i7++) {
                if (tl0Var.getChildAt(i7) instanceof org.telegram.ui.Components.pz) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i7 = this.n0;
        im0 im0Var = this.q0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i7 == 0) {
            TLRPC.User f10 = im0Var.getUserConfig().f();
            this.h = org.telegram.messenger.q10.l(f10);
            this.n = org.telegram.messenger.q10.m(f10);
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
            TLRPC.User f11 = im0Var.getUserConfig().f();
            this.h = org.telegram.messenger.q10.e(f11);
            this.n = org.telegram.messenger.q10.f(f11);
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
        if (view != this.F || this.I) {
            return super.drawChild(canvas, view, j3);
        }
        return false;
    }

    public final void e() {
        k();
        this.d.f();
    }

    public final void f(boolean z10) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.J;
        im0 im0Var = this.q0;
        ji.j jVar = this.e;
        if (tL_starGiftUnique != null) {
            cg.a resellAmount = tL_starGiftUnique.getResellAmount(cg.b.a);
            if (tL_starGiftUnique.resale_ton_only) {
                jVar.b = di.mb.s1(di.mb.V0(org.telegram.messenger.hd.a0(null, null, 2131746146, tL_starGiftUnique.getResellAmount(cg.b.b).d()), true), true);
                jVar.c = di.mb.T0(org.telegram.messenger.hd.H(',', "ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                jVar.b = di.mb.T0(org.telegram.messenger.hd.H(',', "ResellGiftBuy", (int) resellAmount.a()));
                jVar.c = null;
            }
        } else {
            jVar.b = (im0Var.getUserConfig().q() || im0Var.a) ? this.r != null ? this.Q : this.P : this.O;
            jVar.c = null;
        }
        if (im0Var.H0() == this) {
            im0Var.S = this;
            im0Var.R.i((CharSequence) jVar.b, z10, true);
            im0Var.R.g((SpannableStringBuilder) jVar.c, z10);
        }
    }

    public final void g() {
        hi.d dVar = this.q0.R;
        if (dVar != null) {
            dVar.updateColors();
        }
        xl0 xl0Var = this.w;
        if (xl0Var != null) {
            xl0Var.invalidate();
        }
        j(true);
        org.telegram.messenger.g0.d0(this.b, new r3(this, 16));
        hm0 hm0Var = this.F;
        if (hm0Var != null) {
            l(hm0Var);
        }
    }

    public final void h() {
        int i7;
        int i10 = this.q0.f;
        View view = this.x;
        hm0 hm0Var = this.F;
        if (hm0Var == null || (i7 = this.i0) < 0) {
            this.H = false;
            this.I = false;
            if (view != null) {
                view.setTranslationY(0.0f);
            }
            if (hm0Var != null) {
                hm0Var.setVisibility(4);
                boolean z10 = this.H;
                if (hm0Var.J != z10) {
                    hm0Var.J = z10;
                    hm0Var.invalidate();
                    return;
                }
                return;
            }
            return;
        }
        v4.s sVar = this.c;
        this.G = sVar.m(i7);
        tl0 tl0Var = this.b;
        int paddingTop = tl0Var.getPaddingTop() + i10;
        int L0 = sVar.L0();
        View view2 = this.G;
        if (view2 != null) {
            boolean z11 = view2.getTop() <= paddingTop;
            this.I = z11;
            this.H = !z11;
            hm0Var.setVisibility(0);
            hm0Var.setTranslationY((Math.max(this.G.getTop(), paddingTop) + tl0Var.getTop()) - hm0Var.getTop());
        } else if (L0 == -1 || L0 <= this.i0) {
            this.I = false;
            this.H = false;
            hm0Var.setVisibility(0);
            hm0Var.setTranslationY((org.telegram.messenger.g0.L(1.0f) + getHeight()) - hm0Var.getTop());
        } else {
            this.I = true;
            this.H = false;
            hm0Var.setVisibility(0);
            hm0Var.setTranslationY((tl0Var.getTop() + paddingTop) - hm0Var.getTop());
        }
        boolean z12 = this.H;
        if (hm0Var.J != z12) {
            hm0Var.J = z12;
            hm0Var.invalidate();
        }
        view.setTranslationY(this.I ? org.telegram.messenger.g0.L(36.0f) + i10 : 0.0f);
        tl0Var.invalidate();
        invalidate();
    }

    public final void i() {
        org.telegram.messenger.gj messageObject;
        xl0 xl0Var = this.w;
        if (xl0Var != null) {
            org.telegram.ui.Cells.q1[] cells = xl0Var.getCells();
            for (int i7 = 0; i7 < cells.length; i7++) {
                org.telegram.ui.Cells.q1 q1Var = cells[i7];
                if (q1Var != null && (messageObject = q1Var.getMessageObject()) != null) {
                    messageObject.w1 = true;
                    fm0 fm0Var = this.f;
                    if (fm0Var != null) {
                        messageObject.e1 = fm0Var.getColorId();
                    }
                    messageObject.f1 = this.n;
                    messageObject.g1 = this.s;
                    cells[i7].setAvatar(messageObject);
                    cells[i7].invalidate();
                }
            }
        }
    }

    public final void j(boolean z10) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        int i7;
        im0 im0Var;
        nl0 nl0Var;
        int i10;
        fm0 fm0Var = this.f;
        if (fm0Var != null) {
            fm0Var.a(this.h, z10);
        }
        gm0 gm0Var = this.a;
        if (gm0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.r;
            if (tL_emojiStatusCollectible != null) {
                gm0Var.e(tL_emojiStatusCollectible.document_id, true, z10);
                gm0Var.c(org.telegram.messenger.cp.a(this.r), z10);
                gm0Var.d(this.r.pattern_document_id, true, z10);
            } else {
                if (org.telegram.messenger.m5.A()) {
                    gm0Var.e(0L, false, z10);
                } else {
                    TLRPC.User a22 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).a2(0L);
                    gm0Var.e(a22 != null ? org.telegram.messenger.m5.f(a22.emoji_status) : 0L, org.telegram.messenger.m5.A(), z10);
                }
                gm0Var.b(this.h, z10);
                gm0Var.d(this.n, false, z10);
            }
        }
        int i11 = this.n0;
        if (i11 == 0 && (nl0Var = (im0Var = this.q0).e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.r;
            if (tL_emojiStatusCollectible2 != null) {
                nl0Var.c(org.telegram.messenger.cp.a(tL_emojiStatusCollectible2), z10);
            } else {
                i10 = ((org.telegram.ui.ActionBar.e2) im0Var).currentAccount;
                nl0Var.b(i10, this.h, z10);
            }
        }
        if (i11 == 0) {
            int i12 = this.W;
            k();
            vl0 vl0Var = this.d;
            if (i12 >= 0 && this.W < 0) {
                vl0Var.p(i12, 2);
            } else if (i12 < 0 && (i7 = this.W) >= 0) {
                vl0Var.o(i7, 2);
            }
        }
        int i13 = 0;
        while (true) {
            tl0 tl0Var = this.b;
            if (i13 >= tl0Var.getChildCount()) {
                return;
            }
            View childAt = tl0Var.getChildAt(i13);
            if (childAt instanceof rl0) {
                rl0 rl0Var = (rl0) childAt;
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.r;
                rl0Var.b((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == rl0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.s) != null && tL_peerColorCollectible2.collectible_id == rl0Var.getGiftId()), true);
            } else if (childAt instanceof bi.i2) {
                bi.i2 i2Var = (bi.i2) childAt;
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.r;
                i2Var.f((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == i2Var.getGiftId()) || ((tL_peerColorCollectible = this.s) != null && tL_peerColorCollectible.collectible_id == i2Var.getGiftId()), true);
            }
            i13++;
        }
    }

    public final void k() {
        int i7;
        im0 im0Var = this.q0;
        di.m8 m8Var = im0Var.b;
        this.W = -1;
        this.a0 = -1;
        this.b0 = -1;
        this.c0 = -1;
        this.e0 = -1;
        this.f0 = -1;
        this.d0 = -1;
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.k0 = -1;
        this.g0 = 0;
        ArrayList arrayList = this.m0;
        arrayList.clear();
        this.R = 0;
        this.T = 1;
        int i10 = 3;
        this.l0 = 3;
        this.S = 2;
        int i11 = this.n0;
        if (i11 == 0 && (this.h >= 0 || this.r != null || this.s != null)) {
            this.W = 3;
            this.l0 = 5;
            this.a0 = 4;
        }
        di.m8 m8Var2 = i11 == 1 ? im0Var.c : m8Var;
        if ((i11 == 0 || i11 == 1) && m8Var2 != null) {
            ArrayList arrayList2 = m8Var2.l;
            int i12 = this.l0;
            this.l0 = i12 + 1;
            this.i0 = i12;
            if (this.L == null) {
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i13)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i14 = this.l0;
                this.c0 = i14;
                this.l0 = arrayList.size() + i14;
                int size = arrayList.size() + this.g0;
                this.g0 = size;
                int i15 = this.l0;
                this.d0 = i15;
                if (m8Var.i || !m8Var.j) {
                    this.e0 = i15;
                    int i16 = 3 - (size % 3);
                    if (size <= 0) {
                        i10 = 9;
                    } else if (i16 > 0) {
                        i10 = i16;
                    }
                    int i17 = i15 + i10;
                    this.l0 = i17;
                    this.g0 = size + i10;
                    this.f0 = i17;
                } else if (arrayList.isEmpty()) {
                    int i18 = this.l0;
                    this.k0 = i18;
                    this.l0 = i18 + 2;
                    this.j0 = i18 + 1;
                }
                if (c()) {
                    m8Var2.a();
                }
            } else if (this.K != null) {
                i7 = ((org.telegram.ui.ActionBar.e2) im0Var).currentAccount;
                long e10 = org.telegram.messenger.m10.i(i7).e();
                for (int i19 = 0; i19 < this.K.d.size(); i19++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.K.d.get(i19);
                    if (org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id) != e10 && org.telegram.messenger.m5.o(tL_starGiftUnique.host_id) != e10) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i20 = this.l0;
                this.c0 = i20;
                this.l0 = arrayList.size() + i20;
                int size2 = arrayList.size() + this.g0;
                this.g0 = size2;
                int i21 = this.l0;
                this.d0 = i21;
                bi.o5 o5Var = this.K;
                if (o5Var.t || !o5Var.u) {
                    this.e0 = i21;
                    int i22 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i10 = 9;
                    } else if (i22 > 0) {
                        i10 = i22;
                    }
                    int i23 = i21 + i10;
                    this.l0 = i23;
                    this.g0 = size2 + i10;
                    this.f0 = i23;
                }
                if (c()) {
                    this.K.g(false);
                }
            }
            int i24 = this.l0;
            this.l0 = i24 + 1;
            this.h0 = i24;
        }
        int i25 = this.l0;
        this.l0 = i25 + 1;
        this.V = i25;
        hm0 hm0Var = this.F;
        if (hm0Var != null) {
            hm0Var.post(new sl0(this, 1));
        }
    }

    public final void l(hm0 hm0Var) {
        int i7 = org.telegram.ui.ActionBar.j6.d6;
        im0 im0Var = this.q0;
        int themedColor = im0Var.getThemedColor(i7);
        im0Var.getThemedColor(org.telegram.ui.ActionBar.j6.a7);
        int themedColor2 = im0Var.getThemedColor(org.telegram.ui.ActionBar.j6.z6);
        int themedColor3 = im0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6);
        hm0Var.w.setColor(themedColor);
        hm0Var.y = org.telegram.ui.ActionBar.j6.r1(0.06f, themedColor3);
        hm0Var.E = themedColor2;
        hm0Var.F = themedColor3;
        ct ctVar = hm0Var.a;
        for (int i10 = 0; i10 < ctVar.getChildCount(); i10++) {
            View childAt = ctVar.getChildAt(i10);
            int R = RecyclerView.R(childAt);
            if (R != -1 && (childAt instanceof TextView)) {
                ((TextView) childAt).setTextColor(R == hm0Var.d ? hm0Var.F : hm0Var.E);
                childAt.invalidate();
            }
        }
        ctVar.invalidate();
        hm0Var.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11 = this.n0;
        View view = this.x;
        tl0 tl0Var = this.b;
        if (i11 == 1) {
            super.onMeasure(i7, i10);
            xl0 xl0Var = this.w;
            this.o0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + xl0Var.getMeasuredHeight() + org.telegram.messenger.g0.m;
            ((ViewGroup.MarginLayoutParams) xl0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m;
            ((ViewGroup.MarginLayoutParams) tl0Var.getLayoutParams()).topMargin = this.o0 - org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.o0 - org.telegram.messenger.g0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) this.y.getLayoutParams()).topMargin = this.o0 - org.telegram.messenger.g0.L(16.0f);
            tl0Var.setPadding(tl0Var.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), tl0Var.getPaddingRight(), tl0Var.getPaddingBottom());
        } else {
            this.o0 = org.telegram.messenger.g0.L(230.0f) + org.telegram.messenger.g0.m;
            ((ViewGroup.MarginLayoutParams) tl0Var.getLayoutParams()).topMargin = this.o0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.o0 - org.telegram.messenger.g0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).height = this.o0;
        }
        super.onMeasure(i7, i10);
    }
}
