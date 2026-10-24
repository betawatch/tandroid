package fe;

import td.p;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class c implements kd.h {
    public final Throwable a;
    public final /* synthetic */ kd.h b;

    public c(Throwable th2, kd.h hVar) {
        this.a = th2;
        this.b = hVar;
    }

    @Override // kd.h
    public final Object fold(Object obj, p pVar) {
        return this.b.fold(obj, pVar);
    }

    @Override // kd.h
    public final kd.f get(kd.g gVar) {
        return this.b.get(gVar);
    }

    @Override // kd.h
    public final kd.h minusKey(kd.g gVar) {
        return this.b.minusKey(gVar);
    }

    @Override // kd.h
    public final kd.h plus(kd.h hVar) {
        return this.b.plus(hVar);
    }
}
