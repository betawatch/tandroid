package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class c51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z61 b;

    public /* synthetic */ c51(z61 z61Var, int i10) {
        this.a = i10;
        this.b = z61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z61 z61Var = this.b;
                z61Var.getClass();
                HashSet hashSet = zg.f0.a;
                ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.b == null) {
                    cacheOutQueue.b = new CountDownLatch(1);
                }
                zg.f0.b = true;
                zg.f0.e = false;
                zg.f0.g = false;
                AndroidUtilities.runOnUIThread(new c51(z61Var, 2), 0L);
                break;
            case 1:
                z61 z61Var2 = this.b;
                ArrayList arrayList = z61Var2.A1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = z61Var2.B1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = z61Var2.D1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                z61Var2.q0.E(true);
                break;
            case 2:
                this.b.U1.start();
                break;
            case 3:
                this.b.B(true, true, true);
                break;
            default:
                z61 z61Var3 = this.b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                c51 c51Var = z61Var3.R1;
                globalInstance.removeDelayed(c51Var);
                NotificationCenter.getGlobalInstance().doOnIdle(c51Var);
                break;
        }
    }
}
