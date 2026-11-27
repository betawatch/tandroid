// default package

import java.util.Map;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class l99 extends bp5 {
    public final transient to5 d;
    public final transient Object[] e;
    public final transient boolean f;
    public final transient int h;

    /* JADX WARN: Multi-variable type inference failed */
    public l99(to5 to5Var, Object[] objArr, int i, int i2) {
        this.d = to5Var;
        this.e = objArr;
        this.f = i;
        this.h = i2;
    }

    @Override // jo5, java.util.AbstractCollection, java.util.Collection
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

    @Override // jo5
    public final int i(int i, Object[] objArr) {
        return h().i(i, objArr);
    }

    @Override // jo5
    public final boolean m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: n */
    public final v9c iterator() {
        return h().listIterator(0);
    }

    @Override // bp5
    public final po5 r() {
        return new k99(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.h;
    }
}
