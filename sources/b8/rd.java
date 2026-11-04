package b8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class rd {
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
    public static final Object a(List list, l1.j jVar, hd.c cVar) {
        l1.d dVar;
        int i3;
        List list2;
        kotlin.jvm.internal.r rVar;
        Iterator it;
        Throwable th2;
        if (cVar instanceof l1.d) {
            dVar = (l1.d) cVar;
            int i10 = dVar.d;
            if ((i10 & TLObject.FLAG_31) != 0) {
                dVar.d = i10 - TLObject.FLAG_31;
                Object obj = dVar.c;
                Object obj2 = gd.a.a;
                i3 = dVar.d;
                if (i3 != 0) {
                    ib.b(obj);
                    ArrayList arrayList = new ArrayList();
                    l1.f fVar = new l1.f(list, arrayList, null);
                    dVar.a = arrayList;
                    dVar.d = 1;
                    if (jVar.a(fVar, dVar) == obj2) {
                        return obj2;
                    }
                    list2 = arrayList;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = dVar.b;
                        rVar = (kotlin.jvm.internal.r) dVar.a;
                        try {
                            ib.b(obj);
                        } catch (Throwable th3) {
                            Object obj3 = rVar.a;
                            if (obj3 == null) {
                                rVar.a = th3;
                            } else {
                                gb.a((Throwable) obj3, th3);
                            }
                        }
                        while (it.hasNext()) {
                            od.l lVar = (od.l) it.next();
                            dVar.a = rVar;
                            dVar.b = it;
                            dVar.d = 2;
                            if (lVar.invoke(dVar) == obj2) {
                                return obj2;
                            }
                        }
                        th2 = (Throwable) rVar.a;
                        if (th2 == null) {
                            return dd.k.a;
                        }
                        throw th2;
                    }
                    list2 = (List) dVar.a;
                    ib.b(obj);
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
        dVar = new l1.d(cVar);
        Object obj4 = dVar.c;
        Object obj22 = gd.a.a;
        i3 = dVar.d;
        if (i3 != 0) {
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
