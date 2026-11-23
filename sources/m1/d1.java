package m1;

import hi.w4;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class d1 implements m0 {
    public final ie.d a = new ie.d();
    public final w4 b = new w4(12);
    public final ob.c c = new ob.c(new c1(2, null));

    public d1(String str) {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // m1.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rd.p pVar, kd.c cVar) {
        b1 b1Var;
        int i7;
        ie.d dVar;
        Throwable th2;
        boolean z10;
        if (cVar instanceof b1) {
            b1Var = (b1) cVar;
            int i10 = b1Var.e;
            if ((i10 & TLObject.FLAG_31) != 0) {
                b1Var.e = i10 - TLObject.FLAG_31;
                Object obj = b1Var.c;
                Object obj2 = jd.a.a;
                i7 = b1Var.e;
                if (i7 != 0) {
                    b7.h.b(obj);
                    ie.d dVar2 = this.a;
                    boolean e10 = dVar2.e();
                    try {
                        Object valueOf = Boolean.valueOf(e10);
                        b1Var.a = dVar2;
                        b1Var.b = e10;
                        b1Var.e = 1;
                        Object invoke = pVar.invoke(valueOf, b1Var);
                        if (invoke == obj2) {
                            return obj2;
                        }
                        dVar = dVar2;
                        obj = invoke;
                        z10 = e10;
                    } catch (Throwable th3) {
                        dVar = dVar2;
                        th2 = th3;
                        z10 = e10;
                        if (z10) {
                            dVar.f(null);
                        }
                        throw th2;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z10 = b1Var.b;
                    dVar = b1Var.a;
                    try {
                        b7.h.b(obj);
                    } catch (Throwable th4) {
                        th2 = th4;
                        if (z10) {
                        }
                        throw th2;
                    }
                }
                if (z10) {
                    dVar.f(null);
                }
                return obj;
            }
        }
        b1Var = new b1(this, cVar);
        Object obj3 = b1Var.c;
        Object obj22 = jd.a.a;
        i7 = b1Var.e;
        if (i7 != 0) {
        }
        if (z10) {
        }
        return obj3;
    }

    @Override // m1.m0
    public final Object b(kd.c cVar) {
        return new Integer(((AtomicInteger) this.b.b).get());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0054, code lost:
    
        if (r9.d(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // m1.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(rd.l lVar, kd.c cVar) {
        a1 a1Var;
        jd.a aVar;
        int i7;
        ie.d dVar;
        Throwable th2;
        ie.a aVar2;
        Object invoke;
        try {
            if (cVar instanceof a1) {
                a1Var = (a1) cVar;
                int i10 = a1Var.e;
                if ((i10 & TLObject.FLAG_31) != 0) {
                    a1Var.e = i10 - TLObject.FLAG_31;
                    Object obj = a1Var.c;
                    aVar = jd.a.a;
                    i7 = a1Var.e;
                    if (i7 != 0) {
                        b7.h.b(obj);
                        a1Var.a = lVar;
                        dVar = this.a;
                        a1Var.b = dVar;
                        a1Var.e = 1;
                    } else {
                        if (i7 != 1) {
                            if (i7 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar2 = (ie.a) a1Var.a;
                            try {
                                b7.h.b(obj);
                                ((ie.d) aVar2).f(null);
                                return obj;
                            } catch (Throwable th3) {
                                th2 = th3;
                                ((ie.d) aVar2).f(null);
                                throw th2;
                            }
                        }
                        ie.d dVar2 = a1Var.b;
                        rd.l lVar2 = (rd.l) a1Var.a;
                        b7.h.b(obj);
                        dVar = dVar2;
                        lVar = lVar2;
                    }
                    a1Var.a = dVar;
                    a1Var.b = null;
                    a1Var.e = 2;
                    invoke = lVar.invoke(a1Var);
                    if (invoke != aVar) {
                        ie.d dVar3 = dVar;
                        obj = invoke;
                        aVar2 = dVar3;
                        ((ie.d) aVar2).f(null);
                        return obj;
                    }
                    return aVar;
                }
            }
            a1Var.a = dVar;
            a1Var.b = null;
            a1Var.e = 2;
            invoke = lVar.invoke(a1Var);
            if (invoke != aVar) {
            }
            return aVar;
        } catch (Throwable th4) {
            ie.d dVar4 = dVar;
            th2 = th4;
            aVar2 = dVar4;
            ((ie.d) aVar2).f(null);
            throw th2;
        }
        a1Var = new a1(this, cVar);
        Object obj2 = a1Var.c;
        aVar = jd.a.a;
        i7 = a1Var.e;
        if (i7 != 0) {
        }
    }

    @Override // m1.m0
    public final ce.c d() {
        return this.c;
    }

    @Override // m1.m0
    public final Object e(a0 a0Var) {
        return new Integer(((AtomicInteger) this.b.b).incrementAndGet());
    }
}
