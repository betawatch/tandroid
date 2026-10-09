package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k71 b;

    public /* synthetic */ m51(k71 k71Var, int i10) {
        this.a = i10;
        this.b = k71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k71 k71Var = this.b;
                k71Var.getClass();
                HashSet hashSet = zg.d0.a;
                gf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.b == null) {
                    cacheOutQueue.b = new CountDownLatch(1);
                }
                zg.d0.b = true;
                zg.d0.e = false;
                zg.d0.g = false;
                AndroidUtilities.runOnUIThread(new m51(k71Var, 2), 0L);
                break;
            case 1:
                k71 k71Var2 = this.b;
                ArrayList arrayList = k71Var2.A1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = k71Var2.B1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = k71Var2.D1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                k71Var2.q0.E(true);
                break;
            case 2:
                this.b.U1.start();
                break;
            case 3:
                this.b.B(true, true, true);
                break;
            default:
                k71 k71Var3 = this.b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                m51 m51Var = k71Var3.R1;
                globalInstance.removeDelayed(m51Var);
                NotificationCenter.getGlobalInstance().doOnIdle(m51Var);
                break;
        }
    }
}
