package gb;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class j implements db.v {
    public static final i c;
    public static final i d;
    public final pf.b a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    static {
        int i10 = 0;
        c = new i(i10);
        d = new i(i10);
    }

    public j(pf.b bVar) {
        this.a = bVar;
    }

    public final db.u a(pf.b bVar, db.g gVar, kb.a aVar, eb.a aVar2, boolean z10) {
        db.u uVar;
        Object h22 = bVar.T(new kb.a(aVar2.value())).h2();
        boolean nullSafe = aVar2.nullSafe();
        if (h22 instanceof db.u) {
            uVar = (db.u) h22;
        } else if (h22 instanceof db.v) {
            db.v vVar = (db.v) h22;
            if (z10) {
                db.v vVar2 = (db.v) this.b.putIfAbsent(aVar.a, vVar);
                if (vVar2 != null) {
                    vVar = vVar2;
                }
            }
            uVar = vVar.create(gVar, aVar);
        } else {
            boolean z11 = h22 instanceof db.o;
            if (!z11) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + h22.getClass().getName() + " as a @JsonAdapter for " + fb.d.k(aVar.b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            a0 a0Var = new a0(z11 ? (db.o) h22 : null, gVar, aVar, z10 ? c : d, nullSafe);
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
