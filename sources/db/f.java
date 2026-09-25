package db;

import gb.y;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
