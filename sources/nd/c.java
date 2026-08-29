package nd;

import bd.p;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c implements sc.h {
    public final Throwable a;
    public final /* synthetic */ sc.h b;

    public c(Throwable th2, sc.h hVar) {
        this.a = th2;
        this.b = hVar;
    }

    @Override // sc.h
    public final Object fold(Object obj, p pVar) {
        return this.b.fold(obj, pVar);
    }

    @Override // sc.h
    public final sc.f get(sc.g gVar) {
        return this.b.get(gVar);
    }

    @Override // sc.h
    public final sc.h minusKey(sc.g gVar) {
        return this.b.minusKey(gVar);
    }

    @Override // sc.h
    public final sc.h plus(sc.h hVar) {
        return this.b.plus(hVar);
    }
}
