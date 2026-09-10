package bi;

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
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.ul0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class h2 extends ul0 {
    public String e;
    public TLRPC.User f;
    public String h;
    public boolean n;
    public final /* synthetic */ k2 s;
    public final a3.d c = new a3.d(this, 17);
    public int d = -1;
    public boolean r = false;

    public h2(k2 k2Var) {
        this.s = k2Var;
    }

    public static void E(h2 h2Var, boolean z10) {
        int i10;
        k2 k2Var = h2Var.s;
        ArrayList arrayList = k2Var.h;
        arrayList.clear();
        i10 = ((org.telegram.ui.ActionBar.h3) k2Var.r).currentAccount;
        arrayList.addAll(MediaDataController.getInstance(i10).getRecentGifs());
        if (z10) {
            h2Var.l();
        }
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 2;
    }

    public final Object F(int i10) {
        int i11 = i10 - 1;
        k2 k2Var = this.s;
        if (!k2Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            if (i11 >= 0 && i11 < k2Var.h.size()) {
                return k2Var.h.get(i11);
            }
            i11 -= k2Var.h.size();
        }
        if (k2Var.n.isEmpty()) {
            return null;
        }
        if (!k2Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            i11--;
        }
        if (i11 < 0 || i11 >= k2Var.n.size()) {
            return null;
        }
        return k2Var.n.get(i11);
    }

    public final void G() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        k2 k2Var = this.s;
        f3 f3Var = k2Var.r;
        if (this.r) {
            return;
        }
        this.r = true;
        k2Var.d.c(true);
        if (this.d >= 0) {
            i16 = ((org.telegram.ui.ActionBar.h3) f3Var).currentAccount;
            ConnectionsManager.getInstance(i16).cancelRequest(this.d, true);
            this.d = -1;
        }
        if (this.f == null) {
            i14 = ((org.telegram.ui.ActionBar.h3) f3Var).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i14);
            i15 = ((org.telegram.ui.ActionBar.h3) f3Var).currentAccount;
            TLObject userOrChat = messagesController.getUserOrChat(MessagesController.getInstance(i15).gifSearchBot);
            if (userOrChat instanceof TLRPC.User) {
                this.f = (TLRPC.User) userOrChat;
            }
        }
        TLRPC.User user = this.f;
        if (user == null && !this.n) {
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            i12 = ((org.telegram.ui.ActionBar.h3) f3Var).currentAccount;
            tL_contacts_resolveUsername.username = MessagesController.getInstance(i12).gifSearchBot;
            i13 = ((org.telegram.ui.ActionBar.h3) f3Var).currentAccount;
            this.d = ConnectionsManager.getInstance(i13).sendRequest(tL_contacts_resolveUsername, new c2(this, 0));
            return;
        }
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        i10 = ((org.telegram.ui.ActionBar.h3) f3Var).currentAccount;
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
        i11 = ((org.telegram.ui.ActionBar.h3) f3Var).currentAccount;
        MessagesStorage.getInstance(i11).getBotCache(str3, new d2(this, isEmpty, tL_messages_getInlineBotResults, str3));
    }

    public final void H(String str) {
        int i10;
        k2 k2Var = this.s;
        x2 x2Var = k2Var.d;
        if (!TextUtils.equals(this.e, str)) {
            if (this.d != -1) {
                i10 = ((org.telegram.ui.ActionBar.h3) k2Var.r).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(this.d, true);
                this.d = -1;
            }
            this.r = false;
            this.h = "";
        }
        boolean isEmpty = TextUtils.isEmpty(this.e);
        this.e = str;
        a3.d dVar = this.c;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        if (TextUtils.isEmpty(str)) {
            k2Var.n.clear();
            x2Var.c(false);
            l();
        } else {
            if (isEmpty) {
                l();
            }
            x2Var.c(true);
            AndroidUtilities.runOnUIThread(dVar, 1500L);
        }
    }

    @Override // s4.h0
    public final int h() {
        k2 k2Var = this.s;
        int i10 = 0;
        int size = ((k2Var.h.isEmpty() || !TextUtils.isEmpty(this.e)) ? 0 : k2Var.h.size()) + 1;
        if (!k2Var.n.isEmpty()) {
            if (!k2Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
                i10 = 1;
            }
            i10 += k2Var.n.size();
        }
        return size + i10;
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = i10 - 1;
        k2 k2Var = this.s;
        if (!k2Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            i11 -= k2Var.h.size();
        }
        return (k2Var.n.isEmpty() || k2Var.h.isEmpty() || !TextUtils.isEmpty(this.e) || i11 != 0) ? 2 : 1;
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
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View, org.telegram.ui.Cells.p8] */
    /* JADX WARN: Type inference failed for: r9v10, types: [android.view.View] */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.Cells.e2 e2Var;
        k2 k2Var = this.s;
        if (i10 == 0) {
            e2Var = new View(k2Var.getContext());
        } else if (i10 == 1) {
            Context context = k2Var.getContext();
            f6Var = ((org.telegram.ui.ActionBar.h3) k2Var.r).resourcesProvider;
            ?? p8Var = new org.telegram.ui.Cells.p8(context, false, false, f6Var, false);
            p8Var.b(0, LocaleController.getString(R.string.FeaturedGifs));
            s4.p0 p0Var = new s4.p0(-1, -2);
            ((ViewGroup.MarginLayoutParams) p0Var).topMargin = AndroidUtilities.dp(2.5f);
            ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin = AndroidUtilities.dp(5.5f);
            p8Var.setLayoutParams(p0Var);
            e2Var = p8Var;
        } else {
            org.telegram.ui.Cells.e2 e2Var2 = new org.telegram.ui.Cells.e2(k2Var.getContext());
            e2Var2.getPhotoImage().setLayerNum(7);
            if (e2Var2.c0 == null) {
                org.telegram.ui.Components.xc xcVar = new org.telegram.ui.Components.xc(e2Var2, 1.0f, 3.0f);
                xcVar.e = 120L;
                e2Var2.c0 = xcVar;
            }
            e2Var2.setIsKeyboard(true);
            e2Var2.setCanPreviewGif(true);
            e2Var = e2Var2;
        }
        return new fl0(e2Var);
    }
}
