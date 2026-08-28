package ih;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fk;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s2(int i9, int i10, Object obj, Object obj2, boolean z10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = z10;
        this.c = i9;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        AccountInstance accountInstance;
        switch (this.a) {
            case 0:
                t2 t2Var = (t2) this.d;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.e;
                Long l10 = (Long) obj;
                i4 i4Var = t2Var.a;
                TLRPC.User user = i4Var.Z2.getAdapter().s0;
                long j10 = user != null ? user.id : 0L;
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.id);
                hashMap.put("query_id", "" + botInlineResult.query_id);
                hashMap.put("bot", "" + j10);
                TLRPC.User user2 = i4Var.Z2.getAdapter().s0;
                hashMap.put("bot_name", user2 != null ? user2.username : "");
                org.telegram.ui.ActionBar.o2 o2Var = i4Var.F0.f;
                long j11 = j10;
                accountInstance = i4Var.getAccountInstance();
                SendMessagesHelper.prepareSendingBotContextResult(o2Var, accountInstance, botInlineResult, hashMap, i4Var.x1, null, null, i4Var.K1.a, null, this.b, this.c, 0, null, 0L, l10.longValue());
                i4Var.X1.setFieldText("");
                i4Var.k0(l10.longValue() <= 0);
                MediaDataController.getInstance(i4Var.y2).increaseInlineRating(j11);
                break;
            default:
                ((fk) this.d).M.m(((Long) obj).longValue(), (ArrayList) this.e, this.b, this.c);
                break;
        }
    }
}
