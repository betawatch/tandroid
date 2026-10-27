package f9;

import java.util.Collection;
import java.util.Map;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class n0 extends d0 {
    public final j0 b;

    public n0(j0 j0Var) {
        this.b = j0Var;
    }

    @Override // f9.d0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            Collection collection = (Collection) this.b.b().get(key);
            if (collection != null && collection.contains(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // f9.d0
    /* renamed from: r */
    public final g2 iterator() {
        j0 j0Var = this.b;
        j0Var.getClass();
        return new m0(j0Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.b.f;
    }
}
