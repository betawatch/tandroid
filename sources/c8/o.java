package c8;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class o extends j {
    public final transient a8.v c;
    public final transient Object[] d;
    public final transient int e = 1;

    public o(a8.v vVar, Object[] objArr) {
        this.c = vVar;
        this.d = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // c8.e
    public final int f(Object[] objArr) {
        i iVar = this.b;
        if (iVar == null) {
            iVar = new n(this);
            this.b = iVar;
        }
        return iVar.f(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        i iVar = this.b;
        if (iVar == null) {
            iVar = new n(this);
            this.b = iVar;
        }
        return iVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }
}
