// default package

import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class lh4 {
    public static final lh4 a = new lh4();
    public static final Map b = DesugarCollections.synchronizedMap(new LinkedHashMap());

    public static jh4 a(q6a q6aVar) {
        Map map = b;
        map.getClass();
        Object obj = map.get(q6aVar);
        if (obj != null) {
            return (jh4) obj;
        }
        w44.d(q6aVar, ". Dependencies should be added at class load time.", "Cannot get dependency ");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0092 -> B:10:0x0093). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(fw2 fw2Var) {
        kh4 kh4Var;
        int i;
        Iterator it;
        LinkedHashMap linkedHashMap;
        if (fw2Var instanceof kh4) {
            kh4Var = (kh4) fw2Var;
            int i2 = kh4Var.n;
            if ((i2 & TLObject.FLAG_31) != 0) {
                kh4Var.n = i2 - TLObject.FLAG_31;
                Object obj = kh4Var.f;
                i = kh4Var.n;
                fw2 fw2Var2 = null;
                byte b2 = 1;
                if (i != 0) {
                    qse.b(obj);
                    Map map = b;
                    map.getClass();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(qi6.b(map.size()));
                    it = map.entrySet().iterator();
                    linkedHashMap = linkedHashMap2;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        sc8.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object key = kh4Var.e;
                    linkedHashMap = kh4Var.d;
                    q6a q6aVar = kh4Var.c;
                    it = kh4Var.b;
                    LinkedHashMap linkedHashMap3 = kh4Var.a;
                    qse.b(obj);
                    q6aVar.getClass();
                    zx2 zx2Var = a(q6aVar).b;
                    if (zx2Var == null) {
                        linkedHashMap.put(key, zx2Var);
                        linkedHashMap = linkedHashMap3;
                        if (it.hasNext()) {
                            return linkedHashMap;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        key = entry.getKey();
                        q6aVar = (q6a) entry.getKey();
                        np2 np2Var = new np2((jh4) entry.getValue(), (byte) 1);
                        kh4Var.a = linkedHashMap;
                        kh4Var.b = it;
                        kh4Var.c = q6aVar;
                        kh4Var.d = linkedHashMap;
                        kh4Var.e = key;
                        kh4Var.n = 1;
                        Object c = ppd.c(z14.a, new d73(np2Var, fw2Var2, b2), kh4Var);
                        bx2 bx2Var = bx2.a;
                        if (c == bx2Var) {
                            return bx2Var;
                        }
                        linkedHashMap3 = linkedHashMap;
                        q6aVar.getClass();
                        zx2 zx2Var2 = a(q6aVar).b;
                        if (zx2Var2 == null) {
                            w44.d(q6aVar, " has not been registered.", "Subscriber ");
                            return null;
                        }
                    }
                }
            }
        }
        kh4Var = new kh4(this, fw2Var);
        Object obj2 = kh4Var.f;
        i = kh4Var.n;
        fw2 fw2Var22 = null;
        byte b22 = 1;
        if (i != 0) {
        }
    }
}
