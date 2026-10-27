package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f61 b;

    public /* synthetic */ h41(f61 f61Var, int i10) {
        this.a = i10;
        this.b = f61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f61 f61Var = this.b;
                f61Var.getClass();
                HashSet hashSet = bh.m0.a;
                jf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.b == null) {
                    cacheOutQueue.b = new CountDownLatch(1);
                }
                bh.m0.b = true;
                bh.m0.e = false;
                bh.m0.g = false;
                AndroidUtilities.runOnUIThread(new h41(f61Var, 2), 0L);
                break;
            case 1:
                f61 f61Var2 = this.b;
                ArrayList arrayList = f61Var2.B1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = f61Var2.C1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = f61Var2.E1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                f61Var2.q0.E(true);
                break;
            case 2:
                this.b.V1.start();
                break;
            case 3:
                this.b.B(true, true, true);
                break;
            default:
                f61 f61Var3 = this.b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                h41 h41Var = f61Var3.S1;
                globalInstance.removeDelayed(h41Var);
                NotificationCenter.getGlobalInstance().doOnIdle(h41Var);
                break;
        }
    }
}
