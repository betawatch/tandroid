package kh;

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
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class u1 extends vk0 {
    public String e;
    public TLRPC.User f;
    public String h;
    public boolean n;
    public final /* synthetic */ w1 s;
    public final f1 c = new f1(this, 1);
    public int d = -1;
    public boolean r = false;

    public u1(w1 w1Var) {
        this.s = w1Var;
    }

    public static void E(u1 u1Var, boolean z10) {
        int i9;
        w1 w1Var = u1Var.s;
        ArrayList arrayList = w1Var.h;
        arrayList.clear();
        i9 = ((org.telegram.ui.ActionBar.f3) w1Var.r).currentAccount;
        arrayList.addAll(MediaDataController.getInstance(i9).getRecentGifs());
        if (z10) {
            u1Var.l();
        }
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return q1Var.f == 2;
    }

    public final Object F(int i9) {
        int i10 = i9 - 1;
        w1 w1Var = this.s;
        if (!w1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            if (i10 >= 0 && i10 < w1Var.h.size()) {
                return w1Var.h.get(i10);
            }
            i10 -= w1Var.h.size();
        }
        if (w1Var.n.isEmpty()) {
            return null;
        }
        if (!w1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            i10--;
        }
        if (i10 < 0 || i10 >= w1Var.n.size()) {
            return null;
        }
        return w1Var.n.get(i10);
    }

    public final void G() {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        w1 w1Var = this.s;
        n2 n2Var = w1Var.r;
        if (this.r) {
            return;
        }
        this.r = true;
        w1Var.d.c(true);
        if (this.d >= 0) {
            i15 = ((org.telegram.ui.ActionBar.f3) n2Var).currentAccount;
            ConnectionsManager.getInstance(i15).cancelRequest(this.d, true);
            this.d = -1;
        }
        if (this.f == null) {
            i13 = ((org.telegram.ui.ActionBar.f3) n2Var).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i13);
            i14 = ((org.telegram.ui.ActionBar.f3) n2Var).currentAccount;
            TLObject userOrChat = messagesController.getUserOrChat(MessagesController.getInstance(i14).gifSearchBot);
            if (userOrChat instanceof TLRPC.User) {
                this.f = (TLRPC.User) userOrChat;
            }
        }
        TLRPC.User user = this.f;
        if (user == null && !this.n) {
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            i11 = ((org.telegram.ui.ActionBar.f3) n2Var).currentAccount;
            tL_contacts_resolveUsername.username = MessagesController.getInstance(i11).gifSearchBot;
            i12 = ((org.telegram.ui.ActionBar.f3) n2Var).currentAccount;
            this.d = ConnectionsManager.getInstance(i12).sendRequest(tL_contacts_resolveUsername, new bf.a(this, 14));
            return;
        }
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        i9 = ((org.telegram.ui.ActionBar.f3) n2Var).currentAccount;
        tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i9).getInputUser(this.f);
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
        i10 = ((org.telegram.ui.ActionBar.f3) n2Var).currentAccount;
        MessagesStorage.getInstance(i10).getBotCache(str3, new t1(this, isEmpty, tL_messages_getInlineBotResults, str3));
    }

    public final void H(String str) {
        int i9;
        w1 w1Var = this.s;
        g2 g2Var = w1Var.d;
        if (!TextUtils.equals(this.e, str)) {
            if (this.d != -1) {
                i9 = ((org.telegram.ui.ActionBar.f3) w1Var.r).currentAccount;
                ConnectionsManager.getInstance(i9).cancelRequest(this.d, true);
                this.d = -1;
            }
            this.r = false;
            this.h = "";
        }
        boolean isEmpty = TextUtils.isEmpty(this.e);
        this.e = str;
        f1 f1Var = this.c;
        AndroidUtilities.cancelRunOnUIThread(f1Var);
        if (TextUtils.isEmpty(str)) {
            w1Var.n.clear();
            g2Var.c(false);
            l();
        } else {
            if (isEmpty) {
                l();
            }
            g2Var.c(true);
            AndroidUtilities.runOnUIThread(f1Var, 1500L);
        }
    }

    @Override // f2.r0
    public final int h() {
        w1 w1Var = this.s;
        int i9 = 0;
        int size = ((w1Var.h.isEmpty() || !TextUtils.isEmpty(this.e)) ? 0 : w1Var.h.size()) + 1;
        if (!w1Var.n.isEmpty()) {
            if (!w1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
                i9 = 1;
            }
            i9 += w1Var.n.size();
        }
        return size + i9;
    }

    @Override // f2.r0
    public final int j(int i9) {
        if (i9 == 0) {
            return 0;
        }
        int i10 = i9 - 1;
        w1 w1Var = this.s;
        if (!w1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            i10 -= w1Var.h.size();
        }
        return (w1Var.n.isEmpty() || w1Var.h.isEmpty() || !TextUtils.isEmpty(this.e) || i10 != 0) ? 2 : 1;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        int i10 = q1Var.f;
        View view = q1Var.a;
        if (i10 == 0) {
            view.setTag(34);
            view.setLayoutParams(new f2.a1(-1, (int) this.s.r.n));
            return;
        }
        if (i10 == 2) {
            org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
            Object F = F(i9);
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
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View, org.telegram.ui.Cells.m8] */
    /* JADX WARN: Type inference failed for: r9v10, types: [android.view.View] */
    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.Cells.e2 e2Var;
        w1 w1Var = this.s;
        if (i9 == 0) {
            e2Var = new View(w1Var.getContext());
        } else if (i9 == 1) {
            Context context = w1Var.getContext();
            b6Var = ((org.telegram.ui.ActionBar.f3) w1Var.r).resourcesProvider;
            ?? m8Var = new org.telegram.ui.Cells.m8(context, false, false, b6Var, false);
            m8Var.b(0, LocaleController.getString(R.string.FeaturedGifs));
            f2.a1 a1Var = new f2.a1(-1, -2);
            ((ViewGroup.MarginLayoutParams) a1Var).topMargin = AndroidUtilities.dp(2.5f);
            ((ViewGroup.MarginLayoutParams) a1Var).bottomMargin = AndroidUtilities.dp(5.5f);
            m8Var.setLayoutParams(a1Var);
            e2Var = m8Var;
        } else {
            org.telegram.ui.Cells.e2 e2Var2 = new org.telegram.ui.Cells.e2(w1Var.getContext());
            e2Var2.getPhotoImage().setLayerNum(7);
            if (e2Var2.V == null) {
                org.telegram.ui.Components.pc pcVar = new org.telegram.ui.Components.pc(e2Var2, 1.0f, 3.0f);
                pcVar.e = 120L;
                e2Var2.V = pcVar;
            }
            e2Var2.setIsKeyboard(true);
            e2Var2.setCanPreviewGif(true);
            e2Var = e2Var2;
        }
        return new ik0(e2Var);
    }
}
