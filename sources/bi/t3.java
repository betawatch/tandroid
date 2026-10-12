package bi;

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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class t3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t3(int i10, int i11, Object obj, Object obj2, boolean z10) {
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
                v3 v3Var = (v3) this.d;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.e;
                Long l4 = (Long) obj;
                q5 q5Var = v3Var.a;
                TLRPC.User user = q5Var.d3.getAdapter().w0;
                long j10 = user != null ? user.id : 0L;
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.id);
                hashMap.put("query_id", "" + botInlineResult.query_id);
                hashMap.put("bot", "" + j10);
                TLRPC.User user2 = q5Var.d3.getAdapter().w0;
                hashMap.put("bot_name", user2 != null ? user2.username : "");
                org.telegram.ui.ActionBar.m2 m2Var = q5Var.J0.f;
                long j11 = j10;
                accountInstance = q5Var.getAccountInstance();
                SendMessagesHelper.prepareSendingBotContextResult(m2Var, accountInstance, botInlineResult, hashMap, q5Var.B1, null, null, q5Var.O1.a, null, this.b, this.c, 0, null, 0L, l4.longValue());
                q5Var.b2.setFieldText("");
                q5Var.k0(l4.longValue() <= 0);
                MediaDataController.getInstance(q5Var.C2).increaseInlineRating(j11);
                break;
            case 1:
                g8 g8Var = (g8) this.d;
                List list = (List) this.e;
                j8 j8Var = g8Var.q;
                TLObject userOrChat = MessagesController.getInstance(g8Var.c).getUserOrChat(g8Var.D);
                g8Var.G = false;
                if (userOrChat == null) {
                    g8Var.J = 0;
                    g8Var.H = "";
                    AndroidUtilities.cancelRunOnUIThread(j8Var);
                    AndroidUtilities.runOnUIThread(j8Var);
                    break;
                } else {
                    g8Var.q(this.c, list, this.b);
                    break;
                }
            default:
                ((pk) this.d).Q.m(((Long) obj).longValue(), (ArrayList) this.e, this.b, this.c);
                break;
        }
    }

    public /* synthetic */ t3(g8 g8Var, boolean z10, int i10, List list) {
        this.a = 1;
        this.d = g8Var;
        this.b = z10;
        this.c = i10;
        this.e = list;
    }
}
