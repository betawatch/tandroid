package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b61 b;

    public /* synthetic */ d41(b61 b61Var, int i10) {
        this.a = i10;
        this.b = b61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b61 b61Var = this.b;
                b61Var.getClass();
                HashSet hashSet = ah.x0.a;
                hf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.b == null) {
                    cacheOutQueue.b = new CountDownLatch(1);
                }
                ah.x0.b = true;
                ah.x0.e = false;
                ah.x0.g = false;
                AndroidUtilities.runOnUIThread(new d41(b61Var, 2), 0L);
                break;
            case 1:
                b61 b61Var2 = this.b;
                ArrayList arrayList = b61Var2.B1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = b61Var2.C1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = b61Var2.E1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                b61Var2.q0.E(true);
                break;
            case 2:
                this.b.V1.start();
                break;
            case 3:
                this.b.B(true, true, true);
                break;
            default:
                b61 b61Var3 = this.b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                d41 d41Var = b61Var3.S1;
                globalInstance.removeDelayed(d41Var);
                NotificationCenter.getGlobalInstance().doOnIdle(d41Var);
                break;
        }
    }
}
