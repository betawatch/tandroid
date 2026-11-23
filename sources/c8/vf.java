package c8;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        ((o5.s) this.a.get()).a(xaVar.b != 0 ? l5.a.a(xaVar.E()) : new l5.a(null, xaVar.E(), l5.d.b, null), new n2.a0(8));
    }
}
