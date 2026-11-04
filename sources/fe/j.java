package fe;

import be.r;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j extends r {
    public final /* synthetic */ AtomicReferenceArray e;

    public j(long j10, j jVar, int i3) {
        super(j10, jVar, i3);
        this.e = new AtomicReferenceArray(i.f);
    }

    @Override // be.r
    public final int g() {
        return i.f;
    }

    @Override // be.r
    public final void h(int i3, fd.h hVar) {
        this.e.set(i3, i.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.c + ", hashCode=" + hashCode() + ']';
    }
}
