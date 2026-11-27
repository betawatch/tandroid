// default package

import android.content.Context;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class h9f implements o8f {
    public final i26 a;
    public final y7f b;

    public h9f(Context context, y7f y7fVar) {
        this.b = y7fVar;
        q51 q51Var = q51.e;
        h5c.b(context);
        f5c c = h5c.a().c(q51Var);
        if (q51.d.contains(new n34("json"))) {
            new i26(new a3f(c, (byte) 4));
        }
        this.a = new i26(new a3f(c, (byte) 5));
    }

    @Override // o8f
    public final void a(rx rxVar) {
        this.b.getClass();
        ((g5c) this.a.get()).a(rxVar.b ? p90.a(rxVar.k()) : new p90(null, rxVar.k(), pm8.b, null), new grb((byte) 10));
    }
}
