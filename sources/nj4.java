// default package

import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class nj4 {
    public static final nj4 a = new nj4();
    public static final Map b = DesugarCollections.synchronizedMap(new LinkedHashMap());

    public static lj4 a(iaa iaaVar) {
        Map map = b;
        map.getClass();
        Object obj = map.get(iaaVar);
        if (obj != null) {
            return (lj4) obj;
        }
        xi4.j(iaaVar, ". Dependencies should be added at class load time.", "Cannot get dependency ");
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
    public final Object b(zw2 zw2Var) {
        mj4 mj4Var;
        int i;
        Iterator it;
        LinkedHashMap linkedHashMap;
        if (zw2Var instanceof mj4) {
            mj4Var = (mj4) zw2Var;
            int i2 = mj4Var.n;
            if ((i2 & TLObject.FLAG_31) != 0) {
                mj4Var.n = i2 - TLObject.FLAG_31;
                Object obj = mj4Var.f;
                i = mj4Var.n;
                zw2 zw2Var2 = null;
                byte b2 = 1;
                if (i != 0) {
                    ixe.b(obj);
                    Map map = b;
                    map.getClass();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(uk6.b(map.size()));
                    it = map.entrySet().iterator();
                    linkedHashMap = linkedHashMap2;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        grb.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object key = mj4Var.e;
                    linkedHashMap = mj4Var.d;
                    iaa iaaVar = mj4Var.c;
                    it = mj4Var.b;
                    LinkedHashMap linkedHashMap3 = mj4Var.a;
                    ixe.b(obj);
                    iaaVar.getClass();
                    ty2 ty2Var = a(iaaVar).b;
                    if (ty2Var == null) {
                        linkedHashMap.put(key, ty2Var);
                        linkedHashMap = linkedHashMap3;
                        if (it.hasNext()) {
                            return linkedHashMap;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        key = entry.getKey();
                        iaaVar = (iaa) entry.getKey();
                        gq2 gq2Var = new gq2((lj4) entry.getValue(), (byte) 1);
                        mj4Var.a = linkedHashMap;
                        mj4Var.b = it;
                        mj4Var.c = iaaVar;
                        mj4Var.d = linkedHashMap;
                        mj4Var.e = key;
                        mj4Var.n = 1;
                        Object c = fud.c(u24.a, new w73(gq2Var, zw2Var2, b2), mj4Var);
                        vx2 vx2Var = vx2.a;
                        if (c == vx2Var) {
                            return vx2Var;
                        }
                        linkedHashMap3 = linkedHashMap;
                        iaaVar.getClass();
                        ty2 ty2Var2 = a(iaaVar).b;
                        if (ty2Var2 == null) {
                            xi4.j(iaaVar, " has not been registered.", "Subscriber ");
                            return null;
                        }
                    }
                }
            }
        }
        mj4Var = new mj4(this, zw2Var);
        Object obj2 = mj4Var.f;
        i = mj4Var.n;
        zw2 zw2Var22 = null;
        byte b22 = 1;
        if (i != 0) {
        }
    }
}
