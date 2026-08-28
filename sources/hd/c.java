package hd;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    @Override // hd.e1
    public final void a(Throwable th) {
        m mVar = this.e;
        if (th != null) {
            mVar.getClass();
            e5.c F = mVar.F(null, new v(th, false));
            if (F != null) {
                mVar.e(F);
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
