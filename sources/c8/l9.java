package c8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class l9 {
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
    public static final Object a(List list, m1.j jVar, kd.c cVar) {
        m1.d dVar;
        int i7;
        List list2;
        kotlin.jvm.internal.r rVar;
        Iterator it;
        Throwable th2;
        if (cVar instanceof m1.d) {
            dVar = (m1.d) cVar;
            int i10 = dVar.d;
            if ((i10 & TLObject.FLAG_31) != 0) {
                dVar.d = i10 - TLObject.FLAG_31;
                Object obj = dVar.c;
                Object obj2 = jd.a.a;
                i7 = dVar.d;
                if (i7 != 0) {
                    af.b.c(obj);
                    ArrayList arrayList = new ArrayList();
                    m1.f fVar = new m1.f(list, arrayList, null);
                    dVar.a = arrayList;
                    dVar.d = 1;
                    if (jVar.a(fVar, dVar) == obj2) {
                        return obj2;
                    }
                    list2 = arrayList;
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = dVar.b;
                        rVar = (kotlin.jvm.internal.r) dVar.a;
                        try {
                            af.b.c(obj);
                        } catch (Throwable th3) {
                            Object obj3 = rVar.a;
                            if (obj3 == null) {
                                rVar.a = th3;
                            } else {
                                a8.la.a((Throwable) obj3, th3);
                            }
                        }
                        while (it.hasNext()) {
                            rd.l lVar = (rd.l) it.next();
                            dVar.a = rVar;
                            dVar.b = it;
                            dVar.d = 2;
                            if (lVar.invoke(dVar) == obj2) {
                                return obj2;
                            }
                        }
                        th2 = (Throwable) rVar.a;
                        if (th2 == null) {
                            return gd.k.a;
                        }
                        throw th2;
                    }
                    list2 = (List) dVar.a;
                    af.b.c(obj);
                }
                rVar = new kotlin.jvm.internal.r();
                it = list2.iterator();
                while (it.hasNext()) {
                }
                th2 = (Throwable) rVar.a;
                if (th2 == null) {
                }
            }
        }
        dVar = new m1.d(cVar);
        Object obj4 = dVar.c;
        Object obj22 = jd.a.a;
        i7 = dVar.d;
        if (i7 != 0) {
        }
        rVar = new kotlin.jvm.internal.r();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th2 = (Throwable) rVar.a;
        if (th2 == null) {
        }
    }
}
