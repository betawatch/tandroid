package ci;

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
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.pm0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class v1 extends pm0 {
    public String e;
    public TLRPC.User f;
    public String h;
    public boolean n;
    public final /* synthetic */ y1 s;
    public final androidx.fragment.app.a0 c = new androidx.fragment.app.a0(this, 11);
    public int d = -1;
    public boolean r = false;

    public v1(y1 y1Var) {
        this.s = y1Var;
    }

    public static void E(v1 v1Var, boolean z10) {
        int i10;
        y1 y1Var = v1Var.s;
        ArrayList arrayList = y1Var.h;
        arrayList.clear();
        i10 = ((org.telegram.ui.ActionBar.f3) y1Var.r).currentAccount;
        arrayList.addAll(MediaDataController.getInstance(i10).getRecentGifs());
        if (z10) {
            v1Var.l();
        }
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        return d1Var.f == 2;
    }

    public final Object F(int i10) {
        int i11 = i10 - 1;
        y1 y1Var = this.s;
        if (!y1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            if (i11 >= 0 && i11 < y1Var.h.size()) {
                return y1Var.h.get(i11);
            }
            i11 -= y1Var.h.size();
        }
        if (y1Var.n.isEmpty()) {
            return null;
        }
        if (!y1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            i11--;
        }
        if (i11 < 0 || i11 >= y1Var.n.size()) {
            return null;
        }
        return y1Var.n.get(i11);
    }

    public final void G() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        y1 y1Var = this.s;
        r2 r2Var = y1Var.r;
        if (this.r) {
            return;
        }
        this.r = true;
        y1Var.d.c(true);
        if (this.d >= 0) {
            i16 = ((org.telegram.ui.ActionBar.f3) r2Var).currentAccount;
            ConnectionsManager.getInstance(i16).cancelRequest(this.d, true);
            this.d = -1;
        }
        if (this.f == null) {
            i14 = ((org.telegram.ui.ActionBar.f3) r2Var).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i14);
            i15 = ((org.telegram.ui.ActionBar.f3) r2Var).currentAccount;
            TLObject userOrChat = messagesController.getUserOrChat(MessagesController.getInstance(i15).gifSearchBot);
            if (userOrChat instanceof TLRPC.User) {
                this.f = (TLRPC.User) userOrChat;
            }
        }
        TLRPC.User user = this.f;
        if (user == null && !this.n) {
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            i12 = ((org.telegram.ui.ActionBar.f3) r2Var).currentAccount;
            tL_contacts_resolveUsername.username = MessagesController.getInstance(i12).gifSearchBot;
            i13 = ((org.telegram.ui.ActionBar.f3) r2Var).currentAccount;
            this.d = ConnectionsManager.getInstance(i13).sendRequest(tL_contacts_resolveUsername, new ai.o8(this, 3));
            return;
        }
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        i10 = ((org.telegram.ui.ActionBar.f3) r2Var).currentAccount;
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
        i11 = ((org.telegram.ui.ActionBar.f3) r2Var).currentAccount;
        MessagesStorage.getInstance(i11).getBotCache(str3, new s1(this, isEmpty, tL_messages_getInlineBotResults, str3));
    }

    public final void H(String str) {
        int i10;
        y1 y1Var = this.s;
        k2 k2Var = y1Var.d;
        if (!TextUtils.equals(this.e, str)) {
            if (this.d != -1) {
                i10 = ((org.telegram.ui.ActionBar.f3) y1Var.r).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(this.d, true);
                this.d = -1;
            }
            this.r = false;
            this.h = "";
        }
        boolean isEmpty = TextUtils.isEmpty(this.e);
        this.e = str;
        androidx.fragment.app.a0 a0Var = this.c;
        AndroidUtilities.cancelRunOnUIThread(a0Var);
        if (TextUtils.isEmpty(str)) {
            y1Var.n.clear();
            k2Var.c(false);
            l();
        } else {
            if (isEmpty) {
                l();
            }
            k2Var.c(true);
            AndroidUtilities.runOnUIThread(a0Var, 1500L);
        }
    }

    @Override // s4.i0
    public final int h() {
        y1 y1Var = this.s;
        int i10 = 0;
        int size = ((y1Var.h.isEmpty() || !TextUtils.isEmpty(this.e)) ? 0 : y1Var.h.size()) + 1;
        if (!y1Var.n.isEmpty()) {
            if (!y1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
                i10 = 1;
            }
            i10 += y1Var.n.size();
        }
        return size + i10;
    }

    @Override // s4.i0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = i10 - 1;
        y1 y1Var = this.s;
        if (!y1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            i11 -= y1Var.h.size();
        }
        return (y1Var.n.isEmpty() || y1Var.h.isEmpty() || !TextUtils.isEmpty(this.e) || i11 != 0) ? 2 : 1;
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        int i11 = d1Var.f;
        View view = d1Var.a;
        if (i11 == 0) {
            view.setTag(34);
            view.setLayoutParams(new s4.q0(-1, (int) this.s.r.n));
            return;
        }
        if (i11 == 2) {
            org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
            Object F = F(i10);
            if (!(F instanceof TLRPC.Document)) {
                if (F instanceof TLRPC.BotInlineResult) {
                    f2Var.e((TLRPC.BotInlineResult) F, this.f, true, false, false, true);
                }
            } else {
                TLRPC.Document document = (TLRPC.Document) F;
                f2Var.getClass();
                f2Var.d(0, document, "gif" + document);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View, org.telegram.ui.Cells.o8] */
    /* JADX WARN: Type inference failed for: r9v10, types: [android.view.View] */
    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.Cells.f2 f2Var;
        y1 y1Var = this.s;
        if (i10 == 0) {
            f2Var = new View(y1Var.getContext());
        } else if (i10 == 1) {
            Context context = y1Var.getContext();
            e6Var = ((org.telegram.ui.ActionBar.f3) y1Var.r).resourcesProvider;
            ?? o8Var = new org.telegram.ui.Cells.o8(context, false, false, e6Var, false);
            o8Var.b(0, LocaleController.getString(R.string.FeaturedGifs));
            s4.q0 q0Var = new s4.q0(-1, -2);
            ((ViewGroup.MarginLayoutParams) q0Var).topMargin = AndroidUtilities.dp(2.5f);
            ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin = AndroidUtilities.dp(5.5f);
            o8Var.setLayoutParams(q0Var);
            f2Var = o8Var;
        } else {
            org.telegram.ui.Cells.f2 f2Var2 = new org.telegram.ui.Cells.f2(y1Var.getContext());
            f2Var2.getPhotoImage().setLayerNum(7);
            if (f2Var2.c0 == null) {
                org.telegram.ui.Components.bd bdVar = new org.telegram.ui.Components.bd(f2Var2, 1.0f, 3.0f);
                bdVar.e = 120L;
                f2Var2.c0 = bdVar;
            }
            f2Var2.setIsKeyboard(true);
            f2Var2.setCanPreviewGif(true);
            f2Var = f2Var2;
        }
        return new am0(f2Var);
    }
}
