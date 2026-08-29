package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d61 b;

    public /* synthetic */ h41(d61 d61Var, int i10) {
        this.a = i10;
        this.b = d61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d61 d61Var = this.b;
                d61Var.getClass();
                HashSet hashSet = kg.g0.a;
                pe.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.b == null) {
                    cacheOutQueue.b = new CountDownLatch(1);
                }
                kg.g0.b = true;
                kg.g0.e = false;
                kg.g0.g = false;
                AndroidUtilities.runOnUIThread(new h41(d61Var, 2), 0L);
                break;
            case 1:
                d61 d61Var2 = this.b;
                ArrayList arrayList = d61Var2.w1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = d61Var2.x1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = d61Var2.z1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                d61Var2.m0.E(true);
                break;
            case 2:
                this.b.Q1.start();
                break;
            case 3:
                this.b.B(true, true, true);
                break;
            default:
                d61 d61Var3 = this.b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                h41 h41Var = d61Var3.N1;
                globalInstance.removeDelayed(h41Var);
                NotificationCenter.getGlobalInstance().doOnIdle(h41Var);
                break;
        }
    }
}
