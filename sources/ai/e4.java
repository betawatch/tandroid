package ai;

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
import org.telegram.ui.Components.sk;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e4 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e4(int i10, int i11, Object obj, Object obj2, boolean z10) {
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
                g4 g4Var = (g4) this.d;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.e;
                Long l4 = (Long) obj;
                f6 f6Var = g4Var.a;
                TLRPC.User user = f6Var.d3.getAdapter().w0;
                long j3 = user != null ? user.id : 0L;
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.id);
                hashMap.put("query_id", "" + botInlineResult.query_id);
                hashMap.put("bot", "" + j3);
                TLRPC.User user2 = f6Var.d3.getAdapter().w0;
                hashMap.put("bot_name", user2 != null ? user2.username : "");
                org.telegram.ui.ActionBar.n2 n2Var = f6Var.J0.f;
                long j10 = j3;
                accountInstance = f6Var.getAccountInstance();
                SendMessagesHelper.prepareSendingBotContextResult(n2Var, accountInstance, botInlineResult, hashMap, f6Var.B1, null, null, f6Var.O1.a, null, this.b, this.c, 0, null, 0L, l4.longValue());
                f6Var.b2.setFieldText("");
                f6Var.k0(l4.longValue() <= 0);
                MediaDataController.getInstance(f6Var.C2).increaseInlineRating(j10);
                break;
            case 1:
                w8 w8Var = (w8) this.d;
                List list = (List) this.e;
                z8 z8Var = w8Var.q;
                TLObject userOrChat = MessagesController.getInstance(w8Var.c).getUserOrChat(w8Var.D);
                w8Var.G = false;
                if (userOrChat == null) {
                    w8Var.J = 0;
                    w8Var.H = "";
                    AndroidUtilities.cancelRunOnUIThread(z8Var);
                    AndroidUtilities.runOnUIThread(z8Var);
                    break;
                } else {
                    w8Var.q(this.c, list, this.b);
                    break;
                }
            default:
                ((sk) this.d).Q.l(((Long) obj).longValue(), (ArrayList) this.e, this.b, this.c);
                break;
        }
    }

    public /* synthetic */ e4(w8 w8Var, boolean z10, int i10, List list) {
        this.a = 1;
        this.d = w8Var;
        this.b = z10;
        this.c = i10;
        this.e = list;
    }
}
