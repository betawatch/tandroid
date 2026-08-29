package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nj b;

    public /* synthetic */ mj(nj njVar, int i10) {
        this.a = i10;
        this.b = njVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nj njVar = this.b;
                njVar.W = null;
                tn tnVar = njVar.X;
                if (tnVar.D9 != -1) {
                    tnVar.getNotificationCenter().onAnimationFinish(tnVar.D9);
                    tnVar.D9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    break;
                }
                break;
            default:
                nj njVar2 = this.b;
                njVar2.W = null;
                tn tnVar2 = njVar2.X;
                if (tnVar2.D9 != -1) {
                    tnVar2.getNotificationCenter().onAnimationFinish(tnVar2.D9);
                    tnVar2.D9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    break;
                }
                break;
        }
    }
}
