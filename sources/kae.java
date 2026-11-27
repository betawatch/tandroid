// default package

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class kae extends g9e {
    public final transient ybd s;
    public final transient Object[] w;
    public final transient int x;

    public kae(ybd ybdVar, Object[] objArr, int i) {
        super((byte) 5);
        this.s = ybdVar;
        this.w = objArr;
        this.x = i;
    }

    public final k8e A() {
        return new eae(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.s.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        k8e k8eVar = this.n;
        if (k8eVar == null) {
            k8eVar = A();
            this.n = k8eVar;
        }
        return k8eVar.listIterator(0);
    }

    @Override // b4d
    public final int p(Object[] objArr) {
        k8e k8eVar = this.n;
        if (k8eVar == null) {
            k8eVar = A();
            this.n = k8eVar;
        }
        return k8eVar.p(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.x;
    }
}
