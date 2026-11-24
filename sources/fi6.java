// default package

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class fi6 {
    public final byte a;
    public final ai4 b;
    public final kg7 c;
    public int d;
    public int e;
    public int f;

    /* JADX WARN: Multi-variable type inference failed */
    public fi6(int i) {
        this.a = i;
        if (i <= 0) {
            u36.j("maxSize <= 0");
            throw null;
        }
        this.b = new ai4((byte) 11);
        this.c = new kg7((byte) 21);
    }

    public final Object a(Object obj) {
        synchronized (this.c) {
            Object obj2 = ((LinkedHashMap) this.b.b).get(obj);
            if (obj2 != null) {
                this.e++;
                return obj2;
            }
            this.f++;
            return null;
        }
    }

    public final Object b(Object obj, Object obj2) {
        Object put;
        synchronized (this.c) {
            this.d++;
            put = ((LinkedHashMap) this.b.b).put(obj, obj2);
            if (put != null) {
                this.d--;
            }
        }
        c(this.a);
        return put;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0083, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i) {
        while (true) {
            synchronized (this.c) {
                if (this.d < 0 || (((LinkedHashMap) this.b.b).isEmpty() && this.d != 0)) {
                    break;
                }
                if (this.d <= i || ((LinkedHashMap) this.b.b).isEmpty()) {
                    break;
                }
                Set entrySet = ((LinkedHashMap) this.b.b).entrySet();
                entrySet.getClass();
                Object obj = null;
                if (entrySet instanceof List) {
                    List list = (List) entrySet;
                    if (!list.isEmpty()) {
                        obj = list.get(0);
                    }
                } else {
                    Iterator it = entrySet.iterator();
                    if (it.hasNext()) {
                        obj = it.next();
                    }
                }
                Map.Entry entry = (Map.Entry) obj;
                if (entry == null) {
                    return;
                }
                Object key = entry.getKey();
                Object value = entry.getValue();
                ai4 ai4Var = this.b;
                key.getClass();
                ((LinkedHashMap) ai4Var.b).remove(key);
                int i2 = this.d;
                value.getClass();
                this.d = i2 - 1;
            }
        }
    }

    public final String toString() {
        String str;
        synchronized (this.c) {
            int i = this.e;
            int i2 = this.f + i;
            str = "LruCache[maxSize=" + ((int) this.a) + ",hits=" + this.e + ",misses=" + this.f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
        }
        return str;
    }
}
