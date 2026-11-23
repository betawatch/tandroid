package h9;

import java.util.Map;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class u1 extends t0 {
    public final transient l0 d;
    public final transient Object[] e;
    public final transient int f;
    public final transient int h;

    public u1(l0 l0Var, Object[] objArr, int i7, int i10) {
        this.d = l0Var;
        this.e = objArr;
        this.f = i7;
        this.h = i10;
    }

    @Override // h9.d0, java.util.AbstractCollection, java.util.Collection
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

    @Override // h9.d0
    public final int i(int i7, Object[] objArr) {
        return f().i(i7, objArr);
    }

    @Override // h9.d0
    public final boolean m() {
        return true;
    }

    @Override // h9.d0
    /* renamed from: n */
    public final g2 iterator() {
        return f().listIterator(0);
    }

    @Override // h9.t0
    public final i0 r() {
        return new t1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.h;
    }
}
