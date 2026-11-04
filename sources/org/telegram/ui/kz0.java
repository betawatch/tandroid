package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g11 b;

    public /* synthetic */ kz0(g11 g11Var, int i3) {
        this.a = i3;
        this.b = g11Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g11 g11Var = this.b;
                g11Var.getClass();
                HashSet hashSet = dh.d0.a;
                com.google.android.gms.internal.cast.c0 c0Var = org.telegram.messenger.zb.D().p;
                if (((CountDownLatch) c0Var.c) == null) {
                    c0Var.c = new CountDownLatch(1);
                }
                dh.d0.b = true;
                dh.d0.e = false;
                dh.d0.g = false;
                org.telegram.messenger.g0.i3(new kz0(g11Var, 2), 0L);
                break;
            case 1:
                g11 g11Var2 = this.b;
                ArrayList arrayList = g11Var2.C1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = g11Var2.D1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = g11Var2.F1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                g11Var2.r0.E(true);
                break;
            case 2:
                this.b.W1.start();
                break;
            case 3:
                this.b.B(true, true, true);
                break;
            default:
                g11 g11Var3 = this.b;
                org.telegram.messenger.hs e10 = org.telegram.messenger.hs.e();
                kz0 kz0Var = g11Var3.T1;
                e10.e.remove(kz0Var);
                org.telegram.messenger.hs.e().d(kz0Var);
                break;
        }
    }
}
