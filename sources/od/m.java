package od;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer$volatile");
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final i a() {
        i iVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i9 = atomicIntegerFieldUpdater.get(this);
            if (i9 - c.get(this) == 0) {
                return null;
            }
            int i10 = i9 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i9, i9 + 1) && (iVar = (i) this.a.getAndSet(i10, null)) != null) {
                if (iVar.b.a == 1) {
                    e.decrementAndGet(this);
                }
                return iVar;
            }
        }
    }

    public final i b(int i9, boolean z10) {
        int i10 = i9 & 127;
        AtomicReferenceArray atomicReferenceArray = this.a;
        i iVar = (i) atomicReferenceArray.get(i10);
        if (iVar != null) {
            if ((iVar.b.a == 1) == z10) {
                while (!atomicReferenceArray.compareAndSet(i10, iVar, null)) {
                    if (atomicReferenceArray.get(i10) != iVar) {
                    }
                }
                if (z10) {
                    e.decrementAndGet(this);
                }
                return iVar;
            }
        }
        return null;
    }
}
