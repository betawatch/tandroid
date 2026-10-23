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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ y2(int i10, int i11, Object obj, Object obj2, boolean z10) {
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
                a3 a3Var = (a3) this.d;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.e;
                Long l4 = (Long) obj;
                q4 q4Var = a3Var.a;
                TLRPC.User user = q4Var.d3.getAdapter().w0;
                long j10 = user != null ? user.id : 0L;
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.id);
                hashMap.put("query_id", "" + botInlineResult.query_id);
                hashMap.put("bot", "" + j10);
                TLRPC.User user2 = q4Var.d3.getAdapter().w0;
                hashMap.put("bot_name", user2 != null ? user2.username : "");
                org.telegram.ui.ActionBar.n2 n2Var = q4Var.J0.f;
                long j11 = j10;
                accountInstance = q4Var.getAccountInstance();
                SendMessagesHelper.prepareSendingBotContextResult(n2Var, accountInstance, botInlineResult, hashMap, q4Var.B1, null, null, q4Var.O1.a, null, this.b, this.c, 0, null, 0L, l4.longValue());
                q4Var.b2.setFieldText("");
                q4Var.k0(l4.longValue() <= 0);
                MediaDataController.getInstance(q4Var.C2).increaseInlineRating(j11);
                break;
            case 1:
                u6 u6Var = (u6) this.d;
                List list = (List) this.e;
                x6 x6Var = u6Var.q;
                TLObject userOrChat = MessagesController.getInstance(u6Var.c).getUserOrChat(u6Var.D);
                u6Var.G = false;
                if (userOrChat == null) {
                    u6Var.J = 0;
                    u6Var.H = "";
                    AndroidUtilities.cancelRunOnUIThread(x6Var);
                    AndroidUtilities.runOnUIThread(x6Var);
                    break;
                } else {
                    u6Var.q(this.c, list, this.b);
                    break;
                }
            default:
                ((nk) this.d).Q.m(((Long) obj).longValue(), (ArrayList) this.e, this.b, this.c);
                break;
        }
    }

    public /* synthetic */ y2(u6 u6Var, boolean z10, int i10, List list) {
        this.a = 1;
        this.d = u6Var;
        this.b = z10;
        this.c = i10;
        this.e = list;
    }
}
