package a8;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class za implements ta {
    public final u9.m a;
    public final na b;

    public za(Context context, na naVar) {
        this.b = naVar;
        m5.a aVar = m5.a.e;
        o5.s.b(context);
        o5.q c10 = o5.s.a().c(aVar);
        if (m5.a.d.contains(new l5.c("json"))) {
            new u9.m(new ya(c10, 0));
        }
        this.a = new u9.m(new ya(c10, 1));
    }

    @Override // a8.ta
    public final void a(xa xaVar) {
        this.b.getClass();
        ((o5.r) this.a.get()).a(xaVar.b != 0 ? l5.a.a(xaVar.F()) : new l5.a(null, xaVar.F(), l5.d.b, null), new n2.a0(8));
    }
}
