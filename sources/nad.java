// default package

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class nad extends t9d {
    public final transient h9d r;
    public final transient Object[] s;
    public final transient int w;

    public nad(h9d h9dVar, Object[] objArr, int i) {
        super((byte) 2);
        this.r = h9dVar;
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
        t8d t8dVar = this.n;
        if (t8dVar == null) {
            t8dVar = new jad(this);
            this.n = t8dVar;
        }
        return t8dVar.listIterator(0);
    }

    @Override // l1d
    public final int p(Object[] objArr) {
        t8d t8dVar = this.n;
        if (t8dVar == null) {
            t8dVar = new jad(this);
            this.n = t8dVar;
        }
        return t8dVar.p(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.w;
    }
}
