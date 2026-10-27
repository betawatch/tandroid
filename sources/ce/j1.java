package ce;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class j1 extends v1 {
    public final boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1() {
        super(true);
        boolean z10 = true;
        x(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v1.b;
        p pVar = (p) atomicReferenceFieldUpdater.get(this);
        q qVar = pVar instanceof q ? (q) pVar : null;
        if (qVar != null) {
            v1 i10 = qVar.i();
            while (!i10.r()) {
                p pVar2 = (p) atomicReferenceFieldUpdater.get(i10);
                q qVar2 = pVar2 instanceof q ? (q) pVar2 : null;
                if (qVar2 != null) {
                    i10 = qVar2.i();
                }
            }
            this.c = z10;
        }
        z10 = false;
        this.c = z10;
    }

    @Override // ce.v1
    public final boolean r() {
        return this.c;
    }

    @Override // ce.v1
    public final boolean s() {
        return true;
    }
}
