package a8;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        ((o5.s) this.a.get()).a(xaVar.b != 0 ? l5.a.a(xaVar.E()) : new l5.a(null, xaVar.E(), l5.d.b, null), new n2.a0(8));
    }
}
