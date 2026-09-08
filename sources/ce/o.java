package ce;

import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import org.telegram.tgnet.TLObject;
import v7.r7;
import v7.t7;
import zd.b0;
import zd.f1;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class o {
    public static final d9.f a = new d9.f("NONE", 1);
    public static final d9.f b = new d9.f("PENDING", 1);

    /* JADX WARN: Removed duplicated region for block: B:30:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable a(b bVar, c cVar, kd.c cVar2) {
        e eVar;
        int i10;
        kotlin.jvm.internal.p pVar;
        Throwable th2;
        f1 f1Var;
        CancellationException cancellationException;
        if (cVar2 instanceof e) {
            eVar = (e) cVar2;
            int i11 = eVar.c;
            if ((i11 & TLObject.FLAG_31) != 0) {
                eVar.c = i11 - TLObject.FLAG_31;
                Object obj = eVar.b;
                jd.a aVar = jd.a.a;
                i10 = eVar.c;
                if (i10 != 0) {
                    t7.b(obj);
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
                        t7.b(obj);
                        return null;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                th2 = (Throwable) pVar.a;
                if ((th2 == null && th2.equals(th)) || ((f1Var = (f1) eVar.getContext().get(b0.b)) != null && f1Var.isCancelled() && (cancellationException = f1Var.getCancellationException()) != null && cancellationException.equals(th))) {
                    throw th;
                }
                if (th2 != null) {
                    return th;
                }
                if (th instanceof CancellationException) {
                    r7.a(th2, th);
                    throw th2;
                }
                r7.a(th, th2);
                throw th;
            }
        }
        eVar = new e(cVar2);
        Object obj2 = eVar.b;
        jd.a aVar2 = jd.a.a;
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
    public static final Object b(b bVar, kd.c cVar) {
        k kVar;
        int i10;
        d9.f fVar;
        kotlin.jvm.internal.p pVar;
        de.a e7;
        j jVar;
        Object obj;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i11 = kVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                kVar.d = i11 - TLObject.FLAG_31;
                Object obj2 = kVar.c;
                Object obj3 = jd.a.a;
                i10 = kVar.d;
                fVar = de.e.a;
                if (i10 != 0) {
                    t7.b(obj2);
                    kotlin.jvm.internal.p pVar2 = new kotlin.jvm.internal.p();
                    pVar2.a = fVar;
                    j jVar2 = new j(pVar2, 0);
                    try {
                        kVar.a = pVar2;
                        kVar.b = jVar2;
                        kVar.d = 1;
                        if (bVar.z(jVar2, kVar) == obj3) {
                            return obj3;
                        }
                        pVar = pVar2;
                    } catch (de.a e10) {
                        pVar = pVar2;
                        e7 = e10;
                        jVar = jVar2;
                        if (e7.a != jVar) {
                        }
                        obj = pVar.a;
                        if (obj == fVar) {
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar = kVar.b;
                    pVar = kVar.a;
                    try {
                        t7.b(obj2);
                    } catch (de.a e11) {
                        e7 = e11;
                        if (e7.a != jVar) {
                            throw e7;
                        }
                        obj = pVar.a;
                        if (obj == fVar) {
                        }
                    }
                }
                obj = pVar.a;
                if (obj == fVar) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        kVar = new k(cVar);
        Object obj22 = kVar.c;
        Object obj32 = jd.a.a;
        i10 = kVar.d;
        fVar = de.e.a;
        if (i10 != 0) {
        }
        obj = pVar.a;
        if (obj == fVar) {
        }
    }
}
