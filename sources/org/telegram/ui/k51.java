package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g71 b;

    public /* synthetic */ k51(g71 g71Var, int i10) {
        this.a = i10;
        this.b = g71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g71 g71Var = this.b;
                g71Var.getClass();
                HashSet hashSet = zg.e0.a;
                ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.b == null) {
                    cacheOutQueue.b = new CountDownLatch(1);
                }
                zg.e0.b = true;
                zg.e0.e = false;
                zg.e0.g = false;
                AndroidUtilities.runOnUIThread(new k51(g71Var, 2), 0L);
                break;
            case 1:
                g71 g71Var2 = this.b;
                ArrayList arrayList = g71Var2.A1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = g71Var2.B1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = g71Var2.D1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                g71Var2.q0.E(true);
                break;
            case 2:
                this.b.U1.start();
                break;
            case 3:
                this.b.B(true, true, true);
                break;
            default:
                g71 g71Var3 = this.b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                k51 k51Var = g71Var3.R1;
                globalInstance.removeDelayed(k51Var);
                NotificationCenter.getGlobalInstance().doOnIdle(k51Var);
                break;
        }
    }
}
