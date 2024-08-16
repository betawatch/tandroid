package androidx.collection;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes.dex */
public class LruCache<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final LinkedHashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    protected V create(K k) {
        return null;
    }

    protected void entryRemoved(boolean z, K k, V v, V v2) {
    }

    protected int sizeOf(K k, V v) {
        return 1;
    }

    public LruCache(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.maxSize = i;
        this.map = new LinkedHashMap<>(0, 0.75f, true);
    }

    public final V get(K k) {
        V put;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                V v = this.map.get(k);
                if (v != null) {
                    this.hitCount++;
                    return v;
                }
                this.missCount++;
                V create = create(k);
                if (create == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        this.createCount++;
                        put = this.map.put(k, create);
                        if (put != null) {
                            this.map.put(k, put);
                        } else {
                            this.size += safeSizeOf(k, create);
                        }
                    } finally {
                    }
                }
                if (put != null) {
                    entryRemoved(false, k, create, put);
                    return put;
                }
                trimToSize(this.maxSize);
                return create;
            } finally {
            }
        }
    }

    public final V put(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.putCount++;
                this.size += safeSizeOf(k, v);
                put = this.map.put(k, v);
                if (put != null) {
                    this.size -= safeSizeOf(k, put);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (put != null) {
            entryRemoved(false, k, put, v);
        }
        trimToSize(this.maxSize);
        return put;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void trimToSize(int i) {
        K key;
        V value;
        while (true) {
            synchronized (this) {
                try {
                    if (this.size < 0 || (this.map.isEmpty() && this.size != 0)) {
                        break;
                    }
                    if (this.size <= i || this.map.isEmpty()) {
                        break;
                    }
                    Map.Entry<K, V> next = this.map.entrySet().iterator().next();
                    key = next.getKey();
                    value = next.getValue();
                    this.map.remove(key);
                    this.size -= safeSizeOf(key, value);
                    this.evictionCount++;
                } finally {
                }
            }
            entryRemoved(true, key, value, null);
        }
    }

    private int safeSizeOf(K k, V v) {
        int sizeOf = sizeOf(k, v);
        if (sizeOf >= 0) {
            return sizeOf;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    public final synchronized String toString() {
        int i;
        int i2;
        try {
            i = this.hitCount;
            i2 = this.missCount + i;
        } catch (Throwable th) {
            throw th;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.maxSize), Integer.valueOf(this.hitCount), Integer.valueOf(this.missCount), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }
}
