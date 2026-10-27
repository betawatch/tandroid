package fe;

import a8.hd;
import a8.jd;
import bb.u;
import ce.b0;
import ce.g1;
import he.v;
import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.p;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class n {
    public static final v a = new v("NONE", 0);
    public static final v b = new v("PENDING", 0);

    /* JADX WARN: Removed duplicated region for block: B:30:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable a(b bVar, c cVar, nd.c cVar2) {
        e eVar;
        int i10;
        p pVar;
        Throwable th2;
        g1 g1Var;
        CancellationException cancellationException;
        if (cVar2 instanceof e) {
            eVar = (e) cVar2;
            int i11 = eVar.c;
            if ((i11 & TLObject.FLAG_31) != 0) {
                eVar.c = i11 - TLObject.FLAG_31;
                Object obj = eVar.b;
                md.a aVar = md.a.a;
                i10 = eVar.c;
                if (i10 != 0) {
                    jd.b(obj);
                    p pVar2 = new p();
                    try {
                        c gVar = new g(cVar, pVar2);
                        eVar.a = pVar2;
                        eVar.c = 1;
                        if (bVar.C(gVar, eVar) == aVar) {
                            return aVar;
                        }
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                        pVar = pVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = eVar.a;
                    try {
                        jd.b(obj);
                        return null;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                th2 = (Throwable) pVar.a;
                if ((th2 == null && th2.equals(th)) || ((g1Var = (g1) eVar.getContext().get(b0.b)) != null && g1Var.isCancelled() && (cancellationException = g1Var.getCancellationException()) != null && cancellationException.equals(th))) {
                    throw th;
                }
                if (th2 != null) {
                    return th;
                }
                if (th instanceof CancellationException) {
                    hd.a(th2, th);
                    throw th2;
                }
                hd.a(th, th2);
                throw th;
            }
        }
        eVar = new e(cVar2);
        Object obj2 = eVar.b;
        md.a aVar2 = md.a.a;
        i10 = eVar.c;
        if (i10 != 0) {
        }
        th2 = (Throwable) pVar.a;
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
    public static final Object b(b bVar, nd.c cVar) {
        j jVar;
        int i10;
        v vVar;
        p pVar;
        ge.a e;
        u uVar;
        Object obj;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i11 = jVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                jVar.d = i11 - TLObject.FLAG_31;
                Object obj2 = jVar.c;
                Object obj3 = md.a.a;
                i10 = jVar.d;
                vVar = ge.e.a;
                if (i10 != 0) {
                    jd.b(obj2);
                    p pVar2 = new p();
                    pVar2.a = vVar;
                    u uVar2 = new u(pVar2, 1);
                    try {
                        jVar.a = pVar2;
                        jVar.b = uVar2;
                        jVar.d = 1;
                        if (bVar.C(uVar2, jVar) == obj3) {
                            return obj3;
                        }
                        pVar = pVar2;
                    } catch (ge.a e10) {
                        pVar = pVar2;
                        e = e10;
                        uVar = uVar2;
                        if (e.a != uVar) {
                        }
                        obj = pVar.a;
                        if (obj == vVar) {
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uVar = jVar.b;
                    pVar = jVar.a;
                    try {
                        jd.b(obj2);
                    } catch (ge.a e11) {
                        e = e11;
                        if (e.a != uVar) {
                            throw e;
                        }
                        obj = pVar.a;
                        if (obj == vVar) {
                        }
                    }
                }
                obj = pVar.a;
                if (obj == vVar) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        jVar = new j(cVar);
        Object obj22 = jVar.c;
        Object obj32 = md.a.a;
        i10 = jVar.d;
        vVar = ge.e.a;
        if (i10 != 0) {
        }
        obj = pVar.a;
        if (obj == vVar) {
        }
    }
}
