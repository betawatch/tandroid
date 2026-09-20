package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class n51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j71 b;

    public /* synthetic */ n51(j71 j71Var, int i10) {
        this.a = i10;
        this.b = j71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j71 j71Var = this.b;
                j71Var.getClass();
                HashSet hashSet = zg.e0.a;
                ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.b == null) {
                    cacheOutQueue.b = new CountDownLatch(1);
                }
                zg.e0.b = true;
                zg.e0.e = false;
                zg.e0.g = false;
                AndroidUtilities.runOnUIThread(new n51(j71Var, 2), 0L);
                break;
            case 1:
                j71 j71Var2 = this.b;
                ArrayList arrayList = j71Var2.A1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = j71Var2.B1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = j71Var2.D1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                j71Var2.q0.E(true);
                break;
            case 2:
                this.b.U1.start();
                break;
            case 3:
                this.b.B(true, true, true);
                break;
            default:
                j71 j71Var3 = this.b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                n51 n51Var = j71Var3.R1;
                globalInstance.removeDelayed(n51Var);
                NotificationCenter.getGlobalInstance().doOnIdle(n51Var);
                break;
        }
    }
}
