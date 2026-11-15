package a8;

import android.content.Context;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class za implements ta {
    public final u9.m a;
    public final na b;

    public za(Context context, na naVar) {
        this.b = naVar;
        m5.a aVar = m5.a.e;
        o5.t.b(context);
        o5.r c10 = o5.t.a().c(aVar);
        if (m5.a.d.contains(new l5.c("json"))) {
            new u9.m(new ya(c10, 0));
        }
        this.a = new u9.m(new ya(c10, 1));
    }

    @Override // a8.ta
    public final void a(xa xaVar) {
        this.b.getClass();
        ((o5.s) this.a.get()).a(xaVar.b != 0 ? l5.a.a(xaVar.D()) : new l5.a(null, xaVar.D(), l5.d.b, null), new n2.a0(7));
    }
}
