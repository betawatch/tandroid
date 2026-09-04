package a0;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import t7.u;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public class k {
    public final int a;
    public final xa.c b;
    public final u c;
    public int d;
    public int e;
    public int f;

    public k(int i10) {
        this.a = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.b = new xa.c(5);
        this.c = new u(3);
    }

    public final Object a(Object key) {
        kotlin.jvm.internal.i.e(key, "key");
        synchronized (this.c) {
            xa.c cVar = this.b;
            cVar.getClass();
            Object obj = ((LinkedHashMap) cVar.b).get(key);
            if (obj != null) {
                this.e++;
                return obj;
            }
            this.f++;
            return null;
        }
    }

    public final Object b(Object key, Object obj) {
        Object put;
        kotlin.jvm.internal.i.e(key, "key");
        synchronized (this.c) {
            this.d++;
            xa.c cVar = this.b;
            cVar.getClass();
            put = ((LinkedHashMap) cVar.b).put(key, obj);
            if (put != null) {
                this.d--;
            }
        }
        c(this.a);
        return put;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0095, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i10) {
        while (true) {
            synchronized (this.c) {
                try {
                    if (this.d < 0 || (((LinkedHashMap) this.b.b).isEmpty() && this.d != 0)) {
                        break;
                    }
                    if (this.d <= i10 || ((LinkedHashMap) this.b.b).isEmpty()) {
                        break;
                    }
                    Set entrySet = ((LinkedHashMap) this.b.b).entrySet();
                    kotlin.jvm.internal.i.d(entrySet, "map.entries");
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
                    xa.c cVar = this.b;
                    cVar.getClass();
                    kotlin.jvm.internal.i.e(key, "key");
                    ((LinkedHashMap) cVar.b).remove(key);
                    int i11 = this.d;
                    kotlin.jvm.internal.i.e(value, "value");
                    this.d = i11 - 1;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final String toString() {
        String str;
        synchronized (this.c) {
            try {
                int i10 = this.e;
                int i11 = this.f + i10;
                str = "LruCache[maxSize=" + this.a + ",hits=" + this.e + ",misses=" + this.f + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
