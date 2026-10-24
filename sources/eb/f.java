package eb;

import hb.y;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public class f extends y {
    public u a = null;

    @Override // hb.y
    public final u a() {
        u uVar = this.a;
        if (uVar != null) {
            return uVar;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // eb.u
    public final Object read(mb.a aVar) {
        u uVar = this.a;
        if (uVar != null) {
            return uVar.read(aVar);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // eb.u
    public final void write(mb.b bVar, Object obj) {
        u uVar = this.a;
        if (uVar == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        uVar.write(bVar, obj);
    }
}
