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
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
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

    static {
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField("segments", m[].class), new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        j$.sun.misc.a aVar = j$.sun.misc.a.b;
        h = aVar;
        i = aVar.a(ConcurrentHashMap.class, "sizeCtl");
        j = aVar.a(ConcurrentHashMap.class, "transferIndex");
        k = aVar.a(ConcurrentHashMap.class, "baseCount");
        l = aVar.a(ConcurrentHashMap.class, "cellsBusy");
        m = aVar.a(c.class, "value");
        n = aVar.a.arrayBaseOffset(k[].class);
        int arrayIndexScale = aVar.a.arrayIndexScale(k[].class);
        if (((arrayIndexScale - 1) & arrayIndexScale) != 0) {
            throw new ExceptionInInitializerError("array index scale not a power of two");
        }
        o = 31 - Integer.numberOfLeadingZeros(arrayIndexScale);
    }

    public ConcurrentHashMap(int i2, float f, int i3) {
        if (f <= 0.0f || i2 < 0 || i3 <= 0) {
            throw new IllegalArgumentException();
        }
        long j2 = (long) (((i2 < i3 ? i3 : i2) / f) + 1.0d);
        this.sizeCtl = j2 >= 1073741824 ? TLObject.FLAG_30 : l((int) j2);
    }

    public static final boolean b(k[] kVarArr, int i2, k kVar) {
        j$.sun.misc.a aVar = h;
        long j2 = (i2 << o) + n;
        Unsafe unsafe = aVar.a;
        while (true) {
            k[] kVarArr2 = kVarArr;
            k kVar2 = kVar;
            if (unsafe.compareAndSwapObject(kVarArr2, j2, (Object) null, kVar2)) {
                return true;
            }
            if (unsafe.getObject(kVarArr2, j2) != null) {
                return false;
            }
            kVarArr = kVarArr2;
            kVar = kVar2;
        }
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

    public static final void h(k[] kVarArr, int i2, k kVar) {
        h.a.putObjectVolatile(kVarArr, (i2 << o) + n, kVar);
    }

    public static final int i(int i2) {
        return (i2 ^ (i2 >>> 16)) & ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public static final k k(k[] kVarArr, int i2) {
        return (k) h.a.getObjectVolatile(kVarArr, (i2 << o) + n);
    }

    public static final int l(int i2) {
        int numberOfLeadingZeros = (-1) >>> Integer.numberOfLeadingZeros(i2 - 1);
        if (numberOfLeadingZeros < 0) {
            return 1;
        }
        return numberOfLeadingZeros >= 1073741824 ? TLObject.FLAG_30 : numberOfLeadingZeros + 1;
    }

    public static <K> KeySetView<K, Boolean> newKeySet() {
        return new KeySetView<>(new ConcurrentHashMap(), Boolean.TRUE);
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

    private void readObject(ObjectInputStream objectInputStream) {
        long j2;
        long j3;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j4 = 0;
        long j5 = 0;
        k kVar = null;
        while (true) {
            Object readObject = objectInputStream.readObject();
            Object readObject2 = objectInputStream.readObject();
            j2 = 1;
            if (readObject == null || readObject2 == null) {
                break;
            }
            j5++;
            kVar = new k(i(readObject.hashCode()), readObject, readObject2, kVar);
        }
        if (j5 == 0) {
            this.sizeCtl = 0;
            return;
        }
        long j6 = (long) ((j5 / 0.75f) + 1.0d);
        int l2 = j6 >= 1073741824 ? TLObject.FLAG_30 : l((int) j6);
        k[] kVarArr = new k[l2];
        int i2 = l2 - 1;
        while (kVar != null) {
            k kVar2 = kVar.d;
            int i3 = kVar.a;
            int i4 = i3 & i2;
            k k2 = k(kVarArr, i4);
            boolean z = true;
            if (k2 == null) {
                j3 = j2;
            } else {
                Object obj2 = kVar.b;
                if (k2.a < 0) {
                    if (((p) k2).e(i3, obj2, kVar.c) == null) {
                        j4 += j2;
                    }
                    j3 = j2;
                } else {
                    j3 = j2;
                    int i5 = 0;
                    for (k kVar3 = k2; kVar3 != null; kVar3 = kVar3.d) {
                        if (kVar3.a == i3 && ((obj = kVar3.b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z = false;
                            break;
                        }
                        i5++;
                    }
                    if (z && i5 >= 8) {
                        j4 += j3;
                        kVar.d = k2;
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
                        h(kVarArr, i4, new p(qVar));
                    }
                }
                z = false;
            }
            if (z) {
                j4 += j3;
                kVar.d = k2;
                h(kVarArr, i4, kVar);
            }
            kVar = kVar2;
            j2 = j3;
        }
        this.a = kVarArr;
        this.sizeCtl = l2 - (l2 >>> 2);
        this.baseCount = j4;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        int i2 = 0;
        int i3 = 1;
        while (i3 < 16) {
            i2++;
            i3 <<= 1;
        }
        int i4 = 32 - i2;
        int i5 = i3 - 1;
        m[] mVarArr = new m[16];
        for (int i6 = 0; i6 < 16; i6++) {
            mVarArr[i6] = new m();
        }
        ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
        putFields.put("segments", mVarArr);
        putFields.put("segmentShift", i4);
        putFields.put("segmentMask", i5);
        objectOutputStream.writeFields();
        k[] kVarArr = this.a;
        if (kVarArr != null) {
            o oVar = new o(kVarArr, kVarArr.length, 0, kVarArr.length);
            while (true) {
                k a = oVar.a();
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

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0143, code lost:
    
        if (r1.c != r6) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0145, code lost:
    
        r1.c = (j$.util.concurrent.c[]) java.util.Arrays.copyOf(r6, r7 << 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r0.a.compareAndSwapLong(r1, r2, r4, r6) == false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00c4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j2, int i2) {
        c cVar;
        boolean compareAndSwapLong;
        long j3;
        boolean z;
        int length;
        boolean z2;
        int length2;
        k[] kVarArr;
        int length3;
        k[] kVarArr2;
        ConcurrentHashMap<K, V> concurrentHashMap = this;
        c[] cVarArr = concurrentHashMap.c;
        if (cVarArr == null) {
            j$.sun.misc.a aVar = h;
            long j4 = k;
            long j5 = concurrentHashMap.baseCount;
            j3 = j5 + j2;
        } else {
            int length4 = cVarArr.length - 1;
            if (length4 >= 0 && (cVar = cVarArr[((ThreadLocalRandom) ThreadLocalRandom.f.get()).b & length4]) != null) {
                j$.sun.misc.a aVar2 = h;
                long j6 = m;
                long j7 = cVar.value;
                compareAndSwapLong = aVar2.a.compareAndSwapLong(cVar, j6, j7, j7 + j2);
                if (compareAndSwapLong) {
                    if (i2 <= 1) {
                        return;
                    }
                    j3 = concurrentHashMap.j();
                    if (i2 < 0) {
                        return;
                    }
                    while (true) {
                        int i3 = concurrentHashMap.sizeCtl;
                        if (j3 < i3 || (kVarArr = concurrentHashMap.a) == null || (length3 = kVarArr.length) >= 1073741824) {
                            return;
                        }
                        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(length3) | 32768;
                        if (i3 >= 0) {
                            if (h.a.compareAndSwapInt(concurrentHashMap, i, i3, (numberOfLeadingZeros << 16) + 2)) {
                                concurrentHashMap.m(kVarArr, null);
                            }
                        } else {
                            if ((i3 >>> 16) != numberOfLeadingZeros || i3 == numberOfLeadingZeros + 1 || i3 == numberOfLeadingZeros + 65535 || (kVarArr2 = concurrentHashMap.b) == null || concurrentHashMap.transferIndex <= 0) {
                                return;
                            }
                            if (h.a.compareAndSwapInt(concurrentHashMap, i, i3, i3 + 1)) {
                                concurrentHashMap.m(kVarArr, kVarArr2);
                            }
                        }
                        j3 = concurrentHashMap.j();
                    }
                }
            }
            compareAndSwapLong = true;
        }
        u uVar = ThreadLocalRandom.f;
        int i4 = ((ThreadLocalRandom) uVar.get()).b;
        if (i4 == 0) {
            ThreadLocalRandom.d();
            i4 = ((ThreadLocalRandom) uVar.get()).b;
            compareAndSwapLong = true;
        }
        boolean z3 = compareAndSwapLong;
        int i5 = i4;
        while (true) {
            boolean z4 = false;
            while (true) {
                c[] cVarArr2 = concurrentHashMap.c;
                if (cVarArr2 == null || (length = cVarArr2.length) <= 0) {
                    if (concurrentHashMap.cellsBusy == 0 && concurrentHashMap.c == cVarArr2) {
                        if (h.a.compareAndSwapInt(concurrentHashMap, l, 0, 1)) {
                            try {
                                if (concurrentHashMap.c == cVarArr2) {
                                    c[] cVarArr3 = new c[2];
                                    cVarArr3[i5 & 1] = new c(j2);
                                    concurrentHashMap.c = cVarArr3;
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    return;
                                }
                            } finally {
                            }
                        }
                    }
                    j$.sun.misc.a aVar3 = h;
                    long j8 = k;
                    long j9 = concurrentHashMap.baseCount;
                    if (aVar3.a.compareAndSwapLong(concurrentHashMap, j8, j9, j9 + j2)) {
                        return;
                    }
                } else {
                    c cVar2 = cVarArr2[(length - 1) & i5];
                    if (cVar2 != null) {
                        if (z3) {
                            j$.sun.misc.a aVar4 = h;
                            long j10 = m;
                            long j11 = cVar2.value;
                            if (aVar4.a.compareAndSwapLong(cVar2, j10, j11, j11 + j2)) {
                                return;
                            }
                            if (concurrentHashMap.c == cVarArr2 && length < g) {
                                if (!z4) {
                                    z4 = true;
                                } else if (concurrentHashMap.cellsBusy == 0) {
                                    if (aVar4.a.compareAndSwapInt(concurrentHashMap, l, 0, 1)) {
                                        try {
                                            break;
                                        } finally {
                                        }
                                    }
                                }
                            }
                        } else {
                            z3 = true;
                        }
                        int i6 = i5 ^ (i5 << 13);
                        int i7 = i6 ^ (i6 >>> 17);
                        i5 = i7 ^ (i7 << 5);
                        ((ThreadLocalRandom) ThreadLocalRandom.f.get()).b = i5;
                    } else if (concurrentHashMap.cellsBusy == 0) {
                        c cVar3 = new c(j2);
                        if (concurrentHashMap.cellsBusy == 0) {
                            if (h.a.compareAndSwapInt(concurrentHashMap, l, 0, 1)) {
                                try {
                                    c[] cVarArr4 = concurrentHashMap.c;
                                    if (cVarArr4 != null && (length2 = cVarArr4.length) > 0) {
                                        int i8 = (length2 - 1) & i5;
                                        if (cVarArr4[i8] == null) {
                                            cVarArr4[i8] = cVar3;
                                            z2 = true;
                                            if (!z2) {
                                                return;
                                            }
                                        }
                                    }
                                    z2 = false;
                                    if (!z2) {
                                    }
                                } finally {
                                }
                            }
                        }
                    }
                    z4 = false;
                    int i62 = i5 ^ (i5 << 13);
                    int i72 = i62 ^ (i62 >>> 17);
                    i5 = i72 ^ (i72 << 5);
                    ((ThreadLocalRandom) ThreadLocalRandom.f.get()).b = i5;
                }
                concurrentHashMap = this;
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        k k2;
        k[] kVarArr = this.a;
        long j2 = 0;
        loop0: while (true) {
            int i2 = 0;
            while (kVarArr != null && i2 < kVarArr.length) {
                k2 = k(kVarArr, i2);
                if (k2 == null) {
                    i2++;
                } else {
                    int i3 = k2.a;
                    if (i3 == -1) {
                        break;
                    }
                    synchronized (k2) {
                        if (k(kVarArr, i2) == k2) {
                            for (k kVar = i3 >= 0 ? k2 : k2 instanceof p ? ((p) k2).f : null; kVar != null; kVar = kVar.d) {
                                j2--;
                            }
                            h(kVarArr, i2, null);
                            i2++;
                        }
                    }
                }
            }
            kVarArr = d(kVarArr, k2);
        }
        if (j2 != 0) {
            a(j2, -1);
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
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
        int i2 = i(obj.hashCode());
        k[] kVarArr = this.a;
        int i3 = 0;
        Object obj3 = null;
        int i4 = 0;
        while (true) {
            if (kVarArr != null) {
                int length = kVarArr.length;
                if (length != 0) {
                    int i5 = (length - 1) & i2;
                    k k2 = k(kVarArr, i5);
                    if (k2 == null) {
                        l lVar = new l();
                        synchronized (lVar) {
                            if (b(kVarArr, i5, lVar)) {
                                try {
                                    obj3 = biFunction.apply(obj, null);
                                    if (obj3 != null) {
                                        kVar = new k(i2, obj, obj3);
                                        i4 = 1;
                                    } else {
                                        kVar = null;
                                    }
                                    h(kVarArr, i5, kVar);
                                    i3 = 1;
                                } catch (Throwable th) {
                                    h(kVarArr, i5, null);
                                    throw th;
                                }
                            }
                        }
                        if (i3 != 0) {
                            break;
                        }
                    } else {
                        int i6 = k2.a;
                        if (i6 == -1) {
                            kVarArr = d(kVarArr, k2);
                        } else {
                            synchronized (k2) {
                                if (k(kVarArr, i5) == k2) {
                                    if (i6 >= 0) {
                                        k kVar2 = null;
                                        k kVar3 = k2;
                                        i3 = 1;
                                        while (true) {
                                            if (kVar3.a != i2 || ((obj2 = kVar3.b) != obj && (obj2 == null || !obj.equals(obj2)))) {
                                                k kVar4 = kVar3.d;
                                                if (kVar4 == null) {
                                                    apply = biFunction.apply(obj, null);
                                                    if (apply != null) {
                                                        if (kVar3.d != null) {
                                                            throw new IllegalStateException("Recursive update");
                                                        }
                                                        kVar3.d = new k(i2, obj, apply);
                                                        i4 = 1;
                                                    }
                                                } else {
                                                    i3++;
                                                    kVar2 = kVar3;
                                                    kVar3 = kVar4;
                                                }
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
                                                h(kVarArr, i5, kVar5);
                                            }
                                            obj3 = apply2;
                                            i4 = -1;
                                        }
                                    } else if (k2 instanceof p) {
                                        p pVar = (p) k2;
                                        q qVar = pVar.e;
                                        q b = qVar != null ? qVar.b(i2, obj, null) : null;
                                        apply = biFunction.apply(obj, b == null ? null : b.c);
                                        if (apply != null) {
                                            if (b != null) {
                                                b.c = apply;
                                            } else {
                                                pVar.e(i2, obj, apply);
                                                i4 = 1;
                                            }
                                        } else if (b != null) {
                                            if (pVar.f(b)) {
                                                h(kVarArr, i5, p(pVar.f));
                                            }
                                            i4 = -1;
                                        }
                                        i3 = 1;
                                        obj3 = apply;
                                    } else if (k2 instanceof l) {
                                        throw new IllegalStateException("Recursive update");
                                    }
                                }
                            }
                            if (i3 != 0) {
                                if (i3 >= 8) {
                                    n(kVarArr, i5);
                                }
                            }
                        }
                    }
                }
            }
            kVarArr = e();
        }
        if (i4 != 0) {
            a(i4, i3);
        }
        return obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ea, code lost:
    
        if (r5 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ec, code lost:
    
        a(1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f1, code lost:
    
        return r5;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object computeIfAbsent(Object obj, Function function) {
        q b;
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
        k[] kVarArr = this.a;
        Object obj5 = null;
        int i3 = 0;
        while (true) {
            if (kVarArr != null) {
                int length = kVarArr.length;
                if (length != 0) {
                    int i4 = (length - 1) & i2;
                    k k2 = k(kVarArr, i4);
                    boolean z = true;
                    if (k2 == null) {
                        l lVar = new l();
                        synchronized (lVar) {
                            if (b(kVarArr, i4, lVar)) {
                                try {
                                    obj5 = function.apply(obj);
                                    h(kVarArr, i4, obj5 != null ? new k(i2, obj, obj5) : null);
                                    i3 = 1;
                                } catch (Throwable th) {
                                    h(kVarArr, i4, null);
                                    throw th;
                                }
                            }
                        }
                        if (i3 != 0) {
                            break;
                        }
                    } else {
                        int i5 = k2.a;
                        if (i5 == -1) {
                            kVarArr = d(kVarArr, k2);
                        } else {
                            if (i5 == i2 && (((obj3 = k2.b) == obj || (obj3 != null && obj.equals(obj3))) && (obj4 = k2.c) != null)) {
                                return obj4;
                            }
                            synchronized (k2) {
                                if (k(kVarArr, i4) == k2) {
                                    if (i5 >= 0) {
                                        k kVar = k2;
                                        i3 = 1;
                                        while (true) {
                                            if (kVar.a != i2 || ((obj2 = kVar.b) != obj && (obj2 == null || !obj.equals(obj2)))) {
                                                k kVar2 = kVar.d;
                                                if (kVar2 == null) {
                                                    Object apply = function.apply(obj);
                                                    if (apply == null) {
                                                        z = false;
                                                    } else {
                                                        if (kVar.d != null) {
                                                            throw new IllegalStateException("Recursive update");
                                                        }
                                                        kVar.d = new k(i2, obj, apply);
                                                    }
                                                    obj5 = apply;
                                                } else {
                                                    i3++;
                                                    kVar = kVar2;
                                                }
                                            }
                                        }
                                        obj5 = kVar.c;
                                    } else if (k2 instanceof p) {
                                        p pVar = (p) k2;
                                        q qVar = pVar.e;
                                        if (qVar == null || (b = qVar.b(i2, obj, null)) == null) {
                                            obj5 = function.apply(obj);
                                            if (obj5 != null) {
                                                pVar.e(i2, obj, obj5);
                                            } else {
                                                z = false;
                                            }
                                        } else {
                                            z = false;
                                            obj5 = b.c;
                                        }
                                        i3 = 2;
                                    } else if (k2 instanceof l) {
                                        throw new IllegalStateException("Recursive update");
                                    }
                                }
                                z = false;
                            }
                            if (i3 != 0) {
                                if (i3 >= 8) {
                                    n(kVarArr, i4);
                                }
                                if (!z) {
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

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0046, code lost:
    
        r5 = r15.apply(r14, r8.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004c, code lost:
    
        if (r5 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004e, code lost:
    
        r8.c = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0051, code lost:
    
        r3 = r8.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0053, code lost:
    
        if (r10 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0055, code lost:
    
        r10.d = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005b, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0058, code lost:
    
        h(r2, r6, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a0, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        q b;
        Object obj2;
        if (obj == null) {
            throw null;
        }
        if (biFunction == null) {
            throw null;
        }
        int i2 = i(obj.hashCode());
        k[] kVarArr = this.a;
        int i3 = 0;
        Object obj3 = null;
        int i4 = 0;
        while (true) {
            if (kVarArr != null) {
                int length = kVarArr.length;
                if (length != 0) {
                    int i5 = (length - 1) & i2;
                    k k2 = k(kVarArr, i5);
                    if (k2 == null) {
                        break;
                    }
                    int i6 = k2.a;
                    if (i6 == -1) {
                        kVarArr = d(kVarArr, k2);
                    } else {
                        synchronized (k2) {
                            if (k(kVarArr, i5) == k2) {
                                if (i6 >= 0) {
                                    i4 = 1;
                                    k kVar = null;
                                    k kVar2 = k2;
                                    while (true) {
                                        if (kVar2.a != i2 || ((obj2 = kVar2.b) != obj && (obj2 == null || !obj.equals(obj2)))) {
                                            k kVar3 = kVar2.d;
                                            if (kVar3 == null) {
                                                break;
                                            }
                                            i4++;
                                            kVar = kVar2;
                                            kVar2 = kVar3;
                                        }
                                    }
                                } else if (k2 instanceof p) {
                                    p pVar = (p) k2;
                                    q qVar = pVar.e;
                                    if (qVar != null && (b = qVar.b(i2, obj, null)) != null) {
                                        obj3 = biFunction.apply(obj, b.c);
                                        if (obj3 != null) {
                                            b.c = obj3;
                                        } else {
                                            if (pVar.f(b)) {
                                                h(kVarArr, i5, p(pVar.f));
                                            }
                                            i3 = -1;
                                        }
                                    }
                                    i4 = 2;
                                } else if (k2 instanceof l) {
                                    break;
                                }
                            }
                        }
                        if (i4 != 0) {
                            break;
                        }
                    }
                }
            }
            kVarArr = e();
        }
        if (i3 != 0) {
            a(i3, i4);
        }
        return obj3;
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
                k a = oVar.a();
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

    public final k[] d(k[] kVarArr, k kVar) {
        k[] kVarArr2;
        int i2;
        if (!(kVar instanceof g) || (kVarArr2 = ((g) kVar).e) == null) {
            return this.a;
        }
        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(kVarArr.length) | 32768;
        while (kVarArr2 == this.b && this.a == kVarArr && (i2 = this.sizeCtl) < 0 && (i2 >>> 16) == numberOfLeadingZeros && i2 != numberOfLeadingZeros + 1 && i2 != 65535 + numberOfLeadingZeros && this.transferIndex > 0) {
            ConcurrentHashMap<K, V> concurrentHashMap = this;
            if (h.a.compareAndSwapInt(concurrentHashMap, i, i2, i2 + 1)) {
                concurrentHashMap.m(kVarArr, kVarArr2);
                return kVarArr2;
            }
            this = concurrentHashMap;
        }
        return kVarArr2;
    }

    public final k[] e() {
        while (true) {
            k[] kVarArr = this.a;
            if (kVarArr != null && kVarArr.length != 0) {
                return kVarArr;
            }
            int i2 = this.sizeCtl;
            if (i2 < 0) {
                Thread.yield();
            } else {
                ConcurrentHashMap<K, V> concurrentHashMap = this;
                if (h.a.compareAndSwapInt(concurrentHashMap, i, i2, -1)) {
                    try {
                        k[] kVarArr2 = concurrentHashMap.a;
                        if (kVarArr2 == null || kVarArr2.length == 0) {
                            int i3 = i2 > 0 ? i2 : 16;
                            k[] kVarArr3 = new k[i3];
                            concurrentHashMap.a = kVarArr3;
                            i2 = i3 - (i3 >>> 2);
                            kVarArr2 = kVarArr3;
                        }
                        return kVarArr2;
                    } finally {
                        concurrentHashMap.sizeCtl = i2;
                    }
                }
                this = concurrentHashMap;
            }
        }
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
            k a = oVar.a();
            if (a == null) {
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    K key = entry.getKey();
                    if (key == null || (value = entry.getValue()) == null || (v = get(key)) == null || (value != v && !value.equals(v))) {
                        return false;
                    }
                }
                return true;
            }
            Object obj2 = a.c;
            Object obj3 = map.get(a.b);
            if (obj3 == null || (obj3 != obj2 && !obj3.equals(obj2))) {
                break;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0065, code lost:
    
        r7 = r6.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0067, code lost:
    
        if (r11 != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0069, code lost:
    
        r6.c = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ae, code lost:
    
        a(1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b3, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x009f, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Object obj, Object obj2, boolean z) {
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
        k[] kVarArr = this.a;
        int i3 = 0;
        while (true) {
            if (kVarArr != null) {
                int length = kVarArr.length;
                if (length != 0) {
                    int i4 = (length - 1) & i2;
                    k k2 = k(kVarArr, i4);
                    if (k2 != null) {
                        int i5 = k2.a;
                        if (i5 == -1) {
                            kVarArr = d(kVarArr, k2);
                        } else {
                            if (z && i5 == i2 && (((obj5 = k2.b) == obj || (obj5 != null && obj.equals(obj5))) && (obj6 = k2.c) != null)) {
                                return obj6;
                            }
                            synchronized (k2) {
                                if (k(kVarArr, i4) == k2) {
                                    if (i5 >= 0) {
                                        i3 = 1;
                                        k kVar = k2;
                                        while (true) {
                                            if (kVar.a != i2 || ((obj4 = kVar.b) != obj && (obj4 == null || !obj.equals(obj4)))) {
                                                k kVar2 = kVar.d;
                                                if (kVar2 == null) {
                                                    kVar.d = new k(i2, obj, obj2);
                                                    break;
                                                }
                                                i3++;
                                                kVar = kVar2;
                                            }
                                        }
                                    } else if (k2 instanceof p) {
                                        q e = ((p) k2).e(i2, obj, obj2);
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
                                    } else if (k2 instanceof l) {
                                        break;
                                    }
                                }
                                obj3 = null;
                            }
                            if (i3 != 0) {
                                if (i3 >= 8) {
                                    n(kVarArr, i4);
                                }
                                if (obj3 != null) {
                                    return obj3;
                                }
                            }
                        }
                    } else if (b(kVarArr, i4, new k(i2, obj, obj2))) {
                        break;
                    }
                }
            }
            kVarArr = e();
        }
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
            k a = oVar.a();
            if (a == null) {
                return;
            } else {
                biConsumer.accept(a.b, a.c);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        r9 = r5.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0041, code lost:
    
        if (r15 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0043, code lost:
    
        if (r15 == r9) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0045, code lost:
    
        if (r9 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004b, code lost:
    
        if (r15.equals(r9) == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x004d, code lost:
    
        if (r14 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x004f, code lost:
    
        r5.c = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0052, code lost:
    
        r5 = r5.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0054, code lost:
    
        if (r8 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0056, code lost:
    
        r8.d = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0059, code lost:
    
        h(r1, r3, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj, Object obj2, Object obj3) {
        int length;
        int i2;
        k k2;
        boolean z;
        Object obj4;
        q b;
        Object obj5;
        int i3 = i(obj.hashCode());
        k[] kVarArr = this.a;
        while (true) {
            if (kVarArr == null || (length = kVarArr.length) == 0 || (k2 = k(kVarArr, (i2 = (length - 1) & i3))) == null) {
                break;
            }
            int i4 = k2.a;
            if (i4 == -1) {
                kVarArr = d(kVarArr, k2);
            } else {
                synchronized (k2) {
                    if (k(kVarArr, i2) == k2) {
                        z = true;
                        if (i4 >= 0) {
                            k kVar = null;
                            k kVar2 = k2;
                            while (true) {
                                if (kVar2.a != i3 || ((obj5 = kVar2.b) != obj && (obj5 == null || !obj.equals(obj5)))) {
                                    k kVar3 = kVar2.d;
                                    if (kVar3 == null) {
                                        break;
                                    }
                                    kVar = kVar2;
                                    kVar2 = kVar3;
                                }
                            }
                            obj4 = null;
                        } else if (k2 instanceof p) {
                            p pVar = (p) k2;
                            q qVar = pVar.e;
                            if (qVar != null && (b = qVar.b(i3, obj, null)) != null) {
                                obj4 = b.c;
                                if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                    if (obj2 != null) {
                                        b.c = obj2;
                                    } else if (pVar.f(b)) {
                                        h(kVarArr, i2, p(pVar.f));
                                    }
                                }
                            }
                            obj4 = null;
                        } else if (k2 instanceof l) {
                            throw new IllegalStateException("Recursive update");
                        }
                    }
                    z = false;
                    obj4 = null;
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

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004c, code lost:
    
        return (V) r2.c;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public V get(Object obj) {
        int length;
        k k2;
        Object obj2;
        int i2 = i(obj.hashCode());
        k[] kVarArr = this.a;
        if (kVarArr == null || (length = kVarArr.length) <= 0 || (k2 = k(kVarArr, (length - 1) & i2)) == null) {
            return null;
        }
        int i3 = k2.a;
        if (i3 == i2) {
            Object obj3 = k2.b;
            if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                return (V) k2.c;
            }
        } else if (i3 < 0) {
            k a = k2.a(i2, obj);
            if (a != null) {
                return (V) a.c;
            }
            return null;
        }
        while (true) {
            k2 = k2.d;
            if (k2 == null) {
                return null;
            }
            if (k2.a != i2 || ((obj2 = k2.b) != obj && (obj2 == null || !obj.equals(obj2)))) {
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        V v = get(obj);
        return v == null ? obj2 : v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        k[] kVarArr = this.a;
        int i2 = 0;
        if (kVarArr != null) {
            o oVar = new o(kVarArr, kVarArr.length, 0, kVarArr.length);
            while (true) {
                k a = oVar.a();
                if (a == null) {
                    break;
                }
                i2 += a.b.hashCode() ^ a.c.hashCode();
            }
        }
        return i2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return j() <= 0;
    }

    public final long j() {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v14, types: [j$.util.concurrent.k] */
    /* JADX WARN: Type inference failed for: r5v4, types: [j$.util.concurrent.k] */
    /* JADX WARN: Type inference failed for: r7v14, types: [j$.util.concurrent.k] */
    /* JADX WARN: Type inference failed for: r7v16, types: [j$.util.concurrent.k] */
    public final void m(k[] kVarArr, k[] kVarArr2) {
        k[] kVarArr3;
        int i2;
        boolean z;
        char c;
        int i3;
        int i4;
        q qVar;
        int i5;
        ConcurrentHashMap<K, V> concurrentHashMap = this;
        int length = kVarArr.length;
        int i6 = g;
        boolean z2 = true;
        int i7 = i6 > 1 ? (length >>> 3) / i6 : length;
        char c2 = 16;
        int i8 = i7 < 16 ? 16 : i7;
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
        boolean z3 = true;
        int i9 = 0;
        int i10 = 0;
        boolean z4 = false;
        while (true) {
            if (z3) {
                int i11 = i9 - 1;
                if (i11 >= i10 || z4) {
                    i10 = i10;
                    i9 = i11;
                } else {
                    int i12 = concurrentHashMap.transferIndex;
                    if (i12 <= 0) {
                        i9 = -1;
                    } else {
                        j$.sun.misc.a aVar = h;
                        long j2 = j;
                        int i13 = i12 > i8 ? i12 - i8 : 0;
                        int i14 = i10;
                        if (aVar.a.compareAndSwapInt(concurrentHashMap, j2, i12, i13)) {
                            i9 = i12 - 1;
                            i10 = i13;
                        } else {
                            i10 = i14;
                            i9 = i11;
                        }
                    }
                }
                z3 = false;
            } else {
                int i15 = i10;
                q qVar2 = null;
                if (i9 < 0 || i9 >= length || (i4 = i9 + length) >= length2) {
                    i2 = length;
                    z = z2;
                    c = c2;
                    i3 = i8;
                    if (z4) {
                        concurrentHashMap.b = null;
                        concurrentHashMap.a = kVarArr3;
                        concurrentHashMap.sizeCtl = (i2 << 1) - (i2 >>> 1);
                        return;
                    }
                    j$.sun.misc.a aVar2 = h;
                    long j3 = i;
                    int i16 = concurrentHashMap.sizeCtl;
                    int i17 = i9;
                    if (!aVar2.a.compareAndSwapInt(concurrentHashMap, j3, i16, i16 - 1)) {
                        i9 = i17;
                    } else {
                        if (i16 - 2 != ((Integer.numberOfLeadingZeros(i2) | 32768) << 16)) {
                            return;
                        }
                        z3 = z;
                        z4 = z3;
                        i9 = i2;
                    }
                } else {
                    ?? k2 = k(kVarArr, i9);
                    if (k2 == 0) {
                        z3 = b(kVarArr, i9, gVar);
                        i2 = length;
                        z = z2;
                        c = c2;
                        i3 = i8;
                    } else {
                        z = z2;
                        int i18 = k2.a;
                        if (i18 == -1) {
                            i2 = length;
                            c = c2;
                            i3 = i8;
                            z3 = z;
                        } else {
                            synchronized (k2) {
                                if (k(kVarArr, i9) == k2) {
                                    if (i18 >= 0) {
                                        int i19 = i18 & length;
                                        q qVar3 = k2;
                                        q qVar4 = qVar3;
                                        while (true) {
                                            ?? r15 = qVar4.d;
                                            if (r15 == 0) {
                                                break;
                                            }
                                            char c3 = c2;
                                            int i20 = r15.a & length;
                                            if (i20 != i19) {
                                                i19 = i20;
                                                qVar3 = r15;
                                            }
                                            c2 = c3;
                                            qVar4 = r15;
                                        }
                                        c = c2;
                                        if (i19 == 0) {
                                            qVar = null;
                                            qVar2 = qVar3;
                                        } else {
                                            qVar = qVar3;
                                        }
                                        k kVar = k2;
                                        while (kVar != qVar3) {
                                            int i21 = kVar.a;
                                            Object obj = kVar.b;
                                            q qVar5 = qVar3;
                                            Object obj2 = kVar.c;
                                            if ((i21 & length) == 0) {
                                                i5 = length;
                                                qVar2 = new k(i21, obj, obj2, qVar2);
                                            } else {
                                                i5 = length;
                                                qVar = new k(i21, obj, obj2, qVar);
                                            }
                                            kVar = kVar.d;
                                            qVar3 = qVar5;
                                            length = i5;
                                        }
                                        i2 = length;
                                        h(kVarArr3, i9, qVar2);
                                        h(kVarArr3, i4, qVar);
                                        h(kVarArr, i9, gVar);
                                        i3 = i8;
                                    } else {
                                        i2 = length;
                                        c = c2;
                                        if (k2 instanceof p) {
                                            p pVar = (p) k2;
                                            q qVar6 = null;
                                            q qVar7 = null;
                                            k kVar2 = pVar.f;
                                            int i22 = 0;
                                            int i23 = 0;
                                            q qVar8 = null;
                                            while (kVar2 != null) {
                                                int i24 = i8;
                                                int i25 = kVar2.a;
                                                q qVar9 = new q(i25, kVar2.b, kVar2.c, null, null);
                                                if ((i25 & i2) == 0) {
                                                    qVar9.h = qVar7;
                                                    if (qVar7 == null) {
                                                        qVar2 = qVar9;
                                                    } else {
                                                        qVar7.d = qVar9;
                                                    }
                                                    i23++;
                                                    qVar7 = qVar9;
                                                } else {
                                                    qVar9.h = qVar6;
                                                    if (qVar6 == null) {
                                                        qVar8 = qVar9;
                                                    } else {
                                                        qVar6.d = qVar9;
                                                    }
                                                    i22++;
                                                    qVar6 = qVar9;
                                                }
                                                kVar2 = kVar2.d;
                                                i8 = i24;
                                            }
                                            i3 = i8;
                                            k p = i23 <= 6 ? p(qVar2) : i22 != 0 ? new p(qVar2) : pVar;
                                            k p2 = i22 <= 6 ? p(qVar8) : i23 != 0 ? new p(qVar8) : pVar;
                                            h(kVarArr3, i9, p);
                                            h(kVarArr3, i4, p2);
                                            h(kVarArr, i9, gVar);
                                        }
                                    }
                                    z3 = z;
                                } else {
                                    i2 = length;
                                    c = c2;
                                }
                                i3 = i8;
                            }
                        }
                    }
                }
                concurrentHashMap = this;
                i10 = i15;
                z2 = z;
                c2 = c;
                length = i2;
                i8 = i3;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d6, code lost:
    
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
        k[] kVarArr = this.a;
        int i4 = 0;
        Object obj5 = null;
        int i5 = 0;
        while (true) {
            if (kVarArr != null) {
                int length = kVarArr.length;
                if (length != 0) {
                    int i6 = (length - 1) & i3;
                    k k2 = k(kVarArr, i6);
                    i2 = 1;
                    if (k2 != null) {
                        int i7 = k2.a;
                        if (i7 == -1) {
                            kVarArr = d(kVarArr, k2);
                        } else {
                            synchronized (k2) {
                                if (k(kVarArr, i6) == k2) {
                                    if (i7 >= 0) {
                                        k kVar = null;
                                        k kVar2 = k2;
                                        i4 = 1;
                                        while (true) {
                                            if (kVar2.a != i3 || ((obj3 = kVar2.b) != obj && (obj3 == null || !obj.equals(obj3)))) {
                                                k kVar3 = kVar2.d;
                                                if (kVar3 == null) {
                                                    kVar2.d = new k(i3, obj, obj4);
                                                    obj5 = obj4;
                                                    i5 = 1;
                                                    break;
                                                }
                                                i4++;
                                                kVar = kVar2;
                                                kVar2 = kVar3;
                                            }
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
                                                h(kVarArr, i6, kVar4);
                                            }
                                            obj5 = apply;
                                            i5 = -1;
                                        }
                                    } else if (k2 instanceof p) {
                                        p pVar = (p) k2;
                                        q qVar = pVar.e;
                                        q b = qVar == null ? null : qVar.b(i3, obj, null);
                                        Object apply2 = b == null ? obj4 : biFunction.apply(b.c, obj4);
                                        if (apply2 != null) {
                                            if (b != null) {
                                                b.c = apply2;
                                            } else {
                                                pVar.e(i3, obj, apply2);
                                                i5 = 1;
                                            }
                                        } else if (b != null) {
                                            if (pVar.f(b)) {
                                                h(kVarArr, i6, p(pVar.f));
                                            }
                                            i5 = -1;
                                        }
                                        i4 = 2;
                                        obj5 = apply2;
                                    } else if (k2 instanceof l) {
                                        break;
                                    }
                                }
                            }
                            if (i4 != 0) {
                                if (i4 >= 8) {
                                    n(kVarArr, i6);
                                }
                                i2 = i5;
                                obj4 = obj5;
                            }
                        }
                    } else if (b(kVarArr, i6, new k(i3, obj, obj4))) {
                        break;
                    }
                }
            }
            kVarArr = e();
        }
        if (i2 != 0) {
            a(i2, i4);
        }
        return obj4;
    }

    public final void n(k[] kVarArr, int i2) {
        int length = kVarArr.length;
        if (length < 64) {
            o(length << 1);
            return;
        }
        k k2 = k(kVarArr, i2);
        if (k2 == null || k2.a < 0) {
            return;
        }
        synchronized (k2) {
            if (k(kVarArr, i2) == k2) {
                q qVar = null;
                k kVar = k2;
                q qVar2 = null;
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
                h(kVarArr, i2, new p(qVar));
            }
        }
    }

    public final void o(int i2) {
        ConcurrentHashMap<K, V> concurrentHashMap;
        int length;
        int l2 = i2 >= 536870912 ? 1073741824 : l(i2 + (i2 >>> 1) + 1);
        while (true) {
            int i3 = this.sizeCtl;
            if (i3 < 0) {
                return;
            }
            k[] kVarArr = this.a;
            if (kVarArr == null || (length = kVarArr.length) == 0) {
                concurrentHashMap = this;
                int i4 = i3 > l2 ? i3 : l2;
                if (h.a.compareAndSwapInt(concurrentHashMap, i, i3, -1)) {
                    try {
                        if (concurrentHashMap.a == kVarArr) {
                            concurrentHashMap.a = new k[i4];
                            i3 = i4 - (i4 >>> 2);
                        }
                    } finally {
                        concurrentHashMap.sizeCtl = i3;
                    }
                } else {
                    continue;
                }
            } else {
                if (l2 <= i3 || length >= 1073741824) {
                    return;
                }
                if (kVarArr == this.a) {
                    int numberOfLeadingZeros = Integer.numberOfLeadingZeros(length) | 32768;
                    j$.sun.misc.a aVar = h;
                    long j2 = i;
                    int i5 = (numberOfLeadingZeros << 16) + 2;
                    Unsafe unsafe = aVar.a;
                    concurrentHashMap = this;
                    if (unsafe.compareAndSwapInt(concurrentHashMap, j2, i3, i5)) {
                        concurrentHashMap.m(kVarArr, null);
                    }
                } else {
                    concurrentHashMap = this;
                }
            }
            this = concurrentHashMap;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v) {
        return (V) f(k2, v, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        o(map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            f(entry.getKey(), entry.getValue(), false);
        }
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
    public final void replaceAll(BiFunction biFunction) {
        biFunction.getClass();
        k[] kVarArr = this.a;
        if (kVarArr == null) {
            return;
        }
        o oVar = new o(kVarArr, kVarArr.length, 0, kVarArr.length);
        while (true) {
            k a = oVar.a();
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

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j2 = j();
        if (j2 < 0) {
            return 0;
        }
        return j2 > 2147483647L ? ConnectionsManager.DEFAULT_DATACENTER_ID : (int) j2;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        k[] kVarArr = this.a;
        int length = kVarArr == null ? 0 : kVarArr.length;
        o oVar = new o(kVarArr, length, 0, length);
        StringBuilder sb = new StringBuilder("{");
        k a = oVar.a();
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
                a = oVar.a();
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
    public Collection<V> values() {
        r rVar = this.e;
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r(this);
        this.e = rVar2;
        return rVar2;
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class KeySetView<K, V> extends b implements Set<K>, Serializable, j$.util.Set<K> {
        private static final long serialVersionUID = 7249069246763182397L;
        public final Object b;

        public KeySetView(ConcurrentHashMap concurrentHashMap, Object obj) {
            super(concurrentHashMap);
            this.b = obj;
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
        public final boolean addAll(Collection collection) {
            Object obj = this.b;
            if (obj == null) {
                throw new UnsupportedOperationException();
            }
            Iterator it = collection.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (this.a.f(it.next(), obj, true) == null) {
                    z = true;
                }
            }
            return z;
        }

        @Override // j$.util.concurrent.b, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return this.a.containsKey(obj);
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

        @Override // java.lang.Iterable, j$.util.Collection
        public final void forEach(Consumer consumer) {
            consumer.getClass();
            k[] kVarArr = this.a.a;
            if (kVarArr == null) {
                return;
            }
            o oVar = new o(kVarArr, kVarArr.length, 0, kVarArr.length);
            while (true) {
                k a = oVar.a();
                if (a == null) {
                    return;
                } else {
                    consumer.accept(a.b);
                }
            }
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            Object it = iterator();
            int i = 0;
            while (((a) it).hasNext()) {
                i += ((h) it).next().hashCode();
            }
            return i;
        }

        @Override // j$.util.concurrent.b, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            ConcurrentHashMap concurrentHashMap = this.a;
            k[] kVarArr = concurrentHashMap.a;
            int length = kVarArr == null ? 0 : kVarArr.length;
            return new h(kVarArr, length, length, concurrentHashMap, (byte) 0);
        }

        @Override // java.util.Collection
        public final /* synthetic */ Stream parallelStream() {
            return Stream.Wrapper.convert(Collection.-CC.$default$parallelStream(this));
        }

        @Override // j$.util.concurrent.b, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            return this.a.remove(obj) != null;
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ boolean removeIf(Predicate predicate) {
            return Collection.-CC.$default$removeIf(this, predicate);
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.Collection
        public final Spliterator spliterator() {
            ConcurrentHashMap concurrentHashMap = this.a;
            long j = concurrentHashMap.j();
            k[] kVarArr = concurrentHashMap.a;
            int length = kVarArr == null ? 0 : kVarArr.length;
            return new i(kVarArr, length, 0, length, j < 0 ? 0L : j, (byte) 0);
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

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ j$.util.stream.Stream parallelStream() {
            return Collection.-CC.$default$parallelStream(this);
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ j$.util.stream.Stream stream() {
            return Collection.-CC.$default$stream(this);
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.Set
        public final /* synthetic */ java.util.Spliterator spliterator() {
            return Spliterator.Wrapper.convert(spliterator());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        return (V) g(obj, null, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        if (obj == null) {
            throw null;
        }
        if (obj2 != null) {
            return g(obj, obj2, null);
        }
        throw null;
    }

    public ConcurrentHashMap(int i2) {
        this(i2, 0.75f, 1);
    }

    public ConcurrentHashMap() {
    }
}
