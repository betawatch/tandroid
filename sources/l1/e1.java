package l1;

import b8.ib;
import gi.w5;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e1 implements m0 {
    public final fe.d a = new fe.d();
    public final w5 b = new w5(8);
    public final z6.c c = new z6.c((od.p) new d1(2, null));

    public e1(String str) {
    }

    @Override // l1.m0
    public final Object a(a0 a0Var) {
        return new Integer(((AtomicInteger) this.b.b).incrementAndGet());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0054, code lost:
    
        if (r9.d(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // l1.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(od.l lVar, hd.c cVar) {
        b1 b1Var;
        gd.a aVar;
        int i3;
        fe.d dVar;
        Throwable th2;
        fe.a aVar2;
        Object invoke;
        try {
            if (cVar instanceof b1) {
                b1Var = (b1) cVar;
                int i10 = b1Var.e;
                if ((i10 & TLObject.FLAG_31) != 0) {
                    b1Var.e = i10 - TLObject.FLAG_31;
                    Object obj = b1Var.c;
                    aVar = gd.a.a;
                    i3 = b1Var.e;
                    if (i3 != 0) {
                        ib.b(obj);
                        b1Var.a = lVar;
                        dVar = this.a;
                        b1Var.b = dVar;
                        b1Var.e = 1;
                    } else {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar2 = (fe.a) b1Var.a;
                            try {
                                ib.b(obj);
                                ((fe.d) aVar2).f(null);
                                return obj;
                            } catch (Throwable th3) {
                                th2 = th3;
                                ((fe.d) aVar2).f(null);
                                throw th2;
                            }
                        }
                        fe.d dVar2 = b1Var.b;
                        od.l lVar2 = (od.l) b1Var.a;
                        ib.b(obj);
                        dVar = dVar2;
                        lVar = lVar2;
                    }
                    b1Var.a = dVar;
                    b1Var.b = null;
                    b1Var.e = 2;
                    invoke = lVar.invoke(b1Var);
                    if (invoke != aVar) {
                        fe.d dVar3 = dVar;
                        obj = invoke;
                        aVar2 = dVar3;
                        ((fe.d) aVar2).f(null);
                        return obj;
                    }
                    return aVar;
                }
            }
            b1Var.a = dVar;
            b1Var.b = null;
            b1Var.e = 2;
            invoke = lVar.invoke(b1Var);
            if (invoke != aVar) {
            }
            return aVar;
        } catch (Throwable th4) {
            fe.d dVar4 = dVar;
            th2 = th4;
            aVar2 = dVar4;
            ((fe.d) aVar2).f(null);
            throw th2;
        }
        b1Var = new b1(this, cVar);
        Object obj2 = b1Var.c;
        aVar = gd.a.a;
        i3 = b1Var.e;
        if (i3 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // l1.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(od.p pVar, hd.c cVar) {
        c1 c1Var;
        int i3;
        fe.d dVar;
        Throwable th2;
        boolean z10;
        if (cVar instanceof c1) {
            c1Var = (c1) cVar;
            int i10 = c1Var.e;
            if ((i10 & TLObject.FLAG_31) != 0) {
                c1Var.e = i10 - TLObject.FLAG_31;
                Object obj = c1Var.c;
                Object obj2 = gd.a.a;
                i3 = c1Var.e;
                if (i3 != 0) {
                    ib.b(obj);
                    fe.d dVar2 = this.a;
                    boolean e10 = dVar2.e();
                    try {
                        Object valueOf = Boolean.valueOf(e10);
                        c1Var.a = dVar2;
                        c1Var.b = e10;
                        c1Var.e = 1;
                        Object invoke = pVar.invoke(valueOf, c1Var);
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
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z10 = c1Var.b;
                    dVar = c1Var.a;
                    try {
                        ib.b(obj);
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
        c1Var = new c1(this, cVar);
        Object obj3 = c1Var.c;
        Object obj22 = gd.a.a;
        i3 = c1Var.e;
        if (i3 != 0) {
        }
        if (z10) {
        }
        return obj3;
    }

    @Override // l1.m0
    public final Object d(hd.c cVar) {
        return new Integer(((AtomicInteger) this.b.b).get());
    }

    @Override // l1.m0
    public final zd.b e() {
        return this.c;
    }
}
