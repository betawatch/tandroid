package a8;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class c0 extends w {
    public final transient v c;
    public final transient Object[] d;
    public final transient int e = 1;

    public c0(v vVar, Object[] objArr) {
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

    @Override // a8.p
    public final int f(Object[] objArr) {
        u uVar = this.b;
        if (uVar == null) {
            uVar = new b0(this);
            this.b = uVar;
        }
        return uVar.f(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        u uVar = this.b;
        if (uVar == null) {
            uVar = new b0(this);
            this.b = uVar;
        }
        return uVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }
}
