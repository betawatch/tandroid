package ld;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class p1 extends qd.b {
    public final k1 b;
    public v1 c;
    public final /* synthetic */ u1 d;
    public final /* synthetic */ a1 e;

    public p1(k1 k1Var, u1 u1Var, a1 a1Var) {
        this.d = u1Var;
        this.e = a1Var;
        this.b = k1Var;
    }

    @Override // qd.b
    public final void b(Object obj, Object obj2) {
        qd.k kVar = (qd.k) obj;
        boolean z4 = obj2 == null;
        qd.k kVar2 = this.b;
        qd.k kVar3 = z4 ? kVar2 : this.c;
        if (kVar3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = qd.k.a;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, kVar3)) {
                if (atomicReferenceFieldUpdater.get(kVar) != this) {
                    return;
                }
            }
            if (z4) {
                qd.k kVar4 = this.c;
                kotlin.jvm.internal.j.b(kVar4);
                kVar2.e(kVar4);
            }
        }
    }

    @Override // qd.b
    public final com.google.android.gms.internal.clearcut.e c(Object obj) {
        if (this.d.u() == this.e) {
            return null;
        }
        return qd.a.e;
    }
}
