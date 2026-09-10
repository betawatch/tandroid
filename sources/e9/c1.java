package e9;

import java.util.Map;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class c1 extends m0 {
    public final transient k0 d;
    public final transient Object[] e;
    public final transient int f;
    public final transient int h;

    public c1(k0 k0Var, Object[] objArr, int i10, int i11) {
        this.d = k0Var;
        this.e = objArr;
        this.f = i10;
        this.h = i11;
    }

    @Override // e9.d0, java.util.AbstractCollection, java.util.Collection, java.util.Set
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

    @Override // e9.d0
    public final int n(int i10, Object[] objArr) {
        return i().n(i10, objArr);
    }

    @Override // e9.d0
    public final boolean r() {
        return true;
    }

    @Override // e9.d0
    /* renamed from: s */
    public final o1 iterator() {
        return i().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.h;
    }

    @Override // e9.m0
    public final i0 w() {
        return new b1(this);
    }
}
