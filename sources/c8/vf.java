package c8;

import android.content.Context;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class vf implements rf {
    public final u9.m a;
    public final qf b;

    public vf(Context context, qf qfVar) {
        this.b = qfVar;
        m5.a aVar = m5.a.e;
        o5.s.b(context);
        o5.q c10 = o5.s.a().c(aVar);
        if (m5.a.d.contains(new l5.c("json"))) {
            new u9.m(new a8.ya(c10, 2));
        }
        this.a = new u9.m(new a8.ya(c10, 3));
    }

    @Override // c8.rf
    public final void a(a8.xa xaVar) {
        this.b.getClass();
        ((o5.r) this.a.get()).a(xaVar.b != 0 ? l5.a.a(xaVar.F()) : new l5.a(null, xaVar.F(), l5.d.b, null), new n2.a0(8));
    }
}
