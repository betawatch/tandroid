package ee;

import ab.u;
import be.b0;
import be.g1;
import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import org.telegram.tgnet.TLObject;
import v7.g8;
import v7.i8;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public abstract class o {
    public static final a6.i a;
    public static final a6.i b;

    static {
        int i10 = 22;
        a = new a6.i("NONE", i10);
        b = new a6.i("PENDING", i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable a(b bVar, c cVar, md.c cVar2) {
        e eVar;
        int i10;
        kotlin.jvm.internal.p pVar;
        Throwable th2;
        g1 g1Var;
        CancellationException cancellationException;
        if (cVar2 instanceof e) {
            eVar = (e) cVar2;
            int i11 = eVar.c;
            if ((i11 & TLObject.FLAG_31) != 0) {
                eVar.c = i11 - TLObject.FLAG_31;
                Object obj = eVar.b;
                ld.a aVar = ld.a.a;
                i10 = eVar.c;
                if (i10 != 0) {
                    i8.b(obj);
                    kotlin.jvm.internal.p pVar2 = new kotlin.jvm.internal.p();
                    try {
                        c gVar = new g(cVar, pVar2);
                        eVar.a = pVar2;
                        eVar.c = 1;
                        if (bVar.g(gVar, eVar) == aVar) {
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
                        i8.b(obj);
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
                    g8.a(th2, th);
                    throw th2;
                }
                g8.a(th, th2);
                throw th;
            }
        }
        eVar = new e(cVar2);
        Object obj2 = eVar.b;
        ld.a aVar2 = ld.a.a;
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
    public static final Object b(b bVar, md.c cVar) {
        j jVar;
        int i10;
        a6.i iVar;
        kotlin.jvm.internal.p pVar;
        fe.a e;
        u uVar;
        Object obj;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i11 = jVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                jVar.d = i11 - TLObject.FLAG_31;
                Object obj2 = jVar.c;
                Object obj3 = ld.a.a;
                i10 = jVar.d;
                iVar = fe.e.a;
                if (i10 != 0) {
                    i8.b(obj2);
                    kotlin.jvm.internal.p pVar2 = new kotlin.jvm.internal.p();
                    pVar2.a = iVar;
                    u uVar2 = new u(pVar2, 1);
                    try {
                        jVar.a = pVar2;
                        jVar.b = uVar2;
                        jVar.d = 1;
                        if (bVar.g(uVar2, jVar) == obj3) {
                            return obj3;
                        }
                        pVar = pVar2;
                    } catch (fe.a e7) {
                        pVar = pVar2;
                        e = e7;
                        uVar = uVar2;
                        if (e.a != uVar) {
                        }
                        obj = pVar.a;
                        if (obj == iVar) {
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uVar = jVar.b;
                    pVar = jVar.a;
                    try {
                        i8.b(obj2);
                    } catch (fe.a e10) {
                        e = e10;
                        if (e.a != uVar) {
                            throw e;
                        }
                        obj = pVar.a;
                        if (obj == iVar) {
                        }
                    }
                }
                obj = pVar.a;
                if (obj == iVar) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        jVar = new j(cVar);
        Object obj22 = jVar.c;
        Object obj32 = ld.a.a;
        i10 = jVar.d;
        iVar = fe.e.a;
        if (i10 != 0) {
        }
        obj = pVar.a;
        if (obj == iVar) {
        }
    }
}
