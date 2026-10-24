package be;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class i2 implements kd.f, kd.g {
    public static final i2 a = new i2();

    @Override // kd.h
    public final Object fold(Object obj, td.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // kd.h
    public final kd.f get(kd.g gVar) {
        return w7.h.a(this, gVar);
    }

    @Override // kd.h
    public final kd.h minusKey(kd.g gVar) {
        return w7.h.b(this, gVar);
    }

    @Override // kd.h
    public final kd.h plus(kd.h hVar) {
        return w7.h.c(this, hVar);
    }

    @Override // kd.f
    public final kd.g getKey() {
        return this;
    }
}
