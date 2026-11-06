package a8;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
