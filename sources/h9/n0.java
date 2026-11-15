package h9;

import java.util.Collection;
import java.util.Map;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class n0 extends d0 {
    public final j0 b;

    public n0(j0 j0Var) {
        this.b = j0Var;
    }

    @Override // h9.d0, java.util.AbstractCollection, java.util.Collection
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
