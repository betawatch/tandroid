package eb;

import b8.ib;
import ed.s;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.j;
import org.telegram.tgnet.TLObject;
import wd.b0;
import z9.i;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c {
    public static final c a = new c();
    public static final Map b = DesugarCollections.synchronizedMap(new LinkedHashMap());

    public static a a(d dVar) {
        Map dependencies = b;
        j.d(dependencies, "dependencies");
        Object obj = dependencies.get(dVar);
        if (obj != null) {
            return (a) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + dVar + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x009f -> B:10:0x00a0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(hd.c cVar) {
        b bVar;
        int i3;
        Map linkedHashMap;
        Iterator it;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i10 = bVar.n;
            if ((i10 & TLObject.FLAG_31) != 0) {
                bVar.n = i10 - TLObject.FLAG_31;
                Object obj = bVar.f;
                gd.a aVar = gd.a.a;
                i3 = bVar.n;
                if (i3 != 0) {
                    ib.b(obj);
                    Map dependencies = b;
                    j.d(dependencies, "dependencies");
                    linkedHashMap = new LinkedHashMap(s.b(dependencies.size()));
                    it = dependencies.entrySet().iterator();
                    if (it.hasNext()) {
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object key = bVar.e;
                    linkedHashMap = bVar.d;
                    d subscriberName = bVar.c;
                    it = bVar.b;
                    Map map = bVar.a;
                    ib.b(obj);
                    j.e(subscriberName, "subscriberName");
                    i iVar = a(subscriberName).b;
                    if (iVar == null) {
                        linkedHashMap.put(key, iVar);
                        linkedHashMap = map;
                        if (it.hasNext()) {
                            return linkedHashMap;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        key = entry.getKey();
                        subscriberName = (d) entry.getKey();
                        androidx.activity.d dVar = new androidx.activity.d((a) entry.getValue(), 2);
                        Map map2 = linkedHashMap;
                        bVar.a = map2;
                        bVar.b = it;
                        bVar.c = subscriberName;
                        bVar.d = map2;
                        bVar.e = key;
                        bVar.n = 1;
                        if (b0.y(fd.i.a, new ja.b(dVar, null, 3), bVar) == aVar) {
                            return aVar;
                        }
                        map = linkedHashMap;
                        j.e(subscriberName, "subscriberName");
                        i iVar2 = a(subscriberName).b;
                        if (iVar2 == null) {
                            throw new IllegalStateException("Subscriber " + subscriberName + " has not been registered.");
                        }
                    }
                }
            }
        }
        bVar = new b(this, cVar);
        Object obj2 = bVar.f;
        gd.a aVar2 = gd.a.a;
        i3 = bVar.n;
        if (i3 != 0) {
        }
    }
}
