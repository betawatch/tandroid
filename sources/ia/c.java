package ia;

import e9.k;
import g7.y5;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.i;
import org.telegram.tgnet.TLObject;
import pc.r;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c {
    public static final c a = new c();
    public static final Map b = DesugarCollections.synchronizedMap(new LinkedHashMap());

    public static a a(d dVar) {
        Map dependencies = b;
        i.d(dependencies, "dependencies");
        Object obj = dependencies.get(dVar);
        if (obj != null) {
            return (a) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + dVar + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00af A[Catch: all -> 0x00c8, TRY_ENTER, TryCatch #0 {all -> 0x00c8, blocks: (B:12:0x0099, B:23:0x00af, B:24:0x00c7), top: B:11:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0097 -> B:10:0x0098). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(sc.c cVar) {
        b bVar;
        int i9;
        Map linkedHashMap;
        Iterator it;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i10 = bVar.r;
            if ((i10 & TLObject.FLAG_31) != 0) {
                bVar.r = i10 - TLObject.FLAG_31;
                Object obj = bVar.h;
                rc.a aVar = rc.a.a;
                i9 = bVar.r;
                if (i9 != 0) {
                    y5.b(obj);
                    Map dependencies = b;
                    i.d(dependencies, "dependencies");
                    linkedHashMap = new LinkedHashMap(r.a(dependencies.size()));
                    it = dependencies.entrySet().iterator();
                    if (it.hasNext()) {
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object key = bVar.f;
                    linkedHashMap = bVar.e;
                    qd.d dVar = bVar.d;
                    d subscriberName = bVar.c;
                    it = bVar.b;
                    Map map = bVar.a;
                    y5.b(obj);
                    try {
                        i.e(subscriberName, "subscriberName");
                        k kVar = a(subscriberName).b;
                        if (kVar == null) {
                            dVar.e(null);
                            linkedHashMap.put(key, kVar);
                            linkedHashMap = map;
                            if (it.hasNext()) {
                                return linkedHashMap;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            key = entry.getKey();
                            subscriberName = (d) entry.getKey();
                            dVar = ((a) entry.getValue()).a;
                            Map map2 = linkedHashMap;
                            bVar.a = map2;
                            bVar.b = it;
                            bVar.c = subscriberName;
                            bVar.d = dVar;
                            bVar.e = map2;
                            bVar.f = key;
                            bVar.r = 1;
                            if (dVar.d(bVar) == aVar) {
                                return aVar;
                            }
                            map = linkedHashMap;
                            i.e(subscriberName, "subscriberName");
                            k kVar2 = a(subscriberName).b;
                            if (kVar2 == null) {
                                throw new IllegalStateException("Subscriber " + subscriberName + " has not been registered.");
                            }
                        }
                    } catch (Throwable th) {
                        dVar.e(null);
                        throw th;
                    }
                }
            }
        }
        bVar = new b(this, cVar);
        Object obj2 = bVar.h;
        rc.a aVar2 = rc.a.a;
        i9 = bVar.r;
        if (i9 != 0) {
        }
    }
}
