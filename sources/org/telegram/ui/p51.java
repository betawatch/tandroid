package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class p51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l71 b;

    public /* synthetic */ p51(l71 l71Var, int i10) {
        this.a = i10;
        this.b = l71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l71 l71Var = this.b;
                l71Var.getClass();
                HashSet hashSet = yg.f0.a;
                ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.b == null) {
                    cacheOutQueue.b = new CountDownLatch(1);
                }
                yg.f0.b = true;
                yg.f0.e = false;
                yg.f0.g = false;
                AndroidUtilities.runOnUIThread(new p51(l71Var, 2), 0L);
                break;
            case 1:
                l71 l71Var2 = this.b;
                ArrayList arrayList = l71Var2.A1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = l71Var2.B1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = l71Var2.D1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                l71Var2.q0.E(true);
                break;
            case 2:
                this.b.U1.start();
                break;
            case 3:
                this.b.B(true, true, true);
                break;
            default:
                l71 l71Var3 = this.b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                p51 p51Var = l71Var3.R1;
                globalInstance.removeDelayed(p51Var);
                NotificationCenter.getGlobalInstance().doOnIdle(p51Var);
                break;
        }
    }
}
