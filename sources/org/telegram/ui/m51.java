package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i71 b;

    public /* synthetic */ m51(i71 i71Var, int i10) {
        this.a = i10;
        this.b = i71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i71 i71Var = this.b;
                i71Var.getClass();
                HashSet hashSet = zg.f0.a;
                ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.b == null) {
                    cacheOutQueue.b = new CountDownLatch(1);
                }
                zg.f0.b = true;
                zg.f0.e = false;
                zg.f0.g = false;
                AndroidUtilities.runOnUIThread(new m51(i71Var, 2), 0L);
                break;
            case 1:
                i71 i71Var2 = this.b;
                ArrayList arrayList = i71Var2.A1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = i71Var2.B1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = i71Var2.D1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                i71Var2.q0.E(true);
                break;
            case 2:
                this.b.U1.start();
                break;
            case 3:
                this.b.B(true, true, true);
                break;
            default:
                i71 i71Var3 = this.b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                m51 m51Var = i71Var3.R1;
                globalInstance.removeDelayed(m51Var);
                NotificationCenter.getGlobalInstance().doOnIdle(m51Var);
                break;
        }
    }
}
