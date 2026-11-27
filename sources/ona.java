// default package

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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ona extends AbstractMap {
    public static final /* synthetic */ int f = 0;
    public List a;
    public Map b;
    public boolean c;
    public volatile ms d;
    public Map e;

    public static ona g() {
        ona onaVar = new ona();
        onaVar.a = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        onaVar.b = map;
        onaVar.e = map;
        return onaVar;
    }

    public final int b(Comparable comparable) {
        int i;
        int size = this.a.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((pna) this.a.get(i2)).a);
            if (compareTo > 0) {
                i = size + 1;
                return -i;
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((pna) this.a.get(i4)).a);
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        i = i3 + 1;
        return -i;
    }

    public final void c() {
        if (this.c) {
            p3d.a();
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

    public final Map.Entry d(int i) {
        return (Map.Entry) this.a.get(i);
    }

    public final Set e() {
        return this.b.isEmpty() ? Collections.EMPTY_SET : this.b.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.d == null) {
            this.d = new ms(this, (byte) 1);
        }
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ona)) {
            return super.equals(obj);
        }
        ona onaVar = (ona) obj;
        int size = size();
        if (size == onaVar.size()) {
            int size2 = this.a.size();
            if (size2 != onaVar.a.size()) {
                return ((AbstractSet) entrySet()).equals(onaVar.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (d(i).equals(onaVar.d(i))) {
                }
            }
            if (size2 != size) {
                return this.b.equals(onaVar.b);
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
        int b = b(comparable);
        return b >= 0 ? ((pna) this.a.get(b)).b : this.b.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        c();
        int b = b(comparable);
        if (b >= 0) {
            return ((pna) this.a.get(b)).setValue(obj);
        }
        c();
        if (this.a.isEmpty() && !(this.a instanceof ArrayList)) {
            this.a = new ArrayList(16);
        }
        int i = -(b + 1);
        if (i >= 16) {
            return f().put(comparable, obj);
        }
        if (this.a.size() == 16) {
            pna pnaVar = (pna) this.a.remove(15);
            f().put(pnaVar.a, pnaVar.b);
        }
        this.a.add(i, new pna(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.a.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((pna) this.a.get(i2)).hashCode();
        }
        return this.b.size() > 0 ? this.b.hashCode() + i : i;
    }

    public final Object i(int i) {
        c();
        Object obj = ((pna) this.a.remove(i)).b;
        if (!this.b.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            List list = this.a;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new pna(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        c();
        Comparable comparable = (Comparable) obj;
        int b = b(comparable);
        if (b >= 0) {
            return i(b);
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
