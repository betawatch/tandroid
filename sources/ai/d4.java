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
import org.telegram.ui.Components.pk;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class d4 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d4(int i10, int i11, Object obj, Object obj2, boolean z10) {
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
                f4 f4Var = (f4) this.d;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.e;
                Long l4 = (Long) obj;
                e6 e6Var = f4Var.a;
                TLRPC.User user = e6Var.d3.getAdapter().w0;
                long j3 = user != null ? user.id : 0L;
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.id);
                hashMap.put("query_id", "" + botInlineResult.query_id);
                hashMap.put("bot", "" + j3);
                TLRPC.User user2 = e6Var.d3.getAdapter().w0;
                hashMap.put("bot_name", user2 != null ? user2.username : "");
                org.telegram.ui.ActionBar.n2 n2Var = e6Var.J0.f;
                long j10 = j3;
                accountInstance = e6Var.getAccountInstance();
                SendMessagesHelper.prepareSendingBotContextResult(n2Var, accountInstance, botInlineResult, hashMap, e6Var.B1, null, null, e6Var.O1.a, null, this.b, this.c, 0, null, 0L, l4.longValue());
                e6Var.b2.setFieldText("");
                e6Var.k0(l4.longValue() <= 0);
                MediaDataController.getInstance(e6Var.C2).increaseInlineRating(j10);
                break;
            case 1:
                v8 v8Var = (v8) this.d;
                List list = (List) this.e;
                y8 y8Var = v8Var.q;
                TLObject userOrChat = MessagesController.getInstance(v8Var.c).getUserOrChat(v8Var.D);
                v8Var.G = false;
                if (userOrChat == null) {
                    v8Var.J = 0;
                    v8Var.H = "";
                    AndroidUtilities.cancelRunOnUIThread(y8Var);
                    AndroidUtilities.runOnUIThread(y8Var);
                    break;
                } else {
                    v8Var.q(this.c, list, this.b);
                    break;
                }
            default:
                ((pk) this.d).Q.l(((Long) obj).longValue(), (ArrayList) this.e, this.b, this.c);
                break;
        }
    }

    public /* synthetic */ d4(v8 v8Var, boolean z10, int i10, List list) {
        this.a = 1;
        this.d = v8Var;
        this.b = z10;
        this.c = i10;
        this.e = list;
    }
}
