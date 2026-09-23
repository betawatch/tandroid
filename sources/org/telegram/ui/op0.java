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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class op0 extends FrameLayout {
    public static final /* synthetic */ int q0 = 0;
    public final tp0 E;
    public View F;
    public boolean G;
    public boolean H;
    public TL_stars.TL_starGiftUnique I;
    public xh.v3 J;
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
    public final sp0 a;
    public int a0;
    public final fp0 b;
    public int b0;
    public final s4.s c;
    public int c0;
    public final hp0 d;
    public int d0;
    public final n7.a1 e;
    public int e0;
    public rp0 f;
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
    public lp0 o0;
    public final /* synthetic */ up0 p0;
    public TLRPC.TL_emojiStatusCollectible r;
    public TLRPC.TL_peerColorCollectible s;
    public final jp0 v;
    public final View w;
    public final View x;
    public np0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op0(up0 up0Var, Context context, int i10) {
        super(context);
        org.telegram.ui.ActionBar.c5 c5Var;
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
        int i11;
        org.telegram.ui.ActionBar.d6 d6Var4;
        this.p0 = up0Var;
        int i12 = 7;
        this.e = new n7.a1(i12);
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
        int i13 = 0;
        this.f0 = 0;
        this.g0 = -1;
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.l0 = new ArrayList();
        this.m0 = i10;
        d();
        Context context2 = getContext();
        org.telegram.ui.ActionBar.d6 resourceProvider = up0Var.getResourceProvider();
        ah.c cVar = up0Var.G;
        fp0 fp0Var = new fp0(this, context2, resourceProvider, i10);
        this.b = fp0Var;
        fp0Var.setClipToPadding(false);
        fp0Var.setSections(true);
        ((s4.j) fp0Var.getItemAnimator()).m = false;
        getContext();
        s4.s sVar = new s4.s(3);
        this.c = sVar;
        sVar.O = new ci.x1(this, 6);
        fp0Var.i(new ci.r1(this, i12));
        fp0Var.setLayoutManager(sVar);
        hp0 hp0Var = new hp0(this, context, i10);
        this.d = hp0Var;
        fp0Var.setAdapter(hp0Var);
        fp0Var.setOnItemClickListener(new org.telegram.ui.Components.qm0(this, i10, 1));
        fp0Var.j(new ip0(this, i10));
        addView(fp0Var, w7.x5.c(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.pq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        String string = LocaleController.getString(up0Var.a ? R.string.ChannelColorApply : R.string.UserColorApply);
        this.O = string;
        this.N = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append((CharSequence) string);
        this.P = LocaleController.getString(R.string.UserColorApplyCollectible);
        f(false);
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.rr.h);
        jVar.C = false;
        jVar.m = false;
        fp0Var.setItemAnimator(jVar);
        View view = new View(getContext());
        this.w = view;
        ah.d dVar = new ah.d(cVar.c(view, null, false));
        dVar.b(-AndroidUtilities.dp(24.0f), true);
        dVar.q = 220;
        view.setBackground(dVar);
        addView(view, w7.x5.e(-1, 72, 55));
        if (i10 == 0) {
            Context context3 = getContext();
            i11 = ((org.telegram.ui.ActionBar.n2) up0Var).currentAccount;
            d6Var4 = ((org.telegram.ui.ActionBar.n2) up0Var).resourceProvider;
            this.a = new sp0(i11, 0L, context3, d6Var4);
            j(false);
        } else {
            View view2 = new View(getContext());
            this.x = view2;
            ah.d dVar2 = new ah.d(cVar.c(view2, null, false));
            dVar2.b(-AndroidUtilities.dp(16.0f), false);
            view2.setBackground(dVar2);
            addView(view2, w7.x5.e(-1, 16, 55));
            Context context4 = getContext();
            c5Var = ((org.telegram.ui.ActionBar.n2) up0Var).parentLayout;
            d6Var = ((org.telegram.ui.ActionBar.n2) up0Var).resourceProvider;
            jp0 jp0Var = new jp0(context4, c5Var, 3, 0L, d6Var);
            this.v = jp0Var;
            jp0Var.setImportantForAccessibility(4);
            jp0Var.r = up0Var;
            jp0Var.setClipToOutline(true);
            float dp = AndroidUtilities.dp(16.0f);
            ai.k2 k2Var = yf.i0.a;
            jp0Var.setOutlineProvider(new yf.h0(0, dp));
            addView(jp0Var, w7.x5.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        Context context5 = getContext();
        d6Var2 = ((org.telegram.ui.ActionBar.n2) up0Var).resourceProvider;
        tp0 tp0Var = new tp0(up0Var, context5, d6Var2);
        this.E = tp0Var;
        ch.d c10 = up0Var.E.c(tp0Var, null, false);
        d6Var3 = ((org.telegram.ui.ActionBar.n2) up0Var).resourceProvider;
        dh.e eVar = new dh.e(d6Var3);
        eVar.e = new d2.c(8);
        eVar.f(0, 0);
        eVar.e(0, 0);
        eVar.d(0, 0);
        c10.o(eVar);
        c10.q(AndroidUtilities.dp(18.0f));
        c10.j.e = true;
        tp0Var.H = c10;
        tp0Var.G = c10;
        tp0Var.F = new ep0(this, i13);
        tp0Var.setVisibility(4);
        addView(tp0Var, w7.x5.d(-1, 36.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        View view3 = this.a;
        if (view3 != null) {
            addView(view3, w7.x5.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(op0 op0Var) {
        int i10;
        fp0 fp0Var = op0Var.b;
        boolean z10 = op0Var.H;
        if (z10) {
            fp0Var.B0();
        }
        op0Var.e();
        if (!z10 || (i10 = op0Var.h0) < 0) {
            return;
        }
        op0Var.c.h1(i10, op0Var.p0.f);
        fp0Var.post(new ep0(op0Var, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0117 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b() {
        up0 up0Var = this.p0;
        boolean z10 = up0Var.a;
        int i10 = this.m0;
        if (z10) {
            TLRPC.Chat chat = up0Var.getMessagesController().getChat(0L);
            if (chat != null) {
                if (i10 != 1) {
                    if (this.h == (chat.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? -1 : ChatObject.getProfileColorId(chat))) {
                        if (this.n != (chat.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? 0L : ChatObject.getOnlyProfileEmojiId(chat)) || !up0.B0(chat.emoji_status, this.r)) {
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
        TLRPC.User currentUser = up0Var.getUserConfig().getCurrentUser();
        if (currentUser != null) {
            if (i10 == 1) {
                boolean z11 = this.h == (currentUser.color instanceof TLRPC.TL_peerColorCollectible ? -1 : UserObject.getColorId(currentUser));
                boolean z12 = this.n == UserObject.getEmojiId(currentUser);
                TLRPC.PeerColor peerColor2 = currentUser.color;
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible3 = peerColor2 instanceof TLRPC.TL_peerColorCollectible ? (TLRPC.TL_peerColorCollectible) peerColor2 : null;
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible4 = this.s;
                boolean z13 = tL_peerColorCollectible3 == tL_peerColorCollectible4 || (tL_peerColorCollectible3 == null && tL_peerColorCollectible4 == null) || !(tL_peerColorCollectible3 == null || tL_peerColorCollectible4 == null || tL_peerColorCollectible3.collectible_id != tL_peerColorCollectible4.collectible_id);
                if (!z11 || !z12 || !z13) {
                    return true;
                }
            } else {
                boolean z14 = this.h == (currentUser.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? -1 : UserObject.getProfileColorId(currentUser));
                boolean z15 = this.n == (currentUser.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? 0L : UserObject.getOnlyProfileEmojiId(currentUser));
                TLRPC.EmojiStatus emojiStatus = currentUser.emoji_status;
                boolean B0 = up0.B0(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible ? (TLRPC.TL_emojiStatusCollectible) emojiStatus : null, this.r);
                if (!z14 || !z15 || !B0) {
                }
            }
        }
        return false;
    }

    public final boolean c() {
        fp0 fp0Var = this.b;
        if (fp0Var != null) {
            for (int i10 = 0; i10 < fp0Var.getChildCount(); i10++) {
                if (fp0Var.getChildAt(i10) instanceof org.telegram.ui.Components.u00) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i10 = this.m0;
        up0 up0Var = this.p0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i10 == 0) {
            TLRPC.User currentUser = up0Var.getUserConfig().getCurrentUser();
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
            TLRPC.User currentUser2 = up0Var.getUserConfig().getCurrentUser();
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.E || this.H) {
            return super.drawChild(canvas, view, j3);
        }
        return false;
    }

    public final void e() {
        k();
        this.d.l();
    }

    public final void f(boolean z10) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.I;
        up0 up0Var = this.p0;
        n7.a1 a1Var = this.e;
        if (tL_starGiftUnique != null) {
            zf.a resellAmount = tL_starGiftUnique.getResellAmount(zf.b.a);
            if (tL_starGiftUnique.resale_ton_only) {
                a1Var.b = yh.w7.S0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(zf.b.b).d()), true);
                a1Var.c = yh.w7.Q0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                a1Var.b = yh.w7.Q0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a()));
                a1Var.c = null;
            }
        } else {
            a1Var.b = (up0Var.getUserConfig().isPremium() || up0Var.a) ? this.r != null ? this.P : this.O : this.N;
            a1Var.c = null;
        }
        if (up0Var.C0() == this) {
            up0Var.R = this;
            up0Var.Q.g((CharSequence) a1Var.b, z10, true);
            up0Var.Q.f((SpannableStringBuilder) a1Var.c, z10);
        }
    }

    public final void g() {
        ci.d dVar = this.p0.Q;
        if (dVar != null) {
            dVar.j();
        }
        jp0 jp0Var = this.v;
        if (jp0Var != null) {
            jp0Var.invalidate();
        }
        j(true);
        AndroidUtilities.forEachViews((RecyclerView) this.b, (Utilities.Callback<View>) new t3(this, 14));
        tp0 tp0Var = this.E;
        if (tp0Var != null) {
            l(tp0Var);
        }
    }

    public final void h() {
        int i10;
        int i11 = this.p0.f;
        View view = this.w;
        tp0 tp0Var = this.E;
        if (tp0Var == null || (i10 = this.h0) < 0) {
            this.G = false;
            this.H = false;
            if (view != null) {
                view.setTranslationY(0.0f);
            }
            if (tp0Var != null) {
                tp0Var.setVisibility(4);
                boolean z10 = this.G;
                if (tp0Var.I != z10) {
                    tp0Var.I = z10;
                    tp0Var.L.D0(2);
                    tp0Var.invalidate();
                    return;
                }
                return;
            }
            return;
        }
        s4.s sVar = this.c;
        this.F = sVar.m(i10);
        fp0 fp0Var = this.b;
        int paddingTop = fp0Var.getPaddingTop() + i11;
        int L0 = sVar.L0();
        View view2 = this.F;
        if (view2 != null) {
            boolean z11 = view2.getTop() <= paddingTop;
            this.H = z11;
            this.G = !z11;
            tp0Var.setVisibility(0);
            tp0Var.setTranslationY((Math.max(this.F.getTop(), paddingTop) + fp0Var.getTop()) - tp0Var.getTop());
        } else if (L0 == -1 || L0 <= this.h0) {
            this.H = false;
            this.G = false;
            tp0Var.setVisibility(0);
            tp0Var.setTranslationY((AndroidUtilities.dp(1.0f) + getHeight()) - tp0Var.getTop());
        } else {
            this.H = true;
            this.G = false;
            tp0Var.setVisibility(0);
            tp0Var.setTranslationY((fp0Var.getTop() + paddingTop) - tp0Var.getTop());
        }
        boolean z12 = this.G;
        if (tp0Var.I != z12) {
            tp0Var.I = z12;
            tp0Var.L.D0(2);
            tp0Var.invalidate();
        }
        view.setTranslationY(this.H ? AndroidUtilities.dp(36.0f) + i11 : 0.0f);
        fp0Var.invalidate();
        invalidate();
    }

    public final void i() {
        MessageObject messageObject;
        jp0 jp0Var = this.v;
        if (jp0Var != null) {
            org.telegram.ui.Cells.t1[] cells = jp0Var.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.t1 t1Var = cells[i10];
                if (t1Var != null && (messageObject = t1Var.getMessageObject()) != null) {
                    messageObject.notime = true;
                    rp0 rp0Var = this.f;
                    if (rp0Var != null) {
                        messageObject.overrideLinkColor = rp0Var.getColorId();
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
        up0 up0Var;
        xo0 xo0Var;
        int i11;
        rp0 rp0Var = this.f;
        if (rp0Var != null) {
            rp0Var.a(this.h, z10);
        }
        sp0 sp0Var = this.a;
        if (sp0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.r;
            if (tL_emojiStatusCollectible != null) {
                sp0Var.e(tL_emojiStatusCollectible.document_id, true, z10);
                sp0Var.c(MessagesController.PeerColor.fromCollectible(this.r), z10);
                sp0Var.d(this.r.pattern_document_id, true, z10);
            } else {
                if (DialogObject.isEmojiStatusCollectible(0L)) {
                    sp0Var.e(0L, false, z10);
                } else {
                    sp0Var.e(DialogObject.getEmojiStatusDocumentId(0L), DialogObject.isEmojiStatusCollectible(0L), z10);
                }
                sp0Var.b(this.h, z10);
                sp0Var.d(this.n, false, z10);
            }
        }
        int i12 = this.m0;
        if (i12 == 0 && (xo0Var = (up0Var = this.p0).e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.r;
            if (tL_emojiStatusCollectible2 != null) {
                xo0Var.c(MessagesController.PeerColor.fromCollectible(tL_emojiStatusCollectible2), z10);
            } else {
                i11 = ((org.telegram.ui.ActionBar.n2) up0Var).currentAccount;
                xo0Var.b(i11, this.h, z10);
            }
        }
        if (i12 == 0) {
            int i13 = this.V;
            k();
            hp0 hp0Var = this.d;
            if (i13 >= 0 && this.V < 0) {
                hp0Var.t(i13, 2);
            } else if (i13 < 0 && (i10 = this.V) >= 0) {
                hp0Var.s(i10, 2);
            }
        }
        int i14 = 0;
        while (true) {
            fp0 fp0Var = this.b;
            if (i14 >= fp0Var.getChildCount()) {
                return;
            }
            View childAt = fp0Var.getChildAt(i14);
            if (childAt instanceof cp0) {
                cp0 cp0Var = (cp0) childAt;
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.r;
                cp0Var.b((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == cp0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.s) != null && tL_peerColorCollectible2.collectible_id == cp0Var.getGiftId()), true);
            } else if (childAt instanceof xh.j1) {
                xh.j1 j1Var = (xh.j1) childAt;
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.r;
                j1Var.e((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == j1Var.getGiftId()) || ((tL_peerColorCollectible = this.s) != null && tL_peerColorCollectible.collectible_id == j1Var.getGiftId()), true);
            }
            i14++;
        }
    }

    public final void k() {
        int i10;
        up0 up0Var = this.p0;
        yh.l5 l5Var = up0Var.b;
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
        yh.l5 l5Var2 = i12 == 1 ? up0Var.c : l5Var;
        if ((i12 == 0 || i12 == 1) && l5Var2 != null) {
            ArrayList arrayList2 = l5Var2.l;
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
                if (l5Var.i || !l5Var.j) {
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
                    l5Var2.a();
                }
            } else if (this.J != null) {
                i10 = ((org.telegram.ui.ActionBar.n2) up0Var).currentAccount;
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
                xh.v3 v3Var = this.J;
                if (v3Var.t || !v3Var.u) {
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
        tp0 tp0Var = this.E;
        if (tp0Var != null) {
            tp0Var.post(new ep0(this, 1));
        }
    }

    public final void l(tp0 tp0Var) {
        int i10 = org.telegram.ui.ActionBar.h6.d6;
        up0 up0Var = this.p0;
        int themedColor = up0Var.getThemedColor(i10);
        up0Var.getThemedColor(org.telegram.ui.ActionBar.h6.a7);
        int themedColor2 = up0Var.getThemedColor(org.telegram.ui.ActionBar.h6.z6);
        int themedColor3 = up0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6);
        tp0Var.v.setColor(themedColor);
        tp0Var.x = org.telegram.ui.ActionBar.h6.l1(0.06f, themedColor3);
        tp0Var.y = themedColor2;
        tp0Var.E = themedColor3;
        n60 n60Var = tp0Var.a;
        for (int i11 = 0; i11 < n60Var.getChildCount(); i11++) {
            View childAt = n60Var.getChildAt(i11);
            int R = RecyclerView.R(childAt);
            if (R != -1 && (childAt instanceof TextView)) {
                ((TextView) childAt).setTextColor(R == tp0Var.d ? tp0Var.E : tp0Var.y);
                childAt.invalidate();
            }
        }
        n60Var.invalidate();
        tp0Var.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = this.m0;
        View view = this.w;
        fp0 fp0Var = this.b;
        if (i12 == 1) {
            super.onMeasure(i10, i11);
            jp0 jp0Var = this.v;
            this.n0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + jp0Var.getMeasuredHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) jp0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) fp0Var.getLayoutParams()).topMargin = this.n0 - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.x.getLayoutParams()).topMargin = this.n0 - AndroidUtilities.dp(16.0f);
            fp0Var.setPadding(fp0Var.getPaddingLeft(), AndroidUtilities.dp(16.0f), fp0Var.getPaddingRight(), fp0Var.getPaddingBottom());
        } else {
            this.n0 = AndroidUtilities.dp(230.0f) + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) fp0Var.getLayoutParams()).topMargin = this.n0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).height = this.n0;
        }
        super.onMeasure(i10, i11);
    }
}
