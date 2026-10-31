package ae;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class n {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(n.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(n.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(n.class, "blockingTasksInBuffer$volatile");
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final i a() {
        i iVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 - c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & zs.L1;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 + 1) && (iVar = (i) this.a.getAndSet(i11, null)) != null) {
                if (iVar.b.a == 1) {
                    e.decrementAndGet(this);
                }
                return iVar;
            }
        }
    }

    public final i b(int i10, boolean z10) {
        int i11 = i10 & zs.L1;
        AtomicReferenceArray atomicReferenceArray = this.a;
        i iVar = (i) atomicReferenceArray.get(i11);
        if (iVar != null) {
            if ((iVar.b.a == 1) == z10) {
                while (!atomicReferenceArray.compareAndSet(i11, iVar, null)) {
                    if (atomicReferenceArray.get(i11) != iVar) {
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
