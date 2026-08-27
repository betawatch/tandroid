package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a61 b;

    public /* synthetic */ e41(a61 a61Var, int i10) {
        this.a = i10;
        this.b = a61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a61 a61Var = this.b;
                a61Var.getClass();
                HashSet hashSet = ig.g0.a;
                ne.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.b == null) {
                    cacheOutQueue.b = new CountDownLatch(1);
                }
                ig.g0.b = true;
                ig.g0.e = false;
                ig.g0.g = false;
                AndroidUtilities.runOnUIThread(new e41(a61Var, 2), 0L);
                break;
            case 1:
                a61 a61Var2 = this.b;
                ArrayList arrayList = a61Var2.w1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = a61Var2.x1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = a61Var2.z1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                a61Var2.m0.E(true);
                break;
            case 2:
                this.b.Q1.start();
                break;
            case 3:
                this.b.B(true, true, true);
                break;
            default:
                a61 a61Var3 = this.b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                e41 e41Var = a61Var3.N1;
                globalInstance.removeDelayed(e41Var);
                NotificationCenter.getGlobalInstance().doOnIdle(e41Var);
                break;
        }
    }
}
