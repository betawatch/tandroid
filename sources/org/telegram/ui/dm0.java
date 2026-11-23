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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class dm0 extends FrameLayout {
    public static final /* synthetic */ int r0 = 0;
    public cm0 E;
    public final im0 F;
    public View G;
    public boolean H;
    public boolean I;
    public TL_stars.TL_starGiftUnique J;
    public bi.a8 K;
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
    public final hm0 a;
    public int a0;
    public final ul0 b;
    public int b0;
    public final v4.t c;
    public int c0;
    public final wl0 d;
    public int d0;
    public final j6.k e;
    public int e0;
    public gm0 f;
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
    public am0 p0;
    public final /* synthetic */ jm0 q0;
    public TLRPC.TL_emojiStatusCollectible r;
    public TLRPC.TL_peerColorCollectible s;
    public final yl0 w;
    public final View x;
    public final View y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public dm0(jm0 jm0Var, Context context, int i7) {
        super(context);
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.ActionBar.i6 i6Var2;
        org.telegram.ui.ActionBar.i6 i6Var3;
        int i10;
        org.telegram.ui.ActionBar.i6 i6Var4;
        this.q0 = jm0Var;
        Object[] objArr = 0;
        this.e = new j6.k(19, false);
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
        org.telegram.ui.ActionBar.i6 resourceProvider = jm0Var.getResourceProvider();
        dh.c cVar = jm0Var.H;
        ul0 ul0Var = new ul0(this, context2, resourceProvider, i7);
        this.b = ul0Var;
        ul0Var.setClipToPadding(false);
        ul0Var.setSections(true);
        ((v4.l) ul0Var.getItemAnimator()).m = false;
        getContext();
        v4.t tVar = new v4.t(3);
        this.c = tVar;
        tVar.O = new bi.y2(this, 15);
        ul0Var.i(new ai.f0(this, 8));
        ul0Var.setLayoutManager(tVar);
        wl0 wl0Var = new wl0(this, context, i7);
        this.d = wl0Var;
        ul0Var.setAdapter(wl0Var);
        ul0Var.setOnItemClickListener(new org.telegram.ui.Components.nl0(this, i7, 1));
        ul0Var.j(new xl0(this, i7));
        addView(ul0Var, c8.na.c(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.kq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        String N0 = org.telegram.messenger.gd.N0(jm0Var.a ? 2131752423 : 2131743508, null);
        this.P = N0;
        this.O = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append((CharSequence) N0);
        this.Q = org.telegram.messenger.gd.N0(2131743507, null);
        f(false);
        v4.l lVar = new v4.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.kr.h);
        lVar.C = false;
        lVar.m = false;
        ul0Var.setItemAnimator(lVar);
        View view = new View(getContext());
        this.x = view;
        dh.d dVar = new dh.d(cVar.c(view, null, false));
        dVar.b(-org.telegram.messenger.g0.L(24.0f), true);
        dVar.H = org.telegram.messenger.ks.x3;
        view.setBackground(dVar);
        addView(view, c8.na.e(-1, 72, 55));
        if (i7 == 0) {
            Context context3 = getContext();
            i10 = ((org.telegram.ui.ActionBar.g2) jm0Var).currentAccount;
            i6Var4 = ((org.telegram.ui.ActionBar.g2) jm0Var).resourceProvider;
            this.a = new hm0(i10, 0L, context3, i6Var4);
            j(false);
        } else {
            View view2 = new View(getContext());
            this.y = view2;
            dh.d dVar2 = new dh.d(cVar.c(view2, null, false));
            dVar2.b(-org.telegram.messenger.g0.L(16.0f), false);
            view2.setBackground(dVar2);
            addView(view2, c8.na.e(-1, 16, 55));
            Context context4 = getContext();
            r4Var = ((org.telegram.ui.ActionBar.g2) jm0Var).parentLayout;
            i6Var = ((org.telegram.ui.ActionBar.g2) jm0Var).resourceProvider;
            yl0 yl0Var = new yl0(context4, r4Var, 3, 0L, i6Var);
            this.w = yl0Var;
            yl0Var.setImportantForAccessibility(4);
            yl0Var.x = jm0Var;
            yl0Var.setClipToOutline(true);
            float L = org.telegram.messenger.g0.L(16.0f);
            bg.q0 q0Var = bg.u0.a;
            yl0Var.setOutlineProvider(new bg.s0(0, L));
            addView(yl0Var, c8.na.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        Context context5 = getContext();
        i6Var2 = ((org.telegram.ui.ActionBar.g2) jm0Var).resourceProvider;
        im0 im0Var = new im0(context5, i6Var2);
        this.F = im0Var;
        fh.g c10 = jm0Var.F.c(im0Var, null, false);
        i6Var3 = ((org.telegram.ui.ActionBar.g2) jm0Var).resourceProvider;
        gh.e eVar = new gh.e(i6Var3);
        eVar.e = new g0.f(20);
        eVar.f(0, 0);
        eVar.e(0, 0);
        eVar.d(0, 0);
        c10.p(eVar);
        c10.r(org.telegram.messenger.g0.L(18.0f));
        c10.R.e = true;
        im0Var.I = c10;
        im0Var.H = c10;
        im0Var.G = new tl0(this, objArr == true ? 1 : 0);
        im0Var.setVisibility(4);
        addView(im0Var, c8.na.d(-1, 36.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        View view3 = this.a;
        if (view3 != null) {
            addView(view3, c8.na.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(dm0 dm0Var) {
        int i7;
        ul0 ul0Var = dm0Var.b;
        boolean z10 = dm0Var.I;
        if (z10) {
            ul0Var.C0();
        }
        dm0Var.e();
        if (!z10 || (i7 = dm0Var.i0) < 0) {
            return;
        }
        dm0Var.c.h1(i7, dm0Var.q0.f);
        ul0Var.post(new tl0(dm0Var, 1));
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
        jm0 jm0Var = this.q0;
        boolean z10 = jm0Var.a;
        int i7 = this.n0;
        long j3 = 0;
        if (z10) {
            TLRPC.Chat O0 = jm0Var.getMessagesController().O0(0L);
            if (O0 != null) {
                if (i7 != 1) {
                    if (this.h == (O0.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? -1 : org.telegram.messenger.v3.I(O0))) {
                        long j10 = this.n;
                        TLRPC.EmojiStatus emojiStatus = O0.emoji_status;
                        if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible)) {
                            TLRPC.PeerColor peerColor = O0.profile_color;
                            if ((peerColor instanceof TLRPC.TL_peerColor) && (peerColor.flags & 2) != 0) {
                                j3 = peerColor.background_emoji_id;
                            }
                        }
                        if (j10 != j3 || !jm0.G0(emojiStatus, this.r)) {
                        }
                    }
                    return true;
                }
                if (this.h == org.telegram.messenger.v3.F(O0) && this.n == org.telegram.messenger.v3.G(O0)) {
                    TLRPC.PeerColor peerColor2 = O0.color;
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = peerColor2 instanceof TLRPC.TL_peerColorCollectible ? (TLRPC.TL_peerColorCollectible) peerColor2 : null;
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible2 = this.s;
                    if (tL_peerColorCollectible != tL_peerColorCollectible2 && ((tL_peerColorCollectible != null || tL_peerColorCollectible2 != null) && (tL_peerColorCollectible == null || tL_peerColorCollectible2 == null || tL_peerColorCollectible.collectible_id != tL_peerColorCollectible2.collectible_id))) {
                    }
                }
                return true;
            }
            return false;
        }
        TLRPC.User f10 = jm0Var.getUserConfig().f();
        if (f10 != null) {
            if (i7 == 1) {
                ?? r12 = this.h == (f10.color instanceof TLRPC.TL_peerColorCollectible ? -1 : org.telegram.messenger.n10.f(f10));
                ?? r22 = this.n == org.telegram.messenger.n10.g(f10);
                TLRPC.PeerColor peerColor3 = f10.color;
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible3 = peerColor3 instanceof TLRPC.TL_peerColorCollectible ? (TLRPC.TL_peerColorCollectible) peerColor3 : null;
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible4 = this.s;
                ?? r02 = tL_peerColorCollectible3 == tL_peerColorCollectible4 || (tL_peerColorCollectible3 == null && tL_peerColorCollectible4 == null) || !(tL_peerColorCollectible3 == null || tL_peerColorCollectible4 == null || tL_peerColorCollectible3.collectible_id != tL_peerColorCollectible4.collectible_id);
                if (r12 == false || r22 == false || r02 == false) {
                    return true;
                }
            } else {
                ?? r13 = this.h == (f10.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? -1 : org.telegram.messenger.n10.m(f10));
                long j11 = this.n;
                TLRPC.EmojiStatus emojiStatus2 = f10.emoji_status;
                if (!(emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible)) {
                    TLRPC.PeerColor peerColor4 = f10.profile_color;
                    if ((peerColor4 instanceof TLRPC.TL_peerColor) && (peerColor4.flags & 2) != 0) {
                        j3 = peerColor4.background_emoji_id;
                    }
                }
                ?? r03 = j11 == j3;
                boolean G0 = jm0.G0(emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible ? (TLRPC.TL_emojiStatusCollectible) emojiStatus2 : null, this.r);
                if (r13 == false || r03 == false || !G0) {
                }
            }
        }
        return false;
    }

    public final boolean c() {
        ul0 ul0Var = this.b;
        if (ul0Var != null) {
            for (int i7 = 0; i7 < ul0Var.getChildCount(); i7++) {
                if (ul0Var.getChildAt(i7) instanceof org.telegram.ui.Components.vz) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i7 = this.n0;
        jm0 jm0Var = this.q0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i7 == 0) {
            TLRPC.User f10 = jm0Var.getUserConfig().f();
            this.h = org.telegram.messenger.n10.m(f10);
            this.n = org.telegram.messenger.n10.n(f10);
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
            TLRPC.User f11 = jm0Var.getUserConfig().f();
            this.h = org.telegram.messenger.n10.f(f11);
            this.n = org.telegram.messenger.n10.g(f11);
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
        jm0 jm0Var = this.q0;
        j6.k kVar = this.e;
        if (tL_starGiftUnique != null) {
            cg.a resellAmount = tL_starGiftUnique.getResellAmount(cg.b.a);
            if (tL_starGiftUnique.resale_ton_only) {
                kVar.b = di.pb.t1(di.pb.V0(org.telegram.messenger.gd.a0(null, null, 2131745950, tL_starGiftUnique.getResellAmount(cg.b.b).d()), true), true);
                kVar.c = di.pb.T0(org.telegram.messenger.gd.H(',', "ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                kVar.b = di.pb.T0(org.telegram.messenger.gd.H(',', "ResellGiftBuy", (int) resellAmount.a()));
                kVar.c = null;
            }
        } else {
            kVar.b = (jm0Var.getUserConfig().q() || jm0Var.a) ? this.r != null ? this.Q : this.P : this.O;
            kVar.c = null;
        }
        if (jm0Var.H0() == this) {
            jm0Var.S = this;
            jm0Var.R.i((CharSequence) kVar.b, z10, true);
            jm0Var.R.g((SpannableStringBuilder) kVar.c, z10);
        }
    }

    public final void g() {
        hi.e eVar = this.q0.R;
        if (eVar != null) {
            eVar.updateColors();
        }
        yl0 yl0Var = this.w;
        if (yl0Var != null) {
            yl0Var.invalidate();
        }
        j(true);
        org.telegram.messenger.g0.d0(this.b, new r3(this, 17));
        im0 im0Var = this.F;
        if (im0Var != null) {
            l(im0Var);
        }
    }

    public final void h() {
        int i7;
        int i10 = this.q0.f;
        View view = this.x;
        im0 im0Var = this.F;
        if (im0Var == null || (i7 = this.i0) < 0) {
            this.H = false;
            this.I = false;
            if (view != null) {
                view.setTranslationY(0.0f);
            }
            if (im0Var != null) {
                im0Var.setVisibility(4);
                boolean z10 = this.H;
                if (im0Var.J != z10) {
                    im0Var.J = z10;
                    im0Var.invalidate();
                    return;
                }
                return;
            }
            return;
        }
        v4.t tVar = this.c;
        this.G = tVar.m(i7);
        ul0 ul0Var = this.b;
        int paddingTop = ul0Var.getPaddingTop() + i10;
        int L0 = tVar.L0();
        View view2 = this.G;
        if (view2 != null) {
            boolean z11 = view2.getTop() <= paddingTop;
            this.I = z11;
            this.H = !z11;
            im0Var.setVisibility(0);
            im0Var.setTranslationY((Math.max(this.G.getTop(), paddingTop) + ul0Var.getTop()) - im0Var.getTop());
        } else if (L0 == -1 || L0 <= this.i0) {
            this.I = false;
            this.H = false;
            im0Var.setVisibility(0);
            im0Var.setTranslationY((org.telegram.messenger.g0.L(1.0f) + getHeight()) - im0Var.getTop());
        } else {
            this.I = true;
            this.H = false;
            im0Var.setVisibility(0);
            im0Var.setTranslationY((ul0Var.getTop() + paddingTop) - im0Var.getTop());
        }
        boolean z12 = this.H;
        if (im0Var.J != z12) {
            im0Var.J = z12;
            im0Var.invalidate();
        }
        view.setTranslationY(this.I ? org.telegram.messenger.g0.L(36.0f) + i10 : 0.0f);
        ul0Var.invalidate();
        invalidate();
    }

    public final void i() {
        org.telegram.messenger.fj messageObject;
        yl0 yl0Var = this.w;
        if (yl0Var != null) {
            org.telegram.ui.Cells.r1[] cells = yl0Var.getCells();
            for (int i7 = 0; i7 < cells.length; i7++) {
                org.telegram.ui.Cells.r1 r1Var = cells[i7];
                if (r1Var != null && (messageObject = r1Var.getMessageObject()) != null) {
                    messageObject.w1 = true;
                    gm0 gm0Var = this.f;
                    if (gm0Var != null) {
                        messageObject.e1 = gm0Var.getColorId();
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
        jm0 jm0Var;
        ol0 ol0Var;
        int i10;
        gm0 gm0Var = this.f;
        if (gm0Var != null) {
            gm0Var.a(this.h, z10);
        }
        hm0 hm0Var = this.a;
        if (hm0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.r;
            if (tL_emojiStatusCollectible != null) {
                hm0Var.e(tL_emojiStatusCollectible.document_id, true, z10);
                hm0Var.c(org.telegram.messenger.bp.a(this.r), z10);
                hm0Var.d(this.r.pattern_document_id, true, z10);
            } else {
                if (org.telegram.messenger.n5.A()) {
                    hm0Var.e(0L, false, z10);
                } else {
                    TLRPC.User c22 = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.t0).c2(0L);
                    hm0Var.e(c22 != null ? org.telegram.messenger.n5.f(c22.emoji_status) : 0L, org.telegram.messenger.n5.A(), z10);
                }
                hm0Var.b(this.h, z10);
                hm0Var.d(this.n, false, z10);
            }
        }
        int i11 = this.n0;
        if (i11 == 0 && (ol0Var = (jm0Var = this.q0).e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.r;
            if (tL_emojiStatusCollectible2 != null) {
                ol0Var.c(org.telegram.messenger.bp.a(tL_emojiStatusCollectible2), z10);
            } else {
                i10 = ((org.telegram.ui.ActionBar.g2) jm0Var).currentAccount;
                ol0Var.b(i10, this.h, z10);
            }
        }
        if (i11 == 0) {
            int i12 = this.W;
            k();
            wl0 wl0Var = this.d;
            if (i12 >= 0 && this.W < 0) {
                wl0Var.p(i12, 2);
            } else if (i12 < 0 && (i7 = this.W) >= 0) {
                wl0Var.o(i7, 2);
            }
        }
        int i13 = 0;
        while (true) {
            ul0 ul0Var = this.b;
            if (i13 >= ul0Var.getChildCount()) {
                return;
            }
            View childAt = ul0Var.getChildAt(i13);
            if (childAt instanceof sl0) {
                sl0 sl0Var = (sl0) childAt;
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.r;
                sl0Var.b((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == sl0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.s) != null && tL_peerColorCollectible2.collectible_id == sl0Var.getGiftId()), true);
            } else if (childAt instanceof bi.i3) {
                bi.i3 i3Var = (bi.i3) childAt;
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.r;
                i3Var.f((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == i3Var.getGiftId()) || ((tL_peerColorCollectible = this.s) != null && tL_peerColorCollectible.collectible_id == i3Var.getGiftId()), true);
            }
            i13++;
        }
    }

    public final void k() {
        int i7;
        jm0 jm0Var = this.q0;
        di.p8 p8Var = jm0Var.b;
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
        di.p8 p8Var2 = i11 == 1 ? jm0Var.c : p8Var;
        if ((i11 == 0 || i11 == 1) && p8Var2 != null) {
            ArrayList arrayList2 = p8Var2.l;
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
                if (p8Var.i || !p8Var.j) {
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
                    p8Var2.a();
                }
            } else if (this.K != null) {
                i7 = ((org.telegram.ui.ActionBar.g2) jm0Var).currentAccount;
                long e10 = org.telegram.messenger.i10.i(i7).e();
                for (int i19 = 0; i19 < this.K.d.size(); i19++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.K.d.get(i19);
                    if (org.telegram.messenger.n5.o(tL_starGiftUnique.owner_id) != e10 && org.telegram.messenger.n5.o(tL_starGiftUnique.host_id) != e10) {
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
                bi.a8 a8Var = this.K;
                if (a8Var.y || !a8Var.z) {
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
                    this.K.l(false);
                }
            }
            int i24 = this.l0;
            this.l0 = i24 + 1;
            this.h0 = i24;
        }
        int i25 = this.l0;
        this.l0 = i25 + 1;
        this.V = i25;
        im0 im0Var = this.F;
        if (im0Var != null) {
            im0Var.post(new tl0(this, 1));
        }
    }

    public final void l(im0 im0Var) {
        int i7 = org.telegram.ui.ActionBar.n6.d6;
        jm0 jm0Var = this.q0;
        int themedColor = jm0Var.getThemedColor(i7);
        jm0Var.getThemedColor(org.telegram.ui.ActionBar.n6.a7);
        int themedColor2 = jm0Var.getThemedColor(org.telegram.ui.ActionBar.n6.z6);
        int themedColor3 = jm0Var.getThemedColor(org.telegram.ui.ActionBar.n6.G6);
        im0Var.w.setColor(themedColor);
        im0Var.y = org.telegram.ui.ActionBar.n6.r1(0.06f, themedColor3);
        im0Var.E = themedColor2;
        im0Var.F = themedColor3;
        dt dtVar = im0Var.a;
        for (int i10 = 0; i10 < dtVar.getChildCount(); i10++) {
            View childAt = dtVar.getChildAt(i10);
            int R = RecyclerView.R(childAt);
            if (R != -1 && (childAt instanceof TextView)) {
                ((TextView) childAt).setTextColor(R == im0Var.d ? im0Var.F : im0Var.E);
                childAt.invalidate();
            }
        }
        dtVar.invalidate();
        im0Var.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11 = this.n0;
        View view = this.x;
        ul0 ul0Var = this.b;
        if (i11 == 1) {
            super.onMeasure(i7, i10);
            yl0 yl0Var = this.w;
            this.o0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + yl0Var.getMeasuredHeight() + org.telegram.messenger.g0.m;
            ((ViewGroup.MarginLayoutParams) yl0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m;
            ((ViewGroup.MarginLayoutParams) ul0Var.getLayoutParams()).topMargin = this.o0 - org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.o0 - org.telegram.messenger.g0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) this.y.getLayoutParams()).topMargin = this.o0 - org.telegram.messenger.g0.L(16.0f);
            ul0Var.setPadding(ul0Var.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), ul0Var.getPaddingRight(), ul0Var.getPaddingBottom());
        } else {
            this.o0 = org.telegram.messenger.g0.L(230.0f) + org.telegram.messenger.g0.m;
            ((ViewGroup.MarginLayoutParams) ul0Var.getLayoutParams()).topMargin = this.o0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.o0 - org.telegram.messenger.g0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).height = this.o0;
        }
        super.onMeasure(i7, i10);
    }
}
