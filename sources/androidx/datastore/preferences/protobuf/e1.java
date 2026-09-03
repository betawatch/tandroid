package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class e1 extends AbstractMap {
    public static final /* synthetic */ int h = 0;
    public final int a;
    public List b = Collections.EMPTY_LIST;
    public Map c;
    public boolean d;
    public volatile a0.a e;
    public Map f;

    public e1(int i10) {
        this.a = i10;
        Map map = Collections.EMPTY_MAP;
        this.c = map;
        this.f = map;
    }

    public final int a(Comparable comparable) {
        int i10;
        int size = this.b.size();
        int i11 = size - 1;
        if (i11 >= 0) {
            int compareTo = comparable.compareTo(((h1) this.b.get(i11)).a);
            if (compareTo > 0) {
                i10 = size + 1;
                return -i10;
            }
            if (compareTo == 0) {
                return i11;
            }
        }
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int compareTo2 = comparable.compareTo(((h1) this.b.get(i13)).a);
            if (compareTo2 < 0) {
                i11 = i13 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i13;
                }
                i12 = i13 + 1;
            }
        }
        i10 = i12 + 1;
        return -i10;
    }

    public final void b() {
        if (this.d) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i10) {
        return (Map.Entry) this.b.get(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
        if (this.c.isEmpty()) {
            return;
        }
        this.c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.c.containsKey(comparable);
    }

    public final Iterable d() {
        return this.c.isEmpty() ? s0.b : this.c.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.c = treeMap;
            this.f = treeMap.descendingMap();
        }
        return (SortedMap) this.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.e == null) {
            this.e = new a0.a(1, this);
        }
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return super.equals(obj);
        }
        e1 e1Var = (e1) obj;
        int size = size();
        if (size == e1Var.size()) {
            int size2 = this.b.size();
            if (size2 != e1Var.b.size()) {
                return ((AbstractSet) entrySet()).equals(e1Var.entrySet());
            }
            for (int i10 = 0; i10 < size2; i10++) {
                if (c(i10).equals(e1Var.c(i10))) {
                }
            }
            if (size2 != size) {
                return this.c.equals(e1Var.c);
            }
            return true;
        }
        return false;
    }

    public final Object f(Comparable comparable, Object obj) {
        b();
        int a2 = a(comparable);
        if (a2 >= 0) {
            return ((h1) this.b.get(a2)).setValue(obj);
        }
        b();
        boolean isEmpty = this.b.isEmpty();
        int i10 = this.a;
        if (isEmpty && !(this.b instanceof ArrayList)) {
            this.b = new ArrayList(i10);
        }
        int i11 = -(a2 + 1);
        if (i11 >= i10) {
            return e().put(comparable, obj);
        }
        if (this.b.size() == i10) {
            h1 h1Var = (h1) this.b.remove(i10 - 1);
            e().put(h1Var.a, h1Var.b);
        }
        this.b.add(i11, new h1(this, comparable, obj));
        return null;
    }

    public final Object g(int i10) {
        b();
        Object obj = ((h1) this.b.remove(i10)).b;
        if (!this.c.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new h1(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        return a2 >= 0 ? ((h1) this.b.get(a2)).b : this.c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.b.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += ((h1) this.b.get(i11)).hashCode();
        }
        return this.c.size() > 0 ? this.c.hashCode() + i10 : i10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        if (obj == null) {
            return f(null, obj2);
        }
        throw new ClassCastException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return g(a2);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c.size() + this.b.size();
    }
}
