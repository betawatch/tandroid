package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z51 b;

    public /* synthetic */ b41(z51 z51Var, int i10) {
        this.a = i10;
        this.b = z51Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z51 z51Var = this.b;
                z51Var.getClass();
                HashSet hashSet = ah.x0.a;
                hf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.b == null) {
                    cacheOutQueue.b = new CountDownLatch(1);
                }
                ah.x0.b = true;
                ah.x0.e = false;
                ah.x0.g = false;
                AndroidUtilities.runOnUIThread(new b41(z51Var, 2), 0L);
                break;
            case 1:
                z51 z51Var2 = this.b;
                ArrayList arrayList = z51Var2.A1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = z51Var2.B1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = z51Var2.D1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                z51Var2.q0.E(true);
                break;
            case 2:
                this.b.U1.start();
                break;
            case 3:
                this.b.B(true, true, true);
                break;
            default:
                z51 z51Var3 = this.b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                b41 b41Var = z51Var3.R1;
                globalInstance.removeDelayed(b41Var);
                NotificationCenter.getGlobalInstance().doOnIdle(b41Var);
                break;
        }
    }
}
