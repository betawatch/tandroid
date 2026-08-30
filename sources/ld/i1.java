package ld;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class i1 extends u1 {
    public final boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1() {
        super(true);
        boolean z4 = true;
        x(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u1.b;
        p pVar = (p) atomicReferenceFieldUpdater.get(this);
        q qVar = pVar instanceof q ? (q) pVar : null;
        if (qVar != null) {
            u1 i10 = qVar.i();
            while (!i10.r()) {
                p pVar2 = (p) atomicReferenceFieldUpdater.get(i10);
                q qVar2 = pVar2 instanceof q ? (q) pVar2 : null;
                if (qVar2 != null) {
                    i10 = qVar2.i();
                }
            }
            this.c = z4;
        }
        z4 = false;
        this.c = z4;
    }

    @Override // ld.u1
    public final boolean r() {
        return this.c;
    }

    @Override // ld.u1
    public final boolean s() {
        return true;
    }
}
