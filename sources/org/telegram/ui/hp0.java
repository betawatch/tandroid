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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class hp0 extends FrameLayout {
    public static final /* synthetic */ int n0 = 0;
    public final mp0 B;
    public View C;
    public boolean D;
    public boolean E;
    public TL_stars.TL_starGiftUnique F;
    public lh.b5 G;
    public TL_stars.StarGift H;
    public final ArrayList I;
    public final HashMap J;
    public final SpannableStringBuilder K;
    public final String L;
    public final String M;
    public int N;
    public int O;
    public int P;
    public final int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public final lp0 a;
    public int a0;
    public final yo0 b;
    public int b0;
    public final f2.w c;
    public int c0;
    public final ap0 d;
    public int d0;
    public final n7.qa e;
    public int e0;
    public kp0 f;
    public int f0;
    public int g0;
    public int h;
    public int h0;
    public final ArrayList i0;
    public final int j0;
    public int k0;
    public ep0 l0;
    public final /* synthetic */ np0 m0;
    public long n;
    public TLRPC.TL_emojiStatusCollectible r;
    public TLRPC.TL_peerColorCollectible s;
    public final cp0 v;
    public final View w;
    public final View x;
    public gp0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp0(np0 np0Var, Context context, int i10) {
        super(context);
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        int i11;
        org.telegram.ui.ActionBar.g6 g6Var4;
        this.m0 = np0Var;
        this.e = new n7.qa(18);
        this.h = -1;
        this.n = 0L;
        this.r = null;
        this.s = null;
        this.H = null;
        this.I = new ArrayList();
        this.J = new HashMap();
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.a0 = -1;
        this.b0 = -1;
        int i12 = 0;
        this.c0 = 0;
        this.d0 = -1;
        this.e0 = -1;
        this.f0 = -1;
        this.g0 = -1;
        this.i0 = new ArrayList();
        this.j0 = i10;
        d();
        Context context2 = getContext();
        org.telegram.ui.ActionBar.g6 resourceProvider = np0Var.getResourceProvider();
        og.a aVar = np0Var.D;
        yo0 yo0Var = new yo0(this, context2, resourceProvider, i10);
        this.b = yo0Var;
        yo0Var.setClipToPadding(false);
        yo0Var.setSections(true);
        ((f2.l) yo0Var.getItemAnimator()).m = false;
        getContext();
        f2.w wVar = new f2.w(3);
        this.c = wVar;
        wVar.O = new lh.n5(this, 6);
        yo0Var.i(new hg.e2(this, 7));
        yo0Var.setLayoutManager(wVar);
        ap0 ap0Var = new ap0(this, context, i10);
        this.d = ap0Var;
        yo0Var.setAdapter(ap0Var);
        yo0Var.setOnItemClickListener(new org.telegram.ui.Components.xm0(this, i10, 1));
        yo0Var.j(new bp0(this, i10));
        addView(yo0Var, k7.c6.c(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.oq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        String string = LocaleController.getString(np0Var.a ? R.string.ChannelColorApply : R.string.UserColorApply);
        this.L = string;
        this.K = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append((CharSequence) string);
        this.M = LocaleController.getString(R.string.UserColorApplyCollectible);
        f(false);
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.pr.h);
        lVar.C = false;
        lVar.m = false;
        yo0Var.setItemAnimator(lVar);
        View view = new View(getContext());
        this.w = view;
        og.b bVar = new og.b(aVar.c(view, null, false));
        bVar.b(-AndroidUtilities.dp(24.0f), true);
        bVar.q = 220;
        view.setBackground(bVar);
        addView(view, k7.c6.e(-1, 72, 55));
        if (i10 == 0) {
            Context context3 = getContext();
            i11 = ((org.telegram.ui.ActionBar.p2) np0Var).currentAccount;
            g6Var4 = ((org.telegram.ui.ActionBar.p2) np0Var).resourceProvider;
            this.a = new lp0(i11, 0L, context3, g6Var4);
            j(false);
        } else {
            View view2 = new View(getContext());
            this.x = view2;
            og.b bVar2 = new og.b(aVar.c(view2, null, false));
            bVar2.b(-AndroidUtilities.dp(16.0f), false);
            view2.setBackground(bVar2);
            addView(view2, k7.c6.e(-1, 16, 55));
            Context context4 = getContext();
            f5Var = ((org.telegram.ui.ActionBar.p2) np0Var).parentLayout;
            g6Var = ((org.telegram.ui.ActionBar.p2) np0Var).resourceProvider;
            cp0 cp0Var = new cp0(context4, f5Var, 3, 0L, g6Var);
            this.v = cp0Var;
            cp0Var.setImportantForAccessibility(4);
            cp0Var.r = np0Var;
            cp0Var.setClipToOutline(true);
            float dp = AndroidUtilities.dp(16.0f);
            hg.j1 j1Var = lf.q0.a;
            cp0Var.setOutlineProvider(new lf.p0(0, dp));
            addView(cp0Var, k7.c6.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        Context context5 = getContext();
        g6Var2 = ((org.telegram.ui.ActionBar.p2) np0Var).resourceProvider;
        mp0 mp0Var = new mp0(np0Var, context5, g6Var2);
        this.B = mp0Var;
        qg.b c3 = np0Var.B.c(mp0Var, null, false);
        g6Var3 = ((org.telegram.ui.ActionBar.p2) np0Var).resourceProvider;
        rg.d dVar = new rg.d(g6Var3);
        dVar.e = new s0.b(25);
        dVar.d(0, 0);
        dVar.c(0, 0);
        dVar.b(0, 0);
        c3.n(dVar);
        c3.p(AndroidUtilities.dp(18.0f));
        c3.h.e = true;
        mp0Var.E = c3;
        mp0Var.D = c3;
        mp0Var.C = new xo0(this, i12);
        mp0Var.setVisibility(4);
        addView(mp0Var, k7.c6.d(-1, 36.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        View view3 = this.a;
        if (view3 != null) {
            addView(view3, k7.c6.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(hp0 hp0Var) {
        int i10;
        yo0 yo0Var = hp0Var.b;
        boolean z4 = hp0Var.E;
        if (z4) {
            yo0Var.B0();
        }
        hp0Var.e();
        if (!z4 || (i10 = hp0Var.e0) < 0) {
            return;
        }
        hp0Var.c.h1(i10, hp0Var.m0.f);
        yo0Var.post(new xo0(hp0Var, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0117 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b() {
        np0 np0Var = this.m0;
        boolean z4 = np0Var.a;
        int i10 = this.j0;
        if (z4) {
            TLRPC.Chat chat = np0Var.getMessagesController().getChat(0L);
            if (chat != null) {
                if (i10 != 1) {
                    if (this.h == (chat.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? -1 : ChatObject.getProfileColorId(chat))) {
                        if (this.n != (chat.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? 0L : ChatObject.getOnlyProfileEmojiId(chat)) || !np0.B0(chat.emoji_status, this.r)) {
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
        TLRPC.User currentUser = np0Var.getUserConfig().getCurrentUser();
        if (currentUser != null) {
            if (i10 == 1) {
                boolean z10 = this.h == (currentUser.color instanceof TLRPC.TL_peerColorCollectible ? -1 : UserObject.getColorId(currentUser));
                boolean z11 = this.n == UserObject.getEmojiId(currentUser);
                TLRPC.PeerColor peerColor2 = currentUser.color;
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible3 = peerColor2 instanceof TLRPC.TL_peerColorCollectible ? (TLRPC.TL_peerColorCollectible) peerColor2 : null;
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible4 = this.s;
                boolean z12 = tL_peerColorCollectible3 == tL_peerColorCollectible4 || (tL_peerColorCollectible3 == null && tL_peerColorCollectible4 == null) || !(tL_peerColorCollectible3 == null || tL_peerColorCollectible4 == null || tL_peerColorCollectible3.collectible_id != tL_peerColorCollectible4.collectible_id);
                if (!z10 || !z11 || !z12) {
                    return true;
                }
            } else {
                boolean z13 = this.h == (currentUser.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? -1 : UserObject.getProfileColorId(currentUser));
                boolean z14 = this.n == (currentUser.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? 0L : UserObject.getOnlyProfileEmojiId(currentUser));
                TLRPC.EmojiStatus emojiStatus = currentUser.emoji_status;
                boolean B0 = np0.B0(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible ? (TLRPC.TL_emojiStatusCollectible) emojiStatus : null, this.r);
                if (!z13 || !z14 || !B0) {
                }
            }
        }
        return false;
    }

    public final boolean c() {
        yo0 yo0Var = this.b;
        if (yo0Var != null) {
            for (int i10 = 0; i10 < yo0Var.getChildCount(); i10++) {
                if (yo0Var.getChildAt(i10) instanceof org.telegram.ui.Components.u00) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i10 = this.j0;
        np0 np0Var = this.m0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i10 == 0) {
            TLRPC.User currentUser = np0Var.getUserConfig().getCurrentUser();
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
            TLRPC.User currentUser2 = np0Var.getUserConfig().getCurrentUser();
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
        if (view != this.B || this.E) {
            return super.drawChild(canvas, view, j10);
        }
        return false;
    }

    public final void e() {
        k();
        this.d.l();
    }

    public final void f(boolean z4) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.F;
        np0 np0Var = this.m0;
        n7.qa qaVar = this.e;
        if (tL_starGiftUnique != null) {
            mf.a resellAmount = tL_starGiftUnique.getResellAmount(mf.b.a);
            if (tL_starGiftUnique.resale_ton_only) {
                qaVar.b = mh.ja.S0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(mf.b.b).d()), true);
                qaVar.c = mh.ja.Q0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                qaVar.b = mh.ja.Q0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a()));
                qaVar.c = null;
            }
        } else {
            qaVar.b = (np0Var.getUserConfig().isPremium() || np0Var.a) ? this.r != null ? this.M : this.L : this.K;
            qaVar.c = null;
        }
        if (np0Var.C0() == this) {
            np0Var.O = this;
            np0Var.N.g((CharSequence) qaVar.b, z4, true);
            np0Var.N.f((SpannableStringBuilder) qaVar.c, z4);
        }
    }

    public final void g() {
        qh.d dVar = this.m0.N;
        if (dVar != null) {
            dVar.j();
        }
        cp0 cp0Var = this.v;
        if (cp0Var != null) {
            cp0Var.invalidate();
        }
        j(true);
        AndroidUtilities.forEachViews((RecyclerView) this.b, (h5.d) new vb(this, 3));
        mp0 mp0Var = this.B;
        if (mp0Var != null) {
            l(mp0Var);
        }
    }

    public final void h() {
        int i10;
        int i11 = this.m0.f;
        View view = this.w;
        mp0 mp0Var = this.B;
        if (mp0Var == null || (i10 = this.e0) < 0) {
            this.D = false;
            this.E = false;
            if (view != null) {
                view.setTranslationY(0.0f);
            }
            if (mp0Var != null) {
                mp0Var.setVisibility(4);
                boolean z4 = this.D;
                if (mp0Var.F != z4) {
                    mp0Var.F = z4;
                    mp0Var.I.D0(2);
                    mp0Var.invalidate();
                    return;
                }
                return;
            }
            return;
        }
        f2.w wVar = this.c;
        this.C = wVar.m(i10);
        yo0 yo0Var = this.b;
        int paddingTop = yo0Var.getPaddingTop() + i11;
        int L0 = wVar.L0();
        View view2 = this.C;
        if (view2 != null) {
            boolean z10 = view2.getTop() <= paddingTop;
            this.E = z10;
            this.D = !z10;
            mp0Var.setVisibility(0);
            mp0Var.setTranslationY((Math.max(this.C.getTop(), paddingTop) + yo0Var.getTop()) - mp0Var.getTop());
        } else if (L0 == -1 || L0 <= this.e0) {
            this.E = false;
            this.D = false;
            mp0Var.setVisibility(0);
            mp0Var.setTranslationY((AndroidUtilities.dp(1.0f) + getHeight()) - mp0Var.getTop());
        } else {
            this.E = true;
            this.D = false;
            mp0Var.setVisibility(0);
            mp0Var.setTranslationY((yo0Var.getTop() + paddingTop) - mp0Var.getTop());
        }
        boolean z11 = this.D;
        if (mp0Var.F != z11) {
            mp0Var.F = z11;
            mp0Var.I.D0(2);
            mp0Var.invalidate();
        }
        view.setTranslationY(this.E ? AndroidUtilities.dp(36.0f) + i11 : 0.0f);
        yo0Var.invalidate();
        invalidate();
    }

    public final void i() {
        MessageObject messageObject;
        cp0 cp0Var = this.v;
        if (cp0Var != null) {
            org.telegram.ui.Cells.t1[] cells = cp0Var.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.t1 t1Var = cells[i10];
                if (t1Var != null && (messageObject = t1Var.getMessageObject()) != null) {
                    messageObject.notime = true;
                    kp0 kp0Var = this.f;
                    if (kp0Var != null) {
                        messageObject.overrideLinkColor = kp0Var.getColorId();
                    }
                    messageObject.overrideLinkEmoji = this.n;
                    messageObject.overrideLinkPeerColor = this.s;
                    cells[i10].setAvatar(messageObject);
                    cells[i10].invalidate();
                }
            }
        }
    }

    public final void j(boolean z4) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        int i10;
        np0 np0Var;
        qo0 qo0Var;
        int i11;
        kp0 kp0Var = this.f;
        if (kp0Var != null) {
            kp0Var.a(this.h, z4);
        }
        lp0 lp0Var = this.a;
        if (lp0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.r;
            if (tL_emojiStatusCollectible != null) {
                lp0Var.e(tL_emojiStatusCollectible.document_id, true, z4);
                lp0Var.c(MessagesController.PeerColor.fromCollectible(this.r), z4);
                lp0Var.d(this.r.pattern_document_id, true, z4);
            } else {
                if (DialogObject.isEmojiStatusCollectible(0L)) {
                    lp0Var.e(0L, false, z4);
                } else {
                    lp0Var.e(DialogObject.getEmojiStatusDocumentId(0L), DialogObject.isEmojiStatusCollectible(0L), z4);
                }
                lp0Var.b(this.h, z4);
                lp0Var.d(this.n, false, z4);
            }
        }
        int i12 = this.j0;
        if (i12 == 0 && (qo0Var = (np0Var = this.m0).e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.r;
            if (tL_emojiStatusCollectible2 != null) {
                qo0Var.c(MessagesController.PeerColor.fromCollectible(tL_emojiStatusCollectible2), z4);
            } else {
                i11 = ((org.telegram.ui.ActionBar.p2) np0Var).currentAccount;
                qo0Var.b(i11, this.h, z4);
            }
        }
        if (i12 == 0) {
            int i13 = this.S;
            k();
            ap0 ap0Var = this.d;
            if (i13 >= 0 && this.S < 0) {
                ap0Var.t(i13, 2);
            } else if (i13 < 0 && (i10 = this.S) >= 0) {
                ap0Var.s(i10, 2);
            }
        }
        int i14 = 0;
        while (true) {
            yo0 yo0Var = this.b;
            if (i14 >= yo0Var.getChildCount()) {
                return;
            }
            View childAt = yo0Var.getChildAt(i14);
            if (childAt instanceof vo0) {
                vo0 vo0Var = (vo0) childAt;
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.r;
                vo0Var.b((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == vo0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.s) != null && tL_peerColorCollectible2.collectible_id == vo0Var.getGiftId()), true);
            } else if (childAt instanceof lh.x1) {
                lh.x1 x1Var = (lh.x1) childAt;
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.r;
                x1Var.e((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == x1Var.getGiftId()) || ((tL_peerColorCollectible = this.s) != null && tL_peerColorCollectible.collectible_id == x1Var.getGiftId()), true);
            }
            i14++;
        }
    }

    public final void k() {
        int i10;
        np0 np0Var = this.m0;
        mh.l7 l7Var = np0Var.b;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.a0 = -1;
        this.b0 = -1;
        this.W = -1;
        this.d0 = -1;
        this.e0 = -1;
        this.f0 = -1;
        this.g0 = -1;
        this.c0 = 0;
        ArrayList arrayList = this.i0;
        arrayList.clear();
        this.N = 0;
        this.P = 1;
        int i11 = 3;
        this.h0 = 3;
        this.O = 2;
        int i12 = this.j0;
        if (i12 == 0 && (this.h >= 0 || this.r != null || this.s != null)) {
            this.S = 3;
            this.h0 = 5;
            this.T = 4;
        }
        mh.l7 l7Var2 = i12 == 1 ? np0Var.c : l7Var;
        if ((i12 == 0 || i12 == 1) && l7Var2 != null) {
            ArrayList arrayList2 = l7Var2.l;
            int i13 = this.h0;
            this.h0 = i13 + 1;
            this.e0 = i13;
            if (this.H == null) {
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i14)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i15 = this.h0;
                this.V = i15;
                this.h0 = arrayList.size() + i15;
                int size = arrayList.size() + this.c0;
                this.c0 = size;
                int i16 = this.h0;
                this.W = i16;
                if (l7Var.i || !l7Var.j) {
                    this.a0 = i16;
                    int i17 = 3 - (size % 3);
                    if (size <= 0) {
                        i11 = 9;
                    } else if (i17 > 0) {
                        i11 = i17;
                    }
                    int i18 = i16 + i11;
                    this.h0 = i18;
                    this.c0 = size + i11;
                    this.b0 = i18;
                } else if (arrayList.isEmpty()) {
                    int i19 = this.h0;
                    this.g0 = i19;
                    this.h0 = i19 + 2;
                    this.f0 = i19 + 1;
                }
                if (c()) {
                    l7Var2.a();
                }
            } else if (this.G != null) {
                i10 = ((org.telegram.ui.ActionBar.p2) np0Var).currentAccount;
                long clientUserId = UserConfig.getInstance(i10).getClientUserId();
                for (int i20 = 0; i20 < this.G.d.size(); i20++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.G.d.get(i20);
                    if (DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id) != clientUserId && DialogObject.getPeerDialogId(tL_starGiftUnique.host_id) != clientUserId) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i21 = this.h0;
                this.V = i21;
                this.h0 = arrayList.size() + i21;
                int size2 = arrayList.size() + this.c0;
                this.c0 = size2;
                int i22 = this.h0;
                this.W = i22;
                lh.b5 b5Var = this.G;
                if (b5Var.t || !b5Var.u) {
                    this.a0 = i22;
                    int i23 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i11 = 9;
                    } else if (i23 > 0) {
                        i11 = i23;
                    }
                    int i24 = i22 + i11;
                    this.h0 = i24;
                    this.c0 = size2 + i11;
                    this.b0 = i24;
                }
                if (c()) {
                    this.G.g(false);
                }
            }
            int i25 = this.h0;
            this.h0 = i25 + 1;
            this.d0 = i25;
        }
        int i26 = this.h0;
        this.h0 = i26 + 1;
        this.R = i26;
        mp0 mp0Var = this.B;
        if (mp0Var != null) {
            mp0Var.post(new xo0(this, 1));
        }
    }

    public final void l(mp0 mp0Var) {
        int i10 = org.telegram.ui.ActionBar.k6.d6;
        np0 np0Var = this.m0;
        int themedColor = np0Var.getThemedColor(i10);
        np0Var.getThemedColor(org.telegram.ui.ActionBar.k6.a7);
        int themedColor2 = np0Var.getThemedColor(org.telegram.ui.ActionBar.k6.z6);
        int themedColor3 = np0Var.getThemedColor(org.telegram.ui.ActionBar.k6.G6);
        mp0Var.v.setColor(themedColor);
        mp0Var.x = org.telegram.ui.ActionBar.k6.l1(0.06f, themedColor3);
        mp0Var.y = themedColor2;
        mp0Var.B = themedColor3;
        mh.d1 d1Var = mp0Var.a;
        for (int i11 = 0; i11 < d1Var.getChildCount(); i11++) {
            View childAt = d1Var.getChildAt(i11);
            int R = RecyclerView.R(childAt);
            if (R != -1 && (childAt instanceof TextView)) {
                ((TextView) childAt).setTextColor(R == mp0Var.d ? mp0Var.B : mp0Var.y);
                childAt.invalidate();
            }
        }
        d1Var.invalidate();
        mp0Var.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = this.j0;
        View view = this.w;
        yo0 yo0Var = this.b;
        if (i12 == 1) {
            super.onMeasure(i10, i11);
            cp0 cp0Var = this.v;
            this.k0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + cp0Var.getMeasuredHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) cp0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) yo0Var.getLayoutParams()).topMargin = this.k0 - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.k0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.x.getLayoutParams()).topMargin = this.k0 - AndroidUtilities.dp(16.0f);
            yo0Var.setPadding(yo0Var.getPaddingLeft(), AndroidUtilities.dp(16.0f), yo0Var.getPaddingRight(), yo0Var.getPaddingBottom());
        } else {
            this.k0 = AndroidUtilities.dp(230.0f) + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) yo0Var.getLayoutParams()).topMargin = this.k0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.k0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).height = this.k0;
        }
        super.onMeasure(i10, i11);
    }
}
