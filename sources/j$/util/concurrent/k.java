package j$.util.concurrent;

import java.util.Map;

/* loaded from: classes2.dex */
public class k implements Map.Entry {
    public final int a;
    public final Object b;
    public volatile Object c;
    public volatile k d;

    public k(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    public k(int i7, Object obj, Object obj2, k kVar) {
        this(i7, obj, obj2);
        this.d = kVar;
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
        return j$.com.android.tools.r8.a.U(this.b, this.c);
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

    public k a(int i7, Object obj) {
        Object obj2;
        k kVar = this;
        do {
            if (kVar.a == i7 && ((obj2 = kVar.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                return kVar;
            }
            kVar = kVar.d;
        } while (kVar != null);
        return null;
    }
}
