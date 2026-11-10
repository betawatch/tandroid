package j$.util.concurrent;

import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Spliterator;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* loaded from: classes2.dex */
public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, t {
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
    public volatile transient k[] a;
    public volatile transient k[] b;
    private volatile transient long baseCount;
    public volatile transient c[] c;
    private volatile transient int cellsBusy;
    public transient KeySetView d;
    public transient r e;
    public transient e f;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    public static final int i(int i7) {
        return (i7 ^ (i7 >>> 16)) & ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    static {
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField("segments", m[].class), new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        j$.sun.misc.a aVar = j$.sun.misc.a.b;
        h = aVar;
        i = aVar.h(ConcurrentHashMap.class, "sizeCtl");
        j = aVar.h(ConcurrentHashMap.class, "transferIndex");
        k = aVar.h(ConcurrentHashMap.class, "baseCount");
        l = aVar.h(ConcurrentHashMap.class, "cellsBusy");
        m = aVar.h(c.class, "value");
        n = aVar.a(k[].class);
        int b10 = aVar.b(k[].class);
        if (((b10 - 1) & b10) != 0) {
            throw new ExceptionInInitializerError("array index scale not a power of two");
        }
        o = 31 - Integer.numberOfLeadingZeros(b10);
    }

    public static final int l(int i7) {
        int numberOfLeadingZeros = (-1) >>> Integer.numberOfLeadingZeros(i7 - 1);
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

    public static final k k(k[] kVarArr, int i7) {
        return (k) h.f(kVarArr, (i7 << o) + n);
    }

    public static final boolean b(k[] kVarArr, int i7, k kVar) {
        return j$.com.android.tools.r8.a.P(h.a, kVarArr, (i7 << o) + n, kVar);
    }

    public static final void h(k[] kVarArr, int i7, k kVar) {
        h.j(kVarArr, (i7 << o) + n, kVar);
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i7) {
        this(i7, 0.75f, 1);
    }

    public ConcurrentHashMap(int i7, float f10, int i10) {
        if (f10 <= 0.0f || i7 < 0 || i10 <= 0) {
            throw new IllegalArgumentException();
        }
        long j3 = (long) (((i7 < i10 ? i10 : i7) / f10) + 1.0d);
        this.sizeCtl = j3 >= 1073741824 ? TLObject.FLAG_30 : l((int) j3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j3 = j();
        if (j3 < 0) {
            return 0;
        }
        return j3 > 2147483647L ? ConnectionsManager.DEFAULT_DATACENTER_ID : (int) j3;
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
        k k10;
        Object obj2;
        int i7 = i(obj.hashCode());
        k[] kVarArr = this.a;
        if (kVarArr == null || (length = kVarArr.length) <= 0 || (k10 = k(kVarArr, (length - 1) & i7)) == null) {
            return null;
        }
        int i10 = k10.a;
        if (i10 == i7) {
            Object obj3 = k10.b;
            if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                return (V) k10.c;
            }
        } else if (i10 < 0) {
            k a10 = k10.a(i7, obj);
            if (a10 != null) {
                return (V) a10.c;
            }
            return null;
        }
        while (true) {
            k10 = k10.d;
            if (k10 == null) {
                return null;
            }
            if (k10.a != i7 || ((obj2 = k10.b) != obj && (obj2 == null || !obj.equals(obj2)))) {
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
        k[] kVarArr = this.a;
        if (kVarArr != null) {
            o oVar = new o(kVarArr, kVarArr.length, 0, kVarArr.length);
            while (true) {
                k a10 = oVar.a();
                if (a10 == null) {
                    break;
                }
                Object obj2 = a10.c;
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
    public final Object f(Object obj, Object obj2, boolean z9) {
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
        int i7 = i(obj.hashCode());
        k[] kVarArr = this.a;
        int i10 = 0;
        while (true) {
            if (kVarArr != null) {
                int length = kVarArr.length;
                if (length != 0) {
                    int i11 = (length - 1) & i7;
                    k k10 = k(kVarArr, i11);
                    if (k10 == null) {
                        if (b(kVarArr, i11, new k(i7, obj, obj2))) {
                            break;
                        }
                    } else {
                        int i12 = k10.a;
                        if (i12 == -1) {
                            kVarArr = d(kVarArr, k10);
                        } else {
                            if (z9 && i12 == i7 && (((obj5 = k10.b) == obj || (obj5 != null && obj.equals(obj5))) && (obj6 = k10.c) != null)) {
                                return obj6;
                            }
                            synchronized (k10) {
                                try {
                                    if (k(kVarArr, i11) == k10) {
                                        if (i12 >= 0) {
                                            i10 = 1;
                                            k kVar = k10;
                                            while (true) {
                                                if (kVar.a == i7 && ((obj4 = kVar.b) == obj || (obj4 != null && obj.equals(obj4)))) {
                                                    break;
                                                }
                                                k kVar2 = kVar.d;
                                                if (kVar2 == null) {
                                                    kVar.d = new k(i7, obj, obj2);
                                                    break;
                                                }
                                                i10++;
                                                kVar = kVar2;
                                            }
                                            obj3 = kVar.c;
                                            if (!z9) {
                                                kVar.c = obj2;
                                            }
                                        } else if (k10 instanceof p) {
                                            q e10 = ((p) k10).e(i7, obj, obj2);
                                            if (e10 != null) {
                                                Object obj7 = e10.c;
                                                if (!z9) {
                                                    e10.c = obj2;
                                                }
                                                obj3 = obj7;
                                            } else {
                                                obj3 = null;
                                            }
                                            i10 = 2;
                                        } else if (k10 instanceof l) {
                                            break;
                                        }
                                    }
                                    obj3 = null;
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            if (i10 != 0) {
                                if (i10 >= 8) {
                                    n(kVarArr, i11);
                                }
                                if (obj3 != null) {
                                    return obj3;
                                }
                            }
                        }
                    }
                }
            }
            kVarArr = e();
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
        int i7;
        k k10;
        boolean z9;
        Object obj4;
        q b10;
        Object obj5;
        int i10 = i(obj.hashCode());
        k[] kVarArr = this.a;
        while (true) {
            if (kVarArr == null || (length = kVarArr.length) == 0 || (k10 = k(kVarArr, (i7 = (length - 1) & i10))) == null) {
                break;
            }
            int i11 = k10.a;
            if (i11 == -1) {
                kVarArr = d(kVarArr, k10);
            } else {
                synchronized (k10) {
                    try {
                        if (k(kVarArr, i7) == k10) {
                            z9 = true;
                            if (i11 >= 0) {
                                k kVar = null;
                                k kVar2 = k10;
                                while (true) {
                                    if (kVar2.a == i10 && ((obj5 = kVar2.b) == obj || (obj5 != null && obj.equals(obj5)))) {
                                        break;
                                    }
                                    k kVar3 = kVar2.d;
                                    if (kVar3 == null) {
                                        break;
                                    }
                                    kVar = kVar2;
                                    kVar2 = kVar3;
                                }
                                obj4 = kVar2.c;
                                if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                    if (obj2 != null) {
                                        kVar2.c = obj2;
                                    } else if (kVar != null) {
                                        kVar.d = kVar2.d;
                                    } else {
                                        h(kVarArr, i7, kVar2.d);
                                    }
                                }
                                obj4 = null;
                            } else if (k10 instanceof p) {
                                p pVar = (p) k10;
                                q qVar = pVar.e;
                                if (qVar != null && (b10 = qVar.b(i10, obj, null)) != null) {
                                    obj4 = b10.c;
                                    if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                        if (obj2 != null) {
                                            b10.c = obj2;
                                        } else if (pVar.f(b10)) {
                                            h(kVarArr, i7, p(pVar.f));
                                        }
                                    }
                                }
                                obj4 = null;
                            } else if (k10 instanceof l) {
                                throw new IllegalStateException("Recursive update");
                            }
                        }
                        z9 = false;
                        obj4 = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z9) {
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
        k k10;
        k kVar;
        k[] kVarArr = this.a;
        long j3 = 0;
        loop0: while (true) {
            int i7 = 0;
            while (kVarArr != null && i7 < kVarArr.length) {
                k10 = k(kVarArr, i7);
                if (k10 == null) {
                    i7++;
                } else {
                    int i10 = k10.a;
                    if (i10 == -1) {
                        break;
                    }
                    synchronized (k10) {
                        try {
                            if (k(kVarArr, i7) == k10) {
                                if (i10 >= 0) {
                                    kVar = k10;
                                } else {
                                    kVar = k10 instanceof p ? ((p) k10).f : null;
                                }
                                while (kVar != null) {
                                    j3--;
                                    kVar = kVar.d;
                                }
                                h(kVarArr, i7, null);
                                i7++;
                            }
                        } finally {
                        }
                    }
                }
            }
            kVarArr = d(kVarArr, k10);
        }
        if (j3 != 0) {
            a(j3, -1);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        KeySetView keySetView = this.d;
        if (keySetView != null) {
            return keySetView;
        }
        KeySetView keySetView2 = new KeySetView(this, null);
        this.d = keySetView2;
        return keySetView2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        r rVar = this.e;
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r(this);
        this.e = rVar2;
        return rVar2;
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
        k[] kVarArr = this.a;
        int i7 = 0;
        if (kVarArr != null) {
            o oVar = new o(kVarArr, kVarArr.length, 0, kVarArr.length);
            while (true) {
                k a10 = oVar.a();
                if (a10 == null) {
                    break;
                }
                i7 += a10.c.hashCode() ^ a10.b.hashCode();
            }
        }
        return i7;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        k[] kVarArr = this.a;
        int length = kVarArr == null ? 0 : kVarArr.length;
        o oVar = new o(kVarArr, length, 0, length);
        StringBuilder sb2 = new StringBuilder("{");
        k a10 = oVar.a();
        if (a10 != null) {
            while (true) {
                Object obj = a10.b;
                Object obj2 = a10.c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb2.append(obj);
                sb2.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb2.append(obj2);
                a10 = oVar.a();
                if (a10 == null) {
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
        k[] kVarArr = this.a;
        int length = kVarArr == null ? 0 : kVarArr.length;
        o oVar = new o(kVarArr, length, 0, length);
        while (true) {
            k a10 = oVar.a();
            if (a10 != null) {
                Object obj2 = a10.c;
                Object obj3 = map.get(a10.b);
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
        int i7 = 0;
        int i10 = 1;
        while (i10 < 16) {
            i7++;
            i10 <<= 1;
        }
        int i11 = 32 - i7;
        int i12 = i10 - 1;
        m[] mVarArr = new m[16];
        for (int i13 = 0; i13 < 16; i13++) {
            mVarArr[i13] = new m();
        }
        ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
        putFields.put("segments", mVarArr);
        putFields.put("segmentShift", i11);
        putFields.put("segmentMask", i12);
        objectOutputStream.writeFields();
        k[] kVarArr = this.a;
        if (kVarArr != null) {
            o oVar = new o(kVarArr, kVarArr.length, 0, kVarArr.length);
            while (true) {
                k a10 = oVar.a();
                if (a10 == null) {
                    break;
                }
                objectOutputStream.writeObject(a10.b);
                objectOutputStream.writeObject(a10.c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        long j3;
        long j10;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j11 = 0;
        long j12 = 0;
        k kVar = null;
        while (true) {
            Object readObject = objectInputStream.readObject();
            Object readObject2 = objectInputStream.readObject();
            j3 = 1;
            if (readObject == null || readObject2 == null) {
                break;
            }
            j12++;
            kVar = new k(i(readObject.hashCode()), readObject, readObject2, kVar);
        }
        if (j12 == 0) {
            this.sizeCtl = 0;
            return;
        }
        long j13 = (long) ((j12 / 0.75f) + 1.0d);
        int l10 = j13 >= 1073741824 ? TLObject.FLAG_30 : l((int) j13);
        k[] kVarArr = new k[l10];
        int i7 = l10 - 1;
        while (kVar != null) {
            k kVar2 = kVar.d;
            int i10 = kVar.a;
            int i11 = i10 & i7;
            k k10 = k(kVarArr, i11);
            boolean z9 = true;
            if (k10 == null) {
                j10 = j3;
            } else {
                Object obj2 = kVar.b;
                if (k10.a < 0) {
                    if (((p) k10).e(i10, obj2, kVar.c) == null) {
                        j11 += j3;
                    }
                    j10 = j3;
                } else {
                    j10 = j3;
                    int i12 = 0;
                    for (k kVar3 = k10; kVar3 != null; kVar3 = kVar3.d) {
                        if (kVar3.a == i10 && ((obj = kVar3.b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z9 = false;
                            break;
                        }
                        i12++;
                    }
                    if (z9 && i12 >= 8) {
                        j11 += j10;
                        kVar.d = k10;
                        k kVar4 = kVar;
                        q qVar = null;
                        q qVar2 = null;
                        while (kVar4 != null) {
                            q qVar3 = new q(kVar4.a, kVar4.b, kVar4.c, null, null);
                            qVar3.h = qVar2;
                            if (qVar2 == null) {
                                qVar = qVar3;
                            } else {
                                qVar2.d = qVar3;
                            }
                            kVar4 = kVar4.d;
                            qVar2 = qVar3;
                        }
                        h(kVarArr, i11, new p(qVar));
                    }
                }
                z9 = false;
            }
            if (z9) {
                j11 += j10;
                kVar.d = k10;
                h(kVarArr, i11, kVar);
            }
            kVar = kVar2;
            j3 = j10;
        }
        this.a = kVarArr;
        this.sizeCtl = l10 - (l10 >>> 2);
        this.baseCount = j11;
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
        k[] kVarArr = this.a;
        if (kVarArr == null) {
            return;
        }
        o oVar = new o(kVarArr, kVarArr.length, 0, kVarArr.length);
        while (true) {
            k a10 = oVar.a();
            if (a10 == null) {
                return;
            } else {
                biConsumer.accept(a10.b, a10.c);
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        biFunction.getClass();
        k[] kVarArr = this.a;
        if (kVarArr == null) {
            return;
        }
        o oVar = new o(kVarArr, kVarArr.length, 0, kVarArr.length);
        while (true) {
            k a10 = oVar.a();
            if (a10 == null) {
                return;
            }
            Object obj = a10.c;
            Object obj2 = a10.b;
            do {
                Object apply = biFunction.apply(obj2, obj);
                apply.getClass();
                if (g(obj2, apply, obj) == null) {
                    obj = get(obj2);
                }
            } while (obj != null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f2, code lost:
    
        if (r5 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f4, code lost:
    
        a(1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f9, code lost:
    
        return r5;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object computeIfAbsent(Object obj, Function function) {
        q b10;
        Object obj2;
        Object obj3;
        Object obj4;
        if (obj == null) {
            throw null;
        }
        if (function == null) {
            throw null;
        }
        int i7 = i(obj.hashCode());
        k[] kVarArr = this.a;
        Object obj5 = null;
        int i10 = 0;
        while (true) {
            if (kVarArr != null) {
                int length = kVarArr.length;
                if (length != 0) {
                    int i11 = (length - 1) & i7;
                    k k10 = k(kVarArr, i11);
                    boolean z9 = true;
                    if (k10 == null) {
                        l lVar = new l();
                        synchronized (lVar) {
                            try {
                                if (b(kVarArr, i11, lVar)) {
                                    try {
                                        obj5 = function.apply(obj);
                                        h(kVarArr, i11, obj5 != null ? new k(i7, obj, obj5) : null);
                                        i10 = 1;
                                    } catch (Throwable th2) {
                                        h(kVarArr, i11, null);
                                        throw th2;
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
                            kVarArr = d(kVarArr, k10);
                        } else {
                            if (i12 == i7 && (((obj3 = k10.b) == obj || (obj3 != null && obj.equals(obj3))) && (obj4 = k10.c) != null)) {
                                return obj4;
                            }
                            synchronized (k10) {
                                try {
                                    if (k(kVarArr, i11) == k10) {
                                        if (i12 >= 0) {
                                            k kVar = k10;
                                            i10 = 1;
                                            while (true) {
                                                if (kVar.a == i7 && ((obj2 = kVar.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                                                    break;
                                                }
                                                k kVar2 = kVar.d;
                                                if (kVar2 == null) {
                                                    Object apply = function.apply(obj);
                                                    if (apply == null) {
                                                        z9 = false;
                                                    } else {
                                                        if (kVar.d != null) {
                                                            throw new IllegalStateException("Recursive update");
                                                        }
                                                        kVar.d = new k(i7, obj, apply);
                                                    }
                                                    obj5 = apply;
                                                } else {
                                                    i10++;
                                                    kVar = kVar2;
                                                }
                                            }
                                            obj5 = kVar.c;
                                        } else if (k10 instanceof p) {
                                            p pVar = (p) k10;
                                            q qVar = pVar.e;
                                            if (qVar != null && (b10 = qVar.b(i7, obj, null)) != null) {
                                                z9 = false;
                                                obj5 = b10.c;
                                            } else {
                                                obj5 = function.apply(obj);
                                                if (obj5 != null) {
                                                    pVar.e(i7, obj, obj5);
                                                } else {
                                                    z9 = false;
                                                }
                                            }
                                            i10 = 2;
                                        } else if (k10 instanceof l) {
                                            throw new IllegalStateException("Recursive update");
                                        }
                                    }
                                    z9 = false;
                                } finally {
                                }
                            }
                            if (i10 != 0) {
                                if (i10 >= 8) {
                                    n(kVarArr, i11);
                                }
                                if (!z9) {
                                    return obj5;
                                }
                            }
                        }
                    }
                }
            }
            kVarArr = e();
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
        q b10;
        Object obj2;
        if (obj == null) {
            throw null;
        }
        if (biFunction == null) {
            throw null;
        }
        int i7 = i(obj.hashCode());
        k[] kVarArr = this.a;
        int i10 = 0;
        Object obj3 = null;
        int i11 = 0;
        while (true) {
            if (kVarArr != null) {
                int length = kVarArr.length;
                if (length != 0) {
                    int i12 = (length - 1) & i7;
                    k k10 = k(kVarArr, i12);
                    if (k10 == null) {
                        break;
                    }
                    int i13 = k10.a;
                    if (i13 == -1) {
                        kVarArr = d(kVarArr, k10);
                    } else {
                        synchronized (k10) {
                            try {
                                if (k(kVarArr, i12) == k10) {
                                    if (i13 >= 0) {
                                        i11 = 1;
                                        k kVar = null;
                                        k kVar2 = k10;
                                        while (true) {
                                            if (kVar2.a == i7 && ((obj2 = kVar2.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                                                break;
                                            }
                                            k kVar3 = kVar2.d;
                                            if (kVar3 == null) {
                                                break;
                                            }
                                            i11++;
                                            kVar = kVar2;
                                            kVar2 = kVar3;
                                        }
                                        obj3 = biFunction.apply(obj, kVar2.c);
                                        if (obj3 != null) {
                                            kVar2.c = obj3;
                                        } else {
                                            k kVar4 = kVar2.d;
                                            if (kVar != null) {
                                                kVar.d = kVar4;
                                            } else {
                                                h(kVarArr, i12, kVar4);
                                            }
                                            i10 = -1;
                                        }
                                    } else if (k10 instanceof p) {
                                        p pVar = (p) k10;
                                        q qVar = pVar.e;
                                        if (qVar != null && (b10 = qVar.b(i7, obj, null)) != null) {
                                            obj3 = biFunction.apply(obj, b10.c);
                                            if (obj3 != null) {
                                                b10.c = obj3;
                                            } else {
                                                if (pVar.f(b10)) {
                                                    h(kVarArr, i12, p(pVar.f));
                                                }
                                                i10 = -1;
                                            }
                                        }
                                        i11 = 2;
                                    } else if (k10 instanceof l) {
                                        break;
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        if (i11 != 0) {
                            break;
                        }
                    }
                }
            }
            kVarArr = e();
        }
        if (i10 != 0) {
            a(i10, i11);
        }
        return obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x010e, code lost:
    
        if (r4 == 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0110, code lost:
    
        a(r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0114, code lost:
    
        return r5;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object compute(Object obj, BiFunction biFunction) {
        k kVar;
        Object apply;
        Object obj2;
        if (obj == null) {
            throw null;
        }
        if (biFunction == null) {
            throw null;
        }
        int i7 = i(obj.hashCode());
        k[] kVarArr = this.a;
        int i10 = 0;
        Object obj3 = null;
        int i11 = 0;
        while (true) {
            if (kVarArr != null) {
                int length = kVarArr.length;
                if (length != 0) {
                    int i12 = (length - 1) & i7;
                    k k10 = k(kVarArr, i12);
                    if (k10 == null) {
                        l lVar = new l();
                        synchronized (lVar) {
                            try {
                                if (b(kVarArr, i12, lVar)) {
                                    try {
                                        obj3 = biFunction.apply(obj, null);
                                        if (obj3 != null) {
                                            kVar = new k(i7, obj, obj3);
                                            i11 = 1;
                                        } else {
                                            kVar = null;
                                        }
                                        h(kVarArr, i12, kVar);
                                        i10 = 1;
                                    } catch (Throwable th2) {
                                        h(kVarArr, i12, null);
                                        throw th2;
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
                            kVarArr = d(kVarArr, k10);
                        } else {
                            synchronized (k10) {
                                try {
                                    if (k(kVarArr, i12) == k10) {
                                        if (i13 >= 0) {
                                            k kVar2 = null;
                                            k kVar3 = k10;
                                            i10 = 1;
                                            while (true) {
                                                if (kVar3.a == i7 && ((obj2 = kVar3.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                                                    break;
                                                }
                                                k kVar4 = kVar3.d;
                                                if (kVar4 == null) {
                                                    apply = biFunction.apply(obj, null);
                                                    if (apply != null) {
                                                        if (kVar3.d != null) {
                                                            throw new IllegalStateException("Recursive update");
                                                        }
                                                        kVar3.d = new k(i7, obj, apply);
                                                        i11 = 1;
                                                    }
                                                } else {
                                                    i10++;
                                                    kVar2 = kVar3;
                                                    kVar3 = kVar4;
                                                }
                                            }
                                            Object apply2 = biFunction.apply(obj, kVar3.c);
                                            if (apply2 != null) {
                                                kVar3.c = apply2;
                                                obj3 = apply2;
                                            } else {
                                                k kVar5 = kVar3.d;
                                                if (kVar2 != null) {
                                                    kVar2.d = kVar5;
                                                } else {
                                                    h(kVarArr, i12, kVar5);
                                                }
                                                obj3 = apply2;
                                                i11 = -1;
                                            }
                                        } else if (k10 instanceof p) {
                                            p pVar = (p) k10;
                                            q qVar = pVar.e;
                                            q b10 = qVar != null ? qVar.b(i7, obj, null) : null;
                                            apply = biFunction.apply(obj, b10 == null ? null : b10.c);
                                            if (apply != null) {
                                                if (b10 != null) {
                                                    b10.c = apply;
                                                } else {
                                                    pVar.e(i7, obj, apply);
                                                    i11 = 1;
                                                }
                                            } else if (b10 != null) {
                                                if (pVar.f(b10)) {
                                                    h(kVarArr, i12, p(pVar.f));
                                                }
                                                i11 = -1;
                                            }
                                            i10 = 1;
                                            obj3 = apply;
                                        } else if (k10 instanceof l) {
                                            throw new IllegalStateException("Recursive update");
                                        }
                                    }
                                } finally {
                                }
                            }
                            if (i10 != 0) {
                                if (i10 >= 8) {
                                    n(kVarArr, i12);
                                }
                            }
                        }
                    }
                }
            }
            kVarArr = e();
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
        int i7;
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
        k[] kVarArr = this.a;
        int i11 = 0;
        Object obj5 = null;
        int i12 = 0;
        while (true) {
            if (kVarArr != null) {
                int length = kVarArr.length;
                if (length != 0) {
                    int i13 = (length - 1) & i10;
                    k k10 = k(kVarArr, i13);
                    i7 = 1;
                    if (k10 == null) {
                        if (b(kVarArr, i13, new k(i10, obj, obj4))) {
                            break;
                        }
                    } else {
                        int i14 = k10.a;
                        if (i14 == -1) {
                            kVarArr = d(kVarArr, k10);
                        } else {
                            synchronized (k10) {
                                try {
                                    if (k(kVarArr, i13) == k10) {
                                        if (i14 >= 0) {
                                            k kVar = null;
                                            k kVar2 = k10;
                                            i11 = 1;
                                            while (true) {
                                                if (kVar2.a == i10 && ((obj3 = kVar2.b) == obj || (obj3 != null && obj.equals(obj3)))) {
                                                    break;
                                                }
                                                k kVar3 = kVar2.d;
                                                if (kVar3 == null) {
                                                    kVar2.d = new k(i10, obj, obj4);
                                                    obj5 = obj4;
                                                    i12 = 1;
                                                    break;
                                                }
                                                i11++;
                                                kVar = kVar2;
                                                kVar2 = kVar3;
                                            }
                                            Object apply = biFunction.apply(kVar2.c, obj4);
                                            if (apply != null) {
                                                kVar2.c = apply;
                                                obj5 = apply;
                                            } else {
                                                k kVar4 = kVar2.d;
                                                if (kVar != null) {
                                                    kVar.d = kVar4;
                                                } else {
                                                    h(kVarArr, i13, kVar4);
                                                }
                                                obj5 = apply;
                                                i12 = -1;
                                            }
                                        } else if (k10 instanceof p) {
                                            p pVar = (p) k10;
                                            q qVar = pVar.e;
                                            q b10 = qVar == null ? null : qVar.b(i10, obj, null);
                                            Object apply2 = b10 == null ? obj4 : biFunction.apply(b10.c, obj4);
                                            if (apply2 != null) {
                                                if (b10 != null) {
                                                    b10.c = apply2;
                                                } else {
                                                    pVar.e(i10, obj, apply2);
                                                    i12 = 1;
                                                }
                                            } else if (b10 != null) {
                                                if (pVar.f(b10)) {
                                                    h(kVarArr, i13, p(pVar.f));
                                                }
                                                i12 = -1;
                                            }
                                            i11 = 2;
                                            obj5 = apply2;
                                        } else if (k10 instanceof l) {
                                            break;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            if (i11 != 0) {
                                if (i11 >= 8) {
                                    n(kVarArr, i13);
                                }
                                i7 = i12;
                                obj4 = obj5;
                            }
                        }
                    }
                }
            }
            kVarArr = e();
        }
        if (i7 != 0) {
            a(i7, i11);
        }
        return obj4;
    }

    public static <K> KeySetView<K, Boolean> newKeySet() {
        return new KeySetView<>(new ConcurrentHashMap(), Boolean.TRUE);
    }

    public final k[] e() {
        while (true) {
            k[] kVarArr = this.a;
            if (kVarArr != null && kVarArr.length != 0) {
                return kVarArr;
            }
            int i7 = this.sizeCtl;
            if (i7 < 0) {
                Thread.yield();
            } else if (h.c(this, i, i7, -1)) {
                try {
                    k[] kVarArr2 = this.a;
                    if (kVarArr2 != null) {
                        if (kVarArr2.length == 0) {
                        }
                        this.sizeCtl = i7;
                        return kVarArr2;
                    }
                    int i10 = i7 > 0 ? i7 : 16;
                    k[] kVarArr3 = new k[i10];
                    this.a = kVarArr3;
                    i7 = i10 - (i10 >>> 2);
                    kVarArr2 = kVarArr3;
                    this.sizeCtl = i7;
                    return kVarArr2;
                } catch (Throwable th2) {
                    this.sizeCtl = i7;
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x0140, code lost:
    
        if (r1.c != r6) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0142, code lost:
    
        r1.c = (j$.util.concurrent.c[]) java.util.Arrays.copyOf(r6, r7 << 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r0.d(r1, r2, r4, r6) == false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00c2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j3, int i7) {
        boolean z9;
        boolean z10;
        int length;
        boolean z11;
        int length2;
        int length3;
        c cVar;
        long j10;
        k[] kVarArr;
        int length4;
        k[] kVarArr2;
        ConcurrentHashMap<K, V> concurrentHashMap = this;
        c[] cVarArr = concurrentHashMap.c;
        if (cVarArr == null) {
            j$.sun.misc.a aVar = h;
            long j11 = k;
            long j12 = concurrentHashMap.baseCount;
            j10 = j12 + j3;
        }
        if (cVarArr == null || (length3 = cVarArr.length - 1) < 0 || (cVar = cVarArr[length3 & ((ThreadLocalRandom) ThreadLocalRandom.f.get()).b]) == null) {
            z9 = true;
        } else {
            j$.sun.misc.a aVar2 = h;
            long j13 = m;
            long j14 = cVar.value;
            z9 = aVar2.d(cVar, j13, j14, j14 + j3);
            if (z9) {
                if (i7 <= 1) {
                    return;
                }
                j10 = concurrentHashMap.j();
                if (i7 < 0) {
                    return;
                }
                while (true) {
                    int i10 = concurrentHashMap.sizeCtl;
                    if (j10 < i10 || (kVarArr = concurrentHashMap.a) == null || (length4 = kVarArr.length) >= 1073741824) {
                        return;
                    }
                    int numberOfLeadingZeros = Integer.numberOfLeadingZeros(length4) | 32768;
                    if (i10 < 0) {
                        if ((i10 >>> 16) != numberOfLeadingZeros || i10 == numberOfLeadingZeros + 1 || i10 == numberOfLeadingZeros + 65535 || (kVarArr2 = concurrentHashMap.b) == null || concurrentHashMap.transferIndex <= 0) {
                            return;
                        }
                        if (h.c(concurrentHashMap, i, i10, i10 + 1)) {
                            concurrentHashMap.m(kVarArr, kVarArr2);
                        }
                    } else if (h.c(concurrentHashMap, i, i10, (numberOfLeadingZeros << 16) + 2)) {
                        concurrentHashMap.m(kVarArr, null);
                    }
                    j10 = concurrentHashMap.j();
                }
            }
        }
        u uVar = ThreadLocalRandom.f;
        int i11 = ((ThreadLocalRandom) uVar.get()).b;
        if (i11 == 0) {
            ThreadLocalRandom.d();
            i11 = ((ThreadLocalRandom) uVar.get()).b;
            z9 = true;
        }
        boolean z12 = z9;
        int i12 = i11;
        while (true) {
            boolean z13 = false;
            while (true) {
                c[] cVarArr2 = concurrentHashMap.c;
                if (cVarArr2 != null && (length = cVarArr2.length) > 0) {
                    c cVar2 = cVarArr2[(length - 1) & i12];
                    if (cVar2 != null) {
                        if (z12) {
                            j$.sun.misc.a aVar3 = h;
                            long j15 = m;
                            long j16 = cVar2.value;
                            if (aVar3.d(cVar2, j15, j16, j16 + j3)) {
                                return;
                            }
                            if (concurrentHashMap.c == cVarArr2 && length < g) {
                                if (!z13) {
                                    z13 = true;
                                } else if (concurrentHashMap.cellsBusy == 0 && aVar3.c(concurrentHashMap, l, 0, 1)) {
                                    try {
                                        break;
                                    } finally {
                                    }
                                }
                            }
                        } else {
                            z12 = true;
                        }
                        int i13 = (i12 << 13) ^ i12;
                        int i14 = i13 ^ (i13 >>> 17);
                        int i15 = i14 ^ (i14 << 5);
                        ((ThreadLocalRandom) ThreadLocalRandom.f.get()).b = i15;
                        i12 = i15;
                    } else if (concurrentHashMap.cellsBusy == 0) {
                        c cVar3 = new c(j3);
                        if (concurrentHashMap.cellsBusy == 0 && h.c(concurrentHashMap, l, 0, 1)) {
                            try {
                                c[] cVarArr3 = concurrentHashMap.c;
                                if (cVarArr3 != null && (length2 = cVarArr3.length) > 0) {
                                    int i16 = (length2 - 1) & i12;
                                    if (cVarArr3[i16] == null) {
                                        cVarArr3[i16] = cVar3;
                                        z11 = true;
                                        if (!z11) {
                                            return;
                                        }
                                    }
                                }
                                z11 = false;
                                if (!z11) {
                                }
                            } finally {
                            }
                        }
                    }
                    z13 = false;
                    int i132 = (i12 << 13) ^ i12;
                    int i142 = i132 ^ (i132 >>> 17);
                    int i152 = i142 ^ (i142 << 5);
                    ((ThreadLocalRandom) ThreadLocalRandom.f.get()).b = i152;
                    i12 = i152;
                } else if (concurrentHashMap.cellsBusy == 0 && concurrentHashMap.c == cVarArr2 && h.c(concurrentHashMap, l, 0, 1)) {
                    try {
                        if (concurrentHashMap.c == cVarArr2) {
                            c[] cVarArr4 = new c[2];
                            cVarArr4[i12 & 1] = new c(j3);
                            concurrentHashMap.c = cVarArr4;
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            return;
                        }
                    } finally {
                    }
                } else {
                    j$.sun.misc.a aVar4 = h;
                    long j17 = k;
                    long j18 = concurrentHashMap.baseCount;
                    if (aVar4.d(concurrentHashMap, j17, j18, j18 + j3)) {
                        return;
                    }
                }
                concurrentHashMap = this;
            }
        }
    }

    public final k[] d(k[] kVarArr, k kVar) {
        int i7;
        if (kVar instanceof g) {
            k[] kVarArr2 = ((g) kVar).e;
            int numberOfLeadingZeros = Integer.numberOfLeadingZeros(kVarArr.length) | 32768;
            while (kVarArr2 == this.b && this.a == kVarArr && (i7 = this.sizeCtl) < 0 && (i7 >>> 16) == numberOfLeadingZeros && i7 != numberOfLeadingZeros + 1 && i7 != 65535 + numberOfLeadingZeros && this.transferIndex > 0) {
                if (h.c(this, i, i7, i7 + 1)) {
                    m(kVarArr, kVarArr2);
                    break;
                }
            }
            return kVarArr2;
        }
        return this.a;
    }

    public final void o(int i7) {
        int length;
        int l10 = i7 >= 536870912 ? 1073741824 : l(i7 + (i7 >>> 1) + 1);
        while (true) {
            int i10 = this.sizeCtl;
            if (i10 >= 0) {
                k[] kVarArr = this.a;
                if (kVarArr != null && (length = kVarArr.length) != 0) {
                    if (l10 <= i10 || length >= 1073741824) {
                        break;
                    } else if (kVarArr == this.a) {
                        if (h.c(this, i, i10, ((Integer.numberOfLeadingZeros(length) | 32768) << 16) + 2)) {
                            m(kVarArr, null);
                        }
                    }
                } else {
                    int i11 = i10 > l10 ? i10 : l10;
                    if (h.c(this, i, i10, -1)) {
                        try {
                            if (this.a == kVarArr) {
                                this.a = new k[i11];
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
    /* JADX WARN: Type inference failed for: r10v11, types: [j$.util.concurrent.k] */
    /* JADX WARN: Type inference failed for: r10v9, types: [j$.util.concurrent.k] */
    /* JADX WARN: Type inference failed for: r5v5, types: [j$.util.concurrent.k] */
    /* JADX WARN: Type inference failed for: r8v10, types: [j$.util.concurrent.k] */
    /* JADX WARN: Type inference failed for: r8v15, types: [j$.util.concurrent.k] */
    public final void m(k[] kVarArr, k[] kVarArr2) {
        k[] kVarArr3;
        int i7;
        int i10;
        int i11;
        int i12;
        boolean z9;
        char c10;
        int i13;
        int i14;
        k pVar;
        k pVar2;
        q qVar;
        int i15;
        ConcurrentHashMap<K, V> concurrentHashMap = this;
        int length = kVarArr.length;
        int i16 = g;
        boolean z10 = true;
        int i17 = i16 > 1 ? (length >>> 3) / i16 : length;
        char c11 = 16;
        int i18 = i17 < 16 ? 16 : i17;
        if (kVarArr2 == null) {
            try {
                k[] kVarArr4 = new k[length << 1];
                concurrentHashMap.b = kVarArr4;
                concurrentHashMap.transferIndex = length;
                kVarArr3 = kVarArr4;
            } catch (Throwable unused) {
                concurrentHashMap.sizeCtl = ConnectionsManager.DEFAULT_DATACENTER_ID;
                return;
            }
        } else {
            kVarArr3 = kVarArr2;
        }
        int length2 = kVarArr3.length;
        g gVar = new g(kVarArr3);
        boolean z11 = true;
        int i19 = 0;
        int i20 = 0;
        boolean z12 = false;
        while (true) {
            if (z11) {
                int i21 = i19 - 1;
                if (i21 >= i20 || z12) {
                    i20 = i20;
                    i19 = i21;
                } else {
                    int i22 = concurrentHashMap.transferIndex;
                    if (i22 <= 0) {
                        i19 = -1;
                    } else {
                        j$.sun.misc.a aVar = h;
                        int i23 = i20;
                        long j3 = j;
                        if (i22 > i18) {
                            i10 = i23;
                            i11 = i22 - i18;
                            i7 = i21;
                        } else {
                            i7 = i21;
                            i10 = i23;
                            i11 = 0;
                        }
                        boolean c12 = aVar.c(concurrentHashMap, j3, i22, i11);
                        i20 = i11;
                        if (c12) {
                            i19 = i22 - 1;
                        } else {
                            i20 = i10;
                            i19 = i7;
                        }
                    }
                }
                z11 = false;
            } else {
                int i24 = i20;
                q qVar2 = null;
                if (i19 < 0 || i19 >= length || (i14 = i19 + length) >= length2) {
                    i12 = length;
                    z9 = z10;
                    c10 = c11;
                    i13 = i18;
                    if (z12) {
                        concurrentHashMap.b = null;
                        concurrentHashMap.a = kVarArr3;
                        concurrentHashMap.sizeCtl = (i12 << 1) - (i12 >>> 1);
                        return;
                    }
                    int i25 = i19;
                    j$.sun.misc.a aVar2 = h;
                    long j10 = i;
                    int i26 = concurrentHashMap.sizeCtl;
                    if (!aVar2.c(concurrentHashMap, j10, i26, i26 - 1)) {
                        i19 = i25;
                    } else {
                        if (i26 - 2 != ((Integer.numberOfLeadingZeros(i12) | 32768) << 16)) {
                            return;
                        }
                        z11 = z9;
                        z12 = z11;
                        i19 = i12;
                    }
                } else {
                    ?? k10 = k(kVarArr, i19);
                    if (k10 == 0) {
                        z11 = b(kVarArr, i19, gVar);
                        i12 = length;
                        z9 = z10;
                        c10 = c11;
                        i13 = i18;
                    } else {
                        z9 = z10;
                        int i27 = k10.a;
                        if (i27 == -1) {
                            i12 = length;
                            c10 = c11;
                            i13 = i18;
                            z11 = z9;
                        } else {
                            synchronized (k10) {
                                try {
                                    if (k(kVarArr, i19) == k10) {
                                        if (i27 >= 0) {
                                            int i28 = i27 & length;
                                            q qVar3 = k10;
                                            for (q qVar4 = k10.d; qVar4 != null; qVar4 = qVar4.d) {
                                                char c13 = c11;
                                                int i29 = qVar4.a & length;
                                                if (i29 != i28) {
                                                    qVar3 = qVar4;
                                                    i28 = i29;
                                                }
                                                c11 = c13;
                                            }
                                            c10 = c11;
                                            if (i28 == 0) {
                                                qVar = null;
                                                qVar2 = qVar3;
                                            } else {
                                                qVar = qVar3;
                                            }
                                            k kVar = k10;
                                            while (kVar != qVar3) {
                                                int i30 = kVar.a;
                                                Object obj = kVar.b;
                                                int i31 = length;
                                                Object obj2 = kVar.c;
                                                if ((i30 & i31) == 0) {
                                                    i15 = i18;
                                                    qVar2 = new k(i30, obj, obj2, qVar2);
                                                } else {
                                                    i15 = i18;
                                                    qVar = new k(i30, obj, obj2, qVar);
                                                }
                                                kVar = kVar.d;
                                                length = i31;
                                                i18 = i15;
                                            }
                                            i12 = length;
                                            i13 = i18;
                                            h(kVarArr3, i19, qVar2);
                                            h(kVarArr3, i14, qVar);
                                            h(kVarArr, i19, gVar);
                                        } else {
                                            i12 = length;
                                            c10 = c11;
                                            i13 = i18;
                                            if (k10 instanceof p) {
                                                p pVar3 = (p) k10;
                                                q qVar5 = null;
                                                q qVar6 = null;
                                                k kVar2 = pVar3.f;
                                                int i32 = 0;
                                                int i33 = 0;
                                                q qVar7 = null;
                                                while (kVar2 != null) {
                                                    p pVar4 = pVar3;
                                                    int i34 = kVar2.a;
                                                    q qVar8 = new q(i34, kVar2.b, kVar2.c, null, null);
                                                    if ((i34 & i12) == 0) {
                                                        qVar8.h = qVar6;
                                                        if (qVar6 == null) {
                                                            qVar2 = qVar8;
                                                        } else {
                                                            qVar6.d = qVar8;
                                                        }
                                                        i32++;
                                                        qVar6 = qVar8;
                                                    } else {
                                                        qVar8.h = qVar5;
                                                        if (qVar5 == null) {
                                                            qVar7 = qVar8;
                                                        } else {
                                                            qVar5.d = qVar8;
                                                        }
                                                        i33++;
                                                        qVar5 = qVar8;
                                                    }
                                                    kVar2 = kVar2.d;
                                                    pVar3 = pVar4;
                                                }
                                                p pVar5 = pVar3;
                                                if (i32 <= 6) {
                                                    pVar = p(qVar2);
                                                } else {
                                                    pVar = i33 != 0 ? new p(qVar2) : pVar5;
                                                }
                                                if (i33 <= 6) {
                                                    pVar2 = p(qVar7);
                                                } else {
                                                    pVar2 = i32 != 0 ? new p(qVar7) : pVar5;
                                                }
                                                h(kVarArr3, i19, pVar);
                                                h(kVarArr3, i14, pVar2);
                                                h(kVarArr, i19, gVar);
                                            }
                                        }
                                        z11 = z9;
                                    } else {
                                        i12 = length;
                                        c10 = c11;
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
                z10 = z9;
                c11 = c10;
                length = i12;
                i18 = i13;
            }
        }
    }

    public final long j() {
        c[] cVarArr = this.c;
        long j3 = this.baseCount;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                if (cVar != null) {
                    j3 += cVar.value;
                }
            }
        }
        return j3;
    }

    public final void n(k[] kVarArr, int i7) {
        int length = kVarArr.length;
        if (length < 64) {
            o(length << 1);
            return;
        }
        k k10 = k(kVarArr, i7);
        if (k10 == null || k10.a < 0) {
            return;
        }
        synchronized (k10) {
            try {
                if (k(kVarArr, i7) == k10) {
                    q qVar = null;
                    q qVar2 = null;
                    k kVar = k10;
                    while (kVar != null) {
                        q qVar3 = new q(kVar.a, kVar.b, kVar.c, null, null);
                        qVar3.h = qVar2;
                        if (qVar2 == null) {
                            qVar = qVar3;
                        } else {
                            qVar2.d = qVar3;
                        }
                        kVar = kVar.d;
                        qVar2 = qVar3;
                    }
                    h(kVarArr, i7, new p(qVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [j$.util.concurrent.k] */
    public static k p(q qVar) {
        k kVar = null;
        k kVar2 = null;
        for (q qVar2 = qVar; qVar2 != null; qVar2 = qVar2.d) {
            k kVar3 = new k(qVar2.a, qVar2.b, qVar2.c);
            if (kVar2 == null) {
                kVar = kVar3;
            } else {
                kVar2.d = kVar3;
            }
            kVar2 = kVar3;
        }
        return kVar;
    }

    public static class KeySetView<K, V> extends b implements Set<K>, Serializable, j$.util.Set<K> {
        private static final long serialVersionUID = 7249069246763182397L;
        public final Object b;

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ Stream parallelStream() {
            return Collection.-CC.$default$parallelStream(this);
        }

        @Override // java.util.Collection
        public final /* synthetic */ java.util.stream.Stream parallelStream() {
            return Stream.Wrapper.convert(Collection.-CC.$default$parallelStream(this));
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ boolean removeIf(Predicate predicate) {
            return Collection.-CC.$default$removeIf(this, predicate);
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.Set
        public final /* synthetic */ Spliterator spliterator() {
            return Spliterator.Wrapper.convert(spliterator());
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ Stream stream() {
            return Collection.-CC.$default$stream(this);
        }

        @Override // java.util.Collection
        public final /* synthetic */ java.util.stream.Stream stream() {
            return Stream.Wrapper.convert(Collection.-CC.$default$stream(this));
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
            Object[] array;
            array = toArray((Object[]) intFunction.apply(0));
            return array;
        }

        public KeySetView(ConcurrentHashMap concurrentHashMap, Object obj) {
            super(concurrentHashMap);
            this.b = obj;
        }

        @Override // j$.util.concurrent.b, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return this.a.containsKey(obj);
        }

        @Override // j$.util.concurrent.b, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            return this.a.remove(obj) != null;
        }

        @Override // j$.util.concurrent.b, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            ConcurrentHashMap concurrentHashMap = this.a;
            k[] kVarArr = concurrentHashMap.a;
            int length = kVarArr == null ? 0 : kVarArr.length;
            return new h(kVarArr, length, length, concurrentHashMap, 0);
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Object obj2 = this.b;
            if (obj2 != null) {
                return this.a.f(obj, obj2, true) == null;
            }
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean addAll(java.util.Collection collection) {
            Object obj = this.b;
            if (obj == null) {
                throw new UnsupportedOperationException();
            }
            Iterator it = collection.iterator();
            boolean z9 = false;
            while (it.hasNext()) {
                if (this.a.f(it.next(), obj, true) == null) {
                    z9 = true;
                }
            }
            return z9;
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            Object it = iterator();
            int i7 = 0;
            while (((a) it).hasNext()) {
                i7 += ((h) it).next().hashCode();
            }
            return i7;
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            if (!(obj instanceof Set)) {
                return false;
            }
            Set set = (Set) obj;
            if (set != this) {
                return containsAll(set) && set.containsAll(this);
            }
            return true;
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.Collection
        public final j$.util.Spliterator spliterator() {
            ConcurrentHashMap concurrentHashMap = this.a;
            long j3 = concurrentHashMap.j();
            k[] kVarArr = concurrentHashMap.a;
            int length = kVarArr == null ? 0 : kVarArr.length;
            return new i(kVarArr, length, 0, length, j3 < 0 ? 0L : j3, 0);
        }

        @Override // java.lang.Iterable, j$.util.Collection
        public final void forEach(Consumer consumer) {
            consumer.getClass();
            k[] kVarArr = this.a.a;
            if (kVarArr == null) {
                return;
            }
            o oVar = new o(kVarArr, kVarArr.length, 0, kVarArr.length);
            while (true) {
                k a10 = oVar.a();
                if (a10 == null) {
                    return;
                } else {
                    consumer.accept(a10.b);
                }
            }
        }
    }
}
