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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class fm0 extends FrameLayout {
    public static final /* synthetic */ int r0 = 0;
    public em0 E;
    public final km0 F;
    public View G;
    public boolean H;
    public boolean I;
    public TL_stars.TL_starGiftUnique J;
    public bi.x7 K;
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
    public final jm0 a;
    public int a0;
    public final wl0 b;
    public int b0;
    public final v4.t c;
    public int c0;
    public final yl0 d;
    public int d0;
    public final ji.l e;
    public int e0;
    public im0 f;
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
    public cm0 p0;
    public final /* synthetic */ lm0 q0;
    public TLRPC.TL_emojiStatusCollectible r;
    public TLRPC.TL_peerColorCollectible s;
    public final am0 w;
    public final View x;
    public final View y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public fm0(lm0 lm0Var, Context context, int i7) {
        super(context);
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.h6 h6Var;
        org.telegram.ui.ActionBar.h6 h6Var2;
        org.telegram.ui.ActionBar.h6 h6Var3;
        int i10;
        org.telegram.ui.ActionBar.h6 h6Var4;
        this.q0 = lm0Var;
        Object[] objArr = 0;
        this.e = new ji.l(18, false);
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
        org.telegram.ui.ActionBar.h6 resourceProvider = lm0Var.getResourceProvider();
        dh.c cVar = lm0Var.H;
        wl0 wl0Var = new wl0(this, context2, resourceProvider, i7);
        this.b = wl0Var;
        wl0Var.setClipToPadding(false);
        wl0Var.setSections(true);
        ((v4.k) wl0Var.getItemAnimator()).m = false;
        getContext();
        v4.t tVar = new v4.t(3);
        this.c = tVar;
        tVar.O = new bi.w2(this, 15);
        wl0Var.i(new ai.j0(this, 8));
        wl0Var.setLayoutManager(tVar);
        yl0 yl0Var = new yl0(this, context, i7);
        this.d = yl0Var;
        wl0Var.setAdapter(yl0Var);
        wl0Var.setOnItemClickListener(new org.telegram.ui.Components.nl0(this, i7, 1));
        wl0Var.j(new zl0(this, i7));
        addView(wl0Var, c8.ma.c(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.nq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        String N0 = org.telegram.messenger.hd.N0(lm0Var.a ? 2131752423 : 2131743510, null);
        this.P = N0;
        this.O = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append((CharSequence) N0);
        this.Q = org.telegram.messenger.hd.N0(2131743509, null);
        f(false);
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.nr.h);
        kVar.C = false;
        kVar.m = false;
        wl0Var.setItemAnimator(kVar);
        View view = new View(getContext());
        this.x = view;
        dh.d dVar = new dh.d(cVar.c(view, null, false));
        dVar.b(-org.telegram.messenger.g0.L(24.0f), true);
        dVar.H = org.telegram.messenger.ls.x3;
        view.setBackground(dVar);
        addView(view, c8.ma.e(-1, 72, 55));
        if (i7 == 0) {
            Context context3 = getContext();
            i10 = ((org.telegram.ui.ActionBar.g2) lm0Var).currentAccount;
            h6Var4 = ((org.telegram.ui.ActionBar.g2) lm0Var).resourceProvider;
            this.a = new jm0(i10, 0L, context3, h6Var4);
            j(false);
        } else {
            View view2 = new View(getContext());
            this.y = view2;
            dh.d dVar2 = new dh.d(cVar.c(view2, null, false));
            dVar2.b(-org.telegram.messenger.g0.L(16.0f), false);
            view2.setBackground(dVar2);
            addView(view2, c8.ma.e(-1, 16, 55));
            Context context4 = getContext();
            r4Var = ((org.telegram.ui.ActionBar.g2) lm0Var).parentLayout;
            h6Var = ((org.telegram.ui.ActionBar.g2) lm0Var).resourceProvider;
            am0 am0Var = new am0(context4, r4Var, 3, 0L, h6Var);
            this.w = am0Var;
            am0Var.setImportantForAccessibility(4);
            am0Var.x = lm0Var;
            am0Var.setClipToOutline(true);
            float L = org.telegram.messenger.g0.L(16.0f);
            bg.q0 q0Var = bg.u0.a;
            am0Var.setOutlineProvider(new bg.s0(0, L));
            addView(am0Var, c8.ma.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        Context context5 = getContext();
        h6Var2 = ((org.telegram.ui.ActionBar.g2) lm0Var).resourceProvider;
        km0 km0Var = new km0(context5, h6Var2);
        this.F = km0Var;
        fh.g c10 = lm0Var.F.c(km0Var, null, false);
        h6Var3 = ((org.telegram.ui.ActionBar.g2) lm0Var).resourceProvider;
        gh.e eVar = new gh.e(h6Var3);
        eVar.e = new g0.e(20);
        eVar.f(0, 0);
        eVar.e(0, 0);
        eVar.d(0, 0);
        c10.p(eVar);
        c10.r(org.telegram.messenger.g0.L(18.0f));
        c10.R.e = true;
        km0Var.I = c10;
        km0Var.H = c10;
        km0Var.G = new vl0(this, objArr == true ? 1 : 0);
        km0Var.setVisibility(4);
        addView(km0Var, c8.ma.d(-1, 36.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        View view3 = this.a;
        if (view3 != null) {
            addView(view3, c8.ma.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(fm0 fm0Var) {
        int i7;
        wl0 wl0Var = fm0Var.b;
        boolean z10 = fm0Var.I;
        if (z10) {
            wl0Var.C0();
        }
        fm0Var.e();
        if (!z10 || (i7 = fm0Var.i0) < 0) {
            return;
        }
        fm0Var.c.h1(i7, fm0Var.q0.f);
        wl0Var.post(new vl0(fm0Var, 1));
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
        lm0 lm0Var = this.q0;
        boolean z10 = lm0Var.a;
        int i7 = this.n0;
        long j3 = 0;
        if (z10) {
            TLRPC.Chat O0 = lm0Var.getMessagesController().O0(0L);
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
                        if (j10 != j3 || !lm0.G0(emojiStatus, this.r)) {
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
        TLRPC.User f10 = lm0Var.getUserConfig().f();
        if (f10 != null) {
            if (i7 == 1) {
                ?? r12 = this.h == (f10.color instanceof TLRPC.TL_peerColorCollectible ? -1 : org.telegram.messenger.p10.f(f10));
                ?? r22 = this.n == org.telegram.messenger.p10.g(f10);
                TLRPC.PeerColor peerColor3 = f10.color;
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible3 = peerColor3 instanceof TLRPC.TL_peerColorCollectible ? (TLRPC.TL_peerColorCollectible) peerColor3 : null;
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible4 = this.s;
                ?? r02 = tL_peerColorCollectible3 == tL_peerColorCollectible4 || (tL_peerColorCollectible3 == null && tL_peerColorCollectible4 == null) || !(tL_peerColorCollectible3 == null || tL_peerColorCollectible4 == null || tL_peerColorCollectible3.collectible_id != tL_peerColorCollectible4.collectible_id);
                if (r12 == false || r22 == false || r02 == false) {
                    return true;
                }
            } else {
                ?? r13 = this.h == (f10.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? -1 : org.telegram.messenger.p10.m(f10));
                long j11 = this.n;
                TLRPC.EmojiStatus emojiStatus2 = f10.emoji_status;
                if (!(emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible)) {
                    TLRPC.PeerColor peerColor4 = f10.profile_color;
                    if ((peerColor4 instanceof TLRPC.TL_peerColor) && (peerColor4.flags & 2) != 0) {
                        j3 = peerColor4.background_emoji_id;
                    }
                }
                ?? r03 = j11 == j3;
                boolean G0 = lm0.G0(emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible ? (TLRPC.TL_emojiStatusCollectible) emojiStatus2 : null, this.r);
                if (r13 == false || r03 == false || !G0) {
                }
            }
        }
        return false;
    }

    public final boolean c() {
        wl0 wl0Var = this.b;
        if (wl0Var != null) {
            for (int i7 = 0; i7 < wl0Var.getChildCount(); i7++) {
                if (wl0Var.getChildAt(i7) instanceof org.telegram.ui.Components.yz) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i7 = this.n0;
        lm0 lm0Var = this.q0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i7 == 0) {
            TLRPC.User f10 = lm0Var.getUserConfig().f();
            this.h = org.telegram.messenger.p10.m(f10);
            this.n = org.telegram.messenger.p10.n(f10);
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
            TLRPC.User f11 = lm0Var.getUserConfig().f();
            this.h = org.telegram.messenger.p10.f(f11);
            this.n = org.telegram.messenger.p10.g(f11);
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
        lm0 lm0Var = this.q0;
        ji.l lVar = this.e;
        if (tL_starGiftUnique != null) {
            cg.a resellAmount = tL_starGiftUnique.getResellAmount(cg.b.a);
            if (tL_starGiftUnique.resale_ton_only) {
                lVar.b = di.pb.t1(di.pb.V0(org.telegram.messenger.hd.a0(null, null, 2131745950, tL_starGiftUnique.getResellAmount(cg.b.b).d()), true), true);
                lVar.c = di.pb.T0(org.telegram.messenger.hd.H(',', "ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                lVar.b = di.pb.T0(org.telegram.messenger.hd.H(',', "ResellGiftBuy", (int) resellAmount.a()));
                lVar.c = null;
            }
        } else {
            lVar.b = (lm0Var.getUserConfig().q() || lm0Var.a) ? this.r != null ? this.Q : this.P : this.O;
            lVar.c = null;
        }
        if (lm0Var.H0() == this) {
            lm0Var.S = this;
            lm0Var.R.i((CharSequence) lVar.b, z10, true);
            lm0Var.R.g((SpannableStringBuilder) lVar.c, z10);
        }
    }

    public final void g() {
        hi.e eVar = this.q0.R;
        if (eVar != null) {
            eVar.updateColors();
        }
        am0 am0Var = this.w;
        if (am0Var != null) {
            am0Var.invalidate();
        }
        j(true);
        org.telegram.messenger.g0.d0(this.b, new r3(this, 17));
        km0 km0Var = this.F;
        if (km0Var != null) {
            l(km0Var);
        }
    }

    public final void h() {
        int i7;
        int i10 = this.q0.f;
        View view = this.x;
        km0 km0Var = this.F;
        if (km0Var == null || (i7 = this.i0) < 0) {
            this.H = false;
            this.I = false;
            if (view != null) {
                view.setTranslationY(0.0f);
            }
            if (km0Var != null) {
                km0Var.setVisibility(4);
                boolean z10 = this.H;
                if (km0Var.J != z10) {
                    km0Var.J = z10;
                    km0Var.invalidate();
                    return;
                }
                return;
            }
            return;
        }
        v4.t tVar = this.c;
        this.G = tVar.m(i7);
        wl0 wl0Var = this.b;
        int paddingTop = wl0Var.getPaddingTop() + i10;
        int L0 = tVar.L0();
        View view2 = this.G;
        if (view2 != null) {
            boolean z11 = view2.getTop() <= paddingTop;
            this.I = z11;
            this.H = !z11;
            km0Var.setVisibility(0);
            km0Var.setTranslationY((Math.max(this.G.getTop(), paddingTop) + wl0Var.getTop()) - km0Var.getTop());
        } else if (L0 == -1 || L0 <= this.i0) {
            this.I = false;
            this.H = false;
            km0Var.setVisibility(0);
            km0Var.setTranslationY((org.telegram.messenger.g0.L(1.0f) + getHeight()) - km0Var.getTop());
        } else {
            this.I = true;
            this.H = false;
            km0Var.setVisibility(0);
            km0Var.setTranslationY((wl0Var.getTop() + paddingTop) - km0Var.getTop());
        }
        boolean z12 = this.H;
        if (km0Var.J != z12) {
            km0Var.J = z12;
            km0Var.invalidate();
        }
        view.setTranslationY(this.I ? org.telegram.messenger.g0.L(36.0f) + i10 : 0.0f);
        wl0Var.invalidate();
        invalidate();
    }

    public final void i() {
        org.telegram.messenger.gj messageObject;
        am0 am0Var = this.w;
        if (am0Var != null) {
            org.telegram.ui.Cells.r1[] cells = am0Var.getCells();
            for (int i7 = 0; i7 < cells.length; i7++) {
                org.telegram.ui.Cells.r1 r1Var = cells[i7];
                if (r1Var != null && (messageObject = r1Var.getMessageObject()) != null) {
                    messageObject.w1 = true;
                    im0 im0Var = this.f;
                    if (im0Var != null) {
                        messageObject.e1 = im0Var.getColorId();
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
        lm0 lm0Var;
        ql0 ql0Var;
        int i10;
        im0 im0Var = this.f;
        if (im0Var != null) {
            im0Var.a(this.h, z10);
        }
        jm0 jm0Var = this.a;
        if (jm0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.r;
            if (tL_emojiStatusCollectible != null) {
                jm0Var.e(tL_emojiStatusCollectible.document_id, true, z10);
                jm0Var.c(org.telegram.messenger.cp.a(this.r), z10);
                jm0Var.d(this.r.pattern_document_id, true, z10);
            } else {
                if (org.telegram.messenger.n5.A()) {
                    jm0Var.e(0L, false, z10);
                } else {
                    TLRPC.User c22 = org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).c2(0L);
                    jm0Var.e(c22 != null ? org.telegram.messenger.n5.f(c22.emoji_status) : 0L, org.telegram.messenger.n5.A(), z10);
                }
                jm0Var.b(this.h, z10);
                jm0Var.d(this.n, false, z10);
            }
        }
        int i11 = this.n0;
        if (i11 == 0 && (ql0Var = (lm0Var = this.q0).e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.r;
            if (tL_emojiStatusCollectible2 != null) {
                ql0Var.c(org.telegram.messenger.cp.a(tL_emojiStatusCollectible2), z10);
            } else {
                i10 = ((org.telegram.ui.ActionBar.g2) lm0Var).currentAccount;
                ql0Var.b(i10, this.h, z10);
            }
        }
        if (i11 == 0) {
            int i12 = this.W;
            k();
            yl0 yl0Var = this.d;
            if (i12 >= 0 && this.W < 0) {
                yl0Var.p(i12, 2);
            } else if (i12 < 0 && (i7 = this.W) >= 0) {
                yl0Var.o(i7, 2);
            }
        }
        int i13 = 0;
        while (true) {
            wl0 wl0Var = this.b;
            if (i13 >= wl0Var.getChildCount()) {
                return;
            }
            View childAt = wl0Var.getChildAt(i13);
            if (childAt instanceof ul0) {
                ul0 ul0Var = (ul0) childAt;
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.r;
                ul0Var.b((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == ul0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.s) != null && tL_peerColorCollectible2.collectible_id == ul0Var.getGiftId()), true);
            } else if (childAt instanceof bi.g3) {
                bi.g3 g3Var = (bi.g3) childAt;
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.r;
                g3Var.f((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == g3Var.getGiftId()) || ((tL_peerColorCollectible = this.s) != null && tL_peerColorCollectible.collectible_id == g3Var.getGiftId()), true);
            }
            i13++;
        }
    }

    public final void k() {
        int i7;
        lm0 lm0Var = this.q0;
        di.p8 p8Var = lm0Var.b;
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
        di.p8 p8Var2 = i11 == 1 ? lm0Var.c : p8Var;
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
                i7 = ((org.telegram.ui.ActionBar.g2) lm0Var).currentAccount;
                long e10 = org.telegram.messenger.k10.i(i7).e();
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
                bi.x7 x7Var = this.K;
                if (x7Var.y || !x7Var.z) {
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
        km0 km0Var = this.F;
        if (km0Var != null) {
            km0Var.post(new vl0(this, 1));
        }
    }

    public final void l(km0 km0Var) {
        int i7 = org.telegram.ui.ActionBar.m6.d6;
        lm0 lm0Var = this.q0;
        int themedColor = lm0Var.getThemedColor(i7);
        lm0Var.getThemedColor(org.telegram.ui.ActionBar.m6.a7);
        int themedColor2 = lm0Var.getThemedColor(org.telegram.ui.ActionBar.m6.z6);
        int themedColor3 = lm0Var.getThemedColor(org.telegram.ui.ActionBar.m6.G6);
        km0Var.w.setColor(themedColor);
        km0Var.y = org.telegram.ui.ActionBar.m6.r1(0.06f, themedColor3);
        km0Var.E = themedColor2;
        km0Var.F = themedColor3;
        et etVar = km0Var.a;
        for (int i10 = 0; i10 < etVar.getChildCount(); i10++) {
            View childAt = etVar.getChildAt(i10);
            int R = RecyclerView.R(childAt);
            if (R != -1 && (childAt instanceof TextView)) {
                ((TextView) childAt).setTextColor(R == km0Var.d ? km0Var.F : km0Var.E);
                childAt.invalidate();
            }
        }
        etVar.invalidate();
        km0Var.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11 = this.n0;
        View view = this.x;
        wl0 wl0Var = this.b;
        if (i11 == 1) {
            super.onMeasure(i7, i10);
            am0 am0Var = this.w;
            this.o0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + am0Var.getMeasuredHeight() + org.telegram.messenger.g0.m;
            ((ViewGroup.MarginLayoutParams) am0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m;
            ((ViewGroup.MarginLayoutParams) wl0Var.getLayoutParams()).topMargin = this.o0 - org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.o0 - org.telegram.messenger.g0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) this.y.getLayoutParams()).topMargin = this.o0 - org.telegram.messenger.g0.L(16.0f);
            wl0Var.setPadding(wl0Var.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), wl0Var.getPaddingRight(), wl0Var.getPaddingBottom());
        } else {
            this.o0 = org.telegram.messenger.g0.L(230.0f) + org.telegram.messenger.g0.m;
            ((ViewGroup.MarginLayoutParams) wl0Var.getLayoutParams()).topMargin = this.o0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.o0 - org.telegram.messenger.g0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).height = this.o0;
        }
        super.onMeasure(i7, i10);
    }
}
