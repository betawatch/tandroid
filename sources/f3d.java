// default package

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class f3d {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b;
    public static final /* synthetic */ AtomicIntegerFieldUpdater c;
    public static final /* synthetic */ long d;
    public static final /* synthetic */ long e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    static {
        Unsafe unsafe = fx.a;
        f = unsafe.objectFieldOffset(f3d.class.getDeclaredField("lastScheduledTask$volatile"));
        b = AtomicIntegerFieldUpdater.newUpdater(f3d.class, "producerIndex$volatile");
        g = unsafe.objectFieldOffset(f3d.class.getDeclaredField("producerIndex$volatile"));
        e = unsafe.objectFieldOffset(f3d.class.getDeclaredField("consumerIndex$volatile"));
        c = AtomicIntegerFieldUpdater.newUpdater(f3d.class, "blockingTasksInBuffer$volatile");
        d = unsafe.objectFieldOffset(f3d.class.getDeclaredField("blockingTasksInBuffer$volatile"));
    }

    public final int a() {
        return fx.a.getIntVolatile(this, g) - fx.a.getIntVolatile(this, e);
    }

    public final vjb b() {
        vjb vjbVar;
        while (true) {
            Unsafe unsafe = fx.a;
            long j = e;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile - unsafe.getIntVolatile(this, g) == 0) {
                return null;
            }
            int i = intVolatile & jn7.K1;
            f3d f3dVar = this;
            if (unsafe.compareAndSwapInt(f3dVar, j, intVolatile, intVolatile + 1) && (vjbVar = (vjb) f3dVar.a.getAndSet(i, null)) != null) {
                if (vjbVar.b) {
                    c.decrementAndGet(f3dVar);
                }
                return vjbVar;
            }
            this = f3dVar;
        }
    }

    public final vjb c(int i, boolean z) {
        int i2 = i & jn7.K1;
        AtomicReferenceArray atomicReferenceArray = this.a;
        vjb vjbVar = (vjb) atomicReferenceArray.get(i2);
        if (vjbVar != null && vjbVar.b == z) {
            while (!atomicReferenceArray.compareAndSet(i2, vjbVar, null)) {
                if (atomicReferenceArray.get(i2) != vjbVar) {
                }
            }
            if (z) {
                c.decrementAndGet(this);
            }
            return vjbVar;
        }
        return null;
    }
}
