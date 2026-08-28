package kd;

import g7.w5;
import g7.y5;
import ha.u;
import hd.b0;
import hd.g1;
import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.p;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class n {
    public static final e5.c a = new e5.c("NONE", 2);
    public static final e5.c b = new e5.c("PENDING", 2);

    /* JADX WARN: Removed duplicated region for block: B:30:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable a(b bVar, c cVar, sc.c cVar2) {
        e eVar;
        int i9;
        p pVar;
        Throwable th;
        g1 g1Var;
        CancellationException cancellationException;
        if (cVar2 instanceof e) {
            eVar = (e) cVar2;
            int i10 = eVar.c;
            if ((i10 & TLObject.FLAG_31) != 0) {
                eVar.c = i10 - TLObject.FLAG_31;
                Object obj = eVar.b;
                rc.a aVar = rc.a.a;
                i9 = eVar.c;
                if (i9 != 0) {
                    y5.b(obj);
                    p pVar2 = new p();
                    try {
                        c gVar = new g(cVar, pVar2);
                        eVar.a = pVar2;
                        eVar.c = 1;
                        if (bVar.q(gVar, eVar) == aVar) {
                            return aVar;
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        pVar = pVar2;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = eVar.a;
                    try {
                        y5.b(obj);
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                th = (Throwable) pVar.a;
                if ((th == null && th.equals(th)) || ((g1Var = (g1) eVar.getContext().get(b0.b)) != null && g1Var.isCancelled() && (cancellationException = g1Var.getCancellationException()) != null && cancellationException.equals(th))) {
                    throw th;
                }
                if (th != null) {
                    return th;
                }
                if (th instanceof CancellationException) {
                    w5.a(th, th);
                    throw th;
                }
                w5.a(th, th);
                throw th;
            }
        }
        eVar = new e(cVar2);
        Object obj2 = eVar.b;
        rc.a aVar2 = rc.a.a;
        i9 = eVar.c;
        if (i9 != 0) {
        }
        th = (Throwable) pVar.a;
        if (th == null) {
        }
        if (th != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(b bVar, sc.c cVar) {
        j jVar;
        int i9;
        e5.c cVar2;
        p pVar;
        ld.a e10;
        u uVar;
        Object obj;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i10 = jVar.d;
            if ((i10 & TLObject.FLAG_31) != 0) {
                jVar.d = i10 - TLObject.FLAG_31;
                Object obj2 = jVar.c;
                Object obj3 = rc.a.a;
                i9 = jVar.d;
                cVar2 = ld.e.a;
                if (i9 != 0) {
                    y5.b(obj2);
                    p pVar2 = new p();
                    pVar2.a = cVar2;
                    u uVar2 = new u(pVar2, 1);
                    try {
                        jVar.a = pVar2;
                        jVar.b = uVar2;
                        jVar.d = 1;
                        if (bVar.q(uVar2, jVar) == obj3) {
                            return obj3;
                        }
                        pVar = pVar2;
                    } catch (ld.a e11) {
                        pVar = pVar2;
                        e10 = e11;
                        uVar = uVar2;
                        if (e10.a != uVar) {
                        }
                        obj = pVar.a;
                        if (obj == cVar2) {
                        }
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uVar = jVar.b;
                    pVar = jVar.a;
                    try {
                        y5.b(obj2);
                    } catch (ld.a e12) {
                        e10 = e12;
                        if (e10.a != uVar) {
                            throw e10;
                        }
                        obj = pVar.a;
                        if (obj == cVar2) {
                        }
                    }
                }
                obj = pVar.a;
                if (obj == cVar2) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        jVar = new j(cVar);
        Object obj22 = jVar.c;
        Object obj32 = rc.a.a;
        i9 = jVar.d;
        cVar2 = ld.e.a;
        if (i9 != 0) {
        }
        obj = pVar.a;
        if (obj == cVar2) {
        }
    }
}
