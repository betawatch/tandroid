// default package

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
