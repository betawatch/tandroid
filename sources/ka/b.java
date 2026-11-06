package ka;

import gd.k;
import hd.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kd.j;
import m1.e1;
import q1.e;
import rd.l;
import rd.p;
import zd.b0;
import zd.w1;
import zd.z;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class b extends j implements p {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, id.c cVar, int i7) {
        super(2, cVar);
        this.a = i7;
        this.c = obj;
    }

    @Override // kd.a
    public final id.c create(Object obj, id.c cVar) {
        switch (this.a) {
            case 0:
                b bVar = new b((l) this.c, cVar, 0);
                bVar.b = obj;
                return bVar;
            case 1:
                b bVar2 = new b((e1) this.c, cVar, 1);
                bVar2.b = obj;
                return bVar2;
            case 2:
                b bVar3 = new b((Set) this.c, cVar, 2);
                bVar3.b = obj;
                return bVar3;
            default:
                b bVar4 = new b((androidx.activity.d) this.c, cVar, 3);
                bVar4.b = obj;
                return bVar4;
        }
    }

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                b bVar = (b) create((q1.b) obj, (id.c) obj2);
                k kVar = k.a;
                bVar.invokeSuspend(kVar);
                return kVar;
            case 1:
                return ((b) create((e1) obj, (id.c) obj2)).invokeSuspend(k.a);
            case 2:
                return ((b) create((q1.b) obj, (id.c) obj2)).invokeSuspend(k.a);
            default:
                b bVar2 = (b) create((z) obj, (id.c) obj2);
                k kVar2 = k.a;
                bVar2.invokeSuspend(kVar2);
                return kVar2;
        }
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        int i7;
        int i10 = this.a;
        k kVar = k.a;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                jd.a aVar = jd.a.a;
                af.b.c(obj);
                ((l) obj2).invoke((q1.b) this.b);
                return kVar;
            case 1:
                jd.a aVar2 = jd.a.a;
                af.b.c(obj);
                e1 e1Var = (e1) this.b;
                return Boolean.valueOf((e1Var instanceof m1.c) && e1Var.a <= ((e1) obj2).a);
            case 2:
                jd.a aVar3 = jd.a.a;
                af.b.c(obj);
                Set keySet = ((q1.b) this.b).a().keySet();
                ArrayList arrayList = new ArrayList(h.d(keySet, 10));
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((e) it.next()).a);
                }
                Set set = (Set) obj2;
                if (set != p1.j.a) {
                    if (set == null || !set.isEmpty()) {
                        Iterator it2 = set.iterator();
                        while (it2.hasNext()) {
                            if (!arrayList.contains((String) it2.next())) {
                            }
                        }
                    }
                    r2 = false;
                }
                return Boolean.valueOf(r2);
            default:
                jd.a aVar4 = jd.a.a;
                af.b.c(obj);
                id.h c10 = ((z) this.b).c();
                androidx.activity.d dVar = (androidx.activity.d) obj2;
                try {
                    w1 w1Var = new w1();
                    w1Var.f = b0.n(b0.k(c10), true, w1Var);
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = w1.h;
                    try {
                        do {
                            i7 = atomicIntegerFieldUpdater.get(w1Var);
                            if (i7 != 0) {
                                if (i7 != 2 && i7 != 3) {
                                    w1.l(i7);
                                    throw null;
                                }
                            }
                            dVar.invoke();
                            return kVar;
                        } while (!atomicIntegerFieldUpdater.compareAndSet(w1Var, i7, 0));
                        dVar.invoke();
                        return kVar;
                    } finally {
                        w1Var.k();
                    }
                } catch (InterruptedException e10) {
                    throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e10);
                }
        }
    }
}
