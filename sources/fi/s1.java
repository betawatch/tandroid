package fi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class s1 extends mm0 {
    public String e;
    public TLRPC.User f;
    public String h;
    public boolean n;
    public final /* synthetic */ u1 s;
    public final di.s8 c = new di.s8(this, 15);
    public int d = -1;
    public boolean r = false;

    public s1(u1 u1Var) {
        this.s = u1Var;
    }

    public static void E(s1 s1Var, boolean z10) {
        int i10;
        u1 u1Var = s1Var.s;
        ArrayList arrayList = u1Var.h;
        arrayList.clear();
        i10 = ((org.telegram.ui.ActionBar.k3) u1Var.r).currentAccount;
        arrayList.addAll(MediaDataController.getInstance(i10).getRecentGifs());
        if (z10) {
            s1Var.l();
        }
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return e1Var.f == 2;
    }

    public final Object F(int i10) {
        int i11 = i10 - 1;
        u1 u1Var = this.s;
        if (!u1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            if (i11 >= 0 && i11 < u1Var.h.size()) {
                return u1Var.h.get(i11);
            }
            i11 -= u1Var.h.size();
        }
        if (u1Var.n.isEmpty()) {
            return null;
        }
        if (!u1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            i11--;
        }
        if (i11 < 0 || i11 >= u1Var.n.size()) {
            return null;
        }
        return u1Var.n.get(i11);
    }

    public final void G() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        u1 u1Var = this.s;
        l2 l2Var = u1Var.r;
        if (this.r) {
            return;
        }
        this.r = true;
        u1Var.d.c(true);
        if (this.d >= 0) {
            i16 = ((org.telegram.ui.ActionBar.k3) l2Var).currentAccount;
            ConnectionsManager.getInstance(i16).cancelRequest(this.d, true);
            this.d = -1;
        }
        if (this.f == null) {
            i14 = ((org.telegram.ui.ActionBar.k3) l2Var).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i14);
            i15 = ((org.telegram.ui.ActionBar.k3) l2Var).currentAccount;
            TLObject userOrChat = messagesController.getUserOrChat(MessagesController.getInstance(i15).gifSearchBot);
            if (userOrChat instanceof TLRPC.User) {
                this.f = (TLRPC.User) userOrChat;
            }
        }
        TLRPC.User user = this.f;
        if (user == null && !this.n) {
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            i12 = ((org.telegram.ui.ActionBar.k3) l2Var).currentAccount;
            tL_contacts_resolveUsername.username = MessagesController.getInstance(i12).gifSearchBot;
            i13 = ((org.telegram.ui.ActionBar.k3) l2Var).currentAccount;
            this.d = ConnectionsManager.getInstance(i13).sendRequest(tL_contacts_resolveUsername, new bi.i0(this, 8));
            return;
        }
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        i10 = ((org.telegram.ui.ActionBar.k3) l2Var).currentAccount;
        tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i10).getInputUser(this.f);
        String str = this.e;
        if (str == null) {
            str = "";
        }
        tL_messages_getInlineBotResults.query = str;
        boolean isEmpty = TextUtils.isEmpty(this.h);
        String str2 = this.h;
        tL_messages_getInlineBotResults.offset = str2 != null ? str2 : "";
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        String str3 = "gif_search_" + tL_messages_getInlineBotResults.query + "_" + tL_messages_getInlineBotResults.offset;
        i11 = ((org.telegram.ui.ActionBar.k3) l2Var).currentAccount;
        MessagesStorage.getInstance(i11).getBotCache(str3, new bi.d4(this, isEmpty, tL_messages_getInlineBotResults, str3));
    }

    public final void H(String str) {
        int i10;
        u1 u1Var = this.s;
        f2 f2Var = u1Var.d;
        if (!TextUtils.equals(this.e, str)) {
            if (this.d != -1) {
                i10 = ((org.telegram.ui.ActionBar.k3) u1Var.r).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(this.d, true);
                this.d = -1;
            }
            this.r = false;
            this.h = "";
        }
        boolean isEmpty = TextUtils.isEmpty(this.e);
        this.e = str;
        di.s8 s8Var = this.c;
        AndroidUtilities.cancelRunOnUIThread(s8Var);
        if (TextUtils.isEmpty(str)) {
            u1Var.n.clear();
            f2Var.c(false);
            l();
        } else {
            if (isEmpty) {
                l();
            }
            f2Var.c(true);
            AndroidUtilities.runOnUIThread(s8Var, 1500L);
        }
    }

    @Override // s4.h0
    public final int h() {
        u1 u1Var = this.s;
        int i10 = 0;
        int size = ((u1Var.h.isEmpty() || !TextUtils.isEmpty(this.e)) ? 0 : u1Var.h.size()) + 1;
        if (!u1Var.n.isEmpty()) {
            if (!u1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
                i10 = 1;
            }
            i10 += u1Var.n.size();
        }
        return size + i10;
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = i10 - 1;
        u1 u1Var = this.s;
        if (!u1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            i11 -= u1Var.h.size();
        }
        return (u1Var.n.isEmpty() || u1Var.h.isEmpty() || !TextUtils.isEmpty(this.e) || i11 != 0) ? 2 : 1;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        int i11 = e1Var.f;
        View view = e1Var.a;
        if (i11 == 0) {
            view.setTag(34);
            view.setLayoutParams(new s4.q0(-1, (int) this.s.r.n));
            return;
        }
        if (i11 == 2) {
            org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) view;
            Object F = F(i10);
            if (!(F instanceof TLRPC.Document)) {
                if (F instanceof TLRPC.BotInlineResult) {
                    d2Var.e((TLRPC.BotInlineResult) F, this.f, true, false, false, true);
                }
            } else {
                TLRPC.Document document = (TLRPC.Document) F;
                d2Var.getClass();
                d2Var.d(0, document, "gif" + document);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View, org.telegram.ui.Cells.s8] */
    /* JADX WARN: Type inference failed for: r9v10, types: [android.view.View] */
    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.Cells.d2 d2Var;
        u1 u1Var = this.s;
        if (i10 == 0) {
            d2Var = new View(u1Var.getContext());
        } else if (i10 == 1) {
            Context context = u1Var.getContext();
            u6Var = ((org.telegram.ui.ActionBar.k3) u1Var.r).resourcesProvider;
            ?? s8Var = new org.telegram.ui.Cells.s8(context, false, false, u6Var, false);
            s8Var.a(0, LocaleController.getString(R.string.FeaturedGifs));
            s4.q0 q0Var = new s4.q0(-1, -2);
            ((ViewGroup.MarginLayoutParams) q0Var).topMargin = AndroidUtilities.dp(2.5f);
            ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin = AndroidUtilities.dp(5.5f);
            s8Var.setLayoutParams(q0Var);
            d2Var = s8Var;
        } else {
            org.telegram.ui.Cells.d2 d2Var2 = new org.telegram.ui.Cells.d2(u1Var.getContext());
            d2Var2.getPhotoImage().setLayerNum(7);
            if (d2Var2.d0 == null) {
                xc xcVar = new xc(d2Var2, 1.0f, 3.0f);
                xcVar.e = 120L;
                d2Var2.d0 = xcVar;
            }
            d2Var2.setIsKeyboard(true);
            d2Var2.setCanPreviewGif(true);
            d2Var = d2Var2;
        }
        return new wl0(d2Var);
    }
}
