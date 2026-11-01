package ce;

import java.util.concurrent.atomic.AtomicReferenceArray;
import yd.t;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
