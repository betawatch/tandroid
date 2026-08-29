package lh;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jk;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q2(int i10, int i11, Object obj, Object obj2, boolean z10) {
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
                r2 r2Var = (r2) this.d;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.e;
                Long l10 = (Long) obj;
                d4 d4Var = r2Var.a;
                TLRPC.User user = d4Var.Z2.getAdapter().s0;
                long j10 = user != null ? user.id : 0L;
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.id);
                hashMap.put("query_id", "" + botInlineResult.query_id);
                hashMap.put("bot", "" + j10);
                TLRPC.User user2 = d4Var.Z2.getAdapter().s0;
                hashMap.put("bot_name", user2 != null ? user2.username : "");
                org.telegram.ui.ActionBar.o2 o2Var = d4Var.F0.f;
                long j11 = j10;
                accountInstance = d4Var.getAccountInstance();
                SendMessagesHelper.prepareSendingBotContextResult(o2Var, accountInstance, botInlineResult, hashMap, d4Var.x1, null, null, d4Var.K1.a, null, this.b, this.c, 0, null, 0L, l10.longValue());
                d4Var.X1.setFieldText("");
                d4Var.k0(l10.longValue() <= 0);
                MediaDataController.getInstance(d4Var.y2).increaseInlineRating(j11);
                break;
            default:
                ((jk) this.d).M.m(((Long) obj).longValue(), (ArrayList) this.e, this.b, this.c);
                break;
        }
    }
}
