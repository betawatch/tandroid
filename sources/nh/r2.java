package nh;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hk;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r2(int i10, int i11, Object obj, Object obj2, boolean z4) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.b = z4;
        this.c = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        AccountInstance accountInstance;
        switch (this.a) {
            case 0:
                s2 s2Var = (s2) this.d;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.e;
                Long l10 = (Long) obj;
                d4 d4Var = s2Var.a;
                TLRPC.User user = d4Var.a3.getAdapter().t0;
                long j10 = user != null ? user.id : 0L;
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.id);
                hashMap.put("query_id", "" + botInlineResult.query_id);
                hashMap.put("bot", "" + j10);
                TLRPC.User user2 = d4Var.a3.getAdapter().t0;
                hashMap.put("bot_name", user2 != null ? user2.username : "");
                org.telegram.ui.ActionBar.p2 p2Var = d4Var.G0.f;
                long j11 = j10;
                accountInstance = d4Var.getAccountInstance();
                SendMessagesHelper.prepareSendingBotContextResult(p2Var, accountInstance, botInlineResult, hashMap, d4Var.y1, null, null, d4Var.L1.a, null, this.b, this.c, 0, null, 0L, l10.longValue());
                d4Var.Y1.setFieldText("");
                d4Var.k0(l10.longValue() <= 0);
                MediaDataController.getInstance(d4Var.z2).increaseInlineRating(j11);
                break;
            default:
                ((hk) this.d).N.m(((Long) obj).longValue(), (ArrayList) this.e, this.b, this.c);
                break;
        }
    }
}
