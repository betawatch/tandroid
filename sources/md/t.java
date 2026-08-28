package md;

import hd.y1;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class t extends d implements y1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(t.class, "cleanedAndPointers$volatile");
    public final long c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public t(long j10, t tVar, int i9) {
        super(tVar);
        this.c = j10;
        this.cleanedAndPointers$volatile = i9 << 16;
    }

    @Override // md.d
    public final boolean d() {
        return d.get(this) == g() && c() != null;
    }

    public final boolean f() {
        return d.addAndGet(this, -65536) == g() && c() != null;
    }

    public abstract int g();

    public abstract void h(int i9, qc.h hVar);

    public final void i() {
        if (d.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i9;
        do {
            atomicIntegerFieldUpdater = d;
            i9 = atomicIntegerFieldUpdater.get(this);
            if (i9 == g() && c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i9, 65536 + i9));
        return true;
    }
}
