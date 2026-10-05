package ie;

import ee.t;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class k extends t {
    public final /* synthetic */ AtomicReferenceArray e;

    public k(long j3, k kVar, int i10) {
        super(j3, kVar, i10);
        this.e = new AtomicReferenceArray(j.f);
    }

    @Override // ee.t
    public final int g() {
        return j.f;
    }

    @Override // ee.t
    public final void h(int i10, id.h hVar) {
        this.e.set(i10, j.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.c + ", hashCode=" + hashCode() + ']';
    }
}
