package g7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class s8 {
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
    public static final Object a(List list, k1.s sVar, tc.c cVar) {
        k1.c cVar2;
        int i10;
        List list2;
        kotlin.jvm.internal.q qVar;
        Iterator it;
        Throwable th;
        if (cVar instanceof k1.c) {
            cVar2 = (k1.c) cVar;
            int i11 = cVar2.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                cVar2.d = i11 - TLObject.FLAG_31;
                Object obj = cVar2.c;
                Object obj2 = sc.a.a;
                i10 = cVar2.d;
                if (i10 != 0) {
                    h7.k6.b(obj);
                    ArrayList arrayList = new ArrayList();
                    k1.e eVar = new k1.e(list, arrayList, null);
                    cVar2.a = arrayList;
                    cVar2.d = 1;
                    if (sVar.a(eVar, cVar2) == obj2) {
                        return obj2;
                    }
                    list2 = arrayList;
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = cVar2.b;
                        qVar = (kotlin.jvm.internal.q) cVar2.a;
                        try {
                            h7.k6.b(obj);
                        } catch (Throwable th2) {
                            Object obj3 = qVar.a;
                            if (obj3 == null) {
                                qVar.a = th2;
                            } else {
                                h7.i6.a((Throwable) obj3, th2);
                            }
                        }
                        while (it.hasNext()) {
                            ad.l lVar = (ad.l) it.next();
                            cVar2.a = qVar;
                            cVar2.b = it;
                            cVar2.d = 2;
                            if (lVar.invoke(cVar2) == obj2) {
                                return obj2;
                            }
                        }
                        th = (Throwable) qVar.a;
                        if (th == null) {
                            return pc.i.a;
                        }
                        throw th;
                    }
                    list2 = (List) cVar2.a;
                    h7.k6.b(obj);
                }
                qVar = new kotlin.jvm.internal.q();
                it = list2.iterator();
                while (it.hasNext()) {
                }
                th = (Throwable) qVar.a;
                if (th == null) {
                }
            }
        }
        cVar2 = new k1.c(cVar);
        Object obj4 = cVar2.c;
        Object obj22 = sc.a.a;
        i10 = cVar2.d;
        if (i10 != 0) {
        }
        qVar = new kotlin.jvm.internal.q();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th = (Throwable) qVar.a;
        if (th == null) {
        }
    }
}
