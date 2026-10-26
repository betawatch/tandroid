package di;

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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                q4 q4Var = z2Var.a;
                TLRPC.User user = q4Var.S2.getAdapter().w0;
                long j10 = user != null ? user.id : 0L;
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.id);
                hashMap.put("query_id", "" + botInlineResult.query_id);
                hashMap.put("bot", "" + j10);
                TLRPC.User user2 = q4Var.S2.getAdapter().w0;
                hashMap.put("bot_name", user2 != null ? user2.username : "");
                org.telegram.ui.ActionBar.r2 r2Var = q4Var.y0.f;
                long j11 = j10;
                accountInstance = q4Var.getAccountInstance();
                SendMessagesHelper.prepareSendingBotContextResult(r2Var, accountInstance, botInlineResult, hashMap, q4Var.q1, null, null, q4Var.D1.a, null, this.b, this.c, 0, null, 0L, l4.longValue());
                q4Var.Q1.setFieldText("");
                q4Var.i0(l4.longValue() <= 0);
                MediaDataController.getInstance(q4Var.r2).increaseInlineRating(j11);
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
