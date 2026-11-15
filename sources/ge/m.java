package ge;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.telegram.messenger.ns;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 - c.get(this) == 0) {
                return null;
            }
            int i10 = i7 & ns.L1;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i7, i7 + 1) && (iVar = (i) this.a.getAndSet(i10, null)) != null) {
                if (iVar.b) {
                    e.decrementAndGet(this);
                }
                return iVar;
            }
        }
    }

    public final i b(int i7, boolean z10) {
        int i10 = i7 & ns.L1;
        AtomicReferenceArray atomicReferenceArray = this.a;
        i iVar = (i) atomicReferenceArray.get(i10);
        if (iVar != null && iVar.b == z10) {
            while (!atomicReferenceArray.compareAndSet(i10, iVar, null)) {
                if (atomicReferenceArray.get(i10) != iVar) {
                }
            }
            if (z10) {
                e.decrementAndGet(this);
            }
            return iVar;
        }
        return null;
    }
}
