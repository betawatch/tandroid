package de;

import ae.c0;
import ae.h1;
import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import org.telegram.tgnet.TLObject;
import v7.a8;
import v7.y7;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class p {
    public static final da.a a = new da.a("NONE");
    public static final da.a b = new da.a("PENDING");

    /* JADX WARN: Removed duplicated region for block: B:30:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable a(b bVar, c cVar, ld.c cVar2) {
        e eVar;
        int i10;
        kotlin.jvm.internal.p pVar;
        Throwable th2;
        h1 h1Var;
        CancellationException cancellationException;
        if (cVar2 instanceof e) {
            eVar = (e) cVar2;
            int i11 = eVar.c;
            if ((i11 & TLObject.FLAG_31) != 0) {
                eVar.c = i11 - TLObject.FLAG_31;
                Object obj = eVar.b;
                kd.a aVar = kd.a.a;
                i10 = eVar.c;
                if (i10 != 0) {
                    a8.b(obj);
                    kotlin.jvm.internal.p pVar2 = new kotlin.jvm.internal.p();
                    try {
                        c gVar = new g(cVar, pVar2);
                        eVar.a = pVar2;
                        eVar.c = 1;
                        if (bVar.z(gVar, eVar) == aVar) {
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
                        a8.b(obj);
                        return null;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                th2 = (Throwable) pVar.a;
                if ((th2 == null && th2.equals(th)) || ((h1Var = (h1) eVar.getContext().get(c0.b)) != null && h1Var.isCancelled() && (cancellationException = h1Var.getCancellationException()) != null && cancellationException.equals(th))) {
                    throw th;
                }
                if (th2 != null) {
                    return th;
                }
                if (th instanceof CancellationException) {
                    y7.a(th2, th);
                    throw th2;
                }
                y7.a(th, th2);
                throw th;
            }
        }
        eVar = new e(cVar2);
        Object obj2 = eVar.b;
        kd.a aVar2 = kd.a.a;
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
    public static final Object b(b bVar, ld.c cVar) {
        k kVar;
        int i10;
        da.a aVar;
        kotlin.jvm.internal.p pVar;
        ee.a e7;
        j jVar;
        Object obj;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i11 = kVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                kVar.d = i11 - TLObject.FLAG_31;
                Object obj2 = kVar.c;
                Object obj3 = kd.a.a;
                i10 = kVar.d;
                aVar = ee.e.a;
                if (i10 != 0) {
                    a8.b(obj2);
                    kotlin.jvm.internal.p pVar2 = new kotlin.jvm.internal.p();
                    pVar2.a = aVar;
                    j jVar2 = new j(pVar2, 0);
                    try {
                        kVar.a = pVar2;
                        kVar.b = jVar2;
                        kVar.d = 1;
                        if (bVar.z(jVar2, kVar) == obj3) {
                            return obj3;
                        }
                        pVar = pVar2;
                    } catch (ee.a e10) {
                        pVar = pVar2;
                        e7 = e10;
                        jVar = jVar2;
                        if (e7.a != jVar) {
                        }
                        obj = pVar.a;
                        if (obj == aVar) {
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar = kVar.b;
                    pVar = kVar.a;
                    try {
                        a8.b(obj2);
                    } catch (ee.a e11) {
                        e7 = e11;
                        if (e7.a != jVar) {
                            throw e7;
                        }
                        obj = pVar.a;
                        if (obj == aVar) {
                        }
                    }
                }
                obj = pVar.a;
                if (obj == aVar) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        kVar = new k(cVar);
        Object obj22 = kVar.c;
        Object obj32 = kd.a.a;
        i10 = kVar.d;
        aVar = ee.e.a;
        if (i10 != 0) {
        }
        obj = pVar.a;
        if (obj == aVar) {
        }
    }
}
