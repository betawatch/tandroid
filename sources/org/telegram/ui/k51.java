package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h71 b;

    public /* synthetic */ k51(h71 h71Var, int i10) {
        this.a = i10;
        this.b = h71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h71 h71Var = this.b;
                h71Var.getClass();
                HashSet hashSet = zg.f0.a;
                ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.b == null) {
                    cacheOutQueue.b = new CountDownLatch(1);
                }
                zg.f0.b = true;
                zg.f0.e = false;
                zg.f0.g = false;
                AndroidUtilities.runOnUIThread(new k51(h71Var, 2), 0L);
                break;
            case 1:
                h71 h71Var2 = this.b;
                ArrayList arrayList = h71Var2.A1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = h71Var2.B1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = h71Var2.D1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                h71Var2.q0.E(true);
                break;
            case 2:
                this.b.U1.start();
                break;
            case 3:
                this.b.B(true, true, true);
                break;
            default:
                h71 h71Var3 = this.b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                k51 k51Var = h71Var3.R1;
                globalInstance.removeDelayed(k51Var);
                NotificationCenter.getGlobalInstance().doOnIdle(k51Var);
                break;
        }
    }
}
