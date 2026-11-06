package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class v4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g5 b;
    public final /* synthetic */ HashMap c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ HashMap e;

    public /* synthetic */ v4(g5 g5Var, ArrayList arrayList, HashMap hashMap, HashMap hashMap2) {
        this.a = 4;
        this.b = g5Var;
        this.d = arrayList;
        this.c = hashMap;
        this.e = hashMap2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                HashMap hashMap = this.e;
                g5 g5Var = this.b;
                g5Var.E(this.c, this.d, hashMap, true);
                g5Var.N();
                g5Var.getNotificationCenter().k(25, new Object[0]);
                g5Var.getNotificationCenter().k(26, new Object[0]);
                break;
            case 1:
                HashMap hashMap2 = this.e;
                g5 g5Var2 = this.b;
                g5Var2.E(this.c, this.d, hashMap2, true);
                g5Var2.N();
                g5Var2.getNotificationCenter().k(25, new Object[0]);
                g5Var2.getNotificationCenter().k(26, new Object[0]);
                break;
            case 2:
                this.b.E(this.c, this.d, this.e, true);
                break;
            case 3:
                HashMap hashMap3 = this.e;
                g5 g5Var3 = this.b;
                g5Var3.E(this.c, this.d, hashMap3, true);
                g5Var3.getNotificationCenter().k(26, new Object[0]);
                break;
            default:
                g5 g5Var4 = this.b;
                g5Var4.c0 = this.d;
                g5Var4.d0 = this.c;
                g5Var4.b0 = this.e;
                break;
        }
    }

    public /* synthetic */ v4(g5 g5Var, HashMap hashMap, ArrayList arrayList, HashMap hashMap2, int i7) {
        this.a = i7;
        this.b = g5Var;
        this.c = hashMap;
        this.d = arrayList;
        this.e = hashMap2;
    }
}
