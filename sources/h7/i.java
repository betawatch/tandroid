package h7;

import com.google.android.gms.internal.cast.h0;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class i extends f {
    public final transient h0 c;
    public final transient Object[] d;
    public final transient int e;

    public i(h0 h0Var, Object[] objArr, int i10) {
        this.c = h0Var;
        this.d = objArr;
        this.e = i10;
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

    @Override // h7.a
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
