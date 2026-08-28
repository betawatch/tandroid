package j$.util.concurrent;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* loaded from: classes2.dex */
public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, u {
    public static final int g = Runtime.getRuntime().availableProcessors();
    public static final j$.sun.misc.a h;
    public static final long i;
    public static final long j;
    public static final long k;
    public static final long l;
    public static final long m;
    public static final int n;
    public static final int o;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;
    public volatile transient l[] a;
    public volatile transient l[] b;
    private volatile transient long baseCount;
    public volatile transient c[] c;
    private volatile transient int cellsBusy;
    public transient i d;
    public transient s e;
    public transient e f;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    public static final int i(int i9) {
        return (i9 ^ (i9 >>> 16)) & ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    static {
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField("segments", n[].class), new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        j$.sun.misc.a aVar = j$.sun.misc.a.b;
        h = aVar;
        i = aVar.h(ConcurrentHashMap.class, "sizeCtl");
        j = aVar.h(ConcurrentHashMap.class, "transferIndex");
        k = aVar.h(ConcurrentHashMap.class, "baseCount");
        l = aVar.h(ConcurrentHashMap.class, "cellsBusy");
        m = aVar.h(c.class, "value");
        n = aVar.a(l[].class);
        int b10 = aVar.b(l[].class);
        if (((b10 - 1) & b10) != 0) {
            throw new ExceptionInInitializerError("array index scale not a power of two");
        }
        o = 31 - Integer.numberOfLeadingZeros(b10);
    }

    public static final int l(int i9) {
        int numberOfLeadingZeros = (-1) >>> Integer.numberOfLeadingZeros(i9 - 1);
        if (numberOfLeadingZeros < 0) {
            return 1;
        }
        return numberOfLeadingZeros >= 1073741824 ? TLObject.FLAG_30 : numberOfLeadingZeros + 1;
    }

    public static Class c(Object obj) {
        Type[] actualTypeArguments;
        if (!(obj instanceof Comparable)) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (cls != String.class) {
            Type[] genericInterfaces = cls.getGenericInterfaces();
            if (genericInterfaces == null) {
                return null;
            }
            for (Type type : genericInterfaces) {
                if (type instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type;
                    if (parameterizedType.getRawType() == Comparable.class && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && actualTypeArguments.length == 1 && actualTypeArguments[0] == cls) {
                    }
                }
            }
            return null;
        }
        return cls;
    }

    public static final l k(l[] lVarArr, int i9) {
        return (l) h.f(lVarArr, (i9 << o) + n);
    }

    public static final boolean b(l[] lVarArr, int i9, l lVar) {
        return j$.com.android.tools.r8.a.Q(h.a, lVarArr, (i9 << o) + n, lVar);
    }

    public static final void h(l[] lVarArr, int i9, l lVar) {
        h.j(lVarArr, (i9 << o) + n, lVar);
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i9) {
        this(i9, 0.75f, 1);
    }

    public ConcurrentHashMap(int i9, float f10, int i10) {
        if (f10 <= 0.0f || i9 < 0 || i10 <= 0) {
            throw new IllegalArgumentException();
        }
        long j10 = (long) (((i9 < i10 ? i10 : i9) / f10) + 1.0d);
        this.sizeCtl = j10 >= 1073741824 ? TLObject.FLAG_30 : l((int) j10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j10 = j();
        if (j10 < 0) {
            return 0;
        }
        return j10 > 2147483647L ? ConnectionsManager.DEFAULT_DATACENTER_ID : (int) j10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return j() <= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004c, code lost:
    
        return (V) r1.c;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public V get(Object obj) {
        int length;
        l k10;
        Object obj2;
        int i9 = i(obj.hashCode());
        l[] lVarArr = this.a;
        if (lVarArr == null || (length = lVarArr.length) <= 0 || (k10 = k(lVarArr, (length - 1) & i9)) == null) {
            return null;
        }
        int i10 = k10.a;
        if (i10 == i9) {
            Object obj3 = k10.b;
            if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                return (V) k10.c;
            }
        } else if (i10 < 0) {
            l a2 = k10.a(i9, obj);
            if (a2 != null) {
                return (V) a2.c;
            }
            return null;
        }
        while (true) {
            k10 = k10.d;
            if (k10 == null) {
                return null;
            }
            if (k10.a != i9 || ((obj2 = k10.b) != obj && (obj2 == null || !obj.equals(obj2)))) {
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        obj.getClass();
        l[] lVarArr = this.a;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l a2 = pVar.a();
                if (a2 == null) {
                    break;
                }
                Object obj2 = a2.c;
                if (obj2 == obj) {
                    return true;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v) {
        return (V) f(k10, v, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b4, code lost:
    
        a(1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b9, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00a5, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Object obj, Object obj2, boolean z10) {
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        if (obj == null) {
            throw null;
        }
        if (obj2 == null) {
            throw null;
        }
        int i9 = i(obj.hashCode());
        l[] lVarArr = this.a;
        int i10 = 0;
        while (true) {
            if (lVarArr != null) {
                int length = lVarArr.length;
                if (length != 0) {
                    int i11 = (length - 1) & i9;
                    l k10 = k(lVarArr, i11);
                    if (k10 == null) {
                        if (b(lVarArr, i11, new l(i9, obj, obj2))) {
                            break;
                        }
                    } else {
                        int i12 = k10.a;
                        if (i12 == -1) {
                            lVarArr = d(lVarArr, k10);
                        } else {
                            if (z10 && i12 == i9 && (((obj5 = k10.b) == obj || (obj5 != null && obj.equals(obj5))) && (obj6 = k10.c) != null)) {
                                return obj6;
                            }
                            synchronized (k10) {
                                try {
                                    if (k(lVarArr, i11) == k10) {
                                        if (i12 >= 0) {
                                            i10 = 1;
                                            l lVar = k10;
                                            while (true) {
                                                if (lVar.a == i9 && ((obj4 = lVar.b) == obj || (obj4 != null && obj.equals(obj4)))) {
                                                    break;
                                                }
                                                l lVar2 = lVar.d;
                                                if (lVar2 == null) {
                                                    lVar.d = new l(i9, obj, obj2);
                                                    break;
                                                }
                                                i10++;
                                                lVar = lVar2;
                                            }
                                            obj3 = lVar.c;
                                            if (!z10) {
                                                lVar.c = obj2;
                                            }
                                        } else if (k10 instanceof q) {
                                            r e10 = ((q) k10).e(i9, obj, obj2);
                                            if (e10 != null) {
                                                Object obj7 = e10.c;
                                                if (!z10) {
                                                    e10.c = obj2;
                                                }
                                                obj3 = obj7;
                                            } else {
                                                obj3 = null;
                                            }
                                            i10 = 2;
                                        } else if (k10 instanceof m) {
                                            break;
                                        }
                                    }
                                    obj3 = null;
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            if (i10 != 0) {
                                if (i10 >= 8) {
                                    n(lVarArr, i11);
                                }
                                if (obj3 != null) {
                                    return obj3;
                                }
                            }
                        }
                    }
                }
            }
            lVarArr = e();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        o(map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            f(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        return (V) g(obj, null, null);
    }

    public final Object g(Object obj, Object obj2, Object obj3) {
        int length;
        int i9;
        l k10;
        boolean z10;
        Object obj4;
        r b10;
        Object obj5;
        int i10 = i(obj.hashCode());
        l[] lVarArr = this.a;
        while (true) {
            if (lVarArr == null || (length = lVarArr.length) == 0 || (k10 = k(lVarArr, (i9 = (length - 1) & i10))) == null) {
                break;
            }
            int i11 = k10.a;
            if (i11 == -1) {
                lVarArr = d(lVarArr, k10);
            } else {
                synchronized (k10) {
                    try {
                        if (k(lVarArr, i9) == k10) {
                            z10 = true;
                            if (i11 >= 0) {
                                l lVar = null;
                                l lVar2 = k10;
                                while (true) {
                                    if (lVar2.a == i10 && ((obj5 = lVar2.b) == obj || (obj5 != null && obj.equals(obj5)))) {
                                        break;
                                    }
                                    l lVar3 = lVar2.d;
                                    if (lVar3 == null) {
                                        break;
                                    }
                                    lVar = lVar2;
                                    lVar2 = lVar3;
                                }
                                obj4 = lVar2.c;
                                if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                    if (obj2 != null) {
                                        lVar2.c = obj2;
                                    } else if (lVar != null) {
                                        lVar.d = lVar2.d;
                                    } else {
                                        h(lVarArr, i9, lVar2.d);
                                    }
                                }
                                obj4 = null;
                            } else if (k10 instanceof q) {
                                q qVar = (q) k10;
                                r rVar = qVar.e;
                                if (rVar != null && (b10 = rVar.b(i10, obj, null)) != null) {
                                    obj4 = b10.c;
                                    if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                        if (obj2 != null) {
                                            b10.c = obj2;
                                        } else if (qVar.f(b10)) {
                                            h(lVarArr, i9, p(qVar.f));
                                        }
                                    }
                                }
                                obj4 = null;
                            } else if (k10 instanceof m) {
                                throw new IllegalStateException("Recursive update");
                            }
                        }
                        z10 = false;
                        obj4 = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z10) {
                    if (obj4 != null) {
                        if (obj2 == null) {
                            a(-1L, -1);
                        }
                        return obj4;
                    }
                }
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        l k10;
        l lVar;
        l[] lVarArr = this.a;
        long j10 = 0;
        loop0: while (true) {
            int i9 = 0;
            while (lVarArr != null && i9 < lVarArr.length) {
                k10 = k(lVarArr, i9);
                if (k10 == null) {
                    i9++;
                } else {
                    int i10 = k10.a;
                    if (i10 == -1) {
                        break;
                    }
                    synchronized (k10) {
                        try {
                            if (k(lVarArr, i9) == k10) {
                                if (i10 >= 0) {
                                    lVar = k10;
                                } else {
                                    lVar = k10 instanceof q ? ((q) k10).f : null;
                                }
                                while (lVar != null) {
                                    j10--;
                                    lVar = lVar.d;
                                }
                                h(lVarArr, i9, null);
                                i9++;
                            }
                        } finally {
                        }
                    }
                }
            }
            lVarArr = d(lVarArr, k10);
        }
        if (j10 != 0) {
            a(j10, -1);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        i iVar = this.d;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(this);
        this.d = iVar2;
        return iVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        s sVar = this.e;
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(this);
        this.e = sVar2;
        return sVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        e eVar = this.f;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this);
        this.f = eVar2;
        return eVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        l[] lVarArr = this.a;
        int i9 = 0;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l a2 = pVar.a();
                if (a2 == null) {
                    break;
                }
                i9 += a2.c.hashCode() ^ a2.b.hashCode();
            }
        }
        return i9;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        l[] lVarArr = this.a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        p pVar = new p(lVarArr, length, 0, length);
        StringBuilder sb2 = new StringBuilder("{");
        l a2 = pVar.a();
        if (a2 != null) {
            while (true) {
                Object obj = a2.b;
                Object obj2 = a2.c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb2.append(obj);
                sb2.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb2.append(obj2);
                a2 = pVar.a();
                if (a2 == null) {
                    break;
                }
                sb2.append(", ");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        V value;
        V v;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        l[] lVarArr = this.a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        p pVar = new p(lVarArr, length, 0, length);
        while (true) {
            l a2 = pVar.a();
            if (a2 != null) {
                Object obj2 = a2.c;
                Object obj3 = map.get(a2.b);
                if (obj3 == null || (obj3 != obj2 && !obj3.equals(obj2))) {
                    break;
                }
            } else {
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    K key = entry.getKey();
                    if (key == null || (value = entry.getValue()) == null || (v = get(key)) == null || (value != v && !value.equals(v))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        int i9 = 1;
        int i10 = 0;
        while (i9 < 16) {
            i10++;
            i9 <<= 1;
        }
        int i11 = 32 - i10;
        int i12 = i9 - 1;
        n[] nVarArr = new n[16];
        for (int i13 = 0; i13 < 16; i13++) {
            nVarArr[i13] = new n();
        }
        ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
        putFields.put("segments", nVarArr);
        putFields.put("segmentShift", i11);
        putFields.put("segmentMask", i12);
        objectOutputStream.writeFields();
        l[] lVarArr = this.a;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l a2 = pVar.a();
                if (a2 == null) {
                    break;
                }
                objectOutputStream.writeObject(a2.b);
                objectOutputStream.writeObject(a2.c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        long j10;
        long j11;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j12 = 0;
        long j13 = 0;
        l lVar = null;
        while (true) {
            Object readObject = objectInputStream.readObject();
            Object readObject2 = objectInputStream.readObject();
            j10 = 1;
            if (readObject == null || readObject2 == null) {
                break;
            }
            j13++;
            lVar = new l(i(readObject.hashCode()), readObject, readObject2, lVar);
        }
        if (j13 == 0) {
            this.sizeCtl = 0;
            return;
        }
        long j14 = (long) ((j13 / 0.75f) + 1.0d);
        int l10 = j14 >= 1073741824 ? TLObject.FLAG_30 : l((int) j14);
        l[] lVarArr = new l[l10];
        int i9 = l10 - 1;
        while (lVar != null) {
            l lVar2 = lVar.d;
            int i10 = lVar.a;
            int i11 = i10 & i9;
            l k10 = k(lVarArr, i11);
            boolean z10 = true;
            if (k10 == null) {
                j11 = j10;
            } else {
                Object obj2 = lVar.b;
                if (k10.a < 0) {
                    if (((q) k10).e(i10, obj2, lVar.c) == null) {
                        j12 += j10;
                    }
                    j11 = j10;
                } else {
                    j11 = j10;
                    int i12 = 0;
                    for (l lVar3 = k10; lVar3 != null; lVar3 = lVar3.d) {
                        if (lVar3.a == i10 && ((obj = lVar3.b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z10 = false;
                            break;
                        }
                        i12++;
                    }
                    if (z10 && i12 >= 8) {
                        j12 += j11;
                        lVar.d = k10;
                        l lVar4 = lVar;
                        r rVar = null;
                        r rVar2 = null;
                        while (lVar4 != null) {
                            r rVar3 = new r(lVar4.a, lVar4.b, lVar4.c, null, null);
                            rVar3.h = rVar2;
                            if (rVar2 == null) {
                                rVar = rVar3;
                            } else {
                                rVar2.d = rVar3;
                            }
                            lVar4 = lVar4.d;
                            rVar2 = rVar3;
                        }
                        h(lVarArr, i11, new q(rVar));
                    }
                }
                z10 = false;
            }
            if (z10) {
                j12 += j11;
                lVar.d = k10;
                h(lVarArr, i11, lVar);
            }
            lVar = lVar2;
            j10 = j11;
        }
        this.a = lVarArr;
        this.sizeCtl = l10 - (l10 >>> 2);
        this.baseCount = j12;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public V putIfAbsent(K k10, V v) {
        return (V) f(k10, v, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        obj.getClass();
        return (obj2 == null || g(obj, null, obj2) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        if (obj == null || obj2 == null || obj3 == null) {
            throw null;
        }
        return g(obj, obj3, obj2) != null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        if (obj == null) {
            throw null;
        }
        if (obj2 == null) {
            throw null;
        }
        return g(obj, obj2, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        V v = get(obj);
        return v == null ? obj2 : v;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        biConsumer.getClass();
        l[] lVarArr = this.a;
        if (lVarArr == null) {
            return;
        }
        p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            l a2 = pVar.a();
            if (a2 == null) {
                return;
            } else {
                biConsumer.accept(a2.b, a2.c);
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        biFunction.getClass();
        l[] lVarArr = this.a;
        if (lVarArr == null) {
            return;
        }
        p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            l a2 = pVar.a();
            if (a2 == null) {
                return;
            }
            Object obj = a2.c;
            Object obj2 = a2.b;
            do {
                Object apply = biFunction.apply(obj2, obj);
                apply.getClass();
                if (g(obj2, apply, obj) == null) {
                    obj = get(obj2);
                }
            } while (obj != null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f0, code lost:
    
        if (r5 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f2, code lost:
    
        a(1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f7, code lost:
    
        return r5;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object computeIfAbsent(Object obj, Function function) {
        r b10;
        Object obj2;
        Object obj3;
        Object obj4;
        if (obj == null) {
            throw null;
        }
        if (function == null) {
            throw null;
        }
        int i9 = i(obj.hashCode());
        l[] lVarArr = this.a;
        Object obj5 = null;
        int i10 = 0;
        while (true) {
            if (lVarArr != null) {
                int length = lVarArr.length;
                if (length != 0) {
                    int i11 = (length - 1) & i9;
                    l k10 = k(lVarArr, i11);
                    boolean z10 = true;
                    if (k10 == null) {
                        m mVar = new m();
                        synchronized (mVar) {
                            try {
                                if (b(lVarArr, i11, mVar)) {
                                    try {
                                        obj5 = function.apply(obj);
                                        h(lVarArr, i11, obj5 != null ? new l(i9, obj, obj5) : null);
                                        i10 = 1;
                                    } catch (Throwable th) {
                                        h(lVarArr, i11, null);
                                        throw th;
                                    }
                                }
                            } finally {
                            }
                        }
                        if (i10 != 0) {
                        }
                    } else {
                        int i12 = k10.a;
                        if (i12 == -1) {
                            lVarArr = d(lVarArr, k10);
                        } else {
                            if (i12 == i9 && (((obj3 = k10.b) == obj || (obj3 != null && obj.equals(obj3))) && (obj4 = k10.c) != null)) {
                                return obj4;
                            }
                            synchronized (k10) {
                                try {
                                    if (k(lVarArr, i11) == k10) {
                                        if (i12 >= 0) {
                                            l lVar = k10;
                                            i10 = 1;
                                            while (true) {
                                                if (lVar.a == i9 && ((obj2 = lVar.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                                                    break;
                                                }
                                                l lVar2 = lVar.d;
                                                if (lVar2 == null) {
                                                    Object apply = function.apply(obj);
                                                    if (apply == null) {
                                                        obj5 = apply;
                                                    } else {
                                                        if (lVar.d != null) {
                                                            throw new IllegalStateException("Recursive update");
                                                        }
                                                        lVar.d = new l(i9, obj, apply);
                                                        obj5 = apply;
                                                    }
                                                } else {
                                                    i10++;
                                                    lVar = lVar2;
                                                }
                                            }
                                            obj5 = lVar.c;
                                        } else if (k10 instanceof q) {
                                            q qVar = (q) k10;
                                            r rVar = qVar.e;
                                            if (rVar != null && (b10 = rVar.b(i9, obj, null)) != null) {
                                                obj5 = b10.c;
                                            } else {
                                                obj5 = function.apply(obj);
                                                if (obj5 != null) {
                                                    qVar.e(i9, obj, obj5);
                                                    i10 = 2;
                                                }
                                            }
                                            z10 = false;
                                            i10 = 2;
                                        } else if (k10 instanceof m) {
                                            throw new IllegalStateException("Recursive update");
                                        }
                                    }
                                    z10 = false;
                                } finally {
                                }
                            }
                            if (i10 != 0) {
                                if (i10 >= 8) {
                                    n(lVarArr, i11);
                                }
                                if (!z10) {
                                    return obj5;
                                }
                            }
                        }
                    }
                }
            }
            lVarArr = e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00aa, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        r b10;
        Object obj2;
        if (obj == null) {
            throw null;
        }
        if (biFunction == null) {
            throw null;
        }
        int i9 = i(obj.hashCode());
        l[] lVarArr = this.a;
        int i10 = 0;
        Object obj3 = null;
        int i11 = 0;
        while (true) {
            if (lVarArr != null) {
                int length = lVarArr.length;
                if (length != 0) {
                    int i12 = (length - 1) & i9;
                    l k10 = k(lVarArr, i12);
                    if (k10 == null) {
                        break;
                    }
                    int i13 = k10.a;
                    if (i13 == -1) {
                        lVarArr = d(lVarArr, k10);
                    } else {
                        synchronized (k10) {
                            try {
                                if (k(lVarArr, i12) == k10) {
                                    if (i13 >= 0) {
                                        i11 = 1;
                                        l lVar = null;
                                        l lVar2 = k10;
                                        while (true) {
                                            if (lVar2.a == i9 && ((obj2 = lVar2.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                                                break;
                                            }
                                            l lVar3 = lVar2.d;
                                            if (lVar3 == null) {
                                                break;
                                            }
                                            i11++;
                                            lVar = lVar2;
                                            lVar2 = lVar3;
                                        }
                                        obj3 = biFunction.apply(obj, lVar2.c);
                                        if (obj3 != null) {
                                            lVar2.c = obj3;
                                        } else {
                                            l lVar4 = lVar2.d;
                                            if (lVar != null) {
                                                lVar.d = lVar4;
                                            } else {
                                                h(lVarArr, i12, lVar4);
                                            }
                                            i10 = -1;
                                        }
                                    } else if (k10 instanceof q) {
                                        q qVar = (q) k10;
                                        r rVar = qVar.e;
                                        if (rVar != null && (b10 = rVar.b(i9, obj, null)) != null) {
                                            obj3 = biFunction.apply(obj, b10.c);
                                            if (obj3 != null) {
                                                b10.c = obj3;
                                            } else {
                                                if (qVar.f(b10)) {
                                                    h(lVarArr, i12, p(qVar.f));
                                                }
                                                i10 = -1;
                                            }
                                        }
                                        i11 = 2;
                                    } else if (k10 instanceof m) {
                                        break;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (i11 != 0) {
                            break;
                        }
                    }
                }
            }
            lVarArr = e();
        }
        if (i10 != 0) {
            a(i10, i11);
        }
        return obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0112, code lost:
    
        if (r4 == 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0114, code lost:
    
        a(r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0118, code lost:
    
        return r5;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object compute(Object obj, BiFunction biFunction) {
        l lVar;
        Object obj2;
        if (obj == null) {
            throw null;
        }
        if (biFunction == null) {
            throw null;
        }
        int i9 = i(obj.hashCode());
        l[] lVarArr = this.a;
        int i10 = 0;
        Object obj3 = null;
        int i11 = 0;
        while (true) {
            if (lVarArr != null) {
                int length = lVarArr.length;
                if (length != 0) {
                    int i12 = (length - 1) & i9;
                    l k10 = k(lVarArr, i12);
                    if (k10 == null) {
                        m mVar = new m();
                        synchronized (mVar) {
                            try {
                                if (b(lVarArr, i12, mVar)) {
                                    try {
                                        obj3 = biFunction.apply(obj, null);
                                        if (obj3 != null) {
                                            lVar = new l(i9, obj, obj3);
                                            i11 = 1;
                                        } else {
                                            lVar = null;
                                        }
                                        h(lVarArr, i12, lVar);
                                        i10 = 1;
                                    } catch (Throwable th) {
                                        h(lVarArr, i12, null);
                                        throw th;
                                    }
                                }
                            } finally {
                            }
                        }
                        if (i10 != 0) {
                        }
                    } else {
                        int i13 = k10.a;
                        if (i13 == -1) {
                            lVarArr = d(lVarArr, k10);
                        } else {
                            synchronized (k10) {
                                try {
                                    if (k(lVarArr, i12) == k10) {
                                        if (i13 >= 0) {
                                            l lVar2 = null;
                                            l lVar3 = k10;
                                            i10 = 1;
                                            while (true) {
                                                if (lVar3.a == i9 && ((obj2 = lVar3.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                                                    break;
                                                }
                                                l lVar4 = lVar3.d;
                                                if (lVar4 == null) {
                                                    Object apply = biFunction.apply(obj, null);
                                                    if (apply == null) {
                                                        obj3 = apply;
                                                    } else {
                                                        if (lVar3.d != null) {
                                                            throw new IllegalStateException("Recursive update");
                                                        }
                                                        lVar3.d = new l(i9, obj, apply);
                                                        obj3 = apply;
                                                        i11 = 1;
                                                    }
                                                } else {
                                                    i10++;
                                                    lVar2 = lVar3;
                                                    lVar3 = lVar4;
                                                }
                                            }
                                            Object apply2 = biFunction.apply(obj, lVar3.c);
                                            if (apply2 != null) {
                                                lVar3.c = apply2;
                                                obj3 = apply2;
                                            } else {
                                                l lVar5 = lVar3.d;
                                                if (lVar2 != null) {
                                                    lVar2.d = lVar5;
                                                } else {
                                                    h(lVarArr, i12, lVar5);
                                                }
                                                obj3 = apply2;
                                                i11 = -1;
                                            }
                                        } else if (k10 instanceof q) {
                                            q qVar = (q) k10;
                                            r rVar = qVar.e;
                                            r b10 = rVar != null ? rVar.b(i9, obj, null) : null;
                                            Object apply3 = biFunction.apply(obj, b10 == null ? null : b10.c);
                                            if (apply3 != null) {
                                                if (b10 != null) {
                                                    b10.c = apply3;
                                                } else {
                                                    qVar.e(i9, obj, apply3);
                                                    i11 = 1;
                                                }
                                            } else if (b10 != null) {
                                                if (qVar.f(b10)) {
                                                    h(lVarArr, i12, p(qVar.f));
                                                }
                                                i11 = -1;
                                            }
                                            obj3 = apply3;
                                            i10 = 1;
                                        } else if (k10 instanceof m) {
                                            throw new IllegalStateException("Recursive update");
                                        }
                                    }
                                } finally {
                                }
                            }
                            if (i10 != 0) {
                                if (i10 >= 8) {
                                    n(lVarArr, i12);
                                }
                            }
                        }
                    }
                }
            }
            lVarArr = e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x00dd, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        int i9;
        Object obj3;
        Object obj4 = obj2;
        if (obj == null) {
            throw null;
        }
        if (obj4 == null) {
            throw null;
        }
        if (biFunction == null) {
            throw null;
        }
        int i10 = i(obj.hashCode());
        l[] lVarArr = this.a;
        int i11 = 0;
        Object obj5 = null;
        int i12 = 0;
        while (true) {
            if (lVarArr != null) {
                int length = lVarArr.length;
                if (length != 0) {
                    int i13 = (length - 1) & i10;
                    l k10 = k(lVarArr, i13);
                    i9 = 1;
                    if (k10 == null) {
                        if (b(lVarArr, i13, new l(i10, obj, obj4))) {
                            break;
                        }
                    } else {
                        int i14 = k10.a;
                        if (i14 == -1) {
                            lVarArr = d(lVarArr, k10);
                        } else {
                            synchronized (k10) {
                                try {
                                    if (k(lVarArr, i13) == k10) {
                                        if (i14 >= 0) {
                                            l lVar = null;
                                            l lVar2 = k10;
                                            i11 = 1;
                                            while (true) {
                                                if (lVar2.a == i10 && ((obj3 = lVar2.b) == obj || (obj3 != null && obj.equals(obj3)))) {
                                                    break;
                                                }
                                                l lVar3 = lVar2.d;
                                                if (lVar3 == null) {
                                                    lVar2.d = new l(i10, obj, obj4);
                                                    obj5 = obj4;
                                                    i12 = 1;
                                                    break;
                                                }
                                                i11++;
                                                lVar = lVar2;
                                                lVar2 = lVar3;
                                            }
                                            Object apply = biFunction.apply(lVar2.c, obj4);
                                            if (apply != null) {
                                                lVar2.c = apply;
                                                obj5 = apply;
                                            } else {
                                                l lVar4 = lVar2.d;
                                                if (lVar != null) {
                                                    lVar.d = lVar4;
                                                } else {
                                                    h(lVarArr, i13, lVar4);
                                                }
                                                obj5 = apply;
                                                i12 = -1;
                                            }
                                        } else if (k10 instanceof q) {
                                            q qVar = (q) k10;
                                            r rVar = qVar.e;
                                            r b10 = rVar == null ? null : rVar.b(i10, obj, null);
                                            Object apply2 = b10 == null ? obj4 : biFunction.apply(b10.c, obj4);
                                            if (apply2 != null) {
                                                if (b10 != null) {
                                                    b10.c = apply2;
                                                } else {
                                                    qVar.e(i10, obj, apply2);
                                                    i12 = 1;
                                                }
                                            } else if (b10 != null) {
                                                if (qVar.f(b10)) {
                                                    h(lVarArr, i13, p(qVar.f));
                                                }
                                                i12 = -1;
                                            }
                                            i11 = 2;
                                            obj5 = apply2;
                                        } else if (k10 instanceof m) {
                                            break;
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            if (i11 != 0) {
                                if (i11 >= 8) {
                                    n(lVarArr, i13);
                                }
                                i9 = i12;
                                obj4 = obj5;
                            }
                        }
                    }
                }
            }
            lVarArr = e();
        }
        if (i9 != 0) {
            a(i9, i11);
        }
        return obj4;
    }

    public final l[] e() {
        while (true) {
            l[] lVarArr = this.a;
            if (lVarArr != null && lVarArr.length != 0) {
                return lVarArr;
            }
            int i9 = this.sizeCtl;
            if (i9 < 0) {
                Thread.yield();
            } else if (h.c(this, i, i9, -1)) {
                try {
                    l[] lVarArr2 = this.a;
                    if (lVarArr2 != null) {
                        if (lVarArr2.length == 0) {
                        }
                        this.sizeCtl = i9;
                        return lVarArr2;
                    }
                    int i10 = i9 > 0 ? i9 : 16;
                    l[] lVarArr3 = new l[i10];
                    this.a = lVarArr3;
                    i9 = i10 - (i10 >>> 2);
                    lVarArr2 = lVarArr3;
                    this.sizeCtl = i9;
                    return lVarArr2;
                } catch (Throwable th) {
                    this.sizeCtl = i9;
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x013f, code lost:
    
        if (r1.c != r6) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0141, code lost:
    
        r1.c = (j$.util.concurrent.c[]) java.util.Arrays.copyOf(r6, r7 << 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r0.d(r1, r2, r4, r6) == false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00c1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j10, int i9) {
        boolean z10;
        boolean z11;
        int length;
        boolean z12;
        int length2;
        int length3;
        c cVar;
        long j11;
        l[] lVarArr;
        int length4;
        l[] lVarArr2;
        ConcurrentHashMap<K, V> concurrentHashMap = this;
        c[] cVarArr = concurrentHashMap.c;
        if (cVarArr == null) {
            j$.sun.misc.a aVar = h;
            long j12 = k;
            long j13 = concurrentHashMap.baseCount;
            j11 = j13 + j10;
        }
        if (cVarArr == null || (length3 = cVarArr.length - 1) < 0 || (cVar = cVarArr[length3 & ((ThreadLocalRandom) ThreadLocalRandom.f.get()).b]) == null) {
            z10 = true;
        } else {
            j$.sun.misc.a aVar2 = h;
            long j14 = m;
            long j15 = cVar.value;
            z10 = aVar2.d(cVar, j14, j15, j15 + j10);
            if (z10) {
                if (i9 <= 1) {
                    return;
                }
                j11 = concurrentHashMap.j();
                if (i9 < 0) {
                    return;
                }
                while (true) {
                    int i10 = concurrentHashMap.sizeCtl;
                    if (j11 < i10 || (lVarArr = concurrentHashMap.a) == null || (length4 = lVarArr.length) >= 1073741824) {
                        return;
                    }
                    int numberOfLeadingZeros = Integer.numberOfLeadingZeros(length4) | 32768;
                    if (i10 < 0) {
                        if ((i10 >>> 16) != numberOfLeadingZeros || i10 == numberOfLeadingZeros + 1 || i10 == numberOfLeadingZeros + 65535 || (lVarArr2 = concurrentHashMap.b) == null || concurrentHashMap.transferIndex <= 0) {
                            return;
                        }
                        if (h.c(concurrentHashMap, i, i10, i10 + 1)) {
                            concurrentHashMap.m(lVarArr, lVarArr2);
                        }
                    } else if (h.c(concurrentHashMap, i, i10, (numberOfLeadingZeros << 16) + 2)) {
                        concurrentHashMap.m(lVarArr, null);
                    }
                    j11 = concurrentHashMap.j();
                }
            }
        }
        v vVar = ThreadLocalRandom.f;
        int i11 = ((ThreadLocalRandom) vVar.get()).b;
        if (i11 == 0) {
            ThreadLocalRandom.d();
            i11 = ((ThreadLocalRandom) vVar.get()).b;
            z10 = true;
        }
        boolean z13 = z10;
        int i12 = i11;
        while (true) {
            boolean z14 = false;
            while (true) {
                c[] cVarArr2 = concurrentHashMap.c;
                if (cVarArr2 != null && (length = cVarArr2.length) > 0) {
                    c cVar2 = cVarArr2[(length - 1) & i12];
                    if (cVar2 != null) {
                        if (z13) {
                            j$.sun.misc.a aVar3 = h;
                            long j16 = m;
                            long j17 = cVar2.value;
                            if (aVar3.d(cVar2, j16, j17, j17 + j10)) {
                                return;
                            }
                            if (concurrentHashMap.c == cVarArr2 && length < g) {
                                if (!z14) {
                                    z14 = true;
                                } else if (concurrentHashMap.cellsBusy == 0 && aVar3.c(concurrentHashMap, l, 0, 1)) {
                                    try {
                                        break;
                                    } finally {
                                    }
                                }
                            }
                        } else {
                            z13 = true;
                        }
                        int i13 = (i12 << 13) ^ i12;
                        int i14 = i13 ^ (i13 >>> 17);
                        int i15 = i14 ^ (i14 << 5);
                        ((ThreadLocalRandom) ThreadLocalRandom.f.get()).b = i15;
                        i12 = i15;
                    } else if (concurrentHashMap.cellsBusy == 0) {
                        c cVar3 = new c(j10);
                        if (concurrentHashMap.cellsBusy == 0 && h.c(concurrentHashMap, l, 0, 1)) {
                            try {
                                c[] cVarArr3 = concurrentHashMap.c;
                                if (cVarArr3 != null && (length2 = cVarArr3.length) > 0) {
                                    int i16 = (length2 - 1) & i12;
                                    if (cVarArr3[i16] == null) {
                                        cVarArr3[i16] = cVar3;
                                        z12 = true;
                                        if (!z12) {
                                            return;
                                        }
                                    }
                                }
                                z12 = false;
                                if (!z12) {
                                }
                            } finally {
                            }
                        }
                    }
                    z14 = false;
                    int i132 = (i12 << 13) ^ i12;
                    int i142 = i132 ^ (i132 >>> 17);
                    int i152 = i142 ^ (i142 << 5);
                    ((ThreadLocalRandom) ThreadLocalRandom.f.get()).b = i152;
                    i12 = i152;
                } else if (concurrentHashMap.cellsBusy == 0 && concurrentHashMap.c == cVarArr2 && h.c(concurrentHashMap, l, 0, 1)) {
                    try {
                        if (concurrentHashMap.c == cVarArr2) {
                            c[] cVarArr4 = new c[2];
                            cVarArr4[i12 & 1] = new c(j10);
                            concurrentHashMap.c = cVarArr4;
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            return;
                        }
                    } finally {
                    }
                } else {
                    j$.sun.misc.a aVar4 = h;
                    long j18 = k;
                    long j19 = concurrentHashMap.baseCount;
                    if (aVar4.d(concurrentHashMap, j18, j19, j19 + j10)) {
                        return;
                    }
                }
                concurrentHashMap = this;
            }
        }
    }

    public final l[] d(l[] lVarArr, l lVar) {
        int i9;
        if (lVar instanceof g) {
            l[] lVarArr2 = ((g) lVar).e;
            int numberOfLeadingZeros = Integer.numberOfLeadingZeros(lVarArr.length) | 32768;
            while (lVarArr2 == this.b && this.a == lVarArr && (i9 = this.sizeCtl) < 0 && (i9 >>> 16) == numberOfLeadingZeros && i9 != numberOfLeadingZeros + 1 && i9 != 65535 + numberOfLeadingZeros && this.transferIndex > 0) {
                if (h.c(this, i, i9, i9 + 1)) {
                    m(lVarArr, lVarArr2);
                    break;
                }
            }
            return lVarArr2;
        }
        return this.a;
    }

    public final void o(int i9) {
        int length;
        int l10 = i9 >= 536870912 ? TLObject.FLAG_30 : l(i9 + (i9 >>> 1) + 1);
        while (true) {
            int i10 = this.sizeCtl;
            if (i10 >= 0) {
                l[] lVarArr = this.a;
                if (lVarArr != null && (length = lVarArr.length) != 0) {
                    if (l10 <= i10 || length >= 1073741824) {
                        break;
                    } else if (lVarArr == this.a) {
                        if (h.c(this, i, i10, ((Integer.numberOfLeadingZeros(length) | 32768) << 16) + 2)) {
                            m(lVarArr, null);
                        }
                    }
                } else {
                    int i11 = i10 > l10 ? i10 : l10;
                    if (h.c(this, i, i10, -1)) {
                        try {
                            if (this.a == lVarArr) {
                                this.a = new l[i11];
                                i10 = i11 - (i11 >>> 2);
                            }
                        } finally {
                            this.sizeCtl = i10;
                        }
                    } else {
                        continue;
                    }
                }
            } else {
                break;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r10v9, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r5v5, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r8v13, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r8v8, types: [j$.util.concurrent.l] */
    public final void m(l[] lVarArr, l[] lVarArr2) {
        l[] lVarArr3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        l qVar;
        l qVar2;
        r rVar;
        int i15;
        ConcurrentHashMap<K, V> concurrentHashMap = this;
        int length = lVarArr.length;
        int i16 = g;
        int i17 = i16 > 1 ? (length >>> 3) / i16 : length;
        int i18 = i17 < 16 ? 16 : i17;
        if (lVarArr2 == null) {
            try {
                l[] lVarArr4 = new l[length << 1];
                concurrentHashMap.b = lVarArr4;
                concurrentHashMap.transferIndex = length;
                lVarArr3 = lVarArr4;
            } catch (Throwable unused) {
                concurrentHashMap.sizeCtl = ConnectionsManager.DEFAULT_DATACENTER_ID;
                return;
            }
        } else {
            lVarArr3 = lVarArr2;
        }
        int length2 = lVarArr3.length;
        g gVar = new g(lVarArr3);
        int i19 = 0;
        int i20 = 0;
        boolean z10 = true;
        boolean z11 = false;
        while (true) {
            if (z10) {
                int i21 = i19 - 1;
                if (i21 >= i20 || z11) {
                    i20 = i20;
                    i19 = i21;
                } else {
                    int i22 = concurrentHashMap.transferIndex;
                    if (i22 <= 0) {
                        i19 = -1;
                    } else {
                        j$.sun.misc.a aVar = h;
                        int i23 = i20;
                        long j10 = j;
                        if (i22 > i18) {
                            i10 = i23;
                            i11 = i22 - i18;
                            i9 = i21;
                        } else {
                            i9 = i21;
                            i10 = i23;
                            i11 = 0;
                        }
                        boolean c10 = aVar.c(concurrentHashMap, j10, i22, i11);
                        i20 = i11;
                        if (c10) {
                            i19 = i22 - 1;
                        } else {
                            i20 = i10;
                            i19 = i9;
                        }
                    }
                }
                z10 = false;
            } else {
                int i24 = i20;
                r rVar2 = null;
                if (i19 < 0 || i19 >= length || (i14 = i19 + length) >= length2) {
                    i12 = length;
                    i13 = i18;
                    if (z11) {
                        concurrentHashMap.b = null;
                        concurrentHashMap.a = lVarArr3;
                        concurrentHashMap.sizeCtl = (i12 << 1) - (i12 >>> 1);
                        return;
                    }
                    int i25 = i19;
                    j$.sun.misc.a aVar2 = h;
                    long j11 = i;
                    int i26 = concurrentHashMap.sizeCtl;
                    if (!aVar2.c(concurrentHashMap, j11, i26, i26 - 1)) {
                        i19 = i25;
                    } else {
                        if (i26 - 2 != ((Integer.numberOfLeadingZeros(i12) | 32768) << 16)) {
                            return;
                        }
                        i19 = i12;
                        z10 = true;
                        z11 = true;
                    }
                } else {
                    ?? k10 = k(lVarArr, i19);
                    if (k10 == 0) {
                        z10 = b(lVarArr, i19, gVar);
                        i12 = length;
                        i13 = i18;
                    } else {
                        int i27 = k10.a;
                        if (i27 == -1) {
                            i12 = length;
                            i13 = i18;
                            z10 = true;
                        } else {
                            synchronized (k10) {
                                try {
                                    if (k(lVarArr, i19) == k10) {
                                        if (i27 >= 0) {
                                            int i28 = i27 & length;
                                            r rVar3 = k10;
                                            for (r rVar4 = k10.d; rVar4 != null; rVar4 = rVar4.d) {
                                                int i29 = rVar4.a & length;
                                                if (i29 != i28) {
                                                    rVar3 = rVar4;
                                                    i28 = i29;
                                                }
                                            }
                                            if (i28 == 0) {
                                                rVar = null;
                                                rVar2 = rVar3;
                                            } else {
                                                rVar = rVar3;
                                            }
                                            l lVar = k10;
                                            while (lVar != rVar3) {
                                                int i30 = lVar.a;
                                                Object obj = lVar.b;
                                                int i31 = length;
                                                Object obj2 = lVar.c;
                                                if ((i30 & i31) == 0) {
                                                    i15 = i18;
                                                    rVar2 = new l(i30, obj, obj2, rVar2);
                                                } else {
                                                    i15 = i18;
                                                    rVar = new l(i30, obj, obj2, rVar);
                                                }
                                                lVar = lVar.d;
                                                length = i31;
                                                i18 = i15;
                                            }
                                            i12 = length;
                                            i13 = i18;
                                            h(lVarArr3, i19, rVar2);
                                            h(lVarArr3, i14, rVar);
                                            h(lVarArr, i19, gVar);
                                        } else {
                                            i12 = length;
                                            i13 = i18;
                                            if (k10 instanceof q) {
                                                q qVar3 = (q) k10;
                                                r rVar5 = null;
                                                r rVar6 = null;
                                                l lVar2 = qVar3.f;
                                                int i32 = 0;
                                                int i33 = 0;
                                                r rVar7 = null;
                                                while (lVar2 != null) {
                                                    q qVar4 = qVar3;
                                                    int i34 = lVar2.a;
                                                    r rVar8 = new r(i34, lVar2.b, lVar2.c, null, null);
                                                    if ((i34 & i12) == 0) {
                                                        rVar8.h = rVar6;
                                                        if (rVar6 == null) {
                                                            rVar2 = rVar8;
                                                        } else {
                                                            rVar6.d = rVar8;
                                                        }
                                                        i32++;
                                                        rVar6 = rVar8;
                                                    } else {
                                                        rVar8.h = rVar5;
                                                        if (rVar5 == null) {
                                                            rVar7 = rVar8;
                                                        } else {
                                                            rVar5.d = rVar8;
                                                        }
                                                        i33++;
                                                        rVar5 = rVar8;
                                                    }
                                                    lVar2 = lVar2.d;
                                                    qVar3 = qVar4;
                                                }
                                                q qVar5 = qVar3;
                                                if (i32 <= 6) {
                                                    qVar = p(rVar2);
                                                } else {
                                                    qVar = i33 != 0 ? new q(rVar2) : qVar5;
                                                }
                                                if (i33 <= 6) {
                                                    qVar2 = p(rVar7);
                                                } else {
                                                    qVar2 = i32 != 0 ? new q(rVar7) : qVar5;
                                                }
                                                h(lVarArr3, i19, qVar);
                                                h(lVarArr3, i14, qVar2);
                                                h(lVarArr, i19, gVar);
                                            }
                                        }
                                        z10 = true;
                                    } else {
                                        i12 = length;
                                        i13 = i18;
                                    }
                                } finally {
                                }
                            }
                        }
                    }
                }
                concurrentHashMap = this;
                i20 = i24;
                length = i12;
                i18 = i13;
            }
        }
    }

    public final long j() {
        c[] cVarArr = this.c;
        long j10 = this.baseCount;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                if (cVar != null) {
                    j10 += cVar.value;
                }
            }
        }
        return j10;
    }

    public final void n(l[] lVarArr, int i9) {
        int length = lVarArr.length;
        if (length < 64) {
            o(length << 1);
            return;
        }
        l k10 = k(lVarArr, i9);
        if (k10 == null || k10.a < 0) {
            return;
        }
        synchronized (k10) {
            try {
                if (k(lVarArr, i9) == k10) {
                    r rVar = null;
                    r rVar2 = null;
                    l lVar = k10;
                    while (lVar != null) {
                        r rVar3 = new r(lVar.a, lVar.b, lVar.c, null, null);
                        rVar3.h = rVar2;
                        if (rVar2 == null) {
                            rVar = rVar3;
                        } else {
                            rVar2.d = rVar3;
                        }
                        lVar = lVar.d;
                        rVar2 = rVar3;
                    }
                    h(lVarArr, i9, new q(rVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [j$.util.concurrent.l] */
    public static l p(r rVar) {
        l lVar = null;
        l lVar2 = null;
        for (r rVar2 = rVar; rVar2 != null; rVar2 = rVar2.d) {
            l lVar3 = new l(rVar2.a, rVar2.b, rVar2.c);
            if (lVar2 == null) {
                lVar = lVar3;
            } else {
                lVar2.d = lVar3;
            }
            lVar2 = lVar3;
        }
        return lVar;
    }
}
