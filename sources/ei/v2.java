package ei;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.hp;
import org.telegram.messenger.li;
import org.telegram.messenger.u10;
import org.telegram.messenger.yy;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.uj;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v2 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v2(int i3, int i10, Object obj, Object obj2, boolean z10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = z10;
        this.c = i3;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        org.telegram.messenger.c accountInstance;
        switch (this.a) {
            case 0:
                w2 w2Var = (w2) this.d;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.e;
                Long l10 = (Long) obj;
                j4 j4Var = w2Var.a;
                TLRPC.User user = j4Var.N2.getAdapter().x0;
                long j10 = user != null ? user.id : 0L;
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.id);
                hashMap.put("query_id", "" + botInlineResult.query_id);
                hashMap.put("bot", "" + j10);
                TLRPC.User user2 = j4Var.N2.getAdapter().x0;
                hashMap.put("bot_name", user2 != null ? user2.username : "");
                org.telegram.ui.ActionBar.d2 d2Var = j4Var.t0.f;
                accountInstance = j4Var.getAccountInstance();
                long j11 = j10;
                yy.S(this.c, j4Var.l1, 0L, l10.longValue(), hashMap, accountInstance, null, null, null, botInlineResult, j4Var.y1.a, d2Var, null, this.b);
                j4Var.L1.setFieldText("");
                j4Var.i0(l10.longValue() <= 0);
                li.b0(j4Var.m2).v0(j11, false);
                break;
            case 1:
                l6 l6Var = (l6) this.d;
                List list = (List) this.e;
                o6 o6Var = l6Var.q;
                TLObject f22 = hp.s1(l6Var.c).f2(l6Var.D);
                l6Var.G = false;
                if (f22 == null) {
                    l6Var.J = 0;
                    l6Var.H = "";
                    org.telegram.messenger.g0.r(o6Var);
                    org.telegram.messenger.g0.h3(o6Var);
                    break;
                } else {
                    l6Var.q(this.c, list, this.b);
                    break;
                }
            default:
                ((uj) this.d).R.p((ArrayList) this.e, this.b, this.c, ((Long) obj).longValue());
                break;
        }
    }

    public /* synthetic */ v2(l6 l6Var, boolean z10, int i3, List list) {
        this.a = 1;
        this.d = l6Var;
        this.b = z10;
        this.c = i3;
        this.e = list;
    }
}
