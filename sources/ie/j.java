package ie;

import ee.r;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
