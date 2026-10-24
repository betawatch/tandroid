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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class fp0 extends FrameLayout {
    public static final /* synthetic */ int q0 = 0;
    public final kp0 E;
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
    public final jp0 a;
    public int a0;
    public final wo0 b;
    public int b0;
    public final s4.s c;
    public int c0;
    public final yo0 d;
    public int d0;
    public final mi.q e;
    public int e0;
    public ip0 f;
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
    public cp0 o0;
    public final /* synthetic */ lp0 p0;
    public TLRPC.TL_emojiStatusCollectible r;
    public TLRPC.TL_peerColorCollectible s;
    public final ap0 v;
    public final View w;
    public final View x;
    public ep0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fp0(lp0 lp0Var, Context context, int i10) {
        super(context);
        org.telegram.ui.ActionBar.h5 h5Var;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        int i11;
        org.telegram.ui.ActionBar.g6 g6Var4;
        this.p0 = lp0Var;
        byte b10 = 0;
        this.e = new mi.q(12, b10);
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
        org.telegram.ui.ActionBar.g6 resourceProvider = lp0Var.getResourceProvider();
        bh.b bVar = lp0Var.G;
        wo0 wo0Var = new wo0(this, context2, resourceProvider, i10);
        this.b = wo0Var;
        wo0Var.setClipToPadding(false);
        wo0Var.setSections(true);
        ((s4.k) wo0Var.getItemAnimator()).m = false;
        getContext();
        s4.s sVar = new s4.s(3);
        this.c = sVar;
        int i12 = 7;
        sVar.O = new ai.q1(this, i12);
        wo0Var.i(new ei.q1(this, i12));
        wo0Var.setLayoutManager(sVar);
        yo0 yo0Var = new yo0(this, context, i10);
        this.d = yo0Var;
        wo0Var.setAdapter(yo0Var);
        wo0Var.setOnItemClickListener(new org.telegram.ui.Components.rn0(this, i10, 1));
        wo0Var.j(new zo0(this, i10));
        addView(wo0Var, w7.z5.c(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.xq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        String string = LocaleController.getString(lp0Var.a ? R.string.ChannelColorApply : R.string.UserColorApply);
        this.O = string;
        this.N = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append((CharSequence) string);
        this.P = LocaleController.getString(R.string.UserColorApplyCollectible);
        f(false);
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.bs.h);
        kVar.C = false;
        kVar.m = false;
        wo0Var.setItemAnimator(kVar);
        View view = new View(getContext());
        this.w = view;
        bh.c cVar = new bh.c(bVar.c(view, null, false));
        cVar.b(-AndroidUtilities.dp(24.0f), true);
        cVar.G = 220;
        view.setBackground(cVar);
        addView(view, w7.z5.e(-1, 72, 55));
        if (i10 == 0) {
            Context context3 = getContext();
            i11 = ((org.telegram.ui.ActionBar.o2) lp0Var).currentAccount;
            g6Var4 = ((org.telegram.ui.ActionBar.o2) lp0Var).resourceProvider;
            this.a = new jp0(i11, 0L, context3, g6Var4);
            j(false);
        } else {
            View view2 = new View(getContext());
            this.x = view2;
            bh.c cVar2 = new bh.c(bVar.c(view2, null, false));
            cVar2.b(-AndroidUtilities.dp(16.0f), false);
            view2.setBackground(cVar2);
            addView(view2, w7.z5.e(-1, 16, 55));
            Context context4 = getContext();
            h5Var = ((org.telegram.ui.ActionBar.o2) lp0Var).parentLayout;
            g6Var = ((org.telegram.ui.ActionBar.o2) lp0Var).resourceProvider;
            ap0 ap0Var = new ap0(context4, h5Var, 3, 0L, g6Var);
            this.v = ap0Var;
            ap0Var.setImportantForAccessibility(4);
            ap0Var.r = lp0Var;
            ap0Var.setClipToOutline(true);
            float dp = AndroidUtilities.dp(16.0f);
            ci.n1 n1Var = zf.j0.a;
            ap0Var.setOutlineProvider(new zf.i0(0, dp));
            addView(ap0Var, w7.z5.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        Context context5 = getContext();
        g6Var2 = ((org.telegram.ui.ActionBar.o2) lp0Var).resourceProvider;
        kp0 kp0Var = new kp0(lp0Var, context5, g6Var2);
        this.E = kp0Var;
        dh.d c10 = lp0Var.E.c(kp0Var, null, false);
        g6Var3 = ((org.telegram.ui.ActionBar.o2) lp0Var).resourceProvider;
        eh.e eVar = new eh.e(g6Var3);
        eVar.e = new c3.m(26);
        eVar.d(0, 0);
        eVar.c(0, 0);
        eVar.b(0, 0);
        c10.o(eVar);
        c10.q(AndroidUtilities.dp(18.0f));
        c10.v.e = true;
        kp0Var.H = c10;
        kp0Var.G = c10;
        kp0Var.F = new vo0(this, b10);
        kp0Var.setVisibility(4);
        addView(kp0Var, w7.z5.d(-1, 36.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        View view3 = this.a;
        if (view3 != null) {
            addView(view3, w7.z5.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(fp0 fp0Var) {
        int i10;
        wo0 wo0Var = fp0Var.b;
        boolean z10 = fp0Var.H;
        if (z10) {
            wo0Var.B0();
        }
        fp0Var.e();
        if (!z10 || (i10 = fp0Var.h0) < 0) {
            return;
        }
        fp0Var.c.h1(i10, fp0Var.p0.f);
        wo0Var.post(new vo0(fp0Var, 1));
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
        lp0 lp0Var = this.p0;
        boolean z10 = lp0Var.a;
        int i10 = this.m0;
        if (z10) {
            TLRPC.Chat chat = lp0Var.getMessagesController().getChat(0L);
            if (chat != null) {
                if (i10 != 1) {
                    if (this.h == (chat.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? -1 : ChatObject.getProfileColorId(chat))) {
                        if (this.n != (chat.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? 0L : ChatObject.getOnlyProfileEmojiId(chat)) || !lp0.B0(chat.emoji_status, this.r)) {
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
        TLRPC.User currentUser = lp0Var.getUserConfig().getCurrentUser();
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
                boolean B0 = lp0.B0(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible ? (TLRPC.TL_emojiStatusCollectible) emojiStatus : null, this.r);
                if (r13 == false || r23 == false || !B0) {
                }
            }
        }
        return false;
    }

    public final boolean c() {
        wo0 wo0Var = this.b;
        if (wo0Var != null) {
            for (int i10 = 0; i10 < wo0Var.getChildCount(); i10++) {
                if (wo0Var.getChildAt(i10) instanceof org.telegram.ui.Components.b10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i10 = this.m0;
        lp0 lp0Var = this.p0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i10 == 0) {
            TLRPC.User currentUser = lp0Var.getUserConfig().getCurrentUser();
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
            TLRPC.User currentUser2 = lp0Var.getUserConfig().getCurrentUser();
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
        lp0 lp0Var = this.p0;
        mi.q qVar = this.e;
        if (tL_starGiftUnique != null) {
            ag.a resellAmount = tL_starGiftUnique.getResellAmount(ag.b.a);
            if (tL_starGiftUnique.resale_ton_only) {
                qVar.b = ai.nd.n1(ai.nd.T0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(ag.b.b).d()), true), true);
                qVar.c = ai.nd.R0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                qVar.b = ai.nd.R0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a()));
                qVar.c = null;
            }
        } else {
            qVar.b = (lp0Var.getUserConfig().isPremium() || lp0Var.a) ? this.r != null ? this.P : this.O : this.N;
            qVar.c = null;
        }
        if (lp0Var.C0() == this) {
            lp0Var.R = this;
            lp0Var.Q.i((CharSequence) qVar.b, z10, true);
            lp0Var.Q.g((SpannableStringBuilder) qVar.c, z10);
        }
    }

    public final void g() {
        ei.d dVar = this.p0.Q;
        if (dVar != null) {
            dVar.updateColors();
        }
        ap0 ap0Var = this.v;
        if (ap0Var != null) {
            ap0Var.invalidate();
        }
        j(true);
        AndroidUtilities.forEachViews((RecyclerView) this.b, (Utilities.Callback<View>) new u3(this, 14));
        kp0 kp0Var = this.E;
        if (kp0Var != null) {
            l(kp0Var);
        }
    }

    public final void h() {
        int i10;
        int i11 = this.p0.f;
        View view = this.w;
        kp0 kp0Var = this.E;
        if (kp0Var == null || (i10 = this.h0) < 0) {
            this.G = false;
            this.H = false;
            if (view != null) {
                view.setTranslationY(0.0f);
            }
            if (kp0Var != null) {
                kp0Var.setVisibility(4);
                boolean z10 = this.G;
                if (kp0Var.I != z10) {
                    kp0Var.I = z10;
                    kp0Var.L.D0(2);
                    kp0Var.invalidate();
                    return;
                }
                return;
            }
            return;
        }
        s4.s sVar = this.c;
        this.F = sVar.m(i10);
        wo0 wo0Var = this.b;
        int paddingTop = wo0Var.getPaddingTop() + i11;
        int L0 = sVar.L0();
        View view2 = this.F;
        if (view2 != null) {
            boolean z11 = view2.getTop() <= paddingTop;
            this.H = z11;
            this.G = !z11;
            kp0Var.setVisibility(0);
            kp0Var.setTranslationY((Math.max(this.F.getTop(), paddingTop) + wo0Var.getTop()) - kp0Var.getTop());
        } else if (L0 == -1 || L0 <= this.h0) {
            this.H = false;
            this.G = false;
            kp0Var.setVisibility(0);
            kp0Var.setTranslationY((AndroidUtilities.dp(1.0f) + getHeight()) - kp0Var.getTop());
        } else {
            this.H = true;
            this.G = false;
            kp0Var.setVisibility(0);
            kp0Var.setTranslationY((wo0Var.getTop() + paddingTop) - kp0Var.getTop());
        }
        boolean z12 = this.G;
        if (kp0Var.I != z12) {
            kp0Var.I = z12;
            kp0Var.L.D0(2);
            kp0Var.invalidate();
        }
        view.setTranslationY(this.H ? AndroidUtilities.dp(36.0f) + i11 : 0.0f);
        wo0Var.invalidate();
        invalidate();
    }

    public final void i() {
        MessageObject messageObject;
        ap0 ap0Var = this.v;
        if (ap0Var != null) {
            org.telegram.ui.Cells.t1[] cells = ap0Var.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.t1 t1Var = cells[i10];
                if (t1Var != null && (messageObject = t1Var.getMessageObject()) != null) {
                    messageObject.notime = true;
                    ip0 ip0Var = this.f;
                    if (ip0Var != null) {
                        messageObject.overrideLinkColor = ip0Var.getColorId();
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
        lp0 lp0Var;
        oo0 oo0Var;
        int i11;
        ip0 ip0Var = this.f;
        if (ip0Var != null) {
            ip0Var.a(this.h, z10);
        }
        jp0 jp0Var = this.a;
        if (jp0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.r;
            if (tL_emojiStatusCollectible != null) {
                jp0Var.e(tL_emojiStatusCollectible.document_id, true, z10);
                jp0Var.c(MessagesController.PeerColor.fromCollectible(this.r), z10);
                jp0Var.d(this.r.pattern_document_id, true, z10);
            } else {
                if (DialogObject.isEmojiStatusCollectible(0L)) {
                    jp0Var.e(0L, false, z10);
                } else {
                    jp0Var.e(DialogObject.getEmojiStatusDocumentId(0L), DialogObject.isEmojiStatusCollectible(0L), z10);
                }
                jp0Var.b(this.h, z10);
                jp0Var.d(this.n, false, z10);
            }
        }
        int i12 = this.m0;
        if (i12 == 0 && (oo0Var = (lp0Var = this.p0).e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.r;
            if (tL_emojiStatusCollectible2 != null) {
                oo0Var.c(MessagesController.PeerColor.fromCollectible(tL_emojiStatusCollectible2), z10);
            } else {
                i11 = ((org.telegram.ui.ActionBar.o2) lp0Var).currentAccount;
                oo0Var.b(i11, this.h, z10);
            }
        }
        if (i12 == 0) {
            int i13 = this.V;
            k();
            yo0 yo0Var = this.d;
            if (i13 >= 0 && this.V < 0) {
                yo0Var.t(i13, 2);
            } else if (i13 < 0 && (i10 = this.V) >= 0) {
                yo0Var.s(i10, 2);
            }
        }
        int i14 = 0;
        while (true) {
            wo0 wo0Var = this.b;
            if (i14 >= wo0Var.getChildCount()) {
                return;
            }
            View childAt = wo0Var.getChildAt(i14);
            if (childAt instanceof to0) {
                to0 to0Var = (to0) childAt;
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.r;
                to0Var.b((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == to0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.s) != null && tL_peerColorCollectible2.collectible_id == to0Var.getGiftId()), true);
            } else if (childAt instanceof yh.g1) {
                yh.g1 g1Var = (yh.g1) childAt;
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.r;
                g1Var.f((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == g1Var.getGiftId()) || ((tL_peerColorCollectible = this.s) != null && tL_peerColorCollectible.collectible_id == g1Var.getGiftId()), true);
            }
            i14++;
        }
    }

    public final void k() {
        int i10;
        lp0 lp0Var = this.p0;
        ai.y9 y9Var = lp0Var.b;
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
        ai.y9 y9Var2 = i12 == 1 ? lp0Var.c : y9Var;
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
                i10 = ((org.telegram.ui.ActionBar.o2) lp0Var).currentAccount;
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
        kp0 kp0Var = this.E;
        if (kp0Var != null) {
            kp0Var.post(new vo0(this, 1));
        }
    }

    public final void l(kp0 kp0Var) {
        int i10 = org.telegram.ui.ActionBar.k6.d6;
        lp0 lp0Var = this.p0;
        int themedColor = lp0Var.getThemedColor(i10);
        lp0Var.getThemedColor(org.telegram.ui.ActionBar.k6.a7);
        int themedColor2 = lp0Var.getThemedColor(org.telegram.ui.ActionBar.k6.z6);
        int themedColor3 = lp0Var.getThemedColor(org.telegram.ui.ActionBar.k6.G6);
        kp0Var.v.setColor(themedColor);
        kp0Var.x = org.telegram.ui.ActionBar.k6.o1(0.06f, themedColor3);
        kp0Var.y = themedColor2;
        kp0Var.E = themedColor3;
        k10 k10Var = kp0Var.a;
        for (int i11 = 0; i11 < k10Var.getChildCount(); i11++) {
            View childAt = k10Var.getChildAt(i11);
            int R = RecyclerView.R(childAt);
            if (R != -1 && (childAt instanceof TextView)) {
                ((TextView) childAt).setTextColor(R == kp0Var.d ? kp0Var.E : kp0Var.y);
                childAt.invalidate();
            }
        }
        k10Var.invalidate();
        kp0Var.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = this.m0;
        View view = this.w;
        wo0 wo0Var = this.b;
        if (i12 == 1) {
            super.onMeasure(i10, i11);
            ap0 ap0Var = this.v;
            this.n0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ap0Var.getMeasuredHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) ap0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) wo0Var.getLayoutParams()).topMargin = this.n0 - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.x.getLayoutParams()).topMargin = this.n0 - AndroidUtilities.dp(16.0f);
            wo0Var.setPadding(wo0Var.getPaddingLeft(), AndroidUtilities.dp(16.0f), wo0Var.getPaddingRight(), wo0Var.getPaddingBottom());
        } else {
            this.n0 = AndroidUtilities.dp(230.0f) + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) wo0Var.getLayoutParams()).topMargin = this.n0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).height = this.n0;
        }
        super.onMeasure(i10, i11);
    }
}
