package org.telegram.messenger;

import android.os.SystemClock;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class qh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SharedConfig.ProxyInfo b;
    public final /* synthetic */ long c;

    public /* synthetic */ qh(SharedConfig.ProxyInfo proxyInfo, long j10, int i10) {
        this.a = i10;
        this.b = proxyInfo;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        long j10 = this.c;
        SharedConfig.ProxyInfo proxyInfo = this.b;
        switch (i10) {
            case 0:
                ProxyRotationController.lambda$new$0(proxyInfo, j10);
                break;
            default:
                proxyInfo.availableCheckTime = SystemClock.elapsedRealtime();
                proxyInfo.checking = false;
                if (j10 == -1) {
                    proxyInfo.available = false;
                    proxyInfo.ping = 0L;
                } else {
                    proxyInfo.ping = j10;
                    proxyInfo.available = true;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxyCheckDone, proxyInfo);
                break;
        }
    }
}
