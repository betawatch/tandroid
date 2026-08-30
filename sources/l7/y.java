package l7;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class y extends t {
    public final transient com.google.android.gms.internal.cast.i0 c;
    public final transient Object[] d;
    public final transient int e = 1;

    public y(com.google.android.gms.internal.cast.i0 i0Var, Object[] objArr) {
        this.c = i0Var;
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

    @Override // l7.o
    public final int i(Object[] objArr) {
        s sVar = this.b;
        if (sVar == null) {
            sVar = new x(this);
            this.b = sVar;
        }
        return sVar.i(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        s sVar = this.b;
        if (sVar == null) {
            sVar = new x(this);
            this.b = sVar;
        }
        return sVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }
}
