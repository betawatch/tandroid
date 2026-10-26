package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c61 b;

    public /* synthetic */ e41(c61 c61Var, int i10) {
        this.a = i10;
        this.b = c61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c61 c61Var = this.b;
                c61Var.getClass();
                HashSet hashSet = bh.m0.a;
                jf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.b == null) {
                    cacheOutQueue.b = new CountDownLatch(1);
                }
                bh.m0.b = true;
                bh.m0.e = false;
                bh.m0.g = false;
                AndroidUtilities.runOnUIThread(new e41(c61Var, 2), 0L);
                break;
            case 1:
                c61 c61Var2 = this.b;
                ArrayList arrayList = c61Var2.B1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = c61Var2.C1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = c61Var2.E1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                c61Var2.q0.E(true);
                break;
            case 2:
                this.b.V1.start();
                break;
            case 3:
                this.b.B(true, true, true);
                break;
            default:
                c61 c61Var3 = this.b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                e41 e41Var = c61Var3.S1;
                globalInstance.removeDelayed(e41Var);
                NotificationCenter.getGlobalInstance().doOnIdle(e41Var);
                break;
        }
    }
}
