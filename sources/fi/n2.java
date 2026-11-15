package fi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.ez;
import org.telegram.messenger.np;
import org.telegram.messenger.si;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dk;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class n2 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n2(int i7, int i10, Object obj, Object obj2, boolean z10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = z10;
        this.c = i7;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        org.telegram.messenger.c accountInstance;
        switch (this.a) {
            case 0:
                o2 o2Var = (o2) this.d;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.e;
                Long l10 = (Long) obj;
                b4 b4Var = o2Var.a;
                TLRPC.User user = b4Var.N2.getAdapter().x0;
                long j3 = user != null ? user.id : 0L;
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.id);
                hashMap.put("query_id", "" + botInlineResult.query_id);
                hashMap.put("bot", "" + j3);
                TLRPC.User user2 = b4Var.N2.getAdapter().x0;
                hashMap.put("bot_name", user2 != null ? user2.username : "");
                org.telegram.ui.ActionBar.e2 e2Var = b4Var.t0.f;
                accountInstance = b4Var.getAccountInstance();
                long j10 = j3;
                ez.S(this.c, b4Var.l1, 0L, l10.longValue(), hashMap, accountInstance, null, null, null, botInlineResult, b4Var.y1.a, e2Var, null, this.b);
                b4Var.L1.setFieldText("");
                b4Var.i0(l10.longValue() <= 0);
                si.b0(b4Var.m2).v0(j10, false);
                break;
            case 1:
                d6 d6Var = (d6) this.d;
                List list = (List) this.e;
                h6 h6Var = d6Var.q;
                TLObject f22 = np.s1(d6Var.c).f2(d6Var.D);
                d6Var.G = false;
                if (f22 == null) {
                    d6Var.J = 0;
                    d6Var.H = "";
                    org.telegram.messenger.g0.r(h6Var);
                    org.telegram.messenger.g0.h3(h6Var);
                    break;
                } else {
                    d6Var.q(this.c, list, this.b);
                    break;
                }
            default:
                ((dk) this.d).R.p((ArrayList) this.e, this.b, this.c, ((Long) obj).longValue());
                break;
        }
    }

    public /* synthetic */ n2(d6 d6Var, boolean z10, int i7, List list) {
        this.a = 1;
        this.d = d6Var;
        this.b = z10;
        this.c = i7;
        this.e = list;
    }
}
