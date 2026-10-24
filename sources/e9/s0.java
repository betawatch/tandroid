package e9;

import java.util.Collection;
import java.util.Map;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class s0 extends i0 {
    public final o0 b;

    public s0(o0 o0Var) {
        this.b = o0Var;
    }

    @Override // e9.i0, java.util.AbstractCollection, java.util.Collection, java.util.Set
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

    @Override // e9.i0
    /* renamed from: r */
    public final m2 iterator() {
        o0 o0Var = this.b;
        o0Var.getClass();
        return new r0(o0Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.b.f;
    }
}
