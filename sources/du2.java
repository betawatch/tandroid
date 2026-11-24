// default package

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class du2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qu2 b;
    public final /* synthetic */ HashMap c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ HashMap e;

    public /* synthetic */ du2(qu2 qu2Var, ArrayList arrayList, HashMap hashMap, HashMap hashMap2) {
        this.a = (byte) 4;
        this.b = qu2Var;
        this.d = arrayList;
        this.c = hashMap;
        this.e = hashMap2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        HashMap hashMap = this.e;
        HashMap hashMap2 = this.c;
        ArrayList arrayList = this.d;
        qu2 qu2Var = this.b;
        switch (b) {
            case 0:
                qu2Var.E(hashMap2, arrayList, hashMap, true);
                qu2Var.N();
                qu2Var.getNotificationCenter().k(25, new Object[0]);
                qu2Var.getNotificationCenter().k(26, new Object[0]);
                break;
            case 1:
                qu2Var.E(hashMap2, arrayList, hashMap, true);
                qu2Var.N();
                qu2Var.getNotificationCenter().k(25, new Object[0]);
                qu2Var.getNotificationCenter().k(26, new Object[0]);
                break;
            case 2:
                qu2Var.E(hashMap2, arrayList, hashMap, true);
                break;
            case 3:
                qu2Var.E(hashMap2, arrayList, hashMap, true);
                qu2Var.getNotificationCenter().k(26, new Object[0]);
                break;
            default:
                qu2Var.d0 = arrayList;
                qu2Var.e0 = hashMap2;
                qu2Var.c0 = hashMap;
                break;
        }
    }

    public /* synthetic */ du2(qu2 qu2Var, HashMap hashMap, ArrayList arrayList, HashMap hashMap2, byte b) {
        this.a = b;
        this.b = qu2Var;
        this.c = hashMap;
        this.d = arrayList;
        this.e = hashMap2;
    }
}
