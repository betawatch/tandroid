package a0;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class j {
    public final int a;
    public final bb.b b;
    public final z9.d c;
    public int d;
    public int e;
    public int f;

    public j(int i10) {
        this.a = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.b = new bb.b();
        this.c = new z9.d(2);
    }

    public final Object a(Object key) {
        kotlin.jvm.internal.j.e(key, "key");
        synchronized (this.c) {
            bb.b bVar = this.b;
            bVar.getClass();
            Object obj = ((LinkedHashMap) bVar.b).get(key);
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
            bb.b bVar = this.b;
            bVar.getClass();
            put = ((LinkedHashMap) bVar.b).put(key, obj);
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
                    bb.b bVar = this.b;
                    bVar.getClass();
                    kotlin.jvm.internal.j.e(key, "key");
                    ((LinkedHashMap) bVar.b).remove(key);
                    int i11 = this.d;
                    kotlin.jvm.internal.j.e(value, "value");
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
