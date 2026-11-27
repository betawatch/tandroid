// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
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
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class a48 extends FrameLayout {
    public static final /* synthetic */ int r0 = 0;
    public z38 E;
    public final g48 F;
    public View G;
    public boolean H;
    public boolean I;
    public TL_stars.TL_starGiftUnique J;
    public ed9 K;
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
    public final f48 a;
    public int a0;
    public final p38 b;
    public int b0;
    public final u55 c;
    public int c0;
    public final s38 d;
    public int d0;
    public final ym4 e;
    public int e0;
    public d48 f;
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
    public final boolean n0;
    public int o0;
    public w38 p0;
    public final /* synthetic */ h48 q0;
    public TLRPC.TL_emojiStatusCollectible r;
    public TLRPC.TL_peerColorCollectible s;
    public final u38 w;
    public final View x;
    public final View y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a48(h48 h48Var, Context context, final int i) {
        super(context);
        wk5 wk5Var;
        vnb vnbVar;
        vnb vnbVar2;
        vnb vnbVar3;
        int i2;
        vnb vnbVar4;
        this.q0 = h48Var;
        Object[] objArr = 0;
        this.e = new ym4((byte) 13, false);
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
        this.n0 = i;
        c();
        Context context2 = getContext();
        vnb resourceProvider = h48Var.getResourceProvider();
        ll0 ll0Var = h48Var.H;
        p38 p38Var = new p38(this, context2, resourceProvider, i);
        this.b = p38Var;
        p38Var.setClipToPadding(false);
        p38Var.setSections(true);
        ((zb3) p38Var.getItemAnimator()).m = false;
        getContext();
        u55 u55Var = new u55(3);
        this.c = u55Var;
        u55Var.O = new ar1(this, (byte) 11);
        p38Var.i(new lr(this, (byte) 8));
        p38Var.setLayoutManager(u55Var);
        s38 s38Var = new s38(this, context, i);
        this.d = s38Var;
        p38Var.setAdapter(s38Var);
        p38Var.setOnItemClickListener(new r69() { // from class: n38
            @Override // r69
            public final void e(int i3, View view) {
                f48 f48Var;
                a48 a48Var;
                int i4;
                int i5;
                a48 a48Var2 = a48.this;
                h48 h48Var2 = a48Var2.q0;
                ArrayList arrayList = a48Var2.m0;
                if (view instanceof z38) {
                    z38 z38Var = (z38) view;
                    boolean z = a48Var2.n0;
                    if (a48Var2.p0 == null) {
                        ul ulVar = z38Var.c;
                        d1a[] d1aVarArr = new d1a[1];
                        float L = hl.L(330.0f);
                        Point point = hl.q;
                        int min = (int) Math.min(L, point.y * 0.75f);
                        int min2 = (int) Math.min(hl.L(324.0f), point.x * 0.95f);
                        if (ulVar != null) {
                            ulVar.f();
                            z38Var.c();
                            Rect rect = hl.Q;
                            rect.set(ulVar.getBounds());
                            i5 = z ? (hl.L(12.0f) + (-rect.centerY())) - min : (-(z38Var.getHeight() - rect.centerY())) - hl.L(16.0f);
                            i4 = hl.L(12.0f) + (rect.centerX() - (point.x - min2));
                        } else {
                            i4 = 0;
                            i5 = 0;
                        }
                        int i6 = i5;
                        v38 v38Var = new v38(a48Var2, h48Var2, a48Var2.getContext(), Integer.valueOf(i4), z ? 5 : 7, h48Var2.getResourceProvider(), z ? 24 : 16, z38Var.a(), z38Var, d1aVarArr);
                        v38Var.h1 = true;
                        long j = a48Var2.n;
                        v38Var.setSelected(j == 0 ? null : Long.valueOf(j));
                        v38Var.setSaveState(3);
                        v38Var.y(ulVar, z38Var);
                        w38 w38Var = new w38(a48Var2, v38Var);
                        a48Var2.p0 = w38Var;
                        d1aVarArr[0] = w38Var;
                        w38Var.showAsDropDown(z38Var, 0, i6, (ob6.a0 ? 3 : 5) | 48);
                        d1aVarArr[0].a();
                        return;
                    }
                    return;
                }
                int i7 = a48Var2.W;
                boolean z2 = i;
                if (i3 == i7) {
                    a48Var2.h = -1;
                    a48Var2.n = 0L;
                    a48Var2.r = null;
                    a48Var2.s = null;
                    a48Var2.J = null;
                    a48Var2.i();
                    if (!z2) {
                        h48Var2.h.i();
                    }
                    z38 z38Var2 = a48Var2.E;
                    if (z38Var2 != null) {
                        z38Var2.b(true);
                    }
                    a48Var2.j(true);
                    a48Var2.f(true);
                    a48 a48Var3 = h48Var2.n;
                    if (a48Var3 == null || (f48Var = a48Var3.a) == null || (a48Var = h48Var2.h) == null) {
                        return;
                    }
                    f48Var.a(a48Var.h);
                    return;
                }
                int i8 = a48Var2.c0;
                if (i3 < i8 || i3 >= a48Var2.d0) {
                    return;
                }
                int i9 = i3 - i8;
                if (a48Var2.L == null) {
                    if (i9 < 0 || i9 >= arrayList.size()) {
                        return;
                    }
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i9);
                    if (z2) {
                        TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                        if (!(peerColor instanceof TLRPC.TL_peerColorCollectible)) {
                            return;
                        }
                        a48Var2.n = 0L;
                        a48Var2.h = -1;
                        a48Var2.J = null;
                        a48Var2.r = null;
                        a48Var2.s = (TLRPC.TL_peerColorCollectible) peerColor;
                    } else {
                        a48Var2.n = 0L;
                        a48Var2.h = -1;
                        a48Var2.J = null;
                        a48Var2.r = uc7.p0(tL_starGiftUnique);
                        a48Var2.s = null;
                    }
                    a48Var2.j(true);
                    a48Var2.i();
                    a48Var2.f(true);
                    z38 z38Var3 = a48Var2.E;
                    if (z38Var3 != null) {
                        z38Var3.b(true);
                        return;
                    }
                    return;
                }
                if (a48Var2.K == null || i9 < 0 || i9 >= arrayList.size()) {
                    return;
                }
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i9);
                if (z2) {
                    TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                    if (!(peerColor2 instanceof TLRPC.TL_peerColorCollectible)) {
                        return;
                    }
                    a48Var2.n = 0L;
                    a48Var2.h = -1;
                    a48Var2.r = null;
                    a48Var2.s = (TLRPC.TL_peerColorCollectible) peerColor2;
                } else {
                    a48Var2.n = 0L;
                    a48Var2.h = -1;
                    a48Var2.r = uc7.p0(tL_starGiftUnique2);
                    a48Var2.s = null;
                }
                a48Var2.J = tL_starGiftUnique2;
                a48Var2.j(true);
                a48Var2.i();
                a48Var2.f(true);
                z38 z38Var4 = a48Var2.E;
                if (z38Var4 != null) {
                    z38Var4.b(true);
                }
            }
        });
        p38Var.j(new t38(this, i));
        addView(p38Var, tre.c(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new wm2(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        String M0 = ob6.M0(h48Var.a ? 2131752409 : 2131743410, null);
        this.P = M0;
        this.O = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append((CharSequence) M0);
        this.Q = ob6.M0(2131743409, null);
        f(false);
        zb3 zb3Var = new zb3();
        zb3Var.n(350L);
        zb3Var.o(k43.h);
        zb3Var.C = false;
        zb3Var.m = false;
        p38Var.setItemAnimator(zb3Var);
        View view = new View(getContext());
        this.x = view;
        rl0 rl0Var = new rl0(ll0Var.c(view, null, false));
        rl0Var.b(-hl.L(24.0f), true);
        rl0Var.H = jn7.w3;
        view.setBackground(rl0Var);
        addView(view, tre.e(-1, 72, 55));
        if (i == 0) {
            Context context3 = getContext();
            i2 = ((e) h48Var).currentAccount;
            vnbVar4 = ((e) h48Var).resourceProvider;
            this.a = new f48(i2, 0L, vnbVar4, context3);
            j(false);
        } else {
            View view2 = new View(getContext());
            this.y = view2;
            rl0 rl0Var2 = new rl0(ll0Var.c(view2, null, false));
            rl0Var2.b(-hl.L(16.0f), false);
            view2.setBackground(rl0Var2);
            addView(view2, tre.e(-1, 16, 55));
            Context context4 = getContext();
            wk5Var = ((e) h48Var).parentLayout;
            vnbVar = ((e) h48Var).resourceProvider;
            u38 u38Var = new u38(context4, wk5Var, 3, 0L, vnbVar);
            this.w = u38Var;
            u38Var.setImportantForAccessibility(4);
            u38Var.x = h48Var;
            u38Var.setClipToOutline(true);
            float L = hl.L(16.0f);
            yi yiVar = yhc.a;
            u38Var.setOutlineProvider(new whc(0, L));
            addView(u38Var, tre.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        Context context5 = getContext();
        vnbVar2 = ((e) h48Var).resourceProvider;
        g48 g48Var = new g48(context5, vnbVar2);
        this.F = g48Var;
        jl0 c = h48Var.F.c(g48Var, null, false);
        vnbVar3 = ((e) h48Var).resourceProvider;
        ol0 ol0Var = new ol0(vnbVar3);
        ol0Var.e = new xz((byte) 19);
        ol0Var.f(0, 0);
        ol0Var.e(0, 0);
        ol0Var.d(0, 0);
        c.p(ol0Var);
        c.r(hl.L(18.0f));
        c.S.e = true;
        g48Var.I = c;
        g48Var.H = c;
        g48Var.G = new o38(this, objArr == true ? 1 : 0);
        g48Var.setVisibility(4);
        addView(g48Var, tre.d(-1, 36.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        View view3 = this.a;
        if (view3 != null) {
            addView(view3, tre.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0107 A[RETURN] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        h48 h48Var = this.q0;
        boolean z = h48Var.a;
        boolean z2 = this.n0;
        if (!z) {
            TLRPC.User f = h48Var.getUserConfig().f();
            if (f != null) {
                int i = this.h;
                if (z2) {
                    ?? r1 = i == (f.color instanceof TLRPC.TL_peerColorCollectible ? -1 : lbc.f(f));
                    ?? r2 = this.n == lbc.g(f);
                    TLRPC.PeerColor peerColor = f.color;
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = peerColor instanceof TLRPC.TL_peerColorCollectible ? (TLRPC.TL_peerColorCollectible) peerColor : null;
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible2 = this.s;
                    ?? r11 = tL_peerColorCollectible == tL_peerColorCollectible2 || (tL_peerColorCollectible != null ? !(tL_peerColorCollectible2 == null || tL_peerColorCollectible.collectible_id != tL_peerColorCollectible2.collectible_id) : tL_peerColorCollectible2 == null);
                    if (r1 == false || r2 == false || r11 == false) {
                        return true;
                    }
                } else {
                    ?? r12 = i == (f.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? -1 : lbc.n(f));
                    ?? r22 = this.n == (f.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? 0L : lbc.m(f));
                    TLRPC.EmojiStatus emojiStatus = f.emoji_status;
                    boolean E0 = h48.E0(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible ? (TLRPC.TL_emojiStatusCollectible) emojiStatus : null, this.r);
                    if (r12 == false || r22 == false || !E0) {
                    }
                }
            }
            return false;
        }
        TLRPC.Chat M0 = h48Var.getMessagesController().M0(0L);
        if (M0 != null) {
            int i2 = this.h;
            if (z2) {
                if (i2 == xc2.F(M0) && this.n == xc2.G(M0)) {
                    TLRPC.PeerColor peerColor2 = M0.color;
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible3 = peerColor2 instanceof TLRPC.TL_peerColorCollectible ? (TLRPC.TL_peerColorCollectible) peerColor2 : null;
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible4 = this.s;
                    if (tL_peerColorCollectible3 == tL_peerColorCollectible4 || (tL_peerColorCollectible3 != null ? !(tL_peerColorCollectible4 == null || tL_peerColorCollectible3.collectible_id != tL_peerColorCollectible4.collectible_id) : tL_peerColorCollectible4 == null)) {
                    }
                }
                return true;
            }
            if (i2 == (M0.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? -1 : xc2.I(M0))) {
                long j = this.n;
                TLRPC.EmojiStatus emojiStatus2 = M0.emoji_status;
                if (!(emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible)) {
                    TLRPC.PeerColor peerColor3 = M0.profile_color;
                    if ((peerColor3 instanceof TLRPC.TL_peerColor) && (peerColor3.flags & 2) != 0) {
                        r3 = peerColor3.background_emoji_id;
                    }
                }
                if (j != r3 || !h48.E0(emojiStatus2, this.r)) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean b() {
        p38 p38Var = this.b;
        if (p38Var != null) {
            for (int i = 0; i < p38Var.getChildCount(); i++) {
                if (p38Var.getChildAt(i) instanceof tk4) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void c() {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = null;
        boolean z = this.n0;
        h48 h48Var = this.q0;
        if (z) {
            TLRPC.User f = h48Var.getUserConfig().f();
            this.h = lbc.f(f);
            this.n = lbc.g(f);
            this.r = null;
            if (f != null) {
                TLRPC.PeerColor peerColor = f.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                    this.s = tL_peerColorCollectible;
                }
            }
            tL_peerColorCollectible = null;
            this.s = tL_peerColorCollectible;
        } else {
            TLRPC.User f2 = h48Var.getUserConfig().f();
            this.h = lbc.n(f2);
            this.n = lbc.o(f2);
            if (f2 != null) {
                TLRPC.EmojiStatus emojiStatus = f2.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    this.r = tL_emojiStatusCollectible;
                    this.s = null;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = tL_emojiStatusCollectible;
                    tL_peerColorCollectible = null;
                    tL_emojiStatusCollectible2 = tL_emojiStatusCollectible3;
                }
            }
            tL_emojiStatusCollectible = null;
            this.r = tL_emojiStatusCollectible;
            this.s = null;
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible32 = tL_emojiStatusCollectible;
            tL_peerColorCollectible = null;
            tL_emojiStatusCollectible2 = tL_emojiStatusCollectible32;
        }
        if (tL_emojiStatusCollectible2 == null && tL_peerColorCollectible == null) {
            return;
        }
        this.h = -1;
        this.n = 0L;
    }

    public final void d() {
        k();
        this.d.f();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view != this.F || this.I) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    public final void e() {
        int i;
        boolean z = this.I;
        p38 p38Var = this.b;
        if (z) {
            p38Var.E0();
        }
        d();
        if (!z || (i = this.i0) < 0) {
            return;
        }
        this.c.g1(i, this.q0.f);
        p38Var.post(new o38(this, (byte) 1));
    }

    public final void f(boolean z) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.J;
        h48 h48Var = this.q0;
        ym4 ym4Var = this.e;
        if (tL_starGiftUnique != null) {
            oj resellAmount = tL_starGiftUnique.getResellAmount(pj.a);
            if (tL_starGiftUnique.resale_ton_only) {
                ym4Var.b = nza.t1(nza.V0(ob6.a0(null, null, 2131745873, tL_starGiftUnique.getResellAmount(pj.b).d()), true), true);
                ym4Var.c = nza.T0(ob6.H(',', "ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                ym4Var.b = nza.T0(ob6.H(',', "ResellGiftBuy", (int) resellAmount.a()));
                ym4Var.c = null;
            }
        } else {
            ym4Var.b = (h48Var.getUserConfig().p() || h48Var.a) ? this.r != null ? this.Q : this.P : this.O;
            ym4Var.c = null;
        }
        if (h48Var.F0() == this) {
            h48Var.S = this;
            h48Var.R.i((CharSequence) ym4Var.b, z, true);
            h48Var.R.g((SpannableStringBuilder) ym4Var.c, z);
        }
    }

    public final void g() {
        c51 c51Var = this.q0.R;
        if (c51Var != null) {
            c51Var.updateColors();
        }
        u38 u38Var = this.w;
        if (u38Var != null) {
            u38Var.invalidate();
        }
        j(true);
        hl.d0(this.b, new ji7(this, (byte) 10));
        g48 g48Var = this.F;
        if (g48Var != null) {
            l(g48Var);
        }
    }

    public final void h() {
        int i;
        int i2 = this.q0.f;
        View view = this.x;
        g48 g48Var = this.F;
        if (g48Var == null || (i = this.i0) < 0) {
            this.H = false;
            this.I = false;
            if (view != null) {
                view.setTranslationY(0.0f);
            }
            if (g48Var != null) {
                g48Var.setVisibility(4);
                boolean z = this.H;
                if (g48Var.J != z) {
                    g48Var.J = z;
                    g48Var.invalidate();
                    return;
                }
                return;
            }
            return;
        }
        u55 u55Var = this.c;
        this.G = u55Var.m(i);
        p38 p38Var = this.b;
        int paddingTop = p38Var.getPaddingTop() + i2;
        int K0 = u55Var.K0();
        View view2 = this.G;
        if (view2 != null) {
            boolean z2 = view2.getTop() <= paddingTop;
            this.I = z2;
            this.H = !z2;
            g48Var.setVisibility(0);
            g48Var.setTranslationY((Math.max(this.G.getTop(), paddingTop) + p38Var.getTop()) - g48Var.getTop());
        } else if (K0 == -1 || K0 <= this.i0) {
            this.I = false;
            this.H = false;
            g48Var.setVisibility(0);
            g48Var.setTranslationY((hl.L(1.0f) + getHeight()) - g48Var.getTop());
        } else {
            this.I = true;
            this.H = false;
            g48Var.setVisibility(0);
            g48Var.setTranslationY((p38Var.getTop() + paddingTop) - g48Var.getTop());
        }
        boolean z3 = this.H;
        if (g48Var.J != z3) {
            g48Var.J = z3;
            g48Var.invalidate();
        }
        view.setTranslationY(this.I ? hl.L(36.0f) + i2 : 0.0f);
        p38Var.invalidate();
        invalidate();
    }

    public final void i() {
        r47 messageObject;
        u38 u38Var = this.w;
        if (u38Var != null) {
            wb2[] cells = u38Var.getCells();
            for (int i = 0; i < cells.length; i++) {
                wb2 wb2Var = cells[i];
                if (wb2Var != null && (messageObject = wb2Var.getMessageObject()) != null) {
                    messageObject.w1 = true;
                    d48 d48Var = this.f;
                    if (d48Var != null) {
                        messageObject.e1 = d48Var.getColorId();
                    }
                    messageObject.f1 = this.n;
                    messageObject.g1 = this.s;
                    cells[i].setAvatar(messageObject);
                    cells[i].invalidate();
                }
            }
        }
    }

    public final void j(boolean z) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        h48 h48Var;
        i38 i38Var;
        int i;
        d48 d48Var = this.f;
        if (d48Var != null) {
            d48Var.a(this.h, z);
        }
        f48 f48Var = this.a;
        if (f48Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.r;
            if (tL_emojiStatusCollectible != null) {
                f48Var.e(tL_emojiStatusCollectible.document_id, true, z);
                f48Var.c(kc7.a(this.r), z);
                f48Var.d(this.r.pattern_document_id, true, z);
            } else {
                if (wf3.z()) {
                    f48Var.e(0L, false, z);
                } else {
                    TLRPC.User X1 = uc7.s1(yac.t0).X1(0L);
                    f48Var.e(X1 != null ? wf3.f(X1.emoji_status) : 0L, wf3.z(), z);
                }
                f48Var.b(this.h, z);
                f48Var.d(this.n, false, z);
            }
        }
        boolean z2 = this.n0;
        if (!z2 && (i38Var = (h48Var = this.q0).e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.r;
            if (tL_emojiStatusCollectible2 != null) {
                i38Var.c(kc7.a(tL_emojiStatusCollectible2), z);
            } else {
                i = ((e) h48Var).currentAccount;
                i38Var.b(i, this.h, z);
            }
        }
        if (!z2) {
            int i2 = this.W;
            k();
            int i3 = this.W;
            s38 s38Var = this.d;
            if (i2 >= 0) {
                if (i3 < 0) {
                    s38Var.q(i2, 2);
                }
            } else if (i3 >= 0) {
                s38Var.p(i3, 2);
            }
        }
        int i4 = 0;
        while (true) {
            p38 p38Var = this.b;
            if (i4 >= p38Var.getChildCount()) {
                return;
            }
            View childAt = p38Var.getChildAt(i4);
            if (childAt instanceof m38) {
                m38 m38Var = (m38) childAt;
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.r;
                m38Var.b((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == m38Var.getGiftId()) || ((tL_peerColorCollectible2 = this.s) != null && tL_peerColorCollectible2.collectible_id == m38Var.getGiftId()), true);
            } else if (childAt instanceof sx4) {
                sx4 sx4Var = (sx4) childAt;
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.r;
                sx4Var.f((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == sx4Var.getGiftId()) || ((tL_peerColorCollectible = this.s) != null && tL_peerColorCollectible.collectible_id == sx4Var.getGiftId()), true);
            }
            i4++;
        }
    }

    public final void k() {
        int i;
        int i2;
        h48 h48Var = this.q0;
        axa axaVar = h48Var.b;
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
        byte b = 1;
        this.T = 1;
        int i3 = 3;
        this.l0 = 3;
        this.S = 2;
        boolean z = this.n0;
        if (z || (this.h < 0 && this.r == null && this.s == null)) {
            i = 3;
        } else {
            this.W = 3;
            i = 5;
            this.l0 = 5;
            this.a0 = 4;
        }
        axa axaVar2 = z ? h48Var.c : axaVar;
        if ((!z || z) && axaVar2 != null) {
            ArrayList arrayList2 = axaVar2.l;
            this.l0 = i + 1;
            this.i0 = i;
            if (this.L == null) {
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i4)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i5 = this.l0;
                this.c0 = i5;
                this.l0 = arrayList.size() + i5;
                int size = arrayList.size() + this.g0;
                this.g0 = size;
                int i6 = this.l0;
                this.d0 = i6;
                if (axaVar.i || !axaVar.j) {
                    this.e0 = i6;
                    int i7 = 3 - (size % 3);
                    if (size <= 0) {
                        i3 = 9;
                    } else if (i7 > 0) {
                        i3 = i7;
                    }
                    int i8 = i6 + i3;
                    this.l0 = i8;
                    this.g0 = size + i3;
                    this.f0 = i8;
                } else if (arrayList.isEmpty()) {
                    int i9 = this.l0;
                    this.k0 = i9;
                    this.l0 = i9 + 2;
                    this.j0 = i9 + 1;
                }
                if (b()) {
                    axaVar2.a();
                }
            } else if (this.K != null) {
                i2 = ((e) h48Var).currentAccount;
                long e = yac.h(i2).e();
                for (int i10 = 0; i10 < this.K.e.size(); i10++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.K.e.get(i10);
                    if (wf3.n(tL_starGiftUnique.owner_id) != e && wf3.n(tL_starGiftUnique.host_id) != e) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i11 = this.l0;
                this.c0 = i11;
                this.l0 = arrayList.size() + i11;
                int size2 = arrayList.size() + this.g0;
                this.g0 = size2;
                int i12 = this.l0;
                this.d0 = i12;
                ed9 ed9Var = this.K;
                if (ed9Var.z || !ed9Var.A) {
                    this.e0 = i12;
                    int i13 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i3 = 9;
                    } else if (i13 > 0) {
                        i3 = i13;
                    }
                    int i14 = i12 + i3;
                    this.l0 = i14;
                    this.g0 = size2 + i3;
                    this.f0 = i14;
                }
                if (b()) {
                    this.K.o(false);
                }
            }
            int i15 = this.l0;
            i = i15 + 1;
            this.l0 = i;
            this.h0 = i15;
        }
        this.l0 = i + 1;
        this.V = i;
        g48 g48Var = this.F;
        if (g48Var != null) {
            g48Var.post(new o38(this, b));
        }
    }

    public final void l(g48 g48Var) {
        int i = aob.d6;
        h48 h48Var = this.q0;
        int themedColor = h48Var.getThemedColor(i);
        h48Var.getThemedColor(aob.a7);
        int themedColor2 = h48Var.getThemedColor(aob.z6);
        int themedColor3 = h48Var.getThemedColor(aob.G6);
        g48Var.w.setColor(themedColor);
        g48Var.y = aob.p1(0.06f, themedColor3);
        g48Var.E = themedColor2;
        g48Var.F = themedColor3;
        gu guVar = g48Var.a;
        for (int i2 = 0; i2 < guVar.getChildCount(); i2++) {
            View childAt = guVar.getChildAt(i2);
            int S = RecyclerView.S(childAt);
            if (S != -1 && (childAt instanceof TextView)) {
                ((TextView) childAt).setTextColor(S == g48Var.d ? g48Var.F : g48Var.E);
                childAt.invalidate();
            }
        }
        guVar.invalidate();
        g48Var.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z = this.n0;
        View view = this.x;
        p38 p38Var = this.b;
        if (z) {
            super.onMeasure(i, i2);
            u38 u38Var = this.w;
            this.o0 = a.getCurrentActionBarHeight() + u38Var.getMeasuredHeight() + hl.m;
            ((ViewGroup.MarginLayoutParams) u38Var.getLayoutParams()).topMargin = a.getCurrentActionBarHeight() + hl.m;
            ((ViewGroup.MarginLayoutParams) p38Var.getLayoutParams()).topMargin = this.o0 - hl.L(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.o0 - hl.L(64.0f);
            ((ViewGroup.MarginLayoutParams) this.y.getLayoutParams()).topMargin = this.o0 - hl.L(16.0f);
            p38Var.setPadding(p38Var.getPaddingLeft(), hl.L(16.0f), p38Var.getPaddingRight(), p38Var.getPaddingBottom());
        } else {
            this.o0 = hl.L(230.0f) + hl.m;
            ((ViewGroup.MarginLayoutParams) p38Var.getLayoutParams()).topMargin = this.o0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.o0 - hl.L(64.0f);
            ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).height = this.o0;
        }
        super.onMeasure(i, i2);
    }
}
