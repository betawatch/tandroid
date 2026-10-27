package fb;

import ib.y;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class f extends y {
    public u a = null;

    @Override // ib.y
    public final u a() {
        u uVar = this.a;
        if (uVar != null) {
            return uVar;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // fb.u
    public final Object read(nb.a aVar) {
        u uVar = this.a;
        if (uVar != null) {
            return uVar.read(aVar);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // fb.u
    public final void write(nb.b bVar, Object obj) {
        u uVar = this.a;
        if (uVar == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        uVar.write(bVar, obj);
    }
}
