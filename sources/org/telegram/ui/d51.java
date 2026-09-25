package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a71 b;

    public /* synthetic */ d51(a71 a71Var, int i10) {
        this.a = i10;
        this.b = a71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a71 a71Var = this.b;
                a71Var.getClass();
                HashSet hashSet = zg.e0.a;
                ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.b == null) {
                    cacheOutQueue.b = new CountDownLatch(1);
                }
                zg.e0.b = true;
                zg.e0.e = false;
                zg.e0.g = false;
                AndroidUtilities.runOnUIThread(new d51(a71Var, 2), 0L);
                break;
            case 1:
                a71 a71Var2 = this.b;
                ArrayList arrayList = a71Var2.A1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = a71Var2.B1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = a71Var2.D1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                a71Var2.q0.E(true);
                break;
            case 2:
                this.b.U1.start();
                break;
            case 3:
                this.b.B(true, true, true);
                break;
            default:
                a71 a71Var3 = this.b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                d51 d51Var = a71Var3.R1;
                globalInstance.removeDelayed(d51Var);
                NotificationCenter.getGlobalInstance().doOnIdle(d51Var);
                break;
        }
    }
}
