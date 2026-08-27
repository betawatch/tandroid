package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mj b;

    public /* synthetic */ lj(mj mjVar, int i10) {
        this.a = i10;
        this.b = mjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mj mjVar = this.b;
                mjVar.W = null;
                rn rnVar = mjVar.X;
                if (rnVar.D9 != -1) {
                    rnVar.getNotificationCenter().onAnimationFinish(rnVar.D9);
                    rnVar.D9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    break;
                }
                break;
            default:
                mj mjVar2 = this.b;
                mjVar2.W = null;
                rn rnVar2 = mjVar2.X;
                if (rnVar2.D9 != -1) {
                    rnVar2.getNotificationCenter().onAnimationFinish(rnVar2.D9);
                    rnVar2.D9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    break;
                }
                break;
        }
    }
}
