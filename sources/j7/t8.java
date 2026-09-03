package j7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class t8 {
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0084 -> B:13:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0087 -> B:13:0x0067). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(List list, k1.w wVar, wc.c cVar) {
        k1.d dVar;
        int i10;
        List list2;
        kotlin.jvm.internal.q qVar;
        Iterator it;
        Throwable th2;
        if (cVar instanceof k1.d) {
            dVar = (k1.d) cVar;
            int i11 = dVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                dVar.d = i11 - TLObject.FLAG_31;
                Object obj = dVar.c;
                Object obj2 = vc.a.a;
                i10 = dVar.d;
                if (i10 != 0) {
                    k7.q7.b(obj);
                    ArrayList arrayList = new ArrayList();
                    k1.f fVar = new k1.f(list, arrayList, null);
                    dVar.a = arrayList;
                    dVar.d = 1;
                    if (wVar.a(fVar, dVar) == obj2) {
                        return obj2;
                    }
                    list2 = arrayList;
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = dVar.b;
                        qVar = (kotlin.jvm.internal.q) dVar.a;
                        try {
                            k7.q7.b(obj);
                        } catch (Throwable th3) {
                            Object obj3 = qVar.a;
                            if (obj3 == null) {
                                qVar.a = th3;
                            } else {
                                k7.o7.a((Throwable) obj3, th3);
                            }
                        }
                        while (it.hasNext()) {
                            dd.l lVar = (dd.l) it.next();
                            dVar.a = qVar;
                            dVar.b = it;
                            dVar.d = 2;
                            if (lVar.invoke(dVar) == obj2) {
                                return obj2;
                            }
                        }
                        th2 = (Throwable) qVar.a;
                        if (th2 == null) {
                            return sc.i.a;
                        }
                        throw th2;
                    }
                    list2 = (List) dVar.a;
                    k7.q7.b(obj);
                }
                qVar = new kotlin.jvm.internal.q();
                it = list2.iterator();
                while (it.hasNext()) {
                }
                th2 = (Throwable) qVar.a;
                if (th2 == null) {
                }
            }
        }
        dVar = new k1.d(cVar);
        Object obj4 = dVar.c;
        Object obj22 = vc.a.a;
        i10 = dVar.d;
        if (i10 != 0) {
        }
        qVar = new kotlin.jvm.internal.q();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th2 = (Throwable) qVar.a;
        if (th2 == null) {
        }
    }
}
