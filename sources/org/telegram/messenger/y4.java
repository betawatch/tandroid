package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class y4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i5 b;
    public final /* synthetic */ HashMap c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ HashMap e;

    public /* synthetic */ y4(i5 i5Var, ArrayList arrayList, HashMap hashMap, HashMap hashMap2) {
        this.a = 4;
        this.b = i5Var;
        this.d = arrayList;
        this.c = hashMap;
        this.e = hashMap2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                HashMap hashMap = this.e;
                i5 i5Var = this.b;
                i5Var.E(this.c, this.d, hashMap, true);
                i5Var.N();
                i5Var.getNotificationCenter().k(25, new Object[0]);
                i5Var.getNotificationCenter().k(26, new Object[0]);
                break;
            case 1:
                HashMap hashMap2 = this.e;
                i5 i5Var2 = this.b;
                i5Var2.E(this.c, this.d, hashMap2, true);
                i5Var2.N();
                i5Var2.getNotificationCenter().k(25, new Object[0]);
                i5Var2.getNotificationCenter().k(26, new Object[0]);
                break;
            case 2:
                this.b.E(this.c, this.d, this.e, true);
                break;
            case 3:
                HashMap hashMap3 = this.e;
                i5 i5Var3 = this.b;
                i5Var3.E(this.c, this.d, hashMap3, true);
                i5Var3.getNotificationCenter().k(26, new Object[0]);
                break;
            default:
                i5 i5Var4 = this.b;
                i5Var4.c0 = this.d;
                i5Var4.d0 = this.c;
                i5Var4.b0 = this.e;
                break;
        }
    }

    public /* synthetic */ y4(i5 i5Var, HashMap hashMap, ArrayList arrayList, HashMap hashMap2, int i10) {
        this.a = i10;
        this.b = i5Var;
        this.c = hashMap;
        this.d = arrayList;
        this.e = hashMap2;
    }
}
