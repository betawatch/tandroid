package h9;

import java.util.Map;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class v1 extends t0 {
    public final transient l0 d;
    public final transient Object[] e;
    public final transient int f;
    public final transient int h;

    public v1(l0 l0Var, Object[] objArr, int i7, int i10) {
        this.d = l0Var;
        this.e = objArr;
        this.f = i7;
        this.h = i10;
    }

    @Override // h9.d0, java.util.AbstractCollection, java.util.Collection, java.util.Set
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
    public final h2 iterator() {
        return f().listIterator(0);
    }

    @Override // h9.t0
    public final i0 r() {
        return new u1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.h;
    }
}
