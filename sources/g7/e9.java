package g7;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class e9 implements a9 {
    public final z8.m a;
    public final y8 b;

    public e9(Context context, y8 y8Var) {
        this.b = y8Var;
        u2.a aVar = u2.a.e;
        w2.q.b(context);
        w2.o c10 = w2.q.a().c(aVar);
        if (u2.a.d.contains(new t2.c("json"))) {
            new z8.m(new d9(c10, 0));
        }
        this.a = new z8.m(new d9(c10, 1));
    }

    @Override // g7.a9
    public final void a(b6.a aVar) {
        this.b.getClass();
        ((w2.p) this.a.get()).a(aVar.c != 0 ? new t2.a(null, aVar.p(), t2.d.a, null) : new t2.a(null, aVar.p(), t2.d.b, null), new u3.k(6));
    }
}
