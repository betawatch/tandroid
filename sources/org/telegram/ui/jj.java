package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kj b;

    public /* synthetic */ jj(kj kjVar, int i9) {
        this.a = i9;
        this.b = kjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kj kjVar = this.b;
                kjVar.W = null;
                qn qnVar = kjVar.X;
                if (qnVar.D9 != -1) {
                    qnVar.getNotificationCenter().onAnimationFinish(qnVar.D9);
                    qnVar.D9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    break;
                }
                break;
            default:
                kj kjVar2 = this.b;
                kjVar2.W = null;
                qn qnVar2 = kjVar2.X;
                if (qnVar2.D9 != -1) {
                    qnVar2.getNotificationCenter().onAnimationFinish(qnVar2.D9);
                    qnVar2.D9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    break;
                }
                break;
        }
    }
}
