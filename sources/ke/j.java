package ke;

import ge.t;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class j extends t {
    public final /* synthetic */ AtomicReferenceArray e;

    public j(long j10, j jVar, int i10) {
        super(j10, jVar, i10);
        this.e = new AtomicReferenceArray(i.f);
    }

    @Override // ge.t
    public final int g() {
        return i.f;
    }

    @Override // ge.t
    public final void h(int i10, kd.h hVar) {
        this.e.set(i10, i.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.c + ", hashCode=" + hashCode() + ']';
    }
}
