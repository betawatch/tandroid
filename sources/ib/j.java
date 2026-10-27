package ib;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class j implements fb.v {
    public static final i c;
    public static final i d;
    public final rf.b a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    static {
        int i10 = 0;
        c = new i(i10);
        d = new i(i10);
    }

    public j(rf.b bVar) {
        this.a = bVar;
    }

    public final fb.u a(rf.b bVar, fb.g gVar, mb.a aVar, gb.a aVar2, boolean z10) {
        fb.u uVar;
        Object U1 = bVar.K(new mb.a(aVar2.value())).U1();
        boolean nullSafe = aVar2.nullSafe();
        if (U1 instanceof fb.u) {
            uVar = (fb.u) U1;
        } else if (U1 instanceof fb.v) {
            fb.v vVar = (fb.v) U1;
            if (z10) {
                fb.v vVar2 = (fb.v) this.b.putIfAbsent(aVar.a, vVar);
                if (vVar2 != null) {
                    vVar = vVar2;
                }
            }
            uVar = vVar.create(gVar, aVar);
        } else {
            boolean z11 = U1 instanceof fb.o;
            if (!z11) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + U1.getClass().getName() + " as a @JsonAdapter for " + hb.d.k(aVar.b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            a0 a0Var = new a0(z11 ? (fb.o) U1 : null, gVar, aVar, z10 ? c : d, nullSafe);
            nullSafe = false;
            uVar = a0Var;
        }
        return (uVar == null || !nullSafe) ? uVar : uVar.nullSafe();
    }

    @Override // fb.v
    public final fb.u create(fb.g gVar, mb.a aVar) {
        gb.a aVar2 = (gb.a) aVar.a.getAnnotation(gb.a.class);
        if (aVar2 == null) {
            return null;
        }
        return a(this.a, gVar, aVar, aVar2, true);
    }
}
