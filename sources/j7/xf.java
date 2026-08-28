package j7;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class xf implements tf {
    public final y8.n a;
    public final sf b;

    public xf(Context context, sf sfVar) {
        this.b = sfVar;
        u2.a aVar = u2.a.e;
        w2.q.b(context);
        w2.o c10 = w2.q.a().c(aVar);
        if (u2.a.d.contains(new t2.c("json"))) {
            new y8.n(new f7.e9(c10, 6));
        }
        this.a = new y8.n(new f7.e9(c10, 7));
    }

    @Override // j7.tf
    public final void a(a6.a aVar) {
        this.b.getClass();
        ((w2.p) this.a.get()).a(aVar.c != 0 ? new t2.a(null, aVar.p(), t2.d.a, null) : new t2.a(null, aVar.p(), t2.d.b, null), new v0.l(1));
    }
}
