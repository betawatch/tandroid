// default package

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class k4a {
    public static final /* synthetic */ AtomicLongFieldUpdater b;
    public static final /* synthetic */ AtomicLongFieldUpdater c;
    public static final /* synthetic */ AtomicIntegerFieldUpdater d;
    public static final /* synthetic */ long e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final ua1 a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Unsafe unsafe = fx.a;
        f = unsafe.objectFieldOffset(k4a.class.getDeclaredField("head$volatile"));
        b = AtomicLongFieldUpdater.newUpdater(k4a.class, "deqIdx$volatile");
        g = unsafe.objectFieldOffset(k4a.class.getDeclaredField("tail$volatile"));
        c = AtomicLongFieldUpdater.newUpdater(k4a.class, "enqIdx$volatile");
        d = AtomicIntegerFieldUpdater.newUpdater(k4a.class, "_availablePermits$volatile");
        e = unsafe.objectFieldOffset(k4a.class.getDeclaredField("_availablePermits$volatile"));
    }

    public k4a() {
        m4a m4aVar = new m4a(0L, null, 2);
        this.head$volatile = m4aVar;
        this.tail$volatile = m4aVar;
        this._availablePermits$volatile = 1;
        this.a = new ua1((Object) this, (byte) 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0093, code lost:
    
        if (r5.f() == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0095, code lost:
    
        r5.e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(vj7 vj7Var) {
        Object b2;
        f9c f9cVar;
        long j;
        i4a i4aVar;
        long j2;
        long j3;
        va1 va1Var = vj7Var.a;
        wj7 wj7Var = vj7Var.b;
        while (true) {
            int andDecrement = d.getAndDecrement(this);
            if (andDecrement <= 1) {
                byte b3 = 0;
                f9c f9cVar2 = f9c.a;
                if (andDecrement > 0) {
                    wj7.h.set(wj7Var, null);
                    va1Var.B(f9cVar2, va1Var.c, new ua1(new a2(wj7Var, vj7Var), b3));
                    return;
                }
                Unsafe unsafe = fx.a;
                long j4 = g;
                m4a m4aVar = (m4a) unsafe.getObjectVolatile(this, j4);
                long andIncrement = c.getAndIncrement(this);
                i4a i4aVar2 = i4a.a;
                long j5 = andIncrement / l4a.f;
                while (true) {
                    b2 = td3.b(m4aVar, j5, i4aVar2);
                    if (mye.b(b2)) {
                        f9cVar = f9cVar2;
                        break;
                    }
                    hz9 a = mye.a(b2);
                    while (true) {
                        hz9 hz9Var = (hz9) fx.a.getObjectVolatile(this, j4);
                        f9cVar = f9cVar2;
                        j = j4;
                        if (hz9Var.d >= a.d) {
                            break;
                        }
                        if (!a.j()) {
                            break;
                        }
                        i4aVar = i4aVar2;
                        while (true) {
                            Unsafe unsafe2 = fx.a;
                            j2 = j5;
                            if (!unsafe2.compareAndSwapObject(this, g, hz9Var, a)) {
                                j3 = j;
                                if (unsafe2.getObjectVolatile(this, j3) != hz9Var) {
                                    break;
                                }
                                j = j3;
                                j5 = j2;
                            } else if (hz9Var.f()) {
                                hz9Var.e();
                            }
                        }
                        j4 = j3;
                        i4aVar2 = i4aVar;
                        j5 = j2;
                        f9cVar2 = f9cVar;
                    }
                    f9cVar2 = f9cVar;
                    j4 = j;
                }
                m4a m4aVar2 = (m4a) mye.a(b2);
                AtomicReferenceArray atomicReferenceArray = m4aVar2.g;
                int i = (int) (andIncrement % l4a.f);
                while (!atomicReferenceArray.compareAndSet(i, null, vj7Var)) {
                    if (atomicReferenceArray.get(i) != null) {
                        ow5 ow5Var = l4a.b;
                        ow5 ow5Var2 = l4a.c;
                        while (!atomicReferenceArray.compareAndSet(i, ow5Var, ow5Var2)) {
                            f9c f9cVar3 = f9cVar;
                            if (atomicReferenceArray.get(i) == ow5Var) {
                                f9cVar = f9cVar3;
                            }
                        }
                        wj7.h.set(wj7Var, null);
                        va1Var.B(f9cVar, va1Var.c, new ua1((Object) new a2(wj7Var, vj7Var), (byte) 0));
                        return;
                    }
                }
                vj7Var.a(m4aVar2, i);
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0073, code lost:
    
        if (r5.f() == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        r5.e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        Object b2;
        boolean z;
        boolean z2;
        long j;
        long j2;
        k4a k4aVar = this;
        do {
            int andIncrement = d.getAndIncrement(k4aVar);
            boolean z3 = true;
            if (andIncrement >= 1) {
                while (true) {
                    Unsafe unsafe = fx.a;
                    long j3 = e;
                    int intVolatile = unsafe.getIntVolatile(k4aVar, j3);
                    if (intVolatile <= 1 || unsafe.compareAndSwapInt(k4aVar, j3, intVolatile, 1)) {
                        break;
                    } else {
                        k4aVar = this;
                    }
                }
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            Unsafe unsafe2 = fx.a;
            long j4 = f;
            m4a m4aVar = (m4a) unsafe2.getObjectVolatile(k4aVar, j4);
            long andIncrement2 = b.getAndIncrement(k4aVar);
            long j5 = andIncrement2 / l4a.f;
            j4a j4aVar = j4a.a;
            while (true) {
                b2 = td3.b(m4aVar, j5, j4aVar);
                if (mye.b(b2)) {
                    z = z3;
                    break;
                }
                hz9 a = mye.a(b2);
                while (true) {
                    hz9 hz9Var = (hz9) fx.a.getObjectVolatile(k4aVar, j4);
                    z = z3;
                    j = j4;
                    if (hz9Var.d >= a.d) {
                        break;
                    }
                    if (!a.j()) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe3 = fx.a;
                        if (!unsafe3.compareAndSwapObject(k4aVar, f, hz9Var, a)) {
                            j2 = j;
                            if (unsafe3.getObjectVolatile(k4aVar, j2) != hz9Var) {
                                break;
                            } else {
                                j = j2;
                            }
                        } else if (hz9Var.f()) {
                            hz9Var.e();
                        }
                    }
                    j4 = j2;
                    z3 = z;
                }
                z3 = z;
                j4 = j;
            }
            m4a m4aVar2 = (m4a) mye.a(b2);
            AtomicReferenceArray atomicReferenceArray = m4aVar2.g;
            m4aVar2.b();
            boolean z4 = false;
            if (m4aVar2.d <= j5) {
                int i = (int) (andIncrement2 % l4a.f);
                Object andSet = atomicReferenceArray.getAndSet(i, l4a.b);
                if (andSet == null) {
                    int i2 = l4a.a;
                    for (int i3 = 0; i3 < i2; i3++) {
                        if (atomicReferenceArray.get(i) != l4a.c) {
                        }
                    }
                    ow5 ow5Var = l4a.b;
                    ow5 ow5Var2 = l4a.d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i, ow5Var, ow5Var2)) {
                            if (atomicReferenceArray.get(i) != ow5Var) {
                                break;
                            }
                        } else {
                            z4 = z;
                            break;
                        }
                    }
                    z2 = !z4;
                } else if (andSet != l4a.e) {
                    if (!(andSet instanceof ta1)) {
                        lq5.i(andSet, "unexpected: ");
                        return;
                    }
                    ta1 ta1Var = (ta1) andSet;
                    ow5 b3 = ta1Var.b(f9c.a, k4aVar.a);
                    if (b3 != null) {
                        ta1Var.e(b3);
                    }
                }
                z2 = z;
                break;
            }
            z2 = false;
        } while (!z2);
    }
}
