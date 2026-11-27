// default package

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class edd extends kcd {
    public final transient ybd r;
    public final transient Object[] s;
    public final transient int w;

    public edd(ybd ybdVar, Object[] objArr, int i) {
        super((byte) 2);
        this.r = ybdVar;
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
        kbd kbdVar = this.n;
        if (kbdVar == null) {
            kbdVar = new add(this);
            this.n = kbdVar;
        }
        return kbdVar.listIterator(0);
    }

    @Override // b4d
    public final int p(Object[] objArr) {
        kbd kbdVar = this.n;
        if (kbdVar == null) {
            kbdVar = new add(this);
            this.n = kbdVar;
        }
        return kbdVar.p(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.w;
    }
}
