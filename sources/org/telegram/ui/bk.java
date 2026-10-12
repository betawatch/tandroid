package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class bk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ck b;

    public /* synthetic */ bk(ck ckVar, int i10) {
        this.a = i10;
        this.b = ckVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ck ckVar = this.b;
                ckVar.W = null;
                fo foVar = ckVar.X;
                if (foVar.H9 != -1) {
                    foVar.getNotificationCenter().onAnimationFinish(foVar.H9);
                    foVar.H9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    break;
                }
                break;
            default:
                ck ckVar2 = this.b;
                ckVar2.W = null;
                fo foVar2 = ckVar2.X;
                if (foVar2.H9 != -1) {
                    foVar2.getNotificationCenter().onAnimationFinish(foVar2.H9);
                    foVar2.H9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    break;
                }
                break;
        }
    }
}
