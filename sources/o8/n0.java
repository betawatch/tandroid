package o8;

import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class n0 extends c0 {
    public final transient b0 d;
    public final transient Object[] e;
    public final transient int f;

    public n0(b0 b0Var, Object[] objArr, int i9) {
        this.d = b0Var;
        this.e = objArr;
        this.f = i9;
    }

    @Override // o8.u, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // o8.u
    public final int n(int i9, Object[] objArr) {
        return i().n(i9, objArr);
    }

    @Override // o8.u
    public final boolean r() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }

    @Override // o8.c0
    public final z v() {
        return new m0(this);
    }

    @Override // o8.c0
    /* renamed from: w */
    public final x0 iterator() {
        return i().listIterator(0);
    }
}
