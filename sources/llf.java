// default package

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class llf extends jhf {
    public final transient ybd h;
    public final transient Object[] n;
    public final transient boolean r;

    public llf(ybd ybdVar, Object[] objArr) {
        super((byte) 2);
        this.h = ybdVar;
        this.n = objArr;
        this.r = true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.h.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // qdd
    public final int h(Object[] objArr) {
        wbf wbfVar = this.f;
        if (wbfVar == null) {
            wbfVar = new zkf(this);
            this.f = wbfVar;
        }
        return wbfVar.h(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        wbf wbfVar = this.f;
        if (wbfVar == null) {
            wbfVar = new zkf(this);
            this.f = wbfVar;
        }
        return wbfVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.r ? 1 : 0;
    }
}
