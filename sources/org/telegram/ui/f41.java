package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b61 b;

    public /* synthetic */ f41(b61 b61Var, int i9) {
        this.a = i9;
        this.b = b61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b61 b61Var = this.b;
                b61Var.getClass();
                HashSet hashSet = hg.h0.a;
                me.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.b == null) {
                    cacheOutQueue.b = new CountDownLatch(1);
                }
                hg.h0.b = true;
                hg.h0.e = false;
                hg.h0.g = false;
                AndroidUtilities.runOnUIThread(new f41(b61Var, 2), 0L);
                break;
            case 1:
                b61 b61Var2 = this.b;
                ArrayList arrayList = b61Var2.w1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = b61Var2.x1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = b61Var2.z1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                b61Var2.m0.E(true);
                break;
            case 2:
                this.b.Q1.start();
                break;
            case 3:
                this.b.B(true, true, true);
                break;
            default:
                b61 b61Var3 = this.b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                f41 f41Var = b61Var3.N1;
                globalInstance.removeDelayed(f41Var);
                NotificationCenter.getGlobalInstance().doOnIdle(f41Var);
                break;
        }
    }
}
