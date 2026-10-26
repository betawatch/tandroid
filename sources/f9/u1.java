package f9;

import java.util.Map;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class u1 extends t0 {
    public final transient l0 d;
    public final transient Object[] e;
    public final transient int f;
    public final transient int h;

    public u1(l0 l0Var, Object[] objArr, int i10, int i11) {
        this.d = l0Var;
        this.e = objArr;
        this.f = i10;
        this.h = i11;
    }

    @Override // f9.d0, java.util.AbstractCollection, java.util.Collection
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

    @Override // f9.d0
    public final int m(int i10, Object[] objArr) {
        return h().m(i10, objArr);
    }

    @Override // f9.d0
    public final boolean q() {
        return true;
    }

    @Override // f9.d0
    /* renamed from: r */
    public final g2 iterator() {
        return h().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.h;
    }

    @Override // f9.t0
    public final i0 v() {
        return new t1(this);
    }
}
