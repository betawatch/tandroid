package di;

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
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class w1 extends kl0 {
    public String e;
    public TLRPC.User f;
    public String h;
    public boolean n;
    public final /* synthetic */ z1 s;
    public final bi.oa c = new bi.oa(this, 17);
    public int d = -1;
    public boolean r = false;

    public w1(z1 z1Var) {
        this.s = z1Var;
    }

    public static void E(w1 w1Var, boolean z10) {
        int i10;
        z1 z1Var = w1Var.s;
        ArrayList arrayList = z1Var.h;
        arrayList.clear();
        i10 = ((org.telegram.ui.ActionBar.f3) z1Var.r).currentAccount;
        arrayList.addAll(MediaDataController.getInstance(i10).getRecentGifs());
        if (z10) {
            w1Var.l();
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 2;
    }

    public final Object F(int i10) {
        int i11 = i10 - 1;
        z1 z1Var = this.s;
        if (!z1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            if (i11 >= 0 && i11 < z1Var.h.size()) {
                return z1Var.h.get(i11);
            }
            i11 -= z1Var.h.size();
        }
        if (z1Var.n.isEmpty()) {
            return null;
        }
        if (!z1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            i11--;
        }
        if (i11 < 0 || i11 >= z1Var.n.size()) {
            return null;
        }
        return z1Var.n.get(i11);
    }

    public final void G() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        z1 z1Var = this.s;
        t2 t2Var = z1Var.r;
        if (this.r) {
            return;
        }
        this.r = true;
        z1Var.d.c(true);
        if (this.d >= 0) {
            i16 = ((org.telegram.ui.ActionBar.f3) t2Var).currentAccount;
            ConnectionsManager.getInstance(i16).cancelRequest(this.d, true);
            this.d = -1;
        }
        if (this.f == null) {
            i14 = ((org.telegram.ui.ActionBar.f3) t2Var).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i14);
            i15 = ((org.telegram.ui.ActionBar.f3) t2Var).currentAccount;
            TLObject userOrChat = messagesController.getUserOrChat(MessagesController.getInstance(i15).gifSearchBot);
            if (userOrChat instanceof TLRPC.User) {
                this.f = (TLRPC.User) userOrChat;
            }
        }
        TLRPC.User user = this.f;
        if (user == null && !this.n) {
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            i12 = ((org.telegram.ui.ActionBar.f3) t2Var).currentAccount;
            tL_contacts_resolveUsername.username = MessagesController.getInstance(i12).gifSearchBot;
            i13 = ((org.telegram.ui.ActionBar.f3) t2Var).currentAccount;
            this.d = ConnectionsManager.getInstance(i13).sendRequest(tL_contacts_resolveUsername, new bi.v7(this, 3));
            return;
        }
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        i10 = ((org.telegram.ui.ActionBar.f3) t2Var).currentAccount;
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
        i11 = ((org.telegram.ui.ActionBar.f3) t2Var).currentAccount;
        MessagesStorage.getInstance(i11).getBotCache(str3, new t1(this, isEmpty, tL_messages_getInlineBotResults, str3));
    }

    public final void H(String str) {
        int i10;
        z1 z1Var = this.s;
        l2 l2Var = z1Var.d;
        if (!TextUtils.equals(this.e, str)) {
            if (this.d != -1) {
                i10 = ((org.telegram.ui.ActionBar.f3) z1Var.r).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(this.d, true);
                this.d = -1;
            }
            this.r = false;
            this.h = "";
        }
        boolean isEmpty = TextUtils.isEmpty(this.e);
        this.e = str;
        bi.oa oaVar = this.c;
        AndroidUtilities.cancelRunOnUIThread(oaVar);
        if (TextUtils.isEmpty(str)) {
            z1Var.n.clear();
            l2Var.c(false);
            l();
        } else {
            if (isEmpty) {
                l();
            }
            l2Var.c(true);
            AndroidUtilities.runOnUIThread(oaVar, 1500L);
        }
    }

    @Override // s4.h0
    public final int h() {
        z1 z1Var = this.s;
        int i10 = 0;
        int size = ((z1Var.h.isEmpty() || !TextUtils.isEmpty(this.e)) ? 0 : z1Var.h.size()) + 1;
        if (!z1Var.n.isEmpty()) {
            if (!z1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
                i10 = 1;
            }
            i10 += z1Var.n.size();
        }
        return size + i10;
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = i10 - 1;
        z1 z1Var = this.s;
        if (!z1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            i11 -= z1Var.h.size();
        }
        return (z1Var.n.isEmpty() || z1Var.h.isEmpty() || !TextUtils.isEmpty(this.e) || i11 != 0) ? 2 : 1;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            view.setTag(34);
            view.setLayoutParams(new s4.p0(-1, (int) this.s.r.n));
            return;
        }
        if (i11 == 2) {
            org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
            Object F = F(i10);
            if (!(F instanceof TLRPC.Document)) {
                if (F instanceof TLRPC.BotInlineResult) {
                    e2Var.e((TLRPC.BotInlineResult) F, this.f, true, false, false, true);
                }
            } else {
                TLRPC.Document document = (TLRPC.Document) F;
                e2Var.getClass();
                e2Var.d(0, document, "gif" + document);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View, org.telegram.ui.Cells.o8] */
    /* JADX WARN: Type inference failed for: r9v10, types: [android.view.View] */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.Cells.e2 e2Var;
        z1 z1Var = this.s;
        if (i10 == 0) {
            e2Var = new View(z1Var.getContext());
        } else if (i10 == 1) {
            Context context = z1Var.getContext();
            f6Var = ((org.telegram.ui.ActionBar.f3) z1Var.r).resourcesProvider;
            ?? o8Var = new org.telegram.ui.Cells.o8(context, false, false, f6Var, false);
            o8Var.b(0, LocaleController.getString(R.string.FeaturedGifs));
            s4.p0 p0Var = new s4.p0(-1, -2);
            ((ViewGroup.MarginLayoutParams) p0Var).topMargin = AndroidUtilities.dp(2.5f);
            ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin = AndroidUtilities.dp(5.5f);
            o8Var.setLayoutParams(p0Var);
            e2Var = o8Var;
        } else {
            org.telegram.ui.Cells.e2 e2Var2 = new org.telegram.ui.Cells.e2(z1Var.getContext());
            e2Var2.getPhotoImage().setLayerNum(7);
            if (e2Var2.c0 == null) {
                org.telegram.ui.Components.zc zcVar = new org.telegram.ui.Components.zc(e2Var2, 1.0f, 3.0f);
                zcVar.e = 120L;
                e2Var2.c0 = zcVar;
            }
            e2Var2.setIsKeyboard(true);
            e2Var2.setCanPreviewGif(true);
            e2Var = e2Var2;
        }
        return new vk0(e2Var);
    }
}
