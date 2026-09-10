package gb;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class j implements db.v {
    public static final i c;
    public static final i d;
    public final n4.y a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    static {
        int i10 = 0;
        c = new i(i10);
        d = new i(i10);
    }

    public j(n4.y yVar) {
        this.a = yVar;
    }

    public final db.u a(n4.y yVar, db.g gVar, kb.a aVar, eb.a aVar2, boolean z10) {
        db.u uVar;
        Object n22 = yVar.l(new kb.a(aVar2.value())).n2();
        boolean nullSafe = aVar2.nullSafe();
        if (n22 instanceof db.u) {
            uVar = (db.u) n22;
        } else if (n22 instanceof db.v) {
            db.v vVar = (db.v) n22;
            if (z10) {
                db.v vVar2 = (db.v) this.b.putIfAbsent(aVar.a, vVar);
                if (vVar2 != null) {
                    vVar = vVar2;
                }
            }
            uVar = vVar.create(gVar, aVar);
        } else {
            boolean z11 = n22 instanceof db.o;
            if (!z11) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + n22.getClass().getName() + " as a @JsonAdapter for " + fb.d.k(aVar.b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            a0 a0Var = new a0(z11 ? (db.o) n22 : null, gVar, aVar, z10 ? c : d, nullSafe);
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
