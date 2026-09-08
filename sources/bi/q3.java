package bi;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ok;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class q3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q3(int i10, int i11, Object obj, Object obj2, boolean z10) {
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
                s3 s3Var = (s3) this.d;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.e;
                Long l4 = (Long) obj;
                o5 o5Var = s3Var.a;
                TLRPC.User user = o5Var.d3.getAdapter().w0;
                long j3 = user != null ? user.id : 0L;
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.id);
                hashMap.put("query_id", "" + botInlineResult.query_id);
                hashMap.put("bot", "" + j3);
                TLRPC.User user2 = o5Var.d3.getAdapter().w0;
                hashMap.put("bot_name", user2 != null ? user2.username : "");
                org.telegram.ui.ActionBar.n2 n2Var = o5Var.J0.f;
                long j10 = j3;
                accountInstance = o5Var.getAccountInstance();
                SendMessagesHelper.prepareSendingBotContextResult(n2Var, accountInstance, botInlineResult, hashMap, o5Var.B1, null, null, o5Var.O1.a, null, this.b, this.c, 0, null, 0L, l4.longValue());
                o5Var.b2.setFieldText("");
                o5Var.k0(l4.longValue() <= 0);
                MediaDataController.getInstance(o5Var.C2).increaseInlineRating(j10);
                break;
            default:
                ((ok) this.d).Q.l(((Long) obj).longValue(), (ArrayList) this.e, this.b, this.c);
                break;
        }
    }
}
