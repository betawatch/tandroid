package c8;

import android.content.Context;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class vf implements rf {
    public final u9.m a;
    public final qf b;

    public vf(Context context, qf qfVar) {
        this.b = qfVar;
        m5.a aVar = m5.a.e;
        o5.t.b(context);
        o5.r c10 = o5.t.a().c(aVar);
        if (m5.a.d.contains(new l5.c("json"))) {
            new u9.m(new a8.ya(c10, 2));
        }
        this.a = new u9.m(new a8.ya(c10, 3));
    }

    @Override // c8.rf
    public final void a(a8.xa xaVar) {
        this.b.getClass();
        ((o5.s) this.a.get()).a(xaVar.b != 0 ? l5.a.a(xaVar.D()) : new l5.a(null, xaVar.D(), l5.d.b, null), new n2.a0(7));
    }
}
