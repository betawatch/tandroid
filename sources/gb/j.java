package gb;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class j implements db.v {
    public static final i c;
    public static final i d;
    public final n4.x a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    static {
        int i10 = 0;
        c = new i(i10);
        d = new i(i10);
    }

    public j(n4.x xVar) {
        this.a = xVar;
    }

    public final db.u a(n4.x xVar, db.g gVar, kb.a aVar, eb.a aVar2, boolean z10) {
        db.u uVar;
        Object v22 = xVar.S(new kb.a(aVar2.value())).v2();
        boolean nullSafe = aVar2.nullSafe();
        if (v22 instanceof db.u) {
            uVar = (db.u) v22;
        } else if (v22 instanceof db.v) {
            db.v vVar = (db.v) v22;
            if (z10) {
                db.v vVar2 = (db.v) this.b.putIfAbsent(aVar.a, vVar);
                if (vVar2 != null) {
                    vVar = vVar2;
                }
            }
            uVar = vVar.create(gVar, aVar);
        } else {
            boolean z11 = v22 instanceof db.o;
            if (!z11) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + v22.getClass().getName() + " as a @JsonAdapter for " + fb.d.k(aVar.b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            a0 a0Var = new a0(z11 ? (db.o) v22 : null, gVar, aVar, z10 ? c : d, nullSafe);
            nullSafe = false;
            uVar = a0Var;
        }
        return (uVar == null || !nullSafe) ? uVar : uVar.nullSafe();
    }

    @Override // db.v
    public final db.u create(db.g gVar, kb.a aVar) {
        eb.a aVar2 = (eb.a) aVar.a.getAnnotation(eb.a.class);
        if (aVar2 == null) {
            return null;
        }
        return a(this.a, gVar, aVar, aVar2, true);
    }
}
