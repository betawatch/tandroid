package db;

import gb.y;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public class f extends y {
    public u a = null;

    @Override // gb.y
    public final u a() {
        u uVar = this.a;
        if (uVar != null) {
            return uVar;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // db.u
    public final Object read(lb.a aVar) {
        u uVar = this.a;
        if (uVar != null) {
            return uVar.read(aVar);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // db.u
    public final void write(lb.b bVar, Object obj) {
        u uVar = this.a;
        if (uVar == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        uVar.write(bVar, obj);
    }
}
