package ld;

import h7.i6;
import h7.k6;
import ia.v;
import id.b0;
import id.g1;
import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.q;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class n {
    public static final ec.a a = new ec.a("NONE", 3);
    public static final ec.a b = new ec.a("PENDING", 3);

    /* JADX WARN: Removed duplicated region for block: B:30:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable a(b bVar, c cVar, tc.c cVar2) {
        e eVar;
        int i10;
        q qVar;
        Throwable th;
        g1 g1Var;
        CancellationException cancellationException;
        if (cVar2 instanceof e) {
            eVar = (e) cVar2;
            int i11 = eVar.c;
            if ((i11 & TLObject.FLAG_31) != 0) {
                eVar.c = i11 - TLObject.FLAG_31;
                Object obj = eVar.b;
                sc.a aVar = sc.a.a;
                i10 = eVar.c;
                if (i10 != 0) {
                    k6.b(obj);
                    q qVar2 = new q();
                    try {
                        c gVar = new g(cVar, qVar2);
                        eVar.a = qVar2;
                        eVar.c = 1;
                        if (bVar.q(gVar, eVar) == aVar) {
                            return aVar;
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        qVar = qVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    qVar = eVar.a;
                    try {
                        k6.b(obj);
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                th = (Throwable) qVar.a;
                if ((th == null && th.equals(th)) || ((g1Var = (g1) eVar.getContext().get(b0.b)) != null && g1Var.isCancelled() && (cancellationException = g1Var.getCancellationException()) != null && cancellationException.equals(th))) {
                    throw th;
                }
                if (th != null) {
                    return th;
                }
                if (th instanceof CancellationException) {
                    i6.a(th, th);
                    throw th;
                }
                i6.a(th, th);
                throw th;
            }
        }
        eVar = new e(cVar2);
        Object obj2 = eVar.b;
        sc.a aVar2 = sc.a.a;
        i10 = eVar.c;
        if (i10 != 0) {
        }
        th = (Throwable) qVar.a;
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
    public static final Object b(b bVar, tc.c cVar) {
        j jVar;
        int i10;
        ec.a aVar;
        q qVar;
        md.a e9;
        v vVar;
        Object obj;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i11 = jVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                jVar.d = i11 - TLObject.FLAG_31;
                Object obj2 = jVar.c;
                Object obj3 = sc.a.a;
                i10 = jVar.d;
                aVar = md.e.a;
                if (i10 != 0) {
                    k6.b(obj2);
                    q qVar2 = new q();
                    qVar2.a = aVar;
                    v vVar2 = new v(qVar2, 1);
                    try {
                        jVar.a = qVar2;
                        jVar.b = vVar2;
                        jVar.d = 1;
                        if (bVar.q(vVar2, jVar) == obj3) {
                            return obj3;
                        }
                        qVar = qVar2;
                    } catch (md.a e10) {
                        qVar = qVar2;
                        e9 = e10;
                        vVar = vVar2;
                        if (e9.a != vVar) {
                            throw e9;
                        }
                        obj = qVar.a;
                        if (obj == aVar) {
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vVar = jVar.b;
                    qVar = jVar.a;
                    try {
                        k6.b(obj2);
                    } catch (md.a e11) {
                        e9 = e11;
                        if (e9.a != vVar) {
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
        Object obj32 = sc.a.a;
        i10 = jVar.d;
        aVar = md.e.a;
        if (i10 != 0) {
        }
        obj = qVar.a;
        if (obj == aVar) {
        }
    }
}
