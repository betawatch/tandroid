package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class jj implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jj(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.b = z10;
        this.c = i10;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        org.telegram.messenger.c accountInstance;
        switch (this.a) {
            case 0:
                ((xj) this.d).Q.o((ArrayList) this.e, this.b, this.c, ((Long) obj).longValue());
                break;
            case 1:
                th.w1 w1Var = (th.w1) this.d;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.e;
                Long l4 = (Long) obj;
                th.z2 z2Var = w1Var.a;
                TLRPC.User user = z2Var.M2.getAdapter().w0;
                long j10 = user != null ? user.id : 0L;
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.id);
                hashMap.put("query_id", "" + botInlineResult.query_id);
                hashMap.put("bot", "" + j10);
                TLRPC.User user2 = z2Var.M2.getAdapter().w0;
                hashMap.put("bot_name", user2 != null ? user2.username : "");
                org.telegram.ui.ActionBar.k2 k2Var = z2Var.s0.f;
                accountInstance = z2Var.getAccountInstance();
                long j11 = j10;
                org.telegram.messenger.qz.S(this.c, z2Var.k1, 0L, l4.longValue(), hashMap, accountInstance, null, null, null, botInlineResult, z2Var.x1.a, k2Var, null, this.b);
                z2Var.K1.setFieldText("");
                z2Var.i0(l4.longValue() <= 0);
                org.telegram.messenger.ui.b0(z2Var.l2).v0(j11, false);
                break;
            default:
                th.r4 r4Var = (th.r4) this.d;
                List list = (List) this.e;
                th.u4 u4Var = r4Var.q;
                TLObject e22 = org.telegram.messenger.vp.r1(r4Var.c).e2(r4Var.D);
                r4Var.G = false;
                if (e22 == null) {
                    r4Var.J = 0;
                    r4Var.H = "";
                    org.telegram.messenger.i0.r(u4Var);
                    org.telegram.messenger.i0.g3(u4Var);
                    break;
                } else {
                    r4Var.q(this.c, list, this.b);
                    break;
                }
        }
    }

    public /* synthetic */ jj(th.r4 r4Var, boolean z10, int i10, List list) {
        this.a = 2;
        this.d = r4Var;
        this.b = z10;
        this.c = i10;
        this.e = list;
    }
}
