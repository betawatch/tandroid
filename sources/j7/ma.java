package j7;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class ma implements ka {
    public final a9.q a;
    public final ha b;

    public ma(Context context, ha haVar) {
        this.b = haVar;
        w2.a aVar = w2.a.e;
        y2.q.b(context);
        y2.o c3 = y2.q.a().c(aVar);
        if (w2.a.d.contains(new v2.c("json"))) {
            new a9.q(new h7.c9(c3, 4));
        }
        this.a = new a9.q(new h7.c9(c3, 5));
    }

    @Override // j7.ka
    public final void a(ag.j2 j2Var) {
        this.b.getClass();
        ((y2.p) this.a.get()).a(j2Var.b != 0 ? new v2.a(null, j2Var.r(), v2.d.a, null) : new v2.a(null, j2Var.r(), v2.d.b, null), new sg.j(17));
    }
}
