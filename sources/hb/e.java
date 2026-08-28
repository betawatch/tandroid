package hb;

import android.content.Context;
import h7.ma;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e extends a8.a {
    public final ya.g b;

    public e(ya.g gVar) {
        super(8);
        this.b = gVar;
    }

    @Override // a8.a
    public final Object F(Object obj) {
        gb.b bVar = (gb.b) obj;
        Context b10 = this.b.b();
        u5.e.b.getClass();
        return new f(bVar, u5.e.a(b10) >= 204700000 ? new a(b10, bVar) : new c(b10, bVar), ma.b());
    }
}
