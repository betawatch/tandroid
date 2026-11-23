package fi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.az;
import org.telegram.messenger.np;
import org.telegram.messenger.si;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mk;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class l2 implements y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l2(int i7, int i10, Object obj, Object obj2, boolean z10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = z10;
        this.c = i7;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        org.telegram.messenger.c accountInstance;
        switch (this.a) {
            case 0:
                m2 m2Var = (m2) this.d;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.e;
                Long l10 = (Long) obj;
                z3 z3Var = m2Var.a;
                TLRPC.User user = z3Var.N2.getAdapter().x0;
                long j3 = user != null ? user.id : 0L;
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.id);
                hashMap.put("query_id", "" + botInlineResult.query_id);
                hashMap.put("bot", "" + j3);
                TLRPC.User user2 = z3Var.N2.getAdapter().x0;
                hashMap.put("bot_name", user2 != null ? user2.username : "");
                org.telegram.ui.ActionBar.g2 g2Var = z3Var.t0.f;
                accountInstance = z3Var.getAccountInstance();
                long j10 = j3;
                az.S(this.c, z3Var.l1, 0L, l10.longValue(), hashMap, accountInstance, null, null, null, botInlineResult, z3Var.y1.a, g2Var, null, this.b);
                z3Var.L1.setFieldText("");
                z3Var.i0(l10.longValue() <= 0);
                si.d0(z3Var.m2).x0(j10, false);
                break;
            case 1:
                b6 b6Var = (b6) this.d;
                List list = (List) this.e;
                e6 e6Var = b6Var.q;
                TLObject h22 = np.u1(b6Var.c).h2(b6Var.D);
                b6Var.G = false;
                if (h22 == null) {
                    b6Var.J = 0;
                    b6Var.H = "";
                    org.telegram.messenger.g0.r(e6Var);
                    org.telegram.messenger.g0.g3(e6Var);
                    break;
                } else {
                    b6Var.q(this.c, list, this.b);
                    break;
                }
            default:
                ((mk) this.d).R.p((ArrayList) this.e, this.b, this.c, ((Long) obj).longValue());
                break;
        }
    }

    public /* synthetic */ l2(b6 b6Var, boolean z10, int i7, List list) {
        this.a = 1;
        this.d = b6Var;
        this.b = z10;
        this.c = i7;
        this.e = list;
    }
}
