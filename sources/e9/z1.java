package e9;

import java.util.Map;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class z1 extends y0 {
    public final transient q0 d;
    public final transient Object[] e;
    public final transient int f;
    public final transient int h;

    public z1(q0 q0Var, Object[] objArr, int i10, int i11) {
        this.d = q0Var;
        this.e = objArr;
        this.f = i10;
        this.h = i11;
    }

    @Override // e9.i0, java.util.AbstractCollection, java.util.Collection, java.util.Set
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

    @Override // e9.i0
    public final int m(int i10, Object[] objArr) {
        return h().m(i10, objArr);
    }

    @Override // e9.i0
    public final boolean q() {
        return true;
    }

    @Override // e9.i0
    /* renamed from: r */
    public final m2 iterator() {
        return h().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.h;
    }

    @Override // e9.y0
    public final n0 v() {
        return new y1(this);
    }
}
