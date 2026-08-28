package d7;

import com.google.android.gms.internal.cast.j0;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i extends f {
    public final transient j0 c;
    public final transient Object[] d;
    public final transient int e;

    public i(j0 j0Var, Object[] objArr, int i9) {
        this.c = j0Var;
        this.d = objArr;
        this.e = i9;
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

    @Override // d7.a
    public final int i(Object[] objArr) {
        d dVar = this.b;
        if (dVar == null) {
            dVar = new h(this);
            this.b = dVar;
        }
        return dVar.i(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        d dVar = this.b;
        if (dVar == null) {
            dVar = new h(this);
            this.b = dVar;
        }
        return dVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }
}
