package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class bp0 extends FrameLayout {
    public kh.b5 B;
    public TL_stars.StarGift C;
    public final ArrayList D;
    public final HashMap E;
    public final SpannableStringBuilder F;
    public final String G;
    public final String H;
    public int I;
    public int J;
    public int K;
    public final int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public final fp0 a;
    public int a0;
    public final to0 b;
    public int b0;
    public final vo0 c;
    public final ArrayList c0;
    public final View d;
    public final int d0;
    public final FrameLayout e;
    public int e0;
    public final ph.d f;
    public yo0 f0;
    public final /* synthetic */ gp0 g0;
    public ep0 h;
    public int n;
    public long r;
    public TLRPC.TL_emojiStatusCollectible s;
    public TLRPC.TL_peerColorCollectible v;
    public final org.telegram.ui.Cells.ea w;
    public ap0 x;
    public TL_stars.TL_starGiftUnique y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public bp0(gp0 gp0Var, Context context, int i10) {
        super(context);
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var2;
        this.g0 = gp0Var;
        this.n = -1;
        this.r = 0L;
        this.s = null;
        this.v = null;
        this.C = null;
        this.D = new ArrayList();
        this.E = new HashMap();
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = 0;
        this.V = -1;
        this.W = -1;
        this.a0 = -1;
        this.c0 = new ArrayList();
        this.d0 = i10;
        d();
        to0 to0Var = new to0(this, getContext(), gp0Var.getResourceProvider(), i10);
        this.b = to0Var;
        ((f2.l) to0Var.getItemAnimator()).m = false;
        getContext();
        f2.w wVar = new f2.w(3);
        wVar.O = new kh.n5(this, 6);
        to0Var.i(new gg.e2(this, 7));
        to0Var.setLayoutManager(wVar);
        vo0 vo0Var = new vo0(this, context, i10);
        this.c = vo0Var;
        to0Var.setAdapter(vo0Var);
        to0Var.setOnItemClickListener(new org.telegram.ui.Components.xm0(this, i10, 1));
        to0Var.j(new wo0(this, i10));
        addView(to0Var, k7.b6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.e = frameLayout;
        frameLayout.setBackgroundColor(gp0Var.getThemedColor(org.telegram.ui.ActionBar.j6.a7));
        View view = new View(getContext());
        this.d = view;
        view.setBackgroundColor(gp0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d7));
        view.setAlpha(0.0f);
        frameLayout.addView(view, k7.b6.d(-1, 0.66f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.mq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        boolean z4 = gp0Var.a;
        String string = LocaleController.getString(z4 ? R.string.ChannelColorApply : R.string.UserColorApply);
        this.G = string;
        SpannableStringBuilder append = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append((CharSequence) string);
        this.F = append;
        String string2 = LocaleController.getString(R.string.UserColorApplyCollectible);
        this.H = string2;
        ph.d dVar = new ph.d(getContext(), gp0Var.getResourceProvider(), true);
        this.f = dVar;
        dVar.e();
        dVar.d.o(true, true, false);
        if (!z4) {
            if (!gp0Var.getUserConfig().isPremium()) {
                string = append;
            } else if (this.s != null) {
                string = string2;
            }
        }
        dVar.g(string, false, true);
        dVar.setOnClickListener(new e60(this, 17));
        frameLayout.addView(dVar, k7.b6.d(-1, 48.0f, 119, 14.0f, 14.66f, 14.0f, 14.0f));
        addView(frameLayout, k7.b6.e(-1, -2, 80));
        to0Var.j(new l3(this, 23));
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.nr.h);
        lVar.C = false;
        lVar.m = false;
        to0Var.setItemAnimator(lVar);
        if (i10 == 0) {
            Context context2 = getContext();
            i11 = ((org.telegram.ui.ActionBar.p2) gp0Var).currentAccount;
            f6Var2 = ((org.telegram.ui.ActionBar.p2) gp0Var).resourceProvider;
            fp0 fp0Var = new fp0(i11, 0L, context2, f6Var2);
            this.a = fp0Var;
            i(false);
            addView(fp0Var, k7.b6.e(-1, -2, 55));
        } else {
            Context context3 = getContext();
            e5Var = ((org.telegram.ui.ActionBar.p2) gp0Var).parentLayout;
            f6Var = ((org.telegram.ui.ActionBar.p2) gp0Var).resourceProvider;
            org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(context3, e5Var, 3, 0L, f6Var);
            this.w = eaVar;
            eaVar.setImportantForAccessibility(4);
            eaVar.r = gp0Var;
            addView(eaVar, k7.b6.e(-1, -2, 55));
        }
        g();
        j();
        setWillNotDraw(false);
    }

    public static void a(bp0 bp0Var) {
        to0 to0Var = bp0Var.b;
        FrameLayout frameLayout = bp0Var.e;
        if (frameLayout == null) {
            return;
        }
        int i10 = bp0Var.c.e.b0 - 1;
        boolean z4 = false;
        int i11 = 0;
        for (int i12 = 0; i12 < to0Var.getChildCount(); i12++) {
            View childAt = to0Var.getChildAt(i12);
            int R = RecyclerView.R(childAt);
            if (R != -1 && R <= i10) {
                i11 = Math.max(i11, childAt.getTop());
                if (R == i10) {
                    z4 = true;
                }
            }
        }
        if (!z4) {
            i11 = to0Var.getMeasuredHeight();
        }
        float max = Math.max(0, i11 - (to0Var.getMeasuredHeight() - AndroidUtilities.dp(76.66f)));
        int i13 = bp0Var.d0;
        if (i13 == 0 || i13 == 1) {
            bp0Var.d.animate().alpha(max > 0.0f ? 0.0f : 1.0f).start();
            max = 0.0f;
        }
        frameLayout.setTranslationY(max);
    }

    public final boolean b() {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        gp0 gp0Var = this.g0;
        boolean z4 = gp0Var.a;
        int i10 = this.d0;
        if (z4) {
            TLRPC.Chat chat = gp0Var.getMessagesController().getChat(0L);
            if (chat == null) {
                return false;
            }
            if (i10 != 1) {
                if (this.n == (chat.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? -1 : ChatObject.getProfileColorId(chat))) {
                    if (this.r == (chat.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? 0L : ChatObject.getOnlyProfileEmojiId(chat)) && gp0.x0(chat.emoji_status, this.s)) {
                        return false;
                    }
                }
            } else if (this.n == ChatObject.getColorId(chat) && this.r == ChatObject.getEmojiId(chat)) {
                TLRPC.PeerColor peerColor = chat.color;
                tL_peerColorCollectible = peerColor instanceof TLRPC.TL_peerColorCollectible ? (TLRPC.TL_peerColorCollectible) peerColor : null;
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible2 = this.v;
                if (tL_peerColorCollectible == tL_peerColorCollectible2) {
                    return false;
                }
                if (tL_peerColorCollectible == null && tL_peerColorCollectible2 == null) {
                    return false;
                }
                if (tL_peerColorCollectible != null && tL_peerColorCollectible2 != null && tL_peerColorCollectible.collectible_id == tL_peerColorCollectible2.collectible_id) {
                    return false;
                }
            }
        } else {
            TLRPC.User currentUser = gp0Var.getUserConfig().getCurrentUser();
            if (currentUser == null) {
                return false;
            }
            if (i10 == 1) {
                if (this.n == (currentUser.color instanceof TLRPC.TL_peerColorCollectible ? -1 : UserObject.getColorId(currentUser)) && this.r == UserObject.getEmojiId(currentUser)) {
                    TLRPC.PeerColor peerColor2 = currentUser.color;
                    tL_peerColorCollectible = peerColor2 instanceof TLRPC.TL_peerColorCollectible ? (TLRPC.TL_peerColorCollectible) peerColor2 : null;
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible3 = this.v;
                    if (tL_peerColorCollectible == tL_peerColorCollectible3) {
                        return false;
                    }
                    if (tL_peerColorCollectible == null && tL_peerColorCollectible3 == null) {
                        return false;
                    }
                    if (tL_peerColorCollectible != null && tL_peerColorCollectible3 != null && tL_peerColorCollectible.collectible_id == tL_peerColorCollectible3.collectible_id) {
                        return false;
                    }
                }
            } else {
                if (this.n == (currentUser.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? -1 : UserObject.getProfileColorId(currentUser))) {
                    if (this.r == (currentUser.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? 0L : UserObject.getOnlyProfileEmojiId(currentUser)) && gp0.x0(currentUser.emoji_status, this.s)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final boolean c() {
        to0 to0Var = this.b;
        if (to0Var != null) {
            for (int i10 = 0; i10 < to0Var.getChildCount(); i10++) {
                if (to0Var.getChildAt(i10) instanceof org.telegram.ui.Components.t00) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i10 = this.d0;
        gp0 gp0Var = this.g0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i10 == 0) {
            TLRPC.User currentUser = gp0Var.getUserConfig().getCurrentUser();
            this.n = UserObject.getProfileColorId(currentUser);
            this.r = UserObject.getProfileEmojiId(currentUser);
            if (currentUser != null) {
                TLRPC.EmojiStatus emojiStatus = currentUser.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    this.s = tL_emojiStatusCollectible;
                    this.v = null;
                }
            }
            tL_emojiStatusCollectible = null;
            this.s = tL_emojiStatusCollectible;
            this.v = null;
        } else {
            TLRPC.User currentUser2 = gp0Var.getUserConfig().getCurrentUser();
            this.n = UserObject.getColorId(currentUser2);
            this.r = UserObject.getEmojiId(currentUser2);
            this.s = null;
            if (currentUser2 != null) {
                TLRPC.PeerColor peerColor = currentUser2.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                }
            }
            this.v = tL_peerColorCollectible;
        }
        if (this.s == null && this.v == null) {
            return;
        }
        this.n = -1;
        this.r = 0L;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        gp0 gp0Var = this.g0;
        if (gp0Var.getParentLayout() != null) {
            ((ActionBarLayout) gp0Var.getParentLayout()).q(canvas, this.e0);
        }
    }

    public final void e() {
        j();
        this.c.l();
    }

    public final void f() {
        ph.d dVar = this.f;
        if (dVar == null) {
            return;
        }
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.y;
        if (tL_starGiftUnique == null) {
            gp0 gp0Var = this.g0;
            dVar.g((gp0Var.getUserConfig().isPremium() || gp0Var.a) ? this.s != null ? this.H : this.G : this.F, true, true);
            dVar.f(null, true);
            return;
        }
        mf.a resellAmount = tL_starGiftUnique.getResellAmount(mf.b.a);
        if (tL_starGiftUnique.resale_ton_only) {
            dVar.g(lh.ja.S0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(mf.b.b).d()), true), true, true);
            dVar.f(lh.ja.Q0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a())), true);
        } else {
            dVar.g(lh.ja.Q0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a())), true, true);
            dVar.f(null, true);
        }
    }

    public final void g() {
        int i10 = org.telegram.ui.ActionBar.j6.a7;
        gp0 gp0Var = this.g0;
        int themedColor = gp0Var.getThemedColor(i10);
        to0 to0Var = this.b;
        to0Var.setBackgroundColor(themedColor);
        ph.d dVar = this.f;
        if (dVar != null) {
            dVar.j();
        }
        org.telegram.ui.Cells.ea eaVar = this.w;
        if (eaVar != null) {
            eaVar.invalidate();
        }
        i(true);
        this.e.setBackgroundColor(gp0Var.getThemedColor(i10));
        this.d.setBackgroundColor(gp0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d7));
        AndroidUtilities.forEachViews((RecyclerView) to0Var, (h5.d) new vb(this, 3));
    }

    public final void h() {
        MessageObject messageObject;
        org.telegram.ui.Cells.ea eaVar = this.w;
        if (eaVar != null) {
            org.telegram.ui.Cells.t1[] cells = eaVar.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.t1 t1Var = cells[i10];
                if (t1Var != null && (messageObject = t1Var.getMessageObject()) != null) {
                    messageObject.notime = true;
                    ep0 ep0Var = this.h;
                    if (ep0Var != null) {
                        messageObject.overrideLinkColor = ep0Var.getColorId();
                    }
                    messageObject.overrideLinkEmoji = this.r;
                    messageObject.overrideLinkPeerColor = this.v;
                    cells[i10].setAvatar(messageObject);
                    cells[i10].invalidate();
                }
            }
        }
    }

    public final void i(boolean z4) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        int i10;
        gp0 gp0Var;
        mo0 mo0Var;
        int i11;
        ep0 ep0Var = this.h;
        if (ep0Var != null) {
            ep0Var.a(this.n, z4);
        }
        fp0 fp0Var = this.a;
        if (fp0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.s;
            if (tL_emojiStatusCollectible != null) {
                fp0Var.e(tL_emojiStatusCollectible.document_id, true, z4);
                fp0Var.c(MessagesController.PeerColor.fromCollectible(this.s), z4);
                fp0Var.d(this.s.pattern_document_id, true, z4);
            } else {
                if (DialogObject.isEmojiStatusCollectible(0L)) {
                    fp0Var.e(0L, false, z4);
                } else {
                    fp0Var.e(DialogObject.getEmojiStatusDocumentId(0L), DialogObject.isEmojiStatusCollectible(0L), z4);
                }
                fp0Var.b(this.n, z4);
                fp0Var.d(this.r, false, z4);
            }
        }
        int i12 = this.d0;
        if (i12 == 0 && (mo0Var = (gp0Var = this.g0).e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.s;
            if (tL_emojiStatusCollectible2 != null) {
                mo0Var.c(MessagesController.PeerColor.fromCollectible(tL_emojiStatusCollectible2), z4);
            } else {
                i11 = ((org.telegram.ui.ActionBar.p2) gp0Var).currentAccount;
                mo0Var.b(i11, this.n, z4);
            }
        }
        if (i12 == 0) {
            int i13 = this.N;
            j();
            vo0 vo0Var = this.c;
            if (i13 >= 0 && this.N < 0) {
                vo0Var.t(i13, 2);
            } else if (i13 < 0 && (i10 = this.N) >= 0) {
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
            if (childAt instanceof ro0) {
                ro0 ro0Var = (ro0) childAt;
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.s;
                ro0Var.b((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == ro0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.v) != null && tL_peerColorCollectible2.collectible_id == ro0Var.getGiftId()), true);
            } else if (childAt instanceof kh.x1) {
                kh.x1 x1Var = (kh.x1) childAt;
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.s;
                x1Var.e((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == x1Var.getGiftId()) || ((tL_peerColorCollectible = this.v) != null && tL_peerColorCollectible.collectible_id == x1Var.getGiftId()), true);
            }
            i14++;
        }
    }

    public final void j() {
        int i10;
        gp0 gp0Var = this.g0;
        lh.l7 l7Var = gp0Var.b;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.S = -1;
        this.T = -1;
        this.R = -1;
        this.V = -1;
        this.W = -1;
        this.a0 = -1;
        this.U = 0;
        ArrayList arrayList = this.c0;
        arrayList.clear();
        this.I = 0;
        this.K = 1;
        int i11 = 3;
        this.b0 = 3;
        this.J = 2;
        int i12 = this.d0;
        if (i12 == 0 && (this.n >= 0 || this.s != null || this.v != null)) {
            this.N = 3;
            this.b0 = 5;
            this.O = 4;
        }
        lh.l7 l7Var2 = i12 == 1 ? gp0Var.c : l7Var;
        if ((i12 == 0 || i12 == 1) && l7Var2 != null) {
            ArrayList arrayList2 = l7Var2.l;
            int i13 = this.b0;
            this.b0 = i13 + 1;
            this.W = i13;
            if (this.C == null) {
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i14)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i15 = this.b0;
                this.Q = i15;
                this.b0 = arrayList.size() + i15;
                int size = arrayList.size() + this.U;
                this.U = size;
                int i16 = this.b0;
                this.R = i16;
                if (l7Var.i || !l7Var.j) {
                    this.S = i16;
                    int i17 = 3 - (size % 3);
                    if (size <= 0) {
                        i11 = 9;
                    } else if (i17 > 0) {
                        i11 = i17;
                    }
                    int i18 = i16 + i11;
                    this.b0 = i18;
                    this.U = size + i11;
                    this.T = i18;
                } else if (arrayList.isEmpty()) {
                    int i19 = this.b0;
                    this.b0 = i19 + 1;
                    this.a0 = i19;
                }
                if (c()) {
                    l7Var2.a();
                }
            } else if (this.B != null) {
                i10 = ((org.telegram.ui.ActionBar.p2) gp0Var).currentAccount;
                long clientUserId = UserConfig.getInstance(i10).getClientUserId();
                for (int i20 = 0; i20 < this.B.d.size(); i20++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.B.d.get(i20);
                    if (DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id) != clientUserId && DialogObject.getPeerDialogId(tL_starGiftUnique.host_id) != clientUserId) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i21 = this.b0;
                this.Q = i21;
                this.b0 = arrayList.size() + i21;
                int size2 = arrayList.size() + this.U;
                this.U = size2;
                int i22 = this.b0;
                this.R = i22;
                kh.b5 b5Var = this.B;
                if (b5Var.t || !b5Var.u) {
                    this.S = i22;
                    int i23 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i11 = 9;
                    } else if (i23 > 0) {
                        i11 = i23;
                    }
                    int i24 = i22 + i11;
                    this.b0 = i24;
                    this.U = size2 + i11;
                    this.T = i24;
                }
                if (c()) {
                    this.B.g(false);
                }
            }
            int i25 = this.b0;
            this.b0 = i25 + 1;
            this.V = i25;
        }
        int i26 = this.b0;
        this.b0 = i26 + 1;
        this.M = i26;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = this.d0;
        to0 to0Var = this.b;
        if (i12 == 1) {
            super.onMeasure(i10, i11);
            org.telegram.ui.Cells.ea eaVar = this.w;
            this.e0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + eaVar.getMeasuredHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) eaVar.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) to0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            to0Var.setPadding(0, eaVar.getMeasuredHeight(), 0, 0);
        } else {
            this.e0 = AndroidUtilities.dp(230.0f) + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) to0Var.getLayoutParams()).topMargin = this.e0;
            ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).height = this.e0;
        }
        super.onMeasure(i10, i11);
    }
}
