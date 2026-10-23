package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
                qn qnVar = pjVar.X;
                if (qnVar.H9 != -1) {
                    qnVar.getNotificationCenter().onAnimationFinish(qnVar.H9);
                    qnVar.H9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    break;
                }
                break;
            default:
                pj pjVar2 = this.b;
                pjVar2.W = null;
                qn qnVar2 = pjVar2.X;
                if (qnVar2.H9 != -1) {
                    qnVar2.getNotificationCenter().onAnimationFinish(qnVar2.H9);
                    qnVar2.H9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    break;
                }
                break;
        }
    }
}
