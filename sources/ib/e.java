package ib;

import android.content.Context;
import i7.ma;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class e extends b8.a {
    public final za.g b;

    public e(za.g gVar) {
        super(8);
        this.b = gVar;
    }

    @Override // b8.a
    public final Object F(Object obj) {
        hb.b bVar = (hb.b) obj;
        Context b10 = this.b.b();
        v5.e.b.getClass();
        return new f(bVar, v5.e.a(b10) >= 204700000 ? new a(b10, bVar) : new c(b10, bVar), ma.b());
    }
}
