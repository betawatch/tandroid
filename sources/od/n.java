package od;

import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import k7.n7;
import k7.p7;
import kotlin.jvm.internal.q;
import la.t;
import ld.b0;
import ld.f1;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class n {
    public static final o3.c a;
    public static final o3.c b;

    static {
        int i10 = 14;
        a = new o3.c("NONE", i10);
        b = new o3.c("PENDING", i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable a(b bVar, c cVar, wc.c cVar2) {
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
                vc.a aVar = vc.a.a;
                i10 = eVar.c;
                if (i10 != 0) {
                    p7.b(obj);
                    q qVar2 = new q();
                    try {
                        c gVar = new g(cVar, qVar2);
                        eVar.a = qVar2;
                        eVar.c = 1;
                        if (bVar.z(gVar, eVar) == aVar) {
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
                        p7.b(obj);
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
                    n7.a(th2, th);
                    throw th2;
                }
                n7.a(th, th2);
                throw th;
            }
        }
        eVar = new e(cVar2);
        Object obj2 = eVar.b;
        vc.a aVar2 = vc.a.a;
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
    public static final Object b(b bVar, wc.c cVar) {
        j jVar;
        int i10;
        o3.c cVar2;
        q qVar;
        pd.a e;
        t tVar;
        Object obj;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i11 = jVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                jVar.d = i11 - TLObject.FLAG_31;
                Object obj2 = jVar.c;
                Object obj3 = vc.a.a;
                i10 = jVar.d;
                cVar2 = pd.e.a;
                if (i10 != 0) {
                    p7.b(obj2);
                    q qVar2 = new q();
                    qVar2.a = cVar2;
                    t tVar2 = new t(qVar2, 1);
                    try {
                        jVar.a = qVar2;
                        jVar.b = tVar2;
                        jVar.d = 1;
                        if (bVar.z(tVar2, jVar) == obj3) {
                            return obj3;
                        }
                        qVar = qVar2;
                    } catch (pd.a e6) {
                        qVar = qVar2;
                        e = e6;
                        tVar = tVar2;
                        if (e.a != tVar) {
                        }
                        obj = qVar.a;
                        if (obj == cVar2) {
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tVar = jVar.b;
                    qVar = jVar.a;
                    try {
                        p7.b(obj2);
                    } catch (pd.a e10) {
                        e = e10;
                        if (e.a != tVar) {
                            throw e;
                        }
                        obj = qVar.a;
                        if (obj == cVar2) {
                        }
                    }
                }
                obj = qVar.a;
                if (obj == cVar2) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        jVar = new j(cVar);
        Object obj22 = jVar.c;
        Object obj32 = vc.a.a;
        i10 = jVar.d;
        cVar2 = pd.e.a;
        if (i10 != 0) {
        }
        obj = qVar.a;
        if (obj == cVar2) {
        }
    }
}
