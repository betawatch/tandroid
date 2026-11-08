package ee;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import zd.q1;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class r extends b implements q1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(r.class, "cleanedAndPointers$volatile");
    public final long c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public r(long j3, r rVar, int i7) {
        super(rVar);
        this.c = j3;
        this.cleanedAndPointers$volatile = i7 << 16;
    }

    @Override // ee.b
    public final boolean d() {
        return d.get(this) == g() && c() != null;
    }

    public final boolean f() {
        return d.addAndGet(this, -65536) == g() && c() != null;
    }

    public abstract int g();

    public abstract void h(int i7, id.h hVar);

    public final void i() {
        if (d.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        do {
            atomicIntegerFieldUpdater = d;
            i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 == g() && c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 65536 + i7));
        return true;
    }
}
