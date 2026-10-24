package ei;

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
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.yc;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class t1 extends lm0 {
    public String e;
    public TLRPC.User f;
    public String h;
    public boolean n;
    public final /* synthetic */ v1 s;
    public final com.google.firebase.messaging.s c = new com.google.firebase.messaging.s(this, 11);
    public int d = -1;
    public boolean r = false;

    public t1(v1 v1Var) {
        this.s = v1Var;
    }

    public static void E(t1 t1Var, boolean z10) {
        int i10;
        v1 v1Var = t1Var.s;
        ArrayList arrayList = v1Var.h;
        arrayList.clear();
        i10 = ((org.telegram.ui.ActionBar.h3) v1Var.r).currentAccount;
        arrayList.addAll(MediaDataController.getInstance(i10).getRecentGifs());
        if (z10) {
            t1Var.l();
        }
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return b1Var.f == 2;
    }

    public final Object F(int i10) {
        int i11 = i10 - 1;
        v1 v1Var = this.s;
        if (!v1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            if (i11 >= 0 && i11 < v1Var.h.size()) {
                return v1Var.h.get(i11);
            }
            i11 -= v1Var.h.size();
        }
        if (v1Var.n.isEmpty()) {
            return null;
        }
        if (!v1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            i11--;
        }
        if (i11 < 0 || i11 >= v1Var.n.size()) {
            return null;
        }
        return v1Var.n.get(i11);
    }

    public final void G() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        v1 v1Var = this.s;
        n2 n2Var = v1Var.r;
        if (this.r) {
            return;
        }
        this.r = true;
        v1Var.d.c(true);
        if (this.d >= 0) {
            i16 = ((org.telegram.ui.ActionBar.h3) n2Var).currentAccount;
            ConnectionsManager.getInstance(i16).cancelRequest(this.d, true);
            this.d = -1;
        }
        if (this.f == null) {
            i14 = ((org.telegram.ui.ActionBar.h3) n2Var).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i14);
            i15 = ((org.telegram.ui.ActionBar.h3) n2Var).currentAccount;
            TLObject userOrChat = messagesController.getUserOrChat(MessagesController.getInstance(i15).gifSearchBot);
            if (userOrChat instanceof TLRPC.User) {
                this.f = (TLRPC.User) userOrChat;
            }
        }
        TLRPC.User user = this.f;
        if (user == null && !this.n) {
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            i12 = ((org.telegram.ui.ActionBar.h3) n2Var).currentAccount;
            tL_contacts_resolveUsername.username = MessagesController.getInstance(i12).gifSearchBot;
            i13 = ((org.telegram.ui.ActionBar.h3) n2Var).currentAccount;
            this.d = ConnectionsManager.getInstance(i13).sendRequest(tL_contacts_resolveUsername, new ai.h(this, 9));
            return;
        }
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        i10 = ((org.telegram.ui.ActionBar.h3) n2Var).currentAccount;
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
        i11 = ((org.telegram.ui.ActionBar.h3) n2Var).currentAccount;
        MessagesStorage.getInstance(i11).getBotCache(str3, new ai.i4(this, isEmpty, tL_messages_getInlineBotResults, str3));
    }

    public final void H(String str) {
        int i10;
        v1 v1Var = this.s;
        h2 h2Var = v1Var.d;
        if (!TextUtils.equals(this.e, str)) {
            if (this.d != -1) {
                i10 = ((org.telegram.ui.ActionBar.h3) v1Var.r).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(this.d, true);
                this.d = -1;
            }
            this.r = false;
            this.h = "";
        }
        boolean isEmpty = TextUtils.isEmpty(this.e);
        this.e = str;
        com.google.firebase.messaging.s sVar = this.c;
        AndroidUtilities.cancelRunOnUIThread(sVar);
        if (TextUtils.isEmpty(str)) {
            v1Var.n.clear();
            h2Var.c(false);
            l();
        } else {
            if (isEmpty) {
                l();
            }
            h2Var.c(true);
            AndroidUtilities.runOnUIThread(sVar, 1500L);
        }
    }

    @Override // s4.g0
    public final int h() {
        v1 v1Var = this.s;
        int i10 = 0;
        int size = ((v1Var.h.isEmpty() || !TextUtils.isEmpty(this.e)) ? 0 : v1Var.h.size()) + 1;
        if (!v1Var.n.isEmpty()) {
            if (!v1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
                i10 = 1;
            }
            i10 += v1Var.n.size();
        }
        return size + i10;
    }

    @Override // s4.g0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = i10 - 1;
        v1 v1Var = this.s;
        if (!v1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            i11 -= v1Var.h.size();
        }
        return (v1Var.n.isEmpty() || v1Var.h.isEmpty() || !TextUtils.isEmpty(this.e) || i11 != 0) ? 2 : 1;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11 = b1Var.f;
        View view = b1Var.a;
        if (i11 == 0) {
            view.setTag(34);
            view.setLayoutParams(new s4.o0(-1, (int) this.s.r.n));
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
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.Cells.e2 e2Var;
        v1 v1Var = this.s;
        if (i10 == 0) {
            e2Var = new View(v1Var.getContext());
        } else if (i10 == 1) {
            Context context = v1Var.getContext();
            g6Var = ((org.telegram.ui.ActionBar.h3) v1Var.r).resourcesProvider;
            ?? o8Var = new org.telegram.ui.Cells.o8(context, false, false, g6Var, false);
            o8Var.a(0, LocaleController.getString(R.string.FeaturedGifs));
            s4.o0 o0Var = new s4.o0(-1, -2);
            ((ViewGroup.MarginLayoutParams) o0Var).topMargin = AndroidUtilities.dp(2.5f);
            ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin = AndroidUtilities.dp(5.5f);
            o8Var.setLayoutParams(o0Var);
            e2Var = o8Var;
        } else {
            org.telegram.ui.Cells.e2 e2Var2 = new org.telegram.ui.Cells.e2(v1Var.getContext());
            e2Var2.getPhotoImage().setLayerNum(7);
            if (e2Var2.c0 == null) {
                yc ycVar = new yc(e2Var2, 1.0f, 3.0f);
                ycVar.e = 120L;
                e2Var2.c0 = ycVar;
            }
            e2Var2.setIsKeyboard(true);
            e2Var2.setCanPreviewGif(true);
            e2Var = e2Var2;
        }
        return new wl0(e2Var);
    }
}
