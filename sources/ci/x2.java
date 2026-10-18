package ci;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nk;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ x2(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.b = z10;
        this.c = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        AccountInstance accountInstance;
        switch (this.a) {
            case 0:
                z2 z2Var = (z2) this.d;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.e;
                Long l4 = (Long) obj;
                p4 p4Var = z2Var.a;
                TLRPC.User user = p4Var.d3.getAdapter().w0;
                long j10 = user != null ? user.id : 0L;
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.id);
                hashMap.put("query_id", "" + botInlineResult.query_id);
                hashMap.put("bot", "" + j10);
                TLRPC.User user2 = p4Var.d3.getAdapter().w0;
                hashMap.put("bot_name", user2 != null ? user2.username : "");
                org.telegram.ui.ActionBar.n2 n2Var = p4Var.J0.f;
                long j11 = j10;
                accountInstance = p4Var.getAccountInstance();
                SendMessagesHelper.prepareSendingBotContextResult(n2Var, accountInstance, botInlineResult, hashMap, p4Var.B1, null, null, p4Var.O1.a, null, this.b, this.c, 0, null, 0L, l4.longValue());
                p4Var.b2.setFieldText("");
                p4Var.k0(l4.longValue() <= 0);
                MediaDataController.getInstance(p4Var.C2).increaseInlineRating(j11);
                break;
            case 1:
                t6 t6Var = (t6) this.d;
                List list = (List) this.e;
                w6 w6Var = t6Var.q;
                TLObject userOrChat = MessagesController.getInstance(t6Var.c).getUserOrChat(t6Var.D);
                t6Var.G = false;
                if (userOrChat == null) {
                    t6Var.J = 0;
                    t6Var.H = "";
                    AndroidUtilities.cancelRunOnUIThread(w6Var);
                    AndroidUtilities.runOnUIThread(w6Var);
                    break;
                } else {
                    t6Var.q(this.c, list, this.b);
                    break;
                }
            default:
                ((nk) this.d).Q.m(((Long) obj).longValue(), (ArrayList) this.e, this.b, this.c);
                break;
        }
    }

    public /* synthetic */ x2(t6 t6Var, boolean z10, int i10, List list) {
        this.a = 1;
        this.d = t6Var;
        this.b = z10;
        this.c = i10;
        this.e = list;
    }
}
