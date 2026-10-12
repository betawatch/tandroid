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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class aq0 extends FrameLayout {
    public static final /* synthetic */ int q0 = 0;
    public final fq0 E;
    public View F;
    public boolean G;
    public boolean H;
    public TL_stars.TL_starGiftUnique I;
    public yh.t3 J;
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
    public final eq0 a;
    public int a0;
    public final rp0 b;
    public int b0;
    public final s4.s c;
    public int c0;
    public final tp0 d;
    public int d0;
    public final n6.o e;
    public int e0;
    public dq0 f;
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
    public xp0 o0;
    public final /* synthetic */ gq0 p0;
    public TLRPC.TL_emojiStatusCollectible r;
    public TLRPC.TL_peerColorCollectible s;
    public final vp0 v;
    public final View w;
    public final View x;
    public zp0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public aq0(gq0 gq0Var, Context context, int i10) {
        super(context);
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.c6 c6Var3;
        int i11;
        org.telegram.ui.ActionBar.c6 c6Var4;
        this.p0 = gq0Var;
        Object[] objArr = 0;
        this.e = new n6.o(8, false);
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
        org.telegram.ui.ActionBar.c6 resourceProvider = gq0Var.getResourceProvider();
        bh.b bVar = gq0Var.G;
        rp0 rp0Var = new rp0(this, context2, resourceProvider, i10);
        this.b = rp0Var;
        rp0Var.setClipToPadding(false);
        rp0Var.setSections(true);
        ((s4.k) rp0Var.getItemAnimator()).m = false;
        getContext();
        s4.s sVar = new s4.s(3);
        this.c = sVar;
        sVar.O = new di.w1(this, 6);
        rp0Var.i(new di.q1(this, 7));
        rp0Var.setLayoutManager(sVar);
        tp0 tp0Var = new tp0(this, context, i10);
        this.d = tp0Var;
        rp0Var.setAdapter(tp0Var);
        rp0Var.setOnItemClickListener(new org.telegram.ui.Components.rn0(this, i10, 1));
        rp0Var.j(new up0(this, i10));
        addView(rp0Var, w7.a6.d(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.br(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        String string = LocaleController.getString(gq0Var.a ? R.string.ChannelColorApply : R.string.UserColorApply);
        this.O = string;
        this.N = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append((CharSequence) string);
        this.P = LocaleController.getString(R.string.UserColorApplyCollectible);
        f(false);
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.es.h);
        kVar.C = false;
        kVar.m = false;
        rp0Var.setItemAnimator(kVar);
        View view = new View(getContext());
        this.w = view;
        bh.c cVar = new bh.c(bVar.c(view, null, false));
        cVar.b(-AndroidUtilities.dp(24.0f), true);
        cVar.q = 220;
        view.setBackground(cVar);
        addView(view, w7.a6.e(-1, 72, 55));
        if (i10 == 0) {
            Context context3 = getContext();
            i11 = ((org.telegram.ui.ActionBar.m2) gq0Var).currentAccount;
            c6Var4 = ((org.telegram.ui.ActionBar.m2) gq0Var).resourceProvider;
            this.a = new eq0(i11, 0L, context3, c6Var4);
            j(false);
        } else {
            View view2 = new View(getContext());
            this.x = view2;
            bh.c cVar2 = new bh.c(bVar.c(view2, null, false));
            cVar2.b(-AndroidUtilities.dp(16.0f), false);
            view2.setBackground(cVar2);
            addView(view2, w7.a6.e(-1, 16, 55));
            Context context4 = getContext();
            b5Var = ((org.telegram.ui.ActionBar.m2) gq0Var).parentLayout;
            c6Var = ((org.telegram.ui.ActionBar.m2) gq0Var).resourceProvider;
            vp0 vp0Var = new vp0(context4, b5Var, 3, 0L, c6Var);
            this.v = vp0Var;
            vp0Var.setImportantForAccessibility(4);
            vp0Var.r = gq0Var;
            vp0Var.setClipToOutline(true);
            float dp = AndroidUtilities.dp(16.0f);
            bi.a2 a2Var = zf.j0.a;
            vp0Var.setOutlineProvider(new zf.i0(0, dp));
            addView(vp0Var, w7.a6.a(-2.0f, 12.0f, 0.0f, 12.0f, 0.0f, -1, 55));
        }
        Context context5 = getContext();
        c6Var2 = ((org.telegram.ui.ActionBar.m2) gq0Var).resourceProvider;
        fq0 fq0Var = new fq0(gq0Var, context5, c6Var2);
        this.E = fq0Var;
        dh.d c10 = gq0Var.E.c(fq0Var, null, false);
        c6Var3 = ((org.telegram.ui.ActionBar.m2) gq0Var).resourceProvider;
        eh.e eVar = new eh.e(c6Var3);
        eVar.e = new bi.w2(22);
        eVar.d(0, 0);
        eVar.c(0, 0);
        eVar.b(0, 0);
        c10.o(eVar);
        c10.q(AndroidUtilities.dp(18.0f));
        c10.j.e = true;
        fq0Var.H = c10;
        fq0Var.G = c10;
        fq0Var.F = new qp0(this, objArr == true ? 1 : 0);
        fq0Var.setVisibility(4);
        addView(fq0Var, w7.a6.a(36.0f, 12.0f, 0.0f, 12.0f, 0.0f, -1, 55));
        View view3 = this.a;
        if (view3 != null) {
            addView(view3, w7.a6.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(aq0 aq0Var) {
        int i10;
        rp0 rp0Var = aq0Var.b;
        boolean z10 = aq0Var.H;
        if (z10) {
            rp0Var.B0();
        }
        aq0Var.e();
        if (!z10 || (i10 = aq0Var.h0) < 0) {
            return;
        }
        aq0Var.c.h1(i10, aq0Var.p0.f);
        rp0Var.post(new qp0(aq0Var, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0117 A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b() {
        gq0 gq0Var = this.p0;
        boolean z10 = gq0Var.a;
        int i10 = this.m0;
        if (z10) {
            TLRPC.Chat chat = gq0Var.getMessagesController().getChat(0L);
            if (chat != null) {
                if (i10 != 1) {
                    if (this.h == (chat.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? -1 : ChatObject.getProfileColorId(chat))) {
                        if (this.n != (chat.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? 0L : ChatObject.getOnlyProfileEmojiId(chat)) || !gq0.B0(chat.emoji_status, this.r)) {
                        }
                    }
                    return true;
                }
                if (this.h == ChatObject.getColorId(chat) && this.n == ChatObject.getEmojiId(chat)) {
                    TLRPC.PeerColor peerColor = chat.color;
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = peerColor instanceof TLRPC.TL_peerColorCollectible ? (TLRPC.TL_peerColorCollectible) peerColor : null;
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible2 = this.s;
                    if (tL_peerColorCollectible != tL_peerColorCollectible2 && ((tL_peerColorCollectible != null || tL_peerColorCollectible2 != null) && (tL_peerColorCollectible == null || tL_peerColorCollectible2 == null || tL_peerColorCollectible.collectible_id != tL_peerColorCollectible2.collectible_id))) {
                    }
                }
                return true;
            }
            return false;
        }
        TLRPC.User currentUser = gq0Var.getUserConfig().getCurrentUser();
        if (currentUser != null) {
            if (i10 == 1) {
                ?? r12 = this.h == (currentUser.color instanceof TLRPC.TL_peerColorCollectible ? -1 : UserObject.getColorId(currentUser));
                ?? r22 = this.n == UserObject.getEmojiId(currentUser);
                TLRPC.PeerColor peerColor2 = currentUser.color;
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible3 = peerColor2 instanceof TLRPC.TL_peerColorCollectible ? (TLRPC.TL_peerColorCollectible) peerColor2 : null;
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible4 = this.s;
                ?? r02 = tL_peerColorCollectible3 == tL_peerColorCollectible4 || (tL_peerColorCollectible3 == null && tL_peerColorCollectible4 == null) || !(tL_peerColorCollectible3 == null || tL_peerColorCollectible4 == null || tL_peerColorCollectible3.collectible_id != tL_peerColorCollectible4.collectible_id);
                if (r12 == false || r22 == false || r02 == false) {
                    return true;
                }
            } else {
                ?? r13 = this.h == (currentUser.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? -1 : UserObject.getProfileColorId(currentUser));
                ?? r23 = this.n == (currentUser.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? 0L : UserObject.getOnlyProfileEmojiId(currentUser));
                TLRPC.EmojiStatus emojiStatus = currentUser.emoji_status;
                boolean B0 = gq0.B0(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible ? (TLRPC.TL_emojiStatusCollectible) emojiStatus : null, this.r);
                if (r13 == false || r23 == false || !B0) {
                }
            }
        }
        return false;
    }

    public final boolean c() {
        rp0 rp0Var = this.b;
        if (rp0Var != null) {
            for (int i10 = 0; i10 < rp0Var.getChildCount(); i10++) {
                if (rp0Var.getChildAt(i10) instanceof org.telegram.ui.Components.f10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i10 = this.m0;
        gq0 gq0Var = this.p0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i10 == 0) {
            TLRPC.User currentUser = gq0Var.getUserConfig().getCurrentUser();
            this.h = UserObject.getProfileColorId(currentUser);
            this.n = UserObject.getProfileEmojiId(currentUser);
            if (currentUser != null) {
                TLRPC.EmojiStatus emojiStatus = currentUser.emoji_status;
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
            TLRPC.User currentUser2 = gq0Var.getUserConfig().getCurrentUser();
            this.h = UserObject.getColorId(currentUser2);
            this.n = UserObject.getEmojiId(currentUser2);
            this.r = null;
            if (currentUser2 != null) {
                TLRPC.PeerColor peerColor = currentUser2.color;
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
        this.d.l();
    }

    public final void f(boolean z10) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.I;
        gq0 gq0Var = this.p0;
        n6.o oVar = this.e;
        if (tL_starGiftUnique != null) {
            ag.a resellAmount = tL_starGiftUnique.getResellAmount(ag.b.a);
            if (tL_starGiftUnique.resale_ton_only) {
                oVar.b = zh.p7.T0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(ag.b.b).d()), true);
                oVar.c = zh.p7.R0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                oVar.b = zh.p7.R0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a()));
                oVar.c = null;
            }
        } else {
            oVar.b = (gq0Var.getUserConfig().isPremium() || gq0Var.a) ? this.r != null ? this.P : this.O : this.N;
            oVar.c = null;
        }
        if (gq0Var.C0() == this) {
            gq0Var.R = this;
            gq0Var.Q.g((CharSequence) oVar.b, z10, true);
            gq0Var.Q.f((SpannableStringBuilder) oVar.c, z10);
        }
    }

    public final void g() {
        di.d dVar = this.p0.Q;
        if (dVar != null) {
            dVar.j();
        }
        vp0 vp0Var = this.v;
        if (vp0Var != null) {
            vp0Var.invalidate();
        }
        j(true);
        AndroidUtilities.forEachViews((RecyclerView) this.b, (Utilities.Callback<View>) new v3(this, 14));
        fq0 fq0Var = this.E;
        if (fq0Var != null) {
            l(fq0Var);
        }
    }

    public final void h() {
        int i10;
        int i11 = this.p0.f;
        View view = this.w;
        fq0 fq0Var = this.E;
        if (fq0Var == null || (i10 = this.h0) < 0) {
            this.G = false;
            this.H = false;
            if (view != null) {
                view.setTranslationY(0.0f);
            }
            if (fq0Var != null) {
                fq0Var.setVisibility(4);
                boolean z10 = this.G;
                if (fq0Var.I != z10) {
                    fq0Var.I = z10;
                    fq0Var.L.D0(2);
                    fq0Var.invalidate();
                    return;
                }
                return;
            }
            return;
        }
        s4.s sVar = this.c;
        this.F = sVar.m(i10);
        rp0 rp0Var = this.b;
        int paddingTop = rp0Var.getPaddingTop() + i11;
        int L0 = sVar.L0();
        View view2 = this.F;
        if (view2 != null) {
            boolean z11 = view2.getTop() <= paddingTop;
            this.H = z11;
            this.G = !z11;
            fq0Var.setVisibility(0);
            fq0Var.setTranslationY((Math.max(this.F.getTop(), paddingTop) + rp0Var.getTop()) - fq0Var.getTop());
        } else if (L0 == -1 || L0 <= this.h0) {
            this.H = false;
            this.G = false;
            fq0Var.setVisibility(0);
            fq0Var.setTranslationY((AndroidUtilities.dp(1.0f) + getHeight()) - fq0Var.getTop());
        } else {
            this.H = true;
            this.G = false;
            fq0Var.setVisibility(0);
            fq0Var.setTranslationY((rp0Var.getTop() + paddingTop) - fq0Var.getTop());
        }
        boolean z12 = this.G;
        if (fq0Var.I != z12) {
            fq0Var.I = z12;
            fq0Var.L.D0(2);
            fq0Var.invalidate();
        }
        view.setTranslationY(this.H ? AndroidUtilities.dp(36.0f) + i11 : 0.0f);
        rp0Var.invalidate();
        invalidate();
    }

    public final void i() {
        MessageObject messageObject;
        vp0 vp0Var = this.v;
        if (vp0Var != null) {
            org.telegram.ui.Cells.u1[] cells = vp0Var.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.u1 u1Var = cells[i10];
                if (u1Var != null && (messageObject = u1Var.getMessageObject()) != null) {
                    messageObject.notime = true;
                    dq0 dq0Var = this.f;
                    if (dq0Var != null) {
                        messageObject.overrideLinkColor = dq0Var.getColorId();
                    }
                    messageObject.overrideLinkEmoji = this.n;
                    messageObject.overrideLinkPeerColor = this.s;
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
        gq0 gq0Var;
        jp0 jp0Var;
        int i11;
        dq0 dq0Var = this.f;
        if (dq0Var != null) {
            dq0Var.a(this.h, z10);
        }
        eq0 eq0Var = this.a;
        if (eq0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.r;
            if (tL_emojiStatusCollectible != null) {
                eq0Var.e(tL_emojiStatusCollectible.document_id, true, z10);
                eq0Var.c(MessagesController.PeerColor.fromCollectible(this.r), z10);
                eq0Var.d(this.r.pattern_document_id, true, z10);
            } else {
                if (DialogObject.isEmojiStatusCollectible(0L)) {
                    eq0Var.e(0L, false, z10);
                } else {
                    eq0Var.e(DialogObject.getEmojiStatusDocumentId(0L), DialogObject.isEmojiStatusCollectible(0L), z10);
                }
                eq0Var.b(this.h, z10);
                eq0Var.d(this.n, false, z10);
            }
        }
        int i12 = this.m0;
        if (i12 == 0 && (jp0Var = (gq0Var = this.p0).e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.r;
            if (tL_emojiStatusCollectible2 != null) {
                jp0Var.c(MessagesController.PeerColor.fromCollectible(tL_emojiStatusCollectible2), z10);
            } else {
                i11 = ((org.telegram.ui.ActionBar.m2) gq0Var).currentAccount;
                jp0Var.b(i11, this.h, z10);
            }
        }
        if (i12 == 0) {
            int i13 = this.V;
            k();
            tp0 tp0Var = this.d;
            if (i13 >= 0 && this.V < 0) {
                tp0Var.t(i13, 2);
            } else if (i13 < 0 && (i10 = this.V) >= 0) {
                tp0Var.s(i10, 2);
            }
        }
        int i14 = 0;
        while (true) {
            rp0 rp0Var = this.b;
            if (i14 >= rp0Var.getChildCount()) {
                return;
            }
            View childAt = rp0Var.getChildAt(i14);
            if (childAt instanceof op0) {
                op0 op0Var = (op0) childAt;
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.r;
                op0Var.b((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == op0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.s) != null && tL_peerColorCollectible2.collectible_id == op0Var.getGiftId()), true);
            } else if (childAt instanceof yh.h1) {
                yh.h1 h1Var = (yh.h1) childAt;
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.r;
                h1Var.e((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == h1Var.getGiftId()) || ((tL_peerColorCollectible = this.s) != null && tL_peerColorCollectible.collectible_id == h1Var.getGiftId()), true);
            }
            i14++;
        }
    }

    public final void k() {
        int i10;
        gq0 gq0Var = this.p0;
        zh.f5 f5Var = gq0Var.b;
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
        zh.f5 f5Var2 = i12 == 1 ? gq0Var.c : f5Var;
        if ((i12 == 0 || i12 == 1) && f5Var2 != null) {
            ArrayList arrayList2 = f5Var2.l;
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
                if (f5Var.i || !f5Var.j) {
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
                    f5Var2.a();
                }
            } else if (this.J != null) {
                i10 = ((org.telegram.ui.ActionBar.m2) gq0Var).currentAccount;
                long clientUserId = UserConfig.getInstance(i10).getClientUserId();
                for (int i20 = 0; i20 < this.J.d.size(); i20++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.J.d.get(i20);
                    if (DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id) != clientUserId && DialogObject.getPeerDialogId(tL_starGiftUnique.host_id) != clientUserId) {
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
                yh.t3 t3Var = this.J;
                if (t3Var.t || !t3Var.u) {
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
        fq0 fq0Var = this.E;
        if (fq0Var != null) {
            fq0Var.post(new qp0(this, 1));
        }
    }

    public final void l(fq0 fq0Var) {
        int i10 = org.telegram.ui.ActionBar.g6.d6;
        gq0 gq0Var = this.p0;
        int themedColor = gq0Var.getThemedColor(i10);
        gq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.a7);
        int themedColor2 = gq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.z6);
        int themedColor3 = gq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.G6);
        fq0Var.v.setColor(themedColor);
        fq0Var.x = org.telegram.ui.ActionBar.g6.m1(0.06f, themedColor3);
        fq0Var.y = themedColor2;
        fq0Var.E = themedColor3;
        v60 v60Var = fq0Var.a;
        for (int i11 = 0; i11 < v60Var.getChildCount(); i11++) {
            View childAt = v60Var.getChildAt(i11);
            int R = RecyclerView.R(childAt);
            if (R != -1 && (childAt instanceof TextView)) {
                ((TextView) childAt).setTextColor(R == fq0Var.d ? fq0Var.E : fq0Var.y);
                childAt.invalidate();
            }
        }
        v60Var.invalidate();
        fq0Var.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = this.m0;
        View view = this.w;
        rp0 rp0Var = this.b;
        if (i12 == 1) {
            super.onMeasure(i10, i11);
            vp0 vp0Var = this.v;
            this.n0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + vp0Var.getMeasuredHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) vp0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) rp0Var.getLayoutParams()).topMargin = this.n0 - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.x.getLayoutParams()).topMargin = this.n0 - AndroidUtilities.dp(16.0f);
            rp0Var.setPadding(rp0Var.getPaddingLeft(), AndroidUtilities.dp(16.0f), rp0Var.getPaddingRight(), rp0Var.getPaddingBottom());
        } else {
            this.n0 = AndroidUtilities.dp(230.0f) + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) rp0Var.getLayoutParams()).topMargin = this.n0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).height = this.n0;
        }
        super.onMeasure(i10, i11);
    }
}
