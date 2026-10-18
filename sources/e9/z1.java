package e9;

import java.util.Map;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
