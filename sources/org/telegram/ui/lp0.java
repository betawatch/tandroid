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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class lp0 extends FrameLayout {
    public static final /* synthetic */ int q0 = 0;
    public final qp0 E;
    public View F;
    public boolean G;
    public boolean H;
    public TL_stars.TL_starGiftUnique I;
    public zh.u3 J;
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
    public final pp0 a;
    public int a0;
    public final cp0 b;
    public int b0;
    public final s4.t c;
    public int c0;
    public final ep0 d;
    public int d0;
    public final m4.c e;
    public int e0;
    public op0 f;
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
    public ip0 o0;
    public final /* synthetic */ rp0 p0;
    public TLRPC.TL_emojiStatusCollectible r;
    public TLRPC.TL_peerColorCollectible s;
    public final gp0 v;
    public final View w;
    public final View x;
    public kp0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lp0(rp0 rp0Var, Context context, int i10) {
        super(context);
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        org.telegram.ui.ActionBar.u6 u6Var3;
        int i11;
        org.telegram.ui.ActionBar.u6 u6Var4;
        this.p0 = rp0Var;
        Object[] objArr = 0;
        this.e = new m4.c(12, false);
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
        org.telegram.ui.ActionBar.u6 resourceProvider = rp0Var.getResourceProvider();
        ch.b bVar = rp0Var.G;
        cp0 cp0Var = new cp0(this, context2, resourceProvider, i10);
        this.b = cp0Var;
        cp0Var.setClipToPadding(false);
        cp0Var.setSections(true);
        ((s4.l) cp0Var.getItemAnimator()).m = false;
        getContext();
        s4.t tVar = new s4.t(3);
        this.c = tVar;
        tVar.O = new ai.l(this, 8);
        cp0Var.i(new fi.p1(this, 7));
        cp0Var.setLayoutManager(tVar);
        ep0 ep0Var = new ep0(this, context, i10);
        this.d = ep0Var;
        cp0Var.setAdapter(ep0Var);
        cp0Var.setOnItemClickListener(new org.telegram.ui.Components.wn0(this, i10, 1));
        cp0Var.j(new fp0(this, i10));
        addView(cp0Var, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.zq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        String string = LocaleController.getString(rp0Var.a ? R.string.ChannelColorApply : R.string.UserColorApply);
        this.O = string;
        this.N = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append((CharSequence) string);
        this.P = LocaleController.getString(R.string.UserColorApplyCollectible);
        f(false);
        s4.l lVar = new s4.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.ds.h);
        lVar.C = false;
        lVar.m = false;
        cp0Var.setItemAnimator(lVar);
        View view = new View(getContext());
        this.w = view;
        ch.c cVar = new ch.c(bVar.c(view, null, false));
        cVar.b(-AndroidUtilities.dp(24.0f), true);
        cVar.G = 220;
        view.setBackground(cVar);
        addView(view, org.telegram.ui.Components.gb1.i(-1, 72, 55));
        int i12 = 4;
        if (i10 == 0) {
            Context context3 = getContext();
            i11 = ((org.telegram.ui.ActionBar.r2) rp0Var).currentAccount;
            u6Var4 = ((org.telegram.ui.ActionBar.r2) rp0Var).resourceProvider;
            this.a = new pp0(i11, 0L, context3, u6Var4);
            j(false);
        } else {
            View view2 = new View(getContext());
            this.x = view2;
            ch.c cVar2 = new ch.c(bVar.c(view2, null, false));
            cVar2.b(-AndroidUtilities.dp(16.0f), false);
            view2.setBackground(cVar2);
            addView(view2, org.telegram.ui.Components.gb1.i(-1, 16, 55));
            Context context4 = getContext();
            j5Var = ((org.telegram.ui.ActionBar.r2) rp0Var).parentLayout;
            u6Var = ((org.telegram.ui.ActionBar.r2) rp0Var).resourceProvider;
            gp0 gp0Var = new gp0(context4, j5Var, 3, 0L, u6Var);
            this.v = gp0Var;
            gp0Var.setImportantForAccessibility(4);
            gp0Var.r = rp0Var;
            gp0Var.setClipToOutline(true);
            float dp = AndroidUtilities.dp(16.0f);
            ag.v0 v0Var = ag.z0.a;
            gp0Var.setOutlineProvider(new ag.x0(0, dp));
            addView(gp0Var, org.telegram.ui.Components.gb1.h(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        Context context5 = getContext();
        u6Var2 = ((org.telegram.ui.ActionBar.r2) rp0Var).resourceProvider;
        qp0 qp0Var = new qp0(context5, u6Var2);
        this.E = qp0Var;
        eh.d c10 = rp0Var.E.c(qp0Var, null, false);
        u6Var3 = ((org.telegram.ui.ActionBar.r2) rp0Var).resourceProvider;
        fh.e eVar = new fh.e(u6Var3);
        eVar.e = new gh.a(i12);
        eVar.d(0, 0);
        eVar.c(0, 0);
        eVar.b(0, 0);
        c10.v(eVar);
        c10.x(AndroidUtilities.dp(18.0f));
        c10.x.e = true;
        qp0Var.H = c10;
        qp0Var.G = c10;
        qp0Var.F = new bp0(this, objArr == true ? 1 : 0);
        qp0Var.setVisibility(4);
        addView(qp0Var, org.telegram.ui.Components.gb1.h(-1, 36.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        View view3 = this.a;
        if (view3 != null) {
            addView(view3, org.telegram.ui.Components.gb1.i(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(lp0 lp0Var) {
        int i10;
        cp0 cp0Var = lp0Var.b;
        boolean z10 = lp0Var.H;
        if (z10) {
            cp0Var.C0();
        }
        lp0Var.e();
        if (!z10 || (i10 = lp0Var.h0) < 0) {
            return;
        }
        lp0Var.c.h1(i10, lp0Var.p0.f);
        cp0Var.post(new bp0(lp0Var, 1));
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
        rp0 rp0Var = this.p0;
        boolean z10 = rp0Var.a;
        int i10 = this.m0;
        if (z10) {
            TLRPC.Chat chat = rp0Var.getMessagesController().getChat(0L);
            if (chat != null) {
                if (i10 != 1) {
                    if (this.h == (chat.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? -1 : ChatObject.getProfileColorId(chat))) {
                        if (this.n != (chat.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? 0L : ChatObject.getOnlyProfileEmojiId(chat)) || !rp0.C0(chat.emoji_status, this.r)) {
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
        TLRPC.User currentUser = rp0Var.getUserConfig().getCurrentUser();
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
                boolean C0 = rp0.C0(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible ? (TLRPC.TL_emojiStatusCollectible) emojiStatus : null, this.r);
                if (r13 == false || r23 == false || !C0) {
                }
            }
        }
        return false;
    }

    public final boolean c() {
        cp0 cp0Var = this.b;
        if (cp0Var != null) {
            for (int i10 = 0; i10 < cp0Var.getChildCount(); i10++) {
                if (cp0Var.getChildAt(i10) instanceof org.telegram.ui.Components.c10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i10 = this.m0;
        rp0 rp0Var = this.p0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i10 == 0) {
            TLRPC.User currentUser = rp0Var.getUserConfig().getCurrentUser();
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
            TLRPC.User currentUser2 = rp0Var.getUserConfig().getCurrentUser();
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
        rp0 rp0Var = this.p0;
        m4.c cVar = this.e;
        if (tL_starGiftUnique != null) {
            bg.a resellAmount = tL_starGiftUnique.getResellAmount(bg.b.a);
            if (tL_starGiftUnique.resale_ton_only) {
                cVar.b = bi.dd.o1(bi.dd.R0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(bg.b.b).d()), true), true);
                cVar.c = bi.dd.P0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                cVar.b = bi.dd.P0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a()));
                cVar.c = null;
            }
        } else {
            cVar.b = (rp0Var.getUserConfig().isPremium() || rp0Var.a) ? this.r != null ? this.P : this.O : this.N;
            cVar.c = null;
        }
        if (rp0Var.D0() == this) {
            rp0Var.R = this;
            rp0Var.Q.i((CharSequence) cVar.b, z10, true);
            rp0Var.Q.g((SpannableStringBuilder) cVar.c, z10);
        }
    }

    public final void g() {
        fi.d dVar = this.p0.Q;
        if (dVar != null) {
            dVar.updateColors();
        }
        gp0 gp0Var = this.v;
        if (gp0Var != null) {
            gp0Var.invalidate();
        }
        j(true);
        AndroidUtilities.forEachViews((RecyclerView) this.b, (Utilities.Callback<View>) new t3(this, 15));
        qp0 qp0Var = this.E;
        if (qp0Var != null) {
            l(qp0Var);
        }
    }

    public final void h() {
        int i10;
        int i11 = this.p0.f;
        View view = this.w;
        qp0 qp0Var = this.E;
        if (qp0Var == null || (i10 = this.h0) < 0) {
            this.G = false;
            this.H = false;
            if (view != null) {
                view.setTranslationY(0.0f);
            }
            if (qp0Var != null) {
                qp0Var.setVisibility(4);
                boolean z10 = this.G;
                if (qp0Var.I != z10) {
                    qp0Var.I = z10;
                    qp0Var.invalidate();
                    return;
                }
                return;
            }
            return;
        }
        s4.t tVar = this.c;
        this.F = tVar.m(i10);
        cp0 cp0Var = this.b;
        int paddingTop = cp0Var.getPaddingTop() + i11;
        int L0 = tVar.L0();
        View view2 = this.F;
        if (view2 != null) {
            boolean z11 = view2.getTop() <= paddingTop;
            this.H = z11;
            this.G = !z11;
            qp0Var.setVisibility(0);
            qp0Var.setTranslationY((Math.max(this.F.getTop(), paddingTop) + cp0Var.getTop()) - qp0Var.getTop());
        } else if (L0 == -1 || L0 <= this.h0) {
            this.H = false;
            this.G = false;
            qp0Var.setVisibility(0);
            qp0Var.setTranslationY((AndroidUtilities.dp(1.0f) + getHeight()) - qp0Var.getTop());
        } else {
            this.H = true;
            this.G = false;
            qp0Var.setVisibility(0);
            qp0Var.setTranslationY((cp0Var.getTop() + paddingTop) - qp0Var.getTop());
        }
        boolean z12 = this.G;
        if (qp0Var.I != z12) {
            qp0Var.I = z12;
            qp0Var.invalidate();
        }
        view.setTranslationY(this.H ? AndroidUtilities.dp(36.0f) + i11 : 0.0f);
        cp0Var.invalidate();
        invalidate();
    }

    public final void i() {
        MessageObject messageObject;
        gp0 gp0Var = this.v;
        if (gp0Var != null) {
            org.telegram.ui.Cells.s1[] cells = gp0Var.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.s1 s1Var = cells[i10];
                if (s1Var != null && (messageObject = s1Var.getMessageObject()) != null) {
                    messageObject.notime = true;
                    op0 op0Var = this.f;
                    if (op0Var != null) {
                        messageObject.overrideLinkColor = op0Var.getColorId();
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
        rp0 rp0Var;
        uo0 uo0Var;
        int i11;
        op0 op0Var = this.f;
        if (op0Var != null) {
            op0Var.a(this.h, z10);
        }
        pp0 pp0Var = this.a;
        if (pp0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.r;
            if (tL_emojiStatusCollectible != null) {
                pp0Var.e(tL_emojiStatusCollectible.document_id, true, z10);
                pp0Var.c(MessagesController.PeerColor.fromCollectible(this.r), z10);
                pp0Var.d(this.r.pattern_document_id, true, z10);
            } else {
                if (DialogObject.isEmojiStatusCollectible(0L)) {
                    pp0Var.e(0L, false, z10);
                } else {
                    pp0Var.e(DialogObject.getEmojiStatusDocumentId(0L), DialogObject.isEmojiStatusCollectible(0L), z10);
                }
                pp0Var.b(this.h, z10);
                pp0Var.d(this.n, false, z10);
            }
        }
        int i12 = this.m0;
        if (i12 == 0 && (uo0Var = (rp0Var = this.p0).e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.r;
            if (tL_emojiStatusCollectible2 != null) {
                uo0Var.c(MessagesController.PeerColor.fromCollectible(tL_emojiStatusCollectible2), z10);
            } else {
                i11 = ((org.telegram.ui.ActionBar.r2) rp0Var).currentAccount;
                uo0Var.b(i11, this.h, z10);
            }
        }
        if (i12 == 0) {
            int i13 = this.V;
            k();
            ep0 ep0Var = this.d;
            if (i13 >= 0 && this.V < 0) {
                ep0Var.t(i13, 2);
            } else if (i13 < 0 && (i10 = this.V) >= 0) {
                ep0Var.s(i10, 2);
            }
        }
        int i14 = 0;
        while (true) {
            cp0 cp0Var = this.b;
            if (i14 >= cp0Var.getChildCount()) {
                return;
            }
            View childAt = cp0Var.getChildAt(i14);
            if (childAt instanceof zo0) {
                zo0 zo0Var = (zo0) childAt;
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.r;
                zo0Var.b((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == zo0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.s) != null && tL_peerColorCollectible2.collectible_id == zo0Var.getGiftId()), true);
            } else if (childAt instanceof zh.g1) {
                zh.g1 g1Var = (zh.g1) childAt;
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.r;
                g1Var.f((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == g1Var.getGiftId()) || ((tL_peerColorCollectible = this.s) != null && tL_peerColorCollectible.collectible_id == g1Var.getGiftId()), true);
            }
            i14++;
        }
    }

    public final void k() {
        int i10;
        rp0 rp0Var = this.p0;
        bi.t9 t9Var = rp0Var.b;
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
        bi.t9 t9Var2 = i12 == 1 ? rp0Var.c : t9Var;
        if ((i12 == 0 || i12 == 1) && t9Var2 != null) {
            ArrayList arrayList2 = t9Var2.l;
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
                if (t9Var.i || !t9Var.j) {
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
                    t9Var2.b();
                }
            } else if (this.J != null) {
                i10 = ((org.telegram.ui.ActionBar.r2) rp0Var).currentAccount;
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
                zh.u3 u3Var = this.J;
                if (u3Var.t || !u3Var.u) {
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
        qp0 qp0Var = this.E;
        if (qp0Var != null) {
            qp0Var.post(new bp0(this, 1));
        }
    }

    public final void l(qp0 qp0Var) {
        int i10 = org.telegram.ui.ActionBar.y6.d6;
        rp0 rp0Var = this.p0;
        int themedColor = rp0Var.getThemedColor(i10);
        rp0Var.getThemedColor(org.telegram.ui.ActionBar.y6.a7);
        int themedColor2 = rp0Var.getThemedColor(org.telegram.ui.ActionBar.y6.z6);
        int themedColor3 = rp0Var.getThemedColor(org.telegram.ui.ActionBar.y6.G6);
        qp0Var.v.setColor(themedColor);
        qp0Var.x = org.telegram.ui.ActionBar.y6.o1(0.06f, themedColor3);
        qp0Var.y = themedColor2;
        qp0Var.E = themedColor3;
        k10 k10Var = qp0Var.a;
        for (int i11 = 0; i11 < k10Var.getChildCount(); i11++) {
            View childAt = k10Var.getChildAt(i11);
            int R = RecyclerView.R(childAt);
            if (R != -1 && (childAt instanceof TextView)) {
                ((TextView) childAt).setTextColor(R == qp0Var.d ? qp0Var.E : qp0Var.y);
                childAt.invalidate();
            }
        }
        k10Var.invalidate();
        qp0Var.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = this.m0;
        View view = this.w;
        cp0 cp0Var = this.b;
        if (i12 == 1) {
            super.onMeasure(i10, i11);
            gp0 gp0Var = this.v;
            this.n0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + gp0Var.getMeasuredHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) gp0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) cp0Var.getLayoutParams()).topMargin = this.n0 - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.x.getLayoutParams()).topMargin = this.n0 - AndroidUtilities.dp(16.0f);
            cp0Var.setPadding(cp0Var.getPaddingLeft(), AndroidUtilities.dp(16.0f), cp0Var.getPaddingRight(), cp0Var.getPaddingBottom());
        } else {
            this.n0 = AndroidUtilities.dp(230.0f) + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) cp0Var.getLayoutParams()).topMargin = this.n0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).height = this.n0;
        }
        super.onMeasure(i10, i11);
    }
}
