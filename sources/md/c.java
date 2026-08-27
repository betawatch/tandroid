package md;

import ad.p;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c implements rc.h {
    public final Throwable a;
    public final /* synthetic */ rc.h b;

    public c(Throwable th, rc.h hVar) {
        this.a = th;
        this.b = hVar;
    }

    @Override // rc.h
    public final Object fold(Object obj, p pVar) {
        return this.b.fold(obj, pVar);
    }

    @Override // rc.h
    public final rc.f get(rc.g gVar) {
        return this.b.get(gVar);
    }

    @Override // rc.h
    public final rc.h minusKey(rc.g gVar) {
        return this.b.minusKey(gVar);
    }

    @Override // rc.h
    public final rc.h plus(rc.h hVar) {
        return this.b.plus(hVar);
    }
}
