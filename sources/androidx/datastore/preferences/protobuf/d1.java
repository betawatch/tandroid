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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class d1 extends AbstractMap {
    public static final /* synthetic */ int f = 0;
    public List a;
    public Map b;
    public boolean c;
    public volatile a0.a d;
    public Map e;

    public static d1 g() {
        d1 d1Var = new d1();
        d1Var.a = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        d1Var.b = map;
        d1Var.e = map;
        return d1Var;
    }

    public final int b(Comparable comparable) {
        int i7;
        int size = this.a.size();
        int i10 = size - 1;
        if (i10 >= 0) {
            int compareTo = comparable.compareTo(((e1) this.a.get(i10)).a);
            if (compareTo > 0) {
                i7 = size + 1;
                return -i7;
            }
            if (compareTo == 0) {
                return i10;
            }
        }
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) / 2;
            int compareTo2 = comparable.compareTo(((e1) this.a.get(i12)).a);
            if (compareTo2 < 0) {
                i10 = i12 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i12;
                }
                i11 = i12 + 1;
            }
        }
        i7 = i11 + 1;
        return -i7;
    }

    public final void c() {
        if (this.c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        c();
        if (!this.a.isEmpty()) {
            this.a.clear();
        }
        if (this.b.isEmpty()) {
            return;
        }
        this.b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return b(comparable) >= 0 || this.b.containsKey(comparable);
    }

    public final Map.Entry d(int i7) {
        return (Map.Entry) this.a.get(i7);
    }

    public final Set e() {
        return this.b.isEmpty() ? Collections.EMPTY_SET : this.b.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.d == null) {
            this.d = new a0.a(1, this);
        }
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return super.equals(obj);
        }
        d1 d1Var = (d1) obj;
        int size = size();
        if (size == d1Var.size()) {
            int size2 = this.a.size();
            if (size2 != d1Var.a.size()) {
                return ((AbstractSet) entrySet()).equals(d1Var.entrySet());
            }
            for (int i7 = 0; i7 < size2; i7++) {
                if (d(i7).equals(d1Var.d(i7))) {
                }
            }
            if (size2 != size) {
                return this.b.equals(d1Var.b);
            }
            return true;
        }
        return false;
    }

    public final SortedMap f() {
        c();
        if (this.b.isEmpty() && !(this.b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.b = treeMap;
            this.e = treeMap.descendingMap();
        }
        return (SortedMap) this.b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int b10 = b(comparable);
        return b10 >= 0 ? ((e1) this.a.get(b10)).b : this.b.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        c();
        int b10 = b(comparable);
        if (b10 >= 0) {
            return ((e1) this.a.get(b10)).setValue(obj);
        }
        c();
        if (this.a.isEmpty() && !(this.a instanceof ArrayList)) {
            this.a = new ArrayList(16);
        }
        int i7 = -(b10 + 1);
        if (i7 >= 16) {
            return f().put(comparable, obj);
        }
        if (this.a.size() == 16) {
            e1 e1Var = (e1) this.a.remove(15);
            f().put(e1Var.a, e1Var.b);
        }
        this.a.add(i7, new e1(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.a.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i7 += ((e1) this.a.get(i10)).hashCode();
        }
        return this.b.size() > 0 ? this.b.hashCode() + i7 : i7;
    }

    public final Object i(int i7) {
        c();
        Object obj = ((e1) this.a.remove(i7)).b;
        if (!this.b.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            List list = this.a;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new e1(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        c();
        Comparable comparable = (Comparable) obj;
        int b10 = b(comparable);
        if (b10 >= 0) {
            return i(b10);
        }
        if (this.b.isEmpty()) {
            return null;
        }
        return this.b.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.b.size() + this.a.size();
    }
}
