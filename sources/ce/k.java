package ce;

import java.util.concurrent.atomic.AtomicReferenceArray;
import yd.t;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class k extends t {
    public final /* synthetic */ AtomicReferenceArray e;

    public k(long j10, k kVar, int i10) {
        super(j10, kVar, i10);
        this.e = new AtomicReferenceArray(j.f);
    }

    @Override // yd.t
    public final int g() {
        return j.f;
    }

    @Override // yd.t
    public final void h(int i10, cd.h hVar) {
        this.e.set(i10, j.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.c + ", hashCode=" + hashCode() + ']';
    }
}
