package ja;

import b8.ib;
import dd.k;
import ed.i;
import fd.h;
import hd.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import l1.f1;
import od.l;
import od.p;
import p1.e;
import wd.b0;
import wd.w1;
import wd.z;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b extends j implements p {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, fd.c cVar, int i3) {
        super(2, cVar);
        this.a = i3;
        this.c = obj;
    }

    @Override // hd.a
    public final fd.c create(Object obj, fd.c cVar) {
        switch (this.a) {
            case 0:
                b bVar = new b((l) this.c, cVar, 0);
                bVar.b = obj;
                return bVar;
            case 1:
                b bVar2 = new b((f1) this.c, cVar, 1);
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

    @Override // od.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                b bVar = (b) create((p1.b) obj, (fd.c) obj2);
                k kVar = k.a;
                bVar.invokeSuspend(kVar);
                return kVar;
            case 1:
                return ((b) create((f1) obj, (fd.c) obj2)).invokeSuspend(k.a);
            case 2:
                return ((b) create((p1.b) obj, (fd.c) obj2)).invokeSuspend(k.a);
            default:
                b bVar2 = (b) create((z) obj, (fd.c) obj2);
                k kVar2 = k.a;
                bVar2.invokeSuspend(kVar2);
                return kVar2;
        }
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        int i3;
        int i10 = this.a;
        k kVar = k.a;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                gd.a aVar = gd.a.a;
                ib.b(obj);
                ((l) obj2).invoke((p1.b) this.b);
                return kVar;
            case 1:
                gd.a aVar2 = gd.a.a;
                ib.b(obj);
                f1 f1Var = (f1) this.b;
                return Boolean.valueOf((f1Var instanceof l1.c) && f1Var.a <= ((f1) obj2).a);
            case 2:
                gd.a aVar3 = gd.a.a;
                ib.b(obj);
                Set keySet = ((p1.b) this.b).a().keySet();
                ArrayList arrayList = new ArrayList(i.d(keySet, 10));
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((e) it.next()).a);
                }
                Set set = (Set) obj2;
                if (set != o1.j.a) {
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
                gd.a aVar4 = gd.a.a;
                ib.b(obj);
                h c2 = ((z) this.b).c();
                androidx.activity.d dVar = (androidx.activity.d) obj2;
                try {
                    w1 w1Var = new w1();
                    w1Var.f = b0.n(b0.k(c2), true, w1Var);
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = w1.h;
                    try {
                        do {
                            i3 = atomicIntegerFieldUpdater.get(w1Var);
                            if (i3 != 0) {
                                if (i3 != 2 && i3 != 3) {
                                    w1.l(i3);
                                    throw null;
                                }
                            }
                            dVar.invoke();
                            return kVar;
                        } while (!atomicIntegerFieldUpdater.compareAndSet(w1Var, i3, 0));
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
