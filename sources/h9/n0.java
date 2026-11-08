package h9;

import java.util.Collection;
import java.util.Map;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class n0 extends d0 {
    public final j0 b;

    public n0(j0 j0Var) {
        this.b = j0Var;
    }

    @Override // h9.d0, java.util.AbstractCollection, java.util.Collection, java.util.Set
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

    @Override // h9.d0
    /* renamed from: n */
    public final h2 iterator() {
        j0 j0Var = this.b;
        j0Var.getClass();
        return new m0(j0Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.b.f;
    }
}
