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
public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, v {
    static final int g = Runtime.getRuntime().availableProcessors();
    private static final j$.sun.misc.a h;
    private static final long i;
    private static final long j;
    private static final long k;
    private static final long l;
    private static final long m;
    private static final int n;
    private static final int o;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;
    volatile transient l[] a;
    private volatile transient l[] b;
    private volatile transient long baseCount;
    private volatile transient c[] c;
    private volatile transient int cellsBusy;
    private transient i d;
    private transient s e;
    private transient e f;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    static final int i(int i2) {
        return (i2 ^ (i2 >>> 16)) & ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    static {
        ObjectStreamField objectStreamField = new ObjectStreamField("segments", n[].class);
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{objectStreamField, new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        j$.sun.misc.a h2 = j$.sun.misc.a.h();
        h = h2;
        i = h2.j(ConcurrentHashMap.class, "sizeCtl");
        j = h2.j(ConcurrentHashMap.class, "transferIndex");
        k = h2.j(ConcurrentHashMap.class, "baseCount");
        l = h2.j(ConcurrentHashMap.class, "cellsBusy");
        m = h2.j(c.class, "value");
        n = h2.a(l[].class);
        int b = h2.b(l[].class);
        if (((b - 1) & b) != 0) {
            throw new ExceptionInInitializerError("array index scale not a power of two");
        }
        o = 31 - Integer.numberOfLeadingZeros(b);
    }

    private static final int l(int i2) {
        int numberOfLeadingZeros = (-1) >>> Integer.numberOfLeadingZeros(i2 - 1);
        if (numberOfLeadingZeros < 0) {
            return 1;
        }
        return numberOfLeadingZeros >= 1073741824 ? TLObject.FLAG_30 : 1 + numberOfLeadingZeros;
    }

    static Class c(Object obj) {
        Type[] actualTypeArguments;
        if (!(obj instanceof Comparable)) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (cls == String.class) {
            return cls;
        }
        Type[] genericInterfaces = cls.getGenericInterfaces();
        if (genericInterfaces == null) {
            return null;
        }
        for (Type type : genericInterfaces) {
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                if (parameterizedType.getRawType() == Comparable.class && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && actualTypeArguments.length == 1 && actualTypeArguments[0] == cls) {
                    return cls;
                }
            }
        }
        return null;
    }

    static final l k(l[] lVarArr, int i2) {
        return (l) h.g(lVarArr, (i2 << o) + n);
    }

    static final boolean b(l[] lVarArr, int i2, l lVar) {
        return h.e(lVarArr, (i2 << o) + n, lVar);
    }

    static final void h(l[] lVarArr, int i2, l lVar) {
        h.l(lVarArr, (i2 << o) + n, lVar);
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i2) {
        this(i2, 0.75f, 1);
    }

    public ConcurrentHashMap(int i2, float f, int i3) {
        if (f <= 0.0f || i2 < 0 || i3 <= 0) {
            throw new IllegalArgumentException();
        }
        long j2 = (long) (((i2 < i3 ? i3 : i2) / f) + 1.0d);
        this.sizeCtl = j2 >= 1073741824 ? TLObject.FLAG_30 : l((int) j2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j2 = j();
        if (j2 < 0) {
            return 0;
        }
        return j2 > 2147483647L ? ConnectionsManager.DEFAULT_DATACENTER_ID : (int) j2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return j() <= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004d, code lost:
    
        return (V) r1.c;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public V get(Object obj) {
        int length;
        l k2;
        Object obj2;
        int i2 = i(obj.hashCode());
        l[] lVarArr = this.a;
        if (lVarArr != null && (length = lVarArr.length) > 0 && (k2 = k(lVarArr, (length - 1) & i2)) != null) {
            int i3 = k2.a;
            if (i3 == i2) {
                Object obj3 = k2.b;
                if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                    return (V) k2.c;
                }
            } else if (i3 < 0) {
                l a = k2.a(i2, obj);
                if (a != null) {
                    return (V) a.c;
                }
                return null;
            }
            while (true) {
                k2 = k2.d;
                if (k2 == null) {
                    break;
                }
                if (k2.a != i2 || ((obj2 = k2.b) != obj && (obj2 == null || !obj.equals(obj2)))) {
                }
            }
        }
        return null;
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
                l a = pVar.a();
                if (a == null) {
                    break;
                }
                Object obj2 = a.c;
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
    public V put(K k2, V v) {
        return (V) f(k2, v, false);
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
    final Object f(Object obj, Object obj2, boolean z) {
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
        int i2 = i(obj.hashCode());
        l[] lVarArr = this.a;
        int i3 = 0;
        while (true) {
            if (lVarArr != null) {
                int length = lVarArr.length;
                if (length != 0) {
                    int i4 = (length - 1) & i2;
                    l k2 = k(lVarArr, i4);
                    if (k2 == null) {
                        if (b(lVarArr, i4, new l(i2, obj, obj2))) {
                            break;
                        }
                    } else {
                        int i5 = k2.a;
                        if (i5 == -1) {
                            lVarArr = d(lVarArr, k2);
                        } else {
                            if (z && i5 == i2 && (((obj5 = k2.b) == obj || (obj5 != null && obj.equals(obj5))) && (obj6 = k2.c) != null)) {
                                return obj6;
                            }
                            synchronized (k2) {
                                try {
                                    if (k(lVarArr, i4) == k2) {
                                        if (i5 >= 0) {
                                            i3 = 1;
                                            l lVar = k2;
                                            while (true) {
                                                if (lVar.a == i2 && ((obj4 = lVar.b) == obj || (obj4 != null && obj.equals(obj4)))) {
                                                    break;
                                                }
                                                l lVar2 = lVar.d;
                                                if (lVar2 == null) {
                                                    lVar.d = new l(i2, obj, obj2);
                                                    break;
                                                }
                                                i3++;
                                                lVar = lVar2;
                                            }
                                            obj3 = lVar.c;
                                            if (!z) {
                                                lVar.c = obj2;
                                            }
                                        } else if (k2 instanceof q) {
                                            r e = ((q) k2).e(i2, obj, obj2);
                                            if (e != null) {
                                                Object obj7 = e.c;
                                                if (!z) {
                                                    e.c = obj2;
                                                }
                                                obj3 = obj7;
                                            } else {
                                                obj3 = null;
                                            }
                                            i3 = 2;
                                        } else if (k2 instanceof m) {
                                            break;
                                        }
                                    }
                                    obj3 = null;
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            if (i3 != 0) {
                                if (i3 >= 8) {
                                    n(lVarArr, i4);
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

    final Object g(Object obj, Object obj2, Object obj3) {
        int length;
        int i2;
        l k2;
        boolean z;
        Object obj4;
        r b;
        Object obj5;
        int i3 = i(obj.hashCode());
        l[] lVarArr = this.a;
        while (true) {
            if (lVarArr == null || (length = lVarArr.length) == 0 || (k2 = k(lVarArr, (i2 = (length - 1) & i3))) == null) {
                break;
            }
            int i4 = k2.a;
            if (i4 == -1) {
                lVarArr = d(lVarArr, k2);
            } else {
                synchronized (k2) {
                    try {
                        if (k(lVarArr, i2) == k2) {
                            z = true;
                            if (i4 >= 0) {
                                l lVar = null;
                                l lVar2 = k2;
                                while (true) {
                                    if (lVar2.a == i3 && ((obj5 = lVar2.b) == obj || (obj5 != null && obj.equals(obj5)))) {
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
                                        h(lVarArr, i2, lVar2.d);
                                    }
                                }
                                obj4 = null;
                            } else if (k2 instanceof q) {
                                q qVar = (q) k2;
                                r rVar = qVar.e;
                                if (rVar != null && (b = rVar.b(i3, obj, null)) != null) {
                                    obj4 = b.c;
                                    if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                        if (obj2 != null) {
                                            b.c = obj2;
                                        } else if (qVar.f(b)) {
                                            h(lVarArr, i2, p(qVar.f));
                                        }
                                    }
                                }
                                obj4 = null;
                            } else if (k2 instanceof m) {
                                throw new IllegalStateException("Recursive update");
                            }
                        }
                        z = false;
                        obj4 = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z) {
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
        l k2;
        l lVar;
        l[] lVarArr = this.a;
        long j2 = 0;
        loop0: while (true) {
            int i2 = 0;
            while (lVarArr != null && i2 < lVarArr.length) {
                k2 = k(lVarArr, i2);
                if (k2 == null) {
                    i2++;
                } else {
                    int i3 = k2.a;
                    if (i3 == -1) {
                        break;
                    }
                    synchronized (k2) {
                        try {
                            if (k(lVarArr, i2) == k2) {
                                if (i3 >= 0) {
                                    lVar = k2;
                                } else {
                                    lVar = k2 instanceof q ? ((q) k2).f : null;
                                }
                                while (lVar != null) {
                                    j2--;
                                    lVar = lVar.d;
                                }
                                h(lVarArr, i2, null);
                                i2++;
                            }
                        } finally {
                        }
                    }
                }
            }
            lVarArr = d(lVarArr, k2);
        }
        if (j2 != 0) {
            a(j2, -1);
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
        int i2 = 0;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l a = pVar.a();
                if (a == null) {
                    break;
                }
                i2 += a.c.hashCode() ^ a.b.hashCode();
            }
        }
        return i2;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        l[] lVarArr = this.a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        p pVar = new p(lVarArr, length, 0, length);
        StringBuilder sb = new StringBuilder("{");
        l a = pVar.a();
        if (a != null) {
            while (true) {
                Object obj = a.b;
                Object obj2 = a.c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb.append(obj);
                sb.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb.append(obj2);
                a = pVar.a();
                if (a == null) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
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
            l a = pVar.a();
            if (a != null) {
                Object obj2 = a.c;
                Object obj3 = map.get(a.b);
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
        int i2 = 1;
        int i3 = 0;
        while (i2 < 16) {
            i3++;
            i2 <<= 1;
        }
        int i4 = 32 - i3;
        int i5 = i2 - 1;
        n[] nVarArr = new n[16];
        for (int i6 = 0; i6 < 16; i6++) {
            nVarArr[i6] = new n();
        }
        ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
        putFields.put("segments", nVarArr);
        putFields.put("segmentShift", i4);
        putFields.put("segmentMask", i5);
        objectOutputStream.writeFields();
        l[] lVarArr = this.a;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l a = pVar.a();
                if (a == null) {
                    break;
                }
                objectOutputStream.writeObject(a.b);
                objectOutputStream.writeObject(a.c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        long j2;
        boolean z;
        boolean z2;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j3 = 0;
        long j4 = 0;
        l lVar = null;
        while (true) {
            Object readObject = objectInputStream.readObject();
            Object readObject2 = objectInputStream.readObject();
            j2 = 1;
            if (readObject == null || readObject2 == null) {
                break;
            }
            j4++;
            lVar = new l(i(readObject.hashCode()), readObject, readObject2, lVar);
        }
        if (j4 == 0) {
            this.sizeCtl = 0;
            return;
        }
        long j5 = (long) ((j4 / 0.75f) + 1.0d);
        int l2 = j5 >= 1073741824 ? TLObject.FLAG_30 : l((int) j5);
        l[] lVarArr = new l[l2];
        int i2 = l2 - 1;
        while (lVar != null) {
            l lVar2 = lVar.d;
            int i3 = lVar.a;
            int i4 = i3 & i2;
            l k2 = k(lVarArr, i4);
            if (k2 == null) {
                z2 = true;
            } else {
                Object obj2 = lVar.b;
                if (k2.a >= 0) {
                    int i5 = 0;
                    for (l lVar3 = k2; lVar3 != null; lVar3 = lVar3.d) {
                        if (lVar3.a == i3 && ((obj = lVar3.b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z = false;
                            break;
                        }
                        i5++;
                    }
                    z = true;
                    if (!z || i5 < 8) {
                        z2 = z;
                    } else {
                        long j6 = j3 + 1;
                        lVar.d = k2;
                        l lVar4 = lVar;
                        r rVar = null;
                        r rVar2 = null;
                        while (lVar4 != null) {
                            long j7 = j6;
                            r rVar3 = new r(lVar4.a, lVar4.b, lVar4.c, null, null);
                            rVar3.h = rVar2;
                            if (rVar2 == null) {
                                rVar = rVar3;
                            } else {
                                rVar2.d = rVar3;
                            }
                            lVar4 = lVar4.d;
                            rVar2 = rVar3;
                            j6 = j7;
                        }
                        h(lVarArr, i4, new q(rVar));
                        j3 = j6;
                    }
                } else if (((q) k2).e(i3, obj2, lVar.c) == null) {
                    j3 += j2;
                }
                z2 = false;
            }
            j2 = 1;
            if (z2) {
                j3++;
                lVar.d = k2;
                h(lVarArr, i4, lVar);
            }
            lVar = lVar2;
        }
        this.a = lVarArr;
        this.sizeCtl = l2 - (l2 >>> 2);
        this.baseCount = j3;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public V putIfAbsent(K k2, V v) {
        return (V) f(k2, v, true);
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
            l a = pVar.a();
            if (a == null) {
                return;
            } else {
                biConsumer.accept(a.b, a.c);
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
            l a = pVar.a();
            if (a == null) {
                return;
            }
            Object obj = a.c;
            Object obj2 = a.b;
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
        r b;
        Object obj2;
        Object obj3;
        Object obj4;
        if (obj == null) {
            throw null;
        }
        if (function == null) {
            throw null;
        }
        int i2 = i(obj.hashCode());
        l[] lVarArr = this.a;
        Object obj5 = null;
        int i3 = 0;
        while (true) {
            if (lVarArr != null) {
                int length = lVarArr.length;
                if (length != 0) {
                    int i4 = (length - 1) & i2;
                    l k2 = k(lVarArr, i4);
                    boolean z = true;
                    if (k2 == null) {
                        m mVar = new m();
                        synchronized (mVar) {
                            try {
                                if (b(lVarArr, i4, mVar)) {
                                    try {
                                        obj5 = function.apply(obj);
                                        h(lVarArr, i4, obj5 != null ? new l(i2, obj, obj5) : null);
                                        i3 = 1;
                                    } catch (Throwable th) {
                                        h(lVarArr, i4, null);
                                        throw th;
                                    }
                                }
                            } finally {
                            }
                        }
                        if (i3 != 0) {
                        }
                    } else {
                        int i5 = k2.a;
                        if (i5 == -1) {
                            lVarArr = d(lVarArr, k2);
                        } else {
                            if (i5 == i2 && (((obj3 = k2.b) == obj || (obj3 != null && obj.equals(obj3))) && (obj4 = k2.c) != null)) {
                                return obj4;
                            }
                            synchronized (k2) {
                                try {
                                    if (k(lVarArr, i4) == k2) {
                                        if (i5 >= 0) {
                                            l lVar = k2;
                                            i3 = 1;
                                            while (true) {
                                                if (lVar.a == i2 && ((obj2 = lVar.b) == obj || (obj2 != null && obj.equals(obj2)))) {
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
                                                        lVar.d = new l(i2, obj, apply);
                                                        obj5 = apply;
                                                    }
                                                } else {
                                                    i3++;
                                                    lVar = lVar2;
                                                }
                                            }
                                            obj5 = lVar.c;
                                        } else if (k2 instanceof q) {
                                            q qVar = (q) k2;
                                            r rVar = qVar.e;
                                            if (rVar != null && (b = rVar.b(i2, obj, null)) != null) {
                                                obj5 = b.c;
                                            } else {
                                                obj5 = function.apply(obj);
                                                if (obj5 != null) {
                                                    qVar.e(i2, obj, obj5);
                                                    i3 = 2;
                                                }
                                            }
                                            z = false;
                                            i3 = 2;
                                        } else if (k2 instanceof m) {
                                            throw new IllegalStateException("Recursive update");
                                        }
                                    }
                                    z = false;
                                } finally {
                                }
                            }
                            if (i3 != 0) {
                                if (i3 >= 8) {
                                    n(lVarArr, i4);
                                }
                                if (!z) {
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
        r b;
        Object obj2;
        if (obj == null) {
            throw null;
        }
        if (biFunction == null) {
            throw null;
        }
        int i2 = i(obj.hashCode());
        l[] lVarArr = this.a;
        int i3 = 0;
        Object obj3 = null;
        int i4 = 0;
        while (true) {
            if (lVarArr != null) {
                int length = lVarArr.length;
                if (length != 0) {
                    int i5 = (length - 1) & i2;
                    l k2 = k(lVarArr, i5);
                    if (k2 == null) {
                        break;
                    }
                    int i6 = k2.a;
                    if (i6 == -1) {
                        lVarArr = d(lVarArr, k2);
                    } else {
                        synchronized (k2) {
                            try {
                                if (k(lVarArr, i5) == k2) {
                                    if (i6 >= 0) {
                                        i4 = 1;
                                        l lVar = null;
                                        l lVar2 = k2;
                                        while (true) {
                                            if (lVar2.a == i2 && ((obj2 = lVar2.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                                                break;
                                            }
                                            l lVar3 = lVar2.d;
                                            if (lVar3 == null) {
                                                break;
                                            }
                                            i4++;
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
                                                h(lVarArr, i5, lVar4);
                                            }
                                            i3 = -1;
                                        }
                                    } else if (k2 instanceof q) {
                                        q qVar = (q) k2;
                                        r rVar = qVar.e;
                                        if (rVar != null && (b = rVar.b(i2, obj, null)) != null) {
                                            obj3 = biFunction.apply(obj, b.c);
                                            if (obj3 != null) {
                                                b.c = obj3;
                                            } else {
                                                if (qVar.f(b)) {
                                                    h(lVarArr, i5, p(qVar.f));
                                                }
                                                i3 = -1;
                                            }
                                        }
                                        i4 = 2;
                                    } else if (k2 instanceof m) {
                                        break;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (i4 != 0) {
                            break;
                        }
                    }
                }
            }
            lVarArr = e();
        }
        if (i3 != 0) {
            a(i3, i4);
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
        int i2 = i(obj.hashCode());
        l[] lVarArr = this.a;
        int i3 = 0;
        Object obj3 = null;
        int i4 = 0;
        while (true) {
            if (lVarArr != null) {
                int length = lVarArr.length;
                if (length != 0) {
                    int i5 = (length - 1) & i2;
                    l k2 = k(lVarArr, i5);
                    if (k2 == null) {
                        m mVar = new m();
                        synchronized (mVar) {
                            try {
                                if (b(lVarArr, i5, mVar)) {
                                    try {
                                        obj3 = biFunction.apply(obj, null);
                                        if (obj3 != null) {
                                            lVar = new l(i2, obj, obj3);
                                            i4 = 1;
                                        } else {
                                            lVar = null;
                                        }
                                        h(lVarArr, i5, lVar);
                                        i3 = 1;
                                    } catch (Throwable th) {
                                        h(lVarArr, i5, null);
                                        throw th;
                                    }
                                }
                            } finally {
                            }
                        }
                        if (i3 != 0) {
                        }
                    } else {
                        int i6 = k2.a;
                        if (i6 == -1) {
                            lVarArr = d(lVarArr, k2);
                        } else {
                            synchronized (k2) {
                                try {
                                    if (k(lVarArr, i5) == k2) {
                                        if (i6 >= 0) {
                                            l lVar2 = null;
                                            l lVar3 = k2;
                                            i3 = 1;
                                            while (true) {
                                                if (lVar3.a == i2 && ((obj2 = lVar3.b) == obj || (obj2 != null && obj.equals(obj2)))) {
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
                                                        lVar3.d = new l(i2, obj, apply);
                                                        obj3 = apply;
                                                        i4 = 1;
                                                    }
                                                } else {
                                                    i3++;
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
                                                    h(lVarArr, i5, lVar5);
                                                }
                                                obj3 = apply2;
                                                i4 = -1;
                                            }
                                        } else if (k2 instanceof q) {
                                            q qVar = (q) k2;
                                            r rVar = qVar.e;
                                            r b = rVar != null ? rVar.b(i2, obj, null) : null;
                                            Object apply3 = biFunction.apply(obj, b == null ? null : b.c);
                                            if (apply3 != null) {
                                                if (b != null) {
                                                    b.c = apply3;
                                                } else {
                                                    qVar.e(i2, obj, apply3);
                                                    i4 = 1;
                                                }
                                            } else if (b != null) {
                                                if (qVar.f(b)) {
                                                    h(lVarArr, i5, p(qVar.f));
                                                }
                                                i4 = -1;
                                            }
                                            obj3 = apply3;
                                            i3 = 1;
                                        } else if (k2 instanceof m) {
                                            throw new IllegalStateException("Recursive update");
                                        }
                                    }
                                } finally {
                                }
                            }
                            if (i3 != 0) {
                                if (i3 >= 8) {
                                    n(lVarArr, i5);
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
        int i2;
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
        int i3 = i(obj.hashCode());
        l[] lVarArr = this.a;
        int i4 = 0;
        Object obj5 = null;
        int i5 = 0;
        while (true) {
            if (lVarArr != null) {
                int length = lVarArr.length;
                if (length != 0) {
                    int i6 = (length - 1) & i3;
                    l k2 = k(lVarArr, i6);
                    i2 = 1;
                    if (k2 == null) {
                        if (b(lVarArr, i6, new l(i3, obj, obj4))) {
                            break;
                        }
                    } else {
                        int i7 = k2.a;
                        if (i7 == -1) {
                            lVarArr = d(lVarArr, k2);
                        } else {
                            synchronized (k2) {
                                try {
                                    if (k(lVarArr, i6) == k2) {
                                        if (i7 >= 0) {
                                            l lVar = null;
                                            l lVar2 = k2;
                                            i4 = 1;
                                            while (true) {
                                                if (lVar2.a == i3 && ((obj3 = lVar2.b) == obj || (obj3 != null && obj.equals(obj3)))) {
                                                    break;
                                                }
                                                l lVar3 = lVar2.d;
                                                if (lVar3 == null) {
                                                    lVar2.d = new l(i3, obj, obj4);
                                                    obj5 = obj4;
                                                    i5 = 1;
                                                    break;
                                                }
                                                i4++;
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
                                                    h(lVarArr, i6, lVar4);
                                                }
                                                obj5 = apply;
                                                i5 = -1;
                                            }
                                        } else if (k2 instanceof q) {
                                            q qVar = (q) k2;
                                            r rVar = qVar.e;
                                            r b = rVar == null ? null : rVar.b(i3, obj, null);
                                            Object apply2 = b == null ? obj4 : biFunction.apply(b.c, obj4);
                                            if (apply2 != null) {
                                                if (b != null) {
                                                    b.c = apply2;
                                                } else {
                                                    qVar.e(i3, obj, apply2);
                                                    i5 = 1;
                                                }
                                            } else if (b != null) {
                                                if (qVar.f(b)) {
                                                    h(lVarArr, i6, p(qVar.f));
                                                }
                                                i5 = -1;
                                            }
                                            i4 = 2;
                                            obj5 = apply2;
                                        } else if (k2 instanceof m) {
                                            break;
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            if (i4 != 0) {
                                if (i4 >= 8) {
                                    n(lVarArr, i6);
                                }
                                i2 = i5;
                                obj4 = obj5;
                            }
                        }
                    }
                }
            }
            lVarArr = e();
        }
        if (i2 != 0) {
            a(i2, i4);
        }
        return obj4;
    }

    private final l[] e() {
        while (true) {
            l[] lVarArr = this.a;
            if (lVarArr != null && lVarArr.length != 0) {
                return lVarArr;
            }
            int i2 = this.sizeCtl;
            if (i2 < 0) {
                Thread.yield();
            } else if (h.c(this, i, i2, -1)) {
                try {
                    l[] lVarArr2 = this.a;
                    if (lVarArr2 != null) {
                        if (lVarArr2.length == 0) {
                        }
                        this.sizeCtl = i2;
                        return lVarArr2;
                    }
                    int i3 = i2 > 0 ? i2 : 16;
                    l[] lVarArr3 = new l[i3];
                    this.a = lVarArr3;
                    i2 = i3 - (i3 >>> 2);
                    lVarArr2 = lVarArr3;
                    this.sizeCtl = i2;
                    return lVarArr2;
                } catch (Throwable th) {
                    this.sizeCtl = i2;
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x013f, code lost:
    
        if (r25.c != r7) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0141, code lost:
    
        r25.c = (j$.util.concurrent.c[]) java.util.Arrays.copyOf(r7, r8 << 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r1.d(r25, r3, r5, r14) == false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x019f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00ba A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a(long j2, int i2) {
        boolean z;
        boolean z2;
        int length;
        boolean z3;
        int length2;
        int length3;
        c cVar;
        long j3;
        l[] lVarArr;
        int length4;
        l[] lVarArr2;
        c[] cVarArr = this.c;
        if (cVarArr == null) {
            j$.sun.misc.a aVar = h;
            long j4 = k;
            long j5 = this.baseCount;
            j3 = j5 + j2;
        }
        if (cVarArr == null || (length3 = cVarArr.length - 1) < 0 || (cVar = cVarArr[length3 & ThreadLocalRandom.b()]) == null) {
            z = true;
        } else {
            j$.sun.misc.a aVar2 = h;
            long j6 = m;
            long j7 = cVar.value;
            z = aVar2.d(cVar, j6, j7, j7 + j2);
            if (z) {
                if (i2 <= 1) {
                    return;
                }
                j3 = j();
                if (i2 < 0) {
                    return;
                }
                while (true) {
                    int i3 = this.sizeCtl;
                    if (j3 < i3 || (lVarArr = this.a) == null || (length4 = lVarArr.length) >= 1073741824) {
                        return;
                    }
                    int numberOfLeadingZeros = Integer.numberOfLeadingZeros(length4) | 32768;
                    if (i3 < 0) {
                        if ((i3 >>> 16) != numberOfLeadingZeros || i3 == numberOfLeadingZeros + 1 || i3 == numberOfLeadingZeros + 65535 || (lVarArr2 = this.b) == null || this.transferIndex <= 0) {
                            return;
                        }
                        if (h.c(this, i, i3, i3 + 1)) {
                            m(lVarArr, lVarArr2);
                        }
                    } else if (h.c(this, i, i3, (numberOfLeadingZeros << 16) + 2)) {
                        m(lVarArr, null);
                    }
                    j3 = j();
                }
            }
        }
        int b = ThreadLocalRandom.b();
        if (b == 0) {
            ThreadLocalRandom.f();
            b = ThreadLocalRandom.b();
            z = true;
        }
        boolean z4 = z;
        while (true) {
            boolean z5 = false;
            while (true) {
                c[] cVarArr2 = this.c;
                if (cVarArr2 != null && (length = cVarArr2.length) > 0) {
                    c cVar2 = cVarArr2[(length - 1) & b];
                    if (cVar2 == null) {
                        if (this.cellsBusy == 0) {
                            c cVar3 = new c(j2);
                            if (this.cellsBusy == 0 && h.c(this, l, 0, 1)) {
                                try {
                                    c[] cVarArr3 = this.c;
                                    if (cVarArr3 != null && (length2 = cVarArr3.length) > 0) {
                                        int i4 = (length2 - 1) & b;
                                        if (cVarArr3[i4] == null) {
                                            cVarArr3[i4] = cVar3;
                                            z3 = true;
                                            if (!z3) {
                                                return;
                                            }
                                        }
                                    }
                                    z3 = false;
                                    if (!z3) {
                                    }
                                } finally {
                                }
                            }
                        }
                    } else {
                        if (z4) {
                            j$.sun.misc.a aVar3 = h;
                            long j8 = m;
                            long j9 = cVar2.value;
                            if (aVar3.d(cVar2, j8, j9, j9 + j2)) {
                                return;
                            }
                            if (this.c == cVarArr2 && length < g) {
                                if (!z5) {
                                    z5 = true;
                                } else if (this.cellsBusy == 0 && aVar3.c(this, l, 0, 1)) {
                                    try {
                                        break;
                                    } finally {
                                    }
                                }
                            }
                        } else {
                            z4 = true;
                        }
                        b = ThreadLocalRandom.a(b);
                    }
                    z5 = false;
                    b = ThreadLocalRandom.a(b);
                } else if (this.cellsBusy == 0 && this.c == cVarArr2 && h.c(this, l, 0, 1)) {
                    try {
                        if (this.c == cVarArr2) {
                            c[] cVarArr4 = new c[2];
                            cVarArr4[b & 1] = new c(j2);
                            this.c = cVarArr4;
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            return;
                        }
                    } finally {
                    }
                } else {
                    j$.sun.misc.a aVar4 = h;
                    long j10 = k;
                    long j11 = this.baseCount;
                    if (aVar4.d(this, j10, j11, j11 + j2)) {
                        return;
                    }
                }
            }
        }
    }

    final l[] d(l[] lVarArr, l lVar) {
        int i2;
        if (lVar instanceof g) {
            l[] lVarArr2 = ((g) lVar).e;
            int numberOfLeadingZeros = Integer.numberOfLeadingZeros(lVarArr.length) | 32768;
            while (true) {
                if (lVarArr2 != this.b || this.a != lVarArr || (i2 = this.sizeCtl) >= 0 || (i2 >>> 16) != numberOfLeadingZeros || i2 == numberOfLeadingZeros + 1 || i2 == 65535 + numberOfLeadingZeros || this.transferIndex <= 0) {
                    break;
                }
                if (h.c(this, i, i2, i2 + 1)) {
                    m(lVarArr, lVarArr2);
                    break;
                }
            }
            return lVarArr2;
        }
        return this.a;
    }

    private final void o(int i2) {
        int length;
        int l2 = i2 >= 536870912 ? TLObject.FLAG_30 : l(i2 + (i2 >>> 1) + 1);
        while (true) {
            int i3 = this.sizeCtl;
            if (i3 < 0) {
                return;
            }
            l[] lVarArr = this.a;
            if (lVarArr == null || (length = lVarArr.length) == 0) {
                int i4 = i3 > l2 ? i3 : l2;
                if (h.c(this, i, i3, -1)) {
                    try {
                        if (this.a == lVarArr) {
                            this.a = new l[i4];
                            i3 = i4 - (i4 >>> 2);
                        }
                    } finally {
                        this.sizeCtl = i3;
                    }
                } else {
                    continue;
                }
            } else {
                if (l2 <= i3 || length >= 1073741824) {
                    return;
                }
                if (lVarArr == this.a) {
                    if (h.c(this, i, i3, ((Integer.numberOfLeadingZeros(length) | 32768) << 16) + 2)) {
                        m(lVarArr, null);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r13v12, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r4v0, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r5v17, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r5v22, types: [j$.util.concurrent.l] */
    private final void m(l[] lVarArr, l[] lVarArr2) {
        l[] lVarArr3;
        int i2;
        int i3;
        g gVar;
        ConcurrentHashMap<K, V> concurrentHashMap;
        int i4;
        l qVar;
        l qVar2;
        r rVar;
        int i5;
        ConcurrentHashMap<K, V> concurrentHashMap2 = this;
        l[] lVarArr4 = lVarArr;
        int length = lVarArr4.length;
        int i6 = g;
        int i7 = i6 > 1 ? (length >>> 3) / i6 : length;
        int i8 = i7 < 16 ? 16 : i7;
        if (lVarArr2 == null) {
            try {
                l[] lVarArr5 = new l[length << 1];
                concurrentHashMap2.b = lVarArr5;
                concurrentHashMap2.transferIndex = length;
                lVarArr3 = lVarArr5;
            } catch (Throwable unused) {
                concurrentHashMap2.sizeCtl = ConnectionsManager.DEFAULT_DATACENTER_ID;
                return;
            }
        } else {
            lVarArr3 = lVarArr2;
        }
        int length2 = lVarArr3.length;
        g gVar2 = new g(lVarArr3);
        int i9 = 0;
        int i10 = 0;
        boolean z = true;
        boolean z2 = false;
        while (true) {
            if (z) {
                int i11 = i10 - 1;
                if (i11 >= i9 || z2) {
                    i9 = i9;
                    i10 = i11;
                } else {
                    int i12 = concurrentHashMap2.transferIndex;
                    if (i12 <= 0) {
                        i10 = -1;
                    } else {
                        j$.sun.misc.a aVar = h;
                        long j2 = j;
                        int i13 = i12 > i8 ? i12 - i8 : 0;
                        int i14 = i9;
                        if (aVar.c(this, j2, i12, i13)) {
                            i10 = i12 - 1;
                            i9 = i13;
                        } else {
                            i9 = i14;
                            i10 = i11;
                        }
                    }
                }
                z = false;
            } else {
                int i15 = i9;
                r rVar2 = null;
                if (i10 < 0 || i10 >= length || (i4 = i10 + length) >= length2) {
                    i2 = i8;
                    i3 = length2;
                    gVar = gVar2;
                    if (z2) {
                        this.b = null;
                        this.a = lVarArr3;
                        this.sizeCtl = (length << 1) - (length >>> 1);
                        return;
                    }
                    concurrentHashMap = this;
                    j$.sun.misc.a aVar2 = h;
                    long j3 = i;
                    int i16 = concurrentHashMap.sizeCtl;
                    int i17 = i10;
                    if (!aVar2.c(this, j3, i16, i16 - 1)) {
                        i10 = i17;
                    } else {
                        if (i16 - 2 != ((Integer.numberOfLeadingZeros(length) | 32768) << 16)) {
                            return;
                        }
                        i10 = length;
                        z = true;
                        z2 = true;
                    }
                } else {
                    ?? k2 = k(lVarArr4, i10);
                    if (k2 == 0) {
                        z = b(lVarArr4, i10, gVar2);
                        concurrentHashMap = concurrentHashMap2;
                        i2 = i8;
                        i3 = length2;
                        gVar = gVar2;
                    } else {
                        int i18 = k2.a;
                        if (i18 == -1) {
                            concurrentHashMap = concurrentHashMap2;
                            i2 = i8;
                            i3 = length2;
                            gVar = gVar2;
                            z = true;
                        } else {
                            synchronized (k2) {
                                try {
                                    if (k(lVarArr4, i10) == k2) {
                                        if (i18 >= 0) {
                                            int i19 = i18 & length;
                                            r rVar3 = k2;
                                            for (r rVar4 = k2.d; rVar4 != null; rVar4 = rVar4.d) {
                                                int i20 = rVar4.a & length;
                                                if (i20 != i19) {
                                                    rVar3 = rVar4;
                                                    i19 = i20;
                                                }
                                            }
                                            if (i19 == 0) {
                                                rVar = null;
                                                rVar2 = rVar3;
                                            } else {
                                                rVar = rVar3;
                                            }
                                            l lVar = k2;
                                            while (lVar != rVar3) {
                                                int i21 = lVar.a;
                                                Object obj = lVar.b;
                                                int i22 = i8;
                                                Object obj2 = lVar.c;
                                                if ((i21 & length) == 0) {
                                                    i5 = length2;
                                                    rVar2 = new l(i21, obj, obj2, rVar2);
                                                } else {
                                                    i5 = length2;
                                                    rVar = new l(i21, obj, obj2, rVar);
                                                }
                                                lVar = lVar.d;
                                                i8 = i22;
                                                length2 = i5;
                                            }
                                            i2 = i8;
                                            i3 = length2;
                                            h(lVarArr3, i10, rVar2);
                                            h(lVarArr3, i4, rVar);
                                            h(lVarArr4, i10, gVar2);
                                            gVar = gVar2;
                                        } else {
                                            i2 = i8;
                                            i3 = length2;
                                            if (k2 instanceof q) {
                                                q qVar3 = (q) k2;
                                                r rVar5 = null;
                                                r rVar6 = null;
                                                l lVar2 = qVar3.f;
                                                int i23 = 0;
                                                int i24 = 0;
                                                r rVar7 = null;
                                                while (lVar2 != null) {
                                                    q qVar4 = qVar3;
                                                    int i25 = lVar2.a;
                                                    g gVar3 = gVar2;
                                                    r rVar8 = new r(i25, lVar2.b, lVar2.c, null, null);
                                                    if ((i25 & length) == 0) {
                                                        rVar8.h = rVar6;
                                                        if (rVar6 == null) {
                                                            rVar2 = rVar8;
                                                        } else {
                                                            rVar6.d = rVar8;
                                                        }
                                                        i23++;
                                                        rVar6 = rVar8;
                                                    } else {
                                                        rVar8.h = rVar5;
                                                        if (rVar5 == null) {
                                                            rVar7 = rVar8;
                                                        } else {
                                                            rVar5.d = rVar8;
                                                        }
                                                        i24++;
                                                        rVar5 = rVar8;
                                                    }
                                                    lVar2 = lVar2.d;
                                                    qVar3 = qVar4;
                                                    gVar2 = gVar3;
                                                }
                                                q qVar5 = qVar3;
                                                g gVar4 = gVar2;
                                                if (i23 <= 6) {
                                                    qVar = p(rVar2);
                                                } else {
                                                    qVar = i24 != 0 ? new q(rVar2) : qVar5;
                                                }
                                                if (i24 <= 6) {
                                                    qVar2 = p(rVar7);
                                                } else {
                                                    qVar2 = i23 != 0 ? new q(rVar7) : qVar5;
                                                }
                                                h(lVarArr3, i10, qVar);
                                                h(lVarArr3, i4, qVar2);
                                                lVarArr4 = lVarArr;
                                                gVar = gVar4;
                                                h(lVarArr4, i10, gVar);
                                            }
                                        }
                                        z = true;
                                    } else {
                                        i2 = i8;
                                        i3 = length2;
                                    }
                                    gVar = gVar2;
                                } finally {
                                }
                            }
                            concurrentHashMap = this;
                        }
                    }
                }
                gVar2 = gVar;
                concurrentHashMap2 = concurrentHashMap;
                i9 = i15;
                i8 = i2;
                length2 = i3;
            }
        }
    }

    final long j() {
        c[] cVarArr = this.c;
        long j2 = this.baseCount;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                if (cVar != null) {
                    j2 += cVar.value;
                }
            }
        }
        return j2;
    }

    private final void n(l[] lVarArr, int i2) {
        int length = lVarArr.length;
        if (length < 64) {
            o(length << 1);
            return;
        }
        l k2 = k(lVarArr, i2);
        if (k2 == null || k2.a < 0) {
            return;
        }
        synchronized (k2) {
            try {
                if (k(lVarArr, i2) == k2) {
                    r rVar = null;
                    l lVar = k2;
                    r rVar2 = null;
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
                    h(lVarArr, i2, new q(rVar));
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [j$.util.concurrent.l] */
    static l p(r rVar) {
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
