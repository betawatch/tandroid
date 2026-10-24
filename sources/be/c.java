package be;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class c extends l1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;
    public final m e;
    public p0 f;
    public final /* synthetic */ e h;

    public c(e eVar, m mVar) {
        this.h = eVar;
        this.e = mVar;
    }

    @Override // be.e1
    public final void a(Throwable th2) {
        m mVar = this.e;
        if (th2 != null) {
            mVar.getClass();
            com.google.android.gms.internal.clearcut.e F = mVar.F(null, new v(th2, false));
            if (F != null) {
                mVar.f(F);
                d dVar = (d) n.get(this);
                if (dVar != null) {
                    dVar.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e.b;
        e eVar = this.h;
        if (atomicIntegerFieldUpdater.decrementAndGet(eVar) == 0) {
            i0[] i0VarArr = eVar.a;
            ArrayList arrayList = new ArrayList(i0VarArr.length);
            for (i0 i0Var : i0VarArr) {
                arrayList.add(i0Var.getCompleted());
            }
            mVar.resumeWith(arrayList);
        }
    }
}
