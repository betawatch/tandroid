package oa;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j implements la.v {
    public static final i c;
    public static final i d;
    public final g5.b a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    static {
        int i9 = 0;
        c = new i(i9);
        d = new i(i9);
    }

    public j(g5.b bVar) {
        this.a = bVar;
    }

    public final la.u a(g5.b bVar, la.g gVar, sa.a aVar, ma.a aVar2, boolean z10) {
        la.u uVar;
        Object Y1 = bVar.l(new sa.a(aVar2.value())).Y1();
        boolean nullSafe = aVar2.nullSafe();
        if (Y1 instanceof la.u) {
            uVar = (la.u) Y1;
        } else if (Y1 instanceof la.v) {
            la.v vVar = (la.v) Y1;
            if (z10) {
                la.v vVar2 = (la.v) this.b.putIfAbsent(aVar.a, vVar);
                if (vVar2 != null) {
                    vVar = vVar2;
                }
            }
            uVar = vVar.create(gVar, aVar);
        } else {
            boolean z11 = Y1 instanceof la.o;
            if (!z11) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + Y1.getClass().getName() + " as a @JsonAdapter for " + na.d.k(aVar.b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            a0 a0Var = new a0(z11 ? (la.o) Y1 : null, gVar, aVar, z10 ? c : d, nullSafe);
            nullSafe = false;
            uVar = a0Var;
        }
        return (uVar == null || !nullSafe) ? uVar : uVar.nullSafe();
    }

    @Override // la.v
    public final la.u create(la.g gVar, sa.a aVar) {
        ma.a aVar2 = (ma.a) aVar.a.getAnnotation(ma.a.class);
        if (aVar2 == null) {
            return null;
        }
        return a(this.a, gVar, aVar, aVar2, true);
    }
}
