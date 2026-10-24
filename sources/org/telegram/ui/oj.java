package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pj b;

    public /* synthetic */ oj(pj pjVar, int i10) {
        this.a = i10;
        this.b = pjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pj pjVar = this.b;
                pjVar.W = null;
                sn snVar = pjVar.X;
                if (snVar.T9 != -1) {
                    snVar.getNotificationCenter().onAnimationFinish(snVar.T9);
                    snVar.T9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    break;
                }
                break;
            default:
                pj pjVar2 = this.b;
                pjVar2.W = null;
                sn snVar2 = pjVar2.X;
                if (snVar2.T9 != -1) {
                    snVar2.getNotificationCenter().onAnimationFinish(snVar2.T9);
                    snVar2.T9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    break;
                }
                break;
        }
    }
}
