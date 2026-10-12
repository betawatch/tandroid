package be;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class i2 implements kd.f, kd.g {
    public static final i2 a = new i2();

    @Override // kd.h
    public final Object fold(Object obj, td.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // kd.h
    public final kd.f get(kd.g gVar) {
        return w7.k.a(this, gVar);
    }

    @Override // kd.h
    public final kd.h minusKey(kd.g gVar) {
        return w7.k.b(this, gVar);
    }

    @Override // kd.h
    public final kd.h plus(kd.h hVar) {
        return w7.k.c(this, hVar);
    }

    @Override // kd.f
    public final kd.g getKey() {
        return this;
    }
}
