package a0;

import d7.u;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class j {
    public final int a;
    public final k5.i b;
    public final u c;
    public int d;
    public int e;
    public int f;

    public j(int i9) {
        this.a = i9;
        if (i9 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.b = new k5.i(4);
        this.c = new u(3);
    }

    public final Object a(Object key) {
        kotlin.jvm.internal.i.e(key, "key");
        synchronized (this.c) {
            k5.i iVar = this.b;
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
        kotlin.jvm.internal.i.e(key, "key");
        synchronized (this.c) {
            this.d++;
            k5.i iVar = this.b;
            iVar.getClass();
            put = ((LinkedHashMap) iVar.b).put(key, obj);
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
    public final void c(int i9) {
        while (true) {
            synchronized (this.c) {
                try {
                    if (this.d < 0 || (((LinkedHashMap) this.b.b).isEmpty() && this.d != 0)) {
                        break;
                    }
                    if (this.d <= i9 || ((LinkedHashMap) this.b.b).isEmpty()) {
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
                    k5.i iVar = this.b;
                    iVar.getClass();
                    kotlin.jvm.internal.i.e(key, "key");
                    ((LinkedHashMap) iVar.b).remove(key);
                    int i10 = this.d;
                    kotlin.jvm.internal.i.e(value, "value");
                    this.d = i10 - 1;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final String toString() {
        String str;
        synchronized (this.c) {
            try {
                int i9 = this.e;
                int i10 = this.f + i9;
                str = "LruCache[maxSize=" + this.a + ",hits=" + this.e + ",misses=" + this.f + ",hitRate=" + (i10 != 0 ? (i9 * 100) / i10 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
