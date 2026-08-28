package j$.util.concurrent;

import java.util.Map;

/* loaded from: classes2.dex */
public class l implements Map.Entry {
    public final int a;
    public final Object b;
    public volatile Object c;
    public volatile l d;

    public l(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    public l(int i9, Object obj, Object obj2, l lVar) {
        this(i9, obj, obj2);
        this.d = lVar;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.b.hashCode() ^ this.c.hashCode();
    }

    public final String toString() {
        return j$.com.android.tools.r8.a.V(this.b, this.c);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (value = entry.getValue()) == null) {
            return false;
        }
        Object obj2 = this.b;
        if (key != obj2 && !key.equals(obj2)) {
            return false;
        }
        Object obj3 = this.c;
        return value == obj3 || value.equals(obj3);
    }

    public l a(int i9, Object obj) {
        Object obj2;
        l lVar = this;
        do {
            if (lVar.a == i9 && ((obj2 = lVar.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                return lVar;
            }
            lVar = lVar.d;
        } while (lVar != null);
        return null;
    }
}
