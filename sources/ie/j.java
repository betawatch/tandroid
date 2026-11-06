package ie;

import ee.r;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class j extends r {
    public final /* synthetic */ AtomicReferenceArray e;

    public j(long j3, j jVar, int i7) {
        super(j3, jVar, i7);
        this.e = new AtomicReferenceArray(i.f);
    }

    @Override // ee.r
    public final int g() {
        return i.f;
    }

    @Override // ee.r
    public final void h(int i7, id.h hVar) {
        this.e.set(i7, i.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.c + ", hashCode=" + hashCode() + ']';
    }
}
