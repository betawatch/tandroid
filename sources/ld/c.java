package ld;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class c extends k1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;
    public final m e;
    public o0 f;
    public final /* synthetic */ e h;

    public c(e eVar, m mVar) {
        this.h = eVar;
        this.e = mVar;
    }

    @Override // ld.d1
    public final void a(Throwable th2) {
        m mVar = this.e;
        if (th2 != null) {
            mVar.getClass();
            o3.c F = mVar.F(null, new v(th2, false));
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
            h0[] h0VarArr = eVar.a;
            ArrayList arrayList = new ArrayList(h0VarArr.length);
            for (h0 h0Var : h0VarArr) {
                arrayList.add(h0Var.getCompleted());
            }
            mVar.resumeWith(arrayList);
        }
    }
}
