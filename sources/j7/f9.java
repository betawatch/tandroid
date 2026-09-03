package j7;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class f9 implements b9 {
    public final c9.q a;
    public final z8 b;

    public f9(Context context, z8 z8Var) {
        this.b = z8Var;
        w2.a aVar = w2.a.e;
        y2.q.b(context);
        y2.o c3 = y2.q.a().c(aVar);
        if (w2.a.d.contains(new v2.c("json"))) {
            new c9.q(new e9(c3, 0));
        }
        this.a = new c9.q(new e9(c3, 1));
    }

    @Override // j7.b9
    public final void a(b4.e0 e0Var) {
        this.b.getClass();
        ((y2.p) this.a.get()).a(e0Var.b != 0 ? new v2.a(null, e0Var.E(), v2.d.a, null) : new v2.a(null, e0Var.E(), v2.d.b, null), new s0.b(29));
    }
}
