package ie;

import ee.r;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
