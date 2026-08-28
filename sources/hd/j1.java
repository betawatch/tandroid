package hd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
            v1 i9 = qVar.i();
            while (!i9.r()) {
                p pVar2 = (p) atomicReferenceFieldUpdater.get(i9);
                q qVar2 = pVar2 instanceof q ? (q) pVar2 : null;
                if (qVar2 != null) {
                    i9 = qVar2.i();
                }
            }
            this.c = z10;
        }
        z10 = false;
        this.c = z10;
    }

    @Override // hd.v1
    public final boolean r() {
        return this.c;
    }

    @Override // hd.v1
    public final boolean s() {
        return true;
    }
}
