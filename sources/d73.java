// default package

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class d73 extends ccb implements eq4 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d73(Object obj, fw2 fw2Var, byte b) {
        super(2, fw2Var);
        this.a = b;
        this.c = obj;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                d73 d73Var = new d73((fwa) obj2, fw2Var, (byte) 0);
                d73Var.b = obj;
                return d73Var;
            case 1:
                d73 d73Var2 = new d73((np2) obj2, fw2Var, (byte) 1);
                d73Var2.b = obj;
                return d73Var2;
            case 2:
                d73 d73Var3 = new d73((qp4) obj2, fw2Var, (byte) 2);
                d73Var3.b = obj;
                return d73Var3;
            default:
                d73 d73Var4 = new d73((Set) obj2, fw2Var, (byte) 3);
                d73Var4.b = obj;
                return d73Var4;
        }
    }

    @Override // eq4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g5c g5cVar = g5c.a;
        switch (b) {
            case 0:
                return ((d73) create((fwa) obj, (fw2) obj2)).invokeSuspend(g5cVar);
            case 1:
                ((d73) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5cVar);
                return g5cVar;
            case 2:
                ((d73) create((ih7) obj, (fw2) obj2)).invokeSuspend(g5cVar);
                return g5cVar;
            default:
                return ((d73) create((ih7) obj, (fw2) obj2)).invokeSuspend(g5cVar);
        }
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        Unsafe unsafe;
        long j;
        int intVolatile;
        byte b = this.a;
        g5c g5cVar = g5c.a;
        boolean z = false;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                qse.b(obj);
                fwa fwaVar = (fwa) this.b;
                if ((fwaVar instanceof s53) && fwaVar.a <= ((fwa) obj2).a) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                qse.b(obj);
                sw2 c = ((ax2) this.b).c();
                np2 np2Var = (np2) obj2;
                try {
                    gnb gnbVar = new gnb();
                    gnbVar.f = nle.c(nle.b(c), true, gnbVar);
                    try {
                        do {
                            unsafe = ex.a;
                            j = gnb.h;
                            intVolatile = unsafe.getIntVolatile(gnbVar, j);
                            if (intVolatile != 0) {
                                if (intVolatile != 2 && intVolatile != 3) {
                                    gnb.n(intVolatile);
                                    throw null;
                                }
                            }
                            np2Var.invoke();
                            return g5cVar;
                        } while (!unsafe.compareAndSwapInt(gnbVar, j, intVolatile, 0));
                        np2Var.invoke();
                        return g5cVar;
                    } finally {
                        gnbVar.m();
                    }
                } catch (InterruptedException e) {
                    throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
                }
            case 2:
                qse.b(obj);
                ((qp4) obj2).invoke((ih7) this.b);
                return g5cVar;
            default:
                qse.b(obj);
                Set keySet = ((ih7) this.b).a().keySet();
                ArrayList arrayList = new ArrayList(al2.c(keySet, 10));
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((lg8) it.next()).a);
                }
                Set set = (Set) obj2;
                if (set != xfa.a) {
                    if (!set.isEmpty()) {
                        Iterator it2 = set.iterator();
                        while (it2.hasNext()) {
                            if (!arrayList.contains((String) it2.next())) {
                            }
                        }
                    }
                    return Boolean.valueOf(z);
                }
                z = true;
                return Boolean.valueOf(z);
        }
    }
}
