package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class g51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c71 b;

    public /* synthetic */ g51(c71 c71Var, int i10) {
        this.a = i10;
        this.b = c71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c71 c71Var = this.b;
                c71Var.getClass();
                HashSet hashSet = zg.e0.a;
                ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.b == null) {
                    cacheOutQueue.b = new CountDownLatch(1);
                }
                zg.e0.b = true;
                zg.e0.e = false;
                zg.e0.g = false;
                AndroidUtilities.runOnUIThread(new g51(c71Var, 2), 0L);
                break;
            case 1:
                c71 c71Var2 = this.b;
                ArrayList arrayList = c71Var2.A1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = c71Var2.B1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = c71Var2.D1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                c71Var2.q0.E(true);
                break;
            case 2:
                this.b.U1.start();
                break;
            case 3:
                this.b.B(true, true, true);
                break;
            default:
                c71 c71Var3 = this.b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                g51 g51Var = c71Var3.R1;
                globalInstance.removeDelayed(g51Var);
                NotificationCenter.getGlobalInstance().doOnIdle(g51Var);
                break;
        }
    }
}
