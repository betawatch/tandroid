package a0;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public class j {
    public final int a;
    public final d6.i b;
    public final nb.a c;
    public int d;
    public int e;
    public int f;

    public j(int i7) {
        this.a = i7;
        if (i7 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.b = new d6.i(9);
        this.c = new nb.a(4);
    }

    public final Object a(Object key) {
        kotlin.jvm.internal.j.e(key, "key");
        synchronized (this.c) {
            d6.i iVar = this.b;
            iVar.getClass();
            Object obj = ((LinkedHashMap) iVar.b).get(key);
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
        kotlin.jvm.internal.j.e(key, "key");
        synchronized (this.c) {
            this.d++;
            d6.i iVar = this.b;
            iVar.getClass();
            put = ((LinkedHashMap) iVar.b).put(key, obj);
            if (put != null) {
                this.d--;
            }
        }
        c(this.a);
        return put;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0094, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i7) {
        while (true) {
            synchronized (this.c) {
                try {
                    if (this.d < 0 || (((LinkedHashMap) this.b.b).isEmpty() && this.d != 0)) {
                        break;
                    }
                    if (this.d <= i7 || ((LinkedHashMap) this.b.b).isEmpty()) {
                        break;
                    }
                    Set entrySet = ((LinkedHashMap) this.b.b).entrySet();
                    kotlin.jvm.internal.j.d(entrySet, "map.entries");
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
                    d6.i iVar = this.b;
                    iVar.getClass();
                    kotlin.jvm.internal.j.e(key, "key");
                    ((LinkedHashMap) iVar.b).remove(key);
                    int i10 = this.d;
                    kotlin.jvm.internal.j.e(value, "value");
                    this.d = i10 - 1;
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
                int i7 = this.e;
                int i10 = this.f + i7;
                str = "LruCache[maxSize=" + this.a + ",hits=" + this.e + ",misses=" + this.f + ",hitRate=" + (i10 != 0 ? (i7 * 100) / i10 : 0) + "%]";
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
