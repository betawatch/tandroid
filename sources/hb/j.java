package hb;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class j implements eb.v {
    public static final i c;
    public static final i d;
    public final qf.b a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    static {
        int i10 = 0;
        c = new i(i10);
        d = new i(i10);
    }

    public j(qf.b bVar) {
        this.a = bVar;
    }

    public final eb.u a(qf.b bVar, eb.g gVar, lb.a aVar, fb.a aVar2, boolean z10) {
        eb.u uVar;
        Object f22 = bVar.W(new lb.a(aVar2.value())).f2();
        boolean nullSafe = aVar2.nullSafe();
        if (f22 instanceof eb.u) {
            uVar = (eb.u) f22;
        } else if (f22 instanceof eb.v) {
            eb.v vVar = (eb.v) f22;
            if (z10) {
                eb.v vVar2 = (eb.v) this.b.putIfAbsent(aVar.a, vVar);
                if (vVar2 != null) {
                    vVar = vVar2;
                }
            }
            uVar = vVar.create(gVar, aVar);
        } else {
            boolean z11 = f22 instanceof eb.o;
            if (!z11) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + f22.getClass().getName() + " as a @JsonAdapter for " + gb.d.k(aVar.b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            a0 a0Var = new a0(z11 ? (eb.o) f22 : null, gVar, aVar, z10 ? c : d, nullSafe);
            nullSafe = false;
            uVar = a0Var;
        }
        return (uVar == null || !nullSafe) ? uVar : uVar.nullSafe();
    }

    @Override // eb.v
    public final eb.u create(eb.g gVar, lb.a aVar) {
        fb.a aVar2 = (fb.a) aVar.a.getAnnotation(fb.a.class);
        if (aVar2 == null) {
            return null;
        }
        return a(this.a, gVar, aVar, aVar2, true);
    }
}
