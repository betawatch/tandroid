package g9;

import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u1 extends t0 {
    public final transient l0 d;
    public final transient Object[] e;
    public final transient int f;
    public final transient int h;

    public u1(l0 l0Var, Object[] objArr, int i3, int i10) {
        this.d = l0Var;
        this.e = objArr;
        this.f = i3;
        this.h = i10;
    }

    @Override // g9.d0, java.util.AbstractCollection, java.util.Collection
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

    @Override // g9.d0
    public final int i(int i3, Object[] objArr) {
        return h().i(i3, objArr);
    }

    @Override // g9.d0
    public final boolean m() {
        return true;
    }

    @Override // g9.d0
    /* renamed from: n */
    public final g2 iterator() {
        return h().listIterator(0);
    }

    @Override // g9.t0
    public final i0 r() {
        return new t1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.h;
    }
}
