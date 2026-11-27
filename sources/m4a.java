// default package

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class m4a extends hz9 {
    public final /* synthetic */ AtomicReferenceArray g;

    public m4a(long j, m4a m4aVar, int i) {
        super(j, m4aVar, i);
        this.g = new AtomicReferenceArray(l4a.f);
    }

    @Override // hz9
    public final int g() {
        return l4a.f;
    }

    @Override // hz9
    public final void h(int i, mx2 mx2Var) {
        this.g.set(i, l4a.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.d + ", hashCode=" + hashCode() + ']';
    }
}
