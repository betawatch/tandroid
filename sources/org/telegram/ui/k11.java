package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i31 b;

    public /* synthetic */ k11(i31 i31Var, int i10) {
        this.a = i10;
        this.b = i31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i31 i31Var = this.b;
                i31Var.getClass();
                HashSet hashSet = sg.e0.a;
                com.google.android.gms.internal.cast.c0 c0Var = org.telegram.messenger.hc.D().p;
                if (((CountDownLatch) c0Var.c) == null) {
                    c0Var.c = new CountDownLatch(1);
                }
                sg.e0.b = true;
                sg.e0.e = false;
                sg.e0.g = false;
                org.telegram.messenger.i0.h3(new k11(i31Var, 2), 0L);
                break;
            case 1:
                i31 i31Var2 = this.b;
                ArrayList arrayList = i31Var2.B1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = i31Var2.C1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = i31Var2.E1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                i31Var2.q0.E(true);
                break;
            case 2:
                this.b.V1.start();
                break;
            case 3:
                this.b.B(true, true, true);
                break;
            default:
                i31 i31Var3 = this.b;
                org.telegram.messenger.zs e = org.telegram.messenger.zs.e();
                k11 k11Var = i31Var3.S1;
                e.e.remove(k11Var);
                org.telegram.messenger.zs.e().d(k11Var);
                break;
        }
    }
}
