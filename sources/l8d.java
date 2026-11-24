// default package

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class l8d extends r7d {
    public final transient f7d r;
    public final transient Object[] s;
    public final transient int w;

    public l8d(f7d f7dVar, Object[] objArr, int i) {
        super((byte) 2);
        this.r = f7dVar;
        this.s = objArr;
        this.w = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.r.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        r6d r6dVar = this.n;
        if (r6dVar == null) {
            r6dVar = new h8d(this);
            this.n = r6dVar;
        }
        return r6dVar.listIterator(0);
    }

    @Override // kzc
    public final int p(Object[] objArr) {
        r6d r6dVar = this.n;
        if (r6dVar == null) {
            r6dVar = new h8d(this);
            this.n = r6dVar;
        }
        return r6dVar.p(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.w;
    }
}
