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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class cp0 extends FrameLayout {
    public static final /* synthetic */ int q0 = 0;
    public final hp0 E;
    public View F;
    public boolean G;
    public boolean H;
    public TL_stars.TL_starGiftUnique I;
    public yh.s3 J;
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
    public final gp0 a;
    public int a0;
    public final to0 b;
    public int b0;
    public final s4.s c;
    public int c0;
    public final vo0 d;
    public int d0;
    public final n2.e e;
    public int e0;
    public fp0 f;
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
    public zo0 o0;
    public final /* synthetic */ ip0 p0;
    public TLRPC.TL_emojiStatusCollectible r;
    public TLRPC.TL_peerColorCollectible s;
    public final xo0 v;
    public final View w;
    public final View x;
    public bp0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public cp0(ip0 ip0Var, Context context, int i10) {
        super(context);
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
        int i11;
        org.telegram.ui.ActionBar.d6 d6Var4;
        this.p0 = ip0Var;
        Object[] objArr = 0;
        this.e = new n2.e(10, false);
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
        org.telegram.ui.ActionBar.d6 resourceProvider = ip0Var.getResourceProvider();
        bh.b bVar = ip0Var.G;
        to0 to0Var = new to0(this, context2, resourceProvider, i10);
        this.b = to0Var;
        to0Var.setClipToPadding(false);
        to0Var.setSections(true);
        ((s4.k) to0Var.getItemAnimator()).m = false;
        getContext();
        s4.s sVar = new s4.s(3);
        this.c = sVar;
        int i12 = 7;
        sVar.O = new ai.q1(this, i12);
        to0Var.i(new ei.q1(this, i12));
        to0Var.setLayoutManager(sVar);
        vo0 vo0Var = new vo0(this, context, i10);
        this.d = vo0Var;
        to0Var.setAdapter(vo0Var);
        to0Var.setOnItemClickListener(new org.telegram.ui.Components.nn0(this, i10, 1));
        to0Var.j(new wo0(this, i10));
        addView(to0Var, w7.z5.c(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.yq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        String string = LocaleController.getString(ip0Var.a ? R.string.ChannelColorApply : R.string.UserColorApply);
        this.O = string;
        this.N = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append((CharSequence) string);
        this.P = LocaleController.getString(R.string.UserColorApplyCollectible);
        f(false);
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.bs.h);
        kVar.C = false;
        kVar.m = false;
        to0Var.setItemAnimator(kVar);
        View view = new View(getContext());
        this.w = view;
        bh.c cVar = new bh.c(bVar.c(view, null, false));
        cVar.b(-AndroidUtilities.dp(24.0f), true);
        cVar.q = 220;
        view.setBackground(cVar);
        addView(view, w7.z5.e(-1, 72, 55));
        if (i10 == 0) {
            Context context3 = getContext();
            i11 = ((org.telegram.ui.ActionBar.n2) ip0Var).currentAccount;
            d6Var4 = ((org.telegram.ui.ActionBar.n2) ip0Var).resourceProvider;
            this.a = new gp0(i11, 0L, context3, d6Var4);
            j(false);
        } else {
            View view2 = new View(getContext());
            this.x = view2;
            bh.c cVar2 = new bh.c(bVar.c(view2, null, false));
            cVar2.b(-AndroidUtilities.dp(16.0f), false);
            view2.setBackground(cVar2);
            addView(view2, w7.z5.e(-1, 16, 55));
            Context context4 = getContext();
            d5Var = ((org.telegram.ui.ActionBar.n2) ip0Var).parentLayout;
            d6Var = ((org.telegram.ui.ActionBar.n2) ip0Var).resourceProvider;
            xo0 xo0Var = new xo0(context4, d5Var, 3, 0L, d6Var);
            this.v = xo0Var;
            xo0Var.setImportantForAccessibility(4);
            xo0Var.r = ip0Var;
            xo0Var.setClipToOutline(true);
            float dp = AndroidUtilities.dp(16.0f);
            ci.o1 o1Var = zf.j0.a;
            xo0Var.setOutlineProvider(new zf.i0(0, dp));
            addView(xo0Var, w7.z5.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        Context context5 = getContext();
        d6Var2 = ((org.telegram.ui.ActionBar.n2) ip0Var).resourceProvider;
        hp0 hp0Var = new hp0(ip0Var, context5, d6Var2);
        this.E = hp0Var;
        dh.d c10 = ip0Var.E.c(hp0Var, null, false);
        d6Var3 = ((org.telegram.ui.ActionBar.n2) ip0Var).resourceProvider;
        eh.e eVar = new eh.e(d6Var3);
        eVar.e = new ci.i1(24);
        eVar.d(0, 0);
        eVar.c(0, 0);
        eVar.b(0, 0);
        c10.o(eVar);
        c10.q(AndroidUtilities.dp(18.0f));
        c10.j.e = true;
        hp0Var.H = c10;
        hp0Var.G = c10;
        hp0Var.F = new so0(this, objArr == true ? 1 : 0);
        hp0Var.setVisibility(4);
        addView(hp0Var, w7.z5.d(-1, 36.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        View view3 = this.a;
        if (view3 != null) {
            addView(view3, w7.z5.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(cp0 cp0Var) {
        int i10;
        to0 to0Var = cp0Var.b;
        boolean z10 = cp0Var.H;
        if (z10) {
            to0Var.B0();
        }
        cp0Var.e();
        if (!z10 || (i10 = cp0Var.h0) < 0) {
            return;
        }
        cp0Var.c.h1(i10, cp0Var.p0.f);
        to0Var.post(new so0(cp0Var, 1));
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
        ip0 ip0Var = this.p0;
        boolean z10 = ip0Var.a;
        int i10 = this.m0;
        if (z10) {
            TLRPC.Chat chat = ip0Var.getMessagesController().getChat(0L);
            if (chat != null) {
                if (i10 != 1) {
                    if (this.h == (chat.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? -1 : ChatObject.getProfileColorId(chat))) {
                        if (this.n != (chat.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? 0L : ChatObject.getOnlyProfileEmojiId(chat)) || !ip0.B0(chat.emoji_status, this.r)) {
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
        TLRPC.User currentUser = ip0Var.getUserConfig().getCurrentUser();
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
                boolean B0 = ip0.B0(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible ? (TLRPC.TL_emojiStatusCollectible) emojiStatus : null, this.r);
                if (r13 == false || r23 == false || !B0) {
                }
            }
        }
        return false;
    }

    public final boolean c() {
        to0 to0Var = this.b;
        if (to0Var != null) {
            for (int i10 = 0; i10 < to0Var.getChildCount(); i10++) {
                if (to0Var.getChildAt(i10) instanceof org.telegram.ui.Components.b10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i10 = this.m0;
        ip0 ip0Var = this.p0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i10 == 0) {
            TLRPC.User currentUser = ip0Var.getUserConfig().getCurrentUser();
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
            TLRPC.User currentUser2 = ip0Var.getUserConfig().getCurrentUser();
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
        ip0 ip0Var = this.p0;
        n2.e eVar = this.e;
        if (tL_starGiftUnique != null) {
            ag.a resellAmount = tL_starGiftUnique.getResellAmount(ag.b.a);
            if (tL_starGiftUnique.resale_ton_only) {
                eVar.b = ai.md.n1(ai.md.T0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(ag.b.b).d()), true), true);
                eVar.c = ai.md.R0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                eVar.b = ai.md.R0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a()));
                eVar.c = null;
            }
        } else {
            eVar.b = (ip0Var.getUserConfig().isPremium() || ip0Var.a) ? this.r != null ? this.P : this.O : this.N;
            eVar.c = null;
        }
        if (ip0Var.C0() == this) {
            ip0Var.R = this;
            ip0Var.Q.g((CharSequence) eVar.b, z10, true);
            ip0Var.Q.f((SpannableStringBuilder) eVar.c, z10);
        }
    }

    public final void g() {
        ei.d dVar = this.p0.Q;
        if (dVar != null) {
            dVar.j();
        }
        xo0 xo0Var = this.v;
        if (xo0Var != null) {
            xo0Var.invalidate();
        }
        j(true);
        AndroidUtilities.forEachViews((RecyclerView) this.b, (Utilities.Callback<View>) new v3(this, 14));
        hp0 hp0Var = this.E;
        if (hp0Var != null) {
            l(hp0Var);
        }
    }

    public final void h() {
        int i10;
        int i11 = this.p0.f;
        View view = this.w;
        hp0 hp0Var = this.E;
        if (hp0Var == null || (i10 = this.h0) < 0) {
            this.G = false;
            this.H = false;
            if (view != null) {
                view.setTranslationY(0.0f);
            }
            if (hp0Var != null) {
                hp0Var.setVisibility(4);
                boolean z10 = this.G;
                if (hp0Var.I != z10) {
                    hp0Var.I = z10;
                    hp0Var.L.D0(2);
                    hp0Var.invalidate();
                    return;
                }
                return;
            }
            return;
        }
        s4.s sVar = this.c;
        this.F = sVar.m(i10);
        to0 to0Var = this.b;
        int paddingTop = to0Var.getPaddingTop() + i11;
        int L0 = sVar.L0();
        View view2 = this.F;
        if (view2 != null) {
            boolean z11 = view2.getTop() <= paddingTop;
            this.H = z11;
            this.G = !z11;
            hp0Var.setVisibility(0);
            hp0Var.setTranslationY((Math.max(this.F.getTop(), paddingTop) + to0Var.getTop()) - hp0Var.getTop());
        } else if (L0 == -1 || L0 <= this.h0) {
            this.H = false;
            this.G = false;
            hp0Var.setVisibility(0);
            hp0Var.setTranslationY((AndroidUtilities.dp(1.0f) + getHeight()) - hp0Var.getTop());
        } else {
            this.H = true;
            this.G = false;
            hp0Var.setVisibility(0);
            hp0Var.setTranslationY((to0Var.getTop() + paddingTop) - hp0Var.getTop());
        }
        boolean z12 = this.G;
        if (hp0Var.I != z12) {
            hp0Var.I = z12;
            hp0Var.L.D0(2);
            hp0Var.invalidate();
        }
        view.setTranslationY(this.H ? AndroidUtilities.dp(36.0f) + i11 : 0.0f);
        to0Var.invalidate();
        invalidate();
    }

    public final void i() {
        MessageObject messageObject;
        xo0 xo0Var = this.v;
        if (xo0Var != null) {
            org.telegram.ui.Cells.u1[] cells = xo0Var.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.u1 u1Var = cells[i10];
                if (u1Var != null && (messageObject = u1Var.getMessageObject()) != null) {
                    messageObject.notime = true;
                    fp0 fp0Var = this.f;
                    if (fp0Var != null) {
                        messageObject.overrideLinkColor = fp0Var.getColorId();
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
        ip0 ip0Var;
        lo0 lo0Var;
        int i11;
        fp0 fp0Var = this.f;
        if (fp0Var != null) {
            fp0Var.a(this.h, z10);
        }
        gp0 gp0Var = this.a;
        if (gp0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.r;
            if (tL_emojiStatusCollectible != null) {
                gp0Var.e(tL_emojiStatusCollectible.document_id, true, z10);
                gp0Var.c(MessagesController.PeerColor.fromCollectible(this.r), z10);
                gp0Var.d(this.r.pattern_document_id, true, z10);
            } else {
                if (DialogObject.isEmojiStatusCollectible(0L)) {
                    gp0Var.e(0L, false, z10);
                } else {
                    gp0Var.e(DialogObject.getEmojiStatusDocumentId(0L), DialogObject.isEmojiStatusCollectible(0L), z10);
                }
                gp0Var.b(this.h, z10);
                gp0Var.d(this.n, false, z10);
            }
        }
        int i12 = this.m0;
        if (i12 == 0 && (lo0Var = (ip0Var = this.p0).e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.r;
            if (tL_emojiStatusCollectible2 != null) {
                lo0Var.c(MessagesController.PeerColor.fromCollectible(tL_emojiStatusCollectible2), z10);
            } else {
                i11 = ((org.telegram.ui.ActionBar.n2) ip0Var).currentAccount;
                lo0Var.b(i11, this.h, z10);
            }
        }
        if (i12 == 0) {
            int i13 = this.V;
            k();
            vo0 vo0Var = this.d;
            if (i13 >= 0 && this.V < 0) {
                vo0Var.t(i13, 2);
            } else if (i13 < 0 && (i10 = this.V) >= 0) {
                vo0Var.s(i10, 2);
            }
        }
        int i14 = 0;
        while (true) {
            to0 to0Var = this.b;
            if (i14 >= to0Var.getChildCount()) {
                return;
            }
            View childAt = to0Var.getChildAt(i14);
            if (childAt instanceof qo0) {
                qo0 qo0Var = (qo0) childAt;
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.r;
                qo0Var.b((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == qo0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.s) != null && tL_peerColorCollectible2.collectible_id == qo0Var.getGiftId()), true);
            } else if (childAt instanceof yh.g1) {
                yh.g1 g1Var = (yh.g1) childAt;
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.r;
                g1Var.e((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == g1Var.getGiftId()) || ((tL_peerColorCollectible = this.s) != null && tL_peerColorCollectible.collectible_id == g1Var.getGiftId()), true);
            }
            i14++;
        }
    }

    public final void k() {
        int i10;
        ip0 ip0Var = this.p0;
        ai.y9 y9Var = ip0Var.b;
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
        ai.y9 y9Var2 = i12 == 1 ? ip0Var.c : y9Var;
        if ((i12 == 0 || i12 == 1) && y9Var2 != null) {
            ArrayList arrayList2 = y9Var2.l;
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
                if (y9Var.i || !y9Var.j) {
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
                    y9Var2.a();
                }
            } else if (this.J != null) {
                i10 = ((org.telegram.ui.ActionBar.n2) ip0Var).currentAccount;
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
                yh.s3 s3Var = this.J;
                if (s3Var.t || !s3Var.u) {
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
        hp0 hp0Var = this.E;
        if (hp0Var != null) {
            hp0Var.post(new so0(this, 1));
        }
    }

    public final void l(hp0 hp0Var) {
        int i10 = org.telegram.ui.ActionBar.h6.d6;
        ip0 ip0Var = this.p0;
        int themedColor = ip0Var.getThemedColor(i10);
        ip0Var.getThemedColor(org.telegram.ui.ActionBar.h6.a7);
        int themedColor2 = ip0Var.getThemedColor(org.telegram.ui.ActionBar.h6.z6);
        int themedColor3 = ip0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6);
        hp0Var.v.setColor(themedColor);
        hp0Var.x = org.telegram.ui.ActionBar.h6.m1(0.06f, themedColor3);
        hp0Var.y = themedColor2;
        hp0Var.E = themedColor3;
        g10 g10Var = hp0Var.a;
        for (int i11 = 0; i11 < g10Var.getChildCount(); i11++) {
            View childAt = g10Var.getChildAt(i11);
            int R = RecyclerView.R(childAt);
            if (R != -1 && (childAt instanceof TextView)) {
                ((TextView) childAt).setTextColor(R == hp0Var.d ? hp0Var.E : hp0Var.y);
                childAt.invalidate();
            }
        }
        g10Var.invalidate();
        hp0Var.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = this.m0;
        View view = this.w;
        to0 to0Var = this.b;
        if (i12 == 1) {
            super.onMeasure(i10, i11);
            xo0 xo0Var = this.v;
            this.n0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + xo0Var.getMeasuredHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) xo0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) to0Var.getLayoutParams()).topMargin = this.n0 - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.x.getLayoutParams()).topMargin = this.n0 - AndroidUtilities.dp(16.0f);
            to0Var.setPadding(to0Var.getPaddingLeft(), AndroidUtilities.dp(16.0f), to0Var.getPaddingRight(), to0Var.getPaddingBottom());
        } else {
            this.n0 = AndroidUtilities.dp(230.0f) + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) to0Var.getLayoutParams()).topMargin = this.n0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).height = this.n0;
        }
        super.onMeasure(i10, i11);
    }
}
