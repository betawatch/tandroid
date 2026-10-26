package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qj b;

    public /* synthetic */ pj(qj qjVar, int i10) {
        this.a = i10;
        this.b = qjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qj qjVar = this.b;
                qjVar.W = null;
                un unVar = qjVar.X;
                if (unVar.T9 != -1) {
                    unVar.getNotificationCenter().onAnimationFinish(unVar.T9);
                    unVar.T9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    break;
                }
                break;
            default:
                qj qjVar2 = this.b;
                qjVar2.W = null;
                un unVar2 = qjVar2.X;
                if (unVar2.T9 != -1) {
                    unVar2.getNotificationCenter().onAnimationFinish(unVar2.T9);
                    unVar2.T9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    break;
                }
                break;
        }
    }
}
