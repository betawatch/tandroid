package md;

import i7.a7;
import i7.c7;
import ja.u;
import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import jd.b0;
import jd.f1;
import kotlin.jvm.internal.q;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class n {
    public static final fc.a a = new fc.a("NONE", 2);
    public static final fc.a b = new fc.a("PENDING", 2);

    /* JADX WARN: Removed duplicated region for block: B:30:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable a(b bVar, c cVar, uc.c cVar2) {
        e eVar;
        int i10;
        q qVar;
        Throwable th2;
        f1 f1Var;
        CancellationException cancellationException;
        if (cVar2 instanceof e) {
            eVar = (e) cVar2;
            int i11 = eVar.c;
            if ((i11 & TLObject.FLAG_31) != 0) {
                eVar.c = i11 - TLObject.FLAG_31;
                Object obj = eVar.b;
                tc.a aVar = tc.a.a;
                i10 = eVar.c;
                if (i10 != 0) {
                    c7.b(obj);
                    q qVar2 = new q();
                    try {
                        c gVar = new g(cVar, qVar2);
                        eVar.a = qVar2;
                        eVar.c = 1;
                        if (bVar.e(gVar, eVar) == aVar) {
                            return aVar;
                        }
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                        qVar = qVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    qVar = eVar.a;
                    try {
                        c7.b(obj);
                        return null;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                th2 = (Throwable) qVar.a;
                if ((th2 == null && th2.equals(th)) || ((f1Var = (f1) eVar.getContext().get(b0.b)) != null && f1Var.isCancelled() && (cancellationException = f1Var.getCancellationException()) != null && cancellationException.equals(th))) {
                    throw th;
                }
                if (th2 != null) {
                    return th;
                }
                if (th instanceof CancellationException) {
                    a7.a(th2, th);
                    throw th2;
                }
                a7.a(th, th2);
                throw th;
            }
        }
        eVar = new e(cVar2);
        Object obj2 = eVar.b;
        tc.a aVar2 = tc.a.a;
        i10 = eVar.c;
        if (i10 != 0) {
        }
        th2 = (Throwable) qVar.a;
        if (th2 == null) {
        }
        if (th2 != null) {
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
    public static final Object b(b bVar, uc.c cVar) {
        j jVar;
        int i10;
        fc.a aVar;
        q qVar;
        nd.a e10;
        u uVar;
        Object obj;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i11 = jVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                jVar.d = i11 - TLObject.FLAG_31;
                Object obj2 = jVar.c;
                Object obj3 = tc.a.a;
                i10 = jVar.d;
                aVar = nd.e.a;
                if (i10 != 0) {
                    c7.b(obj2);
                    q qVar2 = new q();
                    qVar2.a = aVar;
                    u uVar2 = new u(qVar2, 1);
                    try {
                        jVar.a = qVar2;
                        jVar.b = uVar2;
                        jVar.d = 1;
                        if (bVar.e(uVar2, jVar) == obj3) {
                            return obj3;
                        }
                        qVar = qVar2;
                    } catch (nd.a e11) {
                        qVar = qVar2;
                        e10 = e11;
                        uVar = uVar2;
                        if (e10.a != uVar) {
                            throw e10;
                        }
                        obj = qVar.a;
                        if (obj == aVar) {
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uVar = jVar.b;
                    qVar = jVar.a;
                    try {
                        c7.b(obj2);
                    } catch (nd.a e12) {
                        e10 = e12;
                        if (e10.a != uVar) {
                        }
                        obj = qVar.a;
                        if (obj == aVar) {
                        }
                    }
                }
                obj = qVar.a;
                if (obj == aVar) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        jVar = new j(cVar);
        Object obj22 = jVar.c;
        Object obj32 = tc.a.a;
        i10 = jVar.d;
        aVar = nd.e.a;
        if (i10 != 0) {
        }
        obj = qVar.a;
        if (obj == aVar) {
        }
    }
}
