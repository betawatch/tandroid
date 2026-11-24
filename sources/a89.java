// default package

import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class a89 extends yo5 {
    public final transient qo5 d;
    public final transient Object[] e;
    public final transient boolean f;
    public final transient int h;

    /* JADX WARN: Multi-variable type inference failed */
    public a89(qo5 qo5Var, Object[] objArr, int i, int i2) {
        this.d = qo5Var;
        this.e = objArr;
        this.f = i;
        this.h = i2;
    }

    @Override // go5, java.util.AbstractCollection, java.util.Collection, java.util.Set
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

    @Override // go5
    public final int i(int i, Object[] objArr) {
        return h().i(i, objArr);
    }

    @Override // go5
    public final boolean m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: n */
    public final v7c iterator() {
        return h().listIterator(0);
    }

    @Override // yo5
    public final mo5 r() {
        return new z79(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.h;
    }
}
