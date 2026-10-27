package le;

import he.t;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class j extends t {
    public final /* synthetic */ AtomicReferenceArray e;

    public j(long j10, j jVar, int i10) {
        super(j10, jVar, i10);
        this.e = new AtomicReferenceArray(i.f);
    }

    @Override // he.t
    public final int g() {
        return i.f;
    }

    @Override // he.t
    public final void h(int i10, ld.h hVar) {
        this.e.set(i10, i.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.c + ", hashCode=" + hashCode() + ']';
    }
}
