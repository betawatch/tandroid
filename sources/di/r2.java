package di;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.c20;
import org.telegram.messenger.gz;
import org.telegram.messenger.qp;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.vj;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r2 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r2(int i7, int i10, Object obj, Object obj2, boolean z9) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = z9;
        this.c = i7;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        org.telegram.messenger.c accountInstance;
        switch (this.a) {
            case 0:
                t2 t2Var = (t2) this.d;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.e;
                Long l10 = (Long) obj;
                i4 i4Var = t2Var.a;
                TLRPC.User user = i4Var.M2.getAdapter().w0;
                long j3 = user != null ? user.id : 0L;
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.id);
                hashMap.put("query_id", "" + botInlineResult.query_id);
                hashMap.put("bot", "" + j3);
                TLRPC.User user2 = i4Var.M2.getAdapter().w0;
                hashMap.put("bot_name", user2 != null ? user2.username : "");
                org.telegram.ui.ActionBar.f2 f2Var = i4Var.s0.f;
                accountInstance = i4Var.getAccountInstance();
                long j10 = j3;
                gz.S(this.c, i4Var.k1, 0L, l10.longValue(), hashMap, accountInstance, null, null, null, botInlineResult, i4Var.x1.a, f2Var, null, this.b);
                i4Var.K1.setFieldText("");
                i4Var.i0(l10.longValue() <= 0);
                ui.b0(i4Var.l2).v0(j10, false);
                break;
            case 1:
                k6 k6Var = (k6) this.d;
                List list = (List) this.e;
                n6 n6Var = k6Var.q;
                TLObject f22 = qp.s1(k6Var.c).f2(k6Var.D);
                k6Var.G = false;
                if (f22 == null) {
                    k6Var.J = 0;
                    k6Var.H = "";
                    org.telegram.messenger.g0.r(n6Var);
                    org.telegram.messenger.g0.h3(n6Var);
                    break;
                } else {
                    k6Var.q(this.c, list, this.b);
                    break;
                }
            default:
                ((vj) this.d).Q.p((ArrayList) this.e, this.b, this.c, ((Long) obj).longValue());
                break;
        }
    }

    public /* synthetic */ r2(k6 k6Var, boolean z9, int i7, List list) {
        this.a = 1;
        this.d = k6Var;
        this.b = z9;
        this.c = i7;
        this.e = list;
    }
}
