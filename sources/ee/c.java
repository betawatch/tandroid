package ee;

import sd.p;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class c implements jd.h {
    public final Throwable a;
    public final /* synthetic */ jd.h b;

    public c(Throwable th2, jd.h hVar) {
        this.a = th2;
        this.b = hVar;
    }

    @Override // jd.h
    public final Object fold(Object obj, p pVar) {
        return this.b.fold(obj, pVar);
    }

    @Override // jd.h
    public final jd.f get(jd.g gVar) {
        return this.b.get(gVar);
    }

    @Override // jd.h
    public final jd.h minusKey(jd.g gVar) {
        return this.b.minusKey(gVar);
    }

    @Override // jd.h
    public final jd.h plus(jd.h hVar) {
        return this.b.plus(hVar);
    }
}
